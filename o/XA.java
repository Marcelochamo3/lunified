package o;

import j$.lang.Iterable$EL;
import j$.util.Collection$EL;
import j$.util.function.Consumer$CC;
import j$.util.stream.Collectors;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public class XA extends H50 {
    private byte[] r;
    private int s;
    private byte[] t;
    private final List<C2848tT> u;

    public XA() {
        this.u = new ArrayList();
    }

    private static int b0(int i) throws C0629Ni.l {
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 5;
        }
        throw new C0629Ni.l(i);
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) {
        this.s = fl0.j0();
        this.r = fl0.Z();
        this.t = Cy0.b(fl0.e0());
        while (true) {
            Fl0.b bVarI = fl0.i();
            if (!bVarI.b()) {
                return;
            } else {
                this.u.add(new C2848tT(bVarI.d()));
            }
        }
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) throws Rw0 {
        int iJ = c0474Hi.j();
        this.s = c0474Hi.j();
        int iH = c0474Hi.h();
        this.r = c0474Hi.f(iJ);
        this.t = c0474Hi.f(iH);
        while (c0474Hi.k() > 0) {
            this.u.add(new C2848tT(c0474Hi));
        }
    }

    @Override // o.H50
    public String I() {
        StringBuilder sb = new StringBuilder();
        if (EW.a("multiline")) {
            sb.append("( ");
        }
        String str = EW.a("multiline") ? "\n\t" : " ";
        sb.append(this.s);
        sb.append(" ");
        sb.append(Ay0.b(this.r));
        sb.append(str);
        sb.append(Cy0.c(this.t));
        if (!this.u.isEmpty()) {
            sb.append(str);
        }
        sb.append((String) Collection$EL.stream(this.u).map(new C2504ps(7)).collect(Collectors.joining(str)));
        if (EW.a("multiline")) {
            sb.append(" )");
        }
        return sb.toString();
    }

    @Override // o.H50
    public void J(final C0578Li c0578Li, C1799ig c1799ig, final boolean z) {
        c0578Li.o(this.r.length);
        c0578Li.o(this.s);
        c0578Li.l(this.t.length);
        c0578Li.i(this.r);
        c0578Li.i(this.t);
        Iterable$EL.forEach(this.u, new Consumer() { // from class: o.WA
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void p(Object obj) {
                ((C2848tT) obj).B(c0578Li, null, z);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public int V() {
        return this.s;
    }

    public byte[] W() {
        return this.r;
    }

    public byte[] X() {
        return this.t;
    }

    public PublicKey Y() {
        return C0629Ni.I(b0(this.s), this.t, this);
    }

    public List<C2848tT> Z() {
        return Collections.unmodifiableList(this.u);
    }

    public XA(C2848tT c2848tT, int i, long j, byte[] bArr, int i2, byte[] bArr2, List<C2848tT> list) {
        super(c2848tT, 55, i, j);
        ArrayList arrayList = new ArrayList();
        this.u = arrayList;
        this.r = bArr;
        this.s = i2;
        this.t = bArr2;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public XA(C2848tT c2848tT, int i, long j, byte[] bArr, int i2, byte[] bArr2) {
        this(c2848tT, i, j, bArr, i2, bArr2, (List<C2848tT>) null);
    }

    public XA(C2848tT c2848tT, int i, long j, byte[] bArr, int i2, PublicKey publicKey, List<C2848tT> list) {
        this(c2848tT, i, j, bArr, i2, C0629Ni.o(publicKey, b0(i2)), list);
    }

    public XA(C2848tT c2848tT, int i, long j, byte[] bArr, int i2, PublicKey publicKey) {
        this(c2848tT, i, j, bArr, i2, publicKey, (List<C2848tT>) null);
    }
}
