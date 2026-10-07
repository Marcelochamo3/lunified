package o;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: o.xw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3288xw0 extends Aw0 {
    public static Field e = null;
    public static boolean f = false;
    public static Constructor g = null;
    public static boolean h = false;
    public WindowInsets c;
    public TF d;

    public C3288xw0() {
        this.c = i();
    }

    private static WindowInsets i() {
        if (!f) {
            try {
                e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f = true;
        }
        Field field = e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!h) {
            try {
                g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            h = true;
        }
        Constructor constructor = g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // o.Aw0
    public Kw0 b() {
        a();
        Kw0 kw0G = Kw0.g(null, this.c);
        TF[] tfArr = this.b;
        Hw0 hw0 = kw0G.a;
        hw0.o(tfArr);
        hw0.q(this.d);
        return kw0G;
    }

    @Override // o.Aw0
    public void e(TF tf) {
        this.d = tf;
    }

    @Override // o.Aw0
    public void g(TF tf) {
        WindowInsets windowInsets = this.c;
        if (windowInsets != null) {
            this.c = windowInsets.replaceSystemWindowInsets(tf.a, tf.b, tf.c, tf.d);
        }
    }

    public C3288xw0(Kw0 kw0) {
        super(kw0);
        this.c = kw0.f();
    }
}
