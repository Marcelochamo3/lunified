package o;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.jC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1860jC implements InterfaceC3046vX {
    public final C1568gC l;
    public final C1177cC m;
    public static final Pattern n = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f841o = Pattern.compile("VIDEO=\"(.+?)\"");
    public static final Pattern p = Pattern.compile("AUDIO=\"(.+?)\"");
    public static final Pattern q = Pattern.compile("SUBTITLES=\"(.+?)\"");
    public static final Pattern r = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    public static final Pattern s = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern t = Pattern.compile("CHANNELS=\"(.+?)\"");
    public static final Pattern u = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern v = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern w = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern x = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern y = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern z = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern A = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern B = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern C = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern D = a("CAN-SKIP-DATERANGES");
    public static final Pattern E = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern F = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern G = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern H = a("CAN-BLOCK-RELOAD");
    public static final Pattern I = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern J = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern K = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern L = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern M = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern N = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern O = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern P = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern Q = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern R = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern S = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern T = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern U = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern V = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern W = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern X = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern Y = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern Z = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern a0 = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern b0 = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern c0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern d0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern e0 = a("AUTOSELECT");
    public static final Pattern f0 = a("DEFAULT");
    public static final Pattern g0 = a("FORCED");
    public static final Pattern h0 = a("INDEPENDENT");
    public static final Pattern i0 = a("GAP");
    public static final Pattern j0 = a("PRECISE");
    public static final Pattern k0 = Pattern.compile("VALUE=\"(.+?)\"");
    public static final Pattern l0 = Pattern.compile("IMPORT=\"(.+?)\"");
    public static final Pattern m0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public C1860jC(C1568gC c1568gC, C1177cC c1177cC) {
        this.l = c1568gC;
        this.m = c1177cC;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static C3271xo b(String str, C3174wo[] c3174woArr) {
        C3174wo[] c3174woArr2 = new C3174wo[c3174woArr.length];
        for (int i = 0; i < c3174woArr.length; i++) {
            C3174wo c3174wo = c3174woArr[i];
            c3174woArr2[i] = new C3174wo(c3174wo.m, c3174wo.n, c3174wo.f1102o, null);
        }
        return new C3271xo(str, true, c3174woArr2);
    }

    public static C3174wo c(String str, String str2, HashMap map) throws C2949uX {
        String strI = i(str, U, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = V;
        if (zEquals) {
            String strJ = j(str, pattern, map);
            return new C3174wo(AbstractC2661ra.d, null, "video/mp4", Base64.decode(strJ.substring(strJ.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = AbstractC2661ra.d;
            int i = Lr0.a;
            return new C3174wo(uuid, null, "hls", str.getBytes(AbstractC1402ed.c));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strI)) {
            return null;
        }
        String strJ2 = j(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strJ2.substring(strJ2.indexOf(44)), 0);
        UUID uuid2 = AbstractC2661ra.e;
        return new C3174wo(uuid2, null, "video/mp4", AbstractC3021v9.d(uuid2, null, bArrDecode));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 21501. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static o.C1177cC d(o.C1568gC r94, o.C1177cC r95, o.Na0 r96, java.lang.String r97) {
        /*
            Method dump skipped, instruction units count: 2150
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1860jC.d(o.gC, o.cC, o.Na0, java.lang.String):o.cC");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:112:0x0388  */
    /* JADX WARN: Code duplicated, block: B:204:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x016e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0175  */
    /* JADX WARN: Code duplicated, block: B:57:0x0198  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f7  */
    /* JADX WARN: Failed to find 'out' block for switch in B:129:0x03b5. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v7 */
    public static C1568gC e(Na0 na0, String str) throws IOException {
        ?? r14;
        Pattern pattern;
        int i;
        ArrayList arrayList;
        C1470fC c1470fC;
        String strE;
        int i2;
        String str2;
        int i3;
        int i4;
        C1470fC c1470fC2;
        String strE2;
        C1470fC c1470fC3;
        int i5;
        ArrayList arrayList2;
        int i6;
        int i7;
        String strI;
        float f;
        Uri uriF;
        HashMap map;
        ArrayList arrayList3;
        String str3 = str;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        boolean z2 = false;
        boolean zContains = false;
        while (true) {
            boolean zH = na0.H();
            String str4 = "application/x-mpegURL";
            Pattern pattern2 = V;
            Pattern pattern3 = a0;
            if (!zH) {
                HashMap map4 = map2;
                ArrayList arrayList12 = arrayList5;
                ArrayList arrayList13 = arrayList6;
                ArrayList arrayList14 = arrayList7;
                ArrayList arrayList15 = arrayList8;
                ArrayList arrayList16 = arrayList9;
                ArrayList arrayList17 = arrayList10;
                ArrayList arrayList18 = arrayList11;
                ArrayList arrayList19 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i8 = 0;
                while (i8 < arrayList4.size()) {
                    C1470fC c1470fC4 = (C1470fC) arrayList4.get(i8);
                    if (hashSet.add(c1470fC4.a)) {
                        C0643Nw c0643Nw = c1470fC4.b;
                        AbstractC0397Ej.f(c0643Nw.u == null);
                        ArrayList arrayList20 = (ArrayList) map4.get(c1470fC4.a);
                        arrayList20.getClass();
                        CQ cq = new CQ(new C2831tC(null, null, arrayList20));
                        C0617Mw c0617MwA = c0643Nw.a();
                        c0617MwA.i = cq;
                        arrayList19.add(new C1470fC(c1470fC4.a, new C0643Nw(c0617MwA), c1470fC4.c, c1470fC4.d, c1470fC4.e, c1470fC4.f));
                    }
                    i8++;
                    map4 = map4;
                }
                C0643Nw c0643Nw2 = null;
                List listEmptyList = null;
                int i9 = 0;
                while (i9 < arrayList16.size()) {
                    arrayList16 = arrayList16;
                    String str5 = (String) arrayList16.get(i9);
                    String strJ = j(str5, b0, map3);
                    String strJ2 = j(str5, pattern3, map3);
                    C0617Mw c0617Mw = new C0617Mw();
                    c0617Mw.a = AbstractC1701hf0.e(strJ, ":", strJ2);
                    c0617Mw.b = strJ2;
                    c0617Mw.j = str4;
                    boolean zF = f(str5, f0);
                    String str6 = str4;
                    if (f(str5, g0)) {
                        r14 = zF;
                        r14 = (zF ? 1 : 0) | 2;
                    }
                    r14 = zF;
                    int i10 = r14;
                    if (f(str5, e0)) {
                        i10 = (r14 == true ? 1 : 0) | 4;
                    }
                    c0617Mw.d = i10;
                    String strI2 = i(str5, c0, null, map3);
                    if (TextUtils.isEmpty(strI2)) {
                        pattern = pattern3;
                        i = 0;
                    } else {
                        int i11 = Lr0.a;
                        pattern = pattern3;
                        String[] strArrSplit = strI2.split(",", -1);
                        i = Lr0.l(strArrSplit, "public.accessibility.describes-video") ? 512 : 0;
                        if (Lr0.l(strArrSplit, "public.accessibility.transcribes-spoken-dialog")) {
                            i |= C1672hI.a.f;
                        }
                        if (Lr0.l(strArrSplit, "public.accessibility.describes-music-and-sound")) {
                            i |= 1024;
                        }
                        if (Lr0.l(strArrSplit, "public.easy-to-read")) {
                            i |= C1672hI.a.e;
                        }
                    }
                    c0617Mw.e = i;
                    c0617Mw.c = i(str5, Z, null, map3);
                    String strI3 = i(str5, pattern2, null, map3);
                    Uri uriF2 = strI3 == null ? null : AbstractC3045vW.F(str3, strI3);
                    Pattern pattern4 = pattern2;
                    CQ cq2 = new CQ(new C2831tC(strJ, strJ2, Collections.emptyList()));
                    String strJ3 = j(str5, X, map3);
                    strJ3.getClass();
                    switch (strJ3) {
                        case "SUBTITLES":
                            arrayList16 = arrayList16;
                            arrayList13 = arrayList13;
                            arrayList = arrayList12;
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList4.size()) {
                                    c1470fC = (C1470fC) arrayList4.get(i12);
                                    if (!strJ.equals(c1470fC.e)) {
                                        i12++;
                                    }
                                } else {
                                    c1470fC = null;
                                }
                            }
                            if (c1470fC != null) {
                                String strR = Lr0.r(3, c1470fC.b.t);
                                c0617Mw.h = strR;
                                strE = IQ.e(strR);
                            } else {
                                strE = null;
                            }
                            if (strE == null) {
                                strE = "text/vtt";
                            }
                            c0617Mw.k = strE;
                            c0617Mw.i = cq2;
                            if (uriF2 != null) {
                                arrayList14 = arrayList14;
                                arrayList14.add(new C1372eC(uriF2, new C0643Nw(c0617Mw), strJ2));
                            } else {
                                arrayList14 = arrayList14;
                                AP.z();
                            }
                            i3 = 1;
                            break;
                        case "CLOSED-CAPTIONS":
                            arrayList16 = arrayList16;
                            arrayList13 = arrayList13;
                            arrayList = arrayList12;
                            String strJ4 = j(str5, d0, map3);
                            if (strJ4.startsWith("CC")) {
                                i2 = Integer.parseInt(strJ4.substring(2));
                                str2 = "application/cea-608";
                            } else {
                                i2 = Integer.parseInt(strJ4.substring(7));
                                str2 = "application/cea-708";
                            }
                            if (listEmptyList == null) {
                                listEmptyList = new ArrayList();
                            }
                            c0617Mw.k = str2;
                            c0617Mw.C = i2;
                            listEmptyList.add(new C0643Nw(c0617Mw));
                            arrayList14 = arrayList14;
                            i3 = 1;
                            break;
                        case "AUDIO":
                            arrayList = arrayList12;
                            int i13 = 0;
                            while (true) {
                                if (i13 < arrayList4.size()) {
                                    C1470fC c1470fC5 = (C1470fC) arrayList4.get(i13);
                                    arrayList16 = arrayList16;
                                    if (strJ.equals(c1470fC5.d)) {
                                        c1470fC2 = c1470fC5;
                                        i4 = 1;
                                    } else {
                                        i13++;
                                        arrayList16 = arrayList16;
                                    }
                                } else {
                                    arrayList16 = arrayList16;
                                    i4 = 1;
                                    c1470fC2 = null;
                                }
                            }
                            if (c1470fC2 != null) {
                                String strR2 = Lr0.r(i4, c1470fC2.b.t);
                                c0617Mw.h = strR2;
                                strE2 = IQ.e(strR2);
                            } else {
                                strE2 = null;
                            }
                            String strI4 = i(str5, t, null, map3);
                            if (strI4 != null) {
                                int i14 = Lr0.a;
                                c0617Mw.x = Integer.parseInt(strI4.split("/", 2)[0]);
                                if ("audio/eac3".equals(strE2) && strI4.endsWith("/JOC")) {
                                    c0617Mw.h = "ec+3";
                                    strE2 = "audio/eac3-joc";
                                }
                            }
                            c0617Mw.k = strE2;
                            if (uriF2 == null) {
                                arrayList13 = arrayList13;
                                if (c1470fC2 != null) {
                                    c0643Nw2 = new C0643Nw(c0617Mw);
                                    arrayList14 = arrayList14;
                                    i3 = 1;
                                }
                                break;
                            } else {
                                c0617Mw.i = cq2;
                                arrayList13 = arrayList13;
                                arrayList13.add(new C1372eC(uriF2, new C0643Nw(c0617Mw), strJ2));
                            }
                            arrayList14 = arrayList14;
                            i3 = 1;
                            break;
                        case "VIDEO":
                            int i15 = 0;
                            while (true) {
                                if (i15 < arrayList4.size()) {
                                    c1470fC3 = (C1470fC) arrayList4.get(i15);
                                    if (!strJ.equals(c1470fC3.c)) {
                                        i15++;
                                    }
                                } else {
                                    c1470fC3 = null;
                                }
                            }
                            if (c1470fC3 != null) {
                                C0643Nw c0643Nw3 = c1470fC3.b;
                                String strR3 = Lr0.r(2, c0643Nw3.t);
                                c0617Mw.h = strR3;
                                c0617Mw.k = IQ.e(strR3);
                                c0617Mw.p = c0643Nw3.B;
                                c0617Mw.q = c0643Nw3.C;
                                c0617Mw.r = c0643Nw3.D;
                            }
                            if (uriF2 != null) {
                                c0617Mw.i = cq2;
                                arrayList = arrayList12;
                                arrayList.add(new C1372eC(uriF2, new C0643Nw(c0617Mw), strJ2));
                            }
                            i3 = 1;
                        default:
                            arrayList = arrayList12;
                            i3 = 1;
                            break;
                    }
                    i9 += i3;
                    str3 = str;
                    arrayList13 = arrayList13;
                    arrayList14 = arrayList14;
                    arrayList12 = arrayList;
                    str4 = str6;
                    pattern3 = pattern;
                    pattern2 = pattern4;
                }
                ArrayList arrayList21 = arrayList14;
                ArrayList arrayList22 = arrayList13;
                ArrayList arrayList23 = arrayList12;
                if (zContains) {
                    listEmptyList = Collections.emptyList();
                }
                return new C1568gC(str, arrayList18, arrayList19, arrayList23, arrayList22, arrayList21, arrayList15, c0643Nw2, listEmptyList, z2, map3, arrayList17);
            }
            String strO = na0.O();
            if (strO.startsWith("#EXT")) {
                arrayList11.add(strO);
            }
            boolean zStartsWith = strO.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList24 = arrayList8;
            if (strO.startsWith("#EXT-X-DEFINE")) {
                map3.put(j(strO, pattern3, map3), j(strO, k0, map3));
            } else {
                if (strO.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    map = map2;
                    arrayList2 = arrayList5;
                    arrayList11 = arrayList11;
                    z2 = true;
                } else if (strO.startsWith("#EXT-X-MEDIA")) {
                    arrayList9.add(strO);
                } else if (strO.startsWith("#EXT-X-SESSION-KEY")) {
                    C3174wo c3174woC = c(strO, i(strO, T, "identity", map3), map3);
                    if (c3174woC != null) {
                        String strJ5 = j(strO, S, map3);
                        arrayList10.add(new C3271xo(("SAMPLE-AES-CENC".equals(strJ5) || "SAMPLE-AES-CTR".equals(strJ5)) ? "cenc" : "cbcs", true, c3174woC));
                    }
                } else if (strO.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                    zContains |= strO.contains("CLOSED-CAPTIONS=NONE");
                    int i16 = zStartsWith ? 16384 : 0;
                    int i17 = Integer.parseInt(j(strO, s, Collections.emptyMap()));
                    Matcher matcher = n.matcher(strO);
                    if (matcher.find()) {
                        String strGroup = matcher.group(1);
                        strGroup.getClass();
                        i5 = Integer.parseInt(strGroup);
                    } else {
                        i5 = -1;
                    }
                    String strI5 = i(strO, u, null, map3);
                    String strI6 = i(strO, v, null, map3);
                    if (strI6 != null) {
                        int i18 = Lr0.a;
                        arrayList2 = arrayList5;
                        String[] strArrSplit2 = strI6.split("x", -1);
                        i6 = Integer.parseInt(strArrSplit2[0]);
                        i7 = Integer.parseInt(strArrSplit2[1]);
                        if (i6 <= 0 || i7 <= 0) {
                        }
                        strI = i(strO, w, null, map3);
                        if (strI != null) {
                            f = Float.parseFloat(strI);
                        } else {
                            f = -1.0f;
                        }
                        HashMap map5 = map2;
                        String strI7 = i(strO, f841o, null, map3);
                        String strI8 = i(strO, p, null, map3);
                        String strI9 = i(strO, q, null, map3);
                        String strI10 = i(strO, r, null, map3);
                        if (zStartsWith) {
                            uriF = AbstractC3045vW.F(str3, j(strO, pattern2, map3));
                        } else {
                            if (na0.H()) {
                                throw C2949uX.b("#EXT-X-STREAM-INF must be followed by another line", null);
                            }
                            uriF = AbstractC3045vW.F(str3, k(na0.O(), map3));
                        }
                        C0617Mw c0617Mw2 = new C0617Mw();
                        c0617Mw2.a = Integer.toString(arrayList4.size());
                        c0617Mw2.j = "application/x-mpegURL";
                        c0617Mw2.h = strI5;
                        c0617Mw2.f = i5;
                        c0617Mw2.g = i17;
                        c0617Mw2.p = i6;
                        c0617Mw2.q = i7;
                        c0617Mw2.r = f;
                        c0617Mw2.e = i16;
                        arrayList4.add(new C1470fC(uriF, new C0643Nw(c0617Mw2), strI7, strI8, strI9, strI10));
                        map = map5;
                        arrayList3 = (ArrayList) map.get(uriF);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            map.put(uriF, arrayList3);
                        }
                        arrayList3.add(new C2734sC(i5, i17, strI7, strI8, strI9, strI10));
                    } else {
                        arrayList2 = arrayList5;
                    }
                    i6 = -1;
                    i7 = -1;
                    strI = i(strO, w, null, map3);
                    if (strI != null) {
                        f = Float.parseFloat(strI);
                    } else {
                        f = -1.0f;
                    }
                    HashMap map6 = map2;
                    String strI11 = i(strO, f841o, null, map3);
                    String strI12 = i(strO, p, null, map3);
                    String strI13 = i(strO, q, null, map3);
                    String strI14 = i(strO, r, null, map3);
                    if (zStartsWith) {
                        uriF = AbstractC3045vW.F(str3, j(strO, pattern2, map3));
                    } else {
                        if (na0.H()) {
                            throw C2949uX.b("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        uriF = AbstractC3045vW.F(str3, k(na0.O(), map3));
                    }
                    C0617Mw c0617Mw3 = new C0617Mw();
                    c0617Mw3.a = Integer.toString(arrayList4.size());
                    c0617Mw3.j = "application/x-mpegURL";
                    c0617Mw3.h = strI5;
                    c0617Mw3.f = i5;
                    c0617Mw3.g = i17;
                    c0617Mw3.p = i6;
                    c0617Mw3.q = i7;
                    c0617Mw3.r = f;
                    c0617Mw3.e = i16;
                    arrayList4.add(new C1470fC(uriF, new C0643Nw(c0617Mw3), strI11, strI12, strI13, strI14));
                    map = map6;
                    arrayList3 = (ArrayList) map.get(uriF);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        map.put(uriF, arrayList3);
                    }
                    arrayList3.add(new C2734sC(i5, i17, strI11, strI12, strI13, strI14));
                }
                map2 = map;
                arrayList8 = arrayList24;
                arrayList10 = arrayList10;
                arrayList11 = arrayList11;
                arrayList7 = arrayList7;
                arrayList6 = arrayList6;
                arrayList5 = arrayList2;
                arrayList9 = arrayList9;
            }
            map = map2;
            arrayList2 = arrayList5;
            arrayList11 = arrayList11;
            map2 = map;
            arrayList8 = arrayList24;
            arrayList10 = arrayList10;
            arrayList11 = arrayList11;
            arrayList7 = arrayList7;
            arrayList6 = arrayList6;
            arrayList5 = arrayList2;
            arrayList9 = arrayList9;
        }
    }

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    public static long h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String i(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : k(str2, map);
    }

    public static String j(String str, Pattern pattern, Map map) throws C2949uX {
        String strI = i(str, pattern, null, map);
        if (strI != null) {
            return strI;
        }
        throw C2949uX.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String k(String str, Map map) {
        Matcher matcher = m0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:32:0x0069, B:34:0x006f, B:37:0x007a, B:39:0x0082, B:43:0x0098, B:45:0x00a0, B:47:0x00a8, B:49:0x00b0, B:51:0x00b8, B:53:0x00c0, B:55:0x00c8, B:57:0x00d0, B:60:0x00d9, B:61:0x00dd, B:66:0x00fd, B:67:0x0103, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:70:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0048 A[Catch: all -> 0x0096, LOOP:2: B:17:0x003c->B:22:0x0048, LOOP_END, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:32:0x0069, B:34:0x006f, B:37:0x007a, B:39:0x0082, B:43:0x0098, B:45:0x00a0, B:47:0x00a8, B:49:0x00b0, B:51:0x00b8, B:53:0x00c0, B:55:0x00c8, B:57:0x00d0, B:60:0x00d9, B:61:0x00dd, B:66:0x00fd, B:67:0x0103, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:70:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:89:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0047 A[SYNTHETIC] */
    @Override // o.InterfaceC3046vX
    public final Object D(Uri uri, C2776sj c2776sj) throws C2949uX {
        int i;
        Object objE;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c2776sj));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int i2 = bufferedReader.read();
            boolean zI = false;
            if (i2 == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    i2 = bufferedReader.read();
                    while (i2 != -1) {
                        i2 = bufferedReader.read();
                    }
                    i = 0;
                    while (true) {
                        if (i < 7) {
                            while (i2 != -1) {
                                i2 = bufferedReader.read();
                            }
                            zI = Lr0.I(i2);
                            break;
                        }
                        if (i2 != "#EXTM3U".charAt(i)) {
                            break;
                            break;
                        }
                        i2 = bufferedReader.read();
                        i++;
                    }
                }
            } else {
                while (i2 != -1 && Character.isWhitespace(i2)) {
                    i2 = bufferedReader.read();
                }
                i = 0;
                while (true) {
                    if (i < 7) {
                        while (i2 != -1 && Character.isWhitespace(i2) && !Lr0.I(i2)) {
                            i2 = bufferedReader.read();
                        }
                        zI = Lr0.I(i2);
                        break;
                    }
                    if (i2 != "#EXTM3U".charAt(i)) {
                        break;
                    }
                    i2 = bufferedReader.read();
                    i++;
                }
            }
            if (!zI) {
                throw C2949uX.b("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    Lr0.h(bufferedReader);
                    throw C2949uX.b("Failed to parse the playlist, could not identify any tags.", null);
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        arrayDeque.add(strTrim);
                        objE = e(new Na0(arrayDeque, bufferedReader), uri.toString());
                    } else {
                        if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                            arrayDeque.add(strTrim);
                        }
                        arrayDeque.add(strTrim);
                        objE = d(this.l, this.m, new Na0(arrayDeque, bufferedReader), uri.toString());
                    }
                    Lr0.h(bufferedReader);
                    return objE;
                }
            }
        } catch (Throwable th) {
            Lr0.h(bufferedReader);
            throw th;
        }
    }
}
