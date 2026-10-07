package o;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: o.Gp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0455Gp {
    public static final Object j = new Object();
    public static volatile C0455Gp k;
    public final ReentrantReadWriteLock a;
    public final U5 b;
    public volatile int c;
    public final Handler d;
    public final C0325Bp e;
    public final InterfaceC0429Fp f;
    public final C0622Nb g;
    public final int h;
    public final C0605Mk i;

    public C0455Gp(C3287xw c3287xw) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        InterfaceC0429Fp interfaceC0429Fp = (InterfaceC0429Fp) c3287xw.b;
        this.f = interfaceC0429Fp;
        int i = c3287xw.a;
        this.h = i;
        this.i = (C0605Mk) c3287xw.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new U5();
        this.g = new C0622Nb(14);
        C0325Bp c0325Bp = new C0325Bp(this);
        this.e = c0325Bp;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                interfaceC0429Fp.a(new C0299Ap(c0325Bp));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static C0455Gp a() {
        C0455Gp c0455Gp;
        synchronized (j) {
            try {
                c0455Gp = k;
                if (!(c0455Gp != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0455Gp;
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                this.a.writeLock().unlock();
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            C0325Bp c0325Bp = this.e;
            C0455Gp c0455Gp = c0325Bp.a;
            try {
                c0455Gp.f.a(new C0299Ap(c0325Bp));
            } catch (Throwable th) {
                c0455Gp.d(th);
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new RunnableC0907Ya(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 1;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new RunnableC0907Ya(arrayList, this.c, (Throwable) null));
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final CharSequence f(CharSequence charSequence, int i, int i2) {
        Sp0[] sp0Arr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        Jp0.f("start should be <= than end", i <= i2);
        Eq0 eq0 = null;
        if (charSequence == null) {
            return null;
        }
        Jp0.f("start should be < than charSequence length", i <= charSequence.length());
        Jp0.f("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        Na0 na0 = this.e.b;
        na0.getClass();
        boolean z = charSequence instanceof C2479pf0;
        if (z) {
            ((C2479pf0) charSequence).a();
        }
        if (z) {
            eq0 = new Eq0((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    eq0 = new Eq0((Spannable) charSequence);
                } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, Sp0.class) <= i2) {
                    eq0 = new Eq0();
                    eq0.l = false;
                    eq0.m = new SpannableString(charSequence);
                }
            } finally {
                if (z) {
                    ((C2479pf0) charSequence).b();
                }
            }
        }
        if (eq0 != null && (sp0Arr = (Sp0[]) eq0.m.getSpans(i, i2, Sp0.class)) != null && sp0Arr.length > 0) {
            for (Sp0 sp0 : sp0Arr) {
                int spanStart = eq0.m.getSpanStart(sp0);
                int spanEnd = eq0.m.getSpanEnd(sp0);
                if (spanStart != i2) {
                    eq0.removeSpan(sp0);
                }
                i = Math.min(spanStart, i);
                i2 = Math.max(spanEnd, i2);
            }
        }
        int i3 = i;
        int i4 = i2;
        if (i3 != i4 && i3 < charSequence.length()) {
            Eq0 eq1 = (Eq0) na0.P(charSequence, i3, i4, Integer.MAX_VALUE, false, new C2720s4(eq0, 25, (C0622Nb) na0.m));
            if (eq1 != null) {
                return eq1.m;
            }
            if (!z) {
                return charSequence;
            }
        } else if (!z) {
            return charSequence;
        }
        return charSequence;
    }

    public final void g(AbstractC0403Ep abstractC0403Ep) {
        Jp0.h(abstractC0403Ep, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new RunnableC0907Ya(Arrays.asList(abstractC0403Ep), this.c, (Throwable) null));
            } else {
                this.b.add(abstractC0403Ep);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
