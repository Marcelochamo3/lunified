package o;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: o.gQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1582gQ extends FrameLayout implements InterfaceC0833Ve {
    public final CollapsibleActionView l;

    /* JADX WARN: Multi-variable type inference failed */
    public C1582gQ(View view) {
        super(view.getContext());
        this.l = (CollapsibleActionView) view;
        addView(view);
    }
}
