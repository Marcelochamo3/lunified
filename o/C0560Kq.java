package o;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: o.Kq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0560Kq implements InterfaceC0803Ua, InterfaceC2604qt0, InterfaceC2967uh0, CJ {
    public final /* synthetic */ int l;
    public Object m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f370o;
    public Object p;
    public Object q;

    public /* synthetic */ C0560Kq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.l = i;
        this.m = obj;
        this.n = obj2;
        this.f370o = obj3;
        this.p = obj4;
        this.q = obj5;
    }

    @Override // o.InterfaceC0803Ua
    public void E(A50 a50, IOException iOException) {
        AbstractC1474fG.j(a50, "call");
        List list = (List) this.m;
        synchronized (list) {
            list.add(iOException);
        }
        ((CountDownLatch) this.n).countDown();
    }

    @Override // o.InterfaceC2967uh0
    public int G() {
        return ((long[]) this.n).length;
    }

    public void a(String str, String str2) {
        AbstractC1474fG.j(str, "name");
        AbstractC1474fG.j(str2, "value");
        ((C2112lq) this.f370o).a(str, str2);
    }

    @Override // o.InterfaceC2604qt0
    public View b() {
        switch (this.l) {
            case 3:
                break;
            case 4:
                break;
        }
        return (ConstraintLayout) this.m;
    }

    public C1951k70 c() {
        Map mapUnmodifiableMap;
        C2446pE c2446pE = (C2446pE) this.m;
        if (c2446pE == null) {
            throw new IllegalStateException("url == null".toString());
        }
        String str = (String) this.n;
        C2152mB c2152mBF = ((C2112lq) this.f370o).f();
        AbstractC2340o70 abstractC2340o70 = (AbstractC2340o70) this.p;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.q;
        byte[] bArr = Mr0.a;
        AbstractC1474fG.j(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = C1330dq.l;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            AbstractC1474fG.i(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new C1951k70(c2446pE, str, c2152mBF, abstractC2340o70, mapUnmodifiableMap);
    }

    public void d() {
        m("GET", null);
    }

    @Override // o.InterfaceC2967uh0
    public int e(long j) {
        long[] jArr = (long[]) this.n;
        int iB = Lr0.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    public C0456Gq f(String str) {
        C0519Jb c0519Jb = (C0519Jb) this.f370o;
        G80 g80A = G80.a(1, "SELECT * FROM episodes WHERE id = ?");
        g80A.o(1, str);
        F80 f80 = (F80) this.m;
        f80.b();
        Cursor cursorW = U9.w(f80, g80A);
        try {
            int iM = AbstractC3409z9.m(cursorW, "id");
            int iM2 = AbstractC3409z9.m(cursorW, "number");
            int iM3 = AbstractC3409z9.m(cursorW, "title");
            int iM4 = AbstractC3409z9.m(cursorW, "poster");
            int iM5 = AbstractC3409z9.m(cursorW, "tvShow");
            int iM6 = AbstractC3409z9.m(cursorW, "season");
            int iM7 = AbstractC3409z9.m(cursorW, "released");
            int iM8 = AbstractC3409z9.m(cursorW, "isWatched");
            int iM9 = AbstractC3409z9.m(cursorW, "watchedDate");
            int iM10 = AbstractC3409z9.m(cursorW, "lastEngagementTimeUtcMillis");
            int iM11 = AbstractC3409z9.m(cursorW, "lastPlaybackPositionMillis");
            int iM12 = AbstractC3409z9.m(cursorW, "durationMillis");
            C0456Gq c0456Gq = null;
            String string = null;
            if (cursorW.moveToFirst()) {
                C2123lv0 c2123lv0 = (cursorW.isNull(iM10) && cursorW.isNull(iM11) && cursorW.isNull(iM12)) ? null : new C2123lv0(cursorW.getLong(iM10), cursorW.getLong(iM11), cursorW.getLong(iM12));
                C0456Gq c0456Gq2 = new C0456Gq();
                String string2 = cursorW.getString(iM);
                AbstractC1474fG.j(string2, "<set-?>");
                c0456Gq2.a = string2;
                c0456Gq2.b = cursorW.getInt(iM2);
                c0456Gq2.c = cursorW.isNull(iM3) ? null : cursorW.getString(iM3);
                c0456Gq2.d = cursorW.isNull(iM4) ? null : cursorW.getString(iM4);
                String string3 = cursorW.isNull(iM5) ? null : cursorW.getString(iM5);
                c0519Jb.getClass();
                c0456Gq2.e = C0519Jb.L(string3);
                c0456Gq2.f = C0519Jb.I(cursorW.isNull(iM6) ? null : cursorW.getString(iM6));
                c0456Gq2.g = C0519Jb.H(cursorW.isNull(iM7) ? null : cursorW.getString(iM7));
                c0456Gq2.h = cursorW.getInt(iM8) != 0;
                if (!cursorW.isNull(iM9)) {
                    string = cursorW.getString(iM9);
                }
                c0456Gq2.i = C0519Jb.H(string);
                c0456Gq2.j = c2123lv0;
                c0456Gq = c0456Gq2;
            }
            return c0456Gq;
        } finally {
            cursorW.close();
            g80A.l();
        }
    }

    public C2538q90 g(ArrayList arrayList) {
        StringBuilder sbK = AbstractC1701hf0.k("SELECT * FROM episodes WHERE id IN (");
        int size = arrayList.size();
        zy0.d(sbK, size);
        sbK.append(")");
        G80 g80A = G80.a(size, sbK.toString());
        Iterator it = arrayList.iterator();
        int i = 1;
        while (it.hasNext()) {
            g80A.o(i, (String) it.next());
            i++;
        }
        CallableC0534Jq callableC0534Jq = new CallableC0534Jq(this, g80A, 0);
        return UK.j((F80) this.m, new String[]{"episodes"}, callableC0534Jq);
    }

    @Override // o.CJ
    public Object getValue() {
        Ut0 ut0 = (Ut0) this.q;
        if (ut0 != null) {
            return ut0;
        }
        Zt0 zt0 = (Zt0) ((InterfaceC0360Cy) this.n).c();
        Yt0 yt0 = (Yt0) ((InterfaceC0360Cy) this.f370o).c();
        AbstractC2484pi abstractC2484pi = (AbstractC2484pi) ((InterfaceC0360Cy) this.p).c();
        AbstractC1474fG.j(zt0, "store");
        AbstractC1474fG.j(yt0, "factory");
        AbstractC1474fG.j(abstractC2484pi, "extras");
        RN rn = new RN(zt0, yt0, abstractC2484pi);
        InterfaceC1476fI interfaceC1476fI = (InterfaceC1476fI) this.m;
        AbstractC1474fG.j(interfaceC1476fI, "modelClass");
        String strK = Pu0.k(interfaceC1476fI);
        if (strK == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
        Ut0 ut0X = rn.x(interfaceC1476fI, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strK));
        this.q = ut0X;
        return ut0X;
    }

    @Override // o.InterfaceC2967uh0
    public long h(int i) {
        return ((long[]) this.n)[i];
    }

    public ArrayList i(String str) throws Throwable {
        G80 g80;
        C0519Jb c0519Jb = (C0519Jb) this.f370o;
        G80 g80A = G80.a(1, "SELECT * FROM episodes WHERE season = ? ORDER BY season, number");
        g80A.o(1, str);
        F80 f80 = (F80) this.m;
        f80.b();
        Cursor cursorW = U9.w(f80, g80A);
        try {
            int iM = AbstractC3409z9.m(cursorW, "id");
            int iM2 = AbstractC3409z9.m(cursorW, "number");
            int iM3 = AbstractC3409z9.m(cursorW, "title");
            int iM4 = AbstractC3409z9.m(cursorW, "poster");
            int iM5 = AbstractC3409z9.m(cursorW, "tvShow");
            int iM6 = AbstractC3409z9.m(cursorW, "season");
            int iM7 = AbstractC3409z9.m(cursorW, "released");
            int iM8 = AbstractC3409z9.m(cursorW, "isWatched");
            int iM9 = AbstractC3409z9.m(cursorW, "watchedDate");
            int iM10 = AbstractC3409z9.m(cursorW, "lastEngagementTimeUtcMillis");
            int iM11 = AbstractC3409z9.m(cursorW, "lastPlaybackPositionMillis");
            int iM12 = AbstractC3409z9.m(cursorW, "durationMillis");
            g80 = g80A;
            try {
                ArrayList arrayList = new ArrayList(cursorW.getCount());
                while (cursorW.moveToNext()) {
                    String string = null;
                    C2123lv0 c2123lv0 = (cursorW.isNull(iM10) && cursorW.isNull(iM11) && cursorW.isNull(iM12)) ? null : new C2123lv0(cursorW.getLong(iM10), cursorW.getLong(iM11), cursorW.getLong(iM12));
                    C0456Gq c0456Gq = new C0456Gq();
                    int i = iM10;
                    String string2 = cursorW.getString(iM);
                    int i2 = iM;
                    AbstractC1474fG.j(string2, "<set-?>");
                    c0456Gq.a = string2;
                    c0456Gq.b = cursorW.getInt(iM2);
                    c0456Gq.c = cursorW.isNull(iM3) ? null : cursorW.getString(iM3);
                    c0456Gq.d = cursorW.isNull(iM4) ? null : cursorW.getString(iM4);
                    String string3 = cursorW.isNull(iM5) ? null : cursorW.getString(iM5);
                    c0519Jb.getClass();
                    c0456Gq.e = C0519Jb.L(string3);
                    c0456Gq.f = C0519Jb.I(cursorW.isNull(iM6) ? null : cursorW.getString(iM6));
                    c0456Gq.g = C0519Jb.H(cursorW.isNull(iM7) ? null : cursorW.getString(iM7));
                    c0456Gq.h = cursorW.getInt(iM8) != 0;
                    if (!cursorW.isNull(iM9)) {
                        string = cursorW.getString(iM9);
                    }
                    c0456Gq.i = C0519Jb.H(string);
                    c0456Gq.j = c2123lv0;
                    arrayList.add(c0456Gq);
                    iM12 = iM12;
                    iM10 = i;
                    iM = i2;
                }
                cursorW.close();
                g80.l();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorW.close();
                g80.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            g80 = g80A;
        }
    }

    public void j(String str, String str2) {
        AbstractC1474fG.j(str, "name");
        AbstractC1474fG.j(str2, "value");
        ((C2112lq) this.f370o).q(str, str2);
    }

    public void k(C0456Gq c0456Gq) {
        F80 f80 = (F80) this.m;
        f80.b();
        f80.c();
        try {
            ((C0482Hq) this.n).h(c0456Gq);
            f80.m();
        } finally {
            f80.j();
        }
    }

    public void l(List list) {
        F80 f80 = (F80) this.m;
        f80.b();
        f80.c();
        try {
            ((C0482Hq) this.n).g(list);
            f80.m();
        } finally {
            f80.j();
        }
    }

    public void m(String str, AbstractC2340o70 abstractC2340o70) {
        AbstractC1474fG.j(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }
        if (abstractC2340o70 == null) {
            if (!(!(AbstractC1474fG.b(str, "POST") || AbstractC1474fG.b(str, "PUT") || AbstractC1474fG.b(str, "PATCH") || AbstractC1474fG.b(str, "PROPPATCH") || AbstractC1474fG.b(str, "REPORT")))) {
                throw new IllegalArgumentException(AbstractC1701hf0.u("method ", str, " must have a request body.").toString());
            }
        } else if (!AbstractC3045vW.y(str)) {
            throw new IllegalArgumentException(AbstractC1701hf0.u("method ", str, " must not have a request body.").toString());
        }
        this.n = str;
        this.p = abstractC2340o70;
    }

    public void n(String str) {
        AbstractC1474fG.j(str, "name");
        ((C2112lq) this.f370o).n(str);
    }

    public void o(String str) {
        F80 f80 = (F80) this.m;
        f80.b();
        C3110w5 c3110w5 = (C3110w5) this.q;
        C3485zy c3485zyA = c3110w5.a();
        c3485zyA.o(1, str);
        try {
            f80.c();
            try {
                c3485zyA.f();
                f80.m();
                f80.j();
                c3110w5.d(c3485zyA);
            } catch (Throwable th) {
                f80.j();
                throw th;
            }
        } catch (Throwable th2) {
            c3110w5.d(c3485zyA);
            throw th2;
        }
    }

    @Override // o.InterfaceC0803Ua
    public void p(A50 a50, C1855j80 c1855j80) {
        ((C0349Cn) this.f370o).getClass();
        C0349Cn.c(c1855j80, (String) this.p, (List) this.q, (List) this.m);
        ((CountDownLatch) this.n).countDown();
    }

    public void q(C0456Gq c0456Gq) {
        C2985uq0 c2985uq0;
        if (f(c0456Gq.a) != null) {
            s(c0456Gq);
            c2985uq0 = C2985uq0.a;
        } else {
            c2985uq0 = null;
        }
        if (c2985uq0 == null) {
            k(c0456Gq);
        }
    }

    public void r(Class cls, Object obj) {
        AbstractC1474fG.j(cls, "type");
        if (obj == null) {
            ((LinkedHashMap) this.q).remove(cls);
            return;
        }
        if (((LinkedHashMap) this.q).isEmpty()) {
            this.q = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.q;
        Object objCast = cls.cast(obj);
        AbstractC1474fG.g(objCast);
        linkedHashMap.put(cls, objCast);
    }

    public void s(C0456Gq c0456Gq) {
        F80 f80 = (F80) this.m;
        f80.b();
        f80.c();
        try {
            ((C0508Iq) this.p).f(c0456Gq);
            f80.m();
        } finally {
            f80.j();
        }
    }

    @Override // o.InterfaceC2967uh0
    public List t(long j) {
        C1131bn0 c1131bn0 = (C1131bn0) this.m;
        c1131bn0.getClass();
        ArrayList<Pair> arrayList = new ArrayList();
        c1131bn0.g(j, c1131bn0.h, arrayList);
        TreeMap treeMap = new TreeMap();
        c1131bn0.i(j, false, c1131bn0.h, treeMap);
        Map map = (Map) this.f370o;
        Map map2 = (Map) this.p;
        c1131bn0.h(j, map, map2, c1131bn0.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) ((Map) this.q).get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                C1228cn0 c1228cn0 = (C1228cn0) map2.get(pair.first);
                c1228cn0.getClass();
                arrayList2.add(new C3162wi(null, null, null, bitmapDecodeByteArray, c1228cn0.c, 0, c1228cn0.e, c1228cn0.b, 0, Integer.MIN_VALUE, -3.4028235E38f, c1228cn0.f, c1228cn0.g, false, -16777216, c1228cn0.j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C1228cn0 c1228cn1 = (C1228cn0) map2.get(entry.getKey());
            c1228cn1.getClass();
            C3065vi c3065vi = (C3065vi) entry.getValue();
            CharSequence charSequence = c3065vi.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (C1908jm c1908jm : (C1908jm[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C1908jm.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c1908jm), spannableStringBuilder.getSpanEnd(c1908jm), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c3065vi.e = c1228cn1.c;
            c3065vi.f = c1228cn1.d;
            c3065vi.g = c1228cn1.e;
            c3065vi.h = c1228cn1.b;
            c3065vi.l = c1228cn1.f;
            c3065vi.k = c1228cn1.i;
            c3065vi.j = c1228cn1.h;
            c3065vi.p = c1228cn1.j;
            arrayList2.add(c3065vi.a());
        }
        return arrayList2;
    }

    public String toString() {
        switch (this.l) {
            case 2:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.m) + ", mProviderPackage: " + ((String) this.n) + ", mQuery: " + ((String) this.f370o) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.p;
                    if (i >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i);
                    for (int i2 = 0; i2 < list2.size(); i2++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i++;
                }
                break;
            default:
                return super.toString();
        }
    }

    public void u(String str) {
        AbstractC1474fG.j(str, "url");
        if (AbstractC1899jh0.U(str, "ws:", true)) {
            String strSubstring = str.substring(3);
            AbstractC1474fG.i(strSubstring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(strSubstring);
        } else if (AbstractC1899jh0.U(str, "wss:", true)) {
            String strSubstring2 = str.substring(4);
            AbstractC1474fG.i(strSubstring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(strSubstring2);
        }
        AbstractC1474fG.j(str, "<this>");
        C2349oE c2349oE = new C2349oE();
        c2349oE.g(null, str);
        this.m = c2349oE.b();
    }

    public /* synthetic */ C0560Kq(boolean z) {
        this.l = 6;
    }

    public C0560Kq(C2766se c2766se, InterfaceC0360Cy interfaceC0360Cy, InterfaceC0360Cy interfaceC0360Cy2, InterfaceC0360Cy interfaceC0360Cy3) {
        this.l = 8;
        this.m = c2766se;
        this.n = interfaceC0360Cy;
        this.f370o = interfaceC0360Cy2;
        this.p = interfaceC0360Cy3;
    }

    public C0560Kq(F80 f80) {
        this.l = 0;
        this.f370o = new C0519Jb(6);
        this.m = f80;
        int i = 0;
        this.n = new C0482Hq(this, f80, i);
        this.p = new C0508Iq(this, f80, i);
        this.q = new C3110w5(f80, 1);
    }

    public C0560Kq(C1131bn0 c1131bn0, HashMap map, HashMap map2, HashMap map3) {
        this.l = 7;
        this.m = c1131bn0;
        this.p = map2;
        this.q = map3;
        this.f370o = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        c1131bn0.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.n = jArr;
    }

    public C0560Kq(String str, String str2, String str3, List list) {
        this.l = 2;
        str.getClass();
        this.m = str;
        str2.getClass();
        this.n = str2;
        this.f370o = str3;
        list.getClass();
        this.p = list;
        this.q = str + "-" + str2 + "-" + str3;
    }

    public C0560Kq() {
        this.l = 6;
        this.q = new LinkedHashMap();
        this.n = "GET";
        this.f370o = new C2112lq(1);
    }
}
