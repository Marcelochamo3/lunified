package io.sentry;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: io.sentry.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0086s implements I {
    public static final Charset m = Charset.forName("UTF-8");
    public final U l;

    public C0086s(C0087s0 c0087s0) {
        this.l = c0087s0;
    }

    @Override // io.sentry.I
    public final C0088s1 x(BufferedInputStream bufferedInputStream) throws IOException {
        U u = this.l;
        Charset charset = m;
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = -1;
        int i2 = 0;
        while (true) {
            try {
                int i3 = bufferedInputStream.read(bArr);
                if (i3 <= 0) {
                    break;
                }
                for (int i4 = 0; i == -1 && i4 < i3; i4++) {
                    if (bArr[i4] == 10) {
                        i = i2 + i4;
                        break;
                    }
                }
                byteArrayOutputStream.write(bArr, 0, i3);
                i2 += i3;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length == 0) {
            throw new IllegalArgumentException("Empty stream.");
        }
        if (i == -1) {
            throw new IllegalArgumentException("Envelope contains no header.");
        }
        StringReader stringReader = new StringReader(new String(byteArray, 0, i, charset));
        try {
            C0055j1 c0055j1 = (C0055j1) u.b(stringReader, C0055j1.class);
            stringReader.close();
            if (c0055j1 == null) {
                throw new IllegalArgumentException("Envelope header is null.");
            }
            int i5 = i + 1;
            ArrayList arrayList = new ArrayList();
            while (true) {
                int i6 = i5;
                while (true) {
                    if (i6 >= byteArray.length) {
                        i6 = -1;
                        break;
                    }
                    if (byteArray[i6] == 10) {
                        break;
                    }
                    i6++;
                }
                if (i6 == -1) {
                    throw new IllegalArgumentException("Invalid envelope. Item at index '" + arrayList.size() + "'. has no header delimiter.");
                }
                StringReader stringReader2 = new StringReader(new String(byteArray, i5, i6 - i5, charset));
                try {
                    C0073p1 c0073p1 = (C0073p1) u.b(stringReader2, C0073p1.class);
                    stringReader2.close();
                    if (c0073p1 == null || c0073p1.a() <= 0) {
                        throw new IllegalArgumentException("Item header at index '" + arrayList.size() + "' is null or empty.");
                    }
                    int iA = c0073p1.a() + i6;
                    int i7 = iA + 1;
                    if (i7 > byteArray.length) {
                        throw new IllegalArgumentException("Invalid length for item at index '" + arrayList.size() + "'. Item is '" + i7 + "' bytes. There are '" + byteArray.length + "' in the buffer.");
                    }
                    arrayList.add(new C0070o1(c0073p1, Arrays.copyOfRange(byteArray, i6 + 1, i7)));
                    if (i7 == byteArray.length) {
                        break;
                    }
                    i5 = iA + 2;
                    if (i5 == byteArray.length) {
                        if (byteArray[i7] == 10) {
                            break;
                        }
                        throw new IllegalArgumentException("Envelope has invalid data following an item.");
                    }
                } catch (Throwable th3) {
                    try {
                        stringReader2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            C0088s1 c0088s1 = new C0088s1(c0055j1, arrayList);
            byteArrayOutputStream.close();
            return c0088s1;
        } catch (Throwable th5) {
            try {
                stringReader.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }
}
