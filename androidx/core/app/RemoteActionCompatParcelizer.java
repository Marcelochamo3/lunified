package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import o.AbstractC3280xs0;
import o.C3377ys0;
import o.InterfaceC3474zs0;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC3280xs0 abstractC3280xs0) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC3474zs0 interfaceC3474zs0H = remoteActionCompat.a;
        if (abstractC3280xs0.e(1)) {
            interfaceC3474zs0H = abstractC3280xs0.h();
        }
        remoteActionCompat.a = (IconCompat) interfaceC3474zs0H;
        CharSequence charSequence = remoteActionCompat.b;
        if (abstractC3280xs0.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C3377ys0) abstractC3280xs0).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (abstractC3280xs0.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C3377ys0) abstractC3280xs0).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) abstractC3280xs0.g(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        if (abstractC3280xs0.e(5)) {
            z = ((C3377ys0) abstractC3280xs0).e.readInt() != 0;
        }
        remoteActionCompat.e = z;
        boolean z2 = remoteActionCompat.f;
        if (abstractC3280xs0.e(6)) {
            z2 = ((C3377ys0) abstractC3280xs0).e.readInt() != 0;
        }
        remoteActionCompat.f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC3280xs0 abstractC3280xs0) {
        abstractC3280xs0.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        abstractC3280xs0.i(1);
        abstractC3280xs0.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        abstractC3280xs0.i(2);
        Parcel parcel = ((C3377ys0) abstractC3280xs0).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        abstractC3280xs0.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        abstractC3280xs0.k(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        abstractC3280xs0.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        abstractC3280xs0.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
