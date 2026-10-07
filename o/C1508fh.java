package o;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: o.fh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1508fh implements InterfaceC1410eh, InterfaceC1606gh {
    public final /* synthetic */ int l;
    public Object m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f779o;
    public Object p;
    public Cloneable q;

    public /* synthetic */ C1508fh() {
        this.l = 0;
    }

    @Override // o.InterfaceC1410eh
    public void D(Uri uri) {
        this.p = uri;
    }

    @Override // o.InterfaceC1606gh
    public int G() {
        return this.n;
    }

    @Override // o.InterfaceC1410eh
    public void P(int i) {
        this.f779o = i;
    }

    public void a(Kw0 kw0, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3094vw0 c3094vw0 = (C3094vw0) it.next();
            if ((c3094vw0.a.c() & 8) != 0) {
                ((View) this.p).setTranslationY(AbstractC1161c3.c(this.f779o, c3094vw0.a.b(), 0));
                return;
            }
        }
    }

    @Override // o.InterfaceC1606gh
    public ClipData e() {
        return (ClipData) this.m;
    }

    @Override // o.InterfaceC1410eh
    public C1704hh f() {
        return new C1704hh(new C1508fh(this));
    }

    @Override // o.InterfaceC1410eh
    public void k(Bundle bundle) {
        this.q = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.l) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.m).getDescription());
                sb.append(", source=");
                int i = this.n;
                if (i == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i != 4) {
                    strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i2 = this.f779o;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                Uri uri = (Uri) this.p;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return AbstractC1701hf0.h(sb, ((Bundle) this.q) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    @Override // o.InterfaceC1606gh
    public int v() {
        return this.f779o;
    }

    @Override // o.InterfaceC1606gh
    public ContentInfo y() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C1508fh(View view) {
        this.l = 2;
        this.q = new int[2];
        this.p = view;
    }

    public C1508fh(C1508fh c1508fh) {
        this.l = 1;
        ClipData clipData = (ClipData) c1508fh.m;
        clipData.getClass();
        this.m = clipData;
        int i = c1508fh.n;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i <= 5) {
            this.n = i;
            int i2 = c1508fh.f779o;
            if ((i2 & 1) == i2) {
                this.f779o = i2;
                this.p = (Uri) c1508fh.p;
                this.q = (Bundle) c1508fh.q;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
