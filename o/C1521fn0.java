package o;

import android.R;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: renamed from: o.fn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1521fn0 extends O50 {
    public final List d;
    public final InterfaceC0412Ey e;
    public final InterfaceC0360Cy f;
    public final RecyclerView g;
    public int h;
    public final Handler i = new Handler(Looper.getMainLooper());
    public Runnable j;

    public C1521fn0(List list, int i, io.sentry.android.replay.p pVar, io.sentry.android.replay.f fVar, RecyclerView recyclerView) {
        this.d = list;
        this.e = pVar;
        this.f = fVar;
        this.g = recyclerView;
        this.h = i;
    }

    @Override // o.O50
    public final int a() {
        return this.d.size();
    }

    @Override // o.O50
    public final void e(AbstractC2144m60 abstractC2144m60, int i) {
        C1423en0 c1423en0 = (C1423en0) abstractC2144m60;
        String str = (String) this.d.get(i);
        TextView textView = c1423en0.u;
        textView.setText(str);
        boolean z = i == this.h;
        View view = c1423en0.a;
        view.setSelected(z);
        if (i == this.h) {
            textView.setTextColor(-1);
        } else {
            if (view.isFocused()) {
                return;
            }
            textView.setTextColor(view.getContext().getResources().getColor(R.color.darker_gray));
        }
    }

    @Override // o.O50
    public final AbstractC2144m60 f(int i, RecyclerView recyclerView) {
        AbstractC1474fG.j(recyclerView, "parent");
        View viewInflate = LayoutInflater.from(recyclerView.getContext()).inflate(com.skidush.clonex.R.layout.item_tv_category_group, (ViewGroup) recyclerView, false);
        AbstractC1474fG.g(viewInflate);
        return new C1423en0(this, viewInflate);
    }
}
