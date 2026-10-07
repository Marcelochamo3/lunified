package o;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: o.ag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1018ag extends Activity implements InterfaceC1283dK, InterfaceC2740sI {
    public final C1478fK l = new C1478fK(this);

    @Override // o.InterfaceC2740sI
    public final boolean b(KeyEvent keyEvent) {
        AbstractC1474fG.j(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC1474fG.j(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC1474fG.i(decorView, "window.decorView");
        if (AbstractC2506pt.l(decorView, keyEvent)) {
            return true;
        }
        return AbstractC2506pt.m(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        AbstractC1474fG.j(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC1474fG.i(decorView, "window.decorView");
        if (AbstractC2506pt.l(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = FragmentC1561g70.m;
        AbstractC1474fG.C(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC1474fG.j(bundle, "outState");
        this.l.g(TJ.n);
        super.onSaveInstanceState(bundle);
    }
}
