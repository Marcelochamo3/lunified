package o;

/* JADX INFO: renamed from: o.zp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C3468zp0 implements InterfaceC3274xp0 {
    @Override // o.InterfaceC3274xp0
    public final AbstractC3177wp0 b(BA ba, Kp0 kp0) {
        Class superclass = kp0.a;
        if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
            return null;
        }
        if (!superclass.isEnum()) {
            superclass = superclass.getSuperclass();
        }
        return new C3371yp0(superclass);
    }
}
