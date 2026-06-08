package com.kh.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {

	/*
		TCP
		- 서버, 클라이언트와 1:1 소캣통신
		- 데이터를 교환하기에 앞서 서버, 클라이언트 연결이 되어 있어야한다.
		(서버가 먼저 실행되어 있어야 클라이언트의 연결요청을 받을 수 있음.)
		
		
		Socket
		- 프로세스간의 통신을 담당
		- input/outputstream을 가지고 있음(입출력 가능)
		
		ServerSocket
		- 포트와 연결되어 외부에 연결 요청을 기다림 -> 요청이 돌아오면 수락
		수락 -> 통신할 수 있는 Socket생성
		
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = null;
		BufferedReader br = null;
		
		int port = 3000;
		
		try {
			ServerSocket server = new ServerSocket(port);
			
			
			System.out.println("클라이언트의 요청을 기다리는 중...");
			Socket socket = server.accept();
		
			InetAddress ClientIp = socket.getInetAddress();
			System.out.println(ClientIp.getHostAddress() + "연결요청중");
			
			//입력용 스트림(클라이언트로부터 전달된 값을 읽기위함)
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			pw = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				
				System.out.print("보낼내용 : ");
				String sendMessage = sc.nextLine();
				
				pw.println(sendMessage);
				pw.flush();
				
				String message = br.readLine();
				System.out.println("클라이언트 : "+ message);
				
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		sc.close();
		
		
	}

}
