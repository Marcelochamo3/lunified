package o;

import android.view.DisplayCutout;
import j$.util.Objects;

/* JADX INFO: renamed from: o.ln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2106ln {
    public final DisplayCutout a;

    public C2106ln(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2106ln.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((C2106ln) obj).a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
