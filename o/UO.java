package o;

import android.media.MediaDescription;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public abstract class UO {
    public static Uri a(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    public static void b(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }
}
