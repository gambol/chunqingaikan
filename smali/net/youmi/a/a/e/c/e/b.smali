.class public final Lnet/youmi/android/a/a/e/c/e/b;
.super Lnet/youmi/android/a/a/e/a/b/l;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/a/a/e/a/b/l;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Lnet/youmi/android/a/a/e/a/b/h;Lnet/youmi/android/a/a/e/a/b/f;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 25

    if-nez p1, :cond_0

    const/4 v2, 0x3

    :try_start_0
    invoke-static {v2}, Lnet/youmi/android/a/a/e/c/e/b;->a(I)Lorg/json/JSONObject;

    move-result-object v2

    :goto_0
    return-object v2

    :cond_0
    invoke-interface/range {p1 .. p1}, Lnet/youmi/android/a/a/e/a/b/h;->h()Landroid/content/Context;

    move-result-object v4

    if-nez v4, :cond_1

    const/4 v2, 0x3

    invoke-static {v2}, Lnet/youmi/android/a/a/e/c/e/b;->a(I)Lorg/json/JSONObject;

    move-result-object v2

    goto :goto_0

    :cond_1
    const-string v2, "a"

    const/4 v3, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_2

    const/4 v2, 0x2

    invoke-static {v2}, Lnet/youmi/android/a/a/e/c/e/b;->a(I)Lorg/json/JSONObject;

    move-result-object v2

    goto :goto_0

    :cond_2
    const-string v2, "b"

    const-wide/16 v8, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v8, v9}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v8

    const-string v2, "c"

    const/4 v3, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_3

    const/4 v2, 0x2

    invoke-static {v2}, Lnet/youmi/android/a/a/e/c/e/b;->a(I)Lorg/json/JSONObject;

    move-result-object v2

    goto :goto_0

    :cond_3
    const-string v2, "d"

    const/4 v3, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_4

    const/4 v2, 0x2

    invoke-static {v2}, Lnet/youmi/android/a/a/e/c/e/b;->a(I)Lorg/json/JSONObject;

    move-result-object v2

    goto :goto_0

    :cond_4
    const-string v2, "e"

    const-wide/16 v10, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v10, v11}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v2

    const-string v10, "f"

    const/4 v11, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v10, v11}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v10

    const-string v11, "g"

    const-string v12, "a_js"

    move-object/from16 v0, p3

    invoke-static {v0, v11, v12}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v11, "h"

    const/4 v12, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v11, v12}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v11

    const/4 v12, 0x1

    if-ne v11, v12, :cond_5

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lnet/youmi/android/a/b/b/e;->b()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-static {}, Lnet/youmi/android/a/a/e/g/e;->p()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    :cond_5
    const/4 v11, 0x1

    if-ne v10, v11, :cond_6

    const/4 v12, 0x1

    :goto_1
    const-wide/16 v10, 0x0

    cmp-long v10, v2, v10

    if-lez v10, :cond_7

    const-wide/16 v10, 0x3e8

    mul-long/2addr v10, v2

    new-instance v3, Lnet/youmi/android/a/a/e/f/d;

    invoke-interface/range {p1 .. p1}, Lnet/youmi/android/a/a/e/a/b/h;->k()I

    move-result v14

    invoke-direct/range {v3 .. v14}, Lnet/youmi/android/a/a/e/f/d;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;I)V

    :goto_2
    invoke-static {v3}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V

    const/4 v2, 0x0

    invoke-static {v2}, Lnet/youmi/android/a/a/e/c/e/b;->a(I)Lorg/json/JSONObject;

    move-result-object v2

    goto/16 :goto_0

    :cond_6
    const/4 v12, 0x0

    goto :goto_1

    :cond_7
    new-instance v15, Lnet/youmi/android/a/a/e/f/d;

    invoke-interface/range {p1 .. p1}, Lnet/youmi/android/a/a/e/a/b/h;->k()I

    move-result v24

    move-object/from16 v16, v4

    move-object/from16 v17, v5

    move-object/from16 v18, v6

    move-object/from16 v19, v7

    move-wide/from16 v20, v8

    move/from16 v22, v12

    move-object/from16 v23, v13

    invoke-direct/range {v15 .. v24}, Lnet/youmi/android/a/a/e/f/d;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v15

    goto :goto_2

    :catch_0
    move-exception v2

    const/4 v2, 0x0

    goto/16 :goto_0
.end method
