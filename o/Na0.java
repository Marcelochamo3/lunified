package o;

import android.content.ClipDescription;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.Log;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.skidush.clonex.R;
import com.skidush.clonex.database.AppDatabase;
import io.sentry.C0032c;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class Na0 implements InterfaceC1773iL, InterfaceC2604qt0, InterfaceC0454Go, Z70, InterfaceC1941k20, QE, PF {
    public static volatile Na0 p;
    public static final Object q = new Object();
    public static final C2800sv r = new C2800sv();
    public static final ZK s;
    public static final ZK t;
    public static final ZK u;
    public final /* synthetic */ int l;
    public Object m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f414o;

    static {
        long j = -9223372036854775807L;
        s = new ZK(0, j, false);
        boolean z = false;
        t = new ZK(2, j, z);
        u = new ZK(3, j, z);
    }

    public /* synthetic */ Na0(int i, boolean z) {
        this.l = i;
    }

    public static Na0 B(Context context) {
        if (p == null) {
            synchronized (q) {
                try {
                    if (p == null) {
                        p = new Na0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return p;
    }

    public static C0398Ek s(C1190cP c1190cP) {
        boolean z = false;
        C0709Qk c0709Qk = new C0709Qk(0);
        c0709Qk.f477o = null;
        Uri uri = c1190cP.m;
        C0032c c0032c = new C0032c(uri == null ? null : uri.toString(), c1190cP.q, c0709Qk);
        Aq0 aq0I = c1190cP.n.entrySet().iterator();
        while (aq0I.hasNext()) {
            Map.Entry entry = (Map.Entry) aq0I.next();
            c0032c.v((String) entry.getKey(), (String) entry.getValue());
        }
        HashMap map = new HashMap();
        UUID uuid = AbstractC2661ra.a;
        C0633Nm c0633Nm = C2613qy.p;
        C0622Nb c0622Nb = new C0622Nb(z);
        UUID uuid2 = c1190cP.l;
        uuid2.getClass();
        int[] iArrV = Pu0.v(c1190cP.r);
        int length = iArrV.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArrV[i];
            AbstractC0397Ej.c(i2 == 2 || i2 == 1);
        }
        C0398Ek c0398Ek = new C0398Ek(uuid2, c0633Nm, c0032c, map, c1190cP.f714o, (int[]) iArrV.clone(), c1190cP.p, c0622Nb, 300000L);
        byte[] bArr = c1190cP.s;
        byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        AbstractC0397Ej.f(c0398Ek.w.isEmpty());
        c0398Ek.F = 0;
        c0398Ek.G = bArrCopyOf;
        return c0398Ek;
    }

    public static boolean t(Editable editable, KeyEvent keyEvent, boolean z) {
        Sp0[] sp0Arr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (sp0Arr = (Sp0[]) editable.getSpans(selectionStart, selectionEnd, Sp0.class)) != null && sp0Arr.length > 0) {
            for (Sp0 sp0 : sp0Arr) {
                int spanStart = editable.getSpanStart(sp0);
                int spanEnd = editable.getSpanEnd(sp0);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public long A() {
        C0554Kk c0554Kk = (C0554Kk) this.f414o;
        if (c0554Kk != null) {
            return c0554Kk.f369o;
        }
        return -1L;
    }

    public int C(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((N50) this.m).a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C3306y6 c3306y6 = (C3306y6) this.n;
            int I = i - (i2 - c3306y6.I(i2));
            if (I == 0) {
                while (c3306y6.K(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += I;
        }
        return -1;
    }

    public View D(int i) {
        return ((N50) this.m).a.getChildAt(i);
    }

    public int E() {
        return ((N50) this.m).a.getChildCount();
    }

    public boolean F() {
        return ((IOException) this.f414o) != null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    public boolean G(CharSequence charSequence, int i, int i2, Rp0 rp0) {
        boolean zA;
        if ((rp0.c & 3) == 0) {
            InterfaceC0377Dp interfaceC0377Dp = (InterfaceC0377Dp) this.f414o;
            EQ eqC = rp0.c();
            int iA = eqC.a(8);
            short s2 = iA != 0 ? ((ByteBuffer) eqC.f969o).getShort(iA + eqC.l) : (short) 0;
            C0605Mk c0605Mk = (C0605Mk) interfaceC0377Dp;
            c0605Mk.getClass();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 23 || s2 <= i3) {
                ThreadLocal threadLocal = C0605Mk.b;
                if (threadLocal.get() == null) {
                    threadLocal.set(new StringBuilder());
                }
                StringBuilder sb = (StringBuilder) threadLocal.get();
                sb.setLength(0);
                while (i < i2) {
                    sb.append(charSequence.charAt(i));
                    i++;
                }
                TextPaint textPaint = c0605Mk.a;
                String string = sb.toString();
                ThreadLocal threadLocal2 = AbstractC1003aX.a;
                if (Build.VERSION.SDK_INT >= 23) {
                    zA = ZW.a(textPaint, string);
                } else {
                    int length = string.length();
                    if (length == 1 && Character.isWhitespace(string.charAt(0))) {
                        zA = true;
                    } else {
                        float fMeasureText = textPaint.measureText("\udfffd");
                        float fMeasureText2 = textPaint.measureText("m");
                        float fMeasureText3 = textPaint.measureText(string);
                        float fMeasureText4 = 0.0f;
                        if (fMeasureText3 != 0.0f) {
                            if (string.codePointCount(0, string.length()) > 1) {
                                if (fMeasureText3 <= fMeasureText2 * 2.0f) {
                                    int i4 = 0;
                                    while (i4 < length) {
                                        int iCharCount = Character.charCount(string.codePointAt(i4)) + i4;
                                        fMeasureText4 += textPaint.measureText(string, i4, iCharCount);
                                        i4 = iCharCount;
                                    }
                                    if (fMeasureText3 >= fMeasureText4) {
                                    }
                                }
                                zA = false;
                            }
                            if (fMeasureText3 != fMeasureText) {
                                zA = true;
                            } else {
                                ThreadLocal threadLocal3 = AbstractC1003aX.a;
                                C1198cX c1198cX = (C1198cX) threadLocal3.get();
                                if (c1198cX == null) {
                                    c1198cX = new C1198cX(new Rect(), new Rect());
                                    threadLocal3.set(c1198cX);
                                } else {
                                    ((Rect) c1198cX.a).setEmpty();
                                    ((Rect) c1198cX.b).setEmpty();
                                }
                                Rect rect = (Rect) c1198cX.a;
                                textPaint.getTextBounds("\udfffd", 0, 2, rect);
                                Object obj = c1198cX.b;
                                textPaint.getTextBounds(string, 0, length, (Rect) obj);
                                zA = !rect.equals(obj);
                            }
                        } else {
                            zA = false;
                        }
                    }
                }
            } else {
                zA = false;
            }
            int i5 = rp0.c & 4;
            rp0.c = zA ? i5 | 2 : i5 | 1;
        }
        return (rp0.c & 3) == 2;
    }

    public boolean H() throws IOException {
        String strTrim;
        if (((String) this.f414o) != null) {
            return true;
        }
        Queue queue = (Queue) this.n;
        if (!queue.isEmpty()) {
            String str = (String) queue.poll();
            str.getClass();
            this.f414o = str;
            return true;
        }
        do {
            String line = ((BufferedReader) this.m).readLine();
            this.f414o = line;
            if (line == null) {
                return false;
            }
            strTrim = line.trim();
            this.f414o = strTrim;
        } while (strTrim.isEmpty());
        return true;
    }

    public void I(View view) {
        ((ArrayList) this.f414o).add(view);
        N50 n50 = (N50) this.m;
        n50.getClass();
        AbstractC2144m60 abstractC2144m60L = RecyclerView.L(view);
        if (abstractC2144m60L != null) {
            int i = abstractC2144m60L.q;
            View view2 = abstractC2144m60L.a;
            if (i != -1) {
                abstractC2144m60L.p = i;
            } else {
                WeakHashMap weakHashMap = It0.a;
                abstractC2144m60L.p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = n50.a;
            if (recyclerView.P()) {
                abstractC2144m60L.q = 4;
                recyclerView.G0.add(abstractC2144m60L);
            } else {
                WeakHashMap weakHashMap2 = It0.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public int J(View view) {
        int iIndexOfChild = ((N50) this.m).a.indexOfChild(view);
        if (iIndexOfChild == -1) {
            return -1;
        }
        C3306y6 c3306y6 = (C3306y6) this.n;
        if (c3306y6.K(iIndexOfChild)) {
            return -1;
        }
        return iIndexOfChild - c3306y6.I(iIndexOfChild);
    }

    public void K(InterfaceC2583qj interfaceC2583qj, Uri uri, Map map, long j, long j2, InterfaceC0354Cs interfaceC0354Cs) throws C2775si0 {
        boolean z;
        boolean z2 = true;
        C0554Kk c0554Kk = new C0554Kk(interfaceC2583qj, j, j2);
        this.f414o = c0554Kk;
        if (((InterfaceC0302As) this.n) != null) {
            return;
        }
        InterfaceC0302As[] interfaceC0302AsArrA = ((InterfaceC0380Ds) this.m).a(uri, map);
        if (interfaceC0302AsArrA.length == 1) {
            this.n = interfaceC0302AsArrA[0];
        } else {
            for (InterfaceC0302As interfaceC0302As : interfaceC0302AsArrA) {
                try {
                    if (interfaceC0302As.e(c0554Kk)) {
                        this.n = interfaceC0302As;
                        c0554Kk.q = 0;
                        break;
                    }
                    z = ((InterfaceC0302As) this.n) != null || c0554Kk.f369o == j;
                } catch (EOFException unused) {
                    z = ((InterfaceC0302As) this.n) != null || c0554Kk.f369o == j;
                } catch (Throwable th) {
                    if (((InterfaceC0302As) this.n) == null && c0554Kk.f369o != j) {
                        z2 = false;
                    }
                    AbstractC0397Ej.f(z2);
                    c0554Kk.q = 0;
                    throw th;
                }
                AbstractC0397Ej.f(z);
                c0554Kk.q = 0;
            }
            if (((InterfaceC0302As) this.n) == null) {
                StringBuilder sb = new StringBuilder("None of the available extractors (");
                int i = Lr0.a;
                StringBuilder sb2 = new StringBuilder();
                for (int i2 = 0; i2 < interfaceC0302AsArrA.length; i2++) {
                    sb2.append(interfaceC0302AsArrA[i2].getClass().getSimpleName());
                    if (i2 < interfaceC0302AsArrA.length - 1) {
                        sb2.append(", ");
                    }
                }
                sb.append(sb2.toString());
                sb.append(") could read the stream.");
                String string = sb.toString();
                uri.getClass();
                throw new C2775si0(string, null, false, 1);
            }
        }
        ((InterfaceC0302As) this.n).f(interfaceC0354Cs);
    }

    public boolean L(View view) {
        return ((ArrayList) this.f414o).contains(view);
    }

    public boolean M() {
        return ((HandlerC1381eL) this.n) != null;
    }

    public boolean N(int i, C0731Rg c0731Rg, K30 k30) {
        int[] iArr = c0731Rg.p0;
        int i2 = iArr[0];
        C3213x8 c3213x8 = (C3213x8) this.n;
        c3213x8.a = i2;
        c3213x8.b = iArr[1];
        c3213x8.c = c0731Rg.q();
        c3213x8.d = c0731Rg.k();
        c3213x8.i = false;
        c3213x8.j = i;
        boolean z = c3213x8.a == 3;
        boolean z2 = c3213x8.b == 3;
        boolean z3 = z && c0731Rg.W > 0.0f;
        boolean z4 = z2 && c0731Rg.W > 0.0f;
        int[] iArr2 = c0731Rg.t;
        if (z3 && iArr2[0] == 4) {
            c3213x8.a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            c3213x8.b = 1;
        }
        k30.d(c0731Rg, c3213x8);
        c0731Rg.O(c3213x8.e);
        c0731Rg.L(c3213x8.f);
        c0731Rg.E = c3213x8.h;
        c0731Rg.I(c3213x8.g);
        c3213x8.j = 0;
        return c3213x8.i;
    }

    public String O() {
        if (!H()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.f414o;
        this.f414o = null;
        return str;
    }

    public Object P(CharSequence charSequence, int i, int i2, int i3, boolean z, InterfaceC0740Rp interfaceC0740Rp) {
        char c;
        HQ hq = null;
        C0766Sp c0766Sp = new C0766Sp((HQ) ((C1583gR) this.n).f793o, false, null);
        int i4 = i;
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zL = true;
        int iCharCount = i4;
        while (iCharCount < i2 && i5 < i3 && zL) {
            SparseArray sparseArray = c0766Sp.c.a;
            HQ hq2 = sparseArray == null ? hq : (HQ) sparseArray.get(iCodePointAt);
            if (c0766Sp.a == 2) {
                if (hq2 != null) {
                    c0766Sp.c = hq2;
                    c0766Sp.f++;
                } else {
                    if (iCodePointAt == 65038) {
                        c0766Sp.a();
                    } else if (iCodePointAt != 65039) {
                        HQ hq3 = c0766Sp.c;
                        if (hq3.b != null) {
                            if (c0766Sp.f != 1) {
                                c0766Sp.d = hq3;
                                c0766Sp.a();
                            } else if (c0766Sp.b()) {
                                c0766Sp.d = c0766Sp.c;
                                c0766Sp.a();
                            } else {
                                c0766Sp.a();
                            }
                            c = 3;
                        } else {
                            c0766Sp.a();
                        }
                    }
                    c = 1;
                }
                c = 2;
            } else if (hq2 == null) {
                c0766Sp.a();
                c = 1;
            } else {
                c0766Sp.a = 2;
                c0766Sp.c = hq2;
                c0766Sp.f = 1;
                c = 2;
            }
            c0766Sp.e = iCodePointAt;
            if (c != 1) {
                if (c == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c == 3) {
                    if (z || !G(charSequence, i4, iCharCount, c0766Sp.d.b)) {
                        zL = interfaceC0740Rp.L(charSequence, i4, iCharCount, c0766Sp.d.b);
                        i5++;
                    }
                }
                hq = null;
            } else {
                iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                if (iCharCount < i2) {
                    iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                }
            }
            i4 = iCharCount;
            hq = null;
        }
        if (c0766Sp.a == 2 && c0766Sp.c.b != null && ((c0766Sp.f > 1 || c0766Sp.b()) && i5 < i3 && zL && (z || !G(charSequence, i4, iCharCount, c0766Sp.c.b)))) {
            interfaceC0740Rp.L(charSequence, i4, iCharCount, c0766Sp.c.b);
        }
        return interfaceC0740Rp.b();
    }

    public void Q(InterfaceC1577gL interfaceC1577gL) {
        HandlerC1381eL handlerC1381eL = (HandlerC1381eL) this.n;
        if (handlerC1381eL != null) {
            handlerC1381eL.a(true);
        }
        ExecutorService executorService = (ExecutorService) this.m;
        if (interfaceC1577gL != null) {
            executorService.execute(new RunnableC3102w1(15, interfaceC1577gL));
        }
        executorService.shutdown();
    }

    public void R(C0757Sg c0757Sg, int i, int i2, int i3) {
        int i4 = c0757Sg.b0;
        int i5 = c0757Sg.c0;
        c0757Sg.b0 = 0;
        c0757Sg.c0 = 0;
        c0757Sg.O(i2);
        c0757Sg.L(i3);
        if (i4 < 0) {
            c0757Sg.b0 = 0;
        } else {
            c0757Sg.b0 = i4;
        }
        if (i5 < 0) {
            c0757Sg.c0 = 0;
        } else {
            c0757Sg.c0 = i5;
        }
        C0757Sg c0757Sg2 = (C0757Sg) this.f414o;
        c0757Sg2.t0 = i;
        c0757Sg2.U();
    }

    public long S(InterfaceC1479fL interfaceC1479fL, InterfaceC1284dL interfaceC1284dL, int i) {
        Looper looperMyLooper = Looper.myLooper();
        AbstractC0397Ej.g(looperMyLooper);
        this.f414o = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HandlerC1381eL handlerC1381eL = new HandlerC1381eL(this, looperMyLooper, interfaceC1479fL, interfaceC1284dL, i, jElapsedRealtime);
        AbstractC0397Ej.f(((HandlerC1381eL) this.n) == null);
        this.n = handlerC1381eL;
        handlerC1381eL.p = null;
        ((ExecutorService) this.m).execute(handlerC1381eL);
        return jElapsedRealtime;
    }

    public void V(View view) {
        if (((ArrayList) this.f414o).remove(view)) {
            N50 n50 = (N50) this.m;
            n50.getClass();
            AbstractC2144m60 abstractC2144m60L = RecyclerView.L(view);
            if (abstractC2144m60L != null) {
                int i = abstractC2144m60L.p;
                RecyclerView recyclerView = n50.a;
                if (recyclerView.P()) {
                    abstractC2144m60L.q = i;
                    recyclerView.G0.add(abstractC2144m60L);
                } else {
                    WeakHashMap weakHashMap = It0.a;
                    abstractC2144m60L.a.setImportantForAccessibility(i);
                }
                abstractC2144m60L.p = 0;
            }
        }
    }

    public void W(C0757Sg c0757Sg) {
        ArrayList arrayList = (ArrayList) this.m;
        arrayList.clear();
        int size = c0757Sg.q0.size();
        for (int i = 0; i < size; i++) {
            C0731Rg c0731Rg = (C0731Rg) c0757Sg.q0.get(i);
            int[] iArr = c0731Rg.p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c0731Rg);
            }
        }
        c0757Sg.s0.b = true;
    }

    @Override // o.InterfaceC1773iL
    public void a() throws IOException {
        IOException iOException;
        IOException iOException2 = (IOException) this.f414o;
        if (iOException2 != null) {
            throw iOException2;
        }
        HandlerC1381eL handlerC1381eL = (HandlerC1381eL) this.n;
        if (handlerC1381eL != null && (iOException = handlerC1381eL.p) != null && handlerC1381eL.q > handlerC1381eL.l) {
            throw iOException;
        }
    }

    @Override // o.InterfaceC2604qt0
    public View b() {
        switch (this.l) {
            case 4:
                return (ConstraintLayout) this.m;
            case 5:
                return (ConstraintLayout) this.m;
            case 16:
                return (LinearLayout) this.m;
            case 17:
                return (ConstraintLayout) this.m;
            default:
                return (ConstraintLayout) this.m;
        }
    }

    @Override // o.QE
    public Bitmap c(BitmapFactory.Options options) {
        switch (this.l) {
            case 25:
                return BitmapFactory.decodeStream(new C2177ma(AbstractC2274na.c((ByteBuffer) this.m)), null, options);
            case 26:
                K50 k50 = (K50) ((C0334By) this.m).m;
                k50.reset();
                return BitmapFactory.decodeStream(k50, null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((com.bumptech.glide.load.data.a) this.f414o).b().getFileDescriptor(), null, options);
        }
    }

    @Override // o.InterfaceC0454Go
    public InterfaceC0428Fo d(C1971kP c1971kP) {
        C0398Ek c0398Ek;
        c1971kP.m.getClass();
        C1190cP c1190cP = c1971kP.m.n;
        if (c1190cP == null || Lr0.a < 18) {
            return InterfaceC0428Fo.f;
        }
        synchronized (this.m) {
            try {
                if (!Lr0.a(c1190cP, (C1190cP) this.n)) {
                    this.n = c1190cP;
                    this.f414o = s(c1190cP);
                }
                c0398Ek = (C0398Ek) this.f414o;
                c0398Ek.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0398Ek;
    }

    @Override // o.InterfaceC1941k20
    public boolean e(Object obj) {
        if (obj instanceof InterfaceC0432Fs) {
            ((InterfaceC0432Fs) obj).c().a = true;
        }
        ((C0622Nb) this.n).E(obj);
        return ((InterfaceC1941k20) this.f414o).e(obj);
    }

    @Override // o.PF
    public Object f() {
        return null;
    }

    @Override // o.Z70
    public M70 g(M70 m70, FW fw) {
        Drawable drawable = (Drawable) m70.get();
        if (drawable instanceof BitmapDrawable) {
            return ((Z70) this.n).g(R8.c(((BitmapDrawable) drawable).getBitmap(), (Q8) this.m), fw);
        }
        if (drawable instanceof C0672Oz) {
            return ((Z70) this.f414o).g(m70, fw);
        }
        return null;
    }

    @Override // o.PF
    public ClipDescription getDescription() {
        return (ClipDescription) this.n;
    }

    @Override // o.QE
    public void h() {
        switch (this.l) {
            case 25:
                return;
            case 26:
                K50 k50 = (K50) ((C0334By) this.m).m;
                synchronized (k50) {
                    k50.n = k50.l.length;
                }
                return;
            default:
                return;
        }
    }

    @Override // o.PF
    public Uri i() {
        return (Uri) this.m;
    }

    @Override // o.QE
    public int j() throws Throwable {
        switch (this.l) {
            case 25:
                ByteBuffer byteBufferC = AbstractC2274na.c((ByteBuffer) this.m);
                C1813in c1813in = (C1813in) this.f414o;
                if (byteBufferC == null) {
                    return -1;
                }
                List list = (List) this.n;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    try {
                        int iB = ((PE) list.get(i)).b(byteBufferC, c1813in);
                        AbstractC2274na.c(byteBufferC);
                        if (iB != -1) {
                            return iB;
                        }
                    } catch (Throwable th) {
                        AbstractC2274na.c(byteBufferC);
                        throw th;
                    }
                }
                return -1;
            case 26:
                K50 k50 = (K50) ((C0334By) this.m).m;
                k50.reset();
                return Jp0.u((List) this.f414o, k50, (C1813in) this.n);
            default:
                com.bumptech.glide.load.data.a aVar = (com.bumptech.glide.load.data.a) this.f414o;
                C1813in c1813in2 = (C1813in) this.m;
                List list2 = (List) this.n;
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    PE pe = (PE) list2.get(i2);
                    K50 k51 = null;
                    try {
                        K50 k52 = new K50(new FileInputStream(aVar.b().getFileDescriptor()), c1813in2);
                        try {
                            int iC = pe.c(k52, c1813in2);
                            k52.f();
                            aVar.b();
                            if (iC != -1) {
                                return iC;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            k51 = k52;
                            if (k51 != null) {
                                k51.f();
                            }
                            aVar.b();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                return -1;
        }
    }

    @Override // o.PF
    public Uri l() {
        return (Uri) this.f414o;
    }

    @Override // o.QE
    public ImageHeaderParser$ImageType m() throws Throwable {
        switch (this.l) {
            case 25:
                return Jp0.w((List) this.n, AbstractC2274na.c((ByteBuffer) this.m));
            case 26:
                K50 k50 = (K50) ((C0334By) this.m).m;
                k50.reset();
                return Jp0.v((List) this.f414o, k50, (C1813in) this.n);
            default:
                com.bumptech.glide.load.data.a aVar = (com.bumptech.glide.load.data.a) this.f414o;
                C1813in c1813in = (C1813in) this.m;
                List list = (List) this.n;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    PE pe = (PE) list.get(i);
                    K50 k51 = null;
                    try {
                        K50 k52 = new K50(new FileInputStream(aVar.b().getFileDescriptor()), c1813in);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeD = pe.d(k52);
                            k52.f();
                            aVar.b();
                            if (imageHeaderParser$ImageTypeD != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeD;
                            }
                        } catch (Throwable th) {
                            th = th;
                            k51 = k52;
                            if (k51 != null) {
                                k51.f();
                            }
                            aVar.b();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    @Override // o.InterfaceC1941k20
    public Object n() {
        Object objN = ((InterfaceC1941k20) this.f414o).n();
        if (objN == null) {
            objN = ((InterfaceC0406Es) this.m).q();
            if (Log.isLoggable("FactoryPools", 2)) {
                objN.getClass().toString();
            }
        }
        if (objN instanceof InterfaceC0432Fs) {
            ((InterfaceC0432Fs) objN).c().a = false;
        }
        return objN;
    }

    public void o(String str, String str2) {
        AbstractC1474fG.j(str, "name");
        AbstractC1474fG.j(str2, "value");
        ((ArrayList) this.n).add(C0622Nb.l(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, (Charset) this.m, 91));
        ((ArrayList) this.f414o).add(C0622Nb.l(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, (Charset) this.m, 91));
    }

    public void p(View view, int i, boolean z) {
        N50 n50 = (N50) this.m;
        int childCount = i < 0 ? n50.a.getChildCount() : C(i);
        ((C3306y6) this.n).L(childCount, z);
        if (z) {
            I(view);
        }
        RecyclerView recyclerView = n50.a;
        recyclerView.addView(view, childCount);
        AbstractC2144m60 abstractC2144m60L = RecyclerView.L(view);
        O50 o50 = recyclerView.x;
        if (o50 != null && abstractC2144m60L != null) {
            o50.g(abstractC2144m60L);
        }
        ArrayList arrayList = recyclerView.O;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C1437eu0) recyclerView.O.get(size)).getClass();
                Y50 y50 = (Y50) view.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) y50).width != -1 || ((ViewGroup.MarginLayoutParams) y50).height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        }
    }

    public void q(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        N50 n50 = (N50) this.m;
        int childCount = i < 0 ? n50.a.getChildCount() : C(i);
        ((C3306y6) this.n).L(childCount, z);
        if (z) {
            I(view);
        }
        n50.getClass();
        AbstractC2144m60 abstractC2144m60L = RecyclerView.L(view);
        RecyclerView recyclerView = n50.a;
        if (abstractC2144m60L != null) {
            if (!abstractC2144m60L.n() && !abstractC2144m60L.s()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + abstractC2144m60L + recyclerView.A());
            }
            abstractC2144m60L.j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void r() {
        HandlerC1381eL handlerC1381eL = (HandlerC1381eL) this.n;
        AbstractC0397Ej.g(handlerC1381eL);
        handlerC1381eL.a(false);
    }

    public String toString() {
        switch (this.l) {
            case 10:
                return ((C3306y6) this.n).toString() + ", hidden list:" + ((ArrayList) this.f414o).size();
            default:
                return super.toString();
        }
    }

    public void u(int i) {
        AbstractC2144m60 abstractC2144m60L;
        int iC = C(i);
        ((C3306y6) this.n).M(iC);
        RecyclerView recyclerView = ((N50) this.m).a;
        View childAt = recyclerView.getChildAt(iC);
        if (childAt != null && (abstractC2144m60L = RecyclerView.L(childAt)) != null) {
            if (abstractC2144m60L.n() && !abstractC2144m60L.s()) {
                throw new IllegalArgumentException("called detach on an already detached child " + abstractC2144m60L + recyclerView.A());
            }
            abstractC2144m60L.b(256);
        }
        recyclerView.detachViewFromParent(iC);
    }

    public void v(Bundle bundle) {
        HashSet hashSet;
        String string = ((Context) this.f414o).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = (HashSet) this.n;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (JF.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    w((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new C0730Rf(e);
            }
        }
    }

    public Object w(Class cls, HashSet hashSet) {
        Object objB;
        if (Ou0.r()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = (HashMap) this.m;
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                JF jf = (JF) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = jf.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            w(cls2, hashSet);
                        }
                    }
                }
                objB = jf.b((Context) this.f414o);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new C0730Rf(th2);
            }
        }
        Trace.endSection();
        return objB;
    }

    public Ma0 x(String str) {
        G80 g80A = G80.a(1, "SELECT * FROM seasons WHERE id = ?");
        g80A.o(1, str);
        F80 f80 = (F80) this.m;
        f80.b();
        Cursor cursorW = U9.w(f80, g80A);
        try {
            int iM = AbstractC3409z9.m(cursorW, "id");
            int iM2 = AbstractC3409z9.m(cursorW, "number");
            int iM3 = AbstractC3409z9.m(cursorW, "title");
            int iM4 = AbstractC3409z9.m(cursorW, "poster");
            int iM5 = AbstractC3409z9.m(cursorW, "tvShow");
            Ma0 ma0 = null;
            String string = null;
            if (cursorW.moveToFirst()) {
                Ma0 ma1 = new Ma0();
                String string2 = cursorW.getString(iM);
                AbstractC1474fG.j(string2, "<set-?>");
                ma1.a = string2;
                ma1.b = cursorW.getInt(iM2);
                ma1.c = cursorW.isNull(iM3) ? null : cursorW.getString(iM3);
                ma1.d = cursorW.isNull(iM4) ? null : cursorW.getString(iM4);
                if (!cursorW.isNull(iM5)) {
                    string = cursorW.getString(iM5);
                }
                ((C0519Jb) this.f414o).getClass();
                ma1.e = C0519Jb.L(string);
                ma0 = ma1;
            }
            return ma0;
        } finally {
            cursorW.close();
            g80A.l();
        }
    }

    public View y(int i) {
        return ((N50) this.m).a.getChildAt(C(i));
    }

    public int z() {
        return ((N50) this.m).a.getChildCount() - ((ArrayList) this.f414o).size();
    }

    public /* synthetic */ Na0(Object obj, Object obj2, Object obj3, int i) {
        this.l = i;
        this.m = obj;
        this.n = obj2;
        this.f414o = obj3;
    }

    public Na0(AppDatabase appDatabase) {
        this.l = 0;
        this.f414o = new C0519Jb(6);
        this.m = appDatabase;
        this.n = new C0482Hq(this, appDatabase, 2);
    }

    public Na0(N50 n50) {
        this.l = 10;
        this.m = n50;
        this.n = new C3306y6(1);
        this.f414o = new ArrayList();
    }

    public Na0(LinearLayout linearLayout, TextView textView, TextView textView2, View view, ImageView imageView, FrameLayout frameLayout, TextView textView3, LinearLayout linearLayout2, TextView textView4) {
        this.l = 16;
        this.m = linearLayout;
        this.n = textView2;
        this.f414o = linearLayout2;
    }

    public Na0(int i) {
        this.l = i;
        switch (i) {
            case 22:
                this.m = null;
                this.n = new ArrayList();
                this.f414o = new ArrayList();
                break;
            case 29:
                this.m = new C2641rG(1);
                C2641rG c2641rG = new C2641rG(0);
                this.n = c2641rG;
                this.f414o = c2641rG;
                break;
            default:
                this.m = new Object();
                break;
        }
    }

    public Na0(InterfaceC0380Ds interfaceC0380Ds) {
        this.l = 8;
        this.m = interfaceC0380Ds;
    }

    public Na0(C0757Sg c0757Sg) {
        this.l = 7;
        this.m = new ArrayList();
        this.n = new C3213x8();
        this.f414o = c0757Sg;
    }

    private final void T() {
    }

    private final void U() {
    }

    @Override // o.PF
    public void k() {
    }

    public Na0(ConstraintLayout constraintLayout, Button button, Button button2, ProgressBar progressBar, TextView textView, TextView textView2, TextView textView3) {
        this.l = 17;
        this.m = constraintLayout;
        this.n = button;
        this.f414o = progressBar;
    }

    public Na0(Context context) {
        this.l = 1;
        this.f414o = context.getApplicationContext();
        this.n = new HashSet();
        this.m = new HashMap();
    }

    public Na0(X6[] x6Arr) {
        this.l = 13;
        Md0 md0 = new Md0();
        C1993kf0 c1993kf0 = new C1993kf0();
        c1993kf0.c = 1.0f;
        c1993kf0.d = 1.0f;
        V6 v6 = V6.e;
        c1993kf0.e = v6;
        c1993kf0.f = v6;
        c1993kf0.g = v6;
        c1993kf0.h = v6;
        ByteBuffer byteBuffer = X6.a;
        c1993kf0.k = byteBuffer;
        c1993kf0.l = byteBuffer.asShortBuffer();
        c1993kf0.m = byteBuffer;
        c1993kf0.b = -1;
        X6[] x6Arr2 = new X6[x6Arr.length + 2];
        this.m = x6Arr2;
        System.arraycopy(x6Arr, 0, x6Arr2, 0, x6Arr.length);
        this.n = md0;
        this.f414o = c1993kf0;
        x6Arr2[x6Arr.length] = md0;
        x6Arr2[x6Arr.length + 1] = c1993kf0;
    }

    public Na0(C1583gR c1583gR, C0622Nb c0622Nb, C0605Mk c0605Mk, Set set) {
        this.l = 19;
        this.m = c0622Nb;
        this.n = c1583gR;
        this.f414o = c0605Mk;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            P(str, 0, str.length(), 1, true, new J2(5, str, false));
        }
    }

    public Na0(C2136m20 c2136m20, InterfaceC0406Es interfaceC0406Es, C0622Nb c0622Nb) {
        this.l = 21;
        this.f414o = c2136m20;
        this.m = interfaceC0406Es;
        this.n = c0622Nb;
    }

    public Na0(C3424zN c3424zN, List list, C1813in c1813in) {
        this.l = 26;
        AbstractC3045vW.k(c1813in, "Argument must not be null");
        this.n = c1813in;
        AbstractC3045vW.k(list, "Argument must not be null");
        this.f414o = list;
        this.m = new C0334By(c3424zN, c1813in);
    }

    public Na0(C2133m1 c2133m1) {
        this.l = 6;
        this.l = 6;
        this.m = c2133m1;
        this.n = Choreographer.getInstance();
        this.f414o = new ChoreographerFrameCallbackC0966a3(this);
    }

    public Na0(String str) {
        this.l = 3;
        String strConcat = "ExoPlayer:Loader:".concat(str);
        int i = Lr0.a;
        this.m = Executors.newSingleThreadExecutor(new ThreadFactoryC1896jg(strConcat, 1));
    }

    public Na0(ParcelFileDescriptor parcelFileDescriptor, List list, C1813in c1813in) {
        this.l = 27;
        AbstractC3045vW.k(c1813in, "Argument must not be null");
        this.m = c1813in;
        AbstractC3045vW.k(list, "Argument must not be null");
        this.n = list;
        this.f414o = new com.bumptech.glide.load.data.a(parcelFileDescriptor);
    }

    public Na0(C2597qq c2597qq, P70 p70, C2984uq c2984uq) {
        this.l = 20;
        this.f414o = c2597qq;
        this.n = p70;
        this.m = c2984uq;
    }

    public Na0(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.l = 24;
        this.n = arrayDeque;
        this.m = bufferedReader;
    }

    public Na0(C1904jk c1904jk) {
        this.l = 14;
        this.f414o = c1904jk;
        this.m = new Handler(Looper.myLooper());
        this.n = new C1807ik(this);
    }
}
