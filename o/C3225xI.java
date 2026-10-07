package o;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXParseException;

/* JADX INFO: renamed from: o.xI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3225xI implements InterfaceC2583qj {
    public final InterfaceC2583qj l;
    public final String m;
    public final Context n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f1114o;
    public byte[] p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;

    public C3225xI(InterfaceC2583qj interfaceC2583qj, String str, Context context, String str2) {
        AbstractC1474fG.j(context, "context");
        this.l = interfaceC2583qj;
        this.m = str;
        this.n = context;
        this.f1114o = str2;
    }

    public static String b(String str) {
        return AbstractC1216ch0.G("\n                <?xml version=\"1.0\" encoding=\"UTF-8\"?>\n                <MPD xmlns=\"urn:mpeg:dash:schema:mpd:2011\" xmlns:cenc=\"urn:mpeg:cenc:2013\" profiles=\"urn:mpeg:dash:profile:isoff-live:2011\" minBufferTime=\"PT2S\" type=\"dynamic\">\n                    <Period id=\"1\" start=\"PT0S\">\n                        <AdaptationSet id=\"1\" contentType=\"video\" mimeType=\"video/mp4\" segmentAlignment=\"true\">\n                            <ContentProtection schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" value=\"cenc\" cenc:default_KID=\"" + str + "\" default_KID=\"" + str + "\"/>\n                            <SegmentTemplate timescale=\"1000\" media=\"segment-$Number$.m4s\" startNumber=\"1\" duration=\"2000\"/>\n                            <Representation id=\"1\" codecs=\"avc1.64001f\" bandwidth=\"1000000\" width=\"1280\" height=\"720\"/>\n                        </AdaptationSet>\n                        <AdaptationSet id=\"2\" contentType=\"audio\" mimeType=\"audio/mp4\" segmentAlignment=\"true\">\n                            <ContentProtection schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" value=\"cenc\" cenc:default_KID=\"" + str + "\" default_KID=\"" + str + "\"/>\n                            <SegmentTemplate timescale=\"1000\" media=\"audio-$Number$.m4s\" startNumber=\"1\" duration=\"2000\"/>\n                            <Representation id=\"2\" codecs=\"mp4a.40.2\" bandwidth=\"128000\"/>\n                        </AdaptationSet>\n                    </Period>\n                </MPD>\n            ");
    }

    public static UUID e(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("Byte array must be 16 bytes long".toString());
        }
        UUID uuid = new UUID(((((long) bArr[0]) & 255) << 56) | ((((long) bArr[1]) & 255) << 48) | ((((long) bArr[2]) & 255) << 40) | ((((long) bArr[3]) & 255) << 32) | ((((long) bArr[4]) & 255) << 24) | ((((long) bArr[5]) & 255) << 16) | ((((long) bArr[6]) & 255) << 8) | (((long) bArr[7]) & 255), ((((long) bArr[13]) & 255) << 16) | ((((long) bArr[8]) & 255) << 56) | ((((long) bArr[9]) & 255) << 48) | ((((long) bArr[10]) & 255) << 40) | ((((long) bArr[11]) & 255) << 32) | ((((long) bArr[12]) & 255) << 24) | ((((long) bArr[14]) & 255) << 8) | (255 & ((long) bArr[15])));
        uuid.toString();
        return uuid;
    }

    public static byte[] f(String str) throws Exception {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        try {
            XF xfH = U9.H(U9.L(0, length), 2);
            int i = xfH.l;
            int i2 = xfH.m;
            int i3 = xfH.n;
            if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
                while (true) {
                    bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
                    if (i == i2) {
                        break;
                    }
                    i += i3;
                }
            }
            return bArr;
        } catch (Exception e) {
            e.getMessage();
            throw e;
        }
    }

    @Override // o.InterfaceC2000kj
    public final int D(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        AbstractC1474fG.j(bArr, "buffer");
        if (!this.s) {
            return -1;
        }
        if (!this.r || (bArr2 = this.p) == null) {
            return this.l.D(bArr, i, i2);
        }
        AbstractC1474fG.g(bArr2);
        int length = bArr2.length - this.q;
        if (length <= 0) {
            return -1;
        }
        int iMin = Math.min(i2, length);
        try {
            byte[] bArr3 = this.p;
            AbstractC1474fG.g(bArr3);
            System.arraycopy(bArr3, this.q, bArr, i, iMin);
            this.q += iMin;
            return iMin;
        } catch (Exception e) {
            e.getMessage();
            h("Error leyendo manifest: " + e.getMessage());
            return -1;
        }
    }

    public final String c(String str) {
        if (str.length() != 0 && str.length() == 32) {
            Pattern patternCompile = Pattern.compile("[0-9a-fA-F]+");
            AbstractC1474fG.i(patternCompile, "compile(...)");
            if (patternCompile.matcher(str).matches()) {
                try {
                    byte[] bArrF = f(AbstractC1899jh0.R(str, "-", "", false));
                    if (bArrF.length != 16) {
                        return str;
                    }
                    String string = e(bArrF).toString();
                    AbstractC1474fG.i(string, "toString(...)");
                    String lowerCase = string.toLowerCase(Locale.ROOT);
                    AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                    return lowerCase;
                } catch (Exception e) {
                    e.getMessage();
                    h("Error formatting KID: " + e.getMessage());
                    return str;
                }
            }
        }
        h("Invalid KID format: ".concat(str));
        return str;
    }

    @Override // o.InterfaceC2583qj
    public final void close() {
        this.p = null;
        this.q = 0;
        this.r = false;
        this.s = false;
        if (this.t) {
            try {
                this.l.close();
                this.t = false;
            } catch (Exception e) {
                h("Error cerrando DataSource: " + e.getMessage());
                e.getMessage();
            }
        }
    }

    public final String g(String str, String str2) {
        C3225xI c3225xI;
        String str3;
        C3225xI c3225xI2;
        String str4;
        boolean z;
        C3225xI c3225xI3 = this;
        String str5 = str2;
        try {
            try {
                DocumentBuilder documentBuilderNewDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                try {
                    try {
                        try {
                            Charset charset = StandardCharsets.UTF_8;
                            try {
                                AbstractC1474fG.i(charset, "UTF_8");
                                byte[] bytes = str.getBytes(charset);
                                AbstractC1474fG.i(bytes, "getBytes(...)");
                                Document document = documentBuilderNewDocumentBuilder.parse(new ByteArrayInputStream(bytes));
                                try {
                                    document.getDocumentElement().normalize();
                                    document.getDocumentElement().setAttribute("xmlns:cenc", "urn:mpeg:cenc:2013");
                                    String strC = c3225xI3.c(str5);
                                    NodeList elementsByTagName = document.getElementsByTagName("AdaptationSet");
                                    elementsByTagName.getLength();
                                    int length = elementsByTagName.getLength();
                                    int i = 0;
                                    boolean z2 = false;
                                    while (i < length) {
                                        int i2 = length;
                                        try {
                                            Node nodeItem = elementsByTagName.item(i);
                                            AbstractC1474fG.h(nodeItem, "null cannot be cast to non-null type org.w3c.dom.Element");
                                            Element element = (Element) nodeItem;
                                            NodeList nodeList = elementsByTagName;
                                            NodeList elementsByTagName2 = element.getElementsByTagName("ContentProtection");
                                            elementsByTagName2.getLength();
                                            int length2 = elementsByTagName2.getLength();
                                            int i3 = 0;
                                            while (true) {
                                                if (i3 >= length2) {
                                                    z = false;
                                                    break;
                                                }
                                                int i4 = length2;
                                                Node nodeItem2 = elementsByTagName2.item(i3);
                                                AbstractC1474fG.h(nodeItem2, "null cannot be cast to non-null type org.w3c.dom.Element");
                                                Element element2 = (Element) nodeItem2;
                                                NodeList nodeList2 = elementsByTagName2;
                                                if (AbstractC1474fG.b(element2.getAttribute("schemeIdUri"), "urn:mpeg:dash:mp4protection:2011")) {
                                                    element2.setAttribute("cenc:default_KID", strC);
                                                    element2.setAttribute("default_KID", strC);
                                                    z = true;
                                                    z2 = true;
                                                    break;
                                                }
                                                i3++;
                                                length2 = i4;
                                                elementsByTagName2 = nodeList2;
                                            }
                                            if (!z) {
                                                Element elementCreateElement = document.createElement("ContentProtection");
                                                elementCreateElement.setAttribute("schemeIdUri", "urn:mpeg:dash:mp4protection:2011");
                                                elementCreateElement.setAttribute("value", "cenc");
                                                elementCreateElement.setAttribute("cenc:default_KID", strC);
                                                elementCreateElement.setAttribute("default_KID", strC);
                                                element.insertBefore(elementCreateElement, element.getFirstChild());
                                                z2 = true;
                                            }
                                            i++;
                                            length = i2;
                                            elementsByTagName = nodeList;
                                        } catch (Exception e) {
                                            e = e;
                                            c3225xI2 = this;
                                            str3 = str2;
                                            c3225xI = c3225xI2;
                                            e.getMessage();
                                            c3225xI.h("Error modificando manifest: " + e.getMessage());
                                            return b(c3225xI.c(str3));
                                        }
                                    }
                                    if (!z2) {
                                        NodeList elementsByTagName3 = document.getElementsByTagName("Period");
                                        elementsByTagName3.getLength();
                                        if (elementsByTagName3.getLength() == 0) {
                                            h("Error: No se encontraron Period ni AdaptationSet");
                                            return b(strC);
                                        }
                                        int length3 = elementsByTagName3.getLength();
                                        for (int i5 = 0; i5 < length3; i5++) {
                                            Node nodeItem3 = elementsByTagName3.item(i5);
                                            AbstractC1474fG.h(nodeItem3, "null cannot be cast to non-null type org.w3c.dom.Element");
                                            Element elementCreateElement2 = document.createElement("ContentProtection");
                                            elementCreateElement2.setAttribute("schemeIdUri", "urn:mpeg:dash:mp4protection:2011");
                                            elementCreateElement2.setAttribute("value", "cenc");
                                            elementCreateElement2.setAttribute("cenc:default_KID", strC);
                                            elementCreateElement2.setAttribute("default_KID", strC);
                                            ((Element) nodeItem3).appendChild(elementCreateElement2);
                                        }
                                    }
                                    NodeList elementsByTagName4 = document.getElementsByTagName("ContentProtection");
                                    int length4 = elementsByTagName4.getLength();
                                    for (int i6 = 0; i6 < length4; i6++) {
                                        Node nodeItem4 = elementsByTagName4.item(i6);
                                        AbstractC1474fG.h(nodeItem4, "null cannot be cast to non-null type org.w3c.dom.Element");
                                        Element element3 = (Element) nodeItem4;
                                        element3.getAttribute("schemeIdUri");
                                        element3.getAttribute("cenc:default_KID");
                                        element3.getAttribute("default_KID");
                                    }
                                    Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
                                    StreamResult streamResult = new StreamResult(new StringWriter());
                                    transformerNewTransformer.transform(new DOMSource(document), streamResult);
                                    String string = streamResult.getWriter().toString();
                                    if (string.length() != 0) {
                                        return string;
                                    }
                                    h("Error: Manifest modificado vacío");
                                    return b(strC);
                                } catch (Exception e2) {
                                    e = e2;
                                    c3225xI2 = c3225xI3;
                                }
                            } catch (SAXParseException e3) {
                                e = e3;
                                str4 = str2;
                                e.getMessage();
                                e.getLineNumber();
                                e.getColumnNumber();
                                c3225xI3.h("Error XML inválido: " + e.getMessage());
                                return b(c3225xI3.c(str4));
                            }
                        } catch (Exception e4) {
                            e4.getMessage();
                            c3225xI3.h("Error inesperado parseando manifest: " + e4.getMessage());
                            return b(c3225xI3.c(str2));
                        }
                    } catch (SAXParseException e5) {
                        e = e5;
                        str4 = str5;
                    }
                } catch (Exception e6) {
                    e = e6;
                    str3 = c3225xI3;
                    c3225xI = str5;
                    e.getMessage();
                    c3225xI.h("Error modificando manifest: " + e.getMessage());
                    return b(c3225xI.c(str3));
                }
            } catch (Exception e7) {
                e = e7;
                c3225xI2 = str5;
            }
        } catch (Exception e8) {
            e = e8;
            c3225xI = c3225xI3;
            str3 = str5;
        }
    }

    public final void h(String str) {
        Context context = this.n;
        AbstractC1474fG.j(context, "context");
        AbstractC1474fG.j(str, "message");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!AbstractC1474fG.b(str, AbstractC1468fA.T) || jCurrentTimeMillis - AbstractC1468fA.U >= 8000) {
            AbstractC1468fA.T = str;
            AbstractC1468fA.U = jCurrentTimeMillis;
            new Handler(Looper.getMainLooper()).post(new O3(context, 10, str));
        }
    }

    @Override // o.InterfaceC2583qj
    public final void k(InterfaceC2590qm0 interfaceC2590qm0) {
        AbstractC1474fG.j(interfaceC2590qm0, "transferListener");
        this.l.k(interfaceC2590qm0);
    }

    @Override // o.InterfaceC2583qj
    public final Map l() {
        Map mapL = this.l.l();
        AbstractC1474fG.i(mapL, "getResponseHeaders(...)");
        return mapL;
    }

    @Override // o.InterfaceC2583qj
    public final long v(C2970uj c2970uj) throws Exception {
        String str;
        String str2;
        Object next;
        Uri uri;
        E9 e9;
        byte[] bArr;
        List list;
        String str3;
        AbstractC1474fG.j(c2970uj, "dataSpec");
        String string = c2970uj.a.toString();
        AbstractC1474fG.i(string, "toString(...)");
        boolean zW = AbstractC1119bh0.W(string, ".mpd", true);
        InterfaceC2583qj interfaceC2583qj = this.l;
        if ((!zW && ((str3 = this.f1114o) == null || !AbstractC1474fG.b(string, str3))) || (str = this.m) == null || str.length() <= 0) {
            this.r = false;
            this.s = true;
            this.t = true;
            return interfaceC2583qj.v(c2970uj);
        }
        this.r = true;
        try {
            E9 e10 = new E9();
            byte[] bArr2 = new byte[16384];
            interfaceC2583qj.v(c2970uj);
            this.t = true;
            while (true) {
                int iD = interfaceC2583qj.D(bArr2, 0, 16384);
                if (iD == -1) {
                    break;
                }
                e10.d0(bArr2, 0, iD);
            }
            Charset charset = StandardCharsets.UTF_8;
            AbstractC1474fG.i(charset, "UTF_8");
            String strY = e10.Y(e10.m, charset);
            if (strY.length() == 0) {
                h("Error: Manifest vacío");
                throw new Exception("Empty manifest received");
            }
            byte[] bytes = g(strY, str).getBytes(charset);
            AbstractC1474fG.i(bytes, "getBytes(...)");
            this.p = bytes;
            if (bytes.length == 0) {
                h("Error: Manifest modificado vacío");
                throw new Exception("Modified manifest is empty");
            }
            this.q = 0;
            this.s = true;
            byte[] bArr3 = this.p;
            AbstractC1474fG.g(bArr3);
            return bArr3.length;
        } catch (C1472fE e) {
            int i = e.f770o;
            if (i != 302 || !(interfaceC2583qj instanceof InterfaceC1570gE)) {
                h("Error HTTP: " + i);
                Objects.toString(e.p);
                throw e;
            }
            Map mapL = ((InterfaceC1570gE) interfaceC2583qj).l();
            AbstractC1474fG.i(mapL, "getResponseHeaders(...)");
            mapL.toString();
            Iterator it = mapL.entrySet().iterator();
            do {
                str2 = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC1899jh0.N((String) ((Map.Entry) next).getKey(), "Location", true));
            Map.Entry entry = (Map.Entry) next;
            if (entry != null && (list = (List) entry.getValue()) != null) {
                str2 = (String) AbstractC0911Ye.d0(list);
            }
            if (str2 == null) {
                h("Error: No se encontró URL de redirección");
                mapL.toString();
                throw new Exception("Missing Location header in 302 response");
            }
            try {
                try {
                    interfaceC2583qj.close();
                    this.t = false;
                    while (true) {
                        int iD2 = interfaceC2583qj.D(bArr, 0, 16384);
                        if (iD2 == -1) {
                            break;
                        }
                        e9.d0(bArr, 0, iD2);
                    }
                } catch (Exception e2) {
                    e2.getMessage();
                }
                interfaceC2583qj.v(new C2970uj(uri, 0L, 1, null, c2970uj.e, 0L, -1L, null, 0, null));
                this.t = true;
                e9 = new E9();
                bArr = new byte[16384];
                Charset charset2 = StandardCharsets.UTF_8;
                AbstractC1474fG.i(charset2, "UTF_8");
                String strY2 = e9.Y(e9.m, charset2);
                if (strY2.length() == 0) {
                    h("Error: Manifest redirigido vacío");
                    throw new Exception("Redirected manifest is empty");
                }
                byte[] bytes2 = g(strY2, str).getBytes(charset2);
                AbstractC1474fG.i(bytes2, "getBytes(...)");
                this.p = bytes2;
                if (bytes2.length == 0) {
                    h("Error: Manifest modificado redirigido vacío");
                    throw new Exception("Modified redirected manifest is empty");
                }
                this.q = 0;
                this.s = true;
                byte[] bArr4 = this.p;
                AbstractC1474fG.g(bArr4);
                return bArr4.length;
            } catch (Exception e3) {
                h("Error procesando manifest redirigido: " + e3.getMessage());
                e3.getMessage();
                throw e3;
            }
            Collections.emptyMap();
            uri = Uri.parse(str2);
            AbstractC0397Ej.h(uri, "The uri must be set.");
        } catch (Exception e4) {
            h("Error procesando manifest: " + e4.getMessage());
            e4.getMessage();
            Objects.toString(e4.getCause());
            try {
                interfaceC2583qj.close();
            } catch (Exception unused) {
            }
            this.t = false;
            throw e4;
        }
    }

    @Override // o.InterfaceC2583qj
    public final Uri w() {
        return this.l.w();
    }
}
