package o;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: o.vk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3069vk implements InterfaceC2583qj {
    public final Context l;
    public final ArrayList m;
    public final InterfaceC2583qj n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0589Lu f1080o;
    public C1167c6 p;
    public C1118bh q;
    public InterfaceC2583qj r;
    public C2307nq0 s;
    public C2389oj t;
    public C2723s50 u;
    public InterfaceC2583qj v;

    public C3069vk(Context context, InterfaceC2583qj interfaceC2583qj) {
        this.l = context.getApplicationContext();
        interfaceC2583qj.getClass();
        this.n = interfaceC2583qj;
        this.m = new ArrayList();
    }

    public static void c(InterfaceC2583qj interfaceC2583qj, InterfaceC2590qm0 interfaceC2590qm0) {
        if (interfaceC2583qj != null) {
            interfaceC2583qj.k(interfaceC2590qm0);
        }
    }

    @Override // o.InterfaceC2000kj
    public final int D(byte[] bArr, int i, int i2) {
        InterfaceC2583qj interfaceC2583qj = this.v;
        interfaceC2583qj.getClass();
        return interfaceC2583qj.D(bArr, i, i2);
    }

    public final void b(InterfaceC2583qj interfaceC2583qj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i >= arrayList.size()) {
                return;
            }
            interfaceC2583qj.k((InterfaceC2590qm0) arrayList.get(i));
            i++;
        }
    }

    @Override // o.InterfaceC2583qj
    public final void close() {
        InterfaceC2583qj interfaceC2583qj = this.v;
        if (interfaceC2583qj != null) {
            try {
                interfaceC2583qj.close();
            } finally {
                this.v = null;
            }
        }
    }

    @Override // o.InterfaceC2583qj
    public final void k(InterfaceC2590qm0 interfaceC2590qm0) {
        interfaceC2590qm0.getClass();
        this.n.k(interfaceC2590qm0);
        this.m.add(interfaceC2590qm0);
        c(this.f1080o, interfaceC2590qm0);
        c(this.p, interfaceC2590qm0);
        c(this.q, interfaceC2590qm0);
        c(this.r, interfaceC2590qm0);
        c(this.s, interfaceC2590qm0);
        c(this.t, interfaceC2590qm0);
        c(this.u, interfaceC2590qm0);
    }

    @Override // o.InterfaceC2583qj
    public final Map l() {
        InterfaceC2583qj interfaceC2583qj = this.v;
        return interfaceC2583qj == null ? Collections.emptyMap() : interfaceC2583qj.l();
    }

    @Override // o.InterfaceC2583qj
    public final long v(C2970uj c2970uj) {
        AbstractC0397Ej.f(this.v == null);
        String scheme = c2970uj.a.getScheme();
        int i = Lr0.a;
        Uri uri = c2970uj.a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.l;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f1080o == null) {
                    C0589Lu c0589Lu = new C0589Lu(false);
                    this.f1080o = c0589Lu;
                    b(c0589Lu);
                }
                this.v = this.f1080o;
            } else {
                if (this.p == null) {
                    C1167c6 c1167c6 = new C1167c6(context);
                    this.p = c1167c6;
                    b(c1167c6);
                }
                this.v = this.p;
            }
        } else if ("asset".equals(scheme)) {
            if (this.p == null) {
                C1167c6 c1167c7 = new C1167c6(context);
                this.p = c1167c7;
                b(c1167c7);
            }
            this.v = this.p;
        } else if ("content".equals(scheme)) {
            if (this.q == null) {
                C1118bh c1118bh = new C1118bh(context);
                this.q = c1118bh;
                b(c1118bh);
            }
            this.v = this.q;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            InterfaceC2583qj interfaceC2583qj = this.n;
            if (zEquals) {
                if (this.r == null) {
                    try {
                        InterfaceC2583qj interfaceC2583qj2 = (InterfaceC2583qj) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.r = interfaceC2583qj2;
                        b(interfaceC2583qj2);
                    } catch (ClassNotFoundException unused) {
                        AP.z();
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.r == null) {
                        this.r = interfaceC2583qj;
                    }
                }
                this.v = this.r;
            } else if ("udp".equals(scheme)) {
                if (this.s == null) {
                    C2307nq0 c2307nq0 = new C2307nq0();
                    this.s = c2307nq0;
                    b(c2307nq0);
                }
                this.v = this.s;
            } else if ("data".equals(scheme)) {
                if (this.t == null) {
                    C2389oj c2389oj = new C2389oj(false);
                    this.t = c2389oj;
                    b(c2389oj);
                }
                this.v = this.t;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.u == null) {
                    C2723s50 c2723s50 = new C2723s50(context);
                    this.u = c2723s50;
                    b(c2723s50);
                }
                this.v = this.u;
            } else {
                this.v = interfaceC2583qj;
            }
        }
        return this.v.v(c2970uj);
    }

    @Override // o.InterfaceC2583qj
    public final Uri w() {
        InterfaceC2583qj interfaceC2583qj = this.v;
        if (interfaceC2583qj == null) {
            return null;
        }
        return interfaceC2583qj.w();
    }
}
