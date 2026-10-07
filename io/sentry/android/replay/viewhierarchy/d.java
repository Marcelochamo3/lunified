package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import io.sentry.android.replay.p;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public final int a;
    public final int b;
    public final float c;
    public final boolean d;
    public final Rect e;
    public List f;

    public d(int i, int i2, float f, d dVar, boolean z, Rect rect) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = z;
        this.e = rect;
    }

    public final void a(p pVar) {
        List list;
        if (!((Boolean) pVar.b(this)).booleanValue() || (list = this.f) == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(pVar);
        }
    }
}
