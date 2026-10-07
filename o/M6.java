package o;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class M6 {
    public static final M6 c = new M6(10, new int[]{2});
    public static final M60 d;
    public static final R60 e;
    public final int[] a;
    public final int b;

    static {
        Object[] objArr = {2, 5, 6};
        AbstractC3045vW.i(3, objArr);
        d = AbstractC0985aF.j(3, objArr);
        C2613qy c2613qy = new C2613qy(4, 5);
        c2613qy.I(5, 6);
        c2613qy.I(17, 6);
        c2613qy.I(7, 6);
        c2613qy.I(30, 10);
        c2613qy.I(18, 6);
        c2613qy.I(6, 8);
        c2613qy.I(8, 8);
        c2613qy.I(14, 8);
        e = c2613qy.c();
    }

    public M6(int i, int[] iArr) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.a = new int[0];
        }
        this.b = i;
    }

    public static boolean a() {
        if (Lr0.a >= 17) {
            String str = Lr0.c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static M6 b(Context context) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    public static M6 c(Context context, Intent intent) {
        int i = Lr0.a;
        M6 m6 = c;
        if (i >= 23 && K6.b(context)) {
            return m6;
        }
        C1375eF c1375eF = new C1375eF();
        if (a() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            M60 m60 = d;
            m60.getClass();
            c1375eF.d(m60);
        }
        if (i >= 29 && (Lr0.J(context) || (i >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            AbstractC0985aF abstractC0985aFA = L6.a();
            abstractC0985aFA.getClass();
            c1375eF.d(abstractC0985aFA);
            return new M6(10, Pu0.v(c1375eF.h()));
        }
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            AbstractC1571gF abstractC1571gFH = c1375eF.h();
            return !abstractC1571gFH.isEmpty() ? new M6(10, Pu0.v(abstractC1571gFH)) : m6;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List listEmptyList = intArrayExtra.length == 0 ? Collections.emptyList() : new C1768iG(0, intArrayExtra.length, intArrayExtra);
            listEmptyList.getClass();
            c1375eF.d(listEmptyList);
        }
        return new M6(intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10), Pu0.v(c1375eF.h()));
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    public final Pair d(C0643Nw c0643Nw) {
        int iIntValue;
        String str = c0643Nw.w;
        str.getClass();
        int iD = IQ.d(str, c0643Nw.t);
        Integer numValueOf = Integer.valueOf(iD);
        R60 r60 = e;
        if (!r60.containsKey(numValueOf)) {
            return null;
        }
        int[] iArr = this.a;
        int i = 6;
        if (iD == 18 && Arrays.binarySearch(iArr, 18) < 0) {
            iD = 6;
        } else if ((iD == 8 && Arrays.binarySearch(iArr, 8) < 0) || (iD == 30 && Arrays.binarySearch(iArr, 30) < 0)) {
            iD = 7;
        }
        if (Arrays.binarySearch(iArr, iD) < 0) {
            return null;
        }
        int i2 = c0643Nw.J;
        if (i2 == -1 || iD == 18) {
            int i3 = c0643Nw.K;
            if (i3 == -1) {
                i3 = 48000;
            }
            if (Lr0.a >= 29) {
                iIntValue = L6.b(iD, i3);
            } else {
                Object obj = r60.get(Integer.valueOf(iD));
                iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
            }
            i2 = iIntValue;
        } else if (c0643Nw.w.equals("audio/vnd.dts.uhd;profile=p2")) {
            if (i2 > 10) {
                return null;
            }
        } else if (i2 > this.b) {
            return null;
        }
        int i4 = Lr0.a;
        if (i4 > 28) {
            i = i2;
        } else if (i2 == 7) {
            i = 8;
        } else if (i2 != 3 && i2 != 4 && i2 != 5) {
            i = i2;
        }
        if (i4 <= 26 && "fugu".equals(Lr0.b) && i == 1) {
            i = 2;
        }
        int iP = Lr0.p(i);
        if (iP == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iD), Integer.valueOf(iP));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M6)) {
            return false;
        }
        M6 m6 = (M6) obj;
        return Arrays.equals(this.a, m6.a) && this.b == m6.b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + this.b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", supportedEncodings=" + Arrays.toString(this.a) + "]";
    }
}
