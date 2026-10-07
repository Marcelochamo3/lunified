package j$.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
final class w extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final Object initialValue() {
        return new ThreadLocalRandom(0);
    }
}
