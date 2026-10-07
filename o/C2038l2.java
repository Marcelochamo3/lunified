package o;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: renamed from: o.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2038l2 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController$RecycleListView l;
    public final /* synthetic */ C2426p2 m;
    public final /* synthetic */ C2135m2 n;

    public C2038l2(C2135m2 c2135m2, AlertController$RecycleListView alertController$RecycleListView, C2426p2 c2426p2) {
        this.n = c2135m2;
        this.l = alertController$RecycleListView;
        this.m = c2426p2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C2135m2 c2135m2 = this.n;
        boolean[] zArr = c2135m2.q;
        AlertController$RecycleListView alertController$RecycleListView = this.l;
        if (zArr != null) {
            zArr[i] = alertController$RecycleListView.isItemChecked(i);
        }
        c2135m2.u.onClick(this.m.b, i, alertController$RecycleListView.isItemChecked(i));
    }
}
