package o;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.q70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2534q70 {
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;
    public final C2446pE b;
    public String c;
    public C2349oE d;
    public final C0560Kq e = new C0560Kq();
    public final C2112lq f;
    public TP g;
    public final boolean h;
    public final RN i;
    public final Na0 j;
    public AbstractC2340o70 k;

    public C2534q70(String str, C2446pE c2446pE, String str2, C2152mB c2152mB, TP tp, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = c2446pE;
        this.c = str2;
        this.g = tp;
        this.h = z;
        if (c2152mB != null) {
            this.f = c2152mB.f();
        } else {
            this.f = new C2112lq(1);
        }
        if (z2) {
            this.j = new Na0(22);
            return;
        }
        if (z3) {
            RN rn = new RN(3);
            this.i = rn;
            TP tp2 = RS.f;
            AbstractC1474fG.j(tp2, "type");
            if (AbstractC1474fG.b(tp2.b, "multipart")) {
                rn.n = tp2;
            } else {
                throw new IllegalArgumentException(("multipart != " + tp2).toString());
            }
        }
    }

    public final void a(String str, String str2, boolean z) {
        Na0 na0 = this.j;
        if (!z) {
            na0.o(str, str2);
            return;
        }
        na0.getClass();
        AbstractC1474fG.j(str, "name");
        ((ArrayList) na0.n).add(C0622Nb.l(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, (Charset) na0.m, 83));
        ((ArrayList) na0.f414o).add(C0622Nb.l(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, (Charset) na0.m, 83));
    }

    public final void b(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                Pattern pattern = TP.e;
                this.g = AbstractC1474fG.o(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(AbstractC1701hf0.t("Malformed content type: ", str2), e);
            }
        }
        C2112lq c2112lq = this.f;
        if (z) {
            c2112lq.e(str, str2);
        } else {
            c2112lq.a(str, str2);
        }
    }

    public final void c(C2152mB c2152mB, AbstractC2340o70 abstractC2340o70) {
        RN rn = this.i;
        rn.getClass();
        AbstractC1474fG.j(abstractC2340o70, "body");
        if ((c2152mB != null ? c2152mB.a("Content-Type") : null) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
        }
        if ((c2152mB != null ? c2152mB.a("Content-Length") : null) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
        }
        ((ArrayList) rn.f488o).add(new QS(c2152mB, abstractC2340o70));
    }

    public final void d(String str, String str2, boolean z) {
        String str3 = this.c;
        if (str3 != null) {
            C2446pE c2446pE = this.b;
            C2349oE c2349oEG = c2446pE.g(str3);
            this.d = c2349oEG;
            if (c2349oEG == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + c2446pE + ", Relative: " + this.c);
            }
            this.c = null;
        }
        if (!z) {
            this.d.a(str, str2);
            return;
        }
        C2349oE c2349oE = this.d;
        c2349oE.getClass();
        AbstractC1474fG.j(str, "encodedName");
        if (((ArrayList) c2349oE.i) == null) {
            c2349oE.i = new ArrayList();
        }
        ArrayList arrayList = (ArrayList) c2349oE.i;
        AbstractC1474fG.g(arrayList);
        arrayList.add(C0622Nb.l(str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211));
        ArrayList arrayList2 = (ArrayList) c2349oE.i;
        AbstractC1474fG.g(arrayList2);
        arrayList2.add(str2 != null ? C0622Nb.l(str2, 0, 0, " \"'<>#&=", true, false, true, false, null, 211) : null);
    }
}
