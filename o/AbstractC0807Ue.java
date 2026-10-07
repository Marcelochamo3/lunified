package o;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: o.Ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0807Ue {
    public static final ConcurrentHashMap a;

    static {
        AbstractC1923jt0.a();
        a = new ConcurrentHashMap();
    }

    public static void a(String str, Exception exc) {
        InterfaceC1022ai interfaceC1022ai = (InterfaceC0471Hf) a.get(str);
        if (interfaceC1022ai != null) {
            if (((JH) interfaceC1022ai).U()) {
                interfaceC1022ai = null;
            }
            if (interfaceC1022ai != null) {
                ((C0497If) interfaceC1022ai).X(new C0678Pf(exc, false));
            }
        }
    }
}
