.class public Lnet/youmi/android/c/a/p;
.super Landroid/widget/ImageView;


# instance fields
.field private a:F

.field private b:F

.field private c:Landroid/view/ViewTreeObserver$OnPreDrawListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput v0, p0, Lnet/youmi/android/c/a/p;->a:F

    iput v0, p0, Lnet/youmi/android/c/a/p;->b:F

    const/4 v0, 0x0

    iput-object v0, p0, Lnet/youmi/android/c/a/p;->c:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    return-void
.end method

.method static synthetic a(Lnet/youmi/android/c/a/p;)Landroid/view/ViewTreeObserver$OnPreDrawListener;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/c/a/p;->c:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    return-object v0
.end method

.method static synthetic b(Lnet/youmi/android/c/a/p;)F
    .locals 1

    iget v0, p0, Lnet/youmi/android/c/a/p;->a:F

    return v0
.end method

.method static synthetic c(Lnet/youmi/android/c/a/p;)F
    .locals 1

    iget v0, p0, Lnet/youmi/android/c/a/p;->b:F

    return v0
.end method


# virtual methods
.method public setAccordionPivotWidth(F)V
    .locals 1

    invoke-virtual {p0, p1}, Lnet/youmi/android/c/a/p;->setScaleX(F)V

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotX(F)V

    return-void
.end method

.method public setAccordionPivotZero(F)V
    .locals 1

    invoke-virtual {p0, p1}, Lnet/youmi/android/c/a/p;->setScaleX(F)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotX(F)V

    return-void
.end method

.method public setCube(F)V
    .locals 1

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setTranslationX(F)V

    const/high16 v0, 0x42b40000    # 90.0f

    mul-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setRotationY(F)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotX(F)V

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotY(F)V

    return-void
.end method

.method public setCubeBack(F)V
    .locals 1

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setTranslationX(F)V

    const/high16 v0, 0x42b40000    # 90.0f

    mul-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setRotationY(F)V

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotY(F)V

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotX(F)V

    return-void
.end method

.method public setGlide(F)V
    .locals 1

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setTranslationX(F)V

    const/high16 v0, 0x42b40000    # 90.0f

    mul-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setRotationY(F)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotX(F)V

    return-void
.end method

.method public setGlideBack(F)V
    .locals 2

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p1

    const/high16 v1, 0x3fc00000    # 1.5f

    mul-float/2addr v0, v1

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setTranslationX(F)V

    const/high16 v0, 0x42340000    # 45.0f

    mul-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setRotationY(F)V

    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p1, v1

    sub-float/2addr v0, v1

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setScaleY(F)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotX(F)V

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotY(F)V

    return-void
.end method

.method public setLeftGlideBack(F)V
    .locals 2

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p1

    const/high16 v1, -0x40400000    # -1.5f

    mul-float/2addr v0, v1

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setTranslationX(F)V

    const/high16 v0, -0x3dcc0000    # -45.0f

    mul-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setRotationY(F)V

    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p1, v1

    sub-float/2addr v0, v1

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setScaleY(F)V

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotX(F)V

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotY(F)V

    return-void
.end method

.method public setRotateDown(F)V
    .locals 1

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setTranslationX(F)V

    const/high16 v0, 0x41a00000    # 20.0f

    mul-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setRotation(F)V

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getHeight()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotY(F)V

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotX(F)V

    return-void
.end method

.method public setRotateUp(F)V
    .locals 1

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setTranslationX(F)V

    const/high16 v0, -0x3e600000    # -20.0f

    mul-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setRotation(F)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotY(F)V

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotX(F)V

    return-void
.end method

.method public setTableHorizontalPivotWidth(F)V
    .locals 1

    const/high16 v0, -0x3d4c0000    # -90.0f

    mul-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setRotationY(F)V

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotX(F)V

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotY(F)V

    return-void
.end method

.method public setTableHorizontalPivotZero(F)V
    .locals 1

    const/high16 v0, 0x42b40000    # 90.0f

    mul-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setRotationY(F)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotX(F)V

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotY(F)V

    return-void
.end method

.method public setTableVerticalPivotHeight(F)V
    .locals 1

    const/high16 v0, 0x42b40000    # 90.0f

    mul-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setRotationX(F)V

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotX(F)V

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getHeight()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotY(F)V

    return-void
.end method

.method public setTableVerticalPivotZero(F)V
    .locals 1

    const/high16 v0, -0x3d4c0000    # -90.0f

    mul-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setRotationX(F)V

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotX(F)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotY(F)V

    return-void
.end method

.method public setXFraction(F)V
    .locals 2

    iput p1, p0, Lnet/youmi/android/c/a/p;->b:F

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getWidth()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/c/a/p;->c:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/c/a/r;

    invoke-direct {v0, p0}, Lnet/youmi/android/c/a/r;-><init>(Lnet/youmi/android/c/a/p;)V

    iput-object v0, p0, Lnet/youmi/android/c/a/p;->c:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/c/a/p;->c:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setTranslationX(F)V

    goto :goto_0
.end method

.method public setYFraction(F)V
    .locals 2

    iput p1, p0, Lnet/youmi/android/c/a/p;->a:F

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getHeight()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/c/a/p;->c:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/c/a/q;

    invoke-direct {v0, p0}, Lnet/youmi/android/c/a/q;-><init>(Lnet/youmi/android/c/a/p;)V

    iput-object v0, p0, Lnet/youmi/android/c/a/p;->c:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/c/a/p;->c:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getHeight()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setTranslationY(F)V

    goto :goto_0
.end method

.method public setZoomFromCornerPivotHG(F)V
    .locals 1

    invoke-virtual {p0, p1}, Lnet/youmi/android/c/a/p;->setScaleX(F)V

    invoke-virtual {p0, p1}, Lnet/youmi/android/c/a/p;->setScaleY(F)V

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotX(F)V

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getHeight()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotY(F)V

    return-void
.end method

.method public setZoomFromCornerPivotHeight(F)V
    .locals 1

    invoke-virtual {p0, p1}, Lnet/youmi/android/c/a/p;->setScaleX(F)V

    invoke-virtual {p0, p1}, Lnet/youmi/android/c/a/p;->setScaleY(F)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotX(F)V

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getHeight()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotY(F)V

    return-void
.end method

.method public setZoomFromCornerPivotWidth(F)V
    .locals 1

    invoke-virtual {p0, p1}, Lnet/youmi/android/c/a/p;->setScaleX(F)V

    invoke-virtual {p0, p1}, Lnet/youmi/android/c/a/p;->setScaleY(F)V

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotX(F)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotY(F)V

    return-void
.end method

.method public setZoomFromCornerPivotZero(F)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1}, Lnet/youmi/android/c/a/p;->setScaleX(F)V

    invoke-virtual {p0, p1}, Lnet/youmi/android/c/a/p;->setScaleY(F)V

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotX(F)V

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotY(F)V

    return-void
.end method

.method public setZoomSlideHorizontal(F)V
    .locals 1

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setTranslationX(F)V

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotX(F)V

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotY(F)V

    return-void
.end method

.method public setZoomSlideVertical(F)V
    .locals 1

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getHeight()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setTranslationY(F)V

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotX(F)V

    invoke-virtual {p0}, Lnet/youmi/android/c/a/p;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/p;->setPivotY(F)V

    return-void
.end method
