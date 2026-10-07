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
import o.C1654h5;
import o.C1909jm0;
import o.C2351oG;
import o.C3207x5;
import o.C3261xj;
import o.C3291xy;
import o.Mh0;

/* JADX INFO: loaded from: classes.dex */
public final class ArCacheDatabase_Impl extends ArCacheDatabase {
    public volatile C3207x5 p;

    @Override // o.F80
    public final C2351oG d() {
        return new C2351oG(this, new HashMap(0), new HashMap(0), "ar_dash_cache");
    }

    @Override // o.F80
    public final Mh0 e(C3261xj c3261xj) {
        C1909jm0 c1909jm0 = new C1909jm0(c3261xj, new C1654h5(this), "52fb9183a796bafa4b9b23599070d6ee", "8f8b850ebc62ab981d4858505d0c1f8b");
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
        map.put(C3207x5.class, Collections.emptyList());
        return map;
    }

    @Override // com.skidush.clonex.database.ArCacheDatabase
    public final C3207x5 o() {
        C3207x5 c3207x5;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            try {
                if (this.p == null) {
                    this.p = new C3207x5(this);
                }
                c3207x5 = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3207x5;
    }
}
