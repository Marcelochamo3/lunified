package o;

import android.R;
import android.content.res.ColorStateList;

/* JADX INFO: renamed from: o.jO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1872jO extends C2817t4 {
    public static final int[][] r = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList p;
    public boolean q;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.p == null) {
            int iO = UK.o(this, com.skidush.clonex.R.attr.colorControlActivated);
            int iO2 = UK.o(this, com.skidush.clonex.R.attr.colorOnSurface);
            int iO3 = UK.o(this, com.skidush.clonex.R.attr.colorSurface);
            this.p = new ColorStateList(r, new int[]{UK.I(iO3, 1.0f, iO), UK.I(iO3, 0.54f, iO2), UK.I(iO3, 0.38f, iO2), UK.I(iO3, 0.38f, iO2)});
        }
        return this.p;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.q && AbstractC1604gg.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.q = z;
        if (z) {
            AbstractC1604gg.c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC1604gg.c(this, null);
        }
    }
}
