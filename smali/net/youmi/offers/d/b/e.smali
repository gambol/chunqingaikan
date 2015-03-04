.class public Lnet/youmi/android/offers/d/b/e;
.super Ljava/lang/Object;


# static fields
.field private static a:Lnet/youmi/android/offers/d/b/e;

.field private static g:Ljava/lang/String;

.field private static h:Ljava/lang/String;

.field private static i:Ljava/lang/String;


# instance fields
.field private b:Landroid/content/Context;

.field private c:I

.field private d:I

.field private e:I

.field private f:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v0, p0, Lnet/youmi/android/offers/d/b/e;->c:I

    iput v0, p0, Lnet/youmi/android/offers/d/b/e;->d:I

    iput v0, p0, Lnet/youmi/android/offers/d/b/e;->e:I

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Context must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/a/b/h/e;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xc

    const/16 v2, 0x14

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p2

    :goto_0
    return-object p2

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lnet/youmi/android/offers/d/b/e;
    .locals 2

    const-class v1, Lnet/youmi/android/offers/d/b/e;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/offers/d/b/e;->a:Lnet/youmi/android/offers/d/b/e;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/offers/d/b/e;

    invoke-direct {v0, p0}, Lnet/youmi/android/offers/d/b/e;-><init>(Landroid/content/Context;)V

    sput-object v0, Lnet/youmi/android/offers/d/b/e;->a:Lnet/youmi/android/offers/d/b/e;

    :cond_0
    sget-object v0, Lnet/youmi/android/offers/d/b/e;->a:Lnet/youmi/android/offers/d/b/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private a(Landroid/content/Context;I)Z
    .locals 4

    :try_start_0
    invoke-static {}, Lnet/youmi/android/a/b/d/h;->a()[B

    move-result-object v0

    new-instance v1, Ljava/lang/String;

    invoke-static {v0}, Lnet/youmi/android/a/b/d/a;->a([B)[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0}, Lnet/youmi/android/a/b/d/h;->a(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-direct {p0, v2, v0, v1}, Lnet/youmi/android/offers/d/b/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
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

.method private a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8

    const-string v1, "c"

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->l()Ljava/lang/String;

    move-result-object v2

    const-wide/16 v4, -0x1

    invoke-static {v0, v2, p3, v4, v5}, Lnet/youmi/android/a/b/c/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)Z

    move-result v0

    iget-object v2, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->k()Ljava/lang/String;

    move-result-object v3

    const-wide/16 v4, -0x1

    invoke-static {v2, v3, p2, v4, v5}, Lnet/youmi/android/a/b/c/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)Z

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->m()Ljava/lang/String;

    move-result-object v5

    const-wide/16 v6, -0x1

    invoke-static {v4, v5, v3, v6, v7}, Lnet/youmi/android/a/b/c/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)Z

    move-result v4

    if-eqz v0, :cond_0

    if-eqz v2, :cond_0

    if-eqz v4, :cond_0

    iget-object v0, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-direct {p0, v0, p2, p3, v3}, Lnet/youmi/android/offers/d/b/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x1

    :try_start_1
    monitor-exit v1

    :goto_0
    return v0

    :catch_0
    move-exception v0

    :cond_0
    const/4 v0, 0x0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8

    const-string v1, "b"

    monitor-enter v1

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->l()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    :try_start_2
    iget-object v2, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->i()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v5, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0xc

    const/16 v7, 0x14

    invoke-virtual {v5, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v3, v4, v0, v5}, Lnet/youmi/android/offers/d/b/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catch_0
    move-exception v2

    goto :goto_0
.end method

