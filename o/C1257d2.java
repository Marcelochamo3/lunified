package o;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: o.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1257d2 implements InterfaceC0888Xh {
    public final InterfaceC0888Xh a;
    public final float b;

    public C1257d2(float f, InterfaceC0888Xh interfaceC0888Xh) {
        while (interfaceC0888Xh instanceof C1257d2) {
            interfaceC0888Xh = ((C1257d2) interfaceC0888Xh).a;
            f += ((C1257d2) interfaceC0888Xh).b;
        }
        this.a = interfaceC0888Xh;
        this.b = f;
    }

    @Override // o.InterfaceC0888Xh
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1257d2)) {
            return false;
        }
        C1257d2 c1257d2 = (C1257d2) obj;
        return this.a.equals(c1257d2.a) && this.b == c1257d2.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
