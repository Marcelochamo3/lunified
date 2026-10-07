package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.skidush.clonex.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class BK extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ CK b;

    public BK(CK ck) {
        this.b = ck;
        a();
    }

    public final void a() {
        ZP zp = this.b.n;
        C1386eQ c1386eQ = zp.v;
        if (c1386eQ != null) {
            zp.i();
            ArrayList arrayList = zp.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C1386eQ) arrayList.get(i)) == c1386eQ) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1386eQ getItem(int i) {
        CK ck = this.b;
        ZP zp = ck.n;
        zp.i();
        ArrayList arrayList = zp.j;
        ck.getClass();
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C1386eQ) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        CK ck = this.b;
        ZP zp = ck.n;
        zp.i();
        int size = zp.j.size();
        ck.getClass();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.m.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC2748sQ) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
