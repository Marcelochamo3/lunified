package com.bumptech.glide.integration.okhttp3;

import o.L60;
import o.OV;
import o.RV;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class OkHttpGlideModule {
    public final void a(L60 l60) {
        if (RV.c == null) {
            synchronized (RV.class) {
                try {
                    if (RV.c == null) {
                        RV.c = new OV();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        l60.l(new RV(RV.c));
    }
}
