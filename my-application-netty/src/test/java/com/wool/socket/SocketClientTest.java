package com.wool.socket;

import java.io.IOException;

/**
 * @Author wanglin
 * @Date 2019/3/8
 */
public class SocketClientTest {

    public static void main(String[] args) throws IOException, InterruptedException {
        SocketClient client = new SocketClient();
        client.init("172.18.223.64",9000);
        client.start();
    }
}
