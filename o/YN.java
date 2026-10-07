package o;

import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class YN implements View.OnClickListener {
    public final /* synthetic */ int l;
    public final Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ YN(C1287dO c1287dO, com.google.android.material.datepicker.c cVar, int i) {
        this.l = i;
        this.n = c1287dO;
        this.m = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.l) {
            case 0:
                C1287dO c1287dO = (C1287dO) this.n;
                int iG1 = ((LinearLayoutManager) c1287dO.s0.getLayoutManager()).g1() - 1;
                if (iG1 >= 0) {
                    Calendar calendarB = Er0.b(((com.google.android.material.datepicker.c) this.m).d.l.l);
                    calendarB.add(2, iG1);
                    c1287dO.W(new WQ(calendarB));
                }
                break;
            case 1:
                C1287dO c1287dO2 = (C1287dO) this.n;
                int iF1 = ((LinearLayoutManager) c1287dO2.s0.getLayoutManager()).f1() + 1;
                if (iF1 < c1287dO2.s0.getAdapter().a()) {
                    Calendar calendarB2 = Er0.b(((com.google.android.material.datepicker.c) this.m).d.l.l);
                    calendarB2.add(2, iF1);
                    c1287dO2.W(new WQ(calendarB2));
                }
                break;
            default:
                Ol0 ol0 = (Ol0) this.n;
                Window.Callback callback = ol0.k;
                if (callback != null && ol0.l) {
                    callback.onMenuItemSelected(0, (C1450f1) this.m);
                    break;
                }
                break;
        }
    }

    public YN(Ol0 ol0) {
        this.l = 2;
        this.n = ol0;
        this.m = new C1450f1(ol0.a.getContext(), ol0.h);
    }
}
