.class public Lnet/youmi/android/a/c/d/c;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0, v0}, Lnet/youmi/android/a/c/d/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Lnet/youmi/android/a/b/i/a/b;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z[Lorg/apache/http/Header;Lnet/youmi/android/a/b/i/a/b;)Ljava/lang/String;
    .locals 7

    const/4 v2, 0x1

    const/4 v6, 0x0

    const/4 v0, 0x0

    if-nez p1, :cond_1

    if-eqz p3, :cond_0

    const-string v0, "Request error , url is null"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;)V

    :cond_0
    move-object v0, v6

    :goto_0
    return-object v0

    :cond_1
    if-eqz p3, :cond_2

    const-string v1, "Request url : %s"

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v0

    invoke-static {v1, v2}, Lnet/youmi/android/a/c/b/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    if-nez p2, :cond_3

    const-string v1, "UTF-8"

    :cond_3
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    if-eqz p4, :cond_4

    array-length v2, p4

    if-lez v2, :cond_4

    :goto_1
    array-length v2, p4

    if-ge v0, v2, :cond_4

    aget-object v2, p4, v0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    if-nez p5, :cond_9

    new-instance v5, Lnet/youmi/android/a/b/i/a/b;

    invoke-direct {v5}, Lnet/youmi/android/a/b/i/a/b;-><init>()V

    invoke-static {}, Lnet/youmi/android/a/c/b;->a()I

    move-result v0

    invoke-virtual {v5, v0}, Lnet/youmi/android/a/b/i/a/b;->a(I)V

    :goto_2
    new-instance v2, Lnet/youmi/android/a/b/i/c;

    invoke-direct {v2}, Lnet/youmi/android/a/b/i/c;-><init>()V

    invoke-virtual {v2, p1}, Lnet/youmi/android/a/b/i/c;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lnet/youmi/android/a/b/i/c;->a(Z)V

    invoke-virtual {v2, v1}, Lnet/youmi/android/a/b/i/c;->b(Ljava/util/List;)V

    const-string v0, "get"

    invoke-virtual {v2, v0}, Lnet/youmi/android/a/b/i/c;->b(Ljava/lang/String;)V

    new-instance v4, Lnet/youmi/android/a/c/d/b;

    invoke-direct {v4, p0, v2}, Lnet/youmi/android/a/c/d/b;-><init>(Landroid/content/Context;Lnet/youmi/android/a/b/i/c;)V

    new-instance v3, Lnet/youmi/android/a/b/i/b;

    invoke-direct {v3}, Lnet/youmi/android/a/b/i/b;-><init>()V

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lnet/youmi/android/a/b/i/b;->a(Z)V

    invoke-virtual {v4, v3}, Lnet/youmi/android/a/c/d/b;->a(Lnet/youmi/android/a/b/i/b;)V

    invoke-virtual {v4}, Lnet/youmi/android/a/c/d/b;->b()V

    invoke-virtual {v4}, Lnet/youmi/android/a/c/d/b;->e()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    if-nez v0, :cond_8

    :try_start_1
    invoke-virtual {v2}, Lnet/youmi/android/a/b/i/c;->f()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    const-string v0, "-1"

    :cond_5
    if-eqz v0, :cond_6

    const-string v1, "127."

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v2}, Lnet/youmi/android/a/b/i/c;->j()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v4, v2}, Lnet/youmi/android/a/c/d/b;->a(Lnet/youmi/android/a/b/i/c;)V

    invoke-virtual {v4}, Lnet/youmi/android/a/c/d/b;->b()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :cond_6
    :goto_3
    :try_start_2
    invoke-virtual {v4}, Lnet/youmi/android/a/c/d/b;->e()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_7

    new-instance v0, Lnet/youmi/android/a/c/d/a;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lnet/youmi/android/a/c/d/a;-><init>(Landroid/content/Context;Lnet/youmi/android/a/b/i/c;Lnet/youmi/android/a/b/i/b;Lnet/youmi/android/a/b/i/a;Lnet/youmi/android/a/b/i/a/b;)V

    invoke-static {v0}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V

    move-object v0, v6

    goto/16 :goto_0

    :cond_7
    invoke-virtual {v4}, Lnet/youmi/android/a/c/d/b;->e()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_8
    invoke-virtual {v4}, Lnet/youmi/android/a/c/d/b;->e()Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    move-object v0, v6

    goto/16 :goto_0

    :catch_1
    move-exception v0

    goto :goto_3

    :cond_9
    move-object v5, p5

    goto :goto_2
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Lnet/youmi/android/a/b/i/a/b;)Ljava/lang/String;
    .locals 8

    const/4 v7, 0x0

    if-eqz p2, :cond_0

    const/4 v3, 0x0

    :try_start_0
    const-string v4, "UTF-8"

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v6, p3

    invoke-static/range {v0 .. v6}, Lnet/youmi/android/a/c/d/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;[BLjava/lang/String;[Lorg/apache/http/Header;Lnet/youmi/android/a/b/i/a/b;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const-string v2, "UTF-8"

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Lnet/youmi/android/a/c/d/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z[Lorg/apache/http/Header;Lnet/youmi/android/a/b/i/a/b;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v0, v7

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Z[Lorg/apache/http/Header;Lnet/youmi/android/a/b/i/a/b;)Ljava/lang/String;
    .locals 8

    const/4 v7, 0x0

    if-eqz p2, :cond_0

    const/4 v3, 0x0

    :try_start_0
    const-string v4, "UTF-8"

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p4

    move-object v6, p5

    invoke-static/range {v0 .. v6}, Lnet/youmi/android/a/c/d/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;[BLjava/lang/String;[Lorg/apache/http/Header;Lnet/youmi/android/a/b/i/a/b;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const-string v2, "UTF-8"

    move-object v0, p0

    move-object v1, p1

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lnet/youmi/android/a/c/d/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z[Lorg/apache/http/Header;Lnet/youmi/android/a/b/i/a/b;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v0, v7

    goto :goto_0
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;[BLjava/lang/String;[Lorg/apache/http/Header;Lnet/youmi/android/a/b/i/a/b;)Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    const/4 v6, 0x0

    if-nez p1, :cond_0

    move-object v0, v6

    :goto_0
    return-object v0

    :cond_0
    if-nez p4, :cond_1

    const-string v1, "UTF-8"

    :cond_1
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    if-eqz p5, :cond_2

    array-length v2, p5

    if-lez v2, :cond_2

    :goto_1
    array-length v2, p5

    if-ge v0, v2, :cond_2

    aget-object v2, p5, v0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    if-nez p6, :cond_4

    new-instance v5, Lnet/youmi/android/a/b/i/a/b;

    invoke-direct {v5}, Lnet/youmi/android/a/b/i/a/b;-><init>()V

    invoke-static {}, Lnet/youmi/android/a/c/b;->a()I

    move-result v0

    invoke-virtual {v5, v0}, Lnet/youmi/android/a/b/i/a/b;->a(I)V

    :goto_2
    new-instance v2, Lnet/youmi/android/a/b/i/c;

    invoke-direct {v2}, Lnet/youmi/android/a/b/i/c;-><init>()V

    invoke-virtual {v2, p1}, Lnet/youmi/android/a/b/i/c;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lnet/youmi/android/a/b/i/c;->a(Z)V

    invoke-virtual {v2, p2}, Lnet/youmi/android/a/b/i/c;->a(Ljava/util/List;)V

    invoke-virtual {v2, p3}, Lnet/youmi/android/a/b/i/c;->a([B)V

    invoke-virtual {v2, v1}, Lnet/youmi/android/a/b/i/c;->b(Ljava/util/List;)V

    const-string v0, "post"

    invoke-virtual {v2, v0}, Lnet/youmi/android/a/b/i/c;->b(Ljava/lang/String;)V

    new-instance v4, Lnet/youmi/android/a/c/d/b;

    invoke-direct {v4, p0, v2}, Lnet/youmi/android/a/c/d/b;-><init>(Landroid/content/Context;Lnet/youmi/android/a/b/i/c;)V

    new-instance v3, Lnet/youmi/android/a/b/i/b;

    invoke-direct {v3}, Lnet/youmi/android/a/b/i/b;-><init>()V

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lnet/youmi/android/a/b/i/b;->a(Z)V

    invoke-virtual {v4, v3}, Lnet/youmi/android/a/c/d/b;->a(Lnet/youmi/android/a/b/i/b;)V

    invoke-virtual {v4}, Lnet/youmi/android/a/c/d/b;->b()V

    invoke-virtual {v4}, Lnet/youmi/android/a/c/d/b;->e()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    if-nez v0, :cond_3

    :try_start_1
    new-instance v0, Lnet/youmi/android/a/c/d/a;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lnet/youmi/android/a/c/d/a;-><init>(Landroid/content/Context;Lnet/youmi/android/a/b/i/c;Lnet/youmi/android/a/b/i/b;Lnet/youmi/android/a/b/i/a;Lnet/youmi/android/a/b/i/a/b;)V

    invoke-static {v0}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    move-object v0, v6

    goto :goto_0

    :cond_3
    :try_start_2
    invoke-virtual {v4}, Lnet/youmi/android/a/c/d/b;->e()Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    :goto_3
    move-object v0, v6

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_3

    :cond_4
    move-object v5, p6

    goto :goto_2
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Lnet/youmi/android/a/b/i/a/b;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0, p2}, Lnet/youmi/android/a/c/d/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Lnet/youmi/android/a/b/i/a/b;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 6

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move-object v4, v2

    move-object v5, v2

    invoke-static/range {v0 .. v5}, Lnet/youmi/android/a/c/d/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Z[Lorg/apache/http/Header;Lnet/youmi/android/a/b/i/a/b;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;[B[Lorg/apache/http/Header;Lnet/youmi/android/a/b/i/a/b;)Ljava/lang/String;
    .locals 8

    const/4 v7, 0x0

    if-eqz p2, :cond_0

    const/4 v2, 0x0

    :try_start_0
    const-string v4, "UTF-8"

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v5, p3

    move-object v6, p4

    invoke-static/range {v0 .. v6}, Lnet/youmi/android/a/c/d/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;[BLjava/lang/String;[Lorg/apache/http/Header;Lnet/youmi/android/a/b/i/a/b;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const-string v2, "UTF-8"

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lnet/youmi/android/a/c/d/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z[Lorg/apache/http/Header;Lnet/youmi/android/a/b/i/a/b;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v0, v7

    goto :goto_0
.end method
