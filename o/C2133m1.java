package o;

import android.content.ClipData;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: o.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2133m1 implements InterfaceC2555qQ, XP, NK, Q4, VV, InterfaceC1289dQ, Ub0, InterfaceC3432zV, InterfaceC1410eh, InterfaceC1606gh, InterfaceC0839Vk, InterfaceC1391eV, InterfaceC0406Es {
    public final /* synthetic */ int l;
    public Object m;

    public /* synthetic */ C2133m1(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    @Override // o.Ub0
    public long A() {
        long jMin = Long.MAX_VALUE;
        for (Ub0 ub0 : (Ub0[]) this.m) {
            long jA = ub0.A();
            if (jA != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jA);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // o.InterfaceC1410eh
    public void D(Uri uri) {
        ((ContentInfo.Builder) this.m).setLinkUri(uri);
    }

    @Override // o.InterfaceC1606gh
    public int G() {
        return ((ContentInfo) this.m).getSource();
    }

    @Override // o.NK
    public void H(int i, int i2, Object obj) {
        ((O50) this.m).a.d(i, i2, obj);
    }

    @Override // o.Ub0
    public boolean K(long j) {
        boolean zK;
        boolean z = false;
        do {
            long jO = o();
            if (jO == Long.MIN_VALUE) {
                break;
            }
            zK = false;
            for (Ub0 ub0 : (Ub0[]) this.m) {
                long jO2 = ub0.o();
                boolean z2 = jO2 != Long.MIN_VALUE && jO2 <= j;
                if (jO2 == jO || z2) {
                    zK |= ub0.K(j);
                }
            }
            z |= zK;
        } while (zK);
        return z;
    }

    @Override // o.InterfaceC3432zV
    public Object M() {
        switch (this.l) {
            case 12:
                Class cls = (Class) this.m;
                try {
                    return Jq0.a.a(cls);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
                }
            default:
                Constructor constructor = (Constructor) this.m;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e2) {
                    AbstractC2506pt abstractC2506pt = A60.a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
                } catch (InstantiationException e3) {
                    throw new RuntimeException("Failed to invoke constructor '" + A60.b(constructor) + "' with no args", e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Failed to invoke constructor '" + A60.b(constructor) + "' with no args", e4.getCause());
                }
        }
    }

    @Override // o.XP
    public void N(ZP zp) {
        XP xp = ((ActionMenuView) this.m).G;
        if (xp != null) {
            xp.N(zp);
        }
    }

    @Override // o.Ub0
    public void O(long j) {
        for (Ub0 ub0 : (Ub0[]) this.m) {
            ub0.O(j);
        }
    }

    @Override // o.InterfaceC1410eh
    public void P(int i) {
        ((ContentInfo.Builder) this.m).setFlags(i);
    }

    public void Q() {
        Socket socket;
        io.sentry.android.core.internal.util.d dVar = (io.sentry.android.core.internal.util.d) this.m;
        Iterator it = ((ConcurrentLinkedQueue) dVar.e).iterator();
        AbstractC1474fG.i(it, "connections.iterator()");
        while (it.hasNext()) {
            C50 c50 = (C50) it.next();
            AbstractC1474fG.i(c50, "connection");
            synchronized (c50) {
                if (c50.p.isEmpty()) {
                    it.remove();
                    c50.j = true;
                    socket = c50.d;
                    AbstractC1474fG.g(socket);
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                Mr0.e(socket);
            }
        }
        if (((ConcurrentLinkedQueue) dVar.e).isEmpty()) {
            ((C3357yi0) dVar.c).a();
        }
    }

    public void R() {
        ((C1442ex) this.m).r.R();
    }

    @Override // o.InterfaceC2555qQ
    public void a(ZP zp, boolean z) {
        if (zp instanceof SubMenuC2483ph0) {
            ((SubMenuC2483ph0) zp).z.k().c(false);
        }
        InterfaceC2555qQ interfaceC2555qQ = ((C2424p1) this.m).p;
        if (interfaceC2555qQ != null) {
            interfaceC2555qQ.a(zp, z);
        }
    }

    @Override // o.Ub0
    public boolean b() {
        for (Ub0 ub0 : (Ub0[]) this.m) {
            if (ub0.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC1289dQ
    public void d(ZP zp, MenuItem menuItem) {
        ((ViewOnKeyListenerC0752Sb) this.m).r.removeCallbacksAndMessages(zp);
    }

    @Override // o.InterfaceC1606gh
    public ClipData e() {
        return ((ContentInfo) this.m).getClip();
    }

    @Override // o.InterfaceC1410eh
    public C1704hh f() {
        return new C1704hh(new C2133m1(((ContentInfo.Builder) this.m).build()));
    }

    @Override // o.InterfaceC1289dQ
    public void g(ZP zp, C1386eQ c1386eQ) {
        ViewOnKeyListenerC0752Sb viewOnKeyListenerC0752Sb = (ViewOnKeyListenerC0752Sb) this.m;
        viewOnKeyListenerC0752Sb.r.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0752Sb.t;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (zp == ((C0726Rb) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        viewOnKeyListenerC0752Sb.r.postAtTime(new RunnableC0700Qb(this, i2 < arrayList.size() ? (C0726Rb) arrayList.get(i2) : null, c1386eQ, zp), zp, SystemClock.uptimeMillis() + 200);
    }

    @Override // o.NK
    public void h(int i, int i2) {
        ((O50) this.m).a.f(i, i2);
    }

    @Override // o.NK
    public void i(int i, int i2) {
        ((O50) this.m).a.c(i, i2);
    }

    @Override // o.InterfaceC1410eh
    public void k(Bundle bundle) {
        ((ContentInfo.Builder) this.m).setExtras(bundle);
    }

    @Override // o.InterfaceC0839Vk
    public short l() throws IOException {
        int i = ((InputStream) this.m).read();
        if (i != -1) {
            return (short) i;
        }
        throw new C0813Uk();
    }

    @Override // o.InterfaceC1391eV
    public void m(AbstractC1099bV abstractC1099bV, int i) {
        if (abstractC1099bV instanceof C3176wp) {
            C3176wp c3176wp = (C3176wp) abstractC1099bV;
            AbstractC1099bV abstractC1099bVV = abstractC1099bV.v();
            if (c3176wp.f1103o.f1008o) {
                if ((abstractC1099bVV instanceof Qi0) || ((abstractC1099bVV instanceof C3176wp) && !((C3176wp) abstractC1099bVV).f1103o.p)) {
                    StringBuilder sb = (StringBuilder) this.m;
                    if (Qi0.L(sb)) {
                        return;
                    }
                    sb.append(' ');
                }
            }
        }
    }

    @Override // o.InterfaceC1391eV
    public void n(AbstractC1099bV abstractC1099bV, int i) {
        boolean z = abstractC1099bV instanceof Qi0;
        StringBuilder sb = (StringBuilder) this.m;
        if (z) {
            Qi0 qi0 = (Qi0) abstractC1099bV;
            String strI = qi0.I();
            if (C3176wp.V(qi0.l) || (qi0 instanceof C3049va)) {
                sb.append(strI);
                return;
            } else {
                AbstractC1021ah0.a(sb, strI, Qi0.L(sb));
                return;
            }
        }
        if (abstractC1099bV instanceof C3176wp) {
            C3176wp c3176wp = (C3176wp) abstractC1099bV;
            if (sb.length() > 0) {
                if ((c3176wp.f1103o.f1008o || c3176wp.u("br")) && !Qi0.L(sb)) {
                    sb.append(' ');
                }
            }
        }
    }

    @Override // o.Ub0
    public long o() {
        long jMin = Long.MAX_VALUE;
        for (Ub0 ub0 : (Ub0[]) this.m) {
            long jO = ub0.o();
            if (jO != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jO);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // o.InterfaceC0406Es
    public Object q() {
        switch (this.l) {
            case 24:
                C2613qy c2613qy = (C2613qy) this.m;
                return new RunnableC0501Ij((C3257xh) c2613qy.n, (Na0) c2613qy.f996o);
            default:
                Tl0 tl0 = (Tl0) this.m;
                return new C2984uq((ExecutorServiceC1956kA) tl0.l, (ExecutorServiceC1956kA) tl0.m, (ExecutorServiceC1956kA) tl0.n, (ExecutorServiceC1956kA) tl0.f542o, (InterfaceC3081vq) tl0.p, (InterfaceC3275xq) tl0.q, (Na0) tl0.r);
        }
    }

    @Override // o.VV
    public Kw0 r(View view, Kw0 kw0) {
        switch (this.l) {
            case 7:
                DialogC2924u9 dialogC2924u9 = (DialogC2924u9) this.m;
                C2827t9 c2827t9 = dialogC2924u9.x;
                if (c2827t9 != null) {
                    dialogC2924u9.q.W.remove(c2827t9);
                }
                C2827t9 c2827t10 = new C2827t9(dialogC2924u9.t, kw0);
                dialogC2924u9.x = c2827t10;
                c2827t10.e(dialogC2924u9.getWindow());
                BottomSheetBehavior bottomSheetBehavior = dialogC2924u9.q;
                C2827t9 c2827t11 = dialogC2924u9.x;
                ArrayList arrayList = bottomSheetBehavior.W;
                if (!arrayList.contains(c2827t11)) {
                    arrayList.add(c2827t11);
                }
                break;
            default:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.m;
                if (!Objects.equals(coordinatorLayout.y, kw0)) {
                    coordinatorLayout.y = kw0;
                    boolean z = kw0.d() > 0;
                    coordinatorLayout.z = z;
                    coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                    Hw0 hw0 = kw0.a;
                    if (!hw0.m()) {
                        int childCount = coordinatorLayout.getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            View childAt = coordinatorLayout.getChildAt(i);
                            WeakHashMap weakHashMap = It0.a;
                            if (!childAt.getFitsSystemWindows() || ((C0784Th) childAt.getLayoutParams()).a == null || !hw0.m()) {
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                break;
        }
        return kw0;
    }

    @Override // o.InterfaceC0839Vk
    public int s() {
        return (l() << 8) | l();
    }

    @Override // o.InterfaceC0839Vk
    public long skip(long j) throws IOException {
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            InputStream inputStream = (InputStream) this.m;
            long jSkip = inputStream.skip(j2);
            if (jSkip > 0) {
                j2 -= jSkip;
            } else {
                if (inputStream.read() == -1) {
                    break;
                }
                j2--;
            }
        }
        return j - j2;
    }

    public String toString() {
        switch (this.l) {
            case 15:
                return "ContentInfoCompat{" + ((ContentInfo) this.m) + "}";
            default:
                return super.toString();
        }
    }

    @Override // o.InterfaceC2555qQ
    public boolean u(ZP zp) {
        C2424p1 c2424p1 = (C2424p1) this.m;
        if (zp == c2424p1.n) {
            return false;
        }
        c2424p1.J = ((SubMenuC2483ph0) zp).A.a;
        InterfaceC2555qQ interfaceC2555qQ = c2424p1.p;
        if (interfaceC2555qQ != null) {
            return interfaceC2555qQ.u(zp);
        }
        return false;
    }

    @Override // o.InterfaceC1606gh
    public int v() {
        return ((ContentInfo) this.m).getFlags();
    }

    @Override // o.XP
    public boolean w(ZP zp, MenuItem menuItem) {
        InterfaceC2714s1 interfaceC2714s1 = ((ActionMenuView) this.m).L;
        if (interfaceC2714s1 != null) {
            Iterator it = ((CopyOnWriteArrayList) ((Hl0) interfaceC2714s1).l.R.n).iterator();
            while (it.hasNext()) {
                if (((C2514px) it.next()).a.p()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.InterfaceC0839Vk
    public int x(int i, byte[] bArr) throws C0813Uk {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = ((InputStream) this.m).read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new C0813Uk();
        }
        return i2;
    }

    @Override // o.InterfaceC1606gh
    public ContentInfo y() {
        return (ContentInfo) this.m;
    }

    @Override // o.NK
    public void z(int i, int i2) {
        ((O50) this.m).a.e(i, i2);
    }

    public C2133m1(I6 i6) {
        this.l = 5;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(i6.l).setFlags(i6.m).setUsage(i6.n);
        int i = Lr0.a;
        if (i >= 29) {
            G6.a(usage, i6.f320o);
        }
        if (i >= 32) {
            H6.a(usage, i6.p);
        }
        this.m = usage.build();
    }

    public C2133m1(int i) {
        this.l = i;
        switch (i) {
            case 11:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                AbstractC1474fG.j(timeUnit, "timeUnit");
                this.m = new io.sentry.android.core.internal.util.d(C3454zi0.i, timeUnit);
                break;
            case 29:
                this.m = null;
                break;
            default:
                this.m = new CopyOnWriteArrayList();
                break;
        }
    }

    public C2133m1(TextView textView) {
        this.l = 23;
        Jp0.h(textView, "textView cannot be null");
        this.m = new C0818Up(textView);
    }

    public C2133m1(EditText editText) {
        this.l = 22;
        Jp0.h(editText, "editText cannot be null");
        this.m = new C2720s4(editText, 24);
    }

    public C2133m1(ContentInfo contentInfo) {
        this.l = 15;
        contentInfo.getClass();
        this.m = AbstractC1954k9.l(contentInfo);
    }

    public C2133m1(ClipData clipData, int i) {
        this.l = 14;
        this.m = AbstractC1954k9.j(clipData, i);
    }

    public void C(int i) {
    }

    public void j(int i) {
    }

    public void J(int i, float f) {
    }
}
