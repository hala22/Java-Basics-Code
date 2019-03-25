package com.hala.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class TCPClient {
	
	public static void main(String[] args) {
		
		try {
			Socket socket=new Socket("172.31.46.240",6666);
			BufferedReader br=new BufferedReader
					(new InputStreamReader(socket.getInputStream()));
			BufferedWriter bw=new BufferedWriter
					(new OutputStreamWriter(socket.getOutputStream()));
			//从键盘获取字符的方法
			BufferedReader reader=new BufferedReader
					(new InputStreamReader(System.in));
			
			
			String line=null;
			String response=null;
			
			while(true) {
				//这里有两点要注意
				//1.newLine不能省略，因为它代表换行，没有的话，readLine方法
				//读不到换行将无法结束
				//2.加上flush方法，刷新缓存
				line=reader.readLine();
				bw.write(line);
				bw.newLine();
				bw.flush();
				if(line.equals("exit"))
					break;
				
				response=br.readLine();
				System.out.println("收到服务器消息："+response);
			}
			
			bw.close();
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
