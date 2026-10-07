package o;

import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class OO {
    public static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap b = new HashMap();
    public static int c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Lr0.a < 26 && Lr0.b.equals("R9") && arrayList.size() == 1 && ((EO) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(EO.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new C0419Ff(1, new C0633Nm(9)));
        }
        int i = Lr0.a;
        if (i < 21 && arrayList.size() > 1) {
            String str2 = ((EO) arrayList.get(0)).a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new C0419Ff(1, new C0633Nm(10)));
            }
        }
        if (i >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((EO) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((EO) arrayList.remove(0));
    }

    public static String b(C0643Nw c0643Nw) {
        Pair pairD;
        if ("audio/eac3-joc".equals(c0643Nw.w)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(c0643Nw.w) || (pairD = d(c0643Nw)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairD.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:151:0x0215  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:289:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:292:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:75:0x0115  */
    /* JADX WARN: Code duplicated, block: B:78:0x011f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Pair d(C0643Nw c0643Nw) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Integer numValueOf;
        int i6;
        Integer num;
        Integer numValueOf2;
        String str = c0643Nw.t;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        boolean zEquals = "video/dolby-vision".equals(c0643Nw.w);
        Pattern pattern = a;
        int i7 = 16;
        int i8 = 3;
        int i9 = 2;
        byte b2 = 6;
        if (zEquals) {
            if (strArrSplit.length < 3) {
                AP.z();
                return null;
            }
            Matcher matcher = pattern.matcher(strArrSplit[1]);
            if (!matcher.matches()) {
                AP.z();
                return null;
            }
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                switch (strGroup) {
                    case "00":
                        num = 1;
                        break;
                    case "01":
                        num = 2;
                        break;
                    case "02":
                        num = 4;
                        break;
                    case "03":
                        num = 8;
                        break;
                    case "04":
                        num = 16;
                        break;
                    case "05":
                        num = 32;
                        break;
                    case "06":
                        num = 64;
                        break;
                    case "07":
                        num = 128;
                        break;
                    case "08":
                        num = 256;
                        break;
                    case "09":
                        num = 512;
                        break;
                    default:
                        num = null;
                        break;
                }
            } else {
                num = null;
            }
            if (num == null) {
                AP.z();
                return null;
            }
            String str2 = strArrSplit[2];
            if (str2 != null) {
                switch (str2.hashCode()) {
                    case 1537:
                        if (!str2.equals("01")) {
                            b2 = -1;
                        } else {
                            b2 = 0;
                        }
                        break;
                    case 1538:
                        if (!str2.equals("02")) {
                            b2 = -1;
                        } else {
                            b2 = 1;
                        }
                        break;
                    case 1539:
                        if (!str2.equals("03")) {
                            b2 = -1;
                        } else {
                            b2 = 2;
                        }
                        break;
                    case 1540:
                        if (!str2.equals("04")) {
                            b2 = -1;
                        } else {
                            b2 = 3;
                        }
                        break;
                    case 1541:
                        if (!str2.equals("05")) {
                            b2 = -1;
                        } else {
                            b2 = 4;
                        }
                        break;
                    case 1542:
                        if (!str2.equals("06")) {
                            b2 = -1;
                        } else {
                            b2 = 5;
                        }
                        break;
                    case 1543:
                        if (!str2.equals("07")) {
                            b2 = -1;
                        }
                        break;
                    case 1544:
                        if (!str2.equals("08")) {
                            b2 = -1;
                        } else {
                            b2 = 7;
                        }
                        break;
                    case 1545:
                        if (!str2.equals("09")) {
                            b2 = -1;
                        } else {
                            b2 = 8;
                        }
                        break;
                    case 1567:
                        if (!str2.equals("10")) {
                            b2 = -1;
                        } else {
                            b2 = 9;
                        }
                        break;
                    case 1568:
                        if (!str2.equals("11")) {
                            b2 = -1;
                        } else {
                            b2 = 10;
                        }
                        break;
                    case 1569:
                        if (!str2.equals("12")) {
                            b2 = -1;
                        } else {
                            b2 = C3285xv.h;
                        }
                        break;
                    case 1570:
                        if (!str2.equals("13")) {
                            b2 = -1;
                        } else {
                            b2 = 12;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                switch (b2) {
                    case 0:
                        numValueOf2 = 1;
                        break;
                    case 1:
                        numValueOf2 = 2;
                        break;
                    case 2:
                        numValueOf2 = 4;
                        break;
                    case 3:
                        numValueOf2 = 8;
                        break;
                    case 4:
                        numValueOf2 = 16;
                        break;
                    case 5:
                        numValueOf2 = 32;
                        break;
                    case 6:
                        numValueOf2 = 64;
                        break;
                    case 7:
                        numValueOf2 = 128;
                        break;
                    case 8:
                        numValueOf2 = 256;
                        break;
                    case 9:
                        numValueOf2 = 512;
                        break;
                    case 10:
                        numValueOf2 = 1024;
                        break;
                    case 11:
                        numValueOf2 = Integer.valueOf(C1672hI.a.g);
                        break;
                    case 12:
                        numValueOf2 = Integer.valueOf(C1672hI.a.f);
                        break;
                    default:
                        numValueOf2 = null;
                        break;
                }
            } else {
                numValueOf2 = null;
            }
            if (numValueOf2 != null) {
                return new Pair(num, numValueOf2);
            }
            AP.z();
            return null;
        }
        String str3 = strArrSplit[0];
        str3.getClass();
        switch (str3) {
            case "av01":
                if (strArrSplit.length < 4) {
                    AP.z();
                } else {
                    try {
                        int i10 = Integer.parseInt(strArrSplit[1]);
                        int i11 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                        int i12 = Integer.parseInt(strArrSplit[3]);
                        if (i10 != 0) {
                            AP.z();
                        } else if (i12 == 8 || i12 == 10) {
                            if (i12 == 8) {
                                i = 1;
                            } else {
                                C1602gf c1602gf = c0643Nw.I;
                                i = (c1602gf == null || !(c1602gf.f796o != null || (i2 = c1602gf.n) == 7 || i2 == 6)) ? 2 : C1672hI.a.f;
                            }
                            switch (i11) {
                                case 0:
                                    i7 = 1;
                                    break;
                                case 1:
                                    i7 = 2;
                                    break;
                                case 2:
                                    i7 = 4;
                                    break;
                                case 3:
                                    i7 = 8;
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    i7 = 32;
                                    break;
                                case 6:
                                    i7 = 64;
                                    break;
                                case 7:
                                    i7 = 128;
                                    break;
                                case 8:
                                    i7 = 256;
                                    break;
                                case 9:
                                    i7 = 512;
                                    break;
                                case 10:
                                    i7 = 1024;
                                    break;
                                case 11:
                                    i7 = C1672hI.a.g;
                                    break;
                                case 12:
                                    i7 = C1672hI.a.f;
                                    break;
                                case 13:
                                    i7 = C1672hI.a.e;
                                    break;
                                case 14:
                                    i7 = 16384;
                                    break;
                                case 15:
                                    i7 = 32768;
                                    break;
                                case 16:
                                    i7 = 65536;
                                    break;
                                case 17:
                                    i7 = 131072;
                                    break;
                                case 18:
                                    i7 = 262144;
                                    break;
                                case 19:
                                    i7 = 524288;
                                    break;
                                case 20:
                                    i7 = 1048576;
                                    break;
                                case 21:
                                    i7 = 2097152;
                                    break;
                                case 22:
                                    i7 = 4194304;
                                    break;
                                case 23:
                                    i7 = 8388608;
                                    break;
                                default:
                                    i7 = -1;
                                    break;
                            }
                            if (i7 != -1) {
                                return new Pair(Integer.valueOf(i), Integer.valueOf(i7));
                            }
                            AP.z();
                        } else {
                            AP.z();
                        }
                    } catch (NumberFormatException unused) {
                        AP.z();
                    }
                }
                return null;
            case "avc1":
            case "avc2":
                if (strArrSplit.length < 2) {
                    AP.z();
                } else {
                    try {
                        if (strArrSplit[1].length() == 6) {
                            i3 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                            i4 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                        } else if (strArrSplit.length >= 3) {
                            i3 = Integer.parseInt(strArrSplit[1]);
                            i4 = Integer.parseInt(strArrSplit[2]);
                        } else {
                            AP.z();
                        }
                        if (i3 == 66) {
                            i9 = 1;
                        } else if (i3 != 77) {
                            if (i3 == 88) {
                                i9 = 4;
                            } else if (i3 == 100) {
                                i9 = 8;
                            } else if (i3 == 110) {
                                i9 = 16;
                            } else if (i3 != 122) {
                                i9 = i3 != 244 ? -1 : 64;
                            } else {
                                i9 = 32;
                            }
                        }
                        if (i9 == -1) {
                            AP.z();
                        } else {
                            switch (i4) {
                                case 10:
                                    i7 = 1;
                                    break;
                                case 11:
                                    i7 = 4;
                                    break;
                                case 12:
                                    i7 = 8;
                                    break;
                                case 13:
                                    break;
                                default:
                                    switch (i4) {
                                        case 20:
                                            i7 = 32;
                                            break;
                                        case 21:
                                            i7 = 64;
                                            break;
                                        case 22:
                                            i7 = 128;
                                            break;
                                        default:
                                            switch (i4) {
                                                case 30:
                                                    i7 = 256;
                                                    break;
                                                case 31:
                                                    i7 = 512;
                                                    break;
                                                case 32:
                                                    i7 = 1024;
                                                    break;
                                                default:
                                                    switch (i4) {
                                                        case C3080vp0.N /* 40 */:
                                                            i7 = C1672hI.a.g;
                                                            break;
                                                        case 41:
                                                            i7 = C1672hI.a.f;
                                                            break;
                                                        case 42:
                                                            i7 = C1672hI.a.e;
                                                            break;
                                                        default:
                                                            switch (i4) {
                                                                case C3080vp0.X /* 50 */:
                                                                    i7 = 16384;
                                                                    break;
                                                                case 51:
                                                                    i7 = 32768;
                                                                    break;
                                                                case C3080vp0.Z /* 52 */:
                                                                    i7 = 65536;
                                                                    break;
                                                                default:
                                                                    i7 = -1;
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            if (i7 != -1) {
                                return new Pair(Integer.valueOf(i9), Integer.valueOf(i7));
                            }
                            AP.z();
                        }
                    } catch (NumberFormatException unused2) {
                        AP.z();
                    }
                }
                return null;
            case "hev1":
            case "hvc1":
                if (strArrSplit.length < 4) {
                    AP.z();
                } else {
                    Matcher matcher2 = pattern.matcher(strArrSplit[1]);
                    if (matcher2.matches()) {
                        String strGroup2 = matcher2.group(1);
                        if ("1".equals(strGroup2)) {
                            i5 = 1;
                        } else if ("2".equals(strGroup2)) {
                            C1602gf c1602gf2 = c0643Nw.I;
                            i5 = (c1602gf2 == null || c1602gf2.n != 6) ? 2 : C1672hI.a.f;
                        } else {
                            AP.z();
                        }
                        String str4 = strArrSplit[3];
                        if (str4 != null) {
                            switch (str4.hashCode()) {
                                case 70821:
                                    if (!str4.equals("H30")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 0;
                                    }
                                    break;
                                case 70914:
                                    if (!str4.equals("H60")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 1;
                                    }
                                    break;
                                case 70917:
                                    if (!str4.equals("H63")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 2;
                                    }
                                    break;
                                case 71007:
                                    if (!str4.equals("H90")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 3;
                                    }
                                    break;
                                case 71010:
                                    if (!str4.equals("H93")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 4;
                                    }
                                    break;
                                case 74665:
                                    if (!str4.equals("L30")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 5;
                                    }
                                    break;
                                case 74758:
                                    if (!str4.equals("L60")) {
                                        b2 = -1;
                                    }
                                    break;
                                case 74761:
                                    if (!str4.equals("L63")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 7;
                                    }
                                    break;
                                case 74851:
                                    if (!str4.equals("L90")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 8;
                                    }
                                    break;
                                case 74854:
                                    if (!str4.equals("L93")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 9;
                                    }
                                    break;
                                case 2193639:
                                    if (!str4.equals("H120")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 10;
                                    }
                                    break;
                                case 2193642:
                                    if (!str4.equals("H123")) {
                                        b2 = -1;
                                    } else {
                                        b2 = C3285xv.h;
                                    }
                                    break;
                                case 2193732:
                                    if (!str4.equals("H150")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 12;
                                    }
                                    break;
                                case 2193735:
                                    if (!str4.equals("H153")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 13;
                                    }
                                    break;
                                case 2193738:
                                    if (!str4.equals("H156")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 14;
                                    }
                                    break;
                                case 2193825:
                                    if (!str4.equals("H180")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 15;
                                    }
                                    break;
                                case 2193828:
                                    if (!str4.equals("H183")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 16;
                                    }
                                    break;
                                case 2193831:
                                    if (!str4.equals("H186")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 17;
                                    }
                                    break;
                                case 2312803:
                                    if (!str4.equals("L120")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 18;
                                    }
                                    break;
                                case 2312806:
                                    if (!str4.equals("L123")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 19;
                                    }
                                    break;
                                case 2312896:
                                    if (!str4.equals("L150")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 20;
                                    }
                                    break;
                                case 2312899:
                                    if (!str4.equals("L153")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 21;
                                    }
                                    break;
                                case 2312902:
                                    if (!str4.equals("L156")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 22;
                                    }
                                    break;
                                case 2312989:
                                    if (!str4.equals("L180")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 23;
                                    }
                                    break;
                                case 2312992:
                                    if (!str4.equals("L183")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 24;
                                    }
                                    break;
                                case 2312995:
                                    if (!str4.equals("L186")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 25;
                                    }
                                    break;
                                default:
                                    b2 = -1;
                                    break;
                            }
                            switch (b2) {
                                case 0:
                                    numValueOf = 2;
                                    break;
                                case 1:
                                    numValueOf = 8;
                                    break;
                                case 2:
                                    numValueOf = 32;
                                    break;
                                case 3:
                                    numValueOf = 128;
                                    break;
                                case 4:
                                    numValueOf = 512;
                                    break;
                                case 5:
                                    numValueOf = 1;
                                    break;
                                case 6:
                                    numValueOf = 4;
                                    break;
                                case 7:
                                    numValueOf = 16;
                                    break;
                                case 8:
                                    numValueOf = 64;
                                    break;
                                case 9:
                                    numValueOf = 256;
                                    break;
                                case 10:
                                    numValueOf = Integer.valueOf(C1672hI.a.g);
                                    break;
                                case 11:
                                    numValueOf = Integer.valueOf(C1672hI.a.e);
                                    break;
                                case 12:
                                    numValueOf = 32768;
                                    break;
                                case 13:
                                    numValueOf = 131072;
                                    break;
                                case 14:
                                    numValueOf = 524288;
                                    break;
                                case 15:
                                    numValueOf = 2097152;
                                    break;
                                case 16:
                                    numValueOf = 8388608;
                                    break;
                                case 17:
                                    numValueOf = 33554432;
                                    break;
                                case 18:
                                    numValueOf = 1024;
                                    break;
                                case 19:
                                    numValueOf = Integer.valueOf(C1672hI.a.f);
                                    break;
                                case 20:
                                    numValueOf = 16384;
                                    break;
                                case 21:
                                    numValueOf = 65536;
                                    break;
                                case 22:
                                    numValueOf = 262144;
                                    break;
                                case 23:
                                    numValueOf = 1048576;
                                    break;
                                case 24:
                                    numValueOf = 4194304;
                                    break;
                                case 25:
                                    numValueOf = 16777216;
                                    break;
                                default:
                                    numValueOf = null;
                                    break;
                            }
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            return new Pair(Integer.valueOf(i5), numValueOf);
                        }
                        AP.z();
                    } else {
                        AP.z();
                    }
                }
                return null;
            case "mp4a":
                if (strArrSplit.length != 3) {
                    AP.z();
                    return null;
                }
                try {
                    if (!"audio/mp4a-latm".equals(IQ.f(Integer.parseInt(strArrSplit[1], 16)))) {
                        return null;
                    }
                    int i13 = Integer.parseInt(strArrSplit[2]);
                    if (i13 == 17) {
                        i8 = 17;
                    } else if (i13 == 20) {
                        i8 = 20;
                    } else if (i13 == 23) {
                        i8 = 23;
                    } else if (i13 == 29) {
                        i8 = 29;
                    } else if (i13 == 39) {
                        i8 = 39;
                    } else if (i13 != 42) {
                        switch (i13) {
                            case 1:
                                i8 = 1;
                                break;
                            case 2:
                                i8 = 2;
                                break;
                            case 3:
                                break;
                            case 4:
                                i8 = 4;
                                break;
                            case 5:
                                i8 = 5;
                                break;
                            case 6:
                                i8 = 6;
                                break;
                            default:
                                i8 = -1;
                                break;
                        }
                    } else {
                        i8 = 42;
                    }
                    if (i8 != -1) {
                        return new Pair(Integer.valueOf(i8), 0);
                    }
                    return null;
                } catch (NumberFormatException unused3) {
                    AP.z();
                    return null;
                }
            case "vp09":
                if (strArrSplit.length < 3) {
                    AP.z();
                    return null;
                }
                try {
                    int i14 = Integer.parseInt(strArrSplit[1]);
                    int i15 = Integer.parseInt(strArrSplit[2]);
                    if (i14 == 0) {
                        i6 = 1;
                    } else if (i14 == 1) {
                        i6 = 2;
                    } else if (i14 != 2) {
                        i6 = i14 != 3 ? -1 : 8;
                    } else {
                        i6 = 4;
                    }
                    if (i6 == -1) {
                        AP.z();
                        return null;
                    }
                    if (i15 == 10) {
                        i7 = 1;
                    } else if (i15 == 11) {
                        i7 = 2;
                    } else if (i15 == 20) {
                        i7 = 4;
                    } else if (i15 == 21) {
                        i7 = 8;
                    } else if (i15 != 30) {
                        if (i15 == 31) {
                            i7 = 32;
                        } else if (i15 == 40) {
                            i7 = 64;
                        } else if (i15 == 41) {
                            i7 = 128;
                        } else if (i15 == 50) {
                            i7 = 256;
                        } else if (i15 != 51) {
                            switch (i15) {
                                case C3080vp0.g0 /* 60 */:
                                    i7 = C1672hI.a.g;
                                    break;
                                case 61:
                                    i7 = C1672hI.a.f;
                                    break;
                                case 62:
                                    i7 = C1672hI.a.e;
                                    break;
                                default:
                                    i7 = -1;
                                    break;
                            }
                        } else {
                            i7 = 512;
                        }
                    }
                    if (i7 != -1) {
                        return new Pair(Integer.valueOf(i6), Integer.valueOf(i7));
                    }
                    AP.z();
                    return null;
                } catch (NumberFormatException unused4) {
                    AP.z();
                    return null;
                }
            default:
                return null;
        }
    }

    public static synchronized List e(String str, boolean z, boolean z2) {
        try {
            KO ko = new KO(str, z, z2);
            HashMap map = b;
            List list = (List) map.get(ko);
            if (list != null) {
                return list;
            }
            int i = Lr0.a;
            ArrayList arrayListF = f(ko, i >= 21 ? new C2295nk0(z, z2) : new C3325yL());
            if (z && arrayListF.isEmpty() && 21 <= i && i <= 23) {
                arrayListF = f(ko, new C3325yL());
                if (!arrayListF.isEmpty()) {
                    String str2 = ((EO) arrayListF.get(0)).a;
                    AP.z();
                }
            }
            a(str, arrayListF);
            AbstractC0985aF abstractC0985aFL = AbstractC0985aF.l(arrayListF);
            map.put(ko, abstractC0985aFL);
            return abstractC0985aFL;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    public static ArrayList f(KO ko, MO mo) throws LO {
        String strC;
        int i;
        boolean z;
        boolean z2;
        boolean zIsHardwareAccelerated;
        boolean zIsVendor;
        KO ko2 = ko;
        try {
            ArrayList arrayList = new ArrayList();
            String str = ko2.a;
            int iH = mo.h();
            boolean zL = mo.l();
            int i2 = 0;
            while (i2 < iH) {
                MediaCodecInfo mediaCodecInfoA = mo.a(i2);
                int i3 = Lr0.a;
                if (i3 < 29 || !mediaCodecInfoA.isAlias()) {
                    String name = mediaCodecInfoA.getName();
                    if (g(mediaCodecInfoA, name, zL, str) && (strC = c(mediaCodecInfoA, name, str)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoA.getCapabilitiesForType(strC);
                            boolean zJ = mo.j("tunneled-playback", strC, capabilitiesForType);
                            boolean zF = mo.f("tunneled-playback", capabilitiesForType);
                            boolean z3 = ko2.c;
                            if ((z3 || !zF) && (!z3 || zJ)) {
                                boolean zJ2 = mo.j("secure-playback", strC, capabilitiesForType);
                                boolean zF2 = mo.f("secure-playback", capabilitiesForType);
                                boolean z4 = ko2.b;
                                if ((z4 || !zF2) && (!z4 || zJ2)) {
                                    if (i3 >= 29) {
                                        zIsHardwareAccelerated = mediaCodecInfoA.isHardwareAccelerated();
                                        z2 = true;
                                    } else {
                                        z2 = true;
                                        zIsHardwareAccelerated = !h(mediaCodecInfoA, str);
                                    }
                                    boolean zH = h(mediaCodecInfoA, str);
                                    if (i3 >= 29) {
                                        zIsVendor = mediaCodecInfoA.isVendor();
                                    } else {
                                        String strI = U9.I(mediaCodecInfoA.getName());
                                        if (strI.startsWith("omx.google.") || strI.startsWith("c2.android.") || strI.startsWith("c2.google.")) {
                                            z2 = false;
                                        }
                                        zIsVendor = z2;
                                    }
                                    if (!(zL && z4 == zJ2) && (zL || z4)) {
                                        i = i2;
                                        z = zL;
                                        if (!z && zJ2) {
                                            arrayList.add(EO.h(name + ".secure", str, strC, capabilitiesForType, zIsHardwareAccelerated, zH, zIsVendor, true));
                                            return arrayList;
                                        }
                                    } else {
                                        i = i2;
                                        z = zL;
                                        try {
                                            arrayList.add(EO.h(name, str, strC, capabilitiesForType, zIsHardwareAccelerated, zH, zIsVendor, false));
                                        } catch (Exception e) {
                                            e = e;
                                            if (Lr0.a > 23 || arrayList.isEmpty()) {
                                                AP.f();
                                                throw e;
                                            }
                                            AP.f();
                                        }
                                    }
                                } else {
                                    i = i2;
                                    z = zL;
                                }
                            } else {
                                i = i2;
                                z = zL;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            i = i2;
                            z = zL;
                        }
                    } else {
                        i = i2;
                        z = zL;
                    }
                } else {
                    i = i2;
                    z = zL;
                }
                i2 = i + 1;
                ko2 = ko;
                zL = z;
            }
            return arrayList;
        } catch (Exception e3) {
            throw new LO("Failed to query underlying media codecs", e3);
        }
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = Lr0.a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = Lr0.b;
            if ("a70".equals(str3) || ("Xiaomi".equals(Lr0.c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = Lr0.b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = Lr0.b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Lr0.c))) {
            String str6 = Lr0.b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(Lr0.c)) {
            String str7 = Lr0.b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i <= 19 && Lr0.b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        if (Lr0.a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (IQ.k(str)) {
            return true;
        }
        String strI = U9.I(mediaCodecInfo.getName());
        if (strI.startsWith("arc.")) {
            return false;
        }
        if (strI.startsWith("omx.google.") || strI.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strI.startsWith("omx.sec.") && strI.contains(".sw.")) || strI.equals("omx.qcom.video.decoder.hevcswvdec") || strI.startsWith("c2.android.") || strI.startsWith("c2.google.")) {
            return true;
        }
        return (strI.startsWith("omx.") || strI.startsWith("c2.")) ? false : true;
    }

    public static int i() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        if (c == -1) {
            int iMax = 0;
            List listE = e("video/avc", false, false);
            EO eo = listE.isEmpty() ? null : (EO) listE.get(0);
            if (eo != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = eo.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i2 = codecProfileLevelArr[iMax].level;
                    if (i2 != 1 && i2 != 2) {
                        switch (i2) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case 64:
                                i = 202752;
                                break;
                            case 128:
                            case 256:
                                i = 414720;
                                break;
                            case 512:
                                i = 921600;
                                break;
                            case 1024:
                                i = 1310720;
                                break;
                            case C1672hI.a.g /* 2048 */:
                            case C1672hI.a.f /* 4096 */:
                                i = 2097152;
                                break;
                            case C1672hI.a.e /* 8192 */:
                                i = 2228224;
                                break;
                            case 16384:
                                i = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i = 35651584;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    iMax2 = Math.max(i, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, Lr0.a >= 21 ? 345600 : 172800);
            }
            c = iMax;
        }
        return c;
    }
}
