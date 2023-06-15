package com.kh.network;

import java.io.*;
import java.net.*;

/* URL(Uniform Resource Locator)
*
* - 인터넷에 존재하는 서버들의 자원에 접근할 수 있는 주소
*
* https://www.youtube.com/result?search_query=여행
*
* 프로토콜://호스트명:포트번호/경로명/파일명?쿼리스트링(#은 붙을수도 안붙을수도 있음)
*
* - 프로토콜 : 자원에 접근하기 위해 서버와 통신하는데 사용되는 통신규약 (https)
* - 호스트명 : 자원을 제공하는 서버의 이름 (www.youtube.com)
* - 포트번호 : 통신에 사용되는 서버의 포트번호 (443)
* - 경로명 : 접근 하려는 자원이 저장된 서버상의 위치 (results)
* - 쿼리(Query) : ? 이후에 부분 (search_query=여행)
*/

public class URLTest {

	public static void main(String[] args) {
		
		URLTest u = new URLTest();
		u.method2();
		
//		try {
//			// 테스트할 URL 설정
//			String urlString = "https://www.youtube.com";
//
//			// URL 객체 생성
//			URL url = new URL(urlString);
//
//			// HttpURLConnection 객체 생성
//			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//
//			// GET 방식으로 요청 설정
//			connection.setRequestMethod("GET");
//
//			// 연결 및 응답 코드 확인
//			int responseCode = connection.getResponseCode();
//			System.out.println("Response Code: " + responseCode);
//
//			// 응답 내용 읽기
//			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//			String line;
//			StringBuilder response = new StringBuilder();
//			while ((line = reader.readLine()) != null) {
//				response.append(line);
//			}
//			reader.close();
//
//			// 응답 내용 출력
//			System.out.println("Response Body: " + response.toString());
//
//			// 연결 종료
//			connection.disconnect();
//		} catch (IOException e) {}

	}

	public void method1() {
		
		try {
			URL url = new URL("https://www.youtube.com/result?search_query=여행");
			System.out.println("url.getProtocol() : " + url.getProtocol());
			System.out.println("url.getHost() : " + url.getHost());
			System.out.println("url.getDefaultPort() : " + url.getDefaultPort());
			System.out.println("url.getFile() : " + url.getFile());
			System.out.println("url.getPath() : " + url.getPath());
			System.out.println("url.getQuery() : " + url.getQuery());
			
		} catch (MalformedURLException e) {}
		
	}
	
	public void method2() {
		
		BufferedReader input = null;
		
		try {
			URL url = new URL("https://iei.or.kr");
			input = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String line = "";
			while((line=input.readLine())!=null) {
				System.out.println(line);
			}
		
		} catch (IOException e) {
		}finally {
			try {
				input.close();
			} catch (IOException e) {
			}
		}
	}
}
