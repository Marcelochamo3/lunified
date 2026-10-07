package o;

import java.security.MessageDigest;

/* JADX INFO: renamed from: o.w90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3119w90 implements InterfaceC0432Fs {
    public final MessageDigest l;
    public final C2965ug0 m = new C2965ug0();

    public C3119w90(MessageDigest messageDigest) {
        this.l = messageDigest;
    }

    @Override // o.InterfaceC0432Fs
    public final C2965ug0 c() {
        return this.m;
    }
}
