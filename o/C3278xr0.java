package o;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: o.xr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3278xr0 implements QQ {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));
    public final C3181wr0 a;

    public C3278xr0(C3181wr0 c3181wr0) {
        this.a = c3181wr0;
    }

    @Override // o.QQ
    public final boolean a(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }

    @Override // o.QQ
    public final PQ b(Object obj, int i, int i2, FW fw) {
        Uri uri = (Uri) obj;
        return new PQ(new AV(uri), this.a.b(uri));
    }
}
