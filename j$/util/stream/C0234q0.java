package j$.util.stream;

import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0234q0 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ EnumC0262w0 b;

    public /* synthetic */ C0234q0(EnumC0262w0 enumC0262w0, int i) {
        this.a = i;
        this.b = enumC0262w0;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C0248t0(this.b);
            case 1:
                return new C0243s0(this.b);
            default:
                return new C0253u0(this.b);
        }
    }
}
