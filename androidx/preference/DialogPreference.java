package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.skidush.clonex.R;
import o.AbstractC1370eA;
import o.D40;
import o.S20;

/* JADX INFO: loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public final CharSequence Y;
    public final String Z;
    public final Drawable a0;
    public final String b0;
    public final String c0;
    public final int d0;

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D40.c, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(9);
        string = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        this.Y = string;
        if (string == null) {
            this.Y = this.s;
        }
        String string2 = typedArrayObtainStyledAttributes.getString(8);
        this.Z = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.a0 = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = typedArrayObtainStyledAttributes.getString(11);
        this.b0 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        String string4 = typedArrayObtainStyledAttributes.getString(10);
        this.c0 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        this.d0 = typedArrayObtainStyledAttributes.getResourceId(7, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void m() {
        S20 s20 = this.m.i;
        if (s20 != null) {
            s20.Z(this);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1370eA.q(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
