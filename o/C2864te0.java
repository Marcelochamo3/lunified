package o;

import android.view.View;

/* JADX INFO: renamed from: o.te0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2864te0 extends AbstractC3045vW {
    public final /* synthetic */ int k;

    @Override // o.InterfaceC3058ve0
    public final float a(View view) {
        switch (this.k) {
            case 0:
                return view.getTranslationX() - view.getWidth();
            case 1:
                return view.getTranslationX() + view.getWidth();
            case 2:
                return view.getLayoutDirection() == 1 ? view.getTranslationX() + view.getWidth() : view.getTranslationX() - view.getWidth();
            default:
                return view.getLayoutDirection() == 1 ? view.getTranslationX() - view.getWidth() : view.getTranslationX() + view.getWidth();
        }
    }
}
