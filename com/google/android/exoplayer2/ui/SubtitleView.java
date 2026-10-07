package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.AbstractC3409z9;
import o.Bh0;
import o.C0467Hb;
import o.C0493Ib;
import o.C3065vi;
import o.C3162wi;
import o.InterfaceC3323yJ;
import o.Lr0;
import o.Rv0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class SubtitleView extends FrameLayout {
    public List l;
    public C0493Ib m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f38o;
    public float p;
    public boolean q;
    public boolean r;
    public int s;
    public Bh0 t;
    public View u;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = Collections.emptyList();
        this.m = C0493Ib.g;
        this.n = 0;
        this.f38o = 0.0533f;
        this.p = 0.08f;
        this.q = true;
        this.r = true;
        C0467Hb c0467Hb = new C0467Hb(context);
        this.t = c0467Hb;
        this.u = c0467Hb;
        addView(c0467Hb);
        this.s = 1;
    }

    private List<C3162wi> getCuesWithStylingPreferencesApplied() {
        if (this.q && this.r) {
            return this.l;
        }
        ArrayList arrayList = new ArrayList(this.l.size());
        for (int i = 0; i < this.l.size(); i++) {
            C3065vi c3065viA = ((C3162wi) this.l.get(i)).a();
            if (!this.q) {
                c3065viA.n = false;
                CharSequence charSequence = c3065viA.a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        c3065viA.a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = c3065viA.a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof InterfaceC3323yJ)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                AbstractC3409z9.A(c3065viA);
            } else if (!this.r) {
                AbstractC3409z9.A(c3065viA);
            }
            arrayList.add(c3065viA.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (Lr0.a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C0493Ib getUserCaptionStyle() {
        CaptioningManager captioningManager;
        C0493Ib c0493Ib;
        int i = Lr0.a;
        C0493Ib c0493Ib2 = C0493Ib.g;
        if (i < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return c0493Ib2;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (i >= 21) {
            c0493Ib = new C0493Ib(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        } else {
            c0493Ib = new C0493Ib(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
        }
        return c0493Ib;
    }

    private <T extends View & Bh0> void setView(T t) {
        removeView(this.u);
        View view = this.u;
        if (view instanceof Rv0) {
            ((Rv0) view).m.destroy();
        }
        this.u = t;
        this.t = t;
        addView(t);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.t.a(getCuesWithStylingPreferencesApplied(), this.m, this.f38o, this.n, this.p);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.r = z;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.q = z;
        c();
    }

    public void setBottomPaddingFraction(float f) {
        this.p = f;
        c();
    }

    public void setCues(List<C3162wi> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.l = list;
        c();
    }

    public void setFractionalTextSize(float f) {
        this.n = 0;
        this.f38o = f;
        c();
    }

    public void setStyle(C0493Ib c0493Ib) {
        this.m = c0493Ib;
        c();
    }

    public void setViewType(int i) {
        if (this.s == i) {
            return;
        }
        if (i == 1) {
            setView(new C0467Hb(getContext()));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            setView(new Rv0(getContext()));
        }
        this.s = i;
    }
}
