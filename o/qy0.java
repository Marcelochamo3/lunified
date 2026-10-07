package o;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

/* JADX INFO: loaded from: classes.dex */
public final class qy0 extends AbstractC2325o0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ YouTubePlayerView b;
    public final /* synthetic */ boolean c;

    public qy0(String str, YouTubePlayerView youTubePlayerView, boolean z) {
        this.a = str;
        this.b = youTubePlayerView;
        this.c = z;
    }

    @Override // o.AbstractC2325o0
    public final void c(InterfaceC1739hy0 interfaceC1739hy0) {
        AbstractC1474fG.j(interfaceC1739hy0, "youTubePlayer");
        String str = this.a;
        if (str != null) {
            if (this.b.m.getCanPlay$core_release() && this.c) {
                ny0 ny0Var = (ny0) interfaceC1739hy0;
                ny0Var.a(ny0Var.a, "loadVideo", str, Float.valueOf(0.0f));
            } else {
                ny0 ny0Var2 = (ny0) interfaceC1739hy0;
                ny0Var2.a(ny0Var2.a, "cueVideo", str, Float.valueOf(0.0f));
            }
        }
        ((ny0) interfaceC1739hy0).c.remove(this);
    }
}
