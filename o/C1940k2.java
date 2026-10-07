package o;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: o.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1940k2 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C2426p2 l;
    public final /* synthetic */ C2135m2 m;

    public C1940k2(C2135m2 c2135m2, C2426p2 c2426p2) {
        this.m = c2135m2;
        this.l = c2426p2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C2135m2 c2135m2 = this.m;
        DialogInterface.OnClickListener onClickListener = c2135m2.f907o;
        C2426p2 c2426p2 = this.l;
        onClickListener.onClick(c2426p2.b, i);
        if (c2135m2.s) {
            return;
        }
        c2426p2.b.dismiss();
    }
}
