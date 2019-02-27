package com.wool.netty;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @Author wanglin
 * @Date 2019/2/22
 */
public class ServerHandler extends SimpleChannelInboundHandler<String> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        System.out.println(" server receive msg : " + msg);
        ctx.writeAndFlush("hello, " + msg);
    }
}
