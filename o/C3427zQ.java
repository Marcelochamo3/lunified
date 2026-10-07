package o;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: o.zQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3427zQ extends AbstractC1506fg {
    public static final C1971kP r;
    public final AbstractC1464f8[] k;
    public final Fj0[] l;
    public final ArrayList m;
    public final C0622Nb n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1153o;
    public long[][] p;
    public C0811Ui q;

    static {
        YO yo = new YO();
        XE xe = AbstractC0985aF.m;
        M60 m60 = M60.p;
        Collections.emptyList();
        M60 m61 = M60.p;
        r = new C1971kP("MergingMediaSource", new C0995aP(yo), null, new C1385eP(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C2263nP.T, C1581gP.n);
    }

    public C3427zQ(AbstractC1464f8... abstractC1464f8Arr) {
        C0622Nb c0622Nb = new C0622Nb(8);
        this.k = abstractC1464f8Arr;
        this.n = c0622Nb;
        this.m = new ArrayList(Arrays.asList(abstractC1464f8Arr));
        this.f1153o = -1;
        this.l = new Fj0[abstractC1464f8Arr.length];
        this.p = new long[0][];
        new HashMap();
        U9.d(8, "expectedKeys");
        new LS().e().c();
    }

    @Override // o.AbstractC1464f8
    public final InterfaceC2941uP b(CP cp, C1562g8 c1562g8, long j) {
        AbstractC1464f8[] abstractC1464f8Arr = this.k;
        int length = abstractC1464f8Arr.length;
        InterfaceC2941uP[] interfaceC2941uPArr = new InterfaceC2941uP[length];
        Fj0[] fj0Arr = this.l;
        int iB = fj0Arr[0].b(cp.a);
        for (int i = 0; i < length; i++) {
            interfaceC2941uPArr[i] = abstractC1464f8Arr[i].b(cp.b(fj0Arr[i].m(iB)), c1562g8, j - this.p[iB][i]);
        }
        return new C3330yQ(this.n, this.p[iB], interfaceC2941uPArr);
    }

    @Override // o.AbstractC1464f8
    public final C1971kP h() {
        AbstractC1464f8[] abstractC1464f8Arr = this.k;
        return abstractC1464f8Arr.length > 0 ? abstractC1464f8Arr[0].h() : r;
    }

    @Override // o.AbstractC1506fg, o.AbstractC1464f8
    public final void j() throws C0811Ui {
        C0811Ui c0811Ui = this.q;
        if (c0811Ui != null) {
            throw c0811Ui;
        }
        super.j();
    }

    @Override // o.AbstractC1464f8
    public final void l(InterfaceC2590qm0 interfaceC2590qm0) {
        this.j = interfaceC2590qm0;
        this.i = Lr0.n(null);
        int i = 0;
        while (true) {
            AbstractC1464f8[] abstractC1464f8Arr = this.k;
            if (i >= abstractC1464f8Arr.length) {
                return;
            }
            w(Integer.valueOf(i), abstractC1464f8Arr[i]);
            i++;
        }
    }

    @Override // o.AbstractC1464f8
    public final void n(InterfaceC2941uP interfaceC2941uP) {
        C3330yQ c3330yQ = (C3330yQ) interfaceC2941uP;
        int i = 0;
        while (true) {
            AbstractC1464f8[] abstractC1464f8Arr = this.k;
            if (i >= abstractC1464f8Arr.length) {
                return;
            }
            AbstractC1464f8 abstractC1464f8 = abstractC1464f8Arr[i];
            InterfaceC2941uP interfaceC2941uP2 = c3330yQ.l[i];
            if (interfaceC2941uP2 instanceof C3136wQ) {
                interfaceC2941uP2 = ((C3136wQ) interfaceC2941uP2).l;
            }
            abstractC1464f8.n(interfaceC2941uP2);
            i++;
        }
    }

    @Override // o.AbstractC1506fg, o.AbstractC1464f8
    public final void p() {
        super.p();
        Arrays.fill(this.l, (Object) null);
        this.f1153o = -1;
        this.q = null;
        ArrayList arrayList = this.m;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // o.AbstractC1506fg
    public final CP s(Object obj, CP cp) {
        if (((Integer) obj).intValue() == 0) {
            return cp;
        }
        return null;
    }

    @Override // o.AbstractC1506fg
    public final void v(Object obj, AbstractC1464f8 abstractC1464f8, Fj0 fj0) {
        Integer num = (Integer) obj;
        if (this.q != null) {
            return;
        }
        if (this.f1153o == -1) {
            this.f1153o = fj0.i();
        } else if (fj0.i() != this.f1153o) {
            this.q = new C0811Ui();
            return;
        }
        int length = this.p.length;
        Fj0[] fj0Arr = this.l;
        if (length == 0) {
            this.p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f1153o, fj0Arr.length);
        }
        ArrayList arrayList = this.m;
        arrayList.remove(abstractC1464f8);
        fj0Arr[num.intValue()] = fj0;
        if (arrayList.isEmpty()) {
            m(fj0Arr[0]);
        }
    }
}
