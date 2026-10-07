package o;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.transition.FadeAndShortSlide;

/* JADX INFO: renamed from: o.Is, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0510Is extends AbstractC1370eA {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f331o;

    public /* synthetic */ C0510Is(int i) {
        this.f331o = i;
    }

    @Override // o.AbstractC1370eA
    public float s(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        int iCenterX;
        switch (this.f331o) {
            case 0:
                if (viewGroup.getLayoutDirection() == 1) {
                    return fadeAndShortSlide.b(viewGroup) + view.getTranslationX();
                }
                return view.getTranslationX() - fadeAndShortSlide.b(viewGroup);
            case 1:
                return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - fadeAndShortSlide.b(viewGroup) : view.getTranslationX() + fadeAndShortSlide.b(viewGroup);
            case 2:
                int width = (view.getWidth() / 2) + iArr[0];
                viewGroup.getLocationOnScreen(iArr);
                Rect epicenter = fadeAndShortSlide.getEpicenter();
                if (epicenter == null) {
                    iCenterX = (viewGroup.getWidth() / 2) + iArr[0];
                } else {
                    iCenterX = epicenter.centerX();
                }
                return width < iCenterX ? view.getTranslationX() - fadeAndShortSlide.b(viewGroup) : view.getTranslationX() + fadeAndShortSlide.b(viewGroup);
            default:
                return super.s(fadeAndShortSlide, viewGroup, view, iArr);
        }
    }

    @Override // o.AbstractC1370eA
    public float t(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        switch (this.f331o) {
            case 3:
                return fadeAndShortSlide.c(viewGroup) + view.getTranslationY();
            case 4:
                return view.getTranslationY() - fadeAndShortSlide.c(viewGroup);
            default:
                return super.t(fadeAndShortSlide, viewGroup, view, iArr);
        }
    }
}
