package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.skidush.clonex.R;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class It0 {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static ThreadLocal d;
    public static final int[] e = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final C2700rt0 f = new C2700rt0();
    public static final ViewTreeObserverOnGlobalLayoutListenerC2894tt0 g = new ViewTreeObserverOnGlobalLayoutListenerC2894tt0();

    public static C2509pu0 a(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        C2509pu0 c2509pu0 = (C2509pu0) a.get(view);
        if (c2509pu0 != null) {
            return c2509pu0;
        }
        C2509pu0 c2509pu1 = new C2509pu0(view);
        a.put(view, c2509pu1);
        return c2509pu1;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = Ht0.d;
        Ht0 ht0 = (Ht0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (ht0 == null) {
            ht0 = new Ht0();
            ht0.a = null;
            ht0.b = null;
            ht0.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, ht0);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = ht0.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = Ht0.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (ht0.a == null) {
                            ht0.a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = Ht0.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                ht0.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    ht0.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        View viewA = ht0.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (ht0.b == null) {
                    ht0.b = new SparseArray();
                }
                ht0.b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Ct0.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static CharSequence d(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Bt0.b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static Rect f() {
        if (d == null) {
            d = new ThreadLocal();
        }
        Rect rect = (Rect) d.get();
        if (rect == null) {
            rect = new Rect();
            d.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static String[] g(View view) {
        return Build.VERSION.SDK_INT >= 31 ? Et0.a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static Kw0 h(View view) {
        return Build.VERSION.SDK_INT >= 23 ? AbstractC3282xt0.a(view) : AbstractC3185wt0.j(view);
    }

    public static void i(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = d(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : C1672hI.a.g);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(d(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(d(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static void j(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect rectF = f();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectF.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectF.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            s(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                s((View) parent2);
            }
        }
        if (z && rectF.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectF);
        }
    }

    public static void k(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect rectF = f();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectF.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectF.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            s(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                s((View) parent2);
            }
        }
        if (z && rectF.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectF);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1704hh l(View view, C1704hh c1704hh) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(c1704hh);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Et0.b(view, c1704hh);
        }
        InterfaceC2464pW interfaceC2464pW = (InterfaceC2464pW) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC2561qW interfaceC2561qW = f;
        if (interfaceC2464pW == null) {
            if (view instanceof InterfaceC2561qW) {
                interfaceC2561qW = (InterfaceC2561qW) view;
            }
            return interfaceC2561qW.a(c1704hh);
        }
        C1704hh c1704hhA = ((Zi0) interfaceC2464pW).a(view, c1704hh);
        if (c1704hhA == null) {
            return null;
        }
        if (view instanceof InterfaceC2561qW) {
            interfaceC2561qW = (InterfaceC2561qW) view;
        }
        return interfaceC2561qW.a(c1704hhA);
    }

    public static void m(View view, int i) {
        ArrayList arrayListE = e(view);
        for (int i2 = 0; i2 < arrayListE.size(); i2++) {
            if (((F0) arrayListE.get(i2)).a() == i) {
                arrayListE.remove(i2);
                return;
            }
        }
    }

    public static void n(View view, F0 f0, X0 x0) {
        C3003v0 c3003v0;
        if (x0 == null) {
            m(view, f0.a());
            i(view, 0);
            return;
        }
        F0 f1 = new F0(null, f0.b, null, x0, f0.c);
        View.AccessibilityDelegate accessibilityDelegateC = c(view);
        if (accessibilityDelegateC == null) {
            c3003v0 = null;
        } else {
            c3003v0 = accessibilityDelegateC instanceof C2906u0 ? ((C2906u0) accessibilityDelegateC).a : new C3003v0(accessibilityDelegateC);
        }
        if (c3003v0 == null) {
            c3003v0 = new C3003v0();
        }
        p(view, c3003v0);
        m(view, f1.a());
        e(view).add(f1);
        i(view, 0);
    }

    public static void o(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            Ct0.d(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void p(View view, C3003v0 c3003v0) {
        if (c3003v0 == null && (c(view) instanceof C2906u0)) {
            c3003v0 = new C3003v0();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c3003v0 == null ? null : c3003v0.b);
    }

    public static void q(View view, CharSequence charSequence) {
        new C2797st0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).g(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC2894tt0 viewTreeObserverOnGlobalLayoutListenerC2894tt0 = g;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC2894tt0.l.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC2894tt0);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2894tt0);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC2894tt0.l.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC2894tt0);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2894tt0);
            }
        }
    }

    public static void r(View view, C0334By c0334By) {
        if (Build.VERSION.SDK_INT >= 24) {
            AbstractC3379yt0.d(view, Tr0.a(c0334By != null ? (PointerIcon) c0334By.m : null));
        }
    }

    public static void s(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
