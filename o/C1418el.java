package o;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.el, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1418el extends T50 {
    public static TimeInterpolator s;
    public boolean g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f761o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC2144m60) arrayList.get(size)).a.animate().cancel();
        }
    }

    @Override // o.T50
    public final boolean a(AbstractC2144m60 abstractC2144m60, AbstractC2144m60 abstractC2144m61, C2650rP c2650rP, C2650rP c2650rP2) {
        int i;
        int i2;
        int i3 = c2650rP.a;
        int i4 = c2650rP.b;
        if (abstractC2144m61.s()) {
            int i5 = c2650rP.a;
            i2 = c2650rP.b;
            i = i5;
        } else {
            i = c2650rP2.a;
            i2 = c2650rP2.b;
        }
        if (abstractC2144m60 == abstractC2144m61) {
            return g(abstractC2144m60, i3, i4, i, i2);
        }
        View view = abstractC2144m60.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(abstractC2144m60);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(abstractC2144m61);
        float f = -((int) ((i - i3) - translationX));
        View view2 = abstractC2144m61.a;
        view2.setTranslationX(f);
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.k;
        C1223cl c1223cl = new C1223cl();
        c1223cl.a = abstractC2144m60;
        c1223cl.b = abstractC2144m61;
        c1223cl.c = i3;
        c1223cl.d = i4;
        c1223cl.e = i;
        c1223cl.f = i2;
        arrayList.add(c1223cl);
        return true;
    }

    @Override // o.T50
    public final void d(AbstractC2144m60 abstractC2144m60) {
        View view = abstractC2144m60.a;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C1321dl) arrayList.get(size)).a == abstractC2144m60) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(abstractC2144m60);
                arrayList.remove(size);
            }
        }
        j(this.k, abstractC2144m60);
        if (this.h.remove(abstractC2144m60)) {
            view.setAlpha(1.0f);
            c(abstractC2144m60);
        }
        if (this.i.remove(abstractC2144m60)) {
            view.setAlpha(1.0f);
            c(abstractC2144m60);
        }
        ArrayList arrayList2 = this.n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, abstractC2144m60);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                if (((C1321dl) arrayList5.get(size4)).a == abstractC2144m60) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(abstractC2144m60);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList arrayList6 = this.l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(abstractC2144m60)) {
                view.setAlpha(1.0f);
                c(abstractC2144m60);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.q.remove(abstractC2144m60);
        this.f761o.remove(abstractC2144m60);
        this.r.remove(abstractC2144m60);
        this.p.remove(abstractC2144m60);
        i();
    }

    @Override // o.T50
    public final void e() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1321dl c1321dl = (C1321dl) arrayList.get(size);
            View view = c1321dl.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c1321dl.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((AbstractC2144m60) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC2144m60 abstractC2144m60 = (AbstractC2144m60) arrayList3.get(size3);
            abstractC2144m60.a.setAlpha(1.0f);
            c(abstractC2144m60);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C1223cl c1223cl = (C1223cl) arrayList4.get(size4);
            AbstractC2144m60 abstractC2144m61 = c1223cl.a;
            if (abstractC2144m61 != null) {
                k(c1223cl, abstractC2144m61);
            }
            AbstractC2144m60 abstractC2144m62 = c1223cl.b;
            if (abstractC2144m62 != null) {
                k(c1223cl, abstractC2144m62);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C1321dl c1321dl2 = (C1321dl) arrayList6.get(size6);
                    View view2 = c1321dl2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(c1321dl2.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    AbstractC2144m60 abstractC2144m63 = (AbstractC2144m60) arrayList8.get(size8);
                    abstractC2144m63.a.setAlpha(1.0f);
                    c(abstractC2144m63);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C1223cl c1223cl2 = (C1223cl) arrayList10.get(size10);
                    AbstractC2144m60 abstractC2144m64 = c1223cl2.a;
                    if (abstractC2144m64 != null) {
                        k(c1223cl2, abstractC2144m64);
                    }
                    AbstractC2144m60 abstractC2144m65 = c1223cl2.b;
                    if (abstractC2144m65 != null) {
                        k(c1223cl2, abstractC2144m65);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.q);
            h(this.p);
            h(this.f761o);
            h(this.r);
            ArrayList arrayList11 = this.b;
            if (arrayList11.size() > 0) {
                AbstractC1674hK.w(arrayList11.get(0));
                throw null;
            }
            arrayList11.clear();
        }
    }

    @Override // o.T50
    public final boolean f() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.f761o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public final boolean g(AbstractC2144m60 abstractC2144m60, int i, int i2, int i3, int i4) {
        View view = abstractC2144m60.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC2144m60.a.getTranslationY());
        l(abstractC2144m60);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(abstractC2144m60);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.j;
        C1321dl c1321dl = new C1321dl();
        c1321dl.a = abstractC2144m60;
        c1321dl.b = translationX;
        c1321dl.c = translationY;
        c1321dl.d = i3;
        c1321dl.e = i4;
        arrayList.add(c1321dl);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            AbstractC1674hK.w(arrayList.get(0));
            throw null;
        }
    }

    public final void j(ArrayList arrayList, AbstractC2144m60 abstractC2144m60) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1223cl c1223cl = (C1223cl) arrayList.get(size);
            if (k(c1223cl, abstractC2144m60) && c1223cl.a == null && c1223cl.b == null) {
                arrayList.remove(c1223cl);
            }
        }
    }

    public final boolean k(C1223cl c1223cl, AbstractC2144m60 abstractC2144m60) {
        if (c1223cl.b == abstractC2144m60) {
            c1223cl.b = null;
        } else {
            if (c1223cl.a != abstractC2144m60) {
                return false;
            }
            c1223cl.a = null;
        }
        abstractC2144m60.a.setAlpha(1.0f);
        View view = abstractC2144m60.a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(abstractC2144m60);
        return true;
    }

    public final void l(AbstractC2144m60 abstractC2144m60) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        abstractC2144m60.a.animate().setInterpolator(s);
        d(abstractC2144m60);
    }
}
