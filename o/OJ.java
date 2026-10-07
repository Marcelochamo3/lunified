package o;

/* JADX INFO: loaded from: classes.dex */
public final class OJ {
    public final /* synthetic */ PJ a;

    public OJ(PJ pj) {
        this.a = pj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [o.Cy, o.xJ] */
    public final void a() {
        PJ pj = this.a;
        if (!pj.f454o) {
            pj.p.c();
            return;
        }
        InterfaceC1739hy0 youtubePlayer$core_release = pj.getWebViewYouTubePlayer$core_release().getYoutubePlayer$core_release();
        C1689hZ c1689hZ = pj.n;
        c1689hZ.getClass();
        AbstractC1474fG.j(youtubePlayer$core_release, "youTubePlayer");
        String str = c1689hZ.d;
        if (str == null) {
            return;
        }
        boolean z = c1689hZ.b;
        if (z && c1689hZ.c == 3) {
            boolean z2 = c1689hZ.a;
            float f = c1689hZ.e;
            if (z2) {
                ny0 ny0Var = (ny0) youtubePlayer$core_release;
                ny0Var.a(ny0Var.a, "loadVideo", str, Float.valueOf(f));
            } else {
                ny0 ny0Var2 = (ny0) youtubePlayer$core_release;
                ny0Var2.a(ny0Var2.a, "cueVideo", str, Float.valueOf(f));
            }
        } else if (!z && c1689hZ.c == 3) {
            ny0 ny0Var3 = (ny0) youtubePlayer$core_release;
            ny0Var3.a(ny0Var3.a, "cueVideo", str, Float.valueOf(c1689hZ.e));
        }
        c1689hZ.c = 0;
    }
}
