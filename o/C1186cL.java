package o;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.cL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1186cL {
    public static final C1089bL c = new C1089bL(Object.class, Object.class, Object.class, Collections.singletonList(new C0527Jj(Object.class, Object.class, Object.class, Collections.emptyList(), new C2691rp(19), null)), null);
    public final S5 a = new S5();
    public final AtomicReference b = new AtomicReference();

    public final void a(Class cls, Class cls2, Class cls3, C1089bL c1089bL) {
        synchronized (this.a) {
            S5 s5 = this.a;
            C3332yS c3332yS = new C3332yS(cls, cls2, cls3);
            if (c1089bL == null) {
                c1089bL = c;
            }
            s5.put(c3332yS, c1089bL);
        }
    }
}
