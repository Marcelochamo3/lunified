package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: o.Nx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0644Nx implements Parcelable {
    public static final Parcelable.Creator<C0644Nx> CREATOR = new C2230n1(21);
    public final String l;
    public final String m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f422o;
    public final int p;
    public final int q;
    public final String r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final int w;
    public final String x;
    public final int y;
    public final boolean z;

    public C0644Nx(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        this.l = abstractComponentCallbacksC1247cx.getClass().getName();
        this.m = abstractComponentCallbacksC1247cx.p;
        this.n = abstractComponentCallbacksC1247cx.z;
        this.f422o = abstractComponentCallbacksC1247cx.B;
        this.p = abstractComponentCallbacksC1247cx.J;
        this.q = abstractComponentCallbacksC1247cx.K;
        this.r = abstractComponentCallbacksC1247cx.L;
        this.s = abstractComponentCallbacksC1247cx.O;
        this.t = abstractComponentCallbacksC1247cx.w;
        this.u = abstractComponentCallbacksC1247cx.N;
        this.v = abstractComponentCallbacksC1247cx.M;
        this.w = abstractComponentCallbacksC1247cx.a0.ordinal();
        this.x = abstractComponentCallbacksC1247cx.s;
        this.y = abstractComponentCallbacksC1247cx.t;
        this.z = abstractComponentCallbacksC1247cx.U;
    }

    public final AbstractComponentCallbacksC1247cx a(C2611qx c2611qx) {
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxA = c2611qx.a(this.l);
        abstractComponentCallbacksC1247cxA.p = this.m;
        abstractComponentCallbacksC1247cxA.z = this.n;
        abstractComponentCallbacksC1247cxA.B = this.f422o;
        abstractComponentCallbacksC1247cxA.C = true;
        abstractComponentCallbacksC1247cxA.J = this.p;
        abstractComponentCallbacksC1247cxA.K = this.q;
        abstractComponentCallbacksC1247cxA.L = this.r;
        abstractComponentCallbacksC1247cxA.O = this.s;
        abstractComponentCallbacksC1247cxA.w = this.t;
        abstractComponentCallbacksC1247cxA.N = this.u;
        abstractComponentCallbacksC1247cxA.M = this.v;
        abstractComponentCallbacksC1247cxA.a0 = TJ.values()[this.w];
        abstractComponentCallbacksC1247cxA.s = this.x;
        abstractComponentCallbacksC1247cxA.t = this.y;
        abstractComponentCallbacksC1247cxA.U = this.z;
        return abstractComponentCallbacksC1247cxA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.l);
        sb.append(" (");
        sb.append(this.m);
        sb.append(")}:");
        if (this.n) {
            sb.append(" fromLayout");
        }
        if (this.f422o) {
            sb.append(" dynamicContainer");
        }
        int i = this.q;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.r;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.s) {
            sb.append(" retainInstance");
        }
        if (this.t) {
            sb.append(" removing");
        }
        if (this.u) {
            sb.append(" detached");
        }
        if (this.v) {
            sb.append(" hidden");
        }
        String str2 = this.x;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.y);
        }
        if (this.z) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeInt(this.f422o ? 1 : 0);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeString(this.r);
        parcel.writeInt(this.s ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.u ? 1 : 0);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.w);
        parcel.writeString(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z ? 1 : 0);
    }

    public C0644Nx(Parcel parcel) {
        this.l = parcel.readString();
        this.m = parcel.readString();
        this.n = parcel.readInt() != 0;
        this.f422o = parcel.readInt() != 0;
        this.p = parcel.readInt();
        this.q = parcel.readInt();
        this.r = parcel.readString();
        this.s = parcel.readInt() != 0;
        this.t = parcel.readInt() != 0;
        this.u = parcel.readInt() != 0;
        this.v = parcel.readInt() != 0;
        this.w = parcel.readInt();
        this.x = parcel.readString();
        this.y = parcel.readInt();
        this.z = parcel.readInt() != 0;
    }
}
