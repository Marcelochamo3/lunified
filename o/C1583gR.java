package o;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.skidush.clonex.R;
import com.skidush.navigation.widget.NavigationSlideHeaderView;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.gR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1583gR implements InterfaceC2604qt0, InterfaceC2811t1 {
    public static final C2743sL q = new C2743sL(3);
    public static final C3179wq0 r = new C3179wq0(2);
    public final /* synthetic */ int l;
    public Object m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f793o;
    public Object p;

    public /* synthetic */ C1583gR(ConstraintLayout constraintLayout, Object obj, View view, View view2, int i) {
        this.l = i;
        this.m = constraintLayout;
        this.n = obj;
        this.f793o = view;
        this.p = view2;
    }

    public static void D(long j, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    public static C1583gR g(View view) {
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
                        return new C1583gR((ConstraintLayout) view, textView, group, progressBar, 9);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static C1583gR i(NavigationSlideHeaderView navigationSlideHeaderView) {
        int i = R.id.iv_navigation_header_icon;
        ImageView imageView = (ImageView) Sr0.g(navigationSlideHeaderView, R.id.iv_navigation_header_icon);
        if (imageView != null) {
            i = R.id.tv_navigation_header_subtitle;
            TextView textView = (TextView) Sr0.g(navigationSlideHeaderView, R.id.tv_navigation_header_subtitle);
            if (textView != null) {
                i = R.id.tv_navigation_header_title;
                TextView textView2 = (TextView) Sr0.g(navigationSlideHeaderView, R.id.tv_navigation_header_title);
                if (textView2 != null) {
                    return new C1583gR(navigationSlideHeaderView, imageView, textView, textView2, 3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(navigationSlideHeaderView.getResources().getResourceName(i)));
    }

    public void A(C0670Ox c0670Ox) {
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = c0670Ox.c;
        if (abstractComponentCallbacksC1247cx.O) {
            ((C0307Ax) this.p).f(abstractComponentCallbacksC1247cx);
        }
        HashMap map = (HashMap) this.n;
        if (map.get(abstractComponentCallbacksC1247cx.p) == c0670Ox && ((C0670Ox) map.put(abstractComponentCallbacksC1247cx.p, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            abstractComponentCallbacksC1247cx.toString();
        }
    }

    public void B(RecyclerView recyclerView) {
        WeakHashMap weakHashMap = It0.a;
        recyclerView.setImportantForAccessibility(2);
        this.f793o = new C1242cu0(1, this);
        ViewPager2 viewPager2 = (ViewPager2) this.p;
        if (viewPager2.getImportantForAccessibility() == 0) {
            viewPager2.setImportantForAccessibility(1);
        }
    }

    public synchronized ArrayList C() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.m).iterator();
        while (it.hasNext()) {
            GS gs = (GS) it.next();
            if (gs.a.isAssignableFrom(C2151mA.class) && gs.b.isAssignableFrom(InputStream.class)) {
                it.remove();
                arrayList.add(gs.c);
            }
        }
        return arrayList;
    }

    public synchronized ArrayList E(RV rv) {
        ArrayList arrayListC;
        arrayListC = C();
        c(C2151mA.class, InputStream.class, rv);
        return arrayListC;
    }

    public void F(C1387eR c1387eR) {
        C2985uq0 c2985uq0;
        if (u(c1387eR.a) != null) {
            I(c1387eR);
            c2985uq0 = C2985uq0.a;
        } else {
            c2985uq0 = null;
        }
        if (c2985uq0 == null) {
            y(c1387eR);
        }
    }

    public C2922u8 G(AbstractC0985aF abstractC0985aF) {
        ArrayList arrayListD = d(abstractC0985aF);
        if (arrayListD.size() < 2) {
            return (C2922u8) UK.q(null, arrayListD);
        }
        Collections.sort(arrayListD, new C2147m8(2));
        ArrayList arrayList = new ArrayList();
        int i = ((C2922u8) arrayListD.get(0)).c;
        for (int i2 = 0; i2 < arrayListD.size(); i2++) {
            C2922u8 c2922u8 = (C2922u8) arrayListD.get(i2);
            if (i != c2922u8.c) {
                if (arrayList.size() != 1) {
                    break;
                }
                return (C2922u8) arrayListD.get(0);
            }
            arrayList.add(new Pair(c2922u8.b, Integer.valueOf(c2922u8.d)));
        }
        HashMap map = (HashMap) this.f793o;
        C2922u8 c2922u9 = (C2922u8) map.get(arrayList);
        if (c2922u9 == null) {
            List listSubList = arrayListD.subList(0, arrayList.size());
            int i3 = 0;
            for (int i4 = 0; i4 < listSubList.size(); i4++) {
                i3 += ((C2922u8) listSubList.get(i4)).d;
            }
            int iNextInt = ((Random) this.p).nextInt(i3);
            int i5 = 0;
            for (int i6 = 0; i6 < listSubList.size(); i6++) {
                C2922u8 c2922u10 = (C2922u8) listSubList.get(i6);
                i5 += c2922u10.d;
                if (iNextInt < i5) {
                    c2922u9 = c2922u10;
                    map.put(arrayList, c2922u9);
                }
            }
            c2922u9 = (C2922u8) UK.t(listSubList);
            map.put(arrayList, c2922u9);
        }
        return c2922u9;
    }

    public Bundle H(String str, Bundle bundle) {
        HashMap map = (HashMap) this.f793o;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    public void I(C1387eR c1387eR) {
        F80 f80 = (F80) this.m;
        f80.b();
        f80.c();
        try {
            ((C0508Iq) this.p).f(c1387eR);
            f80.m();
        } finally {
            f80.j();
        }
    }

    public void J() {
        int iA;
        int i = android.R.id.accessibilityActionPageLeft;
        ViewPager2 viewPager2 = (ViewPager2) this.p;
        It0.m(viewPager2, android.R.id.accessibilityActionPageLeft);
        It0.i(viewPager2, 0);
        It0.m(viewPager2, android.R.id.accessibilityActionPageRight);
        It0.i(viewPager2, 0);
        It0.m(viewPager2, android.R.id.accessibilityActionPageUp);
        It0.i(viewPager2, 0);
        It0.m(viewPager2, android.R.id.accessibilityActionPageDown);
        It0.i(viewPager2, 0);
        if (viewPager2.getAdapter() == null || (iA = viewPager2.getAdapter().a()) == 0 || !viewPager2.C) {
            return;
        }
        int orientation = viewPager2.getOrientation();
        C1731hu0 c1731hu0 = (C1731hu0) this.n;
        C1731hu0 c1731hu1 = (C1731hu0) this.m;
        if (orientation != 0) {
            if (viewPager2.f33o < iA - 1) {
                It0.n(viewPager2, new F0(android.R.id.accessibilityActionPageDown), c1731hu1);
            }
            if (viewPager2.f33o > 0) {
                It0.n(viewPager2, new F0(android.R.id.accessibilityActionPageUp), c1731hu0);
                return;
            }
            return;
        }
        boolean z = viewPager2.r.I() == 1;
        int i2 = z ? android.R.id.accessibilityActionPageLeft : android.R.id.accessibilityActionPageRight;
        if (z) {
            i = android.R.id.accessibilityActionPageRight;
        }
        if (viewPager2.f33o < iA - 1) {
            It0.n(viewPager2, new F0(i2), c1731hu1);
        }
        if (viewPager2.f33o > 0) {
            It0.n(viewPager2, new F0(i), c1731hu0);
        }
    }

    @Override // o.InterfaceC2811t1
    public boolean N(AbstractC2908u1 abstractC2908u1, ZP zp) {
        Hh0 hh0R = r(abstractC2908u1);
        Nd0 nd0 = (Nd0) this.p;
        Menu menuC2942uQ = (Menu) nd0.get(zp);
        if (menuC2942uQ == null) {
            menuC2942uQ = new MenuC2942uQ((Context) this.n, zp);
            nd0.put(zp, menuC2942uQ);
        }
        return ((ActionMode.Callback) this.m).onCreateActionMode(hh0R, menuC2942uQ);
    }

    public void a(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        if (((ArrayList) this.m).contains(abstractComponentCallbacksC1247cx)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC1247cx);
        }
        synchronized (((ArrayList) this.m)) {
            ((ArrayList) this.m).add(abstractComponentCallbacksC1247cx);
        }
        abstractComponentCallbacksC1247cx.v = true;
    }

    @Override // o.InterfaceC2604qt0
    public View b() {
        switch (this.l) {
            case 3:
                return (NavigationSlideHeaderView) this.m;
            case 4:
            default:
                return (ConstraintLayout) this.m;
            case 5:
                return (ConstraintLayout) this.m;
            case 6:
                return (ConstraintLayout) this.m;
            case 7:
                return (ConstraintLayout) this.m;
        }
    }

    public synchronized void c(Class cls, Class cls2, RQ rq) {
        GS gs = new GS(cls, cls2, rq);
        ArrayList arrayList = (ArrayList) this.m;
        arrayList.add(arrayList.size(), gs);
    }

    public ArrayList d(AbstractC0985aF abstractC0985aF) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = (HashMap) this.m;
        D(jElapsedRealtime, map);
        HashMap map2 = (HashMap) this.n;
        D(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < abstractC0985aF.size(); i++) {
            C2922u8 c2922u8 = (C2922u8) abstractC0985aF.get(i);
            if (!map.containsKey(c2922u8.b) && !map2.containsKey(Integer.valueOf(c2922u8.c))) {
                arrayList.add(c2922u8);
            }
        }
        return arrayList;
    }

    @Override // o.InterfaceC2811t1
    public boolean e(AbstractC2908u1 abstractC2908u1, ZP zp) {
        Hh0 hh0R = r(abstractC2908u1);
        Nd0 nd0 = (Nd0) this.p;
        Menu menuC2942uQ = (Menu) nd0.get(zp);
        if (menuC2942uQ == null) {
            menuC2942uQ = new MenuC2942uQ((Context) this.n, zp);
            nd0.put(zp, menuC2942uQ);
        }
        return ((ActionMode.Callback) this.m).onPrepareActionMode(hh0R, menuC2942uQ);
    }

    public void f(String str) {
        Objects.requireNonNull(str, "baseUrl == null");
        C2349oE c2349oE = new C2349oE();
        c2349oE.g(null, str);
        C2446pE c2446pEB = c2349oE.b();
        List list = c2446pEB.f;
        if ("".equals(list.get(list.size() - 1))) {
            this.n = c2446pEB;
        } else {
            throw new IllegalArgumentException("baseUrl must end in /: " + c2446pEB);
        }
    }

    @Override // o.InterfaceC2811t1
    public void h(AbstractC2908u1 abstractC2908u1) {
        ((ActionMode.Callback) this.m).onDestroyActionMode(r(abstractC2908u1));
    }

    public synchronized ArrayList j(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (GS gs : (ArrayList) this.m) {
                if (!((HashSet) this.f793o).contains(gs) && gs.a.isAssignableFrom(cls)) {
                    ((HashSet) this.f793o).add(gs);
                    arrayList.add(gs.c.a(this));
                    ((HashSet) this.f793o).remove(gs);
                }
            }
        } catch (Throwable th) {
            ((HashSet) this.f793o).clear();
            throw th;
        }
        return arrayList;
    }

    public synchronized QQ k(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (GS gs : (ArrayList) this.m) {
                if (((HashSet) this.f793o).contains(gs)) {
                    z = true;
                } else if (gs.a.isAssignableFrom(cls) && gs.b.isAssignableFrom(cls2)) {
                    ((HashSet) this.f793o).add(gs);
                    arrayList.add(l(gs));
                    ((HashSet) this.f793o).remove(gs);
                }
            }
            if (arrayList.size() > 1) {
                C2743sL c2743sL = (C2743sL) this.n;
                InterfaceC1941k20 interfaceC1941k20 = (InterfaceC1941k20) this.p;
                c2743sL.getClass();
                return new C1558g6(arrayList, 2, interfaceC1941k20);
            }
            if (arrayList.size() == 1) {
                return (QQ) arrayList.get(0);
            }
            if (z) {
                return r;
            }
            throw new K60("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            ((HashSet) this.f793o).clear();
            throw th;
        }
    }

    public QQ l(GS gs) {
        return gs.c.a(this);
    }

    public C2923u80 m() {
        if (((C2446pE) this.n) == null) {
            throw new IllegalStateException("Base URL required.");
        }
        InterfaceC0595Ma ov = (InterfaceC0595Ma) this.m;
        if (ov == null) {
            ov = new OV();
        }
        F2 f2 = WY.a;
        O9 o9 = WY.c;
        ArrayList arrayList = new ArrayList((ArrayList) this.p);
        List listQ = o9.q(f2);
        arrayList.addAll(listQ);
        List listR = o9.r();
        int size = listR.size();
        ArrayList arrayList2 = (ArrayList) this.f793o;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + size);
        arrayList3.add(new P9(0));
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(listR);
        C2446pE c2446pE = (C2446pE) this.n;
        List listUnmodifiableList = Collections.unmodifiableList(arrayList3);
        List listUnmodifiableList2 = Collections.unmodifiableList(arrayList);
        listQ.size();
        return new C2923u80(ov, c2446pE, listUnmodifiableList, listUnmodifiableList2);
    }

    public void n(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((Nd0) this.n).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                n(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public AbstractComponentCallbacksC1247cx o(String str) {
        C0670Ox c0670Ox = (C0670Ox) ((HashMap) this.n).get(str);
        if (c0670Ox != null) {
            return c0670Ox.c;
        }
        return null;
    }

    @Override // o.InterfaceC2811t1
    public boolean p(AbstractC2908u1 abstractC2908u1, MenuItem menuItem) {
        return ((ActionMode.Callback) this.m).onActionItemClicked(r(abstractC2908u1), new MenuItemC1778iQ((Context) this.n, (Lh0) menuItem));
    }

    public AbstractComponentCallbacksC1247cx q(String str) {
        for (C0670Ox c0670Ox : ((HashMap) this.n).values()) {
            if (c0670Ox != null) {
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxQ = c0670Ox.c;
                if (!str.equals(abstractComponentCallbacksC1247cxQ.p)) {
                    abstractComponentCallbacksC1247cxQ = abstractComponentCallbacksC1247cxQ.H.c.q(str);
                }
                if (abstractComponentCallbacksC1247cxQ != null) {
                    return abstractComponentCallbacksC1247cxQ;
                }
            }
        }
        return null;
    }

    public Hh0 r(AbstractC2908u1 abstractC2908u1) {
        ArrayList arrayList = (ArrayList) this.f793o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Hh0 hh0 = (Hh0) arrayList.get(i);
            if (hh0 != null && hh0.b == abstractC2908u1) {
                return hh0;
            }
        }
        Hh0 hh1 = new Hh0((Context) this.n, abstractC2908u1);
        arrayList.add(hh1);
        return hh1;
    }

    public ArrayList s() {
        ArrayList arrayList = new ArrayList();
        for (C0670Ox c0670Ox : ((HashMap) this.n).values()) {
            if (c0670Ox != null) {
                arrayList.add(c0670Ox);
            }
        }
        return arrayList;
    }

    public ArrayList t() {
        ArrayList arrayList = new ArrayList();
        for (C0670Ox c0670Ox : ((HashMap) this.n).values()) {
            if (c0670Ox != null) {
                arrayList.add(c0670Ox.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public C1387eR u(String str) throws Throwable {
        G80 g80;
        C0519Jb c0519Jb = (C0519Jb) this.f793o;
        G80 g80A = G80.a(1, "SELECT * FROM movies WHERE id = ?");
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
            int iM10 = AbstractC3409z9.m(cursorW, "released");
            int iM11 = AbstractC3409z9.m(cursorW, "isFavorite");
            int iM12 = AbstractC3409z9.m(cursorW, "isWatched");
            g80 = g80A;
            try {
                int iM13 = AbstractC3409z9.m(cursorW, "watchedDate");
                int iM14 = AbstractC3409z9.m(cursorW, "lastEngagementTimeUtcMillis");
                int iM15 = AbstractC3409z9.m(cursorW, "lastPlaybackPositionMillis");
                int iM16 = AbstractC3409z9.m(cursorW, "durationMillis");
                C1387eR c1387eR = null;
                String string = null;
                if (cursorW.moveToFirst()) {
                    C2123lv0 c2123lv0 = (cursorW.isNull(iM14) && cursorW.isNull(iM15) && cursorW.isNull(iM16)) ? null : new C2123lv0(cursorW.getLong(iM14), cursorW.getLong(iM15), cursorW.getLong(iM16));
                    C1387eR c1387eR2 = new C1387eR();
                    String string2 = cursorW.getString(iM);
                    AbstractC1474fG.j(string2, "<set-?>");
                    c1387eR2.a = string2;
                    String string3 = cursorW.getString(iM2);
                    AbstractC1474fG.j(string3, "<set-?>");
                    c1387eR2.b = string3;
                    c1387eR2.c = cursorW.isNull(iM3) ? null : cursorW.getString(iM3);
                    c1387eR2.d = cursorW.isNull(iM4) ? null : Integer.valueOf(cursorW.getInt(iM4));
                    c1387eR2.e = cursorW.isNull(iM5) ? null : cursorW.getString(iM5);
                    c1387eR2.f = cursorW.isNull(iM6) ? null : cursorW.getString(iM6);
                    c1387eR2.g = cursorW.isNull(iM7) ? null : Double.valueOf(cursorW.getDouble(iM7));
                    c1387eR2.h = cursorW.isNull(iM8) ? null : cursorW.getString(iM8);
                    c1387eR2.i = cursorW.isNull(iM9) ? null : cursorW.getString(iM9);
                    String string4 = cursorW.isNull(iM10) ? null : cursorW.getString(iM10);
                    c0519Jb.getClass();
                    c1387eR2.f754o = C0519Jb.H(string4);
                    c1387eR2.p = cursorW.getInt(iM11) != 0;
                    c1387eR2.q = cursorW.getInt(iM12) != 0;
                    if (!cursorW.isNull(iM13)) {
                        string = cursorW.getString(iM13);
                    }
                    c1387eR2.r = C0519Jb.H(string);
                    c1387eR2.s = c2123lv0;
                    c1387eR = c1387eR2;
                }
                cursorW.close();
                g80.l();
                return c1387eR;
            } catch (Throwable th) {
                th = th;
                cursorW.close();
                g80.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            g80 = g80A;
        }
    }

    public C2538q90 v(ArrayList arrayList) {
        StringBuilder sbK = AbstractC1701hf0.k("SELECT * FROM movies WHERE id IN (");
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
        CallableC1485fR callableC1485fR = new CallableC1485fR(this, g80A, 1);
        return UK.j((F80) this.m, new String[]{"movies"}, callableC1485fR);
    }

    public synchronized ArrayList w(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (GS gs : (ArrayList) this.m) {
            if (!arrayList.contains(gs.b) && gs.a.isAssignableFrom(cls)) {
                arrayList.add(gs.b);
            }
        }
        return arrayList;
    }

    public List x() {
        ArrayList arrayList;
        if (((ArrayList) this.m).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.m)) {
            arrayList = new ArrayList((ArrayList) this.m);
        }
        return arrayList;
    }

    public void y(C1387eR c1387eR) {
        F80 f80 = (F80) this.m;
        f80.b();
        f80.c();
        try {
            ((C0482Hq) this.n).h(c1387eR);
            f80.m();
        } finally {
            f80.j();
        }
    }

    public void z(C0670Ox c0670Ox) {
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = c0670Ox.c;
        String str = abstractComponentCallbacksC1247cx.p;
        HashMap map = (HashMap) this.n;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC1247cx.p, c0670Ox);
        if (Log.isLoggable("FragmentManager", 2)) {
            abstractComponentCallbacksC1247cx.toString();
        }
    }

    public C1583gR(Context context) {
        this.l = 11;
        this.m = context;
        this.n = new ArrayList();
    }

    public C1583gR(Na0 na0) {
        this.l = 1;
        C2743sL c2743sL = q;
        this.m = new ArrayList();
        this.f793o = new HashSet();
        this.p = na0;
        this.n = c2743sL;
    }

    public C1583gR(F80 f80) {
        this.l = 0;
        this.f793o = new C0519Jb(6);
        this.m = f80;
        int i = 1;
        this.n = new C0482Hq(this, f80, i);
        this.p = new C0508Iq(this, f80, i);
    }

    public C1583gR(int i) {
        this.l = i;
        switch (i) {
            case 4:
                this.m = new C2039l20(10);
                this.n = new Nd0(0);
                this.f793o = new ArrayList();
                this.p = new HashSet();
                break;
            case 8:
                this.m = new ArrayList();
                this.n = new HashMap();
                this.f793o = new HashMap();
                break;
            case 12:
                this.f793o = new ArrayList();
                this.p = new ArrayList();
                break;
            default:
                Random random = new Random();
                this.f793o = new HashMap();
                this.p = random;
                this.m = new HashMap();
                this.n = new HashMap();
                break;
        }
    }

    public C1583gR(Typeface typeface, FQ fq) {
        int i;
        int i2;
        this.l = 10;
        this.p = typeface;
        this.m = fq;
        this.f793o = new HQ(1024);
        int iA = fq.a(6);
        if (iA != 0) {
            int i3 = iA + fq.l;
            i = ((ByteBuffer) fq.f969o).getInt(((ByteBuffer) fq.f969o).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.n = new char[i * 2];
        int iA2 = fq.a(6);
        if (iA2 != 0) {
            int i4 = iA2 + fq.l;
            i2 = ((ByteBuffer) fq.f969o).getInt(((ByteBuffer) fq.f969o).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            Rp0 rp0 = new Rp0(this, i5);
            EQ eqC = rp0.c();
            int iA3 = eqC.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) eqC.f969o).getInt(iA3 + eqC.l) : 0, (char[]) this.n, i5 * 2);
            Jp0.f("invalid metadata codepoint length", rp0.b() > 0);
            ((HQ) this.f793o).a(rp0, 0, rp0.b() - 1);
        }
    }

    public C1583gR(Context context, ActionMode.Callback callback) {
        this.l = 13;
        this.n = context;
        this.m = callback;
        this.f793o = new ArrayList();
        this.p = new Nd0();
    }

    public C1583gR(ViewPager2 viewPager2) {
        this.l = 14;
        this.p = viewPager2;
        this.m = new C1731hu0(this, 0);
        this.n = new C1731hu0(this, 1);
    }
}
