package o;

import android.text.TextUtils;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.dw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1343dw0 implements InterfaceC0302As {
    public static final Pattern g = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern h = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final Oj0 b;
    public InterfaceC0354Cs d;
    public int f;
    public final C2562qX c = new C2562qX();
    public byte[] e = new byte[1024];

    public C1343dw0(String str, Oj0 oj0) {
        this.a = str;
        this.b = oj0;
    }

    public final InterfaceC1324dm0 b(long j) {
        InterfaceC1324dm0 interfaceC1324dm0S = this.d.s(0, 3);
        C0617Mw c0617Mw = new C0617Mw();
        c0617Mw.k = "text/vtt";
        c0617Mw.c = this.a;
        c0617Mw.f405o = j;
        interfaceC1324dm0S.a(c0617Mw.a());
        this.d.f();
        return interfaceC1324dm0S;
    }

    @Override // o.InterfaceC0302As
    public final void d(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // o.InterfaceC0302As
    public final boolean e(InterfaceC0328Bs interfaceC0328Bs) {
        C0554Kk c0554Kk = (C0554Kk) interfaceC0328Bs;
        c0554Kk.x(this.e, 0, 6, false);
        byte[] bArr = this.e;
        C2562qX c2562qX = this.c;
        c2562qX.D(6, bArr);
        if (AbstractC1441ew0.a(c2562qX)) {
            return true;
        }
        c0554Kk.x(this.e, 6, 3, false);
        c2562qX.D(9, this.e);
        return AbstractC1441ew0.a(c2562qX);
    }

    @Override // o.InterfaceC0302As
    public final void f(InterfaceC0354Cs interfaceC0354Cs) {
        this.d = interfaceC0354Cs;
        interfaceC0354Cs.i(new C3114w7(-9223372036854775807L));
    }

    @Override // o.InterfaceC0302As
    public final int h(InterfaceC0328Bs interfaceC0328Bs, C2800sv c2800sv) throws C2949uX, EOFException, InterruptedIOException {
        String strH;
        this.d.getClass();
        C0554Kk c0554Kk = (C0554Kk) interfaceC0328Bs;
        int i = (int) c0554Kk.n;
        int i2 = this.f;
        byte[] bArr = this.e;
        if (i2 == bArr.length) {
            this.e = Arrays.copyOf(bArr, ((i != -1 ? i : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.e;
        int i3 = this.f;
        int iD = c0554Kk.D(bArr2, i3, bArr2.length - i3);
        if (iD != -1) {
            int i4 = this.f + iD;
            this.f = i4;
            if (i == -1 || i4 != i) {
                return 0;
            }
        }
        C2562qX c2562qX = new C2562qX(this.e);
        AbstractC1441ew0.d(c2562qX);
        String strH2 = c2562qX.h(AbstractC1402ed.c);
        long j = 0;
        long jC = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strH2)) {
                while (true) {
                    String strH3 = c2562qX.h(AbstractC1402ed.c);
                    if (strH3 == null) {
                        break;
                    }
                    if (AbstractC1441ew0.a.matcher(strH3).matches()) {
                        do {
                            strH = c2562qX.h(AbstractC1402ed.c);
                            if (strH == null) {
                                break;
                            }
                        } while (!strH.isEmpty());
                    } else {
                        Matcher matcher2 = AbstractC1149bw0.a.matcher(strH3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    b(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jC2 = AbstractC1441ew0.c(strGroup);
                long jB = this.b.b(((((j + jC2) - jC) * 90000) / 1000000) % 8589934592L);
                InterfaceC1324dm0 interfaceC1324dm0B = b(jB - jC2);
                byte[] bArr3 = this.e;
                int i5 = this.f;
                C2562qX c2562qX2 = this.c;
                c2562qX2.D(i5, bArr3);
                interfaceC1324dm0B.e(this.f, c2562qX2);
                interfaceC1324dm0B.d(jB, 1, this.f, 0, null);
                return -1;
            }
            if (strH2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = g.matcher(strH2);
                if (!matcher3.find()) {
                    throw C2949uX.a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strH2), null);
                }
                Matcher matcher4 = h.matcher(strH2);
                if (!matcher4.find()) {
                    throw C2949uX.a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strH2), null);
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = AbstractC1441ew0.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                j = (Long.parseLong(strGroup3) * 1000000) / 90000;
            }
            strH2 = c2562qX.h(AbstractC1402ed.c);
        }
    }

    @Override // o.InterfaceC0302As
    public final void a() {
    }
}
