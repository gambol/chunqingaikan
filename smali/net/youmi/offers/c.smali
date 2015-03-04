.class Lnet/youmi/android/offers/c;
.super Lnet/youmi/android/a/b/j/a;


# static fields
.field private static b:Lnet/youmi/android/offers/c;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Lnet/youmi/android/a/b/j/a;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/offers/c;->a:Landroid/content/Context;

    iget-object v0, p0, Lnet/youmi/android/offers/c;->a:Landroid/content/Context;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Context is null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method static synthetic a(Lnet/youmi/android/offers/c;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/offers/c;->a:Landroid/content/Context;

    return-object v0
.end method

.method static declared-synchronized a(Landroid/content/Context;)Lnet/youmi/android/offers/c;
    .locals 3

    const-class v1, Lnet/youmi/android/offers/c;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/offers/c;->b:Lnet/youmi/android/offers/c;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/offers/c;

    invoke-direct {v0, p0}, Lnet/youmi/android/offers/c;-><init>(Landroid/content/Context;)V

    sput-object v0, Lnet/youmi/android/offers/c;->b:Lnet/youmi/android/offers/c;

    :cond_0
    sget-object v0, Lnet/youmi/android/offers/c;->b:Lnet/youmi/android/offers/c;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v2, "Context is null"

    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :cond_1
    :try_start_1
    sget-object v0, Lnet/youmi/android/offers/c;->b:Lnet/youmi/android/offers/c;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-object v0
.end method


# virtual methods
.method a(Lnet/youmi/android/offers/EarnPointsOrderList;)V
    .locals 5

    :try_start_0
    invoke-static {}, Lnet/youmi/android/offers/b;->a()Lnet/youmi/android/offers/b;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/offers/c;->a:Landroid/content/Context;

    invoke-virtual {v0, v1, p1}, Lnet/youmi/android/offers/b;->onPointEarn(Landroid/content/Context;Lnet/youmi/android/offers/EarnPointsOrderList;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2

    :goto_0
    :try_start_1
    invoke-virtual {p0}, Lnet/youmi/android/offers/c;->g()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    move v1, v0

    :goto_2
    invoke-interface {v2}, Ljava/util/List;->size()I
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    if-ge v1, v0, :cond_0

    :try_start_2
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/offers/PointsEarnNotify;

    if-eqz v0, :cond_2

    invoke-static {}, Lnet/youmi/android/a/b/k/m;->b()Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Lnet/youmi/android/offers/c;->a:Landroid/content/Context;

    invoke-interface {v0, v3, p1}, Lnet/youmi/android/offers/PointsEarnNotify;->onPointEarn(Landroid/content/Context;Lnet/youmi/android/offers/EarnPointsOrderList;)V

    :cond_2
    :goto_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :cond_3
    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v3

    new-instance v4, Lnet/youmi/android/offers/d;

    invoke-direct {v4, p0, v0, p1}, Lnet/youmi/android/offers/d;-><init>(Lnet/youmi/android/offers/c;Lnet/youmi/android/offers/PointsEarnNotify;Lnet/youmi/android/offers/EarnPointsOrderList;)V

    invoke-virtual {v3, v4}, Lnet/youmi/android/a/b/k/m;->a(Ljava/lang/Runnable;)Z
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    :try_start_3
    const-string v3, "\u7b2c[%d]\u4e2a\u79ef\u5206\u8ba2\u5355\u8d5a\u53d6\u76d1\u542c\u56de\u8c03\u6709\u95ee\u9898\uff01\uff01\uff01"

    invoke-static {v3, v0}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_0
.end method
