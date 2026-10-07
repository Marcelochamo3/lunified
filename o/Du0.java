package o;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class Du0 extends U9 {
    public static boolean j = true;
    public static boolean k = true;
    public static boolean l = true;

    public void P(View view, int i, int i2, int i3, int i4) {
        if (l) {
            try {
                Cu0.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                l = false;
            }
        }
    }

    public void Q(View view, Matrix matrix) {
        if (j) {
            try {
                Bu0.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                j = false;
            }
        }
    }

    public void R(View view, Matrix matrix) {
        if (k) {
            try {
                Bu0.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                k = false;
            }
        }
    }
}
