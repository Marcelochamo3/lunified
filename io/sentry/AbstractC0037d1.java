package io.sentry;

import io.sentry.protocol.C0076c;
import io.sentry.protocol.C0077d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: io.sentry.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0037d1 {
    public io.sentry.protocol.t l;
    public final C0076c m;
    public io.sentry.protocol.r n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public io.sentry.protocol.n f108o;
    public Map p;
    public String q;
    public String r;
    public String s;
    public io.sentry.protocol.E t;
    public transient Throwable u;
    public String v;
    public String w;
    public List x;
    public C0077d y;
    public Map z;

    public AbstractC0037d1(io.sentry.protocol.t tVar) {
        this.m = new C0076c();
        this.l = tVar;
    }

    public final void a(String str, String str2) {
        if (this.p == null) {
            this.p = new HashMap();
        }
        this.p.put(str, str2);
    }

    public AbstractC0037d1() {
        this(new io.sentry.protocol.t((UUID) null));
    }
}
