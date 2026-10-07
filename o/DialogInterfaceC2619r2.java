package o;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.skidush.clonex.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceC2619r2 extends AbstractDialogC1652h4 implements DialogInterface {
    public final C2426p2 q;

    public DialogInterfaceC2619r2(Context context, int i) {
        super(context, i(context, i));
        this.q = new C2426p2(getContext(), this, getWindow());
    }

    public static int i(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // o.AbstractDialogC1652h4, o.DialogC1213cg, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        View view;
        ListAdapter listAdapter;
        View viewFindViewById;
        int i2 = 0;
        super.onCreate(bundle);
        C2426p2 c2426p2 = this.q;
        c2426p2.b.setContentView(c2426p2.F);
        Window window = c2426p2.c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View viewInflate = c2426p2.h;
        Context context = c2426p2.a;
        if (viewInflate == null) {
            viewInflate = c2426p2.i != 0 ? LayoutInflater.from(context).inflate(c2426p2.i, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !C2426p2.a(viewInflate)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (c2426p2.j) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (c2426p2.g != null) {
                ((LinearLayout.LayoutParams) ((C1966kK) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupC = C2426p2.c(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupC2 = C2426p2.c(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupC3 = C2426p2.c(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c2426p2.w = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c2426p2.w.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupC2.findViewById(android.R.id.message);
        c2426p2.B = textView;
        if (textView != null) {
            CharSequence charSequence = c2426p2.f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                c2426p2.w.removeView(c2426p2.B);
                if (c2426p2.g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c2426p2.w.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(c2426p2.w);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(c2426p2.g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupC2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupC3.findViewById(android.R.id.button1);
        c2426p2.k = button;
        Z0 z0 = c2426p2.M;
        button.setOnClickListener(z0);
        boolean zIsEmpty = TextUtils.isEmpty(c2426p2.l);
        int i3 = c2426p2.d;
        if (zIsEmpty && c2426p2.n == null) {
            c2426p2.k.setVisibility(8);
            i = 0;
        } else {
            c2426p2.k.setText(c2426p2.l);
            Drawable drawable = c2426p2.n;
            if (drawable != null) {
                drawable.setBounds(0, 0, i3, i3);
                c2426p2.k.setCompoundDrawables(c2426p2.n, null, null, null);
            }
            c2426p2.k.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupC3.findViewById(android.R.id.button2);
        c2426p2.f962o = button2;
        button2.setOnClickListener(z0);
        if (TextUtils.isEmpty(c2426p2.p) && c2426p2.r == null) {
            c2426p2.f962o.setVisibility(8);
        } else {
            c2426p2.f962o.setText(c2426p2.p);
            Drawable drawable2 = c2426p2.r;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i3, i3);
                c2426p2.f962o.setCompoundDrawables(c2426p2.r, null, null, null);
            }
            c2426p2.f962o.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupC3.findViewById(android.R.id.button3);
        c2426p2.s = button3;
        button3.setOnClickListener(z0);
        if (TextUtils.isEmpty(c2426p2.t) && c2426p2.v == null) {
            c2426p2.s.setVisibility(8);
            view = null;
        } else {
            c2426p2.s.setText(c2426p2.t);
            Drawable drawable3 = c2426p2.v;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i3, i3);
                view = null;
                c2426p2.s.setCompoundDrawables(c2426p2.v, null, null, null);
            } else {
                view = null;
            }
            c2426p2.s.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = c2426p2.k;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = c2426p2.f962o;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = c2426p2.s;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupC3.setVisibility(8);
        }
        if (c2426p2.C != null) {
            viewGroupC.addView(c2426p2.C, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c2426p2.z = (ImageView) window.findViewById(android.R.id.icon);
            if ((!TextUtils.isEmpty(c2426p2.e)) && c2426p2.K) {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c2426p2.A = textView2;
                textView2.setText(c2426p2.e);
                int i4 = c2426p2.x;
                if (i4 != 0) {
                    c2426p2.z.setImageResource(i4);
                } else {
                    Drawable drawable4 = c2426p2.y;
                    if (drawable4 != null) {
                        c2426p2.z.setImageDrawable(drawable4);
                    } else {
                        c2426p2.A.setPadding(c2426p2.z.getPaddingLeft(), c2426p2.z.getPaddingTop(), c2426p2.z.getPaddingRight(), c2426p2.z.getPaddingBottom());
                        c2426p2.z.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(R.id.title_template).setVisibility(8);
                c2426p2.z.setVisibility(8);
                viewGroupC.setVisibility(8);
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i5 = (viewGroupC == null || viewGroupC.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupC3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupC2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i5 != 0) {
            NestedScrollView nestedScrollView2 = c2426p2.w;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (c2426p2.f == null && c2426p2.g == null) ? view : viewGroupC.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupC2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c2426p2.g;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z3 || i5 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i5 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.l, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.m);
            }
        }
        if (!z2) {
            View view2 = c2426p2.g;
            if (view2 == null) {
                view2 = c2426p2.w;
            }
            if (view2 != null) {
                int i6 = (z3 ? 2 : 0) | i5;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 23) {
                    WeakHashMap weakHashMap = It0.a;
                    if (i7 >= 23) {
                        AbstractC3282xt0.d(view2, i6, 3);
                    }
                    if (viewFindViewById11 != null) {
                        viewGroupC2.removeView(viewFindViewById11);
                    }
                    if (viewFindViewById12 != null) {
                        viewGroupC2.removeView(viewFindViewById12);
                    }
                } else {
                    if (viewFindViewById11 != null && (i6 & 1) == 0) {
                        viewGroupC2.removeView(viewFindViewById11);
                        viewFindViewById11 = view;
                    }
                    if (viewFindViewById12 == null || (2 & i6) != 0) {
                        view = viewFindViewById12;
                    } else {
                        viewGroupC2.removeView(viewFindViewById12);
                    }
                    if (viewFindViewById11 != null || view != null) {
                        if (c2426p2.f != null) {
                            c2426p2.w.setOnScrollChangeListener(new C2720s4(viewFindViewById11, 1, view));
                            c2426p2.w.post(new RunnableC1648h2(c2426p2, viewFindViewById11, view, i2));
                        } else {
                            AlertController$RecycleListView alertController$RecycleListView2 = c2426p2.g;
                            if (alertController$RecycleListView2 != null) {
                                alertController$RecycleListView2.setOnScrollListener(new C1746i2(viewFindViewById11, view));
                                c2426p2.g.post(new RunnableC1648h2(c2426p2, viewFindViewById11, view, 1));
                            } else {
                                if (viewFindViewById11 != null) {
                                    viewGroupC2.removeView(viewFindViewById11);
                                }
                                if (view != null) {
                                    viewGroupC2.removeView(view);
                                }
                            }
                        }
                    }
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView3 = c2426p2.g;
        if (alertController$RecycleListView3 == null || (listAdapter = c2426p2.D) == null) {
            return;
        }
        alertController$RecycleListView3.setAdapter(listAdapter);
        int i8 = c2426p2.E;
        if (i8 > -1) {
            alertController$RecycleListView3.setItemChecked(i8, true);
            alertController$RecycleListView3.setSelection(i8);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.q.w;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.q.w;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // o.AbstractDialogC1652h4, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C2426p2 c2426p2 = this.q;
        c2426p2.e = charSequence;
        TextView textView = c2426p2.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
