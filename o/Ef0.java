package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Ef0 extends Bf0 {
    public static final Parcelable.Creator<Ef0> CREATOR = new Ae0(3);
    public final long l;
    public final boolean m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f242o;
    public final boolean p;
    public final long q;
    public final long r;
    public final List s;
    public final boolean t;
    public final long u;
    public final int v;
    public final int w;
    public final int x;

    public Ef0(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List list, boolean z5, long j4, int i, int i2, int i3) {
        this.l = j;
        this.m = z;
        this.n = z2;
        this.f242o = z3;
        this.p = z4;
        this.q = j2;
        this.r = j3;
        this.s = Collections.unmodifiableList(list);
        this.t = z5;
        this.u = j4;
        this.v = i;
        this.w = i2;
        this.x = i3;
    }

    @Override // o.Bf0
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.q);
        sb.append(", programSplicePlaybackPositionUs= ");
        return AbstractC1674hK.q(sb, this.r, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.l);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f242o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.p ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.q);
        parcel.writeLong(this.r);
        List list = this.s;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Df0 df0 = (Df0) list.get(i2);
            parcel.writeInt(df0.a);
            parcel.writeLong(df0.b);
            parcel.writeLong(df0.c);
        }
        parcel.writeByte(this.t ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
    }

    public Ef0(Parcel parcel) {
        this.l = parcel.readLong();
        this.m = parcel.readByte() == 1;
        this.n = parcel.readByte() == 1;
        this.f242o = parcel.readByte() == 1;
        this.p = parcel.readByte() == 1;
        this.q = parcel.readLong();
        this.r = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new Df0(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.s = Collections.unmodifiableList(arrayList);
        this.t = parcel.readByte() == 1;
        this.u = parcel.readLong();
        this.v = parcel.readInt();
        this.w = parcel.readInt();
        this.x = parcel.readInt();
    }
}
