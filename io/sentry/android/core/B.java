package io.sentry.android.core;

/* JADX INFO: loaded from: classes.dex */
public final class B {
    public static final B b;
    public Boolean a;

    static {
        B b2 = new B();
        b2.a = null;
        b = b2;
    }

    public final synchronized void a(boolean z) {
        this.a = Boolean.valueOf(z);
    }
}
