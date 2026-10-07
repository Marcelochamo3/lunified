package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class DH extends JH {
    public final boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DH(AH ah) {
        super(true);
        boolean z = true;
        S(ah);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = JH.m;
        InterfaceC1890jd interfaceC1890jd = (InterfaceC1890jd) atomicReferenceFieldUpdater.get(this);
        C1988kd c1988kd = interfaceC1890jd instanceof C1988kd ? (C1988kd) interfaceC1890jd : null;
        if (c1988kd == null) {
            z = false;
            break;
        }
        JH jhP = c1988kd.p();
        while (!jhP.L()) {
            InterfaceC1890jd interfaceC1890jd2 = (InterfaceC1890jd) atomicReferenceFieldUpdater.get(jhP);
            C1988kd c1988kd2 = interfaceC1890jd2 instanceof C1988kd ? (C1988kd) interfaceC1890jd2 : null;
            if (c1988kd2 == null) {
                z = false;
                break;
            }
            jhP = c1988kd2.p();
        }
        this.n = z;
    }

    @Override // o.JH
    public final boolean L() {
        return this.n;
    }

    @Override // o.JH
    public final boolean M() {
        return true;
    }
}
