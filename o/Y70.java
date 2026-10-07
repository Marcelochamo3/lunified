package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import com.skidush.clonex.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class Y70 {
    public static Y70 i;
    public WeakHashMap a;
    public Nd0 b;
    public C2866tf0 c;
    public final WeakHashMap d = new WeakHashMap(0);
    public TypedValue e;
    public boolean f;
    public C1750i4 g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final W70 j = new W70(6);

    public static synchronized Y70 d() {
        try {
            if (i == null) {
                Y70 y70 = new Y70();
                i = y70;
                j(y70);
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        W70 w70 = j;
        w70.getClass();
        int i3 = (31 + i2) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) w70.f(Integer.valueOf(mode.hashCode() + i3));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
        }
        return porterDuffColorFilter;
    }

    public static void j(Y70 y70) {
        if (Build.VERSION.SDK_INT < 24) {
            y70.a("vector", new X70(3));
            y70.a("animated-vector", new X70(2));
            y70.a("animated-selector", new X70(1));
            y70.a("drawable", new X70(0));
        }
    }

    public final void a(String str, X70 x70) {
        if (this.b == null) {
            this.b = new Nd0(0);
        }
        this.b.put(str, x70);
    }

    public final synchronized void b(Context context, long j2, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C1480fM c1480fM = (C1480fM) this.d.get(context);
                if (c1480fM == null) {
                    c1480fM = new C1480fM();
                    this.d.put(context, c1480fM);
                }
                c1480fM.j(j2, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i2) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableE = e(j2, context);
        if (drawableE != null) {
            return drawableE;
        }
        LayerDrawable layerDrawableF = null;
        if (this.g != null) {
            if (i2 == R.drawable.abc_cab_background_top_material) {
                layerDrawableF = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i2 == R.drawable.abc_ratingbar_material) {
                layerDrawableF = C1750i4.f(this, context, R.dimen.abc_star_big);
            } else if (i2 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableF = C1750i4.f(this, context, R.dimen.abc_star_medium);
            } else if (i2 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableF = C1750i4.f(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableF != null) {
            layerDrawableF.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j2, layerDrawableF);
        }
        return layerDrawableF;
    }

    public final synchronized Drawable e(long j2, Context context) {
        C1480fM c1480fM = (C1480fM) this.d.get(context);
        if (c1480fM == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c1480fM.e(j2);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iE = Nr0.e(c1480fM.m, c1480fM.f772o, j2);
            if (iE >= 0) {
                Object[] objArr = c1480fM.n;
                Object obj = objArr[iE];
                Object obj2 = AbstractC3045vW.c;
                if (obj != obj2) {
                    objArr[iE] = obj2;
                    c1480fM.l = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i2) {
        return g(context, i2, false);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0184 A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:3:0x0001, B:12:0x0027, B:14:0x002c, B:16:0x0032, B:18:0x0038, B:21:0x0046, B:25:0x0058, B:27:0x005c, B:28:0x0063, B:52:0x00db, B:56:0x00e5, B:58:0x00eb, B:60:0x00f1, B:67:0x010a, B:65:0x0106, B:69:0x0110, B:73:0x0127, B:80:0x015d, B:81:0x0184, B:88:0x0191, B:31:0x007d, B:33:0x0081, B:35:0x008d, B:36:0x0095, B:41:0x00a1, B:43:0x00b4, B:46:0x00c1, B:47:0x00ca, B:48:0x00d1, B:50:0x00d4, B:24:0x0051, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:91:0x0196, B:92:0x019f), top: B:95:0x0001 }] */
    public final synchronized Drawable g(Context context, int i2, boolean z) {
        Drawable drawableB;
        int next;
        try {
            if (!this.f) {
                this.f = true;
                Drawable drawableF = f(context, R.drawable.abc_vector_test);
                if (drawableF == null || (!(drawableF instanceof C2795ss0) && !"android.graphics.drawable.VectorDrawable".equals(drawableF.getClass().getName()))) {
                    this.f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            Nd0 nd0 = this.b;
            Drawable drawable = null;
            mode = null;
            PorterDuff.Mode mode = null;
            if (nd0 == null || nd0.isEmpty()) {
                drawableB = null;
            } else {
                C2866tf0 c2866tf0 = this.c;
                if (c2866tf0 != null) {
                    String str = (String) c2866tf0.d(i2);
                    if ("appcompat_skip_skip".equals(str) || (str != null && this.b.get(str) == null)) {
                        drawableB = null;
                    }
                } else {
                    this.c = new C2866tf0(0);
                }
                if (this.e == null) {
                    this.e = new TypedValue();
                }
                TypedValue typedValue = this.e;
                Resources resources = context.getResources();
                resources.getValue(i2, typedValue, true);
                long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
                drawableB = e(j2, context);
                if (drawableB == null) {
                    CharSequence charSequence = typedValue.string;
                    if (charSequence != null && charSequence.toString().endsWith(".xml")) {
                        try {
                            XmlResourceParser xml = resources.getXml(i2);
                            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                            do {
                                next = xml.next();
                                if (next == 2) {
                                    break;
                                }
                            } while (next != 1);
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found");
                            }
                            String name = xml.getName();
                            this.c.b(i2, name);
                            X70 x70 = (X70) this.b.get(name);
                            if (x70 != null) {
                                drawableB = x70.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                            }
                            if (drawableB != null) {
                                drawableB.setChangingConfigurations(typedValue.changingConfigurations);
                                b(context, j2, drawableB);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (drawableB == null) {
                        this.c.b(i2, "appcompat_skip_skip");
                    }
                }
            }
            if (drawableB == null) {
                drawableB = c(context, i2);
            }
            if (drawableB == null) {
                drawableB = AbstractC3354yh.b(context, i2);
            }
            if (drawableB != null) {
                ColorStateList colorStateListI = i(context, i2);
                if (colorStateListI != null) {
                    Drawable drawableR = AbstractC3045vW.R(drawableB.mutate());
                    AbstractC2205mo.h(drawableR, colorStateListI);
                    if (this.g != null && i2 == R.drawable.abc_switch_thumb_material) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    }
                    if (mode != null) {
                        AbstractC2205mo.i(drawableR, mode);
                    }
                    drawable = drawableR;
                } else if (this.g != null) {
                    if (i2 == R.drawable.abc_seekbar_track_material) {
                        LayerDrawable layerDrawable = (LayerDrawable) drawableB;
                        Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                        int iC = AbstractC1220cj0.c(context, R.attr.colorControlNormal);
                        PorterDuff.Mode mode2 = C1846j4.b;
                        C1750i4.i(drawableFindDrawableByLayerId, iC, mode2);
                        C1750i4.i(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC1220cj0.c(context, R.attr.colorControlNormal), mode2);
                        C1750i4.i(layerDrawable.findDrawableByLayerId(android.R.id.progress), AbstractC1220cj0.c(context, R.attr.colorControlActivated), mode2);
                    } else if (i2 == R.drawable.abc_ratingbar_material || i2 == R.drawable.abc_ratingbar_indicator_material || i2 == R.drawable.abc_ratingbar_small_material) {
                        LayerDrawable layerDrawable2 = (LayerDrawable) drawableB;
                        Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                        int iB = AbstractC1220cj0.b(context, R.attr.colorControlNormal);
                        PorterDuff.Mode mode3 = C1846j4.b;
                        C1750i4.i(drawableFindDrawableByLayerId2, iB, mode3);
                        C1750i4.i(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC1220cj0.c(context, R.attr.colorControlActivated), mode3);
                        C1750i4.i(layerDrawable2.findDrawableByLayerId(android.R.id.progress), AbstractC1220cj0.c(context, R.attr.colorControlActivated), mode3);
                    } else if (!m(context, i2, drawableB)) {
                    }
                    drawable = drawableB;
                } else if (!m(context, i2, drawableB) || !z) {
                    drawable = drawableB;
                }
                drawableB = drawable;
            }
            if (drawableB != null) {
                AbstractC3077vo.a(drawableB);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableB;
    }

    public final synchronized ColorStateList i(Context context, int i2) {
        ColorStateList colorStateList;
        C2866tf0 c2866tf0;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListG = null;
        colorStateList = (weakHashMap == null || (c2866tf0 = (C2866tf0) weakHashMap.get(context)) == null) ? null : (ColorStateList) c2866tf0.d(i2);
        if (colorStateList == null) {
            C1750i4 c1750i4 = this.g;
            if (c1750i4 != null) {
                colorStateListG = c1750i4.g(context, i2);
            }
            if (colorStateListG != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                C2866tf0 c2866tf1 = (C2866tf0) this.a.get(context);
                if (c2866tf1 == null) {
                    c2866tf1 = new C2866tf0();
                    this.a.put(context, c2866tf1);
                }
                c2866tf1.b(i2, colorStateListG);
            }
            colorStateList = colorStateListG;
        }
        return colorStateList;
    }

    public final synchronized void k(Context context) {
        C1480fM c1480fM = (C1480fM) this.d.get(context);
        if (c1480fM != null) {
            c1480fM.c();
        }
    }

    public final synchronized void l(C1750i4 c1750i4) {
        this.g = c1750i4;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    public final boolean m(Context context, int i2, Drawable drawable) {
        int i3;
        int iRound;
        boolean z;
        Drawable drawableMutate;
        int iC;
        C1750i4 c1750i4 = this.g;
        if (c1750i4 == null) {
            return false;
        }
        PorterDuff.Mode mode = C1846j4.b;
        if (C1750i4.c(i2, (int[]) c1750i4.m)) {
            i3 = R.attr.colorControlNormal;
        } else if (C1750i4.c(i2, (int[]) c1750i4.f824o)) {
            i3 = R.attr.colorControlActivated;
        } else {
            if (!C1750i4.c(i2, (int[]) c1750i4.p)) {
                if (i2 == R.drawable.abc_list_divider_mtrl_alpha) {
                    iRound = Math.round(40.8f);
                    i3 = android.R.attr.colorForeground;
                    z = true;
                } else if (i2 != R.drawable.abc_dialog_material_background) {
                    i3 = 0;
                    iRound = -1;
                    z = false;
                }
                if (z) {
                    return false;
                }
                drawableMutate = drawable.mutate();
                iC = AbstractC1220cj0.c(context, i3);
                synchronized (C1846j4.class) {
                    PorterDuffColorFilter porterDuffColorFilterH = h(iC, mode);
                }
                drawableMutate.setColorFilter(porterDuffColorFilterH);
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                return true;
            }
            mode = PorterDuff.Mode.MULTIPLY;
            i3 = android.R.attr.colorBackground;
        }
        iRound = -1;
        z = true;
        if (z) {
            return false;
        }
        drawableMutate = drawable.mutate();
        iC = AbstractC1220cj0.c(context, i3);
        synchronized (C1846j4.class) {
            PorterDuffColorFilter porterDuffColorFilterH2 = h(iC, mode);
            drawableMutate.setColorFilter(porterDuffColorFilterH2);
            if (iRound != -1) {
                drawableMutate.setAlpha(iRound);
            }
            return true;
        }
    }
}
