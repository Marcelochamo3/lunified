package o;

import android.R;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: renamed from: o.hn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1717hn0 extends O50 {
    public final String e;
    public final InterfaceC0412Ey f;
    public List d = C1233cq.l;
    public RecyclerView g = null;
    public InterfaceC0360Cy h = null;

    public C1717hn0(String str, io.sentry.android.replay.capture.e eVar) {
        this.e = str;
        this.f = eVar;
    }

    @Override // o.O50
    public final int a() {
        return this.d.size();
    }

    @Override // o.O50
    public final void e(AbstractC2144m60 abstractC2144m60, int i) {
        C1619gn0 c1619gn0 = (C1619gn0) abstractC2144m60;
        C1387eR c1387eR = (C1387eR) this.d.get(i);
        String str = c1387eR.b;
        TextView textView = c1619gn0.u;
        textView.setText(str);
        boolean zB = AbstractC1474fG.b(c1387eR.a, this.e);
        View view = c1619gn0.a;
        if (zB) {
            textView.setTextColor(Color.parseColor("#03DAC5"));
            view.setAlpha(1.0f);
        } else if (view.isFocused()) {
            textView.setTextColor(-1);
            view.setAlpha(1.0f);
        } else {
            textView.setTextColor(view.getContext().getResources().getColor(R.color.darker_gray));
            view.setAlpha(0.7f);
        }
        view.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0637Nq(c1387eR, this, c1619gn0, 2));
        ((C2630r70) ((C2630r70) com.bumptech.glide.a.e(view.getContext()).n(c1387eR.h).q(com.skidush.clonex.R.drawable.placeholder_tv)).h(com.skidush.clonex.R.drawable.placeholder_tv)).H(c1619gn0.v);
    }

    @Override // o.O50
    public final AbstractC2144m60 f(int i, RecyclerView recyclerView) {
        AbstractC1474fG.j(recyclerView, "parent");
        View viewInflate = LayoutInflater.from(recyclerView.getContext()).inflate(com.skidush.clonex.R.layout.item_tv_channel_child, (ViewGroup) recyclerView, false);
        AbstractC1474fG.g(viewInflate);
        return new C1619gn0(this, viewInflate);
    }
}
