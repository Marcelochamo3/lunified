package o;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: o.ia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1788ia {
    public final ArrayDeque a;

    public C1788ia(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayDeque();
                break;
            default:
                char[] cArr = Kr0.a;
                this.a = new ArrayDeque(0);
                break;
        }
    }

    public C0815Um a() {
        C0815Um c0815Um;
        synchronized (this.a) {
            c0815Um = (C0815Um) this.a.poll();
        }
        return c0815Um == null ? new C0815Um() : c0815Um;
    }

    public void b(C0815Um c0815Um) {
        synchronized (this.a) {
            try {
                if (this.a.size() < 10) {
                    this.a.offer(c0815Um);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void c(C0906Xz c0906Xz) {
        c0906Xz.b = null;
        c0906Xz.c = null;
        this.a.offer(c0906Xz);
    }
}
