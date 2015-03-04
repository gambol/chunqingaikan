.class public final Lnet/youmi/android/a/a/e/c/e/e;
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

    if-nez p1, :cond_0

    const/4 v0, 0x3

    :try_start_0
    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/e/e;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "a"

    const/4 v2, 0x0

    invoke-static {p3, v0, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x2

    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/e/e;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v2, "b"

    const-string v3, ""

    invoke-static {p3, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "c"

    const/4 v4, 0x0

    invoke-static {p3, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "d"

    const/4 v5, 0x0

    invoke-static {p3, v4, v5}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lnet/youmi/android/a/a/e/g/b;

    invoke-direct {v5}, Lnet/youmi/android/a/a/e/g/b;-><init>()V

    invoke-virtual {v5, v0}, Lnet/youmi/android/a/a/e/g/b;->a(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Lnet/youmi/android/a/a/e/g/b;->d(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Lnet/youmi/android/a/a/e/g/b;->b(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Lnet/youmi/android/a/a/e/g/b;->c(Ljava/lang/String;)V

    invoke-virtual {v5}, Lnet/youmi/android/a/a/e/g/b;->e()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x2

    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/e/e;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-interface {p1, v5}, Lnet/youmi/android/a/a/e/a/b/h;->a(Lnet/youmi/android/a/a/e/g/b;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3

    const/4 v0, 0x3

    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/e/e;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/e/e;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v3, "d"

    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_0
.end method
