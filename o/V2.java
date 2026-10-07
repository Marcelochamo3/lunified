package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class V2 extends AbstractC2399oo implements Pj0 {
    public S2 A;
    public Jp0 B;
    public int C;
    public int D;
    public boolean E;
    public S2 y;
    public boolean z;

    public V2(S2 s2, Resources resources) {
        this.p = 255;
        this.r = -1;
        this.C = -1;
        this.D = -1;
        d(new S2(s2, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static V2 e(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int next;
        int next2;
        Context context2 = context;
        Resources resources2 = resources;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        String name = xmlResourceParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        V2 v2 = new V2(null, null);
        TypedArray typedArrayG = AbstractC1370eA.G(resources2, theme, attributeSet, K40.a);
        int i = 1;
        v2.setVisible(typedArrayG.getBoolean(1, true), true);
        S2 s2 = v2.A;
        s2.d |= AbstractC0445Gf.b(typedArrayG);
        int i2 = 2;
        s2.i = typedArrayG.getBoolean(2, s2.i);
        int i3 = 3;
        s2.l = typedArrayG.getBoolean(3, s2.l);
        s2.y = typedArrayG.getInt(4, s2.y);
        s2.z = typedArrayG.getInt(5, s2.z);
        boolean z = false;
        v2.setDither(typedArrayG.getBoolean(0, s2.w));
        S2 s3 = v2.l;
        if (resources2 != null) {
            s3.b = resources2;
            int i4 = resources.getDisplayMetrics().densityDpi;
            if (i4 == 0) {
                i4 = 160;
            }
            int i5 = s3.c;
            s3.c = i4;
            if (i5 != i4) {
                s3.m = false;
                s3.j = false;
            }
        } else {
            s3.getClass();
        }
        typedArrayG.recycle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next3 = xmlResourceParser.next();
            if (next3 == i || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i3)) {
                break;
            }
            if (next3 == i2 && depth <= depth2) {
                if (xmlResourceParser.getName().equals("item")) {
                    TypedArray typedArrayG2 = AbstractC1370eA.G(resources2, theme, attributeSet, K40.b);
                    int resourceId = typedArrayG2.getResourceId(z ? 1 : 0, z ? 1 : 0);
                    int resourceId2 = typedArrayG2.getResourceId(i, -1);
                    Drawable drawableF = resourceId2 > 0 ? Y70.d().f(context2, resourceId2) : null;
                    typedArrayG2.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i6 = 0;
                    for (int i7 = 0; i7 < attributeCount; i7++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i7);
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i8 = i6 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i7, z)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i6] = attributeNameResource;
                            i6 = i8;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i6);
                    if (drawableF == null) {
                        do {
                            next2 = xmlResourceParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("vector")) {
                            drawableF = new C2795ss0();
                            drawableF.inflate(resources2, xmlResourceParser2, attributeSet, theme);
                        } else {
                            drawableF = AbstractC0445Gf.a(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (drawableF == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    S2 s4 = v2.A;
                    int iA = s4.a(drawableF);
                    s4.H[iA] = iArrTrimStateSet;
                    s4.J.g(iA, Integer.valueOf(resourceId));
                } else {
                    if (xmlResourceParser.getName().equals("transition")) {
                        TypedArray typedArrayG3 = AbstractC1370eA.G(resources2, theme, attributeSet, K40.c);
                        int resourceId3 = typedArrayG3.getResourceId(2, -1);
                        int resourceId4 = typedArrayG3.getResourceId(1, -1);
                        int resourceId5 = typedArrayG3.getResourceId(z ? 1 : 0, -1);
                        Drawable drawableF2 = resourceId5 > 0 ? Y70.d().f(context2, resourceId5) : null;
                        boolean z2 = typedArrayG3.getBoolean(3, z);
                        typedArrayG3.recycle();
                        if (drawableF2 == null) {
                            do {
                                next = xmlResourceParser.next();
                            } while (next == 4);
                            if (next != 2) {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                            if (xmlResourceParser.getName().equals("animated-vector")) {
                                drawableF2 = new Z2(context2);
                                drawableF2.inflate(resources2, xmlResourceParser2, attributeSet, theme);
                            } else {
                                drawableF2 = AbstractC0445Gf.a(resources, xmlResourceParser, attributeSet, theme);
                            }
                        }
                        if (drawableF2 == null) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (resourceId3 == -1 || resourceId4 == -1) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
                        }
                        S2 s5 = v2.A;
                        int iA2 = s5.a(drawableF2);
                        long j = resourceId3;
                        long j2 = resourceId4;
                        long j3 = (j << 32) | j2;
                        long j4 = z2 ? 8589934592L : 0L;
                        long j5 = iA2;
                        s5.I.b(j3, Long.valueOf(j5 | j4));
                        if (z2) {
                            s5.I.b((j2 << 32) | j, Long.valueOf(j5 | 4294967296L | j4));
                        }
                        context2 = context;
                        resources2 = resources;
                        xmlResourceParser2 = xmlResourceParser;
                        i = 1;
                        z = false;
                    } else {
                        context2 = context;
                        resources2 = resources;
                        xmlResourceParser2 = xmlResourceParser;
                    }
                    i2 = 2;
                    i3 = 3;
                }
                i = 1;
                i2 = 2;
                i3 = 3;
            }
        }
        v2.onStateChange(v2.getState());
        return v2;
    }

    @Override // o.AbstractC2399oo, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // o.AbstractC2399oo
    public final void d(S2 s2) {
        this.l = s2;
        int i = this.r;
        if (i >= 0) {
            Drawable drawableD = s2.d(i);
            this.n = drawableD;
            if (drawableD != null) {
                b(drawableD);
            }
        }
        this.f952o = null;
        this.y = s2;
        this.A = s2;
    }

    public final Drawable f() {
        if (!this.z) {
            super.mutate();
            S2 s2 = this.y;
            s2.I = s2.I.clone();
            s2.J = s2.J.clone();
            this.z = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // o.AbstractC2399oo, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        Jp0 jp0 = this.B;
        if (jp0 != null) {
            jp0.M();
            this.B = null;
            c(this.C);
            this.C = -1;
            this.D = -1;
        }
    }

    @Override // o.AbstractC2399oo, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.E) {
            f();
            S2 s2 = this.A;
            s2.I = s2.I.clone();
            s2.J = s2.J.clone();
            this.E = true;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int iE;
        Jp0 r2;
        S2 s2 = this.A;
        int iF = s2.f(iArr);
        if (iF < 0) {
            iF = s2.f(StateSet.WILD_CARD);
        }
        int i = this.r;
        boolean z = false;
        if (iF != i) {
            Jp0 jp0 = this.B;
            if (jp0 == null) {
                this.B = null;
                this.D = -1;
                this.C = -1;
                S2 s3 = this.A;
                int iE2 = s3.e(i);
                iE = s3.e(iF);
                if (iE == 0 && iE2 != 0) {
                    long j = ((long) iE) | (((long) iE2) << 32);
                    int iLongValue = (int) ((Long) s3.I.g(j)).longValue();
                    if (iLongValue >= 0) {
                        boolean z2 = (((Long) s3.I.g(j)).longValue() & 8589934592L) != 0;
                        c(iLongValue);
                        Object obj = this.n;
                        if (obj instanceof AnimationDrawable) {
                            r2 = new T2((AnimationDrawable) obj, (((Long) s3.I.g(j)).longValue() & 4294967296L) != 0, z2);
                        } else if (obj instanceof Z2) {
                            r2 = new R2((Z2) obj, 1);
                        } else if (obj instanceof Animatable) {
                            r2 = new R2((Animatable) obj, 0);
                        } else if (c(iF)) {
                            z = true;
                        }
                        r2.L();
                        this.B = r2;
                        this.D = i;
                        this.C = iF;
                        z = true;
                    } else if (c(iF)) {
                        z = true;
                    }
                } else if (c(iF)) {
                    z = true;
                }
            } else {
                if (iF != this.C) {
                    if (iF == this.D && jp0.e()) {
                        jp0.J();
                        this.C = this.D;
                        this.D = iF;
                    } else {
                        i = this.C;
                        jp0.M();
                        this.B = null;
                        this.D = -1;
                        this.C = -1;
                        S2 s4 = this.A;
                        int iE3 = s4.e(i);
                        iE = s4.e(iF);
                        if (iE == 0) {
                            if (c(iF)) {
                            }
                        } else if (c(iF)) {
                        }
                    }
                }
                z = true;
            }
        }
        Drawable drawable = this.n;
        return drawable != null ? z | drawable.setState(iArr) : z;
    }

    @Override // o.AbstractC2399oo, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Jp0 jp0 = this.B;
        if (jp0 != null && (visible || z2)) {
            if (z) {
                jp0.L();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
