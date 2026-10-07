package o;

/* JADX INFO: renamed from: o.x60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3210x60 {
    public static String a(InterfaceC1056az interfaceC1056az) {
        String string = interfaceC1056az.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
