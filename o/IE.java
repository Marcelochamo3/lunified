package o;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class IE extends AP {
    public static final Pattern f = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder d = AbstractC1402ed.c.newDecoder();
    public final CharsetDecoder e = AbstractC1402ed.b.newDecoder();

    @Override // o.AP
    public final CQ e(DQ dq, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.e;
        CharsetDecoder charsetDecoder2 = this.d;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
            charsetDecoder2.reset();
            byteBuffer.rewind();
        } catch (CharacterCodingException unused) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } catch (Throwable th2) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            throw th2;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new CQ(new KE(bArr, null, null));
        }
        Matcher matcher = f.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strI = U9.I(strGroup);
                strI.getClass();
                if (strI.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strI.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new CQ(new KE(bArr, str, str2));
    }
}
