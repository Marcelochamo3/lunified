package o;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.ly, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2128ly extends C0622Nb {
    public static HandlerThread r;
    public static Handler s;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SparseIntArray[] f906o;
    public final ArrayList p;
    public final WindowOnFrameMetricsAvailableListenerC2030ky q;

    public C2128ly(int i) {
        super(23);
        this.f906o = new SparseIntArray[9];
        this.p = new ArrayList();
        this.q = new WindowOnFrameMetricsAvailableListenerC2030ky(this);
        this.n = i;
    }

    public static void K(SparseIntArray sparseIntArray, long j) {
        if (sparseIntArray != null) {
            int i = (int) ((500000 + j) / 1000000);
            if (j >= 0) {
                sparseIntArray.put(i, sparseIntArray.get(i) + 1);
            }
        }
    }

    @Override // o.C0622Nb
    public final SparseIntArray[] C(Activity activity) {
        ArrayList<WeakReference> arrayList = this.p;
        for (WeakReference weakReference : arrayList) {
            if (weakReference.get() == activity) {
                arrayList.remove(weakReference);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener(this.q);
        return this.f906o;
    }

    @Override // o.C0622Nb
    public final SparseIntArray[] F() {
        SparseIntArray[] sparseIntArrayArr = this.f906o;
        this.f906o = new SparseIntArray[9];
        return sparseIntArrayArr;
    }

    @Override // o.C0622Nb
    public final SparseIntArray[] H() {
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            Activity activity = (Activity) weakReference.get();
            if (weakReference.get() != null) {
                activity.getWindow().removeOnFrameMetricsAvailableListener(this.q);
                arrayList.remove(size);
            }
        }
        return this.f906o;
    }

    @Override // o.C0622Nb
    public final void j(Activity activity) {
        if (r == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            r = handlerThread;
            handlerThread.start();
            s = new Handler(r.getLooper());
        }
        for (int i = 0; i <= 8; i++) {
            SparseIntArray[] sparseIntArrayArr = this.f906o;
            if (sparseIntArrayArr[i] == null && (this.n & (1 << i)) != 0) {
                sparseIntArrayArr[i] = new SparseIntArray();
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener(this.q, s);
        this.p.add(new WeakReference(activity));
    }

    @Override // o.C0622Nb
    public final SparseIntArray[] u() {
        return this.f906o;
    }
}
