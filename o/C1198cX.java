package o;

import android.graphics.Rect;
import j$.util.Objects;

/* JADX INFO: renamed from: o.cX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1198cX {
    public final Object a;
    public final Object b;

    public C1198cX(Rect rect, Rect rect2) {
        this.a = rect;
        this.b = rect2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1198cX)) {
            return false;
        }
        C1198cX c1198cX = (C1198cX) obj;
        return Objects.equals(c1198cX.a, this.a) && Objects.equals(c1198cX.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
