package com.kh.socket4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattServer {

	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(60000);
			System.out.println("대기중");
			while (true) {
				Socket socket = serverSocket.accept();
				// ClientThread클래스 인스턴스화 + 소켓넣기
				 // 쓰레드 생성 ct클래스 정보 넣기
				Thread cli = new Thread(new ClientThread(socket));
				cli.start();
				}
		} catch (IOException e) {
		}

	}

}
