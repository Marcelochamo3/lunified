package o;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class BH extends CancellationException {
    public final transient AH l;

    public BH(String str, Throwable th, AH ah) {
        super(str);
        this.l = ah;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof BH) {
                BH bh = (BH) obj;
                if (!AbstractC1474fG.b(bh.getMessage(), getMessage()) || !AbstractC1474fG.b(bh.l, this.l) || !AbstractC1474fG.b(bh.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        AbstractC1474fG.g(message);
        int iHashCode = (this.l.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.l;
    }
}
