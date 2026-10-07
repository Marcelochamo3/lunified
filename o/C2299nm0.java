package o;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.skidush.clonex.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.nm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2299nm0 extends DialogInterfaceOnCancelListenerC0348Cm {
    public Na0 B0;

    @Override // o.AbstractComponentCallbacksC1247cx
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC1474fG.j(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_trailer, viewGroup, false);
        int i = R.id.iv_close;
        ImageView imageView = (ImageView) Sr0.g(viewInflate, R.id.iv_close);
        if (imageView != null) {
            i = R.id.youtube_player_view;
            YouTubePlayerView youTubePlayerView = (YouTubePlayerView) Sr0.g(viewInflate, R.id.youtube_player_view);
            if (youTubePlayerView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.B0 = new Na0(constraintLayout, imageView, youTubePlayerView, 23);
                AbstractC1474fG.i(constraintLayout, "getRoot(...)");
                return constraintLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // o.DialogInterfaceOnCancelListenerC0348Cm, o.AbstractComponentCallbacksC1247cx
    public final void B() {
        super.B();
        Na0 na0 = this.B0;
        AbstractC1474fG.g(na0);
        ((YouTubePlayerView) na0.f414o).b();
        this.B0 = null;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void K(View view, Bundle bundle) {
        AbstractC1474fG.j(view, "view");
        Bundle bundle2 = this.q;
        String strGroup = null;
        String string = bundle2 != null ? bundle2.getString("trailer_url") : null;
        if (string != null) {
            Matcher matcher = Pattern.compile("(?<=watch\\?v=|/videos/|embed\\/|youtu.be\\/|\\/v\\/|\\/e\\/|watch\\?v%3D|watch\\?feature=player_embedded&v=|%2Fvideos%2F|embed%\u200c\u200b2F|youtu.be%2F|%2Fv%2F)[^#\\&\\?\\n]*").matcher(string);
            if (matcher.find()) {
                strGroup = matcher.group();
            }
        }
        if (strGroup != null) {
            C1478fK c1478fK = this.b0;
            Na0 na0 = this.B0;
            AbstractC1474fG.g(na0);
            YouTubePlayerView youTubePlayerView = (YouTubePlayerView) na0.f414o;
            AbstractC1474fG.i(youTubePlayerView, "youtubePlayerView");
            c1478fK.a(youTubePlayerView);
            Na0 na1 = this.B0;
            AbstractC1474fG.g(na1);
            NJ nj = new NJ(2, strGroup);
            YouTubePlayerView youTubePlayerView2 = (YouTubePlayerView) na1.f414o;
            youTubePlayerView2.getClass();
            youTubePlayerView2.m.getWebViewYouTubePlayer$core_release().m.c.add(nj);
        } else {
            W(false, false);
        }
        Na0 na2 = this.B0;
        AbstractC1474fG.g(na2);
        final int i = 0;
        ((ImageView) na2.n).setOnClickListener(new View.OnClickListener(this) { // from class: o.mm0
            public final /* synthetic */ C2299nm0 m;

            {
                this.m = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        C2299nm0 c2299nm0 = this.m;
                        AbstractC1474fG.j(c2299nm0, "this$0");
                        c2299nm0.W(false, false);
                        break;
                    default:
                        C2299nm0 c2299nm1 = this.m;
                        AbstractC1474fG.j(c2299nm1, "this$0");
                        c2299nm1.W(false, false);
                        break;
                }
            }
        });
        Na0 na3 = this.B0;
        AbstractC1474fG.g(na3);
        final int i2 = 1;
        ((ConstraintLayout) na3.m).setOnClickListener(new View.OnClickListener(this) { // from class: o.mm0
            public final /* synthetic */ C2299nm0 m;

            {
                this.m = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i2) {
                    case 0:
                        C2299nm0 c2299nm0 = this.m;
                        AbstractC1474fG.j(c2299nm0, "this$0");
                        c2299nm0.W(false, false);
                        break;
                    default:
                        C2299nm0 c2299nm1 = this.m;
                        AbstractC1474fG.j(c2299nm1, "this$0");
                        c2299nm1.W(false, false);
                        break;
                }
            }
        });
    }

    @Override // o.DialogInterfaceOnCancelListenerC0348Cm, o.AbstractComponentCallbacksC1247cx
    public final void z(Bundle bundle) {
        super.z(bundle);
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        this.p0 = 1;
        this.q0 = android.R.style.Theme.Translucent.NoTitleBar;
    }
}
