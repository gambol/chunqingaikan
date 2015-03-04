.class public final Lnet/youmi/android/a/a/e/c/b/r;
.super Lnet/youmi/android/a/a/e/a/b/l;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/a/a/e/a/b/l;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Lnet/youmi/android/a/a/e/a/b/h;Lnet/youmi/android/a/a/e/a/b/f;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 12

    if-nez p1, :cond_0

    const/4 v0, 0x3

    :try_start_0
    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/b/r;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "a"

    const/4 v1, 0x0

    invoke-static {p3, v0, v1}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    const/4 v0, 0x2

    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/b/r;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v0, "b"

    const/4 v1, 0x0

    invoke-static {p3, v0, v1}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "a"

    const/4 v3, 0x0

    invoke-static {v0, v1, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v1, "b"

    const/4 v4, 0x0

    invoke-static {v0, v1, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v1, "c"

    const/4 v5, 0x0

    invoke-static {v0, v1, v5}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v1, "d"

    const/4 v6, 0x0

    invoke-static {v0, v1, v6}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v0, "c"

    const/4 v1, 0x0

    invoke-static {p3, v0, v1}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v0, "d"

    const/4 v1, 0x0

    invoke-static {p3, v0, v1}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v8

    const-string v0, "e"

    const/4 v1, 0x0

    invoke-static {p3, v0, v1}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v9

    const/4 v1, 0x0

    const/4 v0, 0x0

    const-string v10, "f"

    const/4 v11, 0x0

    invoke-static {p3, v10, v11}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v10

    if-eqz v10, :cond_2

    const-string v0, "a"

    const/4 v1, 0x0

    invoke-static {v10, v0, v1}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v1

    const-string v0, "b"

    const/4 v11, 0x0

    invoke-static {v10, v0, v11}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :cond_2
    if-eqz v3, :cond_3

    :try_start_1
    invoke-static {}, Lnet/youmi/android/a/a/e/e/a;->a()Lnet/youmi/android/a/a/e/e/a;

    move-result-object v10

    invoke-virtual {v10, v2, v3}, Lnet/youmi/android/a/a/e/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    if-eqz v4, :cond_4

    invoke-static {}, Lnet/youmi/android/a/a/e/e/b;->a()Lnet/youmi/android/a/a/e/e/b;

    move-result-object v3

    invoke-virtual {v3, v2, v4}, Lnet/youmi/android/a/a/e/e/b;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :cond_4
    :goto_1
    :try_start_2
    new-instance v3, Lnet/youmi/android/a/a/e/g/c;

    invoke-interface {p1}, Lnet/youmi/android/a/a/e/a/b/h;->l()I

    move-result v4

    invoke-interface {p1}, Lnet/youmi/android/a/a/e/a/b/h;->k()I

    move-result v10

    invoke-direct {v3, v4, v10}, Lnet/youmi/android/a/a/e/g/c;-><init>(II)V

    if-nez v9, :cond_7

    invoke-virtual {v3, v2}, Lnet/youmi/android/a/a/e/g/c;->e(Ljava/lang/String;)V

    :goto_2
    if-eqz v1, :cond_5

    new-instance v2, Lnet/youmi/android/a/a/j/a;

    invoke-direct {v2}, Lnet/youmi/android/a/a/j/a;-><init>()V

    iput-object v0, v2, Lnet/youmi/android/a/a/j/a;->a:Ljava/lang/String;

    iput v1, v2, Lnet/youmi/android/a/a/j/a;->b:I

    const/4 v0, 0x0

    iput-boolean v0, v2, Lnet/youmi/android/a/a/j/a;->f:Z

    invoke-virtual {v3, v2}, Lnet/youmi/android/a/a/e/g/c;->a(Lnet/youmi/android/a/a/j/a;)V

    :cond_5
    invoke-virtual {v3, v5}, Lnet/youmi/android/a/a/e/g/c;->b(Ljava/lang/String;)V

    invoke-virtual {v3, v6}, Lnet/youmi/android/a/a/e/g/c;->c(Ljava/lang/String;)V

    invoke-virtual {v3, v7}, Lnet/youmi/android/a/a/e/g/c;->d(Ljava/lang/String;)V

    if-eqz v8, :cond_6

    invoke-virtual {v3, v8}, Lnet/youmi/android/a/a/e/g/c;->b(I)V

    :cond_6
    sget-object v0, Lnet/youmi/android/a/a/e/c/b/s;->a:[I

    invoke-interface {p1, v3}, Lnet/youmi/android/a/a/e/a/b/h;->a(Lnet/youmi/android/a/a/e/g/c;)Lnet/youmi/android/a/a/e/a;

    move-result-object v1

    invoke-virtual {v1}, Lnet/youmi/android/a/a/e/a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x3

    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/b/r;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    goto/16 :goto_0

    :cond_7
    invoke-virtual {v3, v2}, Lnet/youmi/android/a/a/e/g/c;->g(Ljava/lang/String;)V

    goto :goto_2

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto/16 :goto_0

    :pswitch_0
    const/4 v0, 0x4

    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/b/r;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    goto/16 :goto_0

    :pswitch_1
    const/4 v0, 0x0

    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/b/r;->a(I)Lorg/json/JSONObject;
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v0

    goto/16 :goto_0

    :catch_1
    move-exception v3

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
