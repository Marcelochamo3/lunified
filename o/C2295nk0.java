package o;

import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: o.nk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2295nk0 implements Z70, X0, MO {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String[] f940o = {"*|", "|", "_", "-"};
    public static final String[] p = {"-", "_"};
    public final /* synthetic */ int l;
    public int m;
    public Object n;

    public /* synthetic */ C2295nk0(int i, int i2, Object obj) {
        this.l = i2;
        this.n = obj;
        this.m = i;
    }

    public static String v(String str) {
        StringBuilder sbB = AbstractC1021ah0.b();
        char c = 0;
        for (char c2 : str.toCharArray()) {
            if (c2 == '\\') {
                if (c == '\\') {
                    sbB.append(c2);
                    c = 0;
                }
            } else {
                sbB.append(c2);
            }
            c = c2;
        }
        return AbstractC1021ah0.h(sbB);
    }

    @Override // o.MO
    public MediaCodecInfo a(int i) {
        if (((MediaCodecInfo[]) this.n) == null) {
            this.n = new MediaCodecList(this.m).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.n)[i];
    }

    public void b(long j) {
        int i = this.m;
        long[] jArr = (long[]) this.n;
        if (i == jArr.length) {
            this.n = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = (long[]) this.n;
        int i2 = this.m;
        this.m = i2 + 1;
        jArr2[i2] = j;
    }

    public OS c() {
        Map mapM = ((AbstractC1459f50) this.n).m();
        NS ns = new NS(this.m);
        OS os = new OS();
        if (!mapM.isEmpty()) {
            throw new IllegalArgumentException();
        }
        os.f629o = mapM;
        os.q = ns;
        return os;
    }

    @Override // o.X0
    public boolean d(View view) {
        ((BottomSheetBehavior) this.n).H(this.m);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0073 A[LOOP:0: B:3:0x0009->B:45:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0055 A[EDGE_INSN: B:47:0x0055->B:38:0x0055 BREAK  A[LOOP:0: B:3:0x0009->B:45:0x0073], SYNTHETIC] */
    public String e(char c, char c2) {
        char c3 = 0;
        boolean z = false;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        boolean z3 = false;
        while (!o()) {
            char cI = i();
            if (c3 != '\\') {
                if (cI == '\'' && cI != c && !z) {
                    z2 = !z2;
                } else if (cI == '\"' && cI != c && !z2) {
                    z = !z;
                }
                if (!z2 && !z && !z3) {
                    if (cI == c) {
                        i3++;
                        if (i == -1) {
                            i = this.m;
                        }
                    } else if (cI == c2) {
                        i3--;
                    }
                }
                if (i3 <= 0) {
                    break;
                }
                c3 = cI;
            } else if (cI == 'Q') {
                z3 = true;
            } else if (cI == 'E') {
                z3 = false;
            }
            if (i3 > 0 && c3 != 0) {
                i2 = this.m;
            }
            if (i3 <= 0) {
                break;
                break;
            }
            c3 = cI;
        }
        String strSubstring = i2 >= 0 ? ((String) this.n).substring(i, i2) : "";
        if (i3 <= 0) {
            return strSubstring;
        }
        throw new C1629gs0(AbstractC1701hf0.u("Did not find balanced marker at '", strSubstring, "'"));
    }

    @Override // o.MO
    public boolean f(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // o.Z70
    public M70 g(M70 m70, FW fw) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) m70.get()).compress((Bitmap.CompressFormat) this.n, this.m, byteArrayOutputStream);
        m70.e();
        return new P2(byteArrayOutputStream.toByteArray());
    }

    @Override // o.MO
    public int h() {
        if (((MediaCodecInfo[]) this.n) == null) {
            this.n = new MediaCodecList(this.m).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.n).length;
    }

    public char i() {
        int i = this.m;
        this.m = i + 1;
        return ((String) this.n).charAt(i);
    }

    @Override // o.MO
    public boolean j(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public String k(String... strArr) {
        String str;
        int i = this.m;
        boolean z = false;
        loop0: while (true) {
            boolean zO = o();
            str = (String) this.n;
            if (zO) {
                break;
            }
            if (str.charAt(this.m) == '\\') {
                int length = ((String) this.n).length();
                int i2 = this.m;
                if (length - i2 > 1) {
                    this.m = i2 + 2;
                    z = true;
                }
            }
            if (o() || !Character.isLetterOrDigit(((String) this.n).charAt(this.m))) {
                int length2 = strArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        break loop0;
                    }
                    if (q(strArr[i3])) {
                        break;
                    }
                    i3++;
                }
            }
            this.m++;
        }
        String strSubstring = str.substring(i, this.m);
        return z ? v(strSubstring) : strSubstring;
    }

    @Override // o.MO
    public boolean l() {
        return true;
    }

    public boolean m() {
        boolean z = false;
        while (!o() && AbstractC1021ah0.f(((String) this.n).charAt(this.m))) {
            this.m++;
            z = true;
        }
        return z;
    }

    public long n(int i) {
        if (i >= 0 && i < this.m) {
            return ((long[]) this.n)[i];
        }
        StringBuilder sbR = AbstractC1674hK.r("Invalid index ", i, ", size is ");
        sbR.append(this.m);
        throw new IndexOutOfBoundsException(sbR.toString());
    }

    public boolean o() {
        return ((String) this.n).length() - this.m == 0;
    }

    public boolean p(String str) {
        if (!q(str)) {
            return false;
        }
        this.m = str.length() + this.m;
        return true;
    }

    public boolean q(String str) {
        return ((String) this.n).regionMatches(true, this.m, str, 0, str.length());
    }

    public boolean r(char... cArr) {
        if (o()) {
            return false;
        }
        for (char c : cArr) {
            if (((String) this.n).charAt(this.m) == c) {
                return true;
            }
        }
        return false;
    }

    public C1787iZ s(long j) {
        Long l = (Long) this.n;
        if (l == null) {
            return new C1787iZ(this.m, false);
        }
        if (j - l.longValue() >= 45000) {
            this.m = 0;
        }
        int i = this.m + 1;
        this.m = i;
        this.n = null;
        return new C1787iZ(i, i >= 2);
    }

    public long t(C0554Kk c0554Kk) {
        C2562qX c2562qX = (C2562qX) this.n;
        int i = 0;
        c0554Kk.x(c2562qX.a, 0, 1, false);
        int i2 = c2562qX.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        c0554Kk.x(c2562qX.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (c2562qX.a[i] & 255) + (i5 << 8);
        }
        this.m = i4 + 1 + this.m;
        return i5;
    }

    public String toString() {
        switch (this.l) {
            case 0:
                return ((String) this.n).substring(this.m);
            default:
                return super.toString();
        }
    }

    public String u() {
        int i = this.m;
        String str = (String) this.n;
        String strSubstring = str.substring(i);
        this.m = str.length();
        return strSubstring;
    }

    public C2295nk0(AbstractC1459f50 abstractC1459f50) {
        this.l = 8;
        this.n = abstractC1459f50;
        this.m = 2;
    }

    public C2295nk0(int i) {
        this.l = i;
        switch (i) {
            case 6:
                this.n = new long[32];
                break;
            case 7:
            case 8:
            default:
                this.n = Bitmap.CompressFormat.JPEG;
                this.m = 100;
                break;
            case 9:
                break;
            case 10:
                this.n = new C2562qX(8);
                break;
        }
    }

    public C2295nk0(String str) {
        this.l = 0;
        this.m = 0;
        Sr0.w(str);
        this.n = str;
    }

    public C2295nk0(int i, C0488Hw[] c0488HwArr) {
        this.l = 4;
        this.m = i;
        this.n = c0488HwArr;
    }

    public C2295nk0(boolean z, boolean z2) {
        this.l = 7;
        this.m = (z || z2) ? 1 : 0;
    }
}
