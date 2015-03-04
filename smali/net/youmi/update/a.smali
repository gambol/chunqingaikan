.class public Lnet/youmi/android/update/a;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroid/content/Context;)Lnet/youmi/android/update/AppUpdateInfo;
    .locals 7

    const/4 v0, 0x0

    const/4 v4, 0x2

    const/4 v6, 0x1

    const/4 v5, 0x0

    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/update/a;->b(Landroid/content/Context;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    if-nez v3, :cond_0

    const-string v1, "Check for app update , request : [%s] , response : [%s]"

    new-array v2, v4, [Ljava/lang/Object;

    aput-object v3, v2, v5

    aput-object v0, v2, v6

    invoke-static {v1, v2}, Lnet/youmi/android/a/c/b/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-object v0

    :cond_0
    :try_start_1
    invoke-static {p0, v3}, Lnet/youmi/android/a/c/d/c;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v2

    if-nez v2, :cond_1

    const-string v1, "Check for app update , request : [%s] , response : [%s]"

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v3, v4, v5

    aput-object v2, v4, v6

    invoke-static {v1, v4}, Lnet/youmi/android/a/c/b/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    :try_start_2
    invoke-static {p0, v2}, Lnet/youmi/android/update/a;->a(Landroid/content/Context;Ljava/lang/String;)Lnet/youmi/android/update/AppUpdateInfo;
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result-object v0

    const-string v1, "Check for app update , request : [%s] , response : [%s]"

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v3, v4, v5

    aput-object v2, v4, v6

    invoke-static {v1, v4}, Lnet/youmi/android/a/c/b/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catch_0
    move-exception v1

    move-object v2, v0

    move-object v3, v0

    :goto_1
    :try_start_3
    invoke-static {v1}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    const-string v1, "Check for app update , request : [%s] , response : [%s]"

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v3, v4, v5

    aput-object v2, v4, v6

    invoke-static {v1, v4}, Lnet/youmi/android/a/c/b/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    move-object v2, v0

    move-object v3, v0

    move-object v0, v1

    :goto_2
    const-string v1, "Check for app update , request : [%s] , response : [%s]"

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v3, v4, v5

    aput-object v2, v4, v6

    invoke-static {v1, v4}, Lnet/youmi/android/a/c/b/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0

    :catchall_1
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    goto :goto_2

    :catchall_2
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v1

    move-object v2, v0

    goto :goto_1

    :catch_2
    move-exception v1

    goto :goto_1
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;)Lnet/youmi/android/update/AppUpdateInfo;
    .locals 7

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->f(Landroid/content/Context;)I

    move-result v1

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    invoke-static {p1}, Lnet/youmi/android/a/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v3, "c"

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "d"

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v3, "url"

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    const-string v4, "vc"

    const/4 v5, 0x0

    invoke-static {v2, v4, v5}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v4

    if-le v4, v1, :cond_0

    const-string v1, "vn"

    const/4 v5, 0x0

    invoke-static {v2, v1, v5}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v1, "tips"

    const/4 v6, 0x0

    invoke-static {v2, v1, v6}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v1, Lnet/youmi/android/update/AppUpdateInfo;

    invoke-direct {v1}, Lnet/youmi/android/update/AppUpdateInfo;-><init>()V

    invoke-virtual {v1, v2}, Lnet/youmi/android/update/AppUpdateInfo;->b(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Lnet/youmi/android/update/AppUpdateInfo;->c(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Lnet/youmi/android/update/AppUpdateInfo;->a(I)V

    invoke-virtual {v1, v5}, Lnet/youmi/android/update/AppUpdateInfo;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-static {v1}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Lnet/youmi/android/a/a/c;->f()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    :goto_0
    return-object v0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    new-instance v1, Lnet/youmi/android/a/c/c/b;

    invoke-direct {v1, p0}, Lnet/youmi/android/a/c/c/b;-><init>(Landroid/content/Context;)V

    const-string v3, "?cid="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1}, Lnet/youmi/android/a/c/c/b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&apn="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p0}, Lnet/youmi/android/a/b/i/k;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lnet/youmi/android/a/b/d/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&chn="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->g(Landroid/content/Context;)I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "&ver="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->f(Landroid/content/Context;)I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "&app="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lnet/youmi/android/a/b/d/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&rt="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/16 v6, 0x3e8

    div-long/2addr v4, v6

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-static {v1}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    invoke-static {v1}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method
