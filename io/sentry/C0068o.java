package io.sentry;

import java.io.File;
import java.io.FilenameFilter;
import o.AbstractC1119bh0;
import o.AbstractC1474fG;
import o.AbstractC1899jh0;

/* JADX INFO: renamed from: io.sentry.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0068o implements FilenameFilter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0068o(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.a) {
            case 0:
                return ((AbstractC0081q) this.b).b(str);
            default:
                io.sentry.android.replay.capture.g gVar = (io.sentry.android.replay.capture.g) this.b;
                AbstractC1474fG.j(gVar, "this$0");
                AbstractC1474fG.i(str, "name");
                if (AbstractC1899jh0.U(str, "replay_", false)) {
                    String string = ((io.sentry.protocol.t) gVar.j.get()).toString();
                    AbstractC1474fG.i(string, "currentReplayId.get().toString()");
                    if (!AbstractC1119bh0.W(str, string, false)) {
                        io.sentry.config.a.c(new File(file, str));
                    }
                }
                return false;
        }
    }
}
