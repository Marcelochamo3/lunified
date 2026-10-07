package o;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: renamed from: o.ku0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2023ku0 extends RecyclerView {
    public final /* synthetic */ ViewPager2 U0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2023ku0(ViewPager2 viewPager2, Context context) {
        super(context, null);
        this.U0 = viewPager2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.U0.E.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.U0;
        accessibilityEvent.setFromIndex(viewPager2.f33o);
        accessibilityEvent.setToIndex(viewPager2.f33o);
        accessibilityEvent.setSource((ViewPager2) viewPager2.E.p);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.U0.C && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.U0.C && super.onTouchEvent(motionEvent);
    }
}
