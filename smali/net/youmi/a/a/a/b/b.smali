.class public abstract Lnet/youmi/android/a/a/a/b/b;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract a()Lnet/youmi/android/a/a/a/b/c;
.end method

.method final a(Lorg/json/JSONObject;Lnet/youmi/android/a/a/a/b/c;)Lnet/youmi/android/a/a/a/b/c;
    .locals 2

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-object p2

    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/a/a/b/b;->a()Lnet/youmi/android/a/a/a/b/c;

    move-result-object v0

    invoke-interface {v0, p1}, Lnet/youmi/android/a/a/a/b/c;->a(Lorg/json/JSONObject;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-eqz v1, :cond_0

    move-object p2, v0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method
