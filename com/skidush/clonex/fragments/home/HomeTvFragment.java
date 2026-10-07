package com.skidush.clonex.fragments.home;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.leanback.widget.VerticalGridView;
import com.bumptech.glide.a;
import com.skidush.clonex.R;
import com.skidush.clonex.database.AppDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.AbstractC0911Ye;
import o.AbstractC1376eG;
import o.AbstractC1459f50;
import o.AbstractC1474fG;
import o.AbstractC1701hf0;
import o.AbstractC1802ih0;
import o.AbstractC2301nn0;
import o.AbstractC2822t60;
import o.AbstractC3409z9;
import o.AbstractComponentCallbacksC1247cx;
import o.C0456Gq;
import o.C0560Kq;
import o.C0789Tm;
import o.C1233cq;
import o.C1387eR;
import o.C1583gR;
import o.C1816io0;
import o.C2028kx;
import o.C2109lo0;
import o.C2123lv0;
import o.C2414ov0;
import o.C2630r70;
import o.C2985uq0;
import o.C3182ws;
import o.C3300y3;
import o.C3376ys;
import o.CJ;
import o.Cr0;
import o.EC;
import o.Eh0;
import o.FC;
import o.IJ;
import o.Iu0;
import o.Ma0;
import o.P30;
import o.Q30;
import o.QW;
import o.RC;
import o.Rh0;

/* JADX INFO: loaded from: classes.dex */
public class HomeTvFragment extends AbstractComponentCallbacksC1247cx {
    public C2028kx l0;
    public final Rh0 m0 = new Rh0(new EC(this, 0));
    public final C0560Kq n0;
    public final C3300y3 o0;
    public final Handler p0;
    public boolean q0;

