package o;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.mw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2222mw0 extends AbstractC2799su0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ C2416ow0 b;

    public /* synthetic */ C2222mw0(C2416ow0 c2416ow0, int i) {
        this.a = i;
        this.b = c2416ow0;
    }

    @Override // o.InterfaceC2702ru0
    public final void a() {
        View view;
        C2416ow0 c2416ow0 = this.b;
        switch (this.a) {
            case 0:
                if (c2416ow0.r && (view = c2416ow0.j) != null) {
                    view.setTranslationY(0.0f);
                    c2416ow0.g.setTranslationY(0.0f);
                }
                c2416ow0.g.setVisibility(8);
                c2416ow0.g.setTransitioning(false);
                c2416ow0.v = null;
                InterfaceC2811t1 interfaceC2811t1 = c2416ow0.n;
                if (interfaceC2811t1 != null) {
                    interfaceC2811t1.h(c2416ow0.m);
                    c2416ow0.m = null;
                    c2416ow0.n = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c2416ow0.f;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = It0.a;
                    AbstractC2991ut0.c(actionBarOverlayLayout);
                }
                break;
            default:
                c2416ow0.v = null;
                c2416ow0.g.requestLayout();
                break;
        }
    }
}
