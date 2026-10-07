package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.LoginActivity;
import com.skidush.clonex.activities.main.MainMobileActivity;
import com.skidush.clonex.activities.main.MainTvActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.AbstractC1376eG;
import o.AbstractC1474fG;
import o.AbstractC1677hN;
import o.AbstractC1910jn;
import o.AbstractC2506pt;
import o.AbstractC3021v9;
import o.AbstractC3226xJ;
import o.AbstractComponentCallbacksC1247cx;
import o.C0567Kx;
import o.C0730Rf;
import o.C1101bX;
import o.C1233cq;
import o.C1478fK;
import o.C1481fN;
import o.C1640gy;
import o.C1717hn0;
import o.C1767iF;
import o.C1816io0;
import o.C1871jN;
import o.C2067lN;
import o.C2985uq0;
import o.DT;
import o.InterfaceC0412Ey;
import o.InterfaceC1022ai;
import o.InterfaceC1185cK;
import o.InterfaceC1283dK;
import o.InterfaceC1323dm;
import o.Pu0;
import o.Qq0;
import o.Sq0;
import o.Sr0;
import o.TJ;

/* JADX INFO: loaded from: classes.dex */
public final class p extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f101o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.m = i;
        this.n = obj;
        this.f101o = obj2;
        this.p = obj3;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        C1101bX c1101bX;
        List listA;
        boolean z = true;
        switch (this.m) {
            case 0:
                io.sentry.android.replay.viewhierarchy.d dVar = (io.sentry.android.replay.viewhierarchy.d) obj;
                AbstractC1474fG.j(dVar, "node");
                if (dVar.d && dVar.a > 0 && dVar.b > 0) {
                    Rect rect = dVar.e;
                    if (rect == null) {
                        return Boolean.FALSE;
                    }
                    boolean z2 = dVar instanceof io.sentry.android.replay.viewhierarchy.b;
                    q qVar = (q) this.n;
                    if (z2) {
                        List listA2 = AbstractC2506pt.A(rect);
                        qVar.getClass();
                        Rect rect2 = new Rect(rect);
                        RectF rectF = new RectF(rect2);
                        qVar.v.mapRect(rectF);
                        rectF.round(rect2);
                        qVar.u.drawBitmap((Bitmap) this.f101o, rect2, new Rect(0, 0, 1, 1), (Paint) null);
                        c1101bX = new C1101bX(listA2, Integer.valueOf(qVar.t.getPixel(0, 0)));
                    } else if (dVar instanceof io.sentry.android.replay.viewhierarchy.c) {
                        io.sentry.android.replay.viewhierarchy.c cVar = (io.sentry.android.replay.viewhierarchy.c) dVar;
                        Layout layout = cVar.g;
                        if (layout == null) {
                            listA = AbstractC2506pt.A(rect);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            int lineCount = layout.getLineCount();
                            for (int i = 0; i < lineCount; i++) {
                                int primaryHorizontal = (int) layout.getPrimaryHorizontal(layout.getLineStart(i));
                                int ellipsisCount = layout.getEllipsisCount(i);
                                int primaryHorizontal2 = (int) layout.getPrimaryHorizontal((layout.getLineVisibleEnd(i) - ellipsisCount) + (ellipsisCount > 0 ? 1 : 0));
                                if (primaryHorizontal2 == 0) {
                                    primaryHorizontal2 = ((int) layout.getPrimaryHorizontal(layout.getLineVisibleEnd(i) - 1)) + 1;
                                }
                                int lineTop = layout.getLineTop(i);
                                int lineBottom = layout.getLineBottom(i);
                                Rect rect3 = new Rect();
                                int i2 = rect.left + cVar.i + primaryHorizontal;
                                rect3.left = i2;
                                rect3.right = (primaryHorizontal2 - primaryHorizontal) + i2;
                                int i3 = rect.top + cVar.j + lineTop;
                                rect3.top = i3;
                                rect3.bottom = (lineBottom - lineTop) + i3;
                                arrayList.add(rect3);
                            }
                            listA = arrayList;
                        }
                        Integer num = cVar.h;
                        c1101bX = new C1101bX(listA, Integer.valueOf(num != null ? num.intValue() : -16777216));
                    } else {
                        c1101bX = new C1101bX(AbstractC2506pt.A(rect), -16777216);
                    }
                    List list = (List) c1101bX.l;
                    qVar.s.setColor(((Number) c1101bX.m).intValue());
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((Canvas) this.p).drawRoundRect(new RectF((Rect) it.next()), 10.0f, 10.0f, qVar.s);
                    }
                }
                return Boolean.TRUE;
            case 1:
                InterfaceC1283dK interfaceC1283dK = (InterfaceC1283dK) obj;
                C0567Kx c0567Kx = (C0567Kx) this.n;
                ArrayList arrayList2 = c0567Kx.g;
                boolean z3 = arrayList2 instanceof Collection;
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = (AbstractComponentCallbacksC1247cx) this.f101o;
                if (z3 && arrayList2.isEmpty()) {
                    z = false;
                } else {
                    Iterator it2 = arrayList2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            z = false;
                        }
                    } while (!AbstractC1474fG.b(((C1101bX) it2.next()).l, abstractComponentCallbacksC1247cx.L));
                }
                if (interfaceC1283dK != null && !z) {
                    C1640gy c1640gyQ = abstractComponentCallbacksC1247cx.q();
                    c1640gyQ.g();
                    C1478fK c1478fK = c1640gyQ.p;
                    if (c1478fK.d.compareTo(TJ.n) >= 0) {
                        c1478fK.a((InterfaceC1185cK) c0567Kx.i.b((DT) this.p));
                    }
                }
                return C2985uq0.a;
            case 2:
                AbstractC1474fG.j((View) obj, "it");
                ProgressBar progressBar = (ProgressBar) ((Sq0) this.n).l.f941o;
                AbstractC1474fG.i(progressBar, "pbUpdateIsLoading");
                if (progressBar.getVisibility() != 0) {
                    LoginActivity.C((LoginActivity) this.f101o, (C1767iF) this.p);
                }
                return C2985uq0.a;
            case 3:
                AbstractC1474fG.j((View) obj, "it");
                ProgressBar progressBar2 = (ProgressBar) ((Qq0) this.n).l.f414o;
                AbstractC1474fG.i(progressBar2, "pbUpdateIsLoading");
                if (progressBar2.getVisibility() != 0) {
                    LoginActivity.C((LoginActivity) this.f101o, (C1767iF) this.p);
                }
                return C2985uq0.a;
            case 4:
                AbstractC1474fG.j((View) obj, "<anonymous parameter 0>");
                ProgressBar progressBar3 = (ProgressBar) ((Qq0) this.n).l.f414o;
                AbstractC1474fG.i(progressBar3, "pbUpdateIsLoading");
                if (progressBar3.getVisibility() != 0) {
                    int i4 = MainMobileActivity.Q;
                    MainMobileActivity mainMobileActivity = (MainMobileActivity) this.f101o;
                    C2067lN c2067lN = (C2067lN) mainMobileActivity.J.getValue();
                    C1767iF c1767iF = ((C1481fN) ((AbstractC1677hN) this.p)).a;
                    AbstractC1474fG.j(c1767iF, "release");
                    AbstractC1376eG.w(AbstractC3021v9.o(c2067lN), AbstractC1910jn.b, 0, new C1871jN(c2067lN, mainMobileActivity, c1767iF, null), 2);
                }
                return C2985uq0.a;
            case 5:
                AbstractC1474fG.j((View) obj, "<anonymous parameter 0>");
                ProgressBar progressBar4 = (ProgressBar) ((Sq0) this.n).l.f941o;
                AbstractC1474fG.i(progressBar4, "pbUpdateIsLoading");
                if (progressBar4.getVisibility() != 0) {
                    int i5 = MainTvActivity.Q;
                    MainTvActivity mainTvActivity = (MainTvActivity) this.f101o;
                    C2067lN c2067lN2 = (C2067lN) mainTvActivity.J.getValue();
                    C1767iF c1767iF2 = ((C1481fN) ((AbstractC1677hN) this.p)).a;
                    AbstractC1474fG.j(c1767iF2, "release");
                    AbstractC1376eG.w(AbstractC3021v9.o(c2067lN2), AbstractC1910jn.b, 0, new C1871jN(c2067lN2, mainTvActivity, c1767iF2, null), 2);
                }
                return C2985uq0.a;
            case 6:
                C0730Rf c0730RfB = Sr0.b((InterfaceC0412Ey) this.n, this.f101o, null);
                if (c0730RfB != null) {
                    Pu0.m((InterfaceC1022ai) this.p, c0730RfB);
                }
                return C2985uq0.a;
            case 7:
                String str = (String) obj;
                AbstractC1474fG.j(str, "selectedCategory");
                List list2 = (List) ((Map) this.n).get(str);
                if (list2 == null) {
                    list2 = C1233cq.l;
                }
                C1717hn0 c1717hn0 = (C1717hn0) this.f101o;
                c1717hn0.d = list2;
                c1717hn0.a.b();
                RecyclerView recyclerView = (RecyclerView) this.p;
                if (AbstractC1474fG.b(recyclerView.getTag(), "loaded")) {
                    recyclerView.g0(0);
                }
                return C2985uq0.a;
            default:
                Object obj2 = C1816io0.i;
                String str2 = (String) this.n;
                InterfaceC1323dm interfaceC1323dm = (InterfaceC1323dm) this.f101o;
                Object obj3 = this.p;
                synchronized (obj2) {
                    try {
                        LinkedHashMap linkedHashMap = C1816io0.k;
                        if (linkedHashMap.get(str2) == interfaceC1323dm) {
                            linkedHashMap.remove(str2);
                        }
                        LinkedHashMap linkedHashMap2 = C1816io0.l;
                        if (linkedHashMap2.get(str2) == obj3) {
                            linkedHashMap2.remove(str2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return C2985uq0.a;
        }
    }
}
