package o;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class QH {
    public boolean a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final OH e() {
        if (this instanceof OH) {
            return (OH) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public final TH f() {
        if (this instanceof TH) {
            return (TH) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public final VH g() {
        if (this instanceof VH) {
            return (VH) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C1183cI c1183cI = new C1183cI(stringWriter);
            c1183cI.q = true;
            InterfaceC3274xp0 interfaceC3274xp0 = Hp0.a;
            C3411zA.d(c1183cI, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
