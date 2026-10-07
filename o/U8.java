package o;

import com.skidush.clonex.utils.BlindajeCrypto;

/* JADX INFO: loaded from: classes.dex */
public final class U8 extends Ph0 implements InterfaceC0775Sy {
    public VS m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f550o;
    public final /* synthetic */ boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U8(boolean z, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.p = z;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((U8) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new U8(this.p, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0076 A[Catch: all -> 0x0015, TRY_ENTER, TryCatch #0 {all -> 0x0015, blocks: (B:7:0x0011, B:28:0x0067, B:33:0x0076, B:34:0x0081), top: B:40:0x0011 }] */
    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        boolean z;
        VS vs;
        VS vs2;
        Throwable th;
        VS vs3;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.f550o;
        C2985uq0 c2985uq0 = C2985uq0.a;
        try {
            if (i == 0) {
                Jp0.O(obj);
                boolean zC = BlindajeCrypto.a.c();
                z = this.p;
                if (zC && !z) {
                    return c2985uq0;
                }
                YS ys = W8.b;
                this.m = ys;
                this.n = z;
                this.f550o = 1;
                Object objD = ys.d(null, this);
                vs = ys;
                if (objD == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vs2 = this.m;
                    try {
                        Jp0.O(obj);
                        vs2 = vs2;
                        if (BlindajeCrypto.a.c()) {
                            throw new IllegalStateException("No se pudo cargar el contenido protegido".toString());
                        }
                        vs3 = vs2;
                        ((YS) vs3).e(null);
                        return c2985uq0;
                    } catch (Throwable th2) {
                        th = th2;
                        ((YS) vs2).e(null);
                        throw th;
                    }
                }
                z = this.n;
                VS vs4 = this.m;
                Jp0.O(obj);
                vs = vs4;
            }
            vs3 = vs;
            if (!BlindajeCrypto.a.c() || z) {
                String str = W8.a;
                this.m = vs;
                this.f550o = 2;
                if (Ec0.a.n(new V8(1, null), this) == enumC1706hi) {
                    return enumC1706hi;
                }
                vs2 = vs;
                if (BlindajeCrypto.a.c()) {
                    throw new IllegalStateException("No se pudo cargar el contenido protegido".toString());
                }
                vs3 = vs2;
            }
            ((YS) vs3).e(null);
            return c2985uq0;
        } catch (Throwable th3) {
            vs2 = vs;
            th = th3;
            ((YS) vs2).e(null);
            throw th;
        }
    }
}
