package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Ce0 implements BQ {
    public static final Parcelable.Creator<Ce0> CREATOR = new Ae0(0);
    public final List l;

    public Ce0(ArrayList arrayList) {
        this.l = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((Be0) arrayList.get(0)).m;
            for (int i = 1; i < arrayList.size(); i++) {
                if (((Be0) arrayList.get(i)).l < j) {
                    z = true;
                    break;
                }
                j = ((Be0) arrayList.get(i)).m;
            }
        }
        AbstractC0397Ej.c(!z);
    }

    @Override // o.BQ
    public final /* synthetic */ C0643Nw b() {
        return null;
    }

    @Override // o.BQ
    public final /* synthetic */ byte[] c() {
        return null;
    }

    @Override // o.BQ
    public final /* synthetic */ void d(C2166mP c2166mP) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Ce0.class != obj.getClass()) {
            return false;
        }
        return this.l.equals(((Ce0) obj).l);
    }

    public final int hashCode() {
        return this.l.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.l);
    }
}
