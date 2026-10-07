package o;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class QP {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public Object k;
    public Object l;

    public QP() {
        this.b = new C2765sd0[4];
        this.c = new Matrix[4];
        this.d = new Matrix[4];
        this.e = new PointF();
        this.f = new Path();
        this.g = new Path();
        this.h = new C2765sd0();
        this.i = new float[2];
        this.j = new float[2];
        this.k = new Path();
        this.l = new Path();
        this.a = true;
        for (int i = 0; i < 4; i++) {
            ((C2765sd0[]) this.b)[i] = new C2765sd0();
            ((Matrix[]) this.c)[i] = new Matrix();
            ((Matrix[]) this.d)[i] = new Matrix();
        }
    }

    public Fj0 a(int i, List list, Jd0 jd0) {
        if (!list.isEmpty()) {
            this.k = jd0;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                PP pp = (PP) list.get(i2 - i);
                ArrayList arrayList = (ArrayList) this.c;
                if (i2 > 0) {
                    PP pp2 = (PP) arrayList.get(i2 - 1);
                    pp.d = pp2.a.f236o.m.p() + pp2.d;
                    pp.e = false;
                    pp.c.clear();
                } else {
                    pp.d = 0;
                    pp.e = false;
                    pp.c.clear();
                }
                int iP = pp.a.f236o.m.p();
                for (int i3 = i2; i3 < arrayList.size(); i3++) {
                    ((PP) arrayList.get(i3)).d += iP;
                }
                arrayList.add(i2, pp);
                ((HashMap) this.e).put(pp.b, pp);
                if (this.a) {
                    g(pp);
                    if (((IdentityHashMap) this.d).isEmpty()) {
                        ((HashSet) this.h).add(pp);
                    } else {
                        OP op = (OP) ((HashMap) this.f).get(pp);
                        if (op != null) {
                            op.a.c(op.b);
                        }
                    }
                }
            }
        }
        return c();
    }

    public void b(C1891jd0 c1891jd0, float f, RectF rectF, C0334By c0334By, Path path) {
        int i;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        C2765sd0[] c2765sd0Arr;
        C2691rp c2691rp;
        InterfaceC0888Xh interfaceC0888Xh;
        Nr0 nr0;
        QP qp = this;
        path.rewind();
        Path path2 = (Path) qp.f;
        path2.rewind();
        Path path3 = (Path) qp.g;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            i = 4;
            matrixArr = (Matrix[]) qp.d;
            fArr = (float[]) qp.i;
            matrixArr2 = (Matrix[]) qp.c;
            c2765sd0Arr = (C2765sd0[]) qp.b;
            if (i2 >= 4) {
                break;
            }
            if (i2 == 1) {
                interfaceC0888Xh = c1891jd0.g;
            } else if (i2 != 2) {
                interfaceC0888Xh = i2 != 3 ? c1891jd0.f : c1891jd0.e;
            } else {
                interfaceC0888Xh = c1891jd0.h;
            }
            if (i2 == 1) {
                nr0 = c1891jd0.c;
            } else if (i2 != 2) {
                nr0 = i2 != 3 ? c1891jd0.b : c1891jd0.a;
            } else {
                nr0 = c1891jd0.d;
            }
            C2765sd0 c2765sd0 = c2765sd0Arr[i2];
            nr0.getClass();
            nr0.m(c2765sd0, f, interfaceC0888Xh.a(rectF));
            int i3 = i2 + 1;
            float f2 = (i3 % 4) * 90;
            matrixArr2[i2].reset();
            PointF pointF = (PointF) qp.e;
            if (i2 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f2);
            C2765sd0 c2765sd1 = c2765sd0Arr[i2];
            fArr[0] = c2765sd1.c;
            fArr[1] = c2765sd1.d;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr[i2].preRotate(f2);
            i2 = i3;
        }
        int i4 = 0;
        while (i4 < i) {
            C2765sd0 c2765sd2 = c2765sd0Arr[i4];
            fArr[0] = c2765sd2.a;
            fArr[1] = c2765sd2.b;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 == 0) {
                path.moveTo(fArr[0], fArr[1]);
            } else {
                path.lineTo(fArr[0], fArr[1]);
            }
            c2765sd0Arr[i4].b(matrixArr2[i4], path);
            if (c0334By != null) {
                C2765sd0 c2765sd3 = c2765sd0Arr[i4];
                Matrix matrix = matrixArr2[i4];
                C2068lO c2068lO = (C2068lO) c0334By.m;
                BitSet bitSet = c2068lO.f895o;
                c2765sd3.getClass();
                bitSet.set(i4, false);
                c2765sd3.a(c2765sd3.f);
                c2068lO.m[i4] = new C2087ld0(new ArrayList(c2765sd3.h), new Matrix(matrix));
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            C2765sd0 c2765sd4 = c2765sd0Arr[i4];
            fArr[0] = c2765sd4.c;
            fArr[1] = c2765sd4.d;
            matrixArr2[i4].mapPoints(fArr);
            C2765sd0 c2765sd5 = c2765sd0Arr[i6];
            float f3 = c2765sd5.a;
            float[] fArr2 = (float[]) qp.j;
            fArr2[0] = f3;
            fArr2[1] = c2765sd5.b;
            matrixArr2[i6].mapPoints(fArr2);
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            C2765sd0 c2765sd6 = c2765sd0Arr[i4];
            fArr[0] = c2765sd6.c;
            fArr[1] = c2765sd6.d;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 == 1 || i4 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            C2765sd0 c2765sd7 = (C2765sd0) qp.h;
            c2765sd7.d(0.0f, 270.0f, 0.0f);
            if (i4 == 1) {
                c2691rp = c1891jd0.k;
            } else if (i4 != 2) {
                c2691rp = i4 != 3 ? c1891jd0.j : c1891jd0.i;
            } else {
                c2691rp = c1891jd0.l;
            }
            c2691rp.getClass();
            c2765sd7.c(fMax, 0.0f);
            Path path4 = (Path) qp.k;
            path4.reset();
            c2765sd7.b(matrixArr[i4], path4);
            if (qp.a && (qp.f(path4, i4) || qp.f(path4, i6))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = c2765sd7.a;
                fArr[1] = c2765sd7.b;
                matrixArr[i4].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                c2765sd7.b(matrixArr[i4], path2);
            } else {
                c2765sd7.b(matrixArr[i4], path);
            }
            if (c0334By != null) {
                Matrix matrix2 = matrixArr[i4];
                C2068lO c2068lO2 = (C2068lO) c0334By.m;
                c2068lO2.f895o.set(i4 + 4, false);
                c2765sd7.a(c2765sd7.f);
                c2068lO2.n[i4] = new C2087ld0(new ArrayList(c2765sd7.h), new Matrix(matrix2));
            }
            i = 4;
            qp = this;
            i4 = i5;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public Fj0 c() {
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList.isEmpty()) {
            return Fj0.l;
        }
        int iP = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            PP pp = (PP) arrayList.get(i);
            pp.d = iP;
            iP += pp.a.f236o.m.p();
        }
        return new C1063b20(arrayList, (Jd0) this.k);
    }

    public void d() {
        Iterator it = ((HashSet) this.h).iterator();
        while (it.hasNext()) {
            PP pp = (PP) it.next();
            if (pp.c.isEmpty()) {
                OP op = (OP) ((HashMap) this.f).get(pp);
                if (op != null) {
                    op.a.c(op.b);
                }
                it.remove();
            }
        }
    }

    public void e(PP pp) {
        if (pp.e && pp.c.isEmpty()) {
            OP op = (OP) ((HashMap) this.f).remove(pp);
            op.getClass();
            AbstractC1464f8 abstractC1464f8 = op.a;
            abstractC1464f8.o(op.b);
            C2994uv c2994uv = op.c;
            abstractC1464f8.r(c2994uv);
            abstractC1464f8.q(c2994uv);
            ((HashSet) this.h).remove(pp);
        }
    }

    public boolean f(Path path, int i) {
        Path path2 = (Path) this.l;
        path2.reset();
        ((C2765sd0[]) this.b)[i].b(((Matrix[]) this.c)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [o.DP, o.KP] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void g(PP pp) {
        EN en = pp.a;
        ?? r1 = new DP() { // from class: o.KP
            @Override // o.DP
            public final void a(AbstractC1464f8 abstractC1464f8, Fj0 fj0) {
                ((C1628gs) this.a.g).s.d(22);
            }
        };
        C2994uv c2994uv = new C2994uv(this, pp, 13, false);
        ((HashMap) this.f).put(pp, new OP(en, r1, c2994uv));
        int i = Lr0.a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        C2613qy c2613qy = en.c;
        c2613qy.getClass();
        HP hp = new HP();
        hp.a = handler;
        hp.b = c2994uv;
        ((CopyOnWriteArrayList) c2613qy.f996o).add(hp);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(looperMyLooper2, null);
        C0350Co c0350Co = en.d;
        c0350Co.getClass();
        C0324Bo c0324Bo = new C0324Bo();
        c0324Bo.a = handler2;
        c0324Bo.b = c2994uv;
        c0350Co.c.add(c0324Bo);
        en.k(r1, (InterfaceC2590qm0) this.l, (C3436zZ) this.b);
    }

    public void h(InterfaceC2941uP interfaceC2941uP) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.d;
        PP pp = (PP) identityHashMap.remove(interfaceC2941uP);
        pp.getClass();
        pp.a.n(interfaceC2941uP);
        pp.c.remove(((BN) interfaceC2941uP).l);
        if (!identityHashMap.isEmpty()) {
            d();
        }
        e(pp);
    }

    public void i(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = (ArrayList) this.c;
            PP pp = (PP) arrayList.remove(i3);
            ((HashMap) this.e).remove(pp.b);
            int i4 = -pp.a.f236o.m.p();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((PP) arrayList.get(i5)).d += i4;
            }
            pp.e = true;
            if (this.a) {
                e(pp);
            }
        }
    }

    public QP(C1628gs c1628gs, C0942Zj c0942Zj, Uh0 uh0, C3436zZ c3436zZ) {
        this.b = c3436zZ;
        this.g = c1628gs;
        this.k = new Jd0();
        this.d = new IdentityHashMap();
        this.e = new HashMap();
        this.c = new ArrayList();
        this.i = c0942Zj;
        this.j = uh0;
        this.f = new HashMap();
        this.h = new HashSet();
    }
}
