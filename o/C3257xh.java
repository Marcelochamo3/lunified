package o;

import android.content.Context;
import java.io.File;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: o.xh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3257xh implements InterfaceC2054lA {
    public final Object l;
    public volatile Object m;

    public /* synthetic */ C3257xh(Object obj) {
        this.l = obj;
    }

    public InterfaceC0763Sm a() {
        if (((InterfaceC0763Sm) this.m) == null) {
            synchronized (this) {
                try {
                    if (((InterfaceC0763Sm) this.m) == null) {
                        C2994uv c2994uv = (C2994uv) ((C0334By) this.l).m;
                        File cacheDir = ((Context) c2994uv.m).getCacheDir();
                        C1422en c1422en = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else {
                            String str = (String) c2994uv.n;
                            if (str != null) {
                                cacheDir = new File(cacheDir, str);
                            }
                        }
                        if (cacheDir != null && (cacheDir.isDirectory() || cacheDir.mkdirs())) {
                            c1422en = new C1422en(cacheDir, 262144000L);
                        }
                        this.m = c1422en;
                    }
                    if (((InterfaceC0763Sm) this.m) == null) {
                        this.m = new C0519Jb(11);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (InterfaceC0763Sm) this.m;
    }

    @Override // o.InterfaceC2054lA
    public Object get() {
        if (this.m == null) {
            synchronized (this) {
                try {
                    if (this.m == null) {
                        Object obj = ((InterfaceC2054lA) this.l).get();
                        AbstractC3045vW.k(obj, "Argument must not be null");
                        this.m = obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.m;
    }

    public C3257xh() {
        this.l = new CopyOnWriteArraySet();
    }
}
