package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.m60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2144m60 {
    public static final List t = Collections.emptyList();
    public final View a;
    public WeakReference b;
    public int j;
    public RecyclerView r;
    public O50 s;
    public int c = -1;
    public int d = -1;
    public long e = -1;
    public int f = -1;
    public int g = -1;
    public AbstractC2144m60 h = null;
    public AbstractC2144m60 i = null;
    public ArrayList k = null;
    public List l = null;
    public int m = 0;
    public C1266d60 n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f909o = false;
    public int p = 0;
    public int q = -1;

    public AbstractC2144m60(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.a = view;
    }

    public final void a(Object obj) {
        if (obj == null) {
            b(1024);
            return;
        }
        if ((1024 & this.j) == 0) {
            if (this.k == null) {
                ArrayList arrayList = new ArrayList();
                this.k = arrayList;
                this.l = Collections.unmodifiableList(arrayList);
            }
            this.k.add(obj);
        }
    }

    public final void b(int i) {
        this.j = i | this.j;
    }

    public final int c() {
        RecyclerView recyclerView = this.r;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.I(this);
    }

    public final int d() {
        RecyclerView recyclerView;
        O50 adapter;
        int I;
        if (this.s == null || (recyclerView = this.r) == null || (adapter = recyclerView.getAdapter()) == null || (I = this.r.I(this)) == -1 || this.s != adapter) {
            return -1;
        }
        return I;
    }

    public final int e() {
        int i = this.g;
        return i == -1 ? this.c : i;
    }

    public final List f() {
        ArrayList arrayList;
        return ((this.j & 1024) != 0 || (arrayList = this.k) == null || arrayList.size() == 0) ? t : this.l;
    }

    public final boolean g(int i) {
        return (i & this.j) != 0;
    }

    public final boolean h() {
        View view = this.a;
        return (view.getParent() == null || view.getParent() == this.r) ? false : true;
    }

    public final boolean i() {
        return (this.j & 1) != 0;
    }

    public final boolean j() {
        return (this.j & 4) != 0;
    }

    public final boolean k() {
        if ((this.j & 16) == 0) {
            WeakHashMap weakHashMap = It0.a;
            if (!this.a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        return (this.j & 8) != 0;
    }

    public final boolean m() {
        return this.n != null;
    }

    public final boolean n() {
        return (this.j & 256) != 0;
    }

    public final boolean o() {
        return (this.j & 2) != 0;
    }

    public final void p(int i, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        if (this.g == -1) {
            this.g = this.c;
        }
        if (z) {
            this.g += i;
        }
        this.c += i;
        View view = this.a;
        if (view.getLayoutParams() != null) {
            ((Y50) view.getLayoutParams()).c = true;
        }
    }

    public final void q() {
        this.j = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.g = -1;
        this.m = 0;
        this.h = null;
        this.i = null;
        ArrayList arrayList = this.k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.j &= -1025;
        this.p = 0;
        this.q = -1;
        RecyclerView.j(this);
    }

    public final void r(boolean z) {
        int i = this.m;
        int i2 = z ? i - 1 : i + 1;
        this.m = i2;
        if (i2 < 0) {
            this.m = 0;
            toString();
        } else if (!z && i2 == 1) {
            this.j |= 16;
        } else if (z && i2 == 0) {
            this.j &= -17;
        }
    }

    public final boolean s() {
        return (this.j & 128) != 0;
    }

    public final boolean t() {
        return (this.j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sbS = AbstractC1674hK.s(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        sbS.append(Integer.toHexString(hashCode()));
        sbS.append(" position=");
        sbS.append(this.c);
        sbS.append(" id=");
        sbS.append(this.e);
        sbS.append(", oldPos=");
        sbS.append(this.d);
        sbS.append(", pLpos:");
        sbS.append(this.g);
        StringBuilder sb = new StringBuilder(sbS.toString());
        if (m()) {
            sb.append(" scrap ");
            sb.append(this.f909o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (j()) {
            sb.append(" invalid");
        }
        if (!i()) {
            sb.append(" unbound");
        }
        if ((this.j & 2) != 0) {
            sb.append(" update");
        }
        if (l()) {
            sb.append(" removed");
        }
        if (s()) {
            sb.append(" ignored");
        }
        if (n()) {
            sb.append(" tmpDetached");
        }
        if (!k()) {
            sb.append(" not recyclable(" + this.m + ")");
        }
        if ((this.j & 512) != 0 || j()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
