package o;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* JADX INFO: renamed from: o.d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1261d4 extends ContentFrameLayout {
    public final /* synthetic */ LayoutInflaterFactory2C1456f4 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1261d4(LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4, C0447Gh c0447Gh) {
        super(c0447Gh, null);
        this.t = layoutInflaterFactory2C1456f4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.t.q(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = this.t;
                layoutInflaterFactory2C1456f4.o(layoutInflaterFactory2C1456f4.x(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(Ou0.l(getContext(), i));
    }
}
