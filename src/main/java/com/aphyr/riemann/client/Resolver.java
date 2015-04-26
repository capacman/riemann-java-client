package com.aphyr.riemann.client;

import java.net.InetSocketAddress;

public class Resolver {
    protected InetSocketAddress remote;

    public Resolver(InetSocketAddress remote) {
        this.remote = remote;
    }

    public InetSocketAddress resolve() {
        String hostString = this.remote.getHostName();
        hostString = hostString == null && this.remote.getAddress() != null ? this.remote.getAddress().getHostAddress() : hostString;
        return new InetSocketAddress(hostString, this.remote.getPort());
    }
}
