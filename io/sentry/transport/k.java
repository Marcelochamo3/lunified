package io.sentry.transport;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* JADX INFO: loaded from: classes.dex */
public final class k extends Authenticator {
    public final String a;
    public final String b;

    public k(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // java.net.Authenticator
    public final PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() != Authenticator.RequestorType.PROXY) {
            return null;
        }
        return new PasswordAuthentication(this.a, this.b.toCharArray());
    }
}
