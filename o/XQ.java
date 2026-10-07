package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.skidush.clonex.R;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class XQ extends BaseAdapter {
    public static final int d = Er0.d(null).getMaximum(4);
    public static final int e = (Er0.d(null).getMaximum(7) + Er0.d(null).getMaximum(5)) - 1;
    public final WQ a;
    public C2720s4 b;
    public final C0570La c;

    public XQ(WQ wq, C0570La c0570La) {
        this.a = wq;
        this.c = c0570La;
        throw null;
    }

    public final int a() {
        int firstDayOfWeek = this.c.p;
        WQ wq = this.a;
        Calendar calendar = wq.l;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + wq.f594o : i2;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < a() || i > c()) {
            return null;
        }
        int iA = (i - a()) + 1;
        Calendar calendarB = Er0.b(this.a.l);
        calendarB.set(5, iA);
        return Long.valueOf(calendarB.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.a.p) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.a.f594o;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.b == null) {
            this.b = new C2720s4(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iA = i - a();
        if (iA >= 0) {
            WQ wq = this.a;
            if (iA >= wq.p) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                textView.setTag(wq);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(iA + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        if (getItem(i) == null || textView == null) {
            return textView;
        }
        textView.getContext();
        Er0.c().getTimeInMillis();
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
