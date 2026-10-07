package o;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: o.nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2280nd extends AbstractC1474fG {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ C2280nd(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    @Override // o.AbstractC1474fG
    public final void L(int i) {
        switch (this.m) {
            case 0:
                break;
            default:
                Ii0 ii0 = (Ii0) this.n;
                ii0.e = true;
                Hi0 hi0 = (Hi0) ii0.f.get();
                if (hi0 != null) {
                    hi0.a();
                }
                break;
        }
    }

    @Override // o.AbstractC1474fG
    public final void M(Typeface typeface, boolean z) {
        switch (this.m) {
            case 0:
                Chip chip = (Chip) this.n;
                C2667rd c2667rd = chip.p;
                chip.setText(c2667rd.O0 ? c2667rd.P : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    Ii0 ii0 = (Ii0) this.n;
                    ii0.e = true;
                    Hi0 hi0 = (Hi0) ii0.f.get();
                    if (hi0 != null) {
                        hi0.a();
                    }
                    break;
                }
                break;
        }
    }

    private final void Z(int i) {
    }
}
