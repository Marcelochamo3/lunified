package o;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: o.lF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2059lF extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ C1767iF m;
    public final /* synthetic */ Context n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ OV f892o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2059lF(Context context, InterfaceC0473Hh interfaceC0473Hh, C1767iF c1767iF, OV ov) {
        super(2, interfaceC0473Hh);
        this.m = c1767iF;
        this.n = context;
        this.f892o = ov;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2059lF) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2059lF(this.n, interfaceC0473Hh, this.m, this.f892o);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        Jp0.O(obj);
        C1767iF c1767iF = this.m;
        String strU = AbstractC1701hf0.u("lumix-", c1767iF.b, "-");
        Context context = this.n;
        File fileCreateTempFile = File.createTempFile(strU, ".apk", context.getCacheDir());
        try {
            C0560Kq c0560Kq = new C0560Kq();
            c0560Kq.u(c1767iF.c);
            c0560Kq.d();
            C1855j80 c1855j80G = this.f892o.c(c0560Kq.c()).g();
            try {
                if (!c1855j80G.p()) {
                    throw new IOException("No se pudo descargar la actualización (HTTP " + c1855j80G.f840o + ")");
                }
                AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
                if (abstractC2051l80 == null) {
                    throw new IllegalStateException("Actualización vacía");
                }
                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    InputStream inputStreamA = abstractC2051l80.a();
                    try {
                        byte[] bArr = new byte[C1672hI.a.e];
                        for (int i = inputStreamA.read(bArr); i >= 0; i = inputStreamA.read(bArr)) {
                            fileOutputStream.write(bArr, 0, i);
                        }
                        AbstractC3409z9.g(inputStreamA, null);
                        AbstractC3409z9.g(fileOutputStream, null);
                        AbstractC3409z9.g(c1855j80G, null);
                        C2834tF c2834tF = C2834tF.a;
                        AbstractC1474fG.g(fileCreateTempFile);
                        if (!AbstractC1899jh0.N(C2834tF.c(fileCreateTempFile), c1767iF.d, true)) {
                            throw new SecurityException("La actualización descargada está dañada");
                        }
                        C2834tF.d(context, fileCreateTempFile);
                        return fileCreateTempFile;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC3409z9.g(inputStreamA, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC3409z9.g(fileOutputStream, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    AbstractC3409z9.g(c1855j80G, th5);
                    throw th6;
                }
            }
        } catch (Exception e) {
            fileCreateTempFile.delete();
            throw e;
        }
        fileCreateTempFile.delete();
        throw e;
    }
}
