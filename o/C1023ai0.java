package o;

/* JADX INFO: renamed from: o.ai0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1023ai0 implements PH {
    @Override // o.PH
    public final void a(QH qh) {
        TH thF = qh != null ? qh.f() : null;
        if (thF == null) {
            thF = new TH();
        }
        QH qhI = thF.i("media_type");
        String strH = qhI != null ? qhI.h() : null;
        if (strH == null) {
            strH = "";
        }
        int iHashCode = strH.hashCode();
        if (iHashCode == -991716523) {
            if (strH.equals("person")) {
                AbstractC1674hK.w(new BA().c(qh, AbstractC1121bi0.class));
            }
        } else if (iHashCode == 3714) {
            if (strH.equals("tv")) {
                AbstractC1674hK.w(new BA().c(qh, AbstractC1218ci0.class));
            }
        } else if (iHashCode == 104087344 && strH.equals("movie")) {
            AbstractC1674hK.w(new BA().c(qh, Zh0.class));
        }
    }
}
