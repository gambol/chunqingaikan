.class public final Lnet/youmi/android/a/a/e/c/a/e;
.super Lnet/youmi/android/a/a/e/a/b/l;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/a/a/e/a/b/l;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Lnet/youmi/android/a/a/e/a/b/h;Lnet/youmi/android/a/a/e/a/b/f;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 21

    if-nez p1, :cond_0

    const/4 v4, 0x3

    :try_start_0
    invoke-static {v4}, Lnet/youmi/android/a/a/e/c/a/e;->a(I)Lorg/json/JSONObject;

    move-result-object v4

    :goto_0
    return-object v4

    :cond_0
    invoke-interface/range {p1 .. p1}, Lnet/youmi/android/a/a/e/a/b/h;->h()Landroid/content/Context;

    move-result-object v6

    if-nez v6, :cond_1

    const/4 v4, 0x3

    invoke-static {v4}, Lnet/youmi/android/a/a/e/c/a/e;->a(I)Lorg/json/JSONObject;

    move-result-object v4

    goto :goto_0

    :cond_1
    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const-string v4, "a"

    const/4 v5, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v4, v5}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v4

    if-eqz v4, :cond_2

    const-string v5, "a"

    const/4 v7, 0x0

    invoke-static {v4, v5, v7}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v5, "b"

    const-wide/16 v10, 0x0

    invoke-static {v4, v5, v10, v11}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v10

    const-string v5, "c"

    const/4 v7, 0x0

    invoke-static {v4, v5, v7}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    :cond_2
    const-string v4, "b"

    const/4 v5, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v4, v5}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;)Lorg/json/JSONArray;

    move-result-object v13

    if-nez v13, :cond_3

    const/4 v4, 0x2

    invoke-static {v4}, Lnet/youmi/android/a/a/e/c/a/e;->a(I)Lorg/json/JSONObject;

    move-result-object v4

    goto :goto_0

    :cond_3
    invoke-virtual {v13}, Lorg/json/JSONArray;->length()I

    move-result v14

    if-gtz v14, :cond_4

    const/4 v4, 0x2

    invoke-static {v4}, Lnet/youmi/android/a/a/e/c/a/e;->a(I)Lorg/json/JSONObject;

    move-result-object v4

    goto :goto_0

    :cond_4
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8, v14}, Ljava/util/ArrayList;-><init>(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v4, 0x0

    move v7, v4

    :goto_1
    if-ge v7, v14, :cond_a

    const/4 v4, 0x0

    :try_start_1
    invoke-static {v13, v7, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONArray;ILorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v15

    if-eqz v15, :cond_5

    const-string v4, "a"

    const/4 v5, 0x0

    invoke-static {v15, v4, v5}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    if-nez v16, :cond_6

    :cond_5
    :goto_2
    add-int/lit8 v4, v7, 0x1

    move v7, v4

    goto :goto_1

    :cond_6
    const-string v4, "b"

    const/4 v5, -0x1

    invoke-static {v15, v4, v5}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v17

    const-string v4, "c"

    const/4 v5, 0x0

    invoke-static {v15, v4, v5}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v4

    if-eqz v4, :cond_8

    const/4 v4, 0x1

    move v5, v4

    :goto_3
    const-string v4, "d"

    const/16 v18, -0x3e7

    move/from16 v0, v18

    invoke-static {v15, v4, v0}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v18

    const-string v4, "e"

    const/16 v19, 0x0

    move/from16 v0, v19

    invoke-static {v15, v4, v0}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v4

    if-eqz v4, :cond_9

    const/4 v4, 0x1

    :goto_4
    const-string v19, "f"

    const-string v20, ""

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-static {v15, v0, v1}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    new-instance v19, Lnet/youmi/android/a/a/a/a/a;

    const/16 v20, 0x1

    move-object/from16 v0, v19

    move/from16 v1, v18

    move/from16 v2, v20

    invoke-direct {v0, v1, v2}, Lnet/youmi/android/a/a/a/a/a;-><init>(II)V

    new-instance v18, Lnet/youmi/android/a/a/a/a/g;

    invoke-direct/range {v18 .. v18}, Lnet/youmi/android/a/a/a/a/g;-><init>()V

    move-object/from16 v0, v18

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/a/a/g;->b(Ljava/lang/String;)V

    move-object/from16 v0, v18

    invoke-virtual {v0, v15}, Lnet/youmi/android/a/a/a/a/g;->a(Ljava/lang/String;)V

    move-object/from16 v0, v19

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/a/a/a;->a(Lnet/youmi/android/a/a/a/a/g;)V

    if-lez v17, :cond_7

    new-instance v15, Lnet/youmi/android/a/a/a/a/d;

    invoke-direct {v15}, Lnet/youmi/android/a/a/a/a/d;-><init>()V

    move/from16 v0, v17

    invoke-virtual {v15, v0}, Lnet/youmi/android/a/a/a/a/d;->a(I)V

    move-object/from16 v0, v19

    invoke-virtual {v0, v15}, Lnet/youmi/android/a/a/a/a/a;->a(Lnet/youmi/android/a/a/a/a/d;)V

    :cond_7
    new-instance v15, Lnet/youmi/android/a/a/a/a/f;

    invoke-direct {v15}, Lnet/youmi/android/a/a/a/a/f;-><init>()V

    invoke-virtual {v15, v5}, Lnet/youmi/android/a/a/a/a/f;->a(Z)V

    invoke-virtual {v15, v4}, Lnet/youmi/android/a/a/a/a/f;->b(Z)V

    move-object/from16 v0, v19

    invoke-virtual {v0, v15}, Lnet/youmi/android/a/a/a/a/a;->a(Lnet/youmi/android/a/a/a/a/f;)V

    move-object/from16 v0, v19

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_2

    :catch_0
    move-exception v4

    goto/16 :goto_2

    :cond_8
    const/4 v4, 0x0

    move v5, v4

    goto :goto_3

    :cond_9
    const/4 v4, 0x0

    goto :goto_4

    :cond_a
    :try_start_2
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-gtz v4, :cond_b

    const/4 v4, 0x2

    invoke-static {v4}, Lnet/youmi/android/a/a/e/c/a/e;->a(I)Lorg/json/JSONObject;

    move-result-object v4

    goto/16 :goto_0

    :cond_b
    invoke-static {v6}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/a/a/a;

    move-result-object v7

    const/4 v4, 0x0

    move v5, v4

    :goto_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v5, v4, :cond_f

    new-instance v13, Lnet/youmi/android/a/a/g/a/b/a;

    invoke-direct {v13}, Lnet/youmi/android/a/a/g/a/b/a;-><init>()V

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnet/youmi/android/a/a/a/a/a;

    invoke-virtual {v4}, Lnet/youmi/android/a/a/a/a/a;->g()Lnet/youmi/android/a/a/a/a/g;

    move-result-object v4

    invoke-virtual {v4}, Lnet/youmi/android/a/a/a/a/g;->c()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnet/youmi/android/a/a/a/a/a;

    invoke-virtual {v4}, Lnet/youmi/android/a/a/a/a/a;->g()Lnet/youmi/android/a/a/a/a/g;

    move-result-object v4

    invoke-virtual {v4}, Lnet/youmi/android/a/a/a/a/g;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v13, v4}, Lnet/youmi/android/a/a/g/a/b/a;->b(Ljava/lang/String;)V

    invoke-virtual {v13, v14}, Lnet/youmi/android/a/a/g/a/b/a;->a(Ljava/lang/String;)V

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnet/youmi/android/a/a/a/a/a;

    invoke-virtual {v4}, Lnet/youmi/android/a/a/a/a/a;->e()Lnet/youmi/android/a/a/a/a/f;

    move-result-object v4

    invoke-virtual {v4}, Lnet/youmi/android/a/a/a/a/f;->a()Z

    move-result v4

    if-eqz v4, :cond_c

    const/4 v4, 0x1

    invoke-virtual {v13, v4}, Lnet/youmi/android/a/a/g/a/b/a;->b(I)V

    invoke-static {}, Lnet/youmi/android/a/a/g/a/f;->a()Lnet/youmi/android/a/a/g/a/f;

    move-result-object v4

    const/4 v15, 0x3

    const/16 v16, 0x1

    move/from16 v0, v16

    invoke-virtual {v4, v14, v15, v0}, Lnet/youmi/android/a/a/g/a/f;->a(Ljava/lang/String;II)V

    :cond_c
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnet/youmi/android/a/a/a/a/a;

    invoke-virtual {v4}, Lnet/youmi/android/a/a/a/a/a;->e()Lnet/youmi/android/a/a/a/a/f;

    move-result-object v4

    invoke-virtual {v4}, Lnet/youmi/android/a/a/a/a/f;->b()Z

    move-result v4

    if-eqz v4, :cond_d

    const/4 v4, 0x1

    invoke-virtual {v13, v4}, Lnet/youmi/android/a/a/g/a/b/a;->c(I)V

    invoke-static {}, Lnet/youmi/android/a/a/g/a/f;->a()Lnet/youmi/android/a/a/g/a/f;

    move-result-object v4

    const/16 v15, 0xd

    const/16 v16, 0x1

    move/from16 v0, v16

    invoke-virtual {v4, v14, v15, v0}, Lnet/youmi/android/a/a/g/a/f;->a(Ljava/lang/String;II)V

    :cond_d
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnet/youmi/android/a/a/a/a/a;

    invoke-virtual {v4}, Lnet/youmi/android/a/a/a/a/a;->a()I

    move-result v4

    invoke-virtual {v13, v4}, Lnet/youmi/android/a/a/g/a/b/a;->a(I)V

    invoke-virtual {v7, v14}, Lnet/youmi/android/a/a/g/a/a/a;->a(Ljava/lang/String;)Lnet/youmi/android/a/a/g/a/b/a;

    move-result-object v4

    if-nez v4, :cond_e

    invoke-virtual {v7, v13}, Lnet/youmi/android/a/a/g/a/a/a;->a(Lnet/youmi/android/a/a/g/a/b/a;)Z

    :goto_6
    add-int/lit8 v4, v5, 0x1

    move v5, v4

    goto/16 :goto_5

    :cond_e
    invoke-virtual {v7, v13}, Lnet/youmi/android/a/a/g/a/a/a;->b(Lnet/youmi/android/a/a/g/a/b/a;)Z

    goto :goto_6

    :catch_1
    move-exception v4

    const/4 v4, 0x0

    goto/16 :goto_0

    :cond_f
    new-instance v5, Lnet/youmi/android/a/a/e/f/g;

    move-object/from16 v7, p1

    invoke-direct/range {v5 .. v12}, Lnet/youmi/android/a/a/e/f/g;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/e/a/b/h;Ljava/util/ArrayList;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v5}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V

    const/4 v4, 0x0

    invoke-static {v4}, Lnet/youmi/android/a/a/e/c/a/e;->a(I)Lorg/json/JSONObject;
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v4

    goto/16 :goto_0
.end method
