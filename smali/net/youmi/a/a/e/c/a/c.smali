.class public final Lnet/youmi/android/a/a/e/c/a/c;
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

    const/4 v2, 0x0

    :goto_0
    return-object v2

    :cond_0
    :try_start_0
    invoke-interface/range {p1 .. p1}, Lnet/youmi/android/a/a/e/a/b/h;->h()Landroid/content/Context;

    move-result-object v4

    if-nez v4, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    const-string v2, "b"

    const/4 v3, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;)Lorg/json/JSONArray;

    move-result-object v3

    if-nez v3, :cond_2

    const/4 v2, 0x2

    invoke-static {v2}, Lnet/youmi/android/a/a/e/c/a/c;->a(I)Lorg/json/JSONObject;

    move-result-object v2

    goto :goto_0

    :cond_2
    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const-string v2, "a"

    const/4 v5, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v5}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_3

    const-string v5, "a"

    const/4 v6, 0x0

    invoke-static {v2, v5, v6}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v5, "b"

    const-wide/16 v8, 0x0

    invoke-static {v2, v5, v8, v9}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v8

    const-string v5, "c"

    const/4 v6, 0x0

    invoke-static {v2, v5, v6}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    :cond_3
    if-eqz v7, :cond_4

    if-nez v10, :cond_4

    const/4 v2, 0x2

    invoke-static {v2}, Lnet/youmi/android/a/a/e/c/a/c;->a(I)Lorg/json/JSONObject;

    move-result-object v2

    goto :goto_0

    :cond_4
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    :goto_1
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-ge v2, v5, :cond_5

    invoke-virtual {v3, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    const-string v11, "a"

    const-string v12, ""

    invoke-static {v5, v11, v12}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "b"

    const-string v13, ""

    invoke-static {v5, v12, v13}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "c"

    const-string v14, ""

    invoke-static {v5, v13, v14}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v13, Ljava/util/HashMap;

    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    const-string v14, "packageName"

    invoke-virtual {v13, v14, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v11, "md5sum"

    invoke-virtual {v13, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v11, "apkUrl"

    invoke-virtual {v13, v11, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v6, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-gtz v2, :cond_6

    const/4 v2, 0x3

    invoke-static {v2}, Lnet/youmi/android/a/a/e/c/a/c;->a(I)Lorg/json/JSONObject;

    move-result-object v2

    goto/16 :goto_0

    :cond_6
    new-instance v3, Lnet/youmi/android/a/a/e/f/e;

    move-object/from16 v5, p1

    invoke-direct/range {v3 .. v10}, Lnet/youmi/android/a/a/e/f/e;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/e/a/b/h;Ljava/util/ArrayList;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v3}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V

    const/4 v2, 0x0

    invoke-static {v2}, Lnet/youmi/android/a/a/e/c/a/c;->a(I)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    goto/16 :goto_0

    :catch_0
    move-exception v2

    const/4 v2, 0x0

    goto/16 :goto_0
.end method
