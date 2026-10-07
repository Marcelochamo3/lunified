package o;

import android.net.Uri;
import android.os.Bundle;
import androidx.preference.Preference;
import com.skidush.clonex.MyApplication;
import io.sentry.C0066n0;
import io.sentry.C0083q1;
import io.sentry.C0104y;
import io.sentry.InterfaceC0003a1;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: o.Nm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0633Nm implements InterfaceC0402Eo, InterfaceC0671Oy, QK, S9, JO, NO, InterfaceC0003a1, io.sentry.B1, InterfaceC0809Ug, L20 {
    public final /* synthetic */ int l;

    public /* synthetic */ C0633Nm(int i) {
        this.l = i;
    }

    @Override // o.InterfaceC0402Eo
    public void a() {
    }

    @Override // o.InterfaceC0809Ug
    public void accept(Object obj) {
        ((A90) obj).b.a();
    }

    @Override // o.InterfaceC0671Oy
    public Object apply(Object obj) {
        switch (this.l) {
            case 2:
                return new C0942Zj((Sh0) obj);
            default:
                return (Wl0) obj;
        }
    }

    @Override // o.QK
    public void b(Object obj) {
        InterfaceC2176mZ interfaceC2176mZ = (InterfaceC2176mZ) obj;
        switch (this.l) {
            case 3:
                interfaceC2176mZ.h(new Lr(2, new C0730Rf(1), 1003));
                break;
            default:
                interfaceC2176mZ.r();
                break;
        }
    }

    @Override // io.sentry.InterfaceC0003a1
    public void c(io.sentry.I1 i1) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) i1;
        MyApplication myApplication = MyApplication.l;
        AbstractC1474fG.j(sentryAndroidOptions, "options");
        sentryAndroidOptions.setDsn(AbstractC1360e5.d);
        sentryAndroidOptions.setTracesSampleRate(Double.valueOf(0.0d));
        sentryAndroidOptions.setSendDefaultPii(false);
        sentryAndroidOptions.setAttachScreenshot(false);
        sentryAndroidOptions.setAttachViewHierarchy(false);
        sentryAndroidOptions.setAttachAnrThreadDump(false);
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setBeforeSend(new C0633Nm(24));
    }

    @Override // o.JO
    public List d(String str, boolean z, boolean z2) {
        return OO.e(str, z, z2);
    }

    @Override // o.NO
    public int e(Object obj) {
        EO eo = (EO) obj;
        switch (this.l) {
            case 9:
                String str = eo.a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (Lr0.a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                return eo.a.startsWith("OMX.google") ? 1 : 0;
        }
    }

    @Override // o.L20
    public boolean f(Preference preference, Serializable serializable) {
        switch (this.l) {
            case 28:
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
        AbstractC1278dF abstractC1278dFB;
        M60 m60P;
        M60 m60P2;
        Bundle bundle2;
        Bundle bundle3;
        boolean z = true;
        int i = 0;
        byte b = 0;
        switch (this.l) {
            case 5:
                C0617Mw c0617Mw = new C0617Mw();
                if (bundle != null) {
                    ClassLoader classLoader = U9.class.getClassLoader();
                    int i2 = Lr0.a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(C0643Nw.U);
                C0643Nw c0643Nw = C0643Nw.T;
                String str = c0643Nw.l;
                if (string == null) {
                    string = str;
                }
                c0617Mw.a = string;
                String string2 = bundle.getString(C0643Nw.V);
                if (string2 == null) {
                    string2 = c0643Nw.m;
                }
                c0617Mw.b = string2;
                String string3 = bundle.getString(C0643Nw.W);
                if (string3 == null) {
                    string3 = c0643Nw.n;
                }
                c0617Mw.c = string3;
                c0617Mw.d = bundle.getInt(C0643Nw.X, c0643Nw.f421o);
                c0617Mw.e = bundle.getInt(C0643Nw.Y, c0643Nw.p);
                c0617Mw.f = bundle.getInt(C0643Nw.Z, c0643Nw.q);
                c0617Mw.g = bundle.getInt(C0643Nw.a0, c0643Nw.r);
                String string4 = bundle.getString(C0643Nw.b0);
                if (string4 == null) {
                    string4 = c0643Nw.t;
                }
                c0617Mw.h = string4;
                CQ cq = (CQ) bundle.getParcelable(C0643Nw.c0);
                if (cq == null) {
                    cq = c0643Nw.u;
                }
                c0617Mw.i = cq;
                String string5 = bundle.getString(C0643Nw.d0);
                if (string5 == null) {
                    string5 = c0643Nw.v;
                }
                c0617Mw.j = string5;
                String string6 = bundle.getString(C0643Nw.e0);
                if (string6 == null) {
                    string6 = c0643Nw.w;
                }
                c0617Mw.k = string6;
                c0617Mw.l = bundle.getInt(C0643Nw.f0, c0643Nw.x);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(C0643Nw.g0 + "_" + Integer.toString(i, 36));
                    if (byteArray == null) {
                        c0617Mw.m = arrayList;
                        c0617Mw.n = (C3271xo) bundle.getParcelable(C0643Nw.h0);
                        c0617Mw.f405o = bundle.getLong(C0643Nw.i0, c0643Nw.A);
                        c0617Mw.p = bundle.getInt(C0643Nw.j0, c0643Nw.B);
                        c0617Mw.q = bundle.getInt(C0643Nw.k0, c0643Nw.C);
                        c0617Mw.r = bundle.getFloat(C0643Nw.l0, c0643Nw.D);
                        c0617Mw.s = bundle.getInt(C0643Nw.m0, c0643Nw.E);
                        c0617Mw.t = bundle.getFloat(C0643Nw.n0, c0643Nw.F);
                        c0617Mw.u = bundle.getByteArray(C0643Nw.o0);
                        c0617Mw.v = bundle.getInt(C0643Nw.p0, c0643Nw.H);
                        Bundle bundle4 = bundle.getBundle(C0643Nw.q0);
                        if (bundle4 != null) {
                            c0617Mw.w = (C1602gf) C1602gf.v.g(bundle4);
                        }
                        c0617Mw.x = bundle.getInt(C0643Nw.r0, c0643Nw.J);
                        c0617Mw.y = bundle.getInt(C0643Nw.s0, c0643Nw.K);
                        c0617Mw.z = bundle.getInt(C0643Nw.t0, c0643Nw.L);
                        c0617Mw.A = bundle.getInt(C0643Nw.u0, c0643Nw.M);
                        c0617Mw.B = bundle.getInt(C0643Nw.v0, c0643Nw.N);
                        c0617Mw.C = bundle.getInt(C0643Nw.w0, c0643Nw.O);
                        c0617Mw.D = bundle.getInt(C0643Nw.y0, c0643Nw.P);
                        c0617Mw.E = bundle.getInt(C0643Nw.z0, c0643Nw.Q);
                        c0617Mw.F = bundle.getInt(C0643Nw.x0, c0643Nw.R);
                        return new C0643Nw(c0617Mw);
                    }
                    arrayList.add(byteArray);
                    i++;
                }
                break;
            case 6:
                AbstractC0397Ej.c(bundle.getInt(AbstractC2530q50.l, -1) == 0);
                return bundle.getBoolean(C2443pB.p, false) ? new C2443pB(bundle.getBoolean(C2443pB.q, false)) : new C2443pB();
            case 7:
            case 8:
            case 9:
            case 10:
            case 21:
            case 22:
            case 23:
            case 24:
            default:
                int i3 = bundle.getInt(AbstractC2530q50.l, -1);
                if (i3 == 0) {
                    return (AbstractC2530q50) C2443pB.r.g(bundle);
                }
                if (i3 == 1) {
                    return (AbstractC2530q50) DY.p.g(bundle);
                }
                if (i3 == 2) {
                    return (AbstractC2530q50) C2093lg0.r.g(bundle);
                }
                if (i3 == 3) {
                    return (AbstractC2530q50) C1903jj0.r.g(bundle);
                }
                throw new IllegalArgumentException(AbstractC1674hK.n(i3, "Unknown RatingType: "));
            case 11:
                String string7 = bundle.getString(C1971kP.s, "");
                string7.getClass();
                Bundle bundle5 = bundle.getBundle(C1971kP.t);
                C1385eP c1385eP = bundle5 == null ? C1385eP.q : (C1385eP) C1385eP.w.g(bundle5);
                Bundle bundle6 = bundle.getBundle(C1971kP.u);
                C2263nP c2263nP = bundle6 == null ? C2263nP.T : (C2263nP) C2263nP.B0.g(bundle6);
                Bundle bundle7 = bundle.getBundle(C1971kP.v);
                C0995aP c0995aP = bundle7 == null ? C0995aP.x : (C0995aP) ZO.w.g(bundle7);
                Bundle bundle8 = bundle.getBundle(C1971kP.w);
                C1581gP c1581gP = bundle8 == null ? C1581gP.n : (C1581gP) C1581gP.r.g(bundle8);
                Bundle bundle9 = bundle.getBundle(C1971kP.x);
                return new C1971kP(string7, c0995aP, bundle9 != null ? (C1483fP) C1483fP.A.g(bundle9) : null, c1385eP, c2263nP, c1581gP);
            case 12:
                Uri uri = (Uri) bundle.getParcelable(XO.m);
                uri.getClass();
                C0334By c0334By = new C0334By(15, (boolean) (b == true ? 1 : 0));
                c0334By.m = uri;
                return new XO(c0334By);
            case 13:
                YO yo = new YO();
                C0995aP c0995aP2 = ZO.q;
                long j = bundle.getLong(ZO.r, c0995aP2.l);
                AbstractC0397Ej.c(j >= 0);
                yo.a = j;
                long j2 = bundle.getLong(ZO.s, c0995aP2.m);
                if (j2 != Long.MIN_VALUE && j2 < 0) {
                    z = false;
                }
                AbstractC0397Ej.c(z);
                yo.b = j2;
                yo.c = bundle.getBoolean(ZO.t, c0995aP2.n);
                yo.d = bundle.getBoolean(ZO.u, c0995aP2.f655o);
                yo.e = bundle.getBoolean(ZO.v, c0995aP2.p);
                return new C0995aP(yo);
            case 14:
                String string8 = bundle.getString(C1190cP.t);
                string8.getClass();
                UUID uuidFromString = UUID.fromString(string8);
                Uri uri2 = (Uri) bundle.getParcelable(C1190cP.u);
                Bundle bundle10 = Bundle.EMPTY;
                Bundle bundle11 = bundle.getBundle(C1190cP.v);
                if (bundle11 == null) {
                    bundle11 = bundle10;
                }
                R60 r60 = R60.r;
                if (bundle11 == bundle10) {
                    abstractC1278dFB = r60;
                } else {
                    HashMap map = new HashMap();
                    if (bundle11 != bundle10) {
                        for (String str2 : bundle11.keySet()) {
                            String string9 = bundle11.getString(str2);
                            if (string9 != null) {
                                map.put(str2, string9);
                            }
                        }
                    }
                    abstractC1278dFB = AbstractC1278dF.b(map);
                }
                boolean z2 = bundle.getBoolean(C1190cP.w, false);
                boolean z3 = bundle.getBoolean(C1190cP.x, false);
                boolean z4 = bundle.getBoolean(C1190cP.y, false);
                ArrayList<Integer> arrayList2 = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(C1190cP.z);
                if (integerArrayList != null) {
                    arrayList2 = integerArrayList;
                }
                AbstractC0985aF abstractC0985aFL = AbstractC0985aF.l(arrayList2);
                byte[] byteArray2 = bundle.getByteArray(C1190cP.A);
                C1093bP c1093bP = new C1093bP();
                c1093bP.a = uuidFromString;
                c1093bP.c = r60;
                c1093bP.g = M60.p;
                c1093bP.b = uri2;
                c1093bP.c = AbstractC1278dF.b(abstractC1278dFB);
                c1093bP.d = z2;
                c1093bP.f = z4;
                c1093bP.e = z3;
                c1093bP.g = AbstractC0985aF.l(abstractC0985aFL);
                c1093bP.h = byteArray2 != null ? Arrays.copyOf(byteArray2, byteArray2.length) : null;
                return new C1190cP(c1093bP);
            case 15:
                return new C1385eP(bundle.getLong(C1385eP.r, -9223372036854775807L), bundle.getLong(C1385eP.s, -9223372036854775807L), bundle.getLong(C1385eP.t, -9223372036854775807L), bundle.getFloat(C1385eP.u, -3.4028235E38f), bundle.getFloat(C1385eP.v, -3.4028235E38f));
            case 16:
                Bundle bundle12 = bundle.getBundle(C1483fP.v);
                C1190cP c1190cP = bundle12 == null ? null : (C1190cP) C1190cP.B.g(bundle12);
                Bundle bundle13 = bundle.getBundle(C1483fP.w);
                XO xo = bundle13 != null ? (XO) XO.n.g(bundle13) : null;
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(C1483fP.x);
                if (parcelableArrayList == null) {
                    XE xe = AbstractC0985aF.m;
                    m60P = M60.p;
                } else {
                    m60P = U9.p(new C0633Nm(17), parcelableArrayList);
                }
                M60 m60 = m60P;
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(C1483fP.z);
                if (parcelableArrayList2 == null) {
                    XE xe2 = AbstractC0985aF.m;
                    m60P2 = M60.p;
                } else {
                    m60P2 = U9.p(C1873jP.z, parcelableArrayList2);
                }
                M60 m61 = m60P2;
                Uri uri3 = (Uri) bundle.getParcelable(C1483fP.t);
                uri3.getClass();
                return new C1483fP(uri3, bundle.getString(C1483fP.u), c1190cP, xo, m60, bundle.getString(C1483fP.y), m61, null);
            case 17:
                return new Cg0(bundle.getInt(Cg0.f201o, 0), bundle.getInt(Cg0.p, 0), bundle.getInt(Cg0.q, 0));
            case 18:
                RN rn = new RN(1);
                rn.m = (Uri) bundle.getParcelable(C1581gP.f792o);
                rn.n = bundle.getString(C1581gP.p);
                rn.f488o = bundle.getBundle(C1581gP.q);
                return new C1581gP(rn);
            case 19:
                Uri uri4 = (Uri) bundle.getParcelable(C1873jP.s);
                uri4.getClass();
                String string10 = bundle.getString(C1873jP.t);
                String string11 = bundle.getString(C1873jP.u);
                int i4 = bundle.getInt(C1873jP.v, 0);
                int i5 = bundle.getInt(C1873jP.w, 0);
                String string12 = bundle.getString(C1873jP.x);
                String string13 = bundle.getString(C1873jP.y);
                C1777iP c1777iP = new C1777iP(uri4);
                c1777iP.b = string10;
                c1777iP.c = string11;
                c1777iP.d = i4;
                c1777iP.e = i5;
                c1777iP.f = string12;
                c1777iP.g = string13;
                return c1777iP.b();
            case 20:
                C2166mP c2166mP = new C2166mP();
                c2166mP.a = bundle.getCharSequence(C2263nP.U);
                c2166mP.b = bundle.getCharSequence(C2263nP.V);
                c2166mP.c = bundle.getCharSequence(C2263nP.W);
                c2166mP.d = bundle.getCharSequence(C2263nP.X);
                c2166mP.e = bundle.getCharSequence(C2263nP.Y);
                c2166mP.f = bundle.getCharSequence(C2263nP.Z);
                c2166mP.g = bundle.getCharSequence(C2263nP.a0);
                byte[] byteArray3 = bundle.getByteArray(C2263nP.d0);
                String str3 = C2263nP.w0;
                Integer numValueOf = bundle.containsKey(str3) ? Integer.valueOf(bundle.getInt(str3)) : null;
                c2166mP.j = byteArray3 != null ? (byte[]) byteArray3.clone() : null;
                c2166mP.k = numValueOf;
                c2166mP.l = (Uri) bundle.getParcelable(C2263nP.e0);
                c2166mP.x = bundle.getCharSequence(C2263nP.p0);
                c2166mP.y = bundle.getCharSequence(C2263nP.q0);
                c2166mP.z = bundle.getCharSequence(C2263nP.r0);
                c2166mP.C = bundle.getCharSequence(C2263nP.u0);
                c2166mP.D = bundle.getCharSequence(C2263nP.v0);
                c2166mP.E = bundle.getCharSequence(C2263nP.x0);
                c2166mP.G = bundle.getBundle(C2263nP.A0);
                String str4 = C2263nP.b0;
                if (bundle.containsKey(str4) && (bundle3 = bundle.getBundle(str4)) != null) {
                    c2166mP.h = (AbstractC2530q50) AbstractC2530q50.m.g(bundle3);
                }
                String str5 = C2263nP.c0;
                if (bundle.containsKey(str5) && (bundle2 = bundle.getBundle(str5)) != null) {
                    c2166mP.i = (AbstractC2530q50) AbstractC2530q50.m.g(bundle2);
                }
                String str6 = C2263nP.f0;
                if (bundle.containsKey(str6)) {
                    c2166mP.m = Integer.valueOf(bundle.getInt(str6));
                }
                String str7 = C2263nP.g0;
                if (bundle.containsKey(str7)) {
                    c2166mP.n = Integer.valueOf(bundle.getInt(str7));
                }
                String str8 = C2263nP.h0;
                if (bundle.containsKey(str8)) {
                    c2166mP.f912o = Integer.valueOf(bundle.getInt(str8));
                }
                String str9 = C2263nP.z0;
                if (bundle.containsKey(str9)) {
                    c2166mP.p = Boolean.valueOf(bundle.getBoolean(str9));
                }
                String str10 = C2263nP.i0;
                if (bundle.containsKey(str10)) {
                    c2166mP.q = Boolean.valueOf(bundle.getBoolean(str10));
                }
                String str11 = C2263nP.j0;
                if (bundle.containsKey(str11)) {
                    c2166mP.r = Integer.valueOf(bundle.getInt(str11));
                }
                String str12 = C2263nP.k0;
                if (bundle.containsKey(str12)) {
                    c2166mP.s = Integer.valueOf(bundle.getInt(str12));
                }
                String str13 = C2263nP.l0;
                if (bundle.containsKey(str13)) {
                    c2166mP.t = Integer.valueOf(bundle.getInt(str13));
                }
                String str14 = C2263nP.m0;
                if (bundle.containsKey(str14)) {
                    c2166mP.u = Integer.valueOf(bundle.getInt(str14));
                }
                String str15 = C2263nP.n0;
                if (bundle.containsKey(str15)) {
                    c2166mP.v = Integer.valueOf(bundle.getInt(str15));
                }
                String str16 = C2263nP.o0;
                if (bundle.containsKey(str16)) {
                    c2166mP.w = Integer.valueOf(bundle.getInt(str16));
                }
                String str17 = C2263nP.s0;
                if (bundle.containsKey(str17)) {
                    c2166mP.A = Integer.valueOf(bundle.getInt(str17));
                }
                String str18 = C2263nP.t0;
                if (bundle.containsKey(str18)) {
                    c2166mP.B = Integer.valueOf(bundle.getInt(str18));
                }
                String str19 = C2263nP.y0;
                if (bundle.containsKey(str19)) {
                    c2166mP.F = Integer.valueOf(bundle.getInt(str19));
                }
                return new C2263nP(c2166mP);
            case 25:
                AbstractC0397Ej.c(bundle.getInt(AbstractC2530q50.l, -1) == 1);
                float f = bundle.getFloat(DY.f216o, -1.0f);
                return f == -1.0f ? new DY() : new DY(f);
        }
    }

    public boolean h(int i, int i2, int i3, int i4, int i5) {
        switch (this.l) {
            case 7:
                return false;
            default:
                return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
        }
    }

    public C0083q1 i(C0083q1 c0083q1, C0104y c0104y) {
        MyApplication myApplication = MyApplication.l;
        c0083q1.f108o = null;
        c0083q1.t = null;
        c0083q1.u = null;
        Map map = c0083q1.z;
        if (map != null) {
            map.clear();
        }
        List list = c0083q1.x;
        if (list != null) {
            list.clear();
        }
        C0066n0 c0066n0 = c0083q1.E;
        ArrayList arrayList = c0066n0 == null ? null : c0066n0.a;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((io.sentry.protocol.s) it.next()).m = "[detalle omitido]";
            }
        }
        io.sentry.protocol.k kVar = c0083q1.B;
        if (kVar != null) {
            kVar.m = "[mensaje omitido]";
            kVar.l = null;
            kVar.n = new ArrayList(C1233cq.l);
        }
        return c0083q1;
    }
}
