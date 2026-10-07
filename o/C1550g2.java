package o;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: o.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1550g2 implements InterfaceC2583qj {
    public final InterfaceC2583qj l;
    public final byte[] m;
    public final byte[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CipherInputStream f789o;

    public C1550g2(InterfaceC2583qj interfaceC2583qj, byte[] bArr, byte[] bArr2) {
        this.l = interfaceC2583qj;
        this.m = bArr;
        this.n = bArr2;
    }

    @Override // o.InterfaceC2000kj
    public final int D(byte[] bArr, int i, int i2) throws IOException {
        this.f789o.getClass();
        int i3 = this.f789o.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }

    @Override // o.InterfaceC2583qj
    public final void close() {
        if (this.f789o != null) {
            this.f789o = null;
            this.l.close();
        }
    }

    @Override // o.InterfaceC2583qj
    public final void k(InterfaceC2590qm0 interfaceC2590qm0) {
        interfaceC2590qm0.getClass();
        this.l.k(interfaceC2590qm0);
    }

    @Override // o.InterfaceC2583qj
    public final Map l() {
        return this.l.l();
    }

    @Override // o.InterfaceC2583qj
    public final long v(C2970uj c2970uj) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.m, "AES"), new IvParameterSpec(this.n));
                C2776sj c2776sj = new C2776sj(this.l, c2970uj);
                this.f789o = new CipherInputStream(c2776sj, cipher);
                c2776sj.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // o.InterfaceC2583qj
    public final Uri w() {
        return this.l.w();
    }
}
