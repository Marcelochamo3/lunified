package o;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class P2 implements M70 {
    public final /* synthetic */ int l;
    public final Object m;

    public /* synthetic */ P2(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    @Override // o.M70
    public final int b() {
        switch (this.l) {
            case 0:
                return Kr0.d(Bitmap.Config.ARGB_8888) * ((AnimatedImageDrawable) this.m).getIntrinsicHeight() * ((AnimatedImageDrawable) this.m).getIntrinsicWidth() * 2;
            case 1:
                return ((byte[]) this.m).length;
            case 2:
                return 1;
            default:
                return Kr0.c((Bitmap) this.m);
        }
    }

    @Override // o.M70
    public final Class d() {
        switch (this.l) {
            case 0:
                return Drawable.class;
            case 1:
                return byte[].class;
            case 2:
                return this.m.getClass();
            default:
                return Bitmap.class;
        }
    }

    @Override // o.M70
    public final void e() {
        switch (this.l) {
            case 0:
                ((AnimatedImageDrawable) this.m).stop();
                ((AnimatedImageDrawable) this.m).clearAnimationCallbacks();
                break;
        }
    }

    @Override // o.M70
    public final Object get() {
        switch (this.l) {
            case 0:
                return (AnimatedImageDrawable) this.m;
            case 1:
                return (byte[]) this.m;
            case 2:
                return this.m;
            default:
                return (Bitmap) this.m;
        }
    }

    public P2(byte[] bArr) {
        this.l = 1;
        AbstractC3045vW.k(bArr, "Argument must not be null");
        this.m = bArr;
    }

    public P2(File file) {
        this.l = 2;
        AbstractC3045vW.k(file, "Argument must not be null");
        this.m = file;
    }

    private final void a() {
    }

    private final void c() {
    }

    private final void f() {
    }
}
