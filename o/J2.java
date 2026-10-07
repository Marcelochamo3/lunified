package o;

import android.text.TextUtils;
import j$.util.Objects;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class J2 implements InterfaceC1518fm, InterfaceC3432zV, InterfaceC0740Rp, InterfaceC0602Mh, Oh0 {
    public final /* synthetic */ int l;
    public final String m;

    public /* synthetic */ J2(int i, String str, boolean z) {
        this.l = i;
        this.m = str;
    }

    public static J2 e(C2562qX c2562qX) {
        String str;
        c2562qX.G(2);
        int iU = c2562qX.u();
        int i = iU >> 1;
        int iU2 = ((c2562qX.u() >> 3) & 31) | ((iU & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(iU2 >= 10 ? "." : ".0");
        sb.append(iU2);
        return new J2(4, sb.toString(), false);
    }

    @Override // o.InterfaceC0740Rp
    public boolean L(CharSequence charSequence, int i, int i2, Rp0 rp0) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.m)) {
            return true;
        }
        rp0.c = (rp0.c & 3) | 4;
        return false;
    }

    @Override // o.InterfaceC3432zV
    public Object M() {
        switch (this.l) {
            case 1:
                throw new RH(this.m);
            case 2:
                throw new RH(this.m);
            default:
                throw new RH(this.m);
        }
    }

    @Override // o.InterfaceC1518fm
    public boolean a(SSLSocket sSLSocket) {
        return AbstractC1899jh0.U(sSLSocket.getClass().getName(), this.m + '.', false);
    }

    @Override // o.InterfaceC1518fm
    public Ge0 c(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!AbstractC1474fG.b(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new K2(superclass);
    }

    public void d(StringBuilder sb, AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.m);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // o.Oh0
    public String f() {
        return this.m;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:109:0x0209 A[Catch: all -> 0x021a, TryCatch #2 {all -> 0x021a, blocks: (B:107:0x0205, B:109:0x0209, B:113:0x0216, B:117:0x021c, B:118:0x0220, B:122:0x022c, B:124:0x0237, B:121:0x0228, B:129:0x0241, B:130:0x0245), top: B:145:0x0205, outer: #3, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0213  */
    /* JADX WARN: Code duplicated, block: B:112:0x0215  */
    /* JADX WARN: Code duplicated, block: B:120:0x0226  */
    /* JADX WARN: Code duplicated, block: B:121:0x0228 A[Catch: all -> 0x021a, TryCatch #2 {all -> 0x021a, blocks: (B:107:0x0205, B:109:0x0209, B:113:0x0216, B:117:0x021c, B:118:0x0220, B:122:0x022c, B:124:0x0237, B:121:0x0228, B:129:0x0241, B:130:0x0245), top: B:145:0x0205, outer: #3, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0237 A[Catch: all -> 0x021a, TRY_LEAVE, TryCatch #2 {all -> 0x021a, blocks: (B:107:0x0205, B:109:0x0209, B:113:0x0216, B:117:0x021c, B:118:0x0220, B:122:0x022c, B:124:0x0237, B:121:0x0228, B:129:0x0241, B:130:0x0245), top: B:145:0x0205, outer: #3, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0205 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x012d  */
    /* JADX WARN: Code duplicated, block: B:6:0x0018  */
    @Override // o.InterfaceC0602Mh
    public Object l(Object obj) throws Throwable {
        Charset charsetForName;
        C0551Kh c0551Kh;
        C0660On c0660OnF;
        C0660On c0660On;
        C0660On c0660On2;
        C1053ax0 c1053ax0K;
        BufferedReader bufferedReader;
        boolean z;
        C0660On c0660OnF2;
        Charset charsetForName2;
        AbstractC2051l80 abstractC2051l80 = (AbstractC2051l80) obj;
        AbstractC1474fG.j(abstractC2051l80, "value");
        TP tpL = abstractC2051l80.l();
        if (tpL != null) {
            Pattern pattern = TP.e;
            charsetForName = tpL.a(null);
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-8");
            }
        } else {
            charsetForName = Charset.forName("UTF-8");
        }
        String strValueOf = String.valueOf(abstractC2051l80.l());
        RN rn = AbstractC1474fG.b(strValueOf, "application/xml") ? true : AbstractC1474fG.b(strValueOf, "text/xml") ? new RN(new C1151bx0()) : new RN(new C1081bD());
        InputStream inputStreamA = abstractC2051l80.a();
        String strName = charsetForName.name();
        Pattern pattern2 = AbstractC3164wj.a;
        int i = C0551Kh.q;
        if (inputStreamA instanceof C0551Kh) {
            c0551Kh = (C0551Kh) inputStreamA;
        } else {
            c0551Kh = inputStreamA instanceof BufferedInputStream ? new C0551Kh((BufferedInputStream) inputStreamA) : new C0551Kh(new BufferedInputStream(inputStreamA, 32768));
        }
        try {
            c0551Kh.mark(32768);
            int i2 = 5119;
            byte[] bArr = new byte[5119];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(5119);
            int i3 = 5119;
            while (true) {
                int i4 = c0551Kh.read(bArr, 0, Math.min(i3, i2));
                if (i4 == -1) {
                    break;
                }
                if (i4 >= i3) {
                    byteArrayOutputStream.write(bArr, 0, i3);
                    break;
                }
                i3 -= i4;
                try {
                    byteArrayOutputStream.write(bArr, 0, i4);
                    i2 = 5119;
                } catch (Throwable th) {
                    th = th;
                }
                th = th;
                c0551Kh.close();
                throw th;
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
            boolean z2 = c0551Kh.read() == -1;
            c0551Kh.reset();
            io.sentry.android.core.F fA = AbstractC3164wj.a(byteBufferWrap);
            if (fA != null) {
                strName = fA.a;
            }
            String str = AbstractC3164wj.c;
            Charset charset = AbstractC3164wj.b;
            Nm0 nm0 = (Nm0) rn.m;
            String str2 = this.m;
            if (strName == null) {
                try {
                    CharBuffer charBufferDecode = charset.decode(byteBufferWrap);
                    if (charBufferDecode.hasArray()) {
                        c0660OnF = nm0.f(new CharArrayReader(charBufferDecode.array(), charBufferDecode.arrayOffset(), charBufferDecode.limit()), str2, rn);
                    } else {
                        c0660OnF = ((Nm0) rn.m).f(new StringReader(charBufferDecode.toString()), str2, rn);
                    }
                    Iterator it = c0660OnF.W("meta[http-equiv=content-type], meta[charset]").iterator();
                    String strD = null;
                    while (it.hasNext()) {
                        C3176wp c3176wp = (C3176wp) it.next();
                        Iterator it2 = it;
                        if (c3176wp.r("http-equiv")) {
                            String strD2 = c3176wp.d("content");
                            if (strD2 == null) {
                                strD = null;
                            } else {
                                Matcher matcher = AbstractC3164wj.a.matcher(strD2);
                                if (matcher.find()) {
                                    strD = AbstractC3164wj.b(matcher.group(1).trim().replace("charset=", ""));
                                } else {
                                    strD = null;
                                }
                            }
                        }
                        if (strD == null && c3176wp.r("charset")) {
                            strD = c3176wp.d("charset");
                        }
                        if (strD != null) {
                            break;
                        }
                        it = it2;
                    }
                    if (strD != null || c0660OnF.q.size() <= 0) {
                        c0660On = c0660OnF;
                    } else {
                        AbstractC1099bV abstractC1099bVJ = c0660OnF.j(0);
                        if (abstractC1099bVJ instanceof C1053ax0) {
                            c1053ax0K = (C1053ax0) abstractC1099bVJ;
                            c0660On = c0660OnF;
                        } else {
                            if (abstractC1099bVJ instanceof C3059vf) {
                                C3059vf c3059vf = (C3059vf) abstractC1099bVJ;
                                String strI = c3059vf.I();
                                c0660On = c0660OnF;
                                if (strI.length() > 1 && (strI.startsWith("!") || strI.startsWith("?"))) {
                                    c1053ax0K = c3059vf.K();
                                }
                            } else {
                                c0660On = c0660OnF;
                            }
                            c1053ax0K = null;
                        }
                        if (c1053ax0K != null && c1053ax0K.I().equalsIgnoreCase("xml")) {
                            strD = c1053ax0K.d("encoding");
                        }
                    }
                    String strB = AbstractC3164wj.b(strD);
                    if (strB == null || strB.equalsIgnoreCase(str)) {
                        if (z2) {
                            c0660On2 = c0660On;
                        }
                        if (c0660On2 == null) {
                            if (strName == null) {
                                strName = str;
                            }
                            bufferedReader = new BufferedReader(new InputStreamReader(c0551Kh, Charset.forName(strName)), 32768);
                            if (fA != null) {
                                try {
                                    if (fA.b) {
                                        if (bufferedReader.skip(1L) == 1) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        Sr0.s(z);
                                    }
                                } catch (Throwable th2) {
                                    bufferedReader.close();
                                    throw th2;
                                }
                            }
                            try {
                                c0660OnF2 = nm0.f(bufferedReader, str2, rn);
                                if (strName.equals(str)) {
                                    charsetForName2 = charset;
                                } else {
                                    charsetForName2 = Charset.forName(strName);
                                }
                                c0660OnF2.u.b(charsetForName2);
                                if (!charsetForName2.canEncode()) {
                                    c0660OnF2.c0(charset);
                                }
                                bufferedReader.close();
                                c0660On2 = c0660OnF2;
                            } catch (UncheckedIOException e) {
                                throw e.getCause();
                            }
                        }
                        c0551Kh.close();
                        return c0660On2;
                    }
                    strName = strB.trim().replaceAll("[\"']", "");
                } catch (UncheckedIOException e2) {
                    throw e2.getCause();
                }
            } else {
                Sr0.v(strName, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
            }
            c0660On2 = null;
            if (c0660On2 == null) {
                if (strName == null) {
                    strName = str;
                }
                bufferedReader = new BufferedReader(new InputStreamReader(c0551Kh, Charset.forName(strName)), 32768);
                if (fA != null) {
                    if (fA.b) {
                        if (bufferedReader.skip(1L) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Sr0.s(z);
                    }
                }
                c0660OnF2 = nm0.f(bufferedReader, str2, rn);
                if (strName.equals(str)) {
                    charsetForName2 = charset;
                } else {
                    charsetForName2 = Charset.forName(strName);
                }
                c0660OnF2.u.b(charsetForName2);
                if (!charsetForName2.canEncode()) {
                    c0660OnF2.c0(charset);
                }
                bufferedReader.close();
                c0660On2 = c0660OnF2;
            }
            c0551Kh.close();
            return c0660On2;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public String toString() {
        switch (this.l) {
            case 10:
                return "<" + this.m + '>';
            default:
                return super.toString();
        }
    }

    public J2(String str, int i) {
        this.l = i;
        switch (i) {
            case 8:
                AbstractC1474fG.j(str, "query");
                this.m = str;
                break;
            default:
                str.getClass();
                this.m = str;
                break;
        }
    }

    public J2() {
        this.l = 0;
        this.m = "com.google.android.gms.org.conscrypt";
    }

    @Override // o.InterfaceC0740Rp
    public Object b() {
        return this;
    }

    @Override // o.Oh0
    public void i(Nh0 nh0) {
    }
}
