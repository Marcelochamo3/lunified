package o;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes.dex */
public final class E2 extends Handler {
    public static final E2 a = new E2();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i;
        int iMin;
        AbstractC1474fG.j(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = D2.a;
        String loggerName = logRecord.getLoggerName();
        AbstractC1474fG.i(loggerName, "record.loggerName");
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            i = 5;
        } else {
            i = logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        }
        String message = logRecord.getMessage();
        AbstractC1474fG.i(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String strD0 = (String) D2.b.get(loggerName);
        if (strD0 == null) {
            strD0 = AbstractC1119bh0.D0(23, loggerName);
        }
        if (Log.isLoggable(strD0, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int iD0 = AbstractC1119bh0.d0(message, '\n', i2, false, 4);
                if (iD0 == -1) {
                    iD0 = length;
                }
                while (true) {
                    iMin = Math.min(iD0, i2 + 4000);
                    AbstractC1474fG.i(message.substring(i2, iMin), "this as java.lang.String…ing(startIndex, endIndex)");
                    if (iMin >= iD0) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
