package o;

import android.text.Layout;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: renamed from: o.an0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1033an0 extends Rd0 {
    public static final Pattern n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f680o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern t = Pattern.compile("^(\\d+) (\\d+)$");
    public static final U90 u = new U90(1, 30.0f, 1);
    public static final C2102ll v = new C2102ll(15);
    public final XmlPullParserFactory m;

    public C1033an0() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.m = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static C1326dn0 i(C1326dn0 c1326dn0) {
        return c1326dn0 == null ? new C1326dn0() : c1326dn0;
    }

    public static boolean j(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static Layout.Alignment k(String str) {
        String strI = U9.I(str);
        strI.getClass();
        switch (strI) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    public static C2102ll l(XmlPullParser xmlPullParser, C2102ll c2102ll) throws C3161wh0 {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return c2102ll;
        }
        Matcher matcher = t.matcher(attributeValue);
        if (!matcher.matches()) {
            "Ignoring malformed cell resolution: ".concat(attributeValue);
            AP.z();
            return c2102ll;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i2 = Integer.parseInt(strGroup2);
            if (i != 0 && i2 != 0) {
                return new C2102ll(i2);
            }
            throw new C3161wh0("Invalid cell resolution " + i + " " + i2);
        } catch (NumberFormatException unused) {
            "Ignoring malformed cell resolution: ".concat(attributeValue);
            AP.z();
            return c2102ll;
        }
    }

    public static void m(String str, C1326dn0 c1326dn0) throws C3161wh0 {
        Matcher matcher;
        int i = Lr0.a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = p;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new C3161wh0(AbstractC1701hf0.g(new StringBuilder("Invalid number of entries for fontSize: "), strArrSplit.length, "."));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            AP.z();
        }
        if (!matcher.matches()) {
            throw new C3161wh0(AbstractC1701hf0.u("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        strGroup.hashCode();
        switch (strGroup) {
            case "%":
                c1326dn0.j = 3;
                break;
            case "em":
                c1326dn0.j = 2;
                break;
            case "px":
                c1326dn0.j = 1;
                break;
            default:
                throw new C3161wh0(AbstractC1701hf0.u("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        c1326dn0.k = Float.parseFloat(strGroup2);
    }

    public static U90 n(XmlPullParser xmlPullParser) throws C3161wh0 {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i2 = Lr0.a;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            if (strArrSplit.length != 2) {
                throw new C3161wh0("frameRateMultiplier doesn't have 2 parts");
            }
            f = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f = 1.0f;
        }
        U90 u90 = u;
        int i3 = u90.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new U90(i3, i * f, attributeValue4 != null ? Integer.parseInt(attributeValue4) : u90.c);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:44:0x0119  */
    /* JADX WARN: Code duplicated, block: B:46:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0121  */
    /* JADX WARN: Code duplicated, block: B:52:0x0153  */
    /* JADX WARN: Code duplicated, block: B:54:0x0162  */
    /* JADX WARN: Code duplicated, block: B:57:0x016b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0171  */
    /* JADX WARN: Code duplicated, block: B:60:0x017b  */
    /* JADX WARN: Code duplicated, block: B:63:0x018d  */
    /* JADX WARN: Code duplicated, block: B:66:0x019c  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ec  */
    public static void o(XmlPullParser xmlPullParser, HashMap map, C2102ll c2102ll, C2650rP c2650rP, HashMap map2, HashMap map3) throws XmlPullParserException, IOException {
        String strK;
        float f;
        float f2;
        String strK2;
        Matcher matcher;
        Matcher matcher2;
        float f3;
        float f4;
        String strK3;
        float f5;
        int i;
        String strK4;
        int i2;
        C1228cn0 c1228cn0;
        String strI;
        String strI2;
        String[] strArrSplit;
        do {
            xmlPullParser.next();
            if (Sr0.r(xmlPullParser, "style")) {
                String strK5 = Sr0.k(xmlPullParser, "style");
                C1326dn0 c1326dn0Q = q(xmlPullParser, new C1326dn0());
                if (strK5 != null) {
                    String strTrim = strK5.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        int i3 = Lr0.a;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    for (String str : strArrSplit) {
                        c1326dn0Q.a((C1326dn0) map.get(str));
                    }
                }
                String str2 = c1326dn0Q.l;
                if (str2 != null) {
                    map.put(str2, c1326dn0Q);
                }
            } else if (Sr0.r(xmlPullParser, "region")) {
                String strK6 = Sr0.k(xmlPullParser, "id");
                if (strK6 != null) {
                    String strK7 = Sr0.k(xmlPullParser, "origin");
                    if (strK7 != null) {
                        Pattern pattern = r;
                        Matcher matcher3 = pattern.matcher(strK7);
                        Pattern pattern2 = s;
                        Matcher matcher4 = pattern2.matcher(strK7);
                        if (matcher3.matches()) {
                            try {
                                String strGroup = matcher3.group(1);
                                strGroup.getClass();
                                float f6 = Float.parseFloat(strGroup) / 100.0f;
                                String strGroup2 = matcher3.group(2);
                                strGroup2.getClass();
                                f = Float.parseFloat(strGroup2) / 100.0f;
                                f2 = f6;
                                strK2 = Sr0.k(xmlPullParser, "extent");
                                if (strK2 != null) {
                                    matcher = pattern.matcher(strK2);
                                    matcher2 = pattern2.matcher(strK2);
                                    if (matcher.matches()) {
                                        try {
                                            String strGroup3 = matcher.group(1);
                                            strGroup3.getClass();
                                            float f7 = Float.parseFloat(strGroup3) / 100.0f;
                                            String strGroup4 = matcher.group(2);
                                            strGroup4.getClass();
                                            f3 = Float.parseFloat(strGroup4) / 100.0f;
                                            f4 = f7;
                                        } catch (NumberFormatException unused) {
                                            "Ignoring region with malformed extent: ".concat(strK7);
                                            AP.z();
                                            c1228cn0 = null;
                                        }
                                    } else if (matcher2.matches()) {
                                        "Ignoring region with unsupported extent: ".concat(strK7);
                                        AP.z();
                                    } else if (c2650rP == null) {
                                        "Ignoring region with missing tts:extent: ".concat(strK7);
                                        AP.z();
                                    } else {
                                        try {
                                            String strGroup5 = matcher2.group(1);
                                            strGroup5.getClass();
                                            int i4 = Integer.parseInt(strGroup5);
                                            String strGroup6 = matcher2.group(2);
                                            strGroup6.getClass();
                                            int i5 = Integer.parseInt(strGroup6);
                                            f4 = i4 / c2650rP.a;
                                            f3 = i5 / c2650rP.b;
                                        } catch (NumberFormatException unused2) {
                                            "Ignoring region with malformed extent: ".concat(strK7);
                                            AP.z();
                                            c1228cn0 = null;
                                        }
                                    }
                                    strK3 = Sr0.k(xmlPullParser, "displayAlign");
                                    if (strK3 != null) {
                                        strI2 = U9.I(strK3);
                                        strI2.getClass();
                                        if (!strI2.equals("center")) {
                                            f5 = (f3 / 2.0f) + f;
                                            i = 1;
                                        } else if (strI2.equals("after")) {
                                            f5 = f + f3;
                                            i = 2;
                                        } else {
                                            f5 = f;
                                            i = 0;
                                        }
                                    } else {
                                        f5 = f;
                                        i = 0;
                                    }
                                    float f8 = 1.0f / c2102ll.l;
                                    strK4 = Sr0.k(xmlPullParser, "writingMode");
                                    if (strK4 != null) {
                                        strI = U9.I(strK4);
                                        strI.getClass();
                                        switch (strI) {
                                            case "tb":
                                            case "tblr":
                                                i2 = 2;
                                                break;
                                            case "tbrl":
                                                i2 = 1;
                                                break;
                                            default:
                                                i2 = Integer.MIN_VALUE;
                                                break;
                                        }
                                    } else {
                                        i2 = Integer.MIN_VALUE;
                                    }
                                    c1228cn0 = new C1228cn0(strK6, f2, f5, 0, i, f4, f3, 1, f8, i2);
                                } else {
                                    AP.z();
                                }
                            } catch (NumberFormatException unused3) {
                                "Ignoring region with malformed origin: ".concat(strK7);
                                AP.z();
                            }
                        } else if (!matcher4.matches()) {
                            "Ignoring region with unsupported origin: ".concat(strK7);
                            AP.z();
                        } else if (c2650rP == null) {
                            "Ignoring region with missing tts:extent: ".concat(strK7);
                            AP.z();
                        } else {
                            try {
                                String strGroup7 = matcher4.group(1);
                                strGroup7.getClass();
                                int i6 = Integer.parseInt(strGroup7);
                                String strGroup8 = matcher4.group(2);
                                strGroup8.getClass();
                                int i7 = Integer.parseInt(strGroup8);
                                f2 = i6 / c2650rP.a;
                                f = i7 / c2650rP.b;
                                strK2 = Sr0.k(xmlPullParser, "extent");
                                if (strK2 != null) {
                                    matcher = pattern.matcher(strK2);
                                    matcher2 = pattern2.matcher(strK2);
                                    if (matcher.matches()) {
                                        String strGroup9 = matcher.group(1);
                                        strGroup9.getClass();
                                        float f9 = Float.parseFloat(strGroup9) / 100.0f;
                                        String strGroup10 = matcher.group(2);
                                        strGroup10.getClass();
                                        f3 = Float.parseFloat(strGroup10) / 100.0f;
                                        f4 = f9;
                                    } else if (matcher2.matches()) {
                                        "Ignoring region with unsupported extent: ".concat(strK7);
                                        AP.z();
                                    } else if (c2650rP == null) {
                                        "Ignoring region with missing tts:extent: ".concat(strK7);
                                        AP.z();
                                    } else {
                                        String strGroup11 = matcher2.group(1);
                                        strGroup11.getClass();
                                        int i8 = Integer.parseInt(strGroup11);
                                        String strGroup12 = matcher2.group(2);
                                        strGroup12.getClass();
                                        int i9 = Integer.parseInt(strGroup12);
                                        f4 = i8 / c2650rP.a;
                                        f3 = i9 / c2650rP.b;
                                    }
                                    strK3 = Sr0.k(xmlPullParser, "displayAlign");
                                    if (strK3 != null) {
                                        strI2 = U9.I(strK3);
                                        strI2.getClass();
                                        if (!strI2.equals("center")) {
                                            f5 = (f3 / 2.0f) + f;
                                            i = 1;
                                        } else if (strI2.equals("after")) {
                                            f5 = f;
                                            i = 0;
                                        } else {
                                            f5 = f + f3;
                                            i = 2;
                                        }
                                    } else {
                                        f5 = f;
                                        i = 0;
                                    }
                                    float f10 = 1.0f / c2102ll.l;
                                    strK4 = Sr0.k(xmlPullParser, "writingMode");
                                    if (strK4 != null) {
                                        strI = U9.I(strK4);
                                        strI.getClass();
                                        switch (strI) {
                                            case 3694:
                                                if (strI.equals("tb")) {
                                                }
                                                break;
                                            case 3553396:
                                                if (strI.equals("tblr")) {
                                                }
                                                break;
                                            case 3553576:
                                                if (strI.equals("tbrl")) {
                                                }
                                                break;
                                        }
                                        /*  JADX ERROR: Method code generation error
                                            java.lang.NullPointerException: Switch insn not found in header
                                            	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                                            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:216)
                                            	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                            	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                                            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                                            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                                            */
                                        /*
                                            Method dump skipped, instruction units count: 612
                                            To view this dump change 'Code comments level' option to 'DEBUG'
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: o.C1033an0.o(org.xmlpull.v1.XmlPullParser, java.util.HashMap, o.ll, o.rP, java.util.HashMap, java.util.HashMap):void");
                                    }

                                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                    /* JADX WARN: Code duplicated, block: B:6:0x0039  */
                                    /* JADX WARN: Code duplicated, block: B:70:0x00fa  */
                                    public static C1131bn0 p(XmlPullParser xmlPullParser, C1131bn0 c1131bn0, HashMap map, U90 u90) throws C3161wh0 {
                                        long j;
                                        long j2;
                                        String[] strArrSplit;
                                        int attributeCount = xmlPullParser.getAttributeCount();
                                        C1326dn0 c1326dn0Q = q(xmlPullParser, null);
                                        String strSubstring = null;
                                        String str = "";
                                        long jR = -9223372036854775807L;
                                        long jR2 = -9223372036854775807L;
                                        long jR3 = -9223372036854775807L;
                                        String[] strArr = null;
                                        for (int i = 0; i < attributeCount; i++) {
                                            String attributeName = xmlPullParser.getAttributeName(i);
                                            String attributeValue = xmlPullParser.getAttributeValue(i);
                                            attributeName.getClass();
                                            switch (attributeName) {
                                                case "region":
                                                    if (map.containsKey(attributeValue)) {
                                                        str = attributeValue;
                                                        continue;
                                                    }
                                                    break;
                                                case "dur":
                                                    jR3 = r(attributeValue, u90);
                                                    break;
                                                case "end":
                                                    jR2 = r(attributeValue, u90);
                                                    break;
                                                case "begin":
                                                    jR = r(attributeValue, u90);
                                                    break;
                                                case "style":
                                                    String strTrim = attributeValue.trim();
                                                    if (strTrim.isEmpty()) {
                                                        strArrSplit = new String[0];
                                                    } else {
                                                        int i2 = Lr0.a;
                                                        strArrSplit = strTrim.split("\\s+", -1);
                                                    }
                                                    if (strArrSplit.length > 0) {
                                                        strArr = strArrSplit;
                                                        break;
                                                    }
                                                    break;
                                                case "backgroundImage":
                                                    if (attributeValue.startsWith("#")) {
                                                        strSubstring = attributeValue.substring(1);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                        if (c1131bn0 != null) {
                                            long j3 = c1131bn0.d;
                                            j = -9223372036854775807L;
                                            if (j3 != -9223372036854775807L) {
                                                if (jR != -9223372036854775807L) {
                                                    jR += j3;
                                                }
                                                if (jR2 != -9223372036854775807L) {
                                                    jR2 += j3;
                                                }
                                            }
                                        } else {
                                            j = -9223372036854775807L;
                                        }
                                        if (jR2 != j) {
                                            j2 = jR2;
                                        } else if (jR3 != j) {
                                            j2 = jR + jR3;
                                        } else if (c1131bn0 != null) {
                                            long j4 = c1131bn0.e;
                                            if (j4 != j) {
                                                j2 = j4;
                                            } else {
                                                j2 = jR2;
                                            }
                                        } else {
                                            j2 = jR2;
                                        }
                                        return new C1131bn0(xmlPullParser.getName(), null, jR, j2, c1326dn0Q, strArr, str, strSubstring, c1131bn0);
                                    }

                                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                    /* JADX WARN: Code duplicated, block: B:110:0x01a4  */
                                    /* JADX WARN: Code duplicated, block: B:146:0x023f  */
                                    /* JADX WARN: Code duplicated, block: B:148:0x0244  */
                                    /* JADX WARN: Code duplicated, block: B:154:0x0254  */
                                    /* JADX WARN: Code duplicated, block: B:156:0x025c  */
                                    /* JADX WARN: Code duplicated, block: B:157:0x025e  */
                                    /* JADX WARN: Code duplicated, block: B:159:0x0264  */
                                    /* JADX WARN: Code duplicated, block: B:161:0x0267 A[DONT_INVERT] */
                                    /* JADX WARN: Code duplicated, block: B:162:0x0269  */
                                    /* JADX WARN: Code duplicated, block: B:163:0x026b  */
                                    /* JADX WARN: Code duplicated, block: B:164:0x026d  */
                                    /* JADX WARN: Code duplicated, block: B:191:0x0315  */
                                    /* JADX WARN: Code duplicated, block: B:227:0x03ad  */
                                    /* JADX WARN: Code duplicated, block: B:6:0x0024  */
                                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                                    public static C1326dn0 q(XmlPullParser xmlPullParser, C1326dn0 c1326dn0) {
                                        byte b;
                                        byte b2;
                                        String str;
                                        int iHashCode;
                                        int i;
                                        Ji0 ji0;
                                        int attributeCount = xmlPullParser.getAttributeCount();
                                        C1326dn0 c1326dn0I = c1326dn0;
                                        for (int i2 = 0; i2 < attributeCount; i2++) {
                                            String attributeValue = xmlPullParser.getAttributeValue(i2);
                                            String attributeName = xmlPullParser.getAttributeName(i2);
                                            attributeName.getClass();
                                            byte b3 = 5;
                                            int i3 = -1;
                                            switch (attributeName.hashCode()) {
                                                case -1550943582:
                                                    if (attributeName.equals("fontStyle")) {
                                                        b = 0;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case -1224696685:
                                                    if (attributeName.equals("fontFamily")) {
                                                        b = 1;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case -1065511464:
                                                    if (attributeName.equals("textAlign")) {
                                                        b = 2;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case -879295043:
                                                    if (attributeName.equals("textDecoration")) {
                                                        b = 3;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case -734428249:
                                                    if (attributeName.equals("fontWeight")) {
                                                        b = 4;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 3355:
                                                    if (attributeName.equals("id")) {
                                                        b = 5;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 3511770:
                                                    if (attributeName.equals("ruby")) {
                                                        b = 6;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 94842723:
                                                    if (attributeName.equals("color")) {
                                                        b = 7;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 109403361:
                                                    if (attributeName.equals("shear")) {
                                                        b = 8;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 110138194:
                                                    if (attributeName.equals("textCombine")) {
                                                        b = 9;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 365601008:
                                                    if (attributeName.equals("fontSize")) {
                                                        b = 10;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 921125321:
                                                    if (attributeName.equals("textEmphasis")) {
                                                        b = C3285xv.h;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 1115953443:
                                                    if (attributeName.equals("rubyPosition")) {
                                                        b = 12;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 1287124693:
                                                    if (attributeName.equals("backgroundColor")) {
                                                        b = 13;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 1754920356:
                                                    if (attributeName.equals("multiRowAlign")) {
                                                        b = 14;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                default:
                                                    b = -1;
                                                    break;
                                            }
                                            switch (b) {
                                                case 0:
                                                    c1326dn0I = i(c1326dn0I);
                                                    c1326dn0I.i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                    break;
                                                case 1:
                                                    c1326dn0I = i(c1326dn0I);
                                                    c1326dn0I.a = attributeValue;
                                                    break;
                                                case 2:
                                                    c1326dn0I = i(c1326dn0I);
                                                    c1326dn0I.f743o = k(attributeValue);
                                                    break;
                                                case 3:
                                                    String strI = U9.I(attributeValue);
                                                    strI.getClass();
                                                    switch (strI) {
                                                        case "nounderline":
                                                            c1326dn0I = i(c1326dn0I);
                                                            c1326dn0I.g = 0;
                                                            break;
                                                        case "underline":
                                                            c1326dn0I = i(c1326dn0I);
                                                            c1326dn0I.g = 1;
                                                            break;
                                                        case "nolinethrough":
                                                            c1326dn0I = i(c1326dn0I);
                                                            c1326dn0I.f = 0;
                                                            break;
                                                        case "linethrough":
                                                            c1326dn0I = i(c1326dn0I);
                                                            c1326dn0I.f = 1;
                                                            break;
                                                    }
                                                    break;
                                                case 4:
                                                    c1326dn0I = i(c1326dn0I);
                                                    c1326dn0I.h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                    break;
                                                case 5:
                                                    if ("style".equals(xmlPullParser.getName())) {
                                                        c1326dn0I = i(c1326dn0I);
                                                        c1326dn0I.l = attributeValue;
                                                    }
                                                    break;
                                                case 6:
                                                    String strI2 = U9.I(attributeValue);
                                                    strI2.getClass();
                                                    switch (strI2.hashCode()) {
                                                        case -618561360:
                                                            if (strI2.equals("baseContainer")) {
                                                                b3 = 0;
                                                            } else {
                                                                b3 = -1;
                                                            }
                                                            break;
                                                        case -410956671:
                                                            if (strI2.equals("container")) {
                                                                b3 = 1;
                                                            } else {
                                                                b3 = -1;
                                                            }
                                                            break;
                                                        case -250518009:
                                                            if (strI2.equals("delimiter")) {
                                                                b3 = 2;
                                                            } else {
                                                                b3 = -1;
                                                            }
                                                            break;
                                                        case -136074796:
                                                            if (strI2.equals("textContainer")) {
                                                                b3 = 3;
                                                            } else {
                                                                b3 = -1;
                                                            }
                                                            break;
                                                        case 3016401:
                                                            if (strI2.equals("base")) {
                                                                b3 = 4;
                                                            } else {
                                                                b3 = -1;
                                                            }
                                                            break;
                                                        case 3556653:
                                                            if (!strI2.equals("text")) {
                                                                b3 = -1;
                                                            }
                                                            break;
                                                        default:
                                                            b3 = -1;
                                                            break;
                                                    }
                                                    switch (b3) {
                                                        case 0:
                                                        case 4:
                                                            c1326dn0I = i(c1326dn0I);
                                                            c1326dn0I.m = 2;
                                                            break;
                                                        case 1:
                                                            c1326dn0I = i(c1326dn0I);
                                                            c1326dn0I.m = 1;
                                                            break;
                                                        case 2:
                                                            c1326dn0I = i(c1326dn0I);
                                                            c1326dn0I.m = 4;
                                                            break;
                                                        case 3:
                                                        case 5:
                                                            c1326dn0I = i(c1326dn0I);
                                                            c1326dn0I.m = 3;
                                                            break;
                                                    }
                                                    break;
                                                case 7:
                                                    c1326dn0I = i(c1326dn0I);
                                                    try {
                                                        c1326dn0I.b = AbstractC1700hf.a(attributeValue, false);
                                                        c1326dn0I.c = true;
                                                    } catch (IllegalArgumentException unused) {
                                                        AP.z();
                                                    }
                                                    break;
                                                case 8:
                                                    C1326dn0 c1326dn0I2 = i(c1326dn0I);
                                                    Matcher matcher = q.matcher(attributeValue);
                                                    float fMin = Float.MAX_VALUE;
                                                    if (matcher.matches()) {
                                                        try {
                                                            String strGroup = matcher.group(1);
                                                            strGroup.getClass();
                                                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                                                        } catch (NumberFormatException e) {
                                                            AP.A("Failed to parse shear: " + attributeValue, e);
                                                        }
                                                    } else {
                                                        AP.z();
                                                    }
                                                    c1326dn0I2.s = fMin;
                                                    c1326dn0I = c1326dn0I2;
                                                    break;
                                                case 9:
                                                    String strI3 = U9.I(attributeValue);
                                                    strI3.getClass();
                                                    if (strI3.equals("all")) {
                                                        c1326dn0I = i(c1326dn0I);
                                                        c1326dn0I.q = 1;
                                                    } else if (strI3.equals("none")) {
                                                        c1326dn0I = i(c1326dn0I);
                                                        c1326dn0I.q = 0;
                                                    }
                                                    break;
                                                case 10:
                                                    try {
                                                        c1326dn0I = i(c1326dn0I);
                                                        m(attributeValue, c1326dn0I);
                                                    } catch (C3161wh0 unused2) {
                                                        AP.z();
                                                    }
                                                    break;
                                                case 11:
                                                    c1326dn0I = i(c1326dn0I);
                                                    Pattern pattern = Ji0.d;
                                                    Ji0 ji1 = null;
                                                    if (attributeValue != null) {
                                                        String strI4 = U9.I(attributeValue.trim());
                                                        if (!strI4.isEmpty()) {
                                                            String[] strArrSplit = TextUtils.split(strI4, Ji0.d);
                                                            int length = strArrSplit.length;
                                                            AbstractC1571gF abstractC1571gFK = length != 0 ? length != 1 ? AbstractC1571gF.k(strArrSplit.length, (Object[]) strArrSplit.clone()) : new C1893je0(strArrSplit[0]) : S60.u;
                                                            String str2 = (String) UK.q("outside", AbstractC2506pt.x(Ji0.h, abstractC1571gFK));
                                                            int iHashCode2 = str2.hashCode();
                                                            if (iHashCode2 != -1392885889) {
                                                                if (iHashCode2 != -1106037339) {
                                                                    if (iHashCode2 == 92734940 && str2.equals("after")) {
                                                                        b2 = 0;
                                                                    } else {
                                                                        b2 = -1;
                                                                    }
                                                                } else if (str2.equals("outside")) {
                                                                    b2 = 1;
                                                                } else {
                                                                    b2 = -1;
                                                                }
                                                            } else if (str2.equals("before")) {
                                                                b2 = 2;
                                                            } else {
                                                                b2 = -1;
                                                            }
                                                            int i4 = b2 != 0 ? b2 != 1 ? 1 : -2 : 2;
                                                            Hc0 hc0X = AbstractC2506pt.x(Ji0.e, abstractC1571gFK);
                                                            if (hc0X.isEmpty()) {
                                                                Hc0 hc0X2 = AbstractC2506pt.x(Ji0.g, abstractC1571gFK);
                                                                Hc0 hc0X3 = AbstractC2506pt.x(Ji0.f, abstractC1571gFK);
                                                                if (hc0X2.isEmpty() && hc0X3.isEmpty()) {
                                                                    ji0 = new Ji0(-1, 0, i4);
                                                                } else {
                                                                    String str3 = (String) UK.q("filled", hc0X2);
                                                                    int iHashCode3 = str3.hashCode();
                                                                    if (iHashCode3 != -1274499742) {
                                                                        int i5 = (iHashCode3 == 3417674 && str3.equals("open")) ? 2 : 1;
                                                                        str = (String) UK.q("circle", hc0X3);
                                                                        iHashCode = str.hashCode();
                                                                        if (iHashCode != -1360216880) {
                                                                            if (iHashCode != -905816648) {
                                                                                if (iHashCode == 99657 && str.equals("dot")) {
                                                                                    i3 = 0;
                                                                                }
                                                                            } else if (str.equals("sesame")) {
                                                                                i3 = 1;
                                                                            }
                                                                        } else if (str.equals("circle")) {
                                                                            i3 = 2;
                                                                        }
                                                                        if (i3 != 0) {
                                                                            i = 2;
                                                                        } else if (i3 != 1) {
                                                                            i = 1;
                                                                        } else {
                                                                            i = 3;
                                                                        }
                                                                        ji0 = new Ji0(i, i5, i4);
                                                                    } else {
                                                                        str3.equals("filled");
                                                                    }
                                                                    str = (String) UK.q("circle", hc0X3);
                                                                    iHashCode = str.hashCode();
                                                                    if (iHashCode != -1360216880) {
                                                                        if (iHashCode != -905816648) {
                                                                            if (iHashCode == 99657) {
                                                                                i3 = 0;
                                                                            }
                                                                        } else if (str.equals("sesame")) {
                                                                            i3 = 1;
                                                                        }
                                                                    } else if (str.equals("circle")) {
                                                                        i3 = 2;
                                                                    }
                                                                    if (i3 != 0) {
                                                                        i = 2;
                                                                    } else if (i3 != 1) {
                                                                        i = 1;
                                                                    } else {
                                                                        i = 3;
                                                                    }
                                                                    ji0 = new Ji0(i, i5, i4);
                                                                }
                                                            } else {
                                                                String str4 = (String) new WG(hc0X).next();
                                                                int iHashCode4 = str4.hashCode();
                                                                if (iHashCode4 == 3005871) {
                                                                    str4.equals("auto");
                                                                } else if (iHashCode4 == 3387192 && str4.equals("none")) {
                                                                    i3 = 0;
                                                                }
                                                                ji0 = new Ji0(i3, 0, i4);
                                                            }
                                                            ji1 = ji0;
                                                        }
                                                    }
                                                    c1326dn0I.r = ji1;
                                                    break;
                                                case 12:
                                                    String strI5 = U9.I(attributeValue);
                                                    strI5.getClass();
                                                    if (strI5.equals("before")) {
                                                        c1326dn0I = i(c1326dn0I);
                                                        c1326dn0I.n = 1;
                                                    } else if (strI5.equals("after")) {
                                                        c1326dn0I = i(c1326dn0I);
                                                        c1326dn0I.n = 2;
                                                    }
                                                    break;
                                                case 13:
                                                    c1326dn0I = i(c1326dn0I);
                                                    try {
                                                        c1326dn0I.d = AbstractC1700hf.a(attributeValue, false);
                                                        c1326dn0I.e = true;
                                                    } catch (IllegalArgumentException unused3) {
                                                        AP.z();
                                                    }
                                                    break;
                                                case 14:
                                                    c1326dn0I = i(c1326dn0I);
                                                    c1326dn0I.p = k(attributeValue);
                                                    break;
                                            }
                                        }
                                        return c1326dn0I;
                                    }

                                    public static long r(String str, U90 u90) throws C3161wh0 {
                                        double d;
                                        double d2;
                                        Matcher matcher = n.matcher(str);
                                        if (matcher.matches()) {
                                            String strGroup = matcher.group(1);
                                            strGroup.getClass();
                                            double d3 = Long.parseLong(strGroup) * 3600;
                                            String strGroup2 = matcher.group(2);
                                            strGroup2.getClass();
                                            double d4 = d3 + (Long.parseLong(strGroup2) * 60);
                                            String strGroup3 = matcher.group(3);
                                            strGroup3.getClass();
                                            double d5 = d4 + Long.parseLong(strGroup3);
                                            String strGroup4 = matcher.group(4);
                                            double d6 = d5 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
                                            String strGroup5 = matcher.group(5);
                                            double d7 = d6 + (strGroup5 != null ? Long.parseLong(strGroup5) / u90.a : 0.0d);
                                            String strGroup6 = matcher.group(6);
                                            return (long) ((d7 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) u90.b)) / ((double) u90.a) : 0.0d)) * 1000000.0d);
                                        }
                                        Matcher matcher2 = f680o.matcher(str);
                                        if (!matcher2.matches()) {
                                            throw new C3161wh0(AbstractC1701hf0.t("Malformed time expression: ", str));
                                        }
                                        String strGroup7 = matcher2.group(1);
                                        strGroup7.getClass();
                                        double d8 = Double.parseDouble(strGroup7);
                                        String strGroup8 = matcher2.group(2);
                                        strGroup8.getClass();
                                        strGroup8.hashCode();
                                        switch (strGroup8) {
                                            case "f":
                                                d = u90.a;
                                                d8 /= d;
                                                return (long) (d8 * 1000000.0d);
                                            case "h":
                                                d2 = 3600.0d;
                                                break;
                                            case "m":
                                                d2 = 60.0d;
                                                break;
                                            case "t":
                                                d = u90.c;
                                                d8 /= d;
                                                return (long) (d8 * 1000000.0d);
                                            case "ms":
                                                d = 1000.0d;
                                                d8 /= d;
                                                return (long) (d8 * 1000000.0d);
                                            default:
                                                return (long) (d8 * 1000000.0d);
                                        }
                                        d8 *= d2;
                                        return (long) (d8 * 1000000.0d);
                                    }

                                    public static C2650rP s(XmlPullParser xmlPullParser) {
                                        String strK = Sr0.k(xmlPullParser, "extent");
                                        if (strK == null) {
                                            return null;
                                        }
                                        Matcher matcher = s.matcher(strK);
                                        if (!matcher.matches()) {
                                            "Ignoring non-pixel tts extent: ".concat(strK);
                                            AP.z();
                                            return null;
                                        }
                                        try {
                                            String strGroup = matcher.group(1);
                                            strGroup.getClass();
                                            int i = Integer.parseInt(strGroup);
                                            String strGroup2 = matcher.group(2);
                                            strGroup2.getClass();
                                            return new C2650rP(i, Integer.parseInt(strGroup2));
                                        } catch (NumberFormatException unused) {
                                            "Ignoring malformed tts extent: ".concat(strK);
                                            AP.z();
                                            return null;
                                        }
                                    }

                                    @Override // o.Rd0
                                    public final InterfaceC2967uh0 f(byte[] bArr, int i, boolean z) throws C3161wh0 {
                                        C2102ll c2102ll;
                                        U90 u90;
                                        try {
                                            XmlPullParser xmlPullParserNewPullParser = this.m.newPullParser();
                                            HashMap map = new HashMap();
                                            HashMap map2 = new HashMap();
                                            HashMap map3 = new HashMap();
                                            map2.put("", new C1228cn0("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
                                            C2650rP c2650rPS = null;
                                            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
                                            ArrayDeque arrayDeque = new ArrayDeque();
                                            U90 u90N = u;
                                            C2102ll c2102ll2 = v;
                                            C0560Kq c0560Kq = null;
                                            C2102ll c2102llL = c2102ll2;
                                            int i2 = 0;
                                            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                                                C1131bn0 c1131bn0 = (C1131bn0) arrayDeque.peek();
                                                if (i2 == 0) {
                                                    String name = xmlPullParserNewPullParser.getName();
                                                    if (eventType == 2) {
                                                        if ("tt".equals(name)) {
                                                            u90N = n(xmlPullParserNewPullParser);
                                                            c2102llL = l(xmlPullParserNewPullParser, c2102ll2);
                                                            c2650rPS = s(xmlPullParserNewPullParser);
                                                        }
                                                        C2102ll c2102ll3 = c2102llL;
                                                        C2650rP c2650rP = c2650rPS;
                                                        U90 u91 = u90N;
                                                        if (j(name)) {
                                                            if ("head".equals(name)) {
                                                                c2102ll = c2102ll3;
                                                                u90 = u91;
                                                                o(xmlPullParserNewPullParser, map, c2102ll3, c2650rP, map2, map3);
                                                            } else {
                                                                c2102ll = c2102ll3;
                                                                u90 = u91;
                                                                try {
                                                                    C1131bn0 c1131bn0P = p(xmlPullParserNewPullParser, c1131bn0, map2, u90);
                                                                    arrayDeque.push(c1131bn0P);
                                                                    if (c1131bn0 != null) {
                                                                        if (c1131bn0.m == null) {
                                                                            c1131bn0.m = new ArrayList();
                                                                        }
                                                                        c1131bn0.m.add(c1131bn0P);
                                                                    }
                                                                } catch (C3161wh0 e) {
                                                                    AP.A("Suppressing parser error", e);
                                                                    i2++;
                                                                }
                                                            }
                                                            c2102llL = c2102ll;
                                                            u90N = u90;
                                                        } else {
                                                            xmlPullParserNewPullParser.getName();
                                                            AP.j();
                                                            i2++;
                                                            c2102llL = c2102ll3;
                                                            u90N = u91;
                                                        }
                                                        c2650rPS = c2650rP;
                                                    } else if (eventType == 4) {
                                                        c1131bn0.getClass();
                                                        C1131bn0 c1131bn0A = C1131bn0.a(xmlPullParserNewPullParser.getText());
                                                        if (c1131bn0.m == null) {
                                                            c1131bn0.m = new ArrayList();
                                                        }
                                                        c1131bn0.m.add(c1131bn0A);
                                                    } else if (eventType == 3) {
                                                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                                            C1131bn0 c1131bn1 = (C1131bn0) arrayDeque.peek();
                                                            c1131bn1.getClass();
                                                            c0560Kq = new C0560Kq(c1131bn1, map, map2, map3);
                                                        }
                                                        arrayDeque.pop();
                                                    }
                                                } else if (eventType == 2) {
                                                    i2++;
                                                } else if (eventType == 3) {
                                                    i2--;
                                                }
                                                xmlPullParserNewPullParser.next();
                                            }
                                            if (c0560Kq != null) {
                                                return c0560Kq;
                                            }
                                            throw new C3161wh0("No TTML subtitles found");
                                        } catch (IOException e2) {
                                            throw new IllegalStateException("Unexpected error when reading input.", e2);
                                        } catch (XmlPullParserException e3) {
                                            throw new C3161wh0("Unable to decode source", e3);
                                        }
                                    }
                                }
