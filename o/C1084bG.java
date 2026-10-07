package o;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: o.bG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1084bG implements Parcelable {
    public static final Parcelable.Creator<C1084bG> CREATOR = new C2230n1(28);
    public final IntentSender l;
    public final Intent m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f693o;

    public C1084bG(IntentSender intentSender, Intent intent, int i, int i2) {
        AbstractC1474fG.j(intentSender, "intentSender");
        this.l = intentSender;
        this.m = intent;
        this.n = i;
        this.f693o = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC1474fG.j(parcel, "dest");
        parcel.writeParcelable(this.l, i);
        parcel.writeParcelable(this.m, i);
        parcel.writeInt(this.n);
        parcel.writeInt(this.f693o);
    }
}
