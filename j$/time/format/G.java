package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
public enum G {
    FULL(0),
    FULL_STANDALONE(0),
    SHORT(1),
    SHORT_STANDALONE(1),
    NARROW(1),
    NARROW_STANDALONE(1);

    private final int a;

    G(int i) {
        this.a = i;
    }

    final int p() {
        return this.a;
    }
}
