package com.wool.socket;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author wanglin
 * @Date 2019/3/8
 */
public class SocketServer {

    private String host;
    private int port;

    public void init(String host,int port){
        this.host = host;
        this.port = port;
    }

    public void start() throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress(host, port));
        while (true) {
            Socket socket = serverSocket.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream in = socket.getInputStream();
                        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println("server receive msg : "+ line);
                        }
                        OutputStream out = socket.getOutputStream();
                        PrintWriter writer = new PrintWriter(out);
                        writer.write("hello client");
                        writer.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
