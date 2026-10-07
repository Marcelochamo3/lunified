package o;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

/* JADX INFO: renamed from: o.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2135m2 {
    public final Context a;
    public final LayoutInflater b;
    public Drawable c;
    public CharSequence d;
    public View e;
    public CharSequence f;
    public CharSequence g;
    public DialogInterface.OnClickListener h;
    public CharSequence i;
    public DialogInterface.OnClickListener j;
    public DialogInterface.OnKeyListener l;
    public CharSequence[] m;
    public ListAdapter n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public DialogInterface.OnClickListener f907o;
    public View p;
    public boolean[] q;
    public boolean r;
    public boolean s;
    public DialogInterface.OnMultiChoiceClickListener u;
    public int t = -1;
    public boolean k = true;

    public C2135m2(ContextThemeWrapper contextThemeWrapper) {
        this.a = contextThemeWrapper;
        this.b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }
}
