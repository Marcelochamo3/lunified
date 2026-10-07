package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2036l1 extends C2333o4 implements InterfaceC2521q1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2424p1 f885o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2036l1(C2424p1 c2424p1, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f885o = c2424p1;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC1923jt0.H(this, getContentDescription());
        setOnTouchListener(new C1548g1(this, this));
    }

    @Override // o.InterfaceC2521q1
    public final boolean b() {
        return false;
    }

    @Override // o.InterfaceC2521q1
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f885o.o();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            AbstractC2205mo.f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
