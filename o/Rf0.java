package o;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class Rf0 extends AbstractC3263xk {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Rf0(int i, Class cls) {
        super(cls);
        this.c = i;
    }

    @Override // o.AbstractC3263xk
    public final Date b(Date date) {
        switch (this.c) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
