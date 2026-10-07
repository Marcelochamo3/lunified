package o;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.skidush.clonex.R;
import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.fragments.home.HomeTvFragment;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.p5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC2432p5 extends Dialog {
    public final Object l;

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v45 java.lang.Object, still in use, count: 2, list:
          (r1v45 java.lang.Object) from 0x02b7: PHI (r1 I:??) = (r1v42 java.lang.Object), (r1v45 java.lang.Object) binds: [B:92:0x02b6, B:166:0x02b7] A[DONT_GENERATE, DONT_INLINE]
          (r1v45 java.lang.Object) from 0x02af: CHECK_CAST (o.Br0) (r1v45 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public DialogC2432p5(android.content.Context r17, int r18) {
        /*
            Method dump skipped, instruction units count: 1168
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DialogC2432p5.<init>(android.content.Context, int):void");
    }

    public static final void a(List list, DialogC2432p5 dialogC2432p5, IF r6) {
        Iterator it = list.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            C1101bX c1101bX = (C1101bX) it.next();
            Br0 br0 = (Br0) c1101bX.l;
            ImageView imageView = ((OG) c1101bX.m).f430o;
            if (r6.m != br0) {
                i = 8;
            }
            imageView.setVisibility(i);
        }
        ((C3267xm) dialogC2432p5.l).n.setEnabled(r6.m != null);
        ((C3267xm) dialogC2432p5.l).n.setAlpha(r6.m != null ? 1.0f : 0.6f);
    }

    public static final void b(List list, DialogC2432p5 dialogC2432p5, IF r6) {
        Iterator it = list.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            C1101bX c1101bX = (C1101bX) it.next();
            Br0 br0 = (Br0) c1101bX.l;
            ImageView imageView = ((PG) c1101bX.m).f453o;
            if (r6.m != br0) {
                i = 8;
            }
            imageView.setVisibility(i);
        }
        ((C3267xm) dialogC2432p5.l).n.setEnabled(r6.m != null);
        ((C3267xm) dialogC2432p5.l).n.setAlpha(r6.m != null ? 1.0f : 0.6f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:45:0x0114  */
    /* JADX WARN: Code duplicated, block: B:47:0x0122  */
    public DialogC2432p5(Context context, InterfaceC3106w3 interfaceC3106w3) {
        String string;
        String string2;
        String string3;
        WindowManager.LayoutParams layoutParams;
        WindowManager.LayoutParams attributes;
        String string4;
        String string5;
        String string6;
        String str;
        super(context);
        final int i = 1;
        final int i2 = 0;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.dialog_show_options_tv, (ViewGroup) null, false);
        int i3 = R.id.btn_option_cancel;
        TextView textView = (TextView) Sr0.g(viewInflate, R.id.btn_option_cancel);
        if (textView != null) {
            i3 = R.id.btn_option_episode_open_tv_show;
            TextView textView2 = (TextView) Sr0.g(viewInflate, R.id.btn_option_episode_open_tv_show);
            if (textView2 != null) {
                i3 = R.id.btn_option_program_clear;
                TextView textView3 = (TextView) Sr0.g(viewInflate, R.id.btn_option_program_clear);
                if (textView3 != null) {
                    i3 = R.id.btn_option_show_favorite;
                    TextView textView4 = (TextView) Sr0.g(viewInflate, R.id.btn_option_show_favorite);
                    if (textView4 != null) {
                        i3 = R.id.btn_option_show_watched;
                        TextView textView5 = (TextView) Sr0.g(viewInflate, R.id.btn_option_show_watched);
                        if (textView5 != null) {
                            i3 = R.id.iv_options_show_poster;
                            ImageView imageView = (ImageView) Sr0.g(viewInflate, R.id.iv_options_show_poster);
                            if (imageView != null) {
                                i3 = R.id.tv_options_show_title;
                                TextView textView6 = (TextView) Sr0.g(viewInflate, R.id.tv_options_show_title);
                                if (textView6 != null) {
                                    TextView textView7 = (TextView) Sr0.g(viewInflate, R.id.tv_show_subtitle);
                                    if (textView7 != null) {
                                        this.l = AppDatabase.m.w(context);
                                        setContentView((ConstraintLayout) viewInflate);
                                        textView.setOnClickListener(new ViewOnClickListenerC3251xe(26, this));
                                        if (interfaceC3106w3 instanceof C0456Gq) {
                                            final C0456Gq c0456Gq = (C0456Gq) interfaceC3106w3;
                                            ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E = com.bumptech.glide.a.e(getContext());
                                            String str2 = c0456Gq.d;
                                            if (str2 == null) {
                                                C2109lo0 c2109lo0 = c0456Gq.e;
                                                str2 = c2109lo0 != null ? c2109lo0.h : null;
                                            }
                                            ((C2630r70) ((C2630r70) componentCallbacks2C3406z70E.n(str2).j(R.drawable.glide_fallback_cover)).k()).H(imageView);
                                            C2109lo0 c2109lo1 = c0456Gq.e;
                                            textView6.setText((c2109lo1 == null || (str = c2109lo1.b) == null) ? "" : str);
                                            Ma0 ma0 = c0456Gq.f;
                                            if (ma0 != null) {
                                                ma0 = ma0.b == 0 ? null : ma0;
                                                if (ma0 != null) {
                                                    Context context2 = getContext();
                                                    Integer numValueOf = Integer.valueOf(ma0.b);
                                                    Integer numValueOf2 = Integer.valueOf(c0456Gq.b);
                                                    String string7 = c0456Gq.c;
                                                    if (string7 == null) {
                                                        string7 = getContext().getString(R.string.episode_number, Integer.valueOf(c0456Gq.b));
                                                        AbstractC1474fG.i(string7, "getString(...)");
                                                    }
                                                    string5 = context2.getString(R.string.episode_item_info, numValueOf, numValueOf2, string7);
                                                    if (string5 == null) {
                                                        Context context3 = getContext();
                                                        Integer numValueOf3 = Integer.valueOf(c0456Gq.b);
                                                        string4 = c0456Gq.c;
                                                        if (string4 == null) {
                                                            string4 = getContext().getString(R.string.episode_number, Integer.valueOf(c0456Gq.b));
                                                            AbstractC1474fG.i(string4, "getString(...)");
                                                        }
                                                        string5 = context3.getString(R.string.episode_item_info_episode_only, numValueOf3, string4);
                                                    }
                                                } else {
                                                    Context context4 = getContext();
                                                    Integer numValueOf4 = Integer.valueOf(c0456Gq.b);
                                                    string4 = c0456Gq.c;
                                                    if (string4 == null) {
                                                        string4 = getContext().getString(R.string.episode_number, Integer.valueOf(c0456Gq.b));
                                                        AbstractC1474fG.i(string4, "getString(...)");
                                                    }
                                                    string5 = context4.getString(R.string.episode_item_info_episode_only, numValueOf4, string4);
                                                }
                                            } else {
                                                Context context5 = getContext();
                                                Integer numValueOf5 = Integer.valueOf(c0456Gq.b);
                                                string4 = c0456Gq.c;
                                                if (string4 == null) {
                                                    string4 = getContext().getString(R.string.episode_number, Integer.valueOf(c0456Gq.b));
                                                    AbstractC1474fG.i(string4, "getString(...)");
                                                }
                                                string5 = context5.getString(R.string.episode_item_info_episode_only, numValueOf5, string4);
                                            }
                                            textView7.setText(string5);
                                            textView2.setOnClickListener(new ViewOnClickListenerC2238n5(textView2, c0456Gq, this, 3));
                                            Context context6 = textView2.getContext();
                                            AbstractC1474fG.i(context6, "getContext(...)");
                                            AbstractActivityC1540fx abstractActivityC1540fx = context6 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context6 : null;
                                            textView2.setVisibility((abstractActivityC1540fx != null ? AbstractC0397Ej.o(abstractActivityC1540fx) : null) instanceof HomeTvFragment ? 0 : 8);
                                            textView2.requestFocus();
                                            textView4.setVisibility(8);
                                            textView5.setOnClickListener(new View.OnClickListener(this) { // from class: o.Hd0
                                                public final /* synthetic */ DialogC2432p5 m;

                                                {
                                                    this.m = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    switch (i2) {
                                                        case 0:
                                                            DialogC2432p5 dialogC2432p5 = this.m;
                                                            AbstractC1474fG.j(dialogC2432p5, "this$0");
                                                            C0456Gq c0456Gq2 = c0456Gq;
                                                            AbstractC1474fG.j(c0456Gq2, "$episode");
                                                            C0560Kq c0560KqO = ((AppDatabase) dialogC2432p5.l).o();
                                                            C0456Gq c0456GqF = C0456Gq.f(c0456Gq2);
                                                            c0456GqF.g(c0456Gq2);
                                                            boolean z = !c0456GqF.h;
                                                            c0456GqF.h = z;
                                                            if (z) {
                                                                c0456GqF.i = Calendar.getInstance();
                                                                c0456GqF.j = null;
                                                            } else {
                                                                c0456GqF.i = null;
                                                            }
                                                            c0560KqO.q(c0456GqF);
                                                            dialogC2432p5.hide();
                                                            break;
                                                        default:
                                                            DialogC2432p5 dialogC2432p6 = this.m;
                                                            AbstractC1474fG.j(dialogC2432p6, "this$0");
                                                            C0456Gq c0456Gq3 = c0456Gq;
                                                            AbstractC1474fG.j(c0456Gq3, "$episode");
                                                            C0560Kq c0560KqO2 = ((AppDatabase) dialogC2432p6.l).o();
                                                            C0456Gq c0456GqF2 = C0456Gq.f(c0456Gq3);
                                                            c0456GqF2.g(c0456Gq3);
                                                            c0456GqF2.j = null;
                                                            c0560KqO2.q(c0456GqF2);
                                                            dialogC2432p6.hide();
                                                            break;
                                                    }
                                                }
                                            });
                                            if (c0456Gq.h) {
                                                string6 = textView5.getContext().getString(R.string.option_show_unwatched);
                                            } else {
                                                string6 = textView5.getContext().getString(R.string.option_show_watched);
                                            }
                                            textView5.setText(string6);
                                            textView5.setVisibility(0);
                                            textView3.setOnClickListener(new View.OnClickListener(this) { // from class: o.Hd0
                                                public final /* synthetic */ DialogC2432p5 m;

                                                {
                                                    this.m = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    switch (i) {
                                                        case 0:
                                                            DialogC2432p5 dialogC2432p5 = this.m;
                                                            AbstractC1474fG.j(dialogC2432p5, "this$0");
                                                            C0456Gq c0456Gq2 = c0456Gq;
                                                            AbstractC1474fG.j(c0456Gq2, "$episode");
                                                            C0560Kq c0560KqO = ((AppDatabase) dialogC2432p5.l).o();
                                                            C0456Gq c0456GqF = C0456Gq.f(c0456Gq2);
                                                            c0456GqF.g(c0456Gq2);
                                                            boolean z = !c0456GqF.h;
                                                            c0456GqF.h = z;
                                                            if (z) {
                                                                c0456GqF.i = Calendar.getInstance();
                                                                c0456GqF.j = null;
                                                            } else {
                                                                c0456GqF.i = null;
                                                            }
                                                            c0560KqO.q(c0456GqF);
                                                            dialogC2432p5.hide();
                                                            break;
                                                        default:
                                                            DialogC2432p5 dialogC2432p6 = this.m;
                                                            AbstractC1474fG.j(dialogC2432p6, "this$0");
                                                            C0456Gq c0456Gq3 = c0456Gq;
                                                            AbstractC1474fG.j(c0456Gq3, "$episode");
                                                            C0560Kq c0560KqO2 = ((AppDatabase) dialogC2432p6.l).o();
                                                            C0456Gq c0456GqF2 = C0456Gq.f(c0456Gq3);
                                                            c0456GqF2.g(c0456Gq3);
                                                            c0456GqF2.j = null;
                                                            c0560KqO2.q(c0456GqF2);
                                                            dialogC2432p6.hide();
                                                            break;
                                                    }
                                                }
                                            });
                                            textView3.setVisibility(c0456Gq.j == null ? 8 : 0);
                                        } else if (interfaceC3106w3 instanceof C1387eR) {
                                            final C1387eR c1387eR = (C1387eR) interfaceC3106w3;
                                            ((C2630r70) ((C2630r70) com.bumptech.glide.a.e(getContext()).n(c1387eR.h).j(R.drawable.glide_fallback_cover)).k()).H(imageView);
                                            textView6.setText(c1387eR.b);
                                            Calendar calendar = c1387eR.f754o;
                                            textView7.setText(calendar != null ? AbstractC0397Ej.m(calendar, "yyyy") : null);
                                            textView2.setVisibility(8);
                                            textView4.setOnClickListener(new View.OnClickListener(this) { // from class: o.Gd0
                                                public final /* synthetic */ DialogC2432p5 m;

                                                {
                                                    this.m = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    switch (i2) {
                                                        case 0:
                                                            DialogC2432p5 dialogC2432p5 = this.m;
                                                            AbstractC1474fG.j(dialogC2432p5, "this$0");
                                                            C1387eR c1387eR2 = c1387eR;
                                                            AbstractC1474fG.j(c1387eR2, "$movie");
                                                            C1583gR c1583gRP = ((AppDatabase) dialogC2432p5.l).p();
                                                            C1387eR c1387eRF = C1387eR.f(c1387eR2, null, null, 32767);
                                                            c1387eRF.h(c1387eR2);
                                                            c1387eRF.p = !c1387eRF.p;
                                                            c1583gRP.F(c1387eRF);
                                                            dialogC2432p5.hide();
                                                            break;
                                                        case 1:
                                                            DialogC2432p5 dialogC2432p6 = this.m;
                                                            AbstractC1474fG.j(dialogC2432p6, "this$0");
                                                            C1387eR c1387eR3 = c1387eR;
                                                            AbstractC1474fG.j(c1387eR3, "$movie");
                                                            C1583gR c1583gRP2 = ((AppDatabase) dialogC2432p6.l).p();
                                                            C1387eR c1387eRF2 = C1387eR.f(c1387eR3, null, null, 32767);
                                                            c1387eRF2.h(c1387eR3);
                                                            boolean z = !c1387eRF2.q;
                                                            c1387eRF2.q = z;
                                                            if (z) {
                                                                c1387eRF2.r = Calendar.getInstance();
                                                                c1387eRF2.s = null;
                                                            } else {
                                                                c1387eRF2.r = null;
                                                            }
                                                            c1583gRP2.F(c1387eRF2);
                                                            dialogC2432p6.hide();
                                                            break;
                                                        default:
                                                            DialogC2432p5 dialogC2432p7 = this.m;
                                                            AbstractC1474fG.j(dialogC2432p7, "this$0");
                                                            C1387eR c1387eR4 = c1387eR;
                                                            AbstractC1474fG.j(c1387eR4, "$movie");
                                                            C1583gR c1583gRP3 = ((AppDatabase) dialogC2432p7.l).p();
                                                            C1387eR c1387eRF3 = C1387eR.f(c1387eR4, null, null, 32767);
                                                            c1387eRF3.h(c1387eR4);
                                                            c1387eRF3.s = null;
                                                            c1583gRP3.F(c1387eRF3);
                                                            dialogC2432p7.hide();
                                                            break;
                                                    }
                                                }
                                            });
                                            if (c1387eR.p) {
                                                string2 = textView4.getContext().getString(R.string.option_show_unfavorite);
                                            } else {
                                                string2 = textView4.getContext().getString(R.string.option_show_favorite);
                                            }
                                            textView4.setText(string2);
                                            textView4.setVisibility(0);
                                            textView4.requestFocus();
                                            final int i4 = 1;
                                            textView5.setOnClickListener(new View.OnClickListener(this) { // from class: o.Gd0
                                                public final /* synthetic */ DialogC2432p5 m;

                                                {
                                                    this.m = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    switch (i4) {
                                                        case 0:
                                                            DialogC2432p5 dialogC2432p5 = this.m;
                                                            AbstractC1474fG.j(dialogC2432p5, "this$0");
                                                            C1387eR c1387eR2 = c1387eR;
                                                            AbstractC1474fG.j(c1387eR2, "$movie");
                                                            C1583gR c1583gRP = ((AppDatabase) dialogC2432p5.l).p();
                                                            C1387eR c1387eRF = C1387eR.f(c1387eR2, null, null, 32767);
                                                            c1387eRF.h(c1387eR2);
                                                            c1387eRF.p = !c1387eRF.p;
                                                            c1583gRP.F(c1387eRF);
                                                            dialogC2432p5.hide();
                                                            break;
                                                        case 1:
                                                            DialogC2432p5 dialogC2432p6 = this.m;
                                                            AbstractC1474fG.j(dialogC2432p6, "this$0");
                                                            C1387eR c1387eR3 = c1387eR;
                                                            AbstractC1474fG.j(c1387eR3, "$movie");
                                                            C1583gR c1583gRP2 = ((AppDatabase) dialogC2432p6.l).p();
                                                            C1387eR c1387eRF2 = C1387eR.f(c1387eR3, null, null, 32767);
                                                            c1387eRF2.h(c1387eR3);
                                                            boolean z = !c1387eRF2.q;
                                                            c1387eRF2.q = z;
                                                            if (z) {
                                                                c1387eRF2.r = Calendar.getInstance();
                                                                c1387eRF2.s = null;
                                                            } else {
                                                                c1387eRF2.r = null;
                                                            }
                                                            c1583gRP2.F(c1387eRF2);
                                                            dialogC2432p6.hide();
                                                            break;
                                                        default:
                                                            DialogC2432p5 dialogC2432p7 = this.m;
                                                            AbstractC1474fG.j(dialogC2432p7, "this$0");
                                                            C1387eR c1387eR4 = c1387eR;
                                                            AbstractC1474fG.j(c1387eR4, "$movie");
                                                            C1583gR c1583gRP3 = ((AppDatabase) dialogC2432p7.l).p();
                                                            C1387eR c1387eRF3 = C1387eR.f(c1387eR4, null, null, 32767);
                                                            c1387eRF3.h(c1387eR4);
                                                            c1387eRF3.s = null;
                                                            c1583gRP3.F(c1387eRF3);
                                                            dialogC2432p7.hide();
                                                            break;
                                                    }
                                                }
                                            });
                                            if (c1387eR.q) {
                                                string3 = textView5.getContext().getString(R.string.option_show_unwatched);
                                            } else {
                                                string3 = textView5.getContext().getString(R.string.option_show_watched);
                                            }
                                            textView5.setText(string3);
                                            textView5.setVisibility(0);
                                            final int i5 = 2;
                                            textView3.setOnClickListener(new View.OnClickListener(this) { // from class: o.Gd0
                                                public final /* synthetic */ DialogC2432p5 m;

                                                {
                                                    this.m = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    switch (i5) {
                                                        case 0:
                                                            DialogC2432p5 dialogC2432p5 = this.m;
                                                            AbstractC1474fG.j(dialogC2432p5, "this$0");
                                                            C1387eR c1387eR2 = c1387eR;
                                                            AbstractC1474fG.j(c1387eR2, "$movie");
                                                            C1583gR c1583gRP = ((AppDatabase) dialogC2432p5.l).p();
                                                            C1387eR c1387eRF = C1387eR.f(c1387eR2, null, null, 32767);
                                                            c1387eRF.h(c1387eR2);
                                                            c1387eRF.p = !c1387eRF.p;
                                                            c1583gRP.F(c1387eRF);
                                                            dialogC2432p5.hide();
                                                            break;
                                                        case 1:
                                                            DialogC2432p5 dialogC2432p6 = this.m;
                                                            AbstractC1474fG.j(dialogC2432p6, "this$0");
                                                            C1387eR c1387eR3 = c1387eR;
                                                            AbstractC1474fG.j(c1387eR3, "$movie");
                                                            C1583gR c1583gRP2 = ((AppDatabase) dialogC2432p6.l).p();
                                                            C1387eR c1387eRF2 = C1387eR.f(c1387eR3, null, null, 32767);
                                                            c1387eRF2.h(c1387eR3);
                                                            boolean z = !c1387eRF2.q;
                                                            c1387eRF2.q = z;
                                                            if (z) {
                                                                c1387eRF2.r = Calendar.getInstance();
                                                                c1387eRF2.s = null;
                                                            } else {
                                                                c1387eRF2.r = null;
                                                            }
                                                            c1583gRP2.F(c1387eRF2);
                                                            dialogC2432p6.hide();
                                                            break;
                                                        default:
                                                            DialogC2432p5 dialogC2432p7 = this.m;
                                                            AbstractC1474fG.j(dialogC2432p7, "this$0");
                                                            C1387eR c1387eR4 = c1387eR;
                                                            AbstractC1474fG.j(c1387eR4, "$movie");
                                                            C1583gR c1583gRP3 = ((AppDatabase) dialogC2432p7.l).p();
                                                            C1387eR c1387eRF3 = C1387eR.f(c1387eR4, null, null, 32767);
                                                            c1387eRF3.h(c1387eR4);
                                                            c1387eRF3.s = null;
                                                            c1583gRP3.F(c1387eRF3);
                                                            dialogC2432p7.hide();
                                                            break;
                                                    }
                                                }
                                            });
                                            textView3.setVisibility(c1387eR.s == null ? 8 : 0);
                                        } else if (interfaceC3106w3 instanceof C2109lo0) {
                                            C2109lo0 c2109lo2 = (C2109lo0) interfaceC3106w3;
                                            ((C2630r70) ((C2630r70) com.bumptech.glide.a.e(getContext()).n(c2109lo2.h).j(R.drawable.glide_fallback_cover)).k()).H(imageView);
                                            textView6.setText(c2109lo2.b);
                                            Calendar calendar2 = c2109lo2.p;
                                            textView7.setText(calendar2 != null ? AbstractC0397Ej.m(calendar2, "yyyy") : null);
                                            textView2.setVisibility(8);
                                            textView4.setOnClickListener(new ViewOnClickListenerC1010ac(this, 14, c2109lo2));
                                            if (c2109lo2.q) {
                                                string = textView4.getContext().getString(R.string.option_show_unfavorite);
                                            } else {
                                                string = textView4.getContext().getString(R.string.option_show_favorite);
                                            }
                                            textView4.setText(string);
                                            textView4.setVisibility(0);
                                            textView4.requestFocus();
                                            textView5.setVisibility(8);
                                            textView3.setVisibility(8);
                                        }
                                        Window window = getWindow();
                                        if (window != null) {
                                            Window window2 = getWindow();
                                            if (window2 == null || (attributes = window2.getAttributes()) == null) {
                                                layoutParams = null;
                                            } else {
                                                attributes.gravity = 8388613;
                                                layoutParams = attributes;
                                            }
                                            window.setAttributes(layoutParams);
                                        }
                                        Window window3 = getWindow();
                                        if (window3 != null) {
                                            window3.setLayout((int) (((double) context.getResources().getDisplayMetrics().widthPixels) * 0.35d), context.getResources().getDisplayMetrics().heightPixels);
                                            return;
                                        }
                                        return;
                                    }
                                    i3 = R.id.tv_show_subtitle;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
    }
}
