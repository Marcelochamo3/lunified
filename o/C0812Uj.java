package o;

import android.graphics.Point;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.metrics.PlaybackMetrics;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import com.skidush.clonex.R;
import com.skidush.clonex.activities.main.MainMobileActivity;
import com.skidush.clonex.fragments.settings.SettingsTvFragment;
import io.sentry.AbstractC0031b1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: renamed from: o.Uj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0812Uj implements RK, QK, InterfaceC0918Yl, InterfaceC2849tU, io.sentry.U0, L20 {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ C0812Uj(Object obj, int i, Object obj2) {
        this.l = i;
        this.m = obj;
        this.n = obj2;
    }

    @Override // o.InterfaceC2849tU
    public boolean a(MenuItem menuItem) {
        Object next;
        Q30 q30;
        int i = 1;
        int i2 = 0;
        int i3 = MainMobileActivity.Q;
        MainMobileActivity mainMobileActivity = (MainMobileActivity) this.m;
        AbstractC1474fG.j(mainMobileActivity, "this$0");
        YT yt = (YT) this.n;
        AbstractC1474fG.j(yt, "$navController");
        AbstractC1474fG.j(menuItem, "item");
        if (menuItem.getItemId() != R.id.more) {
            TT ttH = yt.h();
            if (ttH != null && ttH.s == R.id.events) {
                yt.r();
            }
            return AbstractC0397Ej.C(menuItem, yt);
        }
        YQ yq = mainMobileActivity.N;
        if (yq != null) {
            yq.dismiss();
        }
        String strB = Cr0.m.b();
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
        YQ yq2 = new YQ(mainMobileActivity, q30 == C1816io0.b ? new NM(yt, i2) : null, new NM(yt, i), new NM(yt, 2), new OM(mainMobileActivity, i2), new OM(mainMobileActivity, i));
        yq2.setOnDismissListener(new HM(i2, mainMobileActivity));
        yq2.show();
        mainMobileActivity.N = yq2;
        return false;
    }

    @Override // o.QK
    public void b(Object obj) {
        C2747sP c2747sP = (C2747sP) obj;
        c2747sP.getClass();
        C3201x2 c3201x2 = (C3201x2) this.m;
        if (c3201x2.d == null) {
            return;
        }
        C2069lP c2069lP = (C2069lP) this.n;
        C0643Nw c0643Nw = c2069lP.c;
        c0643Nw.getClass();
        CP cp = c3201x2.d;
        cp.getClass();
        C2613qy c2613qy = new C2613qy(c0643Nw, c2069lP.d, c2747sP.b.d(c3201x2.b, cp), 7);
        int i = c2069lP.b;
        if (i != 0) {
            if (i == 1) {
                c2747sP.p = c2613qy;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                c2747sP.q = c2613qy;
                return;
            }
        }
        c2747sP.f1025o = c2613qy;
    }

    @Override // io.sentry.U0
    public void c(io.sentry.Q q) {
        String str = (String) this.m;
        AbstractC1474fG.j(str, "$extractor");
        String str2 = (String) this.n;
        AbstractC1474fG.j(str2, "$failure");
        AbstractC1474fG.j(q, "scope");
        q.d("diagnostic.area", "tvprovider_extractor");
        q.d("diagnostic.extractor", str);
        q.d("diagnostic.failure", str2);
        AbstractC0031b1.b("TvProvider dedicated extractor failure");
    }

    /* JADX WARN: Code duplicated, block: B:237:0x0440  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.Object, o.Nw] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    @Override // o.RK
    public void d(Object obj, C3188wv c3188wv) {
        int i;
        boolean z;
        C2650rP c2650rP;
        int i2;
        int i3;
        C0643Nw c0643Nw;
        int i4;
        int i5;
        C0643Nw c0643Nw2;
        C3271xo c3271xo;
        int i6;
        int i7 = 1;
        C0942Zj c0942Zj = (C0942Zj) this.m;
        InterfaceC2370oZ interfaceC2370oZ = (InterfaceC2370oZ) this.n;
        C2747sP c2747sP = (C2747sP) obj;
        SparseArray sparseArray = c0942Zj.p;
        SparseArray sparseArray2 = new SparseArray(c3188wv.a.size());
        for (int i8 = 0; i8 < c3188wv.a.size(); i8++) {
            int iA = c3188wv.a(i8);
            C3201x2 c3201x2 = (C3201x2) sparseArray.get(iA);
            c3201x2.getClass();
            sparseArray2.append(iA, c3201x2);
        }
        c2747sP.getClass();
        if (c3188wv.a.size() == 0) {
            return;
        }
        for (int i9 = 0; i9 < c3188wv.a.size(); i9++) {
            int iA2 = c3188wv.a(i9);
            C3201x2 c3201x3 = (C3201x2) sparseArray2.get(iA2);
            c3201x3.getClass();
            if (iA2 == 0) {
                C3071vl c3071vl = c2747sP.b;
                synchronized (c3071vl) {
                    try {
                        c3071vl.d.getClass();
                        Fj0 fj0 = c3071vl.e;
                        c3071vl.e = c3201x3.b;
                        Iterator it = c3071vl.c.values().iterator();
                        while (it.hasNext()) {
                            C2974ul c2974ul = (C2974ul) it.next();
                            if (!c2974ul.b(fj0, c3071vl.e) || c2974ul.a(c3201x3)) {
                                it.remove();
                                if (c2974ul.e) {
                                    if (c2974ul.a.equals(c3071vl.f)) {
                                        c3071vl.a(c2974ul);
                                    }
                                    c3071vl.d.d(c3201x3, c2974ul.a);
                                }
                            }
                        }
                        c3071vl.e(c3201x3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (iA2 == 11) {
                c2747sP.b.g(c3201x3, c2747sP.k);
            } else {
                c2747sP.b.f(c3201x3);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c3188wv.a.get(0)) {
            C3201x2 c3201x4 = (C3201x2) sparseArray2.get(0);
            c3201x4.getClass();
            if (c2747sP.j != null) {
                c2747sP.c(c3201x4.b, c3201x4.d);
            }
        }
        if (c3188wv.a.get(2) && c2747sP.j != null) {
            XE xeListIterator = ((C1042as) interfaceC2370oZ).F().l.listIterator(0);
            loop3: while (true) {
                if (!xeListIterator.hasNext()) {
                    c3271xo = null;
                    break;
                }
                C2007km0 c2007km0 = (C2007km0) xeListIterator.next();
                for (int i10 = 0; i10 < c2007km0.l; i10++) {
                    if (c2007km0.p[i10] && (c3271xo = c2007km0.m.f665o[i10].z) != null) {
                        break loop3;
                    }
                }
            }
            if (c3271xo != null) {
                PlaybackMetrics.Builder builder = c2747sP.j;
                int i11 = Lr0.a;
                PlaybackMetrics.Builder builderH = AbstractC1954k9.h(builder);
                int i12 = 0;
                while (true) {
                    if (i12 >= c3271xo.f1124o) {
                        i6 = 1;
                        break;
                    }
                    UUID uuid = c3271xo.l[i12].m;
                    if (uuid.equals(AbstractC2661ra.d)) {
                        i6 = 3;
                        break;
                    } else if (uuid.equals(AbstractC2661ra.e)) {
                        i6 = 2;
                        break;
                    } else {
                        if (uuid.equals(AbstractC2661ra.c)) {
                            i6 = 6;
                            break;
                        }
                        i12++;
                    }
                }
                builderH.setDrmType(i6);
            }
        }
        if (c3188wv.a.get(1011)) {
            c2747sP.z++;
        }
        AbstractC1200cZ abstractC1200cZ = c2747sP.n;
        if (abstractC1200cZ != null) {
            boolean z2 = c2747sP.v == 4;
            int i13 = abstractC1200cZ.l;
            if (i13 == 1001) {
                c2650rP = new C2650rP(20, 0);
            } else {
                if (abstractC1200cZ instanceof Lr) {
                    Lr lr = (Lr) abstractC1200cZ;
                    z = lr.n == 1;
                    i = lr.r;
                } else {
                    i = 0;
                    z = false;
                }
                Throwable cause = abstractC1200cZ.getCause();
                cause.getClass();
                if (!(cause instanceof IOException)) {
                    int i14 = 24;
                    if (z && (i == 0 || i == 1)) {
                        c2650rP = new C2650rP(35, 0);
                    } else if (z && i == 3) {
                        c2650rP = new C2650rP(15, 0);
                    } else if (z && i == 2) {
                        c2650rP = new C2650rP(23, 0);
                    } else if (cause instanceof GO) {
                        c2650rP = new C2650rP(13, Lr0.u(((GO) cause).f276o));
                    } else if (cause instanceof BO) {
                        c2650rP = new C2650rP(14, Lr0.u(((BO) cause).l));
                    } else if (cause instanceof OutOfMemoryError) {
                        c2650rP = new C2650rP(14, 0);
                    } else if (cause instanceof C1560g7) {
                        c2650rP = new C2650rP(17, ((C1560g7) cause).l);
                    } else if (cause instanceof C1756i7) {
                        c2650rP = new C2650rP(18, ((C1756i7) cause).l);
                    } else if (Lr0.a < 16 || !(cause instanceof MediaCodec.CryptoException)) {
                        c2650rP = new C2650rP(22, 0);
                    } else {
                        int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                        switch (Lr0.t(errorCode)) {
                            case 6002:
                                break;
                            case 6003:
                                i14 = 28;
                                break;
                            case 6004:
                                i14 = 25;
                                break;
                            case 6005:
                                i14 = 26;
                                break;
                            default:
                                i14 = 27;
                                break;
                        }
                        c2650rP = new C2650rP(i14, errorCode);
                    }
                } else if (cause instanceof C1472fE) {
                    c2650rP = new C2650rP(5, ((C1472fE) cause).f770o);
                } else if ((cause instanceof C1374eE) || (cause instanceof C2949uX)) {
                    c2650rP = new C2650rP(z2 ? 10 : 11, 0);
                } else {
                    boolean z3 = cause instanceof C1277dE;
                    if (z3 || (cause instanceof C2210mq0)) {
                        if (QU.c(c2747sP.a).d() == 1) {
                            c2650rP = new C2650rP(3, 0);
                        } else {
                            Throwable cause2 = cause.getCause();
                            if (cause2 instanceof UnknownHostException) {
                                c2650rP = new C2650rP(6, 0);
                            } else if (cause2 instanceof SocketTimeoutException) {
                                c2650rP = new C2650rP(7, 0);
                            } else {
                                c2650rP = (z3 && ((C1277dE) cause).n == 1) ? new C2650rP(4, 0) : new C2650rP(8, 0);
                            }
                        }
                    } else if (i13 == 1002) {
                        c2650rP = new C2650rP(21, 0);
                    } else if (cause instanceof C3368yo) {
                        Throwable cause3 = cause.getCause();
                        cause3.getClass();
                        int i15 = Lr0.a;
                        if (i15 >= 21 && (cause3 instanceof MediaDrm.MediaDrmStateException)) {
                            int iU = Lr0.u(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                            switch (Lr0.t(iU)) {
                                case 6002:
                                    i2 = 24;
                                    break;
                                case 6003:
                                    i2 = 28;
                                    break;
                                case 6004:
                                    i2 = 25;
                                    break;
                                case 6005:
                                    i2 = 26;
                                    break;
                                default:
                                    i2 = 27;
                                    break;
                            }
                            c2650rP = new C2650rP(i2, iU);
                        } else if (i15 >= 23 && AbstractC2554qP.t(cause3)) {
                            c2650rP = new C2650rP(27, 0);
                        } else if (i15 >= 18 && (cause3 instanceof NotProvisionedException)) {
                            c2650rP = new C2650rP(24, 0);
                        } else if (i15 >= 18 && (cause3 instanceof DeniedByServerException)) {
                            c2650rP = new C2650rP(29, 0);
                        } else if (cause3 instanceof Lq0) {
                            c2650rP = new C2650rP(23, 0);
                        } else {
                            c2650rP = cause3 instanceof C0346Ck ? new C2650rP(28, 0) : new C2650rP(30, 0);
                        }
                    } else if ((cause instanceof C0564Ku) && (cause.getCause() instanceof FileNotFoundException)) {
                        Throwable cause4 = cause.getCause();
                        cause4.getClass();
                        Throwable cause5 = cause4.getCause();
                        c2650rP = (Lr0.a >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new C2650rP(32, 0) : new C2650rP(31, 0);
                    } else {
                        c2650rP = new C2650rP(9, 0);
                    }
                }
                c2747sP.c.reportPlaybackErrorEvent(AbstractC2360oP.d().setTimeSinceCreatedMillis(jElapsedRealtime - c2747sP.d).setErrorCode(c2650rP.a).setSubErrorCode(c2650rP.b).setException(abstractC1200cZ).build());
                i7 = 1;
                c2747sP.A = true;
                c2747sP.n = null;
            }
            c2747sP.c.reportPlaybackErrorEvent(AbstractC2360oP.d().setTimeSinceCreatedMillis(jElapsedRealtime - c2747sP.d).setErrorCode(c2650rP.a).setSubErrorCode(c2650rP.b).setException(abstractC1200cZ).build());
            i7 = 1;
            c2747sP.A = true;
            c2747sP.n = null;
        }
        if (c3188wv.a.get(2)) {
            C2105lm0 c2105lm0F = ((C1042as) interfaceC2370oZ).F();
            boolean zA = c2105lm0F.a(2);
            boolean zA2 = c2105lm0F.a(i7);
            boolean zA3 = c2105lm0F.a(3);
            if (zA || zA2 || zA3) {
                if (zA) {
                    i3 = 2;
                    c0643Nw2 = null;
                } else if (Lr0.a(c2747sP.r, null)) {
                    c0643Nw2 = null;
                    i3 = 2;
                } else {
                    int i16 = c2747sP.r == null ? 1 : 0;
                    c2747sP.r = null;
                    c0643Nw2 = null;
                    i3 = 2;
                    c2747sP.e(1, jElapsedRealtime, null, i16);
                }
                if (zA2) {
                    c0643Nw = c0643Nw2;
                } else {
                    C0643Nw c0643Nw3 = c0643Nw2;
                    if (Lr0.a(c2747sP.s, c0643Nw3)) {
                        c0643Nw = c0643Nw3;
                    } else {
                        int i17 = c2747sP.s == null ? 1 : 0;
                        c2747sP.s = c0643Nw3;
                        c0643Nw = c0643Nw3;
                        c2747sP.e(0, jElapsedRealtime, c0643Nw3, i17);
                    }
                }
                if (!zA3 && !Lr0.a(c2747sP.t, c0643Nw)) {
                    int i18 = c2747sP.t == null ? 1 : 0;
                    c2747sP.t = c0643Nw;
                    c2747sP.e(2, jElapsedRealtime, c0643Nw, i18);
                }
            } else {
                i3 = 2;
                c0643Nw = 0;
            }
        } else {
            i3 = 2;
            c0643Nw = 0;
        }
        if (c2747sP.a(c2747sP.f1025o)) {
            C2613qy c2613qy = c2747sP.f1025o;
            C0643Nw c0643Nw4 = (C0643Nw) c2613qy.n;
            if (c0643Nw4.C != -1) {
                int i19 = c2613qy.m;
                if (!Lr0.a(c2747sP.r, c0643Nw4)) {
                    int i20 = (c2747sP.r == null && i19 == 0) ? 1 : i19;
                    c2747sP.r = c0643Nw4;
                    c2747sP.e(1, jElapsedRealtime, c0643Nw4, i20);
                }
                c2747sP.f1025o = c0643Nw;
            }
        }
        if (c2747sP.a(c2747sP.p)) {
            C2613qy c2613qy2 = c2747sP.p;
            C0643Nw c0643Nw5 = (C0643Nw) c2613qy2.n;
            int i21 = c2613qy2.m;
            if (!Lr0.a(c2747sP.s, c0643Nw5)) {
                int i22 = (c2747sP.s == null && i21 == 0) ? 1 : i21;
                c2747sP.s = c0643Nw5;
                c2747sP.e(0, jElapsedRealtime, c0643Nw5, i22);
            }
            c2747sP.p = c0643Nw;
        }
        if (c2747sP.a(c2747sP.q)) {
            C2613qy c2613qy3 = c2747sP.q;
            C0643Nw c0643Nw6 = (C0643Nw) c2613qy3.n;
            int i23 = c2613qy3.m;
            if (!Lr0.a(c2747sP.t, c0643Nw6)) {
                int i24 = (c2747sP.t == null && i23 == 0) ? 1 : i23;
                c2747sP.t = c0643Nw6;
                c2747sP.e(2, jElapsedRealtime, c0643Nw6, i24);
            }
            c2747sP.q = c0643Nw;
        }
        switch (QU.c(c2747sP.a).d()) {
            case 0:
                i4 = 0;
                break;
            case 1:
                i4 = 9;
                break;
            case 2:
                i4 = 2;
                break;
            case 3:
                i4 = 4;
                break;
            case 4:
                i4 = 5;
                break;
            case 5:
                i4 = 6;
                break;
            case 6:
            case 8:
            default:
                i4 = 1;
                break;
            case 7:
                i4 = 3;
                break;
            case 9:
                i4 = 8;
                break;
            case 10:
                i4 = 7;
                break;
        }
        if (i4 != c2747sP.m) {
            c2747sP.m = i4;
            c2747sP.c.reportNetworkEvent(AbstractC2457pP.c().setNetworkType(i4).setTimeSinceCreatedMillis(jElapsedRealtime - c2747sP.d).build());
        }
        C1042as c1042as = (C1042as) interfaceC2370oZ;
        if (c1042as.J() != i3) {
            c2747sP.u = false;
        }
        c1042as.i0();
        if (c1042as.j0.f == null) {
            c2747sP.w = false;
        } else if (c3188wv.a.get(10)) {
            c2747sP.w = true;
        }
        int iJ = c1042as.J();
        if (c2747sP.u) {
            i5 = 5;
        } else if (c2747sP.w) {
            i5 = 13;
        } else if (iJ == 4) {
            i5 = 11;
        } else if (iJ == i3) {
            int i25 = c2747sP.l;
            if (i25 == 0 || i25 == i3) {
                i5 = 2;
            } else if (c1042as.I()) {
                c1042as.i0();
                i5 = c1042as.j0.m != 0 ? 10 : 6;
            } else {
                i5 = 7;
            }
        } else if (iJ != 3) {
            i5 = (iJ != 1 || c2747sP.l == 0) ? c2747sP.l : 12;
        } else if (c1042as.I()) {
            c1042as.i0();
            i5 = c1042as.j0.m != 0 ? 9 : 3;
        } else {
            i5 = 4;
        }
        if (c2747sP.l != i5) {
            c2747sP.l = i5;
            c2747sP.A = true;
            c2747sP.c.reportPlaybackStateEvent(AbstractC1954k9.i().setState(c2747sP.l).setTimeSinceCreatedMillis(jElapsedRealtime - c2747sP.d).build());
        }
        if (c3188wv.a.get(1028)) {
            C3071vl c3071vl2 = c2747sP.b;
            C3201x2 c3201x5 = (C3201x2) sparseArray2.get(1028);
            c3201x5.getClass();
            c3071vl2.b(c3201x5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0096  */
    @Override // o.InterfaceC0918Yl
    public M60 e(int i, Zl0 zl0, int[] iArr) {
        int i2;
        int i3;
        Object[] objArrCopyOf;
        int i4;
        int i5;
        int i6;
        int i7;
        Object[] objArrCopyOf2;
        Object obj = this.n;
        Object obj2 = this.m;
        int i8 = 4;
        switch (this.l) {
            case 2:
                int i9 = ((int[]) obj)[i];
                C0814Ul c0814Ul = (C0814Ul) obj2;
                int i10 = c0814Ul.t;
                if (i10 == Integer.MAX_VALUE || (i4 = c0814Ul.u) == Integer.MAX_VALUE) {
                    i8 = 4;
                    i2 = Integer.MAX_VALUE;
                } else {
                    int i11 = 0;
                    int i12 = Integer.MAX_VALUE;
                    while (i11 < zl0.l) {
                        C0643Nw c0643Nw = zl0.f665o[i11];
                        int i13 = c0643Nw.B;
                        if (i13 > 0 && (i5 = c0643Nw.C) > 0) {
                            if (c0814Ul.v) {
                                if ((i13 > i5) != (i10 > i4)) {
                                    i7 = i10;
                                    i6 = i4;
                                } else {
                                    i6 = i10;
                                    i7 = i4;
                                }
                            } else {
                                i6 = i10;
                                i7 = i4;
                            }
                            int i14 = i13 * i7;
                            int i15 = i5 * i6;
                            Point point = i14 >= i15 ? new Point(i6, Lr0.g(i15, i13)) : new Point(Lr0.g(i14, i5), i7);
                            int i16 = c0643Nw.B;
                            int i17 = i16 * i5;
                            if (i16 >= ((int) (point.x * 0.98f)) && i5 >= ((int) (point.y * 0.98f)) && i17 < i12) {
                                i12 = i17;
                            }
                        }
                        i11++;
                        i8 = 4;
                    }
                    i2 = i12;
                }
                U9.d(i8, "initialCapacity");
                Object[] objArr = new Object[i8];
                int i18 = 0;
                int i19 = 0;
                boolean z = false;
                while (i18 < zl0.l) {
                    int iB = zl0.f665o[i18].b();
                    C1030am c1030am = new C1030am(i, zl0, i18, c0814Ul, iArr[i18], i9, i2 == Integer.MAX_VALUE || (iB != -1 && iB <= i2));
                    int i20 = i19 + 1;
                    if (objArr.length < i20) {
                        objArrCopyOf = Arrays.copyOf(objArr, TE.e(objArr.length, i20));
                    } else {
                        if (z) {
                            objArrCopyOf = (Object[]) objArr.clone();
                        } else {
                            i3 = 1;
                        }
                        objArr[i19] = c1030am;
                        i18 += i3;
                        i19++;
                    }
                    objArr = objArrCopyOf;
                    i3 = 1;
                    z = false;
                    objArr[i19] = c1030am;
                    i18 += i3;
                    i19++;
                }
                return AbstractC0985aF.j(i19, objArr);
            default:
                XE xe = AbstractC0985aF.m;
                U9.d(4, "initialCapacity");
                Object[] objArr2 = new Object[4];
                int i21 = 0;
                int i22 = 0;
                boolean z2 = false;
                while (i21 < zl0.l) {
                    C0892Xl c0892Xl = new C0892Xl(i, zl0, i21, (C0814Ul) obj2, iArr[i21], (String) obj);
                    int i23 = i22 + 1;
                    if (objArr2.length < i23) {
                        objArrCopyOf2 = Arrays.copyOf(objArr2, TE.e(objArr2.length, i23));
                    } else {
                        if (z2) {
                            objArrCopyOf2 = (Object[]) objArr2.clone();
                        }
                        objArr2[i22] = c0892Xl;
                        i21++;
                        i22++;
                    }
                    objArr2 = objArrCopyOf2;
                    z2 = false;
                    objArr2[i22] = c0892Xl;
                    i21++;
                    i22++;
                }
                return AbstractC0985aF.j(i22, objArr2);
        }
    }

    @Override // o.L20
    public boolean f(Preference preference, Serializable serializable) {
        switch (this.l) {
            case 6:
                SwitchPreference switchPreference = (SwitchPreference) this.m;
                AbstractC1474fG.j(switchPreference, "$this_apply");
                Wc0 wc0 = (Wc0) this.n;
                AbstractC1474fG.j(wc0, "this$0");
                AbstractC1474fG.j(preference, "<anonymous parameter 0>");
                AbstractC1474fG.h(serializable, "null cannot be cast to non-null type kotlin.Boolean");
                Boolean bool = (Boolean) serializable;
                boolean zBooleanValue = bool.booleanValue();
                Cr0.x.d(bool);
                switchPreference.A(zBooleanValue);
                switchPreference.v(wc0.n(zBooleanValue ? R.string.settings_force_extra_buffer_enabled : R.string.settings_force_extra_buffer_disabled));
                break;
            default:
                SwitchPreference switchPreference2 = (SwitchPreference) this.m;
                AbstractC1474fG.j(switchPreference2, "$this_apply");
                SettingsTvFragment settingsTvFragment = (SettingsTvFragment) this.n;
                AbstractC1474fG.j(settingsTvFragment, "this$0");
                AbstractC1474fG.j(preference, "<anonymous parameter 0>");
                AbstractC1474fG.h(serializable, "null cannot be cast to non-null type kotlin.Boolean");
                Boolean bool2 = (Boolean) serializable;
                boolean zBooleanValue2 = bool2.booleanValue();
                Cr0.x.d(bool2);
                switchPreference2.A(zBooleanValue2);
                switchPreference2.v(settingsTvFragment.n(zBooleanValue2 ? R.string.settings_force_extra_buffer_enabled : R.string.settings_force_extra_buffer_disabled));
                break;
        }
        return true;
    }
}
