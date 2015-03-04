.class public Lnet/youmi/android/spot/SplashView;
.super Ljava/lang/Object;


# static fields
.field public static closeBtnBitmap:Landroid/graphics/Bitmap;


# instance fields
.field private A:J

.field private final B:I

.field private final C:Ljava/lang/String;

.field private D:Landroid/graphics/drawable/Drawable;

.field public final SPLASH_SHOW_TIME:J

.field protected a:I

.field b:Ljava/lang/Runnable;

.field private final c:I

.field private d:Landroid/content/Context;

.field private e:Landroid/widget/ImageView;

.field private f:Landroid/widget/RelativeLayout;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field public handler:Landroid/os/Handler;

.field private i:I

.field private j:I

.field private k:I

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:Ljava/lang/String;

.field private t:Lnet/youmi/android/spot/SpotDialogListener;

.field private u:Lnet/youmi/android/spot/i;

.field private v:Ljava/lang/Class;

.field private w:Landroid/widget/ImageButton;

.field private x:Landroid/widget/RelativeLayout;

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lnet/youmi/android/c/a/c;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/spot/SplashView;->closeBtnBitmap:Landroid/graphics/Bitmap;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/Class;)V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v3, p0, Lnet/youmi/android/spot/SplashView;->c:I

    const-wide/16 v0, 0x1388

    iput-wide v0, p0, Lnet/youmi/android/spot/SplashView;->SPLASH_SHOW_TIME:J

    iput-boolean v2, p0, Lnet/youmi/android/spot/SplashView;->y:Z

    iput-boolean v3, p0, Lnet/youmi/android/spot/SplashView;->z:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lnet/youmi/android/spot/SplashView;->A:J

    const/4 v0, 0x4

    iput v0, p0, Lnet/youmi/android/spot/SplashView;->B:I

    const-string v0, "#AA000000"

    iput-object v0, p0, Lnet/youmi/android/spot/SplashView;->C:Ljava/lang/String;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/spot/SplashView;->handler:Landroid/os/Handler;

    new-instance v0, Lnet/youmi/android/spot/h;

    invoke-direct {v0, p0}, Lnet/youmi/android/spot/h;-><init>(Lnet/youmi/android/spot/SplashView;)V

    iput-object v0, p0, Lnet/youmi/android/spot/SplashView;->b:Ljava/lang/Runnable;

    :try_start_0
    iput-object p1, p0, Lnet/youmi/android/spot/SplashView;->d:Landroid/content/Context;

    iput-object p2, p0, Lnet/youmi/android/spot/SplashView;->v:Ljava/lang/Class;

    new-instance v0, Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lnet/youmi/android/spot/SplashView;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/spot/SplashView;->x:Landroid/widget/RelativeLayout;

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->x:Landroid/widget/RelativeLayout;

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/ImageView;

    iget-object v1, p0, Lnet/youmi/android/spot/SplashView;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/spot/SplashView;->e:Landroid/widget/ImageView;

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget-object v1, p0, Lnet/youmi/android/spot/SplashView;->e:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->e:Landroid/widget/ImageView;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    new-instance v0, Lnet/youmi/android/spot/i;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lnet/youmi/android/spot/i;-><init>(Lnet/youmi/android/spot/SplashView;Lnet/youmi/android/spot/h;)V

    iput-object v0, p0, Lnet/youmi/android/spot/SplashView;->u:Lnet/youmi/android/spot/i;

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->e:Landroid/widget/ImageView;

    iget-object v1, p0, Lnet/youmi/android/spot/SplashView;->u:Lnet/youmi/android/spot/i;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v0, Landroid/widget/ImageButton;

    iget-object v1, p0, Lnet/youmi/android/spot/SplashView;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/spot/SplashView;->w:Landroid/widget/ImageButton;

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->w:Landroid/widget/ImageButton;

    sget-object v1, Lnet/youmi/android/spot/SplashView;->closeBtnBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->w:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundColor(I)V

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->w:Landroid/widget/ImageButton;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    const/high16 v0, 0x42480000    # 50.0f

    invoke-direct {p0, v0}, Lnet/youmi/android/spot/SplashView;->a(F)I

    move-result v0

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v0, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v0, 0xa

    const/4 v2, -0x1

    invoke-virtual {v1, v0, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/16 v0, 0xb

    const/4 v2, -0x1

    invoke-virtual {v1, v0, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->w:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->w:Landroid/widget/ImageButton;

    iget-object v1, p0, Lnet/youmi/android/spot/SplashView;->u:Lnet/youmi/android/spot/i;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->x:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lnet/youmi/android/spot/SplashView;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->x:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lnet/youmi/android/spot/SplashView;->w:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "splash init fail"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private a(F)I
    .locals 2

    const/4 v0, 0x1

    iget-object v1, p0, Lnet/youmi/android/spot/SplashView;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-static {v0, p1, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    return v0
.end method

.method static synthetic a(Lnet/youmi/android/spot/SplashView;)Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->e:Landroid/widget/ImageView;

    return-object v0
.end method

.method private a()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->m:Ljava/lang/String;

    invoke-static {v0}, Lnet/youmi/android/a/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "spotid"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lnet/youmi/android/spot/SplashView;->a:I

    const-string v1, "rsd"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lnet/youmi/android/spot/SplashView;->p:Ljava/lang/String;

    const-string v1, "md5"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lnet/youmi/android/spot/SplashView;->n:Ljava/lang/String;

    const-string v1, "e"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lnet/youmi/android/spot/SplashView;->o:Ljava/lang/String;

    const-string v1, "name"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lnet/youmi/android/spot/SplashView;->s:Ljava/lang/String;

    const-string v1, "app"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lnet/youmi/android/spot/SplashView;->q:Ljava/lang/String;

    const-string v1, "pn"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lnet/youmi/android/spot/SplashView;->r:Ljava/lang/String;

    const-string v1, "tips"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lnet/youmi/android/spot/SplashView;->g:Ljava/lang/String;

    const-string v1, "itips"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lnet/youmi/android/spot/SplashView;->h:Ljava/lang/String;

    const-string v1, "disclk"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lnet/youmi/android/spot/SplashView;->i:I

    const-string v1, "cpt"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lnet/youmi/android/spot/SplashView;->j:I

    const-string v1, "io"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lnet/youmi/android/spot/SplashView;->k:I

    const-string v1, "url"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/spot/SplashView;->l:Ljava/lang/String;

    iget v0, p0, Lnet/youmi/android/spot/SplashView;->a:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->q:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private a(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "splash image data is not ready to show, the ad do not show  tag:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->t:Lnet/youmi/android/spot/SpotDialogListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->t:Lnet/youmi/android/spot/SpotDialogListener;

    invoke-interface {v0}, Lnet/youmi/android/spot/SpotDialogListener;->onShowFailed()V

    :cond_0
    invoke-virtual {p0}, Lnet/youmi/android/spot/SplashView;->showFail()V

    return-void
.end method

.method static synthetic a(Lnet/youmi/android/spot/SplashView;Z)Z
    .locals 0

    iput-boolean p1, p0, Lnet/youmi/android/spot/SplashView;->y:Z

    return p1
.end method

.method static synthetic b(Lnet/youmi/android/spot/SplashView;)I
    .locals 1

    iget v0, p0, Lnet/youmi/android/spot/SplashView;->i:I

    return v0
.end method

.method private b()V
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->D:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->D:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_0
    return-void
.end method

.method static synthetic c(Lnet/youmi/android/spot/SplashView;)Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->f:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic d(Lnet/youmi/android/spot/SplashView;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->d:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lnet/youmi/android/spot/SplashView;)Landroid/widget/ImageButton;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->w:Landroid/widget/ImageButton;

    return-object v0
.end method

.method static synthetic f(Lnet/youmi/android/spot/SplashView;)Z
    .locals 1

    iget-boolean v0, p0, Lnet/youmi/android/spot/SplashView;->y:Z

    return v0
.end method

.method static synthetic g(Lnet/youmi/android/spot/SplashView;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->p:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic h(Lnet/youmi/android/spot/SplashView;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->o:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic i(Lnet/youmi/android/spot/SplashView;)Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->v:Ljava/lang/Class;

    return-object v0
.end method

.method static synthetic j(Lnet/youmi/android/spot/SplashView;)V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/spot/SplashView;->b()V

    return-void
.end method

.method static synthetic k(Lnet/youmi/android/spot/SplashView;)Lnet/youmi/android/spot/SpotDialogListener;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->t:Lnet/youmi/android/spot/SpotDialogListener;

    return-object v0
.end method


# virtual methods
.method public getSplashImage()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->e:Landroid/widget/ImageView;

    return-object v0
.end method

.method public getSplashView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->x:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public getSpotListener()Lnet/youmi/android/spot/SpotDialogListener;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->t:Lnet/youmi/android/spot/SpotDialogListener;

    return-object v0
.end method

.method public handleClick()V
    .locals 10

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->l:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->l:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->v:Ljava/lang/Class;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/youmi/android/spot/SplashView;->y:Z

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lnet/youmi/android/spot/SplashView;->d:Landroid/content/Context;

    iget-object v2, p0, Lnet/youmi/android/spot/SplashView;->v:Ljava/lang/Class;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v1, p0, Lnet/youmi/android/spot/SplashView;->d:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->d:Landroid/content/Context;

    iget v1, p0, Lnet/youmi/android/spot/SplashView;->k:I

    iget-object v2, p0, Lnet/youmi/android/spot/SplashView;->l:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lnet/youmi/android/spot/f;->a(Landroid/content/Context;ILjava/lang/String;)V

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->v:Ljava/lang/Class;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lnet/youmi/android/spot/SplashView;->b()V

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->d:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->d:Landroid/content/Context;

    iget v1, p0, Lnet/youmi/android/spot/SplashView;->a:I

    iget-object v2, p0, Lnet/youmi/android/spot/SplashView;->s:Ljava/lang/String;

    iget-object v3, p0, Lnet/youmi/android/spot/SplashView;->r:Ljava/lang/String;

    iget-object v4, p0, Lnet/youmi/android/spot/SplashView;->p:Ljava/lang/String;

    iget-object v5, p0, Lnet/youmi/android/spot/SplashView;->o:Ljava/lang/String;

    iget-object v6, p0, Lnet/youmi/android/spot/SplashView;->q:Ljava/lang/String;

    iget-object v7, p0, Lnet/youmi/android/spot/SplashView;->g:Ljava/lang/String;

    iget-object v8, p0, Lnet/youmi/android/spot/SplashView;->h:Ljava/lang/String;

    const/4 v9, 0x1

    invoke-static/range {v0 .. v9}, Lnet/youmi/android/spot/f;->a(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lnet/youmi/android/spot/SplashView;->A:J

    sub-long v4, v0, v2

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->d:Landroid/content/Context;

    iget-object v1, p0, Lnet/youmi/android/spot/SplashView;->p:Ljava/lang/String;

    iget-object v2, p0, Lnet/youmi/android/spot/SplashView;->o:Ljava/lang/String;

    sget-object v3, Lnet/youmi/android/c/a/b;->b:Ljava/lang/String;

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Lnet/youmi/android/spot/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "handle click faile"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public init(Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lnet/youmi/android/spot/SplashView;->A:J

    iput-object p1, p0, Lnet/youmi/android/spot/SplashView;->m:Ljava/lang/String;

    invoke-direct {p0}, Lnet/youmi/android/spot/SplashView;->a()V

    invoke-virtual {p0}, Lnet/youmi/android/spot/SplashView;->initDisclkLayout()V

    return-void
.end method

.method public initDisclkLayout()V
    .locals 5

    :try_start_0
    new-instance v0, Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lnet/youmi/android/spot/SplashView;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/spot/SplashView;->f:Landroid/widget/RelativeLayout;

    const/high16 v0, 0x42200000    # 40.0f

    invoke-direct {p0, v0}, Lnet/youmi/android/spot/SplashView;->a(F)I

    move-result v0

    const/high16 v1, 0x42e60000    # 115.0f

    invoke-direct {p0, v1}, Lnet/youmi/android/spot/SplashView;->a(F)I

    move-result v1

    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x1

    const/4 v4, -0x1

    invoke-direct {v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v3, 0xd

    const/4 v4, -0x1

    invoke-virtual {v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    iget-object v3, p0, Lnet/youmi/android/spot/SplashView;->f:Landroid/widget/RelativeLayout;

    const-string v4, "#AA000000"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    iget-object v3, p0, Lnet/youmi/android/spot/SplashView;->f:Landroid/widget/RelativeLayout;

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v3, p0, Lnet/youmi/android/spot/SplashView;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v3, v2}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Lnet/youmi/android/c/a/e;

    iget-object v3, p0, Lnet/youmi/android/spot/SplashView;->d:Landroid/content/Context;

    invoke-direct {v2, v3}, Lnet/youmi/android/c/a/e;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Lnet/youmi/android/c/a/e;->setId(I)V

    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v3, v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v0, 0xd

    const/4 v1, -0x1

    invoke-virtual {v3, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->u:Lnet/youmi/android/spot/i;

    invoke-virtual {v2, v0}, Lnet/youmi/android/c/a/e;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->x:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lnet/youmi/android/spot/SplashView;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public isOpenAnimation()Z
    .locals 1

    iget-boolean v0, p0, Lnet/youmi/android/spot/SplashView;->z:Z

    return v0
.end method

.method public sendShowLog()V
    .locals 4

    iget-boolean v0, p0, Lnet/youmi/android/spot/SplashView;->y:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lnet/youmi/android/spot/SplashView;->b:Ljava/lang/Runnable;

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public setOpenAnimation(Z)V
    .locals 0

    iput-boolean p1, p0, Lnet/youmi/android/spot/SplashView;->z:Z

    return-void
.end method

.method public setSpotListener(Lnet/youmi/android/spot/SpotDialogListener;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/spot/SplashView;->t:Lnet/youmi/android/spot/SpotDialogListener;

    return-void
.end method

.method public showAnimation()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/spot/SplashView;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x80

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v1, "splashAnim"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lnet/youmi/android/spot/SplashView;->z:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-boolean v0, p0, Lnet/youmi/android/spot/SplashView;->z:Z

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->d:Landroid/content/Context;

    const/16 v1, 0x3e8

    invoke-static {v0, v1}, Lnet/youmi/android/a/b/a/a;->a(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/spot/SplashView;->w:Landroid/widget/ImageButton;

    invoke-virtual {v1, v0}, Landroid/widget/ImageButton;->startAnimation(Landroid/view/animation/Animation;)V

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->d:Landroid/content/Context;

    iget-object v1, p0, Lnet/youmi/android/spot/SplashView;->e:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lnet/youmi/android/c/a/s;->a(Landroid/content/Context;Landroid/view/View;)V

    :cond_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public showFail()V
    .locals 4

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lnet/youmi/android/spot/SplashView;->b:Ljava/lang/Runnable;

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public showSplash(ZLjava/lang/String;I)Z
    .locals 6

    const/4 v2, 0x1

    const/4 v1, 0x0

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->d:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/b/i/k;->b(Landroid/content/Context;)I

    move-result v0

    const/4 v3, -0x1

    if-eq v0, v3, :cond_8

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->m:Ljava/lang/String;

    invoke-static {v0}, Lnet/youmi/android/a/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_7

    const-string v3, "rtg"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v3, "uri"

    const-string v4, ""

    invoke-static {v0, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    if-eqz p1, :cond_2

    invoke-static {p2}, Lnet/youmi/android/a/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "ad"

    const/4 v5, 0x0

    invoke-static {v3, v4, v5}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;)Lorg/json/JSONArray;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    invoke-static {v3, p3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONArray;ILorg/json/JSONObject;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v3

    if-eqz v3, :cond_1

    :try_start_1
    const-string v4, "rtg"

    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    invoke-static {v3, v4, v5}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "uri"

    const-string v5, ""

    invoke-static {v3, v4, v5}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    invoke-direct {p0, v3}, Lnet/youmi/android/spot/SplashView;->a(I)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    move v0, v1

    :goto_0
    return v0

    :catch_0
    move-exception v3

    :try_start_2
    const-string v3, ""

    iput-object v3, p0, Lnet/youmi/android/spot/SplashView;->m:Ljava/lang/String;

    :cond_0
    sget-object v3, Lnet/youmi/android/spot/j;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/spot/j;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v0, "splash image resource load fail"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lnet/youmi/android/spot/SplashView;->a(I)V

    move v0, v1

    goto :goto_0

    :cond_1
    const-string v0, ""

    iput-object v0, p0, Lnet/youmi/android/spot/SplashView;->m:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lnet/youmi/android/spot/SplashView;->a(I)V

    move v0, v1

    goto :goto_0

    :cond_2
    const-string v0, ""

    iput-object v0, p0, Lnet/youmi/android/spot/SplashView;->m:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lnet/youmi/android/spot/SplashView;->a(I)V

    move v0, v1

    goto :goto_0

    :cond_3
    invoke-static {v0}, Landroid/graphics/drawable/BitmapDrawable;->createFromPath(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/spot/SplashView;->D:Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->D:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_4

    const-string v0, "splash image drawable is null"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;)V

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lnet/youmi/android/spot/SplashView;->a(I)V

    move v0, v1

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lnet/youmi/android/spot/SplashView;->getSplashImage()Landroid/widget/ImageView;

    move-result-object v0

    iget-object v3, p0, Lnet/youmi/android/spot/SplashView;->D:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->t:Lnet/youmi/android/spot/SpotDialogListener;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lnet/youmi/android/spot/SplashView;->t:Lnet/youmi/android/spot/SpotDialogListener;

    invoke-interface {v0}, Lnet/youmi/android/spot/SpotDialogListener;->onShowSuccess()V

    :cond_5
    const-string v0, ""

    iput-object v0, p0, Lnet/youmi/android/spot/SplashView;->m:Ljava/lang/String;

    invoke-virtual {p0}, Lnet/youmi/android/spot/SplashView;->showAnimation()V

    invoke-virtual {p0}, Lnet/youmi/android/spot/SplashView;->sendShowLog()V

    move v0, v2

    goto :goto_0

    :cond_6
    const-string v0, "ad resource\'s uri is error"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    :cond_7
    const-string v0, "splash data loading fail, the ad do not show"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    const/4 v0, 0x7

    invoke-direct {p0, v0}, Lnet/youmi/android/spot/SplashView;->a(I)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    :goto_1
    move v0, v1

    goto :goto_0

    :catch_1
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/b/e/b;->a(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_8
    const-string v0, "Network is unavailable"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    const/16 v0, 0x8

    invoke-direct {p0, v0}, Lnet/youmi/android/spot/SplashView;->a(I)V

    goto :goto_1
.end method
