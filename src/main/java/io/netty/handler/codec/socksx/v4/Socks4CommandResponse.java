package io.netty.handler.codec.socksx.v4;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:io/netty/handler/codec/socksx/v4/Socks4CommandResponse.class */
public interface Socks4CommandResponse extends Socks4Message {
    Socks4CommandStatus status();

    String dstAddr();

    int dstPort();
}
