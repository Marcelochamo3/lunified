package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.leanback.widget.HorizontalGridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.skidush.clonex.R;
import com.skidush.clonex.fragments.home.HomeTvFragment;
import com.skidush.clonex.fragments.home.MoviesHomeTvFragment;
import com.skidush.clonex.fragments.movie.MovieMobileFragment;
import com.skidush.clonex.fragments.movie.MovieTvFragment;
import com.skidush.clonex.fragments.tv_show.TvShowMobileFragment;
import com.skidush.clonex.fragments.tv_show.TvShowTvFragment;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: o.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3300y3 extends O50 {
    public final List d = new ArrayList();
    public final LinkedHashMap e = new LinkedHashMap();
    public boolean f;
    public InterfaceC0360Cy g;

    @Override // o.O50
    public final int a() {
        return this.d.size() + (this.g != null ? 1 : 0);
    }

    @Override // o.O50
    public final int c(int i) {
        InterfaceC3106w3 interfaceC3106w3 = (InterfaceC3106w3) AbstractC0911Ye.e0(i, this.d);
        if (interfaceC3106w3 != null) {
            return interfaceC3106w3.c().ordinal();
        }
        EnumC3203x3 enumC3203x3 = EnumC3203x3.l;
        return 11;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x027d  */
    /* JADX WARN: Code duplicated, block: B:142:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:159:0x0319  */
    /* JADX WARN: Code duplicated, block: B:232:0x049e  */
    /* JADX WARN: Code duplicated, block: B:286:0x059f  */
    /* JADX WARN: Code duplicated, block: B:379:0x070c  */
    /* JADX WARN: Code duplicated, block: B:381:0x0710  */
    /* JADX WARN: Code duplicated, block: B:383:0x071a  */
    /* JADX WARN: Code duplicated, block: B:385:0x071e  */
    /* JADX WARN: Code duplicated, block: B:388:0x0747  */
    /* JADX WARN: Code duplicated, block: B:390:0x074c  */
    /* JADX WARN: Code duplicated, block: B:424:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:462:0x085e  */
    /* JADX WARN: Code duplicated, block: B:464:0x0862  */
    /* JADX WARN: Code duplicated, block: B:466:0x086c  */
    /* JADX WARN: Code duplicated, block: B:468:0x0870  */
    /* JADX WARN: Code duplicated, block: B:471:0x0899  */
    /* JADX WARN: Code duplicated, block: B:473:0x089e  */
    @Override // o.O50
    public final void e(AbstractC2144m60 abstractC2144m60, int i) {
        String str;
        int i2;
        int i3;
        String str2;
        C0456Gq c0456Gq;
        Integer numValueOf;
        C0456Gq c0456Gq2;
        String string;
        String string2;
        String str3;
        String str4;
        C0456Gq c0456Gq3;
        Integer numValueOf2;
        C0456Gq c0456Gq4;
        String string3;
        String string4;
        int i4;
        Context context;
        int i5;
        int i6;
        RecyclerView recyclerViewX;
        X50 layoutManager;
        X50 layoutManager2;
        X50 layoutManager3;
        String str5;
        String string5;
        String str6;
        String strM;
        String str7;
        String str8;
        C2123lv0 c2123lv0;
        InterfaceC0360Cy interfaceC0360Cy;
        int i7 = 6;
        int i8 = 3;
        int i9 = 2;
        final int i10 = 0;
        int i11 = 5;
        final int i12 = 1;
        if (i >= a() - 5 && !this.f && (interfaceC0360Cy = this.g) != null) {
            this.f = true;
            interfaceC0360Cy.c();
        }
        boolean z = abstractC2144m60 instanceof C1498fc;
        List list = this.d;
        if (z) {
            C1498fc c1498fc = (C1498fc) abstractC2144m60;
            Object obj = list.get(i);
            AbstractC1474fG.h(obj, "null cannot be cast to non-null type com.skidush.clonex.models.Category");
            C0882Xb c0882Xb = (C0882Xb) obj;
            c1498fc.w = c0882Xb;
            InterfaceC2604qt0 interfaceC2604qt0 = c1498fc.u;
            if (interfaceC2604qt0 instanceof C2835tG) {
                C2835tG c2835tG = (C2835tG) interfaceC2604qt0;
                c2835tG.n.setText(c0882Xb.a);
                RecyclerView recyclerView = c2835tG.m;
                recyclerView.setItemViewCacheSize(8);
                X50 layoutManager4 = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager4 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager4 : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.C = 6;
                    linearLayoutManager.K0(true);
                }
                O50 adapter = recyclerView.getAdapter();
                C3300y3 c3300y3 = adapter instanceof C3300y3 ? (C3300y3) adapter : null;
                if (c3300y3 == null) {
                    c3300y3 = new C3300y3();
                    recyclerView.setAdapter(c3300y3);
                }
                C0882Xb c0882Xb2 = c1498fc.w;
                if (c0882Xb2 == null) {
                    AbstractC1474fG.U("category");
                    throw null;
                }
                c3300y3.m(c0882Xb2.b);
                c3300y3.l(c1498fc.u(c3300y3));
                if (recyclerView.getItemDecorationCount() == 0) {
                    C0882Xb c0882Xb3 = c1498fc.w;
                    if (c0882Xb3 == null) {
                        AbstractC1474fG.U("category");
                        throw null;
                    }
                    recyclerView.g(new C2285nf0(c0882Xb3.d));
                }
            } else if (interfaceC2604qt0 instanceof C3029vG) {
                C3029vG c3029vG = (C3029vG) interfaceC2604qt0;
                c3029vG.n.setText(c0882Xb.a);
                HorizontalGridView horizontalGridView = c3029vG.m;
                horizontalGridView.setRowHeight(-2);
                horizontalGridView.setNumRows(1);
                horizontalGridView.setItemViewCacheSize(8);
                O50 adapter2 = horizontalGridView.getAdapter();
                C3300y3 c3300y4 = adapter2 instanceof C3300y3 ? (C3300y3) adapter2 : null;
                if (c3300y4 == null) {
                    c3300y4 = new C3300y3();
                    horizontalGridView.setAdapter(c3300y4);
                }
                C0882Xb c0882Xb4 = c1498fc.w;
                if (c0882Xb4 == null) {
                    AbstractC1474fG.U("category");
                    throw null;
                }
                c3300y4.m(c0882Xb4.b);
                c3300y4.l(c1498fc.u(c3300y4));
                C0882Xb c0882Xb5 = c1498fc.w;
                if (c0882Xb5 == null) {
                    AbstractC1474fG.U("category");
                    throw null;
                }
                horizontalGridView.setItemSpacing(c0882Xb5.d);
            } else if (interfaceC2604qt0 instanceof C0913Yg) {
                C0913Yg c0913Yg = (C0913Yg) interfaceC2604qt0;
                Handler handler = new Handler(Looper.getMainLooper());
                handler.postDelayed(new RunnableC1303dc(c0913Yg, 0), 8000L);
                C0882Xb c0882Xb6 = c1498fc.w;
                if (c0882Xb6 == null) {
                    AbstractC1474fG.U("category");
                    throw null;
                }
                Object objJ0 = AbstractC0911Ye.j0(c0882Xb6.b);
                List listA = C1233cq.l;
                List listA2 = objJ0 != null ? AbstractC2506pt.A(objJ0) : listA;
                C0882Xb c0882Xb7 = c1498fc.w;
                if (c0882Xb7 == null) {
                    AbstractC1474fG.U("category");
                    throw null;
                }
                List list2 = c0882Xb7.b;
                Object objD0 = AbstractC0911Ye.d0(list2);
                if (objD0 != null) {
                    listA = AbstractC2506pt.A(objD0);
                }
                ArrayList arrayListP = AbstractC1016af.P(AbstractC0937Ze.K(listA2, list2, listA));
                ViewPager2 viewPager2 = c0913Yg.n;
                C3300y3 c3300y5 = new C3300y3();
                C0882Xb c0882Xb8 = c1498fc.w;
                if (c0882Xb8 == null) {
                    AbstractC1474fG.U("category");
                    throw null;
                }
                c3300y5.m(c0882Xb8.b);
                viewPager2.post(new O3(viewPager2, i9, arrayListP));
                viewPager2.setAdapter(c3300y5);
                LinearLayout linearLayout = c0913Yg.m;
                linearLayout.removeAllViews();
                C0882Xb c0882Xb9 = c1498fc.w;
                if (c0882Xb9 == null) {
                    AbstractC1474fG.U("category");
                    throw null;
                }
                int size = c0882Xb9.b.size();
                for (int i13 = 0; i13 < size; i13++) {
                    View view = new View(linearLayout.getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(15, 15);
                    layoutParams.setMargins(10, 0, 10, 0);
                    view.setLayoutParams(layoutParams);
                    view.setBackgroundResource(R.drawable.bg_dot_indicator);
                    linearLayout.addView(view);
                }
                ((ArrayList) c0913Yg.n.n.b).add(new C1400ec(c1498fc, arrayListP, c0913Yg, handler));
            } else if (interfaceC2604qt0 instanceof C0939Zg) {
                C0939Zg c0939Zg = (C0939Zg) interfaceC2604qt0;
                Object objE0 = AbstractC0911Ye.e0(c0882Xb.c, c0882Xb.b);
                Cd0 cd0 = objE0 instanceof Cd0 ? (Cd0) objE0 : null;
                if (cd0 != null) {
                    Context context2 = c1498fc.v;
                    AbstractC1474fG.i(context2, "context");
                    AbstractActivityC1540fx abstractActivityC1540fx = context2 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context2 : null;
                    AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO = abstractActivityC1540fx != null ? AbstractC0397Ej.o(abstractActivityC1540fx) : null;
                    if (abstractComponentCallbacksC1247cxO instanceof HomeTvFragment) {
                        if (cd0 instanceof C1387eR) {
                            ((HomeTvFragment) abstractComponentCallbacksC1247cxO).Y(((C1387eR) cd0).i, null);
                        } else if (cd0 instanceof C2109lo0) {
                            ((HomeTvFragment) abstractComponentCallbacksC1247cxO).Y(((C2109lo0) cd0).i, null);
                        }
                    }
                    TextView textView = c0939Zg.u;
                    boolean z2 = cd0 instanceof C1387eR;
                    if (z2) {
                        str5 = ((C1387eR) cd0).b;
                    } else {
                        if (!(cd0 instanceof C2109lo0)) {
                            throw new C0730Rf();
                        }
                        str5 = ((C2109lo0) cd0).b;
                    }
                    textView.setText(str5);
                    boolean z3 = cd0 instanceof C2109lo0;
                    TextView textView2 = c0939Zg.v;
                    if (z3) {
                        Ma0 ma0 = (Ma0) AbstractC0911Ye.j0(((C2109lo0) cd0).k);
                        if (ma0 == null) {
                            string5 = textView2.getContext().getString(R.string.tv_show_item_type);
                        } else {
                            C0456Gq c0456Gq5 = (C0456Gq) AbstractC0911Ye.j0(ma0.f);
                            string5 = c0456Gq5 != null ? ma0.b != 0 ? textView2.getContext().getString(R.string.tv_show_item_season_number_episode_number, Integer.valueOf(ma0.b), Integer.valueOf(c0456Gq5.b)) : textView2.getContext().getString(R.string.tv_show_item_episode_number, Integer.valueOf(c0456Gq5.b)) : null;
                            if (string5 == null) {
                                string5 = textView2.getContext().getString(R.string.tv_show_item_type);
                            }
                        }
                    } else {
                        string5 = textView2.getContext().getString(R.string.movie_item_type);
                    }
                    textView2.setText(string5);
                    if (z2) {
                        str6 = ((C1387eR) cd0).f;
                    } else {
                        if (!z3) {
                            throw new C0730Rf();
                        }
                        str6 = ((C2109lo0) cd0).f;
                    }
                    TextView textView3 = c0939Zg.r;
                    textView3.setText(str6);
                    CharSequence text = textView3.getText();
                    textView3.setVisibility((text == null || text.length() == 0) ? 8 : 0);
                    if (z2) {
                        Calendar calendar = ((C1387eR) cd0).f754o;
                        if (calendar != null) {
                            strM = AbstractC0397Ej.m(calendar, "yyyy");
                        } else {
                            strM = null;
                        }
                    } else {
                        if (!z3) {
                            throw new C0730Rf();
                        }
                        Calendar calendar2 = ((C2109lo0) cd0).p;
                        if (calendar2 != null) {
                            strM = AbstractC0397Ej.m(calendar2, "yyyy");
                        } else {
                            strM = null;
                        }
                    }
                    TextView textView4 = c0939Zg.t;
                    textView4.setText(strM);
                    CharSequence text2 = textView4.getText();
                    textView4.setVisibility((text2 == null || text2.length() == 0) ? 8 : 0);
                    if (z2) {
                        Double d = ((C1387eR) cd0).g;
                        if (d != null) {
                            str7 = String.format(Locale.ROOT, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d.doubleValue())}, 1));
                        } else {
                            str7 = null;
                        }
                    } else {
                        if (!z3) {
                            throw new C0730Rf();
                        }
                        Double d2 = ((C2109lo0) cd0).g;
                        if (d2 != null) {
                            str7 = String.format(Locale.ROOT, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d2.doubleValue())}, 1));
                        } else {
                            str7 = null;
                        }
                    }
                    TextView textView5 = c0939Zg.s;
                    textView5.setText(str7);
                    CharSequence text3 = textView5.getText();
                    textView5.setVisibility((text3 == null || text3.length() == 0) ? 8 : 0);
                    c0939Zg.n.setVisibility(textView5.getVisibility());
                    if (z2) {
                        str8 = ((C1387eR) cd0).c;
                    } else {
                        if (!z3) {
                            throw new C0730Rf();
                        }
                        str8 = ((C2109lo0) cd0).c;
                    }
                    c0939Zg.q.setText(str8);
                    TextView textView6 = c0939Zg.m;
                    textView6.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0908Yb(textView6, i10, cd0));
                    textView6.setOnKeyListener(new ViewOnKeyListenerC0934Zb(textView6, i10, c1498fc));
                    textView6.setOnClickListener(new ViewOnClickListenerC1010ac(textView6, i10, cd0));
                    if (z2) {
                        c2123lv0 = ((C1387eR) cd0).s;
                    } else {
                        if (!z3) {
                            throw new C0730Rf();
                        }
                        c2123lv0 = null;
                    }
                    int i14 = c2123lv0 != null ? (int) ((c2123lv0.b * ((long) 100)) / c2123lv0.c) : 0;
                    ProgressBar progressBar = c0939Zg.p;
                    progressBar.setProgress(i14);
                    progressBar.setVisibility(c2123lv0 != null ? 0 : 8);
                    LinearLayout linearLayout2 = c0939Zg.f661o;
                    linearLayout2.removeAllViews();
                    C0882Xb c0882Xb10 = c1498fc.w;
                    if (c0882Xb10 == null) {
                        AbstractC1474fG.U("category");
                        throw null;
                    }
                    int size2 = c0882Xb10.b.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        View view2 = new View(linearLayout2.getContext());
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(15, 15);
                        layoutParams2.setMargins(10, 0, 10, 0);
                        view2.setLayoutParams(layoutParams2);
                        view2.setBackgroundResource(R.drawable.bg_dot_indicator);
                        C0882Xb c0882Xb11 = c1498fc.w;
                        if (c0882Xb11 == null) {
                            AbstractC1474fG.U("category");
                            throw null;
                        }
                        view2.setSelected(c0882Xb11.c == i15);
                        linearLayout2.addView(view2);
                        i15++;
                    }
                }
            }
        } else if (abstractC2144m60 instanceof C0663Oq) {
            C0663Oq c0663Oq = (C0663Oq) abstractC2144m60;
            Object obj2 = list.get(i);
            AbstractC1474fG.h(obj2, "null cannot be cast to non-null type com.skidush.clonex.models.Episode");
            c0663Oq.w = (C0456Gq) obj2;
            InterfaceC2604qt0 interfaceC2604qt1 = c0663Oq.u;
            boolean z4 = interfaceC2604qt1 instanceof C3320yG;
            Context context3 = c0663Oq.v;
            if (z4) {
                C3320yG c3320yG = (C3320yG) interfaceC2604qt1;
                ConstraintLayout constraintLayout = c3320yG.l;
                constraintLayout.setOnClickListener(new ViewOnClickListenerC0586Lq(i8, constraintLayout, c0663Oq));
                constraintLayout.setOnLongClickListener(new ViewOnLongClickListenerC0611Mq(i8, constraintLayout, c0663Oq));
                ImageView imageView = c3320yG.m;
                imageView.setClipToOutline(true);
                ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E = com.bumptech.glide.a.e(imageView.getContext());
                C0456Gq c0456Gq6 = c0663Oq.w;
                if (c0456Gq6 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                ((C2630r70) componentCallbacks2C3406z70E.n(c0456Gq6.d).c()).H(imageView);
                C0456Gq c0456Gq7 = c0663Oq.w;
                if (c0456Gq7 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                C2123lv0 c2123lv1 = c0456Gq7.j;
                if (c2123lv1 != null) {
                    context = context3;
                    i5 = (int) ((c2123lv1.b * ((long) 100)) / c2123lv1.c);
                } else {
                    context = context3;
                    i5 = c0456Gq7.h ? 100 : 0;
                }
                ProgressBar progressBar2 = c3320yG.n;
                progressBar2.setProgress(i5);
                if (c2123lv1 == null) {
                    C0456Gq c0456Gq8 = c0663Oq.w;
                    if (c0456Gq8 == null) {
                        AbstractC1474fG.U("episode");
                        throw null;
                    }
                    if (c0456Gq8.h) {
                        i6 = 0;
                    } else {
                        i6 = 8;
                    }
                } else {
                    i6 = 0;
                }
                progressBar2.setVisibility(i6);
                C0456Gq c0456Gq9 = c0663Oq.w;
                if (c0456Gq9 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                c3320yG.f1131o.setText(context.getString(R.string.episode_number, Integer.valueOf(c0456Gq9.b)));
                C0456Gq c0456Gq10 = c0663Oq.w;
                if (c0456Gq10 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                String string6 = c0456Gq10.c;
                if (string6 == null) {
                    string6 = context.getString(R.string.episode_number, Integer.valueOf(c0456Gq10.b));
                }
                c3320yG.q.setText(string6);
                C0456Gq c0456Gq11 = c0663Oq.w;
                if (c0456Gq11 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                Calendar calendar3 = c0456Gq11.g;
                String strT = calendar3 != null ? AbstractC1701hf0.t(" • ", AbstractC0397Ej.m(calendar3, "yyyy-MM-dd")) : null;
                TextView textView7 = c3320yG.p;
                textView7.setText(strT);
                CharSequence text4 = textView7.getText();
                textView7.setVisibility((text4 == null || text4.length() == 0) ? 8 : 0);
            } else if (interfaceC2604qt1 instanceof C3417zG) {
                C3417zG c3417zG = (C3417zG) interfaceC2604qt1;
                ConstraintLayout constraintLayout2 = c3417zG.l;
                constraintLayout2.setOnClickListener(new ViewOnClickListenerC0586Lq(i9, constraintLayout2, c0663Oq));
                constraintLayout2.setOnLongClickListener(new ViewOnLongClickListenerC0611Mq(constraintLayout2, c0663Oq));
                constraintLayout2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0908Yb(constraintLayout2, i12, c3417zG));
                ImageView imageView2 = c3417zG.m;
                imageView2.setClipToOutline(true);
                ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E2 = com.bumptech.glide.a.e(imageView2.getContext());
                C0456Gq c0456Gq12 = c0663Oq.w;
                if (c0456Gq12 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                ((C2630r70) ((C2630r70) componentCallbacks2C3406z70E2.n(c0456Gq12.d).j(R.drawable.glide_fallback_cover)).c()).H(imageView2);
                C0456Gq c0456Gq13 = c0663Oq.w;
                if (c0456Gq13 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                C2123lv0 c2123lv2 = c0456Gq13.j;
                int i16 = c2123lv2 != null ? (int) ((c2123lv2.b * ((long) 100)) / c2123lv2.c) : c0456Gq13.h ? 100 : 0;
                ProgressBar progressBar3 = c3417zG.n;
                progressBar3.setProgress(i16);
                if (c2123lv2 == null) {
                    C0456Gq c0456Gq14 = c0663Oq.w;
                    if (c0456Gq14 == null) {
                        AbstractC1474fG.U("episode");
                        throw null;
                    }
                    if (c0456Gq14.h) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                } else {
                    i4 = 0;
                }
                progressBar3.setVisibility(i4);
                C0456Gq c0456Gq15 = c0663Oq.w;
                if (c0456Gq15 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                c3417zG.f1149o.setText(context3.getString(R.string.episode_number, Integer.valueOf(c0456Gq15.b)));
                C0456Gq c0456Gq16 = c0663Oq.w;
                if (c0456Gq16 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                String string7 = c0456Gq16.c;
                if (string7 == null) {
                    string7 = context3.getString(R.string.episode_number, Integer.valueOf(c0456Gq16.b));
                }
                c3417zG.q.setText(string7);
                C0456Gq c0456Gq17 = c0663Oq.w;
                if (c0456Gq17 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                Calendar calendar4 = c0456Gq17.g;
                String strM2 = calendar4 != null ? AbstractC0397Ej.m(calendar4, "EEEE - MMMM dd, yyyy") : null;
                TextView textView8 = c3417zG.p;
                textView8.setText(strM2);
                CharSequence text5 = textView8.getText();
                textView8.setVisibility((text5 == null || text5.length() == 0) ? 8 : 0);
            } else if (interfaceC2604qt1 instanceof C3126wG) {
                C3126wG c3126wG = (C3126wG) interfaceC2604qt1;
                ConstraintLayout constraintLayout3 = c3126wG.l;
                constraintLayout3.setOnClickListener(new ViewOnClickListenerC0586Lq(constraintLayout3, c0663Oq));
                constraintLayout3.setOnLongClickListener(new ViewOnLongClickListenerC0611Mq(i12, constraintLayout3, c0663Oq));
                ImageView imageView3 = c3126wG.m;
                imageView3.setClipToOutline(true);
                ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E3 = com.bumptech.glide.a.e(imageView3.getContext());
                C0456Gq c0456Gq18 = c0663Oq.w;
                if (c0456Gq18 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                C2109lo0 c2109lo0 = c0456Gq18.e;
                if (c2109lo0 == null || (str3 = c2109lo0.h) == null) {
                    str3 = c2109lo0 != null ? c2109lo0.i : null;
                    if (str3 == null) {
                        str3 = c0456Gq18.d;
                    }
                }
                ((C2630r70) componentCallbacks2C3406z70E3.n(str3).c()).H(imageView3);
                C0456Gq c0456Gq19 = c0663Oq.w;
                if (c0456Gq19 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                C2123lv0 c2123lv3 = c0456Gq19.j;
                int i17 = c2123lv3 != null ? (int) ((c2123lv3.b * ((long) 100)) / c2123lv3.c) : 0;
                ProgressBar progressBar4 = c3126wG.n;
                progressBar4.setProgress(i17);
                progressBar4.setVisibility(c2123lv3 != null ? 0 : 8);
                C0456Gq c0456Gq20 = c0663Oq.w;
                if (c0456Gq20 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                C2109lo0 c2109lo1 = c0456Gq20.e;
                if (c2109lo1 == null || (str4 = c2109lo1.b) == null) {
                    str4 = "";
                }
                c3126wG.p.setText(str4);
                C0456Gq c0456Gq21 = c0663Oq.w;
                if (c0456Gq21 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                Ma0 ma1 = c0456Gq21.f;
                if (ma1 == null) {
                    c0456Gq3 = c0663Oq.w;
                    if (c0456Gq3 == null) {
                        AbstractC1474fG.U("episode");
                        throw null;
                    }
                    numValueOf2 = Integer.valueOf(c0456Gq3.b);
                    c0456Gq4 = c0663Oq.w;
                    if (c0456Gq4 == null) {
                        AbstractC1474fG.U("episode");
                        throw null;
                    }
                    string3 = c0456Gq4.c;
                    if (string3 == null) {
                        string3 = context3.getString(R.string.episode_number, Integer.valueOf(c0456Gq4.b));
                        AbstractC1474fG.i(string3, "getString(...)");
                    }
                    string4 = context3.getString(R.string.episode_item_info_episode_only, numValueOf2, string3);
                } else {
                    if (ma1.b == 0) {
                        ma1 = null;
                    }
                    if (ma1 != null) {
                        Integer numValueOf3 = Integer.valueOf(ma1.b);
                        C0456Gq c0456Gq22 = c0663Oq.w;
                        if (c0456Gq22 == null) {
                            AbstractC1474fG.U("episode");
                            throw null;
                        }
                        Integer numValueOf4 = Integer.valueOf(c0456Gq22.b);
                        C0456Gq c0456Gq23 = c0663Oq.w;
                        if (c0456Gq23 == null) {
                            AbstractC1474fG.U("episode");
                            throw null;
                        }
                        String string8 = c0456Gq23.c;
                        if (string8 == null) {
                            string8 = context3.getString(R.string.episode_number, Integer.valueOf(c0456Gq23.b));
                            AbstractC1474fG.i(string8, "getString(...)");
                        }
                        string4 = context3.getString(R.string.episode_item_info, numValueOf3, numValueOf4, string8);
                        if (string4 == null) {
                            c0456Gq3 = c0663Oq.w;
                            if (c0456Gq3 == null) {
                                AbstractC1474fG.U("episode");
                                throw null;
                            }
                            numValueOf2 = Integer.valueOf(c0456Gq3.b);
                            c0456Gq4 = c0663Oq.w;
                            if (c0456Gq4 == null) {
                                AbstractC1474fG.U("episode");
                                throw null;
                            }
                            string3 = c0456Gq4.c;
                            if (string3 == null) {
                                string3 = context3.getString(R.string.episode_number, Integer.valueOf(c0456Gq4.b));
                                AbstractC1474fG.i(string3, "getString(...)");
                            }
                            string4 = context3.getString(R.string.episode_item_info_episode_only, numValueOf2, string3);
                        }
                    } else {
                        c0456Gq3 = c0663Oq.w;
                        if (c0456Gq3 == null) {
                            AbstractC1474fG.U("episode");
                            throw null;
                        }
                        numValueOf2 = Integer.valueOf(c0456Gq3.b);
                        c0456Gq4 = c0663Oq.w;
                        if (c0456Gq4 == null) {
                            AbstractC1474fG.U("episode");
                            throw null;
                        }
                        string3 = c0456Gq4.c;
                        if (string3 == null) {
                            string3 = context3.getString(R.string.episode_number, Integer.valueOf(c0456Gq4.b));
                            AbstractC1474fG.i(string3, "getString(...)");
                        }
                        string4 = context3.getString(R.string.episode_item_info_episode_only, numValueOf2, string3);
                    }
                }
                c3126wG.f1090o.setText(string4);
            } else if (interfaceC2604qt1 instanceof C3223xG) {
                C3223xG c3223xG = (C3223xG) interfaceC2604qt1;
                ConstraintLayout constraintLayout4 = c3223xG.l;
                constraintLayout4.setOnClickListener(new ViewOnClickListenerC0586Lq(i10, constraintLayout4, c0663Oq));
                constraintLayout4.setOnLongClickListener(new ViewOnLongClickListenerC0611Mq(i10, constraintLayout4, c0663Oq));
                constraintLayout4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0637Nq(constraintLayout4, c3223xG, c0663Oq, i10));
                ImageView imageView4 = c3223xG.m;
                imageView4.setClipToOutline(true);
                ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E4 = com.bumptech.glide.a.e(imageView4.getContext());
                C0456Gq c0456Gq24 = c0663Oq.w;
                if (c0456Gq24 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                C2109lo0 c2109lo2 = c0456Gq24.e;
                if (c2109lo2 == null || (str = c2109lo2.h) == null) {
                    str = c2109lo2 != null ? c2109lo2.i : null;
                    if (str == null) {
                        str = c0456Gq24.d;
                    }
                }
                ((C2630r70) ((C2630r70) componentCallbacks2C3406z70E4.n(str).j(R.drawable.glide_fallback_cover)).c()).H(imageView4);
                C0456Gq c0456Gq25 = c0663Oq.w;
                if (c0456Gq25 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                C2123lv0 c2123lv4 = c0456Gq25.j;
                if (c2123lv4 != null) {
                    i2 = (int) ((c2123lv4.b * ((long) 100)) / c2123lv4.c);
                } else {
                    i2 = 100;
                    if (!c0456Gq25.h) {
                        i2 = 0;
                    }
                }
                ProgressBar progressBar5 = c3223xG.n;
                progressBar5.setProgress(i2);
                if (c2123lv4 == null) {
                    C0456Gq c0456Gq26 = c0663Oq.w;
                    if (c0456Gq26 == null) {
                        AbstractC1474fG.U("episode");
                        throw null;
                    }
                    if (c0456Gq26.h) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                } else {
                    i3 = 0;
                }
                progressBar5.setVisibility(i3);
                C0456Gq c0456Gq27 = c0663Oq.w;
                if (c0456Gq27 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                C2109lo0 c2109lo3 = c0456Gq27.e;
                if (c2109lo3 == null || (str2 = c2109lo3.b) == null) {
                    str2 = "";
                }
                c3223xG.p.setText(str2);
                C0456Gq c0456Gq28 = c0663Oq.w;
                if (c0456Gq28 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                Ma0 ma2 = c0456Gq28.f;
                if (ma2 == null) {
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
                        string = context3.getString(R.string.episode_number, Integer.valueOf(c0456Gq2.b));
                        AbstractC1474fG.i(string, "getString(...)");
                    }
                    string2 = context3.getString(R.string.episode_item_info_episode_only, numValueOf, string);
                } else {
                    if (ma2.b == 0) {
                        ma2 = null;
                    }
                    if (ma2 != null) {
                        Integer numValueOf5 = Integer.valueOf(ma2.b);
                        C0456Gq c0456Gq29 = c0663Oq.w;
                        if (c0456Gq29 == null) {
                            AbstractC1474fG.U("episode");
                            throw null;
                        }
                        Integer numValueOf6 = Integer.valueOf(c0456Gq29.b);
                        C0456Gq c0456Gq30 = c0663Oq.w;
                        if (c0456Gq30 == null) {
                            AbstractC1474fG.U("episode");
                            throw null;
                        }
                        String string9 = c0456Gq30.c;
                        if (string9 == null) {
                            string9 = context3.getString(R.string.episode_number, Integer.valueOf(c0456Gq30.b));
                            AbstractC1474fG.i(string9, "getString(...)");
                        }
                        string2 = context3.getString(R.string.episode_item_info, numValueOf5, numValueOf6, string9);
                        if (string2 == null) {
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
                                string = context3.getString(R.string.episode_number, Integer.valueOf(c0456Gq2.b));
                                AbstractC1474fG.i(string, "getString(...)");
                            }
                            string2 = context3.getString(R.string.episode_item_info_episode_only, numValueOf, string);
                        }
                    } else {
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
                            string = context3.getString(R.string.episode_number, Integer.valueOf(c0456Gq2.b));
                            AbstractC1474fG.i(string, "getString(...)");
                        }
                        string2 = context3.getString(R.string.episode_item_info_episode_only, numValueOf, string);
                    }
                }
                c3223xG.f1113o.setText(string2);
            }
        } else if (abstractC2144m60 instanceof C0309Az) {
            final C0309Az c0309Az = (C0309Az) abstractC2144m60;
            Object obj3 = list.get(i);
            AbstractC1474fG.h(obj3, "null cannot be cast to non-null type com.skidush.clonex.models.Genre");
            c0309Az.v = (C2420oz) obj3;
            InterfaceC2604qt0 interfaceC2604qt2 = c0309Az.u;
            if (interfaceC2604qt2 instanceof CG) {
                CG cg = (CG) interfaceC2604qt2;
                final ConstraintLayout constraintLayout5 = cg.l;
                int[] intArray = constraintLayout5.getContext().getResources().getIntArray(R.array.genres);
                AbstractC1474fG.i(intArray, "getIntArray(...)");
                Drawable background = constraintLayout5.getBackground();
                GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(intArray[c0309Az.d() % intArray.length]);
                }
                constraintLayout5.setOnClickListener(new View.OnClickListener() { // from class: o.zz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        switch (i12) {
                            case 0:
                                ConstraintLayout constraintLayout6 = constraintLayout5;
                                AbstractC1474fG.j(constraintLayout6, "$this_apply");
                                C0309Az c0309Az2 = c0309Az;
                                AbstractC1474fG.j(c0309Az2, "this$0");
                                YT ytO = U9.o(constraintLayout6);
                                C2420oz c2420oz = c0309Az2.v;
                                if (c2420oz == null) {
                                    AbstractC1474fG.U("genre");
                                    throw null;
                                }
                                String str9 = c2420oz.a;
                                AbstractC1474fG.j(str9, "id");
                                String str10 = c2420oz.b;
                                AbstractC1474fG.j(str10, "name");
                                ytO.p(new C2856ta0(str9, str10));
                                return;
                            default:
                                ConstraintLayout constraintLayout7 = constraintLayout5;
                                AbstractC1474fG.j(constraintLayout7, "$this_apply");
                                C0309Az c0309Az3 = c0309Az;
                                AbstractC1474fG.j(c0309Az3, "this$0");
                                YT ytO2 = U9.o(constraintLayout7);
                                C2420oz c2420oz2 = c0309Az3.v;
                                if (c2420oz2 == null) {
                                    AbstractC1474fG.U("genre");
                                    throw null;
                                }
                                String str11 = c2420oz2.a;
                                AbstractC1474fG.j(str11, "id");
                                String str12 = c2420oz2.b;
                                AbstractC1474fG.j(str12, "name");
                                ytO2.p(new C1983ka0(str11, str12));
                                return;
                        }
                    }
                });
                C2420oz c2420oz = c0309Az.v;
                if (c2420oz == null) {
                    AbstractC1474fG.U("genre");
                    throw null;
                }
                cg.m.setText(c2420oz.b);
            } else if (interfaceC2604qt2 instanceof DG) {
                DG dg = (DG) interfaceC2604qt2;
                final ConstraintLayout constraintLayout6 = dg.l;
                int[] intArray2 = constraintLayout6.getContext().getResources().getIntArray(R.array.genres);
                AbstractC1474fG.i(intArray2, "getIntArray(...)");
                Drawable background2 = constraintLayout6.getBackground();
                GradientDrawable gradientDrawable2 = background2 instanceof GradientDrawable ? (GradientDrawable) background2 : null;
                if (gradientDrawable2 != null) {
                    gradientDrawable2.setColor(intArray2[c0309Az.d() % intArray2.length]);
                }
                constraintLayout6.setOnClickListener(new View.OnClickListener() { // from class: o.zz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        switch (i10) {
                            case 0:
                                ConstraintLayout constraintLayout7 = constraintLayout6;
                                AbstractC1474fG.j(constraintLayout7, "$this_apply");
                                C0309Az c0309Az2 = c0309Az;
                                AbstractC1474fG.j(c0309Az2, "this$0");
                                YT ytO = U9.o(constraintLayout7);
                                C2420oz c2420oz2 = c0309Az2.v;
                                if (c2420oz2 == null) {
                                    AbstractC1474fG.U("genre");
                                    throw null;
                                }
                                String str9 = c2420oz2.a;
                                AbstractC1474fG.j(str9, "id");
                                String str10 = c2420oz2.b;
                                AbstractC1474fG.j(str10, "name");
                                ytO.p(new C2856ta0(str9, str10));
                                return;
                            default:
                                ConstraintLayout constraintLayout8 = constraintLayout6;
                                AbstractC1474fG.j(constraintLayout8, "$this_apply");
                                C0309Az c0309Az3 = c0309Az;
                                AbstractC1474fG.j(c0309Az3, "this$0");
                                YT ytO2 = U9.o(constraintLayout8);
                                C2420oz c2420oz3 = c0309Az3.v;
                                if (c2420oz3 == null) {
                                    AbstractC1474fG.U("genre");
                                    throw null;
                                }
                                String str11 = c2420oz3.a;
                                AbstractC1474fG.j(str11, "id");
                                String str12 = c2420oz3.b;
                                AbstractC1474fG.j(str12, "name");
                                ytO2.p(new C1983ka0(str11, str12));
                                return;
                        }
                    }
                });
                constraintLayout6.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0908Yb(constraintLayout6, 2, dg));
                C2420oz c2420oz2 = c0309Az.v;
                if (c2420oz2 == null) {
                    AbstractC1474fG.U("genre");
                    throw null;
                }
                dg.m.setText(c2420oz2.b);
            }
        } else if (abstractC2144m60 instanceof C2083lb0) {
            C2083lb0 c2083lb0 = (C2083lb0) abstractC2144m60;
            Object obj4 = list.get(i);
            AbstractC1474fG.h(obj4, "null cannot be cast to non-null type com.skidush.clonex.models.Genre");
            C2420oz c2420oz3 = (C2420oz) obj4;
            C2994uv c2994uv = c2083lb0.u;
            Context context4 = ((ConstraintLayout) c2994uv.m).getContext();
            AbstractC1474fG.i(context4, "getContext(...)");
            AbstractActivityC1540fx abstractActivityC1540fx2 = context4 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context4 : null;
            boolean z5 = (abstractActivityC1540fx2 != null ? AbstractC0397Ej.o(abstractActivityC1540fx2) : null) instanceof MoviesHomeTvFragment;
            ConstraintLayout constraintLayout7 = (ConstraintLayout) c2994uv.m;
            if (z5) {
                AbstractC1474fG.i(constraintLayout7, "getRoot(...)");
                CardView cardView = (CardView) c2994uv.n;
                AbstractC1474fG.i(cardView, "cvSeeAll");
                AbstractC0397Ej.y(constraintLayout7, cardView);
            }
            constraintLayout7.setOnClickListener(new ViewOnClickListenerC1010ac(c2083lb0, 11, c2420oz3));
            constraintLayout7.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3348ye(3, c2083lb0));
        } else if (abstractC2144m60 instanceof DR) {
            Object obj5 = list.get(i);
            AbstractC1474fG.h(obj5, "null cannot be cast to non-null type com.skidush.clonex.models.Movie");
            ((DR) abstractC2144m60).u((C1387eR) obj5);
        } else if (abstractC2144m60 instanceof C2853tY) {
            final C2853tY c2853tY = (C2853tY) abstractC2144m60;
            Object obj6 = list.get(i);
            AbstractC1474fG.h(obj6, "null cannot be cast to non-null type com.skidush.clonex.models.People");
            c2853tY.v = (C1688hY) obj6;
            InterfaceC2604qt0 interfaceC2604qt3 = c2853tY.u;
            if (interfaceC2604qt3 instanceof IG) {
                IG ig = (IG) interfaceC2604qt3;
                final ConstraintLayout constraintLayout8 = ig.l;
                constraintLayout8.setOnClickListener(new View.OnClickListener() { // from class: o.sY
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        switch (i10) {
                            case 0:
                                ConstraintLayout constraintLayout9 = constraintLayout8;
                                AbstractC1474fG.j(constraintLayout9, "$this_apply");
                                C2853tY c2853tY2 = c2853tY;
                                AbstractC1474fG.j(c2853tY2, "this$0");
                                Context context5 = constraintLayout9.getContext();
                                AbstractC1474fG.i(context5, "getContext(...)");
                                AbstractActivityC1540fx abstractActivityC1540fxJ = AbstractC0397Ej.J(context5);
                                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO2 = abstractActivityC1540fxJ != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ) : null;
                                if (abstractComponentCallbacksC1247cxO2 instanceof MovieMobileFragment) {
                                    YT ytO = U9.o(constraintLayout9);
                                    C1688hY c1688hY = c2853tY2.v;
                                    if (c1688hY == null) {
                                        AbstractC1474fG.U("people");
                                        throw null;
                                    }
                                    String str9 = c1688hY.a;
                                    AbstractC1474fG.j(str9, "id");
                                    ytO.p(new C2071lR(str9));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO2 instanceof TvShowMobileFragment) {
                                    YT ytO2 = U9.o(constraintLayout9);
                                    C1688hY c1688hY2 = c2853tY2.v;
                                    if (c1688hY2 == null) {
                                        AbstractC1474fG.U("people");
                                        throw null;
                                    }
                                    String str10 = c1688hY2.a;
                                    AbstractC1474fG.j(str10, "id");
                                    ytO2.p(new C2787so0(str10));
                                    return;
                                }
                                return;
                            default:
                                ConstraintLayout constraintLayout10 = constraintLayout8;
                                AbstractC1474fG.j(constraintLayout10, "$this_apply");
                                C2853tY c2853tY3 = c2853tY;
                                AbstractC1474fG.j(c2853tY3, "this$0");
                                Context context6 = constraintLayout10.getContext();
                                AbstractC1474fG.i(context6, "getContext(...)");
                                AbstractActivityC1540fx abstractActivityC1540fxJ2 = AbstractC0397Ej.J(context6);
                                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO3 = abstractActivityC1540fxJ2 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ2) : null;
                                if (abstractComponentCallbacksC1247cxO3 instanceof MovieTvFragment) {
                                    YT ytO3 = U9.o(constraintLayout10);
                                    C1688hY c1688hY3 = c2853tY3.v;
                                    if (c1688hY3 == null) {
                                        AbstractC1474fG.U("people");
                                        throw null;
                                    }
                                    String str11 = c1688hY3.a;
                                    AbstractC1474fG.j(str11, "id");
                                    ytO3.p(new C2749sR(str11));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO3 instanceof TvShowTvFragment) {
                                    YT ytO4 = U9.o(constraintLayout10);
                                    C1688hY c1688hY4 = c2853tY3.v;
                                    if (c1688hY4 == null) {
                                        AbstractC1474fG.U("people");
                                        throw null;
                                    }
                                    String str12 = c1688hY4.a;
                                    AbstractC1474fG.j(str12, "id");
                                    ytO4.p(new Ao0(str12));
                                    return;
                                }
                                return;
                        }
                    }
                });
                ImageView imageView5 = ig.m;
                imageView5.setClipToOutline(true);
                ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E5 = com.bumptech.glide.a.e(imageView5.getContext());
                C1688hY c1688hY = c2853tY.v;
                if (c1688hY == null) {
                    AbstractC1474fG.U("people");
                    throw null;
                }
                ((C2630r70) ((C2630r70) componentCallbacks2C3406z70E5.n(c1688hY.c).q(R.drawable.ic_person_placeholder)).c()).H(imageView5);
                C1688hY c1688hY2 = c2853tY.v;
                if (c1688hY2 == null) {
                    AbstractC1474fG.U("people");
                    throw null;
                }
                ig.n.setText(c1688hY2.b);
            } else if (interfaceC2604qt3 instanceof JG) {
                JG jg = (JG) interfaceC2604qt3;
                final ConstraintLayout constraintLayout9 = jg.l;
                constraintLayout9.setOnClickListener(new View.OnClickListener() { // from class: o.sY
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        switch (i12) {
                            case 0:
                                ConstraintLayout constraintLayout10 = constraintLayout9;
                                AbstractC1474fG.j(constraintLayout10, "$this_apply");
                                C2853tY c2853tY2 = c2853tY;
                                AbstractC1474fG.j(c2853tY2, "this$0");
                                Context context5 = constraintLayout10.getContext();
                                AbstractC1474fG.i(context5, "getContext(...)");
                                AbstractActivityC1540fx abstractActivityC1540fxJ = AbstractC0397Ej.J(context5);
                                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO2 = abstractActivityC1540fxJ != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ) : null;
                                if (abstractComponentCallbacksC1247cxO2 instanceof MovieMobileFragment) {
                                    YT ytO = U9.o(constraintLayout10);
                                    C1688hY c1688hY3 = c2853tY2.v;
                                    if (c1688hY3 == null) {
                                        AbstractC1474fG.U("people");
                                        throw null;
                                    }
                                    String str9 = c1688hY3.a;
                                    AbstractC1474fG.j(str9, "id");
                                    ytO.p(new C2071lR(str9));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO2 instanceof TvShowMobileFragment) {
                                    YT ytO2 = U9.o(constraintLayout10);
                                    C1688hY c1688hY4 = c2853tY2.v;
                                    if (c1688hY4 == null) {
                                        AbstractC1474fG.U("people");
                                        throw null;
                                    }
                                    String str10 = c1688hY4.a;
                                    AbstractC1474fG.j(str10, "id");
                                    ytO2.p(new C2787so0(str10));
                                    return;
                                }
                                return;
                            default:
                                ConstraintLayout constraintLayout11 = constraintLayout9;
                                AbstractC1474fG.j(constraintLayout11, "$this_apply");
                                C2853tY c2853tY3 = c2853tY;
                                AbstractC1474fG.j(c2853tY3, "this$0");
                                Context context6 = constraintLayout11.getContext();
                                AbstractC1474fG.i(context6, "getContext(...)");
                                AbstractActivityC1540fx abstractActivityC1540fxJ2 = AbstractC0397Ej.J(context6);
                                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO3 = abstractActivityC1540fxJ2 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ2) : null;
                                if (abstractComponentCallbacksC1247cxO3 instanceof MovieTvFragment) {
                                    YT ytO3 = U9.o(constraintLayout11);
                                    C1688hY c1688hY5 = c2853tY3.v;
                                    if (c1688hY5 == null) {
                                        AbstractC1474fG.U("people");
                                        throw null;
                                    }
                                    String str11 = c1688hY5.a;
                                    AbstractC1474fG.j(str11, "id");
                                    ytO3.p(new C2749sR(str11));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO3 instanceof TvShowTvFragment) {
                                    YT ytO4 = U9.o(constraintLayout11);
                                    C1688hY c1688hY6 = c2853tY3.v;
                                    if (c1688hY6 == null) {
                                        AbstractC1474fG.U("people");
                                        throw null;
                                    }
                                    String str12 = c1688hY6.a;
                                    AbstractC1474fG.j(str12, "id");
                                    ytO4.p(new Ao0(str12));
                                    return;
                                }
                                return;
                        }
                    }
                });
                constraintLayout9.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0908Yb(constraintLayout9, i11, jg));
                ImageView imageView6 = jg.m;
                imageView6.setClipToOutline(true);
                ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E6 = com.bumptech.glide.a.e(imageView6.getContext());
                C1688hY c1688hY3 = c2853tY.v;
                if (c1688hY3 == null) {
                    AbstractC1474fG.U("people");
                    throw null;
                }
                ((C2630r70) ((C2630r70) componentCallbacks2C3406z70E6.n(c1688hY3.c).q(R.drawable.ic_person_placeholder)).c()).H(imageView6);
                C1688hY c1688hY4 = c2853tY.v;
                if (c1688hY4 == null) {
                    AbstractC1474fG.U("people");
                    throw null;
                }
                jg.n.setText(c1688hY4.b);
            }
        } else if (abstractC2144m60 instanceof Z30) {
            final Z30 z30 = (Z30) abstractC2144m60;
            Object obj7 = list.get(i);
            AbstractC1474fG.h(obj7, "null cannot be cast to non-null type com.skidush.clonex.models.Provider");
            z30.w = (R30) obj7;
            InterfaceC2604qt0 interfaceC2604qt4 = z30.u;
            boolean z6 = interfaceC2604qt4 instanceof KG;
            Object objValueOf = Integer.valueOf(R.drawable.ic_provider_default_logo);
            Context context5 = z30.v;
            if (z6) {
                KG kg = (KG) interfaceC2604qt4;
                final ConstraintLayout constraintLayout10 = kg.l;
                constraintLayout10.setOnClickListener(new View.OnClickListener() { // from class: o.Y30
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        switch (i10) {
                            case 0:
                                Z30 z31 = z30;
                                AbstractC1474fG.j(z31, "this$0");
                                ConstraintLayout constraintLayout11 = constraintLayout10;
                                AbstractC1474fG.j(constraintLayout11, "$this_apply");
                                R30 r30 = z31.w;
                                if (r30 == null) {
                                    AbstractC1474fG.U("provider");
                                    throw null;
                                }
                                Cr0 cr0 = Cr0.m;
                                Q30 q30 = r30.c;
                                cr0.f(q30 != null ? q30.getName() : null);
                                Context context6 = constraintLayout11.getContext();
                                AbstractC1474fG.i(context6, "getContext(...)");
                                AbstractActivityC1540fx abstractActivityC1540fx3 = context6 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context6 : null;
                                if (abstractActivityC1540fx3 != null) {
                                    abstractActivityC1540fx3.finish();
                                    abstractActivityC1540fx3.startActivity(new Intent(abstractActivityC1540fx3, abstractActivityC1540fx3.getClass()));
                                    return;
                                }
                                return;
                            default:
                                Z30 z32 = z30;
                                AbstractC1474fG.j(z32, "this$0");
                                ConstraintLayout constraintLayout12 = constraintLayout10;
                                AbstractC1474fG.j(constraintLayout12, "$this_apply");
                                R30 r31 = z32.w;
                                if (r31 == null) {
                                    AbstractC1474fG.U("provider");
                                    throw null;
                                }
                                Cr0 cr1 = Cr0.m;
                                Q30 q31 = r31.c;
                                cr1.f(q31 != null ? q31.getName() : null);
                                Context context7 = constraintLayout12.getContext();
                                AbstractC1474fG.i(context7, "getContext(...)");
                                AbstractActivityC1540fx abstractActivityC1540fx4 = context7 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context7 : null;
                                if (abstractActivityC1540fx4 != null) {
                                    abstractActivityC1540fx4.finish();
                                    abstractActivityC1540fx4.startActivity(new Intent(abstractActivityC1540fx4, abstractActivityC1540fx4.getClass()));
                                    return;
                                }
                                return;
                        }
                    }
                });
                ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E7 = com.bumptech.glide.a.e(context5);
                R30 r30 = z30.w;
                if (r30 == null) {
                    AbstractC1474fG.U("provider");
                    throw null;
                }
                String str9 = r30.b;
                if (str9.length() <= 0) {
                    str9 = null;
                }
                if (str9 != null) {
                    objValueOf = str9;
                }
                componentCallbacks2C3406z70E7.getClass();
                ((C2630r70) new C2630r70(componentCallbacks2C3406z70E7.l, componentCallbacks2C3406z70E7, Drawable.class, componentCallbacks2C3406z70E7.m).J(objValueOf).k()).H(kg.m);
                R30 r31 = z30.w;
                if (r31 == null) {
                    AbstractC1474fG.U("provider");
                    throw null;
                }
                kg.n.setText(r31.a);
            } else if (interfaceC2604qt4 instanceof LG) {
                LG lg = (LG) interfaceC2604qt4;
                final ConstraintLayout constraintLayout11 = lg.l;
                constraintLayout11.setOnClickListener(new View.OnClickListener() { // from class: o.Y30
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        switch (i12) {
                            case 0:
                                Z30 z31 = z30;
                                AbstractC1474fG.j(z31, "this$0");
                                ConstraintLayout constraintLayout12 = constraintLayout11;
                                AbstractC1474fG.j(constraintLayout12, "$this_apply");
                                R30 r32 = z31.w;
                                if (r32 == null) {
                                    AbstractC1474fG.U("provider");
                                    throw null;
                                }
                                Cr0 cr0 = Cr0.m;
                                Q30 q30 = r32.c;
                                cr0.f(q30 != null ? q30.getName() : null);
                                Context context6 = constraintLayout12.getContext();
                                AbstractC1474fG.i(context6, "getContext(...)");
                                AbstractActivityC1540fx abstractActivityC1540fx3 = context6 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context6 : null;
                                if (abstractActivityC1540fx3 != null) {
                                    abstractActivityC1540fx3.finish();
                                    abstractActivityC1540fx3.startActivity(new Intent(abstractActivityC1540fx3, abstractActivityC1540fx3.getClass()));
                                    return;
                                }
                                return;
                            default:
                                Z30 z32 = z30;
                                AbstractC1474fG.j(z32, "this$0");
                                ConstraintLayout constraintLayout13 = constraintLayout11;
                                AbstractC1474fG.j(constraintLayout13, "$this_apply");
                                R30 r33 = z32.w;
                                if (r33 == null) {
                                    AbstractC1474fG.U("provider");
                                    throw null;
                                }
                                Cr0 cr1 = Cr0.m;
                                Q30 q31 = r33.c;
                                cr1.f(q31 != null ? q31.getName() : null);
                                Context context7 = constraintLayout13.getContext();
                                AbstractC1474fG.i(context7, "getContext(...)");
                                AbstractActivityC1540fx abstractActivityC1540fx4 = context7 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context7 : null;
                                if (abstractActivityC1540fx4 != null) {
                                    abstractActivityC1540fx4.finish();
                                    abstractActivityC1540fx4.startActivity(new Intent(abstractActivityC1540fx4, abstractActivityC1540fx4.getClass()));
                                    return;
                                }
                                return;
                        }
                    }
                });
                ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E8 = com.bumptech.glide.a.e(context5);
                R30 r32 = z30.w;
                if (r32 == null) {
                    AbstractC1474fG.U("provider");
                    throw null;
                }
                String str10 = r32.b;
                if (str10.length() <= 0) {
                    str10 = null;
                }
                if (str10 != null) {
                    objValueOf = str10;
                }
                componentCallbacks2C3406z70E8.getClass();
                new C2630r70(componentCallbacks2C3406z70E8.l, componentCallbacks2C3406z70E8, Drawable.class, componentCallbacks2C3406z70E8.m).J(objValueOf).H(lg.m);
                R30 r33 = z30.w;
                if (r33 == null) {
                    AbstractC1474fG.U("provider");
                    throw null;
                }
                lg.n.setText(r33.a);
            }
        } else if (abstractC2144m60 instanceof Xa0) {
            final Xa0 xa0 = (Xa0) abstractC2144m60;
            Object obj8 = list.get(i);
            AbstractC1474fG.h(obj8, "null cannot be cast to non-null type com.skidush.clonex.models.Season");
            xa0.w = (Ma0) obj8;
            InterfaceC2604qt0 interfaceC2604qt5 = xa0.u;
            boolean z7 = interfaceC2604qt5 instanceof MG;
            Context context6 = xa0.v;
            if (z7) {
                MG mg = (MG) interfaceC2604qt5;
                final ConstraintLayout constraintLayout12 = mg.l;
                constraintLayout12.setOnClickListener(new View.OnClickListener() { // from class: o.Wa0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        String str11;
                        String str12;
                        String str13;
                        String str14;
                        switch (i12) {
                            case 0:
                                ConstraintLayout constraintLayout13 = constraintLayout12;
                                AbstractC1474fG.j(constraintLayout13, "$this_apply");
                                Xa0 xa1 = xa0;
                                AbstractC1474fG.j(xa1, "this$0");
                                YT ytO = U9.o(constraintLayout13);
                                Ma0 ma3 = xa1.w;
                                if (ma3 == null) {
                                    AbstractC1474fG.U("season");
                                    throw null;
                                }
                                C2109lo0 c2109lo4 = ma3.e;
                                String str15 = (c2109lo4 == null || (str12 = c2109lo4.a) == null) ? "" : str12;
                                String str16 = (c2109lo4 == null || (str11 = c2109lo4.b) == null) ? "" : str11;
                                String str17 = c2109lo4 != null ? c2109lo4.h : null;
                                String str18 = c2109lo4 != null ? c2109lo4.i : null;
                                String str19 = ma3.a;
                                int i18 = ma3.b;
                                String str20 = ma3.c;
                                AbstractC1474fG.j(str19, "seasonId");
                                ytO.p(new Co0(i18, str15, str16, str17, str18, str19, str20));
                                return;
                            default:
                                ConstraintLayout constraintLayout14 = constraintLayout12;
                                AbstractC1474fG.j(constraintLayout14, "$this_apply");
                                Xa0 xa2 = xa0;
                                AbstractC1474fG.j(xa2, "this$0");
                                YT ytO2 = U9.o(constraintLayout14);
                                Ma0 ma4 = xa2.w;
                                if (ma4 == null) {
                                    AbstractC1474fG.U("season");
                                    throw null;
                                }
                                C2109lo0 c2109lo5 = ma4.e;
                                String str21 = (c2109lo5 == null || (str14 = c2109lo5.a) == null) ? "" : str14;
                                String str22 = (c2109lo5 == null || (str13 = c2109lo5.b) == null) ? "" : str13;
                                String str23 = c2109lo5 != null ? c2109lo5.h : null;
                                String str24 = c2109lo5 != null ? c2109lo5.i : null;
                                String str25 = ma4.a;
                                int i19 = ma4.b;
                                String str26 = ma4.c;
                                AbstractC1474fG.j(str25, "seasonId");
                                ytO2.p(new C2981uo0(i19, str21, str22, str23, str24, str25, str26));
                                return;
                        }
                    }
                });
                ImageView imageView7 = mg.m;
                imageView7.setClipToOutline(true);
                ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E9 = com.bumptech.glide.a.e(imageView7.getContext());
                Ma0 ma3 = xa0.w;
                if (ma3 == null) {
                    AbstractC1474fG.U("season");
                    throw null;
                }
                ((C2630r70) ((C2630r70) componentCallbacks2C3406z70E9.n(ma3.d).j(R.drawable.glide_fallback_cover)).c()).H(imageView7);
                Ma0 ma4 = xa0.w;
                if (ma4 == null) {
                    AbstractC1474fG.U("season");
                    throw null;
                }
                String string10 = ma4.c;
                if (string10 == null) {
                    string10 = context6.getString(R.string.season_number, Integer.valueOf(ma4.b));
                }
                mg.n.setText(string10);
            } else if (interfaceC2604qt5 instanceof NG) {
                NG ng = (NG) interfaceC2604qt5;
                final ConstraintLayout constraintLayout13 = ng.l;
                constraintLayout13.setOnClickListener(new View.OnClickListener() { // from class: o.Wa0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        String str11;
                        String str12;
                        String str13;
                        String str14;
                        switch (i10) {
                            case 0:
                                ConstraintLayout constraintLayout14 = constraintLayout13;
                                AbstractC1474fG.j(constraintLayout14, "$this_apply");
                                Xa0 xa1 = xa0;
                                AbstractC1474fG.j(xa1, "this$0");
                                YT ytO = U9.o(constraintLayout14);
                                Ma0 ma5 = xa1.w;
                                if (ma5 == null) {
                                    AbstractC1474fG.U("season");
                                    throw null;
                                }
                                C2109lo0 c2109lo4 = ma5.e;
                                String str15 = (c2109lo4 == null || (str12 = c2109lo4.a) == null) ? "" : str12;
                                String str16 = (c2109lo4 == null || (str11 = c2109lo4.b) == null) ? "" : str11;
                                String str17 = c2109lo4 != null ? c2109lo4.h : null;
                                String str18 = c2109lo4 != null ? c2109lo4.i : null;
                                String str19 = ma5.a;
                                int i18 = ma5.b;
                                String str20 = ma5.c;
                                AbstractC1474fG.j(str19, "seasonId");
                                ytO.p(new Co0(i18, str15, str16, str17, str18, str19, str20));
                                return;
                            default:
                                ConstraintLayout constraintLayout15 = constraintLayout13;
                                AbstractC1474fG.j(constraintLayout15, "$this_apply");
                                Xa0 xa2 = xa0;
                                AbstractC1474fG.j(xa2, "this$0");
                                YT ytO2 = U9.o(constraintLayout15);
                                Ma0 ma6 = xa2.w;
                                if (ma6 == null) {
                                    AbstractC1474fG.U("season");
                                    throw null;
                                }
                                C2109lo0 c2109lo5 = ma6.e;
                                String str21 = (c2109lo5 == null || (str14 = c2109lo5.a) == null) ? "" : str14;
                                String str22 = (c2109lo5 == null || (str13 = c2109lo5.b) == null) ? "" : str13;
                                String str23 = c2109lo5 != null ? c2109lo5.h : null;
                                String str24 = c2109lo5 != null ? c2109lo5.i : null;
                                String str25 = ma6.a;
                                int i19 = ma6.b;
                                String str26 = ma6.c;
                                AbstractC1474fG.j(str25, "seasonId");
                                ytO2.p(new C2981uo0(i19, str21, str22, str23, str24, str25, str26));
                                return;
                        }
                    }
                });
                constraintLayout13.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0908Yb(constraintLayout13, i7, ng));
                ImageView imageView8 = ng.m;
                imageView8.setClipToOutline(true);
                ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E10 = com.bumptech.glide.a.e(imageView8.getContext());
                Ma0 ma5 = xa0.w;
                if (ma5 == null) {
                    AbstractC1474fG.U("season");
                    throw null;
                }
                ((C2630r70) ((C2630r70) componentCallbacks2C3406z70E10.n(ma5.d).j(R.drawable.glide_fallback_cover)).c()).H(imageView8);
                Ma0 ma6 = xa0.w;
                if (ma6 == null) {
                    AbstractC1474fG.U("season");
                    throw null;
                }
                String string11 = ma6.c;
                if (string11 == null) {
                    string11 = context6.getString(R.string.season_number, Integer.valueOf(ma6.b));
                }
                ng.n.setText(string11);
            }
        } else if (abstractC2144m60 instanceof C2107ln0) {
            Object obj9 = list.get(i);
            AbstractC1474fG.h(obj9, "null cannot be cast to non-null type com.skidush.clonex.models.Movie");
            ((C2107ln0) abstractC2144m60).u((C1387eR) obj9);
        } else if (abstractC2144m60 instanceof Jo0) {
            Object obj10 = list.get(i);
            AbstractC1474fG.h(obj10, "null cannot be cast to non-null type com.skidush.clonex.models.TvShow");
            ((Jo0) abstractC2144m60).u((C2109lo0) obj10);
        }
        Parcelable parcelable = (Parcelable) this.e.get(Integer.valueOf(abstractC2144m60.e()));
        if (parcelable != null) {
            if (z) {
                RecyclerView recyclerViewV = ((C1498fc) abstractC2144m60).v();
                if (recyclerViewV == null || (layoutManager3 = recyclerViewV.getLayoutManager()) == null) {
                    return;
                }
                layoutManager3.s0(parcelable);
                return;
            }
            if (abstractC2144m60 instanceof DR) {
                RecyclerView recyclerViewW = ((DR) abstractC2144m60).w();
                if (recyclerViewW == null || (layoutManager2 = recyclerViewW.getLayoutManager()) == null) {
                    return;
                }
                layoutManager2.s0(parcelable);
                return;
            }
            if (!(abstractC2144m60 instanceof Jo0) || (recyclerViewX = ((Jo0) abstractC2144m60).x()) == null || (layoutManager = recyclerViewX.getLayoutManager()) == null) {
                return;
            }
            layoutManager.s0(parcelable);
        }
    }

    @Override // o.O50
    public final AbstractC2144m60 f(int i, RecyclerView recyclerView) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        AbstractC1474fG.j(recyclerView, "parent");
        int iOrdinal = ((EnumC3203x3) EnumC3203x3.h0.get(i)).ordinal();
        int i17 = R.id.tv_tv_show_seasons_label;
        int i18 = R.id.tv_tv_show_cast_label;
        int i19 = R.id.tv_tv_show_recommendations_label;
        int i20 = R.id.barrier1;
        switch (iOrdinal) {
            case 0:
                return new C1498fc(C2835tG.a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
            case 1:
                return new C1498fc(C3029vG.a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
            case 2:
                return new C1498fc(C0913Yg.a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
            case 3:
                return new C1498fc(C0939Zg.a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
            case 4:
                return new C0663Oq(C3320yG.a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
            case 5:
                return new C0663Oq(C3417zG.a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
            case 6:
                return new C0663Oq(C3126wG.a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
            case 7:
                return new C0663Oq(C3223xG.a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
            case 8:
                return new C0309Az(CG.a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
            case 9:
                return new C0309Az(DG.a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
            case 10:
                return new C2083lb0(C2994uv.d0(LayoutInflater.from(recyclerView.getContext()), recyclerView));
            case 11:
                return new C1967kL((ConstraintLayout) C0334By.r(LayoutInflater.from(recyclerView.getContext()), recyclerView).m);
            case 12:
            case 14:
                return new DR(GG.a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
            case 13:
            case 15:
                return new DR(HG.a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
            case 16:
                return new DR(EG.a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
            case 17:
                return new DR(FG.a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
            case 18:
                return new DR(C2932uG.a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
            case 19:
                return new DR(AG.a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
            case 20:
                return new DR(BG.a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
            case 21:
                return new DR(C2094lh.a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
            case 22:
                View viewK = AbstractC1674hK.k(recyclerView, R.layout.content_movie_tv, recyclerView, false);
                if (((Barrier) Sr0.g(viewK, R.id.barrier1)) != null) {
                    i20 = R.id.btn_movie_favorite;
                    ImageView imageView = (ImageView) Sr0.g(viewK, R.id.btn_movie_favorite);
                    if (imageView != null) {
                        i20 = R.id.btn_movie_trailer;
                        TextView textView = (TextView) Sr0.g(viewK, R.id.btn_movie_trailer);
                        if (textView != null) {
                            i20 = R.id.btn_movie_watch_now;
                            TextView textView2 = (TextView) Sr0.g(viewK, R.id.btn_movie_watch_now);
                            if (textView2 != null) {
                                i20 = R.id.iv_movie_poster;
                                ImageView imageView2 = (ImageView) Sr0.g(viewK, R.id.iv_movie_poster);
                                if (imageView2 != null) {
                                    i20 = R.id.iv_movie_rating_icon;
                                    if (((ImageView) Sr0.g(viewK, R.id.iv_movie_rating_icon)) != null) {
                                        i20 = R.id.pb_movie_progress;
                                        ProgressBar progressBar = (ProgressBar) Sr0.g(viewK, R.id.pb_movie_progress);
                                        if (progressBar != null) {
                                            i20 = R.id.tv_movie_genres;
                                            TextView textView3 = (TextView) Sr0.g(viewK, R.id.tv_movie_genres);
                                            if (textView3 != null) {
                                                i20 = R.id.tv_movie_overview;
                                                TextView textView4 = (TextView) Sr0.g(viewK, R.id.tv_movie_overview);
                                                if (textView4 != null) {
                                                    i20 = R.id.tv_movie_quality;
                                                    TextView textView5 = (TextView) Sr0.g(viewK, R.id.tv_movie_quality);
                                                    if (textView5 != null) {
                                                        i20 = R.id.tv_movie_rating;
                                                        TextView textView6 = (TextView) Sr0.g(viewK, R.id.tv_movie_rating);
                                                        if (textView6 != null) {
                                                            i20 = R.id.tv_movie_released;
                                                            TextView textView7 = (TextView) Sr0.g(viewK, R.id.tv_movie_released);
                                                            if (textView7 != null) {
                                                                i20 = R.id.tv_movie_runtime;
                                                                TextView textView8 = (TextView) Sr0.g(viewK, R.id.tv_movie_runtime);
                                                                if (textView8 != null) {
                                                                    i20 = R.id.tv_movie_title;
                                                                    TextView textView9 = (TextView) Sr0.g(viewK, R.id.tv_movie_title);
                                                                    if (textView9 != null) {
                                                                        return new DR(new C2385oh((ConstraintLayout) viewK, imageView, textView, textView2, imageView2, progressBar, textView3, textView4, textView5, textView6, textView7, textView8, textView9));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewK.getResources().getResourceName(i20)));
            case 23:
                View viewK2 = AbstractC1674hK.k(recyclerView, R.layout.content_movie_cast_mobile, recyclerView, false);
                int i21 = R.id.rv_movie_cast;
                RecyclerView recyclerView2 = (RecyclerView) Sr0.g(viewK2, R.id.rv_movie_cast);
                if (recyclerView2 != null) {
                    if (((TextView) Sr0.g(viewK2, R.id.tv_movie_cast_label)) != null) {
                        return new DR(new C1898jh((ConstraintLayout) viewK2, recyclerView2));
                    }
                    i21 = R.id.tv_movie_cast_label;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewK2.getResources().getResourceName(i21)));
            case 24:
                View viewK3 = AbstractC1674hK.k(recyclerView, R.layout.content_movie_cast_tv, recyclerView, false);
                int i22 = R.id.hgv_movie_cast;
                HorizontalGridView horizontalGridView = (HorizontalGridView) Sr0.g(viewK3, R.id.hgv_movie_cast);
                if (horizontalGridView != null) {
                    if (((TextView) Sr0.g(viewK3, R.id.tv_movie_cast_label)) != null) {
                        return new DR(new C1996kh((ConstraintLayout) viewK3, horizontalGridView));
                    }
                    i22 = R.id.tv_movie_cast_label;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewK3.getResources().getResourceName(i22)));
            case 25:
                View viewK4 = AbstractC1674hK.k(recyclerView, R.layout.content_movie_recommendations_mobile, recyclerView, false);
                RecyclerView recyclerView3 = (RecyclerView) Sr0.g(viewK4, R.id.rv_movie_recommendations);
                if (recyclerView3 == null) {
                    i2 = R.id.rv_movie_recommendations;
                } else {
                    if (((TextView) Sr0.g(viewK4, R.id.tv_movie_recommendations_label)) != null) {
                        return new DR(new C2191mh((ConstraintLayout) viewK4, recyclerView3));
                    }
                    i2 = R.id.tv_movie_recommendations_label;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewK4.getResources().getResourceName(i2)));
            case 26:
                View viewK5 = AbstractC1674hK.k(recyclerView, R.layout.content_movie_recommendations_tv, recyclerView, false);
                HorizontalGridView horizontalGridView2 = (HorizontalGridView) Sr0.g(viewK5, R.id.hgv_movie_recommendations);
                if (horizontalGridView2 == null) {
                    i3 = R.id.hgv_movie_recommendations;
                } else {
                    if (((TextView) Sr0.g(viewK5, R.id.tv_movie_recommendations_label)) != null) {
                        return new DR(new C2288nh((ConstraintLayout) viewK5, horizontalGridView2));
                    }
                    i3 = R.id.tv_movie_recommendations_label;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewK5.getResources().getResourceName(i3)));
            case 27:
                View viewK6 = AbstractC1674hK.k(recyclerView, R.layout.item_people_mobile, recyclerView, false);
                int i23 = R.id.iv_people_image;
                ImageView imageView3 = (ImageView) Sr0.g(viewK6, R.id.iv_people_image);
                if (imageView3 != null) {
                    TextView textView10 = (TextView) Sr0.g(viewK6, R.id.tv_people_name);
                    if (textView10 != null) {
                        return new C2853tY(new IG((ConstraintLayout) viewK6, imageView3, textView10));
                    }
                    i23 = R.id.tv_people_name;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewK6.getResources().getResourceName(i23)));
            case 28:
                View viewK7 = AbstractC1674hK.k(recyclerView, R.layout.item_people_tv, recyclerView, false);
                ImageView imageView4 = (ImageView) Sr0.g(viewK7, R.id.iv_people_image);
                if (imageView4 != null) {
                    TextView textView11 = (TextView) Sr0.g(viewK7, R.id.tv_people_name);
                    if (textView11 != null) {
                        return new C2853tY(new JG((ConstraintLayout) viewK7, imageView4, textView11));
                    }
                    i4 = R.id.tv_people_name;
                } else {
                    i4 = R.id.iv_people_image;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewK7.getResources().getResourceName(i4)));
            case 29:
                View viewK8 = AbstractC1674hK.k(recyclerView, R.layout.item_provider_mobile, recyclerView, false);
                ImageView imageView5 = (ImageView) Sr0.g(viewK8, R.id.iv_provider_logo);
                if (imageView5 != null) {
                    TextView textView12 = (TextView) Sr0.g(viewK8, R.id.tv_provider_name);
                    if (textView12 != null) {
                        return new Z30(new KG((ConstraintLayout) viewK8, imageView5, textView12));
                    }
                    i5 = R.id.tv_provider_name;
                } else {
                    i5 = R.id.iv_provider_logo;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewK8.getResources().getResourceName(i5)));
            case 30:
                View viewK9 = AbstractC1674hK.k(recyclerView, R.layout.item_provider_tv, recyclerView, false);
                ImageView imageView6 = (ImageView) Sr0.g(viewK9, R.id.iv_provider_logo);
                if (imageView6 != null) {
                    TextView textView13 = (TextView) Sr0.g(viewK9, R.id.tv_provider_name);
                    if (textView13 != null) {
                        return new Z30(new LG((ConstraintLayout) viewK9, imageView6, textView13));
                    }
                    i6 = R.id.tv_provider_name;
                } else {
                    i6 = R.id.iv_provider_logo;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewK9.getResources().getResourceName(i6)));
            case 31:
                View viewK10 = AbstractC1674hK.k(recyclerView, R.layout.item_season_mobile, recyclerView, false);
                ImageView imageView7 = (ImageView) Sr0.g(viewK10, R.id.iv_season_poster);
                if (imageView7 != null) {
                    TextView textView14 = (TextView) Sr0.g(viewK10, R.id.tv_season_title);
                    if (textView14 != null) {
                        return new Xa0(new MG((ConstraintLayout) viewK10, imageView7, textView14));
                    }
                    i7 = R.id.tv_season_title;
                } else {
                    i7 = R.id.iv_season_poster;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewK10.getResources().getResourceName(i7)));
            case 32:
                View viewK11 = AbstractC1674hK.k(recyclerView, R.layout.item_season_tv, recyclerView, false);
                ImageView imageView8 = (ImageView) Sr0.g(viewK11, R.id.iv_season_poster);
                if (imageView8 != null) {
                    TextView textView15 = (TextView) Sr0.g(viewK11, R.id.tv_season_title);
                    if (textView15 != null) {
                        return new Xa0(new NG((ConstraintLayout) viewK11, imageView8, textView15));
                    }
                    i8 = R.id.tv_season_title;
                } else {
                    i8 = R.id.iv_season_poster;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewK11.getResources().getResourceName(i8)));
            case 33:
                View viewK12 = AbstractC1674hK.k(recyclerView, R.layout.item_tv_channel_mobile, recyclerView, false);
                ImageView imageView9 = (ImageView) Sr0.g(viewK12, R.id.iv_channel_logo);
                if (imageView9 != null) {
                    LinearLayout linearLayout = (LinearLayout) Sr0.g(viewK12, R.id.ll_live_badge);
                    if (linearLayout != null) {
                        TextView textView16 = (TextView) Sr0.g(viewK12, R.id.tv_channel_schedule);
                        if (textView16 != null) {
                            TextView textView17 = (TextView) Sr0.g(viewK12, R.id.tv_channel_title);
                            if (textView17 != null) {
                                return new C2107ln0(new QG((ConstraintLayout) viewK12, imageView9, linearLayout, textView16, textView17));
                            }
                            i9 = R.id.tv_channel_title;
                        } else {
                            i9 = R.id.tv_channel_schedule;
                        }
                    } else {
                        i9 = R.id.ll_live_badge;
                    }
                } else {
                    i9 = R.id.iv_channel_logo;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewK12.getResources().getResourceName(i9)));
            case C3080vp0.H /* 34 */:
                View viewK13 = AbstractC1674hK.k(recyclerView, R.layout.item_tv_channel_tv, recyclerView, false);
                ImageView imageView10 = (ImageView) Sr0.g(viewK13, R.id.iv_channel_logo);
                if (imageView10 != null) {
                    LinearLayout linearLayout2 = (LinearLayout) Sr0.g(viewK13, R.id.ll_live_badge);
                    if (linearLayout2 != null) {
                        TextView textView18 = (TextView) Sr0.g(viewK13, R.id.tv_channel_schedule);
                        if (textView18 != null) {
                            TextView textView19 = (TextView) Sr0.g(viewK13, R.id.tv_channel_title);
                            if (textView19 != null) {
                                return new C2107ln0(new RG((ConstraintLayout) viewK13, imageView10, linearLayout2, textView18, textView19));
                            }
                            i10 = R.id.tv_channel_title;
                        } else {
                            i10 = R.id.tv_channel_schedule;
                        }
                    } else {
                        i10 = R.id.ll_live_badge;
                    }
                } else {
                    i10 = R.id.iv_channel_logo;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewK13.getResources().getResourceName(i10)));
            case C3080vp0.I /* 35 */:
                View viewK14 = AbstractC1674hK.k(recyclerView, R.layout.item_tv_show_mobile, recyclerView, false);
                ImageView imageView11 = (ImageView) Sr0.g(viewK14, R.id.iv_tv_show_poster);
                if (imageView11 != null) {
                    i11 = R.id.tv_tv_show_last_episode;
                    TextView textView20 = (TextView) Sr0.g(viewK14, R.id.tv_tv_show_last_episode);
                    if (textView20 != null) {
                        TextView textView21 = (TextView) Sr0.g(viewK14, R.id.tv_tv_show_quality);
                        if (textView21 != null) {
                            i11 = R.id.tv_tv_show_title;
                            TextView textView22 = (TextView) Sr0.g(viewK14, R.id.tv_tv_show_title);
                            if (textView22 != null) {
                                return new Jo0(new UG((ConstraintLayout) viewK14, imageView11, textView20, textView21, textView22));
                            }
                        } else {
                            i11 = R.id.tv_tv_show_quality;
                        }
                    }
                } else {
                    i11 = R.id.iv_tv_show_poster;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewK14.getResources().getResourceName(i11)));
            case C3080vp0.J /* 36 */:
                View viewK15 = AbstractC1674hK.k(recyclerView, R.layout.item_tv_show_tv, recyclerView, false);
                if (((Barrier) Sr0.g(viewK15, R.id.barrier1)) != null) {
                    CardView cardView = (CardView) Sr0.g(viewK15, R.id.cv_tv_show_poster);
                    if (cardView != null) {
                        ImageView imageView12 = (ImageView) Sr0.g(viewK15, R.id.iv_tv_show_poster);
                        if (imageView12 != null) {
                            TextView textView23 = (TextView) Sr0.g(viewK15, R.id.tv_tv_show_last_episode);
                            if (textView23 != null) {
                                TextView textView24 = (TextView) Sr0.g(viewK15, R.id.tv_tv_show_quality);
                                if (textView24 != null) {
                                    TextView textView25 = (TextView) Sr0.g(viewK15, R.id.tv_tv_show_title);
                                    if (textView25 != null) {
                                        return new Jo0(new VG((ConstraintLayout) viewK15, cardView, imageView12, textView23, textView24, textView25));
                                    }
                                    i12 = R.id.tv_tv_show_title;
                                } else {
                                    i12 = R.id.tv_tv_show_quality;
                                }
                            } else {
                                i12 = R.id.tv_tv_show_last_episode;
                            }
                        } else {
                            i12 = R.id.iv_tv_show_poster;
                        }
                    } else {
                        i12 = R.id.cv_tv_show_poster;
                    }
                } else {
                    i12 = R.id.barrier1;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewK15.getResources().getResourceName(i12)));
            case 37:
                View viewK16 = AbstractC1674hK.k(recyclerView, R.layout.item_tv_show_grid_mobile, recyclerView, false);
                ImageView imageView13 = (ImageView) Sr0.g(viewK16, R.id.iv_tv_show_poster);
                if (imageView13 != null) {
                    TextView textView26 = (TextView) Sr0.g(viewK16, R.id.tv_tv_show_last_episode);
                    if (textView26 != null) {
                        TextView textView27 = (TextView) Sr0.g(viewK16, R.id.tv_tv_show_quality);
                        if (textView27 != null) {
                            TextView textView28 = (TextView) Sr0.g(viewK16, R.id.tv_tv_show_title);
                            if (textView28 != null) {
                                return new Jo0(new TG((ConstraintLayout) viewK16, imageView13, textView26, textView27, textView28));
                            }
                            i13 = R.id.tv_tv_show_title;
                        } else {
                            i13 = R.id.tv_tv_show_quality;
                        }
                    } else {
                        i13 = R.id.tv_tv_show_last_episode;
                    }
                } else {
                    i13 = R.id.iv_tv_show_poster;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewK16.getResources().getResourceName(i13)));
            case C3080vp0.L /* 38 */:
                View viewK17 = AbstractC1674hK.k(recyclerView, R.layout.item_tv_show_grid, recyclerView, false);
                if (((Barrier) Sr0.g(viewK17, R.id.barrier1)) == null) {
                    i14 = R.id.barrier1;
                } else if (((CardView) Sr0.g(viewK17, R.id.cv_tv_show_poster)) != null) {
                    ImageView imageView14 = (ImageView) Sr0.g(viewK17, R.id.iv_tv_show_poster);
                    if (imageView14 != null) {
                        TextView textView29 = (TextView) Sr0.g(viewK17, R.id.tv_tv_show_last_episode);
                        if (textView29 != null) {
                            TextView textView30 = (TextView) Sr0.g(viewK17, R.id.tv_tv_show_quality);
                            if (textView30 != null) {
                                TextView textView31 = (TextView) Sr0.g(viewK17, R.id.tv_tv_show_title);
                                if (textView31 != null) {
                                    return new Jo0(new SG((ConstraintLayout) viewK17, imageView14, textView29, textView30, textView31));
                                }
                                i14 = R.id.tv_tv_show_title;
                            } else {
                                i14 = R.id.tv_tv_show_quality;
                            }
                        } else {
                            i14 = R.id.tv_tv_show_last_episode;
                        }
                    } else {
                        i14 = R.id.iv_tv_show_poster;
                    }
                } else {
                    i14 = R.id.cv_tv_show_poster;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewK17.getResources().getResourceName(i14)));
            case 39:
                return new Jo0(C2932uG.a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
            case C3080vp0.N /* 40 */:
                View viewK18 = AbstractC1674hK.k(recyclerView, R.layout.content_tv_show_mobile, recyclerView, false);
                if (((Barrier) Sr0.g(viewK18, R.id.barrier1)) == null) {
                    i15 = R.id.barrier1;
                } else if (((Barrier) Sr0.g(viewK18, R.id.barrier2)) != null) {
                    ImageView imageView15 = (ImageView) Sr0.g(viewK18, R.id.btn_tv_show_favorite);
                    if (imageView15 != null) {
                        TextView textView32 = (TextView) Sr0.g(viewK18, R.id.btn_tv_show_trailer);
                        if (textView32 != null) {
                            TextView textView33 = (TextView) Sr0.g(viewK18, R.id.btn_tv_show_watch_episode);
                            if (textView33 == null) {
                                i15 = R.id.btn_tv_show_watch_episode;
                            } else if (((ConstraintLayout) Sr0.g(viewK18, R.id.cl_watch_episodes_buttons)) != null) {
                                ImageView imageView16 = (ImageView) Sr0.g(viewK18, R.id.iv_tv_show_poster);
                                if (imageView16 == null) {
                                    i15 = R.id.iv_tv_show_poster;
                                } else if (((ImageView) Sr0.g(viewK18, R.id.iv_tv_show_rating_icon)) != null) {
                                    ProgressBar progressBar2 = (ProgressBar) Sr0.g(viewK18, R.id.pb_tv_show_progress_episode);
                                    if (progressBar2 != null) {
                                        ProgressBar progressBar3 = (ProgressBar) Sr0.g(viewK18, R.id.pb_tv_show_watch_episode_loading);
                                        if (progressBar3 != null) {
                                            TextView textView34 = (TextView) Sr0.g(viewK18, R.id.tv_tv_show_genres);
                                            if (textView34 != null) {
                                                TextView textView35 = (TextView) Sr0.g(viewK18, R.id.tv_tv_show_overview);
                                                if (textView35 != null) {
                                                    TextView textView36 = (TextView) Sr0.g(viewK18, R.id.tv_tv_show_quality);
                                                    if (textView36 != null) {
                                                        TextView textView37 = (TextView) Sr0.g(viewK18, R.id.tv_tv_show_rating);
                                                        if (textView37 != null) {
                                                            TextView textView38 = (TextView) Sr0.g(viewK18, R.id.tv_tv_show_released);
                                                            if (textView38 != null) {
                                                                TextView textView39 = (TextView) Sr0.g(viewK18, R.id.tv_tv_show_runtime);
                                                                if (textView39 != null) {
                                                                    TextView textView40 = (TextView) Sr0.g(viewK18, R.id.tv_tv_show_title);
                                                                    if (textView40 != null) {
                                                                        return new Jo0(new C2675rh((ConstraintLayout) viewK18, imageView15, textView32, textView33, imageView16, progressBar2, progressBar3, textView34, textView35, textView36, textView37, textView38, textView39, textView40));
                                                                    }
                                                                    i15 = R.id.tv_tv_show_title;
                                                                } else {
                                                                    i15 = R.id.tv_tv_show_runtime;
                                                                }
                                                            } else {
                                                                i15 = R.id.tv_tv_show_released;
                                                            }
                                                        } else {
                                                            i15 = R.id.tv_tv_show_rating;
                                                        }
                                                    } else {
                                                        i15 = R.id.tv_tv_show_quality;
                                                    }
                                                } else {
                                                    i15 = R.id.tv_tv_show_overview;
                                                }
                                            } else {
                                                i15 = R.id.tv_tv_show_genres;
                                            }
                                        } else {
                                            i15 = R.id.pb_tv_show_watch_episode_loading;
                                        }
                                    } else {
                                        i15 = R.id.pb_tv_show_progress_episode;
                                    }
                                } else {
                                    i15 = R.id.iv_tv_show_rating_icon;
                                }
                            } else {
                                i15 = R.id.cl_watch_episodes_buttons;
                            }
                        } else {
                            i15 = R.id.btn_tv_show_trailer;
                        }
                    } else {
                        i15 = R.id.btn_tv_show_favorite;
                    }
                } else {
                    i15 = R.id.barrier2;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewK18.getResources().getResourceName(i15)));
            case 41:
                View viewK19 = AbstractC1674hK.k(recyclerView, R.layout.content_tv_show_tv, recyclerView, false);
                if (((Barrier) Sr0.g(viewK19, R.id.barrier1)) == null) {
                    i16 = R.id.barrier1;
                } else if (((Barrier) Sr0.g(viewK19, R.id.barrier2)) != null) {
                    ImageView imageView17 = (ImageView) Sr0.g(viewK19, R.id.btn_tv_show_favorite);
                    if (imageView17 != null) {
                        TextView textView41 = (TextView) Sr0.g(viewK19, R.id.btn_tv_show_trailer);
                        if (textView41 != null) {
                            TextView textView42 = (TextView) Sr0.g(viewK19, R.id.btn_tv_show_watch_episode);
                            if (textView42 != null) {
                                ImageView imageView18 = (ImageView) Sr0.g(viewK19, R.id.iv_tv_show_poster);
                                if (imageView18 == null) {
                                    i16 = R.id.iv_tv_show_poster;
                                } else if (((ImageView) Sr0.g(viewK19, R.id.iv_tv_show_rating_icon)) != null) {
                                    ProgressBar progressBar4 = (ProgressBar) Sr0.g(viewK19, R.id.pb_tv_show_progress_episode);
                                    if (progressBar4 != null) {
                                        ProgressBar progressBar5 = (ProgressBar) Sr0.g(viewK19, R.id.pb_tv_show_watch_episode_loading);
                                        if (progressBar5 != null) {
                                            TextView textView43 = (TextView) Sr0.g(viewK19, R.id.tv_tv_show_genres);
                                            if (textView43 != null) {
                                                TextView textView44 = (TextView) Sr0.g(viewK19, R.id.tv_tv_show_overview);
                                                if (textView44 != null) {
                                                    TextView textView45 = (TextView) Sr0.g(viewK19, R.id.tv_tv_show_quality);
                                                    if (textView45 != null) {
                                                        TextView textView46 = (TextView) Sr0.g(viewK19, R.id.tv_tv_show_rating);
                                                        if (textView46 != null) {
                                                            TextView textView47 = (TextView) Sr0.g(viewK19, R.id.tv_tv_show_released);
                                                            if (textView47 != null) {
                                                                TextView textView48 = (TextView) Sr0.g(viewK19, R.id.tv_tv_show_runtime);
                                                                if (textView48 != null) {
                                                                    TextView textView49 = (TextView) Sr0.g(viewK19, R.id.tv_tv_show_title);
                                                                    if (textView49 != null) {
                                                                        return new Jo0(new C3160wh((ConstraintLayout) viewK19, imageView17, textView41, textView42, imageView18, progressBar4, progressBar5, textView43, textView44, textView45, textView46, textView47, textView48, textView49));
                                                                    }
                                                                    i16 = R.id.tv_tv_show_title;
                                                                } else {
                                                                    i16 = R.id.tv_tv_show_runtime;
                                                                }
                                                            } else {
                                                                i16 = R.id.tv_tv_show_released;
                                                            }
                                                        } else {
                                                            i16 = R.id.tv_tv_show_rating;
                                                        }
                                                    } else {
                                                        i16 = R.id.tv_tv_show_quality;
                                                    }
                                                } else {
                                                    i16 = R.id.tv_tv_show_overview;
                                                }
                                            } else {
                                                i16 = R.id.tv_tv_show_genres;
                                            }
                                        } else {
                                            i16 = R.id.pb_tv_show_watch_episode_loading;
                                        }
                                    } else {
                                        i16 = R.id.pb_tv_show_progress_episode;
                                    }
                                } else {
                                    i16 = R.id.iv_tv_show_rating_icon;
                                }
                            } else {
                                i16 = R.id.btn_tv_show_watch_episode;
                            }
                        } else {
                            i16 = R.id.btn_tv_show_trailer;
                        }
                    } else {
                        i16 = R.id.btn_tv_show_favorite;
                    }
                } else {
                    i16 = R.id.barrier2;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewK19.getResources().getResourceName(i16)));
            case 42:
                View viewK20 = AbstractC1674hK.k(recyclerView, R.layout.content_tv_show_seasons_mobile, recyclerView, false);
                RecyclerView recyclerView4 = (RecyclerView) Sr0.g(viewK20, R.id.rv_tv_show_seasons);
                if (recyclerView4 == null) {
                    i17 = R.id.rv_tv_show_seasons;
                } else if (((TextView) Sr0.g(viewK20, R.id.tv_tv_show_seasons_label)) != null) {
                    return new Jo0(new C2966uh((ConstraintLayout) viewK20, recyclerView4));
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewK20.getResources().getResourceName(i17)));
            case 43:
                View viewK21 = AbstractC1674hK.k(recyclerView, R.layout.content_tv_show_seasons_tv, recyclerView, false);
                HorizontalGridView horizontalGridView3 = (HorizontalGridView) Sr0.g(viewK21, R.id.hgv_tv_show_seasons);
                if (horizontalGridView3 == null) {
                    i17 = R.id.hgv_tv_show_seasons;
                } else if (((TextView) Sr0.g(viewK21, R.id.tv_tv_show_seasons_label)) != null) {
                    return new Jo0(new C3063vh((ConstraintLayout) viewK21, horizontalGridView3));
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewK21.getResources().getResourceName(i17)));
            case 44:
                View viewK22 = AbstractC1674hK.k(recyclerView, R.layout.content_tv_show_cast_mobile, recyclerView, false);
                RecyclerView recyclerView5 = (RecyclerView) Sr0.g(viewK22, R.id.rv_tv_show_cast);
                if (recyclerView5 == null) {
                    i18 = R.id.rv_tv_show_cast;
                } else if (((TextView) Sr0.g(viewK22, R.id.tv_tv_show_cast_label)) != null) {
                    return new Jo0(new C2482ph((ConstraintLayout) viewK22, recyclerView5));
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewK22.getResources().getResourceName(i18)));
            case 45:
                View viewK23 = AbstractC1674hK.k(recyclerView, R.layout.content_tv_show_cast_tv, recyclerView, false);
                HorizontalGridView horizontalGridView4 = (HorizontalGridView) Sr0.g(viewK23, R.id.hgv_tv_show_cast);
                if (horizontalGridView4 == null) {
                    i18 = R.id.hgv_tv_show_cast;
                } else if (((TextView) Sr0.g(viewK23, R.id.tv_tv_show_cast_label)) != null) {
                    return new Jo0(new C2579qh((ConstraintLayout) viewK23, horizontalGridView4));
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewK23.getResources().getResourceName(i18)));
            case 46:
                View viewK24 = AbstractC1674hK.k(recyclerView, R.layout.content_tv_show_recommendations_mobile, recyclerView, false);
                RecyclerView recyclerView6 = (RecyclerView) Sr0.g(viewK24, R.id.rv_tv_show_recommendations);
                if (recyclerView6 == null) {
                    i19 = R.id.rv_tv_show_recommendations;
                } else if (((TextView) Sr0.g(viewK24, R.id.tv_tv_show_recommendations_label)) != null) {
                    return new Jo0(new C2772sh((ConstraintLayout) viewK24, recyclerView6));
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewK24.getResources().getResourceName(i19)));
            case 47:
                View viewK25 = AbstractC1674hK.k(recyclerView, R.layout.content_tv_show_recommendations_tv, recyclerView, false);
                HorizontalGridView horizontalGridView5 = (HorizontalGridView) Sr0.g(viewK25, R.id.hgv_tv_show_recommendations);
                if (horizontalGridView5 == null) {
                    i19 = R.id.hgv_tv_show_recommendations;
                } else if (((TextView) Sr0.g(viewK25, R.id.tv_tv_show_recommendations_label)) != null) {
                    return new Jo0(new C2869th((ConstraintLayout) viewK25, horizontalGridView5));
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewK25.getResources().getResourceName(i19)));
            default:
                throw new C0730Rf();
        }
    }

    @Override // o.O50
    public final void h(AbstractC2144m60 abstractC2144m60) {
        RecyclerView recyclerViewX;
        X50 layoutManager;
        X50 layoutManager2;
        X50 layoutManager3;
        AbstractC1474fG.j(abstractC2144m60, "holder");
        LinkedHashMap linkedHashMap = this.e;
        Integer numValueOf = Integer.valueOf(abstractC2144m60.e());
        Parcelable parcelableT0 = null;
        if (abstractC2144m60 instanceof C1498fc) {
            RecyclerView recyclerViewV = ((C1498fc) abstractC2144m60).v();
            if (recyclerViewV != null && (layoutManager3 = recyclerViewV.getLayoutManager()) != null) {
                parcelableT0 = layoutManager3.t0();
            }
        } else if (abstractC2144m60 instanceof DR) {
            RecyclerView recyclerViewW = ((DR) abstractC2144m60).w();
            if (recyclerViewW != null && (layoutManager2 = recyclerViewW.getLayoutManager()) != null) {
                parcelableT0 = layoutManager2.t0();
            }
        } else if ((abstractC2144m60 instanceof Jo0) && (recyclerViewX = ((Jo0) abstractC2144m60).x()) != null && (layoutManager = recyclerViewX.getLayoutManager()) != null) {
            parcelableT0 = layoutManager.t0();
        }
        linkedHashMap.put(numValueOf, parcelableT0);
    }

    public final void k(RecyclerView recyclerView) {
        RecyclerView recyclerViewX;
        X50 layoutManager;
        X50 layoutManager2;
        X50 layoutManager3;
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            AbstractC2144m60 abstractC2144m60G = recyclerView.G(i);
            if (abstractC2144m60G != null) {
                LinkedHashMap linkedHashMap = this.e;
                Integer numValueOf = Integer.valueOf(i);
                Parcelable parcelableT0 = null;
                if (abstractC2144m60G instanceof C1498fc) {
                    RecyclerView recyclerViewV = ((C1498fc) abstractC2144m60G).v();
                    if (recyclerViewV != null && (layoutManager3 = recyclerViewV.getLayoutManager()) != null) {
                        parcelableT0 = layoutManager3.t0();
                    }
                } else if (abstractC2144m60G instanceof DR) {
                    RecyclerView recyclerViewW = ((DR) abstractC2144m60G).w();
                    if (recyclerViewW != null && (layoutManager2 = recyclerViewW.getLayoutManager()) != null) {
                        parcelableT0 = layoutManager2.t0();
                    }
                } else if ((abstractC2144m60G instanceof Jo0) && (recyclerViewX = ((Jo0) abstractC2144m60G).x()) != null && (layoutManager = recyclerViewX.getLayoutManager()) != null) {
                    parcelableT0 = layoutManager.t0();
                }
                linkedHashMap.put(numValueOf, parcelableT0);
            }
        }
    }

    public final void l(InterfaceC0360Cy interfaceC0360Cy) {
        InterfaceC0360Cy interfaceC0360Cy2 = this.g;
        P50 p50 = this.a;
        List list = this.d;
        if (interfaceC0360Cy2 != null && interfaceC0360Cy == null) {
            this.g = null;
            this.f = false;
            p50.f(list.size(), 1);
        } else if (interfaceC0360Cy2 != null || interfaceC0360Cy == null) {
            this.g = interfaceC0360Cy;
            this.f = false;
        } else {
            this.g = interfaceC0360Cy;
            this.f = false;
            p50.e(list.size(), 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:208:0x0116 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:50:0x0114  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void m(List list) {
        C2720s4 c2720s4;
        C0530Jm c0530Jm;
        List list2;
        ArrayList arrayList;
        ArrayList arrayList2;
        C0582Lm c0582Lm;
        C0607Mm c0607Mm;
        ArrayList arrayList3;
        ArrayList arrayList4;
        C0582Lm c0582Lm2;
        C0504Im c0504Im;
        int i;
        C0607Mm c0607Mm2;
        C0607Mm c0607Mm3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        int i9;
        AbstractC1474fG.j(list, "list");
        C2720s4 c2720s5 = new C2720s4(this, 3, list);
        int iA0 = c2720s5.a0();
        int size = list.size();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        C0582Lm c0582Lm3 = new C0582Lm();
        c0582Lm3.a = 0;
        c0582Lm3.b = iA0;
        c0582Lm3.c = 0;
        c0582Lm3.d = size;
        arrayList6.add(c0582Lm3);
        int i10 = iA0 + size;
        int i11 = 1;
        int i12 = 2;
        int i13 = (((i10 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i13];
        int i14 = i13 / 2;
        int[] iArr2 = new int[i13];
        ArrayList arrayList7 = new ArrayList();
        while (!arrayList6.isEmpty()) {
            C0582Lm c0582Lm4 = (C0582Lm) arrayList6.remove(arrayList6.size() - i11);
            if (c0582Lm4.b() < i11 || c0582Lm4.a() < i11) {
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                c0582Lm = c0582Lm4;
                c0607Mm = null;
                break;
            }
            int iA = ((c0582Lm4.a() + c0582Lm4.b()) + i11) / i12;
            int i15 = i11 + i14;
            iArr[i15] = c0582Lm4.a;
            iArr2[i15] = c0582Lm4.b;
            int i16 = 0;
            while (true) {
                if (i16 >= iA) {
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    c0582Lm = c0582Lm4;
                    c0607Mm = null;
                    break;
                }
                boolean z2 = Math.abs(c0582Lm4.b() - c0582Lm4.a()) % 2 == i11;
                int iB = c0582Lm4.b() - c0582Lm4.a();
                int i17 = -i16;
                int i18 = i17;
                while (true) {
                    if (i18 > i16) {
                        arrayList = arrayList6;
                        i = iA;
                        c0607Mm2 = null;
                        break;
                    }
                    if (i18 != i17) {
                        if (i18 != i16) {
                            i = iA;
                            if (iArr[i18 + 1 + i14] > iArr[(i18 - 1) + i14]) {
                            }
                            i7 = ((i6 - c0582Lm4.a) + c0582Lm4.c) - i18;
                            if (i16 == 0 && i6 == i5) {
                                i8 = i7 - 1;
                            } else {
                                i8 = i7;
                            }
                            arrayList = arrayList6;
                            while (i6 < c0582Lm4.b && i7 < c0582Lm4.d && c2720s5.U(i6, i7)) {
                                i6++;
                                i7++;
                            }
                            iArr[i18 + i14] = i6;
                            if (z2) {
                                i9 = iB - i18;
                                z = z2;
                                if (i9 < i17 + 1 && i9 <= i16 - 1 && iArr2[i9 + i14] <= i6) {
                                    c0607Mm2 = new C0607Mm();
                                    c0607Mm2.a = i5;
                                    c0607Mm2.b = i8;
                                    c0607Mm2.c = i6;
                                    c0607Mm2.d = i7;
                                    c0607Mm2.e = false;
                                    break;
                                }
                            } else {
                                z = z2;
                            }
                            i18 += 2;
                            arrayList6 = arrayList;
                            iA = i;
                            z2 = z;
                        } else {
                            i = iA;
                        }
                        i5 = iArr[(i18 - 1) + i14];
                        i6 = i5 + 1;
                        i7 = ((i6 - c0582Lm4.a) + c0582Lm4.c) - i18;
                        if (i16 == 0) {
                            i8 = i7;
                        } else {
                            i8 = i7;
                        }
                        arrayList = arrayList6;
                        while (i6 < c0582Lm4.b) {
                            i6++;
                            i7++;
                        }
                        iArr[i18 + i14] = i6;
                        if (z2) {
                            i9 = iB - i18;
                            z = z2;
                            if (i9 < i17 + 1) {
                                continue;
                            }
                        } else {
                            z = z2;
                        }
                        i18 += 2;
                        arrayList6 = arrayList;
                        iA = i;
                        z2 = z;
                    } else {
                        i = iA;
                    }
                    i5 = iArr[i18 + 1 + i14];
                    i6 = i5;
                    i7 = ((i6 - c0582Lm4.a) + c0582Lm4.c) - i18;
                    if (i16 == 0) {
                        i8 = i7;
                    } else {
                        i8 = i7;
                    }
                    arrayList = arrayList6;
                    while (i6 < c0582Lm4.b) {
                        i6++;
                        i7++;
                    }
                    iArr[i18 + i14] = i6;
                    if (z2) {
                        i9 = iB - i18;
                        z = z2;
                        if (i9 < i17 + 1) {
                            continue;
                        }
                    } else {
                        z = z2;
                    }
                    i18 += 2;
                    arrayList6 = arrayList;
                    iA = i;
                    z2 = z;
                }
                if (c0607Mm2 != null) {
                    c0607Mm = c0607Mm2;
                    arrayList2 = arrayList7;
                    c0582Lm = c0582Lm4;
                    break;
                }
                boolean z3 = (c0582Lm4.b() - c0582Lm4.a()) % 2 == 0;
                int iB2 = c0582Lm4.b() - c0582Lm4.a();
                int i19 = i17;
                while (true) {
                    if (i19 > i16) {
                        arrayList2 = arrayList7;
                        c0582Lm = c0582Lm4;
                        c0607Mm3 = null;
                        break;
                    }
                    if (i19 == i17 || (i19 != i16 && iArr2[i19 + 1 + i14] < iArr2[(i19 - 1) + i14])) {
                        i2 = iArr2[i19 + 1 + i14];
                        i3 = i2;
                    } else {
                        i2 = iArr2[(i19 - 1) + i14];
                        i3 = i2 - 1;
                    }
                    int i20 = c0582Lm4.d - ((c0582Lm4.b - i3) - i19);
                    int i21 = (i16 == 0 || i3 != i2) ? i20 : i20 + 1;
                    arrayList2 = arrayList7;
                    while (true) {
                        if (i3 <= c0582Lm4.a || i20 <= c0582Lm4.c) {
                            c0582Lm = c0582Lm4;
                            break;
                        }
                        c0582Lm = c0582Lm4;
                        if (!c2720s5.U(i3 - 1, i20 - 1)) {
                            break;
                        }
                        i3--;
                        i20--;
                        c0582Lm4 = c0582Lm;
                    }
                    iArr2[i19 + i14] = i3;
                    if (z3 && (i4 = iB2 - i19) >= i17 && i4 <= i16 && iArr[i4 + i14] >= i3) {
                        c0607Mm3 = new C0607Mm();
                        c0607Mm3.a = i3;
                        c0607Mm3.b = i20;
                        c0607Mm3.c = i2;
                        c0607Mm3.d = i21;
                        c0607Mm3.e = true;
                        break;
                    }
                    i19 += 2;
                    arrayList7 = arrayList2;
                    c0582Lm4 = c0582Lm;
                }
                if (c0607Mm3 != null) {
                    c0607Mm = c0607Mm3;
                    break;
                }
                i16++;
                arrayList7 = arrayList2;
                arrayList6 = arrayList;
                iA = i;
                c0582Lm4 = c0582Lm;
                i11 = 1;
            }
            if (c0607Mm != null) {
                if (c0607Mm.a() > 0) {
                    int i22 = c0607Mm.d;
                    int i23 = c0607Mm.b;
                    int i24 = i22 - i23;
                    int i25 = c0607Mm.c;
                    int i26 = c0607Mm.a;
                    int i27 = i25 - i26;
                    if (i24 == i27) {
                        c0504Im = new C0504Im(i26, i23, i27);
                    } else if (c0607Mm.e) {
                        c0504Im = new C0504Im(i26, i23, c0607Mm.a());
                    } else {
                        c0504Im = i24 > i27 ? new C0504Im(i26, i23 + 1, c0607Mm.a()) : new C0504Im(i26 + 1, i23, c0607Mm.a());
                    }
                    arrayList5.add(c0504Im);
                }
                if (arrayList2.isEmpty()) {
                    c0582Lm2 = new C0582Lm();
                    arrayList3 = arrayList2;
                } else {
                    arrayList3 = arrayList2;
                    c0582Lm2 = (C0582Lm) arrayList3.remove(arrayList2.size() - 1);
                }
                C0582Lm c0582Lm5 = c0582Lm;
                c0582Lm2.a = c0582Lm5.a;
                c0582Lm2.c = c0582Lm5.c;
                c0582Lm2.b = c0607Mm.a;
                c0582Lm2.d = c0607Mm.b;
                arrayList4 = arrayList;
                arrayList4.add(c0582Lm2);
                c0582Lm5.b = c0582Lm5.b;
                c0582Lm5.d = c0582Lm5.d;
                c0582Lm5.a = c0607Mm.c;
                c0582Lm5.c = c0607Mm.d;
                arrayList4.add(c0582Lm5);
            } else {
                arrayList3 = arrayList2;
                arrayList4 = arrayList;
                arrayList3.add(c0582Lm);
            }
            arrayList7 = arrayList3;
            arrayList6 = arrayList4;
            i11 = 1;
            i12 = 2;
        }
        Collections.sort(arrayList5, AbstractC1923jt0.a);
        C0530Jm c0530Jm2 = new C0530Jm(c2720s5, arrayList5, iArr, iArr2);
        List list3 = this.d;
        int size2 = list3.size();
        int size3 = list.size();
        LinkedHashMap linkedHashMap = this.e;
        int[] iArr3 = c0530Jm2.b;
        int i28 = c0530Jm2.e;
        int[] iArr4 = c0530Jm2.c;
        int i29 = c0530Jm2.f;
        if (size2 < size3) {
            int size4 = list.size() - 1;
            if (size4 >= 0) {
                while (true) {
                    int i30 = size4 - 1;
                    if (size4 < 0 || size4 >= i29) {
                        throw new IndexOutOfBoundsException(AbstractC1674hK.m(size4, i29, "Index out of bounds - passed position = ", ", new list size = "));
                    }
                    int i31 = iArr4[size4];
                    int i32 = (i31 & 15) == 0 ? -1 : i31 >> 4;
                    Integer numValueOf = Integer.valueOf(i32);
                    if (i32 == -1) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        linkedHashMap.put(Integer.valueOf(size4), linkedHashMap.get(numValueOf));
                    }
                    if (i30 < 0) {
                        break;
                    } else {
                        size4 = i30;
                    }
                }
            }
        } else if (list3.size() > list.size()) {
            int size5 = list3.size();
            for (int i33 = 0; i33 < size5; i33++) {
                if (i33 < 0 || i33 >= i28) {
                    throw new IndexOutOfBoundsException(AbstractC1674hK.m(i33, i28, "Index out of bounds - passed position = ", ", old list size = "));
                }
                int i34 = iArr3[i33];
                int i35 = (i34 & 15) == 0 ? -1 : i34 >> 4;
                Integer numValueOf2 = Integer.valueOf(i35);
                if (i35 == -1) {
                    numValueOf2 = null;
                }
                if (numValueOf2 != null) {
                    linkedHashMap.put(numValueOf2, linkedHashMap.get(Integer.valueOf(i33)));
                }
            }
        }
        list3.clear();
        list3.addAll(list);
        C2133m1 c2133m1 = new C2133m1(2, this);
        A8 a8 = c2133m1 instanceof A8 ? (A8) c2133m1 : new A8(c2133m1);
        ArrayDeque arrayDeque = new ArrayDeque();
        List list4 = c0530Jm2.a;
        int size6 = list4.size() - 1;
        int i36 = i28;
        while (size6 >= 0) {
            C0504Im c0504Im2 = (C0504Im) list4.get(size6);
            int i37 = c0504Im2.a;
            int i38 = c0504Im2.c;
            int i39 = i37 + i38;
            int i40 = c0504Im2.b;
            int i41 = i40 + i38;
            while (true) {
                c2720s4 = c0530Jm2.d;
                if (i36 <= i39) {
                    break;
                }
                i36--;
                int i42 = iArr3[i36];
                if ((i42 & 12) != 0) {
                    c0530Jm = c0530Jm2;
                    list2 = list4;
                    C0556Km c0556KmA = C0530Jm.a(arrayDeque, i42 >> 4, false);
                    if (c0556KmA != null) {
                        int i43 = (i28 - c0556KmA.b) - 1;
                        a8.i(i36, i43);
                        if ((i42 & 4) != 0) {
                            c2720s4.getClass();
                            a8.H(i43, 1, null);
                        }
                    } else {
                        arrayDeque.add(new C0556Km(i36, (i28 - i36) - 1, true));
                    }
                } else {
                    c0530Jm = c0530Jm2;
                    list2 = list4;
                    a8.h(i36, 1);
                    i28--;
                }
                c0530Jm2 = c0530Jm;
                list4 = list2;
            }
            C0530Jm c0530Jm3 = c0530Jm2;
            List list5 = list4;
            while (i29 > i41) {
                i29--;
                int i44 = iArr4[i29];
                if ((i44 & 12) != 0) {
                    C0556Km c0556KmA2 = C0530Jm.a(arrayDeque, i44 >> 4, true);
                    if (c0556KmA2 == null) {
                        arrayDeque.add(new C0556Km(i29, i28 - i36, false));
                    } else {
                        a8.i((i28 - c0556KmA2.b) - 1, i36);
                        if ((i44 & 4) != 0) {
                            c2720s4.getClass();
                            a8.H(i36, 1, null);
                        }
                    }
                } else {
                    a8.z(i36, 1);
                    i28++;
                }
            }
            i36 = c0504Im2.a;
            int i45 = i36;
            for (int i46 = 0; i46 < i38; i46++) {
                if ((iArr3[i45] & 15) == 2) {
                    c2720s4.getClass();
                    a8.H(i45, 1, null);
                }
                i45++;
            }
            size6--;
            i29 = i40;
            c0530Jm2 = c0530Jm3;
            list4 = list5;
        }
        a8.a();
    }
}
