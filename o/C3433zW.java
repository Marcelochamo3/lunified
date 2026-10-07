package o;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: o.zW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3433zW extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ C3336yW m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3433zW(C3336yW c3336yW, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = c3336yW;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C3433zW) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C3433zW(this.m, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws IOException {
        C2446pE c2446pEB;
        Jp0.O(obj);
        C3336yW c3336yW = this.m;
        String name = new File(c3336yW.S0()).getName();
        AbstractC1474fG.g(name);
        if (!(!AbstractC1899jh0.O(name)) || name.length() > 240 || Lc0.T(".", "..").contains(name)) {
            name = null;
        }
        if (name == null) {
            throw new IllegalArgumentException("Nombre de subtítulo inválido");
        }
        String name2 = new File(name).getName();
        AbstractC1474fG.i(name2, "getName(...)");
        File fileCreateTempFile = File.createTempFile(AbstractC1119bh0.D0(80, AbstractC1119bh0.C0(name2, ".")).concat("-"), ".gz");
        String strO0 = c3336yW.O0();
        AbstractC1474fG.j(strO0, "<this>");
        try {
            C2349oE c2349oE = new C2349oE();
            c2349oE.g(null, strO0);
            c2446pEB = c2349oE.b();
        } catch (IllegalArgumentException unused) {
            c2446pEB = null;
        }
        if (c2446pEB != null) {
            if (!c2446pEB.j || c2446pEB.b.length() != 0 || c2446pEB.c.length() != 0) {
                c2446pEB = null;
            }
            if (c2446pEB != null) {
                C0560Kq c0560Kq = new C0560Kq();
                c0560Kq.m = c2446pEB;
                c0560Kq.d();
                C1855j80 c1855j80G = ((OV) AW.b.getValue()).c(c0560Kq.c()).g();
                try {
                    if (!c1855j80G.p()) {
                        throw new IOException("Descarga de subtítulo HTTP " + c1855j80G.f840o);
                    }
                    AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
                    if (abstractC2051l80 == null) {
                        throw new IOException("Subtítulo vacío");
                    }
                    if (abstractC2051l80.i() > 8388608) {
                        throw new IOException("Subtítulo comprimido demasiado grande");
                    }
                    InputStream inputStreamA = abstractC2051l80.a();
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                        try {
                            AW.a(inputStreamA, fileOutputStream, 8388608L);
                            AbstractC3409z9.g(fileOutputStream, null);
                            AbstractC3409z9.g(inputStreamA, null);
                            AbstractC3409z9.g(c1855j80G, null);
                            File file = new File(fileCreateTempFile.getParentFile(), name);
                            if (file.exists()) {
                                file.delete();
                            }
                            FileInputStream fileInputStream = new FileInputStream(fileCreateTempFile);
                            try {
                                GZIPInputStream gZIPInputStream = new GZIPInputStream(fileInputStream);
                                try {
                                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                                    try {
                                        AW.a(gZIPInputStream, fileOutputStream2, 33554432L);
                                        AbstractC3409z9.g(fileOutputStream2, null);
                                        AbstractC3409z9.g(gZIPInputStream, null);
                                        AbstractC3409z9.g(fileInputStream, null);
                                        fileCreateTempFile.delete();
                                        return Uri.fromFile(file);
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            AbstractC3409z9.g(fileOutputStream2, th);
                                            throw th2;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    try {
                                        throw th3;
                                    } catch (Throwable th4) {
                                        AbstractC3409z9.g(gZIPInputStream, th3);
                                        throw th4;
                                    }
                                }
                            } catch (Throwable th5) {
                                try {
                                    throw th5;
                                } catch (Throwable th6) {
                                    AbstractC3409z9.g(fileInputStream, th5);
                                    throw th6;
                                }
                            }
                        } catch (Throwable th7) {
                            try {
                                throw th7;
                            } catch (Throwable th8) {
                                AbstractC3409z9.g(fileOutputStream, th7);
                                throw th8;
                            }
                        }
                    } catch (Throwable th9) {
                        try {
                            throw th9;
                        } catch (Throwable th10) {
                            AbstractC3409z9.g(inputStreamA, th9);
                            throw th10;
                        }
                    }
                } catch (Throwable th11) {
                    try {
                        throw th11;
                    } catch (Throwable th12) {
                        AbstractC3409z9.g(c1855j80G, th11);
                        throw th12;
                    }
                }
            }
        }
        throw new IllegalArgumentException("URL de subtítulo insegura");
    }
}
