package com.wool.netty;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

/**
 * @Author wanglin
 * @Date 2019/2/22
 */
public class ServerInitializer extends ChannelInitializer {

    @Override
    protected void initChannel(Channel channel) throws Exception {
        ChannelPipeline pipeline = channel.pipeline();
        pipeline.addLast("encoder", new StringEncoder());
        pipeline.addLast("decoder", new StringDecoder());
        pipeline.addLast("serverHandler", new ServerHandler());
    }
}
