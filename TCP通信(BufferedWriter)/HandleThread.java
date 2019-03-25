package com.hala.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class HandleThread extends Thread{
	
	private Socket socket;
	
	public HandleThread(Socket socket) {
		
		this.socket=socket;
		
	}
	
	@Override
	public void run() {
		try {
			BufferedReader br=new BufferedReader
					(new InputStreamReader(socket.getInputStream()));
//			为什么用BufferedWriter会出现问题
			BufferedWriter bw=new BufferedWriter
					(new OutputStreamWriter(socket.getOutputStream()));
			
			BufferedReader reader=new BufferedReader
					(new InputStreamReader(System.in));
			
			String line=null;
			String response=null;
			while(true) {
				line=br.readLine();
				System.out.println("收到："+line);
				if(line.equals("exit"))
					break;
				
				System.out.println("请输入回信：");
				response=reader.readLine();
				bw.write(response);
				bw.newLine();
				bw.flush();
			}
			
			
			br.close();
			bw.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
