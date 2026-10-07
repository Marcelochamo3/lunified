package o;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public class D70 extends AbstractC2341o8 {
    private int f = 1;

    private boolean o(String str) {
        Path path = Paths.get(str, new String[0]);
        if (Files.exists(path, new LinkOption[0])) {
            try {
                InputStream inputStreamNewInputStream = Files.newInputStream(path, new OpenOption[0]);
                try {
                    n(inputStreamNewInputStream);
                    if (inputStreamNewInputStream == null) {
                        return true;
                    }
                    inputStreamNewInputStream.close();
                    return true;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        if (inputStreamNewInputStream != null) {
                            try {
                                inputStreamNewInputStream.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // o.K70
    public void a() {
        m();
        if (o("/etc/resolv.conf")) {
            return;
        }
        o("sys:/etc/resolv.cfg");
    }

    @Override // o.AbstractC2341o8, o.K70
    public int b() {
        return this.f;
    }

    @Override // o.AbstractC2341o8, o.K70
    public boolean isEnabled() {
        return (System.getProperty("os.name").contains("Windows") || System.getProperty("java.specification.vendor").toLowerCase().contains("android")) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void n(InputStream inputStream) throws IOException {
        byte b;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        try {
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        inputStreamReader.close();
                        String str = System.getenv("LOCALDOMAIN");
                        if (str != null && !str.isEmpty()) {
                            this.c.clear();
                            l(str, " ");
                        }
                        String str2 = System.getenv("RES_OPTIONS");
                        if (str2 == null || str2.isEmpty()) {
                            return;
                        }
                        StringTokenizer stringTokenizer = new StringTokenizer(str2, " ");
                        while (stringTokenizer.hasMoreTokens()) {
                            String strNextToken = stringTokenizer.nextToken();
                            if (strNextToken.startsWith("ndots:")) {
                                this.f = k(strNextToken.substring(6));
                            }
                        }
                        return;
                    }
                    StringTokenizer stringTokenizer2 = new StringTokenizer(line);
                    if (stringTokenizer2.hasMoreTokens()) {
                        String strNextToken2 = stringTokenizer2.nextToken();
                        switch (strNextToken2.hashCode()) {
                            case -1326197564:
                                if (!strNextToken2.equals("domain")) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            case -1249474914:
                                if (!strNextToken2.equals("options")) {
                                    b = -1;
                                } else {
                                    b = 3;
                                }
                                break;
                            case -906336856:
                                if (!strNextToken2.equals("search")) {
                                    b = -1;
                                } else {
                                    b = 2;
                                }
                                break;
                            case 154424718:
                                if (!strNextToken2.equals("nameserver")) {
                                    b = -1;
                                } else {
                                    b = 0;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        if (b == 0) {
                            g(new InetSocketAddress(stringTokenizer2.nextToken(), 53));
                        } else if (b != 1) {
                            if (b == 2) {
                                this.c.clear();
                                while (stringTokenizer2.hasMoreTokens()) {
                                    h(stringTokenizer2.nextToken());
                                }
                            } else if (b != 3) {
                            }
                            while (stringTokenizer2.hasMoreTokens()) {
                                String strNextToken3 = stringTokenizer2.nextToken();
                                if (strNextToken3.startsWith("ndots:")) {
                                    this.f = k(strNextToken3.substring(6));
                                }
                            }
                        } else {
                            this.c.clear();
                            if (stringTokenizer2.hasMoreTokens()) {
                                h(stringTokenizer2.nextToken());
                            }
                        }
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th6) {
                    th4.addSuppressed(th6);
                }
                throw th5;
            }
        }
    }
}
