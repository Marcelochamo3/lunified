package o;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.skidush.clonex.R;
import com.skidush.clonex.activities.main.MainMobileActivity;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class YQ extends DialogC2924u9 {
    public final InterfaceC0360Cy B;
    public final InterfaceC0360Cy C;
    public final InterfaceC0360Cy D;
    public final InterfaceC0360Cy E;
    public final InterfaceC0360Cy F;
    public final C0478Hm G;
    public final C1123bj0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YQ(MainMobileActivity mainMobileActivity, NM nm, NM nm2, NM nm3, OM om, OM om2) {
        super(mainMobileActivity);
        int i = 2;
        this.B = nm;
        this.C = nm2;
        this.D = nm3;
        this.E = om;
        this.F = om2;
        View viewInflate = getLayoutInflater().inflate(R.layout.dialog_more_options_mobile, (ViewGroup) null, false);
        int i2 = R.id.arrow_more_events;
        ImageView imageView = (ImageView) Sr0.g(viewInflate, R.id.arrow_more_events);
        if (imageView != null) {
            i2 = R.id.arrow_more_favorites;
            ImageView imageView2 = (ImageView) Sr0.g(viewInflate, R.id.arrow_more_favorites);
            if (imageView2 != null) {
                i2 = R.id.arrow_more_history;
                ImageView imageView3 = (ImageView) Sr0.g(viewInflate, R.id.arrow_more_history);
                if (imageView3 != null) {
                    i2 = R.id.arrow_more_logout;
                    ImageView imageView4 = (ImageView) Sr0.g(viewInflate, R.id.arrow_more_logout);
                    if (imageView4 != null) {
                        i2 = R.id.arrow_more_settings;
                        ImageView imageView5 = (ImageView) Sr0.g(viewInflate, R.id.arrow_more_settings);
                        if (imageView5 != null) {
                            i2 = R.id.icon_box_events;
                            FrameLayout frameLayout = (FrameLayout) Sr0.g(viewInflate, R.id.icon_box_events);
                            if (frameLayout != null) {
                                i2 = R.id.icon_box_favorites;
                                FrameLayout frameLayout2 = (FrameLayout) Sr0.g(viewInflate, R.id.icon_box_favorites);
                                if (frameLayout2 != null) {
                                    i2 = R.id.icon_box_history;
                                    FrameLayout frameLayout3 = (FrameLayout) Sr0.g(viewInflate, R.id.icon_box_history);
                                    if (frameLayout3 != null) {
                                        i2 = R.id.icon_box_logout;
                                        FrameLayout frameLayout4 = (FrameLayout) Sr0.g(viewInflate, R.id.icon_box_logout);
                                        if (frameLayout4 != null) {
                                            i2 = R.id.icon_box_settings;
                                            FrameLayout frameLayout5 = (FrameLayout) Sr0.g(viewInflate, R.id.icon_box_settings);
                                            if (frameLayout5 != null) {
                                                i2 = R.id.icon_more_events;
                                                ImageView imageView6 = (ImageView) Sr0.g(viewInflate, R.id.icon_more_events);
                                                if (imageView6 != null) {
                                                    i2 = R.id.icon_more_favorites;
                                                    ImageView imageView7 = (ImageView) Sr0.g(viewInflate, R.id.icon_more_favorites);
                                                    if (imageView7 != null) {
                                                        i2 = R.id.icon_more_history;
                                                        ImageView imageView8 = (ImageView) Sr0.g(viewInflate, R.id.icon_more_history);
                                                        if (imageView8 != null) {
                                                            i2 = R.id.icon_more_logout;
                                                            ImageView imageView9 = (ImageView) Sr0.g(viewInflate, R.id.icon_more_logout);
                                                            if (imageView9 != null) {
                                                                i2 = R.id.icon_more_settings;
                                                                ImageView imageView10 = (ImageView) Sr0.g(viewInflate, R.id.icon_more_settings);
                                                                if (imageView10 != null) {
                                                                    i2 = R.id.item_more_events;
                                                                    LinearLayout linearLayout = (LinearLayout) Sr0.g(viewInflate, R.id.item_more_events);
                                                                    if (linearLayout != null) {
                                                                        i2 = R.id.item_more_favorites;
                                                                        LinearLayout linearLayout2 = (LinearLayout) Sr0.g(viewInflate, R.id.item_more_favorites);
                                                                        if (linearLayout2 != null) {
                                                                            i2 = R.id.item_more_history;
                                                                            LinearLayout linearLayout3 = (LinearLayout) Sr0.g(viewInflate, R.id.item_more_history);
                                                                            if (linearLayout3 != null) {
                                                                                i2 = R.id.item_more_logout;
                                                                                LinearLayout linearLayout4 = (LinearLayout) Sr0.g(viewInflate, R.id.item_more_logout);
                                                                                if (linearLayout4 != null) {
                                                                                    i2 = R.id.item_more_settings;
                                                                                    LinearLayout linearLayout5 = (LinearLayout) Sr0.g(viewInflate, R.id.item_more_settings);
                                                                                    if (linearLayout5 != null) {
                                                                                        i2 = R.id.more_divider;
                                                                                        View viewG = Sr0.g(viewInflate, R.id.more_divider);
                                                                                        if (viewG != null) {
                                                                                            i2 = R.id.more_sheet_handle;
                                                                                            View viewG2 = Sr0.g(viewInflate, R.id.more_sheet_handle);
                                                                                            if (viewG2 != null) {
                                                                                                i2 = R.id.more_sheet_root;
                                                                                                LinearLayout linearLayout6 = (LinearLayout) Sr0.g(viewInflate, R.id.more_sheet_root);
                                                                                                if (linearLayout6 != null) {
                                                                                                    i2 = R.id.tv_more_events;
                                                                                                    TextView textView = (TextView) Sr0.g(viewInflate, R.id.tv_more_events);
                                                                                                    if (textView != null) {
                                                                                                        i2 = R.id.tv_more_events_subtitle;
                                                                                                        TextView textView2 = (TextView) Sr0.g(viewInflate, R.id.tv_more_events_subtitle);
                                                                                                        if (textView2 != null) {
                                                                                                            i2 = R.id.tv_more_favorites;
                                                                                                            TextView textView3 = (TextView) Sr0.g(viewInflate, R.id.tv_more_favorites);
                                                                                                            if (textView3 != null) {
                                                                                                                i2 = R.id.tv_more_favorites_subtitle;
                                                                                                                TextView textView4 = (TextView) Sr0.g(viewInflate, R.id.tv_more_favorites_subtitle);
                                                                                                                if (textView4 != null) {
                                                                                                                    i2 = R.id.tv_more_history;
                                                                                                                    TextView textView5 = (TextView) Sr0.g(viewInflate, R.id.tv_more_history);
                                                                                                                    if (textView5 != null) {
                                                                                                                        i2 = R.id.tv_more_history_subtitle;
                                                                                                                        TextView textView6 = (TextView) Sr0.g(viewInflate, R.id.tv_more_history_subtitle);
                                                                                                                        if (textView6 != null) {
                                                                                                                            i2 = R.id.tv_more_logout;
                                                                                                                            TextView textView7 = (TextView) Sr0.g(viewInflate, R.id.tv_more_logout);
                                                                                                                            if (textView7 != null) {
                                                                                                                                i2 = R.id.tv_more_logout_subtitle;
                                                                                                                                TextView textView8 = (TextView) Sr0.g(viewInflate, R.id.tv_more_logout_subtitle);
                                                                                                                                if (textView8 != null) {
                                                                                                                                    i2 = R.id.tv_more_settings;
                                                                                                                                    TextView textView9 = (TextView) Sr0.g(viewInflate, R.id.tv_more_settings);
                                                                                                                                    if (textView9 != null) {
                                                                                                                                        i2 = R.id.tv_more_settings_subtitle;
                                                                                                                                        TextView textView10 = (TextView) Sr0.g(viewInflate, R.id.tv_more_settings_subtitle);
                                                                                                                                        if (textView10 != null) {
                                                                                                                                            i2 = R.id.tv_more_subtitle;
                                                                                                                                            TextView textView11 = (TextView) Sr0.g(viewInflate, R.id.tv_more_subtitle);
                                                                                                                                            if (textView11 != null) {
                                                                                                                                                TextView textView12 = (TextView) Sr0.g(viewInflate, R.id.tv_more_title);
                                                                                                                                                if (textView12 != null) {
                                                                                                                                                    NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                                                                                                                                                    C0478Hm c0478Hm = new C0478Hm(nestedScrollView, imageView, imageView2, imageView3, imageView4, imageView5, frameLayout, frameLayout2, frameLayout3, frameLayout4, frameLayout5, imageView6, imageView7, imageView8, imageView9, imageView10, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, viewG, viewG2, linearLayout6, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12);
                                                                                                                                                    this.G = c0478Hm;
                                                                                                                                                    String strB = Cr0.y.b();
                                                                                                                                                    C1123bj0 c1123bj0F = AbstractC1459f50.F(strB == null ? "default" : strB);
                                                                                                                                                    this.H = c1123bj0F;
                                                                                                                                                    setContentView(nestedScrollView);
                                                                                                                                                    setCanceledOnTouchOutside(true);
                                                                                                                                                    GradientDrawable gradientDrawable = new GradientDrawable();
                                                                                                                                                    gradientDrawable.setShape(0);
                                                                                                                                                    gradientDrawable.setColor(c1123bj0F.b);
                                                                                                                                                    float f = 28.0f * getContext().getResources().getDisplayMetrics().density;
                                                                                                                                                    gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
                                                                                                                                                    linearLayout6.setBackground(gradientDrawable);
                                                                                                                                                    int i3 = c1123bj0F.d;
                                                                                                                                                    viewG2.setBackground(k(AbstractC1894jf.f(i3, 120), 2.0f));
                                                                                                                                                    int i4 = c1123bj0F.e;
                                                                                                                                                    textView12.setTextColor(i4);
                                                                                                                                                    int i5 = c1123bj0F.f;
                                                                                                                                                    textView11.setTextColor(i5);
                                                                                                                                                    Iterator it = AbstractC0937Ze.K(textView, textView3, textView5, textView9).iterator();
                                                                                                                                                    while (it.hasNext()) {
                                                                                                                                                        ((TextView) it.next()).setTextColor(i4);
                                                                                                                                                    }
                                                                                                                                                    Iterator it2 = AbstractC0937Ze.K(c0478Hm.H, c0478Hm.I, c0478Hm.J, c0478Hm.M).iterator();
                                                                                                                                                    while (it2.hasNext()) {
                                                                                                                                                        ((TextView) it2.next()).setTextColor(i5);
                                                                                                                                                    }
                                                                                                                                                    int i6 = c1123bj0F.c;
                                                                                                                                                    int iF = AbstractC1894jf.f(i6, 30);
                                                                                                                                                    Iterator it3 = AbstractC0937Ze.K(c0478Hm.r, c0478Hm.s, c0478Hm.t, c0478Hm.v).iterator();
                                                                                                                                                    while (it3.hasNext()) {
                                                                                                                                                        ((FrameLayout) it3.next()).setBackground(k(iF, 14.0f));
                                                                                                                                                    }
                                                                                                                                                    Iterator it4 = AbstractC0937Ze.K(c0478Hm.w, c0478Hm.x, c0478Hm.y, c0478Hm.A).iterator();
                                                                                                                                                    while (it4.hasNext()) {
                                                                                                                                                        ((ImageView) it4.next()).setImageTintList(ColorStateList.valueOf(i6));
                                                                                                                                                    }
                                                                                                                                                    Iterator it5 = AbstractC0937Ze.K(c0478Hm.m, c0478Hm.n, c0478Hm.f309o, c0478Hm.q).iterator();
                                                                                                                                                    while (it5.hasNext()) {
                                                                                                                                                        ((ImageView) it5.next()).setImageTintList(ColorStateList.valueOf(i3));
                                                                                                                                                    }
                                                                                                                                                    int iF2 = AbstractC1894jf.f(i6, 38);
                                                                                                                                                    Iterator it6 = AbstractC0937Ze.K(c0478Hm.B, c0478Hm.C, c0478Hm.D, c0478Hm.F).iterator();
                                                                                                                                                    while (it6.hasNext()) {
                                                                                                                                                        ((LinearLayout) it6.next()).setBackground(new RippleDrawable(ColorStateList.valueOf(iF2), k(0, 16.0f), k(-1, 16.0f)));
                                                                                                                                                    }
                                                                                                                                                    int iRgb = Color.rgb(255, 107, 107);
                                                                                                                                                    c0478Hm.u.setBackground(k(AbstractC1894jf.f(iRgb, 28), 14.0f));
                                                                                                                                                    c0478Hm.z.setImageTintList(ColorStateList.valueOf(iRgb));
                                                                                                                                                    c0478Hm.K.setTextColor(iRgb);
                                                                                                                                                    c0478Hm.L.setTextColor(AbstractC1894jf.b(iRgb, 0.42f, i5));
                                                                                                                                                    c0478Hm.p.setImageTintList(ColorStateList.valueOf(AbstractC1894jf.f(iRgb, 180)));
                                                                                                                                                    c0478Hm.E.setBackground(new RippleDrawable(ColorStateList.valueOf(AbstractC1894jf.f(iRgb, 38)), k(0, 16.0f), k(-1, 16.0f)));
                                                                                                                                                    c0478Hm.G.setBackgroundColor(AbstractC1894jf.f(i3, 36));
                                                                                                                                                    this.G.B.setVisibility(this.B == null ? 8 : 0);
                                                                                                                                                    InterfaceC0360Cy interfaceC0360Cy = this.B;
                                                                                                                                                    if (interfaceC0360Cy != null) {
                                                                                                                                                        LinearLayout linearLayout7 = this.G.B;
                                                                                                                                                        AbstractC1474fG.i(linearLayout7, "itemMoreEvents");
                                                                                                                                                        linearLayout7.setOnClickListener(new ViewOnClickListenerC1010ac(this, i, interfaceC0360Cy));
                                                                                                                                                    }
                                                                                                                                                    LinearLayout linearLayout8 = this.G.C;
                                                                                                                                                    AbstractC1474fG.i(linearLayout8, "itemMoreFavorites");
                                                                                                                                                    linearLayout8.setOnClickListener(new ViewOnClickListenerC1010ac(this, i, this.C));
                                                                                                                                                    LinearLayout linearLayout9 = this.G.D;
                                                                                                                                                    AbstractC1474fG.i(linearLayout9, "itemMoreHistory");
                                                                                                                                                    linearLayout9.setOnClickListener(new ViewOnClickListenerC1010ac(this, i, this.D));
                                                                                                                                                    LinearLayout linearLayout10 = this.G.F;
                                                                                                                                                    AbstractC1474fG.i(linearLayout10, "itemMoreSettings");
                                                                                                                                                    linearLayout10.setOnClickListener(new ViewOnClickListenerC1010ac(this, i, this.E));
                                                                                                                                                    LinearLayout linearLayout11 = this.G.E;
                                                                                                                                                    AbstractC1474fG.i(linearLayout11, "itemMoreLogout");
                                                                                                                                                    linearLayout11.setOnClickListener(new ViewOnClickListenerC1010ac(this, i, this.F));
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                                i2 = R.id.tv_more_title;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    public final GradientDrawable k(int i, float f) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(f * getContext().getResources().getDisplayMetrics().density);
        return gradientDrawable;
    }

    @Override // o.DialogC2924u9, o.AbstractDialogC1652h4, o.DialogC1213cg, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setNavigationBarColor(this.H.b);
    }

    @Override // o.DialogC2924u9, o.DialogC1213cg, android.app.Dialog
    public final void onStart() {
        super.onStart();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.design_bottom_sheet);
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(0);
            BottomSheetBehavior bottomSheetBehaviorA = BottomSheetBehavior.A(frameLayout);
            bottomSheetBehaviorA.H(3);
            bottomSheetBehaviorA.J = true;
        }
    }
}
