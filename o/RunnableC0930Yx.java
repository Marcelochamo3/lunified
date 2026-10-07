package o;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.Yx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0930Yx implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ ArrayList m;
    public final /* synthetic */ ArrayList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f646o;
    public final /* synthetic */ ArrayList p;

    public RunnableC0930Yx(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.l = i;
        this.m = arrayList;
        this.n = arrayList2;
        this.f646o = arrayList3;
        this.p = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.l; i++) {
            View view = (View) this.m.get(i);
            String str = (String) this.n.get(i);
            WeakHashMap weakHashMap = It0.a;
            AbstractC3185wt0.v(view, str);
            AbstractC3185wt0.v((View) this.f646o.get(i), (String) this.p.get(i));
        }
    }
}
