package o;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: renamed from: o.mA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2151mA implements InterfaceC2450pI {
    public final InterfaceC2346oB b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    public volatile byte[] g;
    public int h;

    public C2151mA(URL url) {
        GJ gj = InterfaceC2346oB.a;
        AbstractC3045vW.k(url, "Argument must not be null");
        this.c = url;
        this.d = null;
        AbstractC3045vW.k(gj, "Argument must not be null");
        this.b = gj;
    }

    @Override // o.InterfaceC2450pI
    public final void a(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = c().getBytes(InterfaceC2450pI.a);
        }
        messageDigest.update(this.g);
    }

    public final String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        AbstractC3045vW.k(url, "Argument must not be null");
        return url.toString();
    }

    public final String d() {
        if (TextUtils.isEmpty(this.e)) {
            String string = this.d;
            if (TextUtils.isEmpty(string)) {
                URL url = this.c;
                AbstractC3045vW.k(url, "Argument must not be null");
                string = url.toString();
            }
            this.e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.e;
    }

    @Override // o.InterfaceC2450pI
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2151mA)) {
            return false;
        }
        C2151mA c2151mA = (C2151mA) obj;
        return c().equals(c2151mA.c()) && this.b.equals(c2151mA.b);
    }

    @Override // o.InterfaceC2450pI
    public final int hashCode() {
        if (this.h == 0) {
            int iHashCode = c().hashCode();
            this.h = iHashCode;
            this.h = this.b.hashCode() + (iHashCode * 31);
        }
        return this.h;
    }

    public final String toString() {
        return c();
    }

    public C2151mA(String str) {
        GJ gj = InterfaceC2346oB.a;
        this.c = null;
        if (!TextUtils.isEmpty(str)) {
            this.d = str;
            AbstractC3045vW.k(gj, "Argument must not be null");
            this.b = gj;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
