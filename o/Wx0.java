package o;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Wx0 extends Ph0 implements InterfaceC0775Sy {
    public String m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f609o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wx0(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f609o = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Wx0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Wx0(this.f609o, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:31:0x0078  */
    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d5  */
    /* JADX WARN: Instruction removed from duplicated block: B:21:0x005f, please report this as an issue */
    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        Object objQ;
        String str;
        Ox0 ox0;
        String strH;
        Integer numJ;
        Rx0 rx0W;
        Integer numJ2;
        int iIntValue;
        ArrayList arrayList;
        String strE;
        Integer numJ3;
        int iIntValue2;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        if (i != 0) {
            if (i == 1) {
                Jp0.O(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = this.m;
                Jp0.O(obj);
                objQ = obj;
            }
            ox0 = (Ox0) ((Mx0) objQ).c.get(str);
            if (ox0 != null) {
                throw new IllegalArgumentException("Canal no disponible");
            }
            C1152by0 c1152by0 = C1152by0.b;
            strH = com.skidush.clonex.bridge.N7.a.h(13);
            if (strH != null) {
                if (!(!AbstractC1899jh0.O(strH))) {
                    strH = null;
                }
                if (strH != null) {
                    numJ = AbstractC1802ih0.J(strH);
                    if (numJ != null) {
                        if (numJ.intValue() <= 0) {
                            numJ = null;
                        }
                        if (numJ != null) {
                            rx0W = C1152by0.w(String.valueOf(numJ.intValue()));
                            numJ2 = AbstractC1802ih0.J(ox0.e);
                            if (numJ2 != null) {
                                iIntValue = numJ2.intValue();
                            } else {
                                iIntValue = 1;
                            }
                            List list = ox0.h;
                            arrayList = new ArrayList();
                            for (Object obj2 : list) {
                                JSONObject jSONObject = (JSONObject) obj2;
                                C1152by0 c1152by1 = C1152by0.b;
                                String strOptString = jSONObject.optString("quality");
                                AbstractC1474fG.i(strOptString, "optString(...)");
                                numJ3 = AbstractC1802ih0.J(strOptString);
                                if (numJ3 != null) {
                                    iIntValue2 = numJ3.intValue();
                                } else {
                                    iIntValue2 = 1;
                                }
                                if (iIntValue2 != iIntValue && rx0W.d.contains(jSONObject.optString("tag"))) {
                                    arrayList.add(obj2);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                throw new IllegalStateException(AbstractC1701hf0.d(ox0.b, " no tiene una fuente compatible"));
                            }
                            C1152by0 c1152by2 = C1152by0.b;
                            try {
                                ReentrantLock reentrantLock = Uj0.a;
                                strE = Uj0.e(rx0W.b, rx0W.c, ox0.a, ox0.b, ox0.g, arrayList);
                            } catch (Exception e) {
                                if (e instanceof CancellationException) {
                                    throw e;
                                }
                                synchronized (C1152by0.g) {
                                    C1152by0.h = null;
                                    String strH2 = com.skidush.clonex.bridge.N7.a.h(13);
                                    if (strH2 != null) {
                                        if (!(true ^ AbstractC1899jh0.O(strH2))) {
                                            strH2 = null;
                                        }
                                        if (strH2 != null) {
                                            Integer numJ4 = AbstractC1802ih0.J(strH2);
                                            if (numJ4 != null) {
                                                Integer num = numJ4.intValue() > 0 ? numJ4 : null;
                                                if (num != null) {
                                                    Rx0 rx0W2 = C1152by0.w(String.valueOf(num.intValue()));
                                                    ReentrantLock reentrantLock2 = Uj0.a;
                                                    strE = Uj0.e(rx0W2.b, rx0W2.c, ox0.a, ox0.b, ox0.g, arrayList);
                                                }
                                            }
                                            throw new IllegalStateException("Configuración protegida no válida");
                                        }
                                    }
                                    throw new IllegalStateException("Configuración protegida no disponible");
                                }
                            }
                            String str2 = strE;
                            JSONObject jSONObject2 = (JSONObject) AbstractC0911Ye.b0(arrayList);
                            arrayList.size();
                            C1152by0 c1152by3 = C1152by0.b;
                            C1152by0.v(jSONObject2);
                            AbstractC1899jh0.O(jSONObject2.optString("AVFormat"));
                            AbstractC1899jh0.O(jSONObject2.optString("cdnType"));
                            Js0 js0 = new Js0(str2, (Map) null, (String) null, (String) null, (String) null, (byte[]) null, ox0.b, (String) null, (String) null, (List) null, true, 3006);
                            Ds0 ds0 = new Ds0(AbstractC1701hf0.t("xuper-ranger:", ox0.a), "Servidor recomendado · ".concat(C1152by0.v(jSONObject2)), str2, null, 56);
                            ds0.r = js0;
                            return AbstractC2506pt.A(ds0);
                        }
                    }
                    throw new IllegalStateException("Configuración protegida no válida");
                }
            }
            throw new IllegalStateException("Configuración protegida no disponible");
        }
        Jp0.O(obj);
        Lx0 lx0 = Lx0.b;
        this.n = 1;
        if (lx0.A(this) == enumC1706hi) {
            return enumC1706hi;
        }
        String strL0 = AbstractC1119bh0.l0(this.f609o, "xuper-live:");
        C1152by0 c1152by4 = C1152by0.b;
        this.m = strL0;
        this.n = 2;
        objQ = C1152by0.q(c1152by4, this);
        if (objQ == enumC1706hi) {
            return enumC1706hi;
        }
        str = strL0;
        ox0 = (Ox0) ((Mx0) objQ).c.get(str);
        if (ox0 != null) {
            throw new IllegalArgumentException("Canal no disponible");
        }
        C1152by0 c1152by5 = C1152by0.b;
        strH = com.skidush.clonex.bridge.N7.a.h(13);
        if (strH != null) {
            if (!(!AbstractC1899jh0.O(strH))) {
                strH = null;
            }
            if (strH != null) {
                numJ = AbstractC1802ih0.J(strH);
                if (numJ != null) {
                    if (numJ.intValue() <= 0) {
                        numJ = null;
                    }
                    if (numJ != null) {
                        rx0W = C1152by0.w(String.valueOf(numJ.intValue()));
                        numJ2 = AbstractC1802ih0.J(ox0.e);
                        if (numJ2 != null) {
                            iIntValue = numJ2.intValue();
                        } else {
                            iIntValue = 1;
                        }
                        List list2 = ox0.h;
                        arrayList = new ArrayList();
                        while (r7.hasNext()) {
                            JSONObject jSONObject3 = (JSONObject) obj2;
                            C1152by0 c1152by6 = C1152by0.b;
                            String strOptString2 = jSONObject3.optString("quality");
                            AbstractC1474fG.i(strOptString2, "optString(...)");
                            numJ3 = AbstractC1802ih0.J(strOptString2);
                            if (numJ3 != null) {
                                iIntValue2 = numJ3.intValue();
                            } else {
                                iIntValue2 = 1;
                            }
                            if (iIntValue2 != iIntValue) {
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            throw new IllegalStateException(AbstractC1701hf0.d(ox0.b, " no tiene una fuente compatible"));
                        }
                        C1152by0 c1152by7 = C1152by0.b;
                        ReentrantLock reentrantLock3 = Uj0.a;
                        strE = Uj0.e(rx0W.b, rx0W.c, ox0.a, ox0.b, ox0.g, arrayList);
                        String str3 = strE;
                        JSONObject jSONObject4 = (JSONObject) AbstractC0911Ye.b0(arrayList);
                        arrayList.size();
                        C1152by0 c1152by8 = C1152by0.b;
                        C1152by0.v(jSONObject4);
                        AbstractC1899jh0.O(jSONObject4.optString("AVFormat"));
                        AbstractC1899jh0.O(jSONObject4.optString("cdnType"));
                        Js0 js1 = new Js0(str3, (Map) null, (String) null, (String) null, (String) null, (byte[]) null, ox0.b, (String) null, (String) null, (List) null, true, 3006);
                        Ds0 ds1 = new Ds0(AbstractC1701hf0.t("xuper-ranger:", ox0.a), "Servidor recomendado · ".concat(C1152by0.v(jSONObject4)), str3, null, 56);
                        ds1.r = js1;
                        return AbstractC2506pt.A(ds1);
                    }
                }
                throw new IllegalStateException("Configuración protegida no válida");
            }
        }
        throw new IllegalStateException("Configuración protegida no disponible");
    }
}
