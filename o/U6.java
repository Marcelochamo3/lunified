package o;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class U6 {
    public final AbstractC0985aF a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public U6(M60 m60) {
        this.a = m60;
        V6 v6 = V6.e;
        this.d = false;
    }

    public final V6 a(V6 v6) throws W6 {
        if (v6.equals(V6.e)) {
            throw new W6(v6);
        }
        int i = 0;
        while (true) {
            AbstractC0985aF abstractC0985aF = this.a;
            if (i >= abstractC0985aF.size()) {
                return v6;
            }
            X6 x6 = (X6) abstractC0985aF.get(i);
            V6 v6E = x6.e(v6);
            if (x6.a()) {
                AbstractC0397Ej.f(!v6E.equals(V6.e));
                v6 = v6E;
            }
            i++;
        }
    }

    public final void b() {
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = false;
        int i = 0;
        while (true) {
            AbstractC0985aF abstractC0985aF = this.a;
            if (i >= abstractC0985aF.size()) {
                break;
            }
            X6 x6 = (X6) abstractC0985aF.get(i);
            x6.flush();
            if (x6.a()) {
                arrayList.add(x6);
            }
            i++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= c(); i2++) {
            this.c[i2] = ((X6) arrayList.get(i2)).b();
        }
    }

    public final int c() {
        return this.c.length - 1;
    }

    public final boolean d() {
        return this.d && ((X6) this.b.get(c())).d() && !this.c[c()].hasRemaining();
    }

    public final boolean e() {
        return !this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U6)) {
            return false;
        }
        U6 u6 = (U6) obj;
        AbstractC0985aF abstractC0985aF = this.a;
        if (abstractC0985aF.size() != u6.a.size()) {
            return false;
        }
        for (int i = 0; i < abstractC0985aF.size(); i++) {
            if (abstractC0985aF.get(i) != u6.a.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final void f(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            for (int i = 0; i <= c(); i++) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    X6 x6 = (X6) arrayList.get(i);
                    if (!x6.d()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : X6.a;
                        long jRemaining = byteBuffer2.remaining();
                        x6.f(byteBuffer2);
                        this.c[i] = x6.b();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < c()) {
                        ((X6) arrayList.get(i + 1)).c();
                    }
                }
            }
        }
    }

    public final void g() {
        int i = 0;
        while (true) {
            AbstractC0985aF abstractC0985aF = this.a;
            if (i >= abstractC0985aF.size()) {
                this.c = new ByteBuffer[0];
                V6 v6 = V6.e;
                this.d = false;
                return;
            } else {
                X6 x6 = (X6) abstractC0985aF.get(i);
                x6.flush();
                x6.g();
                i++;
            }
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
