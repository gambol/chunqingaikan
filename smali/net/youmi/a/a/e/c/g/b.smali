.class public final Lnet/youmi/android/a/a/e/c/g/b;
.super Lnet/youmi/android/a/a/e/a/b/l;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/a/a/e/a/b/l;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Lnet/youmi/android/a/a/e/a/b/h;Lnet/youmi/android/a/a/e/a/b/f;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 8

    const/4 v6, 0x0

    :try_start_0
    const-string v0, "a"

    const/4 v1, 0x0

    invoke-static {p3, v0, v1}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v0, "b"

    const/4 v2, 0x0

    invoke-static {p3, v0, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "c"

    const/4 v3, 0x0

    invoke-static {p3, v0, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    if-nez v3, :cond_1

    :cond_0
    const/4 v0, 0x2

    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/g/b;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    const-string v0, "d"

    const-wide/16 v4, 0x0

    invoke-static {p3, v0, v4, v5}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v4

    sget-object v7, Lnet/youmi/android/a/a/e/c/g/c;->a:[I

    move-object v0, p1

    invoke-interface/range {v0 .. v5}, Lnet/youmi/android/a/a/e/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lnet/youmi/android/a/a/e/a;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/a;->ordinal()I

    move-result v0

    aget v0, v7, v0

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x3

    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/g/b;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0

    :pswitch_0
    const/4 v0, 0x4

    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/g/b;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0

    :pswitch_1
    const/4 v0, 0x0

    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/g/b;->a(I)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v0, v6

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
