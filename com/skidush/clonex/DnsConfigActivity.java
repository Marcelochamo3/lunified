package com.skidush.clonex;

import android.os.Bundle;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.skidush.clonex.fragments.settings.DnsConfigTvFragment;
import o.AbstractC1459f50;
import o.AbstractC1474fG;
import o.AbstractComponentCallbacksC1247cx;
import o.C1123bj0;
import o.C2416ow0;
import o.C2978un;
import o.C3289xx;
import o.Cr0;
import o.E3;
import o.F7;
import o.It0;
import o.Ol0;

/* JADX INFO: loaded from: classes.dex */
public final class DnsConfigActivity extends E3 {
    @Override // o.AbstractActivityC1116bg, android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    @Override // o.AbstractActivityC1540fx, o.AbstractActivityC1116bg, o.AbstractActivityC1018ag, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Cr0 cr0 = Cr0.y;
        String strB = cr0.b();
        if (strB == null) {
            strB = "default";
        }
        setTheme(AbstractC1459f50.D(strB));
        super.onCreate(bundle);
        String strB2 = cr0.b();
        C1123bj0 c1123bj0F = AbstractC1459f50.F(strB2 != null ? strB2 : "default");
        Window window = getWindow();
        int i = c1123bj0F.b;
        window.setStatusBarColor(i);
        getWindow().setNavigationBarColor(i);
        setContentView(R.layout.activity_dns_config);
        if (bundle == null) {
            AbstractComponentCallbacksC1247cx dnsConfigTvFragment = getPackageManager().hasSystemFeature("android.software.leanback") ? new DnsConfigTvFragment() : new C2978un();
            C3289xx c3289xxU = u();
            AbstractC1474fG.i(c3289xxU, "getSupportFragmentManager(...)");
            F7 f7 = new F7(c3289xxU);
            f7.h(R.id.fragment_container, dnsConfigTvFragment, null);
            f7.e(false);
        }
        C2416ow0 c2416ow0X = x();
        if (c2416ow0X != null) {
            Ol0 ol0 = (Ol0) c2416ow0X.h;
            ol0.g = true;
            ol0.h = "Configuración DNS";
            if ((ol0.b & 8) != 0) {
                Toolbar toolbar = ol0.a;
                toolbar.setTitle("Configuración DNS");
                if (ol0.g) {
                    It0.q(toolbar.getRootView(), "Configuración DNS");
                }
            }
        }
        C2416ow0 c2416ow0X2 = x();
        if (c2416ow0X2 != null) {
            Ol0 ol1 = (Ol0) c2416ow0X2.h;
            int i2 = ol1.b;
            c2416ow0X2.k = true;
            ol1.a((i2 & (-5)) | 4);
        }
    }

    @Override // o.E3
    public final boolean z() {
        finish();
        return true;
    }
}
