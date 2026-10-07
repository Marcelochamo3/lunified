package o;

import j$.time.Instant;
import j$.time.TimeConversions;
import j$.util.DesugarArrays;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import lombok.Generated;

/* JADX INFO: loaded from: classes.dex */
public final class XC {

    @Generated
    private static final CL f = DL.d(XC.class);
    private static final int g = 16384;
    private final Map<String, InetAddress> a;
    private final Path b;
    private final boolean c;
    private Instant d;
    private boolean e;

    public static final class a {
        final int a;
        final byte[] b;
        final Iterable<? extends C2848tT> c;

        @Generated
        public a(int i, byte[] bArr, Iterable<? extends C2848tT> iterable) {
            this.a = i;
            this.b = bArr;
            this.c = iterable;
        }
    }

    public XC() {
        this(System.getProperty("os.name").contains("Windows") ? Paths.get(System.getenv("SystemRoot"), "\\System32\\drivers\\etc\\hosts") : Paths.get("/etc/hosts", new String[0]), true);
    }

    private String[] d(String str) {
        int iIndexOf = str.indexOf(35);
        if (iIndexOf == -1) {
            iIndexOf = str.length();
        }
        return str.substring(0, iIndexOf).trim().split("\\s+");
    }

    private String e(C2848tT c2848tT, int i) {
        return c2848tT.toString() + '\t' + i;
    }

    private void g() throws IOException {
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(this.b, StandardCharsets.UTF_8);
        int i = 0;
        while (true) {
            try {
                String line = bufferedReaderNewBufferedReader.readLine();
                if (line == null) {
                    bufferedReaderNewBufferedReader.close();
                    this.e = true;
                    return;
                }
                i++;
                a aVarH = h(i, line);
                if (aVarH != null) {
                    for (C2848tT c2848tT : aVarH.c) {
                        j$.util.Map.EL.putIfAbsent(this.a, e(c2848tT, aVarH.a), InetAddress.getByAddress(c2848tT.z(true), aVarH.b));
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (bufferedReaderNewBufferedReader != null) {
                        try {
                            bufferedReaderNewBufferedReader.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        }
    }

    private a h(final int i, String str) {
        int i2;
        String[] strArrD = d(str);
        if (strArrD.length < 2) {
            return null;
        }
        byte[] bArrO = C1062b2.o(strArrD[0], 1);
        if (bArrO == null) {
            bArrO = C1062b2.o(strArrD[0], 2);
            i2 = 28;
        } else {
            i2 = 1;
        }
        if (bArrO == null) {
            f.A("Could not decode address {}, {}#L{}", strArrD[0], this.b, Integer.valueOf(i));
            return null;
        }
        final Stream streamFilter = DesugarArrays.stream(strArrD).skip(1L).map(new Function() { // from class: o.VC
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public final /* synthetic */ Function mo4andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.f(i, (String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new C2244n8(1));
        streamFilter.getClass();
        return new a(i2, bArrO, new Iterable() { // from class: o.WC
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return streamFilter.iterator();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C2848tT f(String str, int i) {
        try {
            return C2848tT.n(str, C2848tT.v);
        } catch (Ri0 unused) {
            f.A("Could not decode name {}, {}#L{}, skipping", str, this.b, Integer.valueOf(i));
            return null;
        }
    }

    private void j(C2848tT c2848tT, int i) throws IOException {
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(this.b, StandardCharsets.UTF_8);
        int i2 = 0;
        while (true) {
            try {
                String line = bufferedReaderNewBufferedReader.readLine();
                if (line == null) {
                    bufferedReaderNewBufferedReader.close();
                    return;
                }
                i2++;
                a aVarH = h(i2, line);
                if (aVarH != null) {
                    for (C2848tT c2848tT2 : aVarH.c) {
                        if (c2848tT2.equals(c2848tT) && i == aVarH.a) {
                            j$.util.Map.EL.putIfAbsent(this.a, e(c2848tT2, aVarH.a), InetAddress.getByAddress(c2848tT2.z(true), aVarH.b));
                            bufferedReaderNewBufferedReader.close();
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (bufferedReaderNewBufferedReader != null) {
                        try {
                            bufferedReaderNewBufferedReader.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        }
    }

    private void k() {
        if (this.c) {
            Instant instantConvert = Files.exists(this.b, new LinkOption[0]) ? TimeConversions.convert(Files.getLastModifiedTime(this.b, new LinkOption[0]).toInstant()) : Instant.MAX;
            if (instantConvert.isAfter(this.d)) {
                if (!this.a.isEmpty()) {
                    f.i(instantConvert);
                    this.a.clear();
                }
                this.e = false;
                this.d = instantConvert;
            }
        }
    }

    public int b() {
        return this.a.size();
    }

    public synchronized Optional<InetAddress> c(C2848tT c2848tT, int i) {
        try {
            Objects.requireNonNull(c2848tT, "name is required");
            if (i != 1 && i != 28) {
                throw new IllegalArgumentException("type can only be A or AAAA");
            }
            k();
            InetAddress inetAddress = this.a.get(e(c2848tT, i));
            if (inetAddress != null) {
                return Optional.of(inetAddress);
            }
            if (!this.e && Files.exists(this.b, new LinkOption[0])) {
                if (Files.size(this.b) <= 16384) {
                    g();
                } else {
                    j(c2848tT, i);
                }
                return Optional.ofNullable(this.a.get(e(c2848tT, i)));
            }
            return Optional.empty();
        } catch (Throwable th) {
            throw th;
        }
    }

    public XC(Path path) {
        this(path, true);
    }

    public XC(Path path, boolean z) {
        this.a = new HashMap();
        this.d = Instant.MIN;
        Objects.requireNonNull(path, "path is required");
        this.b = AbstractC1815io.i(path);
        this.c = z;
        if (Files.isDirectory(path, new LinkOption[0])) {
            throw new IllegalArgumentException("path must be a file");
        }
    }
}
