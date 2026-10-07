package androidx.leanback.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class LeanbackSettingsRootView extends FrameLayout {
    public View.OnKeyListener l;

    public LeanbackSettingsRootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View.OnKeyListener onKeyListener;
        return ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 4 || (onKeyListener = this.l) == null) ? false : onKeyListener.onKey(this, keyEvent.getKeyCode(), keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public void setOnBackKeyListener(View.OnKeyListener onKeyListener) {
        this.l = onKeyListener;
    }
}
