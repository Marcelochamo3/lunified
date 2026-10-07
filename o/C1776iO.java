package o;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.skidush.clonex.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.iO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1776iO<S> extends DialogInterfaceOnCancelListenerC0348Cm {
    public final LinkedHashSet B0;
    public final LinkedHashSet C0;
    public int D0;
    public NY E0;
    public C0570La F0;
    public C1287dO G0;
    public int H0;
    public CharSequence I0;
    public boolean J0;
    public int K0;
    public int L0;
    public CharSequence M0;
    public int N0;
    public CharSequence O0;
    public int P0;
    public CharSequence Q0;
    public int R0;
    public CharSequence S0;
    public TextView T0;
    public CheckableImageButton U0;
    public C2068lO V0;
    public boolean W0;
    public CharSequence X0;
    public CharSequence Y0;

    public C1776iO() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.B0 = new LinkedHashSet();
        this.C0 = new LinkedHashSet();
    }

    public static int b0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarC = Er0.c();
        calendarC.set(5, 1);
        Calendar calendarB = Er0.b(calendarC);
        calendarB.get(2);
        calendarB.get(1);
        int maximum = calendarB.getMaximum(7);
        calendarB.getActualMaximum(5);
        calendarB.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean c0(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(zy0.A(R.attr.materialCalendarStyle, context, C1287dO.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.J0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.J0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(b0(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(b0(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = It0.a;
        textView.setAccessibilityLiveRegion(1);
        this.U0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.T0 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.U0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.U0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, Ou0.l(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], Ou0.l(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.U0.setChecked(this.K0 != 0);
        It0.p(this.U0, null);
        CheckableImageButton checkableImageButton2 = this.U0;
        this.U0.setContentDescription(this.K0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.U0.setOnClickListener(new ViewOnClickListenerC3251xe(8, this));
        a0();
        throw null;
    }

    @Override // o.DialogInterfaceOnCancelListenerC0348Cm, o.AbstractComponentCallbacksC1247cx
    public final void H(Bundle bundle) {
        super.H(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.D0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        C0570La c0570La = this.F0;
        C0544Ka c0544Ka = new C0544Ka();
        int i = C0544Ka.b;
        int i2 = C0544Ka.b;
        long j = c0570La.l.q;
        long j2 = c0570La.m.q;
        c0544Ka.a = Long.valueOf(c0570La.f383o.q);
        C1287dO c1287dO = this.G0;
        WQ wq = c1287dO == null ? null : c1287dO.o0;
        if (wq != null) {
            c0544Ka.a = Long.valueOf(wq.q);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", c0570La.n);
        WQ wqE = WQ.e(j);
        WQ wqE2 = WQ.e(j2);
        C3455zj c3455zj = (C3455zj) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = c0544Ka.a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C0570La(wqE, wqE2, c3455zj, l == null ? null : WQ.e(l.longValue()), c0570La.p));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.H0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.I0);
        bundle.putInt("INPUT_MODE_KEY", this.K0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.L0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.M0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.N0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.O0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.P0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.Q0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.R0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.S0);
    }

    @Override // o.DialogInterfaceOnCancelListenerC0348Cm, o.AbstractComponentCallbacksC1247cx
    public final void I() {
        NY ny;
        Nr0 mw0;
        Nr0 mw1;
        super.I();
        Window window = Y().getWindow();
        if (this.J0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.V0);
            if (!this.W0) {
                View viewFindViewById = R().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListR = Jp0.r(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListR != null ? Integer.valueOf(colorStateListR.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z = false;
                boolean z2 = numValueOf == null || numValueOf.intValue() == 0;
                int iN = UK.n(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z2) {
                    numValueOf = Integer.valueOf(iN);
                }
                AbstractC1459f50.L(window, false);
                int iF = i < 23 ? AbstractC1894jf.f(UK.n(window.getContext(), android.R.attr.statusBarColor, -16777216), 128) : 0;
                int iF2 = i < 27 ? AbstractC1894jf.f(UK.n(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(iF);
                window.setNavigationBarColor(iF2);
                boolean z3 = UK.C(iF) || (iF == 0 && UK.C(numValueOf.intValue()));
                L80 l80 = new L80(window.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    Ow0 ow0 = new Ow0(window.getInsetsController(), l80);
                    ow0.j = window;
                    mw0 = ow0;
                } else if (i2 >= 26) {
                    mw0 = new Nw0(window, l80);
                } else {
                    mw0 = i2 >= 23 ? new Mw0(window, l80) : new Lw0(window, l80);
                }
                mw0.z(z3);
                boolean zC = UK.C(iN);
                if (UK.C(iF2) || (iF2 == 0 && zC)) {
                    z = true;
                }
                L80 l81 = new L80(window.getDecorView());
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    Ow0 ow1 = new Ow0(window.getInsetsController(), l81);
                    ow1.j = window;
                    mw1 = ow1;
                } else if (i3 >= 26) {
                    mw1 = new Nw0(window, l81);
                } else {
                    mw1 = i3 >= 23 ? new Mw0(window, l81) : new Lw0(window, l81);
                }
                mw1.y(z);
                int paddingTop = viewFindViewById.getPaddingTop();
                int i4 = viewFindViewById.getLayoutParams().height;
                FV fv = new FV();
                fv.l = i4;
                fv.n = viewFindViewById;
                fv.m = paddingTop;
                WeakHashMap weakHashMap = It0.a;
                AbstractC3185wt0.u(viewFindViewById, fv);
                this.W0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.V0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new RF(Y(), rect));
        }
        Q();
        int i5 = this.D0;
        if (i5 == 0) {
            a0();
            throw null;
        }
        a0();
        C0570La c0570La = this.F0;
        C1287dO c1287dO = new C1287dO();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i5);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0570La);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", c0570La.f383o);
        c1287dO.U(bundle);
        this.G0 = c1287dO;
        if (this.K0 == 1) {
            ny = c1287dO;
            a0();
            C0570La c0570La2 = this.F0;
            C2359oO c2359oO = new C2359oO();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i5);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0570La2);
            c2359oO.U(bundle2);
            ny = c2359oO;
        }
        ny = c1287dO;
        this.E0 = ny;
        this.T0.setText((this.K0 == 1 && m().getConfiguration().orientation == 2) ? this.Y0 : this.X0);
        a0();
        j();
        throw null;
    }

    @Override // o.DialogInterfaceOnCancelListenerC0348Cm, o.AbstractComponentCallbacksC1247cx
    public final void J() {
        this.E0.l0.clear();
        super.J();
    }

    @Override // o.DialogInterfaceOnCancelListenerC0348Cm
    public final Dialog X() {
        Context contextQ = Q();
        Q();
        int i = this.D0;
        if (i == 0) {
            a0();
            throw null;
        }
        Dialog dialog = new Dialog(contextQ, i);
        Context context = dialog.getContext();
        this.J0 = c0(context, android.R.attr.windowFullscreen);
        this.V0 = new C2068lO(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, H40.n, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.V0.j(context);
        this.V0.l(ColorStateList.valueOf(color));
        C2068lO c2068lO = this.V0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = It0.a;
        c2068lO.k(AbstractC3185wt0.i(decorView));
        return dialog;
    }

    public final void a0() {
        AbstractC1674hK.u(this.q.getParcelable("DATE_SELECTOR_KEY"));
    }

    @Override // o.DialogInterfaceOnCancelListenerC0348Cm, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.B0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // o.DialogInterfaceOnCancelListenerC0348Cm, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.C0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.S;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // o.DialogInterfaceOnCancelListenerC0348Cm, o.AbstractComponentCallbacksC1247cx
    public final void z(Bundle bundle) {
        super.z(bundle);
        if (bundle == null) {
            bundle = this.q;
        }
        this.D0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        AbstractC1674hK.u(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.F0 = (C0570La) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        AbstractC1674hK.u(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.H0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.I0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.K0 = bundle.getInt("INPUT_MODE_KEY");
        this.L0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.M0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.N0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.O0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.P0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.Q0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.R0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.S0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.I0;
        if (text == null) {
            text = Q().getResources().getText(this.H0);
        }
        this.X0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.Y0 = text;
    }
}
