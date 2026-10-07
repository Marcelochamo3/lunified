package o;

import java.util.Iterator;

/* JADX INFO: renamed from: o.jy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1933jy0 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ my0 m;

    public /* synthetic */ RunnableC1933jy0(my0 my0Var, float f, int i) {
        this.l = i;
        this.m = my0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                my0 my0Var = this.m;
                AbstractC1474fG.j(my0Var, "this$0");
                Tv0 tv0 = (Tv0) my0Var.a;
                InterfaceC0412Ey interfaceC0412Ey = tv0.n;
                if (interfaceC0412Ey != null) {
                    interfaceC0412Ey.b(tv0.m);
                    return;
                } else {
                    AbstractC1474fG.U("youTubePlayerInitListener");
                    throw null;
                }
            case 1:
                my0 my0Var2 = this.m;
                AbstractC1474fG.j(my0Var2, "this$0");
                Tv0 tv1 = (Tv0) my0Var2.a;
                for (AbstractC2325o0 abstractC2325o0 : tv1.getListeners()) {
                    InterfaceC1739hy0 tv2 = tv1.getInstance();
                    abstractC2325o0.getClass();
                    AbstractC1474fG.j(tv2, "youTubePlayer");
                }
                return;
            case 2:
                my0 my0Var3 = this.m;
                AbstractC1474fG.j(my0Var3, "this$0");
                Tv0 tv3 = (Tv0) my0Var3.a;
                for (AbstractC2325o0 abstractC2325o1 : tv3.getListeners()) {
                    InterfaceC1739hy0 tv4 = tv3.getInstance();
                    abstractC2325o1.getClass();
                    AbstractC1474fG.j(tv4, "youTubePlayer");
                }
                return;
            case 3:
                my0 my0Var4 = this.m;
                AbstractC1474fG.j(my0Var4, "this$0");
                Tv0 tv5 = (Tv0) my0Var4.a;
                Iterator<T> it = tv5.getListeners().iterator();
                while (it.hasNext()) {
                    ((AbstractC2325o0) it.next()).c(tv5.getInstance());
                }
                return;
            default:
                my0 my0Var5 = this.m;
                AbstractC1474fG.j(my0Var5, "this$0");
                Tv0 tv6 = (Tv0) my0Var5.a;
                for (AbstractC2325o0 abstractC2325o2 : tv6.getListeners()) {
                    InterfaceC1739hy0 tv7 = tv6.getInstance();
                    abstractC2325o2.getClass();
                    AbstractC1474fG.j(tv7, "youTubePlayer");
                }
                return;
        }
    }

    public /* synthetic */ RunnableC1933jy0(my0 my0Var, int i) {
        this.l = i;
        this.m = my0Var;
    }
}
