package o;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Layout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class S1 implements S9, QK, RK {
    public final /* synthetic */ int l;

    public /* synthetic */ S1(int i) {
        this.l = i;
    }

    public static W9 a(int i, C0643Nw c0643Nw, boolean z, ArrayList arrayList, InterfaceC1324dm0 interfaceC1324dm0) {
        InterfaceC0302As c1932jy;
        String str = c0643Nw.v;
        if (IQ.l(str)) {
            return null;
        }
        if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
            c1932jy = new C2649rO(1);
        } else {
            c1932jy = new C1932jy(z ? 4 : 0, null, arrayList, interfaceC1324dm0);
        }
        return new W9(c1932jy, i, c0643Nw);
    }

    @Override // o.QK
    public void b(Object obj) {
        C2747sP c2747sP = (C2747sP) obj;
        switch (this.l) {
            case 5:
                c2747sP.getClass();
                break;
            case 6:
                c2747sP.getClass();
                break;
            case 7:
                c2747sP.getClass();
                break;
            case 8:
                c2747sP.getClass();
                break;
            case 9:
                c2747sP.getClass();
                break;
            case 10:
                c2747sP.getClass();
                break;
            case 11:
                c2747sP.getClass();
                break;
            case 12:
                c2747sP.getClass();
                break;
            case 13:
                c2747sP.getClass();
                break;
            case 14:
                c2747sP.getClass();
                break;
            case 15:
                c2747sP.getClass();
                break;
            case 16:
                c2747sP.getClass();
                break;
            case 17:
                c2747sP.getClass();
                break;
            case 18:
                c2747sP.getClass();
                break;
            case 19:
                c2747sP.getClass();
                break;
            case 20:
                c2747sP.getClass();
                break;
            case 21:
                c2747sP.getClass();
                break;
            case 22:
                c2747sP.getClass();
                break;
            case 23:
            default:
                c2747sP.getClass();
                break;
            case 24:
                c2747sP.getClass();
                break;
            case 25:
                c2747sP.getClass();
                break;
            case 26:
                c2747sP.getClass();
                break;
            case 27:
                c2747sP.getClass();
                break;
            case 28:
                c2747sP.getClass();
                break;
        }
    }

    @Override // o.RK
    public void d(Object obj, C3188wv c3188wv) {
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
    @Override // o.S9
    public T9 g(Bundle bundle) {
        T1[] t1Arr;
        float f;
        int i;
        int i2;
        float f2;
        boolean z;
        int i3;
        switch (this.l) {
            case 0:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(U1.t);
                if (parcelableArrayList == null) {
                    t1Arr = new T1[0];
                } else {
                    T1[] t1Arr2 = new T1[parcelableArrayList.size()];
                    for (int i4 = 0; i4 < parcelableArrayList.size(); i4++) {
                        t1Arr2[i4] = (T1) T1.B.g((Bundle) parcelableArrayList.get(i4));
                    }
                    t1Arr = t1Arr2;
                }
                return new U1(null, t1Arr, bundle.getLong(U1.u, 0L), bundle.getLong(U1.v, -9223372036854775807L), bundle.getInt(U1.w, 0));
            case 1:
                long j = bundle.getLong(T1.t);
                int i5 = bundle.getInt(T1.u);
                int i6 = bundle.getInt(T1.A);
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(T1.v);
                int[] intArray = bundle.getIntArray(T1.w);
                long[] longArray = bundle.getLongArray(T1.x);
                long j2 = bundle.getLong(T1.y);
                boolean z2 = bundle.getBoolean(T1.z);
                if (intArray == null) {
                    intArray = new int[0];
                }
                return new T1(j, i5, i6, intArray, parcelableArrayList2 == null ? new Uri[0] : (Uri[]) parcelableArrayList2.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j2, z2);
            case 2:
            default:
                CharSequence charSequence = bundle.getCharSequence(C3162wi.D);
                CharSequence charSequence2 = charSequence != null ? charSequence : null;
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(C3162wi.E);
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(C3162wi.F);
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap = (Bitmap) bundle.getParcelable(C3162wi.G);
                Bitmap bitmap2 = bitmap != null ? bitmap : null;
                String str = C3162wi.H;
                if (bundle.containsKey(str)) {
                    String str2 = C3162wi.I;
                    if (bundle.containsKey(str2)) {
                        f = bundle.getFloat(str);
                        i = bundle.getInt(str2);
                    } else {
                        f = -3.4028235E38f;
                        i = Integer.MIN_VALUE;
                    }
                } else {
                    f = -3.4028235E38f;
                    i = Integer.MIN_VALUE;
                }
                String str3 = C3162wi.J;
                int i7 = bundle.containsKey(str3) ? bundle.getInt(str3) : Integer.MIN_VALUE;
                String str4 = C3162wi.K;
                float f3 = bundle.containsKey(str4) ? bundle.getFloat(str4) : -3.4028235E38f;
                String str5 = C3162wi.L;
                int i8 = bundle.containsKey(str5) ? bundle.getInt(str5) : Integer.MIN_VALUE;
                String str6 = C3162wi.N;
                if (bundle.containsKey(str6)) {
                    String str7 = C3162wi.M;
                    if (bundle.containsKey(str7)) {
                        float f4 = bundle.getFloat(str6);
                        i2 = bundle.getInt(str7);
                        f2 = f4;
                    } else {
                        i2 = Integer.MIN_VALUE;
                        f2 = -3.4028235E38f;
                    }
                } else {
                    i2 = Integer.MIN_VALUE;
                    f2 = -3.4028235E38f;
                }
                String str8 = C3162wi.O;
                float f5 = bundle.containsKey(str8) ? bundle.getFloat(str8) : -3.4028235E38f;
                String str9 = C3162wi.P;
                float f6 = bundle.containsKey(str9) ? bundle.getFloat(str9) : -3.4028235E38f;
                String str10 = C3162wi.Q;
                if (bundle.containsKey(str10)) {
                    z = true;
                    i3 = bundle.getInt(str10);
                } else {
                    z = false;
                    i3 = -16777216;
                }
                boolean z3 = !bundle.getBoolean(C3162wi.R, false) ? false : z;
                String str11 = C3162wi.S;
                int i9 = bundle.containsKey(str11) ? bundle.getInt(str11) : Integer.MIN_VALUE;
                String str12 = C3162wi.T;
                return new C3162wi(charSequence2, alignment2, alignment4, bitmap2, f, i, i7, f3, i8, i2, f2, f5, f6, z3, i3, i9, bundle.containsKey(str12) ? bundle.getFloat(str12) : 0.0f);
            case 3:
                return new C1602gf(bundle.getInt(C1602gf.r, -1), bundle.getInt(C1602gf.s, -1), bundle.getInt(C1602gf.t, -1), bundle.getByteArray(C1602gf.u));
        }
    }

    public /* synthetic */ S1(C3201x2 c3201x2, Object obj, int i) {
        this.l = i;
    }

    public /* synthetic */ S1(C3201x2 c3201x2, C0643Nw c0643Nw, C0708Qj c0708Qj, int i) {
        this.l = i;
    }
}
