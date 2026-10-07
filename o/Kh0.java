package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class Kh0 extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public Kh0(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v59 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ?? r4;
        int i;
        ColorStateList colorStateList;
        int resourceId;
        Jh0 jh0 = new Jh0(this, menu);
        int eventType = xmlResourceParser.getEventType();
        do {
            r4 = 1;
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
                break;
            }
            eventType = xmlResourceParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z2 && name2.equals(str)) {
                        z2 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        jh0.b = 0;
                        jh0.c = 0;
                        jh0.d = 0;
                        jh0.e = 0;
                        jh0.f = r4;
                        jh0.g = r4;
                    } else if (name2.equals("item")) {
                        if (!jh0.h) {
                            ActionProviderVisibilityListenerC1484fQ actionProviderVisibilityListenerC1484fQ = jh0.z;
                            if (actionProviderVisibilityListenerC1484fQ == null || !actionProviderVisibilityListenerC1484fQ.b.hasSubMenu()) {
                                jh0.h = r4;
                                jh0.b(jh0.a.add(jh0.b, jh0.i, jh0.j, jh0.k));
                            } else {
                                jh0.h = r4;
                                jh0.b(jh0.a.addSubMenu(jh0.b, jh0.i, jh0.j, jh0.k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlResourceParser.getName();
                boolean zEquals = name3.equals("group");
                Kh0 kh0 = jh0.E;
                if (zEquals) {
                    TypedArray typedArrayObtainStyledAttributes = kh0.c.obtainStyledAttributes(attributeSet, T40.p);
                    jh0.b = typedArrayObtainStyledAttributes.getResourceId(r4, 0);
                    jh0.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                    jh0.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                    jh0.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                    jh0.f = typedArrayObtainStyledAttributes.getBoolean(2, r4);
                    jh0.g = typedArrayObtainStyledAttributes.getBoolean(0, r4);
                    typedArrayObtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    Context context = kh0.c;
                    TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, T40.q);
                    jh0.i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                    jh0.j = (typedArrayObtainStyledAttributes2.getInt(5, jh0.c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, jh0.d) & AQ.w);
                    jh0.k = typedArrayObtainStyledAttributes2.getText(7);
                    jh0.l = typedArrayObtainStyledAttributes2.getText(8);
                    jh0.m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                    String string = typedArrayObtainStyledAttributes2.getString(9);
                    jh0.n = string == null ? (char) 0 : string.charAt(0);
                    jh0.f349o = typedArrayObtainStyledAttributes2.getInt(16, C1672hI.a.f);
                    String string2 = typedArrayObtainStyledAttributes2.getString(10);
                    jh0.p = string2 == null ? (char) 0 : string2.charAt(0);
                    jh0.q = typedArrayObtainStyledAttributes2.getInt(20, C1672hI.a.f);
                    if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                        jh0.r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                    } else {
                        jh0.r = jh0.e;
                    }
                    jh0.s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                    jh0.t = typedArrayObtainStyledAttributes2.getBoolean(4, jh0.f);
                    jh0.u = typedArrayObtainStyledAttributes2.getBoolean(1, jh0.g);
                    jh0.v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                    jh0.y = typedArrayObtainStyledAttributes2.getString(12);
                    jh0.w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                    jh0.x = typedArrayObtainStyledAttributes2.getString(15);
                    String string3 = typedArrayObtainStyledAttributes2.getString(14);
                    if (string3 != null && jh0.w == 0 && jh0.x == null) {
                        jh0.z = (ActionProviderVisibilityListenerC1484fQ) jh0.a(string3, f, kh0.b);
                    } else {
                        jh0.z = null;
                    }
                    jh0.A = typedArrayObtainStyledAttributes2.getText(17);
                    jh0.B = typedArrayObtainStyledAttributes2.getText(22);
                    if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                        jh0.D = AbstractC3077vo.c(typedArrayObtainStyledAttributes2.getInt(19, -1), jh0.D);
                    } else {
                        jh0.D = null;
                    }
                    if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                        if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC1459f50.v(context, resourceId)) == null) {
                            colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                        }
                        jh0.C = colorStateList;
                    } else {
                        jh0.C = null;
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                    jh0.h = false;
                } else if (name3.equals("menu")) {
                    jh0.h = true;
                    SubMenu subMenuAddSubMenu = jh0.a.addSubMenu(jh0.b, jh0.i, jh0.j, jh0.k);
                    jh0.b(subMenuAddSubMenu.getItem());
                    b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                } else {
                    str = name3;
                    z2 = true;
                }
            }
            eventType = xmlResourceParser.next();
            r4 = 1;
            i = 2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof ZP)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof ZP) {
                    ZP zp = (ZP) menu;
                    if (!zp.p) {
                        zp.w();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((ZP) menu).v();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((ZP) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
