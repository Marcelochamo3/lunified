package o;

import android.content.SharedPreferences;
import android.graphics.Color;
import com.google.android.exoplayer2.ui.SubtitleView;

/* JADX INFO: loaded from: classes.dex */
public final class U00 extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public final /* synthetic */ V00 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U00(V00 v00, int i) {
        super(1);
        this.m = i;
        this.n = v00;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        String strA;
        float fFloatValue;
        Float fValueOf = null;
        C2985uq0 c2985uq0 = C2985uq0.a;
        V00 v00 = this.n;
        switch (this.m) {
            case 0:
                C2132m00 c2132m00 = (C2132m00) obj;
                AbstractC1474fG.j(c2132m00, "audio");
                InterfaceC0664Or player = v00.getPlayer();
                if (player != null) {
                    C1042as c1042as = (C1042as) player;
                    C0814Ul c0814UlL = c1042as.L();
                    c0814UlL.getClass();
                    C0788Tl c0788Tl = new C0788Tl(c0814UlL);
                    C2007km0 c2007km0 = c2132m00.c;
                    c0788Tl.h(new C1519fm0(c2007km0.m, AbstractC2506pt.A(Integer.valueOf(c2132m00.d))));
                    c0788Tl.j(c2007km0.m.n, false);
                    c1042as.a0(c0788Tl.e());
                }
                return c2985uq0;
            case 1:
                B00 b00 = (B00) obj;
                AbstractC1474fG.j(b00, "backgroundColor");
                InterfaceC0412Ey onCaptionStyleChanged = v00.getOnCaptionStyleChanged();
                C0493Ib c0493IbS = AbstractC1459f50.s();
                int iAlpha = Color.alpha(AbstractC1459f50.s().b);
                int i = b00.b;
                onCaptionStyleChanged.b(new C0493Ib(c0493IbS.a, Color.argb(iAlpha, Color.red(i), Color.green(i), Color.blue(i)), AbstractC1459f50.s().c, AbstractC1459f50.s().d, AbstractC1459f50.s().e, null));
                return c2985uq0;
            case 2:
                D00 d00 = (D00) obj;
                AbstractC1474fG.j(d00, "backgroundOpacity");
                InterfaceC0412Ey onCaptionStyleChanged2 = v00.getOnCaptionStyleChanged();
                C0493Ib c0493IbS2 = AbstractC1459f50.s();
                C0493Ib c0493IbS3 = AbstractC1459f50.s();
                int iE = U9.E(d00.b * 255);
                int i2 = c0493IbS3.b;
                onCaptionStyleChanged2.b(new C0493Ib(c0493IbS2.a, Color.argb(iE, Color.red(i2), Color.green(i2), Color.blue(i2)), AbstractC1459f50.s().c, AbstractC1459f50.s().d, AbstractC1459f50.s().e, null));
                return c2985uq0;
            case 3:
                C0493Ib c0493Ib = (C0493Ib) obj;
                AbstractC1474fG.j(c0493Ib, "captionStyle");
                SubtitleView subtitleView = v00.getSubtitleView();
                if (subtitleView != null) {
                    Cr0.q.e(Integer.valueOf(c0493Ib.a));
                    Cr0.r.e(Integer.valueOf(c0493Ib.b));
                    Cr0.s.e(Integer.valueOf(c0493Ib.c));
                    Cr0.t.e(Integer.valueOf(c0493Ib.d));
                    Cr0.u.e(Integer.valueOf(c0493Ib.e));
                    subtitleView.setStyle(AbstractC1459f50.s());
                }
                return c2985uq0;
            case 4:
                F00 f00 = (F00) obj;
                AbstractC1474fG.j(f00, "edgeStyle");
                v00.getOnCaptionStyleChanged().b(new C0493Ib(AbstractC1459f50.s().a, AbstractC1459f50.s().b, AbstractC1459f50.s().c, f00.b, AbstractC1459f50.s().e, null));
                return c2985uq0;
            case 5:
                AbstractC2520q00 abstractC2520q00 = (AbstractC2520q00) obj;
                AbstractC1474fG.j(abstractC2520q00, "extraBuffering");
                boolean z = abstractC2520q00 instanceof C2423p00;
                C2229n00 c2229n00 = AbstractC2520q00.a;
                AbstractC2520q00.c = Boolean.valueOf(z);
                InterfaceC0412Ey onExtraBufferingListener = v00.getOnExtraBufferingListener();
                if (onExtraBufferingListener != null) {
                    onExtraBufferingListener.b(Boolean.valueOf(z));
                }
                v00.n();
                return c2985uq0;
            case 6:
                H00 h00 = (H00) obj;
                AbstractC1474fG.j(h00, "fontColor");
                InterfaceC0412Ey onCaptionStyleChanged3 = v00.getOnCaptionStyleChanged();
                int iAlpha2 = Color.alpha(AbstractC1459f50.s().a);
                int i3 = h00.b;
                onCaptionStyleChanged3.b(new C0493Ib(Color.argb(iAlpha2, Color.red(i3), Color.green(i3), Color.blue(i3)), AbstractC1459f50.s().b, AbstractC1459f50.s().c, AbstractC1459f50.s().d, AbstractC1459f50.s().e, null));
                return c2985uq0;
            case 7:
                J00 j00 = (J00) obj;
                AbstractC1474fG.j(j00, "fontOpacity");
                InterfaceC0412Ey onCaptionStyleChanged4 = v00.getOnCaptionStyleChanged();
                C0493Ib c0493IbS4 = AbstractC1459f50.s();
                int iE2 = U9.E(j00.b * 255);
                int i4 = c0493IbS4.a;
                onCaptionStyleChanged4.b(new C0493Ib(Color.argb(iE2, Color.red(i4), Color.green(i4), Color.blue(i4)), AbstractC1459f50.s().b, AbstractC1459f50.s().c, AbstractC1459f50.s().d, AbstractC1459f50.s().e, null));
                return c2985uq0;
            case 8:
                AbstractC2810t00 abstractC2810t00 = (AbstractC2810t00) obj;
                AbstractC1474fG.j(abstractC2810t00, "quality");
                InterfaceC0664Or player2 = v00.getPlayer();
                if (player2 != null) {
                    boolean z2 = abstractC2810t00 instanceof C2616r00;
                    Cr0 cr0 = Cr0.v;
                    if (z2) {
                        C1042as c1042as2 = (C1042as) player2;
                        C0814Ul c0814UlL2 = c1042as2.L();
                        c0814UlL2.getClass();
                        C0788Tl c0788Tl2 = new C0788Tl(c0814UlL2);
                        c0788Tl2.d = Integer.MAX_VALUE;
                        c0788Tl2.x = false;
                        c1042as2.a0(new C0814Ul(c0788Tl2));
                        cr0.e(null);
                    } else if (abstractC2810t00 instanceof C2713s00) {
                        C1042as c1042as3 = (C1042as) player2;
                        C0814Ul c0814UlL3 = c1042as3.L();
                        c0814UlL3.getClass();
                        C0788Tl c0788Tl3 = new C0788Tl(c0814UlL3);
                        C2713s00 c2713s00 = (C2713s00) abstractC2810t00;
                        c0788Tl3.d = c2713s00.d;
                        c0788Tl3.x = true;
                        c1042as3.a0(new C0814Ul(c0788Tl3));
                        cr0.e(Integer.valueOf(c2713s00.c));
                    }
                }
                return c2985uq0;
            case 9:
                C3004v00 c3004v00 = (C3004v00) obj;
                AbstractC1474fG.j(c3004v00, "speed");
                InterfaceC0664Or player3 = v00.getPlayer();
                if (player3 != null) {
                    C1042as c1042as4 = (C1042as) player3;
                    c1042as4.i0();
                    C1591gZ c1591gZ = new C1591gZ(c3004v00.b, c1042as4.j0.n.m);
                    c1042as4.i0();
                    if (!c1042as4.j0.n.equals(c1591gZ)) {
                        C1493fZ c1493fZF = c1042as4.j0.f(c1591gZ);
                        c1042as4.G++;
                        c1042as4.k.s.a(4, c1591gZ).b();
                        c1042as4.g0(c1493fZF, 0, 1, false, 5, -9223372036854775807L, -1, false);
                    }
                }
                return c2985uq0;
            case 10:
                T00 t00 = (T00) obj;
                AbstractC1474fG.j(t00, "subtitle");
                InterfaceC0664Or player4 = v00.getPlayer();
                if (player4 != null) {
                    boolean z3 = t00 instanceof C3198x00;
                    Cr0 cr1 = Cr0.w;
                    if (z3) {
                        C1042as c1042as5 = (C1042as) player4;
                        C0814Ul c0814UlL4 = c1042as5.L();
                        c0814UlL4.getClass();
                        C0788Tl c0788Tl4 = new C0788Tl(c0814UlL4);
                        c0788Tl4.a(3);
                        c0788Tl4.j(3, true);
                        c1042as5.a0(c0788Tl4.e());
                        SubtitleView subtitleView2 = v00.getSubtitleView();
                        if (subtitleView2 != null) {
                            subtitleView2.setCues(C1233cq.l);
                        }
                        cr1.f(null);
                    } else if (t00 instanceof S00) {
                        C1042as c1042as6 = (C1042as) player4;
                        C0814Ul c0814UlL5 = c1042as6.L();
                        c0814UlL5.getClass();
                        C0788Tl c0788Tl5 = new C0788Tl(c0814UlL5);
                        S00 s00 = (S00) t00;
                        C2007km0 c2007km1 = s00.f;
                        c0788Tl5.h(new C1519fm0(c2007km1.m, AbstractC2506pt.A(Integer.valueOf(s00.g))));
                        c0788Tl5.j(c2007km1.m.n, false);
                        c1042as6.a0(c0788Tl5.e());
                        String str = s00.e;
                        if (str == null && (strA = AbstractC3355yh0.a((str = s00.c))) != null) {
                            str = strA;
                        }
                        cr1.f(str);
                    }
                }
                return c2985uq0;
            case 11:
                M00 m00 = (M00) obj;
                AbstractC1474fG.j(m00, "textSize");
                SubtitleView subtitleView3 = v00.getSubtitleView();
                if (subtitleView3 != null) {
                    SharedPreferences sharedPreferences = AbstractC1459f50.n;
                    if (sharedPreferences == null) {
                        AbstractC1474fG.U("prefs");
                        throw null;
                    }
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putFloat("CAPTION_TEXT_SIZE", m00.b);
                    editorEdit.apply();
                    SharedPreferences sharedPreferences2 = AbstractC1459f50.n;
                    if (sharedPreferences2 == null) {
                        AbstractC1474fG.U("prefs");
                        throw null;
                    }
                    if (sharedPreferences2.contains("CAPTION_TEXT_SIZE")) {
                        SharedPreferences sharedPreferences3 = AbstractC1459f50.n;
                        if (sharedPreferences3 == null) {
                            AbstractC1474fG.U("prefs");
                            throw null;
                        }
                        fValueOf = Float.valueOf(sharedPreferences3.getFloat("CAPTION_TEXT_SIZE", 0.0f));
                    }
                    if (fValueOf != null) {
                        fFloatValue = fValueOf.floatValue();
                    } else {
                        M00.c.getClass();
                        fFloatValue = M00.d.b;
                    }
                    subtitleView3.setFractionalTextSize(fFloatValue * 0.0533f);
                }
                return c2985uq0;
            case 12:
                O00 o00 = (O00) obj;
                AbstractC1474fG.j(o00, "windowColor");
                InterfaceC0412Ey onCaptionStyleChanged5 = v00.getOnCaptionStyleChanged();
                C0493Ib c0493IbS5 = AbstractC1459f50.s();
                C0493Ib c0493IbS6 = AbstractC1459f50.s();
                int iAlpha3 = Color.alpha(AbstractC1459f50.s().c);
                int i5 = o00.b;
                onCaptionStyleChanged5.b(new C0493Ib(c0493IbS5.a, c0493IbS6.b, Color.argb(iAlpha3, Color.red(i5), Color.green(i5), Color.blue(i5)), AbstractC1459f50.s().d, AbstractC1459f50.s().e, null));
                return c2985uq0;
            default:
                Q00 q00 = (Q00) obj;
                AbstractC1474fG.j(q00, "windowOpacity");
                InterfaceC0412Ey onCaptionStyleChanged6 = v00.getOnCaptionStyleChanged();
                C0493Ib c0493IbS7 = AbstractC1459f50.s();
                C0493Ib c0493IbS8 = AbstractC1459f50.s();
                C0493Ib c0493IbS9 = AbstractC1459f50.s();
                int iE3 = U9.E(q00.b * 255);
                int i6 = c0493IbS9.c;
                onCaptionStyleChanged6.b(new C0493Ib(c0493IbS7.a, c0493IbS8.b, Color.argb(iE3, Color.red(i6), Color.green(i6), Color.blue(i6)), AbstractC1459f50.s().d, AbstractC1459f50.s().e, null));
                return c2985uq0;
        }
    }
}
