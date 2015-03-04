.class public abstract Lnet/youmi/android/a/a/e/a/b/l;
.super Lnet/youmi/android/a/a/e/a/b/j;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/a/a/e/a/b/j;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lnet/youmi/android/a/a/e/a/b/h;Lnet/youmi/android/a/a/e/a/b/f;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    if-nez p3, :cond_0

    const/4 v0, 0x2

    :try_start_0
    invoke-static {v0}, Lnet/youmi/android/a/a/e/a/b/l;->b(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {p3}, Lnet/youmi/android/a/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x2

    invoke-static {v0}, Lnet/youmi/android/a/a/e/a/b/l;->b(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v1, "a"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_2

    const/4 v0, 0x2

    invoke-static {v0}, Lnet/youmi/android/a/a/e/a/b/l;->b(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1, p2, v0}, Lnet/youmi/android/a/a/e/a/b/l;->a(Lnet/youmi/android/a/a/e/a/b/h;Lnet/youmi/android/a/a/e/a/b/f;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/a/e/a/b/l;->a(Lorg/json/JSONObject;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x3

    invoke-static {v0}, Lnet/youmi/android/a/a/e/a/b/j;->b(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method protected abstract a(Lnet/youmi/android/a/a/e/a/b/h;Lnet/youmi/android/a/a/e/a/b/f;Lorg/json/JSONObject;)Lorg/json/JSONObject;
.end method
