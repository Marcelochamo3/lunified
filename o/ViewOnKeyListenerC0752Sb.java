package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.skidush.clonex.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: o.Sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0752Sb extends AbstractC1874jQ implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public boolean H;
    public InterfaceC2555qQ I;
    public ViewTreeObserver J;
    public PopupWindow.OnDismissListener K;
    public boolean L;
    public final Context m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f515o;
    public final int p;
    public final boolean q;
    public final Handler r;
    public View z;
    public final ArrayList s = new ArrayList();
    public final ArrayList t = new ArrayList();
    public final ViewTreeObserverOnGlobalLayoutListenerC3399z4 u = new ViewTreeObserverOnGlobalLayoutListenerC3399z4(2, this);
    public final ViewOnAttachStateChangeListenerC0674Pb v = new ViewOnAttachStateChangeListenerC0674Pb(0, this);
    public final C2133m1 w = new C2133m1(8, this);
    public int x = 0;
    public int y = 0;
    public boolean G = false;

    public ViewOnKeyListenerC0752Sb(Context context, View view, int i, int i2, boolean z) {
        this.m = context;
        this.z = view;
        this.f515o = i;
        this.p = i2;
        this.q = z;
        this.B = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.n = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.r = new Handler();
    }

    @Override // o.InterfaceC2651rQ
    public final void a(ZP zp, boolean z) {
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (zp == ((C0726Rb) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((C0726Rb) arrayList.get(i2)).b.c(false);
        }
        C0726Rb c0726Rb = (C0726Rb) arrayList.remove(i);
        c0726Rb.b.r(this);
        boolean z2 = this.L;
        C2458pQ c2458pQ = c0726Rb.a;
        if (z2) {
            if (Build.VERSION.SDK_INT >= 23) {
                AbstractC2167mQ.b(c2458pQ.K, null);
            } else {
                c2458pQ.getClass();
            }
            c2458pQ.K.setAnimationStyle(0);
        }
        c2458pQ.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.B = ((C0726Rb) arrayList.get(size2 - 1)).c;
        } else {
            this.B = this.z.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C0726Rb) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC2555qQ interfaceC2555qQ = this.I;
        if (interfaceC2555qQ != null) {
            interfaceC2555qQ.a(zp, true);
        }
        ViewTreeObserver viewTreeObserver = this.J;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.J.removeGlobalOnLayoutListener(this.u);
            }
            this.J = null;
        }
        this.A.removeOnAttachStateChangeListener(this.v);
        this.K.onDismiss();
    }

    @Override // o.Id0
    public final boolean b() {
        ArrayList arrayList = this.t;
        return arrayList.size() > 0 && ((C0726Rb) arrayList.get(0)).a.K.isShowing();
    }

    @Override // o.InterfaceC2651rQ
    public final void d(boolean z) {
        Iterator it = this.t.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0726Rb) it.next()).a.n.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((WP) adapter).notifyDataSetChanged();
        }
    }

    @Override // o.Id0
    public final void dismiss() {
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        if (size > 0) {
            C0726Rb[] c0726RbArr = (C0726Rb[]) arrayList.toArray(new C0726Rb[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0726Rb c0726Rb = c0726RbArr[i];
                if (c0726Rb.a.K.isShowing()) {
                    c0726Rb.a.dismiss();
                }
            }
        }
    }

    @Override // o.Id0
    public final void e() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.s;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y((ZP) it.next());
        }
        arrayList.clear();
        View view = this.z;
        this.A = view;
        if (view != null) {
            boolean z = this.J == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.J = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.u);
            }
            this.A.addOnAttachStateChangeListener(this.v);
        }
    }

    @Override // o.InterfaceC2651rQ
    public final void g(InterfaceC2555qQ interfaceC2555qQ) {
        this.I = interfaceC2555qQ;
    }

    @Override // o.Id0
    public final C0687Po h() {
        ArrayList arrayList = this.t;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0726Rb) AbstractC1701hf0.c(1, arrayList)).a.n;
    }

    @Override // o.InterfaceC2651rQ
    public final boolean k() {
        return false;
    }

    @Override // o.InterfaceC2651rQ
    public final Parcelable l() {
        return null;
    }

    @Override // o.InterfaceC2651rQ
    public final boolean m(SubMenuC2483ph0 subMenuC2483ph0) {
        for (C0726Rb c0726Rb : this.t) {
            if (subMenuC2483ph0 == c0726Rb.b) {
                c0726Rb.a.n.requestFocus();
                return true;
            }
        }
        if (!subMenuC2483ph0.hasVisibleItems()) {
            return false;
        }
        o(subMenuC2483ph0);
        InterfaceC2555qQ interfaceC2555qQ = this.I;
        if (interfaceC2555qQ != null) {
            interfaceC2555qQ.u(subMenuC2483ph0);
        }
        return true;
    }

    @Override // o.AbstractC1874jQ
    public final void o(ZP zp) {
        zp.b(this, this.m);
        if (b()) {
            y(zp);
        } else {
            this.s.add(zp);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0726Rb c0726Rb;
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0726Rb = null;
                break;
            }
            c0726Rb = (C0726Rb) arrayList.get(i);
            if (!c0726Rb.a.K.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0726Rb != null) {
            c0726Rb.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // o.AbstractC1874jQ
    public final void q(View view) {
        if (this.z != view) {
            this.z = view;
            this.y = Gravity.getAbsoluteGravity(this.x, view.getLayoutDirection());
        }
    }

    @Override // o.AbstractC1874jQ
    public final void r(boolean z) {
        this.G = z;
    }

    @Override // o.AbstractC1874jQ
    public final void s(int i) {
        if (this.x != i) {
            this.x = i;
            this.y = Gravity.getAbsoluteGravity(i, this.z.getLayoutDirection());
        }
    }

    @Override // o.AbstractC1874jQ
    public final void t(int i) {
        this.C = true;
        this.E = i;
    }

    @Override // o.AbstractC1874jQ
    public final void u(PopupWindow.OnDismissListener onDismissListener) {
        this.K = onDismissListener;
    }

    @Override // o.AbstractC1874jQ
    public final void v(boolean z) {
        this.H = z;
    }

    @Override // o.AbstractC1874jQ
    public final void w(int i) {
        this.D = true;
        this.F = i;
    }

    public final void y(ZP zp) {
        View childAt;
        C0726Rb c0726Rb;
        char c;
        int i;
        int i2;
        int width;
        MenuItem item;
        WP wp;
        int headersCount;
        int i3;
        int firstVisiblePosition;
        Context context = this.m;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        WP wp2 = new WP(zp, layoutInflaterFrom, this.q, R.layout.abc_cascading_menu_item_layout);
        if (!b() && this.G) {
            wp2.c = true;
        } else if (b()) {
            wp2.c = AbstractC1874jQ.x(zp);
        }
        int iP = AbstractC1874jQ.p(wp2, context, this.n);
        C2458pQ c2458pQ = new C2458pQ(context, null, this.f515o, this.p);
        C2527q4 c2527q4 = c2458pQ.K;
        c2458pQ.O = this.w;
        c2458pQ.A = this;
        c2527q4.setOnDismissListener(this);
        c2458pQ.z = this.z;
        c2458pQ.w = this.y;
        c2458pQ.J = true;
        c2527q4.setFocusable(true);
        c2527q4.setInputMethodMode(2);
        c2458pQ.q(wp2);
        c2458pQ.r(iP);
        c2458pQ.w = this.y;
        ArrayList arrayList = this.t;
        if (arrayList.size() > 0) {
            c0726Rb = (C0726Rb) AbstractC1701hf0.c(1, arrayList);
            ZP zp2 = c0726Rb.b;
            int size = zp2.f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    item = null;
                    break;
                }
                item = zp2.getItem(i4);
                if (item.hasSubMenu() && zp == item.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (item == null) {
                childAt = null;
            } else {
                C0687Po c0687Po = c0726Rb.a.n;
                ListAdapter adapter = c0687Po.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    wp = (WP) headerViewListAdapter.getWrappedAdapter();
                } else {
                    wp = (WP) adapter;
                    headersCount = 0;
                }
                int count = wp.getCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= count) {
                        i3 = -1;
                        i5 = -1;
                        break;
                    } else {
                        if (item == wp.getItem(i5)) {
                            i3 = -1;
                            break;
                        }
                        i5++;
                    }
                }
                childAt = (i5 != i3 && (firstVisiblePosition = (i5 + headersCount) - c0687Po.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0687Po.getChildCount()) ? c0687Po.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            childAt = null;
            c0726Rb = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = C2458pQ.P;
                if (method != null) {
                    try {
                        method.invoke(c2527q4, Boolean.FALSE);
                    } catch (Exception unused) {
                    }
                }
            } else {
                AbstractC2264nQ.a(c2527q4, false);
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 23) {
                AbstractC2167mQ.a(c2527q4, null);
            }
            C0687Po c0687Po2 = ((C0726Rb) AbstractC1701hf0.c(1, arrayList)).a.n;
            int[] iArr = new int[2];
            c0687Po2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.A.getWindowVisibleDisplayFrame(rect);
            int i7 = (this.B != 1 ? iArr[0] - iP >= 0 : (c0687Po2.getWidth() + iArr[0]) + iP > rect.right) ? 0 : 1;
            boolean z = i7 == 1;
            this.B = i7;
            if (i6 >= 26) {
                c2458pQ.z = childAt;
                i2 = 0;
                i = 0;
            } else {
                int[] iArr2 = new int[2];
                this.z.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.y & 7) == 5) {
                    c = 0;
                    iArr2[0] = this.z.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                } else {
                    c = 0;
                }
                i = iArr3[c] - iArr2[c];
                i2 = iArr3[1] - iArr2[1];
            }
            if ((this.y & 5) == 5) {
                width = z ? i + iP : i - childAt.getWidth();
            } else {
                width = z ? i + childAt.getWidth() : i - iP;
            }
            c2458pQ.q = width;
            c2458pQ.v = true;
            c2458pQ.u = true;
            c2458pQ.k(i2);
        } else {
            if (this.C) {
                c2458pQ.q = this.E;
            }
            if (this.D) {
                c2458pQ.k(this.F);
            }
            Rect rect2 = this.l;
            c2458pQ.I = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new C0726Rb(c2458pQ, zp, this.B));
        c2458pQ.e();
        C0687Po c0687Po3 = c2458pQ.n;
        c0687Po3.setOnKeyListener(this);
        if (c0726Rb == null && this.H && zp.m != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0687Po3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(zp.m);
            c0687Po3.addHeaderView(frameLayout, null, false);
            c2458pQ.e();
        }
    }

    @Override // o.InterfaceC2651rQ
    public final void c(Parcelable parcelable) {
    }
}
