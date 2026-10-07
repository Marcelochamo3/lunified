package o;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public final class Ug0 extends ByteArrayOutputStream {
    public final /* synthetic */ Vg0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ug0(Vg0 vg0, int i) {
        super(i);
        this.l = vg0;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i = ((ByteArrayOutputStream) this).count;
        if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
            i--;
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i, this.l.m.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
