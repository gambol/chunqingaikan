.class public Lnet/youmi/android/offers/d/b/b;
.super Lnet/youmi/android/a/b/j/a;


# static fields
.field private static b:Lnet/youmi/android/offers/d/b/b;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Lnet/youmi/android/a/b/j/a;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/offers/d/b/b;->a:Landroid/content/Context;

    iget-object v0, p0, Lnet/youmi/android/offers/d/b/b;->a:Landroid/content/Context;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Context is null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lnet/youmi/android/offers/d/b/b;
    .locals 3

    const-class v1, Lnet/youmi/android/offers/d/b/b;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/offers/d/b/b;->b:Lnet/youmi/android/offers/d/b/b;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/offers/d/b/b;

    invoke-direct {v0, p0}, Lnet/youmi/android/offers/d/b/b;-><init>(Landroid/content/Context;)V

    sput-object v0, Lnet/youmi/android/offers/d/b/b;->b:Lnet/youmi/android/offers/d/b/b;

    :cond_0
    sget-object v0, Lnet/youmi/android/offers/d/b/b;->b:Lnet/youmi/android/offers/d/b/b;

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
    sget-object v0, Lnet/youmi/android/offers/d/b/b;->b:Lnet/youmi/android/offers/d/b/b;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-object v0
.end method


# virtual methods
.method a()V
    .locals 6

    iget-object v0, p0, Lnet/youmi/android/offers/d/b/b;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/offers/d/b/e;->a(Landroid/content/Context;)Lnet/youmi/android/offers/d/b/e;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/offers/d/b/e;->a()I

    move-result v2

    :try_start_0
    invoke-static {}, Lnet/youmi/android/offers/d/b/a;->a()Lnet/youmi/android/offers/d/b/a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lnet/youmi/android/offers/d/b/a;->onPointBalanceChange(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2

    :goto_0
    :try_start_1
    invoke-virtual {p0}, Lnet/youmi/android/offers/d/b/b;->g()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    move v1, v0

    :goto_2
    invoke-interface {v3}, Ljava/util/List;->size()I
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    if-ge v1, v0, :cond_0

    :try_start_2
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/offers/PointsChangeNotify;

    if-eqz v0, :cond_2

    invoke-static {}, Lnet/youmi/android/a/b/k/m;->b()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v0, v2}, Lnet/youmi/android/offers/PointsChangeNotify;->onPointBalanceChange(I)V

    :cond_2
    :goto_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :cond_3
    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v4

    new-instance v5, Lnet/youmi/android/offers/d/b/c;

    invoke-direct {v5, p0, v0, v2}, Lnet/youmi/android/offers/d/b/c;-><init>(Lnet/youmi/android/offers/d/b/b;Lnet/youmi/android/offers/PointsChangeNotify;I)V

    invoke-virtual {v4, v5}, Lnet/youmi/android/a/b/k/m;->a(Ljava/lang/Runnable;)Z
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    :try_start_3
    const-string v4, "\u7b2c[%d]\u4e2a\u79ef\u5206\u4f59\u989d\u53d8\u52a8\u76d1\u542c\u56de\u8c03\u6709\u95ee\u9898\uff01\uff01\uff01"

    invoke-static {v4, v0}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
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
