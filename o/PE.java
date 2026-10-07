package o;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface PE {
    ImageHeaderParser$ImageType a(ByteBuffer byteBuffer);

    int b(ByteBuffer byteBuffer, C1813in c1813in);

    int c(InputStream inputStream, C1813in c1813in);

    ImageHeaderParser$ImageType d(InputStream inputStream);
}
