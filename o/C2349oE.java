package o;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.oE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2349oE {
    public final /* synthetic */ int a;
    public int b;
    public final ArrayList c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public List i;

    public C2349oE(C1159c2 c1159c2, L80 l80, A50 a50, C2691rp c2691rp) {
        List listL;
        this.a = 1;
        AbstractC1474fG.j(c1159c2, "address");
        AbstractC1474fG.j(l80, "routeDatabase");
        AbstractC1474fG.j(a50, "call");
        AbstractC1474fG.j(c2691rp, "eventListener");
        this.d = c1159c2;
        this.e = l80;
        this.f = a50;
        this.g = c2691rp;
        C1233cq c1233cq = C1233cq.l;
        this.h = c1233cq;
        this.i = c1233cq;
        this.c = new ArrayList();
        C2446pE c2446pE = c1159c2.i;
        AbstractC1474fG.j(c2446pE, "url");
        Proxy proxy = c1159c2.g;
        if (proxy != null) {
            listL = AbstractC2506pt.A(proxy);
        } else {
            URI uriK = c2446pE.k();
            if (uriK.getHost() == null) {
                listL = Mr0.l(Proxy.NO_PROXY);
            } else {
                List<Proxy> listSelect = c1159c2.h.select(uriK);
                listL = (listSelect == null || listSelect.isEmpty()) ? Mr0.l(Proxy.NO_PROXY) : Mr0.x(listSelect);
            }
        }
        this.h = listL;
        this.b = 0;
    }

    public void a(String str, String str2) {
        AbstractC1474fG.j(str, "name");
        if (((ArrayList) this.i) == null) {
            this.i = new ArrayList();
        }
        ArrayList arrayList = (ArrayList) this.i;
        AbstractC1474fG.g(arrayList);
        arrayList.add(C0622Nb.l(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219));
        ArrayList arrayList2 = (ArrayList) this.i;
        AbstractC1474fG.g(arrayList2);
        arrayList2.add(str2 != null ? C0622Nb.l(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219) : null);
    }

    public C2446pE b() {
        ArrayList arrayList;
        String str = (String) this.d;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strA = C0622Nb.A((String) this.e, 0, 0, false, 7);
        String strA2 = C0622Nb.A((String) this.f, 0, 0, false, 7);
        String str2 = (String) this.g;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iC = c();
        ArrayList arrayList2 = this.c;
        ArrayList arrayList3 = new ArrayList(AbstractC1016af.O(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(C0622Nb.A((String) it.next(), 0, 0, false, 7));
        }
        ArrayList<String> arrayList4 = (ArrayList) this.i;
        if (arrayList4 != null) {
            arrayList = new ArrayList(AbstractC1016af.O(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? C0622Nb.A(str3, 0, 0, true, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = (String) this.h;
        return new C2446pE(str, strA, strA2, str2, iC, arrayList3, arrayList, str4 != null ? C0622Nb.A(str4, 0, 0, false, 7) : null, toString());
    }

    public int c() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        String str = (String) this.d;
        AbstractC1474fG.g(str);
        if (AbstractC1474fG.b(str, "http")) {
            return 80;
        }
        return AbstractC1474fG.b(str, "https") ? 443 : -1;
    }

    public void d(String str) {
        if (!AbstractC1899jh0.U(str, "/", false)) {
            throw new IllegalArgumentException("unexpected encodedPath: ".concat(str).toString());
        }
        i(0, str, str.length());
    }

    public boolean e() {
        return (this.b < ((List) this.h).size()) || (this.c.isEmpty() ^ true);
    }

    public C1225cm f() {
        String hostAddress;
        int port;
        List listA;
        boolean zContains;
        if (!e()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.b < ((List) this.h).size()) {
            boolean z = this.b < ((List) this.h).size();
            C1159c2 c1159c2 = (C1159c2) this.d;
            if (!z) {
                throw new SocketException("No route to " + c1159c2.i.d + "; exhausted proxy configurations: " + ((List) this.h));
            }
            List list = (List) this.h;
            int i = this.b;
            this.b = i + 1;
            Proxy proxy = (Proxy) list.get(i);
            ArrayList arrayList2 = new ArrayList();
            this.i = arrayList2;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                C2446pE c2446pE = c1159c2.i;
                hostAddress = c2446pE.d;
                port = c2446pE.e;
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                }
                AbstractC1474fG.i(socketAddressAddress, "proxyAddress");
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                AbstractC1474fG.j(inetSocketAddress, "<this>");
                InetAddress address = inetSocketAddress.getAddress();
                if (address == null) {
                    hostAddress = inetSocketAddress.getHostName();
                    AbstractC1474fG.i(hostAddress, "hostName");
                } else {
                    hostAddress = address.getHostAddress();
                    AbstractC1474fG.i(hostAddress, "address.hostAddress");
                }
                port = inetSocketAddress.getPort();
            }
            if (1 > port || port >= 65536) {
                throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList2.add(InetSocketAddress.createUnresolved(hostAddress, port));
            } else {
                byte[] bArr = Mr0.a;
                AbstractC1474fG.j(hostAddress, "<this>");
                if (Mr0.f.d(hostAddress)) {
                    listA = AbstractC2506pt.A(InetAddress.getByName(hostAddress));
                } else {
                    ((C2691rp) this.g).getClass();
                    AbstractC1474fG.j((A50) this.f, "call");
                    List listA2 = c1159c2.a.a(hostAddress);
                    if (listA2.isEmpty()) {
                        throw new UnknownHostException(c1159c2.a + " returned no addresses for " + hostAddress);
                    }
                    listA = listA2;
                }
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new InetSocketAddress((InetAddress) it.next(), port));
                }
            }
            Iterator it2 = this.i.iterator();
            while (it2.hasNext()) {
                K80 k80 = new K80((C1159c2) this.d, proxy, (InetSocketAddress) it2.next());
                L80 l80 = (L80) this.e;
                synchronized (l80) {
                    zContains = ((LinkedHashSet) l80.l).contains(k80);
                }
                if (zContains) {
                    this.c.add(k80);
                } else {
                    arrayList.add(k80);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            AbstractC1406ef.Q(arrayList, this.c);
            this.c.clear();
        }
        return new C1225cm(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x024f A[LOOP:3: B:101:0x024f->B:178:?, LOOP_START, PHI: r5
  0x024f: PHI (r5v10 int) = (r5v3 int), (r5v11 int) binds: [B:100:0x024d, B:178:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:103:0x0253  */
    /* JADX WARN: Code duplicated, block: B:106:0x025d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x026d  */
    /* JADX WARN: Code duplicated, block: B:123:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:129:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:131:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:132:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:134:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:139:0x0308  */
    /* JADX WARN: Code duplicated, block: B:150:0x035e  */
    /* JADX WARN: Code duplicated, block: B:174:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x025f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x025b A[EDGE_INSN: B:176:0x025b->B:105:0x025b BREAK  A[LOOP:3: B:101:0x024f->B:178:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:4:0x002a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0142  */
    /* JADX WARN: Code duplicated, block: B:76:0x0150  */
    /* JADX WARN: Code duplicated, block: B:77:0x0155  */
    /* JADX WARN: Code duplicated, block: B:99:0x0249  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    public void g(C2446pE c2446pE, String str) {
        int i;
        byte b;
        byte b2;
        int i2;
        int iF;
        byte bCharAt;
        String str2;
        String str3;
        String str4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        char c;
        String str5;
        int i8;
        int i9;
        int i10;
        char cCharAt;
        int i11;
        char cCharAt2;
        AbstractC1474fG.j(str, "input");
        byte[] bArr = Mr0.a;
        int iN = Mr0.n(0, str, str.length());
        int iO = Mr0.o(iN, str, str.length());
        byte b3 = -1;
        if (iO - iN >= 2) {
            char cCharAt3 = str.charAt(iN);
            char c2 = 'a';
            if ((AbstractC1474fG.k(cCharAt3, 97) >= 0 && AbstractC1474fG.k(cCharAt3, 122) <= 0) || (AbstractC1474fG.k(cCharAt3, 65) >= 0 && AbstractC1474fG.k(cCharAt3, 90) <= 0)) {
                i = iN + 1;
                while (true) {
                    if (i < iO) {
                        char cCharAt4 = str.charAt(i);
                        if ((c2 > cCharAt4 || cCharAt4 >= '{') && (('A' > cCharAt4 || cCharAt4 >= '[') && !(('0' <= cCharAt4 && cCharAt4 < ':') || cCharAt4 == '+' || cCharAt4 == '-' || cCharAt4 == '.'))) {
                            if (cCharAt4 == ':') {
                                break;
                            } else {
                                break;
                            }
                        } else {
                            i++;
                            c2 = 'a';
                        }
                    }
                    i = -1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
        } else {
            i = -1;
            break;
        }
        String str6 = "http";
        String str7 = "https";
        String str8 = "this as java.lang.String…ing(startIndex, endIndex)";
        if (i != -1) {
            if (AbstractC1899jh0.T(iN, str, "https:", true)) {
                this.d = "https";
                iN += 6;
            } else {
                if (!AbstractC1899jh0.T(iN, str, "http:", true)) {
                    StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                    String strSubstring = str.substring(0, i);
                    AbstractC1474fG.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb.append(strSubstring);
                    sb.append('\'');
                    throw new IllegalArgumentException(sb.toString());
                }
                this.d = "http";
                iN += 5;
            }
        } else {
            if (c2446pE == null) {
                throw new IllegalArgumentException(AbstractC1701hf0.t("Expected URL scheme 'http' or 'https' but no scheme was found for ", str.length() > 6 ? AbstractC1119bh0.D0(6, str).concat("...") : str));
            }
            this.d = c2446pE.a;
        }
        int i12 = iN;
        int i13 = 0;
        while (true) {
            b = 47;
            b2 = 92;
            if (i12 >= iO || !((cCharAt2 = str.charAt(i12)) == '\\' || cCharAt2 == '/')) {
                break;
            }
            i13++;
            i12++;
        }
        byte b4 = 63;
        byte b5 = 35;
        if (i13 >= 2 || c2446pE == null) {
            i2 = iN + i13;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                iF = Mr0.f(i2, iO, str, "@/\\?#");
                if (iF != iO) {
                    bCharAt = str.charAt(iF);
                } else {
                    bCharAt = -1;
                }
                if (bCharAt == b3 || bCharAt == b5 || bCharAt == b || bCharAt == b2 || bCharAt == b4) {
                    break;
                }
                if (bCharAt == 64) {
                    if (z) {
                        i11 = iF;
                        this.f = ((String) this.f) + "%40" + C0622Nb.l(str, i2, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240);
                    } else {
                        int iG = Mr0.g(str, ':', i2, iF);
                        i11 = iF;
                        String strL = C0622Nb.l(str, i2, iG, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240);
                        if (z2) {
                            strL = ((String) this.e) + "%40" + strL;
                        }
                        this.e = strL;
                        if (iG != i11) {
                            this.f = C0622Nb.l(str, iG + 1, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240);
                            z = true;
                        }
                        z2 = true;
                    }
                    i2 = i11 + 1;
                    iO = iO;
                    str8 = str8;
                    str7 = str7;
                    str6 = str6;
                    b5 = 35;
                    b4 = 63;
                    b = 47;
                    b2 = 92;
                    b3 = -1;
                }
            }
            str2 = str8;
            str3 = str7;
            str4 = str6;
            i3 = iO;
            i4 = i2;
            while (true) {
                if (i4 >= iF) {
                    i5 = iF;
                    break;
                }
                cCharAt = str.charAt(i4);
                if (cCharAt == '[') {
                    if (cCharAt == ':') {
                        i5 = i4;
                        break;
                    }
                } else {
                    do {
                        i4++;
                        if (i4 < iF) {
                            break;
                        }
                    } while (str.charAt(i4) != ']');
                }
                i4++;
            }
            i6 = i5 + 1;
            if (i6 < iF) {
                this.g = AbstractC1376eG.G(C0622Nb.A(str, i2, i5, false, 4));
                i9 = i2;
                c = '\"';
                try {
                    i10 = Integer.parseInt(C0622Nb.l(str, i6, iF, "", false, false, false, false, null, 248));
                    if (1 <= i10 || i10 >= 65536) {
                        i10 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.b = i10;
                if (i10 != -1) {
                    StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                    String strSubstring2 = str.substring(i6, iF);
                    AbstractC1474fG.i(strSubstring2, str2);
                    sb2.append(strSubstring2);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                i7 = i9;
            } else {
                i7 = i2;
                c = '\"';
                this.g = AbstractC1376eG.G(C0622Nb.A(str, i7, i5, false, 4));
                str5 = (String) this.d;
                AbstractC1474fG.g(str5);
                if (AbstractC1474fG.b(str5, str4)) {
                    i8 = 80;
                } else if (AbstractC1474fG.b(str5, str3)) {
                    i8 = 443;
                } else {
                    i8 = -1;
                }
                this.b = i8;
            }
            if (((String) this.g) != null) {
                StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
                String strSubstring3 = str.substring(i7, i5);
                AbstractC1474fG.i(strSubstring3, str2);
                sb3.append(strSubstring3);
                sb3.append(c);
                throw new IllegalArgumentException(sb3.toString().toString());
            }
            iN = iF;
        } else if (AbstractC1474fG.b(c2446pE.a, (String) this.d)) {
            this.e = c2446pE.e();
            this.f = c2446pE.a();
            this.g = c2446pE.d;
            this.b = c2446pE.e;
            ArrayList arrayList = this.c;
            arrayList.clear();
            arrayList.addAll(c2446pE.c());
            if (iN == iO || str.charAt(iN) == '#') {
                String strD = c2446pE.d();
                this.i = strD != null ? C0622Nb.I(C0622Nb.l(strD, 0, 0, " \"'<>#", true, false, true, false, null, 211)) : null;
            }
            i3 = iO;
        } else {
            i2 = iN + i13;
            boolean z3 = false;
            boolean z4 = false;
            while (true) {
                iF = Mr0.f(i2, iO, str, "@/\\?#");
                if (iF != iO) {
                    bCharAt = str.charAt(iF);
                } else {
                    bCharAt = -1;
                }
                if (bCharAt == b3) {
                    break;
                } else {
                    break;
                }
            }
            str2 = str8;
            str3 = str7;
            str4 = str6;
            i3 = iO;
            i4 = i2;
            while (true) {
                if (i4 >= iF) {
                    i5 = iF;
                    break;
                }
                cCharAt = str.charAt(i4);
                if (cCharAt == '[') {
                    if (cCharAt == ':') {
                        i5 = i4;
                        break;
                    }
                } else {
                    do {
                        i4++;
                        if (i4 < iF) {
                            break;
                            break;
                        }
                    } while (str.charAt(i4) != ']');
                }
                i4++;
            }
            i6 = i5 + 1;
            if (i6 < iF) {
                this.g = AbstractC1376eG.G(C0622Nb.A(str, i2, i5, false, 4));
                i9 = i2;
                c = '\"';
                i10 = Integer.parseInt(C0622Nb.l(str, i6, iF, "", false, false, false, false, null, 248));
                if (1 <= i10) {
                    i10 = -1;
                } else {
                    i10 = -1;
                }
                this.b = i10;
                if (i10 != -1) {
                    StringBuilder sb4 = new StringBuilder("Invalid URL port: \"");
                    String strSubstring4 = str.substring(i6, iF);
                    AbstractC1474fG.i(strSubstring4, str2);
                    sb4.append(strSubstring4);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                i7 = i9;
            } else {
                i7 = i2;
                c = '\"';
                this.g = AbstractC1376eG.G(C0622Nb.A(str, i7, i5, false, 4));
                str5 = (String) this.d;
                AbstractC1474fG.g(str5);
                if (AbstractC1474fG.b(str5, str4)) {
                    i8 = 80;
                } else if (AbstractC1474fG.b(str5, str3)) {
                    i8 = 443;
                } else {
                    i8 = -1;
                }
                this.b = i8;
            }
            if (((String) this.g) != null) {
                StringBuilder sb5 = new StringBuilder("Invalid URL host: \"");
                String strSubstring5 = str.substring(i7, i5);
                AbstractC1474fG.i(strSubstring5, str2);
                sb5.append(strSubstring5);
                sb5.append(c);
                throw new IllegalArgumentException(sb5.toString().toString());
            }
            iN = iF;
        }
        int i14 = i3;
        int iF2 = Mr0.f(iN, i14, str, "?#");
        i(iN, str, iF2);
        if (iF2 < i14 && str.charAt(iF2) == '?') {
            int iG2 = Mr0.g(str, '#', iF2, i14);
            this.i = C0622Nb.I(C0622Nb.l(str, iF2 + 1, iG2, " \"'<>#", true, false, true, false, null, 208));
            iF2 = iG2;
        }
        if (iF2 >= i14 || str.charAt(iF2) != '#') {
            return;
        }
        this.h = C0622Nb.l(str, 1 + iF2, i14, "", true, false, false, true, null, 176);
    }

    public void h(int i) {
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i, "unexpected port: ").toString());
        }
        this.b = i;
    }

    public void i(int i, String str, int i2) {
        int i3 = i;
        if (i3 == i2) {
            return;
        }
        char cCharAt = str.charAt(i3);
        ArrayList arrayList = this.c;
        if (cCharAt == '/' || cCharAt == '\\') {
            arrayList.clear();
            arrayList.add("");
            i3++;
        } else {
            arrayList.set(arrayList.size() - 1, "");
        }
        int i4 = i3;
        while (i4 < i2) {
            int iF = Mr0.f(i4, i2, str, "/\\");
            boolean z = iF < i2;
            String strL = C0622Nb.l(str, i4, iF, " \"<>^`{}|/\\?#", true, false, false, false, null, 240);
            if (!AbstractC1474fG.b(strL, ".") && !AbstractC1899jh0.N(strL, "%2e", true)) {
                if (!AbstractC1474fG.b(strL, "..") && !AbstractC1899jh0.N(strL, "%2e.", true) && !AbstractC1899jh0.N(strL, ".%2e", true) && !AbstractC1899jh0.N(strL, "%2e%2e", true)) {
                    if (((CharSequence) AbstractC1701hf0.c(1, arrayList)).length() == 0) {
                        arrayList.set(arrayList.size() - 1, strL);
                    } else {
                        arrayList.add(strL);
                    }
                    if (z) {
                        arrayList.add("");
                    }
                } else if (((String) arrayList.remove(arrayList.size() - 1)).length() == 0 && (!arrayList.isEmpty())) {
                    arrayList.set(arrayList.size() - 1, "");
                } else {
                    arrayList.add("");
                }
            }
            i4 = z ? iF + 1 : iF;
        }
    }

    public void j(String str) {
        if (AbstractC1899jh0.N(str, "http", true)) {
            this.d = "http";
        } else {
            if (!AbstractC1899jh0.N(str, "https", true)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            this.d = "https";
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                String str = (String) this.d;
                if (str != null) {
                    sb.append(str);
                    sb.append("://");
                } else {
                    sb.append("//");
                }
                if (((String) this.e).length() > 0 || ((String) this.f).length() > 0) {
                    sb.append((String) this.e);
                    if (((String) this.f).length() > 0) {
                        sb.append(':');
                        sb.append((String) this.f);
                    }
                    sb.append('@');
                }
                String str2 = (String) this.g;
                if (str2 != null) {
                    if (AbstractC1119bh0.X(str2, ':')) {
                        sb.append('[');
                        sb.append((String) this.g);
                        sb.append(']');
                    } else {
                        sb.append((String) this.g);
                    }
                }
                int i = -1;
                if (this.b != -1 || ((String) this.d) != null) {
                    int iC = c();
                    String str3 = (String) this.d;
                    if (str3 == null) {
                        sb.append(':');
                        sb.append(iC);
                    } else {
                        if (AbstractC1474fG.b(str3, "http")) {
                            i = 80;
                        } else if (AbstractC1474fG.b(str3, "https")) {
                            i = 443;
                        }
                        if (iC != i) {
                            sb.append(':');
                            sb.append(iC);
                        }
                    }
                }
                ArrayList arrayList = this.c;
                AbstractC1474fG.j(arrayList, "<this>");
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append('/');
                    sb.append((String) arrayList.get(i2));
                }
                if (((ArrayList) this.i) != null) {
                    sb.append('?');
                    ArrayList arrayList2 = (ArrayList) this.i;
                    AbstractC1474fG.g(arrayList2);
                    C0622Nb.J(arrayList2, sb);
                }
                if (((String) this.h) != null) {
                    sb.append('#');
                    sb.append((String) this.h);
                }
                String string = sb.toString();
                AbstractC1474fG.i(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            default:
                return super.toString();
        }
    }

    public C2349oE() {
        this.a = 0;
        this.e = "";
        this.f = "";
        this.b = -1;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.add("");
    }
}
