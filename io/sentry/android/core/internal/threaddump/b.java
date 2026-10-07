package io.sentry.android.core.internal.threaddump;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final ArrayList a;
    public final int b;
    public int c;

    public b(ArrayList arrayList) {
        this.a = arrayList;
        this.b = arrayList.size();
    }

    public final a a() {
        int i = this.c;
        if (i < 0 || i >= this.b) {
            return null;
        }
        this.c = i + 1;
        return (a) this.a.get(i);
    }
}
