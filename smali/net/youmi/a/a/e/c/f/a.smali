.class public final Lnet/youmi/android/a/a/e/c/f/a;
.super Lnet/youmi/android/a/a/e/a/b/l;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/a/a/e/a/b/l;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Lnet/youmi/android/a/a/e/a/b/h;Lnet/youmi/android/a/a/e/a/b/f;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    :try_start_0
    invoke-interface {p1}, Lnet/youmi/android/a/a/e/a/b/h;->h()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "a"

    const/4 v3, 0x0

    invoke-static {p3, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    const/4 v1, 0x2

    invoke-static {v1}, Lnet/youmi/android/a/a/e/c/f/a;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0

    :cond_2
    const-string v3, "b"

    const/4 v4, 0x1

    invoke-static {p3, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v3

    new-instance v4, Lnet/youmi/android/a/a/e/c/f/b;

    invoke-direct {v4, p0, v1, v2, v3}, Lnet/youmi/android/a/a/e/c/f/b;-><init>(Lnet/youmi/android/a/a/e/c/f/a;Landroid/content/Context;Ljava/lang/String;I)V

    invoke-interface {p2, v4}, Lnet/youmi/android/a/a/e/a/b/f;->a(Ljava/lang/Runnable;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-static {v1}, Lnet/youmi/android/a/a/e/c/f/a;->a(I)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method
