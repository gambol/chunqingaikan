.class public Lnet/youmi/android/a/b/c/f;
.super Ljava/lang/Object;


# static fields
.field private static a:Lnet/youmi/android/a/b/c/i;


# direct methods
.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/data/data/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/databases/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "jqIqJYOT3JpT"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/a/b/c/f;->b(Landroid/content/Context;)V

    sget-object v0, Lnet/youmi/android/a/b/c/f;->a:Lnet/youmi/android/a/b/c/i;

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

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)Z
    .locals 1

    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/a/b/c/f;->b(Landroid/content/Context;)V

    sget-object v0, Lnet/youmi/android/a/b/c/f;->a:Lnet/youmi/android/a/b/c/i;

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

.method public static a(Landroid/content/Context;Ljava/lang/String;Z)Z
    .locals 2

    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/a/b/c/f;->b(Landroid/content/Context;)V

    sget-object v0, Lnet/youmi/android/a/b/c/f;->a:Lnet/youmi/android/a/b/c/i;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lnet/youmi/android/a/b/c/i;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return p2

    :cond_1
    const-string v1, "1"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 p2, 0x1

    goto :goto_0

    :cond_2
    const-string v1, "0"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;ZJ)Z
    .locals 3

    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/a/b/c/f;->b(Landroid/content/Context;)V

    if-eqz p2, :cond_0

    const-string v0, "1"

    :goto_0
    sget-object v1, Lnet/youmi/android/a/b/c/f;->a:Lnet/youmi/android/a/b/c/i;

    invoke-virtual {v1, p1, v0, p3, p4}, Lnet/youmi/android/a/b/c/i;->a(Ljava/lang/String;Ljava/lang/String;J)Z

    move-result v0

    :goto_1
    return v0

    :cond_0
    const-string v0, "0"
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_1
.end method

.method private static declared-synchronized b(Landroid/content/Context;)V
    .locals 4

    const-class v1, Lnet/youmi/android/a/b/c/f;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/b/c/f;->a:Lnet/youmi/android/a/b/c/i;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/b/c/i;

    const-string v2, "R42ga7hZ"

    invoke-static {p0}, Lnet/youmi/android/a/b/c/g;->f(Landroid/content/Context;)Lnet/youmi/android/a/b/c/g;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lnet/youmi/android/a/b/c/i;-><init>(Ljava/lang/String;Lnet/youmi/android/a/b/c/g;)V

    sput-object v0, Lnet/youmi/android/a/b/c/f;->a:Lnet/youmi/android/a/b/c/i;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method
