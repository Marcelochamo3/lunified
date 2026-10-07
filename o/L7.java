package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.skidush.clonex.R;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class L7 {
    public final K7 a;
    public final K7 b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;

    public L7(Context context, K7 k7) {
        AttributeSet attributeSet;
        int styleAttribute;
        int next;
        K7 k8 = new K7();
        k8.t = 255;
        k8.v = -2;
        k8.w = -2;
        k8.x = -2;
        k8.E = Boolean.TRUE;
        this.b = k8;
        int i = k7.l;
        if (i != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
                attributeSet = attributeSetAsAttributeSet;
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayU = AbstractC1923jt0.u(context, attributeSet, H40.a, R.attr.badgeStyle, styleAttribute == 0 ? R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.c = typedArrayU.getDimensionPixelSize(4, -1);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = typedArrayU.getDimensionPixelSize(14, -1);
        this.e = typedArrayU.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.g = typedArrayU.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f = typedArrayU.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.h = typedArrayU.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.k = typedArrayU.getInt(24, 1);
        K7 k9 = this.b;
        int i2 = k7.t;
        k9.t = i2 == -2 ? 255 : i2;
        int i3 = k7.v;
        if (i3 != -2) {
            k9.v = i3;
        } else if (typedArrayU.hasValue(23)) {
            this.b.v = typedArrayU.getInt(23, 0);
        } else {
            this.b.v = -1;
        }
        String str = k7.u;
        if (str != null) {
            this.b.u = str;
        } else if (typedArrayU.hasValue(7)) {
            this.b.u = typedArrayU.getString(7);
        }
        K7 k10 = this.b;
        k10.z = k7.z;
        CharSequence charSequence = k7.A;
        k10.A = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        K7 k11 = this.b;
        int i4 = k7.B;
        k11.B = i4 == 0 ? R.plurals.mtrl_badge_content_description : i4;
        int i5 = k7.C;
        k11.C = i5 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i5;
        Boolean bool = k7.E;
        k11.E = Boolean.valueOf(bool == null || bool.booleanValue());
        K7 k12 = this.b;
        int i6 = k7.w;
        k12.w = i6 == -2 ? typedArrayU.getInt(21, -2) : i6;
        K7 k13 = this.b;
        int i7 = k7.x;
        k13.x = i7 == -2 ? typedArrayU.getInt(22, -2) : i7;
        K7 k14 = this.b;
        Integer num = k7.p;
        k14.p = Integer.valueOf(num == null ? typedArrayU.getResourceId(5, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        K7 k15 = this.b;
        Integer num2 = k7.q;
        k15.q = Integer.valueOf(num2 == null ? typedArrayU.getResourceId(6, 0) : num2.intValue());
        K7 k16 = this.b;
        Integer num3 = k7.r;
        k16.r = Integer.valueOf(num3 == null ? typedArrayU.getResourceId(15, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        K7 k17 = this.b;
        Integer num4 = k7.s;
        k17.s = Integer.valueOf(num4 == null ? typedArrayU.getResourceId(16, 0) : num4.intValue());
        K7 k18 = this.b;
        Integer num5 = k7.m;
        k18.m = Integer.valueOf(num5 == null ? AbstractC3021v9.l(context, typedArrayU, 1).getDefaultColor() : num5.intValue());
        K7 k19 = this.b;
        Integer num6 = k7.f356o;
        k19.f356o = Integer.valueOf(num6 == null ? typedArrayU.getResourceId(8, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = k7.n;
        if (num7 != null) {
            this.b.n = num7;
        } else if (typedArrayU.hasValue(9)) {
            this.b.n = Integer.valueOf(AbstractC3021v9.l(context, typedArrayU, 9).getDefaultColor());
        } else {
            int iIntValue = this.b.f356o.intValue();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, H40.D);
            typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList colorStateListL = AbstractC3021v9.l(context, typedArrayObtainStyledAttributes, 3);
            AbstractC3021v9.l(context, typedArrayObtainStyledAttributes, 4);
            AbstractC3021v9.l(context, typedArrayObtainStyledAttributes, 5);
            typedArrayObtainStyledAttributes.getInt(2, 0);
            typedArrayObtainStyledAttributes.getInt(1, 1);
            int i8 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
            typedArrayObtainStyledAttributes.getResourceId(i8, 0);
            typedArrayObtainStyledAttributes.getString(i8);
            typedArrayObtainStyledAttributes.getBoolean(14, false);
            AbstractC3021v9.l(context, typedArrayObtainStyledAttributes, 6);
            typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, H40.s);
            typedArrayObtainStyledAttributes2.hasValue(0);
            typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes2.recycle();
            this.b.n = Integer.valueOf(colorStateListL.getDefaultColor());
        }
        K7 k20 = this.b;
        Integer num8 = k7.D;
        k20.D = Integer.valueOf(num8 == null ? typedArrayU.getInt(2, 8388661) : num8.intValue());
        K7 k21 = this.b;
        Integer num9 = k7.F;
        k21.F = Integer.valueOf(num9 == null ? typedArrayU.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        K7 k22 = this.b;
        Integer num10 = k7.G;
        k22.G = Integer.valueOf(num10 == null ? typedArrayU.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        K7 k23 = this.b;
        Integer num11 = k7.H;
        k23.H = Integer.valueOf(num11 == null ? typedArrayU.getDimensionPixelOffset(18, 0) : num11.intValue());
        K7 k24 = this.b;
        Integer num12 = k7.I;
        k24.I = Integer.valueOf(num12 == null ? typedArrayU.getDimensionPixelOffset(25, 0) : num12.intValue());
        K7 k25 = this.b;
        Integer num13 = k7.J;
        k25.J = Integer.valueOf(num13 == null ? typedArrayU.getDimensionPixelOffset(19, k25.H.intValue()) : num13.intValue());
        K7 k26 = this.b;
        Integer num14 = k7.K;
        k26.K = Integer.valueOf(num14 == null ? typedArrayU.getDimensionPixelOffset(26, k26.I.intValue()) : num14.intValue());
        K7 k27 = this.b;
        Integer num15 = k7.N;
        k27.N = Integer.valueOf(num15 == null ? typedArrayU.getDimensionPixelOffset(20, 0) : num15.intValue());
        K7 k28 = this.b;
        Integer num16 = k7.L;
        k28.L = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        K7 k29 = this.b;
        Integer num17 = k7.M;
        k29.M = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        K7 k30 = this.b;
        Boolean bool2 = k7.O;
        k30.O = Boolean.valueOf(bool2 == null ? typedArrayU.getBoolean(0, false) : bool2.booleanValue());
        typedArrayU.recycle();
        Locale locale = k7.y;
        if (locale == null) {
            this.b.y = Build.VERSION.SDK_INT >= 24 ? Locale.getDefault(Locale.Category.FORMAT) : Locale.getDefault();
        } else {
            this.b.y = locale;
        }
        this.a = k7;
    }
}
