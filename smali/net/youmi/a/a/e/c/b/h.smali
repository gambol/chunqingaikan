.class public final Lnet/youmi/android/a/a/e/c/b/h;
.super Lnet/youmi/android/a/a/e/a/b/l;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/a/a/e/a/b/l;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Lnet/youmi/android/a/a/e/a/b/h;Lnet/youmi/android/a/a/e/a/b/f;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 23

    if-nez p1, :cond_0

    const/4 v2, 0x3

    :try_start_0
    invoke-static {v2}, Lnet/youmi/android/a/a/e/c/b/h;->a(I)Lorg/json/JSONObject;

    move-result-object v2

    :goto_0
    return-object v2

    :cond_0
    invoke-interface/range {p1 .. p1}, Lnet/youmi/android/a/a/e/a/b/h;->g()Landroid/app/Activity;

    move-result-object v2

    if-nez v2, :cond_1

    const/4 v2, 0x3

    invoke-static {v2}, Lnet/youmi/android/a/a/e/c/b/h;->a(I)Lorg/json/JSONObject;

    move-result-object v2

    goto :goto_0

    :cond_1
    invoke-static {v2}, Lnet/youmi/android/a/b/k/f;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/k/f;

    move-result-object v3

    invoke-virtual {v3}, Lnet/youmi/android/a/b/k/f;->b()I

    move-result v4

    invoke-static {v2}, Lnet/youmi/android/a/b/k/f;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/k/f;

    move-result-object v3

    invoke-virtual {v3}, Lnet/youmi/android/a/b/k/f;->c()I

    move-result v5

    invoke-static {v2}, Lnet/youmi/android/a/b/k/f;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/k/f;

    move-result-object v2

    invoke-virtual {v2}, Lnet/youmi/android/a/b/k/f;->f()F

    move-result v6

    const-string v2, "a"

    const/4 v3, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_2

    const/4 v2, 0x3

    invoke-static {v2}, Lnet/youmi/android/a/a/e/c/b/h;->a(I)Lorg/json/JSONObject;

    move-result-object v2

    goto :goto_0

    :cond_2
    const-string v2, "b"

    const/4 v3, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "a"

    const/4 v8, 0x0

    invoke-static {v2, v3, v8}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v3, "b"

    const/4 v9, 0x0

    invoke-static {v2, v3, v9}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v3, "c"

    const/4 v10, 0x0

    invoke-static {v2, v3, v10}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v3, "d"

    const/4 v11, 0x0

    invoke-static {v2, v3, v11}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v2, "c"

    const/4 v3, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v12

    const-string v2, "d"

    const/4 v3, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v13

    const-string v2, "a"

    const/16 v3, -0x270f

    invoke-static {v13, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v14

    const-string v2, "b"

    const/16 v3, -0x270f

    invoke-static {v13, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v15

    int-to-float v2, v4

    const/high16 v3, 0x42200000    # 40.0f

    mul-float/2addr v3, v6

    sub-float/2addr v2, v3

    float-to-int v3, v2

    int-to-float v2, v5

    const/high16 v16, 0x42200000    # 40.0f

    mul-float v16, v16, v6

    sub-float v2, v2, v16

    float-to-int v2, v2

    if-lez v14, :cond_3

    sub-int v3, v4, v14

    int-to-float v3, v3

    const/high16 v4, 0x41a00000    # 20.0f

    mul-float/2addr v4, v6

    sub-float/2addr v3, v4

    float-to-int v3, v3

    :cond_3
    if-lez v15, :cond_4

    sub-int v2, v5, v15

    int-to-float v2, v2

    const/high16 v4, 0x41a00000    # 20.0f

    mul-float/2addr v4, v6

    sub-float/2addr v2, v4

    float-to-int v2, v2

    :cond_4
    const-string v4, "c"

    invoke-static {v13, v4, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v5

    const-string v3, "d"

    invoke-static {v13, v3, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v6

    const-string v2, "e"

    const/4 v3, 0x0

    invoke-static {v13, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v16

    const-string v2, "f"

    const/4 v3, 0x1

    invoke-static {v13, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v2

    if-nez v2, :cond_9

    const/4 v2, 0x1

    move v4, v2

    :goto_1
    const-string v2, "g"

    const-wide/16 v18, 0x0

    move-wide/from16 v0, v18

    invoke-static {v13, v2, v0, v1}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;D)D

    move-result-wide v18

    const-string v2, "h"

    const-wide/16 v20, 0x0

    move-wide/from16 v0, v20

    invoke-static {v13, v2, v0, v1}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;D)D

    move-result-wide v20

    const-string v2, "e"

    const/4 v3, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v13

    if-eqz v8, :cond_5

    :try_start_1
    invoke-static {}, Lnet/youmi/android/a/a/e/e/a;->a()Lnet/youmi/android/a/a/e/e/a;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Lnet/youmi/android/a/a/e/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    if-eqz v9, :cond_6

    invoke-static {}, Lnet/youmi/android/a/a/e/e/b;->a()Lnet/youmi/android/a/a/e/e/b;

    move-result-object v2

    invoke-virtual {v2, v7, v9}, Lnet/youmi/android/a/a/e/e/b;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :cond_6
    :goto_2
    :try_start_2
    const-string v2, "f"

    const/4 v3, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v8

    const/4 v3, 0x0

    const/4 v2, 0x0

    const-string v9, "g"

    const/16 v17, 0x0

    move-object/from16 v0, p3

    move-object/from16 v1, v17

    invoke-static {v0, v9, v1}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v9

    if-eqz v9, :cond_7

    const-string v2, "a"

    const/4 v3, 0x0

    invoke-static {v9, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v3

    const-string v2, "b"

    const/16 v17, 0x0

    move-object/from16 v0, v17

    invoke-static {v9, v2, v0}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_7
    new-instance v9, Lnet/youmi/android/a/a/e/g/g;

    invoke-interface/range {p1 .. p1}, Lnet/youmi/android/a/a/e/a/b/h;->l()I

    move-result v17

    invoke-interface/range {p1 .. p1}, Lnet/youmi/android/a/a/e/a/b/h;->k()I

    move-result v22

    move/from16 v0, v17

    move/from16 v1, v22

    invoke-direct {v9, v0, v1}, Lnet/youmi/android/a/a/e/g/g;-><init>(II)V

    invoke-virtual {v9, v10}, Lnet/youmi/android/a/a/e/g/g;->b(Ljava/lang/String;)V

    invoke-virtual {v9, v11}, Lnet/youmi/android/a/a/e/g/g;->c(Ljava/lang/String;)V

    invoke-virtual {v9, v12}, Lnet/youmi/android/a/a/e/g/g;->b(I)V

    invoke-virtual {v9, v14}, Lnet/youmi/android/a/a/e/g/g;->d(I)V

    invoke-virtual {v9, v15}, Lnet/youmi/android/a/a/e/g/g;->e(I)V

    invoke-virtual {v9, v5}, Lnet/youmi/android/a/a/e/g/g;->f(I)V

    invoke-virtual {v9, v6}, Lnet/youmi/android/a/a/e/g/g;->g(I)V

    move-wide/from16 v0, v18

    invoke-virtual {v9, v0, v1}, Lnet/youmi/android/a/a/e/g/g;->a(D)V

    move-wide/from16 v0, v20

    invoke-virtual {v9, v0, v1}, Lnet/youmi/android/a/a/e/g/g;->b(D)V

    move/from16 v0, v16

    invoke-virtual {v9, v0}, Lnet/youmi/android/a/a/e/g/g;->a(I)V

    invoke-virtual {v9, v13}, Lnet/youmi/android/a/a/e/g/g;->d(Ljava/lang/String;)V

    invoke-virtual {v9, v4}, Lnet/youmi/android/a/a/e/g/g;->a(Z)V

    if-nez v8, :cond_a

    invoke-virtual {v9, v7}, Lnet/youmi/android/a/a/e/g/g;->e(Ljava/lang/String;)V

    :goto_3
    if-eqz v3, :cond_8

    new-instance v4, Lnet/youmi/android/a/a/j/a;

    invoke-direct {v4}, Lnet/youmi/android/a/a/j/a;-><init>()V

    iput-object v2, v4, Lnet/youmi/android/a/a/j/a;->a:Ljava/lang/String;

    iput v3, v4, Lnet/youmi/android/a/a/j/a;->b:I

    invoke-virtual {v9, v4}, Lnet/youmi/android/a/a/e/g/g;->a(Lnet/youmi/android/a/a/j/a;)V

    :cond_8
    sget-object v2, Lnet/youmi/android/a/a/e/c/b/i;->a:[I

    move-object/from16 v0, p1

    invoke-interface {v0, v9}, Lnet/youmi/android/a/a/e/a/b/h;->b(Lnet/youmi/android/a/a/e/g/g;)Lnet/youmi/android/a/a/e/a;

    move-result-object v3

    invoke-virtual {v3}, Lnet/youmi/android/a/a/e/a;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    const/4 v2, 0x3

    invoke-static {v2}, Lnet/youmi/android/a/a/e/c/b/h;->a(I)Lorg/json/JSONObject;

    move-result-object v2

    goto/16 :goto_0

    :cond_9
    const/4 v2, 0x0

    move v4, v2

    goto/16 :goto_1

    :cond_a
    invoke-virtual {v9, v7}, Lnet/youmi/android/a/a/e/g/g;->g(Ljava/lang/String;)V

    goto :goto_3

    :catch_0
    move-exception v2

    const/4 v2, 0x0

    goto/16 :goto_0

    :pswitch_0
    const/4 v2, 0x4

    invoke-static {v2}, Lnet/youmi/android/a/a/e/c/b/h;->a(I)Lorg/json/JSONObject;

    move-result-object v2

    goto/16 :goto_0

    :pswitch_1
    const/4 v2, 0x0

    invoke-static {v2}, Lnet/youmi/android/a/a/e/c/b/h;->a(I)Lorg/json/JSONObject;
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v2

    goto/16 :goto_0

    :catch_1
    move-exception v2

    goto/16 :goto_2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
