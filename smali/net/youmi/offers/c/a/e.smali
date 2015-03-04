.class public final Lnet/youmi/android/offers/c/a/e;
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

    const/4 v2, 0x3

    :try_start_0
    invoke-static {v2}, Lnet/youmi/android/offers/c/a/e;->a(I)Lorg/json/JSONObject;

    move-result-object v2

    :goto_0
    return-object v2

    :cond_0
    invoke-interface/range {p1 .. p1}, Lnet/youmi/android/a/a/e/a/b/h;->h()Landroid/content/Context;

    move-result-object v4

    if-nez v4, :cond_1

    const/4 v2, 0x3

    invoke-static {v2}, Lnet/youmi/android/offers/c/a/e;->a(I)Lorg/json/JSONObject;

    move-result-object v2

    goto :goto_0

    :cond_1
    const-string v2, "a"

    const/4 v3, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lorg/json/JSONObject;->length()I

    move-result v3

    if-gtz v3, :cond_3

    :cond_2
    const/4 v2, 0x2

    invoke-static {v2}, Lnet/youmi/android/offers/c/a/e;->a(I)Lorg/json/JSONObject;

    move-result-object v2

    goto :goto_0

    :cond_3
    const-string v3, "a"

    const/4 v5, 0x0

    invoke-static {v2, v3, v5}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v3, "b"

    const-wide/16 v6, 0x0

    invoke-static {v2, v3, v6, v7}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v6

    const-string v3, "c"

    const/4 v5, 0x0

    invoke-static {v2, v3, v5}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v8}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-static {v5}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    :cond_4
    const/4 v2, 0x2

    invoke-static {v2}, Lnet/youmi/android/offers/c/a/e;->a(I)Lorg/json/JSONObject;

    move-result-object v2

    goto :goto_0

    :cond_5
    const-string v3, "d"

    const/4 v9, 0x0

    invoke-static {v2, v3, v9}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_7

    invoke-static {}, Lnet/youmi/android/a/a/e/g/e;->p()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-static {v4}, Lnet/youmi/android/offers/f/a;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v4, v2, v3}, Lnet/youmi/android/offers/f/a/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lnet/youmi/android/a/a/e/g/e;->f(Ljava/lang/String;)V

    :cond_6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lnet/youmi/android/a/b/b/e;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lnet/youmi/android/a/a/e/g/e;->p()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    :cond_7
    const-string v2, "b"

    const/4 v3, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lorg/json/JSONObject;->length()I

    move-result v3

    if-gtz v3, :cond_9

    :cond_8
    const/4 v2, 0x2

    invoke-static {v2}, Lnet/youmi/android/offers/c/a/e;->a(I)Lorg/json/JSONObject;

    move-result-object v2

    goto/16 :goto_0

    :cond_9
    const-string v3, "a"

    const/4 v9, 0x0

    invoke-static {v2, v3, v9}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v9

    const-string v3, "b"

    const/4 v10, 0x0

    invoke-static {v2, v3, v10}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v10

    const-string v3, "c"

    const/4 v11, 0x0

    invoke-static {v2, v3, v11}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v11

    const-string v3, "d"

    const/4 v12, -0x1

    invoke-static {v2, v3, v12}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v12

    const-string v3, "e"

    const/4 v13, -0x1

    invoke-static {v2, v3, v13}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v13

    const-string v3, "f"

    const/4 v14, -0x1

    invoke-static {v2, v3, v14}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v14

    new-instance v3, Lnet/youmi/android/offers/c/b/a;

    invoke-direct/range {v3 .. v14}, Lnet/youmi/android/offers/c/b/a;-><init>(Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;IIIIII)V

    invoke-static {v3}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V

    const/4 v2, 0x0

    invoke-static {v2}, Lnet/youmi/android/offers/c/a/e;->a(I)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    goto/16 :goto_0

    :catch_0
    move-exception v2

    const/4 v2, 0x0

    goto/16 :goto_0
.end method
