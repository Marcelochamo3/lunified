package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;
import o.AbstractC2913u30;
import o.C3325yL;
import o.JF;
import o.O3;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements JF {
    @Override // o.JF
    public final List a() {
        return Collections.emptyList();
    }

    @Override // o.JF
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new C3325yL();
        }
        AbstractC2913u30.a(new O3(this, 13, context.getApplicationContext()));
        return new C3325yL();
    }
}
