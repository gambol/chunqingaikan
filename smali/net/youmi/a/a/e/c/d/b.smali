.class public final Lnet/youmi/android/a/a/e/c/d/b;
.super Lnet/youmi/android/a/a/e/a/b/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/a/a/e/a/b/k;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Lnet/youmi/android/a/a/e/a/b/h;Lnet/youmi/android/a/a/e/a/b/f;)Lorg/json/JSONObject;
    .locals 8

    if-nez p1, :cond_0

    const/4 v0, 0x3

    :try_start_0
    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/d/b;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-interface {p1}, Lnet/youmi/android/a/a/e/a/b/h;->h()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x3

    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/d/b;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lnet/youmi/android/a/b/k/d;->a()J

    move-result-wide v2

    invoke-static {}, Lnet/youmi/android/a/b/k/d;->b()J

    move-result-wide v4

    const/4 v0, 0x0

    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/d/b;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    if-eqz v1, :cond_2

    const-string v7, "a"

    invoke-virtual {v6, v7, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_2
    const-string v1, "b"

    invoke-virtual {v6, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "c"

    invoke-virtual {v6, v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "d"

    invoke-virtual {v0, v1, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method
