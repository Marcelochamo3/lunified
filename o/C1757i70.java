package o;

import android.net.Uri;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.i70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1757i70 extends AbstractC1853j70 {
    public final String q;
    public final C2433p50 r;
    public final L80 s;

    public C1757i70(long j, C0643Nw c0643Nw, AbstractC0985aF abstractC0985aF, Eb0 eb0, ArrayList arrayList) {
        super(c0643Nw, abstractC0985aF, eb0, arrayList);
        Uri.parse(((C2922u8) abstractC0985aF.get(0)).a);
        long j2 = eb0.e;
        C2433p50 c2433p50 = j2 <= 0 ? null : new C2433p50(eb0.d, j2, null);
        this.r = c2433p50;
        this.q = null;
        this.s = c2433p50 == null ? new L80(new C2433p50(0L, -1L, null)) : null;
    }

    @Override // o.AbstractC1853j70
    public final String a() {
        return this.q;
    }

    @Override // o.AbstractC1853j70
    public final InterfaceC1219cj d() {
        return this.s;
    }

    @Override // o.AbstractC1853j70
    public final C2433p50 e() {
        return this.r;
    }
}
