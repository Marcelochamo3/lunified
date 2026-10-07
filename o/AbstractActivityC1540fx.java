package o;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: o.fx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1540fx extends AbstractActivityC1116bg implements B1, C1 {
    public boolean F;
    public boolean G;
    public final C2133m1 D = new C2133m1(28, new C1442ex(this));
    public final C1478fK E = new C1478fK(this);
    public boolean H = true;

    public AbstractActivityC1540fx() {
        ((K3) this.p.f832o).f("android:support:lifecycle", new C0782Tf(1, this));
        final int i = 0;
        i(new InterfaceC0835Vg(this) { // from class: o.dx
            public final /* synthetic */ AbstractActivityC1540fx b;

            {
                this.b = this;
            }

            @Override // o.InterfaceC0835Vg
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.b.D.R();
                        break;
                    default:
                        this.b.D.R();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.y.add(new InterfaceC0835Vg(this) { // from class: o.dx
            public final /* synthetic */ AbstractActivityC1540fx b;

            {
                this.b = this;
            }

            @Override // o.InterfaceC0835Vg
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        this.b.D.R();
                        break;
                    default:
                        this.b.D.R();
                        break;
                }
            }
        });
        j(new C0808Uf(this, 1));
    }

    public static boolean v(C3289xx c3289xx) {
        TJ tj = TJ.n;
        boolean zV = false;
        for (AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx : c3289xx.c.x()) {
            if (abstractComponentCallbacksC1247cx != null) {
                C1442ex c1442ex = abstractComponentCallbacksC1247cx.G;
                if ((c1442ex == null ? null : c1442ex.s) != null) {
                    zV |= v(abstractComponentCallbacksC1247cx.i());
                }
                C1640gy c1640gy = abstractComponentCallbacksC1247cx.c0;
                TJ tj2 = TJ.f532o;
                if (c1640gy != null) {
                    c1640gy.g();
                    if (c1640gy.p.d.compareTo(tj2) >= 0) {
                        abstractComponentCallbacksC1247cx.c0.p.g(tj);
                        zV = true;
                    }
                }
                if (abstractComponentCallbacksC1247cx.b0.d.compareTo(tj2) >= 0) {
                    abstractComponentCallbacksC1247cx.b0.g(tj);
                    zV = true;
                }
            }
        }
        return zV;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x0024  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x005f, please report this as an issue */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z;
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (!str2.equals("--translation") || Build.VERSION.SDK_INT < 31) {
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        z = Build.VERSION.SDK_INT >= 33;
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 1159329357:
                    if (!str2.equals("--contentcapture") || Build.VERSION.SDK_INT < 29) {
                    }
                    break;
                case 1455016274:
                    if (!str2.equals("--autofill") || Build.VERSION.SDK_INT < 26) {
                    }
                    break;
                default:
                    break;
            }
        }
        if (true ^ z) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str3 = str + "  ";
            printWriter.print(str3);
            printWriter.print("mCreated=");
            printWriter.print(this.F);
            printWriter.print(" mResumed=");
            printWriter.print(this.G);
            printWriter.print(" mStopped=");
            printWriter.print(this.H);
            if (getApplication() != null) {
                Zt0 zt0E = e();
                AbstractC1474fG.j(zt0E, "store");
                C3483zx c3483zx = C1869jL.c;
                C2290ni c2290ni = C2290ni.b;
                AbstractC1474fG.j(c2290ni, "defaultCreationExtras");
                RN rn = new RN(zt0E, c3483zx, c2290ni);
                C2766se c2766seA = AbstractC2822t60.a(C1869jL.class);
                String strK = Pu0.k(c2766seA);
                if (strK == null) {
                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
                }
                C2866tf0 c2866tf0 = ((C1869jL) rn.x(c2766seA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strK))).b;
                if (c2866tf0.h() > 0) {
                    printWriter.print(str3);
                    printWriter.println("Loaders:");
                    if (c2866tf0.h() > 0) {
                        AbstractC1674hK.w(c2866tf0.j(0));
                        printWriter.print(str3);
                        printWriter.print("  #");
                        printWriter.print(c2866tf0.e(0));
                        printWriter.print(": ");
                        throw null;
                    }
                }
            }
            ((C1442ex) this.D.m).r.v(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // o.AbstractActivityC1116bg, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.D.R();
        super.onActivityResult(i, i2, intent);
    }

    @Override // o.AbstractActivityC1116bg, o.AbstractActivityC1018ag, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E.d(SJ.ON_CREATE);
        C3289xx c3289xx = ((C1442ex) this.D.m).r;
        c3289xx.G = false;
        c3289xx.H = false;
        c3289xx.N.g = false;
        c3289xx.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((C1442ex) this.D.m).r.f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((C1442ex) this.D.m).r.l();
        this.E.d(SJ.ON_DESTROY);
    }

    @Override // o.AbstractActivityC1116bg, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((C1442ex) this.D.m).r.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.G = false;
        ((C1442ex) this.D.m).r.u(5);
        this.E.d(SJ.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.E.d(SJ.ON_RESUME);
        C3289xx c3289xx = ((C1442ex) this.D.m).r;
        c3289xx.G = false;
        c3289xx.H = false;
        c3289xx.N.g = false;
        c3289xx.u(7);
    }

    @Override // o.AbstractActivityC1116bg, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.D.R();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        C2133m1 c2133m1 = this.D;
        c2133m1.R();
        super.onResume();
        this.G = true;
        ((C1442ex) c2133m1.m).r.z(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        C2133m1 c2133m1 = this.D;
        c2133m1.R();
        super.onStart();
        this.H = false;
        boolean z = this.F;
        C1442ex c1442ex = (C1442ex) c2133m1.m;
        if (!z) {
            this.F = true;
            C3289xx c3289xx = c1442ex.r;
            c3289xx.G = false;
            c3289xx.H = false;
            c3289xx.N.g = false;
            c3289xx.u(4);
        }
        c1442ex.r.z(true);
        this.E.d(SJ.ON_START);
        C3289xx c3289xx2 = c1442ex.r;
        c3289xx2.G = false;
        c3289xx2.H = false;
        c3289xx2.N.g = false;
        c3289xx2.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.D.R();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.H = true;
        while (v(u())) {
        }
        C3289xx c3289xx = ((C1442ex) this.D.m).r;
        c3289xx.H = true;
        c3289xx.N.g = true;
        c3289xx.u(4);
        this.E.d(SJ.ON_STOP);
    }

    public final C3289xx u() {
        return ((C1442ex) this.D.m).r;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((C1442ex) this.D.m).r.f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }
}
