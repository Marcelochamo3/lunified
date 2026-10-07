package o;

import android.util.Log;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: o.vx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3095vx implements InterfaceC2901tx {
    public final /* synthetic */ C3289xx a;

    public C3095vx(C3289xx c3289xx) {
        this.a = c3289xx;
    }

    @Override // o.InterfaceC2901tx
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        boolean zU;
        C3289xx c3289xx = this.a;
        c3289xx.getClass();
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(c3289xx.a);
        }
        if (c3289xx.d.isEmpty()) {
            zU = false;
        } else {
            F7 f7 = (F7) AbstractC1701hf0.c(1, c3289xx.d);
            c3289xx.h = f7;
            Iterator it = f7.a.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = ((C0774Sx) it.next()).b;
                if (abstractComponentCallbacksC1247cx != null) {
                    abstractComponentCallbacksC1247cx.x = true;
                }
            }
            zU = c3289xx.U(arrayList, arrayList2, null, -1, 0);
        }
        if (!c3289xx.m.isEmpty() && arrayList.size() > 0) {
            boolean zBooleanValue = ((Boolean) arrayList2.get(arrayList.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(C3289xx.G((F7) it2.next()));
            }
            for (C0515Ix c0515Ix : c3289xx.m) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    c0515Ix.b((AbstractComponentCallbacksC1247cx) it3.next(), zBooleanValue);
                }
            }
        }
        return zU;
    }
}
