package o;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* JADX INFO: renamed from: o.ym0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3365ym0 {
    public static long a(Animator animator) {
        return animator.getTotalDuration();
    }

    public static void b(Animator animator, long j) {
        ((AnimatorSet) animator).setCurrentPlayTime(j);
    }
}
