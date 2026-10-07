package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.skidush.clonex.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class P8 implements InterfaceC2872ti0 {
    public final View l;
    public final C2993uu0 m;
    public Animatable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f449o;

    public P8(ImageView imageView, int i) {
        this.f449o = i;
        AbstractC3045vW.k(imageView, "Argument must not be null");
        this.l = imageView;
        this.m = new C2993uu0(imageView);
    }

    @Override // o.InterfaceC2872ti0
    public final void a(Drawable drawable) {
        l(null);
        this.n = null;
        ((ImageView) this.l).setImageDrawable(drawable);
    }

    @Override // o.InterfaceC1088bK
    public final void b() {
        Animatable animatable = this.n;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // o.InterfaceC2872ti0
    public final void c(InterfaceC2049l70 interfaceC2049l70) {
        this.l.setTag(R.id.glide_custom_view_target_tag, interfaceC2049l70);
    }

    @Override // o.InterfaceC2872ti0
    public final void d(InterfaceC2574qe0 interfaceC2574qe0) {
        C2993uu0 c2993uu0 = this.m;
        View view = c2993uu0.a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = c2993uu0.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        View view2 = c2993uu0.a;
        int paddingBottom = view2.getPaddingBottom() + view2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        int iA2 = c2993uu0.a(view2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            ((Wd0) interfaceC2574qe0).l(iA, iA2);
            return;
        }
        ArrayList arrayList = c2993uu0.b;
        if (!arrayList.contains(interfaceC2574qe0)) {
            arrayList.add(interfaceC2574qe0);
        }
        if (c2993uu0.c == null) {
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC0810Uh viewTreeObserverOnPreDrawListenerC0810Uh = new ViewTreeObserverOnPreDrawListenerC0810Uh(c2993uu0);
            c2993uu0.c = viewTreeObserverOnPreDrawListenerC0810Uh;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0810Uh);
        }
    }

    @Override // o.InterfaceC2872ti0
    public final InterfaceC2049l70 e() {
        Object tag = this.l.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC2049l70) {
            return (InterfaceC2049l70) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // o.InterfaceC2872ti0
    public final void f(InterfaceC2574qe0 interfaceC2574qe0) {
        this.m.b.remove(interfaceC2574qe0);
    }

    @Override // o.InterfaceC2872ti0
    public final void g(Drawable drawable) {
        l(null);
        this.n = null;
        ((ImageView) this.l).setImageDrawable(drawable);
    }

    @Override // o.InterfaceC2872ti0
    public final void h(Drawable drawable) {
        C2993uu0 c2993uu0 = this.m;
        ViewTreeObserver viewTreeObserver = c2993uu0.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c2993uu0.c);
        }
        c2993uu0.c = null;
        c2993uu0.b.clear();
        Animatable animatable = this.n;
        if (animatable != null) {
            animatable.stop();
        }
        l(null);
        this.n = null;
        ((ImageView) this.l).setImageDrawable(drawable);
    }

    @Override // o.InterfaceC2872ti0
    public final void i(Object obj) {
        l(obj);
        if (!(obj instanceof Animatable)) {
            this.n = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.n = animatable;
        animatable.start();
    }

    @Override // o.InterfaceC1088bK
    public final void j() {
        Animatable animatable = this.n;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final void l(Object obj) {
        switch (this.f449o) {
            case 0:
                ((ImageView) this.l).setImageBitmap((Bitmap) obj);
                break;
            default:
                ((ImageView) this.l).setImageDrawable((Drawable) obj);
                break;
        }
    }

    public final String toString() {
        return "Target for: " + this.l;
    }

    @Override // o.InterfaceC1088bK
    public final void k() {
    }
}
