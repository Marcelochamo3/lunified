package o;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: renamed from: o.fu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1535fu0 extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1535fu0(ViewPager2 viewPager2) {
        super(1);
        this.E = viewPager2;
    }

    @Override // o.X50
    public final boolean D0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V0(C1755i60 c1755i60, int[] iArr) {
        ViewPager2 viewPager2 = this.E;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.V0(c1755i60, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // o.X50
    public final void e0(C1266d60 c1266d60, C1755i60 c1755i60, N0 n0) {
        super.e0(c1266d60, c1755i60, n0);
        this.E.E.getClass();
    }

    @Override // o.X50
    public final boolean v0(C1266d60 c1266d60, C1755i60 c1755i60, int i, Bundle bundle) {
        this.E.E.getClass();
        return super.v0(c1266d60, c1755i60, i, bundle);
    }
}
