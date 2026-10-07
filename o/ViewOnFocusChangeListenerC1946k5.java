package o;

import android.view.View;

/* JADX INFO: renamed from: o.k5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC1946k5 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;

    public /* synthetic */ ViewOnFocusChangeListenerC1946k5(int i) {
        this.a = i;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                view.setSelected(z);
                break;
            default:
                view.animate().cancel();
                view.animate().scaleX(z ? 1.07f : 1.0f).scaleY(z ? 1.07f : 1.0f).translationZ(z ? view.getResources().getDisplayMetrics().density * 10.0f : 0.0f).setDuration(120L).start();
                break;
        }
    }
}
