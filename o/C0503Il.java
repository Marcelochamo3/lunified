package o;

import android.util.Log;
import android.view.ViewGroup;
import com.skidush.clonex.fragments.player.PlayerTvFragment;
import java.util.HashMap;

/* JADX INFO: renamed from: o.Il, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0503Il extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f330o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0503Il(Object obj, int i, Object obj2) {
        super(0);
        this.m = i;
        this.n = obj;
        this.f330o = obj2;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        switch (this.m) {
            case 0:
                Log.isLoggable("FragmentManager", 2);
                C0529Jl c0529Jl = (C0529Jl) this.n;
                AbstractC0956Zx abstractC0956Zx = c0529Jl.f;
                Object obj = c0529Jl.k;
                AbstractC1474fG.g(obj);
                abstractC0956Zx.d(obj, new O3(c0529Jl, 6, (ViewGroup) this.f330o));
                return C2985uq0.a;
            case 1:
                C1649h20 c1649h20 = (C1649h20) this.n;
                c1649h20.getClass();
                Enum[] enumArr = (Enum[]) c1649h20.b;
                C0378Dq c0378Dq = new C0378Dq((String) this.f330o, enumArr.length);
                for (Enum r0 : enumArr) {
                    String strName = r0.name();
                    AbstractC1474fG.j(strName, "name");
                    int i = c0378Dq.d + 1;
                    c0378Dq.d = i;
                    String[] strArr = c0378Dq.e;
                    strArr[i] = strName;
                    c0378Dq.g[i] = false;
                    c0378Dq.f[i] = null;
                    if (i == c0378Dq.c - 1) {
                        HashMap map = new HashMap();
                        int length = strArr.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            map.put(strArr[i2], Integer.valueOf(i2));
                        }
                        c0378Dq.h = map;
                    }
                }
                return c0378Dq;
            case 2:
                return AbstractC3409z9.c((String) this.n, C2386oh0.l, new Zb0[0], new io.sentry.android.replay.v(11, (LF) this.f330o));
            default:
                ((PlayerTvFragment) this.n).w0((C1387eR) this.f330o);
                return C2985uq0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0503Il(LF lf) {
        super(0);
        this.m = 2;
        this.n = "o.uq0";
        this.f330o = lf;
    }
}
