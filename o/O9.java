package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.WebView;
import com.skidush.clonex.MyApplication;
import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.utils.RuntimeSecurityGuard;
import com.skidush.clonex.utils.TamperGuard;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class O9 implements InterfaceC0602Mh, InterfaceC0940Zh, UB, Nv0, InterfaceC2387oi, Q8, InterfaceC1201ca {
    public static O9 v;
    public static volatile JSONObject y;
    public static volatile long z;
    public final /* synthetic */ int l;
    public static final O9 m = new O9(0);
    public static final O9 n = new O9(2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final O9 f428o = new O9(3);
    public static final O9 p = new O9(4);
    public static final /* synthetic */ O9 q = new O9(5);
    public static final int[] r = {8, 13, 11, 2, 0, 1, 7};
    public static final O9 s = new O9(7);
    public static final O9 t = new O9(8);
    public static final String[] u = new String[0];
    public static final O9 w = new O9(11);
    public static final O9 x = new O9(12);
    public static final O9 A = new O9(14);
    public static final O9 B = new O9(15);
    public static final O9 C = new O9(16);
    public static final O9 D = new O9(17);
    public static final O9 E = new O9(18);
    public static final O9 F = new O9(19);
    public static final O9 G = new O9(20);

    public /* synthetic */ O9(int i) {
        this.l = i;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01a4 A[PHI: r15
  0x01a4: PHI (r15v5 java.lang.String) = (r15v4 java.lang.String), (r15v10 java.lang.String), (r15v12 java.lang.String) binds: [B:108:0x018a, B:112:0x0196, B:116:0x01a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:144:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:148:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:149:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:152:0x0205  */
    /* JADX WARN: Code duplicated, block: B:153:0x020c  */
    /* JADX WARN: Code duplicated, block: B:155:0x0210  */
    /* JADX WARN: Code duplicated, block: B:156:0x0217  */
    /* JADX WARN: Code duplicated, block: B:169:0x023d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0240  */
    /* JADX WARN: Code duplicated, block: B:172:0x0245  */
    /* JADX WARN: Code duplicated, block: B:175:0x024c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:176:0x024e  */
    /* JADX WARN: Code duplicated, block: B:177:0x0255  */
    /* JADX WARN: Code duplicated, block: B:180:0x025c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0264  */
    /* JADX WARN: Code duplicated, block: B:183:0x0269  */
    /* JADX WARN: Code duplicated, block: B:185:0x0271  */
    /* JADX WARN: Code duplicated, block: B:188:0x0284  */
    /* JADX WARN: Code duplicated, block: B:191:0x0290  */
    /* JADX WARN: Code duplicated, block: B:193:0x029a  */
    /* JADX WARN: Code duplicated, block: B:194:0x029c  */
    /* JADX WARN: Code duplicated, block: B:202:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:204:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:208:0x0302  */
    /* JADX WARN: Code duplicated, block: B:209:0x0309  */
    /* JADX WARN: Code duplicated, block: B:221:0x033f  */
    /* JADX WARN: Code duplicated, block: B:227:0x034f  */
    /* JADX WARN: Code duplicated, block: B:229:0x0357  */
    /* JADX WARN: Code duplicated, block: B:230:0x035e  */
    /* JADX WARN: Code duplicated, block: B:233:0x0366  */
    /* JADX WARN: Code duplicated, block: B:235:0x036c  */
    /* JADX WARN: Code duplicated, block: B:238:0x037d  */
    /* JADX WARN: Code duplicated, block: B:240:0x038c  */
    /* JADX WARN: Code duplicated, block: B:247:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:249:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:250:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:253:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:255:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:279:0x042f  */
    /* JADX WARN: Code duplicated, block: B:290:0x02c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x03aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x0377 A[SYNTHETIC] */
    public static C0795Ts A(String str) {
        TH th;
        String str2;
        C1233cq c1233cq;
        ArrayList arrayList;
        int iD;
        QH qhI;
        Iterator it;
        C0613Ms c0613Ms;
        String strD;
        String str3;
        boolean z2;
        boolean z3;
        TH thC;
        String strD2;
        TH thC2;
        QH qhI2;
        String strZ;
        String strZ2;
        QH qhI3;
        TH thF;
        QH qhI4;
        String strZ3;
        String strZ4;
        OH ohA;
        SH sh;
        ArrayList arrayList2;
        QH qhI5;
        String str4;
        TH thC3;
        String str5;
        OH ohA2;
        ArrayList arrayList3;
        List list;
        EnumC0639Ns enumC0639Ns;
        TH thF2;
        String strD3;
        C2990ut c2990ut;
        String strD4;
        OH ohA3;
        Iterator it2;
        QH qh;
        QH qh2;
        TH thC4;
        QH qhI6;
        QH qhI7;
        QH qh3;
        TH thC5;
        String str6;
        String str7;
        TH thC6;
        TH thC7;
        AbstractC1474fG.j(str, "body");
        TH thF3 = U9.v(str).f();
        TH thC8 = AbstractC2506pt.c(thF3, "data");
        if (thC8 != null) {
            thF3 = thC8;
        }
        String str8 = "title";
        String strZ5 = z(thF3.i("title"));
        OH ohA4 = AbstractC2506pt.a(thF3, "items");
        C1233cq c1233cq2 = C1233cq.l;
        if (ohA4 != null) {
            arrayList = new ArrayList();
            Iterator it3 = ohA4.l.iterator();
            while (it3.hasNext()) {
                QH qh4 = (QH) it3.next();
                AbstractC1474fG.g(qh4);
                TH thF4 = AbstractC2506pt.f(qh4);
                if (thF4 != null) {
                    TH thC9 = AbstractC2506pt.c(thF4, "innerObject");
                    if (thC9 == null) {
                        thC9 = thF4;
                    }
                    String strD5 = AbstractC2506pt.d(thC9, "_id");
                    if (strD5 == null && (strD5 = AbstractC2506pt.d(thF4, "_id")) == null && (strD5 = AbstractC2506pt.d(thF4, "__id")) == null) {
                        it = it3;
                        c1233cq2 = c1233cq2;
                    } else {
                        TH thC10 = AbstractC2506pt.c(thC9, "homeTeam");
                        TH thC11 = AbstractC2506pt.c(thC9, "awayTeam");
                        String strD6 = AbstractC2506pt.d(thC9, "_model");
                        it = it3;
                        boolean z4 = (strD6 != null && AbstractC1899jh0.N(strD6, "event", true)) || !(((strD = AbstractC2506pt.d(thC9, "__model")) == null || !AbstractC1899jh0.N(strD, "event", true)) && thC10 == null && thC11 == null);
                        TH thC12 = AbstractC2506pt.c(thC9, "__belong");
                        if (thC12 == null) {
                            thC12 = AbstractC2506pt.c(thF4, "__belong");
                        }
                        TH thC13 = thC12 != null ? AbstractC2506pt.c(thC12, "Event") : null;
                        String strD7 = thC13 != null ? AbstractC2506pt.d(thC13, "_id") : null;
                        TH th2 = thC13;
                        OH ohA5 = AbstractC2506pt.a(thC9, "videos");
                        boolean z5 = z4 || (strD7 != null && (ohA5 == null || ohA5.l.size() == 0));
                        String str9 = (!z5 || z4 || strD7 == null) ? strD5 : strD7;
                        TH th3 = z4 ? thC9 : th2;
                        if (th3 != null && (thC7 = AbstractC2506pt.c(th3, "homeTeam")) != null) {
                            thC10 = thC7;
                        }
                        if (th3 != null && (thC6 = AbstractC2506pt.c(th3, "awayTeam")) != null) {
                            thC11 = thC6;
                        }
                        C2893tt c2893ttH = H(thC10);
                        C2893tt c2893ttH2 = H(thC11);
                        String strE = (c2893ttH == null || c2893ttH2 == null || (str6 = c2893ttH.a) == null || AbstractC1899jh0.O(str6) || (str7 = c2893ttH2.a) == null || AbstractC1899jh0.O(str7)) ? null : AbstractC1701hf0.e(str6, " vs ", str7);
                        if (strE != null || (strE = z(thF4.i(str8))) != null || (strE = z(thC9.i(str8))) != null || (strE = z(thC9.i("name"))) != null) {
                            String str10 = strE;
                            TH thC14 = th3 != null ? AbstractC2506pt.c(th3, "eventStatus") : null;
                            String strZ6 = z(thC14 != null ? thC14.i("name") : null);
                            str8 = str8;
                            strZ5 = strZ5;
                            if (strZ6 != null) {
                                str3 = strZ6;
                            } else {
                                strZ6 = th3 != null ? AbstractC2506pt.d(th3, "statusCategory") : null;
                                if (strZ6 != null) {
                                    str3 = strZ6;
                                } else if (th3 == null || (thC5 = AbstractC2506pt.c(th3, "programmingData")) == null) {
                                    str3 = null;
                                } else {
                                    strZ6 = AbstractC2506pt.d(thC5, "status");
                                    str3 = strZ6;
                                }
                            }
                            thF3 = thF3;
                            if (thC14 != null) {
                                String strD8 = AbstractC2506pt.d(thC14, "category");
                                z2 = true;
                                if (strD8 != null && AbstractC1899jh0.N(strD8, "live", true)) {
                                    z3 = true;
                                }
                                thC2 = AbstractC2506pt.c(thC9, "description");
                                if (thC2 != null) {
                                    qhI2 = thC2.i("plain");
                                } else {
                                    qhI2 = null;
                                }
                                strZ = z(qhI2);
                                if (strZ == null) {
                                    strZ2 = z(thC2);
                                } else {
                                    strZ2 = strZ;
                                }
                                if (thC12 != null) {
                                    qhI3 = thC12.i("Tournament");
                                } else {
                                    qhI3 = null;
                                }
                                if (qhI3 != null || (qhI3 instanceof SH)) {
                                    thF = null;
                                } else if (qhI3 instanceof TH) {
                                    thF = qhI3.f();
                                } else if (!(qhI3 instanceof OH) || (qh3 = (QH) AbstractC0911Ye.c0(qhI3.e())) == null) {
                                    thF = null;
                                } else {
                                    thF = AbstractC2506pt.f(qh3);
                                }
                                if (thF != null) {
                                    qhI4 = thF.i("name");
                                } else {
                                    qhI4 = null;
                                }
                                strZ3 = z(qhI4);
                                if (strZ3 == null) {
                                    if (thF != null) {
                                        qhI7 = thF.i("shortName");
                                    } else {
                                        qhI7 = null;
                                    }
                                    strZ3 = z(qhI7);
                                }
                                if (strZ3 == null) {
                                    thC4 = AbstractC2506pt.c(thC9, "tournament");
                                    if (thC4 != null) {
                                        qhI6 = thC4.i("name");
                                    } else {
                                        qhI6 = null;
                                    }
                                    strZ4 = z(qhI6);
                                } else {
                                    strZ4 = strZ3;
                                }
                                OH oh = new OH();
                                ohA = AbstractC2506pt.a(thF4, "images");
                                sh = SH.l;
                                arrayList2 = oh.l;
                                if (ohA != null) {
                                    it2 = ohA.l.iterator();
                                    while (it2.hasNext()) {
                                        qh = (QH) it2.next();
                                        Iterator it4 = it2;
                                        if (qh == null) {
                                            qh2 = sh;
                                        } else {
                                            qh2 = qh;
                                        }
                                        arrayList2.add(qh2);
                                        it2 = it4;
                                    }
                                }
                                if (thC9 != thF4 && (ohA3 = AbstractC2506pt.a(thC9, "images")) != null) {
                                    for (QH qh5 : ohA3.l) {
                                        if (qh5 == null) {
                                            qh5 = sh;
                                        }
                                        arrayList2.add(qh5);
                                    }
                                }
                                C0769Ss c0769SsV = v(oh, AbstractC0937Ze.K("poster", "mediumv", "square", "icon"), true);
                                C0769Ss c0769SsV2 = v(oh, AbstractC0937Ze.K("backdrop", "banner", "panorama", "mediumh"), true);
                                C0769Ss c0769SsV3 = v(oh, AbstractC0937Ze.K("icon", "square"), false);
                                if (thC12 != null) {
                                    qhI5 = thC12.i("Content");
                                } else {
                                    qhI5 = null;
                                }
                                if (qhI5 != null || (qhI5 instanceof SH)) {
                                    str4 = null;
                                } else {
                                    if (qhI5 instanceof TH) {
                                        strD4 = AbstractC2506pt.d(qhI5.f(), "_id");
                                    } else if (qhI5 instanceof OH) {
                                        strD4 = (String) Vb0.I(Vb0.N(Vb0.N(AbstractC0911Ye.U(qhI5.e()), C0691Ps.t), E1.t));
                                    } else {
                                        str4 = null;
                                    }
                                    str4 = strD4;
                                }
                                if (th3 != null || (strD = AbstractC2506pt.d(th3, "startDate")) == null) {
                                    thC3 = AbstractC2506pt.c(thC9, "available");
                                    if (thC3 != null) {
                                        String strD9 = AbstractC2506pt.d(thC3, "from");
                                        str5 = strD9;
                                    } else {
                                        str5 = null;
                                    }
                                } else {
                                    str5 = strD9;
                                }
                                ohA2 = AbstractC2506pt.a(thC9, "videos");
                                if (ohA2 == null) {
                                    ohA2 = AbstractC2506pt.a(thF4, "videos");
                                }
                                if (ohA2 != null) {
                                    arrayList3 = new ArrayList();
                                    for (QH qh6 : ohA2.l) {
                                        AbstractC1474fG.g(qh6);
                                        thF2 = AbstractC2506pt.f(qh6);
                                        if (thF2 == null && (strD3 = AbstractC2506pt.d(thF2, "_id")) != null) {
                                            c2990ut = new C2990ut(strD3, z(thF2.i("name")), AbstractC2506pt.d(thF2, "language"));
                                        } else {
                                            c2990ut = null;
                                        }
                                        if (c2990ut != null) {
                                            arrayList3.add(c2990ut);
                                        }
                                    }
                                } else {
                                    arrayList3 = null;
                                }
                                if (arrayList3 == null) {
                                    list = c1233cq2;
                                } else {
                                    list = arrayList3;
                                }
                                if (z5) {
                                    enumC0639Ns = EnumC0639Ns.m;
                                } else {
                                    enumC0639Ns = EnumC0639Ns.l;
                                }
                                c0613Ms = new C0613Ms(str9, enumC0639Ns, str10, strZ2, strZ4, str5, str3, z3, c0769SsV, c0769SsV2, c0769SsV3, c2893ttH, c2893ttH2, str4, list, null);
                            } else {
                                z2 = true;
                            }
                            if (th3 == null || (thC = AbstractC2506pt.c(th3, "programmingData")) == null || (strD2 = AbstractC2506pt.d(thC, "status")) == null || AbstractC1899jh0.N(strD2, "live", z2) != z2) {
                                QH qhI8 = thC9.i("live");
                                if (qhI8 != null) {
                                    if (!(qhI8 instanceof VH)) {
                                        qhI8 = null;
                                    }
                                    if (qhI8 != null && qhI8.a()) {
                                        z3 = true;
                                    }
                                }
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            thC2 = AbstractC2506pt.c(thC9, "description");
                            if (thC2 != null) {
                                qhI2 = thC2.i("plain");
                            } else {
                                qhI2 = null;
                            }
                            strZ = z(qhI2);
                            if (strZ == null) {
                                strZ2 = z(thC2);
                            } else {
                                strZ2 = strZ;
                            }
                            if (thC12 != null) {
                                qhI3 = thC12.i("Tournament");
                            } else {
                                qhI3 = null;
                            }
                            if (qhI3 != null) {
                                thF = null;
                            } else {
                                thF = null;
                            }
                            if (thF != null) {
                                qhI4 = thF.i("name");
                            } else {
                                qhI4 = null;
                            }
                            strZ3 = z(qhI4);
                            if (strZ3 == null) {
                                if (thF != null) {
                                    qhI7 = thF.i("shortName");
                                } else {
                                    qhI7 = null;
                                }
                                strZ3 = z(qhI7);
                            }
                            if (strZ3 == null) {
                                thC4 = AbstractC2506pt.c(thC9, "tournament");
                                if (thC4 != null) {
                                    qhI6 = thC4.i("name");
                                } else {
                                    qhI6 = null;
                                }
                                strZ4 = z(qhI6);
                            } else {
                                strZ4 = strZ3;
                            }
                            OH oh2 = new OH();
                            ohA = AbstractC2506pt.a(thF4, "images");
                            sh = SH.l;
                            arrayList2 = oh2.l;
                            if (ohA != null) {
                                it2 = ohA.l.iterator();
                                while (it2.hasNext()) {
                                    qh = (QH) it2.next();
                                    Iterator it5 = it2;
                                    if (qh == null) {
                                        qh2 = sh;
                                    } else {
                                        qh2 = qh;
                                    }
                                    arrayList2.add(qh2);
                                    it2 = it5;
                                }
                            }
                            if (thC9 != thF4) {
                                while (r1.hasNext()) {
                                    if (qh5 == null) {
                                        qh5 = sh;
                                    }
                                    arrayList2.add(qh5);
                                }
                            }
                            C0769Ss c0769SsV4 = v(oh2, AbstractC0937Ze.K("poster", "mediumv", "square", "icon"), true);
                            C0769Ss c0769SsV5 = v(oh2, AbstractC0937Ze.K("backdrop", "banner", "panorama", "mediumh"), true);
                            C0769Ss c0769SsV6 = v(oh2, AbstractC0937Ze.K("icon", "square"), false);
                            if (thC12 != null) {
                                qhI5 = thC12.i("Content");
                            } else {
                                qhI5 = null;
                            }
                            if (qhI5 != null) {
                                str4 = null;
                            } else {
                                str4 = null;
                            }
                            if (th3 != null) {
                                thC3 = AbstractC2506pt.c(thC9, "available");
                                if (thC3 != null) {
                                    String strD10 = AbstractC2506pt.d(thC3, "from");
                                    str5 = strD10;
                                } else {
                                    str5 = null;
                                }
                            } else {
                                thC3 = AbstractC2506pt.c(thC9, "available");
                                if (thC3 != null) {
                                    String strD11 = AbstractC2506pt.d(thC3, "from");
                                    str5 = strD11;
                                } else {
                                    str5 = null;
                                }
                            }
                            ohA2 = AbstractC2506pt.a(thC9, "videos");
                            if (ohA2 == null) {
                                ohA2 = AbstractC2506pt.a(thF4, "videos");
                            }
                            if (ohA2 != null) {
                                arrayList3 = new ArrayList();
                                while (r0.hasNext()) {
                                    AbstractC1474fG.g(qh6);
                                    thF2 = AbstractC2506pt.f(qh6);
                                    if (thF2 == null) {
                                        c2990ut = null;
                                    } else {
                                        c2990ut = new C2990ut(strD3, z(thF2.i("name")), AbstractC2506pt.d(thF2, "language"));
                                    }
                                    if (c2990ut != null) {
                                        arrayList3.add(c2990ut);
                                    }
                                }
                            } else {
                                arrayList3 = null;
                            }
                            if (arrayList3 == null) {
                                list = c1233cq2;
                            } else {
                                list = arrayList3;
                            }
                            if (z5) {
                                enumC0639Ns = EnumC0639Ns.m;
                            } else {
                                enumC0639Ns = EnumC0639Ns.l;
                            }
                            c0613Ms = new C0613Ms(str9, enumC0639Ns, str10, strZ2, strZ4, str5, str3, z3, c0769SsV4, c0769SsV5, c0769SsV6, c2893ttH, c2893ttH2, str4, list, null);
                        }
                    }
                    c0613Ms = null;
                } else {
                    thF3 = thF3;
                    str8 = str8;
                    strZ5 = strZ5;
                    it = it3;
                    c1233cq2 = c1233cq2;
                    c0613Ms = null;
                }
                ArrayList arrayList4 = arrayList;
                if (c0613Ms != null) {
                    arrayList4.add(c0613Ms);
                }
                arrayList = arrayList4;
                it3 = it;
                str8 = str8;
                c1233cq2 = c1233cq2;
                strZ5 = strZ5;
                thF3 = thF3;
            }
            th = thF3;
            str2 = strZ5;
            c1233cq = c1233cq2;
        } else {
            th = thF3;
            str2 = strZ5;
            c1233cq = c1233cq2;
            arrayList = null;
        }
        List list2 = arrayList == null ? c1233cq : arrayList;
        TH thC15 = AbstractC2506pt.c(th, "pagination");
        if (thC15 == null || (qhI = thC15.i("last")) == null) {
            iD = 1;
        } else {
            QH qh7 = ((qhI instanceof VH) && (qhI.g().l instanceof Number)) ? qhI : null;
            if (qh7 != null) {
                iD = qh7.d();
            } else {
                iD = 1;
            }
        }
        return new C0795Ts(iD, str2, list2);
    }

    public static void B(WH wh) throws IOException {
        if (wh instanceof ZH) {
            ZH zh = (ZH) wh;
            zh.r0(5);
            Map.Entry entry = (Map.Entry) ((Iterator) zh.v0()).next();
            zh.x0(entry.getValue());
            zh.x0(new VH((String) entry.getKey()));
            return;
        }
        int iL = wh.s;
        if (iL == 0) {
            iL = wh.l();
        }
        if (iL == 13) {
            wh.s = 9;
            return;
        }
        if (iL == 12) {
            wh.s = 8;
        } else {
            if (iL == 14) {
                wh.s = 10;
                return;
            }
            throw new IllegalStateException("Expected a name but was " + AbstractC1701hf0.E(wh.j0()) + wh.Y());
        }
    }

    public static C2893tt H(TH th) {
        String strZ;
        if (th == null || (strZ = z(th.i("name"))) == null) {
            return null;
        }
        String strZ2 = z(th.i("shortName"));
        String strD = AbstractC2506pt.d(th, "flag");
        return new C2893tt(strZ, strZ2, strD != null ? new C0769Ss(strD, null) : null);
    }

    public static final String I(JSONObject jSONObject, String str, String str2) throws IOException {
        String strOptString = jSONObject.optString(str);
        AbstractC1474fG.g(strOptString);
        if (!(!AbstractC1899jh0.O(strOptString))) {
            strOptString = null;
        }
        if (strOptString != null) {
            str2 = strOptString;
        }
        int length = str2.length();
        if (1 <= length && length < 257) {
            for (int i = 0; i < str2.length(); i++) {
                char cCharAt = str2.charAt(i);
                if (cCharAt != '\r' && cCharAt != '\n') {
                }
            }
            return str2;
        }
        throw new IOException("Parámetro Claro remoto inválido");
    }

    public static final C1855j80 h(C1855j80 c1855j80) {
        if ((c1855j80 != null ? c1855j80.r : null) == null) {
            return c1855j80;
        }
        C1661h80 c1661h80Q = c1855j80.q();
        c1661h80Q.g = null;
        return c1661h80Q.a();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    public static final JSONObject j(JSONObject jSONObject) throws JSONException, IOException {
        C2446pE c2446pEB;
        String str = AbstractC1165c5.a;
        AbstractC1474fG.j(str, "<this>");
        C2446pE c2446pEB2 = null;
        try {
            C2349oE c2349oE = new C2349oE();
            c2349oE.g(null, str);
            c2446pEB = c2349oE.b();
        } catch (IllegalArgumentException unused) {
            c2446pEB = null;
        }
        if (c2446pEB == null) {
            throw new IOException("Configuración Claro local inválida");
        }
        String strOptString = jSONObject.optString("claro_base_url");
        AbstractC1474fG.g(strOptString);
        if (!(!AbstractC1899jh0.O(strOptString))) {
            strOptString = null;
        }
        if (strOptString != null) {
            try {
                C2349oE c2349oE2 = new C2349oE();
                c2349oE2.g(null, strOptString);
                c2446pEB2 = c2349oE2.b();
            } catch (IllegalArgumentException unused2) {
            }
            if (c2446pEB2 == null) {
                c2446pEB2 = c2446pEB;
            }
        } else {
            c2446pEB2 = c2446pEB;
        }
        if (!c2446pEB2.j || !AbstractC1474fG.b(c2446pEB2.d, c2446pEB.d) || c2446pEB2.b.length() > 0 || c2446pEB2.c.length() > 0) {
            throw new IOException("Destino Claro remoto no autorizado");
        }
        JSONObject jSONObjectPut = new JSONObject().put("claro_base_url", AbstractC1119bh0.m0(c2446pEB2.i, "/")).put("claro_hks", I(jSONObject, "claro_hks", AbstractC1165c5.b)).put("claro_authpt", I(jSONObject, "claro_authpt", AbstractC1165c5.c));
        AbstractC1474fG.i(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    public static void k(int i, ArrayList arrayList) {
        if (Pu0.n(i, 0, 7, r) == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    public static InterfaceC1356e3 m(boolean z2) {
        int i = 1;
        NV nvJ = AbstractC1370eA.j();
        if (z2) {
            C3084vr0 c3084vr0 = C3084vr0.a;
            C1041ar0 c1041ar0 = C3084vr0.t;
            if (c1041ar0 != null) {
                if (c1041ar0.f <= System.currentTimeMillis() + 90000) {
                    c1041ar0 = null;
                }
                if (c1041ar0 != null) {
                    nvJ.g(c1041ar0.a());
                    nvJ.h(new Wq0(c1041ar0, 0));
                }
            }
        }
        C1813in c1813in = new C1813in();
        c1813in.n(32);
        c1813in.o(16);
        nvJ.a = c1813in;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nvJ.i(30L, timeUnit);
        nvJ.e(30L, timeUnit);
        nvJ.c.add(new C2480pg(i));
        OV ov = new OV(nvJ);
        C1583gR c1583gRK = AbstractC1370eA.k();
        C2525q3 c2525q3 = C2525q3.b;
        c1583gRK.f("https://www.xvideos.com/");
        ((ArrayList) c1583gRK.f793o).add(new P9(i));
        ((ArrayList) c1583gRK.f793o).add(DA.c());
        c1583gRK.m = ov;
        Object objB = c1583gRK.m().b(InterfaceC1356e3.class);
        AbstractC1474fG.i(objB, "create(...)");
        return (InterfaceC1356e3) objB;
    }

    public static AppDatabase n(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        AbstractC1474fG.i(applicationContext, "getApplicationContext(...)");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        E80 e80J = Nr0.j(applicationContext, AppDatabase.class, lowerCase.concat(".db"));
        e80J.i = true;
        e80J.a(AppDatabase.p);
        e80J.a(AppDatabase.q);
        C1556g5 c1556g5 = AppDatabase.f47o;
        AbstractC1474fG.j(c1556g5, "callback");
        e80J.d.add(c1556g5);
        return (AppDatabase) e80J.b();
    }

    public static C0769Ss v(OH oh, List list, boolean z2) {
        TH th;
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator it = oh.l.iterator();
        while (it.hasNext()) {
            TH thF = AbstractC2506pt.f((QH) it.next());
            if (thF != null) {
                arrayList.add(thF);
            }
        }
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                th = null;
                break;
            }
            String str = (String) it2.next();
            Iterator it3 = arrayList.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!AbstractC1899jh0.N(AbstractC2506pt.d((TH) next, "type"), str, true));
            th = (TH) next;
        } while (th == null);
        if (th == null) {
            Object objD0 = AbstractC0911Ye.d0(arrayList);
            if (!z2) {
                objD0 = null;
            }
            th = (TH) objD0;
        }
        if (th != null) {
            return new C0769Ss(AbstractC2506pt.d(th, "_id"), AbstractC2506pt.d(th, "url"));
        }
        return null;
    }

    public static boolean y(String str) {
        return (AbstractC1899jh0.N("Connection", str, true) || AbstractC1899jh0.N("Keep-Alive", str, true) || AbstractC1899jh0.N("Proxy-Authenticate", str, true) || AbstractC1899jh0.N("Proxy-Authorization", str, true) || AbstractC1899jh0.N("TE", str, true) || AbstractC1899jh0.N("Trailers", str, true) || AbstractC1899jh0.N("Transfer-Encoding", str, true) || AbstractC1899jh0.N("Upgrade", str, true)) ? false : true;
    }

    public static String z(QH qh) {
        Object next;
        Object obj = null;
        if (qh == null || (qh instanceof SH)) {
            return null;
        }
        if (qh instanceof VH) {
            I60 i60 = AbstractC2603qt.a;
            return AbstractC2603qt.a(AbstractC2506pt.G(qh));
        }
        if (!(qh instanceof TH)) {
            return null;
        }
        TH thF = qh.f();
        C1634gv c1634gv = new C1634gv(Vb0.N(Vb0.O("es", "original", "en", "pt"), new C0717Qs(1, thF, AbstractC2506pt.class, "stringOrNull", "stringOrNull(Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;", 1, 0)));
        do {
            if (!c1634gv.hasNext()) {
                next = null;
                break;
            }
            next = c1634gv.next();
        } while (!(!AbstractC1899jh0.O((String) next)));
        String str = (String) next;
        if (str == null) {
            C1634gv c1634gv2 = new C1634gv(Vb0.N(AbstractC0911Ye.U(thF.l.entrySet()), E1.u));
            while (c1634gv2.hasNext()) {
                Object next2 = c1634gv2.next();
                if (!AbstractC1899jh0.O((String) next2)) {
                    obj = next2;
                    break;
                }
            }
            str = (String) obj;
        }
        return AbstractC2603qt.a(str);
    }

    public void C(File file, File file2) throws IOException {
        AbstractC1474fG.j(file, "from");
        AbstractC1474fG.j(file2, "to");
        s(file2);
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException("failed to rename " + file + " to " + file2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object D(InterfaceC0473Hh interfaceC0473Hh) {
        S30 s30;
        Context context;
        if (interfaceC0473Hh instanceof S30) {
            s30 = (S30) interfaceC0473Hh;
            int i = s30.f503o;
            if ((i & Integer.MIN_VALUE) != 0) {
                s30.f503o = i - Integer.MIN_VALUE;
            } else {
                s30 = new S30(this, interfaceC0473Hh);
            }
        } else {
            s30 = new S30(this, interfaceC0473Hh);
        }
        Object obj = s30.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = s30.f503o;
        if (i2 == 0) {
            Jp0.O(obj);
            MyApplication myApplication = MyApplication.l;
            Context applicationContext = Jp0.s().getApplicationContext();
            RuntimeSecurityGuard runtimeSecurityGuard = RuntimeSecurityGuard.a;
            RuntimeSecurityGuard.b();
            TamperGuard tamperGuard = TamperGuard.a;
            AbstractC1474fG.g(applicationContext);
            tamperGuard.e(applicationContext, "SENSITIVE_");
            Ec0 ec0 = Ec0.a;
            s30.l = applicationContext;
            s30.f503o = 1;
            if (Ec0.f(applicationContext, false, true, s30, 2) == enumC1706hi) {
                return enumC1706hi;
            }
            context = applicationContext;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = s30.l;
            Jp0.O(obj);
        }
        TamperGuard tamperGuard2 = TamperGuard.a;
        AbstractC1474fG.g(context);
        tamperGuard2.e(context, "SENSITIVE_");
        RuntimeSecurityGuard runtimeSecurityGuard2 = RuntimeSecurityGuard.a;
        RuntimeSecurityGuard.b();
        return C2985uq0.a;
    }

    public void E(Context context) {
        Object next;
        AbstractC1474fG.j(context, "context");
        String strB = Cr0.m.b();
        if (AbstractC1474fG.b(strB, "PPV.TO")) {
            QW qw = QW.b;
        } else {
            Q30.a.getClass();
            Iterator it = P30.b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC1474fG.b(((Q30) next).getName(), strB));
            if (((Q30) next) == null) {
                C1816io0 c1816io0 = C1816io0.b;
            }
        }
        w(context);
    }

    public C1948k6 F(File file) {
        int i = 1;
        AbstractC1474fG.j(file, "file");
        try {
            Logger logger = SV.a;
            return new C1948k6(new FileOutputStream(file, false), i, new Hj0());
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = SV.a;
            return new C1948k6(new FileOutputStream(file, false), i, new Hj0());
        }
    }

    public boolean G(C0643Nw c0643Nw) {
        switch (this.l) {
            case 11:
                String str = c0643Nw.w;
                return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
            default:
                String str2 = c0643Nw.w;
                return "text/vtt".equals(str2) || "text/x-ssa".equals(str2) || "application/ttml+xml".equals(str2) || "application/x-mp4-vtt".equals(str2) || "application/x-subrip".equals(str2) || "application/x-quicktime-tx3g".equals(str2) || "application/cea-608".equals(str2) || "application/x-mp4-cea-608".equals(str2) || "application/cea-708".equals(str2) || "application/dvbsubs".equals(str2) || "application/pgs".equals(str2) || "text/x-exoplayer-cues".equals(str2);
        }
    }

    @Override // o.Q8
    public Bitmap a(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // o.InterfaceC1201ca
    public Class b() {
        return InputStream.class;
    }

    @Override // o.Q8
    public Bitmap c(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // o.Nv0
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // o.Q8
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // o.Nv0
    public String[] e() {
        return u;
    }

    @Override // o.Nv0
    public ProxyControllerBoundaryInterface getProxyController() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // o.Nv0
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // o.InterfaceC1201ca
    public Object i(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    @Override // o.InterfaceC0602Mh
    public Object l(Object obj) {
        switch (this.l) {
            case 0:
                return obj.toString();
            case 2:
                AbstractC2051l80 abstractC2051l80 = (AbstractC2051l80) obj;
                try {
                    E9 e9 = new E9();
                    abstractC2051l80.p().u(e9);
                    return new E50(abstractC2051l80.l(), abstractC2051l80.i(), e9, 1);
                } finally {
                    abstractC2051l80.close();
                }
            case 3:
                return (AbstractC2051l80) obj;
            case 4:
                ((AbstractC2051l80) obj).close();
                return null;
            case 14:
                return Byte.valueOf(((AbstractC2051l80) obj).q());
            case 15:
                return Double.valueOf(((AbstractC2051l80) obj).q());
            case 16:
                return Integer.valueOf(((AbstractC2051l80) obj).q());
            default:
                return Short.valueOf(((AbstractC2051l80) obj).q());
        }
    }

    public AP o(C0643Nw c0643Nw) {
        String str = c0643Nw.w;
        if (str != null) {
            str.getClass();
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new C1848j5(0);
                case "application/x-icy":
                    return new IE();
                case "application/id3":
                    return new ME(null);
                case "application/x-emsg":
                    return new C1848j5(1);
                case "application/x-scte35":
                    return new Cf0();
            }
        }
        throw new IllegalArgumentException(AbstractC1701hf0.t("Attempted to create decoder for unsupported MIME type: ", str));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public InterfaceC3064vh0 p(C0643Nw c0643Nw) {
        String str = c0643Nw.w;
        if (str != null) {
            byte b = -1;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        b = 0;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        b = 1;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        b = 2;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        b = 3;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        b = 4;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        b = 5;
                    }
                    break;
                case 930165504:
                    if (str.equals("application/x-mp4-cea-608")) {
                        b = 6;
                    }
                    break;
                case 1201784583:
                    if (str.equals("text/x-exoplayer-cues")) {
                        b = 7;
                    }
                    break;
                case 1566015601:
                    if (str.equals("application/cea-608")) {
                        b = 8;
                    }
                    break;
                case 1566016562:
                    if (str.equals("application/cea-708")) {
                        b = 9;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        b = 10;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        b = C3285xv.h;
                    }
                    break;
            }
            int i = c0643Nw.O;
            List list = c0643Nw.y;
            switch (b) {
                case 0:
                    return new C1328dp(list);
                case 1:
                    return new HY();
                case 2:
                    return new C1328dp();
                case 3:
                    return new C1246cw0();
                case 4:
                    return new C2692rp0(list);
                case 5:
                    return new Tf0(list);
                case 6:
                case 8:
                    return new C1792ic(str, i);
                case 7:
                    return new C2100lk();
                case 9:
                    return new C2181mc(i, list);
                case 10:
                    return new C2676rh0();
                case 11:
                    return new C1033an0();
            }
        }
        throw new IllegalArgumentException(AbstractC1701hf0.t("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public List q(F2 f2) {
        return Collections.singletonList(new C2391ok(f2));
    }

    public List r() {
        return Collections.emptyList();
    }

    public void s(File file) throws IOException {
        AbstractC1474fG.j(file, "file");
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + file);
    }

    public void t(File file) throws IOException {
        AbstractC1474fG.j(file, "directory");
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                t(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete " + file2);
            }
        }
    }

    public String toString() {
        switch (this.l) {
            case 8:
                return "FileSystem.SYSTEM";
            default:
                return super.toString();
        }
    }

    public boolean u(File file) {
        AbstractC1474fG.j(file, "file");
        return file.exists();
    }

    public AppDatabase w(Context context) {
        Object next;
        Q30 q30;
        AbstractC1474fG.j(context, "context");
        String strB = Cr0.m.b();
        if (AbstractC1474fG.b(strB, "PPV.TO")) {
            q30 = QW.b;
        } else {
            Q30.a.getClass();
            Iterator it = P30.b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC1474fG.b(((Q30) next).getName(), strB));
            Q30 q31 = (Q30) next;
            q30 = q31 == null ? C1816io0.b : q31;
        }
        String name = q30.getName();
        if (name != null) {
            return x(context, name);
        }
        throw new IllegalStateException("Current provider is not set");
    }

    public AppDatabase x(Context context, String str) {
        AppDatabase appDatabase;
        AbstractC1474fG.j(context, "context");
        AbstractC1474fG.j(str, "providerName");
        synchronized (this) {
            try {
                LinkedHashMap linkedHashMap = AppDatabase.n;
                Object objN = linkedHashMap.get(str);
                if (objN == null) {
                    O9 o9 = AppDatabase.m;
                    objN = n(context, str);
                    linkedHashMap.put(str, objN);
                }
                appDatabase = (AppDatabase) objN;
            } catch (Throwable th) {
                throw th;
            }
        }
        return appDatabase;
    }

    @Override // o.Q8
    public void g() {
    }

    @Override // o.Q8
    public void f(int i) {
    }
}
