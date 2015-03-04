.class public Lnet/youmi/android/a/a/b/a;
.super Lnet/youmi/android/a/b/c/g;


# static fields
.field private static b:Lnet/youmi/android/a/b/c/g;

.field private static c:Lnet/youmi/android/a/b/c/g;

.field private static d:Lnet/youmi/android/a/b/c/g;

.field private static e:Lnet/youmi/android/a/b/c/g;

.field private static f:Lnet/youmi/android/a/b/c/g;


# direct methods
.method public static declared-synchronized a(Landroid/content/Context;)Lnet/youmi/android/a/b/c/g;
    .locals 5

    const-class v1, Lnet/youmi/android/a/a/b/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/a/b/a;->b:Lnet/youmi/android/a/b/c/g;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/b/c/g;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "wsUL1uCdKvjD"

    const/4 v4, 0x1

    invoke-direct {v0, v2, v3, v4}, Lnet/youmi/android/a/b/c/g;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    sput-object v0, Lnet/youmi/android/a/a/b/a;->b:Lnet/youmi/android/a/b/c/g;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    :try_start_1
    sget-object v0, Lnet/youmi/android/a/a/b/a;->b:Lnet/youmi/android/a/b/c/g;
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

.method public static declared-synchronized b(Landroid/content/Context;)Lnet/youmi/android/a/b/c/g;
    .locals 5

    const-class v1, Lnet/youmi/android/a/a/b/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/a/b/a;->c:Lnet/youmi/android/a/b/c/g;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/b/c/g;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "T1oX0rhhuXWt"

    const/4 v4, 0x1

    invoke-direct {v0, v2, v3, v4}, Lnet/youmi/android/a/b/c/g;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    sput-object v0, Lnet/youmi/android/a/a/b/a;->c:Lnet/youmi/android/a/b/c/g;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    :try_start_1
    sget-object v0, Lnet/youmi/android/a/a/b/a;->c:Lnet/youmi/android/a/b/c/g;
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

.method public static declared-synchronized c(Landroid/content/Context;)Lnet/youmi/android/a/b/c/g;
    .locals 5

    const-class v1, Lnet/youmi/android/a/a/b/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/a/b/a;->d:Lnet/youmi/android/a/b/c/g;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/b/c/g;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "P15pKIjsm64m"

    const/4 v4, 0x5

    invoke-direct {v0, v2, v3, v4}, Lnet/youmi/android/a/b/c/g;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    sput-object v0, Lnet/youmi/android/a/a/b/a;->d:Lnet/youmi/android/a/b/c/g;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    :try_start_1
    sget-object v0, Lnet/youmi/android/a/a/b/a;->d:Lnet/youmi/android/a/b/c/g;
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

.method public static declared-synchronized d(Landroid/content/Context;)Lnet/youmi/android/a/b/c/g;
    .locals 4

    const-class v1, Lnet/youmi/android/a/a/b/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/a/b/a;->e:Lnet/youmi/android/a/b/c/g;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/b/c/g;

    const-string v2, "XKwVoK0huy3R"

    const/4 v3, 0x2

    invoke-direct {v0, p0, v2, v3}, Lnet/youmi/android/a/b/c/g;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    sput-object v0, Lnet/youmi/android/a/a/b/a;->e:Lnet/youmi/android/a/b/c/g;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    :try_start_1
    sget-object v0, Lnet/youmi/android/a/a/b/a;->e:Lnet/youmi/android/a/b/c/g;
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

.method public static declared-synchronized e(Landroid/content/Context;)Lnet/youmi/android/a/b/c/g;
    .locals 4

    const-class v1, Lnet/youmi/android/a/a/b/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/a/b/a;->f:Lnet/youmi/android/a/b/c/g;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/b/c/g;

    const-string v2, "wIU6pTyUBYWX"

    const/4 v3, 0x3

    invoke-direct {v0, p0, v2, v3}, Lnet/youmi/android/a/b/c/g;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    sput-object v0, Lnet/youmi/android/a/a/b/a;->f:Lnet/youmi/android/a/b/c/g;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    :try_start_1
    sget-object v0, Lnet/youmi/android/a/a/b/a;->f:Lnet/youmi/android/a/b/c/g;
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
