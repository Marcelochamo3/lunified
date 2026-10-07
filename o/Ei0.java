package o;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class Ei0 extends AbstractC1474fG {
    public final /* synthetic */ Context m;
    public final /* synthetic */ TextPaint n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC1474fG f243o;
    public final /* synthetic */ Fi0 p;

    public Ei0(Fi0 fi0, Context context, TextPaint textPaint, AbstractC1474fG abstractC1474fG) {
        this.p = fi0;
        this.m = context;
        this.n = textPaint;
        this.f243o = abstractC1474fG;
    }

    @Override // o.AbstractC1474fG
    public final void L(int i) {
        this.f243o.L(i);
    }

    @Override // o.AbstractC1474fG
    public final void M(Typeface typeface, boolean z) {
        this.p.g(this.m, this.n, typeface);
        this.f243o.M(typeface, z);
    }
}
