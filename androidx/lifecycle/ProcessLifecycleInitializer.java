package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.List;
import o.AbstractC1474fG;
import o.C1233cq;
import o.C2332o30;
import o.JF;
import o.Na0;
import o.SJ;
import o.XJ;
import o.YJ;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements JF {
    @Override // o.JF
    public final List a() {
        return C1233cq.l;
    }

    @Override // o.JF
    public final Object b(Context context) {
        AbstractC1474fG.j(context, "context");
        Na0 na0B = Na0.B(context);
        AbstractC1474fG.i(na0B, "getInstance(context)");
        if (!((HashSet) na0B.n).contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        if (!YJ.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            AbstractC1474fG.h(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new XJ());
        }
        ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.t;
        processLifecycleOwner.getClass();
        processLifecycleOwner.p = new Handler();
        processLifecycleOwner.q.d(SJ.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        AbstractC1474fG.h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C2332o30(processLifecycleOwner));
        return processLifecycleOwner;
    }
}
