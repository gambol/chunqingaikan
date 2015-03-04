.class public Lnet/youmi/android/a/a/e/b/c;
.super Ljava/lang/Object;


# static fields
.field private static a:Lnet/youmi/android/a/b/c/i;


# direct methods
.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    :try_start_0
    invoke-static {p1}, Lnet/youmi/android/a/b/b/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-object p2

    :cond_1
    invoke-static {p1}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p0}, Lnet/youmi/android/a/a/e/b/c;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/c/i;

    move-result-object v1

    invoke-virtual {v1, v0, p2}, Lnet/youmi/android/a/b/c/i;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p2

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private static declared-synchronized a(Landroid/content/Context;)Lnet/youmi/android/a/b/c/i;
    .locals 4

    const-class v1, Lnet/youmi/android/a/a/e/b/c;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/a/e/b/c;->a:Lnet/youmi/android/a/b/c/i;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/b/c/i;

    const-string v2, "wEjvZpk3"

    invoke-static {p0}, Lnet/youmi/android/a/a/b/a;->d(Landroid/content/Context;)Lnet/youmi/android/a/b/c/g;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lnet/youmi/android/a/b/c/i;-><init>(Ljava/lang/String;Lnet/youmi/android/a/b/c/g;)V

    sput-object v0, Lnet/youmi/android/a/a/e/b/c;->a:Lnet/youmi/android/a/b/c/i;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    :try_start_1
    sget-object v0, Lnet/youmi/android/a/a/e/b/c;->a:Lnet/youmi/android/a/b/c/i;
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

    :try_start_0
    invoke-static {p1}, Lnet/youmi/android/a/b/b/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-static {p1}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    if-eqz p2, :cond_0

    invoke-static {p0}, Lnet/youmi/android/a/a/e/b/c;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/c/i;

    move-result-object v2

    invoke-virtual {v2, v1, p2, p3, p4}, Lnet/youmi/android/a/b/c/i;->a(Ljava/lang/String;Ljava/lang/String;J)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method
