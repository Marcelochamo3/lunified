package o;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogC1652h4 extends DialogC1213cg implements H3 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LayoutInflaterFactory2C1456f4 f808o;
    public final C1554g4 p;

    /* JADX WARN: Type inference failed for: r2v2, types: [o.g4] */
    public AbstractDialogC1652h4(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.p = new InterfaceC2740sI() { // from class: o.g4
            @Override // o.InterfaceC2740sI
            public final boolean b(KeyEvent keyEvent) {
                return this.l.h(keyEvent);
            }
        };
        R3 r3E = e();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C1456f4) r3E).f0 = i;
        r3E.b();
    }

    @Override // o.DialogC1213cg, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = (LayoutInflaterFactory2C1456f4) e();
        layoutInflaterFactory2C1456f4.s();
        ((ViewGroup) layoutInflaterFactory2C1456f4.M.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C1456f4.x.a(layoutInflaterFactory2C1456f4.w.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        e().c();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC2506pt.m(this.p, getWindow().getDecorView(), this, keyEvent);
    }

    public final R3 e() {
        if (this.f808o == null) {
            P3 p3 = R3.l;
            this.f808o = new LayoutInflaterFactory2C1456f4(getContext(), getWindow(), this, this);
        }
        return this.f808o;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = (LayoutInflaterFactory2C1456f4) e();
        layoutInflaterFactory2C1456f4.s();
        return layoutInflaterFactory2C1456f4.w.findViewById(i);
    }

    public final void g() {
        zy0.C(getWindow().getDecorView(), this);
        AbstractC3021v9.B(getWindow().getDecorView(), this);
        UK.Q(getWindow().getDecorView(), this);
    }

    public final boolean h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = (LayoutInflaterFactory2C1456f4) e();
        if (layoutInflaterFactory2C1456f4.z != null) {
            layoutInflaterFactory2C1456f4.y();
            layoutInflaterFactory2C1456f4.z.getClass();
            layoutInflaterFactory2C1456f4.z(0);
        }
    }

    @Override // o.DialogC1213cg, android.app.Dialog
    public void onCreate(Bundle bundle) {
        LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = (LayoutInflaterFactory2C1456f4) e();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(layoutInflaterFactory2C1456f4.v);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(layoutInflaterFactory2C1456f4);
        } else {
            boolean z = layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C1456f4;
        }
        super.onCreate(bundle);
        e().b();
    }

    @Override // o.DialogC1213cg, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = (LayoutInflaterFactory2C1456f4) e();
        layoutInflaterFactory2C1456f4.y();
        C2416ow0 c2416ow0 = layoutInflaterFactory2C1456f4.z;
        if (c2416ow0 != null) {
            c2416ow0.w = false;
            C2606qu0 c2606qu0 = c2416ow0.v;
            if (c2606qu0 != null) {
                c2606qu0.a();
            }
        }
    }

    @Override // o.DialogC1213cg, android.app.Dialog
    public void setContentView(int i) {
        g();
        e().f(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().i(charSequence);
    }

    @Override // o.DialogC1213cg, android.app.Dialog
    public void setContentView(View view) {
        g();
        e().g(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        e().i(getContext().getString(i));
    }

    @Override // o.DialogC1213cg, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        e().h(view, layoutParams);
    }
}
