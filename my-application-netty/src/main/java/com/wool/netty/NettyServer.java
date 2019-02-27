package com.wool.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @Author wanglin
 * @Date 2019/2/22
 */
public class NettyServer {

    private int port;
    private EventLoopGroup boss;
    private EventLoopGroup worker;

    public void init(int port) {
        this.port = port;
        this.boss = new NioEventLoopGroup();
        this.worker = new NioEventLoopGroup();
    }

    public void start() {
        try {
            ServerBootstrap bootstrap = new ServerBootstrap();

            bootstrap.group(boss, worker);

            bootstrap.channel(NioServerSocketChannel.class);

            bootstrap.childHandler(new ServerInitializer());

            bootstrap.option(ChannelOption.SO_BACKLOG, 1024);

            ChannelFuture future = bootstrap.bind(port).sync();

            future.addListener((f) -> {
                if (f.isSuccess()) {
                    System.out.println(" server start successful ...");
                }
            });

            future.channel().closeFuture().sync();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            boss.shutdownGracefully();
            worker.shutdownGracefully();
        }
    }
}
