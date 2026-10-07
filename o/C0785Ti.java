package o;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: renamed from: o.Ti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0785Ti extends DefaultHandler implements InterfaceC3046vX {
    public static final Pattern m = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern n = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f541o = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] p = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory l;

    public C0785Ti() {
        try {
            this.l = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static long a(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            int i3 = Lr0.a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            arrayList.add(new Db0(j, j2));
            j += j2;
        }
        return j;
    }

    public static void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (Sr0.q(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (Sr0.q(xmlPullParser)) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x0085 A[PHI: r0
  0x0085: PHI (r0v11 int) = (r0v3 int), (r0v14 int) binds: [B:82:0x00f2, B:43:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static int d(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int iL;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        int iL2 = -1;
        switch (attributeValue) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                iL = l(xmlPullParser, "value", -1);
                if (iL > 0 && iL < 33) {
                    iL2 = iL;
                    break;
                }
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                iL2 = l(xmlPullParser, "value", -1);
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue2 != null) {
                    String strI = U9.I(attributeValue2);
                    strI.getClass();
                    switch (strI) {
                        case "4000":
                            iL2 = 1;
                            break;
                        case "a000":
                            iL2 = 2;
                            break;
                        case "f801":
                            iL2 = 6;
                            break;
                        case "fa01":
                            iL2 = 8;
                            break;
                    }
                }
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                int iL3 = l(xmlPullParser, "value", -1);
                if (iL3 >= 0) {
                    int[] iArr = p;
                    if (iL3 < iArr.length) {
                        iL2 = iArr[iL3];
                    }
                    break;
                }
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue3 != null && (iL = Integer.bitCount(Integer.parseInt(attributeValue3, 16))) != 0) {
                    iL2 = iL;
                    break;
                }
                break;
        }
        do {
            xmlPullParser.next();
        } while (!Sr0.p(xmlPullParser, "AudioChannelConfiguration"));
        return iL2;
    }

    public static long e(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList f(XmlPullParser xmlPullParser, List list, boolean z) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!Sr0.p(xmlPullParser, "BaseURL"));
        if (text != null && AbstractC3045vW.t(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return Nr0.v(new C2922u8(i, i2, text, attributeValue3));
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            C2922u8 c2922u8 = (C2922u8) list.get(i3);
            String strC = AbstractC3045vW.C(c2922u8.a, text);
            String str = attributeValue3 == null ? strC : attributeValue3;
            if (z) {
                i = c2922u8.c;
                i2 = c2922u8.d;
                str = c2922u8.b;
            }
            arrayList.add(new C2922u8(i, i2, strC, str));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:52:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:6:0x001b  */
    /* JADX WARN: Code duplicated, block: B:79:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x012d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0150  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static Pair g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        UUID uuid;
        UUID uuid2;
        ?? attributeValue2;
        ?? D;
        UUID uuid3;
        String attributeValue3;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue4 != null) {
            String strI = U9.I(attributeValue4);
            strI.getClass();
            switch (strI) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    uuid = AbstractC2661ra.c;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    D = uuid2;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = AbstractC2661ra.e;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    D = uuid2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = AbstractC2661ra.d;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    D = uuid2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, "value");
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i = 0;
                    while (true) {
                        if (i >= attributeCount) {
                            attributeValue3 = null;
                        } else {
                            String attributeName = xmlPullParser.getAttributeName(i);
                            int iIndexOf = attributeName.indexOf(58);
                            if (iIndexOf != -1) {
                                attributeName = attributeName.substring(iIndexOf + 1);
                            }
                            if (attributeName.equals("default_KID")) {
                                attributeValue3 = xmlPullParser.getAttributeValue(i);
                            } else {
                                i++;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(attributeValue3) && !"00000000-0000-0000-0000-000000000000".equals(attributeValue3)) {
                        String[] strArrSplit = attributeValue3.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                            uuidArr[i2] = UUID.fromString(strArrSplit[i2]);
                        }
                        uuid = AbstractC2661ra.b;
                        attributeValue2 = 0;
                        D = AbstractC3021v9.d(uuid, uuidArr, null);
                        break;
                    } else {
                        uuid = null;
                        uuid2 = uuid;
                        attributeValue2 = uuid2;
                        D = uuid2;
                        break;
                    }
                    break;
                default:
                    attributeValue = null;
                    uuid = null;
                    uuid2 = uuid;
                    attributeValue2 = uuid2;
                    D = uuid2;
                    break;
            }
        } else {
            attributeValue = null;
            uuid = null;
            uuid2 = uuid;
            attributeValue2 = uuid2;
            D = uuid2;
        }
        do {
            xmlPullParser.next();
            if (Sr0.r(xmlPullParser, "clearkey:Laurl") && xmlPullParser.next() == 4) {
                D = D;
                attributeValue2 = xmlPullParser.getText();
            } else if (Sr0.r(xmlPullParser, "ms:laurl")) {
                D = D;
                attributeValue2 = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (D == 0 && Sr0.q(xmlPullParser)) {
                String name = xmlPullParser.getName();
                int iIndexOf2 = name.indexOf(58);
                if (iIndexOf2 != -1) {
                    name = name.substring(iIndexOf2 + 1);
                }
                if (name.equals("pssh") && xmlPullParser.next() == 4) {
                    byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                    C2613qy c2613qyV = AbstractC3021v9.v(bArrDecode);
                    UUID uuid4 = c2613qyV == null ? null : (UUID) c2613qyV.n;
                    if (uuid4 == null) {
                        AP.z();
                        uuid = uuid4;
                        D = 0;
                        attributeValue2 = attributeValue2;
                    } else {
                        UUID uuid5 = uuid4;
                        D = bArrDecode;
                        uuid = uuid5;
                        attributeValue2 = attributeValue2;
                    }
                } else if (D == 0) {
                    uuid3 = AbstractC2661ra.e;
                    if (!uuid3.equals(uuid)) {
                        b(xmlPullParser);
                        D = D;
                        attributeValue2 = attributeValue2;
                    } else {
                        b(xmlPullParser);
                        D = D;
                        attributeValue2 = attributeValue2;
                    }
                } else {
                    b(xmlPullParser);
                    D = D;
                    attributeValue2 = attributeValue2;
                }
            } else if (D == 0) {
                uuid3 = AbstractC2661ra.e;
                if (!uuid3.equals(uuid) && Sr0.r(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    D = AbstractC3021v9.d(uuid3, null, Base64.decode(xmlPullParser.getText(), 0));
                    attributeValue2 = attributeValue2;
                } else {
                    b(xmlPullParser);
                    D = D;
                    attributeValue2 = attributeValue2;
                }
            } else {
                b(xmlPullParser);
                D = D;
                attributeValue2 = attributeValue2;
            }
        } while (!Sr0.p(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new C3174wo(uuid, attributeValue2, "video/mp4", D) : null);
    }

    public static int h(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static C2589qm i(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!Sr0.p(xmlPullParser, str));
        return new C2589qm(attributeValue, attributeValue2, str2);
    }

    public static long j(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = Lr0.g.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d2 = d + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d3 = d2 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d4 = d3 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d5 = d4 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j2 = (long) ((d5 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return zIsEmpty ? -j2 : j2;
    }

    public static float k(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = m.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int i = Integer.parseInt(matcher.group(1));
        String strGroup = matcher.group(2);
        return !TextUtils.isEmpty(strGroup) ? i / Integer.parseInt(strGroup) : i;
    }

    public static int l(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    public static long m(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r107v2 ??, new type: java.lang.Object
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:488)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static o.C0733Ri n(org.xmlpull.v1.XmlPullParser r157, android.net.Uri r158) {
        /*
            Method dump skipped, instruction units count: 4964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0785Ti.n(org.xmlpull.v1.XmlPullParser, android.net.Uri):o.Ri");
    }

    public static C2433p50 o(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
            return new C2433p50(j, j2, attributeValue);
        }
        j = 0;
        j2 = -1;
        return new C2433p50(j, j2, attributeValue);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int p(String str) {
        if (str == null) {
            return 0;
        }
        byte b = -1;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    b = 0;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    b = 1;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    b = 2;
                }
                break;
            case -1574842690:
                if (str.equals("forced_subtitle")) {
                    b = 3;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    b = 4;
                }
                break;
            case -1396432756:
                if (str.equals("forced-subtitle")) {
                    b = 5;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    b = 6;
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    b = 7;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    b = 8;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    b = 9;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    b = 10;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    b = C3285xv.h;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    b = 12;
                }
                break;
        }
        switch (b) {
            case 0:
            case 3:
            case 5:
                return 128;
            case 1:
                return 512;
            case 2:
                return C1672hI.a.g;
            case 4:
                return 2;
            case 6:
                return 16;
            case 7:
                return 1;
            case 8:
                return 256;
            case 9:
                return 64;
            case 10:
                return 8;
            case 11:
                return 32;
            case 12:
                return 4;
            default:
                return 0;
        }
    }

    public static int q(ArrayList arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (U9.n("http://dashif.org/guidelines/trickmode", ((C2589qm) arrayList.get(i2)).a)) {
                i = 16384;
            }
        }
        return i;
    }

    public static Eb0 r(XmlPullParser xmlPullParser, Eb0 eb0) throws XmlPullParserException, IOException {
        long j;
        long j2;
        long jM = m(xmlPullParser, "timescale", eb0 != null ? eb0.b : 1L);
        long jM2 = m(xmlPullParser, "presentationTimeOffset", eb0 != null ? eb0.c : 0L);
        long j3 = eb0 != null ? eb0.d : 0L;
        long j4 = eb0 != null ? eb0.e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            long j5 = Long.parseLong(strArrSplit[0]);
            j = (Long.parseLong(strArrSplit[1]) - j5) + 1;
            j2 = j5;
        } else {
            j = j4;
            j2 = j3;
        }
        C2433p50 c2433p50O = eb0 != null ? eb0.a : null;
        do {
            xmlPullParser.next();
            if (Sr0.r(xmlPullParser, "Initialization")) {
                c2433p50O = o(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
        } while (!Sr0.p(xmlPullParser, "SegmentBase"));
        return new Eb0(c2433p50O, jM, jM2, j2, j);
    }

    public static Bb0 s(XmlPullParser xmlPullParser, Bb0 bb0, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long jM = m(xmlPullParser, "timescale", bb0 != null ? bb0.b : 1L);
        long jM2 = m(xmlPullParser, "presentationTimeOffset", bb0 != null ? bb0.c : 0L);
        long jM3 = m(xmlPullParser, "duration", bb0 != null ? bb0.e : -9223372036854775807L);
        long jM4 = m(xmlPullParser, "startNumber", bb0 != null ? bb0.d : 1L);
        long j6 = j4 == -9223372036854775807L ? j3 : j4;
        long j7 = j6 == Long.MAX_VALUE ? -9223372036854775807L : j6;
        List arrayList = null;
        C2433p50 c2433p50O = null;
        List listU = null;
        do {
            xmlPullParser.next();
            if (Sr0.r(xmlPullParser, "Initialization")) {
                c2433p50O = o(xmlPullParser, "sourceURL", "range");
            } else if (Sr0.r(xmlPullParser, "SegmentTimeline")) {
                listU = u(xmlPullParser, jM, j2);
            } else if (Sr0.r(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(o(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!Sr0.p(xmlPullParser, "SegmentList"));
        if (bb0 != null) {
            if (c2433p50O == null) {
                c2433p50O = bb0.a;
            }
            if (listU == null) {
                listU = bb0.f;
            }
            if (arrayList == null) {
                arrayList = bb0.j;
            }
        }
        return new Bb0(c2433p50O, jM, jM2, jM4, jM3, listU, j7, arrayList, Lr0.K(j5), Lr0.K(j));
    }

    public static Cb0 t(XmlPullParser xmlPullParser, Cb0 cb0, List list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6;
        long jM = m(xmlPullParser, "timescale", cb0 != null ? cb0.b : 1L);
        long jM2 = m(xmlPullParser, "presentationTimeOffset", cb0 != null ? cb0.c : 0L);
        long jM3 = m(xmlPullParser, "duration", cb0 != null ? cb0.e : -9223372036854775807L);
        long jM4 = m(xmlPullParser, "startNumber", cb0 != null ? cb0.d : 1L);
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j6 = -1;
                break;
            }
            C2589qm c2589qm = (C2589qm) list.get(i);
            if (U9.n("http://dashif.org/guidelines/last-segment-number", c2589qm.a)) {
                j6 = Long.parseLong(c2589qm.b);
                break;
            }
            i++;
        }
        long j7 = j6;
        long j8 = j4 == -9223372036854775807L ? j3 : j4;
        long j9 = j8 == Long.MAX_VALUE ? -9223372036854775807L : j8;
        C2433p50 c2433p50O = null;
        QU quV = v(xmlPullParser, "media", cb0 != null ? cb0.k : null);
        QU quV2 = v(xmlPullParser, "initialization", cb0 != null ? cb0.j : null);
        List listU = null;
        do {
            xmlPullParser.next();
            if (Sr0.r(xmlPullParser, "Initialization")) {
                c2433p50O = o(xmlPullParser, "sourceURL", "range");
            } else if (Sr0.r(xmlPullParser, "SegmentTimeline")) {
                listU = u(xmlPullParser, jM, j2);
            } else {
                b(xmlPullParser);
            }
        } while (!Sr0.p(xmlPullParser, "SegmentTemplate"));
        if (cb0 != null) {
            if (c2433p50O == null) {
                c2433p50O = cb0.a;
            }
            if (listU == null) {
                listU = cb0.f;
            }
        }
        return new Cb0(c2433p50O, jM, jM2, jM4, j7, jM3, listU, j9, quV2, quV, Lr0.K(j5), Lr0.K(j));
    }

    public static ArrayList u(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jA = 0;
        long jM = -9223372036854775807L;
        boolean z = false;
        int iL = 0;
        do {
            xmlPullParser.next();
            if (Sr0.r(xmlPullParser, "S")) {
                long jM2 = m(xmlPullParser, "t", -9223372036854775807L);
                if (z) {
                    jA = a(arrayList, jA, jM, iL, jM2);
                }
                if (jM2 == -9223372036854775807L) {
                    jM2 = jA;
                }
                jM = m(xmlPullParser, "d", -9223372036854775807L);
                iL = l(xmlPullParser, "r", 0);
                jA = jM2;
                z = true;
            } else {
                b(xmlPullParser);
            }
        } while (!Sr0.p(xmlPullParser, "SegmentTimeline"));
        if (z) {
            a(arrayList, jA, jM, iL, Lr0.R(j2, j, 1000L));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00c6. Please report as an issue. */
    public static QU v(XmlPullParser xmlPullParser, String str, QU qu) {
        String strSubstring;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return qu;
        }
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = "";
        int length = 0;
        int i = 0;
        while (length < attributeValue.length()) {
            int iIndexOf = attributeValue.indexOf("$", length);
            if (iIndexOf == -1) {
                strArr[i] = strArr[i] + attributeValue.substring(length);
                length = attributeValue.length();
            } else if (iIndexOf != length) {
                strArr[i] = strArr[i] + attributeValue.substring(length, iIndexOf);
                length = iIndexOf;
            } else if (attributeValue.startsWith("$$", length)) {
                strArr[i] = AbstractC1701hf0.h(new StringBuilder(), strArr[i], "$");
                length += 2;
            } else {
                int i2 = length + 1;
                int iIndexOf2 = attributeValue.indexOf("$", i2);
                String strSubstring2 = attributeValue.substring(i2, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    iArr[i] = 1;
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring.concat("d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.getClass();
                    strSubstring2.getClass();
                    switch (strSubstring2) {
                        case "Number":
                            iArr[i] = 2;
                            break;
                        case "Time":
                            iArr[i] = 4;
                            break;
                        case "Bandwidth":
                            iArr[i] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    strArr2[i] = strSubstring;
                }
                i++;
                strArr[i] = "";
                length = iIndexOf2 + 1;
            }
        }
        return new QU(strArr, iArr, strArr2, i);
    }

    @Override // o.InterfaceC3046vX
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C0733Ri D(Uri uri, InputStream inputStream) throws C2949uX {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.l.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return n(xmlPullParserNewPullParser, uri);
            }
            throw C2949uX.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e) {
            throw C2949uX.b(null, e);
        }
    }
}
