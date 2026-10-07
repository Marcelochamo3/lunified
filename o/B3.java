package o;

import android.content.Context;
import android.os.Looper;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class B3 extends Ph0 implements InterfaceC0775Sy {
    public /* synthetic */ Object m;
    public final /* synthetic */ Context n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B3(Context context, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = context;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((B3) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        B3 b3 = new B3(this.n, interfaceC0473Hh);
        b3.m = obj;
        return b3;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Jp0.O(obj);
        Context context = this.n;
        ArrayList arrayListP = X5.P(new File[]{context.getCacheDir(), context.getExternalCacheDir()});
        Iterator it = arrayListP.iterator();
        long jZ = 0;
        while (it.hasNext()) {
            jZ += C2691rp.z((File) it.next());
        }
        try {
            com.bumptech.glide.a aVarA = com.bumptech.glide.a.a(context);
            aVarA.getClass();
            char[] cArr = Kr0.a;
            if (!(!(Looper.myLooper() == Looper.getMainLooper()))) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
            aVarA.l.f.a().clear();
            Iterator it2 = arrayListP.iterator();
            while (it2.hasNext()) {
                File[] fileArrListFiles = ((File) it2.next()).listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        try {
                            AbstractC1474fG.g(file);
                            AbstractC1438ev.B(file);
                        } catch (Throwable th) {
                            Jp0.k(th);
                        }
                    }
                }
            }
            return new Long(jZ);
        } catch (Throwable th2) {
            Jp0.k(th2);
        }
    }
}
