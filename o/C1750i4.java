package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1750i4 implements InterfaceC2604qt0 {
    public final /* synthetic */ int l;
    public final Object m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f824o;
    public Object p;
    public Object q;
    public Object r;

    public /* synthetic */ C1750i4(ViewGroup viewGroup, View view, View view2, Object obj, View view3, TextView textView, int i) {
        this.l = i;
        this.m = viewGroup;
        this.n = view;
        this.f824o = view2;
        this.p = obj;
        this.q = view3;
        this.r = textView;
    }

    public static boolean c(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList d(Context context, int i) {
        int iC = AbstractC1220cj0.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{AbstractC1220cj0.b, AbstractC1220cj0.d, AbstractC1220cj0.c, AbstractC1220cj0.f}, new int[]{AbstractC1220cj0.b(context, R.attr.colorButtonNormal), AbstractC1894jf.d(iC, i), AbstractC1894jf.d(iC, i), i});
    }

    public static CP e(InterfaceC2370oZ interfaceC2370oZ, AbstractC0985aF abstractC0985aF, CP cp, Dj0 dj0) {
        C1042as c1042as = (C1042as) interfaceC2370oZ;
        Fj0 fj0E = c1042as.E();
        int iB = c1042as.B();
        Object objM = fj0E.q() ? null : fj0E.m(iB);
        int iB2 = (c1042as.M() || fj0E.q()) ? -1 : fj0E.f(iB, dj0).b(Lr0.K(c1042as.C()) - dj0.g());
        for (int i = 0; i < abstractC0985aF.size(); i++) {
            CP cp2 = (CP) abstractC0985aF.get(i);
            if (h(cp2, objM, c1042as.M(), c1042as.y(), c1042as.z(), iB2)) {
                return cp2;
            }
        }
        if (abstractC0985aF.isEmpty() && cp != null) {
            if (h(cp, objM, c1042as.M(), c1042as.y(), c1042as.z(), iB2)) {
                return cp;
            }
        }
        return null;
    }

    public static LayerDrawable f(Y70 y70, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableF = y70.f(context, R.drawable.abc_star_black_48dp);
        Drawable drawableF2 = y70.f(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableF instanceof BitmapDrawable) && drawableF.getIntrinsicWidth() == dimensionPixelSize && drawableF.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableF;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableF.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableF2 instanceof BitmapDrawable) && drawableF2.getIntrinsicWidth() == dimensionPixelSize && drawableF2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableF2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableF2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static boolean h(CP cp, Object obj, boolean z, int i, int i2, int i3) {
        if (!cp.a.equals(obj)) {
            return false;
        }
        int i4 = cp.b;
        return (z && i4 == i && cp.c == i2) || (!z && i4 == -1 && cp.e == i3);
    }

    public static void i(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterH;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C1846j4.b;
        }
        PorterDuff.Mode mode2 = C1846j4.b;
        synchronized (C1846j4.class) {
            porterDuffColorFilterH = Y70.h(i, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterH);
    }

    public void a(C2613qy c2613qy, CP cp, Fj0 fj0) {
        if (cp == null) {
            return;
        }
        if (fj0.b(cp.a) != -1) {
            c2613qy.I(cp, fj0);
            return;
        }
        Fj0 fj1 = (Fj0) ((R60) this.f824o).get(cp);
        if (fj1 != null) {
            c2613qy.I(cp, fj1);
        }
    }

    @Override // o.InterfaceC2604qt0
    public View b() {
        switch (this.l) {
            case 2:
                return (ConstraintLayout) this.m;
            default:
                return (LinearLayout) this.m;
        }
    }

    public ColorStateList g(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return AbstractC1459f50.v(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC1459f50.v(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return d(context, AbstractC1220cj0.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return d(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return d(context, AbstractC1220cj0.c(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC1459f50.v(context, R.color.abc_tint_spinner);
            }
            if (c(i, (int[]) this.n)) {
                return AbstractC1220cj0.d(context, R.attr.colorControlNormal);
            }
            if (c(i, (int[]) this.q)) {
                return AbstractC1459f50.v(context, R.color.abc_tint_default);
            }
            if (c(i, (int[]) this.r)) {
                return AbstractC1459f50.v(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC1459f50.v(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = AbstractC1220cj0.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = AbstractC1220cj0.b;
            iArr2[0] = AbstractC1220cj0.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = AbstractC1220cj0.e;
            iArr2[1] = AbstractC1220cj0.c(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC1220cj0.f;
            iArr2[2] = AbstractC1220cj0.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = AbstractC1220cj0.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = AbstractC1220cj0.e;
            iArr2[1] = AbstractC1220cj0.c(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC1220cj0.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public void j(Fj0 fj0) {
        C2613qy c2613qyA = AbstractC1278dF.a();
        if (((AbstractC0985aF) this.n).isEmpty()) {
            a(c2613qyA, (CP) this.q, fj0);
            if (!AbstractC1459f50.p((CP) this.r, (CP) this.q)) {
                a(c2613qyA, (CP) this.r, fj0);
            }
            if (!AbstractC1459f50.p((CP) this.p, (CP) this.q) && !AbstractC1459f50.p((CP) this.p, (CP) this.r)) {
                a(c2613qyA, (CP) this.p, fj0);
            }
        } else {
            for (int i = 0; i < ((AbstractC0985aF) this.n).size(); i++) {
                a(c2613qyA, (CP) ((AbstractC0985aF) this.n).get(i), fj0);
            }
            if (!((AbstractC0985aF) this.n).contains((CP) this.p)) {
                a(c2613qyA, (CP) this.p, fj0);
            }
        }
        this.f824o = c2613qyA.c();
    }

    public C1750i4() {
        this.l = 0;
        this.m = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.n = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f824o = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.p = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.q = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.r = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public C1750i4(Dj0 dj0) {
        this.l = 1;
        this.m = dj0;
        XE xe = AbstractC0985aF.m;
        this.n = M60.p;
        this.f824o = R60.r;
    }
}
