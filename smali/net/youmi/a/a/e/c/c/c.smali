.class public final Lnet/youmi/android/a/a/e/c/c/c;
.super Lnet/youmi/android/a/a/e/a/b/l;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/a/a/e/a/b/l;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Lnet/youmi/android/a/a/e/a/b/h;Lnet/youmi/android/a/a/e/a/b/f;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const/4 v1, 0x3

    :try_start_0
    invoke-static {v1}, Lnet/youmi/android/a/a/e/c/c/c;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-interface {p1}, Lnet/youmi/android/a/a/e/a/b/h;->h()Landroid/content/Context;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v1, 0x3

    invoke-static {v1}, Lnet/youmi/android/a/a/e/c/c/c;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v2, "a"

    const/4 v3, 0x0

    invoke-static {p3, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    const/4 v1, 0x2

    invoke-static {v1}, Lnet/youmi/android/a/a/e/c/c/c;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-static {v1}, Lnet/youmi/android/a/a/e/b/d;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/e/b/d;

    move-result-object v1

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/b/d;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    invoke-static {v1}, Lnet/youmi/android/a/a/e/c/c/c;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0

    :cond_3
    const/4 v1, 0x3

    invoke-static {v1}, Lnet/youmi/android/a/a/e/c/c/c;->a(I)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method
