package o;

import android.view.ViewGroup;
import com.skidush.clonex.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class Gm0 {
    public static final C2629r7 a = new C2629r7();
    public static final ThreadLocal b = new ThreadLocal();
    public static final ArrayList c = new ArrayList();

    public static void a(ViewGroup viewGroup, Cm0 cm0) {
        ArrayList arrayList = c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (cm0 == null) {
            cm0 = a;
        }
        Cm0 cm0Clone = cm0.clone();
        c(viewGroup, cm0Clone);
        viewGroup.setTag(R.id.transition_current_scene, null);
        Fm0 fm0 = new Fm0();
        fm0.l = cm0Clone;
        fm0.m = viewGroup;
        viewGroup.addOnAttachStateChangeListener(fm0);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(fm0);
    }

    public static S5 b() {
        S5 s5;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (s5 = (S5) weakReference.get()) != null) {
            return s5;
        }
        S5 s6 = new S5();
        threadLocal.set(new WeakReference(s6));
        return s6;
    }

    public static void c(ViewGroup viewGroup, Cm0 cm0) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Cm0) it.next()).C(viewGroup);
            }
        }
        if (cm0 != null) {
            cm0.k(viewGroup, true);
        }
        AbstractC1674hK.w(viewGroup.getTag(R.id.transition_current_scene));
    }
}
