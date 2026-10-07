package o;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class WQ implements Comparable, Parcelable {
    public static final Parcelable.Creator<WQ> CREATOR = new C2452pK(12);
    public final Calendar l;
    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f594o;
    public final int p;
    public final long q;
    public String r;

    public WQ(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarB = Er0.b(calendar);
        this.l = calendarB;
        this.m = calendarB.get(2);
        this.n = calendarB.get(1);
        this.f594o = calendarB.getMaximum(7);
        this.p = calendarB.getActualMaximum(5);
        this.q = calendarB.getTimeInMillis();
    }

    public static WQ a(int i, int i2) {
        Calendar calendarD = Er0.d(null);
        calendarD.set(1, i);
        calendarD.set(2, i2);
        return new WQ(calendarD);
    }

    public static WQ e(long j) {
        Calendar calendarD = Er0.d(null);
        calendarD.setTimeInMillis(j);
        return new WQ(calendarD);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.l.compareTo(((WQ) obj).l);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WQ)) {
            return false;
        }
        WQ wq = (WQ) obj;
        return this.m == wq.m && this.n == wq.n;
    }

    public final String f() {
        if (this.r == null) {
            long timeInMillis = this.l.getTimeInMillis();
            this.r = Build.VERSION.SDK_INT >= 24 ? Er0.a("yMMMM", Locale.getDefault()).format(new Date(timeInMillis)) : DateUtils.formatDateTime(null, timeInMillis, 8228);
        }
        return this.r;
    }

    public final int g(WQ wq) {
        if (!(this.l instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (wq.m - this.m) + ((wq.n - this.n) * 12);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.m), Integer.valueOf(this.n)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.n);
        parcel.writeInt(this.m);
    }
}
