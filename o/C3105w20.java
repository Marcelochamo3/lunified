package o;

import com.skidush.clonex.models.Video$Type;

/* JADX INFO: renamed from: o.w20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3105w20 extends AbstractC0499Ih {
    public Video$Type l;
    public String m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C20 f1088o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3105w20(C20 c20, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f1088o = c20;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f1088o.e(null, null, this);
    }
}
