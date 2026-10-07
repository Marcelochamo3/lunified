package o;

import j$.time.Instant;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.PrintStream;
import java.net.SocketException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Jy0 {
    AQ a;
    AQ b;
    H70 c;
    String d;
    C2848tT e;
    long f;
    int g;
    PrintStream h = null;

    /* JADX WARN: Code duplicated, block: B:120:0x01e5  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public Jy0(InputStream inputStream) {
        byte b;
        this.d = null;
        this.e = C2848tT.v;
        this.g = 1;
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        this.a = l();
        linkedList.add(new BufferedReader(new InputStreamReader(inputStream)));
        linkedList2.add(inputStream);
        while (true) {
            try {
                InputStream inputStream2 = (InputStream) linkedList2.get(0);
                BufferedReader bufferedReader = (BufferedReader) linkedList.get(0);
                if (inputStream2 == System.in) {
                    System.out.getClass();
                }
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    linkedList.remove(0);
                    linkedList2.remove(0);
                    if (linkedList.isEmpty()) {
                        return;
                    }
                }
                if (line == null) {
                    continue;
                } else {
                    PrintStream printStream = this.h;
                    if (printStream != null) {
                        printStream.getClass();
                    }
                    if (line.length() != 0 && line.charAt(0) != '#') {
                        line = line.charAt(0) == '>' ? line.substring(1) : line;
                        Fl0 fl0 = new Fl0(line);
                        try {
                            Fl0.b bVarI = fl0.i();
                            if (!bVarI.a()) {
                                String strD = bVarI.d();
                                switch (strD.hashCode()) {
                                    case -1408208058:
                                        if (!strD.equals("assert")) {
                                            b = -1;
                                        } else {
                                            b = 25;
                                        }
                                        break;
                                    case -1335458389:
                                        if (!strD.equals("delete")) {
                                            b = -1;
                                        } else {
                                            b = 12;
                                        }
                                        break;
                                    case -1008619738:
                                        if (!strD.equals("origin")) {
                                            b = -1;
                                        } else {
                                            b = 7;
                                        }
                                        break;
                                    case -1000426017:
                                        if (!strD.equals("prohibit")) {
                                            b = -1;
                                        } else {
                                            b = 10;
                                        }
                                        break;
                                    case -905826493:
                                        if (!strD.equals("server")) {
                                            b = -1;
                                        } else {
                                            b = 0;
                                        }
                                        break;
                                    case 63:
                                        if (!strD.equals("?")) {
                                            b = -1;
                                        } else {
                                            b = 15;
                                        }
                                        break;
                                    case Yu0.b.d0 /* 113 */:
                                        if (!strD.equals("q")) {
                                            b = -1;
                                        } else {
                                            b = 22;
                                        }
                                        break;
                                    case 96417:
                                        if (!strD.equals("add")) {
                                            b = -1;
                                        } else {
                                            b = C3285xv.h;
                                        }
                                        break;
                                    case 106079:
                                        if (!strD.equals("key")) {
                                            b = -1;
                                        } else {
                                            b = 1;
                                        }
                                        break;
                                    case 107332:
                                        if (!strD.equals("log")) {
                                            b = -1;
                                        } else {
                                            b = 24;
                                        }
                                        break;
                                    case 114657:
                                        if (!strD.equals("tcp")) {
                                            b = -1;
                                        } else {
                                            b = 4;
                                        }
                                        break;
                                    case 115180:
                                        if (!strD.equals("ttl")) {
                                            b = -1;
                                        } else {
                                            b = 6;
                                        }
                                        break;
                                    case 3076014:
                                        if (!strD.equals("date")) {
                                            b = -1;
                                        } else {
                                            b = 27;
                                        }
                                        break;
                                    case 3107365:
                                        if (!strD.equals("echo")) {
                                            b = -1;
                                        } else {
                                            b = 16;
                                        }
                                        break;
                                    case 3108516:
                                        if (!strD.equals("edns")) {
                                            b = -1;
                                        } else {
                                            b = 2;
                                        }
                                        break;
                                    case 3143036:
                                        if (!strD.equals("file")) {
                                            b = -1;
                                        } else {
                                            b = 23;
                                        }
                                        break;
                                    case 3175989:
                                        if (!strD.equals("glue")) {
                                            b = -1;
                                        } else {
                                            b = 13;
                                        }
                                        break;
                                    case 3198785:
                                        if (!strD.equals("help")) {
                                            b = -1;
                                        } else {
                                            b = 14;
                                        }
                                        break;
                                    case 3446913:
                                        if (!strD.equals("port")) {
                                            b = -1;
                                        } else {
                                            b = 3;
                                        }
                                        break;
                                    case 3482191:
                                        if (!strD.equals("quit")) {
                                            b = -1;
                                        } else {
                                            b = 21;
                                        }
                                        break;
                                    case 3526536:
                                        if (!strD.equals("send")) {
                                            b = -1;
                                        } else {
                                            b = 17;
                                        }
                                        break;
                                    case 3529469:
                                        if (!strD.equals("show")) {
                                            b = -1;
                                        } else {
                                            b = 18;
                                        }
                                        break;
                                    case 3744684:
                                        if (!strD.equals("zone")) {
                                            b = -1;
                                        } else {
                                            b = 8;
                                        }
                                        break;
                                    case 94742904:
                                        if (!strD.equals("class")) {
                                            b = -1;
                                        } else {
                                            b = 5;
                                        }
                                        break;
                                    case 94746189:
                                        if (!strD.equals("clear")) {
                                            b = -1;
                                        } else {
                                            b = 19;
                                        }
                                        break;
                                    case 107944136:
                                        if (!strD.equals("query")) {
                                            b = -1;
                                        } else {
                                            b = 20;
                                        }
                                        break;
                                    case 109522647:
                                        if (!strD.equals("sleep")) {
                                            b = -1;
                                        } else {
                                            b = 26;
                                        }
                                        break;
                                    case 1095696741:
                                        if (!strD.equals("require")) {
                                            b = -1;
                                        } else {
                                            b = 9;
                                        }
                                        break;
                                    default:
                                        b = -1;
                                        break;
                                }
                                switch (b) {
                                    case 0:
                                        this.d = fl0.e0();
                                        this.c = new Qd0(this.d);
                                        Fl0.b bVarI2 = fl0.i();
                                        if (bVarI2.b()) {
                                            this.c.g(Short.parseShort(bVarI2.d()));
                                        }
                                        break;
                                    case 1:
                                        String strE0 = fl0.e0();
                                        String strE1 = fl0.e0();
                                        if (this.c == null) {
                                            this.c = new Qd0(this.d);
                                        }
                                        this.c.c(new C1511fi0(C1511fi0.i, strE0, strE1));
                                        break;
                                    case 2:
                                        if (this.c == null) {
                                            this.c = new Qd0(this.d);
                                        }
                                        this.c.a(fl0.h0());
                                        break;
                                    case 3:
                                        if (this.c == null) {
                                            this.c = new Qd0(this.d);
                                        }
                                        this.c.g(fl0.h0());
                                        break;
                                    case 4:
                                        if (this.c == null) {
                                            this.c = new Qd0(this.d);
                                        }
                                        this.c.o(true);
                                        break;
                                    case 5:
                                        String strE2 = fl0.e0();
                                        int iC = C0344Ci.c(strE2);
                                        if (iC <= 0) {
                                            n("Invalid class " + strE2);
                                        } else {
                                            this.g = iC;
                                        }
                                        break;
                                    case 6:
                                        this.f = fl0.f0();
                                        break;
                                    case 7:
                                    case 8:
                                        this.e = fl0.d0(C2848tT.v);
                                        break;
                                    case 9:
                                        i(fl0);
                                        break;
                                    case 10:
                                        g(fl0);
                                        break;
                                    case 11:
                                        a(fl0);
                                        break;
                                    case 12:
                                        c(fl0);
                                        break;
                                    case 13:
                                        e(fl0);
                                        break;
                                    case 14:
                                    case 15:
                                        Fl0.b bVarI3 = fl0.i();
                                        if (!bVarI3.b()) {
                                            j(null);
                                        } else {
                                            j(bVarI3.d());
                                        }
                                        break;
                                    case 16:
                                        n(line.substring(4).trim());
                                        break;
                                    case 17:
                                        o();
                                        this.a = l();
                                        break;
                                    case 18:
                                        n(this.a);
                                        break;
                                    case 19:
                                        this.a = l();
                                        break;
                                    case 20:
                                        h(fl0);
                                        break;
                                    case 21:
                                    case 22:
                                        PrintStream printStream2 = this.h;
                                        if (printStream2 != null) {
                                            printStream2.close();
                                        }
                                        Iterator it = linkedList.iterator();
                                        while (it.hasNext()) {
                                            ((BufferedReader) it.next()).close();
                                        }
                                        System.exit(0);
                                        break;
                                    case 23:
                                        d(fl0, linkedList, linkedList2);
                                        break;
                                    case 24:
                                        f(fl0);
                                        break;
                                    case 25:
                                        if (!b(fl0)) {
                                            fl0.close();
                                            return;
                                        }
                                        break;
                                    case 26:
                                        try {
                                            Thread.sleep(fl0.i0());
                                        } catch (InterruptedException e) {
                                            Thread.currentThread().interrupt();
                                            throw new IOException(e);
                                        }
                                        break;
                                    case 27:
                                        Instant instantNow = Instant.now();
                                        Fl0.b bVarI4 = fl0.i();
                                        if (bVarI4.b() && bVarI4.d().equals("-ms")) {
                                            n(Long.toString(instantNow.toEpochMilli()));
                                        } else {
                                            n(instantNow);
                                        }
                                        break;
                                    default:
                                        n("invalid keyword: " + strD);
                                        break;
                                }
                            }
                            fl0.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                try {
                                    fl0.close();
                                } catch (Throwable th3) {
                                    th.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        }
                    }
                }
            } catch (InterruptedIOException unused) {
                System.out.getClass();
            } catch (SocketException unused2) {
                System.out.getClass();
            } catch (Ri0 e2) {
                PrintStream printStream3 = System.out;
                e2.getMessage();
                printStream3.getClass();
            } catch (IOException unused3) {
                System.out.getClass();
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void j(String str) {
        PrintStream printStream = System.out;
        printStream.getClass();
        if (str == null) {
            printStream.getClass();
        }
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        byte b = -1;
        switch (lowerCase.hashCode()) {
            case -1408208058:
                if (lowerCase.equals("assert")) {
                    b = 0;
                }
                break;
            case -1335458389:
                if (lowerCase.equals("delete")) {
                    b = 1;
                }
                break;
            case -1008619738:
                if (lowerCase.equals("origin")) {
                    b = 2;
                }
                break;
            case -1000426017:
                if (lowerCase.equals("prohibit")) {
                    b = 3;
                }
                break;
            case -905826493:
                if (lowerCase.equals("server")) {
                    b = 4;
                }
                break;
            case C3080vp0.I /* 35 */:
                if (lowerCase.equals("#")) {
                    b = 5;
                }
                break;
            case Yu0.b.d0 /* 113 */:
                if (lowerCase.equals("q")) {
                    b = 6;
                }
                break;
            case 96417:
                if (lowerCase.equals("add")) {
                    b = 7;
                }
                break;
            case 106079:
                if (lowerCase.equals("key")) {
                    b = 8;
                }
                break;
            case 107332:
                if (lowerCase.equals("log")) {
                    b = 9;
                }
                break;
            case 114657:
                if (lowerCase.equals("tcp")) {
                    b = 10;
                }
                break;
            case 115180:
                if (lowerCase.equals("ttl")) {
                    b = C3285xv.h;
                }
                break;
            case 3076014:
                if (lowerCase.equals("date")) {
                    b = 12;
                }
                break;
            case 3107365:
                if (lowerCase.equals("echo")) {
                    b = 13;
                }
                break;
            case 3108516:
                if (lowerCase.equals("edns")) {
                    b = 14;
                }
                break;
            case 3143036:
                if (lowerCase.equals("file")) {
                    b = 15;
                }
                break;
            case 3175989:
                if (lowerCase.equals("glue")) {
                    b = 16;
                }
                break;
            case 3198785:
                if (lowerCase.equals("help")) {
                    b = 17;
                }
                break;
            case 3446913:
                if (lowerCase.equals("port")) {
                    b = 18;
                }
                break;
            case 3482191:
                if (lowerCase.equals("quit")) {
                    b = 19;
                }
                break;
            case 3526536:
                if (lowerCase.equals("send")) {
                    b = 20;
                }
                break;
            case 3529469:
                if (lowerCase.equals("show")) {
                    b = 21;
                }
                break;
            case 3744684:
                if (lowerCase.equals("zone")) {
                    b = 22;
                }
                break;
            case 94742904:
                if (lowerCase.equals("class")) {
                    b = 23;
                }
                break;
            case 94746189:
                if (lowerCase.equals("clear")) {
                    b = 24;
                }
                break;
            case 107944136:
                if (lowerCase.equals("query")) {
                    b = 25;
                }
                break;
            case 109522647:
                if (lowerCase.equals("sleep")) {
                    b = 26;
                }
                break;
            case 1095696741:
                if (lowerCase.equals("require")) {
                    b = 27;
                }
                break;
        }
        switch (b) {
            case 0:
                printStream.getClass();
                break;
            case 1:
                printStream.getClass();
                break;
            case 2:
            case 22:
                printStream.getClass();
                break;
            case 3:
                printStream.getClass();
                break;
            case 4:
                printStream.getClass();
                break;
            case 5:
                printStream.getClass();
                break;
            case 6:
            case 19:
                printStream.getClass();
                break;
            case 7:
                printStream.getClass();
                break;
            case 8:
                printStream.getClass();
                break;
            case 9:
                printStream.getClass();
                break;
            case 10:
                printStream.getClass();
                break;
            case 11:
                printStream.getClass();
                break;
            case 12:
                printStream.getClass();
                break;
            case 13:
                printStream.getClass();
                break;
            case 14:
                printStream.getClass();
                break;
            case 15:
                printStream.getClass();
                break;
            case 16:
                printStream.getClass();
                break;
            case 17:
                printStream.getClass();
                break;
            case 18:
                printStream.getClass();
                break;
            case 20:
                printStream.getClass();
                break;
            case 21:
                printStream.getClass();
                break;
            case 23:
                printStream.getClass();
                break;
            case 24:
                printStream.getClass();
                break;
            case 25:
                printStream.getClass();
                break;
            case 26:
                printStream.getClass();
                break;
            case 27:
                printStream.getClass();
                break;
            default:
                printStream.getClass();
                break;
        }
    }

    public static void k(String[] strArr) {
        InputStream fileInputStream;
        if (strArr.length >= 1) {
            try {
                fileInputStream = new FileInputStream(strArr[0]);
            } catch (FileNotFoundException unused) {
                PrintStream printStream = System.out;
                String str = strArr[0];
                printStream.getClass();
                System.exit(1);
                fileInputStream = null;
            }
        } else {
            fileInputStream = System.in;
        }
        new Jy0(fileInputStream);
    }

    public void a(Fl0 fl0) throws IOException {
        H50 h50M = m(fl0, this.g, this.f);
        this.a.b(h50M, 2);
        n(h50M);
    }

    public boolean b(Fl0 fl0) throws Ri0 {
        String str;
        String strE0 = fl0.e0();
        String strE1 = fl0.e0();
        boolean z = true;
        if (this.b == null) {
            n("No response has been received");
            return true;
        }
        String string = null;
        if (strE0.equalsIgnoreCase("rcode")) {
            int iN = this.b.k().n();
            if (iN != C2820t50.c(strE1)) {
                string = C2820t50.b(iN);
                z = false;
            }
        } else if (strE0.equalsIgnoreCase("serial")) {
            List<H50> listQ = this.b.q(1);
            if (listQ.isEmpty() || !(listQ.get(0) instanceof C1467f90)) {
                n("Invalid response (no SOA)");
            } else {
                long jA0 = ((C1467f90) listQ.get(0)).a0();
                if (jA0 != Long.parseLong(strE1)) {
                    string = Long.toString(jA0);
                    z = false;
                }
            }
        } else if (strE0.equalsIgnoreCase("tsig")) {
            if (this.b.u()) {
                str = this.b.v() ? "ok" : "failed";
            } else {
                str = "unsigned";
            }
            string = str;
            if (!string.equalsIgnoreCase(strE1)) {
                z = false;
            }
        } else {
            int iD = C1399eb0.d(strE0);
            if (iD >= 0) {
                int iE = this.b.k().e(iD);
                if (iE != Integer.parseInt(strE1)) {
                    string = Integer.toString(iE);
                    z = false;
                }
            } else {
                n("Invalid assertion keyword: ".concat(strE0));
            }
        }
        if (!z) {
            n("Expected " + strE0 + " " + strE1 + ", received " + string);
            while (true) {
                Fl0.b bVarI = fl0.i();
                if (!bVarI.b()) {
                    break;
                }
                n(bVarI.d());
            }
            fl0.n0();
        }
        return z;
    }

    public void c(Fl0 fl0) throws IOException {
        H50 h50A;
        C2848tT c2848tTD0 = fl0.d0(this.e);
        Fl0.b bVarI = fl0.i();
        if (bVarI.b()) {
            String strD = bVarI.d();
            if (C0344Ci.c(strD) >= 0) {
                strD = fl0.e0();
            }
            int iF = C3080vp0.f(strD);
            if (iF < 0) {
                throw new IOException(AbstractC1701hf0.t("Invalid type: ", strD));
            }
            boolean zA = fl0.i().a();
            fl0.n0();
            h50A = !zA ? H50.o(c2848tTD0, iF, 254, 0L, fl0, this.e) : H50.A(c2848tTD0, iF, 255, 0L);
        } else {
            h50A = H50.A(c2848tTD0, 255, 255, 0L);
        }
        this.a.b(h50A, 2);
        n(h50A);
    }

    public void d(Fl0 fl0, List<BufferedReader> list, List<InputStream> list2) throws Ri0 {
        String strE0 = fl0.e0();
        try {
            InputStream fileInputStream = strE0.equals("-") ? System.in : new FileInputStream(strE0);
            list2.add(0, fileInputStream);
            list.add(0, new BufferedReader(new InputStreamReader(fileInputStream)));
        } catch (FileNotFoundException unused) {
            n(strE0 + " not found");
        }
    }

    public void e(Fl0 fl0) throws IOException {
        H50 h50M = m(fl0, this.g, this.f);
        this.a.b(h50M, 3);
        n(h50M);
    }

    public void f(Fl0 fl0) throws Ri0 {
        String strE0 = fl0.e0();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(strE0);
            try {
                this.h = new PrintStream(fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (Exception unused) {
            n("Error opening " + strE0);
        }
    }

    public void g(Fl0 fl0) throws IOException {
        int iF;
        C2848tT c2848tTD0 = fl0.d0(this.e);
        Fl0.b bVarI = fl0.i();
        if (bVarI.b()) {
            iF = C3080vp0.f(bVarI.d());
            if (iF < 0) {
                throw new IOException("Invalid type: " + bVarI.d());
            }
        } else {
            iF = 255;
        }
        H50 h50A = H50.A(c2848tTD0, iF, 254, 0L);
        this.a.b(h50A, 1);
        n(h50A);
    }

    public void h(Fl0 fl0) throws IOException {
        int iF;
        int iC = this.g;
        C2848tT c2848tTD0 = fl0.d0(this.e);
        Fl0.b bVarI = fl0.i();
        if (bVarI.b()) {
            iF = C3080vp0.f(bVarI.d());
            if (iF < 0) {
                throw new IOException("Invalid type");
            }
            Fl0.b bVarI2 = fl0.i();
            if (bVarI2.b() && (iC = C0344Ci.c(bVarI2.d())) < 0) {
                throw new IOException("Invalid class");
            }
        } else {
            iF = 1;
        }
        AQ aqW = AQ.w(H50.z(c2848tTD0, iF, iC));
        if (this.c == null) {
            this.c = new Qd0(this.d);
        }
        AQ aqB = this.c.b(aqW);
        this.b = aqB;
        n(aqB);
    }

    public void i(Fl0 fl0) throws IOException {
        H50 h50A;
        C2848tT c2848tTD0 = fl0.d0(this.e);
        Fl0.b bVarI = fl0.i();
        if (bVarI.b()) {
            int iF = C3080vp0.f(bVarI.d());
            if (iF < 0) {
                throw new IOException("Invalid type: " + bVarI.d());
            }
            boolean zA = fl0.i().a();
            fl0.n0();
            h50A = !zA ? H50.o(c2848tTD0, iF, this.g, 0L, fl0, this.e) : H50.A(c2848tTD0, iF, 255, 0L);
        } else {
            h50A = H50.A(c2848tTD0, 255, 255, 0L);
        }
        this.a.b(h50A, 1);
        n(h50A);
    }

    public AQ l() {
        AQ aq = new AQ();
        aq.k().v(5);
        return aq;
    }

    public H50 m(Fl0 fl0, int i, long j) throws IOException {
        long j2;
        C2848tT c2848tTD0 = fl0.d0(this.e);
        String strE0 = fl0.e0();
        try {
            long jD = C1707hi0.d(strE0);
            strE0 = fl0.e0();
            j2 = jD;
        } catch (NumberFormatException unused) {
            j2 = j;
        }
        if (C0344Ci.c(strE0) >= 0) {
            i = C0344Ci.c(strE0);
            strE0 = fl0.e0();
        }
        int i2 = i;
        int iF = C3080vp0.f(strE0);
        if (iF >= 0) {
            return H50.o(c2848tTD0, iF, i2, j2, fl0, this.e);
        }
        throw new IOException(AbstractC1701hf0.t("Invalid type: ", strE0));
    }

    public void n(Object obj) {
        System.out.getClass();
        PrintStream printStream = this.h;
        if (printStream != null) {
            printStream.getClass();
        }
    }

    public void o() {
        if (this.a.k().e(2) == 0) {
            n("Empty update message.  Ignoring.");
            return;
        }
        if (this.a.k().e(0) == 0) {
            C2848tT c2848tT = this.e;
            int iT = this.g;
            if (c2848tT == null) {
                for (H50 h50 : this.a.q(2)) {
                    if (c2848tT == null) {
                        c2848tT = new C2848tT(h50.v(), 1);
                    }
                    if (h50.t() != 254 && h50.t() != 255) {
                        iT = h50.t();
                        break;
                    }
                }
            }
            this.a.b(H50.z(c2848tT, 6, iT), 0);
        }
        if (this.c == null) {
            this.c = new Qd0(this.d);
        }
        AQ aqB = this.c.b(this.a);
        this.b = aqB;
        n(aqB);
    }
}