.method private declared-synchronized b(Landroid/content/Context;)I
    .locals 5

    const/4 v0, 0x0

    monitor-enter p0

    :try_start_0
    invoke-static {}, Lnet/youmi/android/offers/b/a;->h()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {}, Lnet/youmi/android/offers/b/a;->i()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    monitor-exit p0

    return v0

    :cond_1
    :try_start_1
    invoke-static {}, Lnet/youmi/android/offers/b/a;->j()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-static {v1}, Lnet/youmi/android/a/b/d/a;->b([B)[B

    move-result-object v1

    invoke-static {v2, v3, v1}, Lnet/youmi/android/a/b/d/h;->b(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private b()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-static {}, Lnet/youmi/android/offers/b/a;->h()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "/data/data/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/shared_prefs"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lnet/youmi/android/offers/b/a;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ".xml"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z
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

.method private c(Landroid/content/Context;)I
    .locals 1

    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->c()V

    invoke-direct {p0, p1}, Lnet/youmi/android/offers/d/b/e;->d(Landroid/content/Context;)I

    move-result v0

    return v0
.end method

.method private c()V
    .locals 12

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->m()Ljava/lang/String;

    move-result-object v1

    const-string v2, "0"

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/c/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/a/b/c/f;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v3, v0

    :goto_0
    const-string v4, "b"

    monitor-enter v4
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    const-string v1, ""

    const-string v0, ""

    const-string v2, ""

    iget-object v5, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->i()Ljava/lang/String;

    move-result-object v6

    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->g()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/16 v9, 0xc

    const/16 v10, 0x14

    invoke-virtual {v8, v9, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-static {v5, v6, v7, v8}, Lnet/youmi/android/offers/d/b/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_0

    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    return-void

    :cond_0
    :try_start_2
    invoke-static {v5}, Lnet/youmi/android/a/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->k()Ljava/lang/String;

    move-result-object v6

    const-string v7, ""

    invoke-static {v5, v6, v7}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->l()Ljava/lang/String;

    move-result-object v6

    const-string v7, ""

    invoke-static {v5, v6, v7}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->m()Ljava/lang/String;

    move-result-object v6

    const-string v7, ""

    invoke-static {v5, v6, v7}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v2

    move-object v11, v2

    move-object v2, v1

    move-object v1, v0

    move-object v0, v11

    :goto_2
    if-eqz v3, :cond_1

    :try_start_3
    const-string v5, ""

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result v5

    if-eqz v5, :cond_2

    :cond_1
    :try_start_4
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v0
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_0

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v5

    move-object v11, v2

    move-object v2, v1

    move-object v1, v0

    move-object v0, v11

    goto :goto_2

    :cond_2
    if-eqz v0, :cond_3

    :try_start_6
    const-string v5, ""

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-result v5

    if-eqz v5, :cond_4

    :cond_3
    :try_start_7
    monitor-exit v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_1

    :cond_4
    :try_start_8
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    invoke-static {v3}, Lnet/youmi/android/a/b/b/e;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    invoke-static {v0}, Lnet/youmi/android/a/b/b/e;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v8

    cmp-long v0, v8, v6

    if-lez v0, :cond_5

    iget-object v0, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-direct {p0, v0, v2, v1}, Lnet/youmi/android/offers/d/b/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_8
    .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :cond_5
    :goto_3
    :try_start_9
    monitor-exit v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_3

    :cond_6
    move-object v3, v0

    goto/16 :goto_0
.end method

.method private d()I
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    iget-object v2, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-direct {p0, v2}, Lnet/youmi/android/offers/d/b/e;->b(Landroid/content/Context;)I

    move-result v2

    invoke-direct {p0, v1, v2}, Lnet/youmi/android/offers/d/b/e;->a(Landroid/content/Context;I)Z

    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->b()V

    :cond_0
    iget-object v1, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-direct {p0, v1}, Lnet/youmi/android/offers/d/b/e;->c(Landroid/content/Context;)I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private d(Landroid/content/Context;)I
    .locals 6

    const/4 v0, 0x0

    const-string v1, "c"

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->k()Ljava/lang/String;

    move-result-object v3

    const-string v4, "0"

    invoke-static {v2, v3, v4}, Lnet/youmi/android/a/b/c/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->l()Ljava/lang/String;

    move-result-object v4

    const-string v5, "0"

    invoke-static {v3, v4, v5}, Lnet/youmi/android/a/b/c/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v2, :cond_0

    const-string v4, "0"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v4

    if-eqz v4, :cond_1

    :cond_0
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    return v0

    :cond_1
    if-eqz v3, :cond_2

    :try_start_2
    const-string v4, "0"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v4

    if-eqz v4, :cond_3

    :cond_2
    :try_start_3
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :cond_3
    :try_start_4
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-static {v3}, Lnet/youmi/android/a/b/d/a;->b([B)[B

    move-result-object v3

    invoke-static {v2, v4, v3}, Lnet/youmi/android/a/b/d/h;->b(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result v0

    :goto_1
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v2

    goto :goto_1
.end method

.method private e()Z
    .locals 10

    const/4 v9, 0x2

    const/4 v1, 0x0

    const/4 v0, 0x1

    const-string v2, "f"

    monitor-enter v2

    :try_start_0
    iget v3, p0, Lnet/youmi/android/offers/d/b/e;->c:I

    if-nez v3, :cond_0

    iget-object v3, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->i()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->h()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0xc

    const/16 v8, 0x14

    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v4, v5, v6}, Lnet/youmi/android/offers/d/b/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "true"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v3, 0x2

    iput v3, p0, Lnet/youmi/android/offers/d/b/e;->c:I

    :cond_0
    :goto_0
    iget v3, p0, Lnet/youmi/android/offers/d/b/e;->c:I

    if-ne v0, v3, :cond_1

    const/4 v3, 0x0

    iput v3, p0, Lnet/youmi/android/offers/d/b/e;->d:I

    :cond_1
    iget v3, p0, Lnet/youmi/android/offers/d/b/e;->c:I

    if-ne v9, v3, :cond_2

    const/4 v3, 0x1

    iput v3, p0, Lnet/youmi/android/offers/d/b/e;->d:I

    :cond_2
    iget v3, p0, Lnet/youmi/android/offers/d/b/e;->c:I

    if-ne v3, v0, :cond_4

    :goto_1
    monitor-exit v2

    return v0

    :cond_3
    const/4 v3, 0x1

    iput v3, p0, Lnet/youmi/android/offers/d/b/e;->c:I

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_4
    move v0, v1

    goto :goto_1
.end method

.method private f()Z
    .locals 11

    const/4 v1, 0x0

    const/4 v10, 0x2

    const/4 v0, 0x1

    const-string v2, "f"

    monitor-enter v2

    :try_start_0
    iget v3, p0, Lnet/youmi/android/offers/d/b/e;->d:I

    if-nez v3, :cond_0

    iget-object v3, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->i()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->h()Ljava/lang/String;

    move-result-object v5

    const-string v6, "true"

    iget-object v7, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/16 v8, 0xc

    const/16 v9, 0x14

    invoke-virtual {v7, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v4, v5, v6, v7}, Lnet/youmi/android/offers/d/b/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v3, 0x1

    iput v3, p0, Lnet/youmi/android/offers/d/b/e;->d:I

    :cond_0
    :goto_0
    iget v3, p0, Lnet/youmi/android/offers/d/b/e;->d:I

    if-ne v0, v3, :cond_1

    const/4 v3, 0x2

    iput v3, p0, Lnet/youmi/android/offers/d/b/e;->c:I

    :cond_1
    iget v3, p0, Lnet/youmi/android/offers/d/b/e;->d:I

    if-ne v10, v3, :cond_2

    const/4 v3, 0x0

    iput v3, p0, Lnet/youmi/android/offers/d/b/e;->c:I

    :cond_2
    iget v3, p0, Lnet/youmi/android/offers/d/b/e;->d:I

    if-ne v3, v0, :cond_4

    :goto_1
    monitor-exit v2

    return v0

    :cond_3
    const/4 v3, 0x2

    iput v3, p0, Lnet/youmi/android/offers/d/b/e;->d:I

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_4
    move v0, v1

    goto :goto_1
.end method

.method private g()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "b"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private h()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/a/b/h/e;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "points"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private i()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lnet/youmi/android/a/b/k/n;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/offers/d/b/e;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-static {}, Lnet/youmi/android/offers/b/a;->k()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/offers/d/b/e;->f:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/offers/d/b/e;->f:Ljava/lang/String;

    return-object v0
.end method

.method private k()Ljava/lang/String;
    .locals 2

    sget-object v0, Lnet/youmi/android/offers/d/b/e;->g:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "p"

    const-string v1, "tpsss"

    invoke-direct {p0, v0, v1}, Lnet/youmi/android/offers/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/offers/d/b/e;->g:Ljava/lang/String;

    :cond_0
    sget-object v0, Lnet/youmi/android/offers/d/b/e;->g:Ljava/lang/String;

    return-object v0
.end method

.method private l()Ljava/lang/String;
    .locals 2

    sget-object v0, Lnet/youmi/android/offers/d/b/e;->h:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "s"

    const-string v1, "salt"

    invoke-direct {p0, v0, v1}, Lnet/youmi/android/offers/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/offers/d/b/e;->h:Ljava/lang/String;

    :cond_0
    sget-object v0, Lnet/youmi/android/offers/d/b/e;->h:Ljava/lang/String;

    return-object v0
.end method

.method private m()Ljava/lang/String;
    .locals 2

    sget-object v0, Lnet/youmi/android/offers/d/b/e;->i:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "t"

    const-string v1, "lput"

    invoke-direct {p0, v0, v1}, Lnet/youmi/android/offers/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/offers/d/b/e;->i:Ljava/lang/String;

    :cond_0
    sget-object v0, Lnet/youmi/android/offers/d/b/e;->i:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 2

    const/4 v0, 0x0

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lnet/youmi/android/offers/d/b/e;->d()I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    :goto_0
    :try_start_1
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public a(I)Z
    .locals 4

    const/4 v0, 0x0

    if-gtz p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/offers/d/b/e;->a()I

    move-result v1

    add-int/2addr v1, p1

    iget-object v2, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-direct {p0, v2, v1}, Lnet/youmi/android/offers/d/b/e;->a(Landroid/content/Context;I)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_2

    :try_start_1
    invoke-static {}, Lnet/youmi/android/a/a/j/a/b;->a()Lnet/youmi/android/a/a/j/a/b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lnet/youmi/android/a/a/j/a/b;->b(I)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_2
    if-eqz v0, :cond_0

    :try_start_2
    iget-object v1, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/offers/d/b/b;->a(Landroid/content/Context;)Lnet/youmi/android/offers/d/b/b;

    move-result-object v1

    invoke-virtual {v1}, Lnet/youmi/android/offers/d/b/b;->a()V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    if-eqz v0, :cond_0

    :try_start_3
    iget-object v1, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/offers/d/b/b;->a(Landroid/content/Context;)Lnet/youmi/android/offers/d/b/b;

    move-result-object v1

    invoke-virtual {v1}, Lnet/youmi/android/offers/d/b/b;->a()V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_0

    :catch_2
    move-exception v1

    goto :goto_0

    :catchall_0
    move-exception v1

    move-object v3, v1

    move v1, v0

    move-object v0, v3

    :goto_1
    if-eqz v1, :cond_3

    :try_start_4
    iget-object v1, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/offers/d/b/b;->a(Landroid/content/Context;)Lnet/youmi/android/offers/d/b/b;

    move-result-object v1

    invoke-virtual {v1}, Lnet/youmi/android/offers/d/b/b;->a()V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_3

    :cond_3
    :goto_2
    throw v0

    :catch_3
    move-exception v1

    goto :goto_2

    :catchall_1
    move-exception v1

    move-object v3, v1

    move v1, v0

    move-object v0, v3

    goto :goto_1
.end method

.method public b(I)Z
    .locals 4

    const/4 v0, 0x0

    if-gtz p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/offers/d/b/e;->a()I

    move-result v1

    sub-int v2, v1, p1

    if-ltz v2, :cond_0

    sub-int/2addr v1, p1

    iget-object v2, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-direct {p0, v2, v1}, Lnet/youmi/android/offers/d/b/e;->a(Landroid/content/Context;I)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_2

    :try_start_1
    invoke-static {}, Lnet/youmi/android/a/a/j/a/b;->a()Lnet/youmi/android/a/a/j/a/b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lnet/youmi/android/a/a/j/a/b;->b(I)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_2
    if-eqz v0, :cond_0

    :try_start_2
    iget-object v1, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/offers/d/b/b;->a(Landroid/content/Context;)Lnet/youmi/android/offers/d/b/b;

    move-result-object v1

    invoke-virtual {v1}, Lnet/youmi/android/offers/d/b/b;->a()V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    if-eqz v0, :cond_0

    :try_start_3
    iget-object v1, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/offers/d/b/b;->a(Landroid/content/Context;)Lnet/youmi/android/offers/d/b/b;

    move-result-object v1

    invoke-virtual {v1}, Lnet/youmi/android/offers/d/b/b;->a()V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_0

    :catch_2
    move-exception v1

    goto :goto_0

    :catchall_0
    move-exception v1

    move-object v3, v1

    move v1, v0

    move-object v0, v3

    :goto_1
    if-eqz v1, :cond_3

    :try_start_4
    iget-object v1, p0, Lnet/youmi/android/offers/d/b/e;->b:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/offers/d/b/b;->a(Landroid/content/Context;)Lnet/youmi/android/offers/d/b/b;

    move-result-object v1

    invoke-virtual {v1}, Lnet/youmi/android/offers/d/b/b;->a()V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_3

    :cond_3
    :goto_2
    throw v0

    :catch_3
    move-exception v1

    goto :goto_2

    :catchall_1
    move-exception v1

    move-object v3, v1

    move v1, v0

    move-object v0, v3

    goto :goto_1
.end method
