package o;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;

/* JADX INFO: renamed from: o.sy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2806sy extends AbstractC3226xJ implements InterfaceC0853Vy {
    public final /* synthetic */ Oh0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2806sy(Oh0 oh0) {
        super(4);
        this.m = oh0;
    }

    @Override // o.InterfaceC0853Vy
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        AbstractC1474fG.g(sQLiteQuery);
        this.m.i(new C3388yy(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
