package o;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: o.ha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1690ha implements InterfaceC1610gj {
    public final /* synthetic */ int l;
    public final Object m;

    public /* synthetic */ C1690ha(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    @Override // o.InterfaceC1610gj
    public final void a() {
        int i = this.l;
    }

    @Override // o.InterfaceC1610gj
    public final Class b() {
        switch (this.l) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.m.getClass();
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
                    interfaceC1512fj.f(AbstractC2274na.a((File) this.m));
                } catch (IOException e) {
                    Log.isLoggable("ByteBufferFileLoader", 3);
                    interfaceC1512fj.d(e);
                    return;
                }
                break;
            default:
                interfaceC1512fj.f(this.m);
                break;
        }
    }

    private final void d() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
