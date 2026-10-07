package o;

import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class P80 extends AbstractC3473zs {
    public static final byte[] d;
    public static final byte[] e;
    public final List b = AbstractC0937Ze.K("https://cubeembed.rpmvid.com", "https://bummi.upns.xyz", "https://loadm.cam", "https://anibum.playerp2p.online", "https://pelisplus.upns.pro", "https://pelisplus.rpmstream.live", "https://pelisplus.strp2p.com", "https://flemmix.upns.pro", "https://moflix.rpmplay.xyz", "https://moflix.upns.xyz", "https://flix2day.xyz", "https://primevid.click", "https://totocoutouno.rpmlive.online", "https://dismoiceline.uns.bio", "https://doremifasol.ezplayer.me", "https://marcus.p2pstream.vip");
    public final OV c;

    static {
        Charset charset = AbstractC1305dd.a;
        byte[] bytes = "kiemtienmua911ca".getBytes(charset);
        AbstractC1474fG.i(bytes, "getBytes(...)");
        d = bytes;
        byte[] bytes2 = "1234567890oiuytr".getBytes(charset);
        AbstractC1474fG.i(bytes2, "getBytes(...)");
        e = bytes2;
    }

    public P80() {
        C3084vr0 c3084vr0 = C3084vr0.a;
        NV nvO = AbstractC1701hf0.o();
        X9 x9 = Sr0.a;
        ArrayList arrayList = nvO.c;
        arrayList.add(x9);
        X9 x10 = Sr0.b;
        ArrayList arrayList2 = nvO.d;
        arrayList2.add(x10);
        X9 x11 = AbstractC1370eA.m;
        AbstractC1406ef.S(arrayList, X10.q);
        AbstractC1406ef.S(arrayList2, X10.r);
        arrayList.add(x11);
        arrayList2.add(x11);
        arrayList.add(new C2480pg(15));
        this.c = new OV(nvO);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:98:0x027d  */
    @Override // o.AbstractC3473zs
    public final Object a(String str, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        O80 o80;
        String strB0;
        String str2;
        P80 p80;
        String strH;
        String strH2;
        String strH3;
        String strH4;
        C1101bX c1101bX;
        String strH5;
        TH th;
        TH th2;
        QH qhI;
        List list;
        boolean z;
        QH qhI2;
        if (interfaceC0473Hh instanceof O80) {
            o80 = (O80) interfaceC0473Hh;
            int i = o80.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                o80.p = i - Integer.MIN_VALUE;
            } else {
                o80 = new O80(this, interfaceC0473Hh);
            }
        } else {
            o80 = new O80(this, interfaceC0473Hh);
        }
        O80 o81 = o80;
        Object objA = o81.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = o81.p;
        String strH6 = null;
        if (i2 == 0) {
            Jp0.O(objA);
            int iD0 = AbstractC1119bh0.d0(str, '#', 0, false, 6);
            if (iD0 == -1 || iD0 == AbstractC1119bh0.a0(str)) {
                strB0 = null;
            } else {
                String strSubstring = str.substring(iD0 + 1);
                AbstractC1474fG.i(strSubstring, "substring(...)");
                strB0 = AbstractC1119bh0.B0(strSubstring, "&");
            }
            if (strB0 == null) {
                throw new Exception("Invalid link: missing id after #");
            }
            str2 = new URL(str).getProtocol() + "://" + new URL(str).getHost();
            AbstractC1474fG.j(str2, "baseUrl");
            OV ov = this.c;
            AbstractC1474fG.j(ov, "client");
            C1583gR c1583gR = new C1583gR(12);
            C3084vr0 c3084vr0 = C3084vr0.a;
            NV nvO = AbstractC1701hf0.o();
            X9 x9 = Sr0.a;
            ArrayList arrayList = nvO.c;
            arrayList.add(x9);
            X9 x10 = Sr0.b;
            ArrayList arrayList2 = nvO.d;
            arrayList2.add(x10);
            X9 x11 = AbstractC1370eA.m;
            AbstractC1406ef.S(arrayList, X10.q);
            AbstractC1406ef.S(arrayList2, X10.r);
            arrayList.add(x11);
            arrayList2.add(x11);
            c1583gR.m = new OV(nvO);
            c1583gR.f(str2);
            ((ArrayList) c1583gR.f793o).add(new P9(3));
            c1583gR.m = ov;
            Object objB = c1583gR.m().b(N80.class);
            AbstractC1474fG.i(objB, "create(...)");
            String strConcat = str2.concat("/api/v1/video");
            o81.l = this;
            o81.m = str2;
            o81.p = 1;
            objA = ((N80) objB).a(strConcat, str2, strB0, "1920", "1080", "", o81);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
            p80 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = o81.m;
            p80 = o81.l;
            Jp0.O(objA);
        }
        p80.getClass();
        Locale locale = Locale.US;
        String strI = AbstractC1701hf0.i(locale, "US", (String) objA, locale, "toLowerCase(...)");
        Pattern patternCompile = Pattern.compile("[^0-9a-f]");
        AbstractC1474fG.i(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(strI).replaceAll("");
        AbstractC1474fG.i(strReplaceAll, "replaceAll(...)");
        if (strReplaceAll.length() % 2 != 0) {
            strReplaceAll = "0".concat(strReplaceAll);
        }
        byte[] bArr = new byte[strReplaceAll.length() / 2];
        int i3 = 0;
        int i4 = 0;
        while (i3 < strReplaceAll.length()) {
            bArr[i4] = (byte) ((AbstractC3021v9.h(strReplaceAll.charAt(i3)) << 4) | AbstractC3021v9.h(strReplaceAll.charAt(i3 + 1)));
            i3 += 2;
            i4++;
        }
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, new SecretKeySpec(d, "AES"), new IvParameterSpec(e));
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        AbstractC1474fG.g(bArrDoFinal);
        TH thF = U9.v(new String(bArrDoFinal, AbstractC1305dd.a)).f();
        QH qhI3 = thF.i("hls");
        if (qhI3 == null || (strH = qhI3.h()) == null || strH.length() <= 0) {
            strH = null;
        }
        QH qhI4 = thF.i("hlsVideoTiktok");
        if (qhI4 == null || (strH2 = qhI4.h()) == null || strH2.length() <= 0) {
            strH2 = null;
        }
        QH qhI5 = thF.i("cf");
        if (qhI5 == null || (strH3 = qhI5.h()) == null || strH3.length() <= 0) {
            strH3 = null;
        }
        QH qhI6 = thF.i("cfExpire");
        if (qhI6 == null || (strH4 = qhI6.h()) == null || strH4.length() <= 0) {
            strH4 = null;
        }
        if (strH != null && strH.length() != 0) {
            c1101bX = new C1101bX(AbstractC1701hf0.d(str2, strH), AbstractC3327yN.y(new C1101bX("Referer", str2)));
        } else if (strH2 == null || strH2.length() == 0) {
            if (strH3 == null || strH3.length() == 0) {
                throw new Exception("Missing hls, hlsVideoTiktok or cf in response");
            }
            if (strH4 != null && strH4.length() != 0) {
                List listT0 = AbstractC1119bh0.t0(strH4, new String[]{"::"}, 0, 6);
                if (listT0.size() >= 2) {
                    strH3 = strH3 + "?t=" + listT0.get(0) + "&e=" + listT0.get(1);
                }
            }
            AbstractC1474fG.g(strH3);
            c1101bX = new C1101bX(strH3, AbstractC3327yN.y(new C1101bX("Referer", str2)));
        } else {
            try {
                QH qhI7 = thF.i("streamingConfig");
                String strH7 = qhI7 != null ? qhI7.h() : null;
                if (strH7 == null || strH7.length() == 0) {
                    strH5 = "";
                } else {
                    TH th3 = (TH) U9.v(strH7).f().l.get("adjust");
                    strH5 = (th3 == null || (th = (TH) th3.l.get("Tiktok")) == null || (th2 = (TH) th.l.get("params")) == null || (qhI = th2.i("v")) == null) ? null : qhI.h();
                    if (strH5 == null) {
                        strH5 = "";
                    }
                }
            } catch (Exception unused) {
            }
            c1101bX = new C1101bX(AbstractC1701hf0.e(str2, strH2, strH5.length() > 0 ? "?v=".concat(strH5) : ""), AbstractC3327yN.y(new C1101bX("Referer", str2)));
        }
        String str3 = (String) c1101bX.l;
        Map map = (Map) c1101bX.m;
        C3227xK c3227xK = thF.l;
        TH th4 = (TH) c3227xK.get("defaultSubtitle");
        if (th4 != null && (qhI2 = th4.i("defaultSubtitle")) != null) {
            strH6 = qhI2.h();
        }
        String str4 = strH6 == null ? "" : strH6;
        TH th5 = (TH) c3227xK.get("subtitle");
        if (th5 != null) {
            Set setEntrySet = th5.l.entrySet();
            ArrayList arrayList3 = new ArrayList(AbstractC1016af.O(setEntrySet, 10));
            boolean z2 = false;
            for (Map.Entry entry : (C3033vK) setEntrySet) {
                AbstractC1474fG.g(entry);
                String str5 = (String) entry.getKey();
                QH qh = (QH) entry.getValue();
                AbstractC1474fG.g(str5);
                String strH8 = qh.h();
                String str6 = strH8 == null ? "" : strH8;
                if (z2 || str4.length() <= 0 || !AbstractC1119bh0.W(str5, str4, false)) {
                    z = false;
                } else {
                    z2 = true;
                    z = true;
                }
                arrayList3.add(new Es0(str5, str6, z, null, 8));
            }
            list = arrayList3;
        } else {
            list = C1233cq.l;
        }
        return new Js0(str3, map, (String) null, (String) null, (String) null, (byte[]) null, (String) null, (String) null, (String) null, list, false, 3580);
    }

    @Override // o.AbstractC3473zs
    public final List b() {
        return this.b;
    }

    @Override // o.AbstractC3473zs
    public final String c() {
        return "https://rpmvid.com";
    }

    @Override // o.AbstractC3473zs
    public final String d() {
        return "Rpmvid";
    }
}
