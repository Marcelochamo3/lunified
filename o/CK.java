package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: loaded from: classes.dex */
public final class CK implements InterfaceC2651rQ, AdapterView.OnItemClickListener {
    public Context l;
    public LayoutInflater m;
    public ZP n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ExpandedMenuView f196o;
    public InterfaceC2555qQ p;
    public BK q;

    public CK(Context context) {
        this.l = context;
        this.m = LayoutInflater.from(context);
    }

    @Override // o.InterfaceC2651rQ
    public final void a(ZP zp, boolean z) {
        InterfaceC2555qQ interfaceC2555qQ = this.p;
        if (interfaceC2555qQ != null) {
            interfaceC2555qQ.a(zp, z);
        }
    }

    @Override // o.InterfaceC2651rQ
    public final void c(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f196o.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // o.InterfaceC2651rQ
    public final void d(boolean z) {
        BK bk = this.q;
        if (bk != null) {
            bk.notifyDataSetChanged();
        }
    }

    @Override // o.InterfaceC2651rQ
    public final boolean f(C1386eQ c1386eQ) {
        return false;
    }

    @Override // o.InterfaceC2651rQ
    public final void g(InterfaceC2555qQ interfaceC2555qQ) {
        this.p = interfaceC2555qQ;
    }

    @Override // o.InterfaceC2651rQ
    public final int i() {
        return 0;
    }

    @Override // o.InterfaceC2651rQ
    public final void j(Context context, ZP zp) {
        if (this.l != null) {
            this.l = context;
            if (this.m == null) {
                this.m = LayoutInflater.from(context);
            }
        }
        this.n = zp;
        BK bk = this.q;
        if (bk != null) {
            bk.notifyDataSetChanged();
        }
    }

    @Override // o.InterfaceC2651rQ
    public final boolean k() {
        return false;
    }

    @Override // o.InterfaceC2651rQ
    public final Parcelable l() {
        if (this.f196o == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f196o;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // o.InterfaceC2651rQ
    public final boolean m(SubMenuC2483ph0 subMenuC2483ph0) {
        if (!subMenuC2483ph0.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0996aQ dialogInterfaceOnKeyListenerC0996aQ = new DialogInterfaceOnKeyListenerC0996aQ();
        dialogInterfaceOnKeyListenerC0996aQ.l = subMenuC2483ph0;
        Context context = subMenuC2483ph0.a;
        C2523q2 c2523q2 = new C2523q2(context);
        CK ck = new CK(c2523q2.getContext());
        dialogInterfaceOnKeyListenerC0996aQ.n = ck;
        ck.p = dialogInterfaceOnKeyListenerC0996aQ;
        subMenuC2483ph0.b(ck, context);
        CK ck2 = dialogInterfaceOnKeyListenerC0996aQ.n;
        if (ck2.q == null) {
            ck2.q = new BK(ck2);
        }
        BK bk = ck2.q;
        C2135m2 c2135m2 = c2523q2.a;
        c2135m2.n = bk;
        c2135m2.f907o = dialogInterfaceOnKeyListenerC0996aQ;
        View view = subMenuC2483ph0.f656o;
        if (view != null) {
            c2135m2.e = view;
        } else {
            c2135m2.c = subMenuC2483ph0.n;
            c2523q2.setTitle(subMenuC2483ph0.m);
        }
        c2135m2.l = dialogInterfaceOnKeyListenerC0996aQ;
        DialogInterfaceC2619r2 dialogInterfaceC2619r2Create = c2523q2.create();
        dialogInterfaceOnKeyListenerC0996aQ.m = dialogInterfaceC2619r2Create;
        dialogInterfaceC2619r2Create.setOnDismissListener(dialogInterfaceOnKeyListenerC0996aQ);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0996aQ.m.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0996aQ.m.show();
        InterfaceC2555qQ interfaceC2555qQ = this.p;
        if (interfaceC2555qQ == null) {
            return true;
        }
        interfaceC2555qQ.u(subMenuC2483ph0);
        return true;
    }

    @Override // o.InterfaceC2651rQ
    public final boolean n(C1386eQ c1386eQ) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.n.q(this.q.getItem(i), this, 0);
    }
}
