.class public Lnet/youmi/android/a/b/l/a;
.super Landroid/widget/ImageButton;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0, p1}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;)V

    :try_start_0
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/b/l/a;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    invoke-static {p2}, Lnet/youmi/android/a/b/k/b;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Lnet/youmi/android/a/b/l/a;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-direct {p0, v1, v1}, Lnet/youmi/android/a/b/l/a;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x0

    invoke-direct {p0, p1}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;)V

    :try_start_0
    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v1}, Lnet/youmi/android/a/b/l/a;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    invoke-static {p2}, Lnet/youmi/android/a/b/k/b;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Lnet/youmi/android/a/b/l/a;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {v1, v3, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    :goto_0
    invoke-static {p3}, Lnet/youmi/android/a/b/k/b;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Lnet/youmi/android/a/b/l/a;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {v0, v3, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    :cond_0
    invoke-direct {p0, v1, v0}, Lnet/youmi/android/a/b/l/a;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-void

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_1
    move-object v1, v0

    goto :goto_0
.end method

.method private a(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 1

    :try_start_0
    new-instance v0, Lnet/youmi/android/a/b/l/c;

    invoke-direct {v0, p0, p1, p2}, Lnet/youmi/android/a/b/l/c;-><init>(Lnet/youmi/android/a/b/l/a;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/b/l/a;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    :try_start_1
    new-instance v0, Lnet/youmi/android/a/b/l/b;

    invoke-direct {v0, p0}, Lnet/youmi/android/a/b/l/b;-><init>(Lnet/youmi/android/a/b/l/a;)V

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/b/l/a;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    return-void

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method static synthetic a()[I
    .locals 1

    sget-object v0, Lnet/youmi/android/a/b/l/a;->PRESSED_ENABLED_STATE_SET:[I

    return-object v0
.end method

.method static synthetic b()[I
    .locals 1

    sget-object v0, Lnet/youmi/android/a/b/l/a;->ENABLED_STATE_SET:[I

    return-object v0
.end method

.method static synthetic c()[I
    .locals 1

    sget-object v0, Lnet/youmi/android/a/b/l/a;->EMPTY_STATE_SET:[I

    return-object v0
.end method

.method static synthetic d()[I
    .locals 1

    sget-object v0, Lnet/youmi/android/a/b/l/a;->PRESSED_ENABLED_STATE_SET:[I

    return-object v0
.end method

.method static synthetic e()[I
    .locals 1

    sget-object v0, Lnet/youmi/android/a/b/l/a;->ENABLED_STATE_SET:[I

    return-object v0
.end method

.method static synthetic f()[I
    .locals 1

    sget-object v0, Lnet/youmi/android/a/b/l/a;->EMPTY_STATE_SET:[I

    return-object v0
.end method
