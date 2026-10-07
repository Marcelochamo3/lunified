package o;

/* JADX INFO: renamed from: o.t60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2822t60 {
    public static final C3210x60 a;

    static {
        C3210x60 c3210x60 = null;
        try {
            c3210x60 = (C3210x60) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c3210x60 == null) {
            c3210x60 = new C3210x60();
        }
        a = c3210x60;
    }

    public static C2766se a(Class cls) {
        a.getClass();
        return new C2766se(cls);
    }
}
