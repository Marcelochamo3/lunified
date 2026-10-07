package o;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;

/* JADX INFO: renamed from: o.xZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3242xZ implements Handler.Callback {
    public final C1562g8 l;
    public final C0915Yi m;
    public C0733Ri q;
    public boolean r;
    public boolean s;
    public boolean t;
    public final TreeMap p = new TreeMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Handler f1116o = Lr0.n(this);
    public final C1848j5 n = new C1848j5(1);

    public C3242xZ(C0733Ri c0733Ri, C0915Yi c0915Yi, C1562g8 c1562g8) {
        this.q = c0733Ri;
        this.m = c0915Yi;
        this.l = c1562g8;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.t) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        C3048vZ c3048vZ = (C3048vZ) message.obj;
        long j = c3048vZ.a;
        TreeMap treeMap = this.p;
        long j2 = c3048vZ.b;
        Long l = (Long) treeMap.get(Long.valueOf(j2));
        if (l == null || l.longValue() > j) {
            treeMap.put(Long.valueOf(j2), Long.valueOf(j));
        }
        return true;
    }
}
