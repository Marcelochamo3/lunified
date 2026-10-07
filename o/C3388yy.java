package o;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: renamed from: o.yy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3388yy implements Nh0 {
    public final SQLiteProgram l;

    public C3388yy(SQLiteProgram sQLiteProgram) {
        AbstractC1474fG.j(sQLiteProgram, "delegate");
        this.l = sQLiteProgram;
    }

    @Override // o.Nh0
    public final void B(int i, double d) {
        this.l.bindDouble(i, d);
    }

    @Override // o.Nh0
    public final void J(int i, long j) {
        this.l.bindLong(i, j);
    }

    @Override // o.Nh0
    public final void L(int i, byte[] bArr) {
        this.l.bindBlob(i, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.l.close();
    }

    @Override // o.Nh0
    public final void o(int i, String str) {
        AbstractC1474fG.j(str, "value");
        this.l.bindString(i, str);
    }

    @Override // o.Nh0
    public final void z(int i) {
        this.l.bindNull(i);
    }
}
