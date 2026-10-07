package o;

import com.skidush.clonex.R;
import com.skidush.clonex.activities.main.MainMobileActivity;
import com.skidush.clonex.activities.main.MainTvActivity;

/* JADX INFO: loaded from: classes.dex */
public final class KM extends WV {
    public final /* synthetic */ int d;
    public final /* synthetic */ YT e;
    public final /* synthetic */ AbstractActivityC1540fx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KM(YT yt, AbstractActivityC1540fx abstractActivityC1540fx, int i) {
        super(true);
        this.d = i;
        this.e = yt;
        this.f = abstractActivityC1540fx;
    }

    @Override // o.WV
    public final void b() {
        switch (this.d) {
            case 0:
                YT yt = this.e;
                TT ttH = yt.h();
                MainMobileActivity mainMobileActivity = (MainMobileActivity) this.f;
                if (ttH != null && ttH.s == R.id.home) {
                    MainMobileActivity.w(mainMobileActivity);
                } else {
                    boolean zQ = yt.q();
                    Boolean boolValueOf = Boolean.valueOf(zQ);
                    if (!(!zQ)) {
                        boolValueOf = null;
                    }
                    if (boolValueOf != null) {
                        MainMobileActivity.w(mainMobileActivity);
                    }
                }
                break;
            default:
                YT yt2 = this.e;
                TT ttH2 = yt2.h();
                MainTvActivity mainTvActivity = (MainTvActivity) this.f;
                if (ttH2 != null && ttH2.s == R.id.home) {
                    MainTvActivity.w(mainTvActivity);
                } else {
                    boolean zQ2 = yt2.q();
                    Boolean boolValueOf2 = Boolean.valueOf(zQ2);
                    if (!(!zQ2)) {
                        boolValueOf2 = null;
                    }
                    if (boolValueOf2 != null) {
                        MainTvActivity.w(mainTvActivity);
                    }
                }
                break;
        }
    }
}
