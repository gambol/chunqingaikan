.class public Lnet/youmi/android/banner/AdSize;
.super Ljava/lang/Object;


# static fields
.field public static final FILL_PARENT:I = -0x1

.field public static final FIT_SCREEN:Lnet/youmi/android/banner/AdSize;

.field public static final LANDSPACE_AD_HEIGHT:I = 0x20

.field public static final LARGE_AD_HEIGHT:I = 0x5a

.field public static final PORAIT_AD_HEIGHT:I = 0x32

.field public static final SIZE_300x250:Lnet/youmi/android/banner/AdSize;

.field public static final SIZE_320x50:Lnet/youmi/android/banner/AdSize;

.field public static final SIZE_468x60:Lnet/youmi/android/banner/AdSize;

.field public static final SIZE_728x90:Lnet/youmi/android/banner/AdSize;

.field public static final WRAP_CONTENT:I = -0x2


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lnet/youmi/android/banner/AdSize;

    const/16 v1, 0x140

    const/16 v2, 0x32

    invoke-direct {v0, v1, v2}, Lnet/youmi/android/banner/AdSize;-><init>(II)V

    sput-object v0, Lnet/youmi/android/banner/AdSize;->SIZE_320x50:Lnet/youmi/android/banner/AdSize;

    new-instance v0, Lnet/youmi/android/banner/AdSize;

    const/16 v1, 0x12c

    const/16 v2, 0xfa

    invoke-direct {v0, v1, v2}, Lnet/youmi/android/banner/AdSize;-><init>(II)V

    sput-object v0, Lnet/youmi/android/banner/AdSize;->SIZE_300x250:Lnet/youmi/android/banner/AdSize;

    new-instance v0, Lnet/youmi/android/banner/AdSize;

    const/16 v1, 0x1d4

    const/16 v2, 0x3c

    invoke-direct {v0, v1, v2}, Lnet/youmi/android/banner/AdSize;-><init>(II)V

    sput-object v0, Lnet/youmi/android/banner/AdSize;->SIZE_468x60:Lnet/youmi/android/banner/AdSize;

    new-instance v0, Lnet/youmi/android/banner/AdSize;

    const/16 v1, 0x2d8

    const/16 v2, 0x5a

    invoke-direct {v0, v1, v2}, Lnet/youmi/android/banner/AdSize;-><init>(II)V

    sput-object v0, Lnet/youmi/android/banner/AdSize;->SIZE_728x90:Lnet/youmi/android/banner/AdSize;

    new-instance v0, Lnet/youmi/android/banner/AdSize;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Lnet/youmi/android/banner/AdSize;-><init>(II)V

    sput-object v0, Lnet/youmi/android/banner/AdSize;->FIT_SCREEN:Lnet/youmi/android/banner/AdSize;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lnet/youmi/android/banner/AdSize;->a:I

    iput p2, p0, Lnet/youmi/android/banner/AdSize;->b:I

    return-void
.end method


# virtual methods
.method public getAdHeight()I
    .locals 1

    iget v0, p0, Lnet/youmi/android/banner/AdSize;->b:I

    return v0
.end method

.method public getAdWidth()I
    .locals 1

    iget v0, p0, Lnet/youmi/android/banner/AdSize;->a:I

    return v0
.end method

.method public resizeHeight(Landroid/content/Context;)I
    .locals 3

    invoke-static {p1}, Lnet/youmi/android/a/b/k/f;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/k/f;

    move-result-object v0

    iget v1, p0, Lnet/youmi/android/banner/AdSize;->b:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    const/4 v1, 0x0

    iput v1, p0, Lnet/youmi/android/banner/AdSize;->d:I

    :cond_0
    :goto_0
    iget v1, p0, Lnet/youmi/android/banner/AdSize;->b:I

    int-to-float v1, v1

    invoke-virtual {v0}, Lnet/youmi/android/a/b/k/f;->f()F

    move-result v0

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lnet/youmi/android/banner/AdSize;->d:I

    iget v0, p0, Lnet/youmi/android/banner/AdSize;->d:I

    return v0

    :cond_1
    iget v1, p0, Lnet/youmi/android/banner/AdSize;->b:I

    const/4 v2, -0x2

    if-ne v1, v2, :cond_0

    iget v1, p0, Lnet/youmi/android/banner/AdSize;->a:I

    mul-int/lit8 v1, v1, 0x32

    div-int/lit16 v1, v1, 0x140

    iput v1, p0, Lnet/youmi/android/banner/AdSize;->b:I

    goto :goto_0
.end method

.method public resizeWidth(Landroid/content/Context;)I
    .locals 3

    invoke-static {p1}, Lnet/youmi/android/a/b/k/f;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/k/f;

    move-result-object v0

    iget v1, p0, Lnet/youmi/android/banner/AdSize;->a:I

    const/4 v2, -0x2

    if-ne v1, v2, :cond_0

    const/4 v0, 0x0

    iput v0, p0, Lnet/youmi/android/banner/AdSize;->c:I

    :goto_0
    iget v0, p0, Lnet/youmi/android/banner/AdSize;->c:I

    return v0

    :cond_0
    iget v1, p0, Lnet/youmi/android/banner/AdSize;->a:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    invoke-virtual {v0}, Lnet/youmi/android/a/b/k/f;->g()I

    move-result v1

    iput v1, p0, Lnet/youmi/android/banner/AdSize;->c:I

    iget v1, p0, Lnet/youmi/android/banner/AdSize;->c:I

    int-to-float v1, v1

    invoke-virtual {v0}, Lnet/youmi/android/a/b/k/f;->f()F

    move-result v0

    div-float v0, v1, v0

    float-to-int v0, v0

    iput v0, p0, Lnet/youmi/android/banner/AdSize;->a:I

    goto :goto_0

    :cond_1
    iget v1, p0, Lnet/youmi/android/banner/AdSize;->a:I

    int-to-float v1, v1

    invoke-virtual {v0}, Lnet/youmi/android/a/b/k/f;->f()F

    move-result v0

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lnet/youmi/android/banner/AdSize;->c:I

    goto :goto_0
.end method
