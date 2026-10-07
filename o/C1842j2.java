package o;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: renamed from: o.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1842j2 extends ArrayAdapter {
    public final /* synthetic */ AlertController$RecycleListView a;
    public final /* synthetic */ C2135m2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1842j2(C2135m2 c2135m2, Context context, int i, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(context, i, R.id.text1, charSequenceArr);
        this.b = c2135m2;
        this.a = alertController$RecycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.b.q;
        if (zArr != null && zArr[i]) {
            this.a.setItemChecked(i, true);
        }
        return view2;
    }
}
