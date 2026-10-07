package o;

import android.net.Uri;
import android.text.TextUtils;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.aj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1024aj implements InterfaceC3046vX {
    public static final Pattern l = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // o.InterfaceC3046vX
    public final Object D(Uri uri, C2776sj c2776sj) throws IOException {
        String line = new BufferedReader(new InputStreamReader(c2776sj, AbstractC1402ed.c)).readLine();
        try {
            Matcher matcher = l.matcher(line);
            if (!matcher.matches()) {
                throw C2949uX.b("Couldn't parse timestamp: " + line, null);
            }
            String strGroup = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(strGroup).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                long j2 = Long.parseLong(matcher.group(5));
                String strGroup2 = matcher.group(7);
                time -= (((j2 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000) * j;
            }
            return Long.valueOf(time);
        } catch (ParseException e) {
            throw C2949uX.b(null, e);
        }
    }
}
