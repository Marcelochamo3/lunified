package o;

import android.os.Build;

/* JADX INFO: renamed from: o.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2815t3 extends AbstractC2912u3 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2815t3(String str, int i, String str2) {
        super(str, str2);
        this.d = i;
    }

    @Override // o.AbstractC2912u3
    public final boolean a() {
        switch (this.d) {
            case 0:
                return Build.VERSION.SDK_INT >= 23;
            case 1:
                return Build.VERSION.SDK_INT >= 24;
            case 2:
                return false;
            case 3:
                return Build.VERSION.SDK_INT >= 26;
            case 4:
                return Build.VERSION.SDK_INT >= 27;
            case 5:
                return Build.VERSION.SDK_INT >= 28;
            default:
                return Build.VERSION.SDK_INT >= 29;
        }
    }
}
