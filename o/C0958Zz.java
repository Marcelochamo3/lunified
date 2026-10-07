package o;

import java.util.ArrayList;

/* JADX INFO: renamed from: o.Zz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0958Zz {
    static final /* synthetic */ C0958Zz $$INSTANCE = new C0958Zz();

    public static InterfaceC0980aA a(OV ov) {
        C1583gR c1583gR = new C1583gR(12);
        if (ov == null) {
            ov = new OV(AbstractC1370eA.h());
        }
        c1583gR.m = ov;
        c1583gR.f("https://api.github.com/");
        ((ArrayList) c1583gR.f793o).add(DA.c());
        Object objB = c1583gR.m().b(InterfaceC0980aA.class);
        AbstractC1474fG.i(objB, "create(...)");
        return (InterfaceC0980aA) objB;
    }
}
