package o;

import android.graphics.Color;
import androidx.leanback.widget.PagingIndicator;

/* JADX INFO: loaded from: classes.dex */
public final class YW {
    public float a;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h = 1.0f;
    public float i;
    public final /* synthetic */ PagingIndicator j;

    public YW(PagingIndicator pagingIndicator) {
        this.j = pagingIndicator;
        this.i = pagingIndicator.l ? 1.0f : -1.0f;
    }

    public final void a() {
        int iRound = Math.round(this.a * 255.0f);
        PagingIndicator pagingIndicator = this.j;
        this.b = Color.argb(iRound, Color.red(pagingIndicator.A), Color.green(pagingIndicator.A), Color.blue(pagingIndicator.A));
    }

    public final void b() {
        this.c = 0.0f;
        this.d = 0.0f;
        PagingIndicator pagingIndicator = this.j;
        this.e = pagingIndicator.m;
        float f = pagingIndicator.n;
        this.f = f;
        this.g = f * pagingIndicator.G;
        this.a = 0.0f;
        a();
    }
}
