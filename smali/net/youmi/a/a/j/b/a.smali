.class public Lnet/youmi/android/a/a/j/b/a;
.super Lnet/youmi/android/a/a/j/b/d;


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/widget/ImageView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/view/animation/Animation;

.field private e:Landroid/view/animation/Animation;

.field private f:Landroid/view/animation/Animation;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lnet/youmi/android/a/a/j/b/d;-><init>(Landroid/content/Context;)V

    invoke-direct {p0}, Lnet/youmi/android/a/a/j/b/a;->e()V

    invoke-direct {p0, p1}, Lnet/youmi/android/a/a/j/b/a;->a(Landroid/content/Context;)V

    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 4

    :try_start_0
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/j/b/a;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v0, 0x0

    const/high16 v1, 0x40a00000    # 5.0f

    invoke-static {p1, v1}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/high16 v3, 0x41000000    # 8.0f

    invoke-static {p1, v3}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v3

    invoke-virtual {p0, v0, v1, v2, v3}, Lnet/youmi/android/a/a/j/b/a;->setPadding(IIII)V

    new-instance v0, Landroid/widget/ImageView;

    invoke-direct {v0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->a:Landroid/widget/ImageView;

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->a:Landroid/widget/ImageView;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setId(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->a:Landroid/widget/ImageView;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->a:Landroid/widget/ImageView;

    invoke-static {}, Lnet/youmi/android/a/a/h/b;->l()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lnet/youmi/android/a/b/k/b;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/high16 v1, 0x42200000    # 40.0f

    invoke-static {p1, v1}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v1

    const/high16 v2, 0x42200000    # 40.0f

    invoke-static {p1, v2}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0xe

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v1, p0, Lnet/youmi/android/a/a/j/b/a;->a:Landroid/widget/ImageView;

    invoke-virtual {p0, v1, v0}, Lnet/youmi/android/a/a/j/b/a;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/ImageView;

    invoke-direct {v0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->b:Landroid/widget/ImageView;

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->b:Landroid/widget/ImageView;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setId(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->b:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->b:Landroid/widget/ImageView;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->b:Landroid/widget/ImageView;

    invoke-static {}, Lnet/youmi/android/a/a/h/b;->m()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lnet/youmi/android/a/b/k/b;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/high16 v1, 0x42200000    # 40.0f

    invoke-static {p1, v1}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v1

    const/high16 v2, 0x42200000    # 40.0f

    invoke-static {p1, v2}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0xe

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v1, p0, Lnet/youmi/android/a/a/j/b/a;->b:Landroid/widget/ImageView;

    invoke-virtual {p0, v1, v0}, Lnet/youmi/android/a/a/j/b/a;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->c:Landroid/widget/TextView;

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->c:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setId(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->c:Landroid/widget/TextView;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->c:Landroid/widget/TextView;

    const/4 v1, 0x2

    const/high16 v2, 0x41700000    # 15.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->c:Landroid/widget/TextView;

    const-string v1, "#999999"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0xe

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/4 v1, 0x3

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/4 v1, 0x3

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    iget-object v1, p0, Lnet/youmi/android/a/a/j/b/a;->c:Landroid/widget/TextView;

    invoke-virtual {p0, v1, v0}, Lnet/youmi/android/a/a/j/b/a;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Z)V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->c:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method private e()V
    .locals 7

    :try_start_0
    new-instance v0, Landroid/view/animation/RotateAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x43340000    # 180.0f

    const/4 v3, 0x1

    const/high16 v4, 0x3f000000    # 0.5f

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    iput-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->d:Landroid/view/animation/Animation;

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->d:Landroid/view/animation/Animation;

    const-wide/16 v2, 0x96

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->d:Landroid/view/animation/Animation;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    new-instance v0, Landroid/view/animation/RotateAnimation;

    const/high16 v1, -0x3ccc0000    # -180.0f

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/high16 v4, 0x3f000000    # 0.5f

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    iput-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->e:Landroid/view/animation/Animation;

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->e:Landroid/view/animation/Animation;

    const-wide/16 v2, 0x96

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->e:Landroid/view/animation/Animation;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    new-instance v0, Landroid/view/animation/RotateAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x43b40000    # 360.0f

    const/4 v3, 0x1

    const/high16 v4, 0x3f000000    # 0.5f

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    iput-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->f:Landroid/view/animation/Animation;

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->f:Landroid/view/animation/Animation;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->f:Landroid/view/animation/Animation;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setRepeatMode(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->f:Landroid/view/animation/Animation;

    const v1, 0x7fffffff

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setRepeatCount(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->f:Landroid/view/animation/Animation;

    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method protected a()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->a:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->a:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->b:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->b:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->b:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_1
    invoke-static {}, Lnet/youmi/android/a/a/h/a;->y()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lnet/youmi/android/a/a/j/b/a;->a(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected b()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->a:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->a:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    sget-object v0, Lnet/youmi/android/a/a/j/b/c;->c:Lnet/youmi/android/a/a/j/b/c;

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/b/a;->getPreState()Lnet/youmi/android/a/a/j/b/c;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->a:Landroid/widget/ImageView;

    iget-object v1, p0, Lnet/youmi/android/a/a/j/b/a;->e:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->b:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->b:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->b:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_1
    invoke-static {}, Lnet/youmi/android/a/a/h/a;->y()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lnet/youmi/android/a/a/j/b/a;->a(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected c()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->a:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->a:Landroid/widget/ImageView;

    iget-object v1, p0, Lnet/youmi/android/a/a/j/b/a;->d:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->b:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->b:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->b:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_1
    invoke-static {}, Lnet/youmi/android/a/a/h/a;->z()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lnet/youmi/android/a/a/j/b/a;->a(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected d()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->a:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->a:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->b:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->b:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/a;->b:Landroid/widget/ImageView;

    iget-object v1, p0, Lnet/youmi/android/a/a/j/b/a;->f:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_1
    invoke-static {}, Lnet/youmi/android/a/a/h/a;->x()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lnet/youmi/android/a/a/j/b/a;->a(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
