package io.netty.handler.codec.socksx.v5;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:io/netty/handler/codec/socksx/v5/Socks5PasswordAuthRequest.class */
public interface Socks5PasswordAuthRequest extends Socks5Message {
    String username();

    String password();
}
