package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class Ai0 implements Iterable {
    public final ArrayList l = new ArrayList();
    public final Context m;

    public Ai0(Context context) {
        this.m = context;
    }

    public final void a(ComponentName componentName) {
        Context context = this.m;
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        try {
            for (Intent intentO = AbstractC3409z9.o(context, componentName); intentO != null; intentO = AbstractC3409z9.o(context, intentO.getComponent())) {
                arrayList.add(size, intentO);
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final void d() {
        ArrayList arrayList = this.l;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.m.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.l.iterator();
    }
}
