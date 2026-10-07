package o;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.WString;
import com.sun.jna.platform.win32.Guid;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.win32.W32APIOptions;
import java.net.Inet6Address;
import java.net.InetAddress;

/* JADX INFO: loaded from: classes.dex */
interface AE extends Library {
    public static final AE a = (AE) Native.load("IPHlpAPI", AE.class, W32APIOptions.ASCII_OPTIONS);
    public static final int b = 0;
    public static final int c = 2;
    public static final int d = 23;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 4;
    public static final int h = 8;
    public static final int i = 16;
    public static final int j = 32;
    public static final int k = 64;
    public static final int l = 128;
    public static final int m = 256;
    public static final int n = 512;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f168o = 1024;

    @Structure.FieldOrder({"Length", "Reserved", "Next", "Address"})
    public static class b extends Structure {
        public int a;
        public int b;
        public c.a c;
        public h d;

        public static class a extends b implements Structure.ByReference {
        }
    }

    @Structure.FieldOrder({"Length", "Reserved", "Next", "Address"})
    public static class c extends Structure {
        public int a;
        public int b;
        public a c;
        public h d;

        public static class a extends c implements Structure.ByReference {
        }
    }

    @Structure.FieldOrder({"Next", "_String"})
    public static class d extends Structure {
        public a a;
        public char[] b = new char[256];

        public static class a extends d implements Structure.ByReference {
        }
    }

    @Structure.FieldOrder({"Length", "Reserved", "Next", "Address"})
    public static class e extends Structure {
        public int a;
        public int b;
        public c.a c;
        public h d;

        public static class a extends e implements Structure.ByReference {
        }
    }

    @Structure.FieldOrder({"Length", "IfIndex", "Next", "Address", "PrefixOrigin", "SuffixOrigin", "DadState", "ValidLifetime", "PreferredLifetime", "LeaseLifetime", "OnLinkPrefixLength"})
    public static class f extends Structure {
        public int a;
        public int b;
        public a c;
        public h d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public byte k;

        public static class a extends f implements Structure.ByReference {
        }
    }

    @Structure.FieldOrder({"LowPart", "HighPart"})
    public static class g extends Structure {
        public int a;
        public int b;
    }

    @Structure.FieldOrder({"lpSockaddr", "iSockaddrLength"})
    public static class h extends Structure {
        public Pointer a;
        public int b;

        public InetAddress a() {
            short s = this.a.getShort(0L);
            if (s == 2) {
                return InetAddress.getByAddress(new j(this.a).c);
            }
            if (s != 23) {
                return null;
            }
            i iVar = new i(this.a);
            return Inet6Address.getByAddress("", iVar.d, iVar.e);
        }
    }

    @Structure.FieldOrder({"sin6_family", "sin6_port", "sin6_flowinfo", "sin6_addr", "sin6_scope_id"})
    public static class i extends Structure {
        public short a;
        public short b;
        public int c;
        public byte[] d;
        public int e;

        public i(Pointer pointer) {
            super(pointer);
            this.d = new byte[16];
            read();
        }
    }

    @Structure.FieldOrder({"sin_family", "sin_port", "sin_addr", "sin_zero"})
    public static class j extends Structure {
        public short a;
        public short b;
        public byte[] c;
        public byte[] d;

        public j(Pointer pointer) {
            super(pointer);
            this.c = new byte[4];
            this.d = new byte[8];
            read();
        }
    }

    int a(int i2, int i3, Pointer pointer, Pointer pointer2, IntByReference intByReference);

    @Structure.FieldOrder({"Length", "IfIndex", "Next", "AdapterName", "FirstUnicastAddress", "FirstAnycastAddress", "FirstMulticastAddress", "FirstDnsServerAddress", "DnsSuffix", "Description", "FriendlyName", "PhysicalAddress", "PhysicalAddressLength", "Flags", "Mtu", "IfType", "OperStatus", "Ipv6IfIndex", "ZoneIndices", "FirstPrefix", "TransmitLinkSpeed", "ReceiveLinkSpeed", "FirstWinsServerAddress", "FirstGatewayAddress", "Ipv4Metric", "Ipv6Metric", "Luid", "Dhcpv4Server", "CompartmentId", "NetworkGuid", "ConnectionType", "TunnelType", "Dhcpv6Server", "Dhcpv6ClientDuid", "Dhcpv6ClientDuidLength", "Dhcpv6Iaid", "FirstDnsSuffix"})
    public static class a extends Structure {
        public g A;
        public h B;
        public int C;
        public Guid.GUID D;
        public int E;
        public int F;
        public h G;
        public byte[] H;
        public int I;
        public int J;
        public d.a K;
        public int a;
        public int b;
        public C0000a c;
        public String d;
        public f.a e;
        public b.a f;
        public e.a g;
        public c.a h;
        public WString i;
        public WString j;
        public WString k;
        public byte[] l;
        public int m;
        public int n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f169o;
        public int p;
        public int q;
        public int r;
        public int[] s;
        public Pointer t;
        public long u;
        public long v;
        public Pointer w;
        public Pointer x;
        public int y;
        public int z;

        /* JADX INFO: renamed from: o.AE$a$a, reason: collision with other inner class name */
        public static class C0000a extends a implements Structure.ByReference {
        }

        public a(Pointer pointer) {
            super(pointer);
            this.l = new byte[8];
            this.s = new int[16];
            this.H = new byte[Yu0.b.m0];
            read();
        }

        public a() {
            this.l = new byte[8];
            this.s = new int[16];
            this.H = new byte[Yu0.b.m0];
        }
    }
}
