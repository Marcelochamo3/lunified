package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: o.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0970a5 implements View.OnClickListener {
    public final View l;
    public final String m;
    public Method n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Context f672o;

    public ViewOnClickListenerC0970a5(View view, String str) {
        this.l = view;
        this.m = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.n != null) {
            break;
        }
        View view2 = this.l;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.m;
            if (context == null) {
                int id = view2.getId();
                if (id == -1) {
                    str = "";
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                }
                StringBuilder sbL = AbstractC1701hf0.l("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sbL.append(view2.getClass());
                sbL.append(str);
                throw new IllegalStateException(sbL.toString());
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.n = method;
                    this.f672o = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.n.invoke(this.f672o, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
