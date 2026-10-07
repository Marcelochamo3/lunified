package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import o.AbstractC1474fG;
import o.DS;
import o.ES;

/* JADX INFO: loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int l;
    public final LinkedHashMap m = new LinkedHashMap();
    public final ES n = new ES(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final DS f32o = new DS(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        AbstractC1474fG.j(intent, "intent");
        return this.f32o;
    }
}
