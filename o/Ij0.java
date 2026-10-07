package o;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class Ij0 extends CancellationException {
    public final transient AH l;

    public Ij0(String str, AH ah) {
        super(str);
        this.l = ah;
    }
}
