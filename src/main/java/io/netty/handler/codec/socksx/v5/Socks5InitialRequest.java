package io.netty.handler.codec.socksx.v5;

import java.util.List;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:io/netty/handler/codec/socksx/v5/Socks5InitialRequest.class */
public interface Socks5InitialRequest extends Socks5Message {
    List<Socks5AuthMethod> authMethods();
}
