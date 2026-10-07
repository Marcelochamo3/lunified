package o;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.skidush.clonex.R;
import com.skidush.clonex.fragments.player.PlayerTvFragment;

/* JADX INFO: renamed from: o.ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC3348ye implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ViewOnFocusChangeListenerC3348ye(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                C0314Be c0314Be = (C0314Be) this.b;
                c0314Be.t(c0314Be.u());
                break;
            case 1:
                C0869Wo c0869Wo = (C0869Wo) this.b;
                c0869Wo.l = z;
                c0869Wo.q();
                if (!z) {
                    c0869Wo.t(false);
                    c0869Wo.m = false;
                }
                break;
            case 2:
                PlayerTvFragment playerTvFragment = (PlayerTvFragment) this.b;
                AbstractC1474fG.j(playerTvFragment, "this$0");
                if (z && !playerTvFragment.x0) {
                    PlayerTvFragment.h1 = view.getId();
                    break;
                }
                break;
            default:
                C2083lb0 c2083lb0 = (C2083lb0) this.b;
                AbstractC1474fG.j(c2083lb0, "this$0");
                C2994uv c2994uv = c2083lb0.u;
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(((ConstraintLayout) c2994uv.m).getContext(), z ? R.anim.zoom_in : R.anim.zoom_out);
                ((ConstraintLayout) c2994uv.m).startAnimation(animationLoadAnimation);
                animationLoadAnimation.setFillAfter(true);
                break;
        }
    }
}
