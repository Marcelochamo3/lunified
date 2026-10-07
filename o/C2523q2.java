package o;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: renamed from: o.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2523q2 {
    public final C2135m2 a;
    public final int b;

    public C2523q2(Context context) {
        this(context, DialogInterfaceC2619r2.i(context, 0));
    }

    public DialogInterfaceC2619r2 create() {
        ListAdapter c2329o2;
        C2135m2 c2135m2 = this.a;
        DialogInterfaceC2619r2 dialogInterfaceC2619r2 = new DialogInterfaceC2619r2(c2135m2.a, this.b);
        View view = c2135m2.e;
        C2426p2 c2426p2 = dialogInterfaceC2619r2.q;
        if (view != null) {
            c2426p2.C = view;
        } else {
            CharSequence charSequence = c2135m2.d;
            if (charSequence != null) {
                c2426p2.e = charSequence;
                TextView textView = c2426p2.A;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c2135m2.c;
            if (drawable != null) {
                c2426p2.y = drawable;
                c2426p2.x = 0;
                ImageView imageView = c2426p2.z;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c2426p2.z.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c2135m2.f;
        if (charSequence2 != null) {
            c2426p2.f = charSequence2;
            TextView textView2 = c2426p2.B;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = c2135m2.g;
        if (charSequence3 != null) {
            c2426p2.d(-1, charSequence3, c2135m2.h);
        }
        CharSequence charSequence4 = c2135m2.i;
        if (charSequence4 != null) {
            c2426p2.d(-2, charSequence4, c2135m2.j);
        }
        if (c2135m2.m != null || c2135m2.n != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c2135m2.b.inflate(c2426p2.G, (ViewGroup) null);
            if (c2135m2.r) {
                c2329o2 = new C1842j2(c2135m2, c2135m2.a, c2426p2.H, c2135m2.m, alertController$RecycleListView);
            } else {
                int i = c2135m2.s ? c2426p2.I : c2426p2.J;
                c2329o2 = c2135m2.n;
                if (c2329o2 == null) {
                    c2329o2 = new C2329o2(c2135m2.a, i, R.id.text1, c2135m2.m);
                }
            }
            c2426p2.D = c2329o2;
            c2426p2.E = c2135m2.t;
            if (c2135m2.f907o != null) {
                alertController$RecycleListView.setOnItemClickListener(new C1940k2(c2135m2, c2426p2));
            } else if (c2135m2.u != null) {
                alertController$RecycleListView.setOnItemClickListener(new C2038l2(c2135m2, alertController$RecycleListView, c2426p2));
            }
            if (c2135m2.s) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (c2135m2.r) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            c2426p2.g = alertController$RecycleListView;
        }
        View view2 = c2135m2.p;
        if (view2 != null) {
            c2426p2.h = view2;
            c2426p2.i = 0;
            c2426p2.j = false;
        }
        dialogInterfaceC2619r2.setCancelable(c2135m2.k);
        if (c2135m2.k) {
            dialogInterfaceC2619r2.setCanceledOnTouchOutside(true);
        }
        dialogInterfaceC2619r2.setOnCancelListener(null);
        dialogInterfaceC2619r2.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = c2135m2.l;
        if (onKeyListener != null) {
            dialogInterfaceC2619r2.setOnKeyListener(onKeyListener);
        }
        return dialogInterfaceC2619r2;
    }

    public Context getContext() {
        return this.a.a;
    }

    public C2523q2 setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        C2135m2 c2135m2 = this.a;
        c2135m2.i = c2135m2.a.getText(i);
        c2135m2.j = onClickListener;
        return this;
    }

    public C2523q2 setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        C2135m2 c2135m2 = this.a;
        c2135m2.g = c2135m2.a.getText(i);
        c2135m2.h = onClickListener;
        return this;
    }

    public C2523q2 setTitle(CharSequence charSequence) {
        this.a.d = charSequence;
        return this;
    }

    public C2523q2 setView(View view) {
        this.a.p = view;
        return this;
    }

    public C2523q2(Context context, int i) {
        this.a = new C2135m2(new ContextThemeWrapper(context, DialogInterfaceC2619r2.i(context, i)));
        this.b = i;
    }
}
