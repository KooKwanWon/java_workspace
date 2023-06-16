package com.kh.socket4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthColorChooserUI;

public class ClientThread implements Runnable {

	Socket socket; // usb 및 김치통
	BufferedReader br; // 김치 읽는용
	PrintWriter pw; // 김치 보내기

	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>()); // 리스트 전체를 동기화

	public ClientThread(Socket socket) {
		this.socket = socket;
		try  {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 김치통에 있는 김치 읽기
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream())); // 김치통에 있는 김치 읽은 다음에 포장
			list.add(pw);
			
		} catch (IOException e) {
		}
	}
	
	public void sendAll(String message) {
		for (PrintWriter line : list) {
			line.println(message);
			line.flush();
		}
	}

	public void run() {
		
		String login = socket.getInetAddress() + "님 환영합니다.";
		System.out.println(login);
		sendAll(login);
		try {
			while(br != null) {
				String ip = socket.getInetAddress()+"";
				if(ip.equals("/192.168.10.44")){
					String message = "[운영자] : " + br.readLine();
					sendAll(message);
				}
				else{String message = "["+ socket.getInetAddress() + "] : " + br.readLine();
				sendAll(message);
				}
				
			}
		} catch (IOException e1) {
		}
		
	}
	
}
