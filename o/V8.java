package o;

import com.skidush.clonex.MyApplication;
import com.skidush.clonex.utils.BlindajeCrypto;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class V8 extends Ph0 implements InterfaceC0412Ey {
    public MyApplication m;
    public C2570qc0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f566o;
    public int p;

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        return new V8(1, (InterfaceC0473Hh) obj).r(C2985uq0.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a4 A[LOOP:0: B:17:0x009e->B:19:0x00a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x00db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x0112  */
    /* JADX WARN: Code duplicated, block: B:36:0x0122  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0100 -> B:31:0x0105). Please report as a decompilation issue!!! */
    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        MyApplication myApplicationS;
        Object objF;
        C2570qc0 c2570qc0;
        int i;
        Object objC;
        MyApplication myApplication;
        C2570qc0 c2570qc1;
        int i2;
        Wg0 wg0;
        int i3;
        Object objF2;
        int i4;
        C0560Kq c0560Kq;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i5 = this.p;
        if (i5 != 0) {
            if (i5 == 1) {
                myApplicationS = this.m;
                Jp0.O(obj);
                objF = obj;
            } else if (i5 == 2) {
                i2 = this.f566o;
                c2570qc1 = this.n;
                myApplication = this.m;
                Jp0.O(obj);
                objC = obj;
                wg0 = (Wg0) objC;
                i3 = wg0.a;
                if (i3 == 401 || i2 != 0) {
                    if (i3 == 200) {
                        return new JSONObject(BlindajeCrypto.a.e(c2570qc1.a, wg0.b));
                    }
                    throw new Exception(AbstractC1674hK.p("No se pudo validar el contenido (HTTP ", i3, ")"));
                }
                int i6 = i2 + 1;
                Ec0 ec0 = Ec0.a;
                this.m = myApplication;
                this.n = null;
                this.f566o = i6;
                this.p = 3;
                objF2 = Ec0.f(myApplication, true, false, this, 4);
                if (objF2 == enumC1706hi) {
                    return enumC1706hi;
                }
                MyApplication myApplication2 = myApplication;
                i4 = i6;
                myApplicationS = myApplication2;
            } else {
                if (i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = this.f566o;
                MyApplication myApplication3 = this.m;
                Jp0.O(obj);
                i4 = i7;
                myApplicationS = myApplication3;
                objF2 = obj;
            }
            int i8 = i4;
            c2570qc0 = (C2570qc0) objF2;
            i = i8;
            byte[] bArr = new byte[0];
            BlindajeCrypto blindajeCrypto = BlindajeCrypto.a;
            long j = c2570qc0.a;
            String str = W8.a;
            LinkedHashMap linkedHashMapL = BlindajeCrypto.l(str, bArr, j);
            c0560Kq = new C0560Kq();
            c0560Kq.u(AbstractC1360e5.a + str);
            Pattern pattern = TP.e;
            TP tpO = AbstractC1474fG.o("application/json");
            long j2 = (long) 0;
            Mr0.c(j2, j2, j2);
            c0560Kq.m("POST", new C2243n70(0, 0, tpO, bArr));
            for (Map.Entry entry : linkedHashMapL.entrySet()) {
                c0560Kq.j((String) entry.getKey(), (String) entry.getValue());
            }
            C1791ib0 c1791ib0 = C1791ib0.a;
            A50 a50C = C1791ib0.e().c(c0560Kq.c());
            this.m = myApplicationS;
            this.n = c2570qc0;
            this.f566o = i;
            this.p = 2;
            objC = Jp0.c(a50C, Long.MAX_VALUE, this);
            if (objC == enumC1706hi) {
                return enumC1706hi;
            }
            C2570qc0 c2570qc2 = c2570qc0;
            myApplication = myApplicationS;
            i2 = i;
            c2570qc1 = c2570qc2;
            wg0 = (Wg0) objC;
            i3 = wg0.a;
            if (i3 == 401) {
            }
            if (i3 == 200) {
                return new JSONObject(BlindajeCrypto.a.e(c2570qc1.a, wg0.b));
            }
            throw new Exception(AbstractC1674hK.p("No se pudo validar el contenido (HTTP ", i3, ")"));
        }
        Jp0.O(obj);
        MyApplication myApplication4 = MyApplication.l;
        myApplicationS = Jp0.s();
        Ec0 ec1 = Ec0.a;
        this.m = myApplicationS;
        this.p = 1;
        objF = Ec0.f(myApplicationS, false, false, this, 6);
        if (objF == enumC1706hi) {
            return enumC1706hi;
        }
        c2570qc0 = (C2570qc0) objF;
        i = 0;
        byte[] bArr2 = new byte[0];
        BlindajeCrypto blindajeCrypto2 = BlindajeCrypto.a;
        long j3 = c2570qc0.a;
        String str2 = W8.a;
        LinkedHashMap linkedHashMapL2 = BlindajeCrypto.l(str2, bArr2, j3);
        c0560Kq = new C0560Kq();
        c0560Kq.u(AbstractC1360e5.a + str2);
        Pattern pattern2 = TP.e;
        TP tpO2 = AbstractC1474fG.o("application/json");
        long j4 = (long) 0;
        Mr0.c(j4, j4, j4);
        c0560Kq.m("POST", new C2243n70(0, 0, tpO2, bArr2));
        while (r9.hasNext()) {
            c0560Kq.j((String) entry.getKey(), (String) entry.getValue());
        }
        C1791ib0 c1791ib1 = C1791ib0.a;
        A50 a50C2 = C1791ib0.e().c(c0560Kq.c());
        this.m = myApplicationS;
        this.n = c2570qc0;
        this.f566o = i;
        this.p = 2;
        objC = Jp0.c(a50C2, Long.MAX_VALUE, this);
        if (objC == enumC1706hi) {
            return enumC1706hi;
        }
        C2570qc0 c2570qc3 = c2570qc0;
        myApplication = myApplicationS;
        i2 = i;
        c2570qc1 = c2570qc3;
        wg0 = (Wg0) objC;
        i3 = wg0.a;
        if (i3 == 401) {
        }
        if (i3 == 200) {
            return new JSONObject(BlindajeCrypto.a.e(c2570qc1.a, wg0.b));
        }
        throw new Exception(AbstractC1674hK.p("No se pudo validar el contenido (HTTP ", i3, ")"));
    }
}
