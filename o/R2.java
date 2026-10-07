package o;

import android.graphics.drawable.Animatable;

/* JADX INFO: loaded from: classes.dex */
public final class R2 extends Jp0 {
    public final /* synthetic */ int g;
    public final Animatable h;

    public /* synthetic */ R2(Animatable animatable, int i) {
        this.g = i;
        this.h = animatable;
    }

    @Override // o.Jp0
    public final void L() {
        switch (this.g) {
            case 0:
                this.h.start();
                break;
            default:
                ((Z2) this.h).start();
                break;
        }
    }

    @Override // o.Jp0
    public final void M() {
        switch (this.g) {
            case 0:
                this.h.stop();
                break;
            default:
                ((Z2) this.h).stop();
                break;
        }
    }
}
