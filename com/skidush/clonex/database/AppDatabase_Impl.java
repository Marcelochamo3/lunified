package com.skidush.clonex.database;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.AbstractC1474fG;
import o.C0560Kq;
import o.C1583gR;
import o.C1654h5;
import o.C1909jm0;
import o.C2303no0;
import o.C2351oG;
import o.C3261xj;
import o.C3291xy;
import o.Mh0;
import o.Na0;

/* JADX INFO: loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {
    public static final /* synthetic */ int v = 0;
    public volatile C1583gR r;
    public volatile C2303no0 s;
    public volatile Na0 t;
    public volatile C0560Kq u;

    @Override // o.F80
    public final C2351oG d() {
        return new C2351oG(this, new HashMap(0), new HashMap(0), "episodes", "movies", "seasons", "tv_shows");
    }

    @Override // o.F80
    public final Mh0 e(C3261xj c3261xj) {
        C1909jm0 c1909jm0 = new C1909jm0(c3261xj, new C1654h5(this), "22d32cab121674c733940f8a7d12e0ad", "67260500bdcae56f2a8174832025e462");
        Context context = c3261xj.a;
        AbstractC1474fG.j(context, "context");
        c3261xj.c.getClass();
        return new C3291xy(context, c3261xj.b, c1909jm0);
    }

    @Override // o.F80
    public final List f(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // o.F80
    public final Set h() {
        return new HashSet();
    }

    @Override // o.F80
    public final Map i() {
        HashMap map = new HashMap();
        map.put(C1583gR.class, Collections.emptyList());
        map.put(C2303no0.class, Collections.emptyList());
        map.put(Na0.class, Collections.emptyList());
        map.put(C0560Kq.class, Collections.emptyList());
        return map;
    }

    @Override // com.skidush.clonex.database.AppDatabase
    public final C0560Kq o() {
        C0560Kq c0560Kq;
        if (this.u != null) {
            return this.u;
        }
        synchronized (this) {
            try {
                if (this.u == null) {
                    this.u = new C0560Kq(this);
                }
                c0560Kq = this.u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0560Kq;
    }

    @Override // com.skidush.clonex.database.AppDatabase
    public final C1583gR p() {
        C1583gR c1583gR;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    this.r = new C1583gR(this);
                }
                c1583gR = this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1583gR;
    }

    @Override // com.skidush.clonex.database.AppDatabase
    public final Na0 q() {
        Na0 na0;
        if (this.t != null) {
            return this.t;
        }
        synchronized (this) {
            try {
                if (this.t == null) {
                    this.t = new Na0(this);
                }
                na0 = this.t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return na0;
    }

    @Override // com.skidush.clonex.database.AppDatabase
    public final C2303no0 r() {
        C2303no0 c2303no0;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            try {
                if (this.s == null) {
                    this.s = new C2303no0(this);
                }
                c2303no0 = this.s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2303no0;
    }
}
