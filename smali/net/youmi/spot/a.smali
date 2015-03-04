.class public Lnet/youmi/android/spot/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "InlinedApi"
    }
.end annotation


# static fields
.field private static T:[F

.field private static U:[I

.field public static k:Landroid/graphics/Bitmap;


# instance fields
.field private A:Z

.field private B:Ljava/lang/String;

.field private C:Ljava/lang/String;

.field private D:Ljava/lang/String;

.field private E:Ljava/lang/String;

.field private F:Ljava/lang/String;

.field private G:Ljava/lang/String;

.field private H:Ljava/lang/String;

.field private I:Ljava/lang/String;

.field private J:I

.field private K:I

.field private L:I

.field private M:Ljava/lang/String;

.field private N:Z

.field private O:I

.field private final P:I

.field private final Q:I

.field private R:Landroid/widget/ImageView;

.field private S:Lorg/json/JSONObject;

.field private final V:Ljava/lang/String;

.field private W:F

.field protected a:Landroid/view/WindowManager;

.field protected b:Landroid/widget/RelativeLayout;

.field c:Landroid/graphics/drawable/BitmapDrawable;

.field protected d:I

.field protected e:I

.field f:I

.field g:I

.field h:I

.field i:I

.field j:I

.field public l:Landroid/os/Handler;

.field private final m:I

.field private final n:I

.field private o:I

.field private p:Landroid/content/Context;

.field private q:Landroid/view/WindowManager$LayoutParams;

.field private r:Landroid/widget/RelativeLayout$LayoutParams;

.field private s:Landroid/widget/RelativeLayout;

.field private t:Z

.field private u:Landroid/widget/ImageButton;

.field private v:Lnet/youmi/android/spot/SpotDialogListener;

.field private w:Lnet/youmi/android/spot/e;

.field private x:Z

.field private y:J

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lnet/youmi/android/c/a/c;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/spot/a;->k:Landroid/graphics/Bitmap;

    const/16 v0, 0x8

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    sput-object v0, Lnet/youmi/android/spot/a;->T:[F

    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x0

    const-string v2, "#ECECFB"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    aput v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "#CACAD9"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    aput v2, v0, v1

    sput-object v0, Lnet/youmi/android/spot/a;->U:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x41200000    # 10.0f
        0x41200000    # 10.0f
        0x41200000    # 10.0f
        0x41200000    # 10.0f
        0x41200000    # 10.0f
        0x41200000    # 10.0f
        0x41200000    # 10.0f
        0x41200000    # 10.0f
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Lorg/json/JSONObject;ILnet/youmi/android/spot/SpotDialogListener;)V
    .locals 5

    const/4 v2, -0x1

    const/4 v4, 0x1

    const/4 v3, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v3, p0, Lnet/youmi/android/spot/a;->m:I

    const/16 v0, 0x1f4

    iput v0, p0, Lnet/youmi/android/spot/a;->n:I

    const/4 v0, 0x2

    iput v0, p0, Lnet/youmi/android/spot/a;->o:I

    iput-boolean v3, p0, Lnet/youmi/android/spot/a;->t:Z

    iput-boolean v3, p0, Lnet/youmi/android/spot/a;->x:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lnet/youmi/android/spot/a;->y:J

    iput-boolean v3, p0, Lnet/youmi/android/spot/a;->z:Z

    iput-boolean v4, p0, Lnet/youmi/android/spot/a;->A:Z

    iput v2, p0, Lnet/youmi/android/spot/a;->d:I

    iput-boolean v3, p0, Lnet/youmi/android/spot/a;->N:Z

    iput v2, p0, Lnet/youmi/android/spot/a;->O:I

    iput v3, p0, Lnet/youmi/android/spot/a;->f:I

    iput v3, p0, Lnet/youmi/android/spot/a;->g:I

    iput v3, p0, Lnet/youmi/android/spot/a;->h:I

    iput v4, p0, Lnet/youmi/android/spot/a;->P:I

    const/4 v0, 0x4

    iput v0, p0, Lnet/youmi/android/spot/a;->Q:I

    const-string v0, "#AA000000"

    iput-object v0, p0, Lnet/youmi/android/spot/a;->V:Ljava/lang/String;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lnet/youmi/android/spot/a;->W:F

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/spot/a;->l:Landroid/os/Handler;

    iput-object p1, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    iput-object p4, p0, Lnet/youmi/android/spot/a;->v:Lnet/youmi/android/spot/SpotDialogListener;

    iput-object p2, p0, Lnet/youmi/android/spot/a;->S:Lorg/json/JSONObject;

    iput p3, p0, Lnet/youmi/android/spot/a;->O:I

    iget v0, p0, Lnet/youmi/android/spot/a;->O:I

    if-ne v0, v2, :cond_0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x80

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v1, "orientation"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lnet/youmi/android/spot/a;->O:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    iget v0, p0, Lnet/youmi/android/spot/a;->O:I

    if-gt v0, v4, :cond_1

    iget v0, p0, Lnet/youmi/android/spot/a;->O:I

    if-gez v0, :cond_2

    :cond_1
    iput v3, p0, Lnet/youmi/android/spot/a;->O:I

    :cond_2
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    iput-boolean v4, p0, Lnet/youmi/android/spot/a;->z:Z

    :cond_3
    invoke-direct {p0}, Lnet/youmi/android/spot/a;->i()V

    return-void

    :catch_0
    move-exception v0

    iput v3, p0, Lnet/youmi/android/spot/a;->O:I

    goto :goto_0
.end method

.method private a(F)I
    .locals 2

    const/4 v0, 0x1

    iget-object v1, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-static {v0, p1, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    return v0
.end method

.method static synthetic a(Lnet/youmi/android/spot/a;)Landroid/widget/ImageButton;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/spot/a;->u:Landroid/widget/ImageButton;

    return-object v0
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lnet/youmi/android/spot/a;->S:Lorg/json/JSONObject;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    invoke-static {v0, p1, v1}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "uri"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lnet/youmi/android/spot/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lnet/youmi/android/spot/a;->A:Z

    return p1
.end method

.method public static a(Ljava/io/File;)[B
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    const/16 v3, 0x800

    new-array v3, v3, [B

    :goto_0
    invoke-virtual {v1, v3}, Ljava/io/InputStream;->read([B)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_0

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v5, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :catch_0
    move-exception v1

    :goto_1
    return-object v0

    :cond_0
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :try_start_1
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    goto :goto_1
.end method

.method static synthetic b(Lnet/youmi/android/spot/a;)Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    return-object v0
.end method

.method private b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lnet/youmi/android/spot/a;->S:Lorg/json/JSONObject;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    invoke-static {v0, p1, v1}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "pic"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lnet/youmi/android/spot/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lnet/youmi/android/spot/a;->x:Z

    return p1
.end method

.method static synthetic c(Lnet/youmi/android/spot/a;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lnet/youmi/android/spot/a;)V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/spot/a;->h()V

    return-void
.end method

.method static synthetic e(Lnet/youmi/android/spot/a;)I
    .locals 1

    iget v0, p0, Lnet/youmi/android/spot/a;->J:I

    return v0
.end method

.method static synthetic f(Lnet/youmi/android/spot/a;)V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/spot/a;->j()V

    return-void
.end method

.method static synthetic g(Lnet/youmi/android/spot/a;)Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/spot/a;->s:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private g()Z
    .locals 12

    const-wide v10, 0x3fe999999999999aL    # 0.8

    const/4 v1, 0x1

    const/4 v0, 0x0

    const-wide v8, 0x3feb333333333333L    # 0.85

    iput-boolean v1, p0, Lnet/youmi/android/spot/a;->A:Z

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lnet/youmi/android/spot/a;->y:J

    iget-boolean v2, p0, Lnet/youmi/android/spot/a;->z:Z

    if-eqz v2, :cond_1

    const-string v1, "spot\'s resource are not ready to show"

    invoke-static {v1}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    iget-object v1, p0, Lnet/youmi/android/spot/a;->v:Lnet/youmi/android/spot/SpotDialogListener;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lnet/youmi/android/spot/a;->v:Lnet/youmi/android/spot/SpotDialogListener;

    invoke-interface {v1}, Lnet/youmi/android/spot/SpotDialogListener;->onShowFailed()V

    const/4 v1, 0x0

    sput-boolean v1, Lnet/youmi/android/spot/SpotManager;->n:Z

    :cond_0
    :goto_0
    return v0

    :cond_1
    const-string v2, "ShowSpotDialog"

    invoke-static {v2}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    iget-object v2, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    iget v2, v2, Landroid/content/res/Configuration;->orientation:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_5

    move v4, v1

    :goto_1
    iget v2, p0, Lnet/youmi/android/spot/a;->O:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_2

    iget v2, p0, Lnet/youmi/android/spot/a;->O:I

    if-nez v2, :cond_9

    :cond_2
    iget v2, p0, Lnet/youmi/android/spot/a;->g:I

    if-eqz v2, :cond_6

    iget v2, p0, Lnet/youmi/android/spot/a;->g:I

    int-to-double v2, v2

    mul-double/2addr v2, v10

    double-to-int v2, v2

    iput v2, p0, Lnet/youmi/android/spot/a;->j:I

    :goto_2
    iget v2, p0, Lnet/youmi/android/spot/a;->j:I

    mul-int/lit16 v2, v2, 0x1e0

    div-int/lit16 v2, v2, 0x320

    iput v2, p0, Lnet/youmi/android/spot/a;->i:I

    iget v2, p0, Lnet/youmi/android/spot/a;->i:I

    int-to-double v2, v2

    iget v5, p0, Lnet/youmi/android/spot/a;->f:I

    int-to-double v6, v5

    mul-double/2addr v6, v8

    cmpl-double v2, v2, v6

    if-lez v2, :cond_7

    iget v2, p0, Lnet/youmi/android/spot/a;->f:I

    int-to-double v2, v2

    mul-double/2addr v2, v8

    :goto_3
    double-to-int v2, v2

    iput v2, p0, Lnet/youmi/android/spot/a;->i:I

    if-eqz v4, :cond_3

    iget v2, p0, Lnet/youmi/android/spot/a;->f:I

    if-eqz v2, :cond_8

    iget v2, p0, Lnet/youmi/android/spot/a;->f:I

    int-to-double v2, v2

    mul-double/2addr v2, v10

    double-to-int v2, v2

    iput v2, p0, Lnet/youmi/android/spot/a;->j:I

    :goto_4
    iget v2, p0, Lnet/youmi/android/spot/a;->j:I

    mul-int/lit8 v2, v2, 0x5

    div-int/lit8 v2, v2, 0x6

    iput v2, p0, Lnet/youmi/android/spot/a;->i:I

    :cond_3
    :goto_5
    iget-object v2, p0, Lnet/youmi/android/spot/a;->r:Landroid/widget/RelativeLayout$LayoutParams;

    iget v3, p0, Lnet/youmi/android/spot/a;->j:I

    iput v3, v2, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    iget-object v2, p0, Lnet/youmi/android/spot/a;->r:Landroid/widget/RelativeLayout$LayoutParams;

    iget v3, p0, Lnet/youmi/android/spot/a;->i:I

    iput v3, v2, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    iget-object v2, p0, Lnet/youmi/android/spot/a;->a:Landroid/view/WindowManager;

    iget-object v3, p0, Lnet/youmi/android/spot/a;->b:Landroid/widget/RelativeLayout;

    iget-object v4, p0, Lnet/youmi/android/spot/a;->q:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v2, v3, v4}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/os/Handler;

    iget-object v3, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Lnet/youmi/android/spot/b;

    invoke-direct {v3, p0}, Lnet/youmi/android/spot/b;-><init>(Lnet/youmi/android/spot/a;)V

    const-wide/16 v4, 0x3e8

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    const/4 v2, 0x1

    iput-boolean v2, p0, Lnet/youmi/android/spot/a;->t:Z

    iget-object v2, p0, Lnet/youmi/android/spot/a;->v:Lnet/youmi/android/spot/SpotDialogListener;

    if-eqz v2, :cond_4

    iget-object v2, p0, Lnet/youmi/android/spot/a;->v:Lnet/youmi/android/spot/SpotDialogListener;

    invoke-interface {v2}, Lnet/youmi/android/spot/SpotDialogListener;->onShowSuccess()V

    :cond_4
    invoke-virtual {p0}, Lnet/youmi/android/spot/a;->c()V

    invoke-virtual {p0}, Lnet/youmi/android/spot/a;->f()V

    move v0, v1

    goto/16 :goto_0

    :cond_5
    move v4, v0

    goto/16 :goto_1

    :cond_6
    const/high16 v2, 0x43fa0000    # 500.0f

    invoke-direct {p0, v2}, Lnet/youmi/android/spot/a;->a(F)I

    move-result v2

    iput v2, p0, Lnet/youmi/android/spot/a;->j:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    invoke-static {v1}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto/16 :goto_0

    :cond_7
    :try_start_1
    iget v2, p0, Lnet/youmi/android/spot/a;->i:I

    int-to-double v2, v2

    goto :goto_3

    :cond_8
    const/high16 v2, 0x43960000    # 300.0f

    invoke-direct {p0, v2}, Lnet/youmi/android/spot/a;->a(F)I

    move-result v2

    iput v2, p0, Lnet/youmi/android/spot/a;->j:I

    goto :goto_4

    :cond_9
    if-eqz v4, :cond_c

    iget v2, p0, Lnet/youmi/android/spot/a;->f:I

    if-eqz v2, :cond_a

    iget v2, p0, Lnet/youmi/android/spot/a;->f:I

    int-to-double v2, v2

    mul-double/2addr v2, v10

    double-to-int v2, v2

    iput v2, p0, Lnet/youmi/android/spot/a;->j:I

    :goto_6
    iget v2, p0, Lnet/youmi/android/spot/a;->j:I

    int-to-float v2, v2

    iget v3, p0, Lnet/youmi/android/spot/a;->W:F

    mul-float/2addr v2, v3

    float-to-int v2, v2

    iput v2, p0, Lnet/youmi/android/spot/a;->i:I

    iget v2, p0, Lnet/youmi/android/spot/a;->i:I

    int-to-double v2, v2

    iget v4, p0, Lnet/youmi/android/spot/a;->g:I

    int-to-double v4, v4

    mul-double/2addr v4, v8

    cmpl-double v2, v2, v4

    if-lez v2, :cond_b

    iget v2, p0, Lnet/youmi/android/spot/a;->g:I

    int-to-double v2, v2

    mul-double/2addr v2, v8

    :goto_7
    double-to-int v2, v2

    iput v2, p0, Lnet/youmi/android/spot/a;->i:I

    goto/16 :goto_5

    :cond_a
    const/high16 v2, 0x43960000    # 300.0f

    invoke-direct {p0, v2}, Lnet/youmi/android/spot/a;->a(F)I

    move-result v2

    iput v2, p0, Lnet/youmi/android/spot/a;->j:I

    goto :goto_6

    :cond_b
    iget v2, p0, Lnet/youmi/android/spot/a;->i:I

    int-to-double v2, v2

    goto :goto_7

    :cond_c
    iget v2, p0, Lnet/youmi/android/spot/a;->f:I

    if-eqz v2, :cond_d

    iget v2, p0, Lnet/youmi/android/spot/a;->f:I

    int-to-double v2, v2

    const-wide v4, 0x3feccccccccccccdL    # 0.9

    mul-double/2addr v2, v4

    double-to-int v2, v2

    iput v2, p0, Lnet/youmi/android/spot/a;->i:I

    :goto_8
    iget v2, p0, Lnet/youmi/android/spot/a;->i:I

    mul-int/lit8 v2, v2, 0x5

    div-int/lit8 v2, v2, 0x6

    iput v2, p0, Lnet/youmi/android/spot/a;->j:I

    goto/16 :goto_5

    :cond_d
    const/high16 v2, 0x43960000    # 300.0f

    invoke-direct {p0, v2}, Lnet/youmi/android/spot/a;->a(F)I

    move-result v2

    iput v2, p0, Lnet/youmi/android/spot/a;->i:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_8
.end method

.method private h()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/spot/a;->b:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/spot/a;->b:Landroid/widget/RelativeLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lnet/youmi/android/spot/a;->a:Landroid/view/WindowManager;

    iget-object v1, p0, Lnet/youmi/android/spot/a;->b:Landroid/widget/RelativeLayout;

    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V

    iget-object v0, p0, Lnet/youmi/android/spot/a;->b:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    iget-object v0, p0, Lnet/youmi/android/spot/a;->b:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lnet/youmi/android/spot/a;->u:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    iget-object v0, p0, Lnet/youmi/android/spot/a;->b:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->removeAllViews()V

    iget-object v0, p0, Lnet/youmi/android/spot/a;->v:Lnet/youmi/android/spot/SpotDialogListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/spot/a;->v:Lnet/youmi/android/spot/SpotDialogListener;

    invoke-interface {v0}, Lnet/youmi/android/spot/SpotDialogListener;->onSpotClosed()V

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/spot/SpotManager;->getInstance(Landroid/content/Context;)Lnet/youmi/android/spot/SpotManager;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/spot/SpotManager;->cacheNextAd()V

    invoke-direct {p0}, Lnet/youmi/android/spot/a;->k()V

    const/4 v0, 0x0

    iput-object v0, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    const/4 v0, 0x0

    iput-object v0, p0, Lnet/youmi/android/spot/a;->b:Landroid/widget/RelativeLayout;

    const/4 v0, 0x0

    sput-boolean v0, Lnet/youmi/android/spot/SpotManager;->n:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic h(Lnet/youmi/android/spot/a;)Z
    .locals 1

    invoke-direct {p0}, Lnet/youmi/android/spot/a;->g()Z

    move-result v0

    return v0
.end method

.method private i()V
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lnet/youmi/android/spot/a;->S:Lorg/json/JSONObject;

    const-string v3, "spotid"

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lnet/youmi/android/spot/a;->e:I

    iget-object v2, p0, Lnet/youmi/android/spot/a;->S:Lorg/json/JSONObject;

    const-string v3, "rsd"

    const-string v4, ""

    invoke-static {v2, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lnet/youmi/android/spot/a;->D:Ljava/lang/String;

    iget-object v2, p0, Lnet/youmi/android/spot/a;->S:Lorg/json/JSONObject;

    const-string v3, "md5"

    const-string v4, ""

    invoke-static {v2, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lnet/youmi/android/spot/a;->B:Ljava/lang/String;

    iget-object v2, p0, Lnet/youmi/android/spot/a;->S:Lorg/json/JSONObject;

    const-string v3, "e"

    const-string v4, ""

    invoke-static {v2, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lnet/youmi/android/spot/a;->C:Ljava/lang/String;

    iget-object v2, p0, Lnet/youmi/android/spot/a;->S:Lorg/json/JSONObject;

    const-string v3, "name"

    const-string v4, ""

    invoke-static {v2, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lnet/youmi/android/spot/a;->G:Ljava/lang/String;

    iget-object v2, p0, Lnet/youmi/android/spot/a;->S:Lorg/json/JSONObject;

    const-string v3, "app"

    const-string v4, ""

    invoke-static {v2, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lnet/youmi/android/spot/a;->E:Ljava/lang/String;

    iget-object v2, p0, Lnet/youmi/android/spot/a;->S:Lorg/json/JSONObject;

    const-string v3, "pn"

    const-string v4, ""

    invoke-static {v2, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lnet/youmi/android/spot/a;->F:Ljava/lang/String;

    iget-object v2, p0, Lnet/youmi/android/spot/a;->S:Lorg/json/JSONObject;

    const-string v3, "tips"

    const-string v4, ""

    invoke-static {v2, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lnet/youmi/android/spot/a;->H:Ljava/lang/String;

    iget-object v2, p0, Lnet/youmi/android/spot/a;->S:Lorg/json/JSONObject;

    const-string v3, "itips"

    const-string v4, ""

    invoke-static {v2, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lnet/youmi/android/spot/a;->I:Ljava/lang/String;

    iget-object v2, p0, Lnet/youmi/android/spot/a;->S:Lorg/json/JSONObject;

    const-string v3, "disclk"

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lnet/youmi/android/spot/a;->J:I

    iget-object v2, p0, Lnet/youmi/android/spot/a;->S:Lorg/json/JSONObject;

    const-string v3, "cpt"

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lnet/youmi/android/spot/a;->K:I

    iget-object v2, p0, Lnet/youmi/android/spot/a;->S:Lorg/json/JSONObject;

    const-string v3, "io"

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lnet/youmi/android/spot/a;->L:I

    iget-object v2, p0, Lnet/youmi/android/spot/a;->S:Lorg/json/JSONObject;

    const-string v3, "url"

    const-string v4, ""

    invoke-static {v2, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lnet/youmi/android/spot/a;->M:Ljava/lang/String;

    iget-object v2, p0, Lnet/youmi/android/spot/a;->S:Lorg/json/JSONObject;

    const-string v3, "gif"

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v2

    if-ne v2, v0, :cond_1

    :goto_0
    iput-boolean v0, p0, Lnet/youmi/android/spot/a;->N:Z

    iget v0, p0, Lnet/youmi/android/spot/a;->e:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/spot/a;->E:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    move v0, v1

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method private j()V
    .locals 10

    const/4 v9, 0x0

    iget-object v0, p0, Lnet/youmi/android/spot/a;->M:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/spot/a;->M:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    iget v1, p0, Lnet/youmi/android/spot/a;->L:I

    iget-object v2, p0, Lnet/youmi/android/spot/a;->M:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lnet/youmi/android/spot/f;->a(Landroid/content/Context;ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p0}, Lnet/youmi/android/spot/a;->d()Z

    return-void

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    iget v1, p0, Lnet/youmi/android/spot/a;->e:I

    iget-object v2, p0, Lnet/youmi/android/spot/a;->G:Ljava/lang/String;

    iget-object v3, p0, Lnet/youmi/android/spot/a;->F:Ljava/lang/String;

    iget-object v4, p0, Lnet/youmi/android/spot/a;->D:Ljava/lang/String;

    iget-object v5, p0, Lnet/youmi/android/spot/a;->C:Ljava/lang/String;

    iget-object v6, p0, Lnet/youmi/android/spot/a;->E:Ljava/lang/String;

    iget-object v7, p0, Lnet/youmi/android/spot/a;->H:Ljava/lang/String;

    iget-object v8, p0, Lnet/youmi/android/spot/a;->I:Ljava/lang/String;

    invoke-static/range {v0 .. v9}, Lnet/youmi/android/spot/f;->a(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lnet/youmi/android/spot/a;->y:J

    sub-long v7, v0, v2

    iget-object v3, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    iget-object v4, p0, Lnet/youmi/android/spot/a;->D:Ljava/lang/String;

    iget-object v5, p0, Lnet/youmi/android/spot/a;->C:Ljava/lang/String;

    sget-object v6, Lnet/youmi/android/c/a/b;->b:Ljava/lang/String;

    invoke-static/range {v3 .. v9}, Lnet/youmi/android/spot/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V

    goto :goto_0
.end method

.method private k()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/spot/a;->c:Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/spot/a;->c:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/spot/a;->c:Landroid/graphics/drawable/BitmapDrawable;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/BitmapDrawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lnet/youmi/android/spot/a;->c:Landroid/graphics/drawable/BitmapDrawable;

    :cond_1
    iget-boolean v0, p0, Lnet/youmi/android/spot/a;->N:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    instance-of v0, v0, Lnet/youmi/android/c/a/k;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    check-cast v0, Lnet/youmi/android/c/a/k;

    invoke-virtual {v0}, Lnet/youmi/android/c/a/k;->a()V

    iget-object v0, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->destroyDrawingCache()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public a(I)V
    .locals 4

    const/4 v3, 0x2

    iput p1, p0, Lnet/youmi/android/spot/a;->o:I

    iget v0, p0, Lnet/youmi/android/spot/a;->o:I

    if-ltz v0, :cond_0

    iget v0, p0, Lnet/youmi/android/spot/a;->o:I

    if-le v0, v3, :cond_1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x80

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v1, "animType"

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lnet/youmi/android/spot/a;->o:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    iget v0, p0, Lnet/youmi/android/spot/a;->o:I

    if-ltz v0, :cond_2

    iget v0, p0, Lnet/youmi/android/spot/a;->o:I

    if-le v0, v3, :cond_3

    :cond_2
    iput v3, p0, Lnet/youmi/android/spot/a;->o:I

    :cond_3
    return-void

    :catch_0
    move-exception v0

    iput v3, p0, Lnet/youmi/android/spot/a;->o:I

    goto :goto_0
.end method

.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lnet/youmi/android/spot/a;->t:Z

    return v0
.end method

.method public b()V
    .locals 10

    const/16 v9, 0xe

    const/4 v1, 0x0

    const/4 v2, 0x1

    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v9, :cond_3

    iget-boolean v0, p0, Lnet/youmi/android/spot/a;->N:Z

    if-eqz v0, :cond_2

    new-instance v0, Lnet/youmi/android/c/a/k;

    iget-object v3, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    invoke-direct {v0, v3}, Lnet/youmi/android/c/a/k;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    :goto_0
    iget-object v0, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setId(I)V

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x1

    const/4 v4, -0x1

    invoke-direct {v0, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lnet/youmi/android/spot/a;->r:Landroid/widget/RelativeLayout$LayoutParams;

    iget-object v0, p0, Lnet/youmi/android/spot/a;->r:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v3, 0xd

    const/4 v4, -0x1

    invoke-virtual {v0, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    iget-object v0, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    iget-object v3, p0, Lnet/youmi/android/spot/a;->r:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    sget-object v3, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    iget-object v0, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setHapticFeedbackEnabled(Z)V

    new-instance v0, Lnet/youmi/android/spot/e;

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3}, Lnet/youmi/android/spot/e;-><init>(Lnet/youmi/android/spot/a;Lnet/youmi/android/spot/b;)V

    iput-object v0, p0, Lnet/youmi/android/spot/a;->w:Lnet/youmi/android/spot/e;

    iget-object v0, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    iget-object v3, p0, Lnet/youmi/android/spot/a;->w:Lnet/youmi/android/spot/e;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget v0, p0, Lnet/youmi/android/spot/a;->O:I

    if-ne v0, v2, :cond_4

    const-string v0, "blk"

    :goto_1
    invoke-direct {p0, v0}, Lnet/youmi/android/spot/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget v0, p0, Lnet/youmi/android/spot/a;->O:I

    if-ne v0, v2, :cond_5

    const-string v0, "rtg"

    :cond_0
    :goto_2
    invoke-direct {p0, v0}, Lnet/youmi/android/spot/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget v0, p0, Lnet/youmi/android/spot/a;->O:I

    if-ne v0, v2, :cond_6

    const-string v0, "blk"

    :goto_3
    invoke-direct {p0, v0}, Lnet/youmi/android/spot/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    invoke-static {v3, v0}, Lnet/youmi/android/c/a/g;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/spot/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    sget-object v3, Lnet/youmi/android/spot/j;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/spot/j;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/youmi/android/spot/a;->z:Z

    :goto_4
    return-void

    :cond_2
    new-instance v0, Lnet/youmi/android/c/a/p;

    iget-object v3, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    invoke-direct {v0, v3}, Lnet/youmi/android/c/a/p;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    iput-boolean v2, p0, Lnet/youmi/android/spot/a;->z:Z

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_4

    :cond_3
    :try_start_1
    new-instance v0, Landroid/widget/ImageView;

    iget-object v3, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    invoke-direct {v0, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    goto/16 :goto_0

    :cond_4
    const-string v0, "rtg"

    goto :goto_1

    :cond_5
    const-string v0, "blk"

    goto :goto_2

    :cond_6
    const-string v0, "rtg"

    goto :goto_3

    :cond_7
    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/youmi/android/spot/a;->z:Z

    goto :goto_4

    :cond_8
    iget-object v0, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    new-instance v4, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v5, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-direct {v4, v5, v3}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Ljava/lang/String;)V

    const/16 v5, 0xa

    invoke-static {v0, v4, v5}, Lnet/youmi/android/c/a/d;->a(Landroid/content/Context;Landroid/graphics/drawable/BitmapDrawable;I)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/spot/a;->c:Landroid/graphics/drawable/BitmapDrawable;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v9, :cond_13

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    sget-object v0, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    sget-object v5, Lnet/youmi/android/spot/a;->U:[I

    invoke-direct {v4, v0, v5}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    sget-object v0, Lnet/youmi/android/spot/a;->T:[F

    invoke-virtual {v4, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    new-instance v5, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v0, Landroid/graphics/drawable/shapes/RoundRectShape;

    sget-object v6, Lnet/youmi/android/spot/a;->T:[F

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct {v0, v6, v7, v8}, Landroid/graphics/drawable/shapes/RoundRectShape;-><init>([FLandroid/graphics/RectF;[F)V

    invoke-direct {v5, v0}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    invoke-virtual {v5}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    const-string v6, "#33000000"

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 v0, 0x40400000    # 3.0f

    invoke-direct {p0, v0}, Lnet/youmi/android/spot/a;->a(F)I

    move-result v0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual {v5, v6, v7, v0, v0}, Landroid/graphics/drawable/ShapeDrawable;->setPadding(IIII)V

    const/4 v6, 0x2

    new-array v6, v6, [Landroid/graphics/drawable/Drawable;

    const/4 v7, 0x1

    aput-object v4, v6, v7

    const/4 v7, 0x0

    aput-object v5, v6, v7

    new-instance v5, Landroid/graphics/drawable/LayerDrawable;

    invoke-direct {v5, v6}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0xf

    if-le v6, v7, :cond_b

    iget-object v6, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    invoke-virtual {v6, v5}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :goto_5
    const/high16 v4, 0x40400000    # 3.0f

    :try_start_3
    invoke-direct {p0, v4}, Lnet/youmi/android/spot/a;->a(F)I

    move-result v4

    iget-object v5, p0, Lnet/youmi/android/spot/a;->c:Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v5, :cond_d

    iget-object v5, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    add-int v6, v4, v0

    add-int/2addr v0, v4

    invoke-virtual {v5, v4, v4, v6, v0}, Landroid/widget/ImageView;->setPadding(IIII)V

    iget-boolean v0, p0, Lnet/youmi/android/spot/a;->N:Z

    if-eqz v0, :cond_c

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v9, :cond_c

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-static {v0}, Lnet/youmi/android/spot/a;->a(Ljava/io/File;)[B

    move-result-object v3

    iget-object v0, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    check-cast v0, Lnet/youmi/android/c/a/k;

    invoke-virtual {v0, v3}, Lnet/youmi/android/c/a/k;->setGifImage([B)V

    :cond_9
    :goto_6
    iget-object v0, p0, Lnet/youmi/android/spot/a;->c:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getIntrinsicWidth()I

    move-result v0

    iget-object v3, p0, Lnet/youmi/android/spot/a;->c:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/BitmapDrawable;->getIntrinsicHeight()I

    move-result v3

    if-lt v0, v3, :cond_a

    move v1, v2

    :cond_a
    iput v1, p0, Lnet/youmi/android/spot/a;->O:I

    iget-object v0, p0, Lnet/youmi/android/spot/a;->c:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getIntrinsicWidth()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lnet/youmi/android/spot/a;->c:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/BitmapDrawable;->getIntrinsicHeight()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lnet/youmi/android/spot/a;->W:F

    :goto_7
    iget-object v0, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/b/k/f;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/k/f;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    move-result-object v0

    :try_start_4
    invoke-virtual {v0}, Lnet/youmi/android/a/b/k/f;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lnet/youmi/android/spot/a;->h:I

    invoke-virtual {v0}, Lnet/youmi/android/a/b/k/f;->g()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lnet/youmi/android/spot/a;->f:I

    invoke-virtual {v0}, Lnet/youmi/android/a/b/k/f;->h()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lnet/youmi/android/spot/a;->g:I
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :goto_8
    :try_start_5
    new-instance v0, Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/spot/a;->b:Landroid/widget/RelativeLayout;

    iget-object v0, p0, Lnet/youmi/android/spot/a;->b:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    iget-object v0, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lnet/youmi/android/spot/a;->a:Landroid/view/WindowManager;

    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/spot/a;->q:Landroid/view/WindowManager$LayoutParams;

    new-instance v0, Landroid/widget/ImageButton;

    iget-object v1, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/spot/a;->u:Landroid/widget/ImageButton;

    iget-object v0, p0, Lnet/youmi/android/spot/a;->u:Landroid/widget/ImageButton;

    sget-object v1, Lnet/youmi/android/spot/a;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object v0, p0, Lnet/youmi/android/spot/a;->u:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundColor(I)V

    iget-object v0, p0, Lnet/youmi/android/spot/a;->u:Landroid/widget/ImageButton;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    iget v0, p0, Lnet/youmi/android/spot/a;->h:I

    const/16 v1, 0x140

    if-le v0, v1, :cond_11

    const/high16 v0, 0x42480000    # 50.0f

    invoke-direct {p0, v0}, Lnet/youmi/android/spot/a;->a(F)I

    move-result v1

    const/high16 v0, 0x41a00000    # 20.0f

    invoke-direct {p0, v0}, Lnet/youmi/android/spot/a;->a(F)I

    move-result v0

    :goto_9
    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v3, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/4 v1, 0x6

    const/4 v4, 0x1

    invoke-virtual {v3, v1, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/4 v1, 0x7

    const/4 v4, 0x1

    invoke-virtual {v3, v1, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    neg-int v1, v0

    iput v1, v3, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    neg-int v0, v0

    iput v0, v3, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    iget-object v0, p0, Lnet/youmi/android/spot/a;->u:Landroid/widget/ImageButton;

    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lnet/youmi/android/spot/a;->u:Landroid/widget/ImageButton;

    iget-object v1, p0, Lnet/youmi/android/spot/a;->w:Lnet/youmi/android/spot/e;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lnet/youmi/android/spot/a;->q:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, -0x1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    iget-object v0, p0, Lnet/youmi/android/spot/a;->q:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, -0x1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    iget-object v0, p0, Lnet/youmi/android/spot/a;->q:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, -0x2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    iget-object v0, p0, Lnet/youmi/android/spot/a;->q:Landroid/view/WindowManager$LayoutParams;

    const/16 v1, 0x11

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :try_start_6
    iget-object v0, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/b/k/k;->i(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_12

    iget-object v0, p0, Lnet/youmi/android/spot/a;->q:Landroid/view/WindowManager$LayoutParams;

    const/16 v1, 0x7d3

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :goto_a
    :try_start_7
    iget-object v0, p0, Lnet/youmi/android/spot/a;->q:Landroid/view/WindowManager$LayoutParams;

    const v1, 0x100002a

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    iget-object v0, p0, Lnet/youmi/android/spot/a;->q:Landroid/view/WindowManager$LayoutParams;

    const v1, 0x3f333333    # 0.7f

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    iget-object v0, p0, Lnet/youmi/android/spot/a;->b:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    goto/16 :goto_4

    :cond_b
    :try_start_8
    iget-object v5, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_8
    .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    goto/16 :goto_5

    :catch_1
    move-exception v5

    :try_start_9
    iget-object v5, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_5

    :cond_c
    iget-object v0, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    iget-object v3, p0, Lnet/youmi/android/spot/a;->c:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_6

    :cond_d
    iget-object v0, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    invoke-virtual {v0, v4, v4, v4, v4}, Landroid/widget/ImageView;->setPadding(IIII)V

    invoke-static {v3}, Landroid/graphics/drawable/BitmapDrawable;->createFromPath(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_e

    iget-object v0, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/spot/SpotManager;->getInstance(Landroid/content/Context;)Lnet/youmi/android/spot/SpotManager;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/spot/SpotManager;->cacheNextAd()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/youmi/android/spot/a;->z:Z

    goto/16 :goto_4

    :cond_e
    iget-object v3, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    if-lt v3, v0, :cond_f

    move v0, v2

    :goto_b
    iput v0, p0, Lnet/youmi/android/spot/a;->O:I

    goto/16 :goto_7

    :cond_f
    move v0, v1

    goto :goto_b

    :cond_10
    iget-object v0, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/spot/SpotManager;->getInstance(Landroid/content/Context;)Lnet/youmi/android/spot/SpotManager;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/spot/SpotManager;->cacheNextAd()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/youmi/android/spot/a;->z:Z

    goto/16 :goto_4

    :catch_2
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/b/e/b;->a(Ljava/lang/Throwable;)V

    goto/16 :goto_8

    :cond_11
    const/high16 v0, 0x42480000    # 50.0f

    invoke-direct {p0, v0}, Lnet/youmi/android/spot/a;->a(F)I

    move-result v1

    const/high16 v0, 0x41700000    # 15.0f

    invoke-direct {p0, v0}, Lnet/youmi/android/spot/a;->a(F)I
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    move-result v0

    goto/16 :goto_9

    :cond_12
    :try_start_a
    iget-object v0, p0, Lnet/youmi/android/spot/a;->q:Landroid/view/WindowManager$LayoutParams;

    const/16 v1, 0x3eb

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I
    :try_end_a
    .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_3
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    goto/16 :goto_a

    :catch_3
    move-exception v0

    goto/16 :goto_a

    :cond_13
    move v0, v1

    goto/16 :goto_5
.end method

.method public c()V
    .locals 5

    :try_start_0
    new-instance v0, Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/spot/a;->s:Landroid/widget/RelativeLayout;

    const/high16 v0, 0x42200000    # 40.0f

    invoke-direct {p0, v0}, Lnet/youmi/android/spot/a;->a(F)I

    move-result v0

    const/high16 v1, 0x42e60000    # 115.0f

    invoke-direct {p0, v1}, Lnet/youmi/android/spot/a;->a(F)I

    move-result v1

    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x1

    const/4 v4, -0x1

    invoke-direct {v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v3, 0xd

    const/4 v4, -0x1

    invoke-virtual {v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    iget-object v3, p0, Lnet/youmi/android/spot/a;->s:Landroid/widget/RelativeLayout;

    const-string v4, "#AA000000"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    iget-object v3, p0, Lnet/youmi/android/spot/a;->s:Landroid/widget/RelativeLayout;

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v3, p0, Lnet/youmi/android/spot/a;->s:Landroid/widget/RelativeLayout;

    invoke-virtual {v3, v2}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Lnet/youmi/android/c/a/e;

    iget-object v3, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    invoke-direct {v2, v3}, Lnet/youmi/android/c/a/e;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Lnet/youmi/android/c/a/e;->setId(I)V

    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v3, v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v0, 0xd

    const/4 v1, -0x1

    invoke-virtual {v3, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    iget-object v0, p0, Lnet/youmi/android/spot/a;->w:Lnet/youmi/android/spot/e;

    invoke-virtual {v2, v0}, Lnet/youmi/android/c/a/e;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lnet/youmi/android/spot/a;->s:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lnet/youmi/android/spot/a;->b:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lnet/youmi/android/spot/a;->s:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0
.end method

.method public declared-synchronized d()Z
    .locals 6

    const/4 v1, 0x0

    const/4 v0, 0x1

    monitor-enter p0

    :try_start_0
    iget-object v2, p0, Lnet/youmi/android/spot/a;->u:Landroid/widget/ImageButton;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lnet/youmi/android/spot/a;->u:Landroid/widget/ImageButton;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/ImageButton;->setVisibility(I)V

    :cond_0
    iget-object v2, p0, Lnet/youmi/android/spot/a;->s:Landroid/widget/RelativeLayout;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lnet/youmi/android/spot/a;->s:Landroid/widget/RelativeLayout;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :cond_1
    iget-boolean v2, p0, Lnet/youmi/android/spot/a;->x:Z

    if-nez v2, :cond_3

    const/4 v2, 0x0

    iput-boolean v2, p0, Lnet/youmi/android/spot/a;->t:Z

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xe

    if-lt v2, v3, :cond_6

    const/4 v2, 0x0

    iget v3, p0, Lnet/youmi/android/spot/a;->o:I

    const/4 v4, 0x2

    if-ne v3, v4, :cond_4

    iget-object v2, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    iget-object v3, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    const-wide/16 v4, 0x1f4

    invoke-static {v2, v3, v4, v5}, Lnet/youmi/android/c/a/s;->b(Landroid/content/Context;Landroid/view/View;J)Landroid/animation/AnimatorSet;

    move-result-object v2

    :cond_2
    :goto_0
    if-nez v2, :cond_5

    invoke-direct {p0}, Lnet/youmi/android/spot/a;->h()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    :goto_1
    monitor-exit p0

    return v0

    :cond_4
    :try_start_1
    iget v3, p0, Lnet/youmi/android/spot/a;->o:I

    if-ne v3, v0, :cond_2

    iget-object v2, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    iget-object v3, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    const-wide/16 v4, 0x1f4

    invoke-static {v2, v3, v4, v5}, Lnet/youmi/android/c/a/s;->d(Landroid/content/Context;Landroid/view/View;J)Landroid/animation/AnimatorSet;

    move-result-object v2

    goto :goto_0

    :cond_5
    const/4 v3, 0x1

    iput-boolean v3, p0, Lnet/youmi/android/spot/a;->x:Z

    new-instance v3, Lnet/youmi/android/spot/c;

    invoke-direct {v3, p0}, Lnet/youmi/android/spot/c;-><init>(Lnet/youmi/android/spot/a;)V

    invoke-virtual {v2, v3}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    goto :goto_1

    :catch_0
    move-exception v0

    move v0, v1

    goto :goto_1

    :cond_6
    invoke-direct {p0}, Lnet/youmi/android/spot/a;->h()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public e()V
    .locals 7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lnet/youmi/android/spot/a;->y:J

    sub-long v4, v0, v2

    iget-object v0, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    iget-object v1, p0, Lnet/youmi/android/spot/a;->D:Ljava/lang/String;

    iget-object v2, p0, Lnet/youmi/android/spot/a;->C:Ljava/lang/String;

    sget-object v3, Lnet/youmi/android/c/a/b;->a:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lnet/youmi/android/spot/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V

    return-void
.end method

.method public f()V
    .locals 4

    const-wide/16 v2, 0x1f4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    iget v0, p0, Lnet/youmi/android/spot/a;->o:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    iget-object v1, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    invoke-static {v0, v1, v2, v3}, Lnet/youmi/android/c/a/s;->a(Landroid/content/Context;Landroid/view/View;J)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget v0, p0, Lnet/youmi/android/spot/a;->o:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lnet/youmi/android/spot/a;->p:Landroid/content/Context;

    iget-object v1, p0, Lnet/youmi/android/spot/a;->R:Landroid/widget/ImageView;

    invoke-static {v0, v1, v2, v3}, Lnet/youmi/android/c/a/s;->c(Landroid/content/Context;Landroid/view/View;J)V

    goto :goto_0
.end method

.method public run()V
    .locals 2

    invoke-virtual {p0}, Lnet/youmi/android/spot/a;->b()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lnet/youmi/android/spot/d;

    invoke-direct {v1, p0}, Lnet/youmi/android/spot/d;-><init>(Lnet/youmi/android/spot/a;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
