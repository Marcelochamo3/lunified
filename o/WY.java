package o;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class WY {
    public static final F2 a;
    public static final C2743sL b;
    public static final O9 c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            a = null;
            b = new C2743sL(9);
            c = new O9(26);
        } else {
            if (!property.equals("Dalvik")) {
                a = null;
                b = new C2725s60(1);
                c = new Q9(26);
                return;
            }
            a = new F2();
            if (Build.VERSION.SDK_INT >= 24) {
                b = new C2725s60(0);
                c = new Q9(26);
            } else {
                b = new C2743sL(9);
                c = new O9(26);
            }
        }
    }
}
