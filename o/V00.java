package o;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class V00 extends ConstraintLayout {
    public final RunnableC3102w1 D;
    public InterfaceC0664Or E;
    public SubtitleView F;
    public List G;
    public EnumC2035l00 H;
    public InterfaceC0412Ey I;
    public InterfaceC0412Ey J;
    public InterfaceC0412Ey K;
    public InterfaceC0412Ey L;
    public InterfaceC0412Ey M;
    public InterfaceC0412Ey N;
    public InterfaceC0412Ey O;
    public InterfaceC0412Ey P;
    public InterfaceC0412Ey Q;
    public InterfaceC0412Ey R;
    public InterfaceC0412Ey S;
    public InterfaceC0412Ey T;
    public InterfaceC0360Cy U;
    public InterfaceC0412Ey V;
    public InterfaceC0412Ey W;
    public InterfaceC0412Ey a0;
    public InterfaceC0412Ey b0;
    public InterfaceC0412Ey c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V00(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1474fG.j(context, "context");
        this.D = new RunnableC3102w1(16, this);
        this.G = C1233cq.l;
        this.H = EnumC2035l00.l;
        this.I = new U00(this, 8);
        this.J = new U00(this, 0);
        this.K = new U00(this, 10);
        this.L = new U00(this, 3);
        this.M = new U00(this, 6);
        this.N = new U00(this, 11);
        this.O = new U00(this, 7);
        this.P = new U00(this, 4);
        this.Q = new U00(this, 1);
        this.R = new U00(this, 2);
        this.S = new U00(this, 12);
        this.T = new U00(this, 13);
        this.W = new U00(this, 9);
        this.b0 = new U00(this, 5);
    }

    public final EnumC2035l00 getCurrentSettings() {
        return this.H;
    }

    public final InterfaceC0412Ey getOnAudioSelected() {
        return this.J;
    }

    public final InterfaceC0412Ey getOnBackgroundColorSelected() {
        return this.Q;
    }

    public final InterfaceC0412Ey getOnBackgroundOpacitySelected() {
        return this.R;
    }

    public final InterfaceC0412Ey getOnCaptionStyleChanged() {
        return this.L;
    }

    public final InterfaceC0412Ey getOnEdgeStyleSelected() {
        return this.P;
    }

    public final InterfaceC0412Ey getOnExtraBufferingListener() {
        return this.a0;
    }

    public final InterfaceC0412Ey getOnExtraBufferingSelected() {
        return this.b0;
    }

    public final InterfaceC0412Ey getOnFontColorSelected() {
        return this.M;
    }

    public final InterfaceC0412Ey getOnFontOpacitySelected() {
        return this.O;
    }

    public final InterfaceC0360Cy getOnLocalSubtitlesClicked() {
        return this.U;
    }

    public final InterfaceC0412Ey getOnOpenSubtitleSelected() {
        return this.V;
    }

    public final InterfaceC0412Ey getOnQualitySelected() {
        return this.I;
    }

    public final InterfaceC0412Ey getOnServerSelected() {
        return this.c0;
    }

    public final InterfaceC0412Ey getOnSpeedSelected() {
        return this.W;
    }

    public final InterfaceC0412Ey getOnSubtitleSelected() {
        return this.K;
    }

    public final InterfaceC0412Ey getOnTextSizeSelected() {
        return this.N;
    }

    public final InterfaceC0412Ey getOnWindowColorSelected() {
        return this.S;
    }

    public final InterfaceC0412Ey getOnWindowOpacitySelected() {
        return this.T;
    }

    public final List<C3336yW> getOpenSubtitles() {
        return this.G;
    }

    public final InterfaceC0664Or getPlayer() {
        return this.E;
    }

    public final SubtitleView getSubtitleView() {
        return this.F;
    }

    public abstract void m();

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    public final void n() {
        Long lValueOf;
        InterfaceC0664Or interfaceC0664Or = this.E;
        if (interfaceC0664Or != null) {
            C1042as c1042as = (C1042as) interfaceC0664Or;
            long jC = c1042as.C();
            long jV = c1042as.v();
            if (jC < 0 || jV < jC) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(jV - jC);
            }
        } else {
            lValueOf = null;
        }
        C2229n00 c2229n00 = AbstractC2520q00.a;
        AbstractC2520q00.g = lValueOf != null ? Long.valueOf(U9.f(lValueOf.longValue(), 0L)) : null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.D);
        super.onDetachedFromWindow();
    }

    public final void setCurrentSettings(EnumC2035l00 enumC2035l00) {
        AbstractC1474fG.j(enumC2035l00, "<set-?>");
        this.H = enumC2035l00;
    }

    public final void setOnAudioSelected(InterfaceC0412Ey interfaceC0412Ey) {
        AbstractC1474fG.j(interfaceC0412Ey, "<set-?>");
        this.J = interfaceC0412Ey;
    }

    public final void setOnBackgroundColorSelected(InterfaceC0412Ey interfaceC0412Ey) {
        AbstractC1474fG.j(interfaceC0412Ey, "<set-?>");
        this.Q = interfaceC0412Ey;
    }

    public final void setOnBackgroundOpacitySelected(InterfaceC0412Ey interfaceC0412Ey) {
        AbstractC1474fG.j(interfaceC0412Ey, "<set-?>");
        this.R = interfaceC0412Ey;
    }

    public final void setOnCaptionStyleChanged(InterfaceC0412Ey interfaceC0412Ey) {
        AbstractC1474fG.j(interfaceC0412Ey, "<set-?>");
        this.L = interfaceC0412Ey;
    }

    public final void setOnEdgeStyleSelected(InterfaceC0412Ey interfaceC0412Ey) {
        AbstractC1474fG.j(interfaceC0412Ey, "<set-?>");
        this.P = interfaceC0412Ey;
    }

    public final void setOnExtraBufferingListener(InterfaceC0412Ey interfaceC0412Ey) {
        this.a0 = interfaceC0412Ey;
    }

    public final void setOnExtraBufferingSelected(InterfaceC0412Ey interfaceC0412Ey) {
        AbstractC1474fG.j(interfaceC0412Ey, "<set-?>");
        this.b0 = interfaceC0412Ey;
    }

    public final void setOnExtraBufferingSelectedListener(InterfaceC0412Ey interfaceC0412Ey) {
        AbstractC1474fG.j(interfaceC0412Ey, "listener");
        this.a0 = interfaceC0412Ey;
    }

    public final void setOnFontColorSelected(InterfaceC0412Ey interfaceC0412Ey) {
        AbstractC1474fG.j(interfaceC0412Ey, "<set-?>");
        this.M = interfaceC0412Ey;
    }

    public final void setOnFontOpacitySelected(InterfaceC0412Ey interfaceC0412Ey) {
        AbstractC1474fG.j(interfaceC0412Ey, "<set-?>");
        this.O = interfaceC0412Ey;
    }

    public final void setOnLocalSubtitlesClicked(InterfaceC0360Cy interfaceC0360Cy) {
        this.U = interfaceC0360Cy;
    }

    public final void setOnLocalSubtitlesClickedListener(InterfaceC0360Cy interfaceC0360Cy) {
        AbstractC1474fG.j(interfaceC0360Cy, "onLocalSubtitlesClicked");
        this.U = interfaceC0360Cy;
    }

    public final void setOnOpenSubtitleSelected(InterfaceC0412Ey interfaceC0412Ey) {
        this.V = interfaceC0412Ey;
    }

    public final void setOnOpenSubtitleSelectedListener(InterfaceC0412Ey interfaceC0412Ey) {
        AbstractC1474fG.j(interfaceC0412Ey, "onOpenSubtitleSelected");
        this.V = interfaceC0412Ey;
    }

    public final void setOnQualitySelected(InterfaceC0412Ey interfaceC0412Ey) {
        AbstractC1474fG.j(interfaceC0412Ey, "<set-?>");
        this.I = interfaceC0412Ey;
    }

    public final void setOnServerSelected(InterfaceC0412Ey interfaceC0412Ey) {
        this.c0 = interfaceC0412Ey;
    }

    public final void setOnServerSelectedListener(InterfaceC0412Ey interfaceC0412Ey) {
        AbstractC1474fG.j(interfaceC0412Ey, "onServerSelected");
        this.c0 = interfaceC0412Ey;
    }

    public final void setOnSpeedSelected(InterfaceC0412Ey interfaceC0412Ey) {
        AbstractC1474fG.j(interfaceC0412Ey, "<set-?>");
        this.W = interfaceC0412Ey;
    }

    public final void setOnSubtitleSelected(InterfaceC0412Ey interfaceC0412Ey) {
        AbstractC1474fG.j(interfaceC0412Ey, "<set-?>");
        this.K = interfaceC0412Ey;
    }

    public final void setOnTextSizeSelected(InterfaceC0412Ey interfaceC0412Ey) {
        AbstractC1474fG.j(interfaceC0412Ey, "<set-?>");
        this.N = interfaceC0412Ey;
    }

    public final void setOnWindowColorSelected(InterfaceC0412Ey interfaceC0412Ey) {
        AbstractC1474fG.j(interfaceC0412Ey, "<set-?>");
        this.S = interfaceC0412Ey;
    }

    public final void setOnWindowOpacitySelected(InterfaceC0412Ey interfaceC0412Ey) {
        AbstractC1474fG.j(interfaceC0412Ey, "<set-?>");
        this.T = interfaceC0412Ey;
    }

    public final void setOpenSubtitles(List<C3336yW> list) {
        AbstractC1474fG.j(list, "value");
        try {
            C3392z00.b.getClass();
            C3295y00.a(list);
        } catch (ClassCastException unused) {
            C3295y00 c3295y00 = C3392z00.b;
            C1233cq c1233cq = C1233cq.l;
            c3295y00.getClass();
            C3295y00.a(c1233cq);
            list = c1233cq;
        }
        this.G = list;
    }

    public final void setPlayer(InterfaceC0664Or interfaceC0664Or) {
        if (this.E == interfaceC0664Or) {
            return;
        }
        if (interfaceC0664Or != null) {
            C2229n00 c2229n00 = C2907u00.d;
            C2229n00.e(interfaceC0664Or);
            C2229n00 c2229n01 = AbstractC2810t00.a;
            Resources resources = getResources();
            AbstractC1474fG.i(resources, "getResources(...)");
            c2229n01.f(interfaceC0664Or, resources);
            C2229n00 c2229n02 = C2132m00.e;
            Resources resources2 = getResources();
            AbstractC1474fG.i(resources2, "getResources(...)");
            c2229n02.f(interfaceC0664Or, resources2);
            C2229n00 c2229n03 = T00.a;
            Resources resources3 = getResources();
            AbstractC1474fG.i(resources3, "getResources(...)");
            c2229n03.f(interfaceC0664Or, resources3);
            C3004v00.d.h(interfaceC0664Or);
        }
        if (interfaceC0664Or != null) {
            ((C1042as) interfaceC0664Or).l.a(new RZ(interfaceC0664Or, this, 1));
        }
        this.E = interfaceC0664Or;
    }

    public final void setSubtitleView(SubtitleView subtitleView) {
        this.F = subtitleView;
    }
}
