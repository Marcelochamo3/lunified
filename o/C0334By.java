package o;

import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;
import com.skidush.navigation.widget.NavigationSlideView;
import j$.util.Optional;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.By, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0334By implements Tb0, InterfaceC2195mj, InterfaceC2604qt0, TN, XP, InterfaceC0803Ua, InterfaceC0602Mh, InterfaceC2719s30 {
    public final /* synthetic */ int l;
    public Object m;

    public /* synthetic */ C0334By(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    public static C0334By r(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View viewInflate = layoutInflater.inflate(R.layout.item_loading, (ViewGroup) recyclerView, false);
        int i = R.id.pb_load_more_is_loading;
        if (((ProgressBar) Sr0.g(viewInflate, R.id.pb_load_more_is_loading)) != null) {
            i = R.id.v_background;
            if (Sr0.g(viewInflate, R.id.v_background) != null) {
                return new C0334By(9, (ConstraintLayout) viewInflate);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public void A(C2431p40 c2431p40, Executor executor, UU uu) {
        C2815t3 c2815t3 = Kv0.a;
        C2815t3 c2815t4 = Kv0.d;
        List listUnmodifiableList = Collections.unmodifiableList(c2431p40.l);
        String[][] strArr = (String[][]) Array.newInstance((Class<?>) String.class, listUnmodifiableList.size(), 2);
        for (int i = 0; i < listUnmodifiableList.size(); i++) {
            String[] strArr2 = strArr[i];
            ((C2334o40) listUnmodifiableList.get(i)).getClass();
            strArr2[0] = "*";
            strArr[i][1] = ((C2334o40) listUnmodifiableList.get(i)).a;
        }
        String[] strArr3 = (String[]) Collections.unmodifiableList(c2431p40.m).toArray(new String[0]);
        if (c2815t3.b()) {
            if (((ProxyControllerBoundaryInterface) this.m) == null) {
                this.m = Lv0.a.getProxyController();
            }
            ((ProxyControllerBoundaryInterface) this.m).setProxyOverride(strArr, strArr3, uu, executor);
        } else {
            if (!c2815t3.b() || !c2815t4.b()) {
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            }
            if (((ProxyControllerBoundaryInterface) this.m) == null) {
                this.m = Lv0.a.getProxyController();
            }
            ((ProxyControllerBoundaryInterface) this.m).setProxyOverride(strArr, strArr3, uu, executor, false);
        }
    }

    public void B(int i, long j, long j2) throws C2949uX {
        C2649rO c2649rO = (C2649rO) this.m;
        AbstractC0397Ej.g(c2649rO.b0);
        if (i == 160) {
            c2649rO.Q = false;
            c2649rO.R = 0L;
            return;
        }
        if (i != 174) {
            if (i == 187) {
                c2649rO.E = false;
                return;
            }
            if (i == 19899) {
                c2649rO.w = -1;
                c2649rO.x = -1L;
                return;
            }
            if (i == 20533) {
                c2649rO.c(i);
                c2649rO.u.h = true;
                return;
            }
            if (i == 21968) {
                c2649rO.c(i);
                c2649rO.u.x = true;
                return;
            }
            if (i == 408125543) {
                long j3 = c2649rO.q;
                if (j3 != -1 && j3 != j) {
                    throw C2949uX.a("Multiple Segment elements not supported", null);
                }
                c2649rO.q = j;
                c2649rO.p = j2;
                return;
            }
            if (i == 475249515) {
                c2649rO.C = new C2295nk0(6);
                c2649rO.D = new C2295nk0(6);
                return;
            } else {
                if (i == 524531317 && !c2649rO.v) {
                    if (c2649rO.d && c2649rO.z != -1) {
                        c2649rO.y = true;
                        return;
                    } else {
                        c2649rO.b0.i(new C3114w7(c2649rO.t));
                        c2649rO.v = true;
                        return;
                    }
                }
                return;
            }
        }
        C2553qO c2553qO = new C2553qO();
        c2553qO.m = -1;
        c2553qO.n = -1;
        c2553qO.f991o = -1;
        c2553qO.p = -1;
        c2553qO.q = 0;
        c2553qO.r = -1;
        c2553qO.s = 0.0f;
        c2553qO.t = 0.0f;
        c2553qO.u = 0.0f;
        c2553qO.v = null;
        c2553qO.w = -1;
        c2553qO.x = false;
        c2553qO.y = -1;
        c2553qO.z = -1;
        c2553qO.A = -1;
        c2553qO.B = 1000;
        c2553qO.C = 200;
        c2553qO.D = -1.0f;
        c2553qO.E = -1.0f;
        c2553qO.F = -1.0f;
        c2553qO.G = -1.0f;
        c2553qO.H = -1.0f;
        c2553qO.I = -1.0f;
        c2553qO.J = -1.0f;
        c2553qO.K = -1.0f;
        c2553qO.L = -1.0f;
        c2553qO.M = -1.0f;
        c2553qO.O = 1;
        c2553qO.P = -1;
        c2553qO.Q = 8000;
        c2553qO.R = 0L;
        c2553qO.S = 0L;
        c2553qO.V = true;
        c2553qO.W = "eng";
        c2649rO.u = c2553qO;
    }

    public void C(int i, String str) throws C2949uX {
        C2649rO c2649rO = (C2649rO) this.m;
        c2649rO.getClass();
        if (i == 134) {
            c2649rO.c(i);
            c2649rO.u.b = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw C2949uX.a("DocType " + str + " not supported", null);
        }
        if (i == 21358) {
            c2649rO.c(i);
            c2649rO.u.a = str;
        } else {
            if (i != 2274716) {
                return;
            }
            c2649rO.c(i);
            c2649rO.u.W = str;
        }
    }

    @Override // o.InterfaceC0803Ua
    public void E(A50 a50, IOException iOException) {
        Mc0 mc0 = (Mc0) this.m;
        mc0.getClass();
        if (E.j.d(mc0, null, new C3002v(iOException))) {
            E.O(mc0);
        }
    }

    @Override // o.XP
    public void N(ZP zp) {
        int i = this.l;
    }

    @Override // o.InterfaceC2195mj
    public void a() {
        ((K50) this.m).f();
    }

    @Override // o.InterfaceC2604qt0
    public View b() {
        return (ConstraintLayout) this.m;
    }

    public void c(int i, boolean z) {
        C2149m9 c2149m9 = (C2149m9) this.m;
        if (z) {
            c2149m9.a(i);
        } else {
            c2149m9.getClass();
        }
    }

    @Override // o.Tb0
    public void e(Ub0 ub0) {
        WB wb = (WB) this.m;
        wb.D.e(wb);
    }

    @Override // o.InterfaceC2195mj
    public Object f() {
        K50 k50 = (K50) this.m;
        k50.reset();
        return k50;
    }

    @Override // o.InterfaceC2719s30
    public void g(int i, Object obj) {
        if (i == 6 || i == 7 || i == 8) {
        }
        ((ProfileInstallReceiver) this.m).setResultCode(i);
    }

    public void h(int i, String str) {
        try {
            ((JSONObject) this.m).put(str, i);
        } catch (JSONException unused) {
            throw new RuntimeException("Illegal JSON value " + str + ": " + i);
        }
    }

    public void i(Object obj, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        C3023vA c3023vA;
        int i7;
        View view = (View) obj;
        C3217xA c3217xA = (C3217xA) this.m;
        if (i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE) {
            boolean z = c3217xA.W.c;
            C2303no0 c2303no0 = c3217xA.Y;
            if (z) {
                C1735hw0 c1735hw0 = (C1735hw0) c2303no0.f941o;
                i4 = c1735hw0.i - c1735hw0.k;
            } else {
                i4 = ((C1735hw0) c2303no0.f941o).j;
            }
        }
        if (!c3217xA.W.c) {
            i6 = i2 + i4;
            i5 = i4;
        } else {
            i5 = i4 - i2;
            i6 = i4;
        }
        int iD1 = (c3217xA.d1(i3) + ((C1735hw0) c3217xA.Y.p).j) - c3217xA.K;
        FV fv = c3217xA.d0;
        if (((C2841tM) fv.n) != null) {
            SparseArray<Parcelable> sparseArray = (SparseArray) ((C2841tM) fv.n).l(Integer.toString(i));
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
            }
        }
        ((C3217xA) this.m).j1(view, i3, i5, i6, iD1);
        if (!c3217xA.v.g) {
            c3217xA.F1();
        }
        if ((c3217xA.B & 3) == 1 || (c3023vA = c3217xA.G) == null) {
            return;
        }
        boolean z2 = c3023vA.r;
        C3217xA c3217xA2 = c3023vA.t;
        if (z2 && (i7 = c3023vA.s) != 0) {
            c3023vA.s = c3217xA2.p1(i7, true);
        }
        int i8 = c3023vA.s;
        if (i8 == 0 || ((i8 > 0 && c3217xA2.h1()) || (c3023vA.s < 0 && c3217xA2.g1()))) {
            c3023vA.a = c3217xA2.D;
            c3023vA.j();
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x029f  */
    public void j(int i, int i2, C0554Kk c0554Kk) throws C2949uX {
        C2553qO c2553qO;
        C2553qO c2553qO2;
        C2553qO c2553qO3;
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        C2649rO c2649rO = (C2649rO) this.m;
        SparseArray sparseArray = c2649rO.c;
        int i7 = 4;
        int i8 = 0;
        int i9 = 1;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (c2649rO.G != 2) {
                    return;
                }
                C2553qO c2553qO4 = (C2553qO) sparseArray.get(c2649rO.M);
                if (c2649rO.P != 4 || !"V_VP9".equals(c2553qO4.b)) {
                    c0554Kk.q(i2);
                    return;
                }
                C2562qX c2562qX = c2649rO.n;
                c2562qX.C(i2);
                c0554Kk.a(c2562qX.a, 0, i2, false);
                return;
            }
            if (i == 16877) {
                c2649rO.c(i);
                C2553qO c2553qO5 = c2649rO.u;
                int i10 = c2553qO5.g;
                if (i10 != 1685485123 && i10 != 1685480259) {
                    c0554Kk.q(i2);
                    return;
                }
                byte[] bArr = new byte[i2];
                c2553qO5.N = bArr;
                c0554Kk.a(bArr, 0, i2, false);
                return;
            }
            if (i == 16981) {
                c2649rO.c(i);
                C2553qO c2553qO6 = c2649rO.u;
                byte[] bArr2 = new byte[i2];
                c2553qO6.i = bArr2;
                c0554Kk.a(bArr2, 0, i2, false);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                c0554Kk.a(bArr3, 0, i2, false);
                c2649rO.c(i);
                c2649rO.u.j = new C1226cm0(1, 0, 0, bArr3);
                return;
            }
            if (i == 21419) {
                C2562qX c2562qX2 = c2649rO.i;
                Arrays.fill(c2562qX2.a, (byte) 0);
                c0554Kk.a(c2562qX2.a, 4 - i2, i2, false);
                c2562qX2.F(0);
                c2649rO.w = (int) c2562qX2.v();
                return;
            }
            if (i == 25506) {
                c2649rO.c(i);
                C2553qO c2553qO7 = c2649rO.u;
                byte[] bArr4 = new byte[i2];
                c2553qO7.k = bArr4;
                c0554Kk.a(bArr4, 0, i2, false);
                return;
            }
            if (i != 30322) {
                throw C2949uX.a("Unexpected id: " + i, null);
            }
            c2649rO.c(i);
            C2553qO c2553qO8 = c2649rO.u;
            byte[] bArr5 = new byte[i2];
            c2553qO8.v = bArr5;
            c0554Kk.a(bArr5, 0, i2, false);
            return;
        }
        int i11 = c2649rO.G;
        C2562qX c2562qX3 = c2649rO.g;
        if (i11 == 0) {
            C1727hs0 c1727hs0 = c2649rO.b;
            c2649rO.M = (int) c1727hs0.c(c0554Kk, false, true, 8);
            c2649rO.N = c1727hs0.b;
            c2649rO.I = -9223372036854775807L;
            c2649rO.G = 1;
            c2562qX3.C(0);
        }
        C2553qO c2553qO9 = (C2553qO) sparseArray.get(c2649rO.M);
        if (c2553qO9 == null) {
            c0554Kk.q(i2 - c2649rO.N);
            c2649rO.G = 0;
            return;
        }
        c2553qO9.X.getClass();
        if (c2649rO.G == 1) {
            c2649rO.j(c0554Kk, 3);
            int i12 = (c2562qX3.a[2] & 6) >> 1;
            byte b = 255;
            if (i12 == 0) {
                c2649rO.K = 1;
                int[] iArr = c2649rO.L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                c2649rO.L = iArr;
                iArr[0] = (i2 - c2649rO.N) - 3;
            } else {
                c2649rO.j(c0554Kk, 4);
                int i13 = (c2562qX3.a[3] & 255) + 1;
                c2649rO.K = i13;
                int[] iArr2 = c2649rO.L;
                if (iArr2 == null) {
                    iArr2 = new int[i13];
                } else if (iArr2.length < i13) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i13)];
                }
                c2649rO.L = iArr2;
                if (i12 == 2) {
                    int i14 = (i2 - c2649rO.N) - 4;
                    int i15 = c2649rO.K;
                    Arrays.fill(iArr2, 0, i15, i14 / i15);
                } else {
                    if (i12 == 1) {
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            i3 = c2649rO.K - 1;
                            if (i16 >= i3) {
                                break;
                            }
                            c2649rO.L[i16] = 0;
                            while (true) {
                                i4 = i7 + 1;
                                c2649rO.j(c0554Kk, i4);
                                int i18 = c2562qX3.a[i7] & 255;
                                int[] iArr3 = c2649rO.L;
                                i5 = iArr3[i16] + i18;
                                iArr3[i16] = i5;
                                if (i18 != 255) {
                                    break;
                                } else {
                                    i7 = i4;
                                }
                            }
                            i17 += i5;
                            i16++;
                            i7 = i4;
                        }
                        c2649rO.L[i3] = ((i2 - c2649rO.N) - i7) - i17;
                    } else {
                        if (i12 != 3) {
                            throw C2949uX.a("Unexpected lacing value: " + i12, null);
                        }
                        int i19 = 0;
                        int i20 = 0;
                        while (true) {
                            int i21 = c2649rO.K - i9;
                            if (i19 >= i21) {
                                c2553qO2 = c2553qO9;
                                c2649rO.L[i21] = ((i2 - c2649rO.N) - i7) - i20;
                                break;
                            }
                            c2649rO.L[i19] = i8;
                            int i22 = i7 + 1;
                            c2649rO.j(c0554Kk, i22);
                            if (c2562qX3.a[i7] == 0) {
                                throw C2949uX.a("No valid varint length mask found", null);
                            }
                            int i23 = 0;
                            while (true) {
                                if (i23 >= 8) {
                                    c2553qO3 = c2553qO9;
                                    j = 0;
                                    i7 = i22;
                                    break;
                                }
                                int i24 = i9 << (7 - i23);
                                if ((c2562qX3.a[i7] & i24) != 0) {
                                    int i25 = i22 + i23;
                                    c2649rO.j(c0554Kk, i25);
                                    C2553qO c2553qO10 = c2553qO9;
                                    j = c2562qX3.a[i7] & b & (~i24);
                                    while (i22 < i25) {
                                        j = (j << 8) | ((long) (c2562qX3.a[i22] & 255));
                                        i22++;
                                        c2553qO10 = c2553qO10;
                                    }
                                    c2553qO3 = c2553qO10;
                                    if (i19 > 0) {
                                        j -= (1 << ((i23 * 7) + 6)) - 1;
                                    }
                                    i7 = i25;
                                    break;
                                }
                                i23++;
                                b = 255;
                                i9 = 1;
                            }
                            if (j < -2147483648L || j > C1707hi0.a) {
                                throw C2949uX.a("EBML lacing sample size out of range.", null);
                            }
                            int i26 = (int) j;
                            int[] iArr4 = c2649rO.L;
                            if (i19 != 0) {
                                i26 += iArr4[i19 - 1];
                            }
                            iArr4[i19] = i26;
                            i20 += i26;
                            i19++;
                            c2553qO9 = c2553qO3;
                            b = 255;
                            i8 = 0;
                            i9 = 1;
                        }
                    }
                    byte[] bArr6 = c2562qX3.a;
                    c2649rO.H = c2649rO.l((bArr6[1] & 255) | (bArr6[0] << 8)) + c2649rO.B;
                    c2553qO = c2553qO2;
                    if (c2553qO.d != 2 || (i == 163 && (c2562qX3.a[2] & 128) == 128)) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    c2649rO.O = i6;
                    c2649rO.G = 2;
                    c2649rO.J = 0;
                }
            }
            c2553qO2 = c2553qO9;
            byte[] bArr7 = c2562qX3.a;
            c2649rO.H = c2649rO.l((bArr7[1] & 255) | (bArr7[0] << 8)) + c2649rO.B;
            c2553qO = c2553qO2;
            if (c2553qO.d != 2) {
                i6 = 1;
            } else {
                i6 = 1;
            }
            c2649rO.O = i6;
            c2649rO.G = 2;
            c2649rO.J = 0;
        } else {
            c2553qO = c2553qO9;
        }
        if (i == 163) {
            while (true) {
                int i27 = c2649rO.J;
                if (i27 >= c2649rO.K) {
                    c2649rO.G = 0;
                    return;
                }
                c2649rO.g(c2553qO, ((long) ((c2649rO.J * c2553qO.e) / 1000)) + c2649rO.H, c2649rO.O, c2649rO.m(c0554Kk, c2553qO, c2649rO.L[i27], false), 0);
                c2649rO.J++;
                c2553qO = c2553qO;
            }
        } else {
            C2553qO c2553qO11 = c2553qO;
            while (true) {
                int i28 = c2649rO.J;
                if (i28 >= c2649rO.K) {
                    return;
                }
                int[] iArr5 = c2649rO.L;
                iArr5[i28] = c2649rO.m(c0554Kk, c2553qO11, iArr5[i28], true);
                c2649rO.J++;
            }
        }
    }

    public int k(int i, boolean z, Object[] objArr, boolean z2) {
        int i2;
        View viewS;
        C3217xA c3217xA = (C3217xA) this.m;
        View viewD = c3217xA.A.d(i - c3217xA.w);
        C2926uA c2926uA = (C2926uA) viewD.getLayoutParams();
        c3217xA.r.K(viewD);
        c2926uA.getClass();
        if (!((C2926uA) viewD.getLayoutParams()).a.l()) {
            if (z2) {
                if (z) {
                    c3217xA.b(viewD, -1, true);
                } else {
                    c3217xA.b(viewD, 0, true);
                }
            } else if (z) {
                c3217xA.b(viewD, -1, false);
            } else {
                c3217xA.b(viewD, 0, false);
            }
            int i3 = c3217xA.J;
            if (i3 != -1) {
                viewD.setVisibility(i3);
            }
            C3023vA c3023vA = c3217xA.G;
            if (c3023vA != null && !c3023vA.r && (i2 = c3023vA.s) != 0) {
                C3217xA c3217xA2 = c3023vA.t;
                int i4 = i2 > 0 ? c3217xA2.D + c3217xA2.U : c3217xA2.D - c3217xA2.U;
                View view = null;
                while (c3023vA.s != 0 && (viewS = c3023vA.b.y.s(i4)) != null) {
                    c3217xA2.getClass();
                    if (viewS.getVisibility() == 0 && (!c3217xA2.R() || viewS.hasFocusable())) {
                        c3217xA2.D = i4;
                        c3217xA2.E = 0;
                        int i5 = c3023vA.s;
                        if (i5 > 0) {
                            c3023vA.s = i5 - 1;
                        } else {
                            c3023vA.s = i5 + 1;
                        }
                        view = viewS;
                    }
                    i4 = c3023vA.s > 0 ? i4 + c3217xA2.U : i4 - c3217xA2.U;
                }
                if (view != null && c3217xA2.R()) {
                    c3217xA2.B |= 32;
                    view.requestFocus();
                    c3217xA2.B &= -33;
                }
            }
            if (viewD.findFocus() != null) {
                ((C2926uA) viewD.getLayoutParams()).getClass();
            }
            int i6 = c3217xA.B;
            if ((i6 & 3) != 1) {
                if (i == c3217xA.D && c3217xA.E == 0 && c3217xA.G == null) {
                    c3217xA.W0();
                }
            } else if ((i6 & 4) == 0) {
                int i7 = i6 & 16;
                if (i7 == 0 && i == c3217xA.D && c3217xA.E == 0) {
                    c3217xA.W0();
                } else if (i7 != 0 && i >= c3217xA.D && viewD.hasFocusable()) {
                    c3217xA.D = i;
                    c3217xA.E = 0;
                    c3217xA.B &= -17;
                    c3217xA.W0();
                }
            }
            c3217xA.l1(viewD);
        }
        objArr[0] = viewD;
        return c3217xA.s == 0 ? C3217xA.a1(viewD) : C3217xA.Z0(viewD);
    }

    @Override // o.InterfaceC0602Mh
    public Object l(Object obj) {
        return Optional.ofNullable(((InterfaceC0602Mh) this.m).l((AbstractC2051l80) obj));
    }

    public void m(int i, double d) {
        C2649rO c2649rO = (C2649rO) this.m;
        if (i == 181) {
            c2649rO.c(i);
            c2649rO.u.Q = (int) d;
        }
        if (i == 17545) {
            c2649rO.s = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                c2649rO.c(i);
                c2649rO.u.D = (float) d;
                break;
            case 21970:
                c2649rO.c(i);
                c2649rO.u.E = (float) d;
                break;
            case 21971:
                c2649rO.c(i);
                c2649rO.u.F = (float) d;
                break;
            case 21972:
                c2649rO.c(i);
                c2649rO.u.G = (float) d;
                break;
            case 21973:
                c2649rO.c(i);
                c2649rO.u.H = (float) d;
                break;
            case 21974:
                c2649rO.c(i);
                c2649rO.u.I = (float) d;
                break;
            case 21975:
                c2649rO.c(i);
                c2649rO.u.J = (float) d;
                break;
            case 21976:
                c2649rO.c(i);
                c2649rO.u.K = (float) d;
                break;
            case 21977:
                c2649rO.c(i);
                c2649rO.u.L = (float) d;
                break;
            case 21978:
                c2649rO.c(i);
                c2649rO.u.M = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        c2649rO.c(i);
                        c2649rO.u.s = (float) d;
                        break;
                    case 30324:
                        c2649rO.c(i);
                        c2649rO.u.t = (float) d;
                        break;
                    case 30325:
                        c2649rO.c(i);
                        c2649rO.u.u = (float) d;
                        break;
                    default:
                        c2649rO.getClass();
                        break;
                }
                break;
        }
    }

    public int n() {
        C3217xA c3217xA = (C3217xA) this.m;
        return c3217xA.v.b() + c3217xA.w;
    }

    public int o(int i) {
        C3217xA c3217xA = (C3217xA) this.m;
        View viewS = c3217xA.s(i - c3217xA.w);
        return (c3217xA.B & 262144) != 0 ? c3217xA.t.b(viewS) : c3217xA.t.e(viewS);
    }

    @Override // o.InterfaceC0803Ua
    public void p(A50 a50, C1855j80 c1855j80) {
        Mc0 mc0 = (Mc0) this.m;
        mc0.getClass();
        if (E.j.d(mc0, null, c1855j80)) {
            E.O(mc0);
        }
    }

    public int q(int i) {
        C3217xA c3217xA = (C3217xA) this.m;
        View viewS = c3217xA.s(i - c3217xA.w);
        Rect rect = C3217xA.g0;
        c3217xA.B(viewS, rect);
        return c3217xA.s == 0 ? rect.width() : rect.height();
    }

    public void s(int i, long j) throws C2949uX {
        C2649rO c2649rO = (C2649rO) this.m;
        c2649rO.getClass();
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw C2949uX.a("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw C2949uX.a("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i) {
            case Yu0.b.n0 /* 131 */:
                c2649rO.c(i);
                c2649rO.u.d = (int) j;
                return;
            case Yu0.b.s0 /* 136 */:
                c2649rO.c(i);
                c2649rO.u.V = j == 1;
                return;
            case 155:
                c2649rO.I = c2649rO.l(j);
                return;
            case 159:
                c2649rO.c(i);
                c2649rO.u.O = (int) j;
                return;
            case 176:
                c2649rO.c(i);
                c2649rO.u.m = (int) j;
                return;
            case 179:
                c2649rO.b(i);
                c2649rO.C.b(c2649rO.l(j));
                return;
            case 186:
                c2649rO.c(i);
                c2649rO.u.n = (int) j;
                return;
            case 215:
                c2649rO.c(i);
                c2649rO.u.c = (int) j;
                return;
            case 231:
                c2649rO.B = c2649rO.l(j);
                return;
            case 238:
                c2649rO.P = (int) j;
                return;
            case 241:
                if (c2649rO.E) {
                    return;
                }
                c2649rO.b(i);
                c2649rO.D.b(j);
                c2649rO.E = true;
                return;
            case C3080vp0.z0 /* 251 */:
                c2649rO.Q = true;
                return;
            case 16871:
                c2649rO.c(i);
                c2649rO.u.g = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw C2949uX.a("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw C2949uX.a("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw C2949uX.a("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw C2949uX.a("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw C2949uX.a("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                c2649rO.x = j + c2649rO.q;
                return;
            case 21432:
                int i2 = (int) j;
                c2649rO.c(i);
                if (i2 == 0) {
                    c2649rO.u.w = 0;
                    return;
                }
                if (i2 == 1) {
                    c2649rO.u.w = 2;
                    return;
                } else if (i2 == 3) {
                    c2649rO.u.w = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    c2649rO.u.w = 3;
                    return;
                }
            case 21680:
                c2649rO.c(i);
                c2649rO.u.f991o = (int) j;
                return;
            case 21682:
                c2649rO.c(i);
                c2649rO.u.q = (int) j;
                return;
            case 21690:
                c2649rO.c(i);
                c2649rO.u.p = (int) j;
                return;
            case 21930:
                c2649rO.c(i);
                c2649rO.u.U = j == 1;
                return;
            case 21998:
                c2649rO.c(i);
                c2649rO.u.f = (int) j;
                return;
            case 22186:
                c2649rO.c(i);
                c2649rO.u.R = j;
                return;
            case 22203:
                c2649rO.c(i);
                c2649rO.u.S = j;
                return;
            case 25188:
                c2649rO.c(i);
                c2649rO.u.P = (int) j;
                return;
            case 30114:
                c2649rO.R = j;
                return;
            case 30321:
                c2649rO.c(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    c2649rO.u.r = 0;
                    return;
                }
                if (i3 == 1) {
                    c2649rO.u.r = 1;
                    return;
                } else if (i3 == 2) {
                    c2649rO.u.r = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    c2649rO.u.r = 3;
                    return;
                }
            case 2352003:
                c2649rO.c(i);
                c2649rO.u.e = (int) j;
                return;
            case 2807729:
                c2649rO.r = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        c2649rO.c(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            c2649rO.u.A = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            c2649rO.u.A = 1;
                            return;
                        }
                    case 21946:
                        c2649rO.c(i);
                        int iC = C1602gf.c((int) j);
                        if (iC != -1) {
                            c2649rO.u.z = iC;
                            return;
                        }
                        return;
                    case 21947:
                        c2649rO.c(i);
                        c2649rO.u.x = true;
                        int iB = C1602gf.b((int) j);
                        if (iB != -1) {
                            c2649rO.u.y = iB;
                            return;
                        }
                        return;
                    case 21948:
                        c2649rO.c(i);
                        c2649rO.u.B = (int) j;
                        return;
                    case 21949:
                        c2649rO.c(i);
                        c2649rO.u.C = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public void t(Exception exc) {
        AP.g("Audio sink error", exc);
        C1364e7 c1364e7 = ((AO) this.m).R0;
        Handler handler = c1364e7.b;
        if (handler != null) {
            handler.post(new Z6(c1364e7, exc, 1));
        }
    }

    @Override // o.XP
    public boolean w(ZP zp, MenuItem menuItem) {
        switch (this.l) {
            case 19:
                AbstractC3043vU abstractC3043vU = (AbstractC3043vU) this.m;
                abstractC3043vU.getClass();
                InterfaceC2849tU interfaceC2849tU = abstractC3043vU.p;
                return (interfaceC2849tU == null || interfaceC2849tU.a(menuItem)) ? false : true;
            default:
                AbstractC1474fG.j(zp, "menu");
                AbstractC1474fG.j(menuItem, "item");
                NavigationSlideView navigationSlideView = (NavigationSlideView) this.m;
                if (navigationSlideView.r == null || menuItem.getItemId() != navigationSlideView.getSelectedItemId()) {
                    InterfaceC0412Ey interfaceC0412Ey = navigationSlideView.q;
                    return true ^ (interfaceC0412Ey != null ? ((Boolean) interfaceC0412Ey.b(menuItem)).booleanValue() : true);
                }
                InterfaceC0412Ey interfaceC0412Ey2 = navigationSlideView.r;
                if (interfaceC0412Ey2 == null) {
                    return true;
                }
                return true;
        }
    }

    public void x() {
        WB wb = (WB) this.m;
        int i = wb.E - 1;
        wb.E = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (C2637rC c2637rC : wb.G) {
            c2637rC.e();
            i2 += c2637rC.T.l;
        }
        Zl0[] zl0Arr = new Zl0[i2];
        int i3 = 0;
        for (C2637rC c2637rC2 : wb.G) {
            c2637rC2.e();
            int i4 = c2637rC2.T.l;
            int i5 = 0;
            while (i5 < i4) {
                c2637rC2.e();
                zl0Arr[i3] = c2637rC2.T.a(i5);
                i5++;
                i3++;
            }
        }
        wb.F = new C1031am0(zl0Arr);
        wb.D.d(wb);
    }

    public CQ y(C0554Kk c0554Kk, C0633Nm c0633Nm) {
        C2562qX c2562qX = (C2562qX) this.m;
        CQ cqB = null;
        int i = 0;
        while (true) {
            try {
                c0554Kk.x(c2562qX.a, 0, 10, false);
                c2562qX.F(0);
                if (c2562qX.w() != 4801587) {
                    break;
                }
                c2562qX.G(3);
                int iT = c2562qX.t();
                int i2 = iT + 10;
                if (cqB == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(c2562qX.a, 0, bArr, 0, 10);
                    c0554Kk.x(bArr, 10, iT, false);
                    cqB = new ME(c0633Nm).B(i2, bArr);
                } else {
                    c0554Kk.b(iT, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        c0554Kk.q = 0;
        c0554Kk.b(i, false);
        return cqB;
    }

    public void z(int i) {
        C3217xA c3217xA = (C3217xA) this.m;
        View viewS = c3217xA.s(i - c3217xA.w);
        if ((c3217xA.B & 3) == 1) {
            c3217xA.F0(c3217xA.A, c3217xA.a.J(viewS), viewS);
        } else {
            c3217xA.z0(viewS, c3217xA.A);
        }
    }

    public /* synthetic */ C0334By(int i, boolean z) {
        this.l = i;
    }

    public C0334By(InputStream inputStream, C1813in c1813in) {
        this.l = 7;
        K50 k50 = new K50(inputStream, c1813in);
        this.m = k50;
        k50.mark(5242880);
    }

    public C0334By(C2292nj c2292nj) {
        this.l = 1;
        this.m = Collections.unmodifiableMap(new HashMap(c2292nj.a));
    }

    public C0334By(Context context) {
        this.l = 8;
        this.m = new C2994uv(context);
    }

    public C0334By(int i) {
        this.l = i;
        switch (i) {
            case 4:
                JSONObject jSONObject = new JSONObject();
                this.m = jSONObject;
                h(0, "autoplay");
                h(0, "mute");
                h(0, "controls");
                h(1, "enablejsapi");
                h(0, "fs");
                try {
                    jSONObject.put("origin", "https://www.youtube.com");
                    h(0, "rel");
                    h(0, "showinfo");
                    h(3, "iv_load_policy");
                    h(1, "modestbranding");
                    h(0, "cc_load_policy");
                    return;
                } catch (JSONException unused) {
                    throw new RuntimeException("Illegal JSON value origin: https://www.youtube.com");
                }
            case 5:
                this.m = new C2562qX(10);
                return;
            case 18:
                this.m = new NQ(500L);
                return;
            case 25:
                this.m = new C2149m9(2);
                return;
            default:
                this.m = new C0308Ay(5);
                return;
        }
    }

    public C0334By(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.l = 6;
        if (Build.VERSION.SDK_INT >= 25) {
            this.m = new OF(uri, clipDescription, uri2);
        } else {
            this.m = new Na0(uri, clipDescription, uri2, 28);
        }
    }

    private final void u(ZP zp) {
    }

    private final void v(ZP zp) {
    }
}
