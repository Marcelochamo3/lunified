package o;

import android.content.Context;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

/* JADX INFO: renamed from: o.zS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3429zS {
    public static final HashSet a = new HashSet();
    public static final boolean b;

    static {
        String property = System.getProperty("java.vm.version");
        boolean z = false;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            String strNextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (strNextToken != null && strNextToken2 != null) {
                try {
                    int i = Integer.parseInt(strNextToken);
                    int i2 = Integer.parseInt(strNextToken2);
                    if (i > 2 || (i == 2 && i2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        b = z;
    }

    public static void a(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            file.getPath();
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                file.getPath();
                return;
            }
            for (File file2 : fileArrListFiles) {
                file2.getPath();
                file2.length();
                if (file2.delete()) {
                    file2.getPath();
                } else {
                    file2.getPath();
                }
            }
            if (file.delete()) {
                file.getPath();
            } else {
                file.getPath();
            }
        }
    }

    public static void b(Context context, File file, File file2) {
        ClassLoader classLoader;
        HashSet hashSet = a;
        synchronized (hashSet) {
            try {
                if (hashSet.contains(file)) {
                    return;
                }
                hashSet.add(file);
                System.getProperty("java.vm.version");
                IOException e = null;
                try {
                    classLoader = context.getClassLoader();
                    if (!(classLoader instanceof BaseDexClassLoader)) {
                        classLoader = null;
                    }
                } catch (RuntimeException unused) {
                }
                if (classLoader == null) {
                    return;
                }
                try {
                    a(context);
                } catch (Throwable unused2) {
                }
                File file3 = new File(file2, "code_cache");
                try {
                    e(file3);
                } catch (IOException unused3) {
                    file3 = new File(context.getFilesDir(), "code_cache");
                    e(file3);
                }
                File file4 = new File(file3, "secondary-dexes");
                e(file4);
                CS cs = new CS(file, file4);
                try {
                    try {
                        d((BaseDexClassLoader) classLoader, file4, cs.i(context, false));
                    } catch (IOException unused4) {
                        d((BaseDexClassLoader) classLoader, file4, cs.i(context, true));
                    }
                    try {
                        cs.close();
                    } catch (IOException e2) {
                        e = e2;
                    }
                    if (e != null) {
                        throw e;
                    }
                } catch (Throwable th) {
                    try {
                        cs.close();
                    } catch (IOException unused5) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Field c(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        StringBuilder sbL = AbstractC1701hf0.l("Field ", str, " not found in ");
        sbL.append(obj.getClass());
        throw new NoSuchFieldException(sbL.toString());
    }

    public static void d(BaseDexClassLoader baseDexClassLoader, File file, ArrayList arrayList) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, IOException {
        Method declaredMethod;
        IOException[] iOExceptionArr;
        if (arrayList.isEmpty()) {
            return;
        }
        Object obj = c(baseDexClassLoader, "pathList").get(baseDexClassLoader);
        ArrayList<IOException> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList);
        Class<?>[] clsArr = {ArrayList.class, File.class, ArrayList.class};
        Class<?> superclass = obj.getClass();
        while (true) {
            if (superclass == null) {
                throw new NoSuchMethodException("Method makeDexElements with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
            }
            try {
                declaredMethod = superclass.getDeclaredMethod("makeDexElements", clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                    break;
                }
                break;
            } catch (NoSuchMethodException unused) {
                superclass = superclass.getSuperclass();
            }
        }
        Object[] objArr = (Object[]) declaredMethod.invoke(obj, arrayList3, file, arrayList2);
        Field fieldC = c(obj, "dexElements");
        Object[] objArr2 = (Object[]) fieldC.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        fieldC.set(obj, objArr3);
        if (arrayList2.size() > 0) {
            for (IOException iOException : arrayList2) {
            }
            Field fieldC2 = c(obj, "dexElementsSuppressedExceptions");
            IOException[] iOExceptionArr2 = (IOException[]) fieldC2.get(obj);
            if (iOExceptionArr2 == null) {
                iOExceptionArr = (IOException[]) arrayList2.toArray(new IOException[arrayList2.size()]);
            } else {
                IOException[] iOExceptionArr3 = new IOException[arrayList2.size() + iOExceptionArr2.length];
                arrayList2.toArray(iOExceptionArr3);
                System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList2.size(), iOExceptionArr2.length);
                iOExceptionArr = iOExceptionArr3;
            }
            fieldC2.set(obj, iOExceptionArr);
            IOException iOException2 = new IOException("I/O exception during makeDexElement");
            iOException2.initCause((Throwable) arrayList2.get(0));
            throw iOException2;
        }
    }

    public static void e(File file) throws IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            file.getPath();
        } else {
            file.getPath();
            parentFile.isDirectory();
            parentFile.isFile();
            parentFile.exists();
            parentFile.canRead();
            parentFile.canWrite();
        }
        throw new IOException("Failed to create directory " + file.getPath());
    }
}
