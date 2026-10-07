package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o.C1519fm0;
import o.C1812im0;
import o.C2007km0;
import o.InterfaceC1129bm0;
import o.M8;
import o.Z0;
import o.Zl0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class TrackSelectionView extends LinearLayout {
    public final int l;
    public final LayoutInflater m;
    public final CheckedTextView n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CheckedTextView f39o;
    public final Z0 p;
    public final ArrayList q;
    public final HashMap r;
    public boolean s;
    public boolean t;
    public InterfaceC1129bm0 u;
    public CheckedTextView[][] v;
    public boolean w;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.l = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.m = layoutInflaterFrom;
        Z0 z0 = new Z0(8, this);
        this.p = z0;
        this.u = new M8(getResources(), 1);
        this.q = new ArrayList();
        this.r = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.n = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.skidush.clonex.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(z0);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(com.skidush.clonex.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f39o = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.skidush.clonex.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(z0);
        addView(checkedTextView2);
    }

    public final void a() {
        this.n.setChecked(this.w);
        boolean z = this.w;
        HashMap map = this.r;
        this.f39o.setChecked(!z && map.size() == 0);
        for (int i = 0; i < this.v.length; i++) {
            C1519fm0 c1519fm0 = (C1519fm0) map.get(((C2007km0) this.q.get(i)).m);
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.v[i];
                if (i2 < checkedTextViewArr.length) {
                    if (c1519fm0 != null) {
                        Object tag = checkedTextViewArr[i2].getTag();
                        tag.getClass();
                        this.v[i][i2].setChecked(c1519fm0.m.contains(Integer.valueOf(((C1812im0) tag).b)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    public final void b() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.q;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f39o;
        CheckedTextView checkedTextView2 = this.n;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.v = new CheckedTextView[arrayList.size()][];
        boolean z = this.t && arrayList.size() > 1;
        for (int i = 0; i < arrayList.size(); i++) {
            C2007km0 c2007km0 = (C2007km0) arrayList.get(i);
            boolean z2 = this.s && c2007km0.n;
            CheckedTextView[][] checkedTextViewArr = this.v;
            int i2 = c2007km0.l;
            checkedTextViewArr[i] = new CheckedTextView[i2];
            C1812im0[] c1812im0Arr = new C1812im0[i2];
            for (int i3 = 0; i3 < c2007km0.l; i3++) {
                c1812im0Arr[i3] = new C1812im0(c2007km0, i3);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                LayoutInflater layoutInflater = this.m;
                if (i4 == 0) {
                    addView(layoutInflater.inflate(com.skidush.clonex.R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z2 || z) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.l);
                InterfaceC1129bm0 interfaceC1129bm0 = this.u;
                C1812im0 c1812im0 = c1812im0Arr[i4];
                checkedTextView3.setText(((M8) interfaceC1129bm0).c(c1812im0.a.m.f665o[c1812im0.b]));
                checkedTextView3.setTag(c1812im0Arr[i4]);
                if (c2007km0.f875o[i4] != 4) {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                } else {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.p);
                }
                this.v[i][i4] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.w;
    }

    public Map<Zl0, C1519fm0> getOverrides() {
        return this.r;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.s != z) {
            this.s = z;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.t != z) {
            this.t = z;
            if (!z) {
                HashMap map = this.r;
                if (map.size() > 1) {
                    ArrayList arrayList = this.q;
                    HashMap map2 = new HashMap();
                    for (int i = 0; i < arrayList.size(); i++) {
                        C1519fm0 c1519fm0 = (C1519fm0) map.get(((C2007km0) arrayList.get(i)).m);
                        if (c1519fm0 != null && map2.isEmpty()) {
                            map2.put(c1519fm0.l, c1519fm0);
                        }
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.n.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(InterfaceC1129bm0 interfaceC1129bm0) {
        interfaceC1129bm0.getClass();
        this.u = interfaceC1129bm0;
        b();
    }
}
