package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;

/* JADX INFO: loaded from: classes.dex */
public final class AG implements InterfaceC2604qt0 {
    public final ConstraintLayout l;
    public final ImageView m;
    public final ImageView n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinearLayout f170o;
    public final TextView p;
    public final TextView q;
    public final TextView r;
    public final TextView s;

    public AG(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.l = constraintLayout;
        this.m = imageView;
        this.n = imageView2;
        this.f170o = linearLayout;
        this.p = textView;
        this.q = textView2;
        this.r = textView3;
        this.s = textView4;
    }

    public static AG a(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View viewInflate = layoutInflater.inflate(R.layout.item_fana_event_mobile, (ViewGroup) recyclerView, false);
        int i = R.id.iv_away_logo;
        ImageView imageView = (ImageView) Sr0.g(viewInflate, R.id.iv_away_logo);
        if (imageView != null) {
            i = R.id.iv_home_logo;
            ImageView imageView2 = (ImageView) Sr0.g(viewInflate, R.id.iv_home_logo);
            if (imageView2 != null) {
                i = R.id.ll_live_badge;
                LinearLayout linearLayout = (LinearLayout) Sr0.g(viewInflate, R.id.ll_live_badge);
                if (linearLayout != null) {
                    i = R.id.tv_away_name;
                    TextView textView = (TextView) Sr0.g(viewInflate, R.id.tv_away_name);
                    if (textView != null) {
                        i = R.id.tv_event_date;
                        TextView textView2 = (TextView) Sr0.g(viewInflate, R.id.tv_event_date);
                        if (textView2 != null) {
                            i = R.id.tv_event_tournament;
                            TextView textView3 = (TextView) Sr0.g(viewInflate, R.id.tv_event_tournament);
                            if (textView3 != null) {
                                i = R.id.tv_home_name;
                                TextView textView4 = (TextView) Sr0.g(viewInflate, R.id.tv_home_name);
                                if (textView4 != null) {
                                    return new AG((ConstraintLayout) viewInflate, imageView, imageView2, linearLayout, textView, textView2, textView3, textView4);
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
