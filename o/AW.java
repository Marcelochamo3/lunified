package o;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AW {
    public static final Rh0 a = new Rh0(C2428p3.K);
    public static final Rh0 b = new Rh0(C2428p3.J);

    public static final void a(InputStream inputStream, FileOutputStream fileOutputStream, long j) throws IOException {
        byte[] bArr = new byte[C1672hI.a.e];
        long j2 = 0;
        while (true) {
            int i = inputStream.read(bArr);
            if (i < 0) {
                return;
            }
            j2 += (long) i;
            if (j2 > j) {
                throw new IOException("Contenido demasiado grande");
            }
            fileOutputStream.write(bArr, 0, i);
        }
    }

    public static Object b(String str, Integer num, Integer num2, InterfaceC0473Hh interfaceC0473Hh, int i) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        Map mapZ = AbstractC3327yN.z(new C1101bX("imdbid", null), new C1101bX("query", str), new C1101bX("season", num != null ? num.toString() : null), new C1101bX("episode", num2 != null ? num2.toString() : null), new C1101bX("sublanguageid", null));
        InterfaceC3239xW interfaceC3239xW = (InterfaceC3239xW) a.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapZ.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(entry2.getKey() + "-" + entry2.getValue());
        }
        return interfaceC3239xW.a(AbstractC0911Ye.h0(arrayList, "/", null, null, null, 62), interfaceC0473Hh);
    }
}
