package o;

import android.widget.AbsListView;

/* JADX INFO: renamed from: o.Mo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0609Mo {
    public static boolean a(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }

    public static void b(AbsListView absListView, boolean z) {
        absListView.setSelectedChildViewEnabled(z);
    }
}
