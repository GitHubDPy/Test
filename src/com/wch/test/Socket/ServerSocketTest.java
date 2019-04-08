package com.wch.test.Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerSocketTest {
	
	public static void main(String[] args) throws IOException {
	
		System.out.println("server");
		ServerSocket serverSocket = new ServerSocket(8888);
		
		Socket accept = serverSocket.accept();
		
		System.out.println("服务器连接成功");
		
		
		while(true) {
			
			DataInputStream dis = new DataInputStream(accept.getInputStream());
		
			String str = dis.readUTF();
			
			System.out.println("服务器："+str);		
		}
		
		
		
		
		
	}

}
