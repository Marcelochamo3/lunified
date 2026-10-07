package o;

import j$.util.Objects;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: o.kX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1979kX extends Pu0 {
    public final Method f;
    public final int g;
    public final String h;
    public final InterfaceC0602Mh i;
    public final boolean j;

    public C1979kX(Method method, int i, String str, boolean z) {
        O9 o9 = O9.m;
        this.f = method;
        this.g = i;
        Objects.requireNonNull(str, "name == null");
        this.h = str;
        this.i = o9;
        this.j = z;
    }

    @Override // o.Pu0
    public final void a(C2534q70 c2534q70, Object obj) {
        String strZ;
        String str = this.h;
        if (obj == null) {
            throw UK.M(this.f, this.g, AbstractC1701hf0.u("Path parameter \"", str, "\" value must not be null."), new Object[0]);
        }
        String str2 = (String) this.i.l(obj);
        if (c2534q70.c == null) {
            throw new AssertionError();
        }
        int length = str2.length();
        int iCharCount = 0;
        while (true) {
            if (iCharCount >= length) {
                strZ = str2;
                break;
            }
            int iCodePointAt = str2.codePointAt(iCharCount);
            boolean z = this.j;
            int i = 47;
            int i2 = -1;
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                E9 e9 = new E9();
                e9.k0(0, str2, iCharCount);
                E9 e10 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str2.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 < 32 || iCodePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i2 || (!z && (iCodePointAt2 == i || iCodePointAt2 == 37))) {
                            if (e10 == null) {
                                e10 = new E9();
                            }
                            e10.m0(iCodePointAt2);
                            while (!e10.D()) {
                                byte b = e10.readByte();
                                e9.f0(37);
                                char[] cArr = C2534q70.l;
                                e9.f0(cArr[((b & 255) >> 4) & 15]);
                                e9.f0(cArr[b & 15]);
                            }
                        } else {
                            e9.m0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i = 47;
                    i2 = -1;
                }
                strZ = e9.Z();
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strReplace = c2534q70.c.replace("{" + str + "}", strZ);
        if (C2534q70.m.matcher(strReplace).matches()) {
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(str2));
        }
        c2534q70.c = strReplace;
    }
}
