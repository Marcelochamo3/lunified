package o;

import android.content.DialogInterface;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.preference.PreferenceScreen;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC2232n2 extends Handler {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ HandlerC2232n2() {
        this.a = 0;
    }

    private final void a(Message message) {
        Set set;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i == 0) {
            C0294Ak c0294Ak = (C0294Ak) this.b;
            if (obj == c0294Ak.y) {
                if (c0294Ak.p == 2 || c0294Ak.j()) {
                    c0294Ak.y = null;
                    boolean z = obj2 instanceof Exception;
                    C2720s4 c2720s4 = c0294Ak.c;
                    if (z) {
                        c2720s4.e0((Exception) obj2, false);
                        return;
                    }
                    try {
                        c0294Ak.b.l((byte[]) obj2);
                        c2720s4.n = null;
                        HashSet hashSet = (HashSet) c2720s4.m;
                        AbstractC0985aF abstractC0985aFL = AbstractC0985aF.l(hashSet);
                        hashSet.clear();
                        XE xeListIterator = abstractC0985aFL.listIterator(0);
                        while (xeListIterator.hasNext()) {
                            C0294Ak c0294Ak2 = (C0294Ak) xeListIterator.next();
                            if (c0294Ak2.m()) {
                                c0294Ak2.i(true);
                            }
                        }
                        return;
                    } catch (Exception e) {
                        c2720s4.e0(e, true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i != 1) {
            return;
        }
        C0294Ak c0294Ak3 = (C0294Ak) this.b;
        if (obj == c0294Ak3.x && c0294Ak3.j()) {
            c0294Ak3.x = null;
            if (obj2 instanceof Exception) {
                c0294Ak3.l((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (c0294Ak3.e != 3) {
                    byte[] bArrJ = c0294Ak3.b.j(c0294Ak3.v, bArr);
                    int i2 = c0294Ak3.e;
                    if ((i2 == 2 || (i2 == 0 && c0294Ak3.w != null)) && bArrJ != null && bArrJ.length != 0) {
                        c0294Ak3.w = bArrJ;
                    }
                    c0294Ak3.p = 4;
                    c0294Ak3.h(new C0838Vj(27));
                    return;
                }
                InterfaceC0561Kr interfaceC0561Kr = c0294Ak3.b;
                byte[] bArr2 = c0294Ak3.w;
                int i3 = Lr0.a;
                interfaceC0561Kr.j(bArr2, bArr);
                C0862Wh c0862Wh = c0294Ak3.i;
                synchronized (c0862Wh.l) {
                    set = c0862Wh.n;
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((C0350Co) it.next()).b();
                }
            } catch (Exception e2) {
                c0294Ak3.l(e2, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x00ef  */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C2531q6 c2531q6;
        switch (this.a) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.b).get(), message.what);
                    break;
                } else if (i == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            case 1:
                C2627r6 c2627r6 = (C2627r6) this.b;
                c2627r6.getClass();
                int i2 = message.what;
                C2531q6 c2531q7 = null;
                if (i2 != 0) {
                    if (i2 == 1) {
                        c2531q6 = (C2531q6) message.obj;
                        int i3 = c2531q6.a;
                        int i4 = c2531q6.b;
                        MediaCodec.CryptoInfo cryptoInfo = c2531q6.d;
                        long j = c2531q6.e;
                        int i5 = c2531q6.f;
                        try {
                            synchronized (C2627r6.h) {
                                try {
                                    c2627r6.a.queueSecureInputBuffer(i3, i4, cryptoInfo, j, i5);
                                } catch (Throwable th) {
                                    throw th;
                                }
                                break;
                            }
                        } catch (RuntimeException e) {
                            AtomicReference atomicReference = c2627r6.d;
                            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                            }
                        }
                    } else if (i2 != 2) {
                        AtomicReference atomicReference2 = c2627r6.d;
                        IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                        while (!atomicReference2.compareAndSet(null, illegalStateException) && atomicReference2.get() == null) {
                        }
                    } else {
                        c2627r6.e.b();
                    }
                    if (c2531q7 != null) {
                        C2627r6.c(c2531q7);
                    }
                    break;
                } else {
                    c2531q6 = (C2531q6) message.obj;
                    try {
                        c2627r6.a.queueInputBuffer(c2531q6.a, c2531q6.b, c2531q6.c, c2531q6.e, c2531q6.f);
                        break;
                    } catch (RuntimeException e2) {
                        AtomicReference atomicReference3 = c2627r6.d;
                        while (!atomicReference3.compareAndSet(null, e2) && atomicReference3.get() == null) {
                        }
                    }
                }
                c2531q7 = c2531q6;
                if (c2531q7 != null) {
                    C2627r6.c(c2531q7);
                }
                break;
            case 2:
                a(message);
                break;
            case 3:
                byte[] bArr = (byte[]) message.obj;
                if (bArr != null) {
                    for (C0294Ak c0294Ak : ((C0398Ek) this.b).w) {
                        c0294Ak.p();
                        if (Arrays.equals(c0294Ak.v, bArr)) {
                            if (message.what == 2 && c0294Ak.e == 0 && c0294Ak.p == 4) {
                                int i6 = Lr0.a;
                                c0294Ak.i(false);
                            }
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                if (message.what == 1) {
                    S20 s20 = (S20) this.b;
                    PreferenceScreen preferenceScreen = s20.m0.g;
                    if (preferenceScreen != null) {
                        s20.n0.setAdapter(new V20(preferenceScreen));
                        preferenceScreen.j();
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC2232n2(Object obj, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.b = obj;
    }
}
