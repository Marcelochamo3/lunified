package io.sentry;

import java.net.InetAddress;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import o.AbstractC1674hK;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ A(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                C c = (C) this.b;
                c.getClass();
                try {
                    c.b = ((InetAddress) c.e.call()).getCanonicalHostName();
                    c.c = System.currentTimeMillis() + c.a;
                    return null;
                } finally {
                    c.d.set(false);
                }
            default:
                StringBuilder sb = new StringBuilder();
                for (Map.Entry entry : ((io.sentry.metrics.a) this.b).a.entrySet()) {
                    ((Long) entry.getKey()).longValue();
                    Collection collectionValues = ((Map) entry.getValue()).values();
                    int i = io.sentry.metrics.c.b;
                    Iterator it = collectionValues.iterator();
                    if (it.hasNext()) {
                        AbstractC1674hK.w(it.next());
                        throw null;
                    }
                }
                return sb.toString().getBytes(io.sentry.metrics.a.b);
        }
    }
}
