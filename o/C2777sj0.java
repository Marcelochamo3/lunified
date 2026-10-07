package o;

import com.skidush.clonex.MyApplication;
import com.skidush.clonex.utils.BlindajeCrypto;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.sj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2777sj0 extends Ph0 implements InterfaceC0412Ey {
    public String m;
    public byte[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C2570qc0 f1032o;
    public int p;
    public int q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2777sj0(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(1, interfaceC0473Hh);
        this.r = str;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        return new C2777sj0(this.r, (InterfaceC0473Hh) obj).r(C2985uq0.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ed A[LOOP:0: B:22:0x00e7->B:24:0x00ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0129 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x012a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0137 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:38:0x016c  */
    /* JADX WARN: Code duplicated, block: B:40:0x016f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0175  */
    /* JADX WARN: Code duplicated, block: B:47:0x0184  */
    /* JADX WARN: Code duplicated, block: B:48:0x0187  */
    /* JADX WARN: Code duplicated, block: B:51:0x01aa  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0154 -> B:8:0x0027). Please report as a decompilation issue!!! */
    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        String strB;
        byte[] bytes;
        Object objF;
        C2570qc0 c2570qc0;
        String str;
        int i;
        String str2;
        byte[] bArr;
        EnumC1706hi enumC1706hi;
        int i2;
        Object objC;
        Wg0 wg0;
        String str3;
        int i3;
        String str4;
        int i4;
        Object objF2;
        C0560Kq c0560Kq;
        EnumC1706hi enumC1706hi2 = EnumC1706hi.l;
        int i5 = this.q;
        int i6 = 0;
        String str5 = this.r;
        if (i5 != 0) {
            if (i5 == 1) {
                bytes = this.n;
                strB = this.m;
                Jp0.O(obj);
                objF = obj;
            } else if (i5 == 2) {
                i2 = this.p;
                C2570qc0 c2570qc1 = this.f1032o;
                byte[] bArr2 = this.n;
                str = this.m;
                Jp0.O(obj);
                objC = obj;
                enumC1706hi = enumC1706hi2;
                str2 = str5;
                c2570qc0 = c2570qc1;
                bArr = bArr2;
                wg0 = (Wg0) objC;
                if (wg0.a == 401 || i2 != 0) {
                    String str6 = wg0.b;
                    str3 = AbstractC1899jh0.O(str6) ^ true ? str6 : null;
                    if (str3 == null) {
                        throw new Exception("Sin respuesta de sesión Tigo");
                    }
                    i3 = wg0.a;
                    if (200 > i3 && i3 < 300) {
                        return BlindajeCrypto.a.e(c2570qc0.a, str3);
                    }
                    if (str2 == null) {
                        str4 = "obtener la sesión";
                    } else {
                        str4 = "habilitar el evento";
                    }
                    throw new Exception("No se pudo " + str4 + " Tigo (HTTP " + i3 + ")");
                }
                i4 = i2 + 1;
                Ec0 ec0 = Ec0.a;
                MyApplication myApplication = MyApplication.l;
                MyApplication myApplicationS = Jp0.s();
                this.m = str;
                this.n = bArr;
                this.f1032o = null;
                this.p = i4;
                this.q = 3;
                objF2 = Ec0.f(myApplicationS, true, false, this, 4);
                if (objF2 == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i4 = this.p;
                bArr = this.n;
                String str7 = this.m;
                Jp0.O(obj);
                objF2 = obj;
                enumC1706hi = enumC1706hi2;
                str2 = str5;
                str = str7;
            }
            byte[] bArr3 = bArr;
            i = i4;
            bytes = bArr3;
            c2570qc0 = (C2570qc0) objF2;
            enumC1706hi2 = enumC1706hi;
            str5 = str2;
            i6 = 0;
            BlindajeCrypto blindajeCrypto = BlindajeCrypto.a;
            LinkedHashMap linkedHashMapL = BlindajeCrypto.l(str, bytes, c2570qc0.a);
            c0560Kq = new C0560Kq();
            c0560Kq.u(C3068vj0.a);
            int length = bytes.length;
            EnumC1706hi enumC1706hi3 = enumC1706hi2;
            str2 = str5;
            Mr0.c(bytes.length, i6, length);
            c0560Kq.m("POST", new C2243n70(length, 0, null, bytes));
            for (Map.Entry entry : linkedHashMapL.entrySet()) {
                c0560Kq.j((String) entry.getKey(), (String) entry.getValue());
            }
            C1791ib0 c1791ib0 = C1791ib0.a;
            A50 a50C = C1791ib0.e().c(c0560Kq.c());
            this.m = str;
            this.n = bytes;
            this.f1032o = c2570qc0;
            this.p = i;
            this.q = 2;
            objC = Jp0.c(a50C, Long.MAX_VALUE, this);
            enumC1706hi = enumC1706hi3;
            if (objC == enumC1706hi) {
                return enumC1706hi;
            }
            int i7 = i;
            bArr = bytes;
            i2 = i7;
            wg0 = (Wg0) objC;
            if (wg0.a == 401) {
            }
            String str8 = wg0.b;
            if (AbstractC1899jh0.O(str8) ^ true) {
            }
            if (str3 == null) {
                throw new Exception("Sin respuesta de sesión Tigo");
            }
            i3 = wg0.a;
            if (200 > i3) {
            }
            if (str2 == null) {
                str4 = "obtener la sesión";
            } else {
                str4 = "habilitar el evento";
            }
            throw new Exception("No se pudo " + str4 + " Tigo (HTTP " + i3 + ")");
        }
        Jp0.O(obj);
        String str9 = C3068vj0.a;
        AbstractC1474fG.j(str9, "<this>");
        C2349oE c2349oE = new C2349oE();
        c2349oE.g(null, str9);
        strB = c2349oE.b().b();
        if (str5 != null) {
            String string = new JSONObject().put("content_view", str5).toString();
            AbstractC1474fG.i(string, "toString(...)");
            bytes = string.getBytes(AbstractC1305dd.a);
            AbstractC1474fG.i(bytes, "getBytes(...)");
        } else {
            bytes = new byte[0];
        }
        Ec0 ec1 = Ec0.a;
        MyApplication myApplication2 = MyApplication.l;
        MyApplication myApplicationS2 = Jp0.s();
        this.m = strB;
        this.n = bytes;
        this.q = 1;
        objF = Ec0.f(myApplicationS2, false, false, this, 6);
        if (objF == enumC1706hi2) {
            return enumC1706hi2;
        }
        c2570qc0 = (C2570qc0) objF;
        str = strB;
        i = 0;
        BlindajeCrypto blindajeCrypto2 = BlindajeCrypto.a;
        LinkedHashMap linkedHashMapL2 = BlindajeCrypto.l(str, bytes, c2570qc0.a);
        c0560Kq = new C0560Kq();
        c0560Kq.u(C3068vj0.a);
        int length2 = bytes.length;
        EnumC1706hi enumC1706hi4 = enumC1706hi2;
        str2 = str5;
        Mr0.c(bytes.length, i6, length2);
        c0560Kq.m("POST", new C2243n70(length2, 0, null, bytes));
        while (r1.hasNext()) {
            c0560Kq.j((String) entry.getKey(), (String) entry.getValue());
        }
        C1791ib0 c1791ib1 = C1791ib0.a;
        A50 a50C2 = C1791ib0.e().c(c0560Kq.c());
        this.m = str;
        this.n = bytes;
        this.f1032o = c2570qc0;
        this.p = i;
        this.q = 2;
        objC = Jp0.c(a50C2, Long.MAX_VALUE, this);
        enumC1706hi = enumC1706hi4;
        if (objC == enumC1706hi) {
            return enumC1706hi;
        }
        int i8 = i;
        bArr = bytes;
        i2 = i8;
        wg0 = (Wg0) objC;
        if (wg0.a == 401) {
        }
        String str10 = wg0.b;
        if (AbstractC1899jh0.O(str10) ^ true) {
        }
        if (str3 == null) {
            throw new Exception("Sin respuesta de sesión Tigo");
        }
        i3 = wg0.a;
        if (200 > i3) {
        }
        if (str2 == null) {
            str4 = "obtener la sesión";
        } else {
            str4 = "habilitar el evento";
        }
        throw new Exception("No se pudo " + str4 + " Tigo (HTTP " + i3 + ")");
    }
}
