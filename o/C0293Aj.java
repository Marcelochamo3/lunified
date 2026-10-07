package o;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* JADX INFO: renamed from: o.Aj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0293Aj extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ C0293Aj(int i) {
        this.a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(Mr0.e);
                return simpleDateFormat;
            default:
                return new Random();
        }
    }
}
