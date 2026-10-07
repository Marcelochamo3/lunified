package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;
import com.skidush.clonex.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class VN {
    public static final boolean u;
    public static final boolean v;
    public final MaterialButton a;
    public C1891jd0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public boolean q;
    public LayerDrawable s;
    public int t;
    public boolean n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f573o = false;
    public boolean p = false;
    public boolean r = true;

    static {
        int i = Build.VERSION.SDK_INT;
        u = true;
        v = i <= 22;
    }

    public VN(MaterialButton materialButton, C1891jd0 c1891jd0) {
        this.a = materialButton;
        this.b = c1891jd0;
    }

    public final InterfaceC2862td0 a() {
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.s.getNumberOfLayers() > 2 ? (InterfaceC2862td0) this.s.getDrawable(2) : (InterfaceC2862td0) this.s.getDrawable(1);
    }

    public final C2068lO b(boolean z) {
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return u ? (C2068lO) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0) : (C2068lO) this.s.getDrawable(!z ? 1 : 0);
    }

    public final void c(C1891jd0 c1891jd0) {
        this.b = c1891jd0;
        if (!v || this.f573o) {
            if (b(false) != null) {
                b(false).setShapeAppearanceModel(c1891jd0);
            }
            if (b(true) != null) {
                b(true).setShapeAppearanceModel(c1891jd0);
            }
            if (a() != null) {
                a().setShapeAppearanceModel(c1891jd0);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = It0.a;
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        e();
        materialButton.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
    }

    public final void d(int i, int i2) {
        WeakHashMap weakHashMap = It0.a;
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.f573o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e() {
        Drawable insetDrawable;
        C2068lO c2068lO = new C2068lO(this.b);
        MaterialButton materialButton = this.a;
        c2068lO.j(materialButton.getContext());
        AbstractC2205mo.h(c2068lO, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            AbstractC2205mo.i(c2068lO, mode);
        }
        float f = this.h;
        ColorStateList colorStateList = this.k;
        c2068lO.l.k = f;
        c2068lO.invalidateSelf();
        C1970kO c1970kO = c2068lO.l;
        if (c1970kO.d != colorStateList) {
            c1970kO.d = colorStateList;
            c2068lO.onStateChange(c2068lO.getState());
        }
        C2068lO c2068lO2 = new C2068lO(this.b);
        c2068lO2.setTint(0);
        float f2 = this.h;
        int iO = this.n ? UK.o(materialButton, R.attr.colorSurface) : 0;
        c2068lO2.l.k = f2;
        c2068lO2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iO);
        C1970kO c1970kO2 = c2068lO2.l;
        if (c1970kO2.d != colorStateListValueOf) {
            c1970kO2.d = colorStateListValueOf;
            c2068lO2.onStateChange(c2068lO2.getState());
        }
        if (u) {
            C2068lO c2068lO3 = new C2068lO(this.b);
            this.m = c2068lO3;
            AbstractC2205mo.g(c2068lO3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(AbstractC1376eG.D(this.l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c2068lO2, c2068lO}), this.c, this.e, this.d, this.f), this.m);
            this.s = rippleDrawable;
            insetDrawable = rippleDrawable;
        } else {
            C2068lO c2068lO4 = new C2068lO(this.b);
            B80 b80 = new B80();
            b80.a = c2068lO4;
            b80.b = false;
            C80 c80 = new C80(b80);
            this.m = c80;
            AbstractC2205mo.h(c80, AbstractC1376eG.D(this.l));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c2068lO2, c2068lO, this.m});
            this.s = layerDrawable;
            insetDrawable = new InsetDrawable((Drawable) layerDrawable, this.c, this.e, this.d, this.f);
        }
        materialButton.setInternalBackground(insetDrawable);
        C2068lO c2068lOB = b(false);
        if (c2068lOB != null) {
            c2068lOB.k(this.t);
            c2068lOB.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        C2068lO c2068lOB = b(false);
        C2068lO c2068lOB2 = b(true);
        if (c2068lOB != null) {
            float f = this.h;
            ColorStateList colorStateList = this.k;
            c2068lOB.l.k = f;
            c2068lOB.invalidateSelf();
            C1970kO c1970kO = c2068lOB.l;
            if (c1970kO.d != colorStateList) {
                c1970kO.d = colorStateList;
                c2068lOB.onStateChange(c2068lOB.getState());
            }
            if (c2068lOB2 != null) {
                float f2 = this.h;
                int iO = this.n ? UK.o(this.a, R.attr.colorSurface) : 0;
                c2068lOB2.l.k = f2;
                c2068lOB2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iO);
                C1970kO c1970kO2 = c2068lOB2.l;
                if (c1970kO2.d != colorStateListValueOf) {
                    c1970kO2.d = colorStateListValueOf;
                    c2068lOB2.onStateChange(c2068lOB2.getState());
                }
            }
        }
    }
}
