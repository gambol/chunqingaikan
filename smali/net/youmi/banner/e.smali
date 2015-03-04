.class public Lnet/youmi/android/banner/e;
.super Ljava/lang/Object;

# interfaces
.implements Lnet/youmi/android/a/a/e/a/b/h;
.implements Lnet/youmi/android/banner/b;
.implements Lnet/youmi/android/banner/d;


# instance fields
.field public a:Landroid/content/Context;

.field protected b:Landroid/os/Handler;

.field protected c:Lnet/youmi/android/banner/AdView;

.field d:I

.field public e:I

.field f:Lnet/youmi/android/banner/g;

.field g:Lnet/youmi/android/banner/a;

.field h:Lnet/youmi/android/banner/c;

.field private i:I

.field private j:I

.field private k:Ljava/util/Timer;

.field private l:Lnet/youmi/android/banner/f;


# direct methods
.method protected constructor <init>(Landroid/content/Context;Lnet/youmi/android/banner/AdView;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x7530

    iput v0, p0, Lnet/youmi/android/banner/e;->i:I

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/banner/e;->b:Landroid/os/Handler;

    iput v1, p0, Lnet/youmi/android/banner/e;->d:I

    iput v1, p0, Lnet/youmi/android/banner/e;->j:I

    iput v1, p0, Lnet/youmi/android/banner/e;->e:I

    new-instance v0, Lnet/youmi/android/banner/g;

    invoke-direct {v0, p0}, Lnet/youmi/android/banner/g;-><init>(Lnet/youmi/android/banner/e;)V

    iput-object v0, p0, Lnet/youmi/android/banner/e;->f:Lnet/youmi/android/banner/g;

    iput-object p1, p0, Lnet/youmi/android/banner/e;->a:Landroid/content/Context;

    iput-object p2, p0, Lnet/youmi/android/banner/e;->c:Lnet/youmi/android/banner/AdView;

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/banner/e;->k:Ljava/util/Timer;

    return-void
.end method

.method static synthetic a(Lnet/youmi/android/banner/e;)I
    .locals 1

    iget v0, p0, Lnet/youmi/android/banner/e;->j:I

    return v0
.end method

.method static synthetic a(Lnet/youmi/android/banner/e;Lnet/youmi/android/banner/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lnet/youmi/android/banner/e;->b(Lnet/youmi/android/banner/h;)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 11

    if-eqz p1, :cond_0

    :try_start_0
    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    const-string v0, "\u7f51\u7edc\u8fde\u63a5\u5931\u8d25\uff0c\u7b49\u5f8530s\u540e\u518d\u6b21\u8bf7\u6c42"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    const/16 v0, 0x7530

    iput v0, p0, Lnet/youmi/android/banner/e;->i:I

    iget-object v0, p0, Lnet/youmi/android/banner/e;->c:Lnet/youmi/android/banner/AdView;

    iget-object v0, v0, Lnet/youmi/android/banner/AdView;->a:Lnet/youmi/android/banner/AdViewListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/banner/e;->c:Lnet/youmi/android/banner/AdView;

    iget-object v0, v0, Lnet/youmi/android/banner/AdView;->a:Lnet/youmi/android/banner/AdViewListener;

    iget-object v1, p0, Lnet/youmi/android/banner/e;->c:Lnet/youmi/android/banner/AdView;

    invoke-interface {v0, v1}, Lnet/youmi/android/banner/AdViewListener;->onFailedToReceivedAd(Lnet/youmi/android/banner/AdView;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    invoke-static {p1}, Lnet/youmi/android/a/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "c"

    const/4 v2, -0x1

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v1

    if-nez v1, :cond_4

    invoke-static {}, Lnet/youmi/android/banner/e;->o()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v1

    const-string v2, "rsd"

    const/4 v3, 0x0

    invoke-static {v0, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "e"

    const/4 v4, 0x0

    invoke-static {v0, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "html"

    const/4 v5, 0x0

    invoke-static {v0, v4, v5}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "jsc"

    const-string v6, ""

    invoke-static {v0, v5, v6}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "jsc"

    const-string v7, ""

    invoke-static {v0, v6, v7}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "plc"

    const-string v8, ""

    invoke-static {v0, v7, v8}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "st"

    const/16 v9, 0x1e

    invoke-static {v0, v8, v9}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v0

    if-eqz v2, :cond_1

    const-string v8, ""

    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1

    if-eqz v3, :cond_1

    const-string v8, ""

    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1

    if-eqz v4, :cond_1

    const-string v8, ""

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1

    iput v1, p0, Lnet/youmi/android/banner/e;->j:I

    sget-object v8, Lnet/youmi/android/c/a/u;->a:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "bannerId is:"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lnet/youmi/android/a/b/e/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v8, Lnet/youmi/android/banner/h;

    invoke-direct {v8}, Lnet/youmi/android/banner/h;-><init>()V

    invoke-virtual {v8, v1}, Lnet/youmi/android/banner/h;->a(I)V

    invoke-virtual {v8, v3}, Lnet/youmi/android/banner/h;->b(Ljava/lang/String;)V

    invoke-virtual {v8, v4}, Lnet/youmi/android/banner/h;->c(Ljava/lang/String;)V

    invoke-virtual {v8, v5}, Lnet/youmi/android/banner/h;->d(Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Lnet/youmi/android/banner/h;->e(Ljava/lang/String;)V

    invoke-virtual {v8, v2}, Lnet/youmi/android/banner/h;->a(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Lnet/youmi/android/banner/h;->b(I)V

    invoke-virtual {v8, v7}, Lnet/youmi/android/banner/h;->f(Ljava/lang/String;)V

    invoke-static {v1, v8}, Lnet/youmi/android/banner/BannerManager;->setBannerObject(ILnet/youmi/android/banner/h;)V

    if-lez v0, :cond_3

    mul-int/lit16 v0, v0, 0x3e8

    iput v0, p0, Lnet/youmi/android/banner/e;->i:I

    :cond_3
    const/4 v0, 0x1

    iput v0, p0, Lnet/youmi/android/banner/e;->e:I

    iget-object v0, p0, Lnet/youmi/android/banner/e;->f:Lnet/youmi/android/banner/g;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lnet/youmi/android/banner/g;->sendEmptyMessage(I)Z

    iget-object v0, p0, Lnet/youmi/android/banner/e;->c:Lnet/youmi/android/banner/AdView;

    iget-object v0, v0, Lnet/youmi/android/banner/AdView;->a:Lnet/youmi/android/banner/AdViewListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/banner/e;->c:Lnet/youmi/android/banner/AdView;

    iget-object v0, v0, Lnet/youmi/android/banner/AdView;->a:Lnet/youmi/android/banner/AdViewListener;

    iget-object v1, p0, Lnet/youmi/android/banner/e;->c:Lnet/youmi/android/banner/AdView;

    invoke-interface {v0, v1}, Lnet/youmi/android/banner/AdViewListener;->onReceivedAd(Lnet/youmi/android/banner/AdView;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    invoke-static {v0}, Lnet/youmi/android/a/b/e/b;->b(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    throw v0

    :cond_4
    :try_start_2
    invoke-static {v1}, Lnet/youmi/android/c/a/f;->a(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "YoumiAd request result code:%d, %s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v0, v3, v1

    invoke-static {v2, v3}, Lnet/youmi/android/a/c/b/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lnet/youmi/android/banner/e;->c:Lnet/youmi/android/banner/AdView;

    iget-object v0, v0, Lnet/youmi/android/banner/AdView;->a:Lnet/youmi/android/banner/AdViewListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/banner/e;->c:Lnet/youmi/android/banner/AdView;

    iget-object v0, v0, Lnet/youmi/android/banner/AdView;->a:Lnet/youmi/android/banner/AdViewListener;

    iget-object v1, p0, Lnet/youmi/android/banner/e;->c:Lnet/youmi/android/banner/AdView;

    invoke-interface {v0, v1}, Lnet/youmi/android/banner/AdViewListener;->onFailedToReceivedAd(Lnet/youmi/android/banner/AdView;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0
.end method

.method private b(Lnet/youmi/android/banner/h;)V
    .locals 6

    :try_start_0
    invoke-virtual {p1}, Lnet/youmi/android/banner/h;->a()I

    move-result v0

    invoke-virtual {p1}, Lnet/youmi/android/banner/h;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lnet/youmi/android/banner/h;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lnet/youmi/android/banner/h;->g()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lnet/youmi/android/banner/e;->h:Lnet/youmi/android/banner/c;

    if-nez v4, :cond_0

    new-instance v4, Lnet/youmi/android/banner/c;

    iget-object v5, p0, Lnet/youmi/android/banner/e;->a:Landroid/content/Context;

    invoke-direct {v4, v5, p0}, Lnet/youmi/android/banner/c;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/e/a/b/h;)V

    iput-object v4, p0, Lnet/youmi/android/banner/e;->h:Lnet/youmi/android/banner/c;

    iget-object v4, p0, Lnet/youmi/android/banner/e;->h:Lnet/youmi/android/banner/c;

    invoke-virtual {v4}, Lnet/youmi/android/banner/c;->a()V

    iget-object v4, p0, Lnet/youmi/android/banner/e;->h:Lnet/youmi/android/banner/c;

    invoke-virtual {v4, p0}, Lnet/youmi/android/banner/c;->a(Lnet/youmi/android/banner/d;)V

    :cond_0
    iget-object v4, p0, Lnet/youmi/android/banner/e;->h:Lnet/youmi/android/banner/c;

    invoke-virtual {v4, v0, v1, v2, v3}, Lnet/youmi/android/banner/c;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lnet/youmi/android/banner/e;->h:Lnet/youmi/android/banner/c;

    invoke-virtual {v0}, Lnet/youmi/android/banner/c;->b()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private n()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/banner/e;->a:Landroid/content/Context;

    iget-object v1, p0, Lnet/youmi/android/banner/e;->c:Lnet/youmi/android/banner/AdView;

    iget-object v1, v1, Lnet/youmi/android/banner/AdView;->b:Lnet/youmi/android/banner/AdSize;

    invoke-static {v0, v1}, Lnet/youmi/android/c/a/b;->a(Landroid/content/Context;Lnet/youmi/android/banner/AdSize;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/b/e/b;->b(Ljava/lang/Throwable;)V

    const-string v0, ""

    goto :goto_0
.end method

.method private static o()Ljava/lang/String;
    .locals 2

    :try_start_0
    const-string v0, "android"

    const-string v1, "5b54565655455d50"

    invoke-static {v1, v0}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/banner/e;->h()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x1f4

    invoke-static {v0, p1, p2, v1}, Lnet/youmi/android/a/a/g/d/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lnet/youmi/android/a/a/e/g/b;)Ljava/lang/String;
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/banner/e;->h()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lnet/youmi/android/a/a/g/d/a;->a(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/b;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(ILnet/youmi/android/a/a/e/g/b;)Lnet/youmi/android/a/a/e/a;
    .locals 2

    :try_start_0
    new-instance v0, Lnet/youmi/android/a/a/g/d/a/f;

    iget-object v1, p0, Lnet/youmi/android/banner/e;->a:Landroid/content/Context;

    invoke-direct {v0, v1, p2, p1}, Lnet/youmi/android/a/a/g/d/a/f;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/b;I)V

    invoke-static {v0}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V

    sget-object v0, Lnet/youmi/android/a/a/e/a;->b:Lnet/youmi/android/a/a/e/a;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    sget-object v0, Lnet/youmi/android/a/a/e/a;->c:Lnet/youmi/android/a/a/e/a;

    goto :goto_0
.end method

.method public a(Landroid/content/Context;Ljava/util/List;)Lnet/youmi/android/a/a/e/a;
    .locals 1

    :try_start_0
    invoke-static {p1, p2}, Lnet/youmi/android/a/a/g/e/c;->a(Landroid/content/Context;Ljava/util/List;)V

    sget-object v0, Lnet/youmi/android/a/a/e/a;->b:Lnet/youmi/android/a/a/e/a;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    sget-object v0, Lnet/youmi/android/a/a/e/a;->a:Lnet/youmi/android/a/a/e/a;

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Lnet/youmi/android/a/a/e/a;
    .locals 1

    sget-object v0, Lnet/youmi/android/a/a/e/a;->a:Lnet/youmi/android/a/a/e/a;

    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lnet/youmi/android/a/a/e/a;
    .locals 1

    sget-object v0, Lnet/youmi/android/a/a/e/a;->a:Lnet/youmi/android/a/a/e/a;

    return-object v0
.end method

.method public a(Lnet/youmi/android/a/a/e/g/a;Lnet/youmi/android/a/a/e/g/f;)Lnet/youmi/android/a/a/e/a;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/banner/e;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/c/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/c/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lnet/youmi/android/a/a/g/c/a;->a(Lnet/youmi/android/a/a/e/g/a;Lnet/youmi/android/a/a/e/g/f;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v0, Lnet/youmi/android/a/a/e/a;->b:Lnet/youmi/android/a/a/e/a;

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    sget-object v0, Lnet/youmi/android/a/a/e/a;->a:Lnet/youmi/android/a/a/e/a;

    goto :goto_0
.end method

.method public a(Lnet/youmi/android/a/a/e/g/c;)Lnet/youmi/android/a/a/e/a;
    .locals 1

    sget-object v0, Lnet/youmi/android/a/a/e/a;->a:Lnet/youmi/android/a/a/e/a;

    return-object v0
.end method

.method public a(Lnet/youmi/android/a/a/e/g/d;)Lnet/youmi/android/a/a/e/a;
    .locals 4

    :try_start_0
    const-string v0, "\u6253\u5f00\u65b0\u7684\u6d4f\u89c8\u5668"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lnet/youmi/android/a/a/e/g/d;->a(I)Lnet/youmi/android/a/a/e/g/c;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lnet/youmi/android/banner/e;->a:Landroid/content/Context;

    const-class v3, Lnet/youmi/android/AdBrowser;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "aca5522945c72310f9f22b333c68f2b3"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    const/high16 v0, 0x10000000

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    iget-object v0, p0, Lnet/youmi/android/banner/e;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v0, Lnet/youmi/android/a/a/e/a;->b:Lnet/youmi/android/a/a/e/a;

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    sget-object v0, Lnet/youmi/android/a/a/e/a;->c:Lnet/youmi/android/a/a/e/a;

    goto :goto_0
.end method

.method public a(Lnet/youmi/android/a/a/e/g/g;)Lnet/youmi/android/a/a/e/a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected a()V
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    iput v0, p0, Lnet/youmi/android/banner/e;->e:I

    new-instance v0, Lnet/youmi/android/banner/f;

    invoke-direct {v0, p0}, Lnet/youmi/android/banner/f;-><init>(Lnet/youmi/android/banner/e;)V

    iput-object v0, p0, Lnet/youmi/android/banner/e;->l:Lnet/youmi/android/banner/f;

    iget-object v0, p0, Lnet/youmi/android/banner/e;->k:Ljava/util/Timer;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/banner/e;->k:Ljava/util/Timer;

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/banner/e;->k:Ljava/util/Timer;

    iget-object v1, p0, Lnet/youmi/android/banner/e;->l:Lnet/youmi/android/banner/f;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x7530

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public a(I)V
    .locals 4

    const/4 v3, 0x0

    invoke-static {p1}, Lnet/youmi/android/banner/BannerManager;->getBannerObject(I)Lnet/youmi/android/banner/h;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/banner/e;->c:Lnet/youmi/android/banner/AdView;

    invoke-virtual {v0}, Lnet/youmi/android/banner/AdView;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    iget-object v1, p0, Lnet/youmi/android/banner/e;->c:Lnet/youmi/android/banner/AdView;

    iget v1, v1, Lnet/youmi/android/banner/AdView;->c:I

    iget-object v2, p0, Lnet/youmi/android/banner/e;->c:Lnet/youmi/android/banner/AdView;

    iget v2, v2, Lnet/youmi/android/banner/AdView;->d:I

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iget-object v1, p0, Lnet/youmi/android/banner/e;->c:Lnet/youmi/android/banner/AdView;

    iget-object v2, p0, Lnet/youmi/android/banner/e;->g:Lnet/youmi/android/banner/a;

    invoke-virtual {v2}, Lnet/youmi/android/banner/a;->e()Lnet/youmi/android/a/a/i/a/g;

    move-result-object v2

    invoke-virtual {v2}, Lnet/youmi/android/a/a/i/a/g;->getCurrentView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lnet/youmi/android/banner/AdView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/banner/e;->c:Lnet/youmi/android/banner/AdView;

    invoke-virtual {v0, v3}, Lnet/youmi/android/banner/AdView;->setVisibility(I)V

    iget-object v0, p0, Lnet/youmi/android/banner/e;->g:Lnet/youmi/android/banner/a;

    iget-object v0, v0, Lnet/youmi/android/banner/a;->a:Lnet/youmi/android/a/a/i/a/g;

    invoke-virtual {v0, v3}, Lnet/youmi/android/a/a/i/a/g;->setVisibility(I)V

    const/4 v0, 0x1

    iput v0, p0, Lnet/youmi/android/banner/e;->e:I

    const-string v0, "\u5207\u6362\u5e7f\u544a"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lnet/youmi/android/banner/e;->c:Lnet/youmi/android/banner/AdView;

    iget-object v0, v0, Lnet/youmi/android/banner/AdView;->a:Lnet/youmi/android/banner/AdViewListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/banner/e;->c:Lnet/youmi/android/banner/AdView;

    iget-object v0, v0, Lnet/youmi/android/banner/AdView;->a:Lnet/youmi/android/banner/AdViewListener;

    iget-object v1, p0, Lnet/youmi/android/banner/e;->c:Lnet/youmi/android/banner/AdView;

    invoke-interface {v0, v1}, Lnet/youmi/android/banner/AdViewListener;->onSwitchedAd(Lnet/youmi/android/banner/AdView;)V

    :cond_1
    return-void
.end method

.method public a(Lnet/youmi/android/a/a/i/a/b/a;)V
    .locals 0

    return-void
.end method

.method public a(Lnet/youmi/android/banner/h;)V
    .locals 9

    const/4 v8, 0x1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/banner/e;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/e/b/d;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/e/b/d;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lnet/youmi/android/c/a/c;->r()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lnet/youmi/android/banner/BannerManager;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/e/b/d;->a(Ljava/lang/String;)Lnet/youmi/android/a/a/e/b/a;

    move-result-object v0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    iput v0, p0, Lnet/youmi/android/banner/e;->d:I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    :try_start_1
    invoke-virtual {p1}, Lnet/youmi/android/banner/h;->a()I

    move-result v1

    invoke-virtual {p1}, Lnet/youmi/android/banner/h;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lnet/youmi/android/banner/h;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lnet/youmi/android/banner/h;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lnet/youmi/android/banner/h;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lnet/youmi/android/banner/h;->d()Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, Lnet/youmi/android/banner/e;->g:Lnet/youmi/android/banner/a;

    if-nez v0, :cond_1

    new-instance v0, Lnet/youmi/android/banner/a;

    iget-object v7, p0, Lnet/youmi/android/banner/e;->a:Landroid/content/Context;

    invoke-direct {v0, v7, p0}, Lnet/youmi/android/banner/a;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/e/a/b/h;)V

    iput-object v0, p0, Lnet/youmi/android/banner/e;->g:Lnet/youmi/android/banner/a;

    iget-object v0, p0, Lnet/youmi/android/banner/e;->g:Lnet/youmi/android/banner/a;

    invoke-virtual {v0}, Lnet/youmi/android/banner/a;->a()V

    iget-object v0, p0, Lnet/youmi/android/banner/e;->g:Lnet/youmi/android/banner/a;

    invoke-virtual {v0, p0}, Lnet/youmi/android/banner/a;->a(Lnet/youmi/android/banner/b;)V

    :cond_1
    iget-object v0, p0, Lnet/youmi/android/banner/e;->g:Lnet/youmi/android/banner/a;

    iget-object v0, v0, Lnet/youmi/android/banner/a;->a:Lnet/youmi/android/a/a/i/a/g;

    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Lnet/youmi/android/a/a/i/a/g;->setBackgroundColor(I)V

    iget-object v0, p0, Lnet/youmi/android/banner/e;->g:Lnet/youmi/android/banner/a;

    invoke-virtual/range {v0 .. v6}, Lnet/youmi/android/banner/a;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget v0, p0, Lnet/youmi/android/banner/e;->d:I

    if-ne v0, v8, :cond_4

    iget-object v0, p0, Lnet/youmi/android/banner/e;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/e/b/d;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/e/b/d;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lnet/youmi/android/c/a/c;->r()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lnet/youmi/android/banner/BannerManager;->a()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lnet/youmi/android/a/a/e/b/d;->b(Ljava/lang/String;)Z

    iget-object v0, p0, Lnet/youmi/android/banner/e;->g:Lnet/youmi/android/banner/a;

    invoke-virtual {v0}, Lnet/youmi/android/banner/a;->d()V

    const-string v0, "\u5207\u6362\u5e7f\u544a"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lnet/youmi/android/banner/e;->c:Lnet/youmi/android/banner/AdView;

    iget-object v0, v0, Lnet/youmi/android/banner/AdView;->a:Lnet/youmi/android/banner/AdViewListener;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnet/youmi/android/banner/e;->c:Lnet/youmi/android/banner/AdView;

    iget-object v0, v0, Lnet/youmi/android/banner/AdView;->a:Lnet/youmi/android/banner/AdViewListener;

    iget-object v2, p0, Lnet/youmi/android/banner/e;->c:Lnet/youmi/android/banner/AdView;

    invoke-interface {v0, v2}, Lnet/youmi/android/banner/AdViewListener;->onSwitchedAd(Lnet/youmi/android/banner/AdView;)V

    :cond_2
    :goto_1
    invoke-static {v1}, Lnet/youmi/android/banner/BannerManager;->a(I)V

    invoke-virtual {p0}, Lnet/youmi/android/banner/e;->c()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :goto_2
    return-void

    :cond_3
    :try_start_2
    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/b/a;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lnet/youmi/android/banner/e;->d:I
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    :try_start_3
    sget-object v1, Lnet/youmi/android/c/a/u;->a:Ljava/lang/String;

    invoke-static {v1, v0}, Lnet/youmi/android/a/b/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_0

    :catch_1
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_4
    :try_start_4
    iget-object v0, p0, Lnet/youmi/android/banner/e;->g:Lnet/youmi/android/banner/a;

    invoke-virtual {v0}, Lnet/youmi/android/banner/a;->b()V

    iget-object v0, p0, Lnet/youmi/android/banner/e;->g:Lnet/youmi/android/banner/a;

    invoke-virtual {v0}, Lnet/youmi/android/banner/a;->c()V

    const/4 v0, 0x1

    iput v0, p0, Lnet/youmi/android/banner/e;->d:I
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_1
.end method

.method public b(Lnet/youmi/android/a/a/e/g/g;)Lnet/youmi/android/a/a/e/a;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/banner/e;->a:Landroid/content/Context;

    invoke-static {v0, p1}, Lnet/youmi/android/a/a/i/a/a/d;->b(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/g;)Lnet/youmi/android/a/a/i/a/a/d;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/a/d;->show()V

    const-string v0, "\u4e0d\u652f\u6301\u6253\u5f00\u65b0\u7684dialog"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    sget-object v0, Lnet/youmi/android/a/a/e/a;->a:Lnet/youmi/android/a/a/e/a;

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected b()V
    .locals 1

    const/4 v0, 0x3

    :try_start_0
    iput v0, p0, Lnet/youmi/android/banner/e;->e:I

    iget-object v0, p0, Lnet/youmi/android/banner/e;->k:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    iget-object v0, p0, Lnet/youmi/android/banner/e;->l:Lnet/youmi/android/banner/f;

    invoke-virtual {v0}, Lnet/youmi/android/banner/f;->cancel()Z

    const/4 v0, 0x0

    iput-object v0, p0, Lnet/youmi/android/banner/e;->k:Ljava/util/Timer;

    const/4 v0, 0x0

    iput-object v0, p0, Lnet/youmi/android/banner/e;->l:Lnet/youmi/android/banner/f;

    invoke-virtual {p0}, Lnet/youmi/android/banner/e;->d()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public b(I)V
    .locals 1

    invoke-static {p1}, Lnet/youmi/android/banner/BannerManager;->getBannerObject(I)Lnet/youmi/android/banner/h;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lnet/youmi/android/banner/e;->a(Lnet/youmi/android/banner/h;)V

    :cond_0
    return-void
.end method

.method public c(I)Lnet/youmi/android/a/a/e/a;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/banner/e;->g:Lnet/youmi/android/banner/a;

    iget-object v0, v0, Lnet/youmi/android/banner/a;->a:Lnet/youmi/android/a/a/i/a/g;

    invoke-virtual {v0, p1}, Lnet/youmi/android/a/a/i/a/g;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v0, Lnet/youmi/android/a/a/e/a;->b:Lnet/youmi/android/a/a/e/a;

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    sget-object v0, Lnet/youmi/android/a/a/e/a;->a:Lnet/youmi/android/a/a/e/a;

    goto :goto_0
.end method

.method protected c()V
    .locals 6

    const/4 v1, 0x0

    iget-object v0, p0, Lnet/youmi/android/banner/e;->k:Ljava/util/Timer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/banner/e;->k:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    iput-object v1, p0, Lnet/youmi/android/banner/e;->k:Ljava/util/Timer;

    :cond_0
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/banner/e;->k:Ljava/util/Timer;

    iget-object v0, p0, Lnet/youmi/android/banner/e;->l:Lnet/youmi/android/banner/f;

    invoke-virtual {v0}, Lnet/youmi/android/banner/f;->cancel()Z

    iput-object v1, p0, Lnet/youmi/android/banner/e;->l:Lnet/youmi/android/banner/f;

    new-instance v0, Lnet/youmi/android/banner/f;

    invoke-direct {v0, p0}, Lnet/youmi/android/banner/f;-><init>(Lnet/youmi/android/banner/e;)V

    iput-object v0, p0, Lnet/youmi/android/banner/e;->l:Lnet/youmi/android/banner/f;

    iget-object v0, p0, Lnet/youmi/android/banner/e;->k:Ljava/util/Timer;

    iget-object v1, p0, Lnet/youmi/android/banner/e;->l:Lnet/youmi/android/banner/f;

    iget v2, p0, Lnet/youmi/android/banner/e;->i:I

    int-to-long v2, v2

    const-wide/16 v4, 0x7530

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    return-void
.end method

.method public d()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/banner/e;->c:Lnet/youmi/android/banner/AdView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/banner/e;->c:Lnet/youmi/android/banner/AdView;

    invoke-virtual {v0}, Lnet/youmi/android/banner/AdView;->removeAllViews()V

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/banner/e;->g:Lnet/youmi/android/banner/a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/banner/e;->g:Lnet/youmi/android/banner/a;

    invoke-virtual {v0}, Lnet/youmi/android/banner/a;->e()Lnet/youmi/android/a/a/i/a/g;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/g;->destroy()V

    const/4 v0, 0x0

    iput-object v0, p0, Lnet/youmi/android/banner/e;->g:Lnet/youmi/android/banner/a;

    :cond_1
    iget-object v0, p0, Lnet/youmi/android/banner/e;->h:Lnet/youmi/android/banner/c;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnet/youmi/android/banner/e;->h:Lnet/youmi/android/banner/c;

    invoke-virtual {v0}, Lnet/youmi/android/banner/c;->c()Lnet/youmi/android/a/a/i/a/g;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/g;->destroy()V

    const/4 v0, 0x0

    iput-object v0, p0, Lnet/youmi/android/banner/e;->h:Lnet/youmi/android/banner/c;

    :cond_2
    iget-object v0, p0, Lnet/youmi/android/banner/e;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/e/b/d;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/e/b/d;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lnet/youmi/android/c/a/c;->r()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lnet/youmi/android/banner/BannerManager;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/e/b/d;->b(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method protected e()V
    .locals 0

    invoke-virtual {p0}, Lnet/youmi/android/banner/e;->f()V

    return-void
.end method

.method protected f()V
    .locals 1

    invoke-direct {p0}, Lnet/youmi/android/banner/e;->n()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lnet/youmi/android/banner/e;->b(Ljava/lang/String;)V

    return-void
.end method

.method public g()Landroid/app/Activity;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public h()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/banner/e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public i()Lnet/youmi/android/a/a/e/a;
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/banner/e;->c:Lnet/youmi/android/banner/AdView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lnet/youmi/android/banner/AdView;->setVisibility(I)V

    sget-object v0, Lnet/youmi/android/a/a/e/a;->b:Lnet/youmi/android/a/a/e/a;

    return-object v0
.end method

.method public j()Lnet/youmi/android/a/a/e/a;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/banner/e;->g:Lnet/youmi/android/banner/a;

    invoke-virtual {v0}, Lnet/youmi/android/banner/a;->e()Lnet/youmi/android/a/a/i/a/g;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/g;->reload()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v0, Lnet/youmi/android/a/a/e/a;->b:Lnet/youmi/android/a/a/e/a;

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    sget-object v0, Lnet/youmi/android/a/a/e/a;->c:Lnet/youmi/android/a/a/e/a;

    goto :goto_0
.end method

.method public k()I
    .locals 1

    const/16 v0, 0x1f4

    return v0
.end method

.method public l()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public m()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method
