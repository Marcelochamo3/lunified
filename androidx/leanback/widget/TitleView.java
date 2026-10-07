package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.skidush.clonex.R;
import o.C2469pa0;
import o.Vj0;
import o.Wj0;

/* JADX INFO: loaded from: classes.dex */
public class TitleView extends FrameLayout {
    public final ImageView l;
    public final TextView m;
    public final SearchOrbView n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f28o;
    public boolean p;
    public final Vj0 q;

    public TitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.browseTitleViewStyle);
        this.f28o = 6;
        this.p = false;
        this.q = new Vj0();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.lb_title_view, this);
        this.l = (ImageView) viewInflate.findViewById(R.id.title_badge);
        this.m = (TextView) viewInflate.findViewById(R.id.title_text);
        this.n = (SearchOrbView) viewInflate.findViewById(R.id.title_orb);
        setClipToPadding(false);
        setClipChildren(false);
    }

    public Drawable getBadgeDrawable() {
        return this.l.getDrawable();
    }

    public C2469pa0 getSearchAffordanceColors() {
        return this.n.getOrbColors();
    }

    public View getSearchAffordanceView() {
        return this.n;
    }

    public CharSequence getTitle() {
        return this.m.getText();
    }

    public Wj0 getTitleViewAdapter() {
        return this.q;
    }

    public void setBadgeDrawable(Drawable drawable) {
        this.l.setImageDrawable(drawable);
        ImageView imageView = this.l;
        Drawable drawable2 = imageView.getDrawable();
        TextView textView = this.m;
        if (drawable2 != null) {
            imageView.setVisibility(0);
            textView.setVisibility(8);
        } else {
            imageView.setVisibility(8);
            textView.setVisibility(0);
        }
    }

    public void setOnSearchClickedListener(View.OnClickListener onClickListener) {
        this.p = onClickListener != null;
        SearchOrbView searchOrbView = this.n;
        searchOrbView.setOnOrbClickedListener(onClickListener);
        searchOrbView.setVisibility((this.p && (this.f28o & 4) == 4) ? 0 : 4);
    }

    public void setSearchAffordanceColors(C2469pa0 c2469pa0) {
        this.n.setOrbColors(c2469pa0);
    }

    public void setTitle(CharSequence charSequence) {
        this.m.setText(charSequence);
        ImageView imageView = this.l;
        Drawable drawable = imageView.getDrawable();
        TextView textView = this.m;
        if (drawable != null) {
            imageView.setVisibility(0);
            textView.setVisibility(8);
        } else {
            imageView.setVisibility(8);
            textView.setVisibility(0);
        }
    }
}
