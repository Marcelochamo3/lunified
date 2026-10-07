package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.do0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1327do0 extends Ph0 implements InterfaceC0775Sy {
    public JSONObject m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f745o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1327do0(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.p = str;
        this.q = str2;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1327do0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C1327do0 c1327do0 = new C1327do0(this.p, this.q, interfaceC0473Hh);
        c1327do0.f745o = obj;
        return c1327do0;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b1 A[Catch: Exception -> 0x01bb, TryCatch #0 {Exception -> 0x01bb, blocks: (B:6:0x001b, B:22:0x0096, B:24:0x009f, B:25:0x00ab, B:27:0x00b1, B:36:0x00e5, B:37:0x00e9, B:39:0x00ef, B:41:0x0111, B:43:0x011e, B:46:0x012c, B:47:0x0172, B:30:0x00c1, B:31:0x00d3, B:33:0x00d7, B:35:0x00e1), top: B:51:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c1 A[Catch: Exception -> 0x01bb, TryCatch #0 {Exception -> 0x01bb, blocks: (B:6:0x001b, B:22:0x0096, B:24:0x009f, B:25:0x00ab, B:27:0x00b1, B:36:0x00e5, B:37:0x00e9, B:39:0x00ef, B:41:0x0111, B:43:0x011e, B:46:0x012c, B:47:0x0172, B:30:0x00c1, B:31:0x00d3, B:33:0x00d7, B:35:0x00e1), top: B:51:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00d7 A[Catch: Exception -> 0x01bb, TryCatch #0 {Exception -> 0x01bb, blocks: (B:6:0x001b, B:22:0x0096, B:24:0x009f, B:25:0x00ab, B:27:0x00b1, B:36:0x00e5, B:37:0x00e9, B:39:0x00ef, B:41:0x0111, B:43:0x011e, B:46:0x012c, B:47:0x0172, B:30:0x00c1, B:31:0x00d3, B:33:0x00d7, B:35:0x00e1), top: B:51:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ef A[Catch: Exception -> 0x01bb, TryCatch #0 {Exception -> 0x01bb, blocks: (B:6:0x001b, B:22:0x0096, B:24:0x009f, B:25:0x00ab, B:27:0x00b1, B:36:0x00e5, B:37:0x00e9, B:39:0x00ef, B:41:0x0111, B:43:0x011e, B:46:0x012c, B:47:0x0172, B:30:0x00c1, B:31:0x00d3, B:33:0x00d7, B:35:0x00e1), top: B:51:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0111 A[Catch: Exception -> 0x01bb, TryCatch #0 {Exception -> 0x01bb, blocks: (B:6:0x001b, B:22:0x0096, B:24:0x009f, B:25:0x00ab, B:27:0x00b1, B:36:0x00e5, B:37:0x00e9, B:39:0x00ef, B:41:0x0111, B:43:0x011e, B:46:0x012c, B:47:0x0172, B:30:0x00c1, B:31:0x00d3, B:33:0x00d7, B:35:0x00e1), top: B:51:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:57:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.R7
    public final Object r(Object obj) {
        JSONObject jSONObjectX;
        Iterable iterableZ;
        List list;
        Object objB;
        Iterator it;
        JSONArray jSONArrayOptJSONArray;
        ArrayList<JSONObject> arrayList;
        YF it2;
        JSONObject jSONObjectOptJSONObject;
        String strOptString;
        String strOptString2;
        String str = this.q;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        C1233cq c1233cq = C1233cq.l;
        String str2 = this.p;
        if (i == 0) {
            Jp0.O(obj);
            InterfaceC1608gi interfaceC1608gi = (InterfaceC1608gi) this.f745o;
            ArrayList arrayList2 = new ArrayList();
            try {
                C1816io0 c1816io0 = C1816io0.b;
                jSONObjectX = C1816io0.x("/search/" + str2 + "/1.json");
                int iOptInt = jSONObjectX.optInt("total_chunks", 1);
                if (iOptInt > 1) {
                    ZF zf = new ZF(2, iOptInt, 1);
                    ArrayList arrayList3 = new ArrayList(AbstractC1016af.O(zf, 10));
                    YF it3 = zf.iterator();
                    while (it3.n) {
                        arrayList3.add(AbstractC1376eG.c(interfaceC1608gi, AbstractC1910jn.b, 0, new C1230co0(str2, it3.a(), null), 2));
                    }
                    this.f745o = arrayList2;
                    this.m = jSONObjectX;
                    this.n = 1;
                    objB = AbstractC1370eA.b(arrayList3, this);
                    if (objB == enumC1706hi) {
                        return enumC1706hi;
                    }
                    list = arrayList2;
                } else {
                    iterableZ = c1233cq;
                    list = arrayList2;
                }
                it = AbstractC0911Ye.m0(AbstractC2506pt.A(jSONObjectX), iterableZ).iterator();
                while (it.hasNext()) {
                    jSONArrayOptJSONArray = ((JSONObject) it.next()).optJSONArray("data");
                    if (jSONArrayOptJSONArray == null) {
                        arrayList = c1233cq;
                    } else {
                        ZF zfL = U9.L(0, jSONArrayOptJSONArray.length());
                        arrayList = new ArrayList();
                        it2 = zfL.iterator();
                        while (it2.n) {
                            jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(it2.a());
                            if (jSONObjectOptJSONObject != null) {
                                arrayList.add(jSONObjectOptJSONObject);
                            }
                        }
                    }
                    for (JSONObject jSONObject : arrayList) {
                        strOptString = jSONObject.optString("t", "");
                        strOptString2 = jSONObject.optString("to", "");
                        C1816io0 c1816io1 = C1816io0.b;
                        AbstractC1474fG.g(strOptString);
                        if (!AbstractC1119bh0.W(C1816io0.w(strOptString), str, false)) {
                            AbstractC1474fG.g(strOptString2);
                            if (AbstractC1119bh0.W(C1816io0.w(strOptString2), str, false)) {
                            }
                        }
                        if (AbstractC1474fG.b(str2, "movies")) {
                            String str3 = "lumix-movie-" + jSONObject.getLong("id");
                            String strOptString3 = jSONObject.optString("p");
                            AbstractC1474fG.i(strOptString3, "optString(...)");
                            list.add(new C1387eR(str3, strOptString, null, null, null, null, null, null, C1816io0.K(strOptString3), null, null, null, null, null, null, 32508));
                        } else {
                            String str4 = "lumix-series-" + jSONObject.getLong("id");
                            String strOptString4 = jSONObject.optString("p");
                            AbstractC1474fG.i(strOptString4, "optString(...)");
                            list.add(new C2109lo0(str4, strOptString, null, null, null, null, null, null, C1816io0.K(strOptString4), null, null, null, null, null, null, null, 65276));
                        }
                    }
                }
                return list;
            } catch (Exception unused) {
                return arrayList2;
            }
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jSONObjectX = this.m;
        list = (List) this.f745o;
        try {
            Jp0.O(obj);
            objB = obj;
        } catch (Exception unused2) {
            return list;
        }
        iterableZ = AbstractC0911Ye.Z((Iterable) objB);
        it = AbstractC0911Ye.m0(AbstractC2506pt.A(jSONObjectX), iterableZ).iterator();
        while (it.hasNext()) {
            jSONArrayOptJSONArray = ((JSONObject) it.next()).optJSONArray("data");
            if (jSONArrayOptJSONArray == null) {
                arrayList = c1233cq;
            } else {
                ZF zfL2 = U9.L(0, jSONArrayOptJSONArray.length());
                arrayList = new ArrayList();
                it2 = zfL2.iterator();
                while (it2.n) {
                    jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(it2.a());
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(jSONObjectOptJSONObject);
                    }
                }
            }
            while (r5.hasNext()) {
                strOptString = jSONObject.optString("t", "");
                strOptString2 = jSONObject.optString("to", "");
                C1816io0 c1816io2 = C1816io0.b;
                AbstractC1474fG.g(strOptString);
                if (!AbstractC1119bh0.W(C1816io0.w(strOptString), str, false)) {
                    AbstractC1474fG.g(strOptString2);
                    if (AbstractC1119bh0.W(C1816io0.w(strOptString2), str, false)) {
                    }
                }
                if (AbstractC1474fG.b(str2, "movies")) {
                    String str5 = "lumix-movie-" + jSONObject.getLong("id");
                    String strOptString5 = jSONObject.optString("p");
                    AbstractC1474fG.i(strOptString5, "optString(...)");
                    list.add(new C1387eR(str5, strOptString, null, null, null, null, null, null, C1816io0.K(strOptString5), null, null, null, null, null, null, 32508));
                } else {
                    String str6 = "lumix-series-" + jSONObject.getLong("id");
                    String strOptString6 = jSONObject.optString("p");
                    AbstractC1474fG.i(strOptString6, "optString(...)");
                    list.add(new C2109lo0(str6, strOptString, null, null, null, null, null, null, C1816io0.K(strOptString6), null, null, null, null, null, null, null, 65276));
                }
            }
        }
        return list;
    }
}
