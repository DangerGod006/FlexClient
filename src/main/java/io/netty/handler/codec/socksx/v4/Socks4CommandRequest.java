package io.netty.handler.codec.socksx.v4;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:io/netty/handler/codec/socksx/v4/Socks4CommandRequest.class */
public interface Socks4CommandRequest extends Socks4Message {
    Socks4CommandType type();

    String userId();

    String dstAddr();

    int dstPort();
}
