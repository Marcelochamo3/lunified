package o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: renamed from: o.vj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3067vj implements InterfaceC1610gj {
    public final /* synthetic */ int l;
    public final Comparable m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1079o;

    public /* synthetic */ C3067vj(int i, Comparable comparable, Object obj) {
        this.l = i;
        this.m = comparable;
        this.n = obj;
    }

    public static C3067vj d(Context context, Uri uri, InterfaceC2001kj0 interfaceC2001kj0) {
        return new C3067vj(2, uri, new C2303no0(com.bumptech.glide.a.a(context).f34o.b().f(), interfaceC2001kj0, com.bumptech.glide.a.a(context).p, context.getContentResolver()));
    }

    @Override // o.InterfaceC1610gj
    public final void a() {
        switch (this.l) {
            case 0:
                try {
                    C0519Jb c0519Jb = (C0519Jb) this.n;
                    ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) this.f1079o;
                    c0519Jb.getClass();
                    byteArrayInputStream.close();
                } catch (IOException unused) {
                    return;
                }
                break;
            case 1:
                Object obj = this.f1079o;
                if (obj != null) {
                    try {
                        ((InterfaceC0693Pu) this.n).z(obj);
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) this.f1079o;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // o.InterfaceC1610gj
    public final Class b() {
        switch (this.l) {
            case 0:
                ((C0519Jb) this.n).getClass();
                return InputStream.class;
            case 1:
                return ((InterfaceC0693Pu) this.n).b();
            default:
                return InputStream.class;
        }
    }

    @Override // o.InterfaceC1610gj
    public final int c() {
        switch (this.l) {
        }
        return 1;
    }

    @Override // o.InterfaceC1610gj
    public final void cancel() {
        int i = this.l;
    }

    @Override // o.InterfaceC1610gj
    public final void e(EnumC1651h30 enumC1651h30, InterfaceC1512fj interfaceC1512fj) throws Throwable {
        switch (this.l) {
            case 0:
                try {
                    C0519Jb c0519Jb = (C0519Jb) this.n;
                    String str = (String) this.m;
                    c0519Jb.getClass();
                    ByteArrayInputStream byteArrayInputStreamC = C0519Jb.C(str);
                    this.f1079o = byteArrayInputStreamC;
                    interfaceC1512fj.f(byteArrayInputStreamC);
                } catch (IllegalArgumentException e) {
                    interfaceC1512fj.d(e);
                    return;
                }
                break;
            case 1:
                try {
                    Object objT = ((InterfaceC0693Pu) this.n).t((File) this.m);
                    this.f1079o = objT;
                    interfaceC1512fj.f(objT);
                } catch (FileNotFoundException e2) {
                    Log.isLoggable("FileLoader", 3);
                    interfaceC1512fj.d(e2);
                    return;
                }
                break;
            default:
                try {
                    InputStream inputStreamI = i();
                    this.f1079o = inputStreamI;
                    interfaceC1512fj.f(inputStreamI);
                } catch (FileNotFoundException e3) {
                    Log.isLoggable("MediaStoreThumbFetcher", 3);
                    interfaceC1512fj.d(e3);
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public InputStream i() throws Throwable {
        Cursor cursorA;
        String string;
        boolean zIsEmpty;
        ContentResolver contentResolver;
        File file;
        InputStream inputStreamOpenInputStream;
        int iU;
        Uri uri = (Uri) this.m;
        C2303no0 c2303no0 = (C2303no0) this.n;
        c2303no0.getClass();
        Cursor cursor = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            cursorA = ((InterfaceC2001kj0) c2303no0.m).a(uri);
            if (cursorA != null) {
                try {
                    try {
                        if (cursorA.moveToFirst()) {
                            string = cursorA.getString(0);
                            cursorA.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorA;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (SecurityException unused) {
                    if (Log.isLoggable("ThumbStreamOpener", 3)) {
                        Objects.toString(uri);
                    }
                    if (cursorA != null) {
                    }
                    string = null;
                    zIsEmpty = TextUtils.isEmpty(string);
                    contentResolver = (ContentResolver) c2303no0.f941o;
                    if (zIsEmpty) {
                        inputStreamOpenInputStream = null;
                    } else {
                        file = new File(string);
                        if (file.exists()) {
                            inputStreamOpenInputStream = null;
                        } else {
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream != null) {
                        try {
                            try {
                                inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                iU = Jp0.u((List) c2303no0.p, inputStreamOpenInputStream2, (C1813in) c2303no0.n);
                                if (inputStreamOpenInputStream2 != null) {
                                    try {
                                        inputStreamOpenInputStream2.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                            } catch (IOException | NullPointerException unused3) {
                                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                    Objects.toString(uri);
                                }
                                if (inputStreamOpenInputStream2 != null) {
                                    try {
                                        inputStreamOpenInputStream2.close();
                                    } catch (IOException unused4) {
                                    }
                                }
                                iU = -1;
                                if (iU != -1) {
                                    return new C0483Hr(inputStreamOpenInputStream, iU);
                                }
                                return inputStreamOpenInputStream;
                            }
                        } catch (Throwable th2) {
                            if (inputStreamOpenInputStream2 != null) {
                                try {
                                    inputStreamOpenInputStream2.close();
                                } catch (IOException unused5) {
                                }
                            }
                            throw th2;
                        }
                    } else {
                        iU = -1;
                    }
                    if (iU != -1) {
                        return new C0483Hr(inputStreamOpenInputStream, iU);
                    }
                    return inputStreamOpenInputStream;
                }
                zIsEmpty = TextUtils.isEmpty(string);
                contentResolver = (ContentResolver) c2303no0.f941o;
                if (zIsEmpty) {
                    inputStreamOpenInputStream = null;
                } else {
                    file = new File(string);
                    if (file.exists() || 0 >= file.length()) {
                        inputStreamOpenInputStream = null;
                    } else {
                        Uri uriFromFile = Uri.fromFile(file);
                        try {
                            inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
                        } catch (NullPointerException e) {
                            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e));
                        }
                    }
                }
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                    iU = Jp0.u((List) c2303no0.p, inputStreamOpenInputStream2, (C1813in) c2303no0.n);
                    if (inputStreamOpenInputStream2 != null) {
                        inputStreamOpenInputStream2.close();
                    }
                } else {
                    iU = -1;
                }
                if (iU != -1) {
                    return new C0483Hr(inputStreamOpenInputStream, iU);
                }
                return inputStreamOpenInputStream;
            }
            if (cursorA != null) {
                cursorA.close();
            }
        } catch (SecurityException unused6) {
            cursorA = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        string = null;
        zIsEmpty = TextUtils.isEmpty(string);
        contentResolver = (ContentResolver) c2303no0.f941o;
        if (zIsEmpty) {
            inputStreamOpenInputStream = null;
        } else {
            file = new File(string);
            if (file.exists()) {
                inputStreamOpenInputStream = null;
            } else {
                inputStreamOpenInputStream = null;
            }
        }
        if (inputStreamOpenInputStream != null) {
            inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
            iU = Jp0.u((List) c2303no0.p, inputStreamOpenInputStream2, (C1813in) c2303no0.n);
            if (inputStreamOpenInputStream2 != null) {
                inputStreamOpenInputStream2.close();
            }
        } else {
            iU = -1;
        }
        if (iU != -1) {
            return new C0483Hr(inputStreamOpenInputStream, iU);
        }
        return inputStreamOpenInputStream;
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
