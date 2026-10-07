package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class U3 extends AbstractC2799su0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ U3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // o.InterfaceC2702ru0
    public final void a() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                S3 s3 = (S3) obj;
                s3.m.G.setAlpha(1.0f);
                LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = s3.m;
                layoutInflaterFactory2C1456f4.J.d(null);
                layoutInflaterFactory2C1456f4.J = null;
                break;
            case 1:
                LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f5 = (LayoutInflaterFactory2C1456f4) obj;
                layoutInflaterFactory2C1456f5.G.setAlpha(1.0f);
                layoutInflaterFactory2C1456f5.J.d(null);
                layoutInflaterFactory2C1456f5.J = null;
                break;
            default:
                C2720s4 c2720s4 = (C2720s4) obj;
                ((LayoutInflaterFactory2C1456f4) c2720s4.n).G.setVisibility(8);
                LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f6 = (LayoutInflaterFactory2C1456f4) c2720s4.n;
                PopupWindow popupWindow = layoutInflaterFactory2C1456f6.H;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C1456f6.G.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C1456f6.G.getParent();
                    WeakHashMap weakHashMap = It0.a;
                    AbstractC2991ut0.c(view);
                }
                layoutInflaterFactory2C1456f6.G.e();
                layoutInflaterFactory2C1456f6.J.d(null);
                layoutInflaterFactory2C1456f6.J = null;
                ViewGroup viewGroup = layoutInflaterFactory2C1456f6.M;
                WeakHashMap weakHashMap2 = It0.a;
                AbstractC2991ut0.c(viewGroup);
                break;
        }
    }

    @Override // o.AbstractC2799su0, o.InterfaceC2702ru0
    public void c() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                ((S3) obj).m.G.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = (LayoutInflaterFactory2C1456f4) obj;
                layoutInflaterFactory2C1456f4.G.setVisibility(0);
                if (layoutInflaterFactory2C1456f4.G.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C1456f4.G.getParent();
                    WeakHashMap weakHashMap = It0.a;
                    AbstractC2991ut0.c(view);
                }
                break;
        }
    }
}
