package o;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public class BO extends AbstractC0604Mj {
    public final String l;

    public BO(IllegalStateException illegalStateException, EO eo) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        String diagnosticInfo = null;
        sb.append(eo == null ? null : eo.a);
        super(sb.toString(), illegalStateException);
        if (Lr0.a >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.l = diagnosticInfo;
    }
}
