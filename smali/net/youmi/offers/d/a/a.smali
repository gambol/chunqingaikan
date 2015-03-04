.class public Lnet/youmi/android/offers/d/a/a;
.super Lnet/youmi/android/a/a/g/d/a;


# direct methods
.method public static b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->d(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "Error : appid or secret is empty !"

    invoke-static {v1}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v1, 0x200

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/16 v6, 0x3e8

    div-long/2addr v4, v6

    const/4 v1, 0x4

    invoke-static {v1}, Lnet/youmi/android/a/b/d/b;->a(I)Ljava/lang/String;

    move-result-object v3

    new-instance v6, Lnet/youmi/android/a/c/c/b;

    invoke-direct {v6, p0}, Lnet/youmi/android/a/c/c/b;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lnet/youmi/android/offers/b/b;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v7, "?s="

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "00000"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x3

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v7, Ljava/io/ByteArrayOutputStream;

    const/16 v1, 0x200

    invoke-direct {v7, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    const-string v1, "9"

    invoke-static {v1, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V

    const/16 v1, 0x26

    invoke-virtual {v7, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_a

    :goto_1
    const/16 v1, 0x26

    :try_start_2
    invoke-virtual {v7, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    :try_start_3
    invoke-virtual {v6}, Lnet/youmi/android/a/c/c/b;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0

    :goto_2
    const/16 v1, 0x26

    :try_start_4
    invoke-virtual {v7, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_1

    :try_start_5
    invoke-virtual {v6}, Lnet/youmi/android/a/c/c/b;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_2

    :goto_3
    const/16 v1, 0x26

    :try_start_6
    invoke-virtual {v7, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_1

    :try_start_7
    invoke-virtual {v6}, Lnet/youmi/android/a/c/c/b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_7
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_3

    :goto_4
    const/16 v1, 0x26

    :try_start_8
    invoke-virtual {v7, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_8
    .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_1

    :try_start_9
    invoke-virtual {v6}, Lnet/youmi/android/a/c/c/b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_9
    .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_4

    :goto_5
    const/16 v1, 0x26

    :try_start_a
    invoke-virtual {v7, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_a
    .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_1

    :try_start_b
    invoke-static {p0}, Lnet/youmi/android/a/b/h/e;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_b
    .catch Ljava/lang/Throwable; {:try_start_b .. :try_end_b} :catch_5

    :goto_6
    const/16 v1, 0x26

    :try_start_c
    invoke-virtual {v7, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_c
    .catch Ljava/lang/Throwable; {:try_start_c .. :try_end_c} :catch_1

    :try_start_d
    invoke-static {p0}, Lnet/youmi/android/a/b/h/e;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_d
    .catch Ljava/lang/Throwable; {:try_start_d .. :try_end_d} :catch_6

    :goto_7
    const/16 v1, 0x26

    :try_start_e
    invoke-virtual {v7, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_e
    .catch Ljava/lang/Throwable; {:try_start_e .. :try_end_e} :catch_1

    :try_start_f
    invoke-static {p0}, Lnet/youmi/android/offers/OffersManager;->getInstance(Landroid/content/Context;)Lnet/youmi/android/offers/OffersManager;

    move-result-object v1

    invoke-virtual {v1}, Lnet/youmi/android/offers/OffersManager;->getCustomUserId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_f
    .catch Ljava/lang/Throwable; {:try_start_f .. :try_end_f} :catch_7

    :goto_8
    const/16 v1, 0x26

    :try_start_10
    invoke-virtual {v7, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_10
    .catch Ljava/lang/Throwable; {:try_start_10 .. :try_end_10} :catch_1

    if-eqz p1, :cond_1

    :try_start_11
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_1

    invoke-static {v1, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_11
    .catch Ljava/lang/Throwable; {:try_start_11 .. :try_end_11} :catch_8

    :cond_1
    :goto_9
    :try_start_12
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ef45N92f053P36cd"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;
    :try_end_12
    .catch Ljava/lang/Throwable; {:try_start_12 .. :try_end_12} :catch_1

    move-result-object v1

    :try_start_13
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    const v4, 0xc5939

    invoke-static {v3, v1, v4}, Lnet/youmi/android/a/b/d/b;->a([BLjava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_13
    .catch Ljava/lang/Throwable; {:try_start_13 .. :try_end_13} :catch_9

    :goto_a
    :try_start_14
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :catch_0
    move-exception v1

    invoke-static {v1}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V
    :try_end_14
    .catch Ljava/lang/Throwable; {:try_start_14 .. :try_end_14} :catch_1

    goto/16 :goto_2

    :catch_1
    move-exception v1

    const-string v1, "warn: stat url is null"

    invoke-static {v1}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;)V

    goto/16 :goto_0

    :catch_2
    move-exception v1

    :try_start_15
    invoke-static {v1}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto/16 :goto_3

    :catch_3
    move-exception v1

    invoke-static {v1}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto/16 :goto_4

    :catch_4
    move-exception v1

    invoke-static {v1}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto/16 :goto_5

    :catch_5
    move-exception v1

    invoke-static {v1}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto/16 :goto_6

    :catch_6
    move-exception v1

    invoke-static {v1}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto/16 :goto_7

    :catch_7
    move-exception v1

    invoke-static {v1}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_8

    :catch_8
    move-exception v1

    invoke-static {v1}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_9

    :catch_9
    move-exception v1

    invoke-static {v1}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V
    :try_end_15
    .catch Ljava/lang/Throwable; {:try_start_15 .. :try_end_15} :catch_1

    goto :goto_a

    :catch_a
    move-exception v1

    goto/16 :goto_1
.end method