    public HomeTvFragment() {
        EC ec = new EC(this, 1);
        CJ cjN = AbstractC1701hf0.n(new C3182ws(0, this), IJ.n);
        this.n0 = new C0560Kq(AbstractC2822t60.a(RC.class), new C3376ys(cjN, 0), ec, new C3376ys(cjN, 1));
        this.o0 = new C3300y3();
        this.p0 = new Handler(Looper.getMainLooper());
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC1474fG.j(layoutInflater, "inflater");
        C2028kx c2028kxA = C2028kx.a(layoutInflater, viewGroup);
        this.l0 = c2028kxA;
        ConstraintLayout constraintLayout = c2028kxA.m;
        AbstractC1474fG.i(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void B() {
        this.Q = true;
        C2028kx c2028kx = this.l0;
        AbstractC1474fG.g(c2028kx);
        VerticalGridView verticalGridView = c2028kx.p;
        AbstractC1474fG.i(verticalGridView, "vgvHome");
        this.o0.k(verticalGridView);
        this.l0 = null;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void G() {
        this.Q = true;
        ((RC) this.n0.getValue()).g(false);
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void J() {
        this.Q = true;
        this.p0.removeCallbacksAndMessages(null);
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void K(View view, Bundle bundle) throws Throwable {
        Object next;
        Q30 q30;
        Object next2;
        C2985uq0 c2985uq0;
        String string;
        Integer numJ;
        Integer numJ2;
        AbstractC1474fG.j(view, "view");
        Context contextQ = Q();
        boolean zHasSystemFeature = contextQ.getPackageManager().hasSystemFeature("android.software.leanback");
        Iterable iterable = C1233cq.l;
        Cr0 cr0 = Cr0.m;
        String str = "PPV.TO";
        if (zHasSystemFeature) {
            try {
                ContentResolver contentResolver = contextQ.getContentResolver();
                Uri uri = AbstractC2301nn0.a;
                Cursor cursorQuery = contentResolver.query(uri, new String[]{"_id"}, "1=0", null, null);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                try {
                    Cursor cursorQuery2 = contextQ.getContentResolver().query(uri, C2414ov0.d, null, null, null);
                    if (cursorQuery2 != null) {
                        try {
                            Iu0 iu0 = Iu0.q;
                            ArrayList arrayList = new ArrayList();
                            while (!cursorQuery2.isClosed() && cursorQuery2.moveToNext()) {
                                arrayList.add(iu0.b(cursorQuery2));
                            }
                            cursorQuery2.close();
                            List listX0 = AbstractC0911Ye.x0(arrayList);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : listX0) {
                                String asString = ((C2414ov0) obj).a.getAsString("internal_provider_id");
                                String strB = cr0.b();
                                if (AbstractC1474fG.b(strB, "PPV.TO")) {
                                    q30 = QW.b;
                                } else {
                                    Q30.a.getClass();
                                    Iterator it = P30.b.iterator();
                                    do {
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                    } while (!AbstractC1474fG.b(((Q30) next).getName(), strB));
                                    Q30 q31 = (Q30) next;
                                    q30 = q31 == null ? C1816io0.b : q31;
                                }
                                if (AbstractC1474fG.b(asString, q30.getName())) {
                                    arrayList2.add(obj);
                                }
                            }
                            AbstractC3409z9.g(cursorQuery2, null);
                            iterable = arrayList2;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                AbstractC3409z9.g(cursorQuery2, th);
                                throw th2;
                            }
                        }
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            C2414ov0 c2414ov0 = (C2414ov0) it2.next();
            Integer asInteger = c2414ov0.a.getAsInteger("type");
            int iIntValue = asInteger == null ? -1 : asInteger.intValue();
            C2985uq0 c2985uq1 = C2985uq0.a;
            ContentValues contentValues = c2414ov0.a;
            if (iIntValue == 0) {
                it2 = it2;
                str = str;
                C1583gR c1583gRP = W().p();
                String asString2 = c2414ov0.a.getAsString("content_id");
                AbstractC1474fG.i(asString2, "getContentId(...)");
                C1387eR c1387eRU = c1583gRP.u(asString2);
                if (c1387eRU != null) {
                    c1387eRU.s = new C2123lv0(c2414ov0.c(), c2414ov0.b(), c2414ov0.a());
                    W().p().I(c1387eRU);
                } else {
                    c2985uq0 = null;
                }
                if (c2985uq0 == null) {
                    C1583gR c1583gRP2 = W().p();
                    String asString3 = c2414ov0.a.getAsString("content_id");
                    AbstractC1474fG.i(asString3, "getContentId(...)");
                    String asString4 = c2414ov0.a.getAsString("title");
                    AbstractC1474fG.i(asString4, "getTitle(...)");
                    String asString5 = contentValues.getAsString("release_date");
                    String asString6 = c2414ov0.a.getAsString("poster_art_uri");
                    Uri uri2 = asString6 == null ? null : Uri.parse(asString6);
                    if (uri2 != null) {
                        c2985uq0 = c2985uq1;
                        c2985uq0 = c2985uq1;
                        string = uri2.toString();
                    } else {
                        c2985uq0 = c2985uq1;
                        c2985uq0 = c2985uq1;
                        string = null;
                    }
                    C1387eR c1387eR = new C1387eR(asString3, asString4, null, asString5, null, null, null, null, string, null, null, null, null, null, null, 32500);
                    c1387eR.s = new C2123lv0(c2414ov0.c(), c2414ov0.b(), c2414ov0.a());
                    c1583gRP2.y(c1387eR);
                }
            } else if (iIntValue != 3) {
                it2 = it2;
                str = str;
            } else {
                C0560Kq c0560KqO = W().o();
                String asString7 = c2414ov0.a.getAsString("content_id");
                AbstractC1474fG.i(asString7, "getContentId(...)");
                C0456Gq c0456GqF = c0560KqO.f(asString7);
                if (c0456GqF != null) {
                    c0456GqF.j = new C2123lv0(c2414ov0.c(), c2414ov0.b(), c2414ov0.a());
                    W().o().s(c0456GqF);
                } else {
                    c2985uq1 = null;
                }
                if (c2985uq1 == null) {
                    C0560Kq c0560KqO2 = W().o();
                    String asString8 = c2414ov0.a.getAsString("content_id");
                    AbstractC1474fG.i(asString8, "getContentId(...)");
                    int i = Build.VERSION.SDK_INT;
                    String asString9 = i >= 24 ? contentValues.getAsString("episode_display_number") : contentValues.getAsString("episode_number");
                    int iIntValue2 = (asString9 == null || (numJ2 = AbstractC1802ih0.J(asString9)) == null) ? 0 : numJ2.intValue();
                    String asString10 = contentValues.getAsString("episode_title");
                    String asString11 = contentValues.getAsString("series_id");
                    String str2 = asString11 == null ? "" : asString11;
                    String asString12 = c2414ov0.a.getAsString("title");
                    String str3 = asString12 == null ? "" : asString12;
                    String asString13 = c2414ov0.a.getAsString("poster_art_uri");
                    Uri uri3 = asString13 == null ? null : Uri.parse(asString13);
                    C2109lo0 c2109lo0 = new C2109lo0(str2, str3, null, null, null, null, null, null, uri3 != null ? uri3.toString() : null, null, null, null, null, null, null, null, 65276);
                    String asString14 = i >= 24 ? contentValues.getAsString("season_display_number") : contentValues.getAsString("season_number");
                    C0456Gq c0456Gq = new C0456Gq(asString8, iIntValue2, asString10, null, null, c2109lo0, new Ma0("", (asString14 == null || (numJ = AbstractC1802ih0.J(asString14)) == null) ? 0 : numJ.intValue(), contentValues.getAsString("season_title"), null, null, null, 56), 24);
                    c0456Gq.j = new C2123lv0(c2414ov0.c(), c2414ov0.b(), c2414ov0.a());
                    c0560KqO2.k(c0456Gq);
                }
            }
            c2985uq0 = c2985uq1;
            Context contextQ2 = Q();
            Long asLong = contentValues.getAsLong("_id");
            long jLongValue = asLong == null ? -1L : asLong.longValue();
            if (contextQ2.getPackageManager().hasSystemFeature("android.software.leanback")) {
                try {
                    ContentResolver contentResolver2 = contextQ2.getContentResolver();
                    Uri uri4 = AbstractC2301nn0.a;
                    Cursor cursorQuery3 = contentResolver2.query(uri4, new String[]{"_id"}, "1=0", null, null);
                    if (cursorQuery3 != null) {
                        cursorQuery3.close();
                    }
                    try {
                        contextQ2.getContentResolver().delete(ContentUris.withAppendedId(uri4, jLongValue), null, null);
                    } catch (Exception e3) {
                        e3.getMessage();
                    }
                } catch (Exception e4) {
                    e4.getMessage();
                }
            }
            it2 = it2;
            str = str;
        }
        String str4 = str;
        Q30 q30X = X();
        if (q30X == null) {
            String strB2 = cr0.b();
            if (AbstractC1474fG.b(strB2, str4)) {
                q30X = QW.b;
            } else {
                Q30.a.getClass();
                Iterator it3 = P30.b.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (!AbstractC1474fG.b(((Q30) next2).getName(), strB2));
                Q30 q32 = (Q30) next2;
                if (q32 == null) {
                    q32 = C1816io0.b;
                }
                q30X = q32;
            }
        }
        if (q30X instanceof C1816io0) {
            C1816io0.b.B(Q());
        } else if (q30X instanceof Eh0) {
            int i2 = Eh0.b;
            Q();
        }
        C2028kx c2028kx = this.l0;
        AbstractC1474fG.g(c2028kx);
        C3300y3 c3300y3 = this.o0;
        c3300y3.j();
        VerticalGridView verticalGridView = c2028kx.p;
        verticalGridView.setAdapter(c3300y3);
        verticalGridView.setItemSpacing(((int) verticalGridView.getResources().getDimension(R.dimen.home_spacing)) * 2);
        C2028kx c2028kx2 = this.l0;
        AbstractC1474fG.g(c2028kx2);
        c2028kx2.m.requestFocus();
        AbstractC1376eG.w(AbstractC1459f50.y(q()), null, 0, new FC(this, null), 3);
    }

    public final AppDatabase W() {
        return (AppDatabase) this.m0.getValue();
    }

    public Q30 X() {
        return null;
    }

    public final void Y(String str, Boolean bool) {
        if (bool != null || this.q0) {
            Context contextQ = Q();
            C2630r70 c2630r70 = (C2630r70) a.b(contextQ).b(contextQ).n(str).g(C0789Tm.c);
            C2028kx c2028kx = this.l0;
            AbstractC1474fG.g(c2028kx);
            c2630r70.H(c2028kx.f882o);
            this.q0 = bool != null ? bool.booleanValue() : this.q0;
        }
    }
}
