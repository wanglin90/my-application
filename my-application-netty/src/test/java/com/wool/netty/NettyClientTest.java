package com.wool.netty;

import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author wanglin
 * @Date 2019/2/22
 */
public class NettyClientTest {
    public static void main(String[] args) throws IOException {
        NettyClient nettyClient = new NettyClient();
        nettyClient.init(8000,"127.0.0.1");
        ChannelFuture future = nettyClient.start();
        Channel channel = future.channel();

        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            if (line != null && line.length() > 0) {
                channel.writeAndFlush(line);
            }
        }
    }
}
