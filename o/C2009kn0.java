package o;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.skidush.clonex.fragments.favorites.FavoritesMobileFragment;
import com.skidush.clonex.fragments.favorites.FavoritesTvFragment;
import com.skidush.clonex.fragments.search.SearchMobileFragment;
import com.skidush.clonex.fragments.search.SearchTvFragment;

/* JADX INFO: renamed from: o.kn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2009kn0 extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ C2107ln0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f876o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2009kn0(C2107ln0 c2107ln0, ConstraintLayout constraintLayout, int i) {
        super(0);
        this.m = i;
        this.n = c2107ln0;
        this.f876o = constraintLayout;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        boolean z;
        boolean z2;
        switch (this.m) {
            case 0:
                C2107ln0 c2107ln0 = this.n;
                C1387eR c1387eR = c2107ln0.w;
                if (c1387eR == null) {
                    AbstractC1474fG.U("channel");
                    throw null;
                }
                String str = c1387eR.a;
                String str2 = c1387eR.b;
                String str3 = c1387eR.h;
                if (str3 == null) {
                    str3 = "";
                }
                Is0 is0 = new Is0(str, str2, "", str3);
                ConstraintLayout constraintLayout = this.f876o;
                Context context = constraintLayout.getContext();
                AbstractC1474fG.i(context, "getContext(...)");
                AbstractActivityC1540fx abstractActivityC1540fx = context instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context : null;
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO = abstractActivityC1540fx != null ? AbstractC0397Ej.o(abstractActivityC1540fx) : null;
                if (abstractComponentCallbacksC1247cxO instanceof FavoritesMobileFragment) {
                    c2107ln0.y();
                    C1387eR c1387eR2 = c2107ln0.w;
                    if (c1387eR2 == null) {
                        AbstractC1474fG.U("channel");
                        throw null;
                    }
                    String str4 = c1387eR2.a;
                    String str5 = c1387eR2.b;
                    AbstractC1474fG.j(str4, "id");
                    AbstractC1474fG.j(str5, "title");
                    z = AbstractC0397Ej.z(constraintLayout, new C0796Tt(str4, str5, is0));
                } else if (abstractComponentCallbacksC1247cxO instanceof SearchMobileFragment) {
                    C1387eR c1387eR3 = c2107ln0.w;
                    if (c1387eR3 == null) {
                        AbstractC1474fG.U("channel");
                        throw null;
                    }
                    String str6 = c1387eR3.a;
                    String str7 = c1387eR3.b;
                    AbstractC1474fG.j(str6, "id");
                    AbstractC1474fG.j(str7, "title");
                    z = AbstractC0397Ej.z(constraintLayout, new C2178ma0(str6, str7, "Canal en vivo", is0));
                } else {
                    C1387eR c1387eR4 = c2107ln0.w;
                    if (c1387eR4 == null) {
                        AbstractC1474fG.U("channel");
                        throw null;
                    }
                    String str8 = c1387eR4.a;
                    String str9 = c1387eR4.b;
                    AbstractC1474fG.j(str8, "id");
                    AbstractC1474fG.j(str9, "title");
                    z = AbstractC0397Ej.z(constraintLayout, new CC(str8, str9, "Canal en vivo", is0));
                }
                return Boolean.valueOf(z);
            default:
                C2107ln0 c2107ln1 = this.n;
                C1387eR c1387eR5 = c2107ln1.w;
                if (c1387eR5 == null) {
                    AbstractC1474fG.U("channel");
                    throw null;
                }
                String str10 = c1387eR5.a;
                String str11 = c1387eR5.b;
                String str12 = c1387eR5.h;
                if (str12 == null) {
                    str12 = "";
                }
                Is0 is1 = new Is0(str10, str11, "", str12);
                ConstraintLayout constraintLayout2 = this.f876o;
                Context context2 = constraintLayout2.getContext();
                AbstractC1474fG.i(context2, "getContext(...)");
                AbstractActivityC1540fx abstractActivityC1540fx2 = context2 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context2 : null;
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO2 = abstractActivityC1540fx2 != null ? AbstractC0397Ej.o(abstractActivityC1540fx2) : null;
                if (abstractComponentCallbacksC1247cxO2 instanceof FavoritesTvFragment) {
                    c2107ln1.y();
                    C1387eR c1387eR6 = c2107ln1.w;
                    if (c1387eR6 == null) {
                        AbstractC1474fG.U("channel");
                        throw null;
                    }
                    String str13 = c1387eR6.a;
                    String str14 = c1387eR6.b;
                    AbstractC1474fG.j(str13, "id");
                    AbstractC1474fG.j(str14, "title");
                    z2 = AbstractC0397Ej.z(constraintLayout2, new C0900Xt(str13, str14, is1));
                } else if (abstractComponentCallbacksC1247cxO2 instanceof SearchTvFragment) {
                    C1387eR c1387eR7 = c2107ln1.w;
                    if (c1387eR7 == null) {
                        AbstractC1474fG.U("channel");
                        throw null;
                    }
                    String str15 = c1387eR7.a;
                    String str16 = c1387eR7.b;
                    AbstractC1474fG.j(str15, "id");
                    AbstractC1474fG.j(str16, "title");
                    z2 = AbstractC0397Ej.z(constraintLayout2, new C3050va0(str15, str16, "Canal en vivo", is1));
                } else {
                    C1387eR c1387eR8 = c2107ln1.w;
                    if (c1387eR8 == null) {
                        AbstractC1474fG.U("channel");
                        throw null;
                    }
                    String str17 = c1387eR8.a;
                    String str18 = c1387eR8.b;
                    AbstractC1474fG.j(str17, "id");
                    AbstractC1474fG.j(str18, "title");
                    z2 = AbstractC0397Ej.z(constraintLayout2, new HC(str17, str18, "Canal en vivo", is1));
                }
                return Boolean.valueOf(z2);
        }
    }
}
