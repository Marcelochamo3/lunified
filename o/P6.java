package o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class P6 extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ Q6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P6(Q6 q6, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = q6;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Q6 q6 = this.c;
        Q6.a(q6, M6.b((Context) q6.b));
    }
}
