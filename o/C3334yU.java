package o;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.skidush.navigation.widget.NavigationSlideView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: o.yU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3334yU extends LinearLayout implements InterfaceC2845tQ {
    public NavigationSlideView l;
    public final ArrayList m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1134o;
    public C3431zU p;
    public ZP q;
    public final FrameLayout.LayoutParams r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3334yU(Context context) {
        super(context);
        AbstractC1474fG.j(context, "context");
        this.m = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.r = layoutParams;
        setOrientation(1);
        setLayoutParams(layoutParams);
    }

    public final void a() {
        removeAllViews();
        ArrayList arrayList = this.m;
        arrayList.clear();
        ZP zp = this.q;
        if (zp == null) {
            AbstractC1474fG.U("menu");
            throw null;
        }
        int size = zp.f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = zp.getItem(i);
            getPresenter().m = true;
            item.setCheckable(true);
            getPresenter().m = false;
            Context context = getContext();
            AbstractC1474fG.i(context, "getContext(...)");
            C3140wU c3140wU = new C3140wU(context);
            arrayList.add(c3140wU);
            c3140wU.setFocusable(true);
            c3140wU.setFocusableInTouchMode(true);
            c3140wU.a((C1386eQ) item);
            c3140wU.setItemPosition(i);
            addView(c3140wU);
        }
        getNavigationSlideView().a();
        ZP zp2 = this.q;
        if (zp2 == null) {
            AbstractC1474fG.U("menu");
            throw null;
        }
        int iMin = Math.min(zp2.f.size() - 1, this.f1134o);
        this.f1134o = iMin;
        ZP zp3 = this.q;
        if (zp3 == null) {
            AbstractC1474fG.U("menu");
            throw null;
        }
        zp3.getItem(iMin).setChecked(true);
    }

    @Override // o.InterfaceC2845tQ
    public final void b(ZP zp) {
        AbstractC1474fG.j(zp, "menu");
        this.q = zp;
    }

    public final int getMenuGravity() {
        return this.r.gravity;
    }

    public final int getMenuSpacing() {
        return getDividerDrawable().getIntrinsicHeight();
    }

    public final NavigationSlideView getNavigationSlideView() {
        NavigationSlideView navigationSlideView = this.l;
        if (navigationSlideView != null) {
            return navigationSlideView;
        }
        AbstractC1474fG.U("navigationSlideView");
        throw null;
    }

    public final C3431zU getPresenter() {
        C3431zU c3431zU = this.p;
        if (c3431zU != null) {
            return c3431zU;
        }
        AbstractC1474fG.U("presenter");
        throw null;
    }

    public final int getSelectedItemId() {
        return this.n;
    }

    public final int getSelectedItemPosition() {
        return this.f1134o;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        ArrayList arrayList = this.m;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((C3140wU) it.next()).hasFocus()) {
                return true;
            }
        }
        return false;
    }

    public final void setMenuGravity(int i) {
        FrameLayout.LayoutParams layoutParams = this.r;
        if (layoutParams.gravity != i) {
            layoutParams.gravity = i;
            setLayoutParams(layoutParams);
        }
    }

    public final void setMenuSpacing(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setAlpha(0);
        shapeDrawable.setIntrinsicHeight(i);
        setDividerDrawable(shapeDrawable);
        setShowDividers(2);
    }

    public final void setNavigationSlideView(NavigationSlideView navigationSlideView) {
        AbstractC1474fG.j(navigationSlideView, "<set-?>");
        this.l = navigationSlideView;
    }

    public final void setPresenter(C3431zU c3431zU) {
        AbstractC1474fG.j(c3431zU, "<set-?>");
        this.p = c3431zU;
    }

    public final void setSelectedItemId(int i) {
        this.n = i;
    }

    public final void setSelectedItemPosition(int i) {
        this.f1134o = i;
    }
}
