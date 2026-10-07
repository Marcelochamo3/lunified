package o;

import android.util.Base64;
import com.skidush.clonex.MyApplication;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Map;

/* JADX INFO: renamed from: o.tm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2879tm {
    public static final Rh0 a = new Rh0(C2428p3.v);

    public static final C2782sm a() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        MyApplication myApplication = MyApplication.l;
        SharedPreferencesC3128wI sharedPreferencesC3128wIH = AbstractC1370eA.H(Jp0.s(), "device_key_compat_secure", "device_key_compat");
        if (!Jp0.s().getSharedPreferences("device_key_compat", 0).edit().clear().commit()) {
            throw new IllegalStateException("No se pudo retirar la identidad compatible heredada".toString());
        }
        String string = sharedPreferencesC3128wIH.getString("private_pkcs8", null);
        String string2 = sharedPreferencesC3128wIH.getString("public_x509", null);
        KeyFactory keyFactory = KeyFactory.getInstance("EC");
        if (string != null && !AbstractC1899jh0.O(string) && string2 != null && !AbstractC1899jh0.O(string2)) {
            try {
                PrivateKey privateKeyGeneratePrivate = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(string, 2)));
                AbstractC1474fG.i(privateKeyGeneratePrivate, "generatePrivate(...)");
                PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(new X509EncodedKeySpec(Base64.decode(string2, 2)));
                AbstractC1474fG.i(publicKeyGeneratePublic, "generatePublic(...)");
                return new C2782sm(privateKeyGeneratePrivate, publicKeyGeneratePublic);
            } catch (Throwable unused) {
            }
        }
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"), new SecureRandom());
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        AbstractC1474fG.i(keyPairGenerateKeyPair, "generateKeyPair(...)");
        SharedPreferencesEditorC3031vI sharedPreferencesEditorC3031vI = new SharedPreferencesEditorC3031vI(sharedPreferencesC3128wIH);
        sharedPreferencesEditorC3031vI.putString("private_pkcs8", Base64.encodeToString(keyPairGenerateKeyPair.getPrivate().getEncoded(), 2));
        sharedPreferencesEditorC3031vI.putString("public_x509", Base64.encodeToString(keyPairGenerateKeyPair.getPublic().getEncoded(), 2));
        sharedPreferencesEditorC3031vI.commit();
        PrivateKey privateKey = keyPairGenerateKeyPair.getPrivate();
        AbstractC1474fG.i(privateKey, "getPrivate(...)");
        PublicKey publicKey = keyPairGenerateKeyPair.getPublic();
        AbstractC1474fG.i(publicKey, "getPublic(...)");
        return new C2782sm(privateKey, publicKey);
    }

    public static final C2782sm b() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        KeyStore.Entry entry = keyStore.getEntry("blindaje_device_key_v1", null);
        KeyStore.PrivateKeyEntry privateKeyEntry = entry instanceof KeyStore.PrivateKeyEntry ? (KeyStore.PrivateKeyEntry) entry : null;
        if (privateKeyEntry != null) {
            PrivateKey privateKey = privateKeyEntry.getPrivateKey();
            AbstractC1474fG.i(privateKey, "getPrivateKey(...)");
            PublicKey publicKey = privateKeyEntry.getCertificate().getPublicKey();
            AbstractC1474fG.i(publicKey, "getPublicKey(...)");
            return new C2782sm(privateKey, publicKey);
        }
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
        keyPairGenerator.initialize(AbstractC1026ak.m().setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setDigests("SHA-256").build());
        keyPairGenerator.generateKeyPair();
        KeyStore.Entry entry2 = keyStore.getEntry("blindaje_device_key_v1", null);
        AbstractC1474fG.h(entry2, "null cannot be cast to non-null type java.security.KeyStore.PrivateKeyEntry");
        KeyStore.PrivateKeyEntry privateKeyEntry2 = (KeyStore.PrivateKeyEntry) entry2;
        PrivateKey privateKey2 = privateKeyEntry2.getPrivateKey();
        AbstractC1474fG.i(privateKey2, "getPrivateKey(...)");
        PublicKey publicKey2 = privateKeyEntry2.getCertificate().getPublicKey();
        AbstractC1474fG.i(publicKey2, "getPublicKey(...)");
        return new C2782sm(privateKey2, publicKey2);
    }

    public static Map c() throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        String strValueOf = String.valueOf(AbstractC1889jc0.c());
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 11);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Rh0 rh0 = a;
        byte[] encoded = ((C2782sm) rh0.getValue()).b.getEncoded();
        AbstractC1474fG.i(encoded, "getEncoded(...)");
        String strEncodeToString2 = Base64.encodeToString(messageDigest.digest(encoded), 11);
        AbstractC1474fG.i(strEncodeToString2, "encodeToString(...)");
        Signature signature = Signature.getInstance("SHA256withECDSA");
        signature.initSign(((C2782sm) rh0.getValue()).a);
        StringBuilder sb = new StringBuilder();
        sb.append(strEncodeToString2);
        sb.append("|");
        sb.append(strValueOf);
        byte[] bytes = AbstractC1701hf0.h(sb, "|", strEncodeToString).getBytes(AbstractC1305dd.a);
        AbstractC1474fG.i(bytes, "getBytes(...)");
        signature.update(bytes);
        byte[] bArrSign = signature.sign();
        C1101bX c1101bX = new C1101bX("deviceID", strEncodeToString2);
        byte[] encoded2 = ((C2782sm) rh0.getValue()).b.getEncoded();
        AbstractC1474fG.i(encoded2, "getEncoded(...)");
        return AbstractC3327yN.z(c1101bX, new C1101bX("device_pubkey", Base64.encodeToString(encoded2, 2)), new C1101bX("device_ts", strValueOf), new C1101bX("device_nonce", strEncodeToString), new C1101bX("device_sig", Base64.encodeToString(bArrSign, 11)));
    }
}
