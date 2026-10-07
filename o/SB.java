package o;

import java.net.URI;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class SB {
    public static final I60 a = new I60("([?&]token=)([A-Za-z0-9_-]+\\.[A-Za-z0-9_-]+\\.)([A-Za-z0-9_-]{129,})(?=&|$)");
    public static final Set b = Lc0.T("application/vnd.apple.mpegurl", "application/x-mpegurl", "application/mpegurl", "audio/mpegurl", "audio/x-mpegurl", "audio/vnd.apple.mpegurl");
    public static final List c = AbstractC0937Ze.K(".m3u8", "/hls/", "/m3/", "m.php", "doc.php", "master.php", "playlist.php", "playlist.txt", "master.txt");
    public static final I60 d;
    public static final I60 e;

    static {
        J60 j60 = J60.IGNORE_CASE;
        d = new I60("https?://[^\\s\\\"'<>\\\\]+(?:\\.m3u8|/hls/|/m3/)[^\\s\\\"'<>\\\\]*", j60);
        e = new I60("(?:[\\\"']?)(?:url|file|source|src|stream|hls|hlsUrl|manifest|playbackUrl|playback_url|playlist|playlistUrl|playlist_url|master)(?:[\\\"']?)\\s*[:=]\\s*[\\\"']([^\\\"']+)[\\\"']", j60);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00b7  */
    public static boolean a(String str, String str2, String str3, String str4) {
        String lowerCase;
        boolean z;
        Pattern patternCompile;
        String string;
        String string2;
        AbstractC1474fG.j(str, "url");
        Locale locale = Locale.ROOT;
        String lowerCase2 = str.toLowerCase(locale);
        AbstractC1474fG.i(lowerCase2, "toLowerCase(...)");
        if ((!AbstractC1899jh0.U(lowerCase2, "http://", false) && !AbstractC1899jh0.U(lowerCase2, "https://", false)) || d(lowerCase2)) {
            return false;
        }
        if ((str4 != null && (string2 = AbstractC1119bh0.H0(str4).toString()) != null && AbstractC1899jh0.U(string2, "#EXTM3U", true)) || c(str2) || c(str3)) {
            return true;
        }
        if ((str3 != null && AbstractC1119bh0.W(str3, "hls", true)) || AbstractC1119bh0.W(lowerCase2, ".m3u8", false)) {
            return true;
        }
        if (str2 == null || (string = AbstractC1119bh0.E0(AbstractC1119bh0.A0(str2, ';', str2)).toString()) == null) {
            lowerCase = null;
        } else {
            lowerCase = string.toLowerCase(locale);
            AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        }
        List list = c;
        if ((list instanceof Collection) && list.isEmpty()) {
            patternCompile = Pattern.compile("https?://[0-9a-z.-]+/m3/[0-9a-zA-Z_-]+");
            AbstractC1474fG.i(patternCompile, "compile(...)");
            if (!patternCompile.matcher(str).find()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    patternCompile = Pattern.compile("https?://[0-9a-z.-]+/m3/[0-9a-zA-Z_-]+");
                    AbstractC1474fG.i(patternCompile, "compile(...)");
                    if (!patternCompile.matcher(str).find()) {
                        z = false;
                    }
                } else if (AbstractC1119bh0.W(lowerCase2, (CharSequence) it.next(), false)) {
                }
                z = true;
            }
        }
        if (AbstractC1474fG.b(lowerCase, "text/plain")) {
            return z;
        }
        if (AbstractC1474fG.b(lowerCase, "application/octet-stream")) {
            return AbstractC1899jh0.L(lowerCase2, ".gg", false) || z;
        }
        return false;
    }

    public static /* synthetic */ boolean b(int i, String str, String str2, String str3) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        return a(str, str2, null, str3);
    }

    public static boolean c(String str) {
        String string;
        if (str == null || (string = AbstractC1119bh0.E0(AbstractC1119bh0.A0(str, ';', str)).toString()) == null) {
            return false;
        }
        String lowerCase = string.toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        return b.contains(lowerCase) || AbstractC1899jh0.L(lowerCase, "mpegurl", false);
    }

    public static boolean d(String str) {
        Object objK;
        try {
            String path = new URI(str).getPath();
            if (path != null) {
                objK = path.toLowerCase(Locale.ROOT);
                AbstractC1474fG.i(objK, "toLowerCase(...)");
            } else {
                objK = null;
            }
            if (objK == null) {
                objK = "";
            }
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        Object obj = str;
        if (!(objK instanceof C2439p80)) {
            obj = objK;
        }
        String str2 = (String) obj;
        return AbstractC1899jh0.L(str2, ".ts", false) || AbstractC1899jh0.L(str2, ".m4s", false) || AbstractC1899jh0.L(str2, ".aac", false) || AbstractC1899jh0.L(str2, ".vtt", false) || AbstractC1119bh0.W(str2, "/seg-", false) || AbstractC1119bh0.W(str2, "/segment", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0106, code lost:
    
        if (r7 == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String e(java.lang.String r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SB.e(java.lang.String, java.lang.String):java.lang.String");
    }

    public static boolean f(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        if ((!AbstractC1899jh0.U(lowerCase, "http://", false) && !AbstractC1899jh0.U(lowerCase, "https://", false)) || d(lowerCase)) {
            return false;
        }
        List listK = AbstractC0937Ze.K("m.php", "doc.php", "master.php", "playlist.php", "playlist.txt", "master.txt", "canal.php", "?stream=", "&stream=", "/m3/");
        if (listK.isEmpty()) {
            return false;
        }
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            if (AbstractC1119bh0.W(lowerCase, (CharSequence) it.next(), false)) {
                return true;
            }
        }
        return false;
    }
}
