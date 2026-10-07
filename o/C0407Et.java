package o;

/* JADX INFO: renamed from: o.Et, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0407Et extends Ph0 implements InterfaceC0412Ey {
    public Object m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f249o;
    public C1951k70 p;
    public long q;
    public int r;
    public int s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0407Et(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        super(1, interfaceC0473Hh);
        this.t = str;
        this.u = str2;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        return new C0407Et(this.t, this.u, (InterfaceC0473Hh) obj).r(C2985uq0.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:32|(2:35|33)|181|36|161|37|38|167|39|155|40|41|42|163|43|44|157|45|46|(1:48)(6:49|171|50|51|74|(2:82|(4:84|(1:95)(2:86|(2:88|(2:90|(1:92)(1:93))(1:95))(1:94))|96|97)(4:98|(2:100|(2:102|(2:104|(2:106|(4:108|(3:169|114|(1:116))(1:113)|119|(7:121|(1:123)|124|(4:127|(4:176|129|(1:132)|(3:174|134|180)(1:179))(3:173|135|178)|177|125)|175|136|137)(2:138|139))(2:143|144))(2:145|146))(2:147|148)))|149|150))(2:77|(1:79)(3:80|81|(20:32|(2:35|33)|181|36|161|37|38|167|39|155|40|41|42|163|43|44|157|45|46|(1:48)(8:49|171|50|51|74|(0)|82|(4:84|(1:95)(2:86|(2:88|(2:90|(1:92)(1:93))(1:95))(1:94))|96|97)(4:98|(2:100|(2:102|(2:104|(2:106|(5:108|(1:110)|169|114|(1:116))(2:143|144))(2:145|146))(2:147|148)))|149|150)))(2:153|154))))) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:49|171|50|51|74|(2:82|(4:84|(1:95)(2:86|(2:88|(2:90|(1:92)(1:93))(1:95))(1:94))|96|97)(4:98|(2:100|(2:102|(2:104|(2:106|(4:108|(3:169|114|(1:116))(1:113)|119|(7:121|(1:123)|124|(4:127|(4:176|129|(1:132)|(3:174|134|180)(1:179))(3:173|135|178)|177|125)|175|136|137)(2:138|139))(2:143|144))(2:145|146))(2:147|148)))|149|150))(2:77|(1:79)(3:80|81|(20:32|(2:35|33)|181|36|161|37|38|167|39|155|40|41|42|163|43|44|157|45|46|(1:48)(8:49|171|50|51|74|(0)|82|(4:84|(1:95)(2:86|(2:88|(2:90|(1:92)(1:93))(1:95))(1:94))|96|97)(4:98|(2:100|(2:102|(2:104|(2:106|(5:108|(1:110)|169|114|(1:116))(2:143|144))(2:145|146))(2:147|148)))|149|150)))(2:153|154)))) */
    /* JADX WARN: Code duplicated, block: B:100:0x0274  */
    /* JADX WARN: Code duplicated, block: B:102:0x027c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0284  */
    /* JADX WARN: Code duplicated, block: B:106:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:108:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:110:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:121:0x0308  */
    /* JADX WARN: Code duplicated, block: B:123:0x0310  */
    /* JADX WARN: Code duplicated, block: B:127:0x0337  */
    /* JADX WARN: Code duplicated, block: B:132:0x0352  */
    /* JADX WARN: Code duplicated, block: B:138:0x0365  */
    /* JADX WARN: Code duplicated, block: B:143:0x0372  */
    /* JADX WARN: Code duplicated, block: B:145:0x037a  */
    /* JADX WARN: Code duplicated, block: B:147:0x0382  */
    /* JADX WARN: Code duplicated, block: B:151:0x0392 A[LOOP:2: B:67:0x01d0->B:151:0x0392, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:173:0x035c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x0355 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0343 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x0331 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x03a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x010f  */
    /* JADX WARN: Code duplicated, block: B:35:0x015a A[LOOP:1: B:33:0x0154->B:35:0x015a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x019e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x019f  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x01fc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x020d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x0243  */
    /* JADX WARN: Code duplicated, block: B:86:0x0249  */
    /* JADX WARN: Code duplicated, block: B:88:0x024d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0251  */
    /* JADX WARN: Code duplicated, block: B:92:0x0255  */
    /* JADX WARN: Code duplicated, block: B:93:0x025e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0261  */
    /* JADX WARN: Code duplicated, block: B:95:0x0264  */
    /* JADX WARN: Code duplicated, block: B:98:0x026a  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01ae, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01af, code lost:
    
        r4 = r0;
        r0 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b1, code lost:
    
        r7 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01b3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01b5, code lost:
    
        r4 = r0;
        r3 = r7;
        r0 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01bd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01be, code lost:
    
        r8 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01c1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c2, code lost:
    
        r8 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01c5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c6, code lost:
    
        r8 = r31;
        r7 = r28;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x022b -> B:81:0x022c). Please report as a decompilation issue!!! */
    @Override // o.R7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 942
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0407Et.r(java.lang.Object):java.lang.Object");
    }
}
