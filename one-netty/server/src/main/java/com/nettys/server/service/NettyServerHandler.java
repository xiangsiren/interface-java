package com.nettys.server.service;

import ch.qos.logback.core.util.TimeUtil;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;

import java.util.concurrent.TimeUnit;

public class NettyServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        super.channelInactive(ctx);
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        Thread.sleep(10 * 1000);
        ctx.writeAndFlush(Unpooled.copiedBuffer("hell ,yanyan",CharsetUtil.UTF_8));

//        System.out.println("服务器读取线程" + Thread.currentThread().getName());
//        System.out.println("server ctx = " + ctx);
//
//        ByteBuf byteBuf = (ByteBuf) msg ;
//
//        Channel ch = ctx.channel() ;
//
//        System.out.println("客户端发送的消息是：= " + byteBuf.toString(CharsetUtil.UTF_8));
//        System.out.println("客户端IP = " + ctx.channel().remoteAddress());
//        super.channelRead(ctx, msg);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {

        ctx.close();
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {

        ctx.writeAndFlush(Unpooled.copiedBuffer("hell ,renren",CharsetUtil.UTF_8));

    }
}
