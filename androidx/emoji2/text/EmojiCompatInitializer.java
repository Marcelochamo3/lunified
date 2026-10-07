package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import o.C0455Gp;
import o.C0481Hp;
import o.C0533Jp;
import o.C1478fK;
import o.C3287xw;
import o.InterfaceC1283dK;
import o.JF;
import o.Na0;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements JF {
    @Override // o.JF
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // o.JF
    public final /* bridge */ /* synthetic */ Object b(Context context) {
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        C3287xw c3287xw = new C3287xw(new C0533Jp(context, 0));
        c3287xw.a = 1;
        if (C0455Gp.k == null) {
            synchronized (C0455Gp.j) {
                try {
                    if (C0455Gp.k == null) {
                        C0455Gp.k = new C0455Gp(c3287xw);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(context);
    }

    public final void d(Context context) {
        Object objW;
        Na0 na0B = Na0.B(context);
        na0B.getClass();
        synchronized (Na0.q) {
            try {
                objW = ((HashMap) na0B.m).get(ProcessLifecycleInitializer.class);
                if (objW == null) {
                    objW = na0B.w(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1478fK c1478fKF = ((InterfaceC1283dK) objW).f();
        c1478fKF.a(new C0481Hp(this, c1478fKF));
    }
}
