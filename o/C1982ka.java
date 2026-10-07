package o;

import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: o.ka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1982ka implements InterfaceC2098lj {
    public final /* synthetic */ int a;

    public /* synthetic */ C1982ka(int i) {
        this.a = i;
    }

    @Override // o.InterfaceC2098lj
    public final InterfaceC2195mj a(Object obj) {
        switch (this.a) {
            case 0:
                return new C2080la((ByteBuffer) obj, 0);
            case 1:
                return new L0(obj);
            default:
                return new com.bumptech.glide.load.data.a((ParcelFileDescriptor) obj);
        }
    }

    @Override // o.InterfaceC2098lj
    public final Class b() {
        switch (this.a) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }
}
