package o;

import android.util.Log;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.Jj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0527Jj {
    public final Class a;
    public final List b;
    public final Z70 c;
    public final InterfaceC1941k20 d;
    public final String e;

    public C0527Jj(Class cls, Class cls2, Class cls3, List list, Z70 z70, Na0 na0) {
        this.a = cls;
        this.b = list;
        this.c = z70;
        this.d = na0;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final M70 a(int i, int i2, InterfaceC2195mj interfaceC2195mj, FW fw, C2295nk0 c2295nk0) {
        M70 m70B;
        InterfaceC2686rm0 interfaceC2686rm0;
        int iX;
        boolean z;
        boolean z2;
        boolean z3;
        Object c1414ej;
        InterfaceC1941k20 interfaceC1941k20 = this.d;
        List list = (List) interfaceC1941k20.n();
        AbstractC3045vW.k(list, "Argument must not be null");
        try {
            M70 m70B2 = b(interfaceC2195mj, i, i2, fw, list);
            interfaceC1941k20.e(list);
            RunnableC0501Ij runnableC0501Ij = (RunnableC0501Ij) c2295nk0.n;
            runnableC0501Ij.getClass();
            Class<?> cls = m70B2.get().getClass();
            int i3 = c2295nk0.m;
            C0449Gj c0449Gj = runnableC0501Ij.l;
            T70 t70I = null;
            if (i3 != 4) {
                InterfaceC2686rm0 interfaceC2686rm0F = c0449Gj.f(cls);
                m70B = interfaceC2686rm0F.b(runnableC0501Ij.s, m70B2, runnableC0501Ij.w, runnableC0501Ij.x);
                interfaceC2686rm0 = interfaceC2686rm0F;
            } else {
                m70B = m70B2;
                interfaceC2686rm0 = null;
            }
            if (!m70B2.equals(m70B)) {
                m70B2.e();
            }
            if (c0449Gj.c.b().d.i(m70B.d()) != null) {
                L60 l60B = c0449Gj.c.b();
                l60B.getClass();
                t70I = l60B.d.i(m70B.d());
                if (t70I == null) {
                    throw new K60(m70B.d());
                }
                iX = t70I.x(runnableC0501Ij.z);
            } else {
                iX = 3;
            }
            InterfaceC2450pI interfaceC2450pI = runnableC0501Ij.F;
            ArrayList arrayListB = c0449Gj.b();
            int size = arrayListB.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                if (((PQ) arrayListB.get(i4)).a.equals(interfaceC2450pI)) {
                    z = true;
                    break;
                }
                i4++;
            }
            if (runnableC0501Ij.y.d(i3, iX, !z)) {
                if (t70I == null) {
                    throw new K60(m70B.get().getClass());
                }
                int iW = AbstractC1701hf0.w(iX);
                if (iW == 0) {
                    z2 = true;
                    z3 = false;
                    c1414ej = new C1414ej(runnableC0501Ij.F, runnableC0501Ij.t);
                } else {
                    if (iW != 1) {
                        throw new IllegalArgumentException("Unknown strategy: ".concat(AbstractC1701hf0.C(iX)));
                    }
                    z2 = true;
                    c1414ej = new O70(c0449Gj.c.a, runnableC0501Ij.F, runnableC0501Ij.t, runnableC0501Ij.w, runnableC0501Ij.x, interfaceC2686rm0, cls, runnableC0501Ij.z);
                    z3 = false;
                }
                C3422zL c3422zL = (C3422zL) C3422zL.p.n();
                c3422zL.f1152o = z3;
                c3422zL.n = z2;
                c3422zL.m = m70B;
                Na0 na0 = runnableC0501Ij.q;
                na0.m = c1414ej;
                na0.n = t70I;
                na0.f414o = c3422zL;
                m70B = c3422zL;
            }
            return this.c.g(m70B, fw);
        } catch (Throwable th) {
            interfaceC1941k20.e(list);
            throw th;
        }
    }

    public final M70 b(InterfaceC2195mj interfaceC2195mj, int i, int i2, FW fw, List list) throws C1762iA {
        List list2 = this.b;
        int size = list2.size();
        M70 m70A = null;
        for (int i3 = 0; i3 < size; i3++) {
            Q70 q70 = (Q70) list2.get(i3);
            try {
                if (q70.b(interfaceC2195mj.f(), fw)) {
                    m70A = q70.a(interfaceC2195mj.f(), i, i2, fw);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(q70);
                }
                list.add(e);
            }
            if (m70A != null) {
                break;
            }
        }
        if (m70A != null) {
            return m70A;
        }
        throw new C1762iA(this.e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}
