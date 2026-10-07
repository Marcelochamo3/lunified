package o;

/* JADX INFO: loaded from: classes.dex */
public final class Jv0 extends C2815t3 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Jv0(String str, int i, String str2) {
        super(str, 2, str2);
        this.e = i;
    }

    @Override // o.AbstractC2912u3
    public final boolean b() {
        switch (this.e) {
            case 0:
                if (!super.b() || !AbstractC1474fG.G("MULTI_PROCESS")) {
                    return false;
                }
                boolean z = AbstractC2995uv0.a;
                if (Kv0.b.b()) {
                    return Lv0.a.getStatics().isMultiProcessEnabled();
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            default:
                if (AbstractC1474fG.G("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
