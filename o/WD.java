package o;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class WD implements Closeable {
    public static final Logger p;
    public final N9 l;
    public final boolean m;
    public final VD n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final YC f590o;

    static {
        Logger logger = Logger.getLogger(ID.class.getName());
        AbstractC1474fG.i(logger, "getLogger(Http2::class.java.name)");
        p = logger;
    }

    public WD(N9 n9, boolean z) {
        this.l = n9;
        this.m = z;
        VD vd = new VD(n9);
        this.n = vd;
        this.f590o = new YC(vd);
    }

    public final void K(OD od, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i2 & 8) != 0) {
            byte b = this.l.readByte();
            byte[] bArr = Mr0.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int i5 = this.l.readInt() & Integer.MAX_VALUE;
        List listP = p(AP.n(i - 4, i2, i4), i4, i2, i3);
        od.getClass();
        TD td = od.m;
        td.getClass();
        synchronized (td) {
            if (td.L.contains(Integer.valueOf(i5))) {
                td.Q(i5, 2);
                return;
            }
            td.L.add(Integer.valueOf(i5));
            td.u.c(new QD(td.f530o + '[' + i5 + "] onRequest", td, i5, listP), 0L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:114:0x01fd  */
    public final boolean a(boolean z, OD od) throws IOException {
        TD td;
        C0984aE c0984aEP;
        int i;
        int i2 = 0;
        AbstractC1474fG.j(od, "handler");
        try {
            this.l.M(9L);
            int iT = Mr0.t(this.l);
            if (iT > 16384) {
                throw new IOException(AbstractC1674hK.n(iT, "FRAME_SIZE_ERROR: "));
            }
            int i3 = this.l.readByte() & 255;
            byte b = this.l.readByte();
            int i4 = b & 255;
            int i5 = this.l.readInt();
            int i6 = i5 & Integer.MAX_VALUE;
            Logger logger = p;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(ID.a(true, i6, iT, i3, i4));
            }
            if (z && i3 != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = ID.b;
                sb.append(i3 < strArr.length ? strArr[i3] : Mr0.i("0x%02x", Integer.valueOf(i3)));
                throw new IOException(sb.toString());
            }
            switch (i3) {
                case 0:
                    i(od, iT, i4, i6);
                    return true;
                case 1:
                    q(od, iT, i4, i6);
                    return true;
                case 2:
                    if (iT != 5) {
                        throw new IOException(AbstractC1674hK.p("TYPE_PRIORITY length: ", iT, " != 5"));
                    }
                    if (i6 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    N9 n9 = this.l;
                    n9.readInt();
                    n9.readByte();
                    return true;
                case 3:
                    if (iT != 4) {
                        throw new IOException(AbstractC1674hK.p("TYPE_RST_STREAM length: ", iT, " != 4"));
                    }
                    if (i6 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int i7 = this.l.readInt();
                    for (int i8 : AbstractC1701hf0.F(14)) {
                        if (AbstractC1701hf0.w(i8) == i7) {
                            i2 = i8;
                            if (i2 != 0) {
                                throw new IOException(AbstractC1674hK.n(i7, "TYPE_RST_STREAM unexpected error code: "));
                            }
                            td = od.m;
                            td.getClass();
                            if (i6 == 0 && (i5 & 1) == 0) {
                                td.u.c(new MD(td.f530o + '[' + i6 + "] onReset", td, i6, i2, 1), 0L);
                            } else {
                                c0984aEP = td.p(i6);
                                if (c0984aEP != null) {
                                    c0984aEP.k(i2);
                                }
                            }
                            return true;
                        }
                    }
                    if (i2 != 0) {
                        throw new IOException(AbstractC1674hK.n(i7, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    td = od.m;
                    td.getClass();
                    if (i6 == 0) {
                        c0984aEP = td.p(i6);
                        if (c0984aEP != null) {
                            c0984aEP.k(i2);
                        }
                    } else {
                        c0984aEP = td.p(i6);
                        if (c0984aEP != null) {
                            c0984aEP.k(i2);
                        }
                    }
                    return true;
                case 4:
                    if (i6 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((b & 1) == 0) {
                        if (iT % 6 != 0) {
                            throw new IOException(AbstractC1674hK.n(iT, "TYPE_SETTINGS length % 6 != 0: "));
                        }
                        Nc0 nc0 = new Nc0();
                        XF xfH = U9.H(U9.L(0, iT), 6);
                        int i9 = xfH.l;
                        int i10 = xfH.m;
                        int i11 = xfH.n;
                        if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                            while (true) {
                                N9 n10 = this.l;
                                short s = n10.readShort();
                                byte[] bArr = Mr0.a;
                                int i12 = s & 65535;
                                i = n10.readInt();
                                if (i12 != 2) {
                                    if (i12 == 3) {
                                        i12 = 4;
                                    } else if (i12 == 4) {
                                        if (i < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i12 = 7;
                                    } else if (i12 == 5 && (i < 16384 || i > 16777215)) {
                                    }
                                } else if (i != 0 && i != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                nc0.c(i12, i);
                                if (i9 != i10) {
                                    i9 += i11;
                                }
                            }
                            throw new IOException(AbstractC1674hK.n(i, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                        }
                        TD td2 = od.m;
                        td2.t.c(new ND(AbstractC1701hf0.h(new StringBuilder(), td2.f530o, " applyAndAckSettings"), od, nc0), 0L);
                    } else if (iT != 0) {
                        throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                    }
                    return true;
                case 5:
                    K(od, iT, i4, i6);
                    return true;
                case 6:
                    t(od, iT, i4, i6);
                    return true;
                case 7:
                    l(od, iT, i6);
                    return true;
                case 8:
                    if (iT != 4) {
                        throw new IOException(AbstractC1674hK.n(iT, "TYPE_WINDOW_UPDATE length !=4: "));
                    }
                    long j = ((long) this.l.readInt()) & C1707hi0.a;
                    if (j == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i6 != 0) {
                        C0984aE c0984aEI = od.m.i(i6);
                        if (c0984aEI != null) {
                            synchronized (c0984aEI) {
                                c0984aEI.f += j;
                                if (j > 0) {
                                    c0984aEI.notifyAll();
                                }
                            }
                        }
                        break;
                    } else {
                        TD td3 = od.m;
                        synchronized (td3) {
                            td3.H += j;
                            td3.notifyAll();
                        }
                    }
                    return true;
                default:
                    this.l.skip(iT);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.l.close();
    }

    public final void f(OD od) throws IOException {
        AbstractC1474fG.j(od, "handler");
        if (this.m) {
            if (!a(true, od)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        C2468pa c2468pa = ID.a;
        C2468pa c2468paN = this.l.n(c2468pa.l.length);
        Level level = Level.FINE;
        Logger logger = p;
        if (logger.isLoggable(level)) {
            logger.fine(Mr0.i("<< CONNECTION " + c2468paN.e(), new Object[0]));
        }
        if (!AbstractC1474fG.b(c2468pa, c2468paN)) {
            throw new IOException("Expected a connection header but was ".concat(c2468paN.k()));
        }
    }

    public final void i(OD od, int i, int i2, int i3) throws IOException {
        int i4;
        C0984aE c0984aE;
        boolean z;
        boolean z2;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z3 = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i2 & 8) != 0) {
            byte b = this.l.readByte();
            byte[] bArr = Mr0.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int iN = AP.n(i, i2, i4);
        N9 n9 = this.l;
        od.getClass();
        AbstractC1474fG.j(n9, "source");
        od.m.getClass();
        long j = 0;
        if (i3 != 0 && (i3 & 1) == 0) {
            TD td = od.m;
            td.getClass();
            E9 e9 = new E9();
            long j2 = iN;
            n9.M(j2);
            n9.y(e9, j2);
            td.u.c(new PD(td.f530o + '[' + i3 + "] onData", td, i3, e9, iN, z3), 0L);
        } else {
            C0984aE c0984aEI = od.m.i(i3);
            if (c0984aEI == null) {
                od.m.Q(i3, 2);
                long j3 = iN;
                od.m.t(j3);
                n9.skip(j3);
            } else {
                byte[] bArr2 = Mr0.a;
                YD yd = c0984aEI.i;
                long j4 = iN;
                yd.getClass();
                long j5 = j4;
                while (true) {
                    if (j5 <= j) {
                        c0984aE = c0984aEI;
                        byte[] bArr3 = Mr0.a;
                        yd.q.b.t(j4);
                        break;
                    }
                    synchronized (yd.q) {
                        z = yd.m;
                        c0984aE = c0984aEI;
                        z2 = yd.f633o.m + j5 > yd.l;
                    }
                    if (z2) {
                        n9.skip(j5);
                        yd.q.e(4);
                        break;
                    }
                    if (z) {
                        n9.skip(j5);
                        break;
                    }
                    long jY = n9.y(yd.n, j5);
                    if (jY == -1) {
                        throw new EOFException();
                    }
                    j5 -= jY;
                    C0984aE c0984aE2 = yd.q;
                    synchronized (c0984aE2) {
                        try {
                            if (yd.p) {
                                yd.n.p();
                                j = 0;
                            } else {
                                E9 e10 = yd.f633o;
                                j = 0;
                                boolean z4 = e10.m == 0;
                                e10.e0(yd.n);
                                if (z4) {
                                    c0984aE2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c0984aEI = c0984aE;
                }
                if (z3) {
                    c0984aE.j(Mr0.b, true);
                }
            }
        }
        this.l.skip(i4);
    }

    public final void l(OD od, int i, int i2) throws IOException {
        int i3;
        Object[] array;
        if (i < 8) {
            throw new IOException(AbstractC1674hK.n(i, "TYPE_GOAWAY length < 8: "));
        }
        if (i2 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i4 = this.l.readInt();
        int i5 = this.l.readInt();
        int i6 = i - 8;
        int[] iArrF = AbstractC1701hf0.F(14);
        int length = iArrF.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i3 = 0;
                break;
            }
            i3 = iArrF[i7];
            if (AbstractC1701hf0.w(i3) == i5) {
                break;
            } else {
                i7++;
            }
        }
        if (i3 == 0) {
            throw new IOException(AbstractC1674hK.n(i5, "TYPE_GOAWAY unexpected error code: "));
        }
        C2468pa c2468paN = C2468pa.f972o;
        if (i6 > 0) {
            c2468paN = this.l.n(i6);
        }
        od.getClass();
        AbstractC1474fG.j(c2468paN, "debugData");
        c2468paN.d();
        TD td = od.m;
        synchronized (td) {
            array = td.n.values().toArray(new C0984aE[0]);
            td.r = true;
        }
        for (C0984aE c0984aE : (C0984aE[]) array) {
            if (c0984aE.a > i4 && c0984aE.h()) {
                c0984aE.k(8);
                od.m.p(c0984aE.a);
            }
        }
    }

    public final List p(int i, int i2, int i3, int i4) throws IOException {
        VD vd = this.n;
        vd.p = i;
        vd.m = i;
        vd.q = i2;
        vd.n = i3;
        vd.f568o = i4;
        while (true) {
            YC yc = this.f590o;
            C3111w50 c3111w50 = yc.c;
            boolean zD = c3111w50.D();
            ArrayList arrayList = yc.b;
            if (zD) {
                List listX0 = AbstractC0911Ye.x0(arrayList);
                arrayList.clear();
                return listX0;
            }
            byte b = c3111w50.readByte();
            byte[] bArr = Mr0.a;
            int i5 = b & 255;
            if (i5 == 128) {
                throw new IOException("index == 0");
            }
            if ((b & 128) == 128) {
                int iE = yc.e(i5, Yu0.b.k0);
                int i6 = iE - 1;
                if (i6 >= 0) {
                    C1957kB[] c1957kBArr = AbstractC0983aD.a;
                    if (i6 <= c1957kBArr.length - 1) {
                        arrayList.add(c1957kBArr[i6]);
                    }
                }
                int length = yc.e + 1 + (i6 - AbstractC0983aD.a.length);
                if (length >= 0) {
                    C1957kB[] c1957kBArr2 = yc.d;
                    if (length < c1957kBArr2.length) {
                        C1957kB c1957kB = c1957kBArr2[length];
                        AbstractC1474fG.g(c1957kB);
                        arrayList.add(c1957kB);
                    }
                }
                throw new IOException(AbstractC1674hK.n(iE, "Header index too large "));
            }
            if (i5 == 64) {
                C1957kB[] c1957kBArr3 = AbstractC0983aD.a;
                C2468pa c2468paD = yc.d();
                AbstractC0983aD.a(c2468paD);
                yc.c(new C1957kB(c2468paD, yc.d()));
            } else if ((b & 64) == 64) {
                yc.c(new C1957kB(yc.b(yc.e(i5, 63) - 1), yc.d()));
            } else if ((b & 32) == 32) {
                int iE2 = yc.e(i5, 31);
                yc.a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + yc.a);
                }
                int i7 = yc.g;
                if (iE2 < i7) {
                    if (iE2 == 0) {
                        C1957kB[] c1957kBArr4 = yc.d;
                        X5.N(c1957kBArr4, null, 0, c1957kBArr4.length);
                        yc.e = yc.d.length - 1;
                        yc.f = 0;
                        yc.g = 0;
                    } else {
                        yc.a(i7 - iE2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                C1957kB[] c1957kBArr5 = AbstractC0983aD.a;
                C2468pa c2468paD2 = yc.d();
                AbstractC0983aD.a(c2468paD2);
                arrayList.add(new C1957kB(c2468paD2, yc.d()));
            } else {
                arrayList.add(new C1957kB(yc.b(yc.e(i5, 15) - 1), yc.d()));
            }
        }
    }

    public final void q(OD od, int i, int i2, int i3) throws IOException {
        int i4;
        int i5 = 1;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z = false;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte b = this.l.readByte();
            byte[] bArr = Mr0.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            N9 n9 = this.l;
            n9.readInt();
            n9.readByte();
            byte[] bArr2 = Mr0.a;
            od.getClass();
            i -= 5;
        }
        List listP = p(AP.n(i, i2, i4), i4, i2, i3);
        od.getClass();
        od.m.getClass();
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            TD td = od.m;
            td.getClass();
            td.u.c(new QD(td.f530o + '[' + i3 + "] onHeaders", td, i3, listP, z2), 0L);
            return;
        }
        TD td2 = od.m;
        synchronized (td2) {
            C0984aE c0984aEI = td2.i(i3);
            if (c0984aEI != null) {
                c0984aEI.j(Mr0.v(listP), z2);
                return;
            }
            if (td2.r) {
                return;
            }
            if (i3 <= td2.p) {
                return;
            }
            if (i3 % 2 == td2.q % 2) {
                return;
            }
            C0984aE c0984aE = new C0984aE(i3, td2, false, z2, Mr0.v(listP));
            td2.p = i3;
            td2.n.put(Integer.valueOf(i3), c0984aE);
            td2.s.f().c(new LD(td2.f530o + '[' + i3 + "] onStream", td2, c0984aE, i5), 0L);
        }
    }

    public final void t(OD od, int i, int i2, int i3) throws IOException {
        if (i != 8) {
            throw new IOException(AbstractC1674hK.n(i, "TYPE_PING length != 8: "));
        }
        if (i3 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        int i4 = this.l.readInt();
        int i5 = this.l.readInt();
        if ((i2 & 1) == 0) {
            od.m.t.c(new MD(AbstractC1701hf0.h(new StringBuilder(), od.m.f530o, " ping"), od.m, i4, i5, 0), 0L);
            return;
        }
        TD td = od.m;
        synchronized (td) {
            try {
                if (i4 == 1) {
                    td.y++;
                } else if (i4 == 2) {
                    td.A++;
                } else if (i4 == 3) {
                    td.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
