package o;

import java.util.Random;

/* JADX INFO: renamed from: o.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1350e0 extends AbstractC2045l50 {
    @Override // o.AbstractC2045l50
    public final int a(int i) {
        return ((-i) >> 31) & (d().nextInt() >>> (32 - i));
    }

    @Override // o.AbstractC2045l50
    public final int b() {
        return d().nextInt();
    }

    public abstract Random d();

    public final int e(int i) {
        return d().nextInt(i);
    }
}
