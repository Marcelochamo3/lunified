package o;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.skidush.clonex.R;
import j$.time.format.DateTimeFormatter;
import java.util.Iterator;

/* JADX INFO: renamed from: o.ln0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2107ln0 extends AbstractC2144m60 {
    public final InterfaceC2604qt0 u;
    public final Context v;
    public C1387eR w;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2107ln0(InterfaceC2604qt0 interfaceC2604qt0) {
        View viewB = interfaceC2604qt0.b();
        super(viewB);
        this.u = interfaceC2604qt0;
        this.v = viewB.getContext();
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0236  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:236:0x0422  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a8  */
    public final void u(C1387eR c1387eR) {
        boolean z;
        int iW;
        int iW2;
        int i;
        int iW3;
        boolean z2;
        int iW4;
        int iW5;
        ImageView.ScaleType scaleType;
        this.w = c1387eR;
        InterfaceC2604qt0 interfaceC2604qt0 = this.u;
        boolean z3 = interfaceC2604qt0 instanceof QG;
        C0789Tm c0789Tm = C0789Tm.e;
        Context context = this.v;
        if (z3) {
            QG qg = (QG) interfaceC2604qt0;
            boolean zX = x();
            C1387eR c1387eR2 = this.w;
            if (c1387eR2 == null) {
                AbstractC1474fG.U("channel");
                throw null;
            }
            Object obj = c1387eR2.n.get("ppv_event_card");
            Boolean bool = Boolean.TRUE;
            if (AbstractC1474fG.b(obj, bool)) {
                z2 = true;
            } else {
                C1387eR c1387eR3 = this.w;
                if (c1387eR3 == null) {
                    AbstractC1474fG.U("channel");
                    throw null;
                }
                if (AbstractC1474fG.b(c1387eR3.t, "PPV.ST")) {
                    z2 = true;
                } else {
                    C1387eR c1387eR4 = this.w;
                    if (c1387eR4 == null) {
                        AbstractC1474fG.U("channel");
                        throw null;
                    }
                    if (AbstractC1899jh0.U(c1387eR4.a, "ppv-", false)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
            C1387eR c1387eR5 = this.w;
            if (c1387eR5 == null) {
                AbstractC1474fG.U("channel");
                throw null;
            }
            boolean zB = AbstractC1474fG.b(c1387eR5.n.get("fana_card_aspect"), "vertical");
            if (z2) {
                iW4 = w(168);
            } else if (zX && zB) {
                iW4 = w(116);
            } else {
                iW4 = zX ? w(180) : w(96);
            }
            if (z2) {
                iW5 = w(94);
            } else if (zX && zB) {
                iW5 = w(206);
            } else {
                iW5 = zX ? w(101) : w(96);
            }
            boolean z4 = z2 || zX;
            int iW6 = w(z4 ? 8 : 6);
            qg.l.setPadding(iW6, iW6, iW6, iW6);
            ImageView imageView = qg.m;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = iW4;
            layoutParams.height = iW5;
            imageView.setLayoutParams(layoutParams);
            if (zX) {
                C1387eR c1387eR6 = this.w;
                if (c1387eR6 == null) {
                    AbstractC1474fG.U("channel");
                    throw null;
                }
                if (AbstractC1474fG.b(c1387eR6.n.get("fana_live_logo"), bool)) {
                    scaleType = ImageView.ScaleType.FIT_CENTER;
                } else {
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
            } else {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            imageView.setScaleType(scaleType);
            int iW7 = z4 ? 0 : w(12);
            imageView.setPadding(iW7, iW7, iW7, iW7);
            TextView textView = qg.p;
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            layoutParams2.width = iW4;
            textView.setLayoutParams(layoutParams2);
            TextView textView2 = qg.f471o;
            ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
            layoutParams3.width = iW4;
            textView2.setLayoutParams(layoutParams3);
            textView.setMaxLines(z4 ? 3 : 2);
            textView.setTextSize(2, z4 ? 13.0f : 12.0f);
            final ConstraintLayout constraintLayout = qg.l;
            final int i2 = 1;
            constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: o.in0
                public final /* synthetic */ C2107ln0 m;

                {
                    this.m = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConstraintLayout constraintLayout2 = constraintLayout;
                    C2107ln0 c2107ln0 = this.m;
                    switch (i2) {
                        case 0:
                            AbstractC1474fG.j(c2107ln0, "this$0");
                            AbstractC1474fG.j(constraintLayout2, "$this_apply");
                            C2009kn0 c2009kn0 = new C2009kn0(c2107ln0, constraintLayout2, 1);
                            C1387eR c1387eR7 = c2107ln0.w;
                            if (c1387eR7 == null) {
                                AbstractC1474fG.U("channel");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR7.n.get("is_adult"), Boolean.TRUE)) {
                                C2379oe c2379oe = C2379oe.b;
                                C1387eR c1387eR8 = c2107ln0.w;
                                if (c1387eR8 == null) {
                                    AbstractC1474fG.U("channel");
                                    throw null;
                                }
                                if (!C2379oe.u(c1387eR8.b)) {
                                    c2009kn0.c();
                                    return;
                                }
                            }
                            c2107ln0.z(new C3279xs(c2009kn0, 7));
                            return;
                        default:
                            AbstractC1474fG.j(c2107ln0, "this$0");
                            AbstractC1474fG.j(constraintLayout2, "$this_apply");
                            C2009kn0 c2009kn1 = new C2009kn0(c2107ln0, constraintLayout2, 0);
                            C1387eR c1387eR9 = c2107ln0.w;
                            if (c1387eR9 == null) {
                                AbstractC1474fG.U("channel");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR9.n.get("is_adult"), Boolean.TRUE)) {
                                C2379oe c2379oe2 = C2379oe.b;
                                C1387eR c1387eR10 = c2107ln0.w;
                                if (c1387eR10 == null) {
                                    AbstractC1474fG.U("channel");
                                    throw null;
                                }
                                if (!C2379oe.u(c1387eR10.b)) {
                                    c2009kn1.c();
                                    return;
                                }
                            }
                            c2107ln0.z(new C3279xs(c2009kn1, 6));
                            return;
                    }
                }
            });
            constraintLayout.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: o.jn0
                public final /* synthetic */ C2107ln0 m;

                {
                    this.m = this;
                }

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    switch (i2) {
                        case 0:
                            C2107ln0 c2107ln0 = this.m;
                            AbstractC1474fG.j(c2107ln0, "this$0");
                            ConstraintLayout constraintLayout2 = constraintLayout;
                            AbstractC1474fG.j(constraintLayout2, "$this_apply");
                            c2107ln0.y();
                            Context context2 = constraintLayout2.getContext();
                            AbstractC1474fG.i(context2, "getContext(...)");
                            C1387eR c1387eR7 = c2107ln0.w;
                            if (c1387eR7 != null) {
                                new DialogC2432p5(context2, c1387eR7).show();
                                return true;
                            }
                            AbstractC1474fG.U("channel");
                            throw null;
                        default:
                            C2107ln0 c2107ln1 = this.m;
                            AbstractC1474fG.j(c2107ln1, "this$0");
                            ConstraintLayout constraintLayout3 = constraintLayout;
                            AbstractC1474fG.j(constraintLayout3, "$this_apply");
                            c2107ln1.y();
                            Context context3 = constraintLayout3.getContext();
                            AbstractC1474fG.i(context3, "getContext(...)");
                            C1387eR c1387eR8 = c2107ln1.w;
                            if (c1387eR8 != null) {
                                new Fd0(context3, c1387eR8).show();
                                return true;
                            }
                            AbstractC1474fG.U("channel");
                            throw null;
                    }
                }
            });
            boolean zX2 = x();
            ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E = com.bumptech.glide.a.e(context);
            C1387eR c1387eR7 = this.w;
            if (c1387eR7 == null) {
                AbstractC1474fG.U("channel");
                throw null;
            }
            C2630r70 c2630r70 = (C2630r70) ((C2630r70) ((C2630r70) ((C2630r70) componentCallbacks2C3406z70E.n(c1387eR7.h).g(c0789Tm)).q(R.drawable.ic_provider_default_logo)).j(R.drawable.ic_provider_default_logo)).h(R.drawable.ic_provider_default_logo);
            c2630r70.getClass();
            AbstractC2050l8 abstractC2050l8U = c2630r70.u(AbstractC0932Yz.b, bool);
            AbstractC1474fG.i(abstractC2050l8U, "dontAnimate(...)");
            C2630r70 c2630r71 = (C2630r70) abstractC2050l8U;
            if (zX2) {
                C1387eR c1387eR8 = this.w;
                if (c1387eR8 == null) {
                    AbstractC1474fG.U("channel");
                    throw null;
                }
                if (AbstractC1474fG.b(c1387eR8.n.get("fana_live_logo"), bool)) {
                    c2630r71.p(320, 320);
                    c2630r71.k();
                } else {
                    ((C2630r70) c2630r71.p(360, 203)).r(EnumC1651h30.m);
                    c2630r71.c();
                }
            } else {
                c2630r71.p(320, 320);
                c2630r71.k();
            }
            c2630r71.H(imageView);
            C1387eR c1387eR9 = this.w;
            if (c1387eR9 == null) {
                AbstractC1474fG.U("channel");
                throw null;
            }
            textView.setText(c1387eR9.b);
            v(textView2);
            C1387eR c1387eR10 = this.w;
            if (c1387eR10 == null) {
                AbstractC1474fG.U("channel");
                throw null;
            }
            Object obj2 = c1387eR10.n.get("is_live_channel");
            qg.n.setVisibility(AbstractC1474fG.b(obj2 != null ? obj2.toString() : null, "false") ? 8 : 0);
            return;
        }
        if (interfaceC2604qt0 instanceof RG) {
            RG rg = (RG) interfaceC2604qt0;
            boolean zX3 = x();
            C1387eR c1387eR11 = this.w;
            if (c1387eR11 == null) {
                AbstractC1474fG.U("channel");
                throw null;
            }
            Object obj3 = c1387eR11.n.get("ppv_event_card");
            Boolean bool2 = Boolean.TRUE;
            if (AbstractC1474fG.b(obj3, bool2)) {
                z = true;
            } else {
                C1387eR c1387eR12 = this.w;
                if (c1387eR12 == null) {
                    AbstractC1474fG.U("channel");
                    throw null;
                }
                if (AbstractC1474fG.b(c1387eR12.t, "PPV.ST")) {
                    z = true;
                } else {
                    C1387eR c1387eR13 = this.w;
                    if (c1387eR13 == null) {
                        AbstractC1474fG.U("channel");
                        throw null;
                    }
                    if (AbstractC1899jh0.U(c1387eR13.a, "ppv-", false)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            C1387eR c1387eR14 = this.w;
            if (c1387eR14 == null) {
                AbstractC1474fG.U("channel");
                throw null;
            }
            boolean zB2 = AbstractC1474fG.b(c1387eR14.n.get("fana_card_aspect"), "vertical");
            if (z) {
                iW = w(208);
            } else if (zX3) {
                iW = zB2 ? w(120) : w(208);
            } else {
                iW = w(84);
            }
            if (z) {
                iW2 = w(Yu0.b.f0);
            } else if (zX3) {
                iW2 = zB2 ? w(213) : w(Yu0.b.f0);
            } else {
                iW2 = w(84);
            }
            boolean z5 = zX3 || z;
            int iW8 = w(z5 ? 9 : 6);
            rg.l.setPadding(iW8, iW8, iW8, iW8);
            ImageView imageView2 = rg.m;
            ViewGroup.LayoutParams layoutParams4 = imageView2.getLayoutParams();
            layoutParams4.width = iW;
            layoutParams4.height = iW2;
            imageView2.setLayoutParams(layoutParams4);
            imageView2.setScaleType(zX3 ? ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_CENTER);
            imageView2.setPadding(z5 ? 0 : w(8), z5 ? 0 : w(8), z5 ? 0 : w(8), z5 ? 0 : w(8));
            TextView textView3 = rg.p;
            ViewGroup.LayoutParams layoutParams5 = textView3.getLayoutParams();
            layoutParams5.width = iW;
            textView3.setLayoutParams(layoutParams5);
            TextView textView4 = rg.f485o;
            ViewGroup.LayoutParams layoutParams6 = textView4.getLayoutParams();
            layoutParams6.width = iW;
            textView4.setLayoutParams(layoutParams6);
            textView3.setMaxLines(z5 ? 3 : 2);
            textView3.setTextSize(2, z5 ? 14.0f : 9.0f);
            LinearLayout linearLayout = rg.n;
            View childAt = linearLayout.getChildAt(1);
            TextView textView5 = childAt instanceof TextView ? (TextView) childAt : null;
            if (textView5 != null) {
                textView5.setTextSize(2, z5 ? 11.0f : 8.0f);
            }
            View childAt2 = linearLayout.getChildAt(0);
            ImageView imageView3 = childAt2 instanceof ImageView ? (ImageView) childAt2 : null;
            if (imageView3 != null) {
                ViewGroup.LayoutParams layoutParams7 = imageView3.getLayoutParams();
                layoutParams7.width = z5 ? w(7) : w(5);
                layoutParams7.height = z5 ? w(7) : w(5);
                imageView3.setLayoutParams(layoutParams7);
            }
            int iW9 = z5 ? w(7) : w(4);
            if (z5) {
                iW3 = w(3);
                i = 2;
            } else {
                i = 2;
                iW3 = w(2);
            }
            linearLayout.setPadding(iW9, iW3, z5 ? w(7) : w(4), z5 ? w(3) : w(i));
            final ConstraintLayout constraintLayout2 = rg.l;
            final int i3 = 0;
            constraintLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: o.in0
                public final /* synthetic */ C2107ln0 m;

                {
                    this.m = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConstraintLayout constraintLayout3 = constraintLayout2;
                    C2107ln0 c2107ln0 = this.m;
                    switch (i3) {
                        case 0:
                            AbstractC1474fG.j(c2107ln0, "this$0");
                            AbstractC1474fG.j(constraintLayout3, "$this_apply");
                            C2009kn0 c2009kn0 = new C2009kn0(c2107ln0, constraintLayout3, 1);
                            C1387eR c1387eR15 = c2107ln0.w;
                            if (c1387eR15 == null) {
                                AbstractC1474fG.U("channel");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR15.n.get("is_adult"), Boolean.TRUE)) {
                                C2379oe c2379oe = C2379oe.b;
                                C1387eR c1387eR16 = c2107ln0.w;
                                if (c1387eR16 == null) {
                                    AbstractC1474fG.U("channel");
                                    throw null;
                                }
                                if (!C2379oe.u(c1387eR16.b)) {
                                    c2009kn0.c();
                                    return;
                                }
                            }
                            c2107ln0.z(new C3279xs(c2009kn0, 7));
                            return;
                        default:
                            AbstractC1474fG.j(c2107ln0, "this$0");
                            AbstractC1474fG.j(constraintLayout3, "$this_apply");
                            C2009kn0 c2009kn1 = new C2009kn0(c2107ln0, constraintLayout3, 0);
                            C1387eR c1387eR17 = c2107ln0.w;
                            if (c1387eR17 == null) {
                                AbstractC1474fG.U("channel");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR17.n.get("is_adult"), Boolean.TRUE)) {
                                C2379oe c2379oe2 = C2379oe.b;
                                C1387eR c1387eR18 = c2107ln0.w;
                                if (c1387eR18 == null) {
                                    AbstractC1474fG.U("channel");
                                    throw null;
                                }
                                if (!C2379oe.u(c1387eR18.b)) {
                                    c2009kn1.c();
                                    return;
                                }
                            }
                            c2107ln0.z(new C3279xs(c2009kn1, 6));
                            return;
                    }
                }
            });
            constraintLayout2.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: o.jn0
                public final /* synthetic */ C2107ln0 m;

                {
                    this.m = this;
                }

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    switch (i3) {
                        case 0:
                            C2107ln0 c2107ln0 = this.m;
                            AbstractC1474fG.j(c2107ln0, "this$0");
                            ConstraintLayout constraintLayout3 = constraintLayout2;
                            AbstractC1474fG.j(constraintLayout3, "$this_apply");
                            c2107ln0.y();
                            Context context2 = constraintLayout3.getContext();
                            AbstractC1474fG.i(context2, "getContext(...)");
                            C1387eR c1387eR15 = c2107ln0.w;
                            if (c1387eR15 != null) {
                                new DialogC2432p5(context2, c1387eR15).show();
                                return true;
                            }
                            AbstractC1474fG.U("channel");
                            throw null;
                        default:
                            C2107ln0 c2107ln1 = this.m;
                            AbstractC1474fG.j(c2107ln1, "this$0");
                            ConstraintLayout constraintLayout4 = constraintLayout2;
                            AbstractC1474fG.j(constraintLayout4, "$this_apply");
                            c2107ln1.y();
                            Context context3 = constraintLayout4.getContext();
                            AbstractC1474fG.i(context3, "getContext(...)");
                            C1387eR c1387eR16 = c2107ln1.w;
                            if (c1387eR16 != null) {
                                new Fd0(context3, c1387eR16).show();
                                return true;
                            }
                            AbstractC1474fG.U("channel");
                            throw null;
                    }
                }
            });
            constraintLayout2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0637Nq(constraintLayout2, rg, this, 3));
            ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E2 = com.bumptech.glide.a.e(context);
            C1387eR c1387eR15 = this.w;
            if (c1387eR15 == null) {
                AbstractC1474fG.U("channel");
                throw null;
            }
            C2630r70 c2630r72 = (C2630r70) ((C2630r70) ((C2630r70) ((C2630r70) ((C2630r70) componentCallbacks2C3406z70E2.n(c1387eR15.h).g(c0789Tm)).p(640, 360)).q(R.drawable.ic_provider_default_logo)).j(R.drawable.ic_provider_default_logo)).h(R.drawable.ic_provider_default_logo);
            c2630r72.getClass();
            AbstractC2050l8 abstractC2050l8U2 = c2630r72.u(AbstractC0932Yz.b, bool2);
            AbstractC1474fG.i(abstractC2050l8U2, "dontAnimate(...)");
            C2630r70 c2630r73 = (C2630r70) abstractC2050l8U2;
            if (x()) {
                C1387eR c1387eR16 = this.w;
                if (c1387eR16 == null) {
                    AbstractC1474fG.U("channel");
                    throw null;
                }
                if (AbstractC1474fG.b(c1387eR16.n.get("fana_live_logo"), bool2)) {
                    c2630r73.k();
                } else {
                    c2630r73.c();
                }
            } else {
                c2630r73.k();
            }
            c2630r73.H(imageView2);
            C1387eR c1387eR17 = this.w;
            if (c1387eR17 == null) {
                AbstractC1474fG.U("channel");
                throw null;
            }
            Object obj4 = c1387eR17.n.get("is_live_channel");
            linearLayout.setVisibility(AbstractC1474fG.b(obj4 != null ? obj4.toString() : null, "false") ? 8 : 0);
            C1387eR c1387eR18 = this.w;
            if (c1387eR18 == null) {
                AbstractC1474fG.U("channel");
                throw null;
            }
            textView3.setText(c1387eR18.b);
            v(textView4);
        }
    }

    public final void v(TextView textView) {
        DateTimeFormatter dateTimeFormatter = AbstractC0511It.a;
        C1387eR c1387eR = this.w;
        if (c1387eR == null) {
            AbstractC1474fG.U("channel");
            throw null;
        }
        Object obj = c1387eR.n.get("fana_start_date");
        String strA = AbstractC0511It.a(obj instanceof String ? (String) obj : null);
        textView.setText(strA == null ? "" : strA);
        textView.setVisibility(strA == null ? 8 : 0);
    }

    public final int w(int i) {
        return (int) (i * this.v.getResources().getDisplayMetrics().density);
    }

    public final boolean x() {
        C1387eR c1387eR = this.w;
        if (c1387eR == null) {
            AbstractC1474fG.U("channel");
            throw null;
        }
        if (!c1387eR.n.containsKey("fana_source_id")) {
            C1387eR c1387eR2 = this.w;
            if (c1387eR2 == null) {
                AbstractC1474fG.U("channel");
                throw null;
            }
            if (!c1387eR2.n.containsKey("fana_card_aspect")) {
                return false;
            }
        }
        return true;
    }

    public final void y() {
        Object next;
        Q30 q30;
        C1387eR c1387eR = this.w;
        Object obj = null;
        if (c1387eR == null) {
            AbstractC1474fG.U("channel");
            throw null;
        }
        String str = c1387eR.t;
        if (str == null) {
            return;
        }
        Cr0 cr0 = Cr0.m;
        String strB = cr0.b();
        if (AbstractC1474fG.b(strB, "PPV.TO")) {
            q30 = QW.b;
        } else {
            Q30.a.getClass();
            Iterator it = P30.b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC1474fG.b(((Q30) next).getName(), strB));
            Q30 q31 = (Q30) next;
            q30 = q31 == null ? C1816io0.b : q31;
        }
        if (AbstractC1474fG.b(str, q30.getName())) {
            return;
        }
        Q30.a.getClass();
        for (Object obj2 : P30.b) {
            if (AbstractC1474fG.b(((Q30) obj2).getName(), str)) {
                obj = obj2;
                break;
            }
        }
        Q30 q32 = (Q30) obj;
        if (q32 != null) {
            cr0.f(q32.getName());
        }
    }

    public final void z(InterfaceC0360Cy interfaceC0360Cy) {
        Context context = this.v;
        EditText editText = new EditText(context);
        editText.setHint("Ingresa el PIN");
        editText.setInputType(18);
        editText.setMaxLines(1);
        editText.setPadding(40, 20, 40, 20);
        new AlertDialog.Builder(context).setTitle("Contenido para adultos 🔞").setMessage("Este canal requiere PIN parental para ser visto.").setView(editText).setPositiveButton("Confirmar", new Z00(editText, interfaceC0360Cy, this, 1)).setNegativeButton("Cancelar", (DialogInterface.OnClickListener) null).show();
    }
}
