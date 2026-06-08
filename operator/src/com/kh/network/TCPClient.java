package com.kh.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = null;
		BufferedReader br = null;
		
		 
		String ServerIP = "127.0.0.1";
		int port = 3000;
		
		try {
			Socket socket = new Socket(ServerIP,port);
			
			if(socket != null) {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				pw = new PrintWriter(socket.getOutputStream());
				
				while(true) {
					System.out.println("보낼내용 : ");
					String sendMessage = sc.nextLine();
					
					pw.println(sendMessage);
					pw.flush();
					
					String message = br.readLine();
					System.out.println("서버 : " + message);
				}
				
				
			}
			
			
		}catch(IOException e) {
			
		}
	
		sc.close();
	}
	
}
