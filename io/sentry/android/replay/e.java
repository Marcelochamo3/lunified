package io.sentry.android.replay;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import io.sentry.I1;
import java.io.File;
import java.util.List;
import java.util.Map;
import o.AbstractC0911Ye;
import o.AbstractC1474fG;
import o.AbstractC1701hf0;
import o.AbstractC1976kU;
import o.AbstractC3226xJ;
import o.C1293dU;
import o.C2303no0;
import o.C2985uq0;
import o.InterfaceC0827Uy;
import o.InterfaceC2159mI;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC3226xJ implements InterfaceC0827Uy {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f99o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, int i, Object obj2) {
        super(3);
        this.m = i;
        this.n = obj;
        this.f99o = obj2;
    }

    @Override // o.InterfaceC0827Uy
    public final Object f(Object obj, Object obj2, Object obj3) {
        switch (this.m) {
            case 0:
                File file = (File) obj;
                int iIntValue = ((Number) obj2).intValue();
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC1474fG.j(file, "videoFile");
                r rVar = (r) this.f99o;
                io.sentry.android.replay.video.d dVar = new io.sentry.android.replay.video.d((I1) this.n, new io.sentry.android.replay.video.a(file, iIntValue2, iIntValue, rVar.e, rVar.f));
                MediaFormat mediaFormat = (MediaFormat) dVar.e.getValue();
                MediaCodec mediaCodec = dVar.d;
                mediaCodec.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                dVar.h = mediaCodec.createInputSurface();
                mediaCodec.start();
                dVar.a(false);
                return dVar;
            default:
                int iIntValue3 = ((Number) obj).intValue();
                String str = (String) obj2;
                AbstractC1976kU abstractC1976kU = (AbstractC1976kU) obj3;
                AbstractC1474fG.j(str, "argName");
                AbstractC1474fG.j(abstractC1976kU, "navType");
                Object obj4 = ((Map) this.n).get(str);
                AbstractC1474fG.g(obj4);
                List<String> list = (List) obj4;
                C2303no0 c2303no0 = (C2303no0) this.f99o;
                c2303no0.getClass();
                int iW = AbstractC1701hf0.w(((abstractC1976kU instanceof C1293dU) || ((InterfaceC2159mI) c2303no0.m).b().g(iIntValue3)) ? 2 : 1);
                if (iW == 0) {
                    if (list.size() != 1) {
                        StringBuilder sbL = AbstractC1701hf0.l("Expected one value for argument ", str, ", found ");
                        sbL.append(list.size());
                        sbL.append("values instead.");
                        throw new IllegalArgumentException(sbL.toString().toString());
                    }
                    c2303no0.f941o = ((String) c2303no0.f941o) + '/' + ((String) AbstractC0911Ye.b0(list));
                } else if (iW == 1) {
                    for (String str2 : list) {
                        c2303no0.p = ((String) c2303no0.p) + (((String) c2303no0.p).length() == 0 ? "?" : "&") + str + '=' + str2;
                    }
                }
                return C2985uq0.a;
        }
    }
}
