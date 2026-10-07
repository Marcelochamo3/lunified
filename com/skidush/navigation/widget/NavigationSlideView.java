package com.skidush.navigation.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.skidush.navigation.widget.NavigationSlideHeaderView;
import com.skidush.navigation.widget.NavigationSlideView;
import o.AbstractC1474fG;
import o.C0334By;
import o.C1386eQ;
import o.C3140wU;
import o.C3237xU;
import o.C3334yU;
import o.C3431zU;
import o.InterfaceC0360Cy;
import o.InterfaceC0412Ey;
import o.J40;
import o.Kh0;
import o.ViewOnClickListenerC1010ac;

/* JADX INFO: loaded from: classes.dex */
public final class NavigationSlideView extends FrameLayout {
    public static final /* synthetic */ int s = 0;
    public final C3237xU l;
    public NavigationSlideHeaderView m;
    public final C3334yU n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C3431zU f49o;
    public boolean p;
    public InterfaceC0412Ey q;
    public InterfaceC0412Ey r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationSlideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC1474fG.j(context, "context");
        C3237xU c3237xU = new C3237xU(context);
        this.l = c3237xU;
        C3334yU c3334yU = new C3334yU(context);
        c3334yU.setNavigationSlideView(this);
        this.n = c3334yU;
        C3431zU c3431zU = new C3431zU();
        this.f49o = c3431zU;
        Kh0 kh0 = new Kh0(context);
        this.p = true;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, J40.a, 0, 0);
        AbstractC1474fG.i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        c3431zU.l = c3334yU;
        c3334yU.setPresenter(c3431zU);
        c3237xU.b(c3431zU, c3237xU.a);
        Context context2 = getContext();
        AbstractC1474fG.i(context2, "getContext(...)");
        c3431zU.j(context2, c3237xU);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
            if (viewInflate instanceof NavigationSlideHeaderView) {
                NavigationSlideHeaderView navigationSlideHeaderView = (NavigationSlideHeaderView) viewInflate;
                AbstractC1474fG.j(navigationSlideHeaderView, "headerView");
                View view = this.m;
                if (view != null) {
                    removeView(view);
                    this.m = null;
                }
                this.m = navigationSlideHeaderView;
                addView(navigationSlideHeaderView, 0);
            }
        }
        setMenuGravity(typedArrayObtainStyledAttributes.getInt(2, 8388659));
        setMenuSpacing(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0));
        if (!typedArrayObtainStyledAttributes.hasValue(1)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        c3431zU.m = true;
        kh0.inflate(resourceId2, c3237xU);
        c3431zU.m = false;
        c3431zU.d(true);
        typedArrayObtainStyledAttributes.recycle();
        addView(c3334yU);
        c3237xU.e = new C0334By(20, this);
    }

    private final int getMenuGravity() {
        return this.n.getMenuGravity();
    }

    private final int getMenuSpacing() {
        return this.n.getMenuSpacing();
    }

    private final void setMenuGravity(int i) {
        this.n.setMenuGravity(i);
    }

    private final void setMenuSpacing(int i) {
        this.n.setMenuSpacing(i);
    }

    public final void a() {
        NavigationSlideHeaderView navigationSlideHeaderView = this.m;
        if (navigationSlideHeaderView != null) {
            final int i = 0;
            navigationSlideHeaderView.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: o.AU
                public final /* synthetic */ NavigationSlideView b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    NavigationSlideView navigationSlideView = this.b;
                    switch (i) {
                        case 0:
                            int i2 = NavigationSlideView.s;
                            AbstractC1474fG.j(navigationSlideView, "this$0");
                            NavigationSlideHeaderView navigationSlideHeaderView2 = navigationSlideView.m;
                            if ((navigationSlideHeaderView2 != null && navigationSlideHeaderView2.hasFocus()) || navigationSlideView.n.hasFocus()) {
                                navigationSlideView.c();
                            } else {
                                navigationSlideView.b();
                            }
                            break;
                        default:
                            AbstractC1474fG.j(navigationSlideView, "this$0");
                            NavigationSlideHeaderView headerView = navigationSlideView.getHeaderView();
                            if ((headerView != null && headerView.hasFocus()) || navigationSlideView.getMenuView().hasFocus()) {
                                navigationSlideView.c();
                            } else {
                                navigationSlideView.b();
                            }
                            break;
                    }
                }
            });
        }
        C3334yU c3334yU = this.n;
        c3334yU.getClass();
        for (C3140wU c3140wU : c3334yU.m) {
            C1386eQ itemData = c3140wU.getItemData();
            AbstractC1474fG.j(itemData, "item");
            final int i2 = 1;
            c3140wU.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: o.AU
                public final /* synthetic */ NavigationSlideView b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    NavigationSlideView navigationSlideView = this.b;
                    switch (i2) {
                        case 0:
                            int i3 = NavigationSlideView.s;
                            AbstractC1474fG.j(navigationSlideView, "this$0");
                            NavigationSlideHeaderView navigationSlideHeaderView2 = navigationSlideView.m;
                            if ((navigationSlideHeaderView2 != null && navigationSlideHeaderView2.hasFocus()) || navigationSlideView.n.hasFocus()) {
                                navigationSlideView.c();
                            } else {
                                navigationSlideView.b();
                            }
                            break;
                        default:
                            AbstractC1474fG.j(navigationSlideView, "this$0");
                            NavigationSlideHeaderView headerView = navigationSlideView.getHeaderView();
                            if ((headerView != null && headerView.hasFocus()) || navigationSlideView.getMenuView().hasFocus()) {
                                navigationSlideView.c();
                            } else {
                                navigationSlideView.b();
                            }
                            break;
                    }
                }
            });
            c3140wU.setOnClickListener(new ViewOnClickListenerC1010ac(this, 3, itemData));
        }
        if (this.p) {
            c();
        } else {
            b();
        }
    }

    public final void b() {
        this.p = false;
        NavigationSlideHeaderView navigationSlideHeaderView = this.m;
        if (navigationSlideHeaderView != null) {
            navigationSlideHeaderView.setFocusable(false);
            navigationSlideHeaderView.setFocusableInTouchMode(false);
            InterfaceC0360Cy interfaceC0360Cy = navigationSlideHeaderView.E;
            if (interfaceC0360Cy != null) {
                interfaceC0360Cy.c();
            }
        }
        for (C3140wU c3140wU : this.n.m) {
            c3140wU.setFocusable(c3140wU.isSelected());
            c3140wU.setFocusableInTouchMode(c3140wU.isSelected());
            c3140wU.m.setVisibility(8);
        }
    }

    public final void c() {
        this.p = true;
        NavigationSlideHeaderView navigationSlideHeaderView = this.m;
        if (navigationSlideHeaderView != null) {
            navigationSlideHeaderView.setFocusable(true);
            navigationSlideHeaderView.setFocusableInTouchMode(true);
            InterfaceC0360Cy interfaceC0360Cy = navigationSlideHeaderView.D;
            if (interfaceC0360Cy != null) {
                interfaceC0360Cy.c();
            }
        }
        for (C3140wU c3140wU : this.n.m) {
            c3140wU.setFocusable(true);
            c3140wU.setFocusableInTouchMode(true);
            c3140wU.m.setVisibility(0);
        }
    }

    public final NavigationSlideHeaderView getHeaderView() {
        return this.m;
    }

    public final C3237xU getMenu() {
        return this.l;
    }

    public final C3334yU getMenuView() {
        return this.n;
    }

    public final int getSelectedItemId() {
        return this.n.getSelectedItemId();
    }

    public final void setHeaderView(NavigationSlideHeaderView navigationSlideHeaderView) {
        this.m = navigationSlideHeaderView;
    }

    public final void setOnItemReselectedListener(InterfaceC0412Ey interfaceC0412Ey) {
        AbstractC1474fG.j(interfaceC0412Ey, "onNavigationItemReselected");
        this.r = interfaceC0412Ey;
    }

    public final void setOnItemSelectedListener(InterfaceC0412Ey interfaceC0412Ey) {
        AbstractC1474fG.j(interfaceC0412Ey, "onNavigationItemSelected");
        this.q = interfaceC0412Ey;
    }

    public final void setOpen(boolean z) {
        this.p = z;
    }

    public final void setSelectedItemId(int i) {
        C3237xU c3237xU = this.l;
        MenuItem menuItemFindItem = c3237xU.findItem(i);
        if (menuItemFindItem == null || c3237xU.q(menuItemFindItem, this.f49o, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }
}
