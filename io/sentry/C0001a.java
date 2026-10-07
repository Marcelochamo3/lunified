package io.sentry;

/* JADX INFO: renamed from: io.sentry.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0001a {
    public final byte[] a;
    public final InterfaceC0084r0 b;
    public final String c;
    public final String d;
    public final String e;

    public C0001a(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.b = null;
        this.c = str;
        this.d = str2;
        this.e = "event.attachment";
    }

    public C0001a(io.sentry.protocol.F f) {
        this.a = null;
        this.b = f;
        this.c = "view-hierarchy.json";
        this.d = "application/json";
        this.e = "event.view_hierarchy";
    }
}
