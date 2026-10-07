package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class Lp0 {
    public static final AbstractC1468fA a;
    public static final C2841tM b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new Qp0();
        } else if (i >= 28) {
            a = new Pp0();
        } else if (i >= 26) {
            a = new Op0();
        } else if (i < 24 || Np0.X == null) {
            a = new Mp0();
        } else {
            a = new Np0();
        }
        b = new C2841tM(16);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    public static Typeface a(Context context, InterfaceC0384Dw interfaceC0384Dw, Resources resources, int i, String str, int i2, int i3, AP ap, boolean z) {
        Typeface typefaceG;
        Typeface typefaceCreate;
        Typeface typeface;
        int i4 = 4;
        int i5 = 1;
        int i6 = 15;
        boolean z2 = false;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        int i7 = -3;
        if (interfaceC0384Dw instanceof C0462Gw) {
            C0462Gw c0462Gw = (C0462Gw) interfaceC0384Dw;
            String str2 = c0462Gw.d;
            typefaceG = null;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (ap != null) {
                    new Handler(Looper.getMainLooper()).post(new O3(ap, i6, typefaceCreate));
                }
                return typefaceCreate;
            }
            boolean z3 = !z ? ap != null : c0462Gw.c != 0;
            int i8 = z ? c0462Gw.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            L80 l80 = new L80();
            l80.l = ap;
            C0560Kq c0560Kq = c0462Gw.a;
            C2720s4 c2720s4 = new C2720s4(l80, 12, handler);
            if (z3) {
                C2841tM c2841tM = AbstractC0332Bw.a;
                String str3 = ((String) c0560Kq.q) + "-" + i3;
                typeface = (Typeface) AbstractC0332Bw.a.f(str3);
                if (typeface != null) {
                    handler.post(new RunnableC1938k1(l80, typeface, i4, z2));
                    typefaceG = typeface;
                } else if (i8 == -1) {
                    C0306Aw c0306AwA = AbstractC0332Bw.a(str3, context, c0560Kq, i3);
                    c2720s4.f0(c0306AwA);
                    typefaceG = c0306AwA.a;
                } else {
                    try {
                        try {
                            try {
                                C0306Aw c0306Aw = (C0306Aw) AbstractC0332Bw.b.submit(new CallableC3384yw(str3, context, c0560Kq, i3, 0)).get(i8, TimeUnit.MILLISECONDS);
                                c2720s4.f0(c0306Aw);
                                typefaceG = c0306Aw.a;
                            } catch (ExecutionException e) {
                                throw new RuntimeException(e);
                            } catch (TimeoutException unused) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException e2) {
                            throw e2;
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) c2720s4.n).post(new RunnableC0907Ya(i7, b4 == true ? 1 : 0, (L80) c2720s4.m));
                    }
                }
            } else {
                C2841tM c2841tM2 = AbstractC0332Bw.a;
                String str4 = ((String) c0560Kq.q) + "-" + i3;
                typeface = (Typeface) AbstractC0332Bw.a.f(str4);
                if (typeface != null) {
                    handler.post(new RunnableC1938k1(l80, typeface, i4, b3 == true ? 1 : 0));
                    typefaceG = typeface;
                } else {
                    C3481zw c3481zw = new C3481zw(b2 == true ? 1 : 0, c2720s4);
                    synchronized (AbstractC0332Bw.c) {
                        try {
                            Nd0 nd0 = AbstractC0332Bw.d;
                            ArrayList arrayList = (ArrayList) nd0.get(str4);
                            if (arrayList != null) {
                                arrayList.add(c3481zw);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(c3481zw);
                                nd0.put(str4, arrayList2);
                                CallableC3384yw callableC3384yw = new CallableC3384yw(str4, context, c0560Kq, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = AbstractC0332Bw.b;
                                C3481zw c3481zw2 = new C3481zw(i5, str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                RunnableC3018v70 runnableC3018v70 = new RunnableC3018v70();
                                runnableC3018v70.m = callableC3384yw;
                                runnableC3018v70.n = c3481zw2;
                                runnableC3018v70.f1070o = handler2;
                                threadPoolExecutor.execute(runnableC3018v70);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        } else {
            typefaceG = a.g(context, (C0410Ew) interfaceC0384Dw, resources, i3);
            if (ap != null) {
                if (typefaceG != null) {
                    new Handler(Looper.getMainLooper()).post(new O3(ap, i6, typefaceG));
                } else {
                    ap.b(-3);
                }
            }
        }
        if (typefaceG != null) {
            b.k(b(resources, i, str, i2, i3), typefaceG);
        }
        return typefaceG;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
