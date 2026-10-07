package o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes.dex */
public final class RP implements InterfaceC1610gj {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String[] f489o = {"_data"};
    public final /* synthetic */ int l;
    public final Object m;
    public final Object n;

    public /* synthetic */ RP(Object obj, int i, Object obj2) {
        this.l = i;
        this.m = obj;
        this.n = obj2;
    }

    @Override // o.InterfaceC1610gj
    public final void a() {
        int i = this.l;
    }

    @Override // o.InterfaceC1610gj
    public final Class b() {
        switch (this.l) {
            case 0:
                return File.class;
            default:
                return ((InterfaceC1201ca) this.n).b();
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
                Cursor cursorQuery = ((Context) this.m).getContentResolver().query((Uri) this.n, f489o, null, null, null);
                String string = null;
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                        cursorQuery.close();
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                    break;
                }
                if (!TextUtils.isEmpty(string)) {
                    interfaceC1512fj.f(new File(string));
                    return;
                }
                interfaceC1512fj.d(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.n)));
                return;
            default:
                interfaceC1512fj.f(((InterfaceC1201ca) this.n).i((byte[]) this.m));
                return;
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
