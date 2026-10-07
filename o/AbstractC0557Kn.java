package o;

import java.io.EOFException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.Kn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0557Kn {
    public static final /* synthetic */ int a = 0;

    static {
        Charset charset = StandardCharsets.US_ASCII;
    }

    public static ArrayList a(String str, C2468pa c2468pa) throws EOFException, UnknownHostException {
        AbstractC1474fG.j(str, "hostname");
        AbstractC1474fG.j(c2468pa, "byteString");
        ArrayList arrayList = new ArrayList();
        E9 e9 = new E9();
        e9.c0(c2468pa);
        e9.readShort();
        short s = e9.readShort();
        if (((s & 65535) >> 15) == 0) {
            throw new IllegalArgumentException("not a response".toString());
        }
        int i = s & 15;
        if (i == 2) {
            throw new UnknownHostException(str.concat(": SERVFAIL"));
        }
        if (i == 3) {
            throw new UnknownHostException(str.concat(": NXDOMAIN"));
        }
        int i2 = e9.readShort() & 65535;
        int i3 = e9.readShort() & 65535;
        e9.readShort();
        e9.readShort();
        for (int i4 = 0; i4 < i2; i4++) {
            byte b = e9.readByte();
            if (b < 0) {
                e9.skip(1L);
            } else {
                while (b > 0) {
                    e9.skip(b);
                    b = e9.readByte();
                }
            }
            e9.readShort();
            e9.readShort();
        }
        for (int i5 = 0; i5 < i3; i5++) {
            byte b2 = e9.readByte();
            if (b2 < 0) {
                e9.skip(1L);
            } else {
                while (b2 > 0) {
                    e9.skip(b2);
                    b2 = e9.readByte();
                }
            }
            int i6 = e9.readShort() & 65535;
            e9.readShort();
            e9.readInt();
            int i7 = e9.readShort() & 65535;
            if (i6 == 1 || i6 == 28) {
                byte[] bArr = new byte[i7];
                e9.R(bArr, 0, i7);
                InetAddress byAddress = InetAddress.getByAddress(bArr);
                AbstractC1474fG.i(byAddress, "getByAddress(bytes)");
                arrayList.add(byAddress);
            } else {
                e9.skip(i7);
            }
        }
        return arrayList;
    }
}
