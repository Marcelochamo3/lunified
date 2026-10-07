package o;

import android.os.Build;
import android.text.format.DateUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: o.cO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1189cO extends AbstractC0973a60 {
    public final /* synthetic */ com.google.android.material.datepicker.c a;
    public final /* synthetic */ MaterialButton b;
    public final /* synthetic */ C1287dO c;

    public C1189cO(C1287dO c1287dO, com.google.android.material.datepicker.c cVar, MaterialButton materialButton) {
        this.c = c1287dO;
        this.a = cVar;
        this.b = materialButton;
    }

    @Override // o.AbstractC0973a60
    public final void a(int i, RecyclerView recyclerView) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.b.getText());
        }
    }

    @Override // o.AbstractC0973a60
    public final void b(RecyclerView recyclerView, int i, int i2) {
        C1287dO c1287dO = this.c;
        int iF1 = i < 0 ? ((LinearLayoutManager) c1287dO.s0.getLayoutManager()).f1() : ((LinearLayoutManager) c1287dO.s0.getLayoutManager()).g1();
        com.google.android.material.datepicker.c cVar = this.a;
        Calendar calendarB = Er0.b(cVar.d.l.l);
        calendarB.add(2, iF1);
        c1287dO.o0 = new WQ(calendarB);
        Calendar calendarB2 = Er0.b(cVar.d.l.l);
        calendarB2.add(2, iF1);
        calendarB2.set(5, 1);
        Calendar calendarB3 = Er0.b(calendarB2);
        calendarB3.get(2);
        calendarB3.get(1);
        calendarB3.getMaximum(7);
        calendarB3.getActualMaximum(5);
        calendarB3.getTimeInMillis();
        long timeInMillis = calendarB3.getTimeInMillis();
        this.b.setText(Build.VERSION.SDK_INT >= 24 ? Er0.a("yMMMM", Locale.getDefault()).format(new Date(timeInMillis)) : DateUtils.formatDateTime(null, timeInMillis, 8228));
    }
}
