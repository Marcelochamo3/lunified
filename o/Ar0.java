package o;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Ar0 implements QQ {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    public final QQ a;

    public Ar0(QQ qq) {
        this.a = qq;
    }

    @Override // o.QQ
    public final boolean a(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }

    @Override // o.QQ
    public final PQ b(Object obj, int i, int i2, FW fw) {
        return this.a.b(new C2151mA(((Uri) obj).toString()), i, i2, fw);
    }
}
