package o;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: renamed from: o.zy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3485zy extends C3388yy implements Nh0 {
    public final SQLiteStatement m;

    public C3485zy(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.m = sQLiteStatement;
    }

    public final long a() {
        return this.m.executeInsert();
    }

    public final int f() {
        return this.m.executeUpdateDelete();
    }
}
