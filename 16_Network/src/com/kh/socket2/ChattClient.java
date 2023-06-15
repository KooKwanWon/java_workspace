package com.kh.socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattClient {

//	키보드로 입력받은 데이터를 읽어서 서버로 보낸다.
//	다시 서버가 보낸 메시지를 받아서 클라이언트 자신의 콘솔창에 출력한다.
	
	public static void main(String[] args) {
		
		try {
			
			Socket s = new Socket("127.0.0.1", 60000);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			
			
			BufferedReader br2 = new BufferedReader(new InputStreamReader(s.getInputStream())); //
			
			
			
			
			String line = null;
			while((line = br.readLine())!=null) {
				pw.println(line);
				
				String line2 = null;
				line2 = br2.readLine();
				System.out.println("서버에서 받아온 메시지 : " + line2);
			}
			s.close();
			
		} catch (IOException e) {
			System.out.println("서버와의 연결에 실패했습니다...");
		}
		
	}

}
