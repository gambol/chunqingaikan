.class public final Lnet/youmi/android/a/a/e/c/c/d;
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
    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/c/d;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-interface {p1}, Lnet/youmi/android/a/a/e/a/b/h;->h()Landroid/content/Context;

    move-result-object v3

    if-nez v3, :cond_1

    const/4 v0, 0x3

    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/c/d;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v0, "a"

    const/4 v1, 0x0

    invoke-static {p3, v0, v1}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;)Lorg/json/JSONArray;

    move-result-object v4

    if-nez v4, :cond_2

    const/4 v0, 0x2

    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/c/d;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-gtz v5, :cond_3

    const/4 v0, 0x2

    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/c/d;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0

    :cond_3
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    move v2, v0

    :goto_1
    if-ge v2, v5, :cond_7

    const/4 v0, 0x0

    invoke-static {v4, v2, v0}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONArray;ILorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_5

    :cond_4
    :goto_2
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    :cond_5
    const-string v1, "a"

    const/4 v7, 0x0

    invoke-static {v0, v1, v7}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_4

    const-string v1, "b"

    const/4 v8, 0x0

    invoke-static {v0, v1, v8}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_4

    const-string v0, "c"

    const-wide/16 v10, 0x0

    invoke-static {p3, v0, v10, v11}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v0

    const-wide/16 v10, 0x3e8

    mul-long/2addr v0, v10

    const-wide/16 v10, 0x0

    cmp-long v9, v0, v10

    if-gez v9, :cond_6

    const-wide/16 v0, -0x1

    :cond_6
    new-instance v9, Lnet/youmi/android/a/a/e/b/a;

    invoke-direct {v9, v7}, Lnet/youmi/android/a/a/e/b/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, Lnet/youmi/android/a/a/e/b/a;->a()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v9, v8}, Lnet/youmi/android/a/a/e/b/a;->b(Ljava/lang/String;)V

    invoke-virtual {v9, v0, v1}, Lnet/youmi/android/a/a/e/b/a;->a(J)V

    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0

    :cond_7
    invoke-static {v3}, Lnet/youmi/android/a/a/e/b/d;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/e/b/d;

    move-result-object v0

    invoke-virtual {v0, v6}, Lnet/youmi/android/a/a/e/b/d;->a(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 v0, 0x0

    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/c/d;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    goto/16 :goto_0

    :cond_8
    const/4 v0, 0x3

    invoke-static {v0}, Lnet/youmi/android/a/a/e/c/c/d;->a(I)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto/16 :goto_0
.end method
