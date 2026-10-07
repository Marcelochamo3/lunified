package o;

import java.util.Iterator;

/* JADX INFO: renamed from: o.ky0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2031ky0 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ my0 m;
    public final /* synthetic */ int n;

    public /* synthetic */ RunnableC2031ky0(my0 my0Var, int i, int i2) {
        this.l = i2;
        this.m = my0Var;
        this.n = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                my0 my0Var = this.m;
                AbstractC1474fG.j(my0Var, "this$0");
                AbstractC1701hf0.q(this.n, "$playbackQuality");
                Tv0 tv0 = (Tv0) my0Var.a;
                for (AbstractC2325o0 abstractC2325o0 : tv0.getListeners()) {
                    InterfaceC1739hy0 tv1 = tv0.getInstance();
                    abstractC2325o0.getClass();
                    AbstractC1474fG.j(tv1, "youTubePlayer");
                }
                break;
            case 1:
                my0 my0Var2 = this.m;
                AbstractC1474fG.j(my0Var2, "this$0");
                AbstractC1701hf0.q(this.n, "$playbackRate");
                Tv0 tv2 = (Tv0) my0Var2.a;
                for (AbstractC2325o0 abstractC2325o1 : tv2.getListeners()) {
                    InterfaceC1739hy0 tv3 = tv2.getInstance();
                    abstractC2325o1.getClass();
                    AbstractC1474fG.j(tv3, "youTubePlayer");
                }
                break;
            case 2:
                my0 my0Var3 = this.m;
                AbstractC1474fG.j(my0Var3, "this$0");
                int i = this.n;
                AbstractC1701hf0.q(i, "$playerError");
                Tv0 tv4 = (Tv0) my0Var3.a;
                Iterator<T> it = tv4.getListeners().iterator();
                while (it.hasNext()) {
                    ((AbstractC2325o0) it.next()).b(tv4.getInstance(), i);
                }
                break;
            default:
                my0 my0Var4 = this.m;
                AbstractC1474fG.j(my0Var4, "this$0");
                int i2 = this.n;
                AbstractC1701hf0.q(i2, "$playerState");
                Tv0 tv5 = (Tv0) my0Var4.a;
                Iterator<T> it2 = tv5.getListeners().iterator();
                while (it2.hasNext()) {
                    ((AbstractC2325o0) it2.next()).d(tv5.getInstance(), i2);
                }
                break;
        }
    }
}
