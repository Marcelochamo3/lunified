package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import java.io.Closeable;

/* JADX INFO: renamed from: o.ty, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2903ty implements Closeable {
    public static final String[] m = new String[0];
    public final SQLiteDatabase l;

    public C2903ty(SQLiteDatabase sQLiteDatabase) {
        AbstractC1474fG.j(sQLiteDatabase, "delegate");
        this.l = sQLiteDatabase;
    }

    public final Cursor K(String str) {
        AbstractC1474fG.j(str, "query");
        return Q(new J2(str, 8));
    }

    public final Cursor Q(Oh0 oh0) {
        AbstractC1474fG.j(oh0, "query");
        Cursor cursorRawQueryWithFactory = this.l.rawQueryWithFactory(new C2709ry(1, new C2806sy(oh0)), oh0.f(), m, null);
        AbstractC1474fG.i(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    public final Cursor R(Oh0 oh0, CancellationSignal cancellationSignal) {
        AbstractC1474fG.j(oh0, "query");
        String strF = oh0.f();
        String[] strArr = m;
        AbstractC1474fG.g(cancellationSignal);
        C2709ry c2709ry = new C2709ry(0, oh0);
        SQLiteDatabase sQLiteDatabase = this.l;
        AbstractC1474fG.j(sQLiteDatabase, "sQLiteDatabase");
        AbstractC1474fG.j(strF, "sql");
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(c2709ry, strF, strArr, null, cancellationSignal);
        AbstractC1474fG.i(cursorRawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return cursorRawQueryWithFactory;
    }

    public final void W() {
        this.l.setTransactionSuccessful();
    }

    public final void a() {
        this.l.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.l.close();
    }

    public final void f() {
        this.l.beginTransactionNonExclusive();
    }

    public final C3485zy i(String str) {
        AbstractC1474fG.j(str, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.l.compileStatement(str);
        AbstractC1474fG.i(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new C3485zy(sQLiteStatementCompileStatement);
    }

    public final boolean isOpen() {
        return this.l.isOpen();
    }

    public final void l() {
        this.l.endTransaction();
    }

    public final void p(String str) {
        AbstractC1474fG.j(str, "sql");
        this.l.execSQL(str);
    }

    public final boolean q() {
        return this.l.inTransaction();
    }

    public final boolean t() {
        SQLiteDatabase sQLiteDatabase = this.l;
        AbstractC1474fG.j(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }
}
