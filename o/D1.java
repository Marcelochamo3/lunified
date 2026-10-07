package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class D1 extends TT {
    public Intent w;
    public String x;

    public static String i(Context context, String str) {
        if (str == null) {
            return null;
        }
        String packageName = context.getPackageName();
        AbstractC1474fG.i(packageName, "context.packageName");
        return AbstractC1899jh0.R(str, "${applicationId}", packageName, false);
    }

    @Override // o.TT
    public final boolean equals(Object obj) {
        boolean zFilterEquals;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof D1) && super.equals(obj)) {
            Intent intent = this.w;
            if (intent != null) {
                zFilterEquals = intent.filterEquals(((D1) obj).w);
            } else {
                zFilterEquals = ((D1) obj).w == null;
            }
            if (zFilterEquals && AbstractC1474fG.b(this.x, ((D1) obj).x)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.TT
    public final void h(Context context, AttributeSet attributeSet) {
        AbstractC1474fG.j(context, "context");
        super.h(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R40.a);
        AbstractC1474fG.i(typedArrayObtainAttributes, "context.resources.obtain…leable.ActivityNavigator)");
        String strI = i(context, typedArrayObtainAttributes.getString(4));
        if (this.w == null) {
            this.w = new Intent();
        }
        Intent intent = this.w;
        AbstractC1474fG.g(intent);
        intent.setPackage(strI);
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = context.getPackageName() + string;
            }
            ComponentName componentName = new ComponentName(context, string);
            if (this.w == null) {
                this.w = new Intent();
            }
            Intent intent2 = this.w;
            AbstractC1474fG.g(intent2);
            intent2.setComponent(componentName);
        }
        String string2 = typedArrayObtainAttributes.getString(1);
        if (this.w == null) {
            this.w = new Intent();
        }
        Intent intent3 = this.w;
        AbstractC1474fG.g(intent3);
        intent3.setAction(string2);
        String strI2 = i(context, typedArrayObtainAttributes.getString(2));
        if (strI2 != null) {
            Uri uri = Uri.parse(strI2);
            if (this.w == null) {
                this.w = new Intent();
            }
            Intent intent4 = this.w;
            AbstractC1474fG.g(intent4);
            intent4.setData(uri);
        }
        this.x = i(context, typedArrayObtainAttributes.getString(3));
        typedArrayObtainAttributes.recycle();
    }

    @Override // o.TT
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Intent intent = this.w;
        int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.x;
        return iFilterHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // o.TT
    public final String toString() {
        Intent intent = this.w;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (component != null) {
            sb.append(" class=");
            sb.append(component.getClassName());
        } else {
            Intent intent2 = this.w;
            String action = intent2 != null ? intent2.getAction() : null;
            if (action != null) {
                sb.append(" action=");
                sb.append(action);
            }
        }
        String string = sb.toString();
        AbstractC1474fG.i(string, "sb.toString()");
        return string;
    }
}
