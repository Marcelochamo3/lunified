package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class V20 extends O50 {
    public final PreferenceGroup d;
    public ArrayList e;
    public ArrayList f;
    public final ArrayList g;
    public final RunnableC3102w1 i = new RunnableC3102w1(18, this);
    public final Handler h = new Handler(Looper.getMainLooper());

    public V20(PreferenceScreen preferenceScreen) {
        this.d = preferenceScreen;
        preferenceScreen.R = this;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        i(preferenceScreen.e0);
        o();
    }

    public static boolean n(PreferenceGroup preferenceGroup) {
        return preferenceGroup.d0 != Integer.MAX_VALUE;
    }

    @Override // o.O50
    public final int a() {
        return this.f.size();
    }

    @Override // o.O50
    public final long b(int i) {
        if (this.b) {
            return m(i).d();
        }
        return -1L;
    }

    @Override // o.O50
    public final int c(int i) {
        U20 u20 = new U20(m(i));
        ArrayList arrayList = this.g;
        int iIndexOf = arrayList.indexOf(u20);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = arrayList.size();
        arrayList.add(u20);
        return size;
    }

    @Override // o.O50
    public final void e(AbstractC2144m60 abstractC2144m60, int i) {
        ColorStateList colorStateList;
        Z20 z20 = (Z20) abstractC2144m60;
        Preference preferenceM = m(i);
        View view = z20.a;
        Drawable background = view.getBackground();
        Drawable drawable = z20.u;
        if (background != drawable) {
            WeakHashMap weakHashMap = It0.a;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) z20.u(R.id.title);
        if (textView != null && (colorStateList = z20.v) != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        preferenceM.l(z20);
    }

    @Override // o.O50
    public final AbstractC2144m60 f(int i, RecyclerView recyclerView) {
        U20 u20 = (U20) this.g.get(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(recyclerView.getContext());
        TypedArray typedArrayObtainStyledAttributes = recyclerView.getContext().obtainStyledAttributes((AttributeSet) null, D40.a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = Ou0.l(recyclerView.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(u20.a, (ViewGroup) recyclerView, false);
        if (viewInflate.getBackground() == null) {
            WeakHashMap weakHashMap = It0.a;
            viewInflate.setBackground(drawable);
        }
        ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup != null) {
            int i2 = u20.b;
            if (i2 != 0) {
                layoutInflaterFrom.inflate(i2, viewGroup);
            } else {
                viewGroup.setVisibility(8);
            }
        }
        return new Z20(viewInflate);
    }

    public final ArrayList k(PreferenceGroup preferenceGroup) {
        boolean z = false;
        ArrayList arrayList = new ArrayList();
        ArrayList<Preference> arrayList2 = new ArrayList();
        int size = preferenceGroup.Z.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Preference preferenceB = preferenceGroup.B(i2);
            if (preferenceB.H) {
                if (!n(preferenceGroup) || i < preferenceGroup.d0) {
                    arrayList.add(preferenceB);
                } else {
                    arrayList2.add(preferenceB);
                }
                if (preferenceB instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceB;
                    if (!(!(preferenceGroup2 instanceof PreferenceScreen))) {
                        continue;
                    } else {
                        if (n(preferenceGroup) && n(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : k(preferenceGroup2)) {
                            if (!n(preferenceGroup) || i < preferenceGroup.d0) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (n(preferenceGroup) && i > preferenceGroup.d0) {
            long j = preferenceGroup.n;
            CharSequence string = null;
            C2018ks c2018ks = new C2018ks(preferenceGroup.l, null);
            c2018ks.P = com.skidush.clonex.R.layout.expand_button;
            Context context = c2018ks.l;
            Drawable drawableL = Ou0.l(context, com.skidush.clonex.R.drawable.ic_arrow_down_24dp);
            if (c2018ks.v != drawableL) {
                c2018ks.v = drawableL;
                c2018ks.u = 0;
                c2018ks.h();
            }
            c2018ks.u = com.skidush.clonex.R.drawable.ic_arrow_down_24dp;
            String string2 = context.getString(com.skidush.clonex.R.string.expand_button_title);
            if (!TextUtils.equals(string2, c2018ks.s)) {
                c2018ks.s = string2;
                c2018ks.h();
            }
            if (999 != c2018ks.r) {
                c2018ks.r = 999;
                V20 v20 = c2018ks.R;
                if (v20 != null) {
                    Handler handler = v20.h;
                    RunnableC3102w1 runnableC3102w1 = v20.i;
                    handler.removeCallbacks(runnableC3102w1);
                    handler.post(runnableC3102w1);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Preference preference2 : arrayList2) {
                CharSequence charSequence = preference2.s;
                boolean z2 = preference2 instanceof PreferenceGroup;
                if (z2 && !TextUtils.isEmpty(charSequence)) {
                    arrayList3.add((PreferenceGroup) preference2);
                }
                if (arrayList3.contains(preference2.T)) {
                    if (z2) {
                        arrayList3.add((PreferenceGroup) preference2);
                    }
                } else if (!TextUtils.isEmpty(charSequence)) {
                    string = string == null ? charSequence : context.getString(com.skidush.clonex.R.string.summary_collapsed_preference_list, string, charSequence);
                }
            }
            c2018ks.v(string);
            c2018ks.Y = j + 1000000;
            c2018ks.q = new C2994uv(this, preferenceGroup, 20, z);
            arrayList.add(c2018ks);
        }
        return arrayList;
    }

    public final void l(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.Z);
        }
        int size = preferenceGroup.Z.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceB = preferenceGroup.B(i);
            arrayList.add(preferenceB);
            U20 u20 = new U20(preferenceB);
            if (!this.g.contains(u20)) {
                this.g.add(u20);
            }
            if (preferenceB instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceB;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    l(arrayList, preferenceGroup2);
                }
            }
            preferenceB.R = this;
        }
    }

    public final Preference m(int i) {
        if (i < 0 || i >= this.f.size()) {
            return null;
        }
        return (Preference) this.f.get(i);
    }

    public final void o() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).R = null;
        }
        ArrayList arrayList = new ArrayList(this.e.size());
        this.e = arrayList;
        PreferenceGroup preferenceGroup = this.d;
        l(arrayList, preferenceGroup);
        this.f = k(preferenceGroup);
        this.a.b();
        Iterator it2 = this.e.iterator();
        while (it2.hasNext()) {
            ((Preference) it2.next()).getClass();
        }
    }
}
