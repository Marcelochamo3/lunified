package o;

import java.io.IOException;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: o.Aq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0300Aq {
    public static final char[] a = {',', ';'};
    public static final HashMap b = new HashMap();

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public static void a(Appendable appendable, EnumC3469zq enumC3469zq, int i) throws IOException {
        String str;
        int iBinarySearch = Arrays.binarySearch(enumC3469zq.n, i);
        if (iBinarySearch >= 0) {
            String[] strArr = enumC3469zq.f1163o;
            if (iBinarySearch < strArr.length - 1) {
                int i2 = iBinarySearch + 1;
                if (enumC3469zq.n[i2] == i) {
                    str = strArr[i2];
                } else {
                    str = strArr[iBinarySearch];
                }
            } else {
                str = strArr[iBinarySearch];
            }
        } else {
            str = "";
        }
        if ("".equals(str)) {
            appendable.append("&#x").append(Integer.toHexString(i)).append(';');
        } else {
            appendable.append('&').append(str).append(';');
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:73:0x00df  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f6  */
    public static void b(Appendable appendable, String str, C0634Nn c0634Nn, boolean z, boolean z2, boolean z3, boolean z4) throws IOException {
        String str2;
        char c;
        EnumC3469zq enumC3469zq = c0634Nn.l;
        ThreadLocal threadLocal = c0634Nn.f417o;
        CharsetEncoder charsetEncoderNewEncoder = (CharsetEncoder) threadLocal.get();
        if (charsetEncoderNewEncoder == null) {
            charsetEncoderNewEncoder = c0634Nn.m.newEncoder();
            threadLocal.set(charsetEncoderNewEncoder);
        }
        int i = c0634Nn.n;
        int length = str.length();
        int iCharCount = 0;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            boolean zCanEncode = true;
            if (z2) {
                if (!AbstractC1021ah0.f(iCodePointAt)) {
                    if (z5) {
                        appendable.append(' ');
                        z5 = false;
                    }
                    z6 = true;
                    z7 = false;
                    if (iCodePointAt < 65536) {
                        c = (char) iCodePointAt;
                        if (c != '\t') {
                            appendable.append(c);
                        } else {
                            appendable.append(c);
                        }
                    } else {
                        str2 = new String(Character.toChars(iCodePointAt));
                        if (charsetEncoderNewEncoder.canEncode(str2)) {
                            appendable.append(str2);
                        } else {
                            a(appendable, enumC3469zq, iCodePointAt);
                        }
                    }
                } else if ((!z3 || z6) && !z7) {
                    if (z4) {
                        z5 = true;
                    } else {
                        appendable.append(' ');
                        z7 = true;
                    }
                }
            } else if (iCodePointAt < 65536) {
                c = (char) iCodePointAt;
                if (c != '\t' || c == '\n' || c == '\r') {
                    appendable.append(c);
                } else if (c != '\"') {
                    if (c == '&') {
                        appendable.append("&amp;");
                    } else if (c != '<') {
                        if (c != '>') {
                            if (c != 160) {
                                if (c < ' ') {
                                    a(appendable, enumC3469zq, iCodePointAt);
                                } else {
                                    int iW = AbstractC1701hf0.w(i);
                                    if (iW != 0) {
                                        if (iW != 1) {
                                            zCanEncode = charsetEncoderNewEncoder.canEncode(c);
                                        }
                                    } else if (c >= 128) {
                                        zCanEncode = false;
                                    }
                                    if (zCanEncode) {
                                        appendable.append(c);
                                    } else {
                                        a(appendable, enumC3469zq, iCodePointAt);
                                    }
                                }
                            } else if (enumC3469zq != EnumC3469zq.p) {
                                appendable.append("&nbsp;");
                            } else {
                                appendable.append("&#xa0;");
                            }
                        } else if (z) {
                            appendable.append(c);
                        } else {
                            appendable.append("&gt;");
                        }
                    } else if (!z || enumC3469zq == EnumC3469zq.p || c0634Nn.s == 2) {
                        appendable.append("&lt;");
                    } else {
                        appendable.append(c);
                    }
                } else if (z) {
                    appendable.append("&quot;");
                } else {
                    appendable.append(c);
                }
            } else {
                str2 = new String(Character.toChars(iCodePointAt));
                if (charsetEncoderNewEncoder.canEncode(str2)) {
                    appendable.append(str2);
                } else {
                    a(appendable, enumC3469zq, iCodePointAt);
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }
}
