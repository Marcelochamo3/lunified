package o;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: o.yd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3347yd0 {
    public final F80 a;
    public final AtomicBoolean b;
    public final Rh0 c;

    public AbstractC3347yd0(F80 f80) {
        AbstractC1474fG.j(f80, "database");
        this.a = f80;
        this.b = new AtomicBoolean(false);
        this.c = new Rh0(new io.sentry.android.replay.f(24, this));
    }

    public final C3485zy a() {
        this.a.a();
        return this.b.compareAndSet(false, true) ? (C3485zy) this.c.getValue() : b();
    }

    public final C3485zy b() {
        String strC = c();
        F80 f80 = this.a;
        f80.getClass();
        f80.a();
        f80.b();
        return f80.g().P().i(strC);
    }

    public abstract String c();

    public final void d(C3485zy c3485zy) {
        AbstractC1474fG.j(c3485zy, "statement");
        if (c3485zy == ((C3485zy) this.c.getValue())) {
            this.b.set(false);
        }
    }
}
