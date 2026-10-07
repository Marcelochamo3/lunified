package o;

import android.R;
import android.content.res.TypedArray;
import android.os.Message;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.leanback.widget.SearchBar;
import androidx.preference.Preference;
import com.google.android.exoplayer2.ui.TrackSelectionView;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Z0 implements View.OnClickListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ Z0(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message messageObtain;
        Message message;
        Message message2;
        Message message3;
        switch (this.l) {
            case 0:
                ((AbstractC2908u1) this.m).a();
                break;
            case 1:
                C2426p2 c2426p2 = (C2426p2) this.m;
                if (view == c2426p2.k && (message3 = c2426p2.m) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view != c2426p2.f962o || (message2 = c2426p2.q) == null) {
                    messageObtain = (view != c2426p2.s || (message = c2426p2.u) == null) ? null : Message.obtain(message);
                } else {
                    messageObtain = Message.obtain(message2);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                c2426p2.L.obtainMessage(1, c2426p2.b).sendToTarget();
                break;
            case 2:
                DialogC2924u9 dialogC2924u9 = (DialogC2924u9) this.m;
                if (dialogC2924u9.u && dialogC2924u9.isShowing()) {
                    if (!dialogC2924u9.w) {
                        TypedArray typedArrayObtainStyledAttributes = dialogC2924u9.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        dialogC2924u9.v = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        dialogC2924u9.w = true;
                    }
                    if (dialogC2924u9.v) {
                        dialogC2924u9.cancel();
                    }
                    break;
                }
                break;
            case 3:
                C1287dO c1287dO = (C1287dO) this.m;
                int i = c1287dO.p0;
                if (i == 2) {
                    c1287dO.X(1);
                } else if (i == 1) {
                    c1287dO.X(2);
                }
                break;
            case 4:
                C1386eQ itemData = ((AbstractC2268nU) view).getItemData();
                AbstractC2462pU abstractC2462pU = (AbstractC2462pU) this.m;
                if (!abstractC2462pU.P.q(itemData, abstractC2462pU.O, 0)) {
                    itemData.setChecked(true);
                }
                break;
            case 5:
                ((Preference) this.m).s(view);
                break;
            case 6:
                SearchBar searchBar = (SearchBar) this.m;
                if (!searchBar.G) {
                    searchBar.a();
                } else {
                    searchBar.b();
                }
                break;
            case 7:
                Jl0 jl0 = ((Toolbar) this.m).W;
                C1386eQ c1386eQ = jl0 == null ? null : jl0.m;
                if (c1386eQ != null) {
                    c1386eQ.collapseActionView();
                }
                break;
            default:
                TrackSelectionView trackSelectionView = (TrackSelectionView) this.m;
                CheckedTextView checkedTextView = trackSelectionView.n;
                HashMap map = trackSelectionView.r;
                boolean z = true;
                if (view == checkedTextView) {
                    trackSelectionView.w = true;
                    map.clear();
                } else if (view == trackSelectionView.f39o) {
                    trackSelectionView.w = false;
                    map.clear();
                } else {
                    trackSelectionView.w = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    C1812im0 c1812im0 = (C1812im0) tag;
                    C2007km0 c2007km0 = c1812im0.a;
                    Zl0 zl0 = c2007km0.m;
                    C1519fm0 c1519fm0 = (C1519fm0) map.get(zl0);
                    int i2 = c1812im0.b;
                    if (c1519fm0 == null) {
                        if (!trackSelectionView.t && map.size() > 0) {
                            map.clear();
                        }
                        map.put(zl0, new C1519fm0(zl0, AbstractC0985aF.q(Integer.valueOf(i2))));
                    } else {
                        ArrayList arrayList = new ArrayList(c1519fm0.m);
                        boolean zIsChecked = ((CheckedTextView) view).isChecked();
                        boolean z2 = trackSelectionView.s && c2007km0.n;
                        if (!z2 && (!trackSelectionView.t || trackSelectionView.q.size() <= 1)) {
                            z = false;
                        }
                        if (zIsChecked && z) {
                            arrayList.remove(Integer.valueOf(i2));
                            if (arrayList.isEmpty()) {
                                map.remove(zl0);
                            } else {
                                map.put(zl0, new C1519fm0(zl0, arrayList));
                            }
                        } else if (!zIsChecked) {
                            if (z2) {
                                arrayList.add(Integer.valueOf(i2));
                                map.put(zl0, new C1519fm0(zl0, arrayList));
                            } else {
                                map.put(zl0, new C1519fm0(zl0, AbstractC0985aF.q(Integer.valueOf(i2))));
                            }
                        }
                    }
                }
                trackSelectionView.a();
                break;
        }
    }
}
