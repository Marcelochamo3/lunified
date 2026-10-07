package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ET implements Parcelable {
    public static final Parcelable.Creator<ET> CREATOR = new C2452pK(16);
    public final String l;
    public final int m;
    public final Bundle n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Bundle f238o;

    public ET(DT dt) {
        AbstractC1474fG.j(dt, "entry");
        this.l = dt.q;
        this.m = dt.m.s;
        this.n = dt.b();
        Bundle bundle = new Bundle();
        this.f238o = bundle;
        dt.t.i(bundle);
    }

    public final DT a(Context context, TT tt, TJ tj, LT lt) {
        AbstractC1474fG.j(context, "context");
        AbstractC1474fG.j(tj, "hostLifecycleState");
        Bundle bundle = this.n;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        String str = this.l;
        AbstractC1474fG.j(str, "id");
        return new DT(context, tt, bundle2, tj, lt, str, this.f238o);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC1474fG.j(parcel, "parcel");
        parcel.writeString(this.l);
        parcel.writeInt(this.m);
        parcel.writeBundle(this.n);
        parcel.writeBundle(this.f238o);
    }

    public ET(Parcel parcel) {
        AbstractC1474fG.j(parcel, "inParcel");
        String string = parcel.readString();
        AbstractC1474fG.g(string);
        this.l = string;
        this.m = parcel.readInt();
        this.n = parcel.readBundle(ET.class.getClassLoader());
        Bundle bundle = parcel.readBundle(ET.class.getClassLoader());
        AbstractC1474fG.g(bundle);
        this.f238o = bundle;
    }
}
