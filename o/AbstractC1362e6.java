package o;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: o.e6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1362e6 implements InterfaceC1610gj {
    public final /* synthetic */ int l;
    public Object m;
    public final Comparable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f749o;

    public /* synthetic */ AbstractC1362e6(int i, Comparable comparable, Object obj) {
        this.l = i;
        this.f749o = obj;
        this.n = comparable;
    }

    @Override // o.InterfaceC1610gj
    public final void a() {
        switch (this.l) {
            case 0:
                Object obj = this.m;
                if (obj != null) {
                    try {
                        g(obj);
                    } catch (IOException unused) {
                        return;
                    }
                    break;
                }
                break;
            default:
                Object obj2 = this.m;
                if (obj2 != null) {
                    try {
                        g(obj2);
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // o.InterfaceC1610gj
    public final int c() {
        switch (this.l) {
        }
        return 1;
    }

    @Override // o.InterfaceC1610gj
    public final void cancel() {
        int i = this.l;
    }

    @Override // o.InterfaceC1610gj
    public final void e(EnumC1651h30 enumC1651h30, InterfaceC1512fj interfaceC1512fj) {
        switch (this.l) {
            case 0:
                try {
                    Object objH = h((AssetManager) this.f749o, (String) this.n);
                    this.m = objH;
                    interfaceC1512fj.f(objH);
                } catch (IOException e) {
                    Log.isLoggable("AssetPathFetcher", 3);
                    interfaceC1512fj.d(e);
                }
                break;
            default:
                try {
                    Object objI = i((Uri) this.n, (ContentResolver) this.f749o);
                    this.m = objI;
                    interfaceC1512fj.f(objI);
                } catch (FileNotFoundException e2) {
                    Log.isLoggable("LocalUriFetcher", 3);
                    interfaceC1512fj.d(e2);
                    return;
                }
                break;
        }
    }

    public abstract void g(Object obj);

    public abstract Object h(AssetManager assetManager, String str);

    public abstract Object i(Uri uri, ContentResolver contentResolver);

    private final void d() {
    }

    private final void f() {
    }
}
