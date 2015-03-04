.class public final Lnet/youmi/android/a/a/e/c/b/f;
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
    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/b/f;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lnet/youmi/android/a/a/e/c/b/g;->a:[I

    invoke-interface {p1}, Lnet/youmi/android/a/a/e/a/b/h;->i()Lnet/youmi/android/a/a/e/a;

    move-result-object v1

    invoke-virtual {v1}, Lnet/youmi/android/a/a/e/a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x3

    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/b/f;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0

    :pswitch_0
    const/4 v0, 0x4

    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/b/f;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0

    :pswitch_1
    const/4 v0, 0x0

    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/b/f;->a(I)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
