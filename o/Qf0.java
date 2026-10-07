package o;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public final class Qf0 extends AbstractC3177wp0 {
    public static final InterfaceC3274xp0 c = new Pf0();
    public final /* synthetic */ int a;
    public final AbstractC3177wp0 b;

    public /* synthetic */ Qf0(AbstractC3177wp0 abstractC3177wp0, int i) {
        this.a = i;
        this.b = abstractC3177wp0;
    }

    @Override // o.AbstractC3177wp0
    public final Object a(WH wh) throws IOException {
        switch (this.a) {
            case 0:
                Date date = (Date) this.b.a(wh);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            case 1:
                return new AtomicLong(((Number) this.b.a(wh)).longValue());
            case 2:
                ArrayList arrayList = new ArrayList();
                wh.a();
                while (wh.W()) {
                    arrayList.add(Long.valueOf(((Number) this.b.a(wh)).longValue()));
                }
                wh.p();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            default:
                if (wh.j0() != 9) {
                    return this.b.a(wh);
                }
                wh.f0();
                return null;
        }
    }

    @Override // o.AbstractC3177wp0
    public final void b(C1183cI c1183cI, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                this.b.b(c1183cI, (Timestamp) obj);
                break;
            case 1:
                this.b.b(c1183cI, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 2:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                c1183cI.f();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    this.b.b(c1183cI, Long.valueOf(atomicLongArray.get(i)));
                }
                c1183cI.p();
                break;
            default:
                if (obj == null) {
                    c1183cI.Q();
                } else {
                    this.b.b(c1183cI, obj);
                }
                break;
        }
    }
}
