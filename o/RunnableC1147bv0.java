package o;

import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: o.bv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1147bv0 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ ViewGroup m;

    public /* synthetic */ RunnableC1147bv0(ViewGroup viewGroup, int i) {
        this.l = i;
        this.m = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                ((WebView) this.m).destroy();
                break;
            default:
                ((TextInputLayout) this.m).f45o.requestLayout();
                break;
        }
    }
}
