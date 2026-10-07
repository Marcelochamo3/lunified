package o;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import io.sentry.C0032c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class SO extends IO {
    public static boolean A1;
    public static final int[] y1 = {1920, 1600, 1440, Qd0.j, 960, 854, 640, 540, 480};
    public static boolean z1;
    public final Context Q0;
    public final Xs0 R0;
    public final C1364e7 S0;
    public final C0032c T0;
    public final long U0;
    public final int V0;
    public final boolean W0;
    public C2712s0 X0;
    public boolean Y0;
    public boolean Z0;
    public Surface a1;
    public UY b1;
    public boolean c1;
    public int d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public long h1;
    public long i1;
    public long j1;
    public int k1;
    public int l1;
    public int m1;
    public long n1;
    public long o1;
    public long p1;
    public int q1;
    public long r1;
    public C1045at0 s1;
    public C1045at0 t1;
    public boolean u1;
    public int v1;
    public RO w1;
    public Ss0 x1;

    public SO(Context context, C2102ll c2102ll, JO jo, boolean z, Handler handler, SurfaceHolderCallbackC0898Xr surfaceHolderCallbackC0898Xr) {
        super(2, c2102ll, jo, z, 30.0f);
        this.U0 = 5000L;
        this.V0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.Q0 = applicationContext;
        Xs0 xs0 = new Xs0(applicationContext);
        this.R0 = xs0;
        this.S0 = new C1364e7(handler, surfaceHolderCallbackC0898Xr, 1);
        this.T0 = new C0032c(xs0, this);
        this.W0 = "NVIDIA".equals(Lr0.c);
        this.i1 = -9223372036854775807L;
        this.d1 = 1;
        this.s1 = C1045at0.p;
        this.v1 = 0;
        this.t1 = null;
    }

    public static boolean s0(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (SO.class) {
            try {
                if (!z1) {
                    A1 = t0();
                    z1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return A1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:49:0x0097  */
    /* JADX WARN: Code duplicated, block: B:6:0x001b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0111  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean t0() {
        int i = Lr0.a;
        byte b = 7;
        if (i <= 28) {
            String str = Lr0.b;
            str.getClass();
            switch (str) {
                case "dangal":
                case "dangalFHD":
                case "dangalUHD":
                case "oneday":
                case "aquaman":
                case "magnolia":
                case "once":
                case "machuca":
                    return true;
            }
        }
        if (i <= 27 && "HWEML".equals(Lr0.b)) {
            return true;
        }
        String str2 = Lr0.d;
        str2.getClass();
        switch (str2) {
            case "AFTJMST12":
            case "AFTKMST12":
            case "AFTA":
            case "AFTN":
            case "AFTR":
            case "AFTEU011":
            case "AFTEU014":
            case "AFTSO001":
            case "AFTEUFF014":
                return true;
            default:
                if (i <= 26) {
                    String str3 = Lr0.b;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            if (!str3.equals("GIONEE_SWW1609")) {
                                b = -1;
                            } else {
                                b = 0;
                            }
                            break;
                        case -2144781185:
                            if (!str3.equals("GIONEE_SWW1627")) {
                                b = -1;
                            } else {
                                b = 1;
                            }
                            break;
                        case -2144781160:
                            if (!str3.equals("GIONEE_SWW1631")) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        case -2097309513:
                            if (!str3.equals("K50a40")) {
                                b = -1;
                            } else {
                                b = 3;
                            }
                            break;
                        case -2022874474:
                            if (!str3.equals("CP8676_I02")) {
                                b = -1;
                            } else {
                                b = 4;
                            }
                            break;
                        case -1978993182:
                            if (!str3.equals("NX541J")) {
                                b = -1;
                            } else {
                                b = 5;
                            }
                            break;
                        case -1978990237:
                            if (!str3.equals("NX573J")) {
                                b = -1;
                            } else {
                                b = 6;
                            }
                            break;
                        case -1936688988:
                            if (!str3.equals("PGN528")) {
                                b = -1;
                            }
                            break;
                        case -1936688066:
                            if (!str3.equals("PGN610")) {
                                b = -1;
                            } else {
                                b = 8;
                            }
                            break;
                        case -1936688065:
                            if (!str3.equals("PGN611")) {
                                b = -1;
                            } else {
                                b = 9;
                            }
                            break;
                        case -1931988508:
                            if (!str3.equals("AquaPowerM")) {
                                b = -1;
                            } else {
                                b = 10;
                            }
                            break;
                        case -1885099851:
                            if (!str3.equals("RAIJIN")) {
                                b = -1;
                            } else {
                                b = C3285xv.h;
                            }
                            break;
                        case -1696512866:
                            if (!str3.equals("XT1663")) {
                                b = -1;
                            } else {
                                b = 12;
                            }
                            break;
                        case -1680025915:
                            if (!str3.equals("ComioS1")) {
                                b = -1;
                            } else {
                                b = 13;
                            }
                            break;
                        case -1615810839:
                            if (!str3.equals("Phantom6")) {
                                b = -1;
                            } else {
                                b = 14;
                            }
                            break;
                        case -1600724499:
                            if (!str3.equals("pacificrim")) {
                                b = -1;
                            } else {
                                b = 15;
                            }
                            break;
                        case -1554255044:
                            if (!str3.equals("vernee_M5")) {
                                b = -1;
                            } else {
                                b = 16;
                            }
                            break;
                        case -1481772737:
                            if (!str3.equals("panell_dl")) {
                                b = -1;
                            } else {
                                b = 17;
                            }
                            break;
                        case -1481772730:
                            if (!str3.equals("panell_ds")) {
                                b = -1;
                            } else {
                                b = 18;
                            }
                            break;
                        case -1481772729:
                            if (!str3.equals("panell_dt")) {
                                b = -1;
                            } else {
                                b = 19;
                            }
                            break;
                        case -1320080169:
                            if (!str3.equals("GiONEE_GBL7319")) {
                                b = -1;
                            } else {
                                b = 20;
                            }
                            break;
                        case -1217592143:
                            if (!str3.equals("BRAVIA_ATV2")) {
                                b = -1;
                            } else {
                                b = 21;
                            }
                            break;
                        case -1180384755:
                            if (!str3.equals("iris60")) {
                                b = -1;
                            } else {
                                b = 22;
                            }
                            break;
                        case -1139198265:
                            if (!str3.equals("Slate_Pro")) {
                                b = -1;
                            } else {
                                b = 23;
                            }
                            break;
                        case -1052835013:
                            if (!str3.equals("namath")) {
                                b = -1;
                            } else {
                                b = 24;
                            }
                            break;
                        case -993250464:
                            if (!str3.equals("A10-70F")) {
                                b = -1;
                            } else {
                                b = 25;
                            }
                            break;
                        case -993250458:
                            if (!str3.equals("A10-70L")) {
                                b = -1;
                            } else {
                                b = 26;
                            }
                            break;
                        case -965403638:
                            if (!str3.equals("s905x018")) {
                                b = -1;
                            } else {
                                b = 27;
                            }
                            break;
                        case -958336948:
                            if (!str3.equals("ELUGA_Ray_X")) {
                                b = -1;
                            } else {
                                b = 28;
                            }
                            break;
                        case -879245230:
                            if (!str3.equals("tcl_eu")) {
                                b = -1;
                            } else {
                                b = 29;
                            }
                            break;
                        case -842500323:
                            if (!str3.equals("nicklaus_f")) {
                                b = -1;
                            } else {
                                b = 30;
                            }
                            break;
                        case -821392978:
                            if (!str3.equals("A7000-a")) {
                                b = -1;
                            } else {
                                b = 31;
                            }
                            break;
                        case -797483286:
                            if (!str3.equals("SVP-DTV15")) {
                                b = -1;
                            } else {
                                b = 32;
                            }
                            break;
                        case -794946968:
                            if (!str3.equals("watson")) {
                                b = -1;
                            } else {
                                b = 33;
                            }
                            break;
                        case -788334647:
                            if (!str3.equals("whyred")) {
                                b = -1;
                            } else {
                                b = 34;
                            }
                            break;
                        case -782144577:
                            if (!str3.equals("OnePlus5T")) {
                                b = -1;
                            } else {
                                b = 35;
                            }
                            break;
                        case -575125681:
                            if (!str3.equals("GiONEE_CBL7513")) {
                                b = -1;
                            } else {
                                b = 36;
                            }
                            break;
                        case -521118391:
                            if (!str3.equals("GIONEE_GBL7360")) {
                                b = -1;
                            } else {
                                b = 37;
                            }
                            break;
                        case -430914369:
                            if (!str3.equals("Pixi4-7_3G")) {
                                b = -1;
                            } else {
                                b = 38;
                            }
                            break;
                        case -290434366:
                            if (!str3.equals("taido_row")) {
                                b = -1;
                            } else {
                                b = 39;
                            }
                            break;
                        case -282781963:
                            if (!str3.equals("BLACK-1X")) {
                                b = -1;
                            } else {
                                b = 40;
                            }
                            break;
                        case -277133239:
                            if (!str3.equals("Z12_PRO")) {
                                b = -1;
                            } else {
                                b = 41;
                            }
                            break;
                        case -173639913:
                            if (!str3.equals("ELUGA_A3_Pro")) {
                                b = -1;
                            } else {
                                b = 42;
                            }
                            break;
                        case -56598463:
                            if (!str3.equals("woods_fn")) {
                                b = -1;
                            } else {
                                b = 43;
                            }
                            break;
                        case 2126:
                            if (!str3.equals("C1")) {
                                b = -1;
                            } else {
                                b = 44;
                            }
                            break;
                        case 2564:
                            if (!str3.equals("Q5")) {
                                b = -1;
                            } else {
                                b = 45;
                            }
                            break;
                        case 2715:
                            if (!str3.equals("V1")) {
                                b = -1;
                            } else {
                                b = 46;
                            }
                            break;
                        case 2719:
                            if (!str3.equals("V5")) {
                                b = -1;
                            } else {
                                b = 47;
                            }
                            break;
                        case 3091:
                            if (!str3.equals("b5")) {
                                b = -1;
                            } else {
                                b = 48;
                            }
                            break;
                        case 3483:
                            if (!str3.equals("mh")) {
                                b = -1;
                            } else {
                                b = 49;
                            }
                            break;
                        case 73405:
                            if (!str3.equals("JGZ")) {
                                b = -1;
                            } else {
                                b = 50;
                            }
                            break;
                        case 75537:
                            if (!str3.equals("M04")) {
                                b = -1;
                            } else {
                                b = 51;
                            }
                            break;
                        case 75739:
                            if (!str3.equals("M5c")) {
                                b = -1;
                            } else {
                                b = 52;
                            }
                            break;
                        case 76779:
                            if (!str3.equals("MX6")) {
                                b = -1;
                            } else {
                                b = 53;
                            }
                            break;
                        case 78669:
                            if (!str3.equals("P85")) {
                                b = -1;
                            } else {
                                b = 54;
                            }
                            break;
                        case 79305:
                            if (!str3.equals("PLE")) {
                                b = -1;
                            } else {
                                b = 55;
                            }
                            break;
                        case 80618:
                            if (!str3.equals("QX1")) {
                                b = -1;
                            } else {
                                b = 56;
                            }
                            break;
                        case 88274:
                            if (!str3.equals("Z80")) {
                                b = -1;
                            } else {
                                b = 57;
                            }
                            break;
                        case 98846:
                            if (!str3.equals("cv1")) {
                                b = -1;
                            } else {
                                b = 58;
                            }
                            break;
                        case 98848:
                            if (!str3.equals("cv3")) {
                                b = -1;
                            } else {
                                b = 59;
                            }
                            break;
                        case 99329:
                            if (!str3.equals("deb")) {
                                b = -1;
                            } else {
                                b = 60;
                            }
                            break;
                        case 101481:
                            if (!str3.equals("flo")) {
                                b = -1;
                            } else {
                                b = 61;
                            }
                            break;
                        case 1513190:
                            if (!str3.equals("1601")) {
                                b = -1;
                            } else {
                                b = 62;
                            }
                            break;
                        case 1514184:
                            if (!str3.equals("1713")) {
                                b = -1;
                            } else {
                                b = 63;
                            }
                            break;
                        case 1514185:
                            if (!str3.equals("1714")) {
                                b = -1;
                            } else {
                                b = 64;
                            }
                            break;
                        case 2133089:
                            if (!str3.equals("F01H")) {
                                b = -1;
                            } else {
                                b = 65;
                            }
                            break;
                        case 2133091:
                            if (!str3.equals("F01J")) {
                                b = -1;
                            } else {
                                b = 66;
                            }
                            break;
                        case 2133120:
                            if (!str3.equals("F02H")) {
                                b = -1;
                            } else {
                                b = 67;
                            }
                            break;
                        case 2133151:
                            if (!str3.equals("F03H")) {
                                b = -1;
                            } else {
                                b = 68;
                            }
                            break;
                        case 2133182:
                            if (!str3.equals("F04H")) {
                                b = -1;
                            } else {
                                b = 69;
                            }
                            break;
                        case 2133184:
                            if (!str3.equals("F04J")) {
                                b = -1;
                            } else {
                                b = 70;
                            }
                            break;
                        case 2436959:
                            if (!str3.equals("P681")) {
                                b = -1;
                            } else {
                                b = 71;
                            }
                            break;
                        case 2463773:
                            if (!str3.equals("Q350")) {
                                b = -1;
                            } else {
                                b = 72;
                            }
                            break;
                        case 2464648:
                            if (!str3.equals("Q427")) {
                                b = -1;
                            } else {
                                b = 73;
                            }
                            break;
                        case 2689555:
                            if (!str3.equals("XE2X")) {
                                b = -1;
                            } else {
                                b = 74;
                            }
                            break;
                        case 3154429:
                            if (!str3.equals("fugu")) {
                                b = -1;
                            } else {
                                b = 75;
                            }
                            break;
                        case 3284551:
                            if (!str3.equals("kate")) {
                                b = -1;
                            } else {
                                b = 76;
                            }
                            break;
                        case 3351335:
                            if (!str3.equals("mido")) {
                                b = -1;
                            } else {
                                b = 77;
                            }
                            break;
                        case 3386211:
                            if (!str3.equals("p212")) {
                                b = -1;
                            } else {
                                b = 78;
                            }
                            break;
                        case 41325051:
                            if (!str3.equals("MEIZU_M5")) {
                                b = -1;
                            } else {
                                b = 79;
                            }
                            break;
                        case 51349633:
                            if (!str3.equals("601LV")) {
                                b = -1;
                            } else {
                                b = 80;
                            }
                            break;
                        case 51350594:
                            if (!str3.equals("602LV")) {
                                b = -1;
                            } else {
                                b = 81;
                            }
                            break;
                        case 55178625:
                            if (!str3.equals("Aura_Note_2")) {
                                b = -1;
                            } else {
                                b = 82;
                            }
                            break;
                        case 61542055:
                            if (!str3.equals("A1601")) {
                                b = -1;
                            } else {
                                b = 83;
                            }
                            break;
                        case 65355429:
                            if (!str3.equals("E5643")) {
                                b = -1;
                            } else {
                                b = 84;
                            }
                            break;
                        case 66214468:
                            if (!str3.equals("F3111")) {
                                b = -1;
                            } else {
                                b = 85;
                            }
                            break;
                        case 66214470:
                            if (!str3.equals("F3113")) {
                                b = -1;
                            } else {
                                b = 86;
                            }
                            break;
                        case 66214473:
                            if (!str3.equals("F3116")) {
                                b = -1;
                            } else {
                                b = 87;
                            }
                            break;
                        case 66215429:
                            if (!str3.equals("F3211")) {
                                b = -1;
                            } else {
                                b = 88;
                            }
                            break;
                        case 66215431:
                            if (!str3.equals("F3213")) {
                                b = -1;
                            } else {
                                b = 89;
                            }
                            break;
                        case 66215433:
                            if (!str3.equals("F3215")) {
                                b = -1;
                            } else {
                                b = 90;
                            }
                            break;
                        case 66216390:
                            if (!str3.equals("F3311")) {
                                b = -1;
                            } else {
                                b = 91;
                            }
                            break;
                        case 76402249:
                            if (!str3.equals("PRO7S")) {
                                b = -1;
                            } else {
                                b = 92;
                            }
                            break;
                        case 76404105:
                            if (!str3.equals("Q4260")) {
                                b = -1;
                            } else {
                                b = 93;
                            }
                            break;
                        case 76404911:
                            if (!str3.equals("Q4310")) {
                                b = -1;
                            } else {
                                b = 94;
                            }
                            break;
                        case 80963634:
                            if (!str3.equals("V23GB")) {
                                b = -1;
                            } else {
                                b = 95;
                            }
                            break;
                        case 82882791:
                            if (!str3.equals("X3_HK")) {
                                b = -1;
                            } else {
                                b = 96;
                            }
                            break;
                        case 98715550:
                            if (!str3.equals("i9031")) {
                                b = -1;
                            } else {
                                b = 97;
                            }
                            break;
                        case 101370885:
                            if (!str3.equals("l5460")) {
                                b = -1;
                            } else {
                                b = 98;
                            }
                            break;
                        case 102844228:
                            if (!str3.equals("le_x6")) {
                                b = -1;
                            } else {
                                b = 99;
                            }
                            break;
                        case 165221241:
                            if (!str3.equals("A2016a40")) {
                                b = -1;
                            } else {
                                b = 100;
                            }
                            break;
                        case 182191441:
                            if (!str3.equals("CPY83_I00")) {
                                b = -1;
                            } else {
                                b = 101;
                            }
                            break;
                        case 245388979:
                            if (!str3.equals("marino_f")) {
                                b = -1;
                            } else {
                                b = 102;
                            }
                            break;
                        case 287431619:
                            if (!str3.equals("griffin")) {
                                b = -1;
                            } else {
                                b = 103;
                            }
                            break;
                        case 307593612:
                            if (!str3.equals("A7010a48")) {
                                b = -1;
                            } else {
                                b = 104;
                            }
                            break;
                        case 308517133:
                            if (!str3.equals("A7020a48")) {
                                b = -1;
                            } else {
                                b = 105;
                            }
                            break;
                        case 316215098:
                            if (!str3.equals("TB3-730F")) {
                                b = -1;
                            } else {
                                b = 106;
                            }
                            break;
                        case 316215116:
                            if (!str3.equals("TB3-730X")) {
                                b = -1;
                            } else {
                                b = 107;
                            }
                            break;
                        case 316246811:
                            if (!str3.equals("TB3-850F")) {
                                b = -1;
                            } else {
                                b = 108;
                            }
                            break;
                        case 316246818:
                            if (!str3.equals("TB3-850M")) {
                                b = -1;
                            } else {
                                b = 109;
                            }
                            break;
                        case 407160593:
                            if (!str3.equals("Pixi5-10_4G")) {
                                b = -1;
                            } else {
                                b = 110;
                            }
                            break;
                        case 507412548:
                            if (!str3.equals("QM16XE_U")) {
                                b = -1;
                            } else {
                                b = 111;
                            }
                            break;
                        case 793982701:
                            if (!str3.equals("GIONEE_WBL5708")) {
                                b = -1;
                            } else {
                                b = 112;
                            }
                            break;
                        case 794038622:
                            if (!str3.equals("GIONEE_WBL7365")) {
                                b = -1;
                            } else {
                                b = 113;
                            }
                            break;
                        case 794040393:
                            if (!str3.equals("GIONEE_WBL7519")) {
                                b = -1;
                            } else {
                                b = 114;
                            }
                            break;
                        case 835649806:
                            if (!str3.equals("manning")) {
                                b = -1;
                            } else {
                                b = 115;
                            }
                            break;
                        case 917340916:
                            if (!str3.equals("A7000plus")) {
                                b = -1;
                            } else {
                                b = 116;
                            }
                            break;
                        case 958008161:
                            if (!str3.equals("j2xlteins")) {
                                b = -1;
                            } else {
                                b = 117;
                            }
                            break;
                        case 1060579533:
                            if (!str3.equals("panell_d")) {
                                b = -1;
                            } else {
                                b = 118;
                            }
                            break;
                        case 1150207623:
                            if (!str3.equals("LS-5017")) {
                                b = -1;
                            } else {
                                b = 119;
                            }
                            break;
                        case 1176899427:
                            if (!str3.equals("itel_S41")) {
                                b = -1;
                            } else {
                                b = 120;
                            }
                            break;
                        case 1280332038:
                            if (!str3.equals("hwALE-H")) {
                                b = -1;
                            } else {
                                b = 121;
                            }
                            break;
                        case 1306947716:
                            if (!str3.equals("EverStar_S")) {
                                b = -1;
                            } else {
                                b = 122;
                            }
                            break;
                        case 1349174697:
                            if (!str3.equals("htc_e56ml_dtul")) {
                                b = -1;
                            } else {
                                b = 123;
                            }
                            break;
                        case 1522194893:
                            if (!str3.equals("woods_f")) {
                                b = -1;
                            } else {
                                b = 124;
                            }
                            break;
                        case 1691543273:
                            if (!str3.equals("CPH1609")) {
                                b = -1;
                            } else {
                                b = 125;
                            }
                            break;
                        case 1691544261:
                            if (!str3.equals("CPH1715")) {
                                b = -1;
                            } else {
                                b = 126;
                            }
                            break;
                        case 1709443163:
                            if (!str3.equals("iball8735_9806")) {
                                b = -1;
                            } else {
                                b = 127;
                            }
                            break;
                        case 1865889110:
                            if (!str3.equals("santoni")) {
                                b = -1;
                            } else {
                                b = 128;
                            }
                            break;
                        case 1906253259:
                            if (!str3.equals("PB2-670M")) {
                                b = -1;
                            } else {
                                b = 129;
                            }
                            break;
                        case 1977196784:
                            if (!str3.equals("Infinix-X572")) {
                                b = -1;
                            } else {
                                b = 130;
                            }
                            break;
                        case 2006372676:
                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                b = -1;
                            } else {
                                b = 131;
                            }
                            break;
                        case 2019281702:
                            if (!str3.equals("DM-01K")) {
                                b = -1;
                            } else {
                                b = 132;
                            }
                            break;
                        case 2029784656:
                            if (!str3.equals("HWBLN-H")) {
                                b = -1;
                            } else {
                                b = 133;
                            }
                            break;
                        case 2030379515:
                            if (!str3.equals("HWCAM-H")) {
                                b = -1;
                            } else {
                                b = 134;
                            }
                            break;
                        case 2033393791:
                            if (!str3.equals("ASUS_X00AD_2")) {
                                b = -1;
                            } else {
                                b = 135;
                            }
                            break;
                        case 2047190025:
                            if (!str3.equals("ELUGA_Note")) {
                                b = -1;
                            } else {
                                b = 136;
                            }
                            break;
                        case 2047252157:
                            if (!str3.equals("ELUGA_Prim")) {
                                b = -1;
                            } else {
                                b = 137;
                            }
                            break;
                        case 2048319463:
                            if (!str3.equals("HWVNS-H")) {
                                b = -1;
                            } else {
                                b = 138;
                            }
                            break;
                        case 2048855701:
                            if (!str3.equals("HWWAS-H")) {
                                b = -1;
                            } else {
                                b = 139;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        default:
                            str2.getClass();
                            if (!str2.equals("JSN-L21")) {
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case C3080vp0.H /* 34 */:
                        case C3080vp0.I /* 35 */:
                        case C3080vp0.J /* 36 */:
                        case 37:
                        case C3080vp0.L /* 38 */:
                        case 39:
                        case C3080vp0.N /* 40 */:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case C3080vp0.V /* 48 */:
                        case 49:
                        case C3080vp0.X /* 50 */:
                        case 51:
                        case C3080vp0.Z /* 52 */:
                        case 53:
                        case 54:
                        case 55:
                        case C3080vp0.c0 /* 56 */:
                        case C3080vp0.d0 /* 57 */:
                        case C3080vp0.e0 /* 58 */:
                        case C3080vp0.f0 /* 59 */:
                        case C3080vp0.g0 /* 60 */:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case Yu0.a.J /* 66 */:
                        case 67:
                        case Yu0.b.G /* 68 */:
                        case 69:
                        case 70:
                        case 71:
                        case Yu0.b.J /* 72 */:
                        case Yu0.b.K /* 73 */:
                        case Yu0.b.L /* 74 */:
                        case 75:
                        case Yu0.a.N /* 76 */:
                        case 77:
                        case Yu0.a.O /* 78 */:
                        case 79:
                        case 80:
                        case Yu0.b.N /* 81 */:
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case 88:
                        case Yu0.b.O /* 89 */:
                        case 90:
                        case Yu0.b.P /* 91 */:
                        case 92:
                        case Yu0.b.Q /* 93 */:
                        case 94:
                        case Yu0.b.R /* 95 */:
                        case 96:
                        case Yu0.b.S /* 97 */:
                        case Yu0.b.T /* 98 */:
                        case 99:
                        case C3080vp0.n0 /* 100 */:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case C3080vp0.t0 /* 106 */:
                        case 107:
                        case C3080vp0.v0 /* 108 */:
                        case 109:
                        case 110:
                        case Yu0.b.c0 /* 111 */:
                        case 112:
                        case Yu0.b.d0 /* 113 */:
                        case 114:
                        case Yu0.b.e0 /* 115 */:
                        case 116:
                        case Yu0.b.f0 /* 117 */:
                        case 118:
                        case Yu0.b.g0 /* 119 */:
                        case 120:
                        case Yu0.b.h0 /* 121 */:
                        case 122:
                        case Yu0.b.i0 /* 123 */:
                        case 124:
                        case Yu0.b.j0 /* 125 */:
                        case 126:
                        case Yu0.b.k0 /* 127 */:
                        case 128:
                        case Yu0.b.l0 /* 129 */:
                        case Yu0.b.m0 /* 130 */:
                        case Yu0.b.n0 /* 131 */:
                        case Yu0.b.o0 /* 132 */:
                        case Yu0.b.p0 /* 133 */:
                        case Yu0.b.q0 /* 134 */:
                        case Yu0.b.r0 /* 135 */:
                        case Yu0.b.s0 /* 136 */:
                        case Yu0.b.t0 /* 137 */:
                        case Yu0.b.u0 /* 138 */:
                        case Yu0.b.v0 /* 139 */:
                            return true;
                    }
                }
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    public static int u0(EO eo, C0643Nw c0643Nw) {
        int i;
        int iIntValue;
        int i2 = c0643Nw.B;
        if (i2 == -1 || (i = c0643Nw.C) == -1) {
            return -1;
        }
        String str = c0643Nw.w;
        if ("video/dolby-vision".equals(str)) {
            Pair pairD = OO.d(c0643Nw);
            str = (pairD == null || !((iIntValue = ((Integer) pairD.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
        }
        str.getClass();
        switch (str) {
            case "video/3gpp":
            case "video/av01":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                return ((i2 * i) * 3) / 4;
            case "video/hevc":
                return Math.max(2097152, ((i2 * i) * 3) / 4);
            case "video/avc":
                String str2 = Lr0.d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(Lr0.c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && eo.f)))) {
                    return -1;
                }
                return ((Lr0.g(i, 16) * Lr0.g(i2, 16)) * 768) / 4;
            case "video/x-vnd.on2.vp9":
                return ((i2 * i) * 3) / 8;
            default:
                return -1;
        }
    }

    public static List v0(Context context, JO jo, C0643Nw c0643Nw, boolean z, boolean z2) {
        List listD;
        List listD2;
        String str = c0643Nw.w;
        if (str == null) {
            XE xe = AbstractC0985aF.m;
            return M60.p;
        }
        if (Lr0.a >= 26 && "video/dolby-vision".equals(str) && !QO.a(context)) {
            String strB = OO.b(c0643Nw);
            if (strB == null) {
                XE xe2 = AbstractC0985aF.m;
                listD2 = M60.p;
            } else {
                listD2 = jo.d(strB, z, z2);
            }
            if (!listD2.isEmpty()) {
                return listD2;
            }
        }
        Pattern pattern = OO.a;
        List listD3 = jo.d(c0643Nw.w, z, z2);
        String strB2 = OO.b(c0643Nw);
        if (strB2 == null) {
            XE xe3 = AbstractC0985aF.m;
            listD = M60.p;
        } else {
            listD = jo.d(strB2, z, z2);
        }
        XE xe4 = AbstractC0985aF.m;
        WE we = new WE();
        we.d(listD3);
        we.d(listD);
        return we.g();
    }

    public static int w0(EO eo, C0643Nw c0643Nw) {
        if (c0643Nw.x == -1) {
            return u0(eo, c0643Nw);
        }
        List list = c0643Nw.y;
        int size = list.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += ((byte[]) list.get(i)).length;
        }
        return c0643Nw.x + length;
    }

    public final void A0(InterfaceC3328yO interfaceC3328yO, int i) {
        Pu0.c("releaseOutputBuffer");
        interfaceC3328yO.f(i, true);
        Pu0.i();
        this.L0.e++;
        this.l1 = 0;
        this.T0.getClass();
        this.o1 = SystemClock.elapsedRealtime() * 1000;
        z0(this.s1);
        y0();
    }

    @Override // o.IO
    public final C0708Qj B(EO eo, C0643Nw c0643Nw, C0643Nw c0643Nw2) {
        C0708Qj c0708QjB = eo.b(c0643Nw, c0643Nw2);
        C2712s0 c2712s0 = this.X0;
        int i = c2712s0.a;
        int i2 = c0643Nw2.B;
        int i3 = c0708QjB.e;
        if (i2 > i || c0643Nw2.C > c2712s0.b) {
            i3 |= 256;
        }
        if (w0(eo, c0643Nw2) > this.X0.c) {
            i3 |= 64;
        }
        int i4 = i3;
        return new C0708Qj(eo.a, c0643Nw, c0643Nw2, i4 != 0 ? 0 : c0708QjB.d, i4);
    }

    public final void B0(InterfaceC3328yO interfaceC3328yO, int i, long j) {
        Pu0.c("releaseOutputBuffer");
        interfaceC3328yO.o(i, j);
        Pu0.i();
        this.L0.e++;
        this.l1 = 0;
        this.T0.getClass();
        this.o1 = SystemClock.elapsedRealtime() * 1000;
        z0(this.s1);
        y0();
    }

    @Override // o.IO
    public final BO C(IllegalStateException illegalStateException, EO eo) {
        Surface surface = this.a1;
        PO po = new PO(illegalStateException, eo);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return po;
    }

    public final boolean C0(long j, long j2) {
        boolean z = this.r == 2;
        boolean z2 = this.g1 ? !this.e1 : z || this.f1;
        long jElapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.o1;
        if (this.i1 != -9223372036854775807L || j < this.M0.b) {
            return false;
        }
        return z2 || (z && j2 < -30000 && jElapsedRealtime > 100000);
    }

    public final boolean D0(EO eo) {
        return Lr0.a >= 23 && !this.u1 && !s0(eo.a) && (!eo.f || UY.e(this.Q0));
    }

    public final void E0(InterfaceC3328yO interfaceC3328yO, int i) {
        Pu0.c("skipVideoBuffer");
        interfaceC3328yO.f(i, false);
        Pu0.i();
        this.L0.f++;
    }

    public final void F0(int i, int i2) {
        C0579Lj c0579Lj = this.L0;
        c0579Lj.h += i;
        int i3 = i + i2;
        c0579Lj.g += i3;
        this.k1 += i3;
        int i4 = this.l1 + i3;
        this.l1 = i4;
        c0579Lj.i = Math.max(i4, c0579Lj.i);
        int i5 = this.V0;
        if (i5 <= 0 || this.k1 < i5) {
            return;
        }
        x0();
    }

    public final void G0(long j) {
        C0579Lj c0579Lj = this.L0;
        c0579Lj.k += j;
        c0579Lj.l++;
        this.p1 += j;
        this.q1++;
    }

    @Override // o.IO
    public final boolean K() {
        return this.u1 && Lr0.a < 23;
    }

    @Override // o.IO
    public final float L(float f, C0643Nw[] c0643NwArr) {
        float fMax = -1.0f;
        for (C0643Nw c0643Nw : c0643NwArr) {
            float f2 = c0643Nw.D;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // o.IO
    public final ArrayList M(JO jo, C0643Nw c0643Nw, boolean z) {
        List listV0 = v0(this.Q0, jo, c0643Nw, z, this.u1);
        Pattern pattern = OO.a;
        ArrayList arrayList = new ArrayList(listV0);
        Collections.sort(arrayList, new C0419Ff(1, new C2278nc(18, c0643Nw)));
        return arrayList;
    }

    @Override // o.IO
    public final C3134wO N(EO eo, C0643Nw c0643Nw, MediaCrypto mediaCrypto, float f) {
        C1602gf c1602gf;
        C2712s0 c2712s0;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Point point2;
        boolean z;
        Pair pairD;
        int iU0;
        UY uy = this.b1;
        if (uy != null && uy.l != eo.f) {
            if (this.a1 == uy) {
                this.a1 = null;
            }
            uy.release();
            this.b1 = null;
        }
        String str = eo.c;
        C0643Nw[] c0643NwArr = this.t;
        c0643NwArr.getClass();
        int iMax = c0643Nw.B;
        int iW0 = w0(eo, c0643Nw);
        int length = c0643NwArr.length;
        float f2 = c0643Nw.D;
        int i = c0643Nw.B;
        C1602gf c1602gf2 = c0643Nw.I;
        int i2 = c0643Nw.C;
        if (length == 1) {
            if (iW0 != -1 && (iU0 = u0(eo, c0643Nw)) != -1) {
                iW0 = Math.min((int) (iW0 * 1.5f), iU0);
            }
            c2712s0 = new C2712s0(iMax, i2, iW0);
            c1602gf = c1602gf2;
        } else {
            int iMax2 = i2;
            int i3 = 0;
            boolean z2 = false;
            for (int length2 = c0643NwArr.length; i3 < length2; length2 = length2) {
                C0643Nw c0643Nw2 = c0643NwArr[i3];
                C0643Nw[] c0643NwArr2 = c0643NwArr;
                if (c1602gf2 != null && c0643Nw2.I == null) {
                    C0617Mw c0617MwA = c0643Nw2.a();
                    c0617MwA.w = c1602gf2;
                    c0643Nw2 = new C0643Nw(c0617MwA);
                }
                if (eo.b(c0643Nw, c0643Nw2).d != 0) {
                    int i4 = c0643Nw2.C;
                    int i5 = c0643Nw2.B;
                    z2 |= i5 == -1 || i4 == -1;
                    iMax = Math.max(iMax, i5);
                    iMax2 = Math.max(iMax2, i4);
                    iW0 = Math.max(iW0, w0(eo, c0643Nw2));
                }
                i3++;
                c0643NwArr = c0643NwArr2;
            }
            if (z2) {
                AP.z();
                boolean z3 = i2 > i;
                int i6 = z3 ? i2 : i;
                int i7 = z3 ? i : i2;
                float f3 = i7 / i6;
                int[] iArr = y1;
                c1602gf = c1602gf2;
                int i8 = 0;
                while (true) {
                    if (i8 < 9) {
                        int i9 = iArr[i8];
                        int[] iArr2 = iArr;
                        int i10 = (int) (i9 * f3);
                        if (i9 > i6 && i10 > i7) {
                            int i11 = i6;
                            int i12 = i7;
                            if (Lr0.a < 21) {
                                f3 = f3;
                                try {
                                    int iG = Lr0.g(i9, 16) * 16;
                                    int iG2 = Lr0.g(i10, 16) * 16;
                                    if (iG * iG2 <= OO.i()) {
                                        int i13 = z3 ? iG2 : iG;
                                        if (!z3) {
                                            iG = iG2;
                                        }
                                        point = new Point(i13, iG);
                                        break;
                                    }
                                    i8++;
                                    iArr = iArr2;
                                    i6 = i11;
                                    i7 = i12;
                                    f3 = f3;
                                } catch (LO unused) {
                                    point = null;
                                    break;
                                }
                            } else {
                                int i14 = z3 ? i10 : i9;
                                if (!z3) {
                                    i9 = i10;
                                }
                                MediaCodecInfo.CodecCapabilities codecCapabilities = eo.d;
                                if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                    point2 = null;
                                } else {
                                    int widthAlignment = videoCapabilities.getWidthAlignment();
                                    int heightAlignment = videoCapabilities.getHeightAlignment();
                                    point2 = new Point(Lr0.g(i14, widthAlignment) * widthAlignment, Lr0.g(i9, heightAlignment) * heightAlignment);
                                }
                                Point point3 = point2;
                                if (eo.f(point2.x, point2.y, f2)) {
                                    point = point3;
                                    break;
                                }
                                i8++;
                                iArr = iArr2;
                                i6 = i11;
                                i7 = i12;
                                f3 = f3;
                            }
                        }
                    }
                    point = null;
                    break;
                }
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    C0617Mw c0617MwA2 = c0643Nw.a();
                    c0617MwA2.p = iMax;
                    c0617MwA2.q = iMax2;
                    iW0 = Math.max(iW0, u0(eo, new C0643Nw(c0617MwA2)));
                    AP.z();
                }
            } else {
                c1602gf = c1602gf2;
            }
            c2712s0 = new C2712s0(iMax, iMax2, iW0);
        }
        this.X0 = c2712s0;
        int i15 = this.u1 ? this.v1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i);
        mediaFormat.setInteger("height", i2);
        AbstractC1370eA.N(mediaFormat, c0643Nw.y);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        AbstractC1370eA.F(mediaFormat, "rotation-degrees", c0643Nw.E);
        if (c1602gf != null) {
            C1602gf c1602gf3 = c1602gf;
            AbstractC1370eA.F(mediaFormat, "color-transfer", c1602gf3.n);
            AbstractC1370eA.F(mediaFormat, "color-standard", c1602gf3.l);
            AbstractC1370eA.F(mediaFormat, "color-range", c1602gf3.m);
            byte[] bArr = c1602gf3.f796o;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c0643Nw.w) && (pairD = OO.d(c0643Nw)) != null) {
            AbstractC1370eA.F(mediaFormat, "profile", ((Integer) pairD.first).intValue());
        }
        mediaFormat.setInteger("max-width", c2712s0.a);
        mediaFormat.setInteger("max-height", c2712s0.b);
        AbstractC1370eA.F(mediaFormat, "max-input-size", c2712s0.c);
        if (Lr0.a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.W0) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i15 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i15);
        }
        if (this.a1 == null) {
            if (!D0(eo)) {
                throw new IllegalStateException();
            }
            if (this.b1 == null) {
                this.b1 = UY.f(this.Q0, eo.f);
            }
            this.a1 = this.b1;
        }
        this.T0.getClass();
        return new C3134wO(eo, mediaFormat, c0643Nw, this.a1, mediaCrypto);
    }

    @Override // o.IO
    public final void O(C0656Oj c0656Oj) {
        if (this.Z0) {
            ByteBuffer byteBuffer = c0656Oj.r;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        InterfaceC3328yO interfaceC3328yO = this.U;
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        interfaceC3328yO.m(bundle);
                    }
                }
            }
        }
    }

    @Override // o.IO
    public final void S(Exception exc) {
        AP.g("Video codec error", exc);
        C1364e7 c1364e7 = this.S0;
        Handler handler = c1364e7.b;
        if (handler != null) {
            handler.post(new O3(c1364e7, 23, exc));
        }
    }

    @Override // o.IO
    public final void T(long j, long j2, String str) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        C1364e7 c1364e7 = this.S0;
        Handler handler = c1364e7.b;
        if (handler != null) {
            handler.post(new Y6(c1364e7, str, j, j2, 1));
        }
        this.Y0 = s0(str);
        EO eo = this.b0;
        eo.getClass();
        boolean z = false;
        if (Lr0.a >= 29 && "video/x-vnd.on2.vp9".equals(eo.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = eo.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z = true;
                    break;
                }
            }
        }
        this.Z0 = z;
        int i = Lr0.a;
        if (i >= 23 && this.u1) {
            InterfaceC3328yO interfaceC3328yO = this.U;
            interfaceC3328yO.getClass();
            this.w1 = new RO(this, interfaceC3328yO);
        }
        Context context = ((SO) this.T0.c).Q0;
        if (i >= 29) {
            int i2 = context.getApplicationContext().getApplicationInfo().targetSdkVersion;
        }
    }

    @Override // o.IO
    public final void U(String str) {
        C1364e7 c1364e7 = this.S0;
        Handler handler = c1364e7.b;
        if (handler != null) {
            handler.post(new O3(c1364e7, 22, str));
        }
    }

    @Override // o.IO
    public final C0708Qj V(C2994uv c2994uv) throws Lr {
        C0708Qj c0708QjV = super.V(c2994uv);
        C0643Nw c0643Nw = (C0643Nw) c2994uv.n;
        C1364e7 c1364e7 = this.S0;
        Handler handler = c1364e7.b;
        if (handler != null) {
            handler.post(new RunnableC1169c7(c1364e7, c0643Nw, c0708QjV, 10));
        }
        return c0708QjV;
    }

    @Override // o.IO
    public final void W(C0643Nw c0643Nw, MediaFormat mediaFormat) {
        int integer;
        int i;
        InterfaceC3328yO interfaceC3328yO = this.U;
        if (interfaceC3328yO != null) {
            interfaceC3328yO.g(this.d1);
        }
        if (this.u1) {
            i = c0643Nw.B;
            integer = c0643Nw.C;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = c0643Nw.F;
        boolean z2 = Lr0.a >= 21;
        C0032c c0032c = this.T0;
        int i2 = c0643Nw.E;
        if (!z2) {
            c0032c.getClass();
        } else if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            i2 = 0;
            int i3 = integer;
            integer = i;
            i = i3;
        } else {
            i2 = 0;
        }
        this.s1 = new C1045at0(f, i, integer, i2);
        float f2 = c0643Nw.D;
        Xs0 xs0 = this.R0;
        xs0.f = f2;
        C2413ov c2413ov = xs0.a;
        c2413ov.a.c();
        c2413ov.b.c();
        c2413ov.c = false;
        c2413ov.d = -9223372036854775807L;
        c2413ov.e = 0;
        xs0.d();
        c0032c.getClass();
    }

    @Override // o.IO
    public final void Y(long j) {
        super.Y(j);
        if (this.u1) {
            return;
        }
        this.m1--;
    }

    @Override // o.IO
    public final void Z() {
        r0();
    }

    @Override // o.IO
    public final void a0(C0656Oj c0656Oj) {
        boolean z = this.u1;
        if (!z) {
            this.m1++;
        }
        if (Lr0.a >= 23 || !z) {
            return;
        }
        long j = c0656Oj.q;
        q0(j);
        z0(this.s1);
        this.L0.e++;
        y0();
        Y(j);
    }

    @Override // o.IO
    public final void b0(C0643Nw c0643Nw) throws Lr {
        int i;
        C0032c c0032c = this.T0;
        c0032c.getClass();
        long j = this.M0.b;
        if (!c0032c.b) {
            return;
        }
        if (((CopyOnWriteArrayList) c0032c.d) == null) {
            c0032c.b = false;
            return;
        }
        Lr0.n(null);
        c0032c.getClass();
        C1602gf c1602gf = c0643Nw.I;
        SO so = (SO) c0032c.c;
        so.getClass();
        try {
            if (c1602gf != null) {
                int i2 = c1602gf.n;
                if (i2 == 7 || i2 == 6) {
                    if (i2 == 7) {
                        Pair.create(c1602gf, new C1602gf(c1602gf.l, c1602gf.m, 6, c1602gf.f796o));
                    } else {
                        Pair.create(c1602gf, c1602gf);
                    }
                }
                if (Lr0.a < 21 || (i = c0643Nw.E) == 0) {
                    AbstractC2506pt.D();
                    Object objInvoke = AbstractC2506pt.l.invoke(AbstractC2506pt.k.newInstance(null), null);
                    objInvoke.getClass();
                    AbstractC1674hK.v(objInvoke);
                    throw null;
                }
                AbstractC2506pt.D();
                Object objNewInstance = AbstractC2506pt.h.newInstance(null);
                AbstractC2506pt.i.invoke(objNewInstance, Float.valueOf(i));
                Object objInvoke2 = AbstractC2506pt.j.invoke(objNewInstance, null);
                objInvoke2.getClass();
                AbstractC1674hK.v(objInvoke2);
                throw null;
            }
            C1602gf c1602gf2 = C1602gf.q;
            if (Lr0.a < 21) {
            }
            AbstractC2506pt.D();
            Object objInvoke3 = AbstractC2506pt.l.invoke(AbstractC2506pt.k.newInstance(null), null);
            objInvoke3.getClass();
            AbstractC1674hK.v(objInvoke3);
            throw null;
        } catch (Exception e) {
            throw so.e(e, c0643Nw, false, 7000);
        }
        C1602gf c1602gf3 = C1602gf.q;
        Pair.create(c1602gf3, c1602gf3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.yO] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r12v8, types: [o.UY] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.AbstractC1952k8, o.AZ
    public final void c(int i, Object obj) throws Lr {
        ?? F;
        Surface surface;
        Surface surface2;
        Xs0 xs0 = this.R0;
        C0032c c0032c = this.T0;
        if (i != 1) {
            if (i == 7) {
                this.x1 = (Ss0) obj;
                return;
            }
            if (i == 10) {
                int iIntValue = ((Integer) obj).intValue();
                if (this.v1 != iIntValue) {
                    this.v1 = iIntValue;
                    if (this.u1) {
                        f0();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 4) {
                int iIntValue2 = ((Integer) obj).intValue();
                this.d1 = iIntValue2;
                InterfaceC3328yO interfaceC3328yO = this.U;
                if (interfaceC3328yO != null) {
                    interfaceC3328yO.g(iIntValue2);
                    return;
                }
                return;
            }
            if (i == 5) {
                int iIntValue3 = ((Integer) obj).intValue();
                if (xs0.j == iIntValue3) {
                    return;
                }
                xs0.j = iIntValue3;
                xs0.e(true);
                return;
            }
            if (i == 13) {
                obj.getClass();
                List list = (List) obj;
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) c0032c.d;
                if (copyOnWriteArrayList == null) {
                    c0032c.d = new CopyOnWriteArrayList(list);
                    return;
                } else {
                    copyOnWriteArrayList.clear();
                    ((CopyOnWriteArrayList) c0032c.d).addAll(list);
                    return;
                }
            }
            if (i != 14) {
                return;
            }
            obj.getClass();
            C2186me0 c2186me0 = (C2186me0) obj;
            if (c2186me0.a == 0 || c2186me0.b == 0 || (surface2 = this.a1) == null) {
                return;
            }
            Pair pair = (Pair) c0032c.e;
            if (pair != null && ((Surface) pair.first).equals(surface2) && ((C2186me0) ((Pair) c0032c.e).second).equals(c2186me0)) {
                return;
            }
            c0032c.e = Pair.create(surface2, c2186me0);
            return;
        }
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            F = 0;
        }
        if (F == 0) {
            UY uy = this.b1;
            if (uy != null) {
                F = surface;
                F = uy;
            } else {
                EO eo = this.b0;
                if (eo != null && D0(eo)) {
                    F = surface;
                    F = UY.f(this.Q0, eo.f);
                    this.b1 = F;
                }
            }
        }
        F = surface;
        F = surface;
        F = surface;
        Surface surface3 = this.a1;
        C1364e7 c1364e7 = this.S0;
        if (surface3 == F) {
            if (F == 0 || F == this.b1) {
                return;
            }
            C1045at0 c1045at0 = this.t1;
            if (c1045at0 != null) {
                c1364e7.c(c1045at0);
            }
            if (this.c1) {
                Surface surface4 = this.a1;
                Handler handler = c1364e7.b;
                if (handler != null) {
                    handler.post(new io.sentry.android.replay.capture.k(c1364e7, surface4, SystemClock.elapsedRealtime(), 2));
                    return;
                }
                return;
            }
            return;
        }
        this.a1 = F;
        xs0.getClass();
        ?? r11 = F instanceof UY ? 0 : F;
        if (xs0.e != r11) {
            xs0.b();
            xs0.e = r11;
            xs0.e(true);
        }
        this.c1 = false;
        int i2 = this.r;
        ?? r0 = this.U;
        if (r0 != 0) {
            c0032c.getClass();
            if (Lr0.a < 23 || F == 0 || this.Y0) {
                f0();
                Q();
            } else {
                r0.l(F);
            }
        }
        if (F == 0 || F == this.b1) {
            this.t1 = null;
            r0();
            c0032c.getClass();
            return;
        }
        C1045at0 c1045at1 = this.t1;
        if (c1045at1 != null) {
            c1364e7.c(c1045at1);
        }
        r0();
        if (i2 == 2) {
            long j = this.U0;
            this.i1 = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
        }
        c0032c.getClass();
    }

    @Override // o.IO
    public final boolean d0(long j, long j2, InterfaceC3328yO interfaceC3328yO, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C0643Nw c0643Nw) throws Lr {
        boolean z3;
        interfaceC3328yO.getClass();
        if (this.h1 == -9223372036854775807L) {
            this.h1 = j;
        }
        long j4 = this.n1;
        C0032c c0032c = this.T0;
        Xs0 xs0 = this.R0;
        if (j3 != j4) {
            c0032c.getClass();
            xs0.c(j3);
            this.n1 = j3;
        }
        long j5 = j3 - this.M0.b;
        if (z && !z2) {
            E0(interfaceC3328yO, i);
            return true;
        }
        boolean z4 = this.r == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j6 = (long) ((j3 - j) / ((double) this.S));
        if (z4) {
            j6 -= jElapsedRealtime - j2;
        }
        if (this.a1 == this.b1) {
            if (j6 >= -30000) {
                return false;
            }
            E0(interfaceC3328yO, i);
            G0(j6);
            return true;
        }
        if (C0(j, j6)) {
            c0032c.getClass();
            c0032c.getClass();
            long jNanoTime = System.nanoTime();
            Ss0 ss0 = this.x1;
            if (ss0 != null) {
                ss0.b(j5, jNanoTime, c0643Nw, this.W);
            }
            if (Lr0.a >= 21) {
                B0(interfaceC3328yO, i, jNanoTime);
            } else {
                A0(interfaceC3328yO, i);
            }
            G0(j6);
            return true;
        }
        if (!z4 || j == this.h1) {
            return false;
        }
        long jNanoTime2 = System.nanoTime();
        long jA = xs0.a((j6 * 1000) + jNanoTime2);
        c0032c.getClass();
        long j7 = (jA - jNanoTime2) / 1000;
        boolean z5 = this.i1 != -9223372036854775807L;
        if (j7 < -500000 && !z2) {
            D90 d90 = this.s;
            d90.getClass();
            int iF = d90.f(j - this.u);
            if (iF != 0) {
                if (z5) {
                    C0579Lj c0579Lj = this.L0;
                    c0579Lj.d += iF;
                    c0579Lj.f += this.m1;
                } else {
                    this.L0.j++;
                    F0(iF, this.m1);
                }
                if (!I()) {
                    return false;
                }
                Q();
                return false;
            }
        }
        if (j7 < -30000 && !z2) {
            if (z5) {
                E0(interfaceC3328yO, i);
                z3 = true;
            } else {
                Pu0.c("dropVideoBuffer");
                interfaceC3328yO.f(i, false);
                Pu0.i();
                z3 = true;
                F0(0, 1);
            }
            G0(j7);
            return z3;
        }
        if (Lr0.a >= 21) {
            if (j7 < 50000) {
                if (jA == this.r1) {
                    E0(interfaceC3328yO, i);
                } else {
                    Ss0 ss1 = this.x1;
                    if (ss1 != null) {
                        ss1.b(j5, jA, c0643Nw, this.W);
                    }
                    B0(interfaceC3328yO, i, jA);
                }
                G0(j7);
                this.r1 = jA;
                return true;
            }
        } else if (j7 < 30000) {
            if (j7 > 11000) {
                try {
                    Thread.sleep((j7 - 10000) / 1000);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            Ss0 ss2 = this.x1;
            if (ss2 != null) {
                ss2.b(j5, jA, c0643Nw, this.W);
            }
            A0(interfaceC3328yO, i);
            G0(j7);
            return true;
        }
        return false;
    }

    @Override // o.AbstractC1952k8
    public final String h() {
        return "MediaCodecVideoRenderer";
    }

    @Override // o.IO
    public final void h0() {
        super.h0();
        this.m1 = 0;
    }

    @Override // o.AbstractC1952k8
    public final boolean j() {
        boolean z = this.H0;
        this.T0.getClass();
        return z;
    }

    @Override // o.IO, o.AbstractC1952k8
    public final boolean k() {
        UY uy;
        if (super.k()) {
            this.T0.getClass();
            if (this.e1 || (((uy = this.b1) != null && this.a1 == uy) || this.U == null || this.u1)) {
                this.i1 = -9223372036854775807L;
                return true;
            }
        }
        if (this.i1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.i1) {
            return true;
        }
        this.i1 = -9223372036854775807L;
        return false;
    }

    @Override // o.IO, o.AbstractC1952k8
    public final void l() {
        C1364e7 c1364e7 = this.S0;
        this.t1 = null;
        r0();
        this.c1 = false;
        this.w1 = null;
        try {
            super.l();
            C0579Lj c0579Lj = this.L0;
            c1364e7.getClass();
            synchronized (c0579Lj) {
            }
            Handler handler = c1364e7.b;
            if (handler != null) {
                handler.post(new Zs0(c1364e7, c0579Lj, 0));
            }
        } finally {
            c1364e7.a(this.L0);
            c1364e7.c(C1045at0.p);
        }
    }

    @Override // o.IO
    public final boolean l0(EO eo) {
        return this.a1 != null || D0(eo);
    }

    @Override // o.AbstractC1952k8
    public final void m(boolean z, boolean z2) {
        this.L0 = new C0579Lj();
        Y60 y60 = this.f862o;
        y60.getClass();
        boolean z3 = y60.a;
        AbstractC0397Ej.f((z3 && this.v1 == 0) ? false : true);
        if (this.u1 != z3) {
            this.u1 = z3;
            f0();
        }
        C0579Lj c0579Lj = this.L0;
        C1364e7 c1364e7 = this.S0;
        Handler handler = c1364e7.b;
        if (handler != null) {
            handler.post(new Zs0(c1364e7, c0579Lj, 1));
        }
        this.f1 = z2;
        this.g1 = false;
    }

    @Override // o.IO, o.AbstractC1952k8
    public final void n(long j, boolean z) throws Lr {
        super.n(j, z);
        this.T0.getClass();
        r0();
        Xs0 xs0 = this.R0;
        xs0.m = 0L;
        xs0.p = -1L;
        xs0.n = -1L;
        this.n1 = -9223372036854775807L;
        this.h1 = -9223372036854775807L;
        this.l1 = 0;
        if (!z) {
            this.i1 = -9223372036854775807L;
        } else {
            long j2 = this.U0;
            this.i1 = j2 > 0 ? SystemClock.elapsedRealtime() + j2 : -9223372036854775807L;
        }
    }

    @Override // o.IO
    public final int n0(JO jo, C0643Nw c0643Nw) {
        boolean z;
        int i = 1;
        int i2 = 0;
        if (!IQ.m(c0643Nw.w)) {
            return AbstractC1674hK.e(0, 0, 0);
        }
        boolean z2 = c0643Nw.z != null;
        Context context = this.Q0;
        List listV0 = v0(context, jo, c0643Nw, z2, false);
        if (z2 && listV0.isEmpty()) {
            listV0 = v0(context, jo, c0643Nw, false, false);
        }
        if (listV0.isEmpty()) {
            return AbstractC1674hK.e(1, 0, 0);
        }
        int i3 = c0643Nw.R;
        if (i3 != 0 && i3 != 2) {
            return AbstractC1674hK.e(2, 0, 0);
        }
        EO eo = (EO) listV0.get(0);
        boolean zD = eo.d(c0643Nw);
        if (!zD) {
            int i4 = 1;
            while (true) {
                if (i4 >= listV0.size()) {
                    z = true;
                    break;
                }
                EO eo2 = (EO) listV0.get(i4);
                if (eo2.d(c0643Nw)) {
                    eo = eo2;
                    z = false;
                    zD = true;
                    break;
                }
                i4++;
            }
        } else {
            z = true;
            break;
        }
        int i5 = zD ? 4 : 3;
        int i6 = eo.e(c0643Nw) ? 16 : 8;
        int i7 = eo.g ? 64 : 0;
        int i8 = z ? 128 : 0;
        if (Lr0.a >= 26 && "video/dolby-vision".equals(c0643Nw.w) && !QO.a(context)) {
            i8 = 256;
        }
        if (zD) {
            List listV1 = v0(context, jo, c0643Nw, z2, true);
            if (!listV1.isEmpty()) {
                Pattern pattern = OO.a;
                ArrayList arrayList = new ArrayList(listV1);
                Collections.sort(arrayList, new C0419Ff(i, new C2278nc(18, c0643Nw)));
                EO eo3 = (EO) arrayList.get(0);
                if (eo3.d(c0643Nw) && eo3.e(c0643Nw)) {
                    i2 = 32;
                }
            }
        }
        return i5 | i6 | i2 | i7 | i8;
    }

    @Override // o.AbstractC1952k8
    public final void p() {
        C0032c c0032c = this.T0;
        try {
            try {
                D();
                f0();
                InterfaceC3465zo interfaceC3465zo = this.O;
                if (interfaceC3465zo != null) {
                    interfaceC3465zo.d(null);
                }
                this.O = null;
                c0032c.getClass();
                UY uy = this.b1;
                if (uy != null) {
                    if (this.a1 == uy) {
                        this.a1 = null;
                    }
                    uy.release();
                    this.b1 = null;
                }
            } catch (Throwable th) {
                InterfaceC3465zo interfaceC3465zo2 = this.O;
                if (interfaceC3465zo2 != null) {
                    interfaceC3465zo2.d(null);
                }
                this.O = null;
                throw th;
            }
        } catch (Throwable th2) {
            c0032c.getClass();
            UY uy2 = this.b1;
            if (uy2 != null) {
                if (this.a1 == uy2) {
                    this.a1 = null;
                }
                uy2.release();
                this.b1 = null;
            }
            throw th2;
        }
    }

    @Override // o.AbstractC1952k8
    public final void q() {
        this.k1 = 0;
        this.j1 = SystemClock.elapsedRealtime();
        this.o1 = SystemClock.elapsedRealtime() * 1000;
        this.p1 = 0L;
        this.q1 = 0;
        Xs0 xs0 = this.R0;
        xs0.d = true;
        xs0.m = 0L;
        xs0.p = -1L;
        xs0.n = -1L;
        Us0 us0 = xs0.b;
        if (us0 != null) {
            Ws0 ws0 = xs0.c;
            ws0.getClass();
            ws0.m.sendEmptyMessage(1);
            us0.f(new C2278nc(26, xs0));
        }
        xs0.e(false);
    }

    @Override // o.AbstractC1952k8
    public final void r() {
        this.i1 = -9223372036854775807L;
        x0();
        int i = this.q1;
        if (i != 0) {
            long j = this.p1;
            C1364e7 c1364e7 = this.S0;
            Handler handler = c1364e7.b;
            if (handler != null) {
                handler.post(new Ys0(c1364e7, j, i));
            }
            this.p1 = 0L;
            this.q1 = 0;
        }
        Xs0 xs0 = this.R0;
        xs0.d = false;
        Us0 us0 = xs0.b;
        if (us0 != null) {
            us0.a();
            Ws0 ws0 = xs0.c;
            ws0.getClass();
            ws0.m.sendEmptyMessage(2);
        }
        xs0.b();
    }

    public final void r0() {
        InterfaceC3328yO interfaceC3328yO;
        this.e1 = false;
        if (Lr0.a < 23 || !this.u1 || (interfaceC3328yO = this.U) == null) {
            return;
        }
        this.w1 = new RO(this, interfaceC3328yO);
    }

    @Override // o.IO, o.AbstractC1952k8
    public final void u(long j, long j2) throws Lr {
        super.u(j, j2);
        this.T0.getClass();
    }

    @Override // o.IO, o.AbstractC1952k8
    public final void x(float f, float f2) throws Lr {
        super.x(f, f2);
        Xs0 xs0 = this.R0;
        xs0.i = f;
        xs0.m = 0L;
        xs0.p = -1L;
        xs0.n = -1L;
        xs0.e(false);
    }

    public final void x0() {
        if (this.k1 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.j1;
            int i = this.k1;
            C1364e7 c1364e7 = this.S0;
            Handler handler = c1364e7.b;
            if (handler != null) {
                handler.post(new Ys0(c1364e7, i, j));
            }
            this.k1 = 0;
            this.j1 = jElapsedRealtime;
        }
    }

    public final void y0() {
        this.g1 = true;
        if (this.e1) {
            return;
        }
        this.e1 = true;
        Surface surface = this.a1;
        C1364e7 c1364e7 = this.S0;
        Handler handler = c1364e7.b;
        if (handler != null) {
            handler.post(new io.sentry.android.replay.capture.k(c1364e7, surface, SystemClock.elapsedRealtime(), 2));
        }
        this.c1 = true;
    }

    public final void z0(C1045at0 c1045at0) {
        if (c1045at0.equals(C1045at0.p) || c1045at0.equals(this.t1)) {
            return;
        }
        this.t1 = c1045at0;
        this.S0.c(c1045at0);
    }
}
