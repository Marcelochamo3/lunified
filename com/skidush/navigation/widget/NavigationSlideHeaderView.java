package com.skidush.navigation.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import o.AbstractC1474fG;
import o.InterfaceC0360Cy;

/* JADX INFO: loaded from: classes.dex */
public final class NavigationSlideHeaderView extends ConstraintLayout {
    public InterfaceC0360Cy D;
    public InterfaceC0360Cy E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationSlideHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC1474fG.j(context, "context");
    }

    public final void setOnCloseListener(InterfaceC0360Cy interfaceC0360Cy) {
        AbstractC1474fG.j(interfaceC0360Cy, "onClose");
        this.E = interfaceC0360Cy;
    }

    public final void setOnOpenListener(InterfaceC0360Cy interfaceC0360Cy) {
        AbstractC1474fG.j(interfaceC0360Cy, "onOpen");
        this.D = interfaceC0360Cy;
    }
}
