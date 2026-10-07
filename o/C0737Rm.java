package o;

import android.content.res.Resources;
import java.io.IOException;

/* JADX INFO: renamed from: o.Rm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0737Rm implements InterfaceC1610gj {
    public final Resources.Theme l;
    public final Resources m;
    public final C0711Qm n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f494o;
    public Object p;

    public C0737Rm(Resources.Theme theme, Resources resources, C0711Qm c0711Qm, int i) {
        this.l = theme;
        this.m = resources;
        this.n = c0711Qm;
        this.f494o = i;
    }

    @Override // o.InterfaceC1610gj
    public final void a() {
        Object obj = this.p;
        if (obj != null) {
            try {
                this.n.b(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // o.InterfaceC1610gj
    public final Class b() {
        return this.n.c();
    }

    @Override // o.InterfaceC1610gj
    public final int c() {
        return 1;
    }

    @Override // o.InterfaceC1610gj
    public final void e(EnumC1651h30 enumC1651h30, InterfaceC1512fj interfaceC1512fj) {
        try {
            Object objD = this.n.d(this.m, this.f494o, this.l);
            this.p = objD;
            interfaceC1512fj.f(objD);
        } catch (Resources.NotFoundException e) {
            interfaceC1512fj.d(e);
        }
    }

    @Override // o.InterfaceC1610gj
    public final void cancel() {
    }
}
