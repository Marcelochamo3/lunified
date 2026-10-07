package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import o.AP;
import o.C2729s80;

/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends C2729s80 {
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
        if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        parcelableArray.getClass();
        ArrayList arrayList = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}
