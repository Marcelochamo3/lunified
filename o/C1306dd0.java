package o;

import android.os.Bundle;
import androidx.preference.Preference;
import java.io.Serializable;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: o.dd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1306dd0 implements L20, S9, Oi0, InterfaceC2339o7 {
    public static final C1306dd0 m = new C1306dd0(11);
    public static final C1306dd0 n = new C1306dd0(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C1306dd0 f739o = new C1306dd0(13);
    public static final C1306dd0 p = new C1306dd0(14);
    public static final C1306dd0 q = new C1306dd0(15);
    public final /* synthetic */ int l;

    public /* synthetic */ C1306dd0(int i) {
        this.l = i;
    }

    public void a(Bm0 bm0, Cm0 cm0, boolean z) {
        switch (this.l) {
            case 11:
                bm0.e(cm0);
                break;
            case 12:
                bm0.d(cm0);
                break;
            case 13:
                bm0.a(cm0);
                break;
            case 14:
                bm0.b();
                break;
            default:
                bm0.c();
                break;
        }
    }

    @Override // o.InterfaceC2339o7
    public C1951k70 e(K80 k80, C1855j80 c1855j80) {
        AbstractC1474fG.j(c1855j80, "response");
        C1041ar0 c1041ar0 = C3084vr0.p;
        if (c1041ar0 == null) {
            return null;
        }
        C3084vr0 c3084vr0 = C3084vr0.a;
        if (!C3084vr0.s()) {
            c1041ar0 = null;
        }
        if (c1041ar0 == null) {
            return null;
        }
        InetSocketAddress inetSocketAddress = k80 != null ? k80.c : null;
        if (inetSocketAddress != null && (!AbstractC1899jh0.N(inetSocketAddress.getHostString(), c1041ar0.b, true) || inetSocketAddress.getPort() != c1041ar0.c)) {
            return null;
        }
        if (c1855j80.l.c.a("Proxy-Authorization") != null) {
            C3084vr0.F(true);
            return null;
        }
        C0560Kq c0560KqA = c1855j80.l.a();
        c0560KqA.j("Proxy-Authorization", AbstractC3021v9.c(c1041ar0.d, c1041ar0.e));
        return c0560KqA.c();
    }

    @Override // o.L20
    public boolean f(Preference preference, Serializable serializable) {
        switch (this.l) {
            case 0:
                AbstractC1474fG.j(preference, "<anonymous parameter 0>");
                C3084vr0 c3084vr0 = C3084vr0.a;
                AbstractC1474fG.h(serializable, "null cannot be cast to non-null type kotlin.String");
                C3084vr0.I((String) serializable);
                break;
            default:
                AbstractC1474fG.j(preference, "<anonymous parameter 0>");
                C3084vr0 c3084vr1 = C3084vr0.a;
                AbstractC1474fG.h(serializable, "null cannot be cast to non-null type kotlin.Boolean");
                C3084vr0.J(((Boolean) serializable).booleanValue());
                break;
        }
        return true;
    }

    @Override // o.S9
    public T9 g(Bundle bundle) {
        M60 m60P;
        switch (this.l) {
            case 2:
                AbstractC0397Ej.c(bundle.getInt(AbstractC2530q50.l, -1) == 2);
                int i = bundle.getInt(C2093lg0.p, 5);
                float f = bundle.getFloat(C2093lg0.q, -1.0f);
                return f == -1.0f ? new C2093lg0(i) : new C2093lg0(i, f);
            case 3:
            default:
                C1306dd0 c1306dd0 = Zl0.s;
                Bundle bundle2 = bundle.getBundle(C2007km0.q);
                bundle2.getClass();
                Zl0 zl0 = (Zl0) c1306dd0.g(bundle2);
                int[] intArray = bundle.getIntArray(C2007km0.r);
                int i2 = zl0.l;
                int[] iArr = new int[i2];
                if (intArray == null) {
                    intArray = iArr;
                }
                boolean[] booleanArray = bundle.getBooleanArray(C2007km0.s);
                boolean[] zArr = new boolean[i2];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new C2007km0(zl0, bundle.getBoolean(C2007km0.t, false), intArray, booleanArray);
            case 4:
                AbstractC0397Ej.c(bundle.getInt(AbstractC2530q50.l, -1) == 3);
                return bundle.getBoolean(C1903jj0.p, false) ? new C1903jj0(bundle.getBoolean(C1903jj0.q, false)) : new C1903jj0();
            case 5:
                int i3 = bundle.getInt(Dj0.s, 0);
                long j = bundle.getLong(Dj0.t, -9223372036854775807L);
                long j2 = bundle.getLong(Dj0.u, 0L);
                boolean z = bundle.getBoolean(Dj0.v, false);
                Bundle bundle3 = bundle.getBundle(Dj0.w);
                U1 u1 = bundle3 != null ? (U1) U1.x.g(bundle3) : U1.r;
                Dj0 dj0 = new Dj0();
                dj0.j(null, null, i3, j, j2, u1, z);
                return dj0;
            case 6:
                Bundle bundle4 = bundle.getBundle(Ej0.F);
                C1971kP c1971kP = bundle4 != null ? (C1971kP) C1971kP.y.g(bundle4) : C1971kP.r;
                long j3 = bundle.getLong(Ej0.G, -9223372036854775807L);
                long j4 = bundle.getLong(Ej0.H, -9223372036854775807L);
                long j5 = bundle.getLong(Ej0.I, -9223372036854775807L);
                boolean z2 = bundle.getBoolean(Ej0.J, false);
                boolean z3 = bundle.getBoolean(Ej0.K, false);
                Bundle bundle5 = bundle.getBundle(Ej0.L);
                C1385eP c1385eP = bundle5 != null ? (C1385eP) C1385eP.w.g(bundle5) : null;
                boolean z4 = bundle.getBoolean(Ej0.M, false);
                long j6 = bundle.getLong(Ej0.N, 0L);
                long j7 = bundle.getLong(Ej0.O, -9223372036854775807L);
                int i4 = bundle.getInt(Ej0.P, 0);
                int i5 = bundle.getInt(Ej0.Q, 0);
                long j8 = bundle.getLong(Ej0.R, 0L);
                Ej0 ej0 = new Ej0();
                ej0.b(Ej0.D, c1971kP, null, j3, j4, j5, z2, z3, c1385eP, j6, j7, i4, i5, j8);
                ej0.w = z4;
                return ej0;
            case 7:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Zl0.q);
                if (parcelableArrayList == null) {
                    XE xe = AbstractC0985aF.m;
                    m60P = M60.p;
                } else {
                    m60P = U9.p(C0643Nw.A0, parcelableArrayList);
                }
                return new Zl0(bundle.getString(Zl0.r, ""), (C0643Nw[]) m60P.toArray(new C0643Nw[0]));
            case 8:
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(C1031am0.p);
                return parcelableArrayList2 == null ? new C1031am0(new Zl0[0]) : new C1031am0((Zl0[]) U9.p(Zl0.s, parcelableArrayList2).toArray(new Zl0[0]));
            case 9:
                Bundle bundle6 = bundle.getBundle(C1519fm0.n);
                bundle6.getClass();
                Zl0 zl1 = (Zl0) Zl0.s.g(bundle6);
                int[] intArray2 = bundle.getIntArray(C1519fm0.f782o);
                intArray2.getClass();
                return new C1519fm0(zl1, intArray2.length == 0 ? Collections.emptyList() : new C1768iG(0, intArray2.length, intArray2));
        }
    }
}
