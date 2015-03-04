.class public final Lnet/youmi/android/a/a/e/c/b/d;
.super Lnet/youmi/android/a/a/e/a/b/l;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/a/a/e/a/b/l;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Lnet/youmi/android/a/a/e/a/b/h;Lnet/youmi/android/a/a/e/a/b/f;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 20

    if-nez p1, :cond_0

    const/4 v2, 0x3

    :try_start_0
    invoke-static {v2}, Lnet/youmi/android/a/a/e/c/b/d;->a(I)Lorg/json/JSONObject;

    move-result-object v2

    :goto_0
    return-object v2

    :cond_0
    invoke-interface/range {p1 .. p1}, Lnet/youmi/android/a/a/e/a/b/h;->h()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lnet/youmi/android/a/b/k/f;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/k/f;

    move-result-object v2

    invoke-virtual {v2}, Lnet/youmi/android/a/b/k/f;->b()I

    move-result v4

    invoke-interface/range {p1 .. p1}, Lnet/youmi/android/a/a/e/a/b/h;->h()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lnet/youmi/android/a/b/k/f;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/k/f;

    move-result-object v2

    invoke-virtual {v2}, Lnet/youmi/android/a/b/k/f;->c()I

    move-result v5

    invoke-interface/range {p1 .. p1}, Lnet/youmi/android/a/a/e/a/b/h;->h()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lnet/youmi/android/a/b/k/f;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/k/f;

    move-result-object v2

    invoke-virtual {v2}, Lnet/youmi/android/a/b/k/f;->f()F

    move-result v6

    const-string v2, "a"

    const/4 v3, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_1

    const/4 v2, 0x3

    invoke-static {v2}, Lnet/youmi/android/a/a/e/c/b/d;->a(I)Lorg/json/JSONObject;

    move-result-object v2

    goto :goto_0

    :cond_1
    const-string v2, "b"

    const/4 v3, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "a"

    const/4 v8, 0x0

    invoke-static {v2, v3, v8}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v8, "b"

    const/4 v9, 0x0

    invoke-static {v2, v8, v9}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "c"

    const/4 v10, 0x0

    invoke-static {v2, v9, v10}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "d"

    const/4 v11, 0x0

    invoke-static {v2, v10, v11}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v2, "e"

    const/4 v11, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v11}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v11

    if-eqz v3, :cond_2

    :try_start_1
    invoke-static {}, Lnet/youmi/android/a/a/e/e/a;->a()Lnet/youmi/android/a/a/e/e/a;

    move-result-object v2

    invoke-virtual {v2, v7, v3}, Lnet/youmi/android/a/a/e/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    if-eqz v8, :cond_3

    invoke-static {}, Lnet/youmi/android/a/a/e/e/b;->a()Lnet/youmi/android/a/a/e/e/b;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Lnet/youmi/android/a/a/e/e/b;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :cond_3
    :goto_1
    :try_start_2
    const-string v2, "c"

    const/4 v3, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v8

    const-string v2, "d"

    const/4 v3, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v12

    const-string v2, "a"

    const/16 v3, -0x270f

    invoke-static {v12, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v13

    const-string v2, "b"

    const/16 v3, -0x270f

    invoke-static {v12, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v14

    int-to-float v2, v4

    const/high16 v3, 0x42200000    # 40.0f

    mul-float/2addr v3, v6

    sub-float/2addr v2, v3

    float-to-int v3, v2

    int-to-float v2, v5

    const/high16 v15, 0x42200000    # 40.0f

    mul-float/2addr v15, v6

    sub-float/2addr v2, v15

    float-to-int v2, v2

    if-lez v13, :cond_4

    sub-int v3, v4, v13

    int-to-float v3, v3

    const/high16 v4, 0x41a00000    # 20.0f

    mul-float/2addr v4, v6

    sub-float/2addr v3, v4

    float-to-int v3, v3

    :cond_4
    if-lez v14, :cond_5

    sub-int v2, v5, v14

    int-to-float v2, v2

    const/high16 v4, 0x41a00000    # 20.0f

    mul-float/2addr v4, v6

    sub-float/2addr v2, v4

    float-to-int v2, v2

    :cond_5
    const-string v4, "c"

    invoke-static {v12, v4, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v3

    const-string v4, "d"

    invoke-static {v12, v4, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v4

    const-string v2, "e"

    const/4 v5, 0x0

    invoke-static {v12, v2, v5}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v5

    const-string v2, "f"

    const/4 v6, 0x1

    invoke-static {v12, v2, v6}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v2

    if-nez v2, :cond_6

    const/4 v2, 0x1

    :goto_2
    const-string v6, "g"

    const-wide/16 v16, 0x0

    move-wide/from16 v0, v16

    invoke-static {v12, v6, v0, v1}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;D)D

    move-result-wide v16

    const-string v6, "h"

    const-wide/16 v18, 0x0

    move-wide/from16 v0, v18

    invoke-static {v12, v6, v0, v1}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;D)D

    move-result-wide v18

    new-instance v6, Lnet/youmi/android/a/a/e/g/g;

    invoke-interface/range {p1 .. p1}, Lnet/youmi/android/a/a/e/a/b/h;->l()I

    move-result v12

    invoke-interface/range {p1 .. p1}, Lnet/youmi/android/a/a/e/a/b/h;->k()I

    move-result v15

    invoke-direct {v6, v12, v15}, Lnet/youmi/android/a/a/e/g/g;-><init>(II)V

    invoke-virtual {v6, v9}, Lnet/youmi/android/a/a/e/g/g;->b(Ljava/lang/String;)V

    invoke-virtual {v6, v10}, Lnet/youmi/android/a/a/e/g/g;->c(Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Lnet/youmi/android/a/a/e/g/g;->e(Ljava/lang/String;)V

    invoke-virtual {v6, v8}, Lnet/youmi/android/a/a/e/g/g;->b(I)V

    invoke-virtual {v6, v13}, Lnet/youmi/android/a/a/e/g/g;->d(I)V

    invoke-virtual {v6, v14}, Lnet/youmi/android/a/a/e/g/g;->e(I)V

    invoke-virtual {v6, v3}, Lnet/youmi/android/a/a/e/g/g;->f(I)V

    invoke-virtual {v6, v4}, Lnet/youmi/android/a/a/e/g/g;->g(I)V

    move-wide/from16 v0, v16

    invoke-virtual {v6, v0, v1}, Lnet/youmi/android/a/a/e/g/g;->a(D)V

    move-wide/from16 v0, v18

    invoke-virtual {v6, v0, v1}, Lnet/youmi/android/a/a/e/g/g;->b(D)V

    invoke-virtual {v6, v5}, Lnet/youmi/android/a/a/e/g/g;->a(I)V

    invoke-virtual {v6, v11}, Lnet/youmi/android/a/a/e/g/g;->d(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Lnet/youmi/android/a/a/e/g/g;->a(Z)V

    sget-object v2, Lnet/youmi/android/a/a/e/c/b/e;->a:[I

    move-object/from16 v0, p1

    invoke-interface {v0, v6}, Lnet/youmi/android/a/a/e/a/b/h;->a(Lnet/youmi/android/a/a/e/g/g;)Lnet/youmi/android/a/a/e/a;

    move-result-object v3

    invoke-virtual {v3}, Lnet/youmi/android/a/a/e/a;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    const/4 v2, 0x3

    invoke-static {v2}, Lnet/youmi/android/a/a/e/c/b/d;->a(I)Lorg/json/JSONObject;

    move-result-object v2

    goto/16 :goto_0

    :cond_6
    const/4 v2, 0x0

    goto :goto_2

    :pswitch_0
    const/4 v2, 0x4

    invoke-static {v2}, Lnet/youmi/android/a/a/e/c/b/d;->a(I)Lorg/json/JSONObject;

    move-result-object v2

    goto/16 :goto_0

    :pswitch_1
    const/4 v2, 0x0

    invoke-static {v2}, Lnet/youmi/android/a/a/e/c/b/d;->a(I)Lorg/json/JSONObject;
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v2

    goto/16 :goto_0

    :catch_0
    move-exception v2

    const/4 v2, 0x0

    goto/16 :goto_0

    :catch_1
    move-exception v2

    goto/16 :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
