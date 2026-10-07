package o;

/* JADX INFO: renamed from: o.it0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1825it0 implements PH {
    @Override // o.PH
    public final void a(QH qh) {
        TH thF = qh != null ? qh.f() : null;
        if (thF == null) {
            thF = new TH();
        }
        QH qhI = thF.i("result");
        boolean z = qhI != null ? qhI instanceof TH : false;
        if (z) {
            Object objC = new BA().c(qh, AbstractC1729ht0.class);
            AbstractC1474fG.i(objC, "fromJson(...)");
            AbstractC1674hK.v(objC);
            throw null;
        }
        if (z) {
            throw new C0730Rf();
        }
        Object objC2 = new BA().c(qh, AbstractC1631gt0.class);
        AbstractC1474fG.i(objC2, "fromJson(...)");
        AbstractC1674hK.v(objC2);
        throw null;
    }
}
