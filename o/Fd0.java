package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.skidush.clonex.R;
import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.fragments.home.HomeMobileFragment;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class Fd0 extends DialogC2924u9 {
    public final AppDatabase B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:51:0x011c  */
    /* JADX WARN: Code duplicated, block: B:54:0x012c  */
    public Fd0(Context context, InterfaceC3106w3 interfaceC3106w3) {
        String string;
        String string2;
        int i;
        String str;
        super(context);
        final int i2 = 1;
        final int i3 = 0;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.dialog_show_options_mobile, (ViewGroup) null, false);
        int i4 = R.id.btn_option_cancel;
        TextView textView = (TextView) Sr0.g(viewInflate, R.id.btn_option_cancel);
        if (textView != null) {
            i4 = R.id.btn_option_episode_open_tv_show;
            TextView textView2 = (TextView) Sr0.g(viewInflate, R.id.btn_option_episode_open_tv_show);
            if (textView2 != null) {
                i4 = R.id.btn_option_program_clear;
                TextView textView3 = (TextView) Sr0.g(viewInflate, R.id.btn_option_program_clear);
                if (textView3 != null) {
                    i4 = R.id.btn_option_show_favorite;
                    TextView textView4 = (TextView) Sr0.g(viewInflate, R.id.btn_option_show_favorite);
                    if (textView4 != null) {
                        i4 = R.id.btn_option_show_watched;
                        TextView textView5 = (TextView) Sr0.g(viewInflate, R.id.btn_option_show_watched);
                        if (textView5 != null) {
                            i4 = R.id.ic_handlebar;
                            if (((ImageView) Sr0.g(viewInflate, R.id.ic_handlebar)) != null) {
                                i4 = R.id.iv_options_show_poster;
                                ImageView imageView = (ImageView) Sr0.g(viewInflate, R.id.iv_options_show_poster);
                                if (imageView != null) {
                                    i4 = R.id.tv_options_show_title;
                                    TextView textView6 = (TextView) Sr0.g(viewInflate, R.id.tv_options_show_title);
                                    if (textView6 != null) {
                                        i4 = R.id.tv_show_subtitle;
                                        TextView textView7 = (TextView) Sr0.g(viewInflate, R.id.tv_show_subtitle);
                                        if (textView7 != null) {
                                            this.B = AppDatabase.m.w(context);
                                            setContentView((ConstraintLayout) viewInflate);
                                            View viewFindViewById = findViewById(R.id.design_bottom_sheet);
                                            if (viewFindViewById != null) {
                                                viewFindViewById.setBackgroundColor(0);
                                            }
                                            if (interfaceC3106w3 instanceof C0456Gq) {
                                                final C0456Gq c0456Gq = (C0456Gq) interfaceC3106w3;
                                                ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E = com.bumptech.glide.a.e(getContext());
                                                String str2 = c0456Gq.d;
                                                if (str2 == null) {
                                                    C2109lo0 c2109lo0 = c0456Gq.e;
                                                    str2 = c2109lo0 != null ? c2109lo0.h : null;
                                                }
                                                ((C2630r70) componentCallbacks2C3406z70E.n(str2).k()).H(imageView);
                                                C2109lo0 c2109lo1 = c0456Gq.e;
                                                textView6.setText((c2109lo1 == null || (str = c2109lo1.b) == null) ? "" : str);
                                                Ma0 ma0 = c0456Gq.f;
                                                if (ma0 == null) {
                                                    textView = textView;
                                                    Context context2 = getContext();
                                                    Integer numValueOf = Integer.valueOf(c0456Gq.b);
                                                    string = c0456Gq.c;
                                                    if (string == null) {
                                                        string = getContext().getString(R.string.episode_number, Integer.valueOf(c0456Gq.b));
                                                        AbstractC1474fG.i(string, "getString(...)");
                                                    }
                                                    string2 = context2.getString(R.string.episode_item_info_episode_only, numValueOf, string);
                                                } else {
                                                    ma0 = ma0.b == 0 ? null : ma0;
                                                    if (ma0 != null) {
                                                        Context context3 = getContext();
                                                        Integer numValueOf2 = Integer.valueOf(ma0.b);
                                                        Integer numValueOf3 = Integer.valueOf(c0456Gq.b);
                                                        String string3 = c0456Gq.c;
                                                        if (string3 == null) {
                                                            string3 = getContext().getString(R.string.episode_number, Integer.valueOf(c0456Gq.b));
                                                            AbstractC1474fG.i(string3, "getString(...)");
                                                        }
                                                        string2 = context3.getString(R.string.episode_item_info, numValueOf2, numValueOf3, string3);
                                                        i = string2 != null ? 2 : 2;
                                                    } else {
                                                        textView = textView;
                                                    }
                                                    Context context4 = getContext();
                                                    Integer numValueOf4 = Integer.valueOf(c0456Gq.b);
                                                    string = c0456Gq.c;
                                                    if (string == null) {
                                                        string = getContext().getString(R.string.episode_number, Integer.valueOf(c0456Gq.b));
                                                        AbstractC1474fG.i(string, "getString(...)");
                                                    }
                                                    string2 = context4.getString(R.string.episode_item_info_episode_only, numValueOf4, string);
                                                }
                                                textView7.setText(string2);
                                                textView2.setOnClickListener(new ViewOnClickListenerC2238n5(textView2, c0456Gq, this, i));
                                                Context context5 = textView2.getContext();
                                                AbstractC1474fG.i(context5, "getContext(...)");
                                                AbstractActivityC1540fx abstractActivityC1540fx = context5 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context5 : null;
                                                textView2.setVisibility((abstractActivityC1540fx != null ? AbstractC0397Ej.o(abstractActivityC1540fx) : null) instanceof HomeMobileFragment ? 0 : 8);
                                                textView4.setVisibility(8);
                                                textView5.setOnClickListener(new View.OnClickListener(this) { // from class: o.Ed0
                                                    public final /* synthetic */ Fd0 m;

                                                    {
                                                        this.m = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        switch (i3) {
                                                            case 0:
                                                                Fd0 fd0 = this.m;
                                                                AbstractC1474fG.j(fd0, "this$0");
                                                                C0456Gq c0456Gq2 = c0456Gq;
                                                                AbstractC1474fG.j(c0456Gq2, "$episode");
                                                                C0560Kq c0560KqO = fd0.B.o();
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
                                                                fd0.hide();
                                                                break;
                                                            default:
                                                                Fd0 fd1 = this.m;
                                                                AbstractC1474fG.j(fd1, "this$0");
                                                                C0456Gq c0456Gq3 = c0456Gq;
                                                                AbstractC1474fG.j(c0456Gq3, "$episode");
                                                                C0560Kq c0560KqO2 = fd1.B.o();
                                                                C0456Gq c0456GqF2 = C0456Gq.f(c0456Gq3);
                                                                c0456GqF2.g(c0456Gq3);
                                                                c0456GqF2.j = null;
                                                                c0560KqO2.q(c0456GqF2);
                                                                fd1.hide();
                                                                break;
                                                        }
                                                    }
                                                });
                                                textView5.setText(c0456Gq.h ? textView5.getContext().getString(R.string.option_show_unwatched) : textView5.getContext().getString(R.string.option_show_watched));
                                                textView5.setVisibility(0);
                                                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: o.Ed0
                                                    public final /* synthetic */ Fd0 m;

                                                    {
                                                        this.m = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        switch (i2) {
                                                            case 0:
                                                                Fd0 fd0 = this.m;
                                                                AbstractC1474fG.j(fd0, "this$0");
                                                                C0456Gq c0456Gq2 = c0456Gq;
                                                                AbstractC1474fG.j(c0456Gq2, "$episode");
                                                                C0560Kq c0560KqO = fd0.B.o();
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
                                                                fd0.hide();
                                                                break;
                                                            default:
                                                                Fd0 fd1 = this.m;
                                                                AbstractC1474fG.j(fd1, "this$0");
                                                                C0456Gq c0456Gq3 = c0456Gq;
                                                                AbstractC1474fG.j(c0456Gq3, "$episode");
                                                                C0560Kq c0560KqO2 = fd1.B.o();
                                                                C0456Gq c0456GqF2 = C0456Gq.f(c0456Gq3);
                                                                c0456GqF2.g(c0456Gq3);
                                                                c0456GqF2.j = null;
                                                                c0560KqO2.q(c0456GqF2);
                                                                fd1.hide();
                                                                break;
                                                        }
                                                    }
                                                });
                                                textView3.setVisibility(c0456Gq.j == null ? 8 : 0);
                                            } else {
                                                textView = textView;
                                                if (interfaceC3106w3 instanceof C1387eR) {
                                                    final C1387eR c1387eR = (C1387eR) interfaceC3106w3;
                                                    ((C2630r70) com.bumptech.glide.a.e(getContext()).n(c1387eR.h).k()).H(imageView);
                                                    textView6.setText(c1387eR.b);
                                                    Calendar calendar = c1387eR.f754o;
                                                    textView7.setText(calendar != null ? AbstractC0397Ej.m(calendar, "yyyy") : null);
                                                    textView2.setVisibility(8);
                                                    textView4.setOnClickListener(new View.OnClickListener(this) { // from class: o.Dd0
                                                        public final /* synthetic */ Fd0 m;

                                                        {
                                                            this.m = this;
                                                        }

                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            switch (i3) {
                                                                case 0:
                                                                    Fd0 fd0 = this.m;
                                                                    AbstractC1474fG.j(fd0, "this$0");
                                                                    C1387eR c1387eR2 = c1387eR;
                                                                    AbstractC1474fG.j(c1387eR2, "$movie");
                                                                    C1583gR c1583gRP = fd0.B.p();
                                                                    C1387eR c1387eRF = C1387eR.f(c1387eR2, null, null, 32767);
                                                                    c1387eRF.h(c1387eR2);
                                                                    c1387eRF.p = !c1387eRF.p;
                                                                    c1583gRP.F(c1387eRF);
                                                                    fd0.hide();
                                                                    break;
                                                                case 1:
                                                                    Fd0 fd1 = this.m;
                                                                    AbstractC1474fG.j(fd1, "this$0");
                                                                    C1387eR c1387eR3 = c1387eR;
                                                                    AbstractC1474fG.j(c1387eR3, "$movie");
                                                                    C1583gR c1583gRP2 = fd1.B.p();
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
                                                                    fd1.hide();
                                                                    break;
                                                                default:
                                                                    Fd0 fd2 = this.m;
                                                                    AbstractC1474fG.j(fd2, "this$0");
                                                                    C1387eR c1387eR4 = c1387eR;
                                                                    AbstractC1474fG.j(c1387eR4, "$movie");
                                                                    C1583gR c1583gRP3 = fd2.B.p();
                                                                    C1387eR c1387eRF3 = C1387eR.f(c1387eR4, null, null, 32767);
                                                                    c1387eRF3.h(c1387eR4);
                                                                    c1387eRF3.s = null;
                                                                    c1583gRP3.F(c1387eRF3);
                                                                    fd2.hide();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    textView4.setText(c1387eR.p ? textView4.getContext().getString(R.string.option_show_unfavorite) : textView4.getContext().getString(R.string.option_show_favorite));
                                                    textView4.setVisibility(0);
                                                    textView5.setOnClickListener(new View.OnClickListener(this) { // from class: o.Dd0
                                                        public final /* synthetic */ Fd0 m;

                                                        {
                                                            this.m = this;
                                                        }

                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            switch (i2) {
                                                                case 0:
                                                                    Fd0 fd0 = this.m;
                                                                    AbstractC1474fG.j(fd0, "this$0");
                                                                    C1387eR c1387eR2 = c1387eR;
                                                                    AbstractC1474fG.j(c1387eR2, "$movie");
                                                                    C1583gR c1583gRP = fd0.B.p();
                                                                    C1387eR c1387eRF = C1387eR.f(c1387eR2, null, null, 32767);
                                                                    c1387eRF.h(c1387eR2);
                                                                    c1387eRF.p = !c1387eRF.p;
                                                                    c1583gRP.F(c1387eRF);
                                                                    fd0.hide();
                                                                    break;
                                                                case 1:
                                                                    Fd0 fd1 = this.m;
                                                                    AbstractC1474fG.j(fd1, "this$0");
                                                                    C1387eR c1387eR3 = c1387eR;
                                                                    AbstractC1474fG.j(c1387eR3, "$movie");
                                                                    C1583gR c1583gRP2 = fd1.B.p();
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
                                                                    fd1.hide();
                                                                    break;
                                                                default:
                                                                    Fd0 fd2 = this.m;
                                                                    AbstractC1474fG.j(fd2, "this$0");
                                                                    C1387eR c1387eR4 = c1387eR;
                                                                    AbstractC1474fG.j(c1387eR4, "$movie");
                                                                    C1583gR c1583gRP3 = fd2.B.p();
                                                                    C1387eR c1387eRF3 = C1387eR.f(c1387eR4, null, null, 32767);
                                                                    c1387eRF3.h(c1387eR4);
                                                                    c1387eRF3.s = null;
                                                                    c1583gRP3.F(c1387eRF3);
                                                                    fd2.hide();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    textView5.setText(c1387eR.q ? textView5.getContext().getString(R.string.option_show_unwatched) : textView5.getContext().getString(R.string.option_show_watched));
                                                    textView5.setVisibility(0);
                                                    final int i5 = 2;
                                                    textView3.setOnClickListener(new View.OnClickListener(this) { // from class: o.Dd0
                                                        public final /* synthetic */ Fd0 m;

                                                        {
                                                            this.m = this;
                                                        }

                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            switch (i5) {
                                                                case 0:
                                                                    Fd0 fd0 = this.m;
                                                                    AbstractC1474fG.j(fd0, "this$0");
                                                                    C1387eR c1387eR2 = c1387eR;
                                                                    AbstractC1474fG.j(c1387eR2, "$movie");
                                                                    C1583gR c1583gRP = fd0.B.p();
                                                                    C1387eR c1387eRF = C1387eR.f(c1387eR2, null, null, 32767);
                                                                    c1387eRF.h(c1387eR2);
                                                                    c1387eRF.p = !c1387eRF.p;
                                                                    c1583gRP.F(c1387eRF);
                                                                    fd0.hide();
                                                                    break;
                                                                case 1:
                                                                    Fd0 fd1 = this.m;
                                                                    AbstractC1474fG.j(fd1, "this$0");
                                                                    C1387eR c1387eR3 = c1387eR;
                                                                    AbstractC1474fG.j(c1387eR3, "$movie");
                                                                    C1583gR c1583gRP2 = fd1.B.p();
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
                                                                    fd1.hide();
                                                                    break;
                                                                default:
                                                                    Fd0 fd2 = this.m;
                                                                    AbstractC1474fG.j(fd2, "this$0");
                                                                    C1387eR c1387eR4 = c1387eR;
                                                                    AbstractC1474fG.j(c1387eR4, "$movie");
                                                                    C1583gR c1583gRP3 = fd2.B.p();
                                                                    C1387eR c1387eRF3 = C1387eR.f(c1387eR4, null, null, 32767);
                                                                    c1387eRF3.h(c1387eR4);
                                                                    c1387eRF3.s = null;
                                                                    c1583gRP3.F(c1387eRF3);
                                                                    fd2.hide();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    textView3.setVisibility(c1387eR.s == null ? 8 : 0);
                                                } else if (interfaceC3106w3 instanceof C2109lo0) {
                                                    C2109lo0 c2109lo2 = (C2109lo0) interfaceC3106w3;
                                                    ((C2630r70) com.bumptech.glide.a.e(getContext()).n(c2109lo2.h).k()).H(imageView);
                                                    textView6.setText(c2109lo2.b);
                                                    Calendar calendar2 = c2109lo2.p;
                                                    textView7.setText(calendar2 != null ? AbstractC0397Ej.m(calendar2, "yyyy") : null);
                                                    textView2.setVisibility(8);
                                                    textView4.setOnClickListener(new ViewOnClickListenerC1010ac(this, 13, c2109lo2));
                                                    textView4.setText(c2109lo2.q ? textView4.getContext().getString(R.string.option_show_unfavorite) : textView4.getContext().getString(R.string.option_show_favorite));
                                                    textView4.setVisibility(0);
                                                    textView5.setVisibility(8);
                                                    textView3.setVisibility(8);
                                                }
                                            }
                                            textView.setOnClickListener(new ViewOnClickListenerC3251xe(25, this));
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }
}
