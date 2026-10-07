package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import o.T40;

/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public final int l;
    public final int m;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, T40.t);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.l = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
