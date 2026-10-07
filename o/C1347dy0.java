package o;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;
import java.util.Locale;

/* JADX INFO: renamed from: o.dy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1347dy0 extends O50 {
    public final C1287dO d;

    public C1347dy0(C1287dO c1287dO) {
        this.d = c1287dO;
    }

    @Override // o.O50
    public final int a() {
        return this.d.n0.q;
    }

    @Override // o.O50
    public final void e(AbstractC2144m60 abstractC2144m60, int i) {
        C1287dO c1287dO = this.d;
        int i2 = c1287dO.n0.l.n + i;
        String str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((C1250cy0) abstractC2144m60).u;
        textView.setText(str);
        Context context = textView.getContext();
        textView.setContentDescription(Er0.c().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        C2720s4 c2720s4 = c1287dO.q0;
        if (Er0.c().get(1) == i2) {
            Object obj = c2720s4.n;
        } else {
            Object obj2 = c2720s4.m;
        }
        throw null;
    }

    @Override // o.O50
    public final AbstractC2144m60 f(int i, RecyclerView recyclerView) {
        return new C1250cy0((TextView) AbstractC1674hK.k(recyclerView, R.layout.mtrl_calendar_year, recyclerView, false));
    }
}
