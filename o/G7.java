package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class G7 implements Parcelable {
    public static final Parcelable.Creator<G7> CREATOR = new C2230n1(5);
    public final int[] l;
    public final ArrayList m;
    public final int[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int[] f272o;
    public final int p;
    public final String q;
    public final int r;
    public final int s;
    public final CharSequence t;
    public final int u;
    public final CharSequence v;
    public final ArrayList w;
    public final ArrayList x;
    public final boolean y;

    public G7(F7 f7) {
        int size = f7.a.size();
        this.l = new int[size * 6];
        if (!f7.g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.m = new ArrayList(size);
        this.n = new int[size];
        this.f272o = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0774Sx c0774Sx = (C0774Sx) f7.a.get(i2);
            int i3 = i + 1;
            this.l[i] = c0774Sx.a;
            ArrayList arrayList = this.m;
            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = c0774Sx.b;
            arrayList.add(abstractComponentCallbacksC1247cx != null ? abstractComponentCallbacksC1247cx.p : null);
            int[] iArr = this.l;
            iArr[i3] = c0774Sx.c ? 1 : 0;
            iArr[i + 2] = c0774Sx.d;
            iArr[i + 3] = c0774Sx.e;
            int i4 = i + 5;
            iArr[i + 4] = c0774Sx.f;
            i += 6;
            iArr[i4] = c0774Sx.g;
            this.n[i2] = c0774Sx.h.ordinal();
            this.f272o[i2] = c0774Sx.i.ordinal();
        }
        this.p = f7.f;
        this.q = f7.i;
        this.r = f7.t;
        this.s = f7.j;
        this.t = f7.k;
        this.u = f7.l;
        this.v = f7.m;
        this.w = f7.n;
        this.x = f7.f255o;
        this.y = f7.p;
    }

    public final void a(F7 f7) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.l;
            boolean z = true;
            if (i >= iArr.length) {
                f7.f = this.p;
                f7.i = this.q;
                f7.g = true;
                f7.j = this.s;
                f7.k = this.t;
                f7.l = this.u;
                f7.m = this.v;
                f7.n = this.w;
                f7.f255o = this.x;
                f7.p = this.y;
                return;
            }
            C0774Sx c0774Sx = new C0774Sx();
            int i3 = i + 1;
            c0774Sx.a = iArr[i];
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(f7);
                int i4 = iArr[i3];
            }
            c0774Sx.h = TJ.values()[this.n[i2]];
            c0774Sx.i = TJ.values()[this.f272o[i2]];
            int i5 = i + 2;
            if (iArr[i3] == 0) {
                z = false;
            }
            c0774Sx.c = z;
            int i6 = iArr[i5];
            c0774Sx.d = i6;
            int i7 = iArr[i + 3];
            c0774Sx.e = i7;
            int i8 = i + 5;
            int i9 = iArr[i + 4];
            c0774Sx.f = i9;
            i += 6;
            int i10 = iArr[i8];
            c0774Sx.g = i10;
            f7.b = i6;
            f7.c = i7;
            f7.d = i9;
            f7.e = i10;
            f7.b(c0774Sx);
            i2++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.l);
        parcel.writeStringList(this.m);
        parcel.writeIntArray(this.n);
        parcel.writeIntArray(this.f272o);
        parcel.writeInt(this.p);
        parcel.writeString(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        TextUtils.writeToParcel(this.t, parcel, 0);
        parcel.writeInt(this.u);
        TextUtils.writeToParcel(this.v, parcel, 0);
        parcel.writeStringList(this.w);
        parcel.writeStringList(this.x);
        parcel.writeInt(this.y ? 1 : 0);
    }

    public G7(Parcel parcel) {
        this.l = parcel.createIntArray();
        this.m = parcel.createStringArrayList();
        this.n = parcel.createIntArray();
        this.f272o = parcel.createIntArray();
        this.p = parcel.readInt();
        this.q = parcel.readString();
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.t = (CharSequence) creator.createFromParcel(parcel);
        this.u = parcel.readInt();
        this.v = (CharSequence) creator.createFromParcel(parcel);
        this.w = parcel.createStringArrayList();
        this.x = parcel.createStringArrayList();
        this.y = parcel.readInt() != 0;
    }
}
