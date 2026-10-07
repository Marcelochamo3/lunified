package o;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.skidush.clonex.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: o.no0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2303no0 implements IP, InterfaceC0376Do, InterfaceC2604qt0, InterfaceC2486pj {
    public final /* synthetic */ int l;
    public final Object m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f941o;
    public Object p;

    public /* synthetic */ C2303no0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.l = i;
        this.m = obj;
        this.n = obj2;
        this.f941o = obj3;
        this.p = obj4;
    }

    public static C2303no0 a(View view) {
        int i = R.id.btn_is_loading_retry;
        TextView textView = (TextView) Sr0.g(view, R.id.btn_is_loading_retry);
        if (textView != null) {
            i = R.id.g_is_loading_retry;
            Group group = (Group) Sr0.g(view, R.id.g_is_loading_retry);
            if (group != null) {
                i = R.id.pb_is_loading;
                ProgressBar progressBar = (ProgressBar) Sr0.g(view, R.id.pb_is_loading);
                if (progressBar != null) {
                    i = R.id.tv_is_loading_error;
                    if (((TextView) Sr0.g(view, R.id.tv_is_loading_error)) != null) {
                        return new C2303no0((ConstraintLayout) view, textView, group, progressBar, 9);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // o.IP
    public void B(int i, CP cp, C2069lP c2069lP) {
        if (l(i, cp)) {
            ((C2613qy) this.n).p(m(c2069lP));
        }
    }

    @Override // o.IP
    public void C(int i, CP cp, C0991aL c0991aL, C2069lP c2069lP) {
        if (l(i, cp)) {
            ((C2613qy) this.n).z(c0991aL, m(c2069lP));
        }
    }

    @Override // o.InterfaceC0376Do
    public void D(int i, CP cp) {
        if (l(i, cp)) {
            ((C0350Co) this.f941o).f();
        }
    }

    @Override // o.InterfaceC2486pj
    public InterfaceC2583qj H() {
        return new C3225xI(((InterfaceC2486pj) this.m).H(), (String) this.n, (Context) this.f941o, (String) this.p);
    }

    @Override // o.IP
    public void K(int i, CP cp, C2069lP c2069lP) {
        if (l(i, cp)) {
            ((C2613qy) this.n).L(m(c2069lP));
        }
    }

    @Override // o.IP
    public void L(int i, CP cp, C0991aL c0991aL, C2069lP c2069lP) {
        if (l(i, cp)) {
            ((C2613qy) this.n).B(c0991aL, m(c2069lP));
        }
    }

    @Override // o.InterfaceC2604qt0
    public View b() {
        switch (this.l) {
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (ConstraintLayout) this.m;
    }

    @Override // o.InterfaceC0376Do
    public void c(int i, CP cp) {
        if (l(i, cp)) {
            ((C0350Co) this.f941o).a();
        }
    }

    public Ai0 d() {
        WT wt = (WT) this.f941o;
        if (wt == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
        }
        ArrayList arrayList = (ArrayList) this.p;
        if (!(!arrayList.isEmpty())) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        TT tt = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            Context context = (Context) this.m;
            int i = 0;
            if (!zHasNext) {
                int[] iArrW0 = AbstractC0911Ye.w0(arrayList2);
                Intent intent = (Intent) this.n;
                intent.putExtra("android-support-nav:controller:deepLinkIds", iArrW0);
                intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                Ai0 ai0 = new Ai0(context);
                Intent intent2 = new Intent(intent);
                ComponentName component = intent2.getComponent();
                if (component == null) {
                    component = intent2.resolveActivity(ai0.m.getPackageManager());
                }
                if (component != null) {
                    ai0.a(component);
                }
                ArrayList arrayList4 = ai0.l;
                arrayList4.add(intent2);
                int size = arrayList4.size();
                while (i < size) {
                    Intent intent3 = (Intent) arrayList4.get(i);
                    if (intent3 != null) {
                        intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                    }
                    i++;
                }
                return ai0;
            }
            QT qt = (QT) it.next();
            int i2 = qt.a;
            TT ttE = e(i2);
            if (ttE == null) {
                int i3 = TT.v;
                throw new IllegalArgumentException("Navigation destination " + AbstractC1923jt0.m(context, i2) + " cannot be found in the navigation graph " + wt);
            }
            int[] iArrD = ttE.d(tt);
            int length = iArrD.length;
            while (i < length) {
                arrayList2.add(Integer.valueOf(iArrD[i]));
                arrayList3.add(qt.b);
                i++;
            }
            tt = ttE;
        }
    }

    public TT e(int i) {
        M5 m5 = new M5();
        WT wt = (WT) this.f941o;
        AbstractC1474fG.g(wt);
        m5.f(wt);
        while (!m5.isEmpty()) {
            TT tt = (TT) m5.l();
            if (tt.s == i) {
                return tt;
            }
            if (tt instanceof WT) {
                VT vt = new VT((WT) tt);
                while (vt.hasNext()) {
                    m5.f((TT) vt.next());
                }
            }
        }
        return null;
    }

    public C2109lo0 f(String str) throws Throwable {
        G80 g80;
        G80 g80A = G80.a(1, "SELECT * FROM tv_shows WHERE id = ?");
        g80A.o(1, str);
        F80 f80 = (F80) this.m;
        f80.b();
        Cursor cursorW = U9.w(f80, g80A);
        try {
            int iM = AbstractC3409z9.m(cursorW, "id");
            int iM2 = AbstractC3409z9.m(cursorW, "title");
            int iM3 = AbstractC3409z9.m(cursorW, "overview");
            int iM4 = AbstractC3409z9.m(cursorW, "runtime");
            int iM5 = AbstractC3409z9.m(cursorW, "trailer");
            int iM6 = AbstractC3409z9.m(cursorW, "quality");
            int iM7 = AbstractC3409z9.m(cursorW, "rating");
            int iM8 = AbstractC3409z9.m(cursorW, "poster");
            int iM9 = AbstractC3409z9.m(cursorW, "banner");
            int iM10 = AbstractC3409z9.m(cursorW, "serieId");
            int iM11 = AbstractC3409z9.m(cursorW, "released");
            int iM12 = AbstractC3409z9.m(cursorW, "isFavorite");
            C2109lo0 c2109lo0 = null;
            String string = null;
            if (cursorW.moveToFirst()) {
                g80 = g80A;
                try {
                    C2109lo0 c2109lo1 = new C2109lo0();
                    String string2 = cursorW.getString(iM);
                    AbstractC1474fG.j(string2, "<set-?>");
                    c2109lo1.a = string2;
                    String string3 = cursorW.getString(iM2);
                    AbstractC1474fG.j(string3, "<set-?>");
                    c2109lo1.b = string3;
                    c2109lo1.c = cursorW.isNull(iM3) ? null : cursorW.getString(iM3);
                    c2109lo1.d = cursorW.isNull(iM4) ? null : Integer.valueOf(cursorW.getInt(iM4));
                    c2109lo1.e = cursorW.isNull(iM5) ? null : cursorW.getString(iM5);
                    c2109lo1.f = cursorW.isNull(iM6) ? null : cursorW.getString(iM6);
                    c2109lo1.g = cursorW.isNull(iM7) ? null : Double.valueOf(cursorW.getDouble(iM7));
                    c2109lo1.h = cursorW.isNull(iM8) ? null : cursorW.getString(iM8);
                    c2109lo1.i = cursorW.isNull(iM9) ? null : cursorW.getString(iM9);
                    c2109lo1.j = cursorW.isNull(iM10) ? null : cursorW.getString(iM10);
                    if (!cursorW.isNull(iM11)) {
                        string = cursorW.getString(iM11);
                    }
                    ((C0519Jb) this.f941o).getClass();
                    c2109lo1.p = C0519Jb.H(string);
                    c2109lo1.q = cursorW.getInt(iM12) != 0;
                    c2109lo0 = c2109lo1;
                } catch (Throwable th) {
                    th = th;
                    cursorW.close();
                    g80.l();
                    throw th;
                }
            } else {
                g80 = g80A;
            }
            cursorW.close();
            g80.l();
            return c2109lo0;
        } catch (Throwable th2) {
            th = th2;
            g80 = g80A;
        }
    }

    @Override // o.IP
    public void g(int i, CP cp, C0991aL c0991aL, C2069lP c2069lP) {
        if (l(i, cp)) {
            ((C2613qy) this.n).H(c0991aL, m(c2069lP));
        }
    }

    public C2538q90 h(ArrayList arrayList) {
        StringBuilder sbK = AbstractC1701hf0.k("SELECT * FROM tv_shows WHERE id IN (");
        int size = arrayList.size();
        zy0.d(sbK, size);
        sbK.append(")");
        G80 g80A = G80.a(size, sbK.toString());
        Iterator it = arrayList.iterator();
        int i = 1;
        while (it.hasNext()) {
            g80A.o(i, (String) it.next());
            i++;
        }
        CallableC2206mo0 callableC2206mo0 = new CallableC2206mo0(this, g80A, 1);
        return UK.j((F80) this.m, new String[]{"tv_shows"}, callableC2206mo0);
    }

    public void i(C2109lo0 c2109lo0) {
        F80 f80 = (F80) this.m;
        f80.b();
        f80.c();
        try {
            ((C0482Hq) this.n).h(c2109lo0);
            f80.m();
        } finally {
            f80.j();
        }
    }

    @Override // o.InterfaceC0376Do
    public void j(int i, CP cp) {
        if (l(i, cp)) {
            ((C0350Co) this.f941o).b();
        }
    }

    @Override // o.InterfaceC0376Do
    public void k(int i, CP cp, int i2) {
        if (l(i, cp)) {
            ((C0350Co) this.f941o).d(i2);
        }
    }

    public boolean l(int i, CP cp) {
        CP cpS;
        Object obj = this.m;
        AbstractC1506fg abstractC1506fg = (AbstractC1506fg) this.p;
        if (cp != null) {
            cpS = abstractC1506fg.s(obj, cp);
            if (cpS == null) {
                return false;
            }
        } else {
            cpS = null;
        }
        int iU = abstractC1506fg.u(i, obj);
        C2613qy c2613qy = (C2613qy) this.n;
        if (c2613qy.m != iU || !Lr0.a((CP) c2613qy.n, cpS)) {
            this.n = new C2613qy((CopyOnWriteArrayList) abstractC1506fg.c.f996o, iU, cpS);
        }
        C0350Co c0350Co = (C0350Co) this.f941o;
        if (c0350Co.a == iU && Lr0.a(c0350Co.b, cpS)) {
            return true;
        }
        this.f941o = new C0350Co(abstractC1506fg.d.c, iU, cpS);
        return true;
    }

    public C2069lP m(C2069lP c2069lP) {
        long j = c2069lP.f;
        AbstractC1506fg abstractC1506fg = (AbstractC1506fg) this.p;
        Object obj = this.m;
        long jT = abstractC1506fg.t(j, obj);
        long j2 = c2069lP.g;
        long jT2 = abstractC1506fg.t(j2, obj);
        if (jT == c2069lP.f && jT2 == j2) {
            return c2069lP;
        }
        return new C2069lP(c2069lP.a, c2069lP.b, c2069lP.c, c2069lP.d, c2069lP.e, jT, jT2);
    }

    public void n(C2109lo0 c2109lo0) {
        F80 f80 = (F80) this.m;
        f80.b();
        f80.c();
        try {
            ((C0508Iq) this.p).f(c2109lo0);
            f80.m();
        } finally {
            f80.j();
        }
    }

    @Override // o.IP
    public void o(int i, CP cp, C0991aL c0991aL, C2069lP c2069lP, IOException iOException, boolean z) {
        if (l(i, cp)) {
            ((C2613qy) this.n).E(c0991aL, m(c2069lP), iOException, z);
        }
    }

    public void p() {
        Iterator it = ((ArrayList) this.p).iterator();
        while (it.hasNext()) {
            int i = ((QT) it.next()).a;
            if (e(i) == null) {
                int i2 = TT.v;
                StringBuilder sbL = AbstractC1701hf0.l("Navigation destination ", AbstractC1923jt0.m((Context) this.m, i), " cannot be found in the navigation graph ");
                sbL.append((WT) this.f941o);
                throw new IllegalArgumentException(sbL.toString());
            }
        }
    }

    public String toString() {
        switch (this.l) {
            case 14:
                return "horizontal=" + ((C1735hw0) this.n) + "; vertical=" + ((C1735hw0) this.m);
            default:
                return super.toString();
        }
    }

    @Override // o.InterfaceC0376Do
    public void x(int i, CP cp) {
        if (l(i, cp)) {
            ((C0350Co) this.f941o).c();
        }
    }

    @Override // o.InterfaceC0376Do
    public void y(int i, CP cp, Exception exc) {
        if (l(i, cp)) {
            ((C0350Co) this.f941o).e(exc);
        }
    }

    public C2303no0(YT yt) {
        Intent launchIntentForPackage;
        this.l = 10;
        AbstractC1474fG.j(yt, "navController");
        Context context = yt.a;
        AbstractC1474fG.j(context, "context");
        this.m = context;
        Activity activity = (Activity) Vb0.I(Vb0.N(Vb0.K(context, C1182cH.x), C1182cH.y));
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.n = launchIntentForPackage;
        this.p = new ArrayList();
        this.f941o = yt.j();
    }

    public C2303no0(int i) {
        this.l = i;
        switch (i) {
            case 14:
                C1735hw0 c1735hw0 = new C1735hw0();
                this.m = c1735hw0;
                C1735hw0 c1735hw1 = new C1735hw0();
                this.n = c1735hw1;
                this.f941o = c1735hw1;
                this.p = c1735hw0;
                break;
            default:
                this.m = new S5();
                this.n = new SparseArray();
                this.f941o = new C1480fM();
                this.p = new S5();
                break;
        }
    }

    public C2303no0(InterfaceC2159mI interfaceC2159mI) {
        this.l = 12;
        this.f941o = "";
        this.p = "";
        this.m = interfaceC2159mI;
        this.n = interfaceC2159mI.b().a();
    }

    public C2303no0(ArrayList arrayList, InterfaceC2001kj0 interfaceC2001kj0, C1813in c1813in, ContentResolver contentResolver) {
        this.l = 1;
        this.m = interfaceC2001kj0;
        this.n = c1813in;
        this.f941o = contentResolver;
        this.p = arrayList;
    }

    public C2303no0(F80 f80) {
        this.l = 0;
        this.f941o = new C0519Jb(6);
        this.m = f80;
        this.n = new C0482Hq(this, f80, 3);
        this.p = new C0508Iq(this, f80, 2);
    }

    public C2303no0(ConstraintLayout constraintLayout, Button button, Button button2, Button button3, ProgressBar progressBar, TextView textView, TextView textView2, TextView textView3) {
        this.l = 3;
        this.m = constraintLayout;
        this.n = button;
        this.f941o = progressBar;
        this.p = textView3;
    }

    public C2303no0(AbstractC1506fg abstractC1506fg, Object obj) {
        this.l = 2;
        this.p = abstractC1506fg;
        this.n = abstractC1506fg.a(null);
        this.f941o = new C0350Co(abstractC1506fg.d.c, 0, null);
        this.m = obj;
    }

    public C2303no0(C1031am0 c1031am0, boolean[] zArr) {
        this.l = 11;
        this.m = c1031am0;
        this.n = zArr;
        int i = c1031am0.l;
        this.f941o = new boolean[i];
        this.p = new boolean[i];
    }
}
