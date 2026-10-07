package o;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class Iv0 extends AbstractC2912u3 {
    public final Pattern d;

    public Iv0() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.d = Pattern.compile("\\A\\d+");
    }

    @Override // o.AbstractC2912u3
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // o.AbstractC2912u3
    public final boolean b() {
        int i;
        PackageInfo packageInfoA;
        boolean zB = super.b();
        if (!zB || (i = Build.VERSION.SDK_INT) >= 29) {
            return zB;
        }
        boolean z = AbstractC2995uv0.a;
        if (i >= 26) {
            packageInfoA = WebView.getCurrentWebViewPackage();
        } else {
            try {
                packageInfoA = AbstractC2995uv0.a();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfoA = null;
            }
        }
        if (packageInfoA == null) {
            return false;
        }
        Matcher matcher = this.d.matcher(packageInfoA.versionName);
        return matcher.find() && Integer.parseInt(packageInfoA.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
