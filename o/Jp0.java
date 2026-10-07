package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.skidush.clonex.MyApplication;
import java.io.IOException;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class Jp0 {
    public static final J2 a = new J2(10, "CLOSED", false);
    public static final String[] b = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final Object c = new Object();
    public static final Object d = new Object();
    public static boolean e;
    public static long f;

    public static C3009v3 A(C2562qX c2562qX) {
        String str;
        int iG = c2562qX.g();
        if (c2562qX.g() != 1684108385) {
            AP.z();
            return null;
        }
        int iG2 = c2562qX.g() & 16777215;
        if (iG2 == 13) {
            str = "image/jpeg";
        } else {
            str = iG2 == 14 ? "image/png" : null;
        }
        if (str == null) {
            AP.z();
            return null;
        }
        c2562qX.G(4);
        int i = iG - 16;
        byte[] bArr = new byte[i];
        c2562qX.e(bArr, 0, i);
        return new C3009v3(str, null, 3, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a0  */
    public static long B(int i, String str) {
        int iM = m(str, 0, i, false);
        Matcher matcher = C0628Nh.m.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int iE0 = -1;
        int i5 = -1;
        int i6 = -1;
        while (iM < i) {
            int iM2 = m(str, iM + 1, i, true);
            matcher.region(iM, iM2);
            if (i3 == -1 && matcher.usePattern(C0628Nh.m).matches()) {
                String strGroup = matcher.group(1);
                AbstractC1474fG.i(strGroup, "matcher.group(1)");
                i3 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                AbstractC1474fG.i(strGroup2, "matcher.group(2)");
                i5 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                AbstractC1474fG.i(strGroup3, "matcher.group(3)");
                i6 = Integer.parseInt(strGroup3);
            } else if (i4 == -1 && matcher.usePattern(C0628Nh.l).matches()) {
                String strGroup4 = matcher.group(1);
                AbstractC1474fG.i(strGroup4, "matcher.group(1)");
                i4 = Integer.parseInt(strGroup4);
            } else if (iE0 == -1) {
                Pattern pattern = C0628Nh.k;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    AbstractC1474fG.i(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    String strI = AbstractC1701hf0.i(locale, "US", strGroup5, locale, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = pattern.pattern();
                    AbstractC1474fG.i(strPattern, "MONTH_PATTERN.pattern()");
                    iE0 = AbstractC1119bh0.e0(strPattern, strI, 0, false, 6) / 4;
                } else if (i2 != -1 && matcher.usePattern(C0628Nh.j).matches()) {
                    String strGroup6 = matcher.group(1);
                    AbstractC1474fG.i(strGroup6, "matcher.group(1)");
                    i2 = Integer.parseInt(strGroup6);
                }
            } else if (i2 != -1) {
            }
            iM = m(str, iM2 + 1, i, false);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (iE0 == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (1 > i4 || i4 >= 32) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i3 < 0 || i3 >= 24) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i5 < 0 || i5 >= 60) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i6 < 0 || i6 >= 60) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(Mr0.e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, iE0 - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i5);
        gregorianCalendar.set(13, i6);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static Li0 C(int i, String str, C2562qX c2562qX) {
        int iG = c2562qX.g();
        if (c2562qX.g() == 1684108385 && iG >= 22) {
            c2562qX.G(10);
            int iZ = c2562qX.z();
            if (iZ > 0) {
                String strN = AbstractC1674hK.n(iZ, "");
                int iZ2 = c2562qX.z();
                if (iZ2 > 0) {
                    strN = strN + "/" + iZ2;
                }
                return new Li0(str, null, AbstractC0985aF.q(strN));
            }
        }
        AbstractC3015v6.g(i);
        AP.z();
        return null;
    }

    public static Li0 D(int i, String str, C2562qX c2562qX) {
        int iG = c2562qX.g();
        if (c2562qX.g() == 1684108385) {
            c2562qX.G(8);
            return new Li0(str, null, AbstractC0985aF.q(c2562qX.q(iG - 16)));
        }
        AbstractC3015v6.g(i);
        AP.z();
        return null;
    }

    public static NE E(int i, String str, C2562qX c2562qX, boolean z, boolean z2) {
        int iF = F(c2562qX);
        if (z2) {
            iF = Math.min(1, iF);
        }
        if (iF >= 0) {
            return z ? new Li0(str, null, AbstractC0985aF.q(Integer.toString(iF))) : new C3156wf("und", str, Integer.toString(iF));
        }
        AbstractC3015v6.g(i);
        AP.z();
        return null;
    }

    public static int F(C2562qX c2562qX) {
        c2562qX.G(4);
        if (c2562qX.g() == 1684108385) {
            c2562qX.G(8);
            return c2562qX.u();
        }
        AP.z();
        return -1;
    }

    public static long G(int i, byte[] bArr) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & Yu0.b.k0) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & Yu0.b.k0) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & Yu0.b.k0) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & Yu0.b.k0) + 128;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    public static long H(int i, byte[] bArr) {
        long jG = G(i, bArr);
        long jG2 = G(i + 4, bArr);
        if (jG == 0 && jG2 == 0) {
            return 0L;
        }
        return ((jG2 * 1000) / 4294967296L) + ((jG - 2208988800L) * 1000);
    }

    public static final void I(Object[] objArr, int i, int i2) {
        AbstractC1474fG.j(objArr, "<this>");
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static long K(String str) {
        int i;
        int length = str.length();
        AbstractC1474fG.j(str, "<this>");
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC1674hK.m(length, 0, "endIndex < beginIndex: ", " < ").toString());
        }
        if (length > str.length()) {
            StringBuilder sbR = AbstractC1674hK.r("endIndex > string.length: ", length, " > ");
            sbR.append(str.length());
            throw new IllegalArgumentException(sbR.toString().toString());
        }
        long j = 0;
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                j++;
            } else {
                if (cCharAt < 2048) {
                    i = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i = 3;
                } else {
                    int i3 = i2 + 1;
                    char cCharAt2 = i3 < length ? str.charAt(i3) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j++;
                        i2 = i3;
                    } else {
                        j += (long) 4;
                        i2 += 2;
                    }
                }
                j += (long) i;
            }
            i2++;
        }
        return j;
    }

    public static void N(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(AbstractC1701hf0.e(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        AbstractC1474fG.P(classCastException, Jp0.class.getName());
        throw classCastException;
    }

    public static final void O(Object obj) {
        if (obj instanceof C2439p80) {
            throw ((C2439p80) obj).l;
        }
    }

    public static long a() throws Throwable {
        DatagramSocket datagramSocket;
        synchronized (d) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, Yu0.b.i0);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                datagramSocket = datagramSocket2;
            } else {
                long j = jCurrentTimeMillis / 1000;
                Long.signum(j);
                long j2 = jCurrentTimeMillis - (j * 1000);
                long j3 = j + 2208988800L;
                bArr[40] = (byte) (j3 >> 24);
                bArr[41] = (byte) (j3 >> 16);
                datagramSocket = datagramSocket2;
                try {
                    bArr[42] = (byte) (j3 >> 8);
                    bArr[43] = (byte) j3;
                    long j4 = (j2 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j4 >> 24);
                    bArr[45] = (byte) (j4 >> 16);
                    bArr[46] = (byte) (j4 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        datagramSocket.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j5 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
            byte b2 = bArr[0];
            int i = bArr[1] & 255;
            long jH = H(24, bArr);
            long jH2 = H(32, bArr);
            long jH3 = H(40, bArr);
            i((byte) ((b2 >> 6) & 3), (byte) (b2 & 7), i, jH3);
            long j6 = (j5 + (((jH3 - j5) + (jH2 - jH)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j6;
        } catch (Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
        }
    }

    public static Map b(LinkedHashMap linkedHashMap) {
        if (!(linkedHashMap instanceof InterfaceC1770iI) || (linkedHashMap instanceof InterfaceC2062lI)) {
            return linkedHashMap;
        }
        N(linkedHashMap, "kotlin.collections.MutableMap");
        throw null;
    }

    public static final Object c(A50 a50, long j, InterfaceC0473Hh interfaceC0473Hh) {
        C1692hb c1692hb = new C1692hb(1, Ou0.p(interfaceC0473Hh));
        c1692hb.y();
        c1692hb.A(new io.sentry.android.replay.v(12, a50));
        a50.e(new C3306y6(c1692hb, j, 7));
        return c1692hb.x();
    }

    public static void d(int i, Object obj) {
        if (obj == null || y(i, obj)) {
            return;
        }
        N(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static void f(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void g(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void i(byte b2, byte b3, int i, long j) throws IOException {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b3 != 4 && b3 != 5) {
            throw new IOException(AbstractC1674hK.n(b3, "SNTP: Untrusted mode: "));
        }
        if (i == 0 || i > 15) {
            throw new IOException(AbstractC1674hK.n(i, "SNTP: Untrusted stratum: "));
        }
        if (j == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static final void j(int i, int i2) {
        String strP;
        if (i <= 0 || i2 <= 0) {
            if (i != i2) {
                strP = "Both size " + i + " and step " + i2 + " must be greater than zero.";
            } else {
                strP = AbstractC1674hK.p("size ", i, " must be greater than zero.");
            }
            throw new IllegalArgumentException(strP.toString());
        }
    }

    public static final C2439p80 k(Throwable th) {
        AbstractC1474fG.j(th, "exception");
        return new C2439p80(th);
    }

    public static Drawable l(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        boolean z = Build.VERSION.SDK_INT < 23;
        if (drawable == null) {
            return null;
        }
        if (colorStateList == null) {
            if (!z) {
                return drawable;
            }
            drawable.mutate();
            return drawable;
        }
        Drawable drawableMutate = AbstractC3045vW.R(drawable).mutate();
        if (mode == null) {
            return drawableMutate;
        }
        AbstractC2205mo.i(drawableMutate, mode);
        return drawableMutate;
    }

    public static int m(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static boolean n(String str, String str2) {
        if (AbstractC1474fG.b(str, str2)) {
            return true;
        }
        if (AbstractC1899jh0.L(str, str2, false) && str.charAt((str.length() - str2.length()) - 1) == '.') {
            byte[] bArr = Mr0.a;
            if (!Mr0.f.d(str)) {
                return true;
            }
        }
        return false;
    }

    public static final Object o(AbstractC3440zb0 abstractC3440zb0, long j, InterfaceC0775Sy interfaceC0775Sy) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (abstractC3440zb0.n >= j && !abstractC3440zb0.c()) {
                return abstractC3440zb0;
            }
            Object obj = AbstractC2189mg.l.get(abstractC3440zb0);
            J2 j2 = a;
            if (obj == j2) {
                return j2;
            }
            AbstractC3440zb0 abstractC3440zb1 = (AbstractC3440zb0) ((AbstractC2189mg) obj);
            if (abstractC3440zb1 == null) {
                abstractC3440zb1 = (AbstractC3440zb0) interfaceC0775Sy.i(Long.valueOf(abstractC3440zb0.n + 1), abstractC3440zb0);
                do {
                    atomicReferenceFieldUpdater = AbstractC2189mg.l;
                    if (atomicReferenceFieldUpdater.compareAndSet(abstractC3440zb0, null, abstractC3440zb1)) {
                        if (abstractC3440zb0.c()) {
                            abstractC3440zb0.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(abstractC3440zb0) == null);
            }
            abstractC3440zb0 = abstractC3440zb1;
        }
    }

    public static final String p(JSONObject jSONObject, List list) {
        Object objB;
        AbstractC1474fG.j(jSONObject, "<this>");
        AbstractC1474fG.j(list, "paths");
        C3074vm0 c3074vm0M = Vb0.M(AbstractC0911Ye.U(list), new C3219xC(2, jSONObject));
        Iterator it = c3074vm0M.a.iterator();
        do {
            if (!it.hasNext()) {
                objB = null;
                break;
            }
            objB = c3074vm0M.b.b(it.next());
        } while (((String) objB).length() <= 0);
        String str = (String) objB;
        return str == null ? "" : str;
    }

    public static final C0881Xa q(InterfaceC1538fw interfaceC1538fw, C1478fK c1478fK, TJ tj) {
        AbstractC1474fG.j(interfaceC1538fw, "<this>");
        AbstractC1474fG.j(c1478fK, "lifecycle");
        return new C0881Xa(new C2026kw(c1478fK, tj, interfaceC1538fw, null));
    }

    public static ColorStateList r(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !D0.v(drawable)) {
            return null;
        }
        return D0.c(drawable).getColorStateList();
    }

    public static MyApplication s() {
        MyApplication myApplication = MyApplication.l;
        if (myApplication != null) {
            return myApplication;
        }
        AbstractC1474fG.U("instance");
        throw null;
    }

    public static final C1692hb t(InterfaceC0473Hh interfaceC0473Hh) {
        C1692hb c1692hb;
        C1692hb c1692hb2;
        if (!(interfaceC0473Hh instanceof C1520fn)) {
            return new C1692hb(1, interfaceC0473Hh);
        }
        C1520fn c1520fn = (C1520fn) interfaceC0473Hh;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1520fn.s;
            Object obj = atomicReferenceFieldUpdater.get(c1520fn);
            J2 j2 = Pu0.b;
            c1692hb = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(c1520fn, j2);
                c1692hb2 = null;
                break;
            }
            if (obj instanceof C1692hb) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(c1520fn, obj, j2)) {
                        c1692hb2 = (C1692hb) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(c1520fn) == obj);
            } else if (obj != j2 && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c1692hb2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C1692hb.r;
            Object obj2 = atomicReferenceFieldUpdater2.get(c1692hb2);
            if (!(obj2 instanceof C0626Nf) || ((C0626Nf) obj2).d == null) {
                C1692hb.q.set(c1692hb2, 536870911);
                atomicReferenceFieldUpdater2.set(c1692hb2, C3005v1.l);
                c1692hb = c1692hb2;
            } else {
                c1692hb2.t();
            }
            if (c1692hb != null) {
                return c1692hb;
            }
        }
        return new C1692hb(2, interfaceC0473Hh);
    }

    public static int u(List list, InputStream inputStream, C1813in c1813in) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new K50(inputStream, c1813in);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int iC = ((PE) list.get(i)).c(inputStream, c1813in);
                inputStream.reset();
                if (iC != -1) {
                    return iC;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType v(List list, InputStream inputStream, C1813in c1813in) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new K50(inputStream, c1813in);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeD = ((PE) list.get(i)).d(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeD != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeD;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType w(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = ((PE) list.get(i)).a(byteBuffer);
                AbstractC2274na.c(byteBuffer);
                if (imageHeaderParser$ImageTypeA != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeA;
                }
            } catch (Throwable th) {
                AbstractC2274na.c(byteBuffer);
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static int x(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        throw new IllegalArgumentException(AbstractC1674hK.n(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static boolean y(int i, Object obj) {
        int iE;
        if (!(obj instanceof InterfaceC0801Ty)) {
            return false;
        }
        if (obj instanceof InterfaceC1056az) {
            iE = ((InterfaceC1056az) obj).e();
        } else if (obj instanceof InterfaceC0360Cy) {
            iE = 0;
        } else if (obj instanceof InterfaceC0412Ey) {
            iE = 1;
        } else if (obj instanceof InterfaceC0775Sy) {
            iE = 2;
        } else if (obj instanceof InterfaceC0827Uy) {
            iE = 3;
        } else if (obj instanceof InterfaceC0853Vy) {
            iE = 4;
        } else if (obj instanceof KR) {
            iE = 5;
        } else {
            iE = obj instanceof Vo0 ? 6 : -1;
        }
        return iE == i;
    }

    public static C3156wf z(int i, C2562qX c2562qX) {
        int iG = c2562qX.g();
        if (c2562qX.g() == 1684108385) {
            c2562qX.G(8);
            String strQ = c2562qX.q(iG - 16);
            return new C3156wf("und", strQ, strQ);
        }
        AbstractC3015v6.g(i);
        AP.z();
        return null;
    }

    public abstract void L();

    public abstract void M();

    public boolean e() {
        return false;
    }

    public void J() {
    }
}
