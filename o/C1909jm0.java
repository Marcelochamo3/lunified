package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.opengl.GLES20;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: o.jm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1909jm0 implements InterfaceC1497fb0 {
    public int l;
    public Object m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f852o;
    public final Object p;

    public C1909jm0(InterfaceC2159mI interfaceC2159mI, LinkedHashMap linkedHashMap) {
        this.m = interfaceC2159mI;
        this.n = linkedHashMap;
        this.f852o = AP.c;
        this.p = new LinkedHashMap();
        this.l = -1;
    }

    public static void a(int i, String str, int i2) throws C1273dA {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        AbstractC3409z9.f(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: " + str, iArr[0] == 1);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        AbstractC3409z9.e();
    }

    public static void d(String str) {
        if (AbstractC1899jh0.N(str, ":memory:", true)) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = AbstractC1474fG.k(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception unused) {
        }
    }

    public void A(C2903ty c2903ty, int i, int i2) {
        C(c2903ty, i, i2);
    }

    public void B(C2903ty c2903ty) {
        Cursor cursorK = c2903ty.K("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = cursorK.moveToFirst() && cursorK.getInt(0) != 0;
            AbstractC3409z9.g(cursorK, null);
            AbstractC3015v6 abstractC3015v6 = (AbstractC3015v6) this.n;
            if (z) {
                Cursor cursorQ = c2903ty.Q(new J2("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", 8));
                try {
                    String string = cursorQ.moveToFirst() ? cursorQ.getString(0) : null;
                    AbstractC3409z9.g(cursorQ, null);
                    String str = (String) this.f852o;
                    if (!AbstractC1474fG.b(str, string) && !AbstractC1474fG.b((String) this.p, string)) {
                        throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + str + ", found: " + string);
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC3409z9.g(cursorQ, th);
                        throw th2;
                    }
                }
            } else {
                io.sentry.android.core.F fA = abstractC3015v6.A(c2903ty);
                if (!fA.b) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + fA.a);
                }
                D(c2903ty);
            }
            abstractC3015v6.y(c2903ty);
            this.m = null;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC3409z9.g(cursorK, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX WARN: Code duplicated, block: B:19:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:58:0x003f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x003f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[LOOP:1: B:12:0x0029->B:64:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0060 A[SYNTHETIC] */
    public void C(C2903ty c2903ty, int i, int i2) {
        Iterable iterable;
        TreeMap treeMap;
        Set setKeySet;
        Iterator it;
        boolean z;
        Integer num;
        int i3;
        int iIntValue;
        int iIntValue2;
        C3261xj c3261xj = (C3261xj) this.m;
        AbstractC3015v6 abstractC3015v6 = (AbstractC3015v6) this.n;
        if (c3261xj != null) {
            C2938uM c2938uM = c3261xj.d;
            c2938uM.getClass();
            if (i == i2) {
                iterable = C1233cq.l;
            } else {
                boolean z2 = i2 > i;
                ArrayList arrayList = new ArrayList();
                int iIntValue3 = i;
                while (true) {
                    if (z2) {
                        if (iIntValue3 < i2) {
                            treeMap = (TreeMap) c2938uM.m.get(Integer.valueOf(iIntValue3));
                            if (treeMap != null) {
                                if (z2) {
                                    setKeySet = treeMap.descendingKeySet();
                                } else {
                                    setKeySet = treeMap.keySet();
                                }
                                it = setKeySet.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        z = false;
                                        break;
                                    }
                                    num = (Integer) it.next();
                                    if (!z2) {
                                        AbstractC1474fG.i(num, "targetVersion");
                                        iIntValue2 = num.intValue();
                                        if (i2 <= iIntValue2 && iIntValue2 < iIntValue3) {
                                            Object obj = treeMap.get(num);
                                            AbstractC1474fG.g(obj);
                                            arrayList.add(obj);
                                            iIntValue3 = num.intValue();
                                            z = true;
                                            break;
                                            break;
                                        }
                                    } else {
                                        i3 = iIntValue3 + 1;
                                        AbstractC1474fG.i(num, "targetVersion");
                                        iIntValue = num.intValue();
                                        if (i3 <= iIntValue && iIntValue <= i2) {
                                            Object obj2 = treeMap.get(num);
                                            AbstractC1474fG.g(obj2);
                                            arrayList.add(obj2);
                                            iIntValue3 = num.intValue();
                                            z = true;
                                            break;
                                        }
                                    }
                                }
                                if (!z) {
                                }
                            }
                            iterable = null;
                        } else {
                            iterable = arrayList;
                        }
                    } else if (iIntValue3 > i2) {
                        treeMap = (TreeMap) c2938uM.m.get(Integer.valueOf(iIntValue3));
                        if (treeMap != null) {
                            if (z2) {
                                setKeySet = treeMap.descendingKeySet();
                            } else {
                                setKeySet = treeMap.keySet();
                            }
                            it = setKeySet.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z = false;
                                    break;
                                    break;
                                }
                                num = (Integer) it.next();
                                if (!z2) {
                                    i3 = iIntValue3 + 1;
                                    AbstractC1474fG.i(num, "targetVersion");
                                    iIntValue = num.intValue();
                                    if (i3 <= iIntValue) {
                                        continue;
                                    }
                                } else {
                                    AbstractC1474fG.i(num, "targetVersion");
                                    iIntValue2 = num.intValue();
                                    if (i2 <= iIntValue2) {
                                        continue;
                                    }
                                }
                            }
                            if (!z) {
                            }
                        }
                        iterable = null;
                    } else {
                        iterable = arrayList;
                    }
                }
            }
            if (iterable != null) {
                abstractC3015v6.z(c2903ty);
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((C1458f5) it2.next()).a(c2903ty);
                }
                io.sentry.android.core.F fA = abstractC3015v6.A(c2903ty);
                if (fA.b) {
                    D(c2903ty);
                    return;
                } else {
                    throw new IllegalStateException("Migration didn't properly handle: " + fA.a);
                }
            }
        }
        C3261xj c3261xj2 = (C3261xj) this.m;
        if (c3261xj2 != null && !c3261xj2.a(i, i2)) {
            abstractC3015v6.d(c2903ty);
            abstractC3015v6.c(c2903ty);
            return;
        }
        throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public void D(C2903ty c2903ty) {
        c2903ty.p("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = (String) this.f852o;
        AbstractC1474fG.j(str, "hash");
        c2903ty.p("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x012c  */
    @Override // o.InterfaceC1497fb0
    public void b(C2562qX c2562qX) {
        Oj0 oj0;
        SparseBooleanArray sparseBooleanArray;
        SparseArray sparseArray;
        Oj0 oj1;
        int i;
        SparseArray sparseArray2;
        SparseIntArray sparseIntArray;
        int i2;
        SparseArray sparseArray3;
        SparseIntArray sparseIntArray2;
        if (c2562qX.u() != 2) {
            return;
        }
        Wm0 wm0 = (Wm0) this.p;
        int i3 = wm0.a;
        int i4 = 0;
        List list = wm0.b;
        if (i3 == 1 || i3 == 2 || wm0.l == 1) {
            oj0 = (Oj0) list.get(0);
        } else {
            oj0 = new Oj0(((Oj0) list.get(0)).c());
            list.add(oj0);
        }
        if ((c2562qX.u() & 128) == 0) {
            return;
        }
        c2562qX.G(1);
        int iZ = c2562qX.z();
        int i5 = 3;
        c2562qX.G(3);
        C2084lc c2084lc = (C2084lc) this.m;
        c2562qX.e(c2084lc.b, 0, 2);
        c2084lc.p(0);
        c2084lc.s(3);
        wm0.r = c2084lc.i(13);
        c2562qX.e(c2084lc.b, 0, 2);
        c2084lc.p(0);
        c2084lc.s(4);
        c2562qX.G(c2084lc.i(12));
        C1225cm c1225cm = wm0.e;
        int i6 = wm0.a;
        if (i6 == 2 && wm0.p == null) {
            Zm0 zm0A = c1225cm.a(21, new RN(21, null, null, Lr0.e));
            wm0.p = zm0A;
            if (zm0A != null) {
                zm0A.c(oj0, wm0.k, new Ym0(iZ, 21, C1672hI.a.e));
            }
        }
        SparseArray sparseArray4 = (SparseArray) this.n;
        sparseArray4.clear();
        SparseIntArray sparseIntArray3 = (SparseIntArray) this.f852o;
        sparseIntArray3.clear();
        int iA = c2562qX.a();
        while (true) {
            sparseBooleanArray = wm0.g;
            if (iA <= 0) {
                break;
            }
            c2562qX.e(c2084lc.b, i4, 5);
            c2084lc.p(i4);
            int i7 = c2084lc.i(8);
            c2084lc.s(i5);
            int i8 = c2084lc.i(13);
            c2084lc.s(4);
            int i9 = c2084lc.i(12);
            int i10 = c2562qX.b;
            int i11 = i10 + i9;
            Oj0 oj2 = oj0;
            int i12 = iZ;
            C2084lc c2084lc2 = c2084lc;
            String strTrim = null;
            ArrayList arrayList = null;
            int i13 = -1;
            while (true) {
                if (c2562qX.b >= i11) {
                    sparseArray2 = sparseArray4;
                    break;
                }
                int iU = c2562qX.u();
                sparseArray2 = sparseArray4;
                int iU2 = c2562qX.b + c2562qX.u();
                if (iU2 > i11) {
                    break;
                }
                int i14 = i8;
                if (iU == 5) {
                    long jV = c2562qX.v();
                    if (jV == 1094921523) {
                        i13 = Yu0.b.l0;
                    } else if (jV == 1161904947) {
                        i13 = Yu0.b.r0;
                    } else if (jV == 1094921524) {
                        i13 = 172;
                    } else if (jV == 1212503619) {
                        i13 = 36;
                    }
                    sparseIntArray2 = sparseIntArray3;
                } else if (iU == 106) {
                    sparseIntArray2 = sparseIntArray3;
                    i13 = Yu0.b.l0;
                } else if (iU == 122) {
                    sparseIntArray2 = sparseIntArray3;
                    i13 = Yu0.b.r0;
                } else {
                    if (iU == 127) {
                        if (c2562qX.u() == 21) {
                            i13 = 172;
                        }
                    } else if (iU == 123) {
                        sparseIntArray2 = sparseIntArray3;
                        i13 = Yu0.b.u0;
                    } else if (iU == 10) {
                        strTrim = c2562qX.s(3, AbstractC1402ed.c).trim();
                    } else if (iU == 89) {
                        arrayList = new ArrayList();
                        while (c2562qX.b < iU2) {
                            String strTrim2 = c2562qX.s(3, AbstractC1402ed.c).trim();
                            c2562qX.u();
                            byte[] bArr = new byte[4];
                            c2562qX.e(bArr, 0, 4);
                            arrayList.add(new Xm0(strTrim2, bArr));
                            sparseIntArray3 = sparseIntArray3;
                        }
                        sparseIntArray2 = sparseIntArray3;
                        i13 = 89;
                    } else {
                        sparseIntArray2 = sparseIntArray3;
                        if (iU == 111) {
                            i13 = C3080vp0.F0;
                        }
                    }
                    sparseIntArray2 = sparseIntArray3;
                }
                c2562qX.G(iU2 - c2562qX.b);
                sparseIntArray3 = sparseIntArray2;
                sparseArray4 = sparseArray2;
                i8 = i14;
            }
            SparseIntArray sparseIntArray4 = sparseIntArray3;
            int i15 = i8;
            c2562qX.F(i11);
            RN rn = new RN(i13, strTrim, arrayList, Arrays.copyOfRange(c2562qX.a, i10, i11));
            if (i7 == 6 || i7 == 5) {
                i7 = i13;
            }
            iA -= i9 + 5;
            int i16 = i6 == 2 ? i7 : i15;
            if (sparseBooleanArray.get(i16)) {
                sparseIntArray = sparseIntArray4;
                sparseArray3 = sparseArray2;
            } else {
                Zm0 zm0A2 = (i6 == 2 && i7 == 21) ? wm0.p : c1225cm.a(i7, rn);
                sparseIntArray = sparseIntArray4;
                if (i6 == 2) {
                    i2 = i15;
                    if (i2 >= sparseIntArray.get(i16, C1672hI.a.e)) {
                        sparseArray3 = sparseArray2;
                    }
                } else {
                    i2 = i15;
                }
                sparseIntArray.put(i16, i2);
                sparseArray3 = sparseArray2;
                sparseArray3.put(i16, zm0A2);
            }
            sparseArray4 = sparseArray3;
            sparseIntArray3 = sparseIntArray;
            oj0 = oj2;
            c2084lc = c2084lc2;
            iZ = i12;
            i4 = 0;
            i5 = 3;
        }
        SparseArray sparseArray5 = sparseArray4;
        Oj0 oj3 = oj0;
        SparseIntArray sparseIntArray5 = sparseIntArray3;
        int i17 = iZ;
        int size = sparseIntArray5.size();
        int i18 = 0;
        while (true) {
            sparseArray = wm0.f;
            if (i18 >= size) {
                break;
            }
            int iKeyAt = sparseIntArray5.keyAt(i18);
            int iValueAt = sparseIntArray5.valueAt(i18);
            sparseBooleanArray.put(iKeyAt, true);
            wm0.h.put(iValueAt, true);
            Zm0 zm0 = (Zm0) sparseArray5.valueAt(i18);
            if (zm0 != null) {
                if (zm0 != wm0.p) {
                    InterfaceC0354Cs interfaceC0354Cs = wm0.k;
                    i = i17;
                    Ym0 ym0 = new Ym0(i, iKeyAt, C1672hI.a.e);
                    oj1 = oj3;
                    zm0.c(oj1, interfaceC0354Cs, ym0);
                } else {
                    oj1 = oj3;
                    i = i17;
                }
                sparseArray.put(iValueAt, zm0);
            } else {
                oj1 = oj3;
                i = i17;
            }
            i18++;
            oj3 = oj1;
            i17 = i;
        }
        if (i6 == 2) {
            if (!wm0.m) {
                wm0.k.f();
                wm0.l = 0;
                wm0.m = true;
            }
            return;
        }
        sparseArray.remove(this.l);
        int i19 = i6 == 1 ? 0 : wm0.l - 1;
        wm0.l = i19;
        if (i19 == 0) {
            wm0.k.f();
            wm0.m = true;
        }
    }

    public void e(boolean z) {
        s(Boolean.valueOf(z));
    }

    public void f(byte b) {
        s(Byte.valueOf(b));
    }

    public void g(char c) {
        s(Character.valueOf(c));
    }

    public void h(double d) {
        s(Double.valueOf(d));
    }

    public void i(Zb0 zb0, int i) {
        AbstractC1474fG.j(zb0, "descriptor");
        this.l = i;
    }

    public void j(Zb0 zb0, int i) {
        AbstractC1474fG.j(zb0, "enumDescriptor");
        s(Integer.valueOf(i));
    }

    public void k(float f) {
        s(Float.valueOf(f));
    }

    public void l(int i) {
        s(Integer.valueOf(i));
    }

    public void m(long j) {
        s(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void n(InterfaceC2159mI interfaceC2159mI, Object obj) {
        AbstractC1474fG.j(interfaceC2159mI, "serializer");
        interfaceC2159mI.a(this, obj);
    }

    public void p(short s) {
        s(Short.valueOf(s));
    }

    public void q(String str) {
        s(str);
    }

    public Map r(Object obj) {
        n((InterfaceC2159mI) this.m, obj);
        return AbstractC3327yN.B((LinkedHashMap) this.p);
    }

    public void s(Object obj) {
        v(obj);
    }

    public int t(String str) throws C1273dA {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.l, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        AbstractC3409z9.e();
        return iGlGetAttribLocation;
    }

    public C2743sL u() {
        return (C2743sL) this.f852o;
    }

    public void v(Object obj) {
        String strD = ((InterfaceC2159mI) this.m).b().d(this.l);
        AbstractC1976kU abstractC1976kU = (AbstractC1976kU) ((Map) this.n).get(strD);
        if (abstractC1976kU == null) {
            throw new IllegalStateException(AbstractC1701hf0.u("Cannot find NavType for argument ", strD, ". Please provide NavType through typeMap.").toString());
        }
        ((LinkedHashMap) this.p).put(strD, abstractC1976kU instanceof C1293dU ? ((C1293dU) abstractC1976kU).m(obj) : AbstractC2506pt.A(abstractC1976kU.f(obj)));
    }

    public boolean w(C1909jm0 c1909jm0, int i) {
        return c1909jm0 != null && Lr0.a(((Y60[]) this.m)[i], ((Y60[]) c1909jm0.m)[i]) && Lr0.a(((InterfaceC1920js[]) this.n)[i], ((InterfaceC1920js[]) c1909jm0.n)[i]);
    }

    public boolean x(int i) {
        return ((Y60[]) this.m)[i] != null;
    }

    public void y(C2903ty c2903ty) {
    }

    public void z(C2903ty c2903ty) {
        Cursor cursorK = c2903ty.K("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (cursorK.moveToFirst() && cursorK.getInt(0) == 0) {
                z = true;
            }
            AbstractC3409z9.g(cursorK, null);
            AbstractC3015v6 abstractC3015v6 = (AbstractC3015v6) this.n;
            abstractC3015v6.c(c2903ty);
            if (!z) {
                io.sentry.android.core.F fA = abstractC3015v6.A(c2903ty);
                if (!fA.b) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + fA.a);
                }
            }
            D(c2903ty);
            abstractC3015v6.x(c2903ty);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3409z9.g(cursorK, th);
                throw th2;
            }
        }
    }

    public C1909jm0(C3261xj c3261xj, AbstractC3015v6 abstractC3015v6, String str, String str2) {
        this.l = abstractC3015v6.m;
        this.m = c3261xj;
        this.n = abstractC3015v6;
        this.f852o = str;
        this.p = str2;
    }

    public C1909jm0(Y60[] y60Arr, InterfaceC1920js[] interfaceC1920jsArr, C2105lm0 c2105lm0, C3036vN c3036vN) {
        this.m = y60Arr;
        this.n = (InterfaceC1920js[]) interfaceC1920jsArr.clone();
        this.f852o = c2105lm0;
        this.p = c3036vN;
        this.l = y60Arr.length;
    }

    public C1909jm0(String str, String str2) throws C1273dA {
        byte[] bArr;
        byte[] bArr2;
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.l = iGlCreateProgram;
        AbstractC3409z9.e();
        a(iGlCreateProgram, str, 35633);
        a(iGlCreateProgram, str2, 35632);
        GLES20.glLinkProgram(iGlCreateProgram);
        int i = 0;
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        int i2 = 1;
        AbstractC3409z9.f("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.f852o = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.m = new C0622Nb[iArr2[0]];
        int i3 = 0;
        while (i3 < iArr2[0]) {
            int i4 = this.l;
            int[] iArr3 = new int[i2];
            GLES20.glGetProgramiv(i4, 35722, iArr3, 0);
            int i5 = iArr3[0];
            byte[] bArr3 = new byte[i5];
            GLES20.glGetActiveAttrib(i4, i3, i5, new int[i2], 0, new int[i2], 0, new int[i2], 0, bArr3, 0);
            int i6 = 0;
            while (true) {
                if (i6 >= i5) {
                    bArr2 = bArr3;
                    i6 = i5;
                    break;
                } else {
                    bArr2 = bArr3;
                    if (bArr2[i6] == 0) {
                        break;
                    }
                    i6++;
                    bArr3 = bArr2;
                }
            }
            String str3 = new String(bArr2, 0, i6);
            GLES20.glGetAttribLocation(i4, str3);
            C0622Nb c0622Nb = new C0622Nb(25);
            ((C0622Nb[]) this.m)[i3] = c0622Nb;
            ((HashMap) this.f852o).put(str3, c0622Nb);
            i3++;
            i2 = 1;
        }
        this.p = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.l, 35718, iArr4, 0);
        this.n = new C0519Jb[iArr4[0]];
        for (int i7 = 0; i7 < iArr4[i]; i7++) {
            int i8 = this.l;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i8, 35719, iArr5, i);
            int i9 = iArr5[i];
            byte[] bArr4 = new byte[i9];
            GLES20.glGetActiveUniform(i8, i7, i9, new int[1], 0, new int[1], 0, new int[1], 0, bArr4, 0);
            int i10 = 0;
            while (true) {
                if (i10 >= i9) {
                    bArr = bArr4;
                    i10 = i9;
                    break;
                } else {
                    bArr = bArr4;
                    if (bArr[i10] == 0) {
                        break;
                    }
                    i10++;
                    bArr4 = bArr;
                }
            }
            i = 0;
            String str4 = new String(bArr, 0, i10);
            GLES20.glGetUniformLocation(i8, str4);
            C0519Jb c0519Jb = new C0519Jb(26);
            ((C0519Jb[]) this.n)[i7] = c0519Jb;
            ((HashMap) this.p).put(str4, c0519Jb);
        }
        AbstractC3409z9.e();
    }

    public C1909jm0(C3235xS c3235xS, L80 l80, byte[] bArr, io.sentry.X1[] x1Arr, int i) {
        this.m = c3235xS;
        this.n = l80;
        this.f852o = bArr;
        this.p = x1Arr;
        this.l = i;
    }

    public C1909jm0(Wm0 wm0, int i) {
        this.p = wm0;
        this.m = new C2084lc(5, new byte[5]);
        this.n = new SparseArray();
        this.f852o = new SparseIntArray();
        this.l = i;
    }

    @Override // o.InterfaceC1497fb0
    public void c(Oj0 oj0, InterfaceC0354Cs interfaceC0354Cs, Ym0 ym0) {
    }
}
