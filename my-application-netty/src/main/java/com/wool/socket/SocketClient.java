package com.wool.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @Author wanglin
 * @Date 2019/3/8
 */
public class SocketClient {

    private String host;
    private int port;

    public void init(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void start() throws IOException, InterruptedException {
        Socket socket = new Socket(host, port);
        OutputStream out = socket.getOutputStream();
        PrintWriter writer = new PrintWriter(out);
        writer.write("hello server ...");
        writer.flush();
        socket.close();
    }
}
