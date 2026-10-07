package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.skidush.clonex.R;

/* JADX INFO: loaded from: classes.dex */
public final class PG implements InterfaceC2604qt0 {
    public final ConstraintLayout l;
    public final ImageView m;
    public final ImageView n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f453o;
    public final TextView p;
    public final TextView q;
    public final View r;

    public PG(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, View view) {
        this.l = constraintLayout;
        this.m = imageView;
        this.n = imageView2;
        this.f453o = imageView3;
        this.p = textView;
        this.q = textView2;
        this.r = view;
    }

    public static PG a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_setting_tv, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.barrier1;
        if (((Barrier) Sr0.g(viewInflate, R.id.barrier1)) != null) {
            i = R.id.barrier2;
            if (((Barrier) Sr0.g(viewInflate, R.id.barrier2)) != null) {
                i = R.id.iv_setting_enter;
                ImageView imageView = (ImageView) Sr0.g(viewInflate, R.id.iv_setting_enter);
                if (imageView != null) {
                    i = R.id.iv_setting_icon;
                    ImageView imageView2 = (ImageView) Sr0.g(viewInflate, R.id.iv_setting_icon);
                    if (imageView2 != null) {
                        i = R.id.iv_setting_is_selected;
                        ImageView imageView3 = (ImageView) Sr0.g(viewInflate, R.id.iv_setting_is_selected);
                        if (imageView3 != null) {
                            i = R.id.tv_setting_main_text;
                            TextView textView = (TextView) Sr0.g(viewInflate, R.id.tv_setting_main_text);
                            if (textView != null) {
                                i = R.id.tv_setting_sub_text;
                                TextView textView2 = (TextView) Sr0.g(viewInflate, R.id.tv_setting_sub_text);
                                if (textView2 != null) {
                                    i = R.id.v_setting_color;
                                    View viewG = Sr0.g(viewInflate, R.id.v_setting_color);
                                    if (viewG != null) {
                                        return new PG((ConstraintLayout) viewInflate, imageView, imageView2, imageView3, textView, textView2, viewG);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // o.InterfaceC2604qt0
    public final View b() {
        return this.l;
    }
}
