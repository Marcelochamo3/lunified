package o;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* JADX INFO: renamed from: o.oj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2389oj extends S7 {
    public C2970uj p;
    public byte[] q;
    public int r;
    public int s;

    @Override // o.InterfaceC2000kj
    public final int D(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.s;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.q;
        int i4 = Lr0.a;
        System.arraycopy(bArr2, this.r, bArr, i, iMin);
        this.r += iMin;
        this.s -= iMin;
        b(iMin);
        return iMin;
    }

    @Override // o.InterfaceC2583qj
    public final void close() {
        if (this.q != null) {
            this.q = null;
            c();
        }
        this.p = null;
    }

    @Override // o.InterfaceC2583qj
    public final long v(C2970uj c2970uj) throws C2949uX, C2679rj {
        e();
        this.p = c2970uj;
        Uri uriNormalizeScheme = c2970uj.a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        AbstractC0397Ej.b("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i = Lr0.a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new C2949uX("Unexpected URI format: " + uriNormalizeScheme, null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.q = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new C2949uX(AbstractC1701hf0.t("Error while parsing Base64 encoded string: ", str), e, true, 0);
            }
        } else {
            this.q = URLDecoder.decode(str, AbstractC1402ed.a.name()).getBytes(AbstractC1402ed.c);
        }
        byte[] bArr = this.q;
        long length = bArr.length;
        long j = c2970uj.f;
        if (j > length) {
            this.q = null;
            throw new C2679rj(2008);
        }
        int i2 = (int) j;
        this.r = i2;
        int length2 = bArr.length - i2;
        this.s = length2;
        long j2 = c2970uj.g;
        if (j2 != -1) {
            this.s = (int) Math.min(length2, j2);
        }
        f(c2970uj);
        return j2 != -1 ? j2 : this.s;
    }

    @Override // o.InterfaceC2583qj
    public final Uri w() {
        C2970uj c2970uj = this.p;
        if (c2970uj != null) {
            return c2970uj.a;
        }
        return null;
    }
}
