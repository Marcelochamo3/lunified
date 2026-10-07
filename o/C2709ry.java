package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* JADX INFO: renamed from: o.ry, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2709ry implements SQLiteDatabase.CursorFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C2709ry(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        switch (this.a) {
            case 0:
                Oh0 oh0 = (Oh0) this.b;
                AbstractC1474fG.j(oh0, "$query");
                AbstractC1474fG.g(sQLiteQuery);
                oh0.i(new C3388yy(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                InterfaceC0853Vy interfaceC0853Vy = (InterfaceC0853Vy) this.b;
                AbstractC1474fG.j(interfaceC0853Vy, "$tmp0");
                return (Cursor) interfaceC0853Vy.n(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
