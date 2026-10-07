package o;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: o.Qp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0714Qp implements KeyListener {
    public final KeyListener a;
    public final C0622Nb b;

    public C0714Qp(KeyListener keyListener) {
        C0622Nb c0622Nb = new C0622Nb(15);
        this.a = keyListener;
        this.b = c0622Nb;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean zT;
        boolean z;
        this.b.getClass();
        if (i != 67) {
            zT = i != 112 ? false : Na0.t(editable, keyEvent, true);
        } else {
            zT = Na0.t(editable, keyEvent, false);
        }
        if (zT) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z = true;
        } else {
            z = false;
        }
        return z || this.a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, i, keyEvent);
    }
}
