package o;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: o.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2421p implements InterfaceC0888Xh {
    public final float a;

    public C2421p(float f) {
        this.a = f;
    }

    @Override // o.InterfaceC0888Xh
    public final float a(RectF rectF) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2421p) && this.a == ((C2421p) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
