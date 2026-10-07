package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;
import com.skidush.clonex.fragments.player.settings.PlayerSettingsMobileView;
import com.skidush.clonex.fragments.player.settings.PlayerSettingsTvView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.xn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3269xn extends O50 {
    public final /* synthetic */ int d;
    public List e;
    public final Object f;

    public C3269xn(io.sentry.android.replay.v vVar) {
        this.d = 0;
        this.f = vVar;
        this.e = C1233cq.l;
    }

    /* JADX WARN: Code duplicated, block: B:280:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:281:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:284:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:286:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:287:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:288:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:290:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:293:0x0703  */
    /* JADX WARN: Code duplicated, block: B:295:0x0707  */
    /* JADX WARN: Code duplicated, block: B:297:0x070e  */
    /* JADX WARN: Code duplicated, block: B:300:0x0718  */
    /* JADX WARN: Code duplicated, block: B:302:0x071c  */
    /* JADX WARN: Code duplicated, block: B:305:0x072a  */
    /* JADX WARN: Code duplicated, block: B:362:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:364:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:367:0x07de  */
    /* JADX WARN: Code duplicated, block: B:369:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:381:0x0802  */
    /* JADX WARN: Instruction removed from duplicated block: B:287:0x06ed, please report this as an issue */
    private final void k(AbstractC2144m60 abstractC2144m60, int i) {
        String string;
        String string2;
        String strI;
        CharSequence text;
        int i2;
        T00 t00;
        C2132m00 c2132m00;
        int i3;
        T00 t01;
        Object obj;
        Object next;
        C2132m00 c2132m01;
        int i4 = 7;
        int i5 = 0;
        C1645h00 c1645h00 = (C1645h00) abstractC2144m60;
        InterfaceC1937k00 interfaceC1937k00 = (InterfaceC1937k00) this.e.get(i);
        AbstractC1474fG.j(interfaceC1937k00, "item");
        OG og = c1645h00.v;
        ConstraintLayout constraintLayout = og.l;
        C3295y00 c3295y00 = R00.a;
        if (AbstractC1474fG.b(interfaceC1937k00, c3295y00) ? true : AbstractC1474fG.b(interfaceC1937k00, K00.d)) {
            AbstractC1474fG.g(constraintLayout);
            Context context = constraintLayout.getContext();
            AbstractC1474fG.i(context, "getContext(...)");
            AbstractC0397Ej.w(constraintLayout, null, Integer.valueOf(AbstractC0397Ej.k(context, 6)), 7);
        } else if (AbstractC1474fG.b(interfaceC1937k00, C3101w00.c)) {
            AbstractC1474fG.g(constraintLayout);
            Context context2 = constraintLayout.getContext();
            AbstractC1474fG.i(context2, "getContext(...)");
            AbstractC0397Ej.w(constraintLayout, Integer.valueOf(AbstractC0397Ej.k(context2, 6)), null, 13);
        } else {
            AbstractC1474fG.g(constraintLayout);
            AbstractC0397Ej.w(constraintLayout, 0, 0, 5);
        }
        constraintLayout.setOnClickListener(new ViewOnClickListenerC1010ac(interfaceC1937k00, i4, c1645h00));
        boolean z = interfaceC1937k00 instanceof C2229n00;
        ImageView imageView = og.n;
        if (z) {
            C2229n00 c2229n00 = (C2229n00) interfaceC1937k00;
            if (AbstractC1474fG.b(c2229n00, AbstractC2810t00.a)) {
                imageView.setImageDrawable(AbstractC3354yh.b(imageView.getContext(), R.drawable.ic_settings_quality));
            } else if (AbstractC1474fG.b(c2229n00, C2132m00.e)) {
                imageView.setImageDrawable(AbstractC3354yh.b(imageView.getContext(), R.drawable.ic_settings_audio));
            } else if (AbstractC1474fG.b(c2229n00, T00.a)) {
                imageView.setImageDrawable(AbstractC3354yh.b(imageView.getContext(), C2229n00.d() instanceof S00 ? R.drawable.ic_settings_subtitle_on : R.drawable.ic_settings_subtitle_off));
            } else if (AbstractC1474fG.b(c2229n00, C3004v00.d)) {
                imageView.setImageDrawable(AbstractC3354yh.b(imageView.getContext(), R.drawable.ic_settings_playback_speed));
            } else if (AbstractC1474fG.b(c2229n00, C2907u00.d)) {
                imageView.setImageDrawable(AbstractC3354yh.b(imageView.getContext(), R.drawable.ic_settings_servers));
            } else if (AbstractC1474fG.b(c2229n00, AbstractC2520q00.a)) {
                imageView.setImageDrawable(AbstractC3354yh.b(imageView.getContext(), R.drawable.ic_player_settings_extra_buffer));
            }
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        boolean z2 = interfaceC1937k00 instanceof H00;
        View view = og.r;
        if (z2) {
            view.setBackgroundTintList(ColorStateList.valueOf(((H00) interfaceC1937k00).b));
            view.setVisibility(0);
        } else if (interfaceC1937k00 instanceof B00) {
            view.setBackgroundTintList(ColorStateList.valueOf(((B00) interfaceC1937k00).b));
            view.setVisibility(0);
        } else if (interfaceC1937k00 instanceof O00) {
            view.setBackgroundTintList(ColorStateList.valueOf(((O00) interfaceC1937k00).b));
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
        TextView textView = og.p;
        String strQ0 = "";
        if (z) {
            C2229n00 c2229n01 = (C2229n00) interfaceC1937k00;
            if (AbstractC1474fG.b(c2229n01, AbstractC2810t00.a)) {
                string = textView.getContext().getString(R.string.player_settings_quality_label);
            } else if (AbstractC1474fG.b(c2229n01, C2132m00.e)) {
                string = textView.getContext().getString(R.string.player_settings_audio_label);
            } else if (AbstractC1474fG.b(c2229n01, T00.a)) {
                string = textView.getContext().getString(R.string.player_settings_subtitles_label);
            } else if (AbstractC1474fG.b(c2229n01, C3004v00.d)) {
                string = textView.getContext().getString(R.string.player_settings_speed_label);
            } else if (AbstractC1474fG.b(c2229n01, C2907u00.d)) {
                string = textView.getContext().getString(R.string.player_settings_servers_label);
            } else {
                if (!AbstractC1474fG.b(c2229n01, AbstractC2520q00.a)) {
                    throw new C0730Rf();
                }
                string = textView.getContext().getString(R.string.player_settings_extra_buffer_server_label);
            }
        } else if (interfaceC1937k00 instanceof AbstractC2810t00) {
            AbstractC2810t00 abstractC2810t00 = (AbstractC2810t00) interfaceC1937k00;
            if (abstractC2810t00 instanceof C2616r00) {
                if (abstractC2810t00.a()) {
                    C2713s00 c2713s00B = C2616r00.b();
                    string = c2713s00B == null ? textView.getContext().getString(R.string.player_settings_quality_auto) : textView.getContext().getString(R.string.player_settings_quality_auto_selected, Integer.valueOf(c2713s00B.c));
                } else {
                    string = textView.getContext().getString(R.string.player_settings_quality_auto);
                }
            } else {
                if (!(abstractC2810t00 instanceof C2713s00)) {
                    throw new C0730Rf();
                }
                string = textView.getContext().getString(R.string.player_settings_quality, Integer.valueOf(((C2713s00) interfaceC1937k00).c));
            }
        } else if (interfaceC1937k00 instanceof C2132m00) {
            string = ((C2132m00) interfaceC1937k00).a;
        } else if (interfaceC1937k00 instanceof T00) {
            T00 t02 = (T00) interfaceC1937k00;
            if (AbstractC1474fG.b(t02, c3295y00)) {
                string = textView.getContext().getString(R.string.player_settings_caption_style_label);
            } else if (t02 instanceof C3198x00) {
                string = textView.getContext().getString(R.string.player_settings_subtitles_off);
            } else if (t02 instanceof S00) {
                string = ((S00) interfaceC1937k00).c;
            } else if (AbstractC1474fG.b(t02, C3101w00.c)) {
                string = textView.getContext().getString(R.string.player_settings_local_subtitles_label);
            } else {
                if (!AbstractC1474fG.b(t02, C3392z00.b)) {
                    throw new C0730Rf();
                }
                string = textView.getContext().getString(R.string.player_settings_open_subtitles_label);
            }
        } else if (interfaceC1937k00 instanceof R00) {
            R00 r00 = (R00) interfaceC1937k00;
            if (AbstractC1474fG.b(r00, K00.d)) {
                string = textView.getContext().getString(R.string.player_settings_caption_style_reset_style_label);
            } else if (AbstractC1474fG.b(r00, H00.c)) {
                string = textView.getContext().getString(R.string.player_settings_caption_style_font_color_label);
            } else if (AbstractC1474fG.b(r00, M00.c)) {
                string = textView.getContext().getString(R.string.player_settings_caption_style_text_size_label);
            } else if (AbstractC1474fG.b(r00, J00.c)) {
                string = textView.getContext().getString(R.string.player_settings_caption_style_font_opacity_label);
            } else if (AbstractC1474fG.b(r00, F00.c)) {
                string = textView.getContext().getString(R.string.player_settings_caption_style_edge_style_label);
            } else if (AbstractC1474fG.b(r00, B00.c)) {
                string = textView.getContext().getString(R.string.player_settings_caption_style_background_color_label);
            } else if (AbstractC1474fG.b(r00, D00.c)) {
                string = textView.getContext().getString(R.string.player_settings_caption_style_background_opacity_label);
            } else if (AbstractC1474fG.b(r00, O00.c)) {
                string = textView.getContext().getString(R.string.player_settings_caption_style_window_color_label);
            } else {
                if (!AbstractC1474fG.b(r00, Q00.c)) {
                    throw new C0730Rf();
                }
                string = textView.getContext().getString(R.string.player_settings_caption_style_window_opacity_label);
            }
        } else if (z2) {
            string = textView.getContext().getString(((H00) interfaceC1937k00).a);
        } else if (interfaceC1937k00 instanceof M00) {
            string = textView.getContext().getString(((M00) interfaceC1937k00).a);
        } else if (interfaceC1937k00 instanceof J00) {
            string = textView.getContext().getString(((J00) interfaceC1937k00).a);
        } else if (interfaceC1937k00 instanceof F00) {
            string = textView.getContext().getString(((F00) interfaceC1937k00).a);
        } else if (interfaceC1937k00 instanceof B00) {
            string = textView.getContext().getString(((B00) interfaceC1937k00).a);
        } else if (interfaceC1937k00 instanceof D00) {
            string = textView.getContext().getString(((D00) interfaceC1937k00).a);
        } else if (interfaceC1937k00 instanceof O00) {
            string = textView.getContext().getString(((O00) interfaceC1937k00).a);
        } else if (interfaceC1937k00 instanceof Q00) {
            string = textView.getContext().getString(((Q00) interfaceC1937k00).a);
        } else if (interfaceC1937k00 instanceof C3392z00) {
            string = ((C3392z00) interfaceC1937k00).a.S0();
        } else if (interfaceC1937k00 instanceof C3004v00) {
            string = textView.getContext().getString(((C3004v00) interfaceC1937k00).a);
        } else if (interfaceC1937k00 instanceof AbstractC2520q00) {
            string = textView.getContext().getString(((AbstractC2520q00) interfaceC1937k00).a());
        } else {
            string = interfaceC1937k00 instanceof C2907u00 ? ((C2907u00) interfaceC1937k00).b : "";
        }
        textView.setText(string);
        TextView textView2 = og.q;
        if (z) {
            C2229n00 c2229n02 = (C2229n00) interfaceC1937k00;
            if (AbstractC1474fG.b(c2229n02, AbstractC2810t00.a)) {
                AbstractC2810t00 abstractC2810t00B = C2229n00.b();
                if (abstractC2810t00B instanceof C2616r00) {
                    C2713s00 c2713s00B2 = C2616r00.b();
                    strI = c2713s00B2 == null ? textView2.getContext().getString(R.string.player_settings_quality_auto) : textView2.getContext().getString(R.string.player_settings_quality_auto_selected, Integer.valueOf(c2713s00B2.c));
                } else {
                    if (!(abstractC2810t00B instanceof C2713s00)) {
                        throw new C0730Rf();
                    }
                    strI = textView2.getContext().getString(R.string.player_settings_quality, Integer.valueOf(((C2713s00) abstractC2810t00B).c));
                }
            } else if (AbstractC1474fG.b(c2229n02, C2132m00.e)) {
                Iterator it = C2132m00.f.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        c2132m01 = (C2132m00) next;
                    }
                } while (!c2132m01.c.p[c2132m01.d]);
                C2132m00 c2132m02 = (C2132m00) next;
                strI = c2132m02 != null ? c2132m02.a : null;
            } else if (AbstractC1474fG.b(c2229n02, T00.a)) {
                T00 t00D = C2229n00.d();
                if (t00D instanceof S00) {
                    strI = ((S00) t00D).c;
                } else {
                    strI = textView2.getContext().getString(R.string.player_settings_subtitles_off);
                    AbstractC1474fG.i(strI, "getString(...)");
                }
            } else if (AbstractC1474fG.b(c2229n02, C3004v00.d)) {
                strI = textView2.getContext().getString(C2229n00.c().a);
            } else if (AbstractC1474fG.b(c2229n02, C2907u00.d)) {
                Iterator it2 = C2907u00.e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object next2 = it2.next();
                    if (((C2907u00) next2).c) {
                        obj = next2;
                        break;
                    }
                }
                C2907u00 c2907u00 = (C2907u00) obj;
                if (c2907u00 == null || (strI = c2907u00.b) == null) {
                }
            } else {
                if (!AbstractC1474fG.b(c2229n02, AbstractC2520q00.a)) {
                    throw new C0730Rf();
                }
                Context context3 = textView2.getContext();
                AbstractC1474fG.i(context3, "getContext(...)");
                strI = C2229n00.i(context3);
            }
            textView2.setText(strI);
            text = textView2.getText();
            AbstractC1474fG.i(text, "getText(...)");
            if (text.length() == 0) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            textView2.setVisibility(i2);
            if (interfaceC1937k00 instanceof AbstractC2810t00) {
                if (((AbstractC2810t00) interfaceC1937k00).a()) {
                }
            } else if (interfaceC1937k00 instanceof C2132m00) {
                c2132m00 = (C2132m00) interfaceC1937k00;
                if (c2132m00.c.p[c2132m00.d]) {
                }
            } else if (interfaceC1937k00 instanceof T00) {
                t00 = (T00) interfaceC1937k00;
                if (t00 instanceof C3198x00) {
                    if (t00 instanceof S00) {
                        S00 s00 = (S00) interfaceC1937k00;
                        i3 = s00.f.p[s00.g] ? 0 : 8;
                    }
                } else if (((C3198x00) interfaceC1937k00).a()) {
                }
            } else if (z2 ? !(interfaceC1937k00 instanceof M00) ? !(interfaceC1937k00 instanceof J00) ? !(interfaceC1937k00 instanceof F00) ? !(interfaceC1937k00 instanceof B00) ? !(interfaceC1937k00 instanceof D00) ? !(interfaceC1937k00 instanceof O00) ? !(interfaceC1937k00 instanceof Q00) ? !(interfaceC1937k00 instanceof C3004v00) ? !(interfaceC1937k00 instanceof AbstractC2520q00) ? !(interfaceC1937k00 instanceof C2907u00) || !((C2907u00) interfaceC1937k00).c : !((AbstractC2520q00) interfaceC1937k00).b() : !((C3004v00) interfaceC1937k00).c : !((Q00) interfaceC1937k00).a() : !((O00) interfaceC1937k00).a() : !((D00) interfaceC1937k00).a() : !((B00) interfaceC1937k00).a() : ((F00) interfaceC1937k00).b != AbstractC1459f50.s().d : !((J00) interfaceC1937k00).a() : !((M00) interfaceC1937k00).a() : !((H00) interfaceC1937k00).a()) {
            }
            og.f430o.setVisibility(i3);
            if (!z) {
                if (interfaceC1937k00 instanceof T00) {
                    t01 = (T00) interfaceC1937k00;
                    if (!AbstractC1474fG.b(t01, c3295y00)) {
                        if (!(t01 instanceof C3198x00) || (t01 instanceof S00)) {
                            i5 = 8;
                        } else if (!AbstractC1474fG.b(t01, C3101w00.c) && !AbstractC1474fG.b(t01, C3392z00.b)) {
                            throw new C0730Rf();
                        }
                    }
                } else if ((interfaceC1937k00 instanceof R00) || AbstractC1474fG.b((R00) interfaceC1937k00, K00.d)) {
                    i5 = 8;
                }
            }
            og.m.setVisibility(i5);
        }
        if (interfaceC1937k00 instanceof T00) {
            T00 t03 = (T00) interfaceC1937k00;
            if (AbstractC1474fG.b(t03, c3295y00)) {
                strQ0 = textView2.getContext().getString(R.string.player_settings_caption_style_sub_label);
            } else if ((t03 instanceof S00) && (string2 = ((S00) interfaceC1937k00).d) != null) {
                strQ0 = string2;
            }
        } else if (interfaceC1937k00 instanceof R00) {
            R00 r01 = (R00) interfaceC1937k00;
            if (!AbstractC1474fG.b(r01, K00.d)) {
                G00 g00 = H00.c;
                if (AbstractC1474fG.b(r01, g00)) {
                    Context context4 = textView2.getContext();
                    g00.getClass();
                    string2 = context4.getString(G00.a().a);
                    AbstractC1474fG.i(string2, "getString(...)");
                } else {
                    L00 l00 = M00.c;
                    if (AbstractC1474fG.b(r01, l00)) {
                        Context context5 = textView2.getContext();
                        l00.getClass();
                        string2 = context5.getString(L00.a().a);
                        AbstractC1474fG.i(string2, "getString(...)");
                    } else {
                        I00 i00 = J00.c;
                        if (AbstractC1474fG.b(r01, i00)) {
                            Context context6 = textView2.getContext();
                            i00.getClass();
                            string2 = context6.getString(I00.a().a);
                            AbstractC1474fG.i(string2, "getString(...)");
                        } else {
                            E00 e00 = F00.c;
                            if (AbstractC1474fG.b(r01, e00)) {
                                Context context7 = textView2.getContext();
                                e00.getClass();
                                string2 = context7.getString(E00.a().a);
                                AbstractC1474fG.i(string2, "getString(...)");
                            } else {
                                A00 a00 = B00.c;
                                if (AbstractC1474fG.b(r01, a00)) {
                                    Context context8 = textView2.getContext();
                                    a00.getClass();
                                    string2 = context8.getString(A00.a().a);
                                    AbstractC1474fG.i(string2, "getString(...)");
                                } else {
                                    C00 c00 = D00.c;
                                    if (AbstractC1474fG.b(r01, c00)) {
                                        Context context9 = textView2.getContext();
                                        c00.getClass();
                                        string2 = context9.getString(C00.a().a);
                                        AbstractC1474fG.i(string2, "getString(...)");
                                    } else {
                                        N00 n00 = O00.c;
                                        if (AbstractC1474fG.b(r01, n00)) {
                                            Context context10 = textView2.getContext();
                                            n00.getClass();
                                            string2 = context10.getString(N00.a().a);
                                            AbstractC1474fG.i(string2, "getString(...)");
                                        } else {
                                            P00 p00 = Q00.c;
                                            if (!AbstractC1474fG.b(r01, p00)) {
                                                throw new C0730Rf();
                                            }
                                            Context context11 = textView2.getContext();
                                            p00.getClass();
                                            string2 = context11.getString(P00.a().a);
                                            AbstractC1474fG.i(string2, "getString(...)");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                strQ0 = string2;
            }
        } else if (interfaceC1937k00 instanceof C3392z00) {
            strQ0 = ((C3392z00) interfaceC1937k00).a.q0();
        }
        strI = strQ0;
        textView2.setText(strI);
        text = textView2.getText();
        AbstractC1474fG.i(text, "getText(...)");
        if (text.length() == 0) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        textView2.setVisibility(i2);
        if (interfaceC1937k00 instanceof AbstractC2810t00) {
            if (((AbstractC2810t00) interfaceC1937k00).a()) {
            }
        } else if (interfaceC1937k00 instanceof C2132m00) {
            c2132m00 = (C2132m00) interfaceC1937k00;
            if (c2132m00.c.p[c2132m00.d]) {
            }
        } else if (interfaceC1937k00 instanceof T00) {
            t00 = (T00) interfaceC1937k00;
            if (t00 instanceof C3198x00) {
                if (t00 instanceof S00) {
                    S00 s01 = (S00) interfaceC1937k00;
                    if (s01.f.p[s01.g]) {
                    }
                }
            } else if (((C3198x00) interfaceC1937k00).a()) {
            }
        } else if (z2) {
        }
        og.f430o.setVisibility(i3);
        if (!z) {
            if (interfaceC1937k00 instanceof T00) {
                t01 = (T00) interfaceC1937k00;
                if (!AbstractC1474fG.b(t01, c3295y00)) {
                    if (!(t01 instanceof C3198x00)) {
                        i5 = 8;
                    } else if (!AbstractC1474fG.b(t01, C3101w00.c)) {
                        throw new C0730Rf();
                    }
                }
            } else if (interfaceC1937k00 instanceof R00) {
                i5 = 8;
            } else {
                i5 = 8;
            }
        }
        og.m.setVisibility(i5);
    }

    @Override // o.O50
    public final int a() {
        switch (this.d) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.e.size();
    }

    /* JADX WARN: Code duplicated, block: B:204:0x0501  */
    /* JADX WARN: Code duplicated, block: B:205:0x0505  */
    /* JADX WARN: Code duplicated, block: B:282:0x06db  */
    /* JADX WARN: Code duplicated, block: B:283:0x06de  */
    /* JADX WARN: Code duplicated, block: B:286:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:288:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:289:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:290:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:292:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:295:0x0708  */
    /* JADX WARN: Code duplicated, block: B:297:0x070c  */
    /* JADX WARN: Code duplicated, block: B:299:0x0713  */
    /* JADX WARN: Code duplicated, block: B:302:0x071d  */
    /* JADX WARN: Code duplicated, block: B:304:0x0721  */
    /* JADX WARN: Code duplicated, block: B:307:0x072f  */
    /* JADX WARN: Code duplicated, block: B:363:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:364:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:366:0x07db  */
    /* JADX WARN: Code duplicated, block: B:369:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:371:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:383:0x0808  */
    /* JADX WARN: Instruction removed from duplicated block: B:289:0x06f2, please report this as an issue */
    @Override // o.O50
    public final void e(AbstractC2144m60 abstractC2144m60, int i) {
        String string;
        String string2;
        String strI;
        CharSequence text;
        int i2;
        T00 t00;
        C2132m00 c2132m00;
        int i3;
        int i4;
        T00 t01;
        Object obj;
        Object next;
        C2132m00 c2132m01;
        C2132m00 c2132m02;
        int i5 = 8;
        switch (this.d) {
            case 0:
                C3172wn c3172wn = (C3172wn) abstractC2144m60;
                AbstractC0531Jn abstractC0531Jn = (AbstractC0531Jn) this.e.get(i);
                AbstractC1474fG.j(abstractC0531Jn, "provider");
                ConcurrentHashMap concurrentHashMap = C0323Bn.a;
                AbstractC0531Jn abstractC0531Jn2 = C0323Bn.d;
                c3172wn.u.setText(abstractC0531Jn.b);
                c3172wn.v.setText(abstractC0531Jn.c);
                c3172wn.w.setVisibility(AbstractC1474fG.b(abstractC0531Jn.a, abstractC0531Jn2.a) ? 0 : 8);
                return;
            case 1:
                k(abstractC2144m60, i);
                return;
            default:
                C1839j00 c1839j00 = (C1839j00) abstractC2144m60;
                InterfaceC1937k00 interfaceC1937k00 = (InterfaceC1937k00) this.e.get(i);
                AbstractC1474fG.j(interfaceC1937k00, "item");
                PG pg = c1839j00.v;
                ConstraintLayout constraintLayout = pg.l;
                C3295y00 c3295y00 = R00.a;
                if (AbstractC1474fG.b(interfaceC1937k00, c3295y00) ? true : AbstractC1474fG.b(interfaceC1937k00, K00.d)) {
                    AbstractC1474fG.g(constraintLayout);
                    Context context = constraintLayout.getContext();
                    AbstractC1474fG.i(context, "getContext(...)");
                    AbstractC0397Ej.w(constraintLayout, null, Integer.valueOf(AbstractC0397Ej.k(context, 6)), 7);
                } else if (AbstractC1474fG.b(interfaceC1937k00, C3101w00.c)) {
                    AbstractC1474fG.g(constraintLayout);
                    Context context2 = constraintLayout.getContext();
                    AbstractC1474fG.i(context2, "getContext(...)");
                    AbstractC0397Ej.w(constraintLayout, Integer.valueOf(AbstractC0397Ej.k(context2, 6)), null, 13);
                } else {
                    AbstractC1474fG.g(constraintLayout);
                    AbstractC0397Ej.w(constraintLayout, 0, 0, 5);
                }
                constraintLayout.setOnClickListener(new ViewOnClickListenerC1010ac(interfaceC1937k00, i5, c1839j00));
                boolean z = interfaceC1937k00 instanceof C2229n00;
                ImageView imageView = pg.n;
                if (z) {
                    C2229n00 c2229n00 = (C2229n00) interfaceC1937k00;
                    if (AbstractC1474fG.b(c2229n00, AbstractC2810t00.a)) {
                        imageView.setImageDrawable(AbstractC3354yh.b(imageView.getContext(), R.drawable.ic_settings_quality));
                    } else if (AbstractC1474fG.b(c2229n00, C2132m00.e)) {
                        imageView.setImageDrawable(AbstractC3354yh.b(imageView.getContext(), R.drawable.ic_settings_audio));
                    } else if (AbstractC1474fG.b(c2229n00, T00.a)) {
                        imageView.setImageDrawable(AbstractC3354yh.b(imageView.getContext(), C2229n00.d() instanceof S00 ? R.drawable.ic_settings_subtitle_on : R.drawable.ic_settings_subtitle_off));
                    } else if (AbstractC1474fG.b(c2229n00, C3004v00.d)) {
                        imageView.setImageDrawable(AbstractC3354yh.b(imageView.getContext(), R.drawable.ic_settings_playback_speed));
                    } else if (AbstractC1474fG.b(c2229n00, C2907u00.d)) {
                        imageView.setImageDrawable(AbstractC3354yh.b(imageView.getContext(), R.drawable.ic_settings_servers));
                    } else if (AbstractC1474fG.b(c2229n00, AbstractC2520q00.a)) {
                        imageView.setImageDrawable(AbstractC3354yh.b(imageView.getContext(), R.drawable.ic_player_settings_extra_buffer));
                    }
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                boolean z2 = interfaceC1937k00 instanceof H00;
                View view = pg.r;
                if (z2) {
                    view.setBackgroundTintList(ColorStateList.valueOf(((H00) interfaceC1937k00).b));
                    view.setVisibility(0);
                } else if (interfaceC1937k00 instanceof B00) {
                    view.setBackgroundTintList(ColorStateList.valueOf(((B00) interfaceC1937k00).b));
                    view.setVisibility(0);
                } else if (interfaceC1937k00 instanceof O00) {
                    view.setBackgroundTintList(ColorStateList.valueOf(((O00) interfaceC1937k00).b));
                    view.setVisibility(0);
                } else {
                    view.setVisibility(8);
                }
                TextView textView = pg.p;
                String strQ0 = "";
                if (z) {
                    C2229n00 c2229n01 = (C2229n00) interfaceC1937k00;
                    if (AbstractC1474fG.b(c2229n01, AbstractC2810t00.a)) {
                        string = textView.getContext().getString(R.string.player_settings_quality_label);
                    } else if (AbstractC1474fG.b(c2229n01, C2132m00.e)) {
                        string = textView.getContext().getString(R.string.player_settings_audio_label);
                    } else if (AbstractC1474fG.b(c2229n01, T00.a)) {
                        string = textView.getContext().getString(R.string.player_settings_subtitles_label);
                    } else if (AbstractC1474fG.b(c2229n01, C3004v00.d)) {
                        string = textView.getContext().getString(R.string.player_settings_speed_label);
                    } else if (AbstractC1474fG.b(c2229n01, C2907u00.d)) {
                        string = textView.getContext().getString(R.string.player_settings_servers_label);
                    } else {
                        if (!AbstractC1474fG.b(c2229n01, AbstractC2520q00.a)) {
                            throw new C0730Rf();
                        }
                        string = textView.getContext().getString(R.string.player_settings_extra_buffer_server_label);
                    }
                } else if (interfaceC1937k00 instanceof C2132m00) {
                    string = ((C2132m00) interfaceC1937k00).a;
                } else if (interfaceC1937k00 instanceof AbstractC2810t00) {
                    AbstractC2810t00 abstractC2810t00 = (AbstractC2810t00) interfaceC1937k00;
                    if (abstractC2810t00 instanceof C2616r00) {
                        if (abstractC2810t00.a()) {
                            C2713s00 c2713s00B = C2616r00.b();
                            string = c2713s00B == null ? textView.getContext().getString(R.string.player_settings_quality_auto) : textView.getContext().getString(R.string.player_settings_quality_auto_selected, Integer.valueOf(c2713s00B.c));
                        } else {
                            string = textView.getContext().getString(R.string.player_settings_quality_auto);
                        }
                    } else {
                        if (!(abstractC2810t00 instanceof C2713s00)) {
                            throw new C0730Rf();
                        }
                        string = textView.getContext().getString(R.string.player_settings_quality, Integer.valueOf(((C2713s00) interfaceC1937k00).c));
                    }
                } else if (interfaceC1937k00 instanceof T00) {
                    T00 t02 = (T00) interfaceC1937k00;
                    if (AbstractC1474fG.b(t02, c3295y00)) {
                        string = textView.getContext().getString(R.string.player_settings_caption_style_label);
                    } else if (t02 instanceof C3198x00) {
                        string = textView.getContext().getString(R.string.player_settings_subtitles_off);
                    } else if (t02 instanceof S00) {
                        string = ((S00) interfaceC1937k00).c;
                    } else if (AbstractC1474fG.b(t02, C3101w00.c)) {
                        string = textView.getContext().getString(R.string.player_settings_local_subtitles_label);
                    } else {
                        if (!AbstractC1474fG.b(t02, C3392z00.b)) {
                            throw new C0730Rf();
                        }
                        string = textView.getContext().getString(R.string.player_settings_open_subtitles_label);
                    }
                } else if (interfaceC1937k00 instanceof R00) {
                    R00 r00 = (R00) interfaceC1937k00;
                    if (AbstractC1474fG.b(r00, K00.d)) {
                        string = textView.getContext().getString(R.string.player_settings_caption_style_reset_style_label);
                    } else if (AbstractC1474fG.b(r00, H00.c)) {
                        string = textView.getContext().getString(R.string.player_settings_caption_style_font_color_label);
                    } else if (AbstractC1474fG.b(r00, M00.c)) {
                        string = textView.getContext().getString(R.string.player_settings_caption_style_text_size_label);
                    } else if (AbstractC1474fG.b(r00, J00.c)) {
                        string = textView.getContext().getString(R.string.player_settings_caption_style_font_opacity_label);
                    } else if (AbstractC1474fG.b(r00, F00.c)) {
                        string = textView.getContext().getString(R.string.player_settings_caption_style_edge_style_label);
                    } else if (AbstractC1474fG.b(r00, B00.c)) {
                        string = textView.getContext().getString(R.string.player_settings_caption_style_background_color_label);
                    } else if (AbstractC1474fG.b(r00, D00.c)) {
                        string = textView.getContext().getString(R.string.player_settings_caption_style_background_opacity_label);
                    } else if (AbstractC1474fG.b(r00, O00.c)) {
                        string = textView.getContext().getString(R.string.player_settings_caption_style_window_color_label);
                    } else {
                        if (!AbstractC1474fG.b(r00, Q00.c)) {
                            throw new C0730Rf();
                        }
                        string = textView.getContext().getString(R.string.player_settings_caption_style_window_opacity_label);
                    }
                } else if (z2) {
                    string = textView.getContext().getString(((H00) interfaceC1937k00).a);
                } else if (interfaceC1937k00 instanceof M00) {
                    string = textView.getContext().getString(((M00) interfaceC1937k00).a);
                } else if (interfaceC1937k00 instanceof J00) {
                    string = textView.getContext().getString(((J00) interfaceC1937k00).a);
                } else if (interfaceC1937k00 instanceof F00) {
                    string = textView.getContext().getString(((F00) interfaceC1937k00).a);
                } else if (interfaceC1937k00 instanceof B00) {
                    string = textView.getContext().getString(((B00) interfaceC1937k00).a);
                } else if (interfaceC1937k00 instanceof D00) {
                    string = textView.getContext().getString(((D00) interfaceC1937k00).a);
                } else if (interfaceC1937k00 instanceof O00) {
                    string = textView.getContext().getString(((O00) interfaceC1937k00).a);
                } else if (interfaceC1937k00 instanceof Q00) {
                    string = textView.getContext().getString(((Q00) interfaceC1937k00).a);
                } else if (interfaceC1937k00 instanceof C3392z00) {
                    string = ((C3392z00) interfaceC1937k00).a.S0();
                } else if (interfaceC1937k00 instanceof C3004v00) {
                    string = textView.getContext().getString(((C3004v00) interfaceC1937k00).a);
                } else if (interfaceC1937k00 instanceof AbstractC2520q00) {
                    string = textView.getContext().getString(((AbstractC2520q00) interfaceC1937k00).a());
                } else {
                    string = interfaceC1937k00 instanceof C2907u00 ? ((C2907u00) interfaceC1937k00).b : "";
                }
                textView.setText(string);
                TextView textView2 = pg.q;
                if (z) {
                    C2229n00 c2229n02 = (C2229n00) interfaceC1937k00;
                    if (AbstractC1474fG.b(c2229n02, AbstractC2810t00.a)) {
                        AbstractC2810t00 abstractC2810t00B = C2229n00.b();
                        if (abstractC2810t00B instanceof C2616r00) {
                            C2713s00 c2713s00B2 = C2616r00.b();
                            strI = c2713s00B2 == null ? textView2.getContext().getString(R.string.player_settings_quality_auto) : textView2.getContext().getString(R.string.player_settings_quality_auto_selected, Integer.valueOf(c2713s00B2.c));
                        } else {
                            if (!(abstractC2810t00B instanceof C2713s00)) {
                                throw new C0730Rf();
                            }
                            strI = textView2.getContext().getString(R.string.player_settings_quality, Integer.valueOf(((C2713s00) abstractC2810t00B).c));
                        }
                    } else if (AbstractC1474fG.b(c2229n02, C2132m00.e)) {
                        Iterator it = C2132m00.f.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                                c2132m02 = (C2132m00) next;
                            } else {
                                next = null;
                            }
                            c2132m01 = (C2132m00) next;
                            if (c2132m01 != null) {
                                strI = c2132m01.a;
                            } else {
                                strI = null;
                            }
                        } while (!c2132m02.c.p[c2132m02.d]);
                        c2132m01 = (C2132m00) next;
                        if (c2132m01 != null) {
                            strI = c2132m01.a;
                        } else {
                            strI = null;
                        }
                    } else if (AbstractC1474fG.b(c2229n02, T00.a)) {
                        T00 t00D = C2229n00.d();
                        if (t00D instanceof S00) {
                            strI = ((S00) t00D).c;
                        } else {
                            strI = textView2.getContext().getString(R.string.player_settings_subtitles_off);
                            AbstractC1474fG.i(strI, "getString(...)");
                        }
                    } else if (AbstractC1474fG.b(c2229n02, C3004v00.d)) {
                        strI = textView2.getContext().getString(C2229n00.c().a);
                    } else if (AbstractC1474fG.b(c2229n02, C2907u00.d)) {
                        Iterator it2 = C2907u00.e.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next2 = it2.next();
                                if (((C2907u00) next2).c) {
                                    obj = next2;
                                }
                            } else {
                                obj = null;
                            }
                        }
                        C2907u00 c2907u00 = (C2907u00) obj;
                        if (c2907u00 == null || (strI = c2907u00.b) == null) {
                        }
                    } else {
                        if (!AbstractC1474fG.b(c2229n02, AbstractC2520q00.a)) {
                            throw new C0730Rf();
                        }
                        Context context3 = textView2.getContext();
                        AbstractC1474fG.i(context3, "getContext(...)");
                        strI = C2229n00.i(context3);
                    }
                    textView2.setText(strI);
                    text = textView2.getText();
                    AbstractC1474fG.i(text, "getText(...)");
                    if (text.length() == 0) {
                        i2 = 8;
                    } else {
                        i2 = 0;
                    }
                    textView2.setVisibility(i2);
                    if (interfaceC1937k00 instanceof AbstractC2810t00) {
                        if (((AbstractC2810t00) interfaceC1937k00).a()) {
                        }
                    } else if (interfaceC1937k00 instanceof C2132m00) {
                        c2132m00 = (C2132m00) interfaceC1937k00;
                        if (c2132m00.c.p[c2132m00.d]) {
                        }
                    } else if (interfaceC1937k00 instanceof T00) {
                        t00 = (T00) interfaceC1937k00;
                        if (t00 instanceof C3198x00) {
                            if (t00 instanceof S00) {
                                S00 s00 = (S00) interfaceC1937k00;
                                i3 = s00.f.p[s00.g] ? 0 : 8;
                            }
                        } else if (((C3198x00) interfaceC1937k00).a()) {
                        }
                    } else if (z2 ? !(interfaceC1937k00 instanceof M00) ? !(interfaceC1937k00 instanceof J00) ? !(interfaceC1937k00 instanceof F00) ? !(interfaceC1937k00 instanceof B00) ? !(interfaceC1937k00 instanceof D00) ? !(interfaceC1937k00 instanceof O00) ? !(interfaceC1937k00 instanceof Q00) ? !(interfaceC1937k00 instanceof C3004v00) ? !(interfaceC1937k00 instanceof AbstractC2520q00) ? !(interfaceC1937k00 instanceof C2907u00) || !((C2907u00) interfaceC1937k00).c : !((AbstractC2520q00) interfaceC1937k00).b() : !((C3004v00) interfaceC1937k00).c : !((Q00) interfaceC1937k00).a() : !((O00) interfaceC1937k00).a() : !((D00) interfaceC1937k00).a() : !((B00) interfaceC1937k00).a() : ((F00) interfaceC1937k00).b != AbstractC1459f50.s().d : !((J00) interfaceC1937k00).a() : !((M00) interfaceC1937k00).a() : !((H00) interfaceC1937k00).a()) {
                    }
                    pg.f453o.setVisibility(i3);
                    if (!z) {
                        i4 = 0;
                    } else if (interfaceC1937k00 instanceof T00) {
                        t01 = (T00) interfaceC1937k00;
                        if (!AbstractC1474fG.b(t01, c3295y00)) {
                            if ((t01 instanceof C3198x00) || (t01 instanceof S00)) {
                                i4 = 8;
                            } else if (!AbstractC1474fG.b(t01, C3101w00.c) && !AbstractC1474fG.b(t01, C3392z00.b)) {
                                throw new C0730Rf();
                            }
                        }
                        i4 = 0;
                    } else if ((interfaceC1937k00 instanceof R00) || AbstractC1474fG.b((R00) interfaceC1937k00, K00.d)) {
                        i4 = 8;
                    } else {
                        i4 = 0;
                    }
                    pg.m.setVisibility(i4);
                    return;
                }
                if (interfaceC1937k00 instanceof T00) {
                    T00 t03 = (T00) interfaceC1937k00;
                    if (AbstractC1474fG.b(t03, c3295y00)) {
                        strQ0 = textView2.getContext().getString(R.string.player_settings_caption_style_sub_label);
                    } else if ((t03 instanceof S00) && (string2 = ((S00) interfaceC1937k00).d) != null) {
                        strQ0 = string2;
                    }
                } else if (interfaceC1937k00 instanceof R00) {
                    R00 r01 = (R00) interfaceC1937k00;
                    if (!AbstractC1474fG.b(r01, K00.d)) {
                        G00 g00 = H00.c;
                        if (AbstractC1474fG.b(r01, g00)) {
                            Context context4 = textView2.getContext();
                            g00.getClass();
                            string2 = context4.getString(G00.a().a);
                            AbstractC1474fG.i(string2, "getString(...)");
                        } else {
                            L00 l00 = M00.c;
                            if (AbstractC1474fG.b(r01, l00)) {
                                Context context5 = textView2.getContext();
                                l00.getClass();
                                string2 = context5.getString(L00.a().a);
                                AbstractC1474fG.i(string2, "getString(...)");
                            } else {
                                I00 i00 = J00.c;
                                if (AbstractC1474fG.b(r01, i00)) {
                                    Context context6 = textView2.getContext();
                                    i00.getClass();
                                    string2 = context6.getString(I00.a().a);
                                    AbstractC1474fG.i(string2, "getString(...)");
                                } else {
                                    E00 e00 = F00.c;
                                    if (AbstractC1474fG.b(r01, e00)) {
                                        Context context7 = textView2.getContext();
                                        e00.getClass();
                                        string2 = context7.getString(E00.a().a);
                                        AbstractC1474fG.i(string2, "getString(...)");
                                    } else {
                                        A00 a00 = B00.c;
                                        if (AbstractC1474fG.b(r01, a00)) {
                                            Context context8 = textView2.getContext();
                                            a00.getClass();
                                            string2 = context8.getString(A00.a().a);
                                            AbstractC1474fG.i(string2, "getString(...)");
                                        } else {
                                            C00 c00 = D00.c;
                                            if (AbstractC1474fG.b(r01, c00)) {
                                                Context context9 = textView2.getContext();
                                                c00.getClass();
                                                string2 = context9.getString(C00.a().a);
                                                AbstractC1474fG.i(string2, "getString(...)");
                                            } else {
                                                N00 n00 = O00.c;
                                                if (AbstractC1474fG.b(r01, n00)) {
                                                    Context context10 = textView2.getContext();
                                                    n00.getClass();
                                                    string2 = context10.getString(N00.a().a);
                                                    AbstractC1474fG.i(string2, "getString(...)");
                                                } else {
                                                    P00 p00 = Q00.c;
                                                    if (!AbstractC1474fG.b(r01, p00)) {
                                                        throw new C0730Rf();
                                                    }
                                                    Context context11 = textView2.getContext();
                                                    p00.getClass();
                                                    string2 = context11.getString(P00.a().a);
                                                    AbstractC1474fG.i(string2, "getString(...)");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        strQ0 = string2;
                    }
                } else if (interfaceC1937k00 instanceof C3392z00) {
                    strQ0 = ((C3392z00) interfaceC1937k00).a.q0();
                }
                strI = strQ0;
                textView2.setText(strI);
                text = textView2.getText();
                AbstractC1474fG.i(text, "getText(...)");
                if (text.length() == 0) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                textView2.setVisibility(i2);
                if (interfaceC1937k00 instanceof AbstractC2810t00) {
                    if (((AbstractC2810t00) interfaceC1937k00).a()) {
                    }
                } else if (interfaceC1937k00 instanceof C2132m00) {
                    c2132m00 = (C2132m00) interfaceC1937k00;
                    if (c2132m00.c.p[c2132m00.d]) {
                    }
                } else if (interfaceC1937k00 instanceof T00) {
                    t00 = (T00) interfaceC1937k00;
                    if (t00 instanceof C3198x00) {
                        if (t00 instanceof S00) {
                            S00 s01 = (S00) interfaceC1937k00;
                            if (s01.f.p[s01.g]) {
                            }
                        }
                    } else if (((C3198x00) interfaceC1937k00).a()) {
                    }
                } else if (z2) {
                }
                pg.f453o.setVisibility(i3);
                if (!z) {
                    i4 = 0;
                } else if (interfaceC1937k00 instanceof T00) {
                    t01 = (T00) interfaceC1937k00;
                    if (!AbstractC1474fG.b(t01, c3295y00)) {
                        if (t01 instanceof C3198x00) {
                            if (!AbstractC1474fG.b(t01, C3101w00.c)) {
                                throw new C0730Rf();
                            }
                        }
                        i4 = 8;
                    }
                    i4 = 0;
                } else {
                    if (interfaceC1937k00 instanceof R00) {
                    }
                    i4 = 8;
                }
                pg.m.setVisibility(i4);
                return;
        }
    }

    @Override // o.O50
    public final AbstractC2144m60 f(int i, RecyclerView recyclerView) {
        switch (this.d) {
            case 0:
                AbstractC1474fG.j(recyclerView, "parent");
                View viewInflate = LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.item_dns_provider_tv, (ViewGroup) recyclerView, false);
                AbstractC1474fG.g(viewInflate);
                return new C3172wn(this, viewInflate);
            case 1:
                AbstractC1474fG.j(recyclerView, "parent");
                return new C1645h00((PlayerSettingsMobileView) this.f, OG.a(LayoutInflater.from(recyclerView.getContext()), recyclerView, false));
            default:
                AbstractC1474fG.j(recyclerView, "parent");
                return new C1839j00((PlayerSettingsTvView) this.f, PG.a(LayoutInflater.from(recyclerView.getContext()), recyclerView, false));
        }
    }

    public C3269xn(PlayerSettingsMobileView playerSettingsMobileView, List list) {
        this.d = 1;
        AbstractC1474fG.j(playerSettingsMobileView, "settingsView");
        AbstractC1474fG.j(list, "items");
        this.f = playerSettingsMobileView;
        this.e = list;
    }

    public C3269xn(PlayerSettingsTvView playerSettingsTvView, List list) {
        this.d = 2;
        AbstractC1474fG.j(playerSettingsTvView, "settingsView");
        AbstractC1474fG.j(list, "items");
        this.f = playerSettingsTvView;
        this.e = list;
    }
}
