package io.netty.handler.codec.socksx.v5;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:io/netty/handler/codec/socksx/v5/Socks5CommandResponse.class */
public interface Socks5CommandResponse extends Socks5Message {
    Socks5CommandStatus status();

    Socks5AddressType bndAddrType();

    String bndAddr();

    int bndPort();
}
