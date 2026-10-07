package o;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.mx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2224mx0 extends Ph0 implements InterfaceC0775Sy {
    public long m;
    public C1737hx0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f927o;
    public ArrayList p;
    public int q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2224mx0(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.r = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2224mx0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2224mx0(this.r, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x010d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0174  */
    /* JADX WARN: Code duplicated, block: B:56:0x011b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x016b A[SYNTHETIC] */
    @Override // o.R7
    public final Object r(Object obj) {
        long jElapsedRealtime;
        ArrayList arrayList;
        Object objN;
        C1737hx0 c1737hx0;
        String str;
        Integer numJ;
        C3421zK c3421zK;
        HashSet hashSet;
        ArrayList arrayList2;
        ListIterator listIterator;
        C3324yK c3324yK;
        Object next;
        int iOptInt;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.q;
        if (i != 0) {
            if (i == 1) {
                jElapsedRealtime = this.m;
                Jp0.O(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ArrayList arrayList3 = this.p;
                str = this.f927o;
                c1737hx0 = this.n;
                Jp0.O(obj);
                arrayList = arrayList3;
                objN = obj;
            }
            c3421zK = new C3421zK();
            for (JSONObject jSONObject : (List) objN) {
                iOptInt = jSONObject.optInt("episodeNumber", 0);
                if (iOptInt > 0) {
                    String strOptString = jSONObject.optString("programContentId");
                    c3421zK.add(new C0456Gq("xuper-episode:" + c1737hx0.a + ":" + iOptInt + ":" + strOptString, iOptInt, AbstractC1674hK.n(iOptInt, "Episodio "), null, str, null, null, 104));
                }
            }
            C3421zK c3421zKH = AbstractC2506pt.h(c3421zK);
            hashSet = new HashSet();
            arrayList2 = new ArrayList();
            listIterator = c3421zKH.listIterator(0);
            while (true) {
                c3324yK = (C3324yK) listIterator;
                if (c3324yK.hasNext()) {
                    List listR0 = AbstractC0911Ye.r0(arrayList2, new C1749i30(12));
                    listR0.size();
                    arrayList.size();
                    SystemClock.elapsedRealtime();
                    return listR0;
                }
                next = c3324yK.next();
                if (hashSet.add(new Integer(((C0456Gq) next).b))) {
                    arrayList2.add(next);
                }
            }
        } else {
            Jp0.O(obj);
            jElapsedRealtime = SystemClock.elapsedRealtime();
            Lx0 lx0 = Lx0.b;
            this.m = jElapsedRealtime;
            this.q = 1;
            if (lx0.A(this) == enumC1706hi) {
                return enumC1706hi;
            }
        }
        Lx0 lx1 = Lx0.b;
        List listS0 = AbstractC1119bh0.s0(AbstractC1119bh0.l0(this.r, "xuper-season:"), new char[]{':'}, 2, 2);
        if (listS0.isEmpty() || AbstractC1899jh0.O((CharSequence) listS0.get(0))) {
            throw new IllegalArgumentException("Temporada no disponible");
        }
        String str2 = (String) listS0.get(0);
        String str3 = (String) AbstractC0911Ye.e0(1, listS0);
        int iIntValue = (str3 == null || (numJ = AbstractC1802ih0.J(str3)) == null) ? 0 : numJ.intValue();
        C1737hx0 c1737hx1 = new C1737hx0(str2, iIntValue);
        if (iIntValue <= 0) {
            return C1233cq.l;
        }
        JSONObject jSONObject2 = (JSONObject) Lx0.j.get(str2);
        String strE = jSONObject2 != null ? Lx0.E(jSONObject2, AbstractC0937Ze.K("icon", "poster", "stage")) : null;
        XF xfH = U9.H(new ZF(1, iIntValue, 1), 25);
        arrayList = new ArrayList(AbstractC1016af.O(xfH, 10));
        YF it = xfH.iterator();
        while (it.n) {
            int iA = it.a();
            arrayList.add(AbstractC0911Ye.x0(new ZF(iA, Math.min(iA + 24, c1737hx1.b), 1)));
        }
        C2127lx0 c2127lx0 = new C2127lx0(arrayList, null, Nb0.a(4), c1737hx1);
        this.n = c1737hx1;
        this.f927o = strE;
        this.p = arrayList;
        this.m = jElapsedRealtime;
        this.q = 2;
        objN = zy0.n(c2127lx0, this);
        if (objN == enumC1706hi) {
            return enumC1706hi;
        }
        c1737hx0 = c1737hx1;
        str = strE;
        c3421zK = new C3421zK();
        while (r1.hasNext()) {
            iOptInt = jSONObject.optInt("episodeNumber", 0);
            if (iOptInt > 0) {
                String strOptString2 = jSONObject.optString("programContentId");
                c3421zK.add(new C0456Gq("xuper-episode:" + c1737hx0.a + ":" + iOptInt + ":" + strOptString2, iOptInt, AbstractC1674hK.n(iOptInt, "Episodio "), null, str, null, null, 104));
            }
        }
        C3421zK c3421zKH2 = AbstractC2506pt.h(c3421zK);
        hashSet = new HashSet();
        arrayList2 = new ArrayList();
        listIterator = c3421zKH2.listIterator(0);
        while (true) {
            c3324yK = (C3324yK) listIterator;
            if (c3324yK.hasNext()) {
                List listR1 = AbstractC0911Ye.r0(arrayList2, new C1749i30(12));
                listR1.size();
                arrayList.size();
                SystemClock.elapsedRealtime();
                return listR1;
            }
            next = c3324yK.next();
            if (hashSet.add(new Integer(((C0456Gq) next).b))) {
                arrayList2.add(next);
            }
        }
    }
}
