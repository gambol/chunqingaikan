.class public final Lnet/youmi/android/a/a/e/c/b/j;
.super Lnet/youmi/android/a/a/e/a/b/l;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/a/a/e/a/b/l;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Lnet/youmi/android/a/a/e/a/b/h;Lnet/youmi/android/a/a/e/a/b/f;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 15

    if-nez p1, :cond_0

    const/4 v1, 0x3

    :try_start_0
    invoke-static {v1}, Lnet/youmi/android/a/a/e/c/b/j;->a(I)Lorg/json/JSONObject;

    move-result-object v1

    :goto_0
    return-object v1

    :cond_0
    const-string v1, "a"

    const/4 v2, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1

    const/4 v1, 0x2

    invoke-static {v1}, Lnet/youmi/android/a/a/e/c/b/j;->a(I)Lorg/json/JSONObject;

    move-result-object v1

    goto :goto_0

    :cond_1
    const-string v1, "b"

    const/4 v2, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "a"

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v2, "b"

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v2, "c"

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v2, "d"

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v1, "c"

    const/4 v2, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v9

    const-string v1, "d"

    const/4 v2, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v2

    const/4 v1, 0x0

    if-eqz v2, :cond_7

    const-string v3, "a"

    invoke-static {v2, v3, v1}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v1

    move v3, v1

    :goto_1
    const-string v1, "e"

    const-string v2, ""

    move-object/from16 v0, p3

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v1, "f"

    const/4 v2, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v1, "g"

    const/4 v2, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v12

    const/4 v2, 0x0

    const/4 v1, 0x0

    const-string v13, "h"

    const/4 v14, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v13, v14}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v13

    if-eqz v13, :cond_2

    const-string v1, "a"

    const/4 v2, 0x0

    invoke-static {v13, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v2

    const-string v1, "b"

    const/4 v14, 0x0

    invoke-static {v13, v1, v14}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    :cond_2
    if-eqz v5, :cond_3

    :try_start_1
    invoke-static {}, Lnet/youmi/android/a/a/e/e/a;->a()Lnet/youmi/android/a/a/e/e/a;

    move-result-object v13

    invoke-virtual {v13, v4, v5}, Lnet/youmi/android/a/a/e/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    if-eqz v6, :cond_4

    invoke-static {}, Lnet/youmi/android/a/a/e/e/b;->a()Lnet/youmi/android/a/a/e/e/b;

    move-result-object v5

    invoke-virtual {v5, v4, v6}, Lnet/youmi/android/a/a/e/e/b;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :cond_4
    :goto_2
    :try_start_2
    new-instance v5, Lnet/youmi/android/a/a/e/g/d;

    invoke-direct {v5}, Lnet/youmi/android/a/a/e/g/d;-><init>()V

    new-instance v6, Lnet/youmi/android/a/a/e/g/c;

    invoke-interface/range {p1 .. p1}, Lnet/youmi/android/a/a/e/a/b/h;->l()I

    move-result v13

    invoke-interface/range {p1 .. p1}, Lnet/youmi/android/a/a/e/a/b/h;->k()I

    move-result v14

    invoke-direct {v6, v13, v14}, Lnet/youmi/android/a/a/e/g/c;-><init>(II)V

    invoke-virtual {v6, v10}, Lnet/youmi/android/a/a/e/g/c;->a(Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Lnet/youmi/android/a/a/e/g/c;->b(Ljava/lang/String;)V

    invoke-virtual {v6, v8}, Lnet/youmi/android/a/a/e/g/c;->c(Ljava/lang/String;)V

    invoke-virtual {v6, v9}, Lnet/youmi/android/a/a/e/g/c;->b(I)V

    invoke-virtual {v6, v11}, Lnet/youmi/android/a/a/e/g/c;->d(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Lnet/youmi/android/a/a/e/g/c;->a(I)V

    if-eqz v2, :cond_5

    new-instance v3, Lnet/youmi/android/a/a/j/a;

    invoke-direct {v3}, Lnet/youmi/android/a/a/j/a;-><init>()V

    iput-object v1, v3, Lnet/youmi/android/a/a/j/a;->a:Ljava/lang/String;

    iput v2, v3, Lnet/youmi/android/a/a/j/a;->b:I

    invoke-virtual {v6, v3}, Lnet/youmi/android/a/a/e/g/c;->a(Lnet/youmi/android/a/a/j/a;)V

    :cond_5
    if-nez v12, :cond_6

    invoke-virtual {v6, v4}, Lnet/youmi/android/a/a/e/g/c;->e(Ljava/lang/String;)V

    :goto_3
    invoke-virtual {v5, v6}, Lnet/youmi/android/a/a/e/g/d;->a(Lnet/youmi/android/a/a/e/g/c;)Z

    sget-object v1, Lnet/youmi/android/a/a/e/c/b/k;->a:[I

    move-object/from16 v0, p1

    invoke-interface {v0, v5}, Lnet/youmi/android/a/a/e/a/b/h;->a(Lnet/youmi/android/a/a/e/g/d;)Lnet/youmi/android/a/a/e/a;

    move-result-object v2

    invoke-virtual {v2}, Lnet/youmi/android/a/a/e/a;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    const/4 v1, 0x3

    invoke-static {v1}, Lnet/youmi/android/a/a/e/c/b/j;->a(I)Lorg/json/JSONObject;

    move-result-object v1

    goto/16 :goto_0

    :cond_6
    invoke-virtual {v6, v4}, Lnet/youmi/android/a/a/e/g/c;->g(Ljava/lang/String;)V

    goto :goto_3

    :catch_0
    move-exception v1

    const/4 v1, 0x0

    goto/16 :goto_0

    :pswitch_0
    const/4 v1, 0x4

    invoke-static {v1}, Lnet/youmi/android/a/a/e/c/b/j;->a(I)Lorg/json/JSONObject;

    move-result-object v1

    goto/16 :goto_0

    :pswitch_1
    const/4 v1, 0x0

    invoke-static {v1}, Lnet/youmi/android/a/a/e/c/b/j;->a(I)Lorg/json/JSONObject;
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v1

    goto/16 :goto_0

    :catch_1
    move-exception v5

    goto :goto_2

    :cond_7
    move v3, v1

    goto/16 :goto_1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
