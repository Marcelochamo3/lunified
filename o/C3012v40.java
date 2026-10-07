package o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: renamed from: o.v40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3012v40 implements InterfaceC1610gj {
    public static final String[] v = {"_data"};
    public final Context l;
    public final QQ m;
    public final QQ n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Uri f1069o;
    public final int p;
    public final int q;
    public final FW r;
    public final Class s;
    public volatile boolean t;
    public volatile InterfaceC1610gj u;

    public C3012v40(Context context, QQ qq, QQ qq2, Uri uri, int i, int i2, FW fw, Class cls) {
        this.l = context.getApplicationContext();
        this.m = qq;
        this.n = qq2;
        this.f1069o = uri;
        this.p = i;
        this.q = i2;
        this.r = fw;
        this.s = cls;
    }

    @Override // o.InterfaceC1610gj
    public final void a() {
        InterfaceC1610gj interfaceC1610gj = this.u;
        if (interfaceC1610gj != null) {
            interfaceC1610gj.a();
        }
    }

    @Override // o.InterfaceC1610gj
    public final Class b() {
        return this.s;
    }

    @Override // o.InterfaceC1610gj
    public final int c() {
        return 1;
    }

    @Override // o.InterfaceC1610gj
    public final void cancel() {
        this.t = true;
        InterfaceC1610gj interfaceC1610gj = this.u;
        if (interfaceC1610gj != null) {
            interfaceC1610gj.cancel();
        }
    }

    public final InterfaceC1610gj d() throws Throwable {
        PQ pqB;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.l;
        FW fw = this.r;
        int i = this.q;
        int i2 = this.p;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f1069o;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, v, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            pqB = this.m.b(file, i2, i, fw);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            Uri requireOriginal = this.f1069o;
            boolean zV = AbstractC1376eG.v(requireOriginal);
            QQ qq = this.n;
            if (zV && requireOriginal.getPathSegments().contains("picker")) {
                pqB = qq.b(requireOriginal, i2, i, fw);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                pqB = qq.b(requireOriginal, i2, i, fw);
            }
        }
        if (pqB != null) {
            return pqB.c;
        }
        return null;
    }

    @Override // o.InterfaceC1610gj
    public final void e(EnumC1651h30 enumC1651h30, InterfaceC1512fj interfaceC1512fj) throws Throwable {
        try {
            InterfaceC1610gj interfaceC1610gjD = d();
            if (interfaceC1610gjD == null) {
                interfaceC1512fj.d(new IllegalArgumentException("Failed to build fetcher for: " + this.f1069o));
            } else {
                this.u = interfaceC1610gjD;
                if (this.t) {
                    cancel();
                } else {
                    interfaceC1610gjD.e(enumC1651h30, interfaceC1512fj);
                }
            }
        } catch (FileNotFoundException e) {
            interfaceC1512fj.d(e);
        }
    }
}
