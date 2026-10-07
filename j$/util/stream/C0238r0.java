package j$.util.stream;

import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.stream.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0238r0 extends AbstractC0258v0 {
    final /* synthetic */ EnumC0262w0 c;
    final /* synthetic */ Predicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0238r0(EnumC0262w0 enumC0262w0, Predicate predicate) {
        super(enumC0262w0);
        this.c = enumC0262w0;
        this.d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(obj);
        EnumC0262w0 enumC0262w0 = this.c;
        if (zTest == enumC0262w0.a) {
            this.a = true;
            this.b = enumC0262w0.b;
        }
    }
}
