package o;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import j$.util.DesugarTimeZone;
import j$.util.Objects;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: o.Dr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0379Dr {
    public static final byte[] A;
    public static final String[] B;
    public static final int[] C;
    public static final byte[] D;
    public static final C0301Ar E;
    public static final C0301Ar[][] F;
    public static final C0301Ar[] G;
    public static final HashMap[] H;
    public static final HashMap[] I;
    public static final HashSet J;
    public static final HashMap K;
    public static final Charset L;
    public static final byte[] M;
    public static final byte[] N;
    public static final boolean l = Log.isLoggable("ExifInterface", 3);
    public static final int[] m;
    public static final int[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f221o;
    public static final byte[] p;
    public static final byte[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final byte[] t;
    public static final byte[] u;
    public static final byte[] v;
    public static final byte[] w;
    public static final byte[] x;
    public static final byte[] y;
    public static final byte[] z;
    public final FileDescriptor a;
    public final AssetManager.AssetInputStream b;
    public int c;
    public final HashMap[] d;
    public final HashSet e;
    public ByteOrder f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        m = new int[]{8, 8, 8};
        n = new int[]{8};
        f221o = new byte[]{-1, -40, -1};
        p = new byte[]{102, 116, 121, 112};
        q = new byte[]{109, 105, 102, 49};
        r = new byte[]{104, 101, 105, 99};
        s = new byte[]{79, 76, 89, 77, 80, 0};
        t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        v = new byte[]{101, 88, 73, 102};
        w = new byte[]{73, 72, 68, 82};
        x = new byte[]{73, 69, 78, 68};
        y = new byte[]{82, 73, 70, 70};
        z = new byte[]{87, 69, 66, 80};
        A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C0301Ar[] c0301ArArr = {new C0301Ar("NewSubfileType", 254, 4), new C0301Ar("SubfileType", 255, 4), new C0301Ar("ImageWidth", 256, 3, 4), new C0301Ar("ImageLength", C3080vp0.F0, 3, 4), new C0301Ar("BitsPerSample", C3080vp0.G0, 3), new C0301Ar("Compression", C3080vp0.H0, 3), new C0301Ar("PhotometricInterpretation", 262, 3), new C0301Ar("ImageDescription", 270, 2), new C0301Ar("Make", 271, 2), new C0301Ar("Model", 272, 2), new C0301Ar("StripOffsets", 273, 3, 4), new C0301Ar("Orientation", 274, 3), new C0301Ar("SamplesPerPixel", 277, 3), new C0301Ar("RowsPerStrip", 278, 3, 4), new C0301Ar("StripByteCounts", 279, 3, 4), new C0301Ar("XResolution", 282, 5), new C0301Ar("YResolution", 283, 5), new C0301Ar("PlanarConfiguration", 284, 3), new C0301Ar("ResolutionUnit", 296, 3), new C0301Ar("TransferFunction", 301, 3), new C0301Ar("Software", 305, 2), new C0301Ar("DateTime", 306, 2), new C0301Ar("Artist", 315, 2), new C0301Ar("WhitePoint", 318, 5), new C0301Ar("PrimaryChromaticities", 319, 5), new C0301Ar("SubIFDPointer", 330, 4), new C0301Ar("JPEGInterchangeFormat", 513, 4), new C0301Ar("JPEGInterchangeFormatLength", 514, 4), new C0301Ar("YCbCrCoefficients", 529, 5), new C0301Ar("YCbCrSubSampling", 530, 3), new C0301Ar("YCbCrPositioning", 531, 3), new C0301Ar("ReferenceBlackWhite", 532, 5), new C0301Ar("Copyright", 33432, 2), new C0301Ar("ExifIFDPointer", 34665, 4), new C0301Ar("GPSInfoIFDPointer", 34853, 4), new C0301Ar("SensorTopBorder", 4, 4), new C0301Ar("SensorLeftBorder", 5, 4), new C0301Ar("SensorBottomBorder", 6, 4), new C0301Ar("SensorRightBorder", 7, 4), new C0301Ar("ISO", 23, 3), new C0301Ar("JpgFromRaw", 46, 7), new C0301Ar("Xmp", 700, 1)};
        C0301Ar[] c0301ArArr2 = {new C0301Ar("ExposureTime", 33434, 5), new C0301Ar("FNumber", 33437, 5), new C0301Ar("ExposureProgram", 34850, 3), new C0301Ar("SpectralSensitivity", 34852, 2), new C0301Ar("PhotographicSensitivity", 34855, 3), new C0301Ar("OECF", 34856, 7), new C0301Ar("SensitivityType", 34864, 3), new C0301Ar("StandardOutputSensitivity", 34865, 4), new C0301Ar("RecommendedExposureIndex", 34866, 4), new C0301Ar("ISOSpeed", 34867, 4), new C0301Ar("ISOSpeedLatitudeyyy", 34868, 4), new C0301Ar("ISOSpeedLatitudezzz", 34869, 4), new C0301Ar("ExifVersion", 36864, 2), new C0301Ar("DateTimeOriginal", 36867, 2), new C0301Ar("DateTimeDigitized", 36868, 2), new C0301Ar("OffsetTime", 36880, 2), new C0301Ar("OffsetTimeOriginal", 36881, 2), new C0301Ar("OffsetTimeDigitized", 36882, 2), new C0301Ar("ComponentsConfiguration", 37121, 7), new C0301Ar("CompressedBitsPerPixel", 37122, 5), new C0301Ar("ShutterSpeedValue", 37377, 10), new C0301Ar("ApertureValue", 37378, 5), new C0301Ar("BrightnessValue", 37379, 10), new C0301Ar("ExposureBiasValue", 37380, 10), new C0301Ar("MaxApertureValue", 37381, 5), new C0301Ar("SubjectDistance", 37382, 5), new C0301Ar("MeteringMode", 37383, 3), new C0301Ar("LightSource", 37384, 3), new C0301Ar("Flash", 37385, 3), new C0301Ar("FocalLength", 37386, 5), new C0301Ar("SubjectArea", 37396, 3), new C0301Ar("MakerNote", 37500, 7), new C0301Ar("UserComment", 37510, 7), new C0301Ar("SubSecTime", 37520, 2), new C0301Ar("SubSecTimeOriginal", 37521, 2), new C0301Ar("SubSecTimeDigitized", 37522, 2), new C0301Ar("FlashpixVersion", 40960, 7), new C0301Ar("ColorSpace", 40961, 3), new C0301Ar("PixelXDimension", 40962, 3, 4), new C0301Ar("PixelYDimension", 40963, 3, 4), new C0301Ar("RelatedSoundFile", 40964, 2), new C0301Ar("InteroperabilityIFDPointer", 40965, 4), new C0301Ar("FlashEnergy", 41483, 5), new C0301Ar("SpatialFrequencyResponse", 41484, 7), new C0301Ar("FocalPlaneXResolution", 41486, 5), new C0301Ar("FocalPlaneYResolution", 41487, 5), new C0301Ar("FocalPlaneResolutionUnit", 41488, 3), new C0301Ar("SubjectLocation", 41492, 3), new C0301Ar("ExposureIndex", 41493, 5), new C0301Ar("SensingMethod", 41495, 3), new C0301Ar("FileSource", 41728, 7), new C0301Ar("SceneType", 41729, 7), new C0301Ar("CFAPattern", 41730, 7), new C0301Ar("CustomRendered", 41985, 3), new C0301Ar("ExposureMode", 41986, 3), new C0301Ar("WhiteBalance", 41987, 3), new C0301Ar("DigitalZoomRatio", 41988, 5), new C0301Ar("FocalLengthIn35mmFilm", 41989, 3), new C0301Ar("SceneCaptureType", 41990, 3), new C0301Ar("GainControl", 41991, 3), new C0301Ar("Contrast", 41992, 3), new C0301Ar("Saturation", 41993, 3), new C0301Ar("Sharpness", 41994, 3), new C0301Ar("DeviceSettingDescription", 41995, 7), new C0301Ar("SubjectDistanceRange", 41996, 3), new C0301Ar("ImageUniqueID", 42016, 2), new C0301Ar("CameraOwnerName", 42032, 2), new C0301Ar("BodySerialNumber", 42033, 2), new C0301Ar("LensSpecification", 42034, 5), new C0301Ar("LensMake", 42035, 2), new C0301Ar("LensModel", 42036, 2), new C0301Ar("Gamma", 42240, 5), new C0301Ar("DNGVersion", 50706, 1), new C0301Ar("DefaultCropSize", 50720, 3, 4)};
        C0301Ar[] c0301ArArr3 = {new C0301Ar("GPSVersionID", 0, 1), new C0301Ar("GPSLatitudeRef", 1, 2), new C0301Ar("GPSLatitude", 2, 5, 10), new C0301Ar("GPSLongitudeRef", 3, 2), new C0301Ar("GPSLongitude", 4, 5, 10), new C0301Ar("GPSAltitudeRef", 5, 1), new C0301Ar("GPSAltitude", 6, 5), new C0301Ar("GPSTimeStamp", 7, 5), new C0301Ar("GPSSatellites", 8, 2), new C0301Ar("GPSStatus", 9, 2), new C0301Ar("GPSMeasureMode", 10, 2), new C0301Ar("GPSDOP", 11, 5), new C0301Ar("GPSSpeedRef", 12, 2), new C0301Ar("GPSSpeed", 13, 5), new C0301Ar("GPSTrackRef", 14, 2), new C0301Ar("GPSTrack", 15, 5), new C0301Ar("GPSImgDirectionRef", 16, 2), new C0301Ar("GPSImgDirection", 17, 5), new C0301Ar("GPSMapDatum", 18, 2), new C0301Ar("GPSDestLatitudeRef", 19, 2), new C0301Ar("GPSDestLatitude", 20, 5), new C0301Ar("GPSDestLongitudeRef", 21, 2), new C0301Ar("GPSDestLongitude", 22, 5), new C0301Ar("GPSDestBearingRef", 23, 2), new C0301Ar("GPSDestBearing", 24, 5), new C0301Ar("GPSDestDistanceRef", 25, 2), new C0301Ar("GPSDestDistance", 26, 5), new C0301Ar("GPSProcessingMethod", 27, 7), new C0301Ar("GPSAreaInformation", 28, 7), new C0301Ar("GPSDateStamp", 29, 2), new C0301Ar("GPSDifferential", 30, 3), new C0301Ar("GPSHPositioningError", 31, 5)};
        C0301Ar[] c0301ArArr4 = {new C0301Ar("InteroperabilityIndex", 1, 2)};
        C0301Ar[] c0301ArArr5 = {new C0301Ar("NewSubfileType", 254, 4), new C0301Ar("SubfileType", 255, 4), new C0301Ar("ThumbnailImageWidth", 256, 3, 4), new C0301Ar("ThumbnailImageLength", C3080vp0.F0, 3, 4), new C0301Ar("BitsPerSample", C3080vp0.G0, 3), new C0301Ar("Compression", C3080vp0.H0, 3), new C0301Ar("PhotometricInterpretation", 262, 3), new C0301Ar("ImageDescription", 270, 2), new C0301Ar("Make", 271, 2), new C0301Ar("Model", 272, 2), new C0301Ar("StripOffsets", 273, 3, 4), new C0301Ar("ThumbnailOrientation", 274, 3), new C0301Ar("SamplesPerPixel", 277, 3), new C0301Ar("RowsPerStrip", 278, 3, 4), new C0301Ar("StripByteCounts", 279, 3, 4), new C0301Ar("XResolution", 282, 5), new C0301Ar("YResolution", 283, 5), new C0301Ar("PlanarConfiguration", 284, 3), new C0301Ar("ResolutionUnit", 296, 3), new C0301Ar("TransferFunction", 301, 3), new C0301Ar("Software", 305, 2), new C0301Ar("DateTime", 306, 2), new C0301Ar("Artist", 315, 2), new C0301Ar("WhitePoint", 318, 5), new C0301Ar("PrimaryChromaticities", 319, 5), new C0301Ar("SubIFDPointer", 330, 4), new C0301Ar("JPEGInterchangeFormat", 513, 4), new C0301Ar("JPEGInterchangeFormatLength", 514, 4), new C0301Ar("YCbCrCoefficients", 529, 5), new C0301Ar("YCbCrSubSampling", 530, 3), new C0301Ar("YCbCrPositioning", 531, 3), new C0301Ar("ReferenceBlackWhite", 532, 5), new C0301Ar("Copyright", 33432, 2), new C0301Ar("ExifIFDPointer", 34665, 4), new C0301Ar("GPSInfoIFDPointer", 34853, 4), new C0301Ar("DNGVersion", 50706, 1), new C0301Ar("DefaultCropSize", 50720, 3, 4)};
        E = new C0301Ar("StripOffsets", 273, 3);
        F = new C0301Ar[][]{c0301ArArr, c0301ArArr2, c0301ArArr3, c0301ArArr4, c0301ArArr5, c0301ArArr, new C0301Ar[]{new C0301Ar("ThumbnailImage", 256, 7), new C0301Ar("CameraSettingsIFDPointer", 8224, 4), new C0301Ar("ImageProcessingIFDPointer", 8256, 4)}, new C0301Ar[]{new C0301Ar("PreviewImageStart", C3080vp0.F0, 4), new C0301Ar("PreviewImageLength", C3080vp0.G0, 4)}, new C0301Ar[]{new C0301Ar("AspectFrame", 4371, 3)}, new C0301Ar[]{new C0301Ar("ColorSpace", 55, 3)}};
        G = new C0301Ar[]{new C0301Ar("SubIFDPointer", 330, 4), new C0301Ar("ExifIFDPointer", 34665, 4), new C0301Ar("GPSInfoIFDPointer", 34853, 4), new C0301Ar("InteroperabilityIFDPointer", 40965, 4), new C0301Ar("CameraSettingsIFDPointer", 8224, 1), new C0301Ar("ImageProcessingIFDPointer", 8256, 1)};
        H = new HashMap[10];
        I = new HashMap[10];
        J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        K = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        L = charsetForName;
        M = "Exif\u0000\u0000".getBytes(charsetForName);
        N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C0301Ar[][] c0301ArArr6 = F;
            if (i >= c0301ArArr6.length) {
                HashMap map = K;
                C0301Ar[] c0301ArArr7 = G;
                map.put(Integer.valueOf(c0301ArArr7[0].a), 5);
                map.put(Integer.valueOf(c0301ArArr7[1].a), 1);
                map.put(Integer.valueOf(c0301ArArr7[2].a), 2);
                map.put(Integer.valueOf(c0301ArArr7[3].a), 3);
                map.put(Integer.valueOf(c0301ArArr7[4].a), 7);
                map.put(Integer.valueOf(c0301ArArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            H[i] = new HashMap();
            I[i] = new HashMap();
            for (C0301Ar c0301Ar : c0301ArArr6[i]) {
                H[i].put(Integer.valueOf(c0301Ar.a), c0301Ar);
                I[i].put(c0301Ar.b, c0301Ar);
            }
            i++;
        }
    }

    public C0379Dr(InputStream inputStream) throws Throwable {
        C0301Ar[][] c0301ArArr = F;
        this.d = new HashMap[c0301ArArr.length];
        this.e = new HashSet(c0301ArArr.length);
        this.f = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.b = (AssetManager.AssetInputStream) inputStream;
            this.a = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                AbstractC0431Fr.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.b = null;
                this.a = fileInputStream.getFD();
            } catch (Exception unused) {
                this.b = null;
                this.a = null;
            }
        } else {
            this.b = null;
            this.a = null;
        }
        boolean z2 = l;
        for (int i = 0; i < c0301ArArr.length; i++) {
            try {
                this.d[i] = new HashMap();
            } catch (IOException | UnsupportedOperationException unused2) {
                a();
                if (!z2) {
                    return;
                }
            } catch (Throwable th) {
                a();
                if (z2) {
                    p();
                }
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iF = f(bufferedInputStream);
        this.c = iF;
        if (iF == 4 || iF == 9 || iF == 13 || iF == 14) {
            C3374yr c3374yr = new C3374yr(bufferedInputStream);
            int i2 = this.c;
            if (i2 == 4) {
                e(c3374yr, 0, 0);
            } else if (i2 == 13) {
                h(c3374yr);
            } else if (i2 == 9) {
                i(c3374yr);
            } else if (i2 == 14) {
                l(c3374yr);
            }
        } else {
            C0353Cr c0353Cr = new C0353Cr(bufferedInputStream);
            int i3 = this.c;
            if (i3 == 12) {
                d(c0353Cr);
            } else if (i3 == 7) {
                g(c0353Cr);
            } else if (i3 == 10) {
                k(c0353Cr);
            } else {
                j(c0353Cr);
            }
            c0353Cr.f(this.h);
            u(c0353Cr);
        }
        a();
        if (!z2) {
            return;
        }
        p();
    }

    public static ByteOrder q(C3374yr c3374yr) throws IOException {
        short s2 = c3374yr.readShort();
        if (s2 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s2));
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.d;
        if (strB != null && b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strB.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(L);
            map.put("DateTime", new C3471zr(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C3471zr.a(0L, this.f));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", C3471zr.a(0L, this.f));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", C3471zr.a(0L, this.f));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", C3471zr.a(0L, this.f));
        }
    }

    public final String b(String str) {
        C3471zr c3471zrC = c(str);
        if (c3471zrC != null) {
            if (!J.contains(str)) {
                return c3471zrC.f(this.f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = c3471zrC.a;
                if (i != 5 && i != 10) {
                    return null;
                }
                C0327Br[] c0327BrArr = (C0327Br[]) c3471zrC.g(this.f);
                if (c0327BrArr == null || c0327BrArr.length != 3) {
                    Arrays.toString(c0327BrArr);
                    return null;
                }
                C0327Br c0327Br = c0327BrArr[0];
                Integer numValueOf = Integer.valueOf((int) (c0327Br.a / c0327Br.b));
                C0327Br c0327Br2 = c0327BrArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c0327Br2.a / c0327Br2.b));
                C0327Br c0327Br3 = c0327BrArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c0327Br3.a / c0327Br3.b)));
            }
            try {
                return Double.toString(c3471zrC.d(this.f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final C3471zr c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < F.length; i++) {
            C3471zr c3471zr = (C3471zr) this.d[i].get(str);
            if (c3471zr != null) {
                return c3471zr;
            }
        }
        return null;
    }

    public final void d(C0353Cr c0353Cr) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AbstractC0457Gr.a(mediaMetadataRetriever, new C3277xr(c0353Cr));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C3471zr.c(Integer.parseInt(strExtractMetadata), this.f));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", C3471zr.c(Integer.parseInt(strExtractMetadata2), this.f));
                }
                if (strExtractMetadata3 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata3);
                    if (i2 == 90) {
                        i = 6;
                    } else if (i2 != 180) {
                        i = i2 != 270 ? 1 : 8;
                    } else {
                        i = 3;
                    }
                    mapArr[0].put("Orientation", C3471zr.c(i, this.f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i3 = Integer.parseInt(strExtractMetadata4);
                    int i4 = Integer.parseInt(strExtractMetadata5);
                    if (i4 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c0353Cr.f(i3);
                    byte[] bArr = new byte[6];
                    if (c0353Cr.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i5 = i3 + 6;
                    int i6 = i4 - 6;
                    if (!Arrays.equals(bArr, M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i6];
                    if (c0353Cr.read(bArr2) != i6) {
                        throw new IOException("Can't read exif");
                    }
                    this.h = i5;
                    r(0, bArr2);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x006b A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008c  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:74:0x0105 A[LOOP:2: B:69:0x00fb->B:74:0x0105, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0117  */
    /* JADX WARN: Code duplicated, block: B:82:0x014c A[LOOP:0: B:10:0x0024->B:82:0x014c, LOOP_END] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void e(o.C3374yr r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0379Dr.e(o.yr, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:104:0x012e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:106:0x0131  */
    /* JADX WARN: Code duplicated, block: B:109:0x0137  */
    /* JADX WARN: Code duplicated, block: B:112:0x013f A[LOOP:2: B:107:0x0132->B:112:0x013f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x0145 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:117:0x0148  */
    /* JADX WARN: Code duplicated, block: B:120:0x014e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0156 A[LOOP:3: B:118:0x0149->B:123:0x0156, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:127:0x015f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0169 A[LOOP:4: B:125:0x015a->B:130:0x0169, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x016f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:148:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0154 A[EDGE_INSN: B:158:0x0154->B:122:0x0154 BREAK  A[LOOP:3: B:118:0x0149->B:123:0x0156], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0154 A[EDGE_INSN: B:159:0x0154->B:122:0x0154 BREAK  A[LOOP:3: B:118:0x0149->B:123:0x0156], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x010d  */
    /* JADX WARN: Code duplicated, block: B:89:0x010f  */
    public final int f(BufferedInputStream bufferedInputStream) throws Throwable {
        C3374yr c3374yr;
        C3374yr c3374yr2;
        C3374yr c3374yr3;
        C3374yr c3374yr4;
        boolean z2;
        C3374yr c3374yr5;
        C3374yr c3374yr6;
        boolean z3;
        int i;
        byte[] bArr;
        boolean z4;
        int i2;
        byte[] bArr2;
        int i3;
        byte[] bArr3;
        boolean z5;
        C3374yr c3374yr7;
        short s2;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i4 = 0;
        while (true) {
            byte[] bArr5 = f221o;
            if (i4 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i4] != bArr5[i4]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i5 = 0; i5 < bytes.length; i5++) {
                    if (bArr4[i5] != bytes[i5]) {
                        try {
                            c3374yr2 = new C3374yr(bArr4);
                            try {
                                long j2 = c3374yr2.readInt();
                                byte[] bArr6 = new byte[4];
                                c3374yr2.read(bArr6);
                                if (Arrays.equals(bArr6, p)) {
                                    if (j2 == 1) {
                                        j2 = c3374yr2.readLong();
                                        j = 16;
                                        if (j2 < 16) {
                                        }
                                    } else {
                                        j = 8;
                                    }
                                    long j3 = 5000;
                                    if (j2 > j3) {
                                        j2 = j3;
                                    }
                                    long j4 = j2 - j;
                                    if (j4 >= 8) {
                                        byte[] bArr7 = new byte[4];
                                        boolean z6 = false;
                                        boolean z7 = false;
                                        for (long j5 = 0; j5 < j4 / 4 && c3374yr2.read(bArr7) == 4; j5++) {
                                            if (j5 != 1) {
                                                if (Arrays.equals(bArr7, q)) {
                                                    z6 = true;
                                                } else if (Arrays.equals(bArr7, r)) {
                                                    z7 = true;
                                                }
                                                if (z6 && z7) {
                                                    c3374yr2.close();
                                                    return 12;
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                                if (c3374yr2 != null) {
                                }
                                c3374yr4 = new C3374yr(bArr4);
                                ByteOrder byteOrderQ = q(c3374yr4);
                                this.f = byteOrderQ;
                                c3374yr4.m = byteOrderQ;
                                s2 = c3374yr4.readShort();
                                if (s2 != 20306) {
                                    z2 = true;
                                } else {
                                    z2 = true;
                                }
                                c3374yr4.close();
                                if (z2) {
                                    return 7;
                                }
                                try {
                                    c3374yr7 = new C3374yr(bArr4);
                                    try {
                                        ByteOrder byteOrderQ2 = q(c3374yr7);
                                        this.f = byteOrderQ2;
                                        c3374yr7.m = byteOrderQ2;
                                        if (c3374yr7.readShort() == 85) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        c3374yr7.close();
                                    } catch (Exception unused2) {
                                        c3374yr6 = c3374yr7;
                                        if (c3374yr6 != null) {
                                            c3374yr6.close();
                                        }
                                        z3 = false;
                                    } catch (Throwable th) {
                                        th = th;
                                        c3374yr5 = c3374yr7;
                                        if (c3374yr5 != null) {
                                            c3374yr5.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception unused3) {
                                    c3374yr6 = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    c3374yr5 = null;
                                }
                                if (z3) {
                                    return 10;
                                }
                                i = 0;
                                while (true) {
                                    bArr = u;
                                    if (i < bArr.length) {
                                        z4 = true;
                                        break;
                                    }
                                    if (bArr4[i] != bArr[i]) {
                                        z4 = false;
                                        break;
                                    }
                                    i++;
                                }
                                if (z4) {
                                    return 13;
                                }
                                i2 = 0;
                                while (true) {
                                    bArr2 = y;
                                    if (i2 < bArr2.length) {
                                        i3 = 0;
                                        while (true) {
                                            bArr3 = z;
                                            if (i3 < bArr3.length) {
                                                z5 = true;
                                            } else {
                                                if (bArr4[bArr2.length + i3 + 4] != bArr3[i3]) {
                                                    break;
                                                }
                                                i3++;
                                            }
                                            if (z5) {
                                                return 14;
                                            }
                                            return 0;
                                        }
                                    }
                                    if (bArr4[i2] != bArr2[i2]) {
                                        break;
                                    }
                                    i2++;
                                }
                                z5 = false;
                                if (z5) {
                                    return 14;
                                }
                                return 0;
                            } catch (Throwable th3) {
                                th = th3;
                                c3374yr = c3374yr2;
                                if (c3374yr != null) {
                                    c3374yr.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused4) {
                            c3374yr2 = null;
                        } catch (Throwable th4) {
                            th = th4;
                            c3374yr = null;
                        }
                        c3374yr2.close();
                        try {
                            c3374yr4 = new C3374yr(bArr4);
                            try {
                                ByteOrder byteOrderQ3 = q(c3374yr4);
                                this.f = byteOrderQ3;
                                c3374yr4.m = byteOrderQ3;
                                s2 = c3374yr4.readShort();
                                if (s2 != 20306 || s2 == 21330) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                c3374yr4.close();
                            } catch (Exception unused5) {
                                if (c3374yr4 != null) {
                                    c3374yr4.close();
                                }
                                z2 = false;
                            } catch (Throwable th5) {
                                th = th5;
                                c3374yr3 = c3374yr4;
                                if (c3374yr3 != null) {
                                    c3374yr3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused6) {
                            c3374yr4 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            c3374yr3 = null;
                        }
                        if (z2) {
                            return 7;
                        }
                        c3374yr7 = new C3374yr(bArr4);
                        ByteOrder byteOrderQ4 = q(c3374yr7);
                        this.f = byteOrderQ4;
                        c3374yr7.m = byteOrderQ4;
                        if (c3374yr7.readShort() == 85) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c3374yr7.close();
                        if (z3) {
                            return 10;
                        }
                        i = 0;
                        while (true) {
                            bArr = u;
                            if (i < bArr.length) {
                                z4 = true;
                                break;
                            }
                            if (bArr4[i] != bArr[i]) {
                                z4 = false;
                                break;
                            }
                            i++;
                        }
                        if (z4) {
                            return 13;
                        }
                        i2 = 0;
                        while (true) {
                            bArr2 = y;
                            if (i2 < bArr2.length) {
                                i3 = 0;
                                while (true) {
                                    bArr3 = z;
                                    if (i3 < bArr3.length) {
                                        z5 = true;
                                    } else {
                                        if (bArr4[bArr2.length + i3 + 4] != bArr3[i3]) {
                                            break;
                                            break;
                                        }
                                        i3++;
                                    }
                                    if (z5) {
                                        return 14;
                                    }
                                    return 0;
                                }
                            }
                            if (bArr4[i2] != bArr2[i2]) {
                                break;
                                break;
                            }
                            i2++;
                        }
                        z5 = false;
                        if (z5) {
                            return 14;
                        }
                        return 0;
                    }
                }
                return 9;
            }
            i4++;
        }
    }

    public final void g(C0353Cr c0353Cr) throws Throwable {
        int i;
        int i2;
        j(c0353Cr);
        HashMap[] mapArr = this.d;
        C3471zr c3471zr = (C3471zr) mapArr[1].get("MakerNote");
        if (c3471zr != null) {
            C0353Cr c0353Cr2 = new C0353Cr(c3471zr.d);
            c0353Cr2.m = this.f;
            byte[] bArr = s;
            byte[] bArr2 = new byte[bArr.length];
            c0353Cr2.readFully(bArr2);
            c0353Cr2.f(0L);
            byte[] bArr3 = t;
            byte[] bArr4 = new byte[bArr3.length];
            c0353Cr2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c0353Cr2.f(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c0353Cr2.f(12L);
            }
            s(c0353Cr2, 6);
            C3471zr c3471zr2 = (C3471zr) mapArr[7].get("PreviewImageStart");
            C3471zr c3471zr3 = (C3471zr) mapArr[7].get("PreviewImageLength");
            if (c3471zr2 != null && c3471zr3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c3471zr2);
                mapArr[5].put("JPEGInterchangeFormatLength", c3471zr3);
            }
            C3471zr c3471zr4 = (C3471zr) mapArr[8].get("AspectFrame");
            if (c3471zr4 != null) {
                int[] iArr = (int[]) c3471zr4.g(this.f);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                C3471zr c3471zrC = C3471zr.c(i5, this.f);
                C3471zr c3471zrC2 = C3471zr.c(i6, this.f);
                mapArr[0].put("ImageWidth", c3471zrC);
                mapArr[0].put("ImageLength", c3471zrC2);
            }
        }
    }

    public final void h(C3374yr c3374yr) throws Throwable {
        if (l) {
            Objects.toString(c3374yr);
        }
        c3374yr.m = ByteOrder.BIG_ENDIAN;
        byte[] bArr = u;
        c3374yr.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = c3374yr.readInt();
                byte[] bArr2 = new byte[4];
                if (c3374yr.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, w)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, x)) {
                    return;
                }
                if (Arrays.equals(bArr2, v)) {
                    byte[] bArr3 = new byte[i];
                    if (c3374yr.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + U9.b(bArr2));
                    }
                    int i3 = c3374yr.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.h = i2;
                        r(0, bArr3);
                        x();
                        u(new C3374yr(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                c3374yr.a(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(C3374yr c3374yr) throws Throwable {
        if (l) {
            Objects.toString(c3374yr);
        }
        c3374yr.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c3374yr.read(bArr);
        c3374yr.read(bArr2);
        c3374yr.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c3374yr.a(i - c3374yr.n);
        c3374yr.read(bArr4);
        e(new C3374yr(bArr4), i, 5);
        c3374yr.a(i3 - c3374yr.n);
        c3374yr.m = ByteOrder.BIG_ENDIAN;
        int i4 = c3374yr.readInt();
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = c3374yr.readUnsignedShort();
            int unsignedShort2 = c3374yr.readUnsignedShort();
            if (unsignedShort == E.a) {
                short s2 = c3374yr.readShort();
                short s3 = c3374yr.readShort();
                C3471zr c3471zrC = C3471zr.c(s2, this.f);
                C3471zr c3471zrC2 = C3471zr.c(s3, this.f);
                HashMap[] mapArr = this.d;
                mapArr[0].put("ImageLength", c3471zrC);
                mapArr[0].put("ImageWidth", c3471zrC2);
                return;
            }
            c3374yr.a(unsignedShort2);
        }
    }

    public final void j(C0353Cr c0353Cr) throws Throwable {
        o(c0353Cr);
        s(c0353Cr, 0);
        w(c0353Cr, 0);
        w(c0353Cr, 5);
        w(c0353Cr, 4);
        x();
        if (this.c == 8) {
            HashMap[] mapArr = this.d;
            C3471zr c3471zr = (C3471zr) mapArr[1].get("MakerNote");
            if (c3471zr != null) {
                C0353Cr c0353Cr2 = new C0353Cr(c3471zr.d);
                c0353Cr2.m = this.f;
                c0353Cr2.a(6);
                s(c0353Cr2, 9);
                C3471zr c3471zr2 = (C3471zr) mapArr[9].get("ColorSpace");
                if (c3471zr2 != null) {
                    mapArr[1].put("ColorSpace", c3471zr2);
                }
            }
        }
    }

    public final void k(C0353Cr c0353Cr) throws Throwable {
        if (l) {
            Objects.toString(c0353Cr);
        }
        j(c0353Cr);
        HashMap[] mapArr = this.d;
        C3471zr c3471zr = (C3471zr) mapArr[0].get("JpgFromRaw");
        if (c3471zr != null) {
            e(new C3374yr(c3471zr.d), (int) c3471zr.c, 5);
        }
        C3471zr c3471zr2 = (C3471zr) mapArr[0].get("ISO");
        C3471zr c3471zr3 = (C3471zr) mapArr[1].get("PhotographicSensitivity");
        if (c3471zr2 == null || c3471zr3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c3471zr2);
    }

    public final void l(C3374yr c3374yr) throws Throwable {
        if (l) {
            Objects.toString(c3374yr);
        }
        c3374yr.m = ByteOrder.LITTLE_ENDIAN;
        c3374yr.a(y.length);
        int i = c3374yr.readInt() + 8;
        byte[] bArr = z;
        c3374yr.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c3374yr.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = c3374yr.readInt();
                int i3 = length + 8;
                if (Arrays.equals(A, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (c3374yr.read(bArr3) == i2) {
                        this.h = i3;
                        r(0, bArr3);
                        u(new C3374yr(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + U9.b(bArr2));
                    }
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c3374yr.a(i2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(C3374yr c3374yr, HashMap map) throws Throwable {
        C3471zr c3471zr = (C3471zr) map.get("JPEGInterchangeFormat");
        C3471zr c3471zr2 = (C3471zr) map.get("JPEGInterchangeFormatLength");
        if (c3471zr == null || c3471zr2 == null) {
            return;
        }
        int iE = c3471zr.e(this.f);
        int iE2 = c3471zr2.e(this.f);
        if (this.c == 7) {
            iE += this.i;
        }
        if (iE <= 0 || iE2 <= 0 || this.b != null || this.a != null) {
            return;
        }
        c3374yr.skip(iE);
        c3374yr.read(new byte[iE2]);
    }

    public final boolean n(HashMap map) {
        C3471zr c3471zr = (C3471zr) map.get("ImageLength");
        C3471zr c3471zr2 = (C3471zr) map.get("ImageWidth");
        if (c3471zr == null || c3471zr2 == null) {
            return false;
        }
        return c3471zr.e(this.f) <= 512 && c3471zr2.e(this.f) <= 512;
    }

    public final void o(C3374yr c3374yr) throws IOException {
        ByteOrder byteOrderQ = q(c3374yr);
        this.f = byteOrderQ;
        c3374yr.m = byteOrderQ;
        int unsignedShort = c3374yr.readUnsignedShort();
        int i = this.c;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i2 = c3374yr.readInt();
        if (i2 < 8) {
            throw new IOException(AbstractC1674hK.n(i2, "Invalid first Ifd offset: "));
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            c3374yr.a(i3);
        }
    }

    public final void p() throws Throwable {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.d;
            if (i >= mapArr.length) {
                return;
            }
            mapArr[i].size();
            for (Map.Entry entry : mapArr[i].entrySet()) {
                C3471zr c3471zr = (C3471zr) entry.getValue();
                c3471zr.toString();
                c3471zr.f(this.f);
            }
            i++;
        }
    }

    public final void r(int i, byte[] bArr) throws IOException {
        C0353Cr c0353Cr = new C0353Cr(bArr);
        o(c0353Cr);
        s(c0353Cr, i);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:106:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:18:0x0078  */
    /* JADX WARN: Code duplicated, block: B:97:0x0199  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b0  */
    public final void s(C0353Cr c0353Cr, int i) throws IOException {
        boolean z2;
        HashMap[] mapArr;
        HashSet hashSet;
        long j;
        boolean z3;
        int i2;
        HashSet hashSet2;
        int unsignedShort;
        long j2;
        int i3 = 5;
        Integer numValueOf = Integer.valueOf(c0353Cr.n);
        HashSet hashSet3 = this.e;
        hashSet3.add(numValueOf);
        short s2 = c0353Cr.readShort();
        if (s2 <= 0) {
            return;
        }
        short s3 = 0;
        while (true) {
            z2 = l;
            mapArr = this.d;
            if (s3 >= s2) {
                break;
            }
            int unsignedShort2 = c0353Cr.readUnsignedShort();
            int unsignedShort3 = c0353Cr.readUnsignedShort();
            int i4 = c0353Cr.readInt();
            long j3 = ((long) c0353Cr.n) + 4;
            C0301Ar c0301Ar = (C0301Ar) H[i].get(Integer.valueOf(unsignedShort2));
            if (z2) {
                Integer numValueOf2 = Integer.valueOf(i);
                Integer numValueOf3 = Integer.valueOf(unsignedShort2);
                String str = c0301Ar != null ? c0301Ar.b : null;
                Integer numValueOf4 = Integer.valueOf(unsignedShort3);
                Integer numValueOf5 = Integer.valueOf(i4);
                Object[] objArr = new Object[i3];
                objArr[0] = numValueOf2;
                objArr[1] = numValueOf3;
                objArr[2] = str;
                objArr[3] = numValueOf4;
                objArr[4] = numValueOf5;
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", objArr);
            }
            if (c0301Ar != null && unsignedShort3 > 0) {
                int[] iArr = C;
                if (unsignedShort3 < iArr.length) {
                    int i5 = c0301Ar.c;
                    if (i5 == 7 || unsignedShort3 == 7 || i5 == unsignedShort3 || (i2 = c0301Ar.d) == unsignedShort3 || (((i5 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i5 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i5 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
                        if (unsignedShort3 == 7) {
                            unsignedShort3 = i5;
                        }
                        hashSet = hashSet3;
                        j = ((long) i4) * ((long) iArr[unsignedShort3]);
                        z3 = j >= 0 && j <= C1707hi0.a;
                    } else {
                        if (z2) {
                            String str2 = B[unsignedShort3];
                        }
                        hashSet = hashSet3;
                        z3 = false;
                        j = 0;
                    }
                } else {
                    hashSet = hashSet3;
                    z3 = false;
                    j = 0;
                }
            } else {
                hashSet = hashSet3;
                z3 = false;
                j = 0;
            }
            if (z3) {
                if (j > 4) {
                    int i6 = c0353Cr.readInt();
                    if (this.c == 7) {
                        if ("MakerNote".equals(c0301Ar.b)) {
                            this.i = i6;
                        } else if (i == 6 && "ThumbnailImage".equals(c0301Ar.b)) {
                            this.j = i6;
                            this.k = i4;
                            C3471zr c3471zrC = C3471zr.c(6, this.f);
                            C3471zr c3471zrA = C3471zr.a(this.j, this.f);
                            C3471zr c3471zrA2 = C3471zr.a(this.k, this.f);
                            mapArr[4].put("Compression", c3471zrC);
                            mapArr[4].put("JPEGInterchangeFormat", c3471zrA);
                            mapArr[4].put("JPEGInterchangeFormatLength", c3471zrA2);
                        }
                    }
                    c0353Cr.f(i6);
                } else {
                    j3 = j3;
                    j = j;
                }
                Integer num = (Integer) K.get(Integer.valueOf(unsignedShort2));
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j2 = ((long) c0353Cr.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            unsignedShort = c0353Cr.readShort();
                        } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                            unsignedShort = c0353Cr.readInt();
                        } else {
                            j2 = -1;
                        }
                        if (z2) {
                            String.format("Offset: %d, tagName: %s", Long.valueOf(j2), c0301Ar.b);
                        }
                        if (j2 > 0) {
                            hashSet2 = hashSet;
                            if (!hashSet2.contains(Integer.valueOf((int) j2))) {
                                c0353Cr.f(j2);
                                s(c0353Cr, num.intValue());
                            }
                        } else {
                            hashSet2 = hashSet;
                        }
                        c0353Cr.f(j3);
                    } else {
                        unsignedShort = c0353Cr.readUnsignedShort();
                    }
                    j2 = unsignedShort;
                    if (z2) {
                        String.format("Offset: %d, tagName: %s", Long.valueOf(j2), c0301Ar.b);
                    }
                    if (j2 > 0) {
                        hashSet2 = hashSet;
                        if (!hashSet2.contains(Integer.valueOf((int) j2))) {
                            c0353Cr.f(j2);
                            s(c0353Cr, num.intValue());
                        }
                    } else {
                        hashSet2 = hashSet;
                    }
                    c0353Cr.f(j3);
                } else {
                    hashSet2 = hashSet;
                    long j4 = j3;
                    int i7 = c0353Cr.n + this.h;
                    byte[] bArr = new byte[(int) j];
                    c0353Cr.readFully(bArr);
                    C3471zr c3471zr = new C3471zr(i7, bArr, unsignedShort3, i4);
                    mapArr[i].put(c0301Ar.b, c3471zr);
                    String str3 = c0301Ar.b;
                    if ("DNGVersion".equals(str3)) {
                        this.c = 3;
                    }
                    if ((("Make".equals(str3) || "Model".equals(str3)) && c3471zr.f(this.f).contains("PENTAX")) || ("Compression".equals(str3) && c3471zr.e(this.f) == 65535)) {
                        this.c = 8;
                    }
                    if (c0353Cr.n != j4) {
                        c0353Cr.f(j4);
                    }
                }
            } else {
                c0353Cr.f(j3);
                s3 = s3;
                hashSet2 = hashSet;
            }
            s3 = (short) (s3 + 1);
            hashSet3 = hashSet2;
            s2 = s2;
            i3 = 5;
        }
        HashSet hashSet4 = hashSet3;
        int i8 = c0353Cr.readInt();
        if (z2) {
            String.format("nextIfdOffset: %d", Integer.valueOf(i8));
        }
        long j5 = i8;
        if (j5 <= 0 || hashSet4.contains(Integer.valueOf(i8))) {
            return;
        }
        c0353Cr.f(j5);
        if (mapArr[4].isEmpty()) {
            s(c0353Cr, 4);
        } else if (mapArr[5].isEmpty()) {
            s(c0353Cr, 5);
        }
    }

    public final void t(String str, int i, String str2) {
        HashMap[] mapArr = this.d;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    public final void u(C3374yr c3374yr) throws Throwable {
        C3471zr c3471zr;
        HashMap map = this.d[4];
        C3471zr c3471zr2 = (C3471zr) map.get("Compression");
        if (c3471zr2 == null) {
            m(c3374yr, map);
            return;
        }
        int iE = c3471zr2.e(this.f);
        if (iE != 1) {
            if (iE == 6) {
                m(c3374yr, map);
                return;
            } else if (iE != 7) {
                return;
            }
        }
        C3471zr c3471zr3 = (C3471zr) map.get("BitsPerSample");
        if (c3471zr3 != null) {
            int[] iArr = (int[]) c3471zr3.g(this.f);
            int[] iArr2 = m;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.c != 3 || (c3471zr = (C3471zr) map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int iE2 = c3471zr.e(this.f);
                if ((iE2 != 1 || !Arrays.equals(iArr, n)) && (iE2 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            C3471zr c3471zr4 = (C3471zr) map.get("StripOffsets");
            C3471zr c3471zr5 = (C3471zr) map.get("StripByteCounts");
            if (c3471zr4 == null || c3471zr5 == null) {
                return;
            }
            long[] jArrJ = U9.j(c3471zr4.g(this.f));
            long[] jArrJ2 = U9.j(c3471zr5.g(this.f));
            if (jArrJ == null || jArrJ.length == 0 || jArrJ2 == null || jArrJ2.length == 0 || jArrJ.length != jArrJ2.length) {
                return;
            }
            long j = 0;
            for (long j2 : jArrJ2) {
                j += j2;
            }
            byte[] bArr = new byte[(int) j];
            this.g = true;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < jArrJ.length; i3++) {
                int i4 = (int) jArrJ[i3];
                int i5 = (int) jArrJ2[i3];
                if (i3 < jArrJ.length - 1 && i4 + i5 != jArrJ[i3 + 1]) {
                    this.g = false;
                }
                int i6 = i4 - i;
                if (i6 < 0) {
                    return;
                }
                long j3 = i6;
                if (c3374yr.skip(j3) != j3) {
                    return;
                }
                int i7 = i + i6;
                byte[] bArr2 = new byte[i5];
                if (c3374yr.read(bArr2) != i5) {
                    return;
                }
                i = i7 + i5;
                System.arraycopy(bArr2, 0, bArr, i2, i5);
                i2 += i5;
            }
            if (this.g) {
                long j4 = jArrJ[0];
            }
        }
    }

    public final void v(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.d;
        if (mapArr[i].isEmpty() || mapArr[i2].isEmpty()) {
            return;
        }
        C3471zr c3471zr = (C3471zr) mapArr[i].get("ImageLength");
        C3471zr c3471zr2 = (C3471zr) mapArr[i].get("ImageWidth");
        C3471zr c3471zr3 = (C3471zr) mapArr[i2].get("ImageLength");
        C3471zr c3471zr4 = (C3471zr) mapArr[i2].get("ImageWidth");
        if (c3471zr == null || c3471zr2 == null || c3471zr3 == null || c3471zr4 == null) {
            return;
        }
        int iE = c3471zr.e(this.f);
        int iE2 = c3471zr2.e(this.f);
        int iE3 = c3471zr3.e(this.f);
        int iE4 = c3471zr4.e(this.f);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void w(C0353Cr c0353Cr, int i) throws Throwable {
        C3471zr c3471zrC;
        C3471zr c3471zrC2;
        HashMap[] mapArr = this.d;
        C3471zr c3471zr = (C3471zr) mapArr[i].get("DefaultCropSize");
        C3471zr c3471zr2 = (C3471zr) mapArr[i].get("SensorTopBorder");
        C3471zr c3471zr3 = (C3471zr) mapArr[i].get("SensorLeftBorder");
        C3471zr c3471zr4 = (C3471zr) mapArr[i].get("SensorBottomBorder");
        C3471zr c3471zr5 = (C3471zr) mapArr[i].get("SensorRightBorder");
        if (c3471zr != null) {
            if (c3471zr.a == 5) {
                C0327Br[] c0327BrArr = (C0327Br[]) c3471zr.g(this.f);
                if (c0327BrArr == null || c0327BrArr.length != 2) {
                    Arrays.toString(c0327BrArr);
                    return;
                } else {
                    c3471zrC = C3471zr.b(c0327BrArr[0], this.f);
                    c3471zrC2 = C3471zr.b(c0327BrArr[1], this.f);
                }
            } else {
                int[] iArr = (int[]) c3471zr.g(this.f);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    c3471zrC = C3471zr.c(iArr[0], this.f);
                    c3471zrC2 = C3471zr.c(iArr[1], this.f);
                }
            }
            mapArr[i].put("ImageWidth", c3471zrC);
            mapArr[i].put("ImageLength", c3471zrC2);
            return;
        }
        if (c3471zr2 != null && c3471zr3 != null && c3471zr4 != null && c3471zr5 != null) {
            int iE = c3471zr2.e(this.f);
            int iE2 = c3471zr4.e(this.f);
            int iE3 = c3471zr5.e(this.f);
            int iE4 = c3471zr3.e(this.f);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            C3471zr c3471zrC3 = C3471zr.c(iE2 - iE, this.f);
            C3471zr c3471zrC4 = C3471zr.c(iE3 - iE4, this.f);
            mapArr[i].put("ImageLength", c3471zrC3);
            mapArr[i].put("ImageWidth", c3471zrC4);
            return;
        }
        C3471zr c3471zr6 = (C3471zr) mapArr[i].get("ImageLength");
        C3471zr c3471zr7 = (C3471zr) mapArr[i].get("ImageWidth");
        if (c3471zr6 == null || c3471zr7 == null) {
            C3471zr c3471zr8 = (C3471zr) mapArr[i].get("JPEGInterchangeFormat");
            C3471zr c3471zr9 = (C3471zr) mapArr[i].get("JPEGInterchangeFormatLength");
            if (c3471zr8 == null || c3471zr9 == null) {
                return;
            }
            int iE5 = c3471zr8.e(this.f);
            int iE6 = c3471zr8.e(this.f);
            c0353Cr.f(iE5);
            byte[] bArr = new byte[iE6];
            c0353Cr.read(bArr);
            e(new C3374yr(bArr), iE5, i);
        }
    }

    public final void x() throws Throwable {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] mapArr = this.d;
        C3471zr c3471zr = (C3471zr) mapArr[1].get("PixelXDimension");
        C3471zr c3471zr2 = (C3471zr) mapArr[1].get("PixelYDimension");
        if (c3471zr != null && c3471zr2 != null) {
            mapArr[0].put("ImageWidth", c3471zr);
            mapArr[0].put("ImageLength", c3471zr2);
        }
        if (mapArr[4].isEmpty() && n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        n(mapArr[4]);
        t("ThumbnailOrientation", 0, "Orientation");
        t("ThumbnailImageLength", 0, "ImageLength");
        t("ThumbnailImageWidth", 0, "ImageWidth");
        t("ThumbnailOrientation", 5, "Orientation");
        t("ThumbnailImageLength", 5, "ImageLength");
        t("ThumbnailImageWidth", 5, "ImageWidth");
        t("Orientation", 4, "ThumbnailOrientation");
        t("ImageLength", 4, "ThumbnailImageLength");
        t("ImageWidth", 4, "ThumbnailImageWidth");
    }
}
