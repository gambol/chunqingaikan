.class Lnet/youmi/android/a/a/i/a/m;
.super Ljava/lang/Object;


# instance fields
.field private a:Lnet/youmi/android/a/a/i/a/k;

.field private b:F

.field private c:I

.field private d:Landroid/graphics/drawable/Drawable;

.field private e:I

.field private f:I


# direct methods
.method private constructor <init>(Lnet/youmi/android/a/a/i/a/k;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lnet/youmi/android/a/a/i/a/m;->b:F

    const/4 v0, -0x1

    iput v0, p0, Lnet/youmi/android/a/a/i/a/m;->c:I

    iput v1, p0, Lnet/youmi/android/a/a/i/a/m;->e:I

    const/16 v0, 0x96

    invoke-static {v0, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lnet/youmi/android/a/a/i/a/m;->f:I

    iput-object p1, p0, Lnet/youmi/android/a/a/i/a/m;->a:Lnet/youmi/android/a/a/i/a/k;

    return-void
.end method

.method synthetic constructor <init>(Lnet/youmi/android/a/a/i/a/k;Lnet/youmi/android/a/a/i/a/l;)V
    .locals 0

    invoke-direct {p0, p1}, Lnet/youmi/android/a/a/i/a/m;-><init>(Lnet/youmi/android/a/a/i/a/k;)V

    return-void
.end method


# virtual methods
.method public a(F)Lnet/youmi/android/a/a/i/a/m;
    .locals 0

    iput p1, p0, Lnet/youmi/android/a/a/i/a/m;->b:F

    return-object p0
.end method

.method public a(I)Lnet/youmi/android/a/a/i/a/m;
    .locals 0

    iput p1, p0, Lnet/youmi/android/a/a/i/a/m;->c:I

    return-object p0
.end method

.method public a(Landroid/graphics/drawable/Drawable;)Lnet/youmi/android/a/a/i/a/m;
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/i/a/m;->d:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public b(I)Lnet/youmi/android/a/a/i/a/m;
    .locals 0

    iput p1, p0, Lnet/youmi/android/a/a/i/a/m;->e:I

    return-object p0
.end method
