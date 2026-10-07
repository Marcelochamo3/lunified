package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import o.AbstractC0911Ye;
import o.AbstractC1119bh0;
import o.AbstractC1474fG;
import o.AbstractC2506pt;
import o.AbstractC3409z9;
import o.C1233cq;
import o.C2046l6;
import o.C3111w50;
import o.C3325yL;
import o.Hj0;
import o.JA;
import o.Nr0;
import o.SV;
import o.VY;
import o.Vb0;

/* JADX INFO: loaded from: classes.dex */
public final class PublicSuffixDatabase {
    public static final byte[] e = {42};
    public static final List f = AbstractC2506pt.A("*");
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    public static List c(String str) {
        List listS0 = AbstractC1119bh0.s0(str, new char[]{'.'}, 0, 6);
        if (!AbstractC1474fG.b(AbstractC0911Ye.i0(listS0), "")) {
            return listS0;
        }
        int size = listS0.size() - 1;
        return AbstractC0911Ye.s0(size >= 0 ? size : 0, listS0);
    }

    public final String a(String str) {
        String strN;
        String strN2;
        String strN3;
        List listS0;
        AbstractC1474fG.j(str, "domain");
        String unicode = IDN.toUnicode(str);
        AbstractC1474fG.i(unicode, "unicodeDomain");
        List listC = c(unicode);
        if (this.a.get() || !this.a.compareAndSet(false, true)) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e2) {
                        VY vy = VY.a;
                        VY.a.getClass();
                        VY.i(5, "Failed to read public suffix list", e2);
                        if (z) {
                        }
                    }
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = listC.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < size; i++) {
            String str2 = (String) listC.get(i);
            Charset charset = StandardCharsets.UTF_8;
            AbstractC1474fG.i(charset, "UTF_8");
            byte[] bytes = str2.getBytes(charset);
            AbstractC1474fG.i(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i] = bytes;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                strN = null;
                break;
            }
            byte[] bArr2 = this.c;
            if (bArr2 == null) {
                AbstractC1474fG.U("publicSuffixListBytes");
                throw null;
            }
            strN = C3325yL.n(bArr2, bArr, i2);
            if (strN != null) {
                break;
            }
            i2++;
        }
        if (size <= 1) {
            strN2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                strN2 = null;
                break;
            }
            bArr3[i3] = e;
            byte[] bArr4 = this.c;
            if (bArr4 == null) {
                AbstractC1474fG.U("publicSuffixListBytes");
                throw null;
            }
            strN2 = C3325yL.n(bArr4, bArr3, i3);
            if (strN2 != null) {
                break;
            }
            i3++;
        }
        if (strN2 == null) {
            strN3 = null;
            break;
        }
        int i4 = size - 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                strN3 = null;
                break;
            }
            byte[] bArr5 = this.d;
            if (bArr5 == null) {
                AbstractC1474fG.U("publicSuffixExceptionListBytes");
                throw null;
            }
            strN3 = C3325yL.n(bArr5, bArr, i5);
            if (strN3 != null) {
                break;
            }
            i5++;
        }
        if (strN3 != null) {
            listS0 = AbstractC1119bh0.s0("!".concat(strN3), new char[]{'.'}, 0, 6);
        } else if (strN == null && strN2 == null) {
            listS0 = f;
        } else {
            List listS1 = C1233cq.l;
            List listS2 = strN != null ? AbstractC1119bh0.s0(strN, new char[]{'.'}, 0, 6) : listS1;
            if (strN2 != null) {
                listS1 = AbstractC1119bh0.s0(strN2, new char[]{'.'}, 0, 6);
            }
            listS0 = listS2.size() > listS1.size() ? listS2 : listS1;
        }
        if (listC.size() != listS0.size() || ((String) listS0.get(0)).charAt(0) == '!') {
            return Vb0.L(Vb0.H(AbstractC0911Ye.U(c(str)), ((String) listS0.get(0)).charAt(0) == '!' ? listC.size() - listS0.size() : listC.size() - (listS0.size() + 1)), ".");
        }
        return null;
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream == null) {
                this.b.countDown();
                return;
            }
            Logger logger = SV.a;
            C3111w50 c3111w50G = Nr0.g(new JA(new C2046l6(resourceAsStream, 1, new Hj0())));
            try {
                long j = c3111w50G.readInt();
                c3111w50G.M(j);
                byte[] bArrW = c3111w50G.m.W(j);
                long j2 = c3111w50G.readInt();
                c3111w50G.M(j2);
                byte[] bArrW2 = c3111w50G.m.W(j2);
                AbstractC3409z9.g(c3111w50G, null);
                synchronized (this) {
                    this.c = bArrW;
                    this.d = bArrW2;
                }
                this.b.countDown();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3409z9.g(c3111w50G, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            this.b.countDown();
            throw th3;
        }
    }
}
