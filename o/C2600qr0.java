package o;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* JADX INFO: renamed from: o.qr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2600qr0 extends Authenticator {
    @Override // java.net.Authenticator
    public final PasswordAuthentication getPasswordAuthentication() {
        C1041ar0 c1041ar0;
        if (getRequestorType() == Authenticator.RequestorType.PROXY) {
            C3084vr0 c3084vr0 = C3084vr0.a;
            if (C3084vr0.s() && (c1041ar0 = C3084vr0.p) != null && AbstractC1899jh0.N(getRequestingHost(), c1041ar0.b, true) && getRequestingPort() == c1041ar0.c) {
                String str = c1041ar0.d;
                char[] charArray = c1041ar0.e.toCharArray();
                AbstractC1474fG.i(charArray, "toCharArray(...)");
                return new PasswordAuthentication(str, charArray);
            }
        }
        return null;
    }
}
