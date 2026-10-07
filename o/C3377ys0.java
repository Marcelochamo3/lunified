package o;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: o.ys0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3377ys0 extends AbstractC3280xs0 {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public C3377ys0(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new S5(), new S5(), new S5());
    }

    @Override // o.AbstractC3280xs0
    public final C3377ys0 a() {
        Parcel parcel = this.e;
        int iDataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        return new C3377ys0(parcel, iDataPosition, i, AbstractC1701hf0.h(new StringBuilder(), this.h, "  "), this.a, this.b, this.c);
    }

    @Override // o.AbstractC3280xs0
    public final boolean e(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i3);
            int i4 = parcel.readInt();
            this.k = parcel.readInt();
            this.j += i4;
        }
        return this.k == i;
    }

    @Override // o.AbstractC3280xs0
    public final void i(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public C3377ys0(Parcel parcel, int i, int i2, String str, S5 s5, S5 s6, S5 s7) {
        super(s5, s6, s7);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
