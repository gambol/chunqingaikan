.class public final Lnet/youmi/android/a/a/e/c/a/j;
.super Lnet/youmi/android/a/a/e/a/b/l;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/a/a/e/a/b/l;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Lnet/youmi/android/a/a/e/a/b/h;Lnet/youmi/android/a/a/e/a/b/f;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-nez p1, :cond_0

    const/4 v0, 0x3

    :try_start_0
    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/a/j;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-interface {p1}, Lnet/youmi/android/a/a/e/a/b/h;->h()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x3

    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/a/j;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v3, "a"

    const/4 v4, 0x0

    invoke-static {p3, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    const/4 v0, 0x2

    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/a/j;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0

    :cond_2
    const-string v4, "b"

    const/4 v5, 0x0

    invoke-static {p3, v4, v5}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v4

    invoke-static {v0, v3, v4}, Lnet/youmi/android/a/b/k/h;->b(Landroid/content/Context;Ljava/lang/String;I)Z

    move-result v3

    const/4 v0, 0x0

    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/a/j;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const-string v5, "a"

    if-eqz v3, :cond_3

    const/4 v2, 0x1

    :cond_3
    invoke-virtual {v4, v5, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v2, "d"

    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_0
.end method
