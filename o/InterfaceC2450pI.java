package o;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: renamed from: o.pI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2450pI {
    public static final Charset a = Charset.forName("UTF-8");

    void a(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
