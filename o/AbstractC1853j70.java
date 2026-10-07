package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: o.j70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1853j70 {
    public final C0643Nw l;
    public final AbstractC0985aF m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f839o;
    public final C2433p50 p;

    public AbstractC1853j70(C0643Nw c0643Nw, AbstractC0985aF abstractC0985aF, Fb0 fb0, ArrayList arrayList) {
        AbstractC0397Ej.c(!abstractC0985aF.isEmpty());
        this.l = c0643Nw;
        this.m = AbstractC0985aF.l(abstractC0985aF);
        this.f839o = Collections.unmodifiableList(arrayList);
        this.p = fb0.a(this);
        this.n = Lr0.R(fb0.c, 1000000L, fb0.b);
    }

    public abstract String a();

    public abstract InterfaceC1219cj d();

    public abstract C2433p50 e();
}
