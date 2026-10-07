package o;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Bg0 implements Q70 {
    public final List a;
    public final Q70 b;
    public final C1813in c;

    public Bg0(ArrayList arrayList, C1884ja c1884ja, C1813in c1813in) {
        this.a = arrayList;
        this.b = c1884ja;
        this.c = c1813in;
    }

    @Override // o.Q70
    public final M70 a(Object obj, int i, int i2, FW fw) {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i3 = inputStream.read(bArr);
                if (i3 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i3);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            Log.isLoggable("StreamGifDecoder", 5);
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.b.a(ByteBuffer.wrap(byteArray), i, i2, fw);
    }

    @Override // o.Q70
    public final boolean b(Object obj, FW fw) {
        return !((Boolean) fw.c(AbstractC0932Yz.b)).booleanValue() && Jp0.v(this.a, (InputStream) obj, this.c) == ImageHeaderParser$ImageType.GIF;
    }
}
