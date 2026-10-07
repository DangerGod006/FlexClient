package io.netty.handler.codec.socksx.v5;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:io/netty/handler/codec/socksx/v5/Socks5CommandRequest.class */
public interface Socks5CommandRequest extends Socks5Message {
    Socks5CommandType type();

    Socks5AddressType dstAddrType();

    String dstAddr();

    int dstPort();
}
