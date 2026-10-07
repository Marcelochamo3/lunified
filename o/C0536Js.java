package o;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.transition.FadeAndShortSlide;

/* JADX INFO: renamed from: o.Js, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0536Js extends AbstractC1370eA {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ FadeAndShortSlide f351o;

    public C0536Js(FadeAndShortSlide fadeAndShortSlide) {
        this.f351o = fadeAndShortSlide;
    }

    @Override // o.AbstractC1370eA
    public final float t(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        int iCenterY;
        int height = (view.getHeight() / 2) + iArr[1];
        viewGroup.getLocationOnScreen(iArr);
        Rect epicenter = this.f351o.getEpicenter();
        if (epicenter == null) {
            iCenterY = (viewGroup.getHeight() / 2) + iArr[1];
        } else {
            iCenterY = epicenter.centerY();
        }
        if (height < iCenterY) {
            return view.getTranslationY() - fadeAndShortSlide.c(viewGroup);
        }
        return fadeAndShortSlide.c(viewGroup) + view.getTranslationY();
    }
}
