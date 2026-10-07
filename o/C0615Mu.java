package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: renamed from: o.Mu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0615Mu implements Q70 {
    public final /* synthetic */ int a;

    public /* synthetic */ C0615Mu(int i) {
        this.a = i;
    }

    @Override // o.Q70
    public final M70 a(Object obj, int i, int i2, FW fw) {
        switch (this.a) {
            case 0:
                return new P2((File) obj);
            case 1:
                return new P2(3, (Bitmap) obj);
            default:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new C0698Pz(drawable, 1);
                }
                return null;
        }
    }

    @Override // o.Q70
    public final /* bridge */ /* synthetic */ boolean b(Object obj, FW fw) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }
}
