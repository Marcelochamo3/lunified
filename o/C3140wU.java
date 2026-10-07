package o;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: renamed from: o.wU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3140wU extends FrameLayout implements InterfaceC2748sQ {
    public static final int[] p = {R.attr.state_checked};
    public final ImageView l;
    public final TextView m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C1386eQ f1092o;

    public C3140wU(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.l = (ImageView) viewInflate.findViewById(com.skidush.clonex.R.id.iv_navigation_item_icon);
        this.m = (TextView) viewInflate.findViewById(com.skidush.clonex.R.id.tv_navigation_item_label);
        this.n = -1;
    }

    @Override // o.InterfaceC2748sQ
    public final void a(C1386eQ c1386eQ) {
        AbstractC1474fG.j(c1386eQ, "itemData");
        this.f1092o = c1386eQ;
        setCheckable(c1386eQ.isCheckable());
        setChecked(c1386eQ.isChecked());
        setEnabled(c1386eQ.isEnabled());
        setIcon(c1386eQ.getIcon());
        setTitle(c1386eQ.e);
        setId(c1386eQ.a);
        if (!TextUtils.isEmpty(c1386eQ.q)) {
            setContentDescription(c1386eQ.q);
        }
        CharSequence charSequence = c1386eQ.r;
        CharSequence charSequence2 = (charSequence == null || charSequence.length() <= 0) ? c1386eQ.e : c1386eQ.r;
        if (Build.VERSION.SDK_INT > 23) {
            AbstractC1923jt0.H(this, charSequence2);
        }
        setVisibility(c1386eQ.isVisible() ? 0 : 8);
    }

    @Override // o.InterfaceC2748sQ
    public C1386eQ getItemData() {
        C1386eQ c1386eQ = this.f1092o;
        if (c1386eQ != null) {
            return c1386eQ;
        }
        AbstractC1474fG.U("itemData");
        throw null;
    }

    public final int getItemLayoutResId() {
        return com.skidush.clonex.R.layout.item_navigation;
    }

    public final int getItemPosition() {
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C1386eQ c1386eQ = this.f1092o;
        if (c1386eQ == null) {
            AbstractC1474fG.U("itemData");
            throw null;
        }
        if (c1386eQ.isCheckable()) {
            C1386eQ c1386eQ2 = this.f1092o;
            if (c1386eQ2 == null) {
                AbstractC1474fG.U("itemData");
                throw null;
            }
            if (c1386eQ2.isChecked()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, p);
            }
        }
        AbstractC1474fG.g(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.m.setEnabled(z);
        this.l.setEnabled(z);
        if (z) {
            It0.r(this, Build.VERSION.SDK_INT >= 24 ? new C0334By(26, AbstractC1355e20.b(getContext(), 1002)) : new C0334By(26, (Object) null));
        } else {
            It0.r(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        ImageView imageView = this.l;
        if (drawable == imageView.getDrawable()) {
            return;
        }
        imageView.setImageDrawable(drawable);
    }

    public final void setItemPosition(int i) {
        this.n = i;
    }

    public void setTitle(CharSequence charSequence) {
        this.m.setText(charSequence);
    }
}
