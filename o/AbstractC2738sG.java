package o;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: o.sG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2738sG {
    public static final Rect a = new Rect();

    public static int a(View view, C2641rG c2641rG, int i) {
        View viewFindViewById;
        int height;
        int width;
        int width2;
        int width3;
        C2926uA c2926uA = (C2926uA) view.getLayoutParams();
        int i2 = c2641rG.a;
        if (i2 == 0 || (viewFindViewById = view.findViewById(i2)) == null) {
            viewFindViewById = view;
        }
        int paddingBottom = c2641rG.b;
        Rect rect = a;
        if (i != 0) {
            if (c2641rG.d) {
                float f = c2641rG.c;
                if (f == 0.0f) {
                    paddingBottom += viewFindViewById.getPaddingTop();
                } else if (f == 100.0f) {
                    paddingBottom -= viewFindViewById.getPaddingBottom();
                }
            }
            if (c2641rG.c != -1.0f) {
                if (viewFindViewById == view) {
                    c2926uA.getClass();
                    height = (viewFindViewById.getHeight() - c2926uA.f) - c2926uA.h;
                } else {
                    height = viewFindViewById.getHeight();
                }
                paddingBottom += (int) ((height * c2641rG.c) / 100.0f);
            }
            if (view == viewFindViewById) {
                return paddingBottom;
            }
            rect.top = paddingBottom;
            ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect);
            return rect.top - c2926uA.f;
        }
        if (view.getLayoutDirection() != 1) {
            if (c2641rG.d) {
                float f2 = c2641rG.c;
                if (f2 == 0.0f) {
                    paddingBottom += viewFindViewById.getPaddingLeft();
                } else if (f2 == 100.0f) {
                    paddingBottom -= viewFindViewById.getPaddingRight();
                }
            }
            if (c2641rG.c != -1.0f) {
                if (viewFindViewById == view) {
                    c2926uA.getClass();
                    width = (viewFindViewById.getWidth() - c2926uA.e) - c2926uA.g;
                } else {
                    width = viewFindViewById.getWidth();
                }
                paddingBottom += (int) ((width * c2641rG.c) / 100.0f);
            }
            int i3 = paddingBottom;
            if (view == viewFindViewById) {
                return i3;
            }
            rect.left = i3;
            ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect);
            return rect.left - c2926uA.e;
        }
        if (viewFindViewById == view) {
            c2926uA.getClass();
            width2 = (viewFindViewById.getWidth() - c2926uA.e) - c2926uA.g;
        } else {
            width2 = viewFindViewById.getWidth();
        }
        int paddingLeft = width2 - paddingBottom;
        if (c2641rG.d) {
            float f3 = c2641rG.c;
            if (f3 == 0.0f) {
                paddingLeft -= viewFindViewById.getPaddingRight();
            } else if (f3 == 100.0f) {
                paddingLeft += viewFindViewById.getPaddingLeft();
            }
        }
        if (c2641rG.c != -1.0f) {
            if (viewFindViewById == view) {
                c2926uA.getClass();
                width3 = (viewFindViewById.getWidth() - c2926uA.e) - c2926uA.g;
            } else {
                width3 = viewFindViewById.getWidth();
            }
            paddingLeft -= (int) ((width3 * c2641rG.c) / 100.0f);
        }
        if (view == viewFindViewById) {
            return paddingLeft;
        }
        rect.right = paddingLeft;
        ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect);
        return rect.right + c2926uA.g;
    }
}
