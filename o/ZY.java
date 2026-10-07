package o;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class ZY extends AbstractC1350e0 {
    @Override // o.AbstractC2045l50
    public final int c(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // o.AbstractC1350e0
    public final Random d() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC1474fG.i(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
