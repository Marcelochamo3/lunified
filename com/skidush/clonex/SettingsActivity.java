package com.skidush.clonex;

import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import o.AbstractActivityC1540fx;
import o.AbstractC1459f50;
import o.AbstractC1474fG;
import o.AbstractC1894jf;
import o.C1123bj0;
import o.C3289xx;
import o.Cr0;
import o.F7;
import o.R1;
import o.Sr0;
import o.ViewOnClickListenerC3251xe;
import o.Wc0;

/* JADX INFO: loaded from: classes.dex */
public final class SettingsActivity extends AbstractActivityC1540fx {
    public static final /* synthetic */ int J = 0;
    public R1 I;

    @Override // o.AbstractActivityC1540fx, o.AbstractActivityC1116bg, o.AbstractActivityC1018ag, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Cr0 cr0 = Cr0.y;
        String strB = cr0.b();
        if (strB == null) {
            strB = "default";
        }
        setTheme(AbstractC1459f50.D(strB));
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_settings_mobile, (ViewGroup) null, false);
        int i = R.id.btn_settings_back;
        ImageButton imageButton = (ImageButton) Sr0.g(viewInflate, R.id.btn_settings_back);
        if (imageButton != null) {
            i = R.id.settings_content;
            FrameLayout frameLayout = (FrameLayout) Sr0.g(viewInflate, R.id.settings_content);
            if (frameLayout != null) {
                i = R.id.settings_header;
                LinearLayout linearLayout = (LinearLayout) Sr0.g(viewInflate, R.id.settings_header);
                if (linearLayout != null) {
                    i = R.id.settings_header_icon;
                    ImageView imageView = (ImageView) Sr0.g(viewInflate, R.id.settings_header_icon);
                    if (imageView != null) {
                        i = R.id.settings_header_icon_box;
                        FrameLayout frameLayout2 = (FrameLayout) Sr0.g(viewInflate, R.id.settings_header_icon_box);
                        if (frameLayout2 != null) {
                            LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                            TextView textView = (TextView) Sr0.g(viewInflate, R.id.tv_settings_subtitle);
                            if (textView != null) {
                                TextView textView2 = (TextView) Sr0.g(viewInflate, R.id.tv_settings_title);
                                if (textView2 != null) {
                                    this.I = new R1(linearLayout2, imageButton, frameLayout, linearLayout, imageView, frameLayout2, linearLayout2, textView, textView2);
                                    setContentView(linearLayout2);
                                    String strB2 = cr0.b();
                                    C1123bj0 c1123bj0F = AbstractC1459f50.F(strB2 != null ? strB2 : "default");
                                    Window window = getWindow();
                                    int i2 = c1123bj0F.b;
                                    window.setStatusBarColor(i2);
                                    getWindow().setNavigationBarColor(i2);
                                    R1 r1 = this.I;
                                    if (r1 == null) {
                                        AbstractC1474fG.U("binding");
                                        throw null;
                                    }
                                    r1.r.setBackgroundColor(c1123bj0F.a);
                                    R1 r2 = this.I;
                                    if (r2 == null) {
                                        AbstractC1474fG.U("binding");
                                        throw null;
                                    }
                                    GradientDrawable gradientDrawable = new GradientDrawable();
                                    gradientDrawable.setShape(0);
                                    gradientDrawable.setColor(i2);
                                    float f = getResources().getDisplayMetrics().density * 28.0f;
                                    gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f});
                                    r2.f479o.setBackground(gradientDrawable);
                                    R1 r3 = this.I;
                                    if (r3 == null) {
                                        AbstractC1474fG.U("binding");
                                        throw null;
                                    }
                                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                                    gradientDrawable2.setShape(0);
                                    gradientDrawable2.setCornerRadius(getResources().getDisplayMetrics().density * 16.0f);
                                    int i3 = c1123bj0F.c;
                                    gradientDrawable2.setColor(AbstractC1894jf.f(i3, 32));
                                    r3.q.setBackground(gradientDrawable2);
                                    R1 r4 = this.I;
                                    if (r4 == null) {
                                        AbstractC1474fG.U("binding");
                                        throw null;
                                    }
                                    r4.p.setImageTintList(ColorStateList.valueOf(i3));
                                    R1 r5 = this.I;
                                    if (r5 == null) {
                                        AbstractC1474fG.U("binding");
                                        throw null;
                                    }
                                    int i4 = c1123bj0F.e;
                                    r5.m.setImageTintList(ColorStateList.valueOf(i4));
                                    R1 r6 = this.I;
                                    if (r6 == null) {
                                        AbstractC1474fG.U("binding");
                                        throw null;
                                    }
                                    r6.t.setTextColor(i4);
                                    R1 r7 = this.I;
                                    if (r7 == null) {
                                        AbstractC1474fG.U("binding");
                                        throw null;
                                    }
                                    r7.s.setTextColor(c1123bj0F.f);
                                    R1 r8 = this.I;
                                    if (r8 == null) {
                                        AbstractC1474fG.U("binding");
                                        throw null;
                                    }
                                    r8.m.setOnClickListener(new ViewOnClickListenerC3251xe(23, this));
                                    if (bundle == null) {
                                        C3289xx c3289xxU = u();
                                        c3289xxU.getClass();
                                        F7 f7 = new F7(c3289xxU);
                                        R1 r9 = this.I;
                                        if (r9 == null) {
                                            AbstractC1474fG.U("binding");
                                            throw null;
                                        }
                                        f7.h(r9.n.getId(), new Wc0(), null);
                                        f7.e(false);
                                        return;
                                    }
                                    return;
                                }
                                i = R.id.tv_settings_title;
                            } else {
                                i = R.id.tv_settings_subtitle;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
