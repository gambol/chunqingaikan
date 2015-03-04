.class public Lnet/youmi/android/offers/f/b;
.super Ljava/lang/Object;


# direct methods
.method private static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const/16 v3, 0x1f4

    invoke-static {p0}, Lnet/youmi/android/offers/f/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "0"

    invoke-static {p0, v0, v1}, Lnet/youmi/android/offers/f/a/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuffer;

    const/16 v1, 0x200

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    const-string v1, "lvc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/d/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lnet/youmi/android/offers/b/b;->k()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1, v0, v3}, Lnet/youmi/android/a/a/g/d/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lnet/youmi/android/a/b/i/a/b;

    invoke-direct {v1}, Lnet/youmi/android/a/b/i/a/b;-><init>()V

    const-string v2, "wl"

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/b/i/a/b;->a(Ljava/lang/String;)V

    const-string v2, "a_w_oar"

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/b/i/a/b;->b(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Lnet/youmi/android/a/b/i/a/b;->a(I)V

    invoke-static {p0, v0, v1}, Lnet/youmi/android/a/c/d/c;->a(Landroid/content/Context;Ljava/lang/String;Lnet/youmi/android/a/b/i/a/b;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static declared-synchronized a(Landroid/content/Context;)V
    .locals 2

    const-class v1, Lnet/youmi/android/offers/f/b;

    monitor-enter v1

    :try_start_0
    new-instance v0, Lnet/youmi/android/offers/f/c;

    invoke-direct {v0, p0}, Lnet/youmi/android/offers/f/c;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method static synthetic a(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lnet/youmi/android/offers/f/b;->b(Landroid/content/Context;Ljava/lang/String;Z)V

    return-void
.end method

.method public static b(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Lnet/youmi/android/offers/f/d;

    invoke-direct {v0, p0}, Lnet/youmi/android/offers/f/d;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static b(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 5

    const/4 v4, 0x0

    invoke-static {}, Lnet/youmi/android/a/a/i/a/b/g;->a()Lnet/youmi/android/a/a/i/a/b/g;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b/g;->b()V

    :try_start_0
    invoke-static {p0, p1}, Lnet/youmi/android/offers/f/b;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, Lnet/youmi/android/a/a/i/a/b/g;->a()Lnet/youmi/android/a/a/i/a/b/g;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b/g;->c()V

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lnet/youmi/android/a/a/i/a/b/g;->a()Lnet/youmi/android/a/a/i/a/b/g;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b/g;->c()V

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lnet/youmi/android/a/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "c"

    const/4 v2, -0x1

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, Lnet/youmi/android/a/a/i/a/b/g;->a()Lnet/youmi/android/a/a/i/a/b/g;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b/g;->c()V

    goto :goto_0

    :cond_2
    const-string v1, "d"

    invoke-static {v0, v1, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_5

    if-nez p2, :cond_3

    invoke-static {}, Lnet/youmi/android/a/a/i/a/b/g;->a()Lnet/youmi/android/a/a/i/a/b/g;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b/g;->c()V

    goto :goto_0

    :cond_3
    invoke-static {p0}, Lnet/youmi/android/offers/f/b;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lnet/youmi/android/a/a/i/a/b/g;->a()Lnet/youmi/android/a/a/i/a/b/g;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b/g;->c()V

    goto :goto_0

    :cond_4
    :try_start_1
    invoke-static {p0}, Lnet/youmi/android/offers/f/a;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lnet/youmi/android/offers/f/a/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p0}, Lnet/youmi/android/offers/f/e;->a(Landroid/content/Context;)Lnet/youmi/android/offers/f/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lnet/youmi/android/offers/f/e;->a(Ljava/lang/String;)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :cond_5
    const-string v1, "svc"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v1

    const-string v2, "url"

    invoke-static {v0, v2, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "m5"

    invoke-static {v0, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :try_start_2
    invoke-static {p0}, Lnet/youmi/android/offers/f/e;->a(Landroid/content/Context;)Lnet/youmi/android/offers/f/e;

    move-result-object v3

    invoke-virtual {v3, v1}, Lnet/youmi/android/offers/f/e;->a(I)V

    invoke-static {p0}, Lnet/youmi/android/offers/f/e;->a(Landroid/content/Context;)Lnet/youmi/android/offers/f/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lnet/youmi/android/offers/f/e;->b(Ljava/lang/String;)V

    invoke-static {p0}, Lnet/youmi/android/offers/f/e;->a(Landroid/content/Context;)Lnet/youmi/android/offers/f/e;

    move-result-object v0

    invoke-virtual {v0, v2}, Lnet/youmi/android/offers/f/e;->a(Ljava/lang/String;)Z
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_0

    :catch_2
    move-exception v0

    goto/16 :goto_0
.end method

.method static synthetic c(Landroid/content/Context;)Z
    .locals 1

    invoke-static {p0}, Lnet/youmi/android/offers/f/b;->d(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method private static d(Landroid/content/Context;)Z
    .locals 3

    new-instance v1, Ljava/io/File;

    invoke-static {p0}, Lnet/youmi/android/offers/f/a;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method
