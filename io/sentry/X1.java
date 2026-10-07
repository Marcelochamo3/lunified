package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public class X1 {
    public boolean a = false;

    public synchronized void a() {
        this.a = false;
    }

    public synchronized boolean b() {
        if (this.a) {
            return false;
        }
        this.a = true;
        notifyAll();
        return true;
    }
}
