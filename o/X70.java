package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class X70 {
    public final /* synthetic */ int a;

    public /* synthetic */ X70(int i) {
        this.a = i;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute == null) {
                    return null;
                }
                try {
                    Drawable drawable = (Drawable) X70.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    AbstractC0445Gf.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception unused) {
                    return null;
                }
            case 1:
                try {
                    return V2.e(context, context.getResources(), xmlResourceParser, attributeSet, theme);
                } catch (Exception unused2) {
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    Z2 z2 = new Z2(context);
                    z2.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return z2;
                } catch (Exception unused3) {
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    C2795ss0 c2795ss0 = new C2795ss0();
                    c2795ss0.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return c2795ss0;
                } catch (Exception unused4) {
                    return null;
                }
        }
    }
}
