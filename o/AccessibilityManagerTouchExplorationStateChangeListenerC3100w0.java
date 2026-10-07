package o;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC3100w0 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final C2278nc a;

    public AccessibilityManagerTouchExplorationStateChangeListenerC3100w0(C2278nc c2278nc) {
        this.a = c2278nc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC3100w0) {
            return this.a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC3100w0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        C0869Wo c0869Wo = (C0869Wo) this.a.m;
        AutoCompleteTextView autoCompleteTextView = c0869Wo.h;
        if (autoCompleteTextView == null || Ou0.q(autoCompleteTextView)) {
            return;
        }
        int i = z ? 2 : 1;
        WeakHashMap weakHashMap = It0.a;
        c0869Wo.d.setImportantForAccessibility(i);
    }
}
