package io.sentry.internal.gestures;

import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final WeakReference a;
    public final String b;
    public final String c;
    public final String d = null;
    public final String e = "old_view_system";

    public b(Object obj, String str, String str2) {
        this.a = new WeakReference(obj);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return io.sentry.config.a.e(this.b, bVar.b) && io.sentry.config.a.e(this.c, bVar.c) && io.sentry.config.a.e(this.d, bVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.d});
    }
}
