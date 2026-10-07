package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class IF implements CJ, Serializable {
    public final /* synthetic */ int l = 1;
    public Object m;

    public /* synthetic */ IF() {
    }

    @Override // o.CJ
    public Object getValue() {
        return this.m;
    }

    public final String toString() {
        switch (this.l) {
            case 0:
                break;
        }
        return String.valueOf(this.m);
    }

    public IF(Object obj) {
        this.m = obj;
    }
}
