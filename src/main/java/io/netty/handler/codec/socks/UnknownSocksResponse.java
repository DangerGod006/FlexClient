package io.netty.handler.codec.socks;

import io.netty.buffer.ByteBuf;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:io/netty/handler/codec/socks/UnknownSocksResponse.class */
public final class UnknownSocksResponse extends SocksResponse {
    public UnknownSocksResponse() {
        super(SocksResponseType.UNKNOWN);
    }

    @Override // io.netty.handler.codec.socks.SocksMessage
    public void encodeAsByteBuf(ByteBuf byteBuf) {
    }
}
