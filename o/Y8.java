package o;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class Y8 extends AbstractC2518q {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Thread f632o;
    public final AbstractC1918jr p;

    public Y8(InterfaceC1022ai interfaceC1022ai, Thread thread, AbstractC1918jr abstractC1918jr) {
        super(interfaceC1022ai, true);
        this.f632o = thread;
        this.p = abstractC1918jr;
    }

    @Override // o.JH
    public final void w(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f632o;
        if (AbstractC1474fG.b(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
