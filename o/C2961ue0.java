package o;

import android.view.View;

/* JADX INFO: renamed from: o.ue0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2961ue0 extends AbstractC1459f50 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1058o;

    @Override // o.InterfaceC3058ve0
    public final float a(View view) {
        switch (this.f1058o) {
            case 0:
                return view.getTranslationY() - view.getHeight();
            default:
                return view.getTranslationY() + view.getHeight();
        }
    }
}
