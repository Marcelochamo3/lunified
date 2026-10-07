package o;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class T2 extends Jp0 {
    public final ObjectAnimator g;
    public final boolean h;

    public T2(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        U2 u2 = new U2();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        u2.b = numberOfFrames2;
        int[] iArr = u2.a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            u2.a = new int[numberOfFrames2];
        }
        int[] iArr2 = u2.a;
        int i3 = 0;
        for (int i4 = 0; i4 < numberOfFrames2; i4++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames2 - i4) - 1 : i4);
            iArr2[i4] = duration;
            i3 += duration;
        }
        u2.c = i3;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(u2.c);
        objectAnimatorOfInt.setInterpolator(u2);
        this.h = z2;
        this.g = objectAnimatorOfInt;
    }

    @Override // o.Jp0
    public final void J() {
        this.g.reverse();
    }

    @Override // o.Jp0
    public final void L() {
        this.g.start();
    }

    @Override // o.Jp0
    public final void M() {
        this.g.cancel();
    }

    @Override // o.Jp0
    public final boolean e() {
        return this.h;
    }
}
