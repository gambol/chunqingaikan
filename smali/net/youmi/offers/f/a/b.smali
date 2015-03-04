.class public Lnet/youmi/android/offers/f/a/b;
.super Ljava/lang/Object;


# static fields
.field private static a:Lnet/youmi/android/a/b/c/i;


# direct methods
.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/offers/f/a/b;->a(Landroid/content/Context;)V

    sget-object v0, Lnet/youmi/android/offers/f/a/b;->a:Lnet/youmi/android/a/b/c/i;

    invoke-virtual {v0, p1, p2}, Lnet/youmi/android/a/b/c/i;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p2

    :goto_0
    return-object p2

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private static declared-synchronized a(Landroid/content/Context;)V
    .locals 4

    const-class v1, Lnet/youmi/android/offers/f/a/b;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/offers/f/a/b;->a:Lnet/youmi/android/a/b/c/i;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/b/c/i;

    const-string v2, "androidof"

    invoke-static {p0}, Lnet/youmi/android/offers/f/a/a;->g(Landroid/content/Context;)Lnet/youmi/android/a/b/c/g;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lnet/youmi/android/a/b/c/i;-><init>(Ljava/lang/String;Lnet/youmi/android/a/b/c/g;)V

    sput-object v0, Lnet/youmi/android/offers/f/a/b;->a:Lnet/youmi/android/a/b/c/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)Z
    .locals 1

    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/offers/f/a/b;->a(Landroid/content/Context;)V

    sget-object v0, Lnet/youmi/android/offers/f/a/b;->a:Lnet/youmi/android/a/b/c/i;

    invoke-virtual {v0, p1, p2, p3, p4}, Lnet/youmi/android/a/b/c/i;->a(Ljava/lang/String;Ljava/lang/String;J)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method
