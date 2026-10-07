package o;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.ls, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2116ls extends L0 {
    public final /* synthetic */ C2474pd n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2116ls(C2474pd c2474pd) {
        super(1);
        this.n = c2474pd;
    }

    @Override // o.L0
    public final N0 b(int i) {
        return new N0(AccessibilityNodeInfo.obtain(this.n.n(i).a));
    }

    @Override // o.L0
    public final N0 c(int i) {
        C2474pd c2474pd = this.n;
        int i2 = i == 2 ? c2474pd.k : c2474pd.l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return b(i2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    @Override // o.L0
    public final boolean g(int i, int i2, Bundle bundle) {
        int i3;
        C2474pd c2474pd = this.n;
        View view = c2474pd.i;
        if (i == -1) {
            WeakHashMap weakHashMap = It0.a;
            return view.performAccessibilityAction(i2, bundle);
        }
        boolean z = true;
        if (i2 == 1) {
            return c2474pd.p(i);
        }
        if (i2 == 2) {
            return c2474pd.j(i);
        }
        boolean z2 = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = c2474pd.h;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = c2474pd.k) != i) {
                if (i3 != Integer.MIN_VALUE) {
                    c2474pd.k = Integer.MIN_VALUE;
                    c2474pd.i.invalidate();
                    c2474pd.q(i3, 65536);
                }
                c2474pd.k = i;
                view.invalidate();
                c2474pd.q(i, 32768);
            } else {
                z = false;
            }
        } else {
            if (i2 != 128) {
                if (i2 != 16) {
                    return false;
                }
                Chip chip = c2474pd.n;
                if (i == 0) {
                    return chip.performClick();
                }
                if (i != 1) {
                    return false;
                }
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.s;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z2 = true;
                }
                if (!chip.D) {
                    return z2;
                }
                chip.C.q(1, 1);
                return z2;
            }
            if (c2474pd.k == i) {
                c2474pd.k = Integer.MIN_VALUE;
                view.invalidate();
                c2474pd.q(i, 65536);
            } else {
                z = false;
            }
        }
        return z;
    }
}
