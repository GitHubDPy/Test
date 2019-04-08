package com.wch.test.Socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException {

		Socket socket = new Socket("localhost", 8888);
		
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			
			String nextLine = scanner.nextLine();
			
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());	
			
			dos.writeUTF(nextLine);
		}
		
		

		
		
		
	}

}
