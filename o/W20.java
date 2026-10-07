package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class W20 {
    public static final Class[] e = {Context.class, AttributeSet.class};
    public static final HashMap f = new HashMap();
    public final Context a;
    public final X20 c;
    public final Object[] b = new Object[2];
    public final String[] d = {Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};

    public W20(Context context, X20 x20) {
        this.a = context;
        this.c = x20;
    }

    public final Preference a(String str, String[] strArr, AttributeSet attributeSet) throws ClassNotFoundException {
        Class<?> cls;
        HashMap map = f;
        Constructor<?> constructor = (Constructor) map.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.a.getClassLoader();
                    if (strArr == null || strArr.length == 0) {
                        cls = Class.forName(str, false, classLoader);
                    } else {
                        cls = null;
                        ClassNotFoundException e2 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e3) {
                                e2 = e3;
                            }
                        }
                        if (cls == null) {
                            if (e2 != null) {
                                throw e2;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                    }
                    constructor = cls.getConstructor(e);
                    constructor.setAccessible(true);
                    map.put(str, constructor);
                } catch (ClassNotFoundException e4) {
                    throw e4;
                }
            } catch (Exception e5) {
                InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                inflateException.initCause(e5);
                throw inflateException;
            }
        }
        Object[] objArr = this.b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    public final Preference b(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? a(str, this.d, attributeSet) : a(str, null, attributeSet);
        } catch (InflateException e2) {
            throw e2;
        } catch (ClassNotFoundException e3) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e3);
            throw inflateException;
        } catch (Exception e4) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e4);
            throw inflateException2;
        }
    }

    public final PreferenceGroup c(XmlResourceParser xmlResourceParser) {
        int next;
        PreferenceGroup preferenceGroup;
        synchronized (this.b) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
            this.b[0] = this.a;
            do {
                try {
                    try {
                        next = xmlResourceParser.next();
                        if (next == 2) {
                            break;
                        }
                    } catch (IOException e2) {
                        InflateException inflateException = new InflateException(xmlResourceParser.getPositionDescription() + ": " + e2.getMessage());
                        inflateException.initCause(e2);
                        throw inflateException;
                    } catch (XmlPullParserException e3) {
                        InflateException inflateException2 = new InflateException(e3.getMessage());
                        inflateException2.initCause(e3);
                        throw inflateException2;
                    }
                } catch (InflateException e4) {
                    throw e4;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlResourceParser.getPositionDescription() + ": No start tag found!");
            }
            preferenceGroup = (PreferenceGroup) b(xmlResourceParser.getName(), attributeSetAsAttributeSet);
            preferenceGroup.k(this.c);
            d(xmlResourceParser, preferenceGroup, attributeSetAsAttributeSet);
        }
        return preferenceGroup;
    }

    public final void d(XmlResourceParser xmlResourceParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        long jB;
        int depth = xmlResourceParser.getDepth();
        while (true) {
            int next = xmlResourceParser.next();
            if ((next == 3 && xmlResourceParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.x = Intent.parseIntent(this.a.getResources(), xmlResourceParser, attributeSet);
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e2);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    Resources resources = this.a.getResources();
                    if (preference.z == null) {
                        preference.z = new Bundle();
                    }
                    resources.parseBundleExtra("extra", attributeSet, preference.z);
                    try {
                        int depth2 = xmlResourceParser.getDepth();
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if (next2 == 1 || (next2 == 3 && xmlResourceParser.getDepth() <= depth2)) {
                                break;
                            }
                        }
                    } catch (IOException e3) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e3);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference preferenceB = b(name, attributeSet);
                    PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
                    if (!preferenceGroup.Z.contains(preferenceB)) {
                        if (preferenceB.w != null) {
                            PreferenceGroup preferenceGroup2 = preferenceGroup;
                            while (true) {
                                PreferenceGroup preferenceGroup3 = preferenceGroup2.T;
                                if (preferenceGroup3 == null) {
                                    break;
                                } else {
                                    preferenceGroup2 = preferenceGroup3;
                                }
                            }
                            preferenceGroup2.A(preferenceB.w);
                        }
                        int i = preferenceB.r;
                        if (i == Integer.MAX_VALUE) {
                            if (preferenceGroup.a0) {
                                int i2 = preferenceGroup.b0;
                                preferenceGroup.b0 = i2 + 1;
                                if (i2 != i) {
                                    preferenceB.r = i2;
                                    V20 v20 = preferenceB.R;
                                    if (v20 != null) {
                                        Handler handler = v20.h;
                                        RunnableC3102w1 runnableC3102w1 = v20.i;
                                        handler.removeCallbacks(runnableC3102w1);
                                        handler.post(runnableC3102w1);
                                    }
                                }
                            }
                            if (preferenceB instanceof PreferenceGroup) {
                                ((PreferenceGroup) preferenceB).a0 = preferenceGroup.a0;
                            }
                        }
                        int iBinarySearch = Collections.binarySearch(preferenceGroup.Z, preferenceB);
                        if (iBinarySearch < 0) {
                            iBinarySearch = (iBinarySearch * (-1)) - 1;
                        }
                        boolean zX = preferenceGroup.x();
                        if (preferenceB.G == zX) {
                            preferenceB.G = !zX;
                            preferenceB.i(preferenceB.x());
                            preferenceB.h();
                        }
                        synchronized (preferenceGroup) {
                            preferenceGroup.Z.add(iBinarySearch, preferenceB);
                        }
                        X20 x20 = preferenceGroup.m;
                        String str = preferenceB.w;
                        if (str == null || !preferenceGroup.Y.containsKey(str)) {
                            jB = x20.b();
                        } else {
                            jB = ((Long) preferenceGroup.Y.get(str)).longValue();
                            preferenceGroup.Y.remove(str);
                        }
                        preferenceB.n = jB;
                        preferenceB.f30o = true;
                        try {
                            preferenceB.k(x20);
                            preferenceB.f30o = false;
                            if (preferenceB.T != null) {
                                throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
                            }
                            preferenceB.T = preferenceGroup;
                            if (preferenceGroup.c0) {
                                preferenceB.j();
                            }
                            V20 v21 = preferenceGroup.R;
                            if (v21 != null) {
                                Handler handler2 = v21.h;
                                RunnableC3102w1 runnableC3102w2 = v21.i;
                                handler2.removeCallbacks(runnableC3102w2);
                                handler2.post(runnableC3102w2);
                            }
                        } catch (Throwable th) {
                            preferenceB.f30o = false;
                            throw th;
                        }
                    }
                    d(xmlResourceParser, preferenceB, attributeSet);
                }
            }
        }
    }
}
