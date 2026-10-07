package o;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: o.tM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2841tM {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;
    public final Object g;

    public C2841tM(int i) {
        this.a = 0;
        this.b = i;
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.f = new C2938uM(0);
        this.g = new C2743sL(0);
    }

    public void a() {
        View view = (View) AbstractC1701hf0.c(1, (ArrayList) this.f);
        C1312dg0 c1312dg0 = (C1312dg0) view.getLayoutParams();
        this.c = ((StaggeredGridLayoutManager) this.g).r.b(view);
        c1312dg0.getClass();
    }

    public void b() {
        ((ArrayList) this.f).clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public int c() {
        boolean z = ((StaggeredGridLayoutManager) this.g).w;
        ArrayList arrayList = (ArrayList) this.f;
        return z ? e(arrayList.size() - 1, -1) : e(0, arrayList.size());
    }

    public int d() {
        boolean z = ((StaggeredGridLayoutManager) this.g).w;
        ArrayList arrayList = (ArrayList) this.f;
        return z ? e(0, arrayList.size()) : e(arrayList.size() - 1, -1);
    }

    public int e(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        int iK = staggeredGridLayoutManager.r.k();
        int iG = staggeredGridLayoutManager.r.g();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) ((ArrayList) this.f).get(i);
            int iE = staggeredGridLayoutManager.r.e(view);
            int iB = staggeredGridLayoutManager.r.b(view);
            boolean z = iE <= iG;
            boolean z2 = iB >= iK;
            if (z && z2 && (iE < iK || iB > iG)) {
                return X50.N(view);
            }
            i += i3;
        }
        return -1;
    }

    public Object f(Object obj) {
        AbstractC1474fG.j(obj, "key");
        synchronized (((C2743sL) this.g)) {
            C2938uM c2938uM = (C2938uM) this.f;
            c2938uM.getClass();
            Object obj2 = c2938uM.m.get(obj);
            if (obj2 != null) {
                this.d++;
                return obj2;
            }
            this.e++;
            return null;
        }
    }

    public int g(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.f).size() == 0) {
            return i;
        }
        a();
        return this.c;
    }

    public View h(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.f;
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.w && X50.N(view2) >= i) || ((!staggeredGridLayoutManager.w && X50.N(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = (View) arrayList.get(i3);
                if ((staggeredGridLayoutManager.w && X50.N(view3) <= i) || ((!staggeredGridLayoutManager.w && X50.N(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
        }
        return view;
    }

    public int i(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.f).size() == 0) {
            return i;
        }
        View view = (View) ((ArrayList) this.f).get(0);
        C1312dg0 c1312dg0 = (C1312dg0) view.getLayoutParams();
        this.b = ((StaggeredGridLayoutManager) this.g).r.e(view);
        c1312dg0.getClass();
        return this.b;
    }

    public int j() {
        int i;
        synchronized (((C2743sL) this.g)) {
            i = this.b;
        }
        return i;
    }

    public Object k(Object obj, Object obj2) {
        Object objPut;
        AbstractC1474fG.j(obj, "key");
        AbstractC1474fG.j(obj2, "value");
        synchronized (((C2743sL) this.g)) {
            this.c++;
            C2938uM c2938uM = (C2938uM) this.f;
            c2938uM.getClass();
            objPut = c2938uM.m.put(obj, obj2);
            if (objPut != null) {
                this.c--;
            }
        }
        n(this.b);
        return objPut;
    }

    public Object l(String str) {
        Object objRemove;
        AbstractC1474fG.j(str, "key");
        synchronized (((C2743sL) this.g)) {
            C2938uM c2938uM = (C2938uM) this.f;
            c2938uM.getClass();
            objRemove = c2938uM.m.remove(str);
            if (objRemove != null) {
                this.c--;
            }
        }
        return objRemove;
    }

    public int m() {
        int i;
        synchronized (((C2743sL) this.g)) {
            i = this.c;
        }
        return i;
    }

    public void n(int i) {
        while (true) {
            synchronized (((C2743sL) this.g)) {
                try {
                    if (this.c < 0 || (((C2938uM) this.f).m.isEmpty() && this.c != 0)) {
                        break;
                    }
                    if (this.c > i && !((C2938uM) this.f).m.isEmpty()) {
                        Set setEntrySet = ((C2938uM) this.f).m.entrySet();
                        AbstractC1474fG.i(setEntrySet, "map.entries");
                        Map.Entry entry = (Map.Entry) AbstractC0911Ye.c0(setEntrySet);
                        if (entry == null) {
                            return;
                        }
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        C2938uM c2938uM = (C2938uM) this.f;
                        c2938uM.getClass();
                        AbstractC1474fG.j(key, "key");
                        c2938uM.m.remove(key);
                        int i2 = this.c;
                        AbstractC1474fG.j(value, "value");
                        this.c = i2 - 1;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!".toString());
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 0:
                synchronized (((C2743sL) this.g)) {
                    try {
                        int i = this.d;
                        int i2 = this.e + i;
                        str = "LruCache[maxSize=" + this.b + ",hits=" + this.d + ",misses=" + this.e + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public C2841tM(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.a = 1;
        this.g = staggeredGridLayoutManager;
        this.f = new ArrayList();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
        this.e = i;
    }
}
