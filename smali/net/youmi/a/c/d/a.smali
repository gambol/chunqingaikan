.class public Lnet/youmi/android/a/c/d/a;
.super Lnet/youmi/android/a/b/i/a/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/b/i/c;Lnet/youmi/android/a/b/i/b;Lnet/youmi/android/a/b/i/a;Lnet/youmi/android/a/b/i/a/b;)V
    .locals 3

    invoke-direct/range {p0 .. p5}, Lnet/youmi/android/a/b/i/a/a;-><init>(Landroid/content/Context;Lnet/youmi/android/a/b/i/c;Lnet/youmi/android/a/b/i/b;Lnet/youmi/android/a/b/i/a;Lnet/youmi/android/a/b/i/a/b;)V

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    const-string v1, "pcv"

    const-string v2, "2"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v0, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    const-string v1, "appid"

    invoke-static {p1}, Lnet/youmi/android/a/c/c/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
