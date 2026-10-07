package o;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class EO {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public EO(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z2;
        this.f = z3;
        this.h = IQ.m(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(Lr0.g(i, widthAlignment) * widthAlignment, Lr0.g(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    public static EO h(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        if (codecCapabilities != null && (i = Lr0.a) >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            if (i <= 22) {
                String str4 = Lr0.d;
                z5 = (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) ? false : true;
            }
        }
        if (codecCapabilities != null && Lr0.a >= 21) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        return new EO(str, str2, str3, codecCapabilities, z, z5, z4 || (codecCapabilities != null && Lr0.a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    public final C0708Qj b(C0643Nw c0643Nw, C0643Nw c0643Nw2) {
        int i = !Lr0.a(c0643Nw.w, c0643Nw2.w) ? 8 : 0;
        if (this.h) {
            if (c0643Nw.E != c0643Nw2.E) {
                i |= 1024;
            }
            if (!this.e && (c0643Nw.B != c0643Nw2.B || c0643Nw.C != c0643Nw2.C)) {
                i |= 512;
            }
            if (!Lr0.a(c0643Nw.I, c0643Nw2.I)) {
                i |= C1672hI.a.g;
            }
            if (Lr0.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !c0643Nw.c(c0643Nw2)) {
                i |= 2;
            }
            if (i == 0) {
                return new C0708Qj(this.a, c0643Nw, c0643Nw2, c0643Nw.c(c0643Nw2) ? 3 : 2, 0);
            }
        } else {
            if (c0643Nw.J != c0643Nw2.J) {
                i |= C1672hI.a.f;
            }
            if (c0643Nw.K != c0643Nw2.K) {
                i |= C1672hI.a.e;
            }
            if (c0643Nw.L != c0643Nw2.L) {
                i |= 16384;
            }
            String str = this.b;
            if (i == 0 && "audio/mp4a-latm".equals(str)) {
                Pair pairD = OO.d(c0643Nw);
                Pair pairD2 = OO.d(c0643Nw2);
                if (pairD != null && pairD2 != null) {
                    int iIntValue = ((Integer) pairD.first).intValue();
                    int iIntValue2 = ((Integer) pairD2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new C0708Qj(this.a, c0643Nw, c0643Nw2, 3, 0);
                    }
                }
            }
            if (!c0643Nw.c(c0643Nw2)) {
                i |= 32;
            }
            if ("audio/opus".equals(str)) {
                i |= 2;
            }
            if (i == 0) {
                return new C0708Qj(this.a, c0643Nw, c0643Nw2, 1, 0);
            }
        }
        return new C0708Qj(this.a, c0643Nw, c0643Nw2, 0, i);
    }

    public final boolean c(C0643Nw c0643Nw, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pairD = OO.d(c0643Nw);
        if (pairD == null) {
            return true;
        }
        int iIntValue = ((Integer) pairD.first).intValue();
        int iIntValue2 = ((Integer) pairD.second).intValue();
        boolean zEquals = "video/dolby-vision".equals(c0643Nw.w);
        int i = 8;
        String str = this.b;
        if (zEquals) {
            if ("video/avc".equals(str)) {
                iIntValue2 = 0;
                iIntValue = 8;
            } else if ("video/hevc".equals(str)) {
                iIntValue2 = 0;
                iIntValue = 2;
            }
        }
        if (!this.h && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (Lr0.a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
            int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            if (iIntValue3 >= 180000000) {
                i = 1024;
            } else if (iIntValue3 >= 120000000) {
                i = 512;
            } else if (iIntValue3 >= 60000000) {
                i = 256;
            } else if (iIntValue3 >= 30000000) {
                i = 128;
            } else if (iIntValue3 >= 18000000) {
                i = 64;
            } else if (iIntValue3 >= 12000000) {
                i = 32;
            } else if (iIntValue3 >= 7200000) {
                i = 16;
            } else if (iIntValue3 < 3600000) {
                i = iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z)) {
                if ("video/hevc".equals(str) && 2 == iIntValue) {
                    String str2 = Lr0.b;
                    if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                    }
                }
                return true;
            }
        }
        g("codec.profileLevel, " + c0643Nw.t + ", " + this.c);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x009f  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:82:0x0128  */
    /* JADX WARN: Code duplicated, block: B:83:0x012b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0133  */
    /* JADX WARN: Code duplicated, block: B:86:0x0138  */
    /* JADX WARN: Code duplicated, block: B:89:0x0141  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:89:0x0141, please report this as an issue */
    public final boolean d(C0643Nw c0643Nw) {
        int i;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        int maxInputChannelCount;
        int i2;
        String str = c0643Nw.w;
        String str2 = this.b;
        boolean z = true;
        if (!(str2.equals(str) || str2.equals(OO.b(c0643Nw))) || !c(c0643Nw, true)) {
            return false;
        }
        if (this.h) {
            int i3 = c0643Nw.B;
            if (i3 > 0 && (i2 = c0643Nw.C) > 0) {
                if (Lr0.a >= 21) {
                    return f(i3, i2, c0643Nw.D);
                }
                z = i3 * i2 <= OO.i();
                if (!z) {
                    g("legacyFrameSize, " + i3 + "x" + i2);
                }
            }
            return z;
        }
        int i4 = Lr0.a;
        if (i4 < 21) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        int i5 = c0643Nw.K;
        if (i5 == -1) {
            i = c0643Nw.J;
            if (i != -1) {
                return true;
            }
            if (codecCapabilities == null) {
                g("channelCount.caps");
            } else {
                audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    g("channelCount.aCaps");
                } else {
                    maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                    if (maxInputChannelCount <= 1 && ((i4 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                        if ("audio/ac3".equals(str2)) {
                            maxInputChannelCount = 6;
                        } else if ("audio/eac3".equals(str2)) {
                            maxInputChannelCount = 16;
                        } else {
                            maxInputChannelCount = 30;
                        }
                        AP.z();
                    }
                    if (maxInputChannelCount < i) {
                        return true;
                    }
                    g("channelCount.support, " + i);
                }
            }
        } else if (codecCapabilities == null) {
            g("sampleRate.caps");
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                g("sampleRate.aCaps");
            } else if (audioCapabilities2.isSampleRateSupported(i5)) {
                i = c0643Nw.J;
                if (i != -1) {
                    return true;
                }
                if (codecCapabilities == null) {
                    g("channelCount.caps");
                } else {
                    audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        g("channelCount.aCaps");
                    } else {
                        maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1) {
                            if ("audio/ac3".equals(str2)) {
                                maxInputChannelCount = 6;
                            } else if ("audio/eac3".equals(str2)) {
                                maxInputChannelCount = 16;
                            } else {
                                maxInputChannelCount = 30;
                            }
                            AP.z();
                        }
                        if (maxInputChannelCount < i) {
                            return true;
                        }
                        g("channelCount.support, " + i);
                    }
                }
            } else {
                g("sampleRate.support, " + i5);
            }
        }
        return false;
    }

    public final boolean e(C0643Nw c0643Nw) {
        if (this.h) {
            return this.e;
        }
        Pair pairD = OO.d(c0643Nw);
        return pairD != null && ((Integer) pairD.first).intValue() == 42;
    }

    public final boolean f(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        if (Lr0.a >= 29) {
            int iA = DO.a(videoCapabilities, i, i2, d);
            if (iA == 2) {
                return true;
            }
            if (iA == 1) {
                g("sizeAndRate.cover, " + i + "x" + i2 + "@" + d);
                return false;
            }
        }
        if (!a(videoCapabilities, i, i2, d)) {
            if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.a) && "mcv5a".equals(Lr0.b)) || !a(videoCapabilities, i2, i, d))) {
                g("sizeAndRate.support, " + i + "x" + i2 + "@" + d);
                return false;
            }
            StringBuilder sb = new StringBuilder("sizeAndRate.rotated, ");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append("@");
            sb.append(d);
            int i3 = Lr0.a;
            AP.c();
        }
        return true;
    }

    public final void g(String str) {
        int i = Lr0.a;
        AP.c();
    }

    public final String toString() {
        return this.a;
    }
}
