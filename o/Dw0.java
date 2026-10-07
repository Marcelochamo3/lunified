package o;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Dw0 extends Cw0 {
    public Dw0(Kw0 kw0, WindowInsets windowInsets) {
        super(kw0, windowInsets);
    }

    @Override // o.Hw0
    public Kw0 a() {
        return Kw0.g(null, this.c.consumeDisplayCutout());
    }

    @Override // o.Hw0
    public C2106ln e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C2106ln(displayCutout);
    }

    @Override // o.Bw0, o.Hw0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dw0)) {
            return false;
        }
        Dw0 dw0 = (Dw0) obj;
        return Objects.equals(this.c, dw0.c) && Objects.equals(this.g, dw0.g);
    }

    @Override // o.Hw0
    public int hashCode() {
        return this.c.hashCode();
    }
}
