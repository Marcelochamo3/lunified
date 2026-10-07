package o;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* JADX INFO: renamed from: o.Hk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0476Hk extends C0622Nb {
    @Override // o.C0622Nb
    public final Signature[] x(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
