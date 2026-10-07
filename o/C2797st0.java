package o;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: o.st0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2797st0 extends AbstractC2455pN {
    public final /* synthetic */ int p;

    public C2797st0(int i, Class cls, int i2, int i3, int i4) {
        this.p = i4;
        this.l = i;
        this.f969o = cls;
        this.n = i2;
        this.m = i3;
    }

    @Override // o.AbstractC2455pN
    public final Object c(View view) {
        switch (this.p) {
            case 0:
                return Boolean.valueOf(Bt0.d(view));
            case 1:
                return Bt0.b(view);
            case 2:
                return Dt0.b(view);
            default:
                return Boolean.valueOf(Bt0.c(view));
        }
    }

    @Override // o.AbstractC2455pN
    public final void d(View view, Object obj) {
        switch (this.p) {
            case 0:
                Bt0.j(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                Bt0.h(view, (CharSequence) obj);
                break;
            case 2:
                Dt0.f(view, (CharSequence) obj);
                break;
            default:
                Bt0.g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // o.AbstractC2455pN
    public final boolean h(Object obj, Object obj2) {
        switch (this.p) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            case 2:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
