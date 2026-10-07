package o;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import androidx.leanback.widget.PagingIndicator;

/* JADX INFO: renamed from: o.zc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3441zc extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3441zc(Class cls, String str, int i) {
        super(cls, str);
        this.a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((YW) obj).a);
            case 6:
                return Float.valueOf(((YW) obj).e);
            case 7:
                return Float.valueOf(((YW) obj).c);
            case 8:
                return Integer.valueOf(((Pg0) obj).getStreamPosition());
            case 9:
                return Float.valueOf(((SwitchCompat) obj).K);
            case 10:
                return Float.valueOf(AbstractC3381yu0.a.r((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                C0338Cc c0338Cc = (C0338Cc) obj;
                PointF pointF = (PointF) obj2;
                c0338Cc.getClass();
                c0338Cc.a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c0338Cc.b = iRound;
                int i = c0338Cc.f + 1;
                c0338Cc.f = i;
                if (i == c0338Cc.g) {
                    AbstractC3381yu0.a(c0338Cc.e, c0338Cc.a, iRound, c0338Cc.c, c0338Cc.d);
                    c0338Cc.f = 0;
                    c0338Cc.g = 0;
                }
                break;
            case 1:
                C0338Cc c0338Cc2 = (C0338Cc) obj;
                PointF pointF2 = (PointF) obj2;
                c0338Cc2.getClass();
                c0338Cc2.c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c0338Cc2.d = iRound2;
                int i2 = c0338Cc2.g + 1;
                c0338Cc2.g = i2;
                if (c0338Cc2.f == i2) {
                    AbstractC3381yu0.a(c0338Cc2.e, c0338Cc2.a, c0338Cc2.b, c0338Cc2.c, iRound2);
                    c0338Cc2.f = 0;
                    c0338Cc2.g = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC3381yu0.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC3381yu0.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                AbstractC3381yu0.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                YW yw = (YW) obj;
                yw.a = ((Float) obj2).floatValue();
                yw.a();
                yw.j.invalidate();
                break;
            case 6:
                YW yw2 = (YW) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                yw2.e = fFloatValue;
                float f = fFloatValue / 2.0f;
                yw2.f = f;
                PagingIndicator pagingIndicator = yw2.j;
                yw2.g = f * pagingIndicator.G;
                pagingIndicator.invalidate();
                break;
            case 7:
                YW yw3 = (YW) obj;
                yw3.c = ((Float) obj2).floatValue() * yw3.h * yw3.i;
                yw3.j.invalidate();
                break;
            case 8:
                ((Pg0) obj).setStreamPosition(((Integer) obj2).intValue());
                break;
            case 9:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 10:
                float fFloatValue2 = ((Float) obj2).floatValue();
                AbstractC3381yu0.a.F((View) obj, fFloatValue2);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
