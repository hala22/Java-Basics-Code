package com.hala.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
	
	public static void main(String[] args) {
		
		try {
			Socket socket=new Socket("172.31.13.179",6666);
			BufferedReader br=new BufferedReader
					(new InputStreamReader(socket.getInputStream()));
			PrintWriter pw=new PrintWriter(socket.getOutputStream(),true);
			
			Scanner input=new Scanner(System.in);
			String line=null;
			String response=null;
			
			while(true) {
				line=input.next();
				pw.println(line);
				if(line.equals("exit"))
					break;
				
				response=br.readLine();
				System.out.println("收到服务器消息："+response);
			}
			
			pw.close();
			br.close();
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
