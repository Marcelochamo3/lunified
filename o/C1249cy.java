package o;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.cy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1249cy implements Bm0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ ArrayList b;

    public C1249cy(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // o.Bm0
    public final void d(Cm0 cm0) {
        f(cm0);
    }

    @Override // o.Bm0
    public final void e(Cm0 cm0) {
        g(cm0);
    }

    @Override // o.Bm0
    public final void f(Cm0 cm0) {
        cm0.E(this);
        this.a.setVisibility(8);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // o.Bm0
    public final void g(Cm0 cm0) {
        cm0.E(this);
        cm0.b(this);
    }

    @Override // o.Bm0
    public final void b() {
    }

    @Override // o.Bm0
    public final void c() {
    }

    @Override // o.Bm0
    public final void a(Cm0 cm0) {
    }
}
