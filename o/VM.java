package o;

import android.widget.TextView;
import com.skidush.clonex.activities.main.MainTvActivity;

/* JADX INFO: loaded from: classes.dex */
public final class VM extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ C1583gR n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MainTvActivity f572o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VM(C1583gR c1583gR, MainTvActivity mainTvActivity, int i) {
        super(0);
        this.m = i;
        this.n = c1583gR;
        this.f572o = mainTvActivity;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        switch (this.m) {
            case 0:
                C1583gR c1583gR = this.n;
                ((TextView) c1583gR.p).setVisibility(0);
                ((TextView) c1583gR.f793o).setVisibility(0);
                TextView textView = this.f572o.O;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                break;
            default:
                C1583gR c1583gR2 = this.n;
                ((TextView) c1583gR2.p).setVisibility(8);
                ((TextView) c1583gR2.f793o).setVisibility(8);
                TextView textView2 = this.f572o.O;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                break;
        }
        return C2985uq0.a;
    }
}
