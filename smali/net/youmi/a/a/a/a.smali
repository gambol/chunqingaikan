.class public Lnet/youmi/android/a/a/a/a;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroid/content/Context;Lnet/youmi/android/a/a/e/a/b/h;Ljava/util/List;)V
    .locals 10

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    const/4 v1, 0x0

    if-eqz v4, :cond_0

    if-eqz p2, :cond_0

    :try_start_0
    invoke-interface {p2}, Ljava/util/List;->size()I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    if-eqz v1, :cond_1

    :try_start_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    invoke-interface {p1, v4, v1}, Lnet/youmi/android/a/a/e/a/b/h;->a(Landroid/content/Context;Ljava/util/List;)Lnet/youmi/android/a/a/e/a;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_6

    :cond_1
    :goto_0
    return-void

    :cond_2
    const/4 v0, 0x0

    move v2, v0

    :goto_1
    :try_start_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_9

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/a/a/a/a;
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v0, :cond_3

    :try_start_3
    invoke-virtual {v0}, Lnet/youmi/android/a/a/a/a/a;->g()Lnet/youmi/android/a/a/a/a/g;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v0}, Lnet/youmi/android/a/a/a/a/a;->g()Lnet/youmi/android/a/a/a/a/g;

    move-result-object v3

    invoke-virtual {v3}, Lnet/youmi/android/a/a/a/a/g;->c()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_4

    :cond_3
    :goto_2
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, Lnet/youmi/android/a/a/a/a/a;->e()Lnet/youmi/android/a/a/a/a/f;

    move-result-object v3

    if-nez v3, :cond_5

    new-instance v3, Lnet/youmi/android/a/a/a/a/f;

    invoke-direct {v3}, Lnet/youmi/android/a/a/a/a/f;-><init>()V

    invoke-virtual {v0, v3}, Lnet/youmi/android/a/a/a/a/a;->a(Lnet/youmi/android/a/a/a/a/f;)V

    :cond_5
    invoke-virtual {v0}, Lnet/youmi/android/a/a/a/a/a;->e()Lnet/youmi/android/a/a/a/a/f;

    move-result-object v3

    invoke-virtual {v0}, Lnet/youmi/android/a/a/a/a/a;->g()Lnet/youmi/android/a/a/a/a/g;

    move-result-object v5

    invoke-virtual {v5}, Lnet/youmi/android/a/a/a/a/g;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lnet/youmi/android/a/a/a/a/f;->a(Landroid/content/Context;Ljava/lang/String;)Z
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_5
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result v3

    if-eqz v3, :cond_3

    :goto_3
    :try_start_4
    invoke-virtual {v0}, Lnet/youmi/android/a/a/a/a/a;->e()Lnet/youmi/android/a/a/a/a/f;

    move-result-object v3

    invoke-virtual {v3}, Lnet/youmi/android/a/a/a/a/f;->e()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {v0}, Lnet/youmi/android/a/a/a/a/a;->e()Lnet/youmi/android/a/a/a/a/f;

    move-result-object v3

    invoke-virtual {v3}, Lnet/youmi/android/a/a/a/a/f;->a()Z

    move-result v3

    if-nez v3, :cond_8

    invoke-virtual {v0}, Lnet/youmi/android/a/a/a/a/a;->g()Lnet/youmi/android/a/a/a/a/g;

    move-result-object v3

    invoke-virtual {v3}, Lnet/youmi/android/a/a/a/a/g;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v4}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/a/a/a;

    move-result-object v5

    invoke-virtual {v5, v3}, Lnet/youmi/android/a/a/g/a/a/a;->a(Ljava/lang/String;)Lnet/youmi/android/a/a/g/a/b/a;

    move-result-object v6

    invoke-virtual {v6}, Lnet/youmi/android/a/a/g/a/b/a;->d()I

    move-result v6

    if-nez v6, :cond_8

    new-instance v6, Lnet/youmi/android/a/a/g/a/b/a;

    invoke-direct {v6}, Lnet/youmi/android/a/a/g/a/b/a;-><init>()V

    invoke-virtual {v6, v3}, Lnet/youmi/android/a/a/g/a/b/a;->a(Ljava/lang/String;)V

    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Lnet/youmi/android/a/a/g/a/b/a;->b(I)V

    invoke-static {}, Lnet/youmi/android/a/a/g/a/f;->a()Lnet/youmi/android/a/a/g/a/f;

    move-result-object v7

    const/4 v8, 0x3

    const/4 v9, 0x1

    invoke-virtual {v7, v3, v8, v9}, Lnet/youmi/android/a/a/g/a/f;->a(Ljava/lang/String;II)V

    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Lnet/youmi/android/a/a/g/a/b/a;->c(I)V

    invoke-static {}, Lnet/youmi/android/a/a/g/a/f;->a()Lnet/youmi/android/a/a/g/a/f;

    move-result-object v7

    const/16 v8, 0xd

    const/4 v9, 0x1

    invoke-virtual {v7, v3, v8, v9}, Lnet/youmi/android/a/a/g/a/f;->a(Ljava/lang/String;II)V

    invoke-virtual {v5, v6}, Lnet/youmi/android/a/a/g/a/a/a;->b(Lnet/youmi/android/a/a/g/a/b/a;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v5, v6}, Lnet/youmi/android/a/a/g/a/a/a;->a(Lnet/youmi/android/a/a/g/a/b/a;)Z

    :cond_6
    if-nez v1, :cond_7

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move-object v1, v3

    :cond_7
    invoke-virtual {v0}, Lnet/youmi/android/a/a/a/a/a;->g()Lnet/youmi/android/a/a/a/a/g;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/a/a/g;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_8
    move-object v0, v1

    move-object v1, v0

    goto/16 :goto_2

    :cond_9
    if-eqz v1, :cond_1

    :try_start_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    invoke-interface {p1, v4, v1}, Lnet/youmi/android/a/a/e/a/b/h;->a(Landroid/content/Context;Ljava/util/List;)Lnet/youmi/android/a/a/e/a;
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_0

    :catch_1
    move-exception v0

    if-eqz v1, :cond_1

    :try_start_6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    invoke-interface {p1, v4, v1}, Lnet/youmi/android/a/a/e/a/b/h;->a(Landroid/content/Context;Ljava/util/List;)Lnet/youmi/android/a/a/e/a;
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_2

    goto/16 :goto_0

    :catch_2
    move-exception v0

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    if-eqz v1, :cond_a

    :try_start_7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_a

    invoke-interface {p1, v4, v1}, Lnet/youmi/android/a/a/e/a/b/h;->a(Landroid/content/Context;Ljava/util/List;)Lnet/youmi/android/a/a/e/a;
    :try_end_7
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_3

    :cond_a
    :goto_4
    throw v0

    :catch_3
    move-exception v1

    goto :goto_4

    :catch_4
    move-exception v0

    goto/16 :goto_2

    :catch_5
    move-exception v3

    goto/16 :goto_3

    :catch_6
    move-exception v0

    goto/16 :goto_0
.end method
