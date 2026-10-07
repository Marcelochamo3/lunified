package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class K3 {
    public Parcelable a;
    public Object b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final Object f;

    public /* synthetic */ K3(TextView textView) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = false;
        this.f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f;
        Drawable drawableO = AbstractC3045vW.o(compoundButton);
        if (drawableO != null) {
            if (this.c || this.d) {
                Drawable drawableMutate = AbstractC3045vW.R(drawableO).mutate();
                if (this.c) {
                    AbstractC2205mo.h(drawableMutate, (ColorStateList) this.a);
                }
                if (this.d) {
                    AbstractC2205mo.i(drawableMutate, (PorterDuff.Mode) this.b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        CheckedTextView checkedTextView = (CheckedTextView) this.f;
        Drawable checkMarkDrawable = checkedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.c || this.d) {
                Drawable drawableMutate = AbstractC3045vW.R(checkMarkDrawable).mutate();
                if (this.c) {
                    AbstractC2205mo.h(drawableMutate, (ColorStateList) this.a);
                }
                if (this.d) {
                    AbstractC2205mo.i(drawableMutate, (PorterDuff.Mode) this.b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(checkedTextView.getDrawableState());
                }
                checkedTextView.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = (Bundle) this.a;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.a;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.a;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.a = null;
        }
        return bundle2;
    }

    public J90 d() {
        String str;
        J90 j90;
        Iterator it = ((C3022v90) this.f).iterator();
        do {
            C2634r90 c2634r90 = (C2634r90) it;
            if (!c2634r90.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) c2634r90.next();
            AbstractC1474fG.i(entry, "components");
            str = (String) entry.getKey();
            j90 = (J90) entry.getValue();
        } while (!AbstractC1474fG.b(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return j90;
    }

    public void e(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f;
        Context context = compoundButton.getContext();
        int[] iArr = T40.m;
        RN rnY = RN.y(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = (TypedArray) rnY.n;
        It0.o(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) rnY.n, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(Ou0.l(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(Ou0.l(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(Ou0.l(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                AbstractC1604gg.c(compoundButton, rnY.s(2));
            }
            if (typedArray.hasValue(3)) {
                AbstractC1604gg.d(compoundButton, AbstractC3077vo.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            rnY.A();
        }
    }

    public void f(String str, J90 j90) {
        Object obj;
        AbstractC1474fG.j(str, "key");
        AbstractC1474fG.j(j90, "provider");
        C3022v90 c3022v90 = (C3022v90) this.f;
        C2731s90 c2731s90A = c3022v90.a(str);
        if (c2731s90A != null) {
            obj = c2731s90A.m;
        } else {
            C2731s90 c2731s90 = new C2731s90(str, j90);
            c3022v90.f1071o++;
            C2731s90 c2731s91 = c3022v90.m;
            if (c2731s91 == null) {
                c3022v90.l = c2731s90;
                c3022v90.m = c2731s90;
            } else {
                c2731s91.n = c2731s90;
                c2731s90.f1020o = c2731s91;
                c3022v90.m = c2731s90;
            }
            obj = null;
        }
        if (((J90) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public void g() {
        if (!this.e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        C3 c3 = (C3) this.b;
        if (c3 == null) {
            c3 = new C3(this);
        }
        this.b = c3;
        try {
            MJ.class.getDeclaredConstructor(null);
            C3 c4 = (C3) this.b;
            if (c4 != null) {
                ((LinkedHashSet) c4.b).add(MJ.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + MJ.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public K3() {
        this.f = new C3022v90();
        this.e = true;
    }
}
