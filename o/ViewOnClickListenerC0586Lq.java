package o;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.skidush.clonex.R;
import com.skidush.clonex.fragments.history.HistoryMobileFragment;
import com.skidush.clonex.fragments.history.HistoryTvFragment;
import com.skidush.clonex.fragments.home.HomeMobileFragment;
import com.skidush.clonex.fragments.home.HomeTvFragment;
import com.skidush.clonex.fragments.search.SearchMobileFragment;
import com.skidush.clonex.fragments.search.SearchTvFragment;

/* JADX INFO: renamed from: o.Lq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0586Lq implements View.OnClickListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ ConstraintLayout m;
    public final /* synthetic */ C0663Oq n;

    public /* synthetic */ ViewOnClickListenerC0586Lq(int i, ConstraintLayout constraintLayout, C0663Oq c0663Oq) {
        this.l = i;
        this.n = c0663Oq;
        this.m = constraintLayout;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x022a  */
    /* JADX WARN: Code duplicated, block: B:164:0x0232  */
    /* JADX WARN: Code duplicated, block: B:166:0x023c  */
    /* JADX WARN: Code duplicated, block: B:168:0x0240  */
    /* JADX WARN: Code duplicated, block: B:170:0x0248  */
    /* JADX WARN: Code duplicated, block: B:172:0x025e  */
    /* JADX WARN: Code duplicated, block: B:209:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:211:0x02ee  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Context context;
        C0456Gq c0456Gq;
        Integer numValueOf;
        C0456Gq c0456Gq2;
        String string;
        String string2;
        Context context2;
        C0456Gq c0456Gq3;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13 = "";
        ConstraintLayout constraintLayout = this.m;
        C0663Oq c0663Oq = this.n;
        switch (this.l) {
            case 0:
                AbstractC1474fG.j(c0663Oq, "this$0");
                AbstractC1474fG.j(constraintLayout, "$this_apply");
                C0456Gq c0456Gq4 = c0663Oq.w;
                if (c0456Gq4 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                C2109lo0 c2109lo0 = c0456Gq4.e;
                if ((c2109lo0 == null || (str = c2109lo0.b) == null) && (str = c0456Gq4.c) == null) {
                    str = "";
                }
                String strU = c0663Oq.u();
                Hs0 hs0V = c0663Oq.v();
                TT ttH = U9.o(constraintLayout).h();
                Integer numValueOf2 = ttH != null ? Integer.valueOf(ttH.s) : null;
                if (numValueOf2 != null && numValueOf2.intValue() == R.id.history) {
                    c0663Oq.w();
                    C0456Gq c0456Gq5 = c0663Oq.w;
                    if (c0456Gq5 == null) {
                        AbstractC1474fG.U("episode");
                        throw null;
                    }
                    C2109lo0 c2109lo1 = c0456Gq5.e;
                    if (c2109lo1 == null || (str3 = c2109lo1.a) == null) {
                        return;
                    }
                    String str14 = AbstractC1899jh0.O(str3) ^ true ? str3 : null;
                    if (str14 != null) {
                        AbstractC0397Ej.z(constraintLayout, new C3315yB(str14));
                        return;
                    }
                    return;
                }
                if (numValueOf2 != null && numValueOf2.intValue() == R.id.home) {
                    C0456Gq c0456Gq6 = c0663Oq.w;
                    if (c0456Gq6 == null) {
                        AbstractC1474fG.U("episode");
                        throw null;
                    }
                    C2109lo0 c2109lo2 = c0456Gq6.e;
                    if (c2109lo2 == null || (str2 = c2109lo2.a) == null) {
                        str2 = "";
                    }
                    if (AbstractC0397Ej.z(constraintLayout, new IC(str2))) {
                        C0456Gq c0456Gq7 = c0663Oq.w;
                        if (c0456Gq7 == null) {
                            AbstractC1474fG.U("episode");
                            throw null;
                        }
                        String str15 = c0456Gq7.a;
                        AbstractC1474fG.j(str15, "id");
                        AbstractC0397Ej.z(constraintLayout, new Bo0(str15, str, strU, hs0V));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                AbstractC1474fG.j(constraintLayout, "$this_apply");
                AbstractC1474fG.j(c0663Oq, "this$0");
                Context context3 = constraintLayout.getContext();
                AbstractC1474fG.i(context3, "getContext(...)");
                AbstractActivityC1540fx abstractActivityC1540fx = context3 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context3 : null;
                if ((abstractActivityC1540fx != null ? AbstractC0397Ej.o(abstractActivityC1540fx) : null) instanceof HistoryMobileFragment) {
                    c0663Oq.w();
                    C0456Gq c0456Gq8 = c0663Oq.w;
                    if (c0456Gq8 == null) {
                        AbstractC1474fG.U("episode");
                        throw null;
                    }
                    C2109lo0 c2109lo3 = c0456Gq8.e;
                    if (c2109lo3 == null || (str8 = c2109lo3.a) == null) {
                        return;
                    }
                    str9 = AbstractC1899jh0.O(str8) ^ true ? str8 : null;
                    if (str9 != null) {
                        AbstractC0397Ej.z(constraintLayout, new C3024vB(str9));
                        return;
                    }
                    return;
                }
                C0456Gq c0456Gq9 = c0663Oq.w;
                if (c0456Gq9 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                C2109lo0 c2109lo4 = c0456Gq9.e;
                if (c2109lo4 == null || (str4 = c2109lo4.a) == null) {
                    str4 = "";
                }
                AbstractC0397Ej.z(constraintLayout, new DC(str4));
                C0456Gq c0456Gq10 = c0663Oq.w;
                if (c0456Gq10 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                String str16 = c0456Gq10.a;
                C2109lo0 c2109lo5 = c0456Gq10.e;
                if (c2109lo5 == null || (str5 = c2109lo5.b) == null) {
                    str5 = "";
                }
                Ma0 ma0 = c0456Gq10.f;
                if (ma0 == null) {
                    context = constraintLayout.getContext();
                    c0456Gq = c0663Oq.w;
                    if (c0456Gq == null) {
                        AbstractC1474fG.U("episode");
                        throw null;
                    }
                    numValueOf = Integer.valueOf(c0456Gq.b);
                    c0456Gq2 = c0663Oq.w;
                    if (c0456Gq2 == null) {
                        AbstractC1474fG.U("episode");
                        throw null;
                    }
                    string = c0456Gq2.c;
                    if (string == null) {
                        context2 = constraintLayout.getContext();
                        c0456Gq3 = c0663Oq.w;
                        if (c0456Gq3 == null) {
                            AbstractC1474fG.U("episode");
                            throw null;
                        }
                        string = context2.getString(R.string.episode_number, Integer.valueOf(c0456Gq3.b));
                        AbstractC1474fG.i(string, "getString(...)");
                    }
                    string2 = context.getString(R.string.player_subtitle_tv_show_episode_only, numValueOf, string);
                } else {
                    if (ma0.b == 0) {
                        ma0 = null;
                    }
                    if (ma0 != null) {
                        Context context4 = constraintLayout.getContext();
                        Integer numValueOf3 = Integer.valueOf(ma0.b);
                        C0456Gq c0456Gq11 = c0663Oq.w;
                        if (c0456Gq11 == null) {
                            AbstractC1474fG.U("episode");
                            throw null;
                        }
                        Integer numValueOf4 = Integer.valueOf(c0456Gq11.b);
                        C0456Gq c0456Gq12 = c0663Oq.w;
                        if (c0456Gq12 == null) {
                            AbstractC1474fG.U("episode");
                            throw null;
                        }
                        String string3 = c0456Gq12.c;
                        if (string3 == null) {
                            Context context5 = constraintLayout.getContext();
                            C0456Gq c0456Gq13 = c0663Oq.w;
                            if (c0456Gq13 == null) {
                                AbstractC1474fG.U("episode");
                                throw null;
                            }
                            string3 = context5.getString(R.string.episode_number, Integer.valueOf(c0456Gq13.b));
                            AbstractC1474fG.i(string3, "getString(...)");
                        }
                        string2 = context4.getString(R.string.player_subtitle_tv_show, numValueOf3, numValueOf4, string3);
                        if (string2 == null) {
                            context = constraintLayout.getContext();
                            c0456Gq = c0663Oq.w;
                            if (c0456Gq == null) {
                                AbstractC1474fG.U("episode");
                                throw null;
                            }
                            numValueOf = Integer.valueOf(c0456Gq.b);
                            c0456Gq2 = c0663Oq.w;
                            if (c0456Gq2 == null) {
                                AbstractC1474fG.U("episode");
                                throw null;
                            }
                            string = c0456Gq2.c;
                            if (string == null) {
                                context2 = constraintLayout.getContext();
                                c0456Gq3 = c0663Oq.w;
                                if (c0456Gq3 == null) {
                                    AbstractC1474fG.U("episode");
                                    throw null;
                                }
                                string = context2.getString(R.string.episode_number, Integer.valueOf(c0456Gq3.b));
                                AbstractC1474fG.i(string, "getString(...)");
                            }
                            string2 = context.getString(R.string.player_subtitle_tv_show_episode_only, numValueOf, string);
                        }
                    } else {
                        context = constraintLayout.getContext();
                        c0456Gq = c0663Oq.w;
                        if (c0456Gq == null) {
                            AbstractC1474fG.U("episode");
                            throw null;
                        }
                        numValueOf = Integer.valueOf(c0456Gq.b);
                        c0456Gq2 = c0663Oq.w;
                        if (c0456Gq2 == null) {
                            AbstractC1474fG.U("episode");
                            throw null;
                        }
                        string = c0456Gq2.c;
                        if (string == null) {
                            context2 = constraintLayout.getContext();
                            c0456Gq3 = c0663Oq.w;
                            if (c0456Gq3 == null) {
                                AbstractC1474fG.U("episode");
                                throw null;
                            }
                            string = context2.getString(R.string.episode_number, Integer.valueOf(c0456Gq3.b));
                            AbstractC1474fG.i(string, "getString(...)");
                        }
                        string2 = context.getString(R.string.player_subtitle_tv_show_episode_only, numValueOf, string);
                    }
                }
                AbstractC1474fG.g(string2);
                C0456Gq c0456Gq14 = c0663Oq.w;
                if (c0456Gq14 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                String str17 = c0456Gq14.a;
                int i = c0456Gq14.b;
                String str18 = c0456Gq14.c;
                String str19 = c0456Gq14.d;
                C2109lo0 c2109lo6 = c0456Gq14.e;
                if (c2109lo6 == null || (str6 = c2109lo6.a) == null) {
                    str6 = "";
                }
                if (c2109lo6 == null || (str7 = c2109lo6.b) == null) {
                    str7 = "";
                }
                Gs0 gs0 = new Gs0(str6, str7, c2109lo6 != null ? c2109lo6.h : null, c2109lo6 != null ? c2109lo6.i : null);
                C0456Gq c0456Gq15 = c0663Oq.w;
                if (c0456Gq15 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                Ma0 ma1 = c0456Gq15.f;
                Hs0 hs0 = new Hs0(str17, i, str18, str19, gs0, new Fs0(ma1 != null ? ma1.b : 0, ma1 != null ? ma1.c : null));
                AbstractC1474fG.j(str16, "id");
                AbstractC0397Ej.z(constraintLayout, new C2884to0(str16, str5, string2, hs0));
                return;
            case 2:
                AbstractC1474fG.j(c0663Oq, "this$0");
                AbstractC1474fG.j(constraintLayout, "$this_apply");
                Hs0 hs0V2 = c0663Oq.v();
                C0456Gq c0456Gq16 = c0663Oq.w;
                if (c0456Gq16 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                C2109lo0 c2109lo7 = c0456Gq16.e;
                if (c2109lo7 == null || (str11 = c2109lo7.b) == null) {
                    String str20 = c0456Gq16.c;
                    if (str20 != null) {
                        str13 = str20;
                    }
                } else {
                    str13 = str11;
                }
                String strU2 = c0663Oq.u();
                Context context6 = constraintLayout.getContext();
                AbstractC1474fG.i(context6, "getContext(...)");
                AbstractActivityC1540fx abstractActivityC1540fx2 = context6 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context6 : null;
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO = abstractActivityC1540fx2 != null ? AbstractC0397Ej.o(abstractActivityC1540fx2) : null;
                if (abstractComponentCallbacksC1247cxO instanceof HomeTvFragment) {
                    C0456Gq c0456Gq17 = c0663Oq.w;
                    if (c0456Gq17 == null) {
                        AbstractC1474fG.U("episode");
                        throw null;
                    }
                    String str21 = c0456Gq17.a;
                    AbstractC1474fG.j(str21, "id");
                    AbstractC0397Ej.z(constraintLayout, new HC(str21, str13, strU2, hs0V2));
                    return;
                }
                if (abstractComponentCallbacksC1247cxO instanceof SearchTvFragment) {
                    C0456Gq c0456Gq18 = c0663Oq.w;
                    if (c0456Gq18 == null) {
                        AbstractC1474fG.U("episode");
                        throw null;
                    }
                    String str22 = c0456Gq18.a;
                    AbstractC1474fG.j(str22, "id");
                    AbstractC0397Ej.z(constraintLayout, new C3050va0(str22, str13, strU2, hs0V2));
                    return;
                }
                if (!(abstractComponentCallbacksC1247cxO instanceof HistoryTvFragment)) {
                    C0456Gq c0456Gq19 = c0663Oq.w;
                    if (c0456Gq19 == null) {
                        AbstractC1474fG.U("episode");
                        throw null;
                    }
                    String str23 = c0456Gq19.a;
                    AbstractC1474fG.j(str23, "id");
                    AbstractC0397Ej.z(constraintLayout, new Va0(str23, str13, strU2, hs0V2));
                    return;
                }
                c0663Oq.w();
                C0456Gq c0456Gq20 = c0663Oq.w;
                if (c0456Gq20 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                C2109lo0 c2109lo8 = c0456Gq20.e;
                if (c2109lo8 == null || (str10 = c2109lo8.a) == null) {
                    return;
                }
                str9 = AbstractC1899jh0.O(str10) ^ true ? str10 : null;
                if (str9 != null) {
                    AbstractC0397Ej.z(constraintLayout, new C3315yB(str9));
                    return;
                }
                return;
            default:
                AbstractC1474fG.j(c0663Oq, "this$0");
                AbstractC1474fG.j(constraintLayout, "$this_apply");
                Hs0 hs0V3 = c0663Oq.v();
                C0456Gq c0456Gq21 = c0663Oq.w;
                if (c0456Gq21 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                C2109lo0 c2109lo9 = c0456Gq21.e;
                if (c2109lo9 == null || (str12 = c2109lo9.b) == null) {
                    String str24 = c0456Gq21.c;
                    if (str24 != null) {
                        str13 = str24;
                    }
                } else {
                    str13 = str12;
                }
                String strU3 = c0663Oq.u();
                Context context7 = constraintLayout.getContext();
                AbstractC1474fG.i(context7, "getContext(...)");
                AbstractActivityC1540fx abstractActivityC1540fx3 = context7 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context7 : null;
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO2 = abstractActivityC1540fx3 != null ? AbstractC0397Ej.o(abstractActivityC1540fx3) : null;
                if (abstractComponentCallbacksC1247cxO2 instanceof HomeMobileFragment) {
                    C0456Gq c0456Gq22 = c0663Oq.w;
                    if (c0456Gq22 == null) {
                        AbstractC1474fG.U("episode");
                        throw null;
                    }
                    String str25 = c0456Gq22.a;
                    AbstractC1474fG.j(str25, "id");
                    AbstractC0397Ej.z(constraintLayout, new CC(str25, str13, strU3, hs0V3));
                    return;
                }
                if (abstractComponentCallbacksC1247cxO2 instanceof SearchMobileFragment) {
                    C0456Gq c0456Gq23 = c0663Oq.w;
                    if (c0456Gq23 == null) {
                        AbstractC1474fG.U("episode");
                        throw null;
                    }
                    String str26 = c0456Gq23.a;
                    AbstractC1474fG.j(str26, "id");
                    AbstractC0397Ej.z(constraintLayout, new C2178ma0(str26, str13, strU3, hs0V3));
                    return;
                }
                C0456Gq c0456Gq24 = c0663Oq.w;
                if (c0456Gq24 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                String str27 = c0456Gq24.a;
                AbstractC1474fG.j(str27, "id");
                AbstractC0397Ej.z(constraintLayout, new Ra0(str27, str13, strU3, hs0V3));
                return;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0586Lq(ConstraintLayout constraintLayout, C0663Oq c0663Oq) {
        this.l = 1;
        this.m = constraintLayout;
        this.n = c0663Oq;
    }
}
