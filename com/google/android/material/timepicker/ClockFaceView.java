package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.skidush.clonex.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.AbstractC1459f50;
import o.AbstractC1753i50;
import o.AbstractC3021v9;
import o.C0576Lg;
import o.C0601Mg;
import o.C0705Qg;
import o.H40;
import o.InterfaceC0496Ie;
import o.It0;
import o.L0;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends AbstractC1753i50 implements InterfaceC0496Ie {
    public final ClockHandView G;
    public final Rect H;
    public final RectF I;
    public final Rect J;
    public final SparseArray K;
    public final c L;
    public final int[] M;
    public final float[] N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final String[] S;
    public float T;
    public final ColorStateList U;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = new Rect();
        this.I = new RectF();
        this.J = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.K = sparseArray;
        this.N = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H40.f, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListL = AbstractC3021v9.l(context, typedArrayObtainStyledAttributes, 1);
        this.U = colorStateListL;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.G = clockHandView;
        this.O = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListL.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListL.getDefaultColor());
        this.M = new int[]{colorForState, colorForState, colorStateListL.getDefaultColor()};
        clockHandView.n.add(this);
        int defaultColor = AbstractC1459f50.v(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListL2 = AbstractC3021v9.l(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListL2 != null ? colorStateListL2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.L = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.S = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i = 0; i < Math.max(this.S.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.S.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.S[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i2));
                z = i2 > 1 ? true : z;
                It0.p(textView, this.L);
                textView.setTextColor(this.U);
            }
        }
        ClockHandView clockHandView2 = this.G;
        if (clockHandView2.m && !z) {
            clockHandView2.x = 1;
        }
        clockHandView2.m = z;
        clockHandView2.invalidate();
        this.P = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.Q = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.R = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // o.AbstractC1753i50
    public final void m() {
        C0705Qg c0705Qg = new C0705Qg();
        c0705Qg.b(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.E * 0.66f) : this.E;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap map2 = c0705Qg.c;
                if (!map2.containsKey(Integer.valueOf(id))) {
                    map2.put(Integer.valueOf(id), new C0576Lg());
                }
                C0601Mg c0601Mg = ((C0576Lg) map2.get(Integer.valueOf(id))).d;
                c0601Mg.z = R.id.circle_center;
                c0601Mg.A = iRound;
                c0601Mg.B = size;
                size += 360.0f / list.size();
            }
        }
        c0705Qg.a(this);
        setConstraintSet(null);
        requestLayout();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.K;
            if (i3 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i3)).setVisibility(0);
            i3++;
        }
    }

    public final void n() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.G.r;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.K;
            int size = sparseArray.size();
            rectF = this.I;
            rect = this.H;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.J;
                textView3.getLineBounds(0, rect2);
                rectF.inset(rect2.left, rect2.top);
                textView3.getPaint().setShader(RectF.intersects(rectF2, rectF) ? new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.M, this.N, Shader.TileMode.CLAMP) : null);
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) L0.d(1, this.S.length, 1).l);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.R / Math.max(Math.max(this.P / displayMetrics.heightPixels, this.Q / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
