package o;

import android.view.View;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class py0 {
    public final /* synthetic */ YouTubePlayerView a;

    public py0(YouTubePlayerView youTubePlayerView) {
        this.a = youTubePlayerView;
    }

    public final void a(View view, io.sentry.android.replay.f fVar) {
        AbstractC1474fG.j(view, "fullscreenView");
        YouTubePlayerView youTubePlayerView = this.a;
        if (youTubePlayerView.l.isEmpty()) {
            throw new IllegalStateException("To enter fullscreen you need to first register a FullscreenListener.");
        }
        Iterator it = youTubePlayerView.l.iterator();
        while (it.hasNext()) {
            ((py0) it.next()).a(view, fVar);
        }
    }

    public final void b() {
        YouTubePlayerView youTubePlayerView = this.a;
        if (youTubePlayerView.l.isEmpty()) {
            throw new IllegalStateException("To enter fullscreen you need to first register a FullscreenListener.");
        }
        Iterator it = youTubePlayerView.l.iterator();
        while (it.hasNext()) {
            ((py0) it.next()).b();
        }
    }
}
