package o;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: o.Nu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0641Nu extends AbstractC1362e6 {
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0641Nu(AssetManager assetManager, String str, int i) {
        super(0, str, assetManager);
        this.p = i;
    }

    @Override // o.InterfaceC1610gj
    public final Class b() {
        switch (this.p) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // o.AbstractC1362e6
    public final void g(Object obj) throws IOException {
        switch (this.p) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }

    @Override // o.AbstractC1362e6
    public final Object h(AssetManager assetManager, String str) {
        switch (this.p) {
            case 0:
                return assetManager.openFd(str);
            default:
                return assetManager.open(str);
        }
    }
}
