package o;

/* JADX INFO: renamed from: o.e50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1361e50 implements PH {
    @Override // o.PH
    public final void a(QH qh) {
        TH thF = qh != null ? qh.f() : null;
        if (thF == null) {
            thF = new TH();
        }
        QH qhI = thF.i("sources");
        boolean z = qhI != null ? qhI instanceof OH : false;
        if (z) {
            Object objC = new BA().c(qh, AbstractC1264d50.class);
            AbstractC1474fG.i(objC, "fromJson(...)");
            AbstractC1674hK.v(objC);
            throw null;
        }
        if (z) {
            throw new C0730Rf();
        }
        Object objC2 = new BA().c(qh, AbstractC1166c50.class);
        AbstractC1474fG.i(objC2, "fromJson(...)");
        AbstractC1674hK.v(objC2);
        throw null;
    }
}
