package o;

import android.content.Context;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.fragments.home.HomeTvFragment;

/* JADX INFO: renamed from: o.Zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnKeyListenerC0934Zb implements View.OnKeyListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ ViewOnKeyListenerC0934Zb(Object obj, int i, Object obj2) {
        this.l = i;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039 A[RETURN, SYNTHETIC] */
    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int iD;
        switch (this.l) {
            case 0:
                TextView textView = (TextView) this.m;
                AbstractC1474fG.j(textView, "$this_apply");
                C1498fc c1498fc = (C1498fc) this.n;
                AbstractC1474fG.j(c1498fc, "this$0");
                if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 22) {
                    return false;
                }
                Context context = textView.getContext();
                AbstractC1474fG.i(context, "getContext(...)");
                AbstractActivityC1540fx abstractActivityC1540fx = context instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context : null;
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO = abstractActivityC1540fx != null ? AbstractC0397Ej.o(abstractActivityC1540fx) : null;
                if (abstractComponentCallbacksC1247cxO instanceof HomeTvFragment) {
                    HomeTvFragment homeTvFragment = (HomeTvFragment) abstractComponentCallbacksC1247cxO;
                    Handler handler = homeTvFragment.p0;
                    handler.removeCallbacksAndMessages(null);
                    handler.postDelayed(new RunnableC3102w1(13, homeTvFragment), 12000L);
                }
                C0882Xb c0882Xb = c1498fc.w;
                if (c0882Xb == null) {
                    AbstractC1474fG.U("category");
                    throw null;
                }
                c0882Xb.c = (c0882Xb.c + 1) % c0882Xb.b.size();
                Context context2 = textView.getContext();
                AbstractC1474fG.i(context2, "getContext(...)");
                AbstractActivityC1540fx abstractActivityC1540fx2 = context2 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context2 : null;
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO2 = abstractActivityC1540fx2 != null ? AbstractC0397Ej.o(abstractActivityC1540fx2) : null;
                if (abstractComponentCallbacksC1247cxO2 instanceof HomeTvFragment) {
                    C0882Xb c0882Xb2 = c1498fc.w;
                    if (c0882Xb2 == null) {
                        AbstractC1474fG.U("category");
                        throw null;
                    }
                    InterfaceC3106w3 interfaceC3106w3 = (InterfaceC3106w3) c0882Xb2.b.get(c0882Xb2.c);
                    if (interfaceC3106w3 instanceof C1387eR) {
                        ((HomeTvFragment) abstractComponentCallbacksC1247cxO2).Y(((C1387eR) interfaceC3106w3).i, Boolean.TRUE);
                    } else if (interfaceC3106w3 instanceof C2109lo0) {
                        ((HomeTvFragment) abstractComponentCallbacksC1247cxO2).Y(((C2109lo0) interfaceC3106w3).i, Boolean.TRUE);
                    }
                }
                O50 o50 = c1498fc.s;
                if (o50 == null) {
                    return true;
                }
                o50.d(c1498fc.d());
                return true;
            case 1:
                C3172wn c3172wn = (C3172wn) this.m;
                AbstractC1474fG.j(c3172wn, "this$0");
                C3269xn c3269xn = (C3269xn) this.n;
                AbstractC1474fG.j(c3269xn, "this$1");
                if ((i != 23 && i != 66) || keyEvent.getAction() != 1) {
                    return false;
                }
                int iD2 = c3172wn.d();
                if (iD2 == -1) {
                    return true;
                }
                ((InterfaceC0412Ey) c3269xn.f).b(c3269xn.e.get(iD2));
                return true;
            default:
                C1619gn0 c1619gn0 = (C1619gn0) this.m;
                AbstractC1474fG.j(c1619gn0, "this$0");
                C1717hn0 c1717hn0 = (C1717hn0) this.n;
                AbstractC1474fG.j(c1717hn0, "this$1");
                if (keyEvent.getAction() != 0 || (iD = c1619gn0.d()) == -1) {
                    return false;
                }
                switch (i) {
                    case 19:
                        if (iD == 0) {
                            return true;
                        }
                        return false;
                    case 20:
                        if (iD == c1717hn0.d.size() - 1) {
                            return true;
                        }
                        return false;
                    case 21:
                        RecyclerView recyclerView = c1717hn0.g;
                        if (recyclerView != null) {
                            recyclerView.post(new O3(c1717hn0, 20, recyclerView));
                        }
                        return true;
                    default:
                        return false;
                }
        }
    }
}
