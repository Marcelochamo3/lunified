package o;

import android.content.res.Resources;
import j$.util.Objects;

/* JADX INFO: renamed from: o.d80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1270d80 {
    public final Resources a;
    public final Resources.Theme b;

    public C1270d80(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1270d80.class != obj.getClass()) {
            return false;
        }
        C1270d80 c1270d80 = (C1270d80) obj;
        return this.a.equals(c1270d80.a) && Objects.equals(this.b, c1270d80.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
