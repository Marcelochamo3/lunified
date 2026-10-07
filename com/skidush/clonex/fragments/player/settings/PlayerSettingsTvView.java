package com.skidush.clonex.fragments.player.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC0397Ej;
import o.AbstractC0937Ze;
import o.AbstractC1474fG;
import o.AbstractC2520q00;
import o.AbstractC2810t00;
import o.B00;
import o.C0730Rf;
import o.C2132m00;
import o.C2229n00;
import o.C2285nf0;
import o.C2412ou0;
import o.C2907u00;
import o.C3004v00;
import o.C3269xn;
import o.C3392z00;
import o.D00;
import o.EnumC2035l00;
import o.F00;
import o.H00;
import o.J00;
import o.M00;
import o.O00;
import o.O50;
import o.Q00;
import o.R00;
import o.Sr0;
import o.T00;
import o.V00;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerSettingsTvView extends V00 {
    public static final /* synthetic */ int u0 = 0;
    public final C2412ou0 d0;
    public final C3269xn e0;
    public final C3269xn f0;
    public final C3269xn g0;
    public final C3269xn h0;
    public final C3269xn i0;
    public final C3269xn j0;
    public final C3269xn k0;
    public final C3269xn l0;
    public final C3269xn m0;
    public final C3269xn n0;
    public final C3269xn o0;
    public final C3269xn p0;
    public final C3269xn q0;
    public final C3269xn r0;
    public final C3269xn s0;
    public final C3269xn t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerSettingsTvView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC1474fG.j(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_player_settings_tv, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.rv_settings;
        RecyclerView recyclerView = (RecyclerView) Sr0.g(viewInflate, R.id.rv_settings);
        if (recyclerView != null) {
            i = R.id.tv_settings_header;
            TextView textView = (TextView) Sr0.g(viewInflate, R.id.tv_settings_header);
            if (textView != null) {
                this.d0 = new C2412ou0((ConstraintLayout) viewInflate, recyclerView, textView);
                this.e0 = new C3269xn(this, AbstractC2810t00.b);
                this.f0 = new C3269xn(this, C2132m00.f);
                this.g0 = new C3269xn(this, T00.b);
                R00.a.getClass();
                this.h0 = new C3269xn(this, R00.c);
                H00.c.getClass();
                this.i0 = new C3269xn(this, H00.e);
                M00.c.getClass();
                this.j0 = new C3269xn(this, M00.e);
                J00.c.getClass();
                this.k0 = new C3269xn(this, J00.e);
                F00.c.getClass();
                this.l0 = new C3269xn(this, F00.e);
                B00.c.getClass();
                this.m0 = new C3269xn(this, B00.e);
                D00.c.getClass();
                this.n0 = new C3269xn(this, D00.e);
                O00.c.getClass();
                this.o0 = new C3269xn(this, O00.e);
                Q00.c.getClass();
                this.p0 = new C3269xn(this, Q00.e);
                C3392z00.b.getClass();
                this.q0 = new C3269xn(this, C3392z00.c);
                this.r0 = new C3269xn(this, C3004v00.f);
                this.s0 = new C3269xn(this, C2907u00.e);
                this.t0 = new C3269xn(this, AbstractC2520q00.h);
                recyclerView.g(new C2285nf0(AbstractC0397Ej.k(context, 6)));
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        AbstractC1474fG.j(view, "focused");
        if (this.d0.m.hasFocus()) {
            return view;
        }
        View viewFocusSearch = super.focusSearch(view, i);
        AbstractC1474fG.i(viewFocusSearch, "focusSearch(...)");
        return viewFocusSearch;
    }

    public final C2412ou0 getBinding() {
        return this.d0;
    }

    @Override // o.V00
    public final void m() {
        O50 adapter;
        if (getCurrentSettings() != EnumC2035l00.l) {
            return;
        }
        List listK = AbstractC0937Ze.K(AbstractC2810t00.a, C2132m00.e, T00.a, C3004v00.d, C2907u00.d, AbstractC2520q00.a);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK) {
            if (((C2229n00) obj) != AbstractC2520q00.a || AbstractC2520q00.d) {
                arrayList.add(obj);
            }
        }
        int iIndexOf = arrayList.indexOf(AbstractC2520q00.a);
        if (iIndexOf < 0 || (adapter = this.d0.m.getAdapter()) == null) {
            return;
        }
        adapter.d(iIndexOf);
    }

    public final void o(EnumC2035l00 enumC2035l00) {
        String string;
        C3269xn c3269xn;
        setCurrentSettings(enumC2035l00);
        C2412ou0 c2412ou0 = this.d0;
        TextView textView = c2412ou0.n;
        switch (enumC2035l00.ordinal()) {
            case 0:
                string = textView.getContext().getString(R.string.player_settings_title);
                break;
            case 1:
                string = textView.getContext().getString(R.string.player_settings_quality_title);
                break;
            case 2:
                string = textView.getContext().getString(R.string.player_settings_audio_title);
                break;
            case 3:
                string = textView.getContext().getString(R.string.player_settings_subtitles_title);
                break;
            case 4:
                string = textView.getContext().getString(R.string.player_settings_caption_style_title);
                break;
            case 5:
                string = textView.getContext().getString(R.string.player_settings_caption_style_font_color_title);
                break;
            case 6:
                string = textView.getContext().getString(R.string.player_settings_caption_style_text_size_title);
                break;
            case 7:
                string = textView.getContext().getString(R.string.player_settings_caption_style_font_opacity_title);
                break;
            case 8:
                string = textView.getContext().getString(R.string.player_settings_caption_style_edge_style_title);
                break;
            case 9:
                string = textView.getContext().getString(R.string.player_settings_caption_style_background_color_title);
                break;
            case 10:
                string = textView.getContext().getString(R.string.player_settings_caption_style_background_opacity_title);
                break;
            case 11:
                string = textView.getContext().getString(R.string.player_settings_caption_style_window_color_title);
                break;
            case 12:
                string = textView.getContext().getString(R.string.player_settings_caption_style_window_opacity_title);
                break;
            case 13:
                string = textView.getContext().getString(R.string.player_settings_open_subtitles_title);
                break;
            case 14:
                string = textView.getContext().getString(R.string.player_settings_speed_title);
                break;
            case 15:
                string = textView.getContext().getString(R.string.player_settings_extra_buffer_title);
                break;
            case 16:
                string = textView.getContext().getString(R.string.player_settings_servers_title);
                break;
            default:
                throw new C0730Rf();
        }
        textView.setText(string);
        switch (enumC2035l00.ordinal()) {
            case 0:
                List listK = AbstractC0937Ze.K(AbstractC2810t00.a, C2132m00.e, T00.a, C3004v00.d, C2907u00.d, AbstractC2520q00.a);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listK) {
                    if (((C2229n00) obj) != AbstractC2520q00.a || AbstractC2520q00.d) {
                        arrayList.add(obj);
                    }
                }
                c3269xn = new C3269xn(this, arrayList);
                break;
            case 1:
                c3269xn = this.e0;
                break;
            case 2:
                c3269xn = this.f0;
                break;
            case 3:
                c3269xn = this.g0;
                break;
            case 4:
                c3269xn = this.h0;
                break;
            case 5:
                c3269xn = this.i0;
                break;
            case 6:
                c3269xn = this.j0;
                break;
            case 7:
                c3269xn = this.k0;
                break;
            case 8:
                c3269xn = this.l0;
                break;
            case 9:
                c3269xn = this.m0;
                break;
            case 10:
                c3269xn = this.n0;
                break;
            case 11:
                c3269xn = this.o0;
                break;
            case 12:
                c3269xn = this.p0;
                break;
            case 13:
                c3269xn = this.q0;
                break;
            case 14:
                c3269xn = this.r0;
                break;
            case 15:
                c3269xn = this.t0;
                break;
            case 16:
                c3269xn = this.s0;
                break;
            default:
                throw new C0730Rf();
        }
        RecyclerView recyclerView = c2412ou0.m;
        recyclerView.setAdapter(c3269xn);
        recyclerView.requestFocus();
    }

    public final void p() {
        removeCallbacks(this.D);
        setVisibility(8);
    }
}
