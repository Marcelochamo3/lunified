package o;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class L8 implements Q70 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ L8(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // o.Q70
    public final M70 a(Object obj, int i, int i2, FW fw) {
        K50 k50;
        boolean z;
        C2308nr c2308nr;
        switch (this.a) {
            case 0:
                M70 m70A = ((Q70) this.b).a(obj, i, i2, fw);
                if (m70A == null) {
                    return null;
                }
                return new R8((Resources) this.c, m70A);
            case 1:
                M70 m70C = ((S70) this.b).c((Uri) obj, fw);
                if (m70C == null) {
                    return null;
                }
                return zy0.l((Q8) this.c, (Drawable) ((C0698Pz) m70C).get(), i, i2);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof K50) {
                    k50 = (K50) inputStream;
                    z = false;
                } else {
                    k50 = new K50(inputStream, (C1813in) this.c);
                    z = true;
                }
                ArrayDeque arrayDeque = C2308nr.n;
                synchronized (arrayDeque) {
                    c2308nr = (C2308nr) arrayDeque.poll();
                    break;
                }
                if (c2308nr == null) {
                    c2308nr = new C2308nr();
                }
                c2308nr.l = k50;
                C3424zN c3424zN = new C3424zN(c2308nr);
                C2994uv c2994uv = new C2994uv(k50, 27, c2308nr);
                try {
                    C2010ko c2010ko = (C2010ko) this.b;
                    return c2010ko.a(new Na0(c3424zN, c2010ko.d, c2010ko.c), i, i2, fw, c2994uv);
                } finally {
                    c2308nr.a();
                    if (z) {
                        k50.f();
                    }
                }
        }
    }

    @Override // o.Q70
    public final boolean b(Object obj, FW fw) {
        switch (this.a) {
            case 0:
                return ((Q70) this.b).b(obj, fw);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((C2010ko) this.b).getClass();
                return true;
        }
    }

    public L8(Resources resources, Q70 q70) {
        this.a = 0;
        this.c = resources;
        this.b = q70;
    }
}
