package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Surface;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class RN implements CJ, InterfaceC1497fb0, InterfaceC3328yO, InterfaceC2967uh0 {
    public static RN p;
    public final /* synthetic */ int l;
    public Object m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f488o;

    public /* synthetic */ RN(Object obj, int i, Object obj2) {
        this.l = i;
        this.m = obj;
        this.n = obj2;
    }

    public static RN y(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new RN(context, 9, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static C0660On z(String str, String str2) {
        C1081bD c1081bD = new C1081bD();
        return c1081bD.f(new StringReader(str), str2, new RN(c1081bD));
    }

    public void A() {
        ((TypedArray) this.n).recycle();
    }

    @Override // o.InterfaceC2967uh0
    public int G() {
        return ((long[]) this.f488o).length;
    }

    @Override // o.InterfaceC3328yO
    public void a() {
        this.n = null;
        this.f488o = null;
        ((MediaCodec) this.m).release();
    }

    @Override // o.InterfaceC1497fb0
    public void b(C2562qX c2562qX) {
        long jC;
        AbstractC0397Ej.g((Oj0) this.n);
        int i = Lr0.a;
        Oj0 oj0 = (Oj0) this.n;
        synchronized (oj0) {
            try {
                long j = oj0.c;
                jC = j != -9223372036854775807L ? j + oj0.b : oj0.c();
            } catch (Throwable th) {
                throw th;
            }
        }
        long jD = ((Oj0) this.n).d();
        if (jC == -9223372036854775807L || jD == -9223372036854775807L) {
            return;
        }
        C0643Nw c0643Nw = (C0643Nw) this.m;
        if (jD != c0643Nw.A) {
            C0617Mw c0617MwA = c0643Nw.a();
            c0617MwA.f405o = jD;
            C0643Nw c0643Nw2 = new C0643Nw(c0617MwA);
            this.m = c0643Nw2;
            ((InterfaceC1324dm0) this.f488o).a(c0643Nw2);
        }
        int iA = c2562qX.a();
        ((InterfaceC1324dm0) this.f488o).e(iA, c2562qX);
        ((InterfaceC1324dm0) this.f488o).d(jC, 1, iA, 0, null);
    }

    @Override // o.InterfaceC1497fb0
    public void c(Oj0 oj0, InterfaceC0354Cs interfaceC0354Cs, Ym0 ym0) {
        this.n = oj0;
        ym0.a();
        ym0.b();
        InterfaceC1324dm0 interfaceC1324dm0S = interfaceC0354Cs.s(ym0.d, 5);
        this.f488o = interfaceC1324dm0S;
        interfaceC1324dm0S.a((C0643Nw) this.m);
    }

    @Override // o.InterfaceC3328yO
    public int d(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = (MediaCodec) this.m;
            iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && Lr0.a < 21) {
                this.f488o = mediaCodec.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // o.InterfaceC2967uh0
    public int e(long j) {
        long[] jArr = (long[]) this.f488o;
        int iB = Lr0.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    @Override // o.InterfaceC3328yO
    public void f(int i, boolean z) {
        ((MediaCodec) this.m).releaseOutputBuffer(i, z);
    }

    @Override // o.InterfaceC3328yO
    public void flush() {
        ((MediaCodec) this.m).flush();
    }

    @Override // o.InterfaceC3328yO
    public void g(int i) {
        ((MediaCodec) this.m).setVideoScalingMode(i);
    }

    @Override // o.CJ
    public Object getValue() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        AT at = (AT) this.f488o;
        if (at != null) {
            return at;
        }
        Bundle bundle = (Bundle) ((InterfaceC0360Cy) this.n).c();
        S5 s5 = BT.b;
        InterfaceC1476fI interfaceC1476fI = (InterfaceC1476fI) this.m;
        Method method = (Method) s5.get(interfaceC1476fI);
        if (method == null) {
            method = AbstractC0397Ej.s(interfaceC1476fI).getMethod("fromBundle", (Class[]) Arrays.copyOf(BT.a, 1));
            s5.put(interfaceC1476fI, method);
            AbstractC1474fG.i(method, "navArgsClass.java.getMet…                        }");
        }
        Object objInvoke = method.invoke(null, bundle);
        AbstractC1474fG.h(objInvoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        AT at2 = (AT) objInvoke;
        this.f488o = at2;
        return at2;
    }

    @Override // o.InterfaceC2967uh0
    public long h(int i) {
        AbstractC0397Ej.c(i >= 0);
        long[] jArr = (long[]) this.f488o;
        AbstractC0397Ej.c(i < jArr.length);
        return jArr[i];
    }

    @Override // o.InterfaceC3328yO
    public MediaFormat i() {
        return ((MediaCodec) this.m).getOutputFormat();
    }

    @Override // o.InterfaceC3328yO
    public void j(int i, C2968ui c2968ui, long j) {
        ((MediaCodec) this.m).queueSecureInputBuffer(i, 0, c2968ui.i, j, 0);
    }

    @Override // o.InterfaceC3328yO
    public ByteBuffer k(int i) {
        return Lr0.a >= 21 ? ((MediaCodec) this.m).getInputBuffer(i) : ((ByteBuffer[]) this.n)[i];
    }

    @Override // o.InterfaceC3328yO
    public void l(Surface surface) {
        ((MediaCodec) this.m).setOutputSurface(surface);
    }

    @Override // o.InterfaceC3328yO
    public void m(Bundle bundle) {
        ((MediaCodec) this.m).setParameters(bundle);
    }

    @Override // o.InterfaceC3328yO
    public ByteBuffer n(int i) {
        return Lr0.a >= 21 ? ((MediaCodec) this.m).getOutputBuffer(i) : ((ByteBuffer[]) this.f488o)[i];
    }

    @Override // o.InterfaceC3328yO
    public void o(int i, long j) {
        ((MediaCodec) this.m).releaseOutputBuffer(i, j);
    }

    @Override // o.InterfaceC3328yO
    public int p() {
        return ((MediaCodec) this.m).dequeueInputBuffer(0L);
    }

    @Override // o.InterfaceC3328yO
    public void q(RO ro, Handler handler) {
        ((MediaCodec) this.m).setOnFrameRenderedListener(new C2240n6(this, ro, 1), handler);
    }

    @Override // o.InterfaceC3328yO
    public void r(int i, int i2, long j, int i3) {
        ((MediaCodec) this.m).queueInputBuffer(i, 0, i2, j, i3);
    }

    public ColorStateList s(int i) {
        int resourceId;
        ColorStateList colorStateListV;
        TypedArray typedArray = (TypedArray) this.n;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListV = AbstractC1459f50.v((Context) this.m, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListV;
    }

    @Override // o.InterfaceC2967uh0
    public List t(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = (List) this.m;
            if (i >= list.size()) {
                break;
            }
            int i2 = i * 2;
            long[] jArr = (long[]) this.n;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                Wv0 wv0 = (Wv0) list.get(i);
                C3162wi c3162wi = wv0.a;
                if (c3162wi.p == -3.4028235E38f) {
                    arrayList2.add(wv0);
                } else {
                    arrayList.add(c3162wi);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new C2147m8(19));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            C3065vi c3065viA = ((Wv0) arrayList2.get(i3)).a.a();
            c3065viA.e = (-1) - i3;
            c3065viA.f = 1;
            arrayList.add(c3065viA.a());
        }
        return arrayList;
    }

    public String toString() {
        switch (this.l) {
            case 5:
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.m;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                String str = (String) this.n;
                if (str != null) {
                    sb.append(" action=");
                    sb.append(str);
                }
                String str2 = (String) this.f488o;
                if (str2 != null) {
                    sb.append(" mimetype=");
                    sb.append(str2);
                }
                sb.append(" }");
                String string = sb.toString();
                AbstractC1474fG.i(string, "sb.toString()");
                return string;
            default:
                return super.toString();
        }
    }

    public Drawable u(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.n;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : Ou0.l((Context) this.m, resourceId);
    }

    public Drawable v(int i) {
        int resourceId;
        Drawable drawableG;
        if (!((TypedArray) this.n).hasValue(i) || (resourceId = ((TypedArray) this.n).getResourceId(i, 0)) == 0) {
            return null;
        }
        C1846j4 c1846j4A = C1846j4.a();
        Context context = (Context) this.m;
        synchronized (c1846j4A) {
            drawableG = c1846j4A.a.g(context, resourceId, true);
        }
        return drawableG;
    }

    public Typeface w(int i, int i2, K4 k4) {
        int resourceId = ((TypedArray) this.n).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f488o) == null) {
            this.f488o = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f488o;
        ThreadLocal threadLocal = AbstractC1465f80.a;
        Context context = (Context) this.m;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC1465f80.c(context, resourceId, typedValue, i2, k4, true, false);
    }

    public Ut0 x(InterfaceC1476fI interfaceC1476fI, String str) {
        Ut0 ut0A;
        AbstractC1474fG.j(str, "key");
        Zt0 zt0 = (Zt0) this.m;
        zt0.getClass();
        LinkedHashMap linkedHashMap = zt0.a;
        Ut0 ut0 = (Ut0) linkedHashMap.get(str);
        boolean zC = ((C2766se) interfaceC1476fI).c(ut0);
        Yt0 yt0 = (Yt0) this.n;
        if (zC) {
            if (yt0 instanceof L90) {
                AbstractC1474fG.g(ut0);
                ((L90) yt0).e(ut0);
            }
            AbstractC1474fG.h(ut0, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return ut0;
        }
        SS ss = new SS((AbstractC2484pi) this.f488o);
        ss.a.put(O9.G, str);
        AbstractC1474fG.j(yt0, "factory");
        try {
            try {
                ut0A = yt0.c(interfaceC1476fI, ss);
            } catch (AbstractMethodError unused) {
                ut0A = yt0.a(AbstractC0397Ej.s(interfaceC1476fI));
            }
        } catch (AbstractMethodError unused2) {
            ut0A = yt0.b(AbstractC0397Ej.s(interfaceC1476fI), ss);
        }
        AbstractC1474fG.j(ut0A, "viewModel");
        Ut0 ut1 = (Ut0) linkedHashMap.put(str, ut0A);
        if (ut1 != null) {
            ut1.b();
        }
        return ut0A;
    }

    public RN(Nm0 nm0) {
        this.l = 6;
        this.m = nm0;
        this.f488o = nm0.d();
        this.n = new C2755sX();
    }

    public RN(Zt0 zt0, Yt0 yt0, AbstractC2484pi abstractC2484pi) {
        this.l = 12;
        AbstractC1474fG.j(zt0, "store");
        AbstractC1474fG.j(abstractC2484pi, "extras");
        this.m = zt0;
        this.n = yt0;
        this.f488o = abstractC2484pi;
    }

    public RN(ArrayList arrayList) {
        this.l = 13;
        this.m = Collections.unmodifiableList(new ArrayList(arrayList));
        this.n = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            Wv0 wv0 = (Wv0) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = (long[]) this.n;
            jArr[i2] = wv0.b;
            jArr[i2 + 1] = wv0.c;
        }
        long[] jArr2 = (long[]) this.n;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f488o = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public RN(String str) {
        this.l = 7;
        C0617Mw c0617Mw = new C0617Mw();
        c0617Mw.k = str;
        this.m = new C0643Nw(c0617Mw);
    }

    public RN(Intent intent) {
        this.l = 5;
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.m = data;
        this.n = action;
        this.f488o = type;
    }

    public RN(BottomSheetBehavior bottomSheetBehavior, FrameLayout frameLayout) {
        Object on;
        this.l = 0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            on = new QN();
        } else {
            on = i >= 33 ? new ON() : null;
        }
        this.m = on;
        this.n = bottomSheetBehavior;
        this.f488o = frameLayout;
    }

    public RN(Runnable runnable) {
        this.l = 2;
        this.n = new CopyOnWriteArrayList();
        this.f488o = new HashMap();
        this.m = runnable;
    }

    public RN(Context context, LocationManager locationManager) {
        this.l = 11;
        this.f488o = new C2305np0();
        this.m = context;
        this.n = locationManager;
    }

    public RN(int i, String str, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.l = 10;
        this.m = str;
        if (arrayList == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.n = listUnmodifiableList;
        this.f488o = bArr;
    }

    public RN(MediaCodec mediaCodec) {
        this.l = 8;
        this.m = mediaCodec;
        if (Lr0.a < 21) {
            this.n = mediaCodec.getInputBuffers();
            this.f488o = mediaCodec.getOutputBuffers();
        }
    }

    public RN(int i) {
        this.l = i;
        switch (i) {
            case 3:
                String string = UUID.randomUUID().toString();
                AbstractC1474fG.i(string, "randomUUID().toString()");
                C2468pa c2468pa = C2468pa.f972o;
                this.m = C2691rp.t(string);
                this.n = RS.e;
                this.f488o = new ArrayList();
                break;
        }
    }
}
