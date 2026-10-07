package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.leanback.widget.VerticalGridView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class JY extends O50 {
    public final int d;
    public final int e;
    public final int f;
    public final MY g;
    public final /* synthetic */ LY h;

    public JY(LY ly, int i, int i2, int i3) {
        this.h = ly;
        this.d = i;
        this.e = i3;
        this.f = i2;
        this.g = (MY) ly.n.get(i3);
    }

    @Override // o.O50
    public final int a() {
        MY my = this.g;
        if (my == null) {
            return 0;
        }
        return (my.c - my.b) + 1;
    }

    @Override // o.O50
    public final void e(AbstractC2144m60 abstractC2144m60, int i) {
        MY my;
        KY ky = (KY) abstractC2144m60;
        TextView textView = ky.u;
        if (textView != null && (my = this.g) != null) {
            int i2 = my.b + i;
            CharSequence[] charSequenceArr = my.d;
            textView.setText(charSequenceArr == null ? String.format(my.e, Integer.valueOf(i2)) : charSequenceArr[i2]);
        }
        LY ly = this.h;
        ArrayList arrayList = ly.m;
        int i3 = this.e;
        ly.c(ky.a, ((VerticalGridView) arrayList.get(i3)).getSelectedPosition() == i, i3, false);
    }

    @Override // o.O50
    public final AbstractC2144m60 f(int i, RecyclerView recyclerView) {
        View viewInflate = LayoutInflater.from(recyclerView.getContext()).inflate(this.d, (ViewGroup) recyclerView, false);
        int i2 = this.f;
        return new KY(viewInflate, i2 != 0 ? (TextView) viewInflate.findViewById(i2) : (TextView) viewInflate);
    }

    @Override // o.O50
    public final void g(AbstractC2144m60 abstractC2144m60) {
        ((KY) abstractC2144m60).a.setFocusable(this.h.isActivated());
    }
}
