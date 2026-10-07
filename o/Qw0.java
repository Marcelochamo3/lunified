package o;

import com.sun.jna.Memory;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.Win32Exception;
import com.sun.jna.ptr.IntByReference;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.List;
import lombok.Generated;

/* JADX INFO: loaded from: classes.dex */
public class Qw0 implements K70 {

    @Generated
    private static final CL b = DL.d(Qw0.class);
    private b a;

    public static final class b extends AbstractC2341o8 {

        @Generated
        private static final CL f;

        static {
            CL clD = DL.d(b.class);
            f = clD;
            clD.R(Memory.class.getName(), Win32Exception.class.getName(), "Checking for JNA classes: {} and {}");
        }

        private b() {
        }

        @Override // o.K70
        public void a() throws HF {
            m();
            Memory memory = new Memory(15360L);
            IntByReference intByReference = new IntByReference(0);
            AE ae = AE.a;
            if (ae.a(0, 39, Pointer.NULL, memory, intByReference) == 111) {
                memory = new Memory(intByReference.getValue());
                int iA = ae.a(0, 39, Pointer.NULL, memory, intByReference);
                if (iA != 0) {
                    throw new HF((Exception) new Win32Exception(iA));
                }
            }
            AE.a aVar = new AE.a(memory);
            do {
                if (aVar.q == 1) {
                    for (AE.c.a aVar2 = aVar.h; aVar2 != null; aVar2 = aVar2.c) {
                        try {
                            InetAddress inetAddressA = aVar2.d.a();
                            if ((inetAddressA instanceof Inet4Address) || !inetAddressA.isSiteLocalAddress()) {
                                g(new InetSocketAddress(inetAddressA, 53));
                            } else {
                                f.R(inetAddressA, Integer.valueOf(aVar.b), "Skipped site-local IPv6 server address {} on adapter index {}");
                            }
                        } catch (UnknownHostException e) {
                            f.g("Invalid nameserver address on adapter index {}", Integer.valueOf(aVar.b), e);
                        }
                    }
                    h(aVar.i.toString());
                    for (AE.d.a aVar3 = aVar.K; aVar3 != null; aVar3 = aVar3.a) {
                        h(String.valueOf(aVar3.b));
                    }
                }
                aVar = aVar.c;
            } while (aVar != null);
        }
    }

    public Qw0() {
        if (System.getProperty("os.name").contains("Windows")) {
            try {
                this.a = new b();
            } catch (NoClassDefFoundError unused) {
                b.M("JNA not available");
            }
        }
    }

    @Override // o.K70
    public void a() throws HF {
        this.a.a();
    }

    @Override // o.K70
    public final /* synthetic */ int b() {
        return J70.b(this);
    }

    @Override // o.K70
    public List<InetSocketAddress> c() {
        return this.a.c();
    }

    @Override // o.K70
    public List<C2848tT> d() {
        return this.a.d();
    }

    @Override // o.K70
    public boolean isEnabled() {
        return this.a != null;
    }
}
