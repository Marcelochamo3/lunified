package o;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: renamed from: o.La, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0570La implements Parcelable {
    public static final Parcelable.Creator<C0570La> CREATOR = new C2230n1(9);
    public final WQ l;
    public final WQ m;
    public final C3455zj n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final WQ f383o;
    public final int p;
    public final int q;
    public final int r;

    public C0570La(WQ wq, WQ wq2, C3455zj c3455zj, WQ wq3, int i) {
        Objects.requireNonNull(wq, "start cannot be null");
        Objects.requireNonNull(wq2, "end cannot be null");
        Objects.requireNonNull(c3455zj, "validator cannot be null");
        this.l = wq;
        this.m = wq2;
        this.f383o = wq3;
        this.p = i;
        this.n = c3455zj;
        if (wq3 != null && wq.l.compareTo(wq3.l) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (wq3 != null && wq3.l.compareTo(wq2.l) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > Er0.d(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.r = wq.g(wq2) + 1;
        this.q = (wq2.n - wq.n) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0570La)) {
            return false;
        }
        C0570La c0570La = (C0570La) obj;
        return this.l.equals(c0570La.l) && this.m.equals(c0570La.m) && Objects.equals(this.f383o, c0570La.f383o) && this.p == c0570La.p && this.n.equals(c0570La.n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.l, this.m, this.f383o, Integer.valueOf(this.p), this.n});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.l, 0);
        parcel.writeParcelable(this.m, 0);
        parcel.writeParcelable(this.f383o, 0);
        parcel.writeParcelable(this.n, 0);
        parcel.writeInt(this.p);
    }
}
