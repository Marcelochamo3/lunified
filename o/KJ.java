package o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.leanback.transition.FadeAndShortSlide;
import com.skidush.clonex.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class KJ extends AbstractC1171c8 {
    public KJ() {
        FadeAndShortSlide fadeAndShortSlide = new FadeAndShortSlide(8388611);
        FadeAndShortSlide fadeAndShortSlide2 = new FadeAndShortSlide(8388613);
        g().g = fadeAndShortSlide2;
        g().i = fadeAndShortSlide;
        g().j = fadeAndShortSlide;
        g().h = fadeAndShortSlide2;
    }

    @Override // o.S20, o.AbstractComponentCallbacksC1247cx
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewA = super.A(layoutInflater, viewGroup, bundle);
        View viewInflate = LayoutInflater.from(viewA.getContext()).inflate(R.layout.leanback_preference_fragment, viewGroup, false);
        ((ViewGroup) viewInflate.findViewById(R.id.main_frame)).addView(viewA);
        return viewInflate;
    }

    @Override // o.S20, o.AbstractComponentCallbacksC1247cx
    public void K(View view, Bundle bundle) {
        super.K(view, bundle);
        CharSequence charSequence = this.m0.g.s;
        View view2 = this.S;
        TextView textView = view2 == null ? null : (TextView) view2.findViewById(R.id.decor_title);
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
