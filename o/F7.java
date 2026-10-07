package o;

import android.util.Log;
import j$.util.Objects;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class F7 implements InterfaceC2901tx {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public String i;
    public int j;
    public CharSequence k;
    public int l;
    public CharSequence m;
    public ArrayList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f255o;
    public boolean p;
    public ArrayList q;
    public final C3289xx r;
    public boolean s;
    public int t;
    public boolean u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public F7(C3289xx c3289xx) {
        this();
        c3289xx.I();
        C1442ex c1442ex = c3289xx.v;
        if (c1442ex != null) {
            c1442ex.p.getClassLoader();
        }
        this.t = -1;
        this.u = false;
        this.r = c3289xx;
    }

    @Override // o.InterfaceC2901tx
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        this.r.d.add(this);
        return true;
    }

    public final void b(C0774Sx c0774Sx) {
        this.a.add(c0774Sx);
        c0774Sx.d = this.b;
        c0774Sx.e = this.c;
        c0774Sx.f = this.d;
        c0774Sx.g = this.e;
    }

    public final void c(String str) {
        if (!this.h) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.g = true;
        this.i = str;
    }

    public final void d(int i) {
        if (this.g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0774Sx c0774Sx = (C0774Sx) arrayList.get(i2);
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = c0774Sx.b;
                if (abstractComponentCallbacksC1247cx != null) {
                    abstractComponentCallbacksC1247cx.E += i;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(c0774Sx.b);
                        int i3 = c0774Sx.b.E;
                    }
                }
            }
        }
    }

    public final int e(boolean z) {
        if (this.s) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new BL());
            g("  ", printWriter, true);
            printWriter.close();
        }
        this.s = true;
        boolean z2 = this.g;
        C3289xx c3289xx = this.r;
        if (z2) {
            this.t = c3289xx.j.getAndIncrement();
        } else {
            this.t = -1;
        }
        c3289xx.x(this, z);
        return this.t;
    }

    public final void f(int i, AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, String str, int i2) {
        String str2 = abstractComponentCallbacksC1247cx.Z;
        if (str2 != null) {
            AbstractC0748Rx.c(abstractComponentCallbacksC1247cx, str2);
        }
        Class<?> cls = abstractComponentCallbacksC1247cx.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC1247cx.L;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC1247cx + ": was " + abstractComponentCallbacksC1247cx.L + " now " + str);
            }
            abstractComponentCallbacksC1247cx.L = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC1247cx + " with tag " + str + " to container view with no id");
            }
            int i3 = abstractComponentCallbacksC1247cx.J;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC1247cx + ": was " + abstractComponentCallbacksC1247cx.J + " now " + i);
            }
            abstractComponentCallbacksC1247cx.J = i;
            abstractComponentCallbacksC1247cx.K = i;
        }
        b(new C0774Sx(i2, abstractComponentCallbacksC1247cx));
        abstractComponentCallbacksC1247cx.F = this.r;
    }

    public final void g(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.s);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.j != 0 || this.k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0774Sx c0774Sx = (C0774Sx) arrayList.get(i);
            switch (c0774Sx.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c0774Sx.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c0774Sx.b);
            if (z) {
                if (c0774Sx.d != 0 || c0774Sx.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c0774Sx.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c0774Sx.e));
                }
                if (c0774Sx.f != 0 || c0774Sx.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0774Sx.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c0774Sx.g));
                }
            }
        }
    }

    public final void h(int i, AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        f(i, abstractComponentCallbacksC1247cx, str, 2);
    }

    public final void i(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        C3289xx c3289xx;
        if (abstractComponentCallbacksC1247cx == null || (c3289xx = abstractComponentCallbacksC1247cx.F) == null || c3289xx == this.r) {
            b(new C0774Sx(8, abstractComponentCallbacksC1247cx));
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC1247cx.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.t >= 0) {
            sb.append(" #");
            sb.append(this.t);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public F7(F7 f7) {
        this();
        f7.r.I();
        C1442ex c1442ex = f7.r.v;
        if (c1442ex != null) {
            c1442ex.p.getClassLoader();
        }
        for (C0774Sx c0774Sx : f7.a) {
            ArrayList arrayList = this.a;
            C0774Sx c0774Sx2 = new C0774Sx();
            c0774Sx2.a = c0774Sx.a;
            c0774Sx2.b = c0774Sx.b;
            c0774Sx2.c = c0774Sx.c;
            c0774Sx2.d = c0774Sx.d;
            c0774Sx2.e = c0774Sx.e;
            c0774Sx2.f = c0774Sx.f;
            c0774Sx2.g = c0774Sx.g;
            c0774Sx2.h = c0774Sx.h;
            c0774Sx2.i = c0774Sx.i;
            arrayList.add(c0774Sx2);
        }
        this.b = f7.b;
        this.c = f7.c;
        this.d = f7.d;
        this.e = f7.e;
        this.f = f7.f;
        this.g = f7.g;
        this.h = f7.h;
        this.i = f7.i;
        this.l = f7.l;
        this.m = f7.m;
        this.j = f7.j;
        this.k = f7.k;
        if (f7.n != null) {
            ArrayList arrayList2 = new ArrayList();
            this.n = arrayList2;
            arrayList2.addAll(f7.n);
        }
        if (f7.f255o != null) {
            ArrayList arrayList3 = new ArrayList();
            this.f255o = arrayList3;
            arrayList3.addAll(f7.f255o);
        }
        this.p = f7.p;
        this.t = -1;
        this.u = false;
        this.r = f7.r;
        this.s = f7.s;
        this.t = f7.t;
        this.u = f7.u;
    }

    public F7() {
        this.a = new ArrayList();
        this.h = true;
        this.p = false;
    }
}
