package o;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ZP implements Menu {
    public static final int[] y = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public XP e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public CharSequence m;
    public Drawable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f656o;
    public C1386eQ v;
    public boolean x;
    public int l = 0;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public final ArrayList t = new ArrayList();
    public final CopyOnWriteArrayList u = new CopyOnWriteArrayList();
    public boolean w = false;

    public ZP(Context context) {
        boolean zB;
        boolean z = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = Mt0.a;
            if (Build.VERSION.SDK_INT >= 28) {
                zB = Kt0.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zB = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zB) {
                z = true;
            }
        }
        this.d = z;
    }

    public C1386eQ a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (y[i5] << 16) | (65535 & i3);
        C1386eQ c1386eQ = new C1386eQ(this, i, i2, i3, i6, charSequence, this.l);
        ArrayList arrayList = this.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C1386eQ) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                arrayList.add(i4, c1386eQ);
                p(true);
                return c1386eQ;
            }
        }
        i4 = 0;
        arrayList.add(i4, c1386eQ);
        p(true);
        return c1386eQ;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C1386eQ c1386eQA = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            c1386eQA.setIcon(resolveInfo.loadIcon(packageManager));
            c1386eQA.g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = c1386eQA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(InterfaceC2651rQ interfaceC2651rQ, Context context) {
        this.u.add(new WeakReference(interfaceC2651rQ));
        interfaceC2651rQ.j(context, this);
        this.k = true;
    }

    public final void c(boolean z) {
        if (this.s) {
            return;
        }
        this.s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC2651rQ interfaceC2651rQ = (InterfaceC2651rQ) weakReference.get();
            if (interfaceC2651rQ == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC2651rQ.a(this, z);
            }
        }
        this.s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C1386eQ c1386eQ = this.v;
        if (c1386eQ != null) {
            d(c1386eQ);
        }
        this.f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.f656o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(C1386eQ c1386eQ) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        boolean zN = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == c1386eQ) {
            w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC2651rQ interfaceC2651rQ = (InterfaceC2651rQ) weakReference.get();
                if (interfaceC2651rQ != null) {
                    zN = interfaceC2651rQ.n(c1386eQ);
                    if (zN) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            v();
            if (zN) {
                this.v = null;
            }
        }
        return zN;
    }

    public boolean e(ZP zp, MenuItem menuItem) {
        XP xp = this.e;
        return xp != null && xp.w(zp, menuItem);
    }

    public boolean f(C1386eQ c1386eQ) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        boolean zF = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC2651rQ interfaceC2651rQ = (InterfaceC2651rQ) weakReference.get();
            if (interfaceC2651rQ != null) {
                zF = interfaceC2651rQ.f(c1386eQ);
                if (zF) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        v();
        if (zF) {
            this.v = c1386eQ;
        }
        return zF;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1386eQ c1386eQ = (C1386eQ) arrayList.get(i2);
            if (c1386eQ.a == i) {
                return c1386eQ;
            }
            if (c1386eQ.hasSubMenu() && (menuItemFindItem = c1386eQ.f753o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final C1386eQ g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.t;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C1386eQ) arrayList.get(0);
        }
        boolean zN = n();
        for (int i2 = 0; i2 < size; i2++) {
            C1386eQ c1386eQ = (C1386eQ) arrayList.get(i2);
            char c = zN ? c1386eQ.j : c1386eQ.h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zN && c == '\b' && i == 67))) {
                return c1386eQ;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f.get(i);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1386eQ c1386eQ = (C1386eQ) arrayList2.get(i2);
                if (c1386eQ.hasSubMenu()) {
                    c1386eQ.f753o.h(arrayList, i, keyEvent);
                }
                char c = zN ? c1386eQ.j : c1386eQ.h;
                if ((modifiers & 69647) == ((zN ? c1386eQ.k : c1386eQ.i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if (c != cArr[0] && c != cArr[2]) {
                        if (zN && c == '\b') {
                            if (i == 67) {
                            }
                        }
                    }
                    if (c1386eQ.isEnabled()) {
                        arrayList.add(c1386eQ);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C1386eQ) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
            boolean zK = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC2651rQ interfaceC2651rQ = (InterfaceC2651rQ) weakReference.get();
                if (interfaceC2651rQ == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zK |= interfaceC2651rQ.k();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.j;
            if (zK) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i = 0; i < size; i++) {
                    C1386eQ c1386eQ = (C1386eQ) arrayListL.get(i);
                    if (c1386eQ.f()) {
                        arrayList.add(c1386eQ);
                    } else {
                        arrayList2.add(c1386eQ);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z = this.h;
        ArrayList arrayList = this.g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C1386eQ c1386eQ = (C1386eQ) arrayList2.get(i);
            if (c1386eQ.isVisible()) {
                arrayList.add(c1386eQ);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList;
    }

    public boolean m() {
        return this.w;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z) {
        if (this.p) {
            this.q = true;
            if (z) {
                this.r = true;
                return;
            }
            return;
        }
        if (z) {
            this.h = true;
            this.k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC2651rQ interfaceC2651rQ = (InterfaceC2651rQ) weakReference.get();
            if (interfaceC2651rQ == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC2651rQ.d(z);
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C1386eQ c1386eQG = g(i, keyEvent);
        boolean zQ = c1386eQG != null ? q(c1386eQG, null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    /* JADX WARN: Code duplicated, block: B:31:0x004a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:36:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005d  */
    /* JADX WARN: Code duplicated, block: B:44:0x006e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0072  */
    /* JADX WARN: Code duplicated, block: B:49:0x007b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00aa A[SYNTHETIC] */
    public final boolean q(MenuItem menuItem, InterfaceC2651rQ interfaceC2651rQ, int i) {
        ActionProviderVisibilityListenerC1484fQ actionProviderVisibilityListenerC1484fQ;
        boolean zExpandActionView;
        ActionProviderVisibilityListenerC1484fQ actionProviderVisibilityListenerC1484fQ2;
        boolean z;
        SubMenuC2483ph0 subMenuC2483ph0;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        InterfaceC2651rQ interfaceC2651rQ2;
        C1386eQ c1386eQ = (C1386eQ) menuItem;
        boolean zM = false;
        if (c1386eQ == null || !c1386eQ.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c1386eQ.p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c1386eQ)) {
            ZP zp = c1386eQ.n;
            if (zp.e(zp, c1386eQ)) {
                zExpandActionView = true;
            } else {
                Intent intent = c1386eQ.g;
                if (intent != null) {
                    try {
                        zp.a.startActivity(intent);
                    } catch (ActivityNotFoundException unused) {
                        actionProviderVisibilityListenerC1484fQ = c1386eQ.A;
                        if (actionProviderVisibilityListenerC1484fQ == null) {
                        }
                        zExpandActionView = false;
                        actionProviderVisibilityListenerC1484fQ2 = c1386eQ.A;
                        if (actionProviderVisibilityListenerC1484fQ2 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (c1386eQ.e()) {
                            zExpandActionView |= c1386eQ.expandActionView();
                            if (zExpandActionView) {
                                c(true);
                            }
                        } else if (c1386eQ.hasSubMenu()) {
                            if ((i & 4) == 0) {
                                c(false);
                            }
                            if (!c1386eQ.hasSubMenu()) {
                                SubMenuC2483ph0 subMenuC2483ph1 = new SubMenuC2483ph0(this.a, this, c1386eQ);
                                c1386eQ.f753o = subMenuC2483ph1;
                                subMenuC2483ph1.setHeaderTitle(c1386eQ.e);
                            }
                            subMenuC2483ph0 = c1386eQ.f753o;
                            if (z) {
                                actionProviderVisibilityListenerC1484fQ2.c.getClass();
                                actionProviderVisibilityListenerC1484fQ2.b.onPrepareSubMenu(subMenuC2483ph0);
                            }
                            copyOnWriteArrayList = this.u;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                if (interfaceC2651rQ != null) {
                                }
                                for (WeakReference weakReference : copyOnWriteArrayList) {
                                    interfaceC2651rQ2 = (InterfaceC2651rQ) weakReference.get();
                                    if (interfaceC2651rQ2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zM) {
                                        zM = interfaceC2651rQ2.m(subMenuC2483ph0);
                                    }
                                }
                            }
                            zExpandActionView |= zM;
                            if (!zExpandActionView) {
                                c(true);
                            }
                        } else {
                            if ((i & 4) == 0) {
                                c(false);
                            }
                            if (!c1386eQ.hasSubMenu()) {
                                SubMenuC2483ph0 subMenuC2483ph2 = new SubMenuC2483ph0(this.a, this, c1386eQ);
                                c1386eQ.f753o = subMenuC2483ph2;
                                subMenuC2483ph2.setHeaderTitle(c1386eQ.e);
                            }
                            subMenuC2483ph0 = c1386eQ.f753o;
                            if (z) {
                                actionProviderVisibilityListenerC1484fQ2.c.getClass();
                                actionProviderVisibilityListenerC1484fQ2.b.onPrepareSubMenu(subMenuC2483ph0);
                            }
                            copyOnWriteArrayList = this.u;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                zM = interfaceC2651rQ != null ? interfaceC2651rQ.m(subMenuC2483ph0) : false;
                                while (r8.hasNext()) {
                                    interfaceC2651rQ2 = (InterfaceC2651rQ) weakReference.get();
                                    if (interfaceC2651rQ2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zM) {
                                        zM = interfaceC2651rQ2.m(subMenuC2483ph0);
                                    }
                                }
                            }
                            zExpandActionView |= zM;
                            if (!zExpandActionView) {
                                c(true);
                            }
                        }
                        return zExpandActionView;
                    }
                    zExpandActionView = true;
                } else {
                    actionProviderVisibilityListenerC1484fQ = c1386eQ.A;
                    if (actionProviderVisibilityListenerC1484fQ == null && actionProviderVisibilityListenerC1484fQ.b.onPerformDefaultAction()) {
                        zExpandActionView = true;
                    } else {
                        zExpandActionView = false;
                    }
                }
            }
        } else {
            zExpandActionView = true;
        }
        actionProviderVisibilityListenerC1484fQ2 = c1386eQ.A;
        if (actionProviderVisibilityListenerC1484fQ2 == null && actionProviderVisibilityListenerC1484fQ2.b.hasSubMenu()) {
            z = true;
        } else {
            z = false;
        }
        if (c1386eQ.e()) {
            zExpandActionView |= c1386eQ.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (c1386eQ.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                c(false);
            }
            if (!c1386eQ.hasSubMenu()) {
                SubMenuC2483ph0 subMenuC2483ph3 = new SubMenuC2483ph0(this.a, this, c1386eQ);
                c1386eQ.f753o = subMenuC2483ph3;
                subMenuC2483ph3.setHeaderTitle(c1386eQ.e);
            }
            subMenuC2483ph0 = c1386eQ.f753o;
            if (z) {
                actionProviderVisibilityListenerC1484fQ2.c.getClass();
                actionProviderVisibilityListenerC1484fQ2.b.onPrepareSubMenu(subMenuC2483ph0);
            }
            copyOnWriteArrayList = this.u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (interfaceC2651rQ != null) {
                }
                while (r8.hasNext()) {
                    interfaceC2651rQ2 = (InterfaceC2651rQ) weakReference.get();
                    if (interfaceC2651rQ2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zM) {
                        zM = interfaceC2651rQ2.m(subMenuC2483ph0);
                    }
                }
            }
            zExpandActionView |= zM;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(InterfaceC2651rQ interfaceC2651rQ) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC2651rQ interfaceC2651rQ2 = (InterfaceC2651rQ) weakReference.get();
            if (interfaceC2651rQ2 == null || interfaceC2651rQ2 == interfaceC2651rQ) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C1386eQ) arrayList.get(i3)).b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C1386eQ) arrayList.get(i3)).b != i) {
                    break;
                }
                if (i3 >= 0) {
                    ArrayList arrayList2 = this.f;
                    if (i3 < arrayList2.size()) {
                        arrayList2.remove(i3);
                    }
                }
                i2 = i4;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C1386eQ) arrayList.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.f;
            if (i2 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i2);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC2483ph0) item.getSubMenu()).s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1386eQ c1386eQ = (C1386eQ) arrayList.get(i2);
            if (c1386eQ.b == i) {
                c1386eQ.g(z2);
                c1386eQ.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1386eQ c1386eQ = (C1386eQ) arrayList.get(i2);
            if (c1386eQ.b == i) {
                c1386eQ.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C1386eQ c1386eQ = (C1386eQ) arrayList.get(i2);
            if (c1386eQ.b == i) {
                int i3 = c1386eQ.x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                c1386eQ.x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC2483ph0) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f656o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i > 0) {
                this.m = this.b.getText(i);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i2 > 0) {
                this.n = AbstractC3354yh.b(this.a, i2);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.f656o = null;
        }
        p(false);
    }

    public final void v() {
        this.p = false;
        if (this.q) {
            this.q = false;
            p(this.r);
        }
    }

    public final void w() {
        if (this.p) {
            return;
        }
        this.p = true;
        this.q = false;
        this.r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C1386eQ c1386eQA = a(i, i2, i3, charSequence);
        SubMenuC2483ph0 subMenuC2483ph0 = new SubMenuC2483ph0(this.a, this, c1386eQA);
        c1386eQA.f753o = subMenuC2483ph0;
        subMenuC2483ph0.setHeaderTitle(c1386eQA.e);
        return subMenuC2483ph0;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }

    public ZP k() {
        return this;
    }
}
