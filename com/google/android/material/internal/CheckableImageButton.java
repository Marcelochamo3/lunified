package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import o.C1598gd;
import o.C1672hI;
import o.C2236n4;
import o.C2633r9;
import o.It0;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends C2236n4 implements Checkable {
    public static final int[] r = {R.attr.state_checked};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f43o;
    public boolean p;
    public boolean q;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.skidush.clonex.R.attr.imageButtonStyle);
        this.p = true;
        this.q = true;
        It0.p(this, new C2633r9(1, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f43o;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f43o ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), r) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1598gd)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1598gd c1598gd = (C1598gd) parcelable;
        super.onRestoreInstanceState(c1598gd.l);
        setChecked(c1598gd.n);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1598gd c1598gd = new C1598gd(super.onSaveInstanceState());
        c1598gd.n = this.f43o;
        return c1598gd;
    }

    public void setCheckable(boolean z) {
        if (this.p != z) {
            this.p = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.p || this.f43o == z) {
            return;
        }
        this.f43o = z;
        refreshDrawableState();
        sendAccessibilityEvent(C1672hI.a.g);
    }

    public void setPressable(boolean z) {
        this.q = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.q) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f43o);
    }
}
