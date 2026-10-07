package o;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class Fu0 extends Du0 {
    public static boolean m = true;

    @Override // o.U9
    public void G(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.G(view, i);
        } else if (m) {
            try {
                Eu0.a(view, i);
            } catch (NoSuchMethodError unused) {
                m = false;
            }
        }
    }
}
