package o;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: renamed from: o.ij0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1806ij0 implements InterfaceC2001kj0 {
    public static final String[] c = {"_data"};
    public static final String[] d = {"_data"};
    public final /* synthetic */ int a;
    public final ContentResolver b;

    public /* synthetic */ C1806ij0(ContentResolver contentResolver, int i) {
        this.a = i;
        this.b = contentResolver;
    }

    @Override // o.InterfaceC2001kj0
    public final Cursor a(Uri uri) {
        switch (this.a) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, d, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
