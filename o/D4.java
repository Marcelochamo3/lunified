package o;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class D4 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ D4(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        switch (this.l) {
            case 0:
                F4 f4 = (F4) this.m;
                f4.S.setSelection(i);
                if (f4.S.getOnItemClickListener() != null) {
                    f4.S.performItemClick(view, i, f4.P.getItemId(i));
                }
                f4.dismiss();
                break;
            default:
                LN ln = (LN) this.m;
                if (i < 0) {
                    JK jk = ln.p;
                    item = !jk.K.isShowing() ? null : jk.n.getSelectedItem();
                } else {
                    item = ln.getAdapter().getItem(i);
                }
                LN.a(ln, item);
                AdapterView.OnItemClickListener onItemClickListener = ln.getOnItemClickListener();
                JK jk2 = ln.p;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = jk2.K.isShowing() ? jk2.n.getSelectedView() : null;
                        i = !jk2.K.isShowing() ? -1 : jk2.n.getSelectedItemPosition();
                        j = !jk2.K.isShowing() ? Long.MIN_VALUE : jk2.n.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(jk2.n, view, i, j);
                }
                jk2.dismiss();
                break;
        }
    }
}
