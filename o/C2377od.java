package o;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.leanback.preference.internal.OutlineOnlyWithChildrenFrameLayout;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: o.od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2377od extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ C2377od(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                C2667rd c2667rd = ((Chip) this.b).p;
                if (c2667rd == null) {
                    outline.setAlpha(0.0f);
                } else {
                    c2667rd.getOutline(outline);
                }
                break;
            default:
                OutlineOnlyWithChildrenFrameLayout outlineOnlyWithChildrenFrameLayout = (OutlineOnlyWithChildrenFrameLayout) this.b;
                if (outlineOnlyWithChildrenFrameLayout.getChildCount() <= 0) {
                    ViewOutlineProvider.BACKGROUND.getOutline(view, outline);
                } else {
                    outlineOnlyWithChildrenFrameLayout.m.getOutline(view, outline);
                }
                break;
        }
    }
}
