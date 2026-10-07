package io.sentry.android.replay;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import o.AH;
import o.AbstractC1474fG;
import o.AbstractC3226xJ;
import o.AbstractC3409z9;
import o.C2247n90;
import o.C2691rp;
import o.C2985uq0;
import o.InterfaceC0775Sy;
import o.InterfaceC0914Yh;
import o.InterfaceC0940Zh;
import o.InterfaceC1890jd;
import o.JH;
import o.R90;
import o.Rh0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC3226xJ implements InterfaceC0775Sy {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, Object obj) {
        super(2);
        this.m = i;
        this.n = obj;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) throws IOException {
        switch (this.m) {
            case 0:
                h hVar = (h) obj;
                long jLongValue = ((Number) obj2).longValue();
                AbstractC1474fG.j(hVar, "$this$onScreenshotRecorded");
                Bitmap bitmap = (Bitmap) this.n;
                AbstractC1474fG.j(bitmap, "bitmap");
                Rh0 rh0 = hVar.r;
                if (((File) rh0.getValue()) != null) {
                    File file = new File((File) rh0.getValue(), jLongValue + ".jpg");
                    file.createNewFile();
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                        fileOutputStream.flush();
                        AbstractC3409z9.g(fileOutputStream, null);
                        hVar.s.add(new i(file, jLongValue));
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC3409z9.g(fileOutputStream, th);
                            throw th2;
                        }
                    }
                }
                return C2985uq0.a;
            default:
                int iIntValue = ((Number) obj).intValue();
                InterfaceC0914Yh interfaceC0914Yh = (InterfaceC0914Yh) obj2;
                InterfaceC0940Zh key = interfaceC0914Yh.getKey();
                InterfaceC0914Yh interfaceC0914YhQ = ((C2247n90) this.n).m.q(key);
                if (key != C2691rp.v) {
                    return Integer.valueOf(interfaceC0914Yh != interfaceC0914YhQ ? Integer.MIN_VALUE : iIntValue + 1);
                }
                AH ah = (AH) interfaceC0914YhQ;
                AH ah2 = (AH) interfaceC0914Yh;
                while (true) {
                    AH parent = null;
                    if (ah2 == null) {
                        ah2 = null;
                    } else if (ah2 != ah && (ah2 instanceof R90)) {
                        InterfaceC1890jd interfaceC1890jd = (InterfaceC1890jd) JH.m.get((JH) ah2);
                        if (interfaceC1890jd != null) {
                            parent = interfaceC1890jd.getParent();
                        }
                        ah2 = parent;
                    }
                }
                if (ah2 == ah) {
                    if (ah != null) {
                        iIntValue++;
                    }
                    return Integer.valueOf(iIntValue);
                }
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + ah2 + ", expected child of " + ah + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }
    }
}
