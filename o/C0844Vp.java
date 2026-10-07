package o;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: o.Vp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0844Vp extends AbstractC0403Ep {
    public final /* synthetic */ int a = 0;
    public final WeakReference b;

    public C0844Vp(EditText editText) {
        this.b = new WeakReference(editText);
    }

    @Override // o.AbstractC0403Ep
    public void a() {
        switch (this.a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    @Override // o.AbstractC0403Ep
    public final void b() {
        switch (this.a) {
            case 0:
                C0870Wp.a((EditText) this.b.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    public C0844Vp(SwitchCompat switchCompat) {
        this.b = new WeakReference(switchCompat);
    }
}
