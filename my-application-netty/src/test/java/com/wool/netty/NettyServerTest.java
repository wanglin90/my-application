package com.wool.netty;

/**
 * @Author wanglin
 * @Date 2019/2/22
 */
public class NettyServerTest {
    public static void main(String[] args) {
        NettyServer nettyServer = new NettyServer();
        nettyServer.init(8000);
        nettyServer.start();
    }
}
