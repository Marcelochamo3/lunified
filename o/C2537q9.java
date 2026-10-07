package o;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.q9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2537q9 {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public final Runnable d;
    public final /* synthetic */ AbstractC0706Qh e;

    public C2537q9(SideSheetBehavior sideSheetBehavior) {
        this.a = 1;
        this.e = sideSheetBehavior;
        this.d = new Jj0(26, this);
    }

    public final void a(int i) {
        Runnable runnable = this.d;
        AbstractC0706Qh abstractC0706Qh = this.e;
        switch (this.a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0706Qh;
                WeakReference weakReference = bottomSheetBehavior.U;
                if (weakReference != null && weakReference.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        View view = (View) bottomSheetBehavior.U.get();
                        WeakHashMap weakHashMap = It0.a;
                        view.postOnAnimation((RunnableC3102w1) runnable);
                        this.c = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0706Qh;
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        View view2 = (View) sideSheetBehavior.p.get();
                        WeakHashMap weakHashMap2 = It0.a;
                        view2.postOnAnimation((Jj0) runnable);
                        this.c = true;
                    }
                    break;
                }
                break;
        }
    }

    public C2537q9(BottomSheetBehavior bottomSheetBehavior) {
        this.a = 0;
        this.e = bottomSheetBehavior;
        this.d = new RunnableC3102w1(3, this);
    }
}
