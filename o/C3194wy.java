package o;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: o.wy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3194wy extends SQLiteOpenHelper {
    public static final /* synthetic */ int s = 0;
    public final Context l;
    public final C2133m1 m;
    public final C1909jm0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f1106o;
    public boolean p;
    public final C2429p30 q;
    public boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3194wy(Context context, String str, final C2133m1 c2133m1, final C1909jm0 c1909jm0) {
        super(context, str, null, c1909jm0.l, new DatabaseErrorHandler() { // from class: o.uy
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                AbstractC1474fG.j(c1909jm0, "$callback");
                C2133m1 c2133m2 = c2133m1;
                AbstractC1474fG.j(c2133m2, "$dbRef");
                int i = C3194wy.s;
                AbstractC1474fG.i(sQLiteDatabase, "dbObj");
                C2903ty c2903tyP = AbstractC3021v9.p(c2133m2, sQLiteDatabase);
                SQLiteDatabase sQLiteDatabase2 = c2903tyP.l;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        C1909jm0.d(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        c2903tyP.close();
                    } catch (IOException unused2) {
                    }
                    if (attachedDbs != null) {
                        return;
                    }
                } finally {
                    if (attachedDbs != null) {
                        Iterator<T> it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            AbstractC1474fG.i(obj, "p.second");
                            C1909jm0.d((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            C1909jm0.d(path2);
                        }
                    }
                }
            }
        });
        AbstractC1474fG.j(context, "context");
        AbstractC1474fG.j(c1909jm0, "callback");
        this.l = context;
        this.m = c2133m1;
        this.n = c1909jm0;
        this.f1106o = false;
        if (str == null) {
            str = UUID.randomUUID().toString();
            AbstractC1474fG.i(str, "randomUUID().toString()");
        }
        this.q = new C2429p30(str, context.getCacheDir(), false);
    }

    public final C2903ty a(boolean z) {
        C2429p30 c2429p30 = this.q;
        try {
            c2429p30.a((this.r || getDatabaseName() == null) ? false : true);
            this.p = false;
            SQLiteDatabase sQLiteDatabaseL = l(z);
            if (!this.p) {
                return f(sQLiteDatabaseL);
            }
            close();
            return a(z);
        } finally {
            c2429p30.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        C2429p30 c2429p30 = this.q;
        try {
            c2429p30.a(c2429p30.a);
            super.close();
            this.m.m = null;
            this.r = false;
        } finally {
            c2429p30.b();
        }
    }

    public final C2903ty f(SQLiteDatabase sQLiteDatabase) {
        AbstractC1474fG.j(sQLiteDatabase, "sqLiteDatabase");
        return AbstractC3021v9.p(this.m, sQLiteDatabase);
    }

    public final SQLiteDatabase i(boolean z) {
        if (z) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            AbstractC1474fG.i(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        AbstractC1474fG.i(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    public final SQLiteDatabase l(boolean z) throws Throwable {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.r;
        Context context = this.l;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                parentFile.toString();
            }
        }
        try {
            return i(z);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return i(z);
            } catch (Throwable th) {
                super.close();
                if (th instanceof C3097vy) {
                    C3097vy c3097vy = th;
                    int iW = AbstractC1701hf0.w(c3097vy.l);
                    Throwable th2 = c3097vy.m;
                    if (iW == 0 || iW == 1 || iW == 2 || iW == 3 || !(th2 instanceof SQLiteException)) {
                        throw th2;
                    }
                } else if (!(th instanceof SQLiteException) || databaseName == null || !this.f1106o) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    return i(z);
                } catch (C3097vy e) {
                    throw e.m;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        AbstractC1474fG.j(sQLiteDatabase, "db");
        boolean z = this.p;
        C1909jm0 c1909jm0 = this.n;
        if (!z && c1909jm0.l != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            c1909jm0.y(f(sQLiteDatabase));
        } catch (Throwable th) {
            throw new C3097vy(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AbstractC1474fG.j(sQLiteDatabase, "sqLiteDatabase");
        try {
            this.n.z(f(sQLiteDatabase));
        } catch (Throwable th) {
            throw new C3097vy(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AbstractC1474fG.j(sQLiteDatabase, "db");
        this.p = true;
        try {
            this.n.A(f(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new C3097vy(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        AbstractC1474fG.j(sQLiteDatabase, "db");
        if (!this.p) {
            try {
                this.n.B(f(sQLiteDatabase));
            } catch (Throwable th) {
                throw new C3097vy(5, th);
            }
        }
        this.r = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AbstractC1474fG.j(sQLiteDatabase, "sqLiteDatabase");
        this.p = true;
        try {
            this.n.C(f(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new C3097vy(3, th);
        }
    }
}
