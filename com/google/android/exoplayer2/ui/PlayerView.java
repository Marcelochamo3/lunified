package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.skidush.clonex.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o.AP;
import o.AbstractC0397Ej;
import o.AbstractC0985aF;
import o.AbstractC1074b8;
import o.AbstractC3354yh;
import o.Af0;
import o.B10;
import o.BZ;
import o.C1042as;
import o.C1045at0;
import o.C2951uZ;
import o.G40;
import o.InterfaceC0689Pq;
import o.InterfaceC2370oZ;
import o.InterfaceC2854tZ;
import o.Lr;
import o.Lr0;
import o.O9;
import o.Ps0;
import o.Rs0;
import o.SurfaceHolderCallbackC0898Xr;
import o.Z5;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class PlayerView extends FrameLayout {
    public static final /* synthetic */ int K = 0;
    public boolean A;
    public Drawable B;
    public int C;
    public boolean D;
    public CharSequence E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public final B10 l;
    public final AspectRatioFrameLayout m;
    public final View n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f37o;
    public final boolean p;
    public final ImageView q;
    public final SubtitleView r;
    public final View s;
    public final TextView t;
    public final C2951uZ u;
    public final FrameLayout v;
    public final FrameLayout w;
    public InterfaceC2370oZ x;
    public boolean y;
    public InterfaceC2854tZ z;

    public PlayerView(Context context, AttributeSet attributeSet) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z4;
        boolean z5;
        int i7;
        boolean z6;
        boolean z7;
        super(context, attributeSet, 0);
        B10 b10 = new B10(this);
        this.l = b10;
        if (isInEditMode()) {
            this.m = null;
            this.n = null;
            this.f37o = null;
            this.p = false;
            this.q = null;
            this.r = null;
            this.s = null;
            this.t = null;
            this.u = null;
            this.v = null;
            this.w = null;
            ImageView imageView = new ImageView(context);
            if (Lr0.a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(Lr0.s(context, resources, R.drawable.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(Lr0.s(context, resources2, R.drawable.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, G40.d, 0, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(23);
                int color = typedArrayObtainStyledAttributes.getColor(23, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(12, R.layout.exo_player_view);
                boolean z8 = typedArrayObtainStyledAttributes.getBoolean(28, true);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(6, 0);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(29, true);
                int i8 = typedArrayObtainStyledAttributes.getInt(24, 1);
                int i9 = typedArrayObtainStyledAttributes.getInt(14, 0);
                int i10 = typedArrayObtainStyledAttributes.getInt(22, 5000);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(8, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(20, 0);
                this.D = typedArrayObtainStyledAttributes.getBoolean(9, this.D);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(7, true);
                typedArrayObtainStyledAttributes.recycle();
                i3 = color;
                i5 = resourceId;
                z3 = z12;
                i = i9;
                i4 = integer;
                z = z10;
                i7 = i10;
                i2 = i8;
                z2 = z11;
                z6 = z9;
                z4 = zHasValue;
                i6 = resourceId2;
                z5 = z8;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i = 0;
            z = true;
            z2 = true;
            z3 = true;
            i2 = 1;
            i3 = 0;
            i4 = 0;
            i5 = R.layout.exo_player_view;
            i6 = 0;
            z4 = false;
            z5 = true;
            i7 = 5000;
            z6 = true;
        }
        LayoutInflater.from(context).inflate(i5, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.m = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i);
        }
        View viewFindViewById = findViewById(R.id.exo_shutter);
        this.n = viewFindViewById;
        if (viewFindViewById != null && z4) {
            viewFindViewById.setBackgroundColor(i3);
        }
        if (aspectRatioFrameLayout == null || i2 == 0) {
            this.f37o = null;
            z7 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i2 != 2) {
                if (i2 == 3) {
                    try {
                        int i11 = Af0.w;
                        this.f37o = (View) Af0.class.getConstructor(Context.class).newInstance(context);
                        z7 = true;
                    } catch (Exception e) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                    }
                } else if (i2 != 4) {
                    this.f37o = new SurfaceView(context);
                } else {
                    try {
                        int i12 = Ps0.m;
                        this.f37o = (View) Ps0.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e2) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                    }
                }
                this.f37o.setLayoutParams(layoutParams);
                this.f37o.setOnClickListener(b10);
                this.f37o.setClickable(false);
                aspectRatioFrameLayout.addView(this.f37o, 0);
            } else {
                this.f37o = new TextureView(context);
            }
            z7 = false;
            this.f37o.setLayoutParams(layoutParams);
            this.f37o.setOnClickListener(b10);
            this.f37o.setClickable(false);
            aspectRatioFrameLayout.addView(this.f37o, 0);
        }
        this.p = z7;
        this.v = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.w = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.q = imageView2;
        this.A = z5 && imageView2 != null;
        if (i6 != 0) {
            this.B = AbstractC3354yh.b(getContext(), i6);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.r = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View viewFindViewById2 = findViewById(R.id.exo_buffering);
        this.s = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.C = i4;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.t = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C2951uZ c2951uZ = (C2951uZ) findViewById(R.id.exo_controller);
        View viewFindViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (c2951uZ != null) {
            this.u = c2951uZ;
        } else if (viewFindViewById3 != null) {
            C2951uZ c2951uZ2 = new C2951uZ(context, attributeSet);
            this.u = c2951uZ2;
            c2951uZ2.setId(R.id.exo_controller);
            c2951uZ2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(c2951uZ2, iIndexOfChild);
        } else {
            this.u = null;
        }
        C2951uZ c2951uZ3 = this.u;
        this.F = c2951uZ3 != null ? i7 : 0;
        this.I = z;
        this.G = z2;
        this.H = z3;
        this.y = z6 && c2951uZ3 != null;
        if (c2951uZ3 != null) {
            c2951uZ3.b();
            this.u.m.add(b10);
        }
        if (z6) {
            setClickable(true);
        }
        k();
    }

    public static void a(TextureView textureView, int i) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i != 0) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate(i, f, f2);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    public final boolean b() {
        C2951uZ c2951uZ = this.u;
        return c2951uZ != null && c2951uZ.d();
    }

    public final boolean c() {
        InterfaceC2370oZ interfaceC2370oZ = this.x;
        return interfaceC2370oZ != null && ((C1042as) interfaceC2370oZ).M() && ((C1042as) this.x).I();
    }

    public final void d(boolean z) {
        if (!(c() && this.H) && n()) {
            C2951uZ c2951uZ = this.u;
            boolean z2 = c2951uZ.d() && c2951uZ.getShowTimeoutMs() <= 0;
            boolean zF = f();
            if (z || z2 || zF) {
                g(zF);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC2370oZ interfaceC2370oZ = this.x;
        if (interfaceC2370oZ != null && ((C1042as) interfaceC2370oZ).M()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        C2951uZ c2951uZ = this.u;
        if (z && n() && !c2951uZ.d()) {
            d(true);
        } else {
            if ((!n() || !c2951uZ.a(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
                if (!z || !n()) {
                    return false;
                }
                d(true);
                return false;
            }
            d(true);
        }
        return true;
    }

    public final boolean e(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f = intrinsicWidth / intrinsicHeight;
                AspectRatioFrameLayout aspectRatioFrameLayout = this.m;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f);
                }
                ImageView imageView = this.q;
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        InterfaceC2370oZ interfaceC2370oZ = this.x;
        if (interfaceC2370oZ == null) {
            return true;
        }
        int iJ = ((C1042as) interfaceC2370oZ).J();
        return this.G && (iJ == 1 || iJ == 4 || !((C1042as) this.x).I());
    }

    public final void g(boolean z) {
        if (n()) {
            int i = z ? 0 : this.F;
            C2951uZ c2951uZ = this.u;
            c2951uZ.setShowTimeoutMs(i);
            if (!c2951uZ.d()) {
                c2951uZ.setVisibility(0);
                Iterator it = c2951uZ.m.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2854tZ) it.next()).c(c2951uZ.getVisibility());
                }
                c2951uZ.g();
                c2951uZ.f();
                c2951uZ.i();
                c2951uZ.j();
                c2951uZ.k();
                boolean zT = Lr0.T(c2951uZ.R);
                View view = c2951uZ.q;
                View view2 = c2951uZ.p;
                if (zT && view2 != null) {
                    view2.requestFocus();
                } else if (!zT && view != null) {
                    view.requestFocus();
                }
                boolean zT2 = Lr0.T(c2951uZ.R);
                if (zT2 && view2 != null) {
                    view2.sendAccessibilityEvent(8);
                } else if (!zT2 && view != null) {
                    view.sendAccessibilityEvent(8);
                }
            }
            c2951uZ.c();
        }
    }

    public List<O9> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        if (this.w != null) {
            arrayList.add(new O9(21));
        }
        if (this.u != null) {
            arrayList.add(new O9(21));
        }
        return AbstractC0985aF.l(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.v;
        AbstractC0397Ej.h(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public boolean getControllerAutoShow() {
        return this.G;
    }

    public boolean getControllerHideOnTouch() {
        return this.I;
    }

    public int getControllerShowTimeoutMs() {
        return this.F;
    }

    public Drawable getDefaultArtwork() {
        return this.B;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.w;
    }

    public InterfaceC2370oZ getPlayer() {
        return this.x;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.m;
        AbstractC0397Ej.g(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.r;
    }

    public boolean getUseArtwork() {
        return this.A;
    }

    public boolean getUseController() {
        return this.y;
    }

    public View getVideoSurfaceView() {
        return this.f37o;
    }

    public final void h() {
        if (!n() || this.x == null) {
            return;
        }
        C2951uZ c2951uZ = this.u;
        if (!c2951uZ.d()) {
            d(true);
        } else if (this.I) {
            c2951uZ.b();
        }
    }

    public final void i() {
        C1045at0 c1045at0;
        InterfaceC2370oZ interfaceC2370oZ = this.x;
        if (interfaceC2370oZ != null) {
            C1042as c1042as = (C1042as) interfaceC2370oZ;
            c1042as.i0();
            c1045at0 = c1042as.h0;
        } else {
            c1045at0 = C1045at0.p;
        }
        int i = c1045at0.l;
        int i2 = c1045at0.m;
        float f = (i2 == 0 || i == 0) ? 0.0f : (i * c1045at0.f684o) / i2;
        View view = this.f37o;
        if (view instanceof TextureView) {
            int i3 = c1045at0.n;
            if (f > 0.0f && (i3 == 90 || i3 == 270)) {
                f = 1.0f / f;
            }
            int i4 = this.J;
            B10 b10 = this.l;
            if (i4 != 0) {
                view.removeOnLayoutChangeListener(b10);
            }
            this.J = i3;
            if (i3 != 0) {
                view.addOnLayoutChangeListener(b10);
            }
            a((TextureView) view, this.J);
        }
        float f2 = this.p ? 0.0f : f;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.m;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    public final void j() {
        boolean z;
        View view = this.s;
        if (view != null) {
            InterfaceC2370oZ interfaceC2370oZ = this.x;
            if (interfaceC2370oZ == null || ((C1042as) interfaceC2370oZ).J() != 2) {
                z = false;
            } else {
                int i = this.C;
                z = true;
                if (i != 2 && (i != 1 || !((C1042as) this.x).I())) {
                    z = false;
                }
            }
            view.setVisibility(z ? 0 : 8);
        }
    }

    public final void k() {
        C2951uZ c2951uZ = this.u;
        if (c2951uZ == null || !this.y) {
            setContentDescription(null);
        } else if (c2951uZ.getVisibility() == 0) {
            setContentDescription(this.I ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    public final void l() {
        TextView textView = this.t;
        if (textView != null) {
            CharSequence charSequence = this.E;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            InterfaceC2370oZ interfaceC2370oZ = this.x;
            if (interfaceC2370oZ != null) {
                C1042as c1042as = (C1042as) interfaceC2370oZ;
                c1042as.i0();
                Lr lr = c1042as.j0.f;
            }
            textView.setVisibility(8);
        }
    }

    public final void m(boolean z) {
        InterfaceC2370oZ interfaceC2370oZ = this.x;
        View view = this.n;
        ImageView imageView = this.q;
        boolean zE = false;
        if (interfaceC2370oZ != null && ((AbstractC1074b8) interfaceC2370oZ).b(30)) {
            C1042as c1042as = (C1042as) interfaceC2370oZ;
            if (!c1042as.F().l.isEmpty()) {
                if (z && !this.D && view != null) {
                    view.setVisibility(0);
                }
                if (c1042as.F().a(2)) {
                    if (imageView != null) {
                        imageView.setImageResource(android.R.color.transparent);
                        imageView.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (view != null) {
                    view.setVisibility(0);
                }
                if (this.A) {
                    AbstractC0397Ej.g(imageView);
                    c1042as.i0();
                    byte[] bArr = c1042as.N.u;
                    if (bArr != null) {
                        zE = e(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                    }
                    if (zE || e(this.B)) {
                        return;
                    }
                }
                if (imageView != null) {
                    imageView.setImageResource(android.R.color.transparent);
                    imageView.setVisibility(4);
                    return;
                }
                return;
            }
        }
        if (this.D) {
            return;
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            imageView.setVisibility(4);
        }
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final boolean n() {
        if (!this.y) {
            return false;
        }
        AbstractC0397Ej.g(this.u);
        return true;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!n() || this.x == null) {
            return false;
        }
        d(true);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        h();
        return super.performClick();
    }

    public void setAspectRatioListener(Z5 z5) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.m;
        AbstractC0397Ej.g(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(z5);
    }

    public void setControllerAutoShow(boolean z) {
        this.G = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.H = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        AbstractC0397Ej.g(this.u);
        this.I = z;
        k();
    }

    public void setControllerShowTimeoutMs(int i) {
        C2951uZ c2951uZ = this.u;
        AbstractC0397Ej.g(c2951uZ);
        this.F = i;
        if (c2951uZ.d()) {
            g(f());
        }
    }

    public void setControllerVisibilityListener(InterfaceC2854tZ interfaceC2854tZ) {
        C2951uZ c2951uZ = this.u;
        AbstractC0397Ej.g(c2951uZ);
        InterfaceC2854tZ interfaceC2854tZ2 = this.z;
        if (interfaceC2854tZ2 == interfaceC2854tZ) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = c2951uZ.m;
        if (interfaceC2854tZ2 != null) {
            copyOnWriteArrayList.remove(interfaceC2854tZ2);
        }
        this.z = interfaceC2854tZ;
        if (interfaceC2854tZ != null) {
            copyOnWriteArrayList.add(interfaceC2854tZ);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        AbstractC0397Ej.f(this.t != null);
        this.E = charSequence;
        l();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.B != drawable) {
            this.B = drawable;
            m(false);
        }
    }

    public void setErrorMessageProvider(InterfaceC0689Pq interfaceC0689Pq) {
        if (interfaceC0689Pq != null) {
            l();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.D != z) {
            this.D = z;
            m(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    public void setPlayer(InterfaceC2370oZ interfaceC2370oZ) {
        boolean z;
        AbstractC0397Ej.f(Looper.myLooper() == Looper.getMainLooper());
        if (interfaceC2370oZ != null) {
            if (((C1042as) interfaceC2370oZ).s == Looper.getMainLooper()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        AbstractC0397Ej.c(z);
        InterfaceC2370oZ interfaceC2370oZ2 = this.x;
        if (interfaceC2370oZ2 == interfaceC2370oZ) {
            return;
        }
        View view = this.f37o;
        B10 b10 = this.l;
        if (interfaceC2370oZ2 != null) {
            C1042as c1042as = (C1042as) interfaceC2370oZ2;
            c1042as.S(b10);
            if (((AbstractC1074b8) interfaceC2370oZ2).b(27)) {
                if (view instanceof TextureView) {
                    TextureView textureView = (TextureView) view;
                    c1042as.i0();
                    if (textureView != null && textureView == c1042as.W) {
                        c1042as.s();
                    }
                } else if (view instanceof SurfaceView) {
                    SurfaceView surfaceView = (SurfaceView) view;
                    c1042as.i0();
                    SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
                    c1042as.i0();
                    if (holder != null && holder == c1042as.T) {
                        c1042as.s();
                    }
                }
            }
        }
        SubtitleView subtitleView = this.r;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.x = interfaceC2370oZ;
        boolean zN = n();
        C2951uZ c2951uZ = this.u;
        if (zN) {
            c2951uZ.setPlayer(interfaceC2370oZ);
        }
        j();
        l();
        m(true);
        if (interfaceC2370oZ == null) {
            if (c2951uZ != null) {
                c2951uZ.b();
                return;
            }
            return;
        }
        AbstractC1074b8 abstractC1074b8 = (AbstractC1074b8) interfaceC2370oZ;
        if (abstractC1074b8.b(27)) {
            if (view instanceof TextureView) {
                TextureView textureView2 = (TextureView) view;
                C1042as c1042as2 = (C1042as) interfaceC2370oZ;
                c1042as2.i0();
                if (textureView2 == null) {
                    c1042as2.s();
                } else {
                    c1042as2.T();
                    c1042as2.W = textureView2;
                    if (textureView2.getSurfaceTextureListener() != null) {
                        AP.z();
                    }
                    textureView2.setSurfaceTextureListener(c1042as2.x);
                    SurfaceTexture surfaceTexture = textureView2.isAvailable() ? textureView2.getSurfaceTexture() : null;
                    if (surfaceTexture == null) {
                        c1042as2.b0(null);
                        c1042as2.P(0, 0);
                    } else {
                        Surface surface = new Surface(surfaceTexture);
                        c1042as2.b0(surface);
                        c1042as2.S = surface;
                        c1042as2.P(textureView2.getWidth(), textureView2.getHeight());
                    }
                }
            } else if (view instanceof SurfaceView) {
                SurfaceView surfaceView2 = (SurfaceView) view;
                C1042as c1042as3 = (C1042as) interfaceC2370oZ;
                c1042as3.i0();
                if (surfaceView2 instanceof Rs0) {
                    c1042as3.T();
                    c1042as3.b0(surfaceView2);
                    c1042as3.X(surfaceView2.getHolder());
                } else {
                    boolean z2 = surfaceView2 instanceof Af0;
                    SurfaceHolderCallbackC0898Xr surfaceHolderCallbackC0898Xr = c1042as3.x;
                    if (z2) {
                        c1042as3.T();
                        c1042as3.U = (Af0) surfaceView2;
                        BZ bzU = c1042as3.u(c1042as3.y);
                        AbstractC0397Ej.f(!bzU.g);
                        bzU.d = 10000;
                        Af0 af0 = c1042as3.U;
                        AbstractC0397Ej.f(true ^ bzU.g);
                        bzU.e = af0;
                        bzU.c();
                        c1042as3.U.l.add(surfaceHolderCallbackC0898Xr);
                        c1042as3.b0(c1042as3.U.getVideoSurface());
                        c1042as3.X(surfaceView2.getHolder());
                    } else {
                        SurfaceHolder holder2 = surfaceView2 == null ? null : surfaceView2.getHolder();
                        c1042as3.i0();
                        if (holder2 == null) {
                            c1042as3.s();
                        } else {
                            c1042as3.T();
                            c1042as3.V = true;
                            c1042as3.T = holder2;
                            holder2.addCallback(surfaceHolderCallbackC0898Xr);
                            Surface surface2 = holder2.getSurface();
                            if (surface2 == null || !surface2.isValid()) {
                                c1042as3.b0(null);
                                c1042as3.P(0, 0);
                            } else {
                                c1042as3.b0(surface2);
                                Rect surfaceFrame = holder2.getSurfaceFrame();
                                c1042as3.P(surfaceFrame.width(), surfaceFrame.height());
                            }
                        }
                    }
                }
            }
            i();
        }
        if (subtitleView != null && abstractC1074b8.b(28)) {
            C1042as c1042as4 = (C1042as) interfaceC2370oZ;
            c1042as4.i0();
            subtitleView.setCues(c1042as4.d0.l);
        }
        b10.getClass();
        ((C1042as) interfaceC2370oZ).l.a(b10);
        d(false);
    }

    public void setRepeatToggleModes(int i) {
        C2951uZ c2951uZ = this.u;
        AbstractC0397Ej.g(c2951uZ);
        c2951uZ.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.m;
        AbstractC0397Ej.g(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.C != i) {
            this.C = i;
            j();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        C2951uZ c2951uZ = this.u;
        AbstractC0397Ej.g(c2951uZ);
        c2951uZ.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        C2951uZ c2951uZ = this.u;
        AbstractC0397Ej.g(c2951uZ);
        c2951uZ.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        C2951uZ c2951uZ = this.u;
        AbstractC0397Ej.g(c2951uZ);
        c2951uZ.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        C2951uZ c2951uZ = this.u;
        AbstractC0397Ej.g(c2951uZ);
        c2951uZ.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        C2951uZ c2951uZ = this.u;
        AbstractC0397Ej.g(c2951uZ);
        c2951uZ.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        C2951uZ c2951uZ = this.u;
        AbstractC0397Ej.g(c2951uZ);
        c2951uZ.setShowShuffleButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.n;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setUseArtwork(boolean z) {
        AbstractC0397Ej.f((z && this.q == null) ? false : true);
        if (this.A != z) {
            this.A = z;
            m(false);
        }
    }

    public void setUseController(boolean z) {
        boolean z2 = true;
        C2951uZ c2951uZ = this.u;
        AbstractC0397Ej.f((z && c2951uZ == null) ? false : true);
        if (!z && !hasOnClickListeners()) {
            z2 = false;
        }
        setClickable(z2);
        if (this.y == z) {
            return;
        }
        this.y = z;
        if (n()) {
            c2951uZ.setPlayer(this.x);
        } else if (c2951uZ != null) {
            c2951uZ.b();
            c2951uZ.setPlayer(null);
        }
        k();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f37o;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }
}
