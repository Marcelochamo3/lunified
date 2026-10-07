package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.skidush.clonex.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: o.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2426p2 {
    public TextView A;
    public TextView B;
    public View C;
    public ListAdapter D;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final boolean K;
    public final HandlerC2232n2 L;
    public final Context a;
    public final AbstractDialogC1652h4 b;
    public final Window c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public AlertController$RecycleListView g;
    public View h;
    public int i;
    public Button k;
    public CharSequence l;
    public Message m;
    public Drawable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f962o;
    public CharSequence p;
    public Message q;
    public Drawable r;
    public Button s;
    public CharSequence t;
    public Message u;
    public Drawable v;
    public NestedScrollView w;
    public Drawable y;
    public ImageView z;
    public boolean j = false;
    public int x = 0;
    public int E = -1;
    public final Z0 M = new Z0(1, this);

    public C2426p2(Context context, AbstractDialogC1652h4 abstractDialogC1652h4, Window window) {
        this.a = context;
        this.b = abstractDialogC1652h4;
        this.c = window;
        HandlerC2232n2 handlerC2232n2 = new HandlerC2232n2();
        handlerC2232n2.b = new WeakReference(abstractDialogC1652h4);
        this.L = handlerC2232n2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, T40.e, R.attr.alertDialogStyle, 0);
        this.F = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.G = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.H = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.I = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.K = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        abstractDialogC1652h4.e().e(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void b(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public static ViewGroup c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void d(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.L.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.t = charSequence;
            this.u = messageObtainMessage;
            this.v = null;
        } else if (i == -2) {
            this.p = charSequence;
            this.q = messageObtainMessage;
            this.r = null;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.l = charSequence;
            this.m = messageObtainMessage;
            this.n = null;
        }
    }
}
