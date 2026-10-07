package o;

import android.view.ActionProvider;

/* JADX INFO: renamed from: o.fQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC1484fQ implements ActionProvider.VisibilityListener {
    public C0334By a;
    public final ActionProvider b;
    public final /* synthetic */ MenuItemC1778iQ c;

    public ActionProviderVisibilityListenerC1484fQ(MenuItemC1778iQ menuItemC1778iQ, ActionProvider actionProvider) {
        this.c = menuItemC1778iQ;
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        C0334By c0334By = this.a;
        if (c0334By != null) {
            ZP zp = ((C1386eQ) c0334By.m).n;
            zp.h = true;
            zp.p(true);
        }
    }
}
