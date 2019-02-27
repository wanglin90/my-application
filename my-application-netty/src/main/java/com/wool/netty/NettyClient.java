package com.wool.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * @Author wanglin
 * @Date 2019/2/22
 */
public class NettyClient {

    private int port;
    private String host;
    private EventLoopGroup worker;

    public void init(int port, String host) {
        this.port = port;
        this.host = host;
        this.worker = new NioEventLoopGroup();
    }

    public ChannelFuture start() {
        ChannelFuture future = null;
        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(worker);
            bootstrap.channel(NioSocketChannel.class);
            bootstrap.handler(new ClientInitializer());
            future = bootstrap.connect(host, port).sync();

            future.addListener((f) -> {
                if (f.isSuccess()) {
                    System.out.println(" connect server successful ...");
                } else {
                    System.out.println(" connect server failure ... ");
                    worker.shutdownGracefully();
                }
            });
        } catch (InterruptedException e) {
            e.printStackTrace();
            worker.shutdownGracefully();
        }

        return future;
    }
}
