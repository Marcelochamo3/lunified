package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import o.AP;
import o.C2729s80;

/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends C2729s80 {
    @Override // o.C2729s80
    public final void a(int i, Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(AP.class.getClassLoader());
            try {
                bundle.isEmpty();
            } catch (BadParcelableException unused) {
                bundle = null;
            }
        }
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
