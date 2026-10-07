package o;

import android.animation.AnimatorSet;

/* JADX INFO: renamed from: o.Gl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0451Gl {
    public static final C0451Gl a = new C0451Gl();

    public final void a(AnimatorSet animatorSet) {
        AbstractC1474fG.j(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j) {
        AbstractC1474fG.j(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j);
    }
}
