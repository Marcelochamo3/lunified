package o;

import android.content.Context;
import android.view.View;
import com.skidush.clonex.R;
import java.util.Iterator;

/* JADX INFO: renamed from: o.Oq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0663Oq extends AbstractC2144m60 {
    public final InterfaceC2604qt0 u;
    public final Context v;
    public C0456Gq w;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0663Oq(InterfaceC2604qt0 interfaceC2604qt0) {
        View viewB = interfaceC2604qt0.b();
        super(viewB);
        this.u = interfaceC2604qt0;
        this.v = viewB.getContext();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    public final String u() {
        String string;
        C0456Gq c0456Gq = this.w;
        if (c0456Gq == null) {
            AbstractC1474fG.U("episode");
            throw null;
        }
        Ma0 ma0 = c0456Gq.f;
        Context context = this.v;
        if (ma0 == null) {
            string = null;
        } else {
            if (ma0.b == 0) {
                ma0 = null;
            }
            if (ma0 != null) {
                Integer numValueOf = Integer.valueOf(ma0.b);
                C0456Gq c0456Gq2 = this.w;
                if (c0456Gq2 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                Integer numValueOf2 = Integer.valueOf(c0456Gq2.b);
                C0456Gq c0456Gq3 = this.w;
                if (c0456Gq3 == null) {
                    AbstractC1474fG.U("episode");
                    throw null;
                }
                String string2 = c0456Gq3.c;
                if (string2 == null) {
                    if (c0456Gq3 == null) {
                        AbstractC1474fG.U("episode");
                        throw null;
                    }
                    string2 = context.getString(R.string.episode_number, Integer.valueOf(c0456Gq3.b));
                    AbstractC1474fG.i(string2, "getString(...)");
                }
                string = context.getString(R.string.player_subtitle_tv_show, numValueOf, numValueOf2, string2);
            } else {
                string = null;
            }
        }
        if (string != null) {
            return string;
        }
        C0456Gq c0456Gq4 = this.w;
        if (c0456Gq4 == null) {
            AbstractC1474fG.U("episode");
            throw null;
        }
        Integer numValueOf3 = Integer.valueOf(c0456Gq4.b);
        C0456Gq c0456Gq5 = this.w;
        if (c0456Gq5 == null) {
            AbstractC1474fG.U("episode");
            throw null;
        }
        String string3 = c0456Gq5.c;
        if (string3 == null) {
            if (c0456Gq5 == null) {
                AbstractC1474fG.U("episode");
                throw null;
            }
            string3 = context.getString(R.string.episode_number, Integer.valueOf(c0456Gq5.b));
            AbstractC1474fG.i(string3, "getString(...)");
        }
        String string4 = context.getString(R.string.player_subtitle_tv_show_episode_only, numValueOf3, string3);
        AbstractC1474fG.i(string4, "getString(...)");
        return string4;
    }

    public final Hs0 v() {
        String str;
        String str2;
        C0456Gq c0456Gq = this.w;
        if (c0456Gq == null) {
            AbstractC1474fG.U("episode");
            throw null;
        }
        String str3 = c0456Gq.a;
        if (c0456Gq == null) {
            AbstractC1474fG.U("episode");
            throw null;
        }
        int i = c0456Gq.b;
        if (c0456Gq == null) {
            AbstractC1474fG.U("episode");
            throw null;
        }
        String str4 = c0456Gq.c;
        if (c0456Gq == null) {
            AbstractC1474fG.U("episode");
            throw null;
        }
        String str5 = c0456Gq.d;
        if (c0456Gq == null) {
            AbstractC1474fG.U("episode");
            throw null;
        }
        C2109lo0 c2109lo0 = c0456Gq.e;
        String str6 = "";
        if (c2109lo0 == null || (str = c2109lo0.a) == null) {
            str = "";
        }
        if (c0456Gq == null) {
            AbstractC1474fG.U("episode");
            throw null;
        }
        if (c2109lo0 != null && (str2 = c2109lo0.b) != null) {
            str6 = str2;
        }
        if (c0456Gq == null) {
            AbstractC1474fG.U("episode");
            throw null;
        }
        String str7 = c2109lo0 != null ? c2109lo0.h : null;
        if (c0456Gq == null) {
            AbstractC1474fG.U("episode");
            throw null;
        }
        Gs0 gs0 = new Gs0(str, str6, str7, c2109lo0 != null ? c2109lo0.i : null);
        C0456Gq c0456Gq2 = this.w;
        if (c0456Gq2 == null) {
            AbstractC1474fG.U("episode");
            throw null;
        }
        Ma0 ma0 = c0456Gq2.f;
        int i2 = ma0 != null ? ma0.b : 0;
        if (c0456Gq2 != null) {
            return new Hs0(str3, i, str4, str5, gs0, new Fs0(i2, ma0 != null ? ma0.c : null));
        }
        AbstractC1474fG.U("episode");
        throw null;
    }

    public final void w() {
        Object next;
        Q30 q30;
        C0456Gq c0456Gq = this.w;
        Object obj = null;
        if (c0456Gq == null) {
            AbstractC1474fG.U("episode");
            throw null;
        }
        String str = c0456Gq.k;
        if (str == null) {
            return;
        }
        Cr0 cr0 = Cr0.m;
        String strB = cr0.b();
        if (AbstractC1474fG.b(strB, "PPV.TO")) {
            q30 = QW.b;
        } else {
            Q30.a.getClass();
            Iterator it = P30.b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC1474fG.b(((Q30) next).getName(), strB));
            Q30 q31 = (Q30) next;
            q30 = q31 == null ? C1816io0.b : q31;
        }
        if (AbstractC1474fG.b(str, q30.getName())) {
            return;
        }
        Q30.a.getClass();
        for (Object obj2 : P30.b) {
            if (AbstractC1474fG.b(((Q30) obj2).getName(), str)) {
                obj = obj2;
                break;
            }
        }
        Q30 q32 = (Q30) obj;
        if (q32 != null) {
            cr0.f(q32.getName());
        }
    }
}
