package o;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;

/* JADX INFO: renamed from: o.vw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3093vw {
    public final /* synthetic */ int a;
    public final ContentProviderClient b;

    public C3093vw(Context context, Uri uri, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
            default:
                this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
        }
    }

    public final void a() {
        switch (this.a) {
            case 0:
                ContentProviderClient contentProviderClient = this.b;
                if (contentProviderClient != null) {
                    contentProviderClient.release();
                }
                break;
            default:
                ContentProviderClient contentProviderClient2 = this.b;
                if (contentProviderClient2 != null) {
                    contentProviderClient2.release();
                }
                break;
        }
    }

    public final Cursor b(Uri uri, String[] strArr, String[] strArr2) {
        switch (this.a) {
            case 0:
                ContentProviderClient contentProviderClient = this.b;
                if (contentProviderClient == null) {
                    return null;
                }
                try {
                    return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
                } catch (RemoteException unused) {
                    return null;
                }
            default:
                ContentProviderClient contentProviderClient2 = this.b;
                if (contentProviderClient2 == null) {
                    return null;
                }
                try {
                    return contentProviderClient2.query(uri, strArr, "query = ?", strArr2, null, null);
                } catch (RemoteException unused2) {
                    return null;
                }
        }
    }
}
