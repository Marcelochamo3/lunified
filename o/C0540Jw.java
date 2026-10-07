package o;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.Jw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0540Jw extends AbstractC2340o70 {
    public static final TP c;
    public final List a;
    public final List b;

    static {
        Pattern pattern = TP.e;
        c = AbstractC1474fG.o("application/x-www-form-urlencoded");
    }

    public C0540Jw(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC1474fG.j(arrayList, "encodedNames");
        AbstractC1474fG.j(arrayList2, "encodedValues");
        this.a = Mr0.x(arrayList);
        this.b = Mr0.x(arrayList2);
    }

    @Override // o.AbstractC2340o70
    public final long a() {
        return d(null, true);
    }

    @Override // o.AbstractC2340o70
    public final TP b() {
        return c;
    }

    @Override // o.AbstractC2340o70
    public final void c(M9 m9) throws EOFException {
        d(m9, false);
    }

    public final long d(M9 m9, boolean z) throws EOFException {
        E9 e9B;
        if (z) {
            e9B = new E9();
        } else {
            AbstractC1474fG.g(m9);
            e9B = m9.b();
        }
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                e9B.f0(38);
            }
            e9B.l0((String) list.get(i));
            e9B.f0(61);
            e9B.l0((String) this.b.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = e9B.m;
        e9B.p();
        return j;
    }
}
