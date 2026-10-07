package o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.Cl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0347Cl extends AbstractC1074b8 {
    public final boolean b;
    public boolean c;
    public C2994uv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0347Cl(C3157wf0 c3157wf0, boolean z) {
        super(c3157wf0);
        AbstractC1474fG.j(c3157wf0, "operation");
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0028  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8 A[Catch: RuntimeException -> 0x00ee, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x00ee, blocks: (B:77:0x00e2, B:79:0x00e8), top: B:90:0x00e2 }] */
    public final C2994uv r(Context context) {
        int i;
        C2994uv c2994uv;
        C2994uv c2994uv2;
        Animator animatorLoadAnimator;
        int iU;
        if (this.c) {
            return this.d;
        }
        C3157wf0 c3157wf0 = (C3157wf0) this.a;
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = c3157wf0.c;
        boolean z = c3157wf0.a == 2;
        C1052ax c1052ax = abstractComponentCallbacksC1247cx.V;
        int i2 = c1052ax == null ? 0 : c1052ax.f;
        if (this.b) {
            if (z) {
                if (c1052ax == null) {
                    i = 0;
                } else {
                    i = c1052ax.d;
                }
            } else if (c1052ax == null) {
                i = 0;
            } else {
                i = c1052ax.e;
            }
        } else if (z) {
            if (c1052ax == null) {
                i = 0;
            } else {
                i = c1052ax.b;
            }
        } else if (c1052ax == null) {
            i = 0;
        } else {
            i = c1052ax.c;
        }
        abstractComponentCallbacksC1247cx.T(0, 0, 0, 0);
        ViewGroup viewGroup = abstractComponentCallbacksC1247cx.R;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            abstractComponentCallbacksC1247cx.R.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = abstractComponentCallbacksC1247cx.R;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            if (i == 0 && i2 != 0) {
                if (i2 == 4097) {
                    iU = z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                } else if (i2 == 8194) {
                    iU = z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                } else if (i2 == 8197) {
                    iU = z ? Pu0.u(context, android.R.attr.activityCloseEnterAnimation) : Pu0.u(context, android.R.attr.activityCloseExitAnimation);
                } else if (i2 == 4099) {
                    iU = z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                } else if (i2 != 4100) {
                    i = -1;
                } else {
                    iU = z ? Pu0.u(context, android.R.attr.activityOpenEnterAnimation) : Pu0.u(context, android.R.attr.activityOpenExitAnimation);
                }
                i = iU;
            }
            if (i == 0) {
                c2994uv2 = null;
            } else {
                boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(i));
                if (zEquals) {
                    try {
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, i);
                        if (animationLoadAnimation != null) {
                            c2994uv = new C2994uv(animationLoadAnimation);
                            c2994uv2 = c2994uv;
                        } else {
                            c2994uv2 = null;
                        }
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                        try {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                            if (animatorLoadAnimator != null) {
                                c2994uv = new C2994uv(animatorLoadAnimator);
                                c2994uv2 = c2994uv;
                            }
                        } catch (RuntimeException e2) {
                            if (zEquals) {
                                throw e2;
                            }
                            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, i);
                            if (animationLoadAnimation2 != null) {
                                c2994uv2 = new C2994uv(animationLoadAnimation2);
                            }
                            this.d = c2994uv2;
                            this.c = true;
                            return c2994uv2;
                        }
                        this.d = c2994uv2;
                        this.c = true;
                        return c2994uv2;
                    }
                } else {
                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                    if (animatorLoadAnimator != null) {
                        c2994uv = new C2994uv(animatorLoadAnimator);
                        c2994uv2 = c2994uv;
                    } else {
                        c2994uv2 = null;
                    }
                }
            }
        } else {
            c2994uv2 = null;
        }
        this.d = c2994uv2;
        this.c = true;
        return c2994uv2;
    }
}
