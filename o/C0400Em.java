package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: o.Em, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0400Em extends TT implements InterfaceC1342dw {
    public String w;

    @Override // o.TT
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof C0400Em) && super.equals(obj) && AbstractC1474fG.b(this.w, ((C0400Em) obj).w);
    }

    @Override // o.TT
    public final void h(Context context, AttributeSet attributeSet) {
        AbstractC1474fG.j(context, "context");
        super.h(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C40.a);
        AbstractC1474fG.i(typedArrayObtainAttributes, "context.resources.obtain….DialogFragmentNavigator)");
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            this.w = string;
        }
        typedArrayObtainAttributes.recycle();
    }

    @Override // o.TT
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.w;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
