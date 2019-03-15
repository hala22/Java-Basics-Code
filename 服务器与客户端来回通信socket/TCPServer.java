package com.hala.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	
	public static void main(String[] args) {
		
		try {
			ServerSocket server=new ServerSocket(6666);
			
			while(true) {
				
				Socket socket=server.accept();
				System.out.println(socket.getInetAddress().getHostAddress()+
						"连接成功");
				
				HandleThread thread=new HandleThread(socket);
				thread.start();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
