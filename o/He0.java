package o;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class He0 extends C2143m6 {
    public final Socket m;

    public He0(Socket socket) {
        this.m = socket;
    }

    @Override // o.C2143m6
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // o.C2143m6
    public final void k() {
        Socket socket = this.m;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!Nr0.p(e)) {
                throw e;
            }
            SV.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            SV.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
