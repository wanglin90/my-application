package com.wool.socket;

import java.io.IOException;

/**
 * @Author wanglin
 * @Date 2019/3/8
 */
public class SocketServerTest {

    public static void main(String[] args) throws IOException {
        SocketServer server = new SocketServer();
        server.init("172.18.223.64",9000);
        server.start();
    }
}
