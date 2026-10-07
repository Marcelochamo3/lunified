package o;

import android.app.ActivityManager;
import android.os.Build;
import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.fragments.player.PlayerTvFragment;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: o.b10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1061b10 extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ PlayerTvFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1061b10(PlayerTvFragment playerTvFragment, int i) {
        super(0);
        this.m = i;
        this.n = playerTvFragment;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00fb  */
    @Override // o.InterfaceC0360Cy
    public final Object c() {
        boolean z;
        boolean z2;
        EnumC1103bZ enumC1103bZ;
        switch (this.m) {
            case 0:
                return AppDatabase.m.w(this.n.Q());
            case 1:
                this.n.g1.a(new String[]{"text/plain", "text/str", "application/octet-stream", "text/x-unknown", "text/vtt", "text/x-ssa", "application/ttml+xml", "application/x-mp4-vtt", "application/x-subrip"});
                return C2985uq0.a;
            case 2:
                return new C0744Rt(16, this.n);
            default:
                String str = Build.MODEL;
                if (str == null) {
                    str = "";
                }
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                String str2 = Build.DEVICE;
                if (str2 == null) {
                    str2 = "";
                }
                String lowerCase2 = str2.toLowerCase(locale);
                AbstractC1474fG.i(lowerCase2, "toLowerCase(...)");
                String str3 = Build.HARDWARE;
                if (str3 == null) {
                    str3 = "";
                }
                String lowerCase3 = str3.toLowerCase(locale);
                AbstractC1474fG.i(lowerCase3, "toLowerCase(...)");
                String str4 = Build.MANUFACTURER;
                String lowerCase4 = (str4 != null ? str4 : "").toLowerCase(locale);
                AbstractC1474fG.i(lowerCase4, "toLowerCase(...)");
                String strH0 = AbstractC0911Ye.h0(AbstractC0937Ze.K(lowerCase, lowerCase2, lowerCase3, lowerCase4), " ", null, null, null, 62);
                Object systemService = this.n.Q().getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                boolean z3 = activityManager != null && activityManager.isLowRamDevice();
                int memoryClass = activityManager != null ? activityManager.getMemoryClass() : Integer.MAX_VALUE;
                List listK = AbstractC0937Ze.K("rk3128", "rk3228", "rk3229", "s805", "s905w", "sun8i", "h3", "h313");
                if (listK.isEmpty()) {
                    z = false;
                } else {
                    Iterator it = listK.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                        } else if (AbstractC1119bh0.W(strH0, (CharSequence) it.next(), false)) {
                            z = true;
                        }
                    }
                }
                if (!z) {
                    List listK2 = AbstractC0937Ze.K("rk322", "rk331", "rk332", "rk3368", "rk3399", "s905", "s905x", "s912", "amlogic", "allwinner", "sun50i", "h6");
                    if (listK2.isEmpty()) {
                        z2 = AbstractC1119bh0.W(lowerCase4, "rockchip", false);
                    } else {
                        Iterator it2 = listK2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (AbstractC1119bh0.W(strH0, (CharSequence) it2.next(), false)) {
                                }
                            } else if (AbstractC1119bh0.W(lowerCase4, "rockchip", false)) {
                            }
                        }
                    }
                }
                if (memoryClass <= 128 || (z3 && z)) {
                    enumC1103bZ = EnumC1103bZ.n;
                } else {
                    enumC1103bZ = (z3 || memoryClass <= 192 || z2 || Build.VERSION.SDK_INT <= 25) ? EnumC1103bZ.m : EnumC1103bZ.l;
                }
                enumC1103bZ.toString();
                return enumC1103bZ;
        }
    }
}
