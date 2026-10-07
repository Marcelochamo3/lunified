package o;

import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public final class IN extends Vp0 {
    public final /* synthetic */ JN m;

    public IN(JN jn) {
        this.m = jn;
    }

    @Override // o.Vp0
    public final int a() {
        return this.m.a.groupCount() + 1;
    }

    @Override // o.Vp0, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof GN) {
            return super.contains((GN) obj);
        }
        return false;
    }

    public final GN d(int i) {
        JN jn = this.m;
        Matcher matcher = jn.a;
        ZF zfL = U9.L(matcher.start(i), matcher.end(i));
        if (zfL.l < 0) {
            return null;
        }
        String strGroup = jn.a.group(i);
        AbstractC1474fG.i(strGroup, "group(...)");
        return new GN(strGroup, zfL);
    }

    @Override // o.Vp0, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2977um0(Vb0.M(AbstractC0911Ye.U(AbstractC0937Ze.I(this)), new io.sentry.android.replay.v(9, this)));
    }
}
