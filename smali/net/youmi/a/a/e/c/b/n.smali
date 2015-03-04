.class public final Lnet/youmi/android/a/a/e/c/b/n;
.super Lnet/youmi/android/a/a/e/a/b/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/a/a/e/a/b/k;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Lnet/youmi/android/a/a/e/a/b/h;Lnet/youmi/android/a/a/e/a/b/f;)Lorg/json/JSONObject;
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, 0x3

    :try_start_0
    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/b/n;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v0

    new-instance v1, Lnet/youmi/android/a/a/e/c/b/o;

    invoke-direct {v1, p0, p2}, Lnet/youmi/android/a/a/e/c/b/o;-><init>(Lnet/youmi/android/a/a/e/c/b/n;Lnet/youmi/android/a/a/e/a/b/f;)V

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/b/k/m;->a(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/b/n;->a(I)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method
