package o;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: renamed from: o.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2912u3 implements InterfaceC2286ng {
    public static final HashSet c = new HashSet();
    public final String a;
    public final String b;

    public AbstractC2912u3(String str, String str2) {
        this.a = str;
        this.b = str2;
        c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = AbstractC2718s3.a;
        String str = this.b;
        if (!hashSet.contains(str)) {
            String str2 = Build.TYPE;
            if ("eng".equals(str2) || "userdebug".equals(str2)) {
                if (hashSet.contains(str + ":dev")) {
                }
            }
            return false;
        }
        return true;
    }
}
