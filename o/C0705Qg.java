package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: o.Qg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0705Qg {
    public static final int[] d = {0, 4, 8};
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public final HashMap a = new HashMap();
    public final boolean b = true;
    public final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(C3080vp0.t0, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(C3080vp0.v0, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(Yu0.b.h0, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(Yu0.b.d0, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(Yu0.b.c0, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(Yu0.b.i0, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(Yu0.b.g0, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(Yu0.b.f0, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(C3080vp0.t0, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(Barrier barrier, String str) {
        int iIntValue;
        HashMap map;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = B40.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((strTrim instanceof String) && (map = constraintLayout.x) != null && map.containsKey(strTrim)) {
                    obj = constraintLayout.x.get(strTrim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0077. Please report as an issue. */
    public static C0576Lg d(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        C0576Lg c0576Lg = new C0576Lg();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? M40.c : M40.a);
        int[] iArr = d;
        SparseIntArray sparseIntArray = e;
        String[] strArr = AbstractC3021v9.b;
        C0653Og c0653Og = c0576Lg.b;
        C0679Pg c0679Pg = c0576Lg.e;
        C0627Ng c0627Ng = c0576Lg.c;
        C0601Mg c0601Mg = c0576Lg.d;
        int i2 = 3;
        if (z) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            C0550Kg c0550Kg = new C0550Kg();
            c0550Kg.a = new int[10];
            c0550Kg.b = new int[10];
            c0550Kg.c = 0;
            c0550Kg.d = new int[10];
            c0550Kg.e = new float[10];
            c0550Kg.f = 0;
            c0550Kg.g = new int[5];
            c0550Kg.h = new String[5];
            c0550Kg.i = 0;
            c0550Kg.j = new int[4];
            c0550Kg.k = new boolean[4];
            c0550Kg.l = 0;
            c0627Ng.getClass();
            c0601Mg.getClass();
            c0653Og.getClass();
            c0679Pg.getClass();
            int i3 = 0;
            while (i3 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                switch (f.get(index)) {
                    case 2:
                        c0550Kg.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0601Mg.I));
                        i = 1;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case C3080vp0.I /* 35 */:
                    case C3080vp0.J /* 36 */:
                    case 61:
                    case 88:
                    case Yu0.b.O /* 89 */:
                    case 90:
                    case Yu0.b.P /* 91 */:
                    case 92:
                    default:
                        Integer.toHexString(index);
                        sparseIntArray.get(index);
                        i = 1;
                        break;
                    case 5:
                        c0550Kg.c(5, typedArrayObtainStyledAttributes.getString(index));
                        i = 1;
                        break;
                    case 6:
                        c0550Kg.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0601Mg.C));
                        i = 1;
                        break;
                    case 7:
                        c0550Kg.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0601Mg.D));
                        i = 1;
                        break;
                    case 8:
                        c0550Kg.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0601Mg.J));
                        i = 1;
                        break;
                    case 11:
                        c0550Kg.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0601Mg.P));
                        i = 1;
                        break;
                    case 12:
                        c0550Kg.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0601Mg.Q));
                        i = 1;
                        break;
                    case 13:
                        c0550Kg.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0601Mg.M));
                        i = 1;
                        break;
                    case 14:
                        c0550Kg.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0601Mg.O));
                        i = 1;
                        break;
                    case 15:
                        c0550Kg.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0601Mg.R));
                        i = 1;
                        break;
                    case 16:
                        c0550Kg.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0601Mg.N));
                        i = 1;
                        break;
                    case 17:
                        c0550Kg.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0601Mg.d));
                        i = 1;
                        break;
                    case 18:
                        c0550Kg.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0601Mg.e));
                        i = 1;
                        break;
                    case 19:
                        c0550Kg.a(19, typedArrayObtainStyledAttributes.getFloat(index, c0601Mg.f));
                        i = 1;
                        break;
                    case 20:
                        c0550Kg.a(20, typedArrayObtainStyledAttributes.getFloat(index, c0601Mg.w));
                        i = 1;
                        break;
                    case 21:
                        c0550Kg.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, c0601Mg.c));
                        i = 1;
                        break;
                    case 22:
                        c0550Kg.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, c0653Og.a)]);
                        i = 1;
                        break;
                    case 23:
                        c0550Kg.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, c0601Mg.b));
                        i = 1;
                        break;
                    case 24:
                        c0550Kg.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0601Mg.F));
                        i = 1;
                        break;
                    case 27:
                        c0550Kg.b(27, typedArrayObtainStyledAttributes.getInt(index, c0601Mg.E));
                        i = 1;
                        break;
                    case 28:
                        c0550Kg.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0601Mg.G));
                        i = 1;
                        break;
                    case 31:
                        c0550Kg.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0601Mg.K));
                        i = 1;
                        break;
                    case C3080vp0.H /* 34 */:
                        c0550Kg.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0601Mg.H));
                        i = 1;
                        break;
                    case 37:
                        c0550Kg.a(37, typedArrayObtainStyledAttributes.getFloat(index, c0601Mg.x));
                        i = 1;
                        break;
                    case C3080vp0.L /* 38 */:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c0576Lg.a);
                        c0576Lg.a = resourceId;
                        c0550Kg.b(38, resourceId);
                        i = 1;
                        break;
                    case 39:
                        c0550Kg.a(39, typedArrayObtainStyledAttributes.getFloat(index, c0601Mg.U));
                        i = 1;
                        break;
                    case C3080vp0.N /* 40 */:
                        c0550Kg.a(40, typedArrayObtainStyledAttributes.getFloat(index, c0601Mg.T));
                        i = 1;
                        break;
                    case 41:
                        c0550Kg.b(41, typedArrayObtainStyledAttributes.getInt(index, c0601Mg.V));
                        i = 1;
                        break;
                    case 42:
                        c0550Kg.b(42, typedArrayObtainStyledAttributes.getInt(index, c0601Mg.W));
                        i = 1;
                        break;
                    case 43:
                        c0550Kg.a(43, typedArrayObtainStyledAttributes.getFloat(index, c0653Og.c));
                        i = 1;
                        break;
                    case 44:
                        c0550Kg.d(44, true);
                        c0550Kg.a(44, typedArrayObtainStyledAttributes.getDimension(index, c0679Pg.m));
                        i = 1;
                        break;
                    case 45:
                        c0550Kg.a(45, typedArrayObtainStyledAttributes.getFloat(index, c0679Pg.b));
                        i = 1;
                        break;
                    case 46:
                        c0550Kg.a(46, typedArrayObtainStyledAttributes.getFloat(index, c0679Pg.c));
                        i = 1;
                        break;
                    case 47:
                        c0550Kg.a(47, typedArrayObtainStyledAttributes.getFloat(index, c0679Pg.d));
                        i = 1;
                        break;
                    case C3080vp0.V /* 48 */:
                        c0550Kg.a(48, typedArrayObtainStyledAttributes.getFloat(index, c0679Pg.e));
                        i = 1;
                        break;
                    case 49:
                        c0550Kg.a(49, typedArrayObtainStyledAttributes.getDimension(index, c0679Pg.f));
                        i = 1;
                        break;
                    case C3080vp0.X /* 50 */:
                        c0550Kg.a(50, typedArrayObtainStyledAttributes.getDimension(index, c0679Pg.g));
                        i = 1;
                        break;
                    case 51:
                        c0550Kg.a(51, typedArrayObtainStyledAttributes.getDimension(index, c0679Pg.i));
                        i = 1;
                        break;
                    case C3080vp0.Z /* 52 */:
                        c0550Kg.a(52, typedArrayObtainStyledAttributes.getDimension(index, c0679Pg.j));
                        i = 1;
                        break;
                    case 53:
                        c0550Kg.a(53, typedArrayObtainStyledAttributes.getDimension(index, c0679Pg.k));
                        i = 1;
                        break;
                    case 54:
                        c0550Kg.b(54, typedArrayObtainStyledAttributes.getInt(index, c0601Mg.X));
                        i = 1;
                        break;
                    case 55:
                        c0550Kg.b(55, typedArrayObtainStyledAttributes.getInt(index, c0601Mg.Y));
                        i = 1;
                        break;
                    case C3080vp0.c0 /* 56 */:
                        c0550Kg.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0601Mg.Z));
                        i = 1;
                        break;
                    case C3080vp0.d0 /* 57 */:
                        c0550Kg.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0601Mg.a0));
                        i = 1;
                        break;
                    case C3080vp0.e0 /* 58 */:
                        c0550Kg.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0601Mg.b0));
                        i = 1;
                        break;
                    case C3080vp0.f0 /* 59 */:
                        c0550Kg.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0601Mg.c0));
                        i = 1;
                        break;
                    case C3080vp0.g0 /* 60 */:
                        c0550Kg.a(60, typedArrayObtainStyledAttributes.getFloat(index, c0679Pg.a));
                        i = 1;
                        break;
                    case 62:
                        c0550Kg.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0601Mg.A));
                        i = 1;
                        break;
                    case 63:
                        c0550Kg.a(63, typedArrayObtainStyledAttributes.getFloat(index, c0601Mg.B));
                        i = 1;
                        break;
                    case 64:
                        c0550Kg.b(64, f(typedArrayObtainStyledAttributes, index, c0627Ng.a));
                        i = 1;
                        break;
                    case 65:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            c0550Kg.c(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            c0550Kg.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        i = 1;
                        break;
                    case Yu0.a.J /* 66 */:
                        c0550Kg.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        i = 1;
                        break;
                    case 67:
                        c0550Kg.a(67, typedArrayObtainStyledAttributes.getFloat(index, c0627Ng.e));
                        i = 1;
                        break;
                    case Yu0.b.G /* 68 */:
                        c0550Kg.a(68, typedArrayObtainStyledAttributes.getFloat(index, c0653Og.d));
                        i = 1;
                        break;
                    case 69:
                        c0550Kg.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        i = 1;
                        break;
                    case 70:
                        c0550Kg.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        i = 1;
                        break;
                    case 71:
                        i = 1;
                        break;
                    case Yu0.b.J /* 72 */:
                        c0550Kg.b(72, typedArrayObtainStyledAttributes.getInt(index, c0601Mg.f0));
                        i = 1;
                        break;
                    case Yu0.b.K /* 73 */:
                        c0550Kg.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0601Mg.g0));
                        i = 1;
                        break;
                    case Yu0.b.L /* 74 */:
                        c0550Kg.c(74, typedArrayObtainStyledAttributes.getString(index));
                        i = 1;
                        break;
                    case 75:
                        c0550Kg.d(75, typedArrayObtainStyledAttributes.getBoolean(index, c0601Mg.n0));
                        i = 1;
                        break;
                    case Yu0.a.N /* 76 */:
                        c0550Kg.b(76, typedArrayObtainStyledAttributes.getInt(index, c0627Ng.c));
                        i = 1;
                        break;
                    case 77:
                        c0550Kg.c(77, typedArrayObtainStyledAttributes.getString(index));
                        i = 1;
                        break;
                    case Yu0.a.O /* 78 */:
                        c0550Kg.b(78, typedArrayObtainStyledAttributes.getInt(index, c0653Og.b));
                        i = 1;
                        break;
                    case 79:
                        c0550Kg.a(79, typedArrayObtainStyledAttributes.getFloat(index, c0627Ng.d));
                        i = 1;
                        break;
                    case 80:
                        c0550Kg.d(80, typedArrayObtainStyledAttributes.getBoolean(index, c0601Mg.l0));
                        i = 1;
                        break;
                    case Yu0.b.N /* 81 */:
                        c0550Kg.d(81, typedArrayObtainStyledAttributes.getBoolean(index, c0601Mg.m0));
                        i = 1;
                        break;
                    case 82:
                        c0550Kg.b(82, typedArrayObtainStyledAttributes.getInteger(index, c0627Ng.b));
                        i = 1;
                        break;
                    case 83:
                        c0550Kg.b(83, f(typedArrayObtainStyledAttributes, index, c0679Pg.h));
                        i = 1;
                        break;
                    case 84:
                        c0550Kg.b(84, typedArrayObtainStyledAttributes.getInteger(index, c0627Ng.g));
                        i = 1;
                        break;
                    case 85:
                        c0550Kg.a(85, typedArrayObtainStyledAttributes.getFloat(index, c0627Ng.f));
                        i = 1;
                        break;
                    case 86:
                        int i4 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i4 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            c0627Ng.i = resourceId2;
                            c0550Kg.b(89, resourceId2);
                            if (c0627Ng.i != -1) {
                                c0550Kg.b(88, -2);
                            }
                        } else if (i4 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c0627Ng.h = string;
                            c0550Kg.c(90, string);
                            if (c0627Ng.h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                c0627Ng.i = resourceId3;
                                c0550Kg.b(89, resourceId3);
                                c0550Kg.b(88, -2);
                            } else {
                                c0550Kg.b(88, -1);
                            }
                        } else {
                            c0550Kg.b(88, typedArrayObtainStyledAttributes.getInteger(index, c0627Ng.i));
                        }
                        i = 1;
                        break;
                    case 87:
                        Integer.toHexString(index);
                        sparseIntArray.get(index);
                        i = 1;
                        break;
                    case Yu0.b.Q /* 93 */:
                        c0550Kg.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0601Mg.L));
                        i = 1;
                        break;
                    case 94:
                        c0550Kg.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0601Mg.S));
                        i = 1;
                        break;
                    case Yu0.b.R /* 95 */:
                        g(c0550Kg, typedArrayObtainStyledAttributes, index, 0);
                        i = 1;
                        break;
                    case 96:
                        i = 1;
                        g(c0550Kg, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case Yu0.b.S /* 97 */:
                        c0550Kg.b(97, typedArrayObtainStyledAttributes.getInt(index, c0601Mg.o0));
                        i = 1;
                        break;
                    case Yu0.b.T /* 98 */:
                        int i5 = ZQ.D;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == i2) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            c0576Lg.a = typedArrayObtainStyledAttributes.getResourceId(index, c0576Lg.a);
                        }
                        i = 1;
                        break;
                    case 99:
                        c0550Kg.d(99, typedArrayObtainStyledAttributes.getBoolean(index, c0601Mg.g));
                        i = 1;
                        break;
                }
                i3 += i;
                i2 = 3;
            }
        } else {
            int i6 = 1;
            int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount();
            int i7 = 0;
            while (i7 < indexCount2) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index2 != i6 && 23 != index2 && 24 != index2) {
                    c0627Ng.getClass();
                    c0601Mg.getClass();
                    c0653Og.getClass();
                    c0679Pg.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        c0601Mg.p = f(typedArrayObtainStyledAttributes, index2, c0601Mg.p);
                        i6 = 1;
                        break;
                    case 2:
                        c0601Mg.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0601Mg.I);
                        i6 = 1;
                        break;
                    case 3:
                        c0601Mg.f399o = f(typedArrayObtainStyledAttributes, index2, c0601Mg.f399o);
                        i6 = 1;
                        break;
                    case 4:
                        c0601Mg.n = f(typedArrayObtainStyledAttributes, index2, c0601Mg.n);
                        i6 = 1;
                        break;
                    case 5:
                        c0601Mg.y = typedArrayObtainStyledAttributes.getString(index2);
                        i6 = 1;
                        break;
                    case 6:
                        c0601Mg.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c0601Mg.C);
                        i6 = 1;
                        break;
                    case 7:
                        c0601Mg.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c0601Mg.D);
                        i6 = 1;
                        break;
                    case 8:
                        c0601Mg.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0601Mg.J);
                        i6 = 1;
                        break;
                    case 9:
                        c0601Mg.v = f(typedArrayObtainStyledAttributes, index2, c0601Mg.v);
                        i6 = 1;
                        break;
                    case 10:
                        c0601Mg.u = f(typedArrayObtainStyledAttributes, index2, c0601Mg.u);
                        i6 = 1;
                        break;
                    case 11:
                        c0601Mg.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0601Mg.P);
                        i6 = 1;
                        break;
                    case 12:
                        c0601Mg.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0601Mg.Q);
                        i6 = 1;
                        break;
                    case 13:
                        c0601Mg.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0601Mg.M);
                        i6 = 1;
                        break;
                    case 14:
                        c0601Mg.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0601Mg.O);
                        i6 = 1;
                        break;
                    case 15:
                        c0601Mg.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0601Mg.R);
                        i6 = 1;
                        break;
                    case 16:
                        c0601Mg.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0601Mg.N);
                        i6 = 1;
                        break;
                    case 17:
                        c0601Mg.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c0601Mg.d);
                        i6 = 1;
                        break;
                    case 18:
                        c0601Mg.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c0601Mg.e);
                        i6 = 1;
                        break;
                    case 19:
                        c0601Mg.f = typedArrayObtainStyledAttributes.getFloat(index2, c0601Mg.f);
                        i6 = 1;
                        break;
                    case 20:
                        c0601Mg.w = typedArrayObtainStyledAttributes.getFloat(index2, c0601Mg.w);
                        i6 = 1;
                        break;
                    case 21:
                        c0601Mg.c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c0601Mg.c);
                        i6 = 1;
                        break;
                    case 22:
                        c0653Og.a = iArr[typedArrayObtainStyledAttributes.getInt(index2, c0653Og.a)];
                        i6 = 1;
                        break;
                    case 23:
                        c0601Mg.b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c0601Mg.b);
                        i6 = 1;
                        break;
                    case 24:
                        c0601Mg.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0601Mg.F);
                        i6 = 1;
                        break;
                    case 25:
                        c0601Mg.h = f(typedArrayObtainStyledAttributes, index2, c0601Mg.h);
                        i6 = 1;
                        break;
                    case 26:
                        c0601Mg.i = f(typedArrayObtainStyledAttributes, index2, c0601Mg.i);
                        i6 = 1;
                        break;
                    case 27:
                        c0601Mg.E = typedArrayObtainStyledAttributes.getInt(index2, c0601Mg.E);
                        i6 = 1;
                        break;
                    case 28:
                        c0601Mg.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0601Mg.G);
                        i6 = 1;
                        break;
                    case 29:
                        c0601Mg.j = f(typedArrayObtainStyledAttributes, index2, c0601Mg.j);
                        i6 = 1;
                        break;
                    case 30:
                        c0601Mg.k = f(typedArrayObtainStyledAttributes, index2, c0601Mg.k);
                        i6 = 1;
                        break;
                    case 31:
                        c0601Mg.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0601Mg.K);
                        i6 = 1;
                        break;
                    case 32:
                        c0601Mg.s = f(typedArrayObtainStyledAttributes, index2, c0601Mg.s);
                        i6 = 1;
                        break;
                    case 33:
                        c0601Mg.t = f(typedArrayObtainStyledAttributes, index2, c0601Mg.t);
                        i6 = 1;
                        break;
                    case C3080vp0.H /* 34 */:
                        c0601Mg.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0601Mg.H);
                        i6 = 1;
                        break;
                    case C3080vp0.I /* 35 */:
                        c0601Mg.m = f(typedArrayObtainStyledAttributes, index2, c0601Mg.m);
                        i6 = 1;
                        break;
                    case C3080vp0.J /* 36 */:
                        c0601Mg.l = f(typedArrayObtainStyledAttributes, index2, c0601Mg.l);
                        i6 = 1;
                        break;
                    case 37:
                        c0601Mg.x = typedArrayObtainStyledAttributes.getFloat(index2, c0601Mg.x);
                        i6 = 1;
                        break;
                    case C3080vp0.L /* 38 */:
                        c0576Lg.a = typedArrayObtainStyledAttributes.getResourceId(index2, c0576Lg.a);
                        i6 = 1;
                        break;
                    case 39:
                        c0601Mg.U = typedArrayObtainStyledAttributes.getFloat(index2, c0601Mg.U);
                        i6 = 1;
                        break;
                    case C3080vp0.N /* 40 */:
                        c0601Mg.T = typedArrayObtainStyledAttributes.getFloat(index2, c0601Mg.T);
                        i6 = 1;
                        break;
                    case 41:
                        c0601Mg.V = typedArrayObtainStyledAttributes.getInt(index2, c0601Mg.V);
                        i6 = 1;
                        break;
                    case 42:
                        c0601Mg.W = typedArrayObtainStyledAttributes.getInt(index2, c0601Mg.W);
                        i6 = 1;
                        break;
                    case 43:
                        c0653Og.c = typedArrayObtainStyledAttributes.getFloat(index2, c0653Og.c);
                        i6 = 1;
                        break;
                    case 44:
                        c0679Pg.l = true;
                        c0679Pg.m = typedArrayObtainStyledAttributes.getDimension(index2, c0679Pg.m);
                        i6 = 1;
                        break;
                    case 45:
                        c0679Pg.b = typedArrayObtainStyledAttributes.getFloat(index2, c0679Pg.b);
                        i6 = 1;
                        break;
                    case 46:
                        c0679Pg.c = typedArrayObtainStyledAttributes.getFloat(index2, c0679Pg.c);
                        i6 = 1;
                        break;
                    case 47:
                        c0679Pg.d = typedArrayObtainStyledAttributes.getFloat(index2, c0679Pg.d);
                        i6 = 1;
                        break;
                    case C3080vp0.V /* 48 */:
                        c0679Pg.e = typedArrayObtainStyledAttributes.getFloat(index2, c0679Pg.e);
                        i6 = 1;
                        break;
                    case 49:
                        c0679Pg.f = typedArrayObtainStyledAttributes.getDimension(index2, c0679Pg.f);
                        i6 = 1;
                        break;
                    case C3080vp0.X /* 50 */:
                        c0679Pg.g = typedArrayObtainStyledAttributes.getDimension(index2, c0679Pg.g);
                        i6 = 1;
                        break;
                    case 51:
                        c0679Pg.i = typedArrayObtainStyledAttributes.getDimension(index2, c0679Pg.i);
                        i6 = 1;
                        break;
                    case C3080vp0.Z /* 52 */:
                        c0679Pg.j = typedArrayObtainStyledAttributes.getDimension(index2, c0679Pg.j);
                        i6 = 1;
                        break;
                    case 53:
                        c0679Pg.k = typedArrayObtainStyledAttributes.getDimension(index2, c0679Pg.k);
                        i6 = 1;
                        break;
                    case 54:
                        c0601Mg.X = typedArrayObtainStyledAttributes.getInt(index2, c0601Mg.X);
                        i6 = 1;
                        break;
                    case 55:
                        c0601Mg.Y = typedArrayObtainStyledAttributes.getInt(index2, c0601Mg.Y);
                        i6 = 1;
                        break;
                    case C3080vp0.c0 /* 56 */:
                        c0601Mg.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0601Mg.Z);
                        i6 = 1;
                        break;
                    case C3080vp0.d0 /* 57 */:
                        c0601Mg.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0601Mg.a0);
                        i6 = 1;
                        break;
                    case C3080vp0.e0 /* 58 */:
                        c0601Mg.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0601Mg.b0);
                        i6 = 1;
                        break;
                    case C3080vp0.f0 /* 59 */:
                        c0601Mg.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0601Mg.c0);
                        i6 = 1;
                        break;
                    case C3080vp0.g0 /* 60 */:
                        c0679Pg.a = typedArrayObtainStyledAttributes.getFloat(index2, c0679Pg.a);
                        i6 = 1;
                        break;
                    case 61:
                        c0601Mg.z = f(typedArrayObtainStyledAttributes, index2, c0601Mg.z);
                        i6 = 1;
                        break;
                    case 62:
                        c0601Mg.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0601Mg.A);
                        i6 = 1;
                        break;
                    case 63:
                        c0601Mg.B = typedArrayObtainStyledAttributes.getFloat(index2, c0601Mg.B);
                        i6 = 1;
                        break;
                    case 64:
                        c0627Ng.a = f(typedArrayObtainStyledAttributes, index2, c0627Ng.a);
                        i6 = 1;
                        break;
                    case 65:
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            c0627Ng.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            c0627Ng.getClass();
                        }
                        i6 = 1;
                        break;
                    case Yu0.a.J /* 66 */:
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        c0627Ng.getClass();
                        i6 = 1;
                        break;
                    case 67:
                        c0627Ng.e = typedArrayObtainStyledAttributes.getFloat(index2, c0627Ng.e);
                        i6 = 1;
                        break;
                    case Yu0.b.G /* 68 */:
                        c0653Og.d = typedArrayObtainStyledAttributes.getFloat(index2, c0653Og.d);
                        i6 = 1;
                        break;
                    case 69:
                        c0601Mg.d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        i6 = 1;
                        break;
                    case 70:
                        c0601Mg.e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        i6 = 1;
                        break;
                    case 71:
                        i6 = 1;
                        break;
                    case Yu0.b.J /* 72 */:
                        c0601Mg.f0 = typedArrayObtainStyledAttributes.getInt(index2, c0601Mg.f0);
                        i6 = 1;
                        break;
                    case Yu0.b.K /* 73 */:
                        c0601Mg.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0601Mg.g0);
                        i6 = 1;
                        break;
                    case Yu0.b.L /* 74 */:
                        c0601Mg.j0 = typedArrayObtainStyledAttributes.getString(index2);
                        i6 = 1;
                        break;
                    case 75:
                        c0601Mg.n0 = typedArrayObtainStyledAttributes.getBoolean(index2, c0601Mg.n0);
                        i6 = 1;
                        break;
                    case Yu0.a.N /* 76 */:
                        c0627Ng.c = typedArrayObtainStyledAttributes.getInt(index2, c0627Ng.c);
                        i6 = 1;
                        break;
                    case 77:
                        c0601Mg.k0 = typedArrayObtainStyledAttributes.getString(index2);
                        i6 = 1;
                        break;
                    case Yu0.a.O /* 78 */:
                        c0653Og.b = typedArrayObtainStyledAttributes.getInt(index2, c0653Og.b);
                        i6 = 1;
                        break;
                    case 79:
                        c0627Ng.d = typedArrayObtainStyledAttributes.getFloat(index2, c0627Ng.d);
                        i6 = 1;
                        break;
                    case 80:
                        c0601Mg.l0 = typedArrayObtainStyledAttributes.getBoolean(index2, c0601Mg.l0);
                        i6 = 1;
                        break;
                    case Yu0.b.N /* 81 */:
                        c0601Mg.m0 = typedArrayObtainStyledAttributes.getBoolean(index2, c0601Mg.m0);
                        i6 = 1;
                        break;
                    case 82:
                        c0627Ng.b = typedArrayObtainStyledAttributes.getInteger(index2, c0627Ng.b);
                        i6 = 1;
                        break;
                    case 83:
                        c0679Pg.h = f(typedArrayObtainStyledAttributes, index2, c0679Pg.h);
                        i6 = 1;
                        break;
                    case 84:
                        c0627Ng.g = typedArrayObtainStyledAttributes.getInteger(index2, c0627Ng.g);
                        i6 = 1;
                        break;
                    case 85:
                        c0627Ng.f = typedArrayObtainStyledAttributes.getFloat(index2, c0627Ng.f);
                        i6 = 1;
                        break;
                    case 86:
                        int i8 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i8 == 1) {
                            c0627Ng.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i8 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            c0627Ng.h = string2;
                            if (string2.indexOf("/") > 0) {
                                c0627Ng.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, c0627Ng.i);
                        }
                        i6 = 1;
                        break;
                    case 87:
                        Integer.toHexString(index2);
                        sparseIntArray.get(index2);
                        i6 = 1;
                        break;
                    case 88:
                    case Yu0.b.O /* 89 */:
                    case 90:
                    default:
                        Integer.toHexString(index2);
                        sparseIntArray.get(index2);
                        i6 = 1;
                        break;
                    case Yu0.b.P /* 91 */:
                        c0601Mg.q = f(typedArrayObtainStyledAttributes, index2, c0601Mg.q);
                        i6 = 1;
                        break;
                    case 92:
                        c0601Mg.r = f(typedArrayObtainStyledAttributes, index2, c0601Mg.r);
                        i6 = 1;
                        break;
                    case Yu0.b.Q /* 93 */:
                        c0601Mg.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0601Mg.L);
                        i6 = 1;
                        break;
                    case 94:
                        c0601Mg.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0601Mg.S);
                        i6 = 1;
                        break;
                    case Yu0.b.R /* 95 */:
                        g(c0601Mg, typedArrayObtainStyledAttributes, index2, 0);
                        i6 = 1;
                        break;
                    case 96:
                        g(c0601Mg, typedArrayObtainStyledAttributes, index2, 1);
                        i6 = 1;
                        break;
                    case Yu0.b.S /* 97 */:
                        c0601Mg.o0 = typedArrayObtainStyledAttributes.getInt(index2, c0601Mg.o0);
                        i6 = 1;
                        break;
                }
                i7 += i6;
            }
            if (c0601Mg.j0 != null) {
                c0601Mg.i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c0576Lg;
    }

    public static int f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0038  */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    public static void g(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        C0550Kg c0550Kg;
        C0601Mg c0601Mg;
        C0498Ig c0498Ig;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 != 3) {
            if (i3 != 5) {
                dimensionPixelSize = typedArray.getInt(i, 0);
                if (dimensionPixelSize != -4) {
                    if (dimensionPixelSize != -3 && (dimensionPixelSize == -2 || dimensionPixelSize == -1)) {
                    }
                    z = false;
                } else {
                    i4 = -2;
                }
                if (obj instanceof C0498Ig) {
                    c0498Ig = (C0498Ig) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) c0498Ig).width = i4;
                        c0498Ig.W = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c0498Ig).height = i4;
                        c0498Ig.X = z;
                        return;
                    }
                }
                if (obj instanceof C0601Mg) {
                    c0601Mg = (C0601Mg) obj;
                    if (i2 == 0) {
                        c0601Mg.b = i4;
                        c0601Mg.l0 = z;
                        return;
                    } else {
                        c0601Mg.c = i4;
                        c0601Mg.m0 = z;
                        return;
                    }
                }
                if (obj instanceof C0550Kg) {
                    c0550Kg = (C0550Kg) obj;
                    if (i2 == 0) {
                        c0550Kg.b(23, i4);
                        c0550Kg.d(80, z);
                        return;
                    } else {
                        c0550Kg.b(21, i4);
                        c0550Kg.d(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
            i4 = dimensionPixelSize;
            z = false;
            if (obj instanceof C0498Ig) {
                c0498Ig = (C0498Ig) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) c0498Ig).width = i4;
                    c0498Ig.W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c0498Ig).height = i4;
                    c0498Ig.X = z;
                    return;
                }
            }
            if (obj instanceof C0601Mg) {
                c0601Mg = (C0601Mg) obj;
                if (i2 == 0) {
                    c0601Mg.b = i4;
                    c0601Mg.l0 = z;
                    return;
                } else {
                    c0601Mg.c = i4;
                    c0601Mg.m0 = z;
                    return;
                }
            }
            if (obj instanceof C0550Kg) {
                c0550Kg = (C0550Kg) obj;
                if (i2 == 0) {
                    c0550Kg.b(23, i4);
                    c0550Kg.d(80, z);
                    return;
                } else {
                    c0550Kg.b(21, i4);
                    c0550Kg.d(81, z);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof C0498Ig) {
                    C0498Ig c0498Ig2 = (C0498Ig) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) c0498Ig2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c0498Ig2).height = 0;
                    }
                    h(c0498Ig2, strTrim2);
                    return;
                }
                if (obj instanceof C0601Mg) {
                    ((C0601Mg) obj).y = strTrim2;
                    return;
                } else {
                    if (obj instanceof C0550Kg) {
                        ((C0550Kg) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f2 = Float.parseFloat(strTrim2);
                    if (obj instanceof C0498Ig) {
                        C0498Ig c0498Ig3 = (C0498Ig) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) c0498Ig3).width = 0;
                            c0498Ig3.H = f2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0498Ig3).height = 0;
                            c0498Ig3.I = f2;
                        }
                    } else if (obj instanceof C0601Mg) {
                        C0601Mg c0601Mg2 = (C0601Mg) obj;
                        if (i2 == 0) {
                            c0601Mg2.b = 0;
                            c0601Mg2.U = f2;
                        } else {
                            c0601Mg2.c = 0;
                            c0601Mg2.T = f2;
                        }
                    } else if (obj instanceof C0550Kg) {
                        C0550Kg c0550Kg2 = (C0550Kg) obj;
                        if (i2 == 0) {
                            c0550Kg2.b(23, 0);
                            c0550Kg2.a(39, f2);
                        } else {
                            c0550Kg2.b(21, 0);
                            c0550Kg2.a(40, f2);
                        }
                    }
                } else {
                    if (!"parent".equalsIgnoreCase(strTrim)) {
                        return;
                    }
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof C0498Ig) {
                        C0498Ig c0498Ig4 = (C0498Ig) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) c0498Ig4).width = 0;
                            c0498Ig4.R = fMax;
                            c0498Ig4.L = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0498Ig4).height = 0;
                            c0498Ig4.S = fMax;
                            c0498Ig4.M = 2;
                        }
                    } else if (obj instanceof C0601Mg) {
                        C0601Mg c0601Mg3 = (C0601Mg) obj;
                        if (i2 == 0) {
                            c0601Mg3.b = 0;
                            c0601Mg3.d0 = fMax;
                            c0601Mg3.X = 2;
                        } else {
                            c0601Mg3.c = 0;
                            c0601Mg3.e0 = fMax;
                            c0601Mg3.Y = 2;
                        }
                    } else if (obj instanceof C0550Kg) {
                        C0550Kg c0550Kg3 = (C0550Kg) obj;
                        if (i2 == 0) {
                            c0550Kg3.b(23, 0);
                            c0550Kg3.b(54, 2);
                        } else {
                            c0550Kg3.b(21, 0);
                            c0550Kg3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void h(C0498Ig c0498Ig, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i2 = i;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f2 = Float.parseFloat(strSubstring3);
                        float f3 = Float.parseFloat(strSubstring4);
                        if (f2 > 0.0f && f3 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(f3 / f2);
                            } else {
                                Math.abs(f2 / f3);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c0498Ig.G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.c;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                try {
                    childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                }
            } else {
                if (this.b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && map.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0576Lg c0576Lg = (C0576Lg) map.get(Integer.valueOf(id));
                    if (c0576Lg != null) {
                        if (childAt instanceof Barrier) {
                            C0601Mg c0601Mg = c0576Lg.d;
                            c0601Mg.h0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(c0601Mg.f0);
                            barrier.setMargin(c0601Mg.g0);
                            barrier.setAllowsGoneWidget(c0601Mg.n0);
                            int[] iArr = c0601Mg.i0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = c0601Mg.j0;
                                if (str != null) {
                                    int[] iArrC = c(barrier, str);
                                    c0601Mg.i0 = iArrC;
                                    barrier.setReferencedIds(iArrC);
                                }
                            }
                        }
                        C0498Ig c0498Ig = (C0498Ig) childAt.getLayoutParams();
                        c0498Ig.a();
                        c0576Lg.a(c0498Ig);
                        HashMap map2 = c0576Lg.f;
                        Class<?> cls = childAt.getClass();
                        for (String strT : map2.keySet()) {
                            C0420Fg c0420Fg = (C0420Fg) map2.get(strT);
                            if (!c0420Fg.a) {
                                strT = AbstractC1701hf0.t("set", strT);
                            }
                            try {
                                try {
                                    switch (AbstractC1701hf0.w(c0420Fg.b)) {
                                        case 0:
                                            Class<?>[] clsArr = new Class[1];
                                            try {
                                                clsArr[0] = Integer.TYPE;
                                                cls.getMethod(strT, clsArr).invoke(childAt, Integer.valueOf(c0420Fg.c));
                                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                                            } catch (NoSuchMethodException e2) {
                                                e = e2;
                                                e.getMessage();
                                            }
                                            break;
                                        case 1:
                                            cls.getMethod(strT, Float.TYPE).invoke(childAt, Float.valueOf(c0420Fg.d));
                                            break;
                                        case 2:
                                            cls.getMethod(strT, Integer.TYPE).invoke(childAt, Integer.valueOf(c0420Fg.g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(strT, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(c0420Fg.g);
                                            method.invoke(childAt, colorDrawable);
                                            break;
                                        case 4:
                                            cls.getMethod(strT, CharSequence.class).invoke(childAt, c0420Fg.e);
                                            break;
                                        case 5:
                                            cls.getMethod(strT, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0420Fg.f));
                                            break;
                                        case 6:
                                            cls.getMethod(strT, Float.TYPE).invoke(childAt, Float.valueOf(c0420Fg.d));
                                            break;
                                        case 7:
                                            try {
                                                cls.getMethod(strT, Integer.TYPE).invoke(childAt, Integer.valueOf(c0420Fg.c));
                                                break;
                                            } catch (IllegalAccessException | InvocationTargetException unused3) {
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                } catch (NoSuchMethodException e3) {
                                    e = e3;
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused4) {
                            }
                        }
                        childAt.setLayoutParams(c0498Ig);
                        C0653Og c0653Og = c0576Lg.b;
                        if (c0653Og.b == 0) {
                            childAt.setVisibility(c0653Og.a);
                        }
                        childAt.setAlpha(c0653Og.c);
                        C0679Pg c0679Pg = c0576Lg.e;
                        childAt.setRotation(c0679Pg.a);
                        childAt.setRotationX(c0679Pg.b);
                        childAt.setRotationY(c0679Pg.c);
                        childAt.setScaleX(c0679Pg.d);
                        childAt.setScaleY(c0679Pg.e);
                        if (c0679Pg.h != -1) {
                            View viewFindViewById = ((View) childAt.getParent()).findViewById(c0679Pg.h);
                            if (viewFindViewById != null) {
                                float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    float left = right - childAt.getLeft();
                                    float top = bottom - childAt.getTop();
                                    childAt.setPivotX(left);
                                    childAt.setPivotY(top);
                                }
                            }
                        } else {
                            if (!Float.isNaN(c0679Pg.f)) {
                                childAt.setPivotX(c0679Pg.f);
                            }
                            if (!Float.isNaN(c0679Pg.g)) {
                                childAt.setPivotY(c0679Pg.g);
                            }
                        }
                        childAt.setTranslationX(c0679Pg.i);
                        childAt.setTranslationY(c0679Pg.j);
                        childAt.setTranslationZ(c0679Pg.k);
                        if (c0679Pg.l) {
                            childAt.setElevation(c0679Pg.m);
                        }
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            C0576Lg c0576Lg2 = (C0576Lg) map.get(num);
            if (c0576Lg2 != null) {
                C0601Mg c0601Mg2 = c0576Lg2.d;
                if (c0601Mg2.h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = c0601Mg2.i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = c0601Mg2.j0;
                        if (str2 != null) {
                            int[] iArrC2 = c(barrier2, str2);
                            c0601Mg2.i0 = iArrC2;
                            barrier2.setReferencedIds(iArrC2);
                        }
                    }
                    barrier2.setType(c0601Mg2.f0);
                    barrier2.setMargin(c0601Mg2.g0);
                    C0498Ig c0498IgG = ConstraintLayout.g();
                    barrier2.k();
                    c0576Lg2.a(c0498IgG);
                    constraintLayout.addView(barrier2, c0498IgG);
                }
                if (c0601Mg2.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    C0498Ig c0498IgG2 = ConstraintLayout.g();
                    c0576Lg2.a(c0498IgG2);
                    constraintLayout.addView(guideline, c0498IgG2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof AbstractC0446Gg) {
                ((AbstractC0446Gg) childAt2).f(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        C0705Qg c0705Qg = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = c0705Qg.c;
        map.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0498Ig c0498Ig = (C0498Ig) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c0705Qg.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new C0576Lg());
            }
            C0576Lg c0576Lg = (C0576Lg) map.get(Integer.valueOf(id));
            if (c0576Lg != null) {
                HashMap map2 = c0705Qg.a;
                HashMap map3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : map2.keySet()) {
                    C0420Fg c0420Fg = (C0420Fg) map2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new C0420Fg(c0420Fg, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            map3.put(str, new C0420Fg(c0420Fg, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                }
                c0576Lg.f = map3;
                c0576Lg.a = id;
                int i2 = c0498Ig.e;
                C0601Mg c0601Mg = c0576Lg.d;
                c0601Mg.h = i2;
                c0601Mg.i = c0498Ig.f;
                c0601Mg.j = c0498Ig.g;
                c0601Mg.k = c0498Ig.h;
                c0601Mg.l = c0498Ig.i;
                c0601Mg.m = c0498Ig.j;
                c0601Mg.n = c0498Ig.k;
                c0601Mg.f399o = c0498Ig.l;
                c0601Mg.p = c0498Ig.m;
                c0601Mg.q = c0498Ig.n;
                c0601Mg.r = c0498Ig.f327o;
                c0601Mg.s = c0498Ig.s;
                c0601Mg.t = c0498Ig.t;
                c0601Mg.u = c0498Ig.u;
                c0601Mg.v = c0498Ig.v;
                c0601Mg.w = c0498Ig.E;
                c0601Mg.x = c0498Ig.F;
                c0601Mg.y = c0498Ig.G;
                c0601Mg.z = c0498Ig.p;
                c0601Mg.A = c0498Ig.q;
                c0601Mg.B = c0498Ig.r;
                c0601Mg.C = c0498Ig.T;
                c0601Mg.D = c0498Ig.U;
                c0601Mg.E = c0498Ig.V;
                c0601Mg.f = c0498Ig.c;
                c0601Mg.d = c0498Ig.a;
                c0601Mg.e = c0498Ig.b;
                c0601Mg.b = ((ViewGroup.MarginLayoutParams) c0498Ig).width;
                c0601Mg.c = ((ViewGroup.MarginLayoutParams) c0498Ig).height;
                c0601Mg.F = ((ViewGroup.MarginLayoutParams) c0498Ig).leftMargin;
                c0601Mg.G = ((ViewGroup.MarginLayoutParams) c0498Ig).rightMargin;
                c0601Mg.H = ((ViewGroup.MarginLayoutParams) c0498Ig).topMargin;
                c0601Mg.I = ((ViewGroup.MarginLayoutParams) c0498Ig).bottomMargin;
                c0601Mg.L = c0498Ig.D;
                c0601Mg.T = c0498Ig.I;
                c0601Mg.U = c0498Ig.H;
                c0601Mg.W = c0498Ig.K;
                c0601Mg.V = c0498Ig.J;
                c0601Mg.l0 = c0498Ig.W;
                c0601Mg.m0 = c0498Ig.X;
                c0601Mg.X = c0498Ig.L;
                c0601Mg.Y = c0498Ig.M;
                c0601Mg.Z = c0498Ig.P;
                c0601Mg.a0 = c0498Ig.Q;
                c0601Mg.b0 = c0498Ig.N;
                c0601Mg.c0 = c0498Ig.O;
                c0601Mg.d0 = c0498Ig.R;
                c0601Mg.e0 = c0498Ig.S;
                c0601Mg.k0 = c0498Ig.Y;
                c0601Mg.N = c0498Ig.x;
                c0601Mg.P = c0498Ig.z;
                c0601Mg.M = c0498Ig.w;
                c0601Mg.O = c0498Ig.y;
                c0601Mg.R = c0498Ig.A;
                c0601Mg.Q = c0498Ig.B;
                c0601Mg.S = c0498Ig.C;
                c0601Mg.o0 = c0498Ig.Z;
                c0601Mg.J = c0498Ig.getMarginEnd();
                c0601Mg.K = c0498Ig.getMarginStart();
                int visibility = childAt.getVisibility();
                C0653Og c0653Og = c0576Lg.b;
                c0653Og.a = visibility;
                c0653Og.c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                C0679Pg c0679Pg = c0576Lg.e;
                c0679Pg.a = rotation;
                c0679Pg.b = childAt.getRotationX();
                c0679Pg.c = childAt.getRotationY();
                c0679Pg.d = childAt.getScaleX();
                c0679Pg.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c0679Pg.f = pivotX;
                    c0679Pg.g = pivotY;
                }
                c0679Pg.i = childAt.getTranslationX();
                c0679Pg.j = childAt.getTranslationY();
                c0679Pg.k = childAt.getTranslationZ();
                if (c0679Pg.l) {
                    c0679Pg.m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    c0601Mg.n0 = barrier.getAllowsGoneWidget();
                    c0601Mg.i0 = barrier.getReferencedIds();
                    c0601Mg.f0 = barrier.getType();
                    c0601Mg.g0 = barrier.getMargin();
                }
            }
            i++;
            c0705Qg = this;
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0576Lg c0576LgD = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        c0576LgD.d.a = true;
                    }
                    this.c.put(Integer.valueOf(c0576LgD.a), c0576LgD);
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }
}
