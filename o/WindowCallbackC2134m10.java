package o;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.exoplayer2.ui.PlayerView;
import com.skidush.clonex.fragments.player.PlayerTvFragment;

/* JADX INFO: renamed from: o.m10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class WindowCallbackC2134m10 implements Window.Callback {
    public final /* synthetic */ Window.Callback l;
    public final /* synthetic */ Window.Callback m;
    public final /* synthetic */ PlayerTvFragment n;

    public WindowCallbackC2134m10(Window.Callback callback, PlayerTvFragment playerTvFragment) {
        this.m = callback;
        this.n = playerTvFragment;
        this.l = callback;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.l.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        PlayerTvFragment playerTvFragment;
        C0560Kq c0560Kq;
        PlayerView playerView;
        AbstractC1474fG.j(keyEvent, "event");
        if (keyEvent.getAction() == 0 && ((c0560Kq = (playerTvFragment = this.n).z0) == null || (playerView = (PlayerView) c0560Kq.p) == null || !playerView.b())) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                AbstractC1376eG.w(AbstractC1459f50.y(playerTvFragment.q()), null, 0, new C2037l10(playerTvFragment, null), 3);
                return true;
            }
            if (keyCode == 22) {
                AbstractC1376eG.w(AbstractC1459f50.y(playerTvFragment.q()), null, 0, new C1939k10(playerTvFragment, null), 3);
                return true;
            }
        }
        return this.m.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.l.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.l.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.l.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.l.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.l.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.l.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.l.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        this.l.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        AbstractC1474fG.j(menu, "p1");
        return this.l.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.l.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.l.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        AbstractC1474fG.j(menuItem, "p1");
        return this.l.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        AbstractC1474fG.j(menu, "p1");
        return this.l.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        AbstractC1474fG.j(menu, "p1");
        this.l.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        AbstractC1474fG.j(menu, "p2");
        return this.l.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.l.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.l.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.l.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.l.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.l.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.l.onWindowStartingActionMode(callback, i);
    }
}
