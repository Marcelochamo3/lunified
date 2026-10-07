package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.tx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2902tx0 extends Ph0 implements InterfaceC0775Sy {
    public String m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f1050o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2902tx0(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f1050o = str;
        this.p = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2902tx0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2902tx0(this.f1050o, this.p, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x019a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x01c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:? A[LOOP:2: B:93:0x01cd->B:118:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0187  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d3  */
    @Override // o.R7
    public final Object r(Object obj) throws JSONException {
        String str;
        List list;
        Object objN;
        Integer numJ;
        String str2;
        Integer numJ2;
        HashSet hashSet;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        C2420oz c2420oz;
        String str3;
        Cd0 cd0S;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        String str4 = this.f1050o;
        Object obj2 = null;
        if (i != 0) {
            if (i == 1) {
                Jp0.O(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = this.m;
                Jp0.O(obj);
                objN = obj;
            }
            list = (List) objN;
            hashSet = new HashSet();
            arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (hashSet.add(((JSONObject) obj3).optString("contentId"))) {
                    arrayList.add(obj3);
                }
            }
            List listR0 = AbstractC0911Ye.r0(arrayList, Lx0.r);
            Lx0 lx0 = Lx0.b;
            arrayList2 = new ArrayList();
            it = listR0.iterator();
            while (it.hasNext()) {
                cd0S = Lx0.S((JSONObject) it.next());
                if (cd0S != null) {
                    arrayList2.add(cd0S);
                }
            }
            for (Object obj4 : Lx0.t()) {
                if (AbstractC1474fG.b(((C2420oz) obj4).a, str4)) {
                    obj2 = obj4;
                    break;
                }
            }
            c2420oz = (C2420oz) obj2;
            if (c2420oz != null && (str3 = c2420oz.b) != null) {
                str = str3;
            }
            return new C2420oz(str4, str, arrayList2);
        }
        Jp0.O(obj);
        Lx0 lx1 = Lx0.b;
        this.n = 1;
        if (lx1.A(this) == enumC1706hi) {
            return enumC1706hi;
        }
        boolean zU = AbstractC1899jh0.U(str4, "xuper-section|", false);
        int i2 = this.p;
        if (zU) {
            List listS0 = AbstractC1119bh0.s0(str4, new char[]{'|'}, 3, 2);
            String str5 = (String) AbstractC0911Ye.e0(1, listS0);
            if (str5 == null || (numJ2 = AbstractC1802ih0.J(str5)) == null) {
                String str6 = (String) AbstractC0911Ye.e0(2, listS0);
                return new C2420oz(str4, str6 != null ? str6 : "Contenido");
            }
            int iIntValue = numJ2.intValue();
            String str7 = (String) AbstractC0911Ye.e0(2, listS0);
            str2 = str7 != null ? str7 : "";
            String str8 = AbstractC1899jh0.O(str2) ? "Contenido" : str2;
            Lx0 lx2 = Lx0.b;
            List listL = Lx0.L(iIntValue, i2, 100);
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = listL.iterator();
            while (it2.hasNext()) {
                Cd0 cd0S2 = Lx0.S((JSONObject) it2.next());
                if (cd0S2 != null) {
                    arrayList3.add(cd0S2);
                }
            }
            return new C2420oz(str4, str8, arrayList3);
        }
        if (AbstractC1899jh0.U(str4, "xuper-explore|", false)) {
            List listS1 = AbstractC1119bh0.s0(str4, new char[]{'|'}, 3, 2);
            String str9 = (String) AbstractC0911Ye.e0(1, listS1);
            if (str9 == null || (numJ = AbstractC1802ih0.J(str9)) == null) {
                String str10 = (String) AbstractC0911Ye.e0(2, listS1);
                return new C2420oz(str4, str10 != null ? str10 : "Explorar");
            }
            int iIntValue2 = numJ.intValue();
            String str11 = (String) AbstractC0911Ye.e0(2, listS1);
            str2 = str11 != null ? str11 : "";
            String str12 = AbstractC1899jh0.O(str2) ? "Explorar" : str2;
            Lx0 lx3 = Lx0.b;
            List listX = Lx0.x(iIntValue2, i2, 100);
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = listX.iterator();
            while (it3.hasNext()) {
                Cd0 cd0S3 = Lx0.S((JSONObject) it3.next());
                if (cd0S3 != null) {
                    arrayList4.add(cd0S3);
                }
            }
            return new C2420oz(str4, str12, arrayList4);
        }
        List listS2 = AbstractC1119bh0.s0(str4, new char[]{'|'}, 3, 2);
        if (listS2.size() != 3) {
            return new C2420oz(str4, str4);
        }
        String str13 = (String) listS2.get(0);
        String str14 = (String) listS2.get(1);
        str = (String) listS2.get(2);
        if (AbstractC1474fG.b(str13, "both")) {
            C2805sx0 c2805sx0 = new C2805sx0(i2, str14, str, null);
            this.m = str;
            this.n = 2;
            objN = zy0.n(c2805sx0, this);
            if (objN == enumC1706hi) {
                return enumC1706hi;
            }
            list = (List) objN;
        } else {
            Lx0 lx4 = Lx0.b;
            list = Lx0.C(this.p, 100, str13, str14, str, null).a;
        }
        hashSet = new HashSet();
        arrayList = new ArrayList();
        while (r2.hasNext()) {
            if (hashSet.add(((JSONObject) obj3).optString("contentId"))) {
                arrayList.add(obj3);
            }
        }
        List listR1 = AbstractC0911Ye.r0(arrayList, Lx0.r);
        Lx0 lx5 = Lx0.b;
        arrayList2 = new ArrayList();
        it = listR1.iterator();
        while (it.hasNext()) {
            cd0S = Lx0.S((JSONObject) it.next());
            if (cd0S != null) {
                arrayList2.add(cd0S);
            }
        }
        while (r2.hasNext()) {
            if (AbstractC1474fG.b(((C2420oz) obj4).a, str4)) {
                obj2 = obj4;
                break;
            }
        }
        c2420oz = (C2420oz) obj2;
        if (c2420oz != null) {
            str = str3;
        }
        return new C2420oz(str4, str, arrayList2);
    }
}
