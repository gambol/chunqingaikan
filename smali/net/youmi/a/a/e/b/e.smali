.class public Lnet/youmi/android/a/a/e/b/e;
.super Ljava/lang/Object;


# static fields
.field private static a:Lnet/youmi/android/a/b/c/h;


# direct methods
.method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    :try_start_0
    invoke-static {p1}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lnet/youmi/android/a/a/e/b/b;

    invoke-direct {v2, v1}, Lnet/youmi/android/a/a/e/b/b;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lnet/youmi/android/a/a/e/b/e;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/c/h;

    move-result-object v1

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/b/c/h;->b(Lnet/youmi/android/a/b/c/d;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Lnet/youmi/android/a/a/e/b/b;->a()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private static declared-synchronized a(Landroid/content/Context;)Lnet/youmi/android/a/b/c/h;
    .locals 5

    const-class v1, Lnet/youmi/android/a/a/e/b/e;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/a/e/b/e;->a:Lnet/youmi/android/a/b/c/h;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/b/c/h;

    const-string v2, "ObeolEO5"

    invoke-static {p0}, Lnet/youmi/android/a/a/b/a;->e(Landroid/content/Context;)Lnet/youmi/android/a/b/c/g;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v0, p0, v2, v3, v4}, Lnet/youmi/android/a/b/c/h;-><init>(Landroid/content/Context;Ljava/lang/String;Lnet/youmi/android/a/b/c/g;I)V

    sput-object v0, Lnet/youmi/android/a/a/e/b/e;->a:Lnet/youmi/android/a/b/c/h;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    :try_start_1
    sget-object v0, Lnet/youmi/android/a/a/e/b/e;->a:Lnet/youmi/android/a/b/c/h;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    :try_start_0
    invoke-static {p1}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lnet/youmi/android/a/a/e/b/b;

    invoke-direct {v2, v1, p3, p4}, Lnet/youmi/android/a/a/e/b/b;-><init>(Ljava/lang/String;J)V

    invoke-virtual {v2, p2}, Lnet/youmi/android/a/a/e/b/b;->b(Ljava/lang/String;)V

    invoke-static {p0}, Lnet/youmi/android/a/a/e/b/e;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/c/h;

    move-result-object v1

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/b/c/h;->a(Lnet/youmi/android/a/b/c/d;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method
