package o;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class NJ extends AbstractC2325o0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ NJ(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // o.AbstractC2325o0
    public void c(InterfaceC1739hy0 interfaceC1739hy0) {
        Object obj = this.b;
        switch (this.a) {
            case 1:
                AbstractC1474fG.j(interfaceC1739hy0, "youTubePlayer");
                PJ pj = (PJ) obj;
                pj.setYouTubePlayerReady$core_release(true);
                LinkedHashSet linkedHashSet = pj.q;
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    AbstractC1674hK.w(it.next());
                    throw null;
                }
                linkedHashSet.clear();
                ((ny0) interfaceC1739hy0).c.remove(this);
                return;
            case 2:
                AbstractC1474fG.j(interfaceC1739hy0, "youTubePlayer");
                ny0 ny0Var = (ny0) interfaceC1739hy0;
                String str = (String) obj;
                AbstractC1474fG.j(str, "videoId");
                ny0Var.a(ny0Var.a, "loadVideo", str, Float.valueOf(0.0f));
                return;
            default:
                super.c(interfaceC1739hy0);
                return;
        }
    }

    @Override // o.AbstractC2325o0
    public void d(InterfaceC1739hy0 interfaceC1739hy0, int i) {
        switch (this.a) {
            case 0:
                AbstractC1474fG.j(interfaceC1739hy0, "youTubePlayer");
                AbstractC1701hf0.q(i, "state");
                if (i == 4) {
                    PJ pj = (PJ) this.b;
                    if (!pj.r && !pj.l.f546o) {
                        ny0 ny0Var = (ny0) interfaceC1739hy0;
                        ny0Var.a(ny0Var.a, "pauseVideo", new Object[0]);
                        break;
                    }
                }
                break;
            default:
                super.d(interfaceC1739hy0, i);
                break;
        }
    }
}
