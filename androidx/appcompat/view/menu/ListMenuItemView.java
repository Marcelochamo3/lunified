package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.skidush.clonex.R;
import o.C1386eQ;
import o.C1672hI;
import o.InterfaceC2748sQ;
import o.RN;
import o.T40;
import o.ZP;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC2748sQ, AbsListView.SelectionBoundsAdjuster {
    public LayoutInflater A;
    public boolean B;
    public C1386eQ l;
    public ImageView m;
    public RadioButton n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f4o;
    public CheckBox p;
    public TextView q;
    public ImageView r;
    public ImageView s;
    public LinearLayout t;
    public final Drawable u;
    public final int v;
    public final Context w;
    public boolean x;
    public final Drawable y;
    public final boolean z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        RN rnY = RN.y(getContext(), attributeSet, T40.r, R.attr.listMenuViewStyle, 0);
        this.u = rnY.u(5);
        TypedArray typedArray = (TypedArray) rnY.n;
        this.v = typedArray.getResourceId(1, -1);
        this.x = typedArray.getBoolean(7, false);
        this.w = context;
        this.y = rnY.u(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.z = typedArrayObtainStyledAttributes.hasValue(0);
        rnY.A();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.A == null) {
            this.A = LayoutInflater.from(getContext());
        }
        return this.A;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.r;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    @Override // o.InterfaceC2748sQ
    public final void a(C1386eQ c1386eQ) {
        boolean z;
        int i;
        String string;
        boolean z2;
        this.l = c1386eQ;
        setVisibility(c1386eQ.isVisible() ? 0 : 8);
        setTitle(c1386eQ.e);
        setCheckable(c1386eQ.isCheckable());
        if (c1386eQ.n.o()) {
            if ((c1386eQ.n.n() ? c1386eQ.j : c1386eQ.h) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        c1386eQ.n.n();
        if (z) {
            C1386eQ c1386eQ2 = this.l;
            if (c1386eQ2.n.o()) {
                if ((c1386eQ2.n.n() ? c1386eQ2.j : c1386eQ2.h) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            i = z2 ? 0 : 8;
        }
        if (i == 0) {
            TextView textView = this.q;
            C1386eQ c1386eQ3 = this.l;
            char c = c1386eQ3.n.n() ? c1386eQ3.j : c1386eQ3.h;
            if (c == 0) {
                string = "";
            } else {
                ZP zp = c1386eQ3.n;
                Resources resources = zp.a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(zp.a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i2 = zp.n() ? c1386eQ3.k : c1386eQ3.i;
                C1386eQ.c(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb);
                C1386eQ.c(i2, C1672hI.a.f, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb);
                C1386eQ.c(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb);
                C1386eQ.c(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb);
                C1386eQ.c(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb);
                C1386eQ.c(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb);
                if (c == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.q.getVisibility() != i) {
            this.q.setVisibility(i);
        }
        setIcon(c1386eQ.getIcon());
        setEnabled(c1386eQ.isEnabled());
        setSubMenuArrowVisible(c1386eQ.hasSubMenu());
        setContentDescription(c1386eQ.q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.s;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.s.getLayoutParams();
        rect.top = this.s.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // o.InterfaceC2748sQ
    public C1386eQ getItemData() {
        return this.l;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.u);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f4o = textView;
        int i = this.v;
        if (i != -1) {
            textView.setTextAppearance(this.w, i);
        }
        this.q = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.r = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.y);
        }
        this.s = (ImageView) findViewById(R.id.group_divider);
        this.t = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.m != null && this.x) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.m.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.n == null && this.p == null) {
            return;
        }
        if ((this.l.x & 4) != 0) {
            if (this.n == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.n = radioButton;
                LinearLayout linearLayout = this.t;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.n;
            view = this.p;
        } else {
            if (this.p == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.p = checkBox;
                LinearLayout linearLayout2 = this.t;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.p;
            view = this.n;
        }
        if (z) {
            compoundButton.setChecked(this.l.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.p;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.n;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.l.x & 4) != 0) {
            if (this.n == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.n = radioButton;
                LinearLayout linearLayout = this.t;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.n;
        } else {
            if (this.p == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.p = checkBox;
                LinearLayout linearLayout2 = this.t;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.p;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.B = z;
        this.x = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.s;
        if (imageView != null) {
            imageView.setVisibility((this.z || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.l.n.getClass();
        boolean z = this.B;
        if (z || this.x) {
            ImageView imageView = this.m;
            if (imageView == null && drawable == null && !this.x) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.m = imageView2;
                LinearLayout linearLayout = this.t;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.x) {
                this.m.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.m;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.m.getVisibility() != 0) {
                this.m.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f4o.getVisibility() != 8) {
                this.f4o.setVisibility(8);
            }
        } else {
            this.f4o.setText(charSequence);
            if (this.f4o.getVisibility() != 0) {
                this.f4o.setVisibility(0);
            }
        }
    }
}
