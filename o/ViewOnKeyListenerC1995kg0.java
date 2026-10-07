package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.kg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC1995kg0 extends AbstractC1874jQ implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public ViewTreeObserver A;
    public boolean B;
    public boolean C;
    public int D;
    public int E = 0;
    public boolean F;
    public final Context m;
    public final ZP n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final WP f870o;
    public final boolean p;
    public final int q;
    public final int r;
    public final int s;
    public final C2458pQ t;
    public final ViewTreeObserverOnGlobalLayoutListenerC3399z4 u;
    public final ViewOnAttachStateChangeListenerC0674Pb v;
    public PopupWindow.OnDismissListener w;
    public View x;
    public View y;
    public InterfaceC2555qQ z;

    public ViewOnKeyListenerC1995kg0(int i, int i2, Context context, View view, ZP zp, boolean z) {
        int i3 = 3;
        this.u = new ViewTreeObserverOnGlobalLayoutListenerC3399z4(i3, this);
        this.v = new ViewOnAttachStateChangeListenerC0674Pb(i3, this);
        this.m = context;
        this.n = zp;
        this.p = z;
        this.f870o = new WP(zp, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.r = i;
        this.s = i2;
        Resources resources = context.getResources();
        this.q = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.x = view;
        this.t = new C2458pQ(context, null, i, i2);
        zp.b(this, context);
    }

    @Override // o.InterfaceC2651rQ
    public final void a(ZP zp, boolean z) {
        if (zp != this.n) {
            return;
        }
        dismiss();
        InterfaceC2555qQ interfaceC2555qQ = this.z;
        if (interfaceC2555qQ != null) {
            interfaceC2555qQ.a(zp, z);
        }
    }

    @Override // o.Id0
    public final boolean b() {
        return !this.B && this.t.K.isShowing();
    }

    @Override // o.InterfaceC2651rQ
    public final void d(boolean z) {
        this.C = false;
        WP wp = this.f870o;
        if (wp != null) {
            wp.notifyDataSetChanged();
        }
    }

    @Override // o.Id0
    public final void dismiss() {
        if (b()) {
            this.t.dismiss();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.Id0
    public final void e() {
        View view;
        if (b()) {
            return;
        }
        if (this.B || (view = this.x) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.y = view;
        C2458pQ c2458pQ = this.t;
        c2458pQ.K.setOnDismissListener(this);
        c2458pQ.A = this;
        c2458pQ.J = true;
        c2458pQ.K.setFocusable(true);
        View view2 = this.y;
        boolean z = this.A == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.A = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.u);
        }
        view2.addOnAttachStateChangeListener(this.v);
        c2458pQ.z = view2;
        c2458pQ.w = this.E;
        boolean z2 = this.C;
        Context context = this.m;
        WP wp = this.f870o;
        if (!z2) {
            this.D = AbstractC1874jQ.p(wp, context, this.q);
            this.C = true;
        }
        c2458pQ.r(this.D);
        c2458pQ.K.setInputMethodMode(2);
        Rect rect = this.l;
        c2458pQ.I = rect != null ? new Rect(rect) : null;
        c2458pQ.e();
        C0687Po c0687Po = c2458pQ.n;
        c0687Po.setOnKeyListener(this);
        if (this.F) {
            ZP zp = this.n;
            if (zp.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0687Po, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(zp.m);
                }
                frameLayout.setEnabled(false);
                c0687Po.addHeaderView(frameLayout, null, false);
            }
        }
        c2458pQ.q(wp);
        c2458pQ.e();
    }

    @Override // o.InterfaceC2651rQ
    public final void g(InterfaceC2555qQ interfaceC2555qQ) {
        this.z = interfaceC2555qQ;
    }

    @Override // o.Id0
    public final C0687Po h() {
        return this.t.n;
    }

    @Override // o.InterfaceC2651rQ
    public final boolean k() {
        return false;
    }

    @Override // o.InterfaceC2651rQ
    public final Parcelable l() {
        return null;
    }

    @Override // o.InterfaceC2651rQ
    public final boolean m(SubMenuC2483ph0 subMenuC2483ph0) {
        if (subMenuC2483ph0.hasVisibleItems()) {
            View view = this.y;
            C2070lQ c2070lQ = new C2070lQ(this.r, this.s, this.m, view, subMenuC2483ph0, this.p);
            InterfaceC2555qQ interfaceC2555qQ = this.z;
            c2070lQ.i = interfaceC2555qQ;
            AbstractC1874jQ abstractC1874jQ = c2070lQ.j;
            if (abstractC1874jQ != null) {
                abstractC1874jQ.g(interfaceC2555qQ);
            }
            boolean zX = AbstractC1874jQ.x(subMenuC2483ph0);
            c2070lQ.h = zX;
            AbstractC1874jQ abstractC1874jQ2 = c2070lQ.j;
            if (abstractC1874jQ2 != null) {
                abstractC1874jQ2.r(zX);
            }
            c2070lQ.k = this.w;
            this.w = null;
            this.n.c(false);
            C2458pQ c2458pQ = this.t;
            int width = c2458pQ.q;
            int iO = c2458pQ.o();
            if ((Gravity.getAbsoluteGravity(this.E, this.x.getLayoutDirection()) & 7) == 5) {
                width += this.x.getWidth();
            }
            if (!c2070lQ.b()) {
                if (c2070lQ.f != null) {
                    c2070lQ.d(width, iO, true, true);
                }
            }
            InterfaceC2555qQ interfaceC2555qQ2 = this.z;
            if (interfaceC2555qQ2 != null) {
                interfaceC2555qQ2.u(subMenuC2483ph0);
            }
            return true;
        }
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.B = true;
        this.n.c(true);
        ViewTreeObserver viewTreeObserver = this.A;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.A = this.y.getViewTreeObserver();
            }
            this.A.removeGlobalOnLayoutListener(this.u);
            this.A = null;
        }
        this.y.removeOnAttachStateChangeListener(this.v);
        PopupWindow.OnDismissListener onDismissListener = this.w;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // o.AbstractC1874jQ
    public final void q(View view) {
        this.x = view;
    }

    @Override // o.AbstractC1874jQ
    public final void r(boolean z) {
        this.f870o.c = z;
    }

    @Override // o.AbstractC1874jQ
    public final void s(int i) {
        this.E = i;
    }

    @Override // o.AbstractC1874jQ
    public final void t(int i) {
        this.t.q = i;
    }

    @Override // o.AbstractC1874jQ
    public final void u(PopupWindow.OnDismissListener onDismissListener) {
        this.w = onDismissListener;
    }

    @Override // o.AbstractC1874jQ
    public final void v(boolean z) {
        this.F = z;
    }

    @Override // o.AbstractC1874jQ
    public final void w(int i) {
        this.t.k(i);
    }

    @Override // o.InterfaceC2651rQ
    public final void c(Parcelable parcelable) {
    }

    @Override // o.AbstractC1874jQ
    public final void o(ZP zp) {
    }
}
