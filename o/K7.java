package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class K7 implements Parcelable {
    public static final Parcelable.Creator<K7> CREATOR = new C2230n1(7);
    public CharSequence A;
    public int B;
    public int C;
    public Integer D;
    public Boolean E;
    public Integer F;
    public Integer G;
    public Integer H;
    public Integer I;
    public Integer J;
    public Integer K;
    public Integer L;
    public Integer M;
    public Integer N;
    public Boolean O;
    public int l;
    public Integer m;
    public Integer n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f356o;
    public Integer p;
    public Integer q;
    public Integer r;
    public Integer s;
    public int t;
    public String u;
    public int v;
    public int w;
    public int x;
    public Locale y;
    public CharSequence z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.l);
        parcel.writeSerializable(this.m);
        parcel.writeSerializable(this.n);
        parcel.writeSerializable(this.f356o);
        parcel.writeSerializable(this.p);
        parcel.writeSerializable(this.q);
        parcel.writeSerializable(this.r);
        parcel.writeSerializable(this.s);
        parcel.writeInt(this.t);
        parcel.writeString(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        CharSequence charSequence = this.z;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.A;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.B);
        parcel.writeSerializable(this.D);
        parcel.writeSerializable(this.F);
        parcel.writeSerializable(this.G);
        parcel.writeSerializable(this.H);
        parcel.writeSerializable(this.I);
        parcel.writeSerializable(this.J);
        parcel.writeSerializable(this.K);
        parcel.writeSerializable(this.N);
        parcel.writeSerializable(this.L);
        parcel.writeSerializable(this.M);
        parcel.writeSerializable(this.E);
        parcel.writeSerializable(this.y);
        parcel.writeSerializable(this.O);
    }
}
