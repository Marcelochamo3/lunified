package o;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: renamed from: o.zA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3411zA extends AbstractC3177wp0 {
    public final /* synthetic */ int a;

    public /* synthetic */ C3411zA(int i) {
        this.a = i;
    }

    public static QH c(WH wh, int i) throws IOException {
        int iW = AbstractC1701hf0.w(i);
        if (iW == 5) {
            return new VH(wh.h0());
        }
        if (iW == 6) {
            return new VH(new BJ(wh.h0()));
        }
        if (iW == 7) {
            return new VH(Boolean.valueOf(wh.Z()));
        }
        if (iW != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(AbstractC1701hf0.E(i)));
        }
        wh.f0();
        return SH.l;
    }

    public static void d(C1183cI c1183cI, QH qh) throws IOException {
        if (qh == null || (qh instanceof SH)) {
            c1183cI.Q();
            return;
        }
        if (qh instanceof VH) {
            VH vhG = qh.g();
            Serializable serializable = vhG.l;
            if (serializable instanceof Number) {
                c1183cI.a0(vhG.i());
                return;
            } else if (serializable instanceof Boolean) {
                c1183cI.c0(vhG.a());
                return;
            } else {
                c1183cI.b0(vhG.h());
                return;
            }
        }
        if (qh instanceof OH) {
            c1183cI.f();
            Iterator it = qh.e().l.iterator();
            while (it.hasNext()) {
                d(c1183cI, (QH) it.next());
            }
            c1183cI.p();
            return;
        }
        if (!(qh instanceof TH)) {
            throw new IllegalArgumentException("Couldn't write " + qh.getClass());
        }
        c1183cI.i();
        Iterator it2 = ((C3033vK) qh.f().l.entrySet()).iterator();
        while (((C2936uK) it2).hasNext()) {
            C3130wK c3130wKB = ((C2936uK) it2).b();
            c1183cI.t((String) c3130wKB.getKey());
            d(c1183cI, (QH) c3130wKB.getValue());
        }
        c1183cI.q();
    }

    @Override // o.AbstractC3177wp0
    public final Object a(WH wh) throws IOException {
        QH oh;
        QH oh2;
        boolean Z;
        switch (this.a) {
            case 0:
                if (wh.j0() != 9) {
                    return Double.valueOf(wh.a0());
                }
                wh.f0();
                return null;
            case 1:
                if (wh.j0() != 9) {
                    return Float.valueOf((float) wh.a0());
                }
                wh.f0();
                return null;
            case 2:
                if (wh.j0() != 9) {
                    return Long.valueOf(wh.c0());
                }
                wh.f0();
                return null;
            case 3:
                ArrayList arrayList = new ArrayList();
                wh.a();
                while (wh.W()) {
                    try {
                        arrayList.add(Integer.valueOf(wh.b0()));
                    } catch (NumberFormatException e) {
                        throw new XH(e);
                    }
                }
                wh.p();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                }
                return atomicIntegerArray;
            case 4:
                if (wh.j0() == 9) {
                    wh.f0();
                    return null;
                }
                try {
                    return Long.valueOf(wh.c0());
                } catch (NumberFormatException e2) {
                    throw new XH(e2);
                }
            case 5:
                if (wh.j0() != 9) {
                    return Float.valueOf((float) wh.a0());
                }
                wh.f0();
                return null;
            case 6:
                if (wh.j0() != 9) {
                    return Double.valueOf(wh.a0());
                }
                wh.f0();
                return null;
            case 7:
                if (wh.j0() == 9) {
                    wh.f0();
                    return null;
                }
                String strH0 = wh.h0();
                if (strH0.length() == 1) {
                    return Character.valueOf(strH0.charAt(0));
                }
                StringBuilder sbL = AbstractC1701hf0.l("Expecting character, got: ", strH0, "; at ");
                sbL.append(wh.R());
                throw new XH(sbL.toString());
            case 8:
                int iJ0 = wh.j0();
                if (iJ0 != 9) {
                    return iJ0 == 8 ? Boolean.toString(wh.Z()) : wh.h0();
                }
                wh.f0();
                return null;
            case 9:
                if (wh.j0() == 9) {
                    wh.f0();
                    return null;
                }
                String strH1 = wh.h0();
                try {
                    return new BigDecimal(strH1);
                } catch (NumberFormatException e3) {
                    StringBuilder sbL2 = AbstractC1701hf0.l("Failed parsing '", strH1, "' as BigDecimal; at path ");
                    sbL2.append(wh.R());
                    throw new XH(sbL2.toString(), e3);
                }
            case 10:
                if (wh.j0() == 9) {
                    wh.f0();
                    return null;
                }
                String strH2 = wh.h0();
                try {
                    return new BigInteger(strH2);
                } catch (NumberFormatException e4) {
                    StringBuilder sbL3 = AbstractC1701hf0.l("Failed parsing '", strH2, "' as BigInteger; at path ");
                    sbL3.append(wh.R());
                    throw new XH(sbL3.toString(), e4);
                }
            case 11:
                if (wh.j0() != 9) {
                    return new BJ(wh.h0());
                }
                wh.f0();
                return null;
            case 12:
                if (wh.j0() != 9) {
                    return new StringBuilder(wh.h0());
                }
                wh.f0();
                return null;
            case 13:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            case 14:
                if (wh.j0() != 9) {
                    return new StringBuffer(wh.h0());
                }
                wh.f0();
                return null;
            case 15:
                if (wh.j0() == 9) {
                    wh.f0();
                    return null;
                }
                String strH3 = wh.h0();
                if ("null".equals(strH3)) {
                    return null;
                }
                return new URL(strH3);
            case 16:
                if (wh.j0() == 9) {
                    wh.f0();
                    return null;
                }
                try {
                    String strH4 = wh.h0();
                    if ("null".equals(strH4)) {
                        return null;
                    }
                    return new URI(strH4);
                } catch (URISyntaxException e5) {
                    throw new RH(e5);
                }
            case 17:
                if (wh.j0() != 9) {
                    return InetAddress.getByName(wh.h0());
                }
                wh.f0();
                return null;
            case 18:
                if (wh.j0() == 9) {
                    wh.f0();
                    return null;
                }
                String strH5 = wh.h0();
                try {
                    return UUID.fromString(strH5);
                } catch (IllegalArgumentException e6) {
                    StringBuilder sbL4 = AbstractC1701hf0.l("Failed parsing '", strH5, "' as UUID; at path ");
                    sbL4.append(wh.R());
                    throw new XH(sbL4.toString(), e6);
                }
            case 19:
                String strH6 = wh.h0();
                try {
                    return Currency.getInstance(strH6);
                } catch (IllegalArgumentException e7) {
                    StringBuilder sbL5 = AbstractC1701hf0.l("Failed parsing '", strH6, "' as Currency; at path ");
                    sbL5.append(wh.R());
                    throw new XH(sbL5.toString(), e7);
                }
            case 20:
                if (wh.j0() == 9) {
                    wh.f0();
                    return null;
                }
                wh.f();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (wh.j0() != 4) {
                    String strD0 = wh.d0();
                    int iB0 = wh.b0();
                    if ("year".equals(strD0)) {
                        i2 = iB0;
                    } else if ("month".equals(strD0)) {
                        i3 = iB0;
                    } else if ("dayOfMonth".equals(strD0)) {
                        i4 = iB0;
                    } else if ("hourOfDay".equals(strD0)) {
                        i5 = iB0;
                    } else if ("minute".equals(strD0)) {
                        i6 = iB0;
                    } else if ("second".equals(strD0)) {
                        i7 = iB0;
                    }
                }
                wh.q();
                return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
            case 21:
                if (wh.j0() == 9) {
                    wh.f0();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(wh.h0(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (strNextToken2 == null && strNextToken3 == null) {
                    return new Locale(strNextToken);
                }
                return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            case 22:
                if (wh instanceof ZH) {
                    ZH zh = (ZH) wh;
                    int iJ1 = zh.j0();
                    if (iJ1 != 5 && iJ1 != 2 && iJ1 != 4 && iJ1 != 10) {
                        QH qh = (QH) zh.v0();
                        zh.p0();
                        return qh;
                    }
                    throw new IllegalStateException("Unexpected " + AbstractC1701hf0.E(iJ1) + " when reading a JsonElement.");
                }
                int iJ2 = wh.j0();
                int iW = AbstractC1701hf0.w(iJ2);
                if (iW == 0) {
                    wh.a();
                    oh = new OH();
                } else if (iW != 2) {
                    oh = null;
                } else {
                    wh.f();
                    oh = new TH();
                }
                if (oh == null) {
                    return c(wh, iJ2);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (wh.W()) {
                        String strD1 = oh instanceof TH ? wh.d0() : null;
                        int iJ3 = wh.j0();
                        int iW2 = AbstractC1701hf0.w(iJ3);
                        if (iW2 == 0) {
                            wh.a();
                            oh2 = new OH();
                        } else if (iW2 != 2) {
                            oh2 = null;
                        } else {
                            wh.f();
                            oh2 = new TH();
                        }
                        boolean z = oh2 != null;
                        if (oh2 == null) {
                            oh2 = c(wh, iJ3);
                        }
                        if (oh instanceof OH) {
                            OH oh3 = (OH) oh;
                            oh3.getClass();
                            oh3.l.add(oh2);
                        } else {
                            ((TH) oh).l.put(strD1, oh2);
                        }
                        if (z) {
                            arrayDeque.addLast(oh);
                            oh = oh2;
                        }
                    } else {
                        if (oh instanceof OH) {
                            wh.p();
                        } else {
                            wh.q();
                        }
                        if (arrayDeque.isEmpty()) {
                            return oh;
                        }
                        oh = (QH) arrayDeque.removeLast();
                    }
                }
                break;
            case 23:
                BitSet bitSet = new BitSet();
                wh.a();
                int iJ4 = wh.j0();
                int i8 = 0;
                while (iJ4 != 2) {
                    int iW3 = AbstractC1701hf0.w(iJ4);
                    if (iW3 == 5 || iW3 == 6) {
                        int iB1 = wh.b0();
                        if (iB1 == 0) {
                            Z = false;
                        } else {
                            if (iB1 != 1) {
                                StringBuilder sbR = AbstractC1674hK.r("Invalid bitset value ", iB1, ", expected 0 or 1; at path ");
                                sbR.append(wh.R());
                                throw new XH(sbR.toString());
                            }
                            Z = true;
                        }
                    } else {
                        if (iW3 != 7) {
                            throw new XH("Invalid bitset value type: " + AbstractC1701hf0.E(iJ4) + "; at path " + wh.K());
                        }
                        Z = wh.Z();
                    }
                    if (Z) {
                        bitSet.set(i8);
                    }
                    i8++;
                    iJ4 = wh.j0();
                }
                wh.p();
                return bitSet;
            case 24:
                int iJ5 = wh.j0();
                if (iJ5 != 9) {
                    return iJ5 == 6 ? Boolean.valueOf(Boolean.parseBoolean(wh.h0())) : Boolean.valueOf(wh.Z());
                }
                wh.f0();
                return null;
            case 25:
                if (wh.j0() != 9) {
                    return Boolean.valueOf(wh.h0());
                }
                wh.f0();
                return null;
            case 26:
                if (wh.j0() == 9) {
                    wh.f0();
                    return null;
                }
                try {
                    int iB2 = wh.b0();
                    if (iB2 <= 255 && iB2 >= -128) {
                        return Byte.valueOf((byte) iB2);
                    }
                    StringBuilder sbR2 = AbstractC1674hK.r("Lossy conversion from ", iB2, " to byte; at path ");
                    sbR2.append(wh.R());
                    throw new XH(sbR2.toString());
                } catch (NumberFormatException e8) {
                    throw new XH(e8);
                }
            case 27:
                if (wh.j0() == 9) {
                    wh.f0();
                    return null;
                }
                try {
                    int iB3 = wh.b0();
                    if (iB3 <= 65535 && iB3 >= -32768) {
                        return Short.valueOf((short) iB3);
                    }
                    StringBuilder sbR3 = AbstractC1674hK.r("Lossy conversion from ", iB3, " to short; at path ");
                    sbR3.append(wh.R());
                    throw new XH(sbR3.toString());
                } catch (NumberFormatException e9) {
                    throw new XH(e9);
                }
            default:
                if (wh.j0() == 9) {
                    wh.f0();
                    return null;
                }
                try {
                    return Integer.valueOf(wh.b0());
                } catch (NumberFormatException e10) {
                    throw new XH(e10);
                }
        }
    }

    @Override // o.AbstractC3177wp0
    public final void b(C1183cI c1183cI, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                Number number = (Number) obj;
                if (number == null) {
                    c1183cI.Q();
                    return;
                }
                double dDoubleValue = number.doubleValue();
                BA.a(dDoubleValue);
                c1183cI.X(dDoubleValue);
                return;
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf == null) {
                    c1183cI.Q();
                    return;
                }
                float fFloatValue = numberValueOf.floatValue();
                BA.a(fFloatValue);
                if (!(numberValueOf instanceof Float)) {
                    numberValueOf = Float.valueOf(fFloatValue);
                }
                c1183cI.a0(numberValueOf);
                return;
            case 2:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    c1183cI.Q();
                    return;
                } else {
                    c1183cI.b0(number2.toString());
                    return;
                }
            case 3:
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                c1183cI.f();
                int length = atomicIntegerArray.length();
                for (int i = 0; i < length; i++) {
                    c1183cI.Y(atomicIntegerArray.get(i));
                }
                c1183cI.p();
                return;
            case 4:
                Number number3 = (Number) obj;
                if (number3 == null) {
                    c1183cI.Q();
                    return;
                } else {
                    c1183cI.Y(number3.longValue());
                    return;
                }
            case 5:
                Number numberValueOf2 = (Number) obj;
                if (numberValueOf2 == null) {
                    c1183cI.Q();
                    return;
                }
                if (!(numberValueOf2 instanceof Float)) {
                    numberValueOf2 = Float.valueOf(numberValueOf2.floatValue());
                }
                c1183cI.a0(numberValueOf2);
                return;
            case 6:
                Number number4 = (Number) obj;
                if (number4 == null) {
                    c1183cI.Q();
                    return;
                } else {
                    c1183cI.X(number4.doubleValue());
                    return;
                }
            case 7:
                Character ch = (Character) obj;
                c1183cI.b0(ch == null ? null : String.valueOf(ch));
                return;
            case 8:
                c1183cI.b0((String) obj);
                return;
            case 9:
                c1183cI.a0((BigDecimal) obj);
                return;
            case 10:
                c1183cI.a0((BigInteger) obj);
                return;
            case 11:
                c1183cI.a0((BJ) obj);
                return;
            case 12:
                StringBuilder sb = (StringBuilder) obj;
                c1183cI.b0(sb == null ? null : sb.toString());
                return;
            case 13:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 14:
                StringBuffer stringBuffer = (StringBuffer) obj;
                c1183cI.b0(stringBuffer == null ? null : stringBuffer.toString());
                return;
            case 15:
                URL url = (URL) obj;
                c1183cI.b0(url == null ? null : url.toExternalForm());
                return;
            case 16:
                URI uri = (URI) obj;
                c1183cI.b0(uri == null ? null : uri.toASCIIString());
                return;
            case 17:
                InetAddress inetAddress = (InetAddress) obj;
                c1183cI.b0(inetAddress == null ? null : inetAddress.getHostAddress());
                return;
            case 18:
                UUID uuid = (UUID) obj;
                c1183cI.b0(uuid == null ? null : uuid.toString());
                return;
            case 19:
                c1183cI.b0(((Currency) obj).getCurrencyCode());
                return;
            case 20:
                Calendar calendar = (Calendar) obj;
                if (calendar == null) {
                    c1183cI.Q();
                    return;
                }
                c1183cI.i();
                c1183cI.t("year");
                c1183cI.Y(calendar.get(1));
                c1183cI.t("month");
                c1183cI.Y(calendar.get(2));
                c1183cI.t("dayOfMonth");
                c1183cI.Y(calendar.get(5));
                c1183cI.t("hourOfDay");
                c1183cI.Y(calendar.get(11));
                c1183cI.t("minute");
                c1183cI.Y(calendar.get(12));
                c1183cI.t("second");
                c1183cI.Y(calendar.get(13));
                c1183cI.q();
                return;
            case 21:
                Locale locale = (Locale) obj;
                c1183cI.b0(locale == null ? null : locale.toString());
                return;
            case 22:
                d(c1183cI, (QH) obj);
                return;
            case 23:
                BitSet bitSet = (BitSet) obj;
                c1183cI.f();
                int length2 = bitSet.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    c1183cI.Y(bitSet.get(i2) ? 1L : 0L);
                }
                c1183cI.p();
                return;
            case 24:
                c1183cI.Z((Boolean) obj);
                return;
            case 25:
                Boolean bool = (Boolean) obj;
                c1183cI.b0(bool == null ? "null" : bool.toString());
                return;
            case 26:
                Number number5 = (Number) obj;
                if (number5 == null) {
                    c1183cI.Q();
                    return;
                } else {
                    c1183cI.Y(number5.byteValue());
                    return;
                }
            case 27:
                Number number6 = (Number) obj;
                if (number6 == null) {
                    c1183cI.Q();
                    return;
                } else {
                    c1183cI.Y(number6.shortValue());
                    return;
                }
            default:
                Number number7 = (Number) obj;
                if (number7 == null) {
                    c1183cI.Q();
                    return;
                } else {
                    c1183cI.Y(number7.intValue());
                    return;
                }
        }
    }
}
