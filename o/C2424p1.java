package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.skidush.clonex.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2424p1 implements InterfaceC2651rQ {
    public int A;
    public int B;
    public boolean C;
    public C1744i1 E;
    public C1744i1 F;
    public RunnableC1938k1 G;
    public C1840j1 H;
    public int J;
    public final Context l;
    public Context m;
    public ZP n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LayoutInflater f961o;
    public InterfaceC2555qQ p;
    public InterfaceC2845tQ s;
    public int t;
    public C2036l1 u;
    public Drawable v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;
    public final int q = R.layout.abc_action_menu_layout;
    public final int r = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray D = new SparseBooleanArray();
    public final C2133m1 I = new C2133m1(0, this);

    public C2424p1(Context context) {
        this.l = context;
        this.f961o = LayoutInflater.from(context);
    }

    @Override // o.InterfaceC2651rQ
    public final void a(ZP zp, boolean z) {
        e();
        C1744i1 c1744i1 = this.F;
        if (c1744i1 != null && c1744i1.b()) {
            c1744i1.j.dismiss();
        }
        InterfaceC2555qQ interfaceC2555qQ = this.p;
        if (interfaceC2555qQ != null) {
            interfaceC2555qQ.a(zp, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View b(C1386eQ c1386eQ, View view, ViewGroup viewGroup) {
        InterfaceC2748sQ interfaceC2748sQ;
        View actionView = c1386eQ.getActionView();
        if (actionView == null || c1386eQ.e()) {
            if (view instanceof InterfaceC2748sQ) {
                interfaceC2748sQ = (InterfaceC2748sQ) view;
            } else {
                interfaceC2748sQ = (InterfaceC2748sQ) this.f961o.inflate(this.r, viewGroup, false);
            }
            interfaceC2748sQ.a(c1386eQ);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC2748sQ;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.s);
            if (this.H == null) {
                this.H = new C1840j1(this);
            }
            actionMenuItemView.setPopupCallback(this.H);
            actionView = (View) interfaceC2748sQ;
        }
        actionView.setVisibility(c1386eQ.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C2617r1)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // o.InterfaceC2651rQ
    public final void c(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof C2327o1) && (i = ((C2327o1) parcelable).l) > 0 && (menuItemFindItem = this.n.findItem(i)) != null) {
            m((SubMenuC2483ph0) menuItemFindItem.getSubMenu());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC2651rQ
    public final void d(boolean z) {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.s;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            ZP zp = this.n;
            if (zp != null) {
                zp.i();
                ArrayList arrayListL = this.n.l();
                int size = arrayListL.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C1386eQ c1386eQ = (C1386eQ) arrayListL.get(i2);
                    if (c1386eQ.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        C1386eQ itemData = childAt instanceof InterfaceC2748sQ ? ((InterfaceC2748sQ) childAt).getItemData() : null;
                        View viewB = b(c1386eQ, childAt, viewGroup);
                        if (c1386eQ != itemData) {
                            viewB.setPressed(false);
                            viewB.jumpDrawablesToCurrentState();
                        }
                        if (viewB != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewB.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewB);
                            }
                            ((ViewGroup) this.s).addView(viewB, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.u) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.s).requestLayout();
        ZP zp2 = this.n;
        if (zp2 != null) {
            zp2.i();
            ArrayList arrayList2 = zp2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC1484fQ actionProviderVisibilityListenerC1484fQ = ((C1386eQ) arrayList2.get(i3)).A;
            }
        }
        ZP zp3 = this.n;
        if (zp3 != null) {
            zp3.i();
            arrayList = zp3.j;
        }
        if (this.x && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C1386eQ) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.u == null) {
                this.u = new C2036l1(this, this.l);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.u.getParent();
            if (viewGroup3 != this.s) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.u);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.s;
                C2036l1 c2036l1 = this.u;
                actionMenuView.getClass();
                C2617r1 c2617r1J = ActionMenuView.j();
                c2617r1J.a = true;
                actionMenuView.addView(c2036l1, c2617r1J);
            }
        } else {
            C2036l1 c2036l2 = this.u;
            if (c2036l2 != null) {
                Object parent = c2036l2.getParent();
                Object obj = this.s;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.u);
                }
            }
        }
        ((ActionMenuView) this.s).setOverflowReserved(this.x);
    }

    public final boolean e() {
        Object obj;
        RunnableC1938k1 runnableC1938k1 = this.G;
        if (runnableC1938k1 != null && (obj = this.s) != null) {
            ((View) obj).removeCallbacks(runnableC1938k1);
            this.G = null;
            return true;
        }
        C1744i1 c1744i1 = this.E;
        if (c1744i1 == null) {
            return false;
        }
        if (c1744i1.b()) {
            c1744i1.j.dismiss();
        }
        return true;
    }

    @Override // o.InterfaceC2651rQ
    public final boolean f(C1386eQ c1386eQ) {
        return false;
    }

    @Override // o.InterfaceC2651rQ
    public final void g(InterfaceC2555qQ interfaceC2555qQ) {
        this.p = interfaceC2555qQ;
    }

    public final boolean h() {
        C1744i1 c1744i1 = this.E;
        return c1744i1 != null && c1744i1.b();
    }

    @Override // o.InterfaceC2651rQ
    public final int i() {
        return this.t;
    }

    @Override // o.InterfaceC2651rQ
    public final void j(Context context, ZP zp) {
        this.m = context;
        LayoutInflater.from(context);
        this.n = zp;
        Resources resources = context.getResources();
        if (!this.y) {
            this.x = true;
        }
        int i = 2;
        this.z = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.B = i;
        int measuredWidth = this.z;
        if (this.x) {
            if (this.u == null) {
                C2036l1 c2036l1 = new C2036l1(this, this.l);
                this.u = c2036l1;
                if (this.w) {
                    c2036l1.setImageDrawable(this.v);
                    this.v = null;
                    this.w = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.u.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.u.getMeasuredWidth();
        } else {
            this.u = null;
        }
        this.A = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // o.InterfaceC2651rQ
    public final boolean k() {
        ArrayList arrayListL;
        int size;
        int i;
        boolean z;
        ZP zp = this.n;
        if (zp != null) {
            arrayListL = zp.l();
            size = arrayListL.size();
        } else {
            arrayListL = null;
            size = 0;
        }
        int i2 = this.B;
        int i3 = this.A;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.s;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            C1386eQ c1386eQ = (C1386eQ) arrayListL.get(i4);
            int i7 = c1386eQ.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (this.C && c1386eQ.C) {
                i2 = 0;
            }
            i4++;
        }
        if (this.x && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.D;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            C1386eQ c1386eQ2 = (C1386eQ) arrayListL.get(i9);
            int i11 = c1386eQ2.y;
            boolean z3 = (i11 & 2) == i;
            int i12 = c1386eQ2.b;
            if (z3) {
                View viewB = b(c1386eQ2, null, viewGroup);
                viewB.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewB.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                c1386eQ2.h(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = (i8 > 0 || z4) && i3 > 0;
                    if (z5) {
                        View viewB2 = b(c1386eQ2, null, viewGroup);
                        viewB2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewB2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            C1386eQ c1386eQ3 = (C1386eQ) arrayListL.get(i13);
                            if (c1386eQ3.b == i12) {
                                if (c1386eQ3.f()) {
                                    i8++;
                                }
                                c1386eQ3.h(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    c1386eQ2.h(z5);
                } else {
                    c1386eQ2.h(false);
                }
                i9++;
                i = 2;
                z = true;
            }
            i9++;
            i = 2;
            z = true;
        }
        return true;
    }

    @Override // o.InterfaceC2651rQ
    public final Parcelable l() {
        C2327o1 c2327o1 = new C2327o1();
        c2327o1.l = this.J;
        return c2327o1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC2651rQ
    public final boolean m(SubMenuC2483ph0 subMenuC2483ph0) {
        boolean z;
        if (!subMenuC2483ph0.hasVisibleItems()) {
            return false;
        }
        SubMenuC2483ph0 subMenuC2483ph1 = subMenuC2483ph0;
        while (true) {
            ZP zp = subMenuC2483ph1.z;
            if (zp == this.n) {
                break;
            }
            subMenuC2483ph1 = (SubMenuC2483ph0) zp;
        }
        ViewGroup viewGroup = (ViewGroup) this.s;
        View view = null;
        view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof InterfaceC2748sQ) && ((InterfaceC2748sQ) childAt).getItemData() == subMenuC2483ph1.A) {
                    view = childAt;
                    break;
                }
            }
        }
        if (view == null) {
            return false;
        }
        this.J = subMenuC2483ph0.A.a;
        int size = subMenuC2483ph0.f.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = false;
                break;
            }
            MenuItem item = subMenuC2483ph0.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        C1744i1 c1744i1 = new C1744i1(this, this.m, subMenuC2483ph0, view);
        this.F = c1744i1;
        c1744i1.h = z;
        AbstractC1874jQ abstractC1874jQ = c1744i1.j;
        if (abstractC1874jQ != null) {
            abstractC1874jQ.r(z);
        }
        C1744i1 c1744i2 = this.F;
        if (!c1744i2.b()) {
            if (c1744i2.f == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c1744i2.d(0, 0, false, false);
        }
        InterfaceC2555qQ interfaceC2555qQ = this.p;
        if (interfaceC2555qQ != null) {
            interfaceC2555qQ.u(subMenuC2483ph0);
        }
        return true;
    }

    @Override // o.InterfaceC2651rQ
    public final boolean n(C1386eQ c1386eQ) {
        return false;
    }

    public final boolean o() {
        ZP zp;
        if (!this.x || h() || (zp = this.n) == null || this.s == null || this.G != null) {
            return false;
        }
        zp.i();
        if (zp.j.isEmpty()) {
            return false;
        }
        RunnableC1938k1 runnableC1938k1 = new RunnableC1938k1(this, 0, new C1744i1(this, this.m, this.n, this.u));
        this.G = runnableC1938k1;
        ((View) this.s).post(runnableC1938k1);
        return true;
    }
}
