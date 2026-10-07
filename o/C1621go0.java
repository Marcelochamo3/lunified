package o;

import android.content.Context;
import com.skidush.clonex.MyApplication;
import com.skidush.clonex.utils.BlindajeCrypto;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.go0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1621go0 extends Ph0 implements InterfaceC0412Ey {
    public Context m;
    public IF n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public IF f799o;
    public int p;
    public int q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ InterfaceC1608gi s;
    public final /* synthetic */ String t;
    public final /* synthetic */ byte[] u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1621go0(boolean z, InterfaceC1608gi interfaceC1608gi, String str, byte[] bArr, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        super(1, interfaceC0473Hh);
        this.r = z;
        this.s = interfaceC1608gi;
        this.t = str;
        this.u = bArr;
        this.v = str2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object w(IF r6, String str, byte[] bArr, String str2, OV ov, InterfaceC0473Hh interfaceC0473Hh) {
        C1425eo0 c1425eo0;
        if (interfaceC0473Hh instanceof C1425eo0) {
            c1425eo0 = (C1425eo0) interfaceC0473Hh;
            int i = c1425eo0.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1425eo0.m = i - Integer.MIN_VALUE;
            } else {
                c1425eo0 = new C1425eo0(interfaceC0473Hh);
            }
        } else {
            c1425eo0 = new C1425eo0(interfaceC0473Hh);
        }
        Object objC = c1425eo0.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c1425eo0.m;
        if (i2 == 0) {
            Jp0.O(objC);
            BlindajeCrypto blindajeCrypto = BlindajeCrypto.a;
            LinkedHashMap linkedHashMapL = BlindajeCrypto.l(str, bArr, ((C2570qc0) r6.m).a);
            C0560Kq c0560Kq = new C0560Kq();
            c0560Kq.u(str2);
            Pattern pattern = TP.e;
            c0560Kq.m("POST", C2743sL.o(AbstractC1474fG.o("application/json"), bArr));
            c0560Kq.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)");
            for (Map.Entry entry : linkedHashMapL.entrySet()) {
                c0560Kq.j((String) entry.getKey(), (String) entry.getValue());
            }
            A50 a50C = ov.c(c0560Kq.c());
            c1425eo0.m = 1;
            objC = Jp0.c(a50C, Long.MAX_VALUE, c1425eo0);
            if (objC == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objC);
        }
        Wg0 wg0 = (Wg0) objC;
        if (wg0.a != 200 || (AbstractC1474fG.b(wg0.c, "2") && !AbstractC1899jh0.O(wg0.b))) {
            return wg0;
        }
        throw new IOException("La API no devolvió un sobre de catálogo válido");
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        byte[] bArr = this.u;
        String str = this.v;
        return new C1621go0(this.r, this.s, this.t, bArr, str, (InterfaceC0473Hh) obj).r(C2985uq0.a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:38:0x0125 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0126  */
    /* JADX WARN: Code duplicated, block: B:41:0x012b  */
    /* JADX WARN: Code duplicated, block: B:43:0x014a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x014b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0157 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x0182  */
    /* JADX WARN: Code duplicated, block: B:58:0x0186  */
    /* JADX WARN: Code duplicated, block: B:60:0x018e  */
    /* JADX WARN: Code duplicated, block: B:62:0x019c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0175 -> B:53:0x0177). Please report as a decompilation issue!!! */
    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        IF r0;
        Object objF;
        Context context;
        IF r3;
        IF r15;
        int i;
        int i2;
        Context context2;
        IF r1;
        Object objW;
        Wg0 wg0;
        Object objC;
        Context context3;
        int i3;
        Object objJ;
        Object objW2;
        Context context4;
        IF r24;
        Context context5;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i4 = this.q;
        int i5 = 2;
        boolean z = this.r;
        if (i4 != 0) {
            if (i4 == 1) {
                r0 = this.f799o;
                IF r2 = this.n;
                Context context6 = this.m;
                Jp0.O(obj);
                context = context6;
                r3 = r2;
                objF = obj;
            } else {
                if (i4 == 2) {
                    int i6 = this.p;
                    r1 = this.n;
                    context2 = this.m;
                    Jp0.O(obj);
                    i2 = i6;
                    objW2 = obj;
                    wg0 = (Wg0) objW2;
                    context3 = context2;
                    i3 = wg0.a;
                    if (i3 == 401) {
                    }
                    if (i3 == 200) {
                        return BlindajeCrypto.a.e(((C2570qc0) r1.m).a, wg0.b);
                    }
                    if (i3 == 429) {
                        throw new IOException("Límite de 4 dispositivos activos alcanzado");
                    }
                    throw new IOException(AbstractC1674hK.p("No se pudo cargar el contenido (HTTP ", i3, ")"));
                }
                if (i4 == 3) {
                    int i7 = this.p;
                    r1 = this.n;
                    context2 = this.m;
                    Jp0.O(obj);
                    i2 = i7;
                    objC = obj;
                    wg0 = (Wg0) objC;
                    context3 = context2;
                    i3 = wg0.a;
                    if (i3 == 401) {
                    }
                    if (i3 == 200) {
                        return BlindajeCrypto.a.e(((C2570qc0) r1.m).a, wg0.b);
                    }
                    if (i3 == 429) {
                        throw new IOException("Límite de 4 dispositivos activos alcanzado");
                    }
                    throw new IOException(AbstractC1674hK.p("No se pudo cargar el contenido (HTTP ", i3, ")"));
                }
                if (i4 == 4) {
                    int i8 = this.p;
                    r1 = this.n;
                    context2 = this.m;
                    Jp0.O(obj);
                    i2 = i8;
                    objW = obj;
                    wg0 = (Wg0) objW;
                    context3 = context2;
                    i3 = wg0.a;
                    if (i3 == 401 || i2 != 0) {
                        if (i3 == 200) {
                            return BlindajeCrypto.a.e(((C2570qc0) r1.m).a, wg0.b);
                        }
                        if (i3 == 429) {
                            throw new IOException("Límite de 4 dispositivos activos alcanzado");
                        }
                        throw new IOException(AbstractC1674hK.p("No se pudo cargar el contenido (HTTP ", i3, ")"));
                    }
                    int i9 = i2 + 1;
                    Ec0 ec0 = Ec0.a;
                    this.m = context3;
                    this.n = r1;
                    this.f799o = r1;
                    this.p = i9;
                    this.q = 5;
                    objJ = AbstractC1376eG.J(AbstractC1910jn.b, new C3442zc0(true, z, context3, null), this);
                    if (objJ == enumC1706hi) {
                        return enumC1706hi;
                    }
                    r15 = r1;
                    i = i9;
                } else {
                    if (i4 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i10 = this.p;
                    r1 = this.f799o;
                    IF r4 = this.n;
                    context3 = this.m;
                    Jp0.O(obj);
                    i = i10;
                    r15 = r4;
                    objJ = obj;
                }
            }
            r1.m = objJ;
            context = context3;
            i5 = 2;
            C3084vr0 c3084vr0 = C3084vr0.a;
            if (C3084vr0.s()) {
                C1791ib0 c1791ib0 = C1791ib0.a;
                OV ovE = C1791ib0.e();
                this.m = context;
                this.n = r15;
                this.f799o = null;
                this.p = i;
                this.q = i5;
                IF r5 = r15;
                context5 = context;
                i2 = i;
                objW2 = w(r5, this.t, this.u, this.v, ovE, this);
                if (objW2 == enumC1706hi) {
                    return enumC1706hi;
                }
                context2 = context5;
                r1 = r15;
                wg0 = (Wg0) objW2;
                context3 = context2;
                i3 = wg0.a;
                if (i3 == 401) {
                }
                if (i3 == 200) {
                    return BlindajeCrypto.a.e(((C2570qc0) r1.m).a, wg0.b);
                }
                if (i3 == 429) {
                    throw new IOException("Límite de 4 dispositivos activos alcanzado");
                }
                throw new IOException(AbstractC1674hK.p("No se pudo cargar el contenido (HTTP ", i3, ")"));
            }
            context4 = context;
            i2 = i;
            if (z) {
                C1791ib0 c1791ib1 = C1791ib0.a;
                OV ovE2 = C1791ib0.e();
                this.m = context4;
                this.n = r15;
                this.f799o = null;
                this.p = i2;
                this.q = 4;
                IF r6 = r15;
                objW = w(r6, this.t, this.u, this.v, ovE2, this);
                if (objW == enumC1706hi) {
                    return enumC1706hi;
                }
                context2 = context4;
                r1 = r15;
                wg0 = (Wg0) objW;
                context3 = context2;
                i3 = wg0.a;
                if (i3 == 401) {
                }
                if (i3 == 200) {
                    return BlindajeCrypto.a.e(((C2570qc0) r1.m).a, wg0.b);
                }
                if (i3 == 429) {
                    throw new IOException("Límite de 4 dispositivos activos alcanzado");
                }
                throw new IOException(AbstractC1674hK.p("No se pudo cargar el contenido (HTTP ", i3, ")"));
            }
            C0856Wb c0856Wb = C0856Wb.a;
            InterfaceC0473Hh interfaceC0473Hh = null;
            r24 = r15;
            C1523fo0 c1523fo0 = new C1523fo0(this.s, r24, this.t, this.u, this.v, interfaceC0473Hh, 0);
            C1523fo0 c1523fo1 = new C1523fo0(this.s, r24, this.t, this.u, this.v, interfaceC0473Hh, 1);
            this.m = context4;
            this.n = r24;
            this.f799o = null;
            this.p = i2;
            this.q = 3;
            objC = c0856Wb.c("API de catálogo", true, c1523fo0, c1523fo1, this);
            if (objC == enumC1706hi) {
                return enumC1706hi;
            }
            context2 = context4;
            r1 = r24;
            wg0 = (Wg0) objC;
            context3 = context2;
            i3 = wg0.a;
            if (i3 == 401) {
            }
            if (i3 == 200) {
                return BlindajeCrypto.a.e(((C2570qc0) r1.m).a, wg0.b);
            }
            if (i3 == 429) {
                throw new IOException("Límite de 4 dispositivos activos alcanzado");
            }
            throw new IOException(AbstractC1674hK.p("No se pudo cargar el contenido (HTTP ", i3, ")"));
        }
        Jp0.O(obj);
        C1816io0 c1816io0 = C1816io0.b;
        if (!C1816io0.w) {
            try {
                MyApplication myApplication = MyApplication.l;
                c1816io0.B(Jp0.s());
            } catch (Exception unused) {
            }
        }
        Context context7 = C1816io0.s;
        if (context7 == null) {
            throw new IllegalStateException("TvProvider not initialized - appContext is null");
        }
        r0 = new IF();
        Ec0 ec1 = Ec0.a;
        this.m = context7;
        this.n = r0;
        this.f799o = r0;
        this.q = 1;
        objF = Ec0.f(context7, false, z, this, 2);
        if (objF == enumC1706hi) {
            return enumC1706hi;
        }
        context = context7;
        r3 = r0;
        r0.m = objF;
        r15 = r3;
        i = 0;
        C3084vr0 c3084vr1 = C3084vr0.a;
        if (C3084vr0.s()) {
            C1791ib0 c1791ib2 = C1791ib0.a;
            OV ovE3 = C1791ib0.e();
            this.m = context;
            this.n = r15;
            this.f799o = null;
            this.p = i;
            this.q = i5;
            IF r7 = r15;
            context5 = context;
            i2 = i;
            objW2 = w(r7, this.t, this.u, this.v, ovE3, this);
            if (objW2 == enumC1706hi) {
                return enumC1706hi;
            }
            context2 = context5;
            r1 = r15;
            wg0 = (Wg0) objW2;
            context3 = context2;
            i3 = wg0.a;
            if (i3 == 401) {
            }
            if (i3 == 200) {
                return BlindajeCrypto.a.e(((C2570qc0) r1.m).a, wg0.b);
            }
            if (i3 == 429) {
                throw new IOException("Límite de 4 dispositivos activos alcanzado");
            }
            throw new IOException(AbstractC1674hK.p("No se pudo cargar el contenido (HTTP ", i3, ")"));
        }
        context4 = context;
        i2 = i;
        if (z) {
            C1791ib0 c1791ib3 = C1791ib0.a;
            OV ovE4 = C1791ib0.e();
            this.m = context4;
            this.n = r15;
            this.f799o = null;
            this.p = i2;
            this.q = 4;
            IF r8 = r15;
            objW = w(r8, this.t, this.u, this.v, ovE4, this);
            if (objW == enumC1706hi) {
                return enumC1706hi;
            }
            context2 = context4;
            r1 = r15;
            wg0 = (Wg0) objW;
            context3 = context2;
            i3 = wg0.a;
            if (i3 == 401) {
            }
            if (i3 == 200) {
                return BlindajeCrypto.a.e(((C2570qc0) r1.m).a, wg0.b);
            }
            if (i3 == 429) {
                throw new IOException("Límite de 4 dispositivos activos alcanzado");
            }
            throw new IOException(AbstractC1674hK.p("No se pudo cargar el contenido (HTTP ", i3, ")"));
        }
        C0856Wb c0856Wb2 = C0856Wb.a;
        InterfaceC0473Hh interfaceC0473Hh2 = null;
        r24 = r15;
        C1523fo0 c1523fo2 = new C1523fo0(this.s, r24, this.t, this.u, this.v, interfaceC0473Hh2, 0);
        C1523fo0 c1523fo3 = new C1523fo0(this.s, r24, this.t, this.u, this.v, interfaceC0473Hh2, 1);
        this.m = context4;
        this.n = r24;
        this.f799o = null;
        this.p = i2;
        this.q = 3;
        objC = c0856Wb2.c("API de catálogo", true, c1523fo2, c1523fo3, this);
        if (objC == enumC1706hi) {
            return enumC1706hi;
        }
        context2 = context4;
        r1 = r24;
        wg0 = (Wg0) objC;
        context3 = context2;
        i3 = wg0.a;
        if (i3 == 401) {
        }
        if (i3 == 200) {
            return BlindajeCrypto.a.e(((C2570qc0) r1.m).a, wg0.b);
        }
        if (i3 == 429) {
            throw new IOException("Límite de 4 dispositivos activos alcanzado");
        }
        throw new IOException(AbstractC1674hK.p("No se pudo cargar el contenido (HTTP ", i3, ")"));
    }
}
