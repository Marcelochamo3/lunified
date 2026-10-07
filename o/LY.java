package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.leanback.widget.VerticalGridView;
import com.skidush.clonex.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class LY extends FrameLayout {
    public final ViewGroup l;
    public final ArrayList m;
    public ArrayList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f381o;
    public final float p;
    public final float q;
    public final int r;
    public final DecelerateInterpolator s;
    public float t;
    public float u;
    public int v;
    public final ArrayList w;
    public int x;
    public int y;
    public final IY z;

    public LY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.datePickerStyle);
        this.m = new ArrayList();
        this.t = 3.0f;
        this.u = 1.0f;
        this.v = 0;
        this.w = new ArrayList();
        this.z = new IY(this);
        int[] iArr = Q40.f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.datePickerStyle, 0);
        It0.o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.datePickerStyle);
        this.x = typedArrayObtainStyledAttributes.getResourceId(0, R.layout.lb_picker_item);
        this.y = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        setEnabled(true);
        setDescendantFocusability(262144);
        this.p = 1.0f;
        this.f381o = 1.0f;
        this.q = 0.5f;
        this.r = 200;
        this.s = new DecelerateInterpolator(2.5f);
        this.l = (ViewGroup) ((ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.lb_picker, (ViewGroup) this, true)).findViewById(R.id.picker);
    }

    public final void a(int i, MY my) {
        this.n.set(i, my);
        VerticalGridView verticalGridView = (VerticalGridView) this.m.get(i);
        JY jy = (JY) verticalGridView.getAdapter();
        if (jy != null) {
            jy.a.b();
        }
        verticalGridView.setSelectedPosition(my.a - my.b);
    }

    public final void b(View view, boolean z, float f, DecelerateInterpolator decelerateInterpolator) {
        view.animate().cancel();
        if (z) {
            view.animate().alpha(f).setDuration(this.r).setInterpolator(decelerateInterpolator).start();
        } else {
            view.setAlpha(f);
        }
    }

    public final void c(View view, boolean z, int i, boolean z2) {
        boolean z3 = i == this.v || !hasFocus();
        DecelerateInterpolator decelerateInterpolator = this.s;
        if (z) {
            if (z3) {
                b(view, z2, this.p, decelerateInterpolator);
                return;
            } else {
                b(view, z2, this.f381o, decelerateInterpolator);
                return;
            }
        }
        if (z3) {
            b(view, z2, this.q, decelerateInterpolator);
        } else {
            b(view, z2, 0.0f, decelerateInterpolator);
        }
    }

    public final void d(int i) {
        VerticalGridView verticalGridView = (VerticalGridView) this.m.get(i);
        int selectedPosition = verticalGridView.getSelectedPosition();
        int i2 = 0;
        while (i2 < verticalGridView.getAdapter().a()) {
            View viewS = verticalGridView.getLayoutManager().s(i2);
            if (viewS != null) {
                c(viewS, selectedPosition == i2, i, true);
            }
            i2++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isActivated()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 23 && keyCode != 66) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 1) {
            performClick();
        }
        return true;
    }

    public final void e() {
        for (int i = 0; i < getColumnsCount(); i++) {
            f((VerticalGridView) this.m.get(i));
        }
    }

    public final void f(VerticalGridView verticalGridView) {
        ViewGroup.LayoutParams layoutParams = verticalGridView.getLayoutParams();
        float activatedVisibleItemCount = isActivated() ? getActivatedVisibleItemCount() : getVisibleItemCount();
        layoutParams.height = (int) (((activatedVisibleItemCount - 1.0f) * verticalGridView.getVerticalSpacing()) + (getPickerItemHeightPixels() * activatedVisibleItemCount));
        verticalGridView.setLayoutParams(layoutParams);
    }

    public float getActivatedVisibleItemCount() {
        return this.t;
    }

    public int getColumnsCount() {
        ArrayList arrayList = this.n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public int getPickerItemHeightPixels() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.picker_item_height);
    }

    public final int getPickerItemLayoutId() {
        return this.x;
    }

    public final int getPickerItemTextViewId() {
        return this.y;
    }

    public int getSelectedColumn() {
        return this.v;
    }

    @Deprecated
    public final CharSequence getSeparator() {
        return (CharSequence) this.w.get(0);
    }

    public final List<CharSequence> getSeparators() {
        return this.w;
    }

    public float getVisibleItemCount() {
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int selectedColumn = getSelectedColumn();
        if (selectedColumn < 0) {
            return false;
        }
        ArrayList arrayList = this.m;
        if (selectedColumn < arrayList.size()) {
            return ((VerticalGridView) arrayList.get(selectedColumn)).requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i >= arrayList.size()) {
                return;
            }
            if (((VerticalGridView) arrayList.get(i)).hasFocus()) {
                setSelectedColumn(i);
            }
            i++;
        }
    }

    @Override // android.view.View
    public void setActivated(boolean z) {
        ArrayList arrayList;
        if (z == isActivated()) {
            super.setActivated(z);
            return;
        }
        super.setActivated(z);
        boolean zHasFocus = hasFocus();
        int selectedColumn = getSelectedColumn();
        setDescendantFocusability(131072);
        if (!z && zHasFocus && isFocusable()) {
            requestFocus();
        }
        int i = 0;
        while (true) {
            int columnsCount = getColumnsCount();
            arrayList = this.m;
            if (i >= columnsCount) {
                break;
            }
            ((VerticalGridView) arrayList.get(i)).setFocusable(z);
            i++;
        }
        e();
        boolean zIsActivated = isActivated();
        for (int i2 = 0; i2 < getColumnsCount(); i2++) {
            VerticalGridView verticalGridView = (VerticalGridView) arrayList.get(i2);
            for (int i3 = 0; i3 < verticalGridView.getChildCount(); i3++) {
                verticalGridView.getChildAt(i3).setFocusable(zIsActivated);
            }
        }
        if (z && zHasFocus && selectedColumn >= 0) {
            ((VerticalGridView) arrayList.get(selectedColumn)).requestFocus();
        }
        setDescendantFocusability(262144);
    }

    public void setActivatedVisibleItemCount(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException();
        }
        if (this.t != f) {
            this.t = f;
            if (isActivated()) {
                e();
            }
        }
    }

    public void setColumns(List<MY> list) {
        ArrayList arrayList = this.w;
        if (arrayList.size() == 0) {
            throw new IllegalStateException("Separators size is: " + arrayList.size() + ". At least one separator must be provided");
        }
        if (arrayList.size() == 1) {
            CharSequence charSequence = (CharSequence) arrayList.get(0);
            arrayList.clear();
            arrayList.add("");
            for (int i = 0; i < list.size() - 1; i++) {
                arrayList.add(charSequence);
            }
            arrayList.add("");
        } else if (arrayList.size() != list.size() + 1) {
            throw new IllegalStateException("Separators size: " + arrayList.size() + " mustequal the size of columns: " + list.size() + " + 1");
        }
        ArrayList arrayList2 = this.m;
        arrayList2.clear();
        ViewGroup viewGroup = this.l;
        viewGroup.removeAllViews();
        ArrayList arrayList3 = new ArrayList(list);
        this.n = arrayList3;
        if (this.v > arrayList3.size() - 1) {
            this.v = this.n.size() - 1;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int columnsCount = getColumnsCount();
        if (!TextUtils.isEmpty((CharSequence) arrayList.get(0))) {
            TextView textView = (TextView) layoutInflaterFrom.inflate(R.layout.lb_picker_separator, viewGroup, false);
            textView.setText((CharSequence) arrayList.get(0));
            viewGroup.addView(textView);
        }
        int i2 = 0;
        while (i2 < columnsCount) {
            VerticalGridView verticalGridView = (VerticalGridView) layoutInflaterFrom.inflate(R.layout.lb_picker_column, viewGroup, false);
            f(verticalGridView);
            verticalGridView.setWindowAlignment(0);
            verticalGridView.setHasFixedSize(false);
            verticalGridView.setFocusable(isActivated());
            verticalGridView.setItemViewCacheSize(0);
            arrayList2.add(verticalGridView);
            viewGroup.addView(verticalGridView);
            int i3 = i2 + 1;
            if (!TextUtils.isEmpty((CharSequence) arrayList.get(i3))) {
                TextView textView2 = (TextView) layoutInflaterFrom.inflate(R.layout.lb_picker_separator, viewGroup, false);
                textView2.setText((CharSequence) arrayList.get(i3));
                viewGroup.addView(textView2);
            }
            verticalGridView.setAdapter(new JY(this, getPickerItemLayoutId(), getPickerItemTextViewId(), i2));
            verticalGridView.setOnChildViewHolderSelectedListener(this.z);
            i2 = i3;
        }
    }

    public final void setPickerItemLayoutId(int i) {
        this.x = i;
    }

    public final void setPickerItemTextViewId(int i) {
        this.y = i;
    }

    public void setSelectedColumn(int i) {
        int i2 = this.v;
        ArrayList arrayList = this.m;
        if (i2 != i) {
            this.v = i;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                d(i3);
            }
        }
        VerticalGridView verticalGridView = (VerticalGridView) arrayList.get(i);
        if (!hasFocus() || verticalGridView.hasFocus()) {
            return;
        }
        verticalGridView.requestFocus();
    }

    public final void setSeparator(CharSequence charSequence) {
        setSeparators(Arrays.asList(charSequence));
    }

    public final void setSeparators(List<CharSequence> list) {
        ArrayList arrayList = this.w;
        arrayList.clear();
        arrayList.addAll(list);
    }

    public void setVisibleItemCount(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException();
        }
        if (this.u != f) {
            this.u = f;
            if (isActivated()) {
                return;
            }
            e();
        }
    }
}
