.class public final Lnet/youmi/android/a/a/e/c/b/l;
.super Lnet/youmi/android/a/a/e/a/b/l;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/a/a/e/a/b/l;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Lnet/youmi/android/a/a/e/a/b/h;Lnet/youmi/android/a/a/e/a/b/f;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 17

    if-nez p1, :cond_0

    const/4 v1, 0x3

    :try_start_0
    invoke-static {v1}, Lnet/youmi/android/a/a/e/c/b/l;->a(I)Lorg/json/JSONObject;

    move-result-object v1

    :goto_0
    return-object v1

    :cond_0
    invoke-interface/range {p1 .. p1}, Lnet/youmi/android/a/a/e/a/b/h;->g()Landroid/app/Activity;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v1, 0x3

    invoke-static {v1}, Lnet/youmi/android/a/a/e/c/b/l;->a(I)Lorg/json/JSONObject;

    move-result-object v1

    goto :goto_0

    :cond_1
    const-string v1, "a"

    const/4 v2, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;)Lorg/json/JSONArray;

    move-result-object v5

    if-nez v5, :cond_2

    const/4 v1, 0x2

    invoke-static {v1}, Lnet/youmi/android/a/a/e/c/b/l;->a(I)Lorg/json/JSONObject;

    move-result-object v1

    goto :goto_0

    :cond_2
    new-instance v6, Lnet/youmi/android/a/a/e/g/d;

    invoke-direct {v6}, Lnet/youmi/android/a/a/e/g/d;-><init>()V

    const-string v1, "b"

    const/4 v2, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v6, v1}, Lnet/youmi/android/a/a/e/g/d;->a(Ljava/lang/String;)V

    :cond_3
    const/4 v1, 0x0

    move v4, v1

    :goto_1
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v4, v1, :cond_b

    const/4 v1, 0x0

    invoke-static {v5, v4, v1}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONArray;ILorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v7

    if-nez v7, :cond_4

    :goto_2
    add-int/lit8 v1, v4, 0x1

    move v4, v1

    goto :goto_1

    :cond_4
    const-string v1, "a"

    const/4 v2, 0x0

    invoke-static {v7, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_5

    const/4 v1, 0x2

    invoke-static {v1}, Lnet/youmi/android/a/a/e/c/b/l;->a(I)Lorg/json/JSONObject;

    move-result-object v1

    goto :goto_0

    :cond_5
    const-string v1, "b"

    const/4 v2, 0x0

    invoke-static {v7, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "a"

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "b"

    const/4 v9, 0x0

    invoke-static {v1, v3, v9}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v3, "c"

    const/4 v10, 0x0

    invoke-static {v1, v3, v10}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v3, "d"

    const/4 v11, 0x0

    invoke-static {v1, v3, v11}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v1, "c"

    const/4 v3, 0x0

    invoke-static {v7, v1, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v12

    const-string v1, "d"

    const/4 v3, 0x0

    invoke-static {v7, v1, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v3

    const/4 v1, 0x0

    if-eqz v3, :cond_c

    const-string v13, "a"

    invoke-static {v3, v13, v1}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v1

    move v3, v1

    :goto_3
    const-string v1, "e"

    const-string v13, ""

    invoke-static {v7, v1, v13}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v1, "f"

    const/4 v14, 0x0

    invoke-static {v7, v1, v14}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-string v1, "g"

    const/4 v15, 0x0

    invoke-static {v7, v1, v15}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v15

    if-eqz v2, :cond_6

    :try_start_1
    invoke-static {}, Lnet/youmi/android/a/a/e/e/a;->a()Lnet/youmi/android/a/a/e/e/a;

    move-result-object v1

    invoke-virtual {v1, v8, v2}, Lnet/youmi/android/a/a/e/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    if-eqz v9, :cond_7

    invoke-static {}, Lnet/youmi/android/a/a/e/e/b;->a()Lnet/youmi/android/a/a/e/e/b;

    move-result-object v1

    invoke-virtual {v1, v8, v9}, Lnet/youmi/android/a/a/e/e/b;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :cond_7
    :goto_4
    const/4 v2, 0x0

    const/4 v1, 0x0

    :try_start_2
    const-string v9, "h"

    const/16 v16, 0x0

    move-object/from16 v0, v16

    invoke-static {v7, v9, v0}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v7

    if-eqz v7, :cond_8

    const-string v1, "a"

    const/4 v2, 0x0

    invoke-static {v7, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v2

    const-string v1, "b"

    const/4 v9, 0x0

    invoke-static {v7, v1, v9}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_8
    new-instance v7, Lnet/youmi/android/a/a/e/g/c;

    invoke-interface/range {p1 .. p1}, Lnet/youmi/android/a/a/e/a/b/h;->l()I

    move-result v9

    invoke-interface/range {p1 .. p1}, Lnet/youmi/android/a/a/e/a/b/h;->k()I

    move-result v16

    move/from16 v0, v16

    invoke-direct {v7, v9, v0}, Lnet/youmi/android/a/a/e/g/c;-><init>(II)V

    invoke-virtual {v7, v13}, Lnet/youmi/android/a/a/e/g/c;->a(Ljava/lang/String;)V

    invoke-virtual {v7, v14}, Lnet/youmi/android/a/a/e/g/c;->d(Ljava/lang/String;)V

    invoke-virtual {v7, v10}, Lnet/youmi/android/a/a/e/g/c;->b(Ljava/lang/String;)V

    invoke-virtual {v7, v11}, Lnet/youmi/android/a/a/e/g/c;->c(Ljava/lang/String;)V

    invoke-virtual {v7, v12}, Lnet/youmi/android/a/a/e/g/c;->b(I)V

    invoke-virtual {v7, v3}, Lnet/youmi/android/a/a/e/g/c;->a(I)V

    if-nez v15, :cond_a

    invoke-virtual {v7, v8}, Lnet/youmi/android/a/a/e/g/c;->e(Ljava/lang/String;)V

    :goto_5
    if-eqz v2, :cond_9

    new-instance v3, Lnet/youmi/android/a/a/j/a;

    invoke-direct {v3}, Lnet/youmi/android/a/a/j/a;-><init>()V

    iput-object v1, v3, Lnet/youmi/android/a/a/j/a;->a:Ljava/lang/String;

    iput v2, v3, Lnet/youmi/android/a/a/j/a;->b:I

    invoke-virtual {v7, v3}, Lnet/youmi/android/a/a/e/g/c;->a(Lnet/youmi/android/a/a/j/a;)V

    :cond_9
    invoke-virtual {v6, v7}, Lnet/youmi/android/a/a/e/g/d;->a(Lnet/youmi/android/a/a/e/g/c;)Z

    goto/16 :goto_2

    :catch_0
    move-exception v1

    const/4 v1, 0x0

    goto/16 :goto_0

    :cond_a
    invoke-virtual {v7, v8}, Lnet/youmi/android/a/a/e/g/c;->g(Ljava/lang/String;)V

    goto :goto_5

    :cond_b
    sget-object v1, Lnet/youmi/android/a/a/e/c/b/m;->a:[I

    move-object/from16 v0, p1

    invoke-interface {v0, v6}, Lnet/youmi/android/a/a/e/a/b/h;->a(Lnet/youmi/android/a/a/e/g/d;)Lnet/youmi/android/a/a/e/a;

    move-result-object v2

    invoke-virtual {v2}, Lnet/youmi/android/a/a/e/a;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    const/4 v1, 0x3

    invoke-static {v1}, Lnet/youmi/android/a/a/e/c/b/l;->a(I)Lorg/json/JSONObject;

    move-result-object v1

    goto/16 :goto_0

    :pswitch_0
    const/4 v1, 0x4

    invoke-static {v1}, Lnet/youmi/android/a/a/e/c/b/l;->a(I)Lorg/json/JSONObject;

    move-result-object v1

    goto/16 :goto_0

    :pswitch_1
    const/4 v1, 0x0

    invoke-static {v1}, Lnet/youmi/android/a/a/e/c/b/l;->a(I)Lorg/json/JSONObject;
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v1

    goto/16 :goto_0

    :catch_1
    move-exception v1

    goto/16 :goto_4

    :cond_c
    move v3, v1

    goto/16 :goto_3

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
