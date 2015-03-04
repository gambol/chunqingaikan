.class public Lnet/youmi/android/a/a/g/d/a;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 10

    const/4 v0, 0x3

    const/4 v2, 0x0

    const/4 v1, 0x0

    if-nez p0, :cond_0

    move-object v0, v1

    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->d(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_1

    move-object v0, v1

    goto :goto_0

    :cond_1
    new-instance v4, Lnet/youmi/android/a/c/c/b;

    invoke-direct {v4, p0}, Lnet/youmi/android/a/c/c/b;-><init>(Landroid/content/Context;)V

    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    const-string v3, ""

    if-eqz v5, :cond_2

    const-string v6, ""

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v6

    if-nez v6, :cond_2

    :try_start_1
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-virtual {v5, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const/4 v7, 0x1

    invoke-virtual {v5, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lnet/youmi/android/a/b/d/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_17

    move-result-object v3

    :goto_1
    :try_start_2
    invoke-static {}, Lnet/youmi/android/a/a/c;->b()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_3

    move-object v0, v1

    goto :goto_0

    :cond_2
    move-object v0, v1

    goto :goto_0

    :cond_3
    const/4 v6, 0x4

    invoke-static {v6}, Lnet/youmi/android/a/b/d/b;->a(I)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuffer;

    const/16 v8, 0x200

    invoke-direct {v7, v8}, Ljava/lang/StringBuffer;-><init>(I)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v5, "?s="

    invoke-virtual {v7, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v5, "00000"

    invoke-virtual {v7, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/4 v5, 0x3

    invoke-virtual {v7, v5}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    new-instance v5, Ljava/io/ByteArrayOutputStream;

    const/16 v3, 0x200

    invoke-direct {v5, v3}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    const-string v3, "22"

    invoke-static {v3, v5}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V

    const/16 v3, 0x26

    invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    invoke-static {p0}, Lnet/youmi/android/a/b/h/e;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_16

    :goto_2
    const/16 v3, 0x26

    :try_start_4
    invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0

    :try_start_5
    invoke-static {p0}, Lnet/youmi/android/a/b/h/e;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_15

    :goto_3
    const/16 v3, 0x26

    :try_start_6
    invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_0

    :try_start_7
    invoke-virtual {v4}, Lnet/youmi/android/a/c/c/b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_7
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_14

    :goto_4
    const/16 v3, 0x26

    :try_start_8
    invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_8
    .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_0

    :try_start_9
    invoke-virtual {v4}, Lnet/youmi/android/a/c/c/b;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_9
    .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_13

    :goto_5
    const/16 v3, 0x26

    :try_start_a
    invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_a
    .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_0

    :try_start_b
    invoke-static {}, Lnet/youmi/android/a/b/h/e;->d()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_b
    .catch Ljava/lang/Throwable; {:try_start_b .. :try_end_b} :catch_12

    :goto_6
    const/16 v3, 0x26

    :try_start_c
    invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_c
    .catch Ljava/lang/Throwable; {:try_start_c .. :try_end_c} :catch_0

    :try_start_d
    invoke-static {}, Lnet/youmi/android/a/b/h/e;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_d
    .catch Ljava/lang/Throwable; {:try_start_d .. :try_end_d} :catch_11

    :goto_7
    const/16 v3, 0x26

    :try_start_e
    invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_e
    .catch Ljava/lang/Throwable; {:try_start_e .. :try_end_e} :catch_0

    :try_start_f
    invoke-virtual {v4}, Lnet/youmi/android/a/c/c/b;->d()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_f
    .catch Ljava/lang/Throwable; {:try_start_f .. :try_end_f} :catch_10

    :goto_8
    const/16 v3, 0x26

    :try_start_10
    invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_10
    .catch Ljava/lang/Throwable; {:try_start_10 .. :try_end_10} :catch_0

    :try_start_11
    invoke-static {}, Lnet/youmi/android/a/b/h/e;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_11
    .catch Ljava/lang/Throwable; {:try_start_11 .. :try_end_11} :catch_f

    :goto_9
    const/16 v3, 0x26

    :try_start_12
    invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_12
    .catch Ljava/lang/Throwable; {:try_start_12 .. :try_end_12} :catch_0

    :try_start_13
    invoke-virtual {v4}, Lnet/youmi/android/a/c/c/b;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_13
    .catch Ljava/lang/Throwable; {:try_start_13 .. :try_end_13} :catch_e

    :goto_a
    const/16 v3, 0x26

    :try_start_14
    invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    const/16 v3, 0x26

    invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_14
    .catch Ljava/lang/Throwable; {:try_start_14 .. :try_end_14} :catch_0

    :try_start_15
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_15
    .catch Ljava/lang/Throwable; {:try_start_15 .. :try_end_15} :catch_d

    :goto_b
    const/16 v3, 0x26

    :try_start_16
    invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_16
    .catch Ljava/lang/Throwable; {:try_start_16 .. :try_end_16} :catch_0

    :try_start_17
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_17
    .catch Ljava/lang/Throwable; {:try_start_17 .. :try_end_17} :catch_c

    :goto_c
    const/16 v3, 0x26

    :try_start_18
    invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_18
    .catch Ljava/lang/Throwable; {:try_start_18 .. :try_end_18} :catch_0

    :try_start_19
    invoke-static {p0}, Lnet/youmi/android/a/b/k/f;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/k/f;

    move-result-object v3

    invoke-virtual {v3}, Lnet/youmi/android/a/b/k/f;->b()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_19
    .catch Ljava/lang/Throwable; {:try_start_19 .. :try_end_19} :catch_b

    :goto_d
    const/16 v3, 0x26

    :try_start_1a
    invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_1a
    .catch Ljava/lang/Throwable; {:try_start_1a .. :try_end_1a} :catch_0

    :try_start_1b
    invoke-static {p0}, Lnet/youmi/android/a/b/k/f;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/k/f;

    move-result-object v3

    invoke-virtual {v3}, Lnet/youmi/android/a/b/k/f;->c()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_1b
    .catch Ljava/lang/Throwable; {:try_start_1b .. :try_end_1b} :catch_a

    :goto_e
    const/16 v3, 0x26

    :try_start_1c
    invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_1c
    .catch Ljava/lang/Throwable; {:try_start_1c .. :try_end_1c} :catch_0

    :try_start_1d
    invoke-static {p0}, Lnet/youmi/android/a/b/k/f;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/k/f;

    move-result-object v3

    invoke-virtual {v3}, Lnet/youmi/android/a/b/k/f;->d()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_1d
    .catch Ljava/lang/Throwable; {:try_start_1d .. :try_end_1d} :catch_9

    :goto_f
    const/16 v3, 0x26

    :try_start_1e
    invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_1e
    .catch Ljava/lang/Throwable; {:try_start_1e .. :try_end_1e} :catch_0

    :try_start_1f
    invoke-static {p0}, Lnet/youmi/android/a/b/k/n;->a(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_7

    const-string v3, "1"

    :goto_10
    invoke-static {v3, v5}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_1f
    .catch Ljava/lang/Throwable; {:try_start_1f .. :try_end_1f} :catch_8

    :goto_11
    const/16 v3, 0x26

    :try_start_20
    invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_20
    .catch Ljava/lang/Throwable; {:try_start_20 .. :try_end_20} :catch_0

    :try_start_21
    invoke-static {p0}, Lnet/youmi/android/a/b/k/l;->a(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_8

    :goto_12
    if-eqz v1, :cond_4

    or-int/lit8 v0, v0, 0x4

    :cond_4
    invoke-static {p0}, Lnet/youmi/android/a/b/i/k;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "wifi"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    or-int/lit8 v0, v0, 0x8

    :cond_5
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v5}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_21
    .catch Ljava/lang/Throwable; {:try_start_21 .. :try_end_21} :catch_7

    :goto_13
    const/16 v0, 0x26

    :try_start_22
    invoke-virtual {v5, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_22
    .catch Ljava/lang/Throwable; {:try_start_22 .. :try_end_22} :catch_0

    :try_start_23
    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {v0, v5}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_23
    .catch Ljava/lang/Throwable; {:try_start_23 .. :try_end_23} :catch_6

    :cond_6
    :goto_14
    const/16 v0, 0x26

    :try_start_24
    invoke-virtual {v5, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_24
    .catch Ljava/lang/Throwable; {:try_start_24 .. :try_end_24} :catch_0

    :try_start_25
    sget-object v0, Landroid/os/Build;->BOARD:Ljava/lang/String;

    invoke-static {v0, v5}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_25
    .catch Ljava/lang/Throwable; {:try_start_25 .. :try_end_25} :catch_5

    :goto_15
    const/16 v0, 0x26

    :try_start_26
    invoke-virtual {v5, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_26
    .catch Ljava/lang/Throwable; {:try_start_26 .. :try_end_26} :catch_0

    :try_start_27
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-static {v0, v5}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_27
    .catch Ljava/lang/Throwable; {:try_start_27 .. :try_end_27} :catch_4

    :goto_16
    const/16 v0, 0x26

    :try_start_28
    invoke-virtual {v5, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_28
    .catch Ljava/lang/Throwable; {:try_start_28 .. :try_end_28} :catch_0

    :try_start_29
    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-static {v0, v5}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_29
    .catch Ljava/lang/Throwable; {:try_start_29 .. :try_end_29} :catch_3

    :goto_17
    const/16 v0, 0x26

    :try_start_2a
    invoke-virtual {v5, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_2a
    .catch Ljava/lang/Throwable; {:try_start_2a .. :try_end_2a} :catch_0

    :try_start_2b
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v8, 0x3e8

    div-long/2addr v2, v8

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v5}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_2b
    .catch Ljava/lang/Throwable; {:try_start_2b .. :try_end_2b} :catch_2

    :goto_18
    :try_start_2c
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ef45N92f053P36cd"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;
    :try_end_2c
    .catch Ljava/lang/Throwable; {:try_start_2c .. :try_end_2c} :catch_0

    move-result-object v0

    :try_start_2d
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    const v3, 0xc5939

    invoke-static {v2, v0, v3}, Lnet/youmi/android/a/b/d/b;->a([BLjava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_2d
    .catch Ljava/lang/Throwable; {:try_start_2d .. :try_end_2d} :catch_1

    :goto_19
    :try_start_2e
    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
    :try_end_2e
    .catch Ljava/lang/Throwable; {:try_start_2e .. :try_end_2e} :catch_0

    move-result-object v0

    goto/16 :goto_0

    :cond_7
    :try_start_2f
    const-string v3, "0"
    :try_end_2f
    .catch Ljava/lang/Throwable; {:try_start_2f .. :try_end_2f} :catch_8

    goto/16 :goto_10

    :catch_0
    move-exception v0

    move-object v0, v1

    goto/16 :goto_0

    :catch_1
    move-exception v0

    goto :goto_19

    :catch_2
    move-exception v0

    goto :goto_18

    :catch_3
    move-exception v0

    goto :goto_17

    :catch_4
    move-exception v0

    goto :goto_16

    :catch_5
    move-exception v0

    goto :goto_15

    :catch_6
    move-exception v0

    goto :goto_14

    :catch_7
    move-exception v0

    goto/16 :goto_13

    :catch_8
    move-exception v3

    goto/16 :goto_11

    :catch_9
    move-exception v3

    goto/16 :goto_f

    :catch_a
    move-exception v3

    goto/16 :goto_e

    :catch_b
    move-exception v3

    goto/16 :goto_d

    :catch_c
    move-exception v3

    goto/16 :goto_c

    :catch_d
    move-exception v3

    goto/16 :goto_b

    :catch_e
    move-exception v3

    goto/16 :goto_a

    :catch_f
    move-exception v3

    goto/16 :goto_9

    :catch_10
    move-exception v3

    goto/16 :goto_8

    :catch_11
    move-exception v3

    goto/16 :goto_7

    :catch_12
    move-exception v3

    goto/16 :goto_6

    :catch_13
    move-exception v3

    goto/16 :goto_5

    :catch_14
    move-exception v3

    goto/16 :goto_4

    :catch_15
    move-exception v3

    goto/16 :goto_3

    :catch_16
    move-exception v3

    goto/16 :goto_2

    :catch_17
    move-exception v5

    goto/16 :goto_1

    :cond_8
    move v0, v2

    goto/16 :goto_12
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    :try_start_0
    new-instance v1, Lnet/youmi/android/a/b/i/c;

    invoke-direct {v1}, Lnet/youmi/android/a/b/i/c;-><init>()V

    invoke-virtual {v1, p1}, Lnet/youmi/android/a/b/i/c;->a(Ljava/lang/String;)V

    new-instance v2, Lnet/youmi/android/a/c/d/b;

    invoke-direct {v2, p0, v1}, Lnet/youmi/android/a/c/d/b;-><init>(Landroid/content/Context;Lnet/youmi/android/a/b/i/c;)V

    invoke-virtual {v2}, Lnet/youmi/android/a/c/d/b;->b()V

    invoke-virtual {v2}, Lnet/youmi/android/a/c/d/b;->e()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, p3, v0}, Lnet/youmi/android/a/a/g/d/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    .locals 10

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-static {p4}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p4, "00000"

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v0, 0x200

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    const/4 v0, 0x4

    invoke-static {v0}, Lnet/youmi/android/a/b/d/b;->a(I)Ljava/lang/String;

    move-result-object v4

    new-instance v0, Lnet/youmi/android/a/c/c/b;

    invoke-direct {v0, p0}, Lnet/youmi/android/a/c/c/b;-><init>(Landroid/content/Context;)V

    invoke-static {p0}, Lnet/youmi/android/a/b/k/f;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/k/f;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "?s="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v7, 0x3

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v7, Ljava/io/ByteArrayOutputStream;

    const/16 v8, 0x200

    invoke-direct {v7, v8}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    const-string v8, "33"

    invoke-static {v8, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V

    const/16 v8, 0x26

    invoke-virtual {v7, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {v0}, Lnet/youmi/android/a/c/c/b;->d()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_22

    :goto_1
    const/16 v8, 0x26

    :try_start_2
    invoke-virtual {v7, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    invoke-virtual {v0}, Lnet/youmi/android/a/c/c/b;->c()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_21

    :goto_2
    const/16 v8, 0x26

    :try_start_4
    invoke-virtual {v7, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0

    :try_start_5
    invoke-virtual {v0}, Lnet/youmi/android/a/c/c/b;->b()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_20

    :goto_3
    const/16 v8, 0x26

    :try_start_6
    invoke-virtual {v7, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_0

    :try_start_7
    invoke-virtual {v0}, Lnet/youmi/android/a/c/c/b;->a()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_7
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_1f

    :goto_4
    const/16 v8, 0x26

    :try_start_8
    invoke-virtual {v7, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_8
    .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_0

    :try_start_9
    invoke-static {p0}, Lnet/youmi/android/a/b/h/e;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_9
    .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_1e

    :goto_5
    const/16 v8, 0x26

    :try_start_a
    invoke-virtual {v7, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_a
    .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_0

    :try_start_b
    invoke-static {p0}, Lnet/youmi/android/a/b/h/e;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_b
    .catch Ljava/lang/Throwable; {:try_start_b .. :try_end_b} :catch_1d

    :goto_6
    const/16 v8, 0x26

    :try_start_c
    invoke-virtual {v7, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_c
    .catch Ljava/lang/Throwable; {:try_start_c .. :try_end_c} :catch_0

    :try_start_d
    invoke-static {}, Lnet/youmi/android/a/b/h/e;->d()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_d
    .catch Ljava/lang/Throwable; {:try_start_d .. :try_end_d} :catch_1c

    :goto_7
    const/16 v8, 0x26

    :try_start_e
    invoke-virtual {v7, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_e
    .catch Ljava/lang/Throwable; {:try_start_e .. :try_end_e} :catch_0

    :try_start_f
    invoke-static {}, Lnet/youmi/android/a/b/h/e;->b()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_f
    .catch Ljava/lang/Throwable; {:try_start_f .. :try_end_f} :catch_1b

    :goto_8
    const/16 v8, 0x26

    :try_start_10
    invoke-virtual {v7, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_10
    .catch Ljava/lang/Throwable; {:try_start_10 .. :try_end_10} :catch_0

    :try_start_11
    invoke-static {}, Lnet/youmi/android/a/b/h/e;->c()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_11
    .catch Ljava/lang/Throwable; {:try_start_11 .. :try_end_11} :catch_1a

    :goto_9
    const/16 v8, 0x26

    :try_start_12
    invoke-virtual {v7, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_12
    .catch Ljava/lang/Throwable; {:try_start_12 .. :try_end_12} :catch_0

    :try_start_13
    sget-object v8, Landroid/os/Build;->BOARD:Ljava/lang/String;

    invoke-static {v8, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_13
    .catch Ljava/lang/Throwable; {:try_start_13 .. :try_end_13} :catch_19

    :goto_a
    const/16 v8, 0x26

    :try_start_14
    invoke-virtual {v7, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_14
    .catch Ljava/lang/Throwable; {:try_start_14 .. :try_end_14} :catch_0

    :try_start_15
    sget-object v8, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-static {v8, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_15
    .catch Ljava/lang/Throwable; {:try_start_15 .. :try_end_15} :catch_18

    :goto_b
    const/16 v8, 0x26

    :try_start_16
    invoke-virtual {v7, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_16
    .catch Ljava/lang/Throwable; {:try_start_16 .. :try_end_16} :catch_0

    :try_start_17
    sget-object v8, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-static {v8, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_17
    .catch Ljava/lang/Throwable; {:try_start_17 .. :try_end_17} :catch_17

    :goto_c
    const/16 v8, 0x26

    :try_start_18
    invoke-virtual {v7, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_18
    .catch Ljava/lang/Throwable; {:try_start_18 .. :try_end_18} :catch_0

    :try_start_19
    invoke-virtual {v0}, Lnet/youmi/android/a/c/c/b;->e()Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "1"

    :goto_d
    invoke-static {v0, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_19
    .catch Ljava/lang/Throwable; {:try_start_19 .. :try_end_19} :catch_16

    :goto_e
    const/16 v0, 0x26

    :try_start_1a
    invoke-virtual {v7, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_1a
    .catch Ljava/lang/Throwable; {:try_start_1a .. :try_end_1a} :catch_0

    :try_start_1b
    invoke-virtual {v5}, Lnet/youmi/android/a/b/k/f;->g()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_1b
    .catch Ljava/lang/Throwable; {:try_start_1b .. :try_end_1b} :catch_15

    :goto_f
    const/16 v0, 0x26

    :try_start_1c
    invoke-virtual {v7, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_1c
    .catch Ljava/lang/Throwable; {:try_start_1c .. :try_end_1c} :catch_0

    :try_start_1d
    invoke-virtual {v5}, Lnet/youmi/android/a/b/k/f;->h()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_1d
    .catch Ljava/lang/Throwable; {:try_start_1d .. :try_end_1d} :catch_14

    :goto_10
    const/16 v0, 0x26

    :try_start_1e
    invoke-virtual {v7, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_1e
    .catch Ljava/lang/Throwable; {:try_start_1e .. :try_end_1e} :catch_0

    :try_start_1f
    invoke-virtual {v5}, Lnet/youmi/android/a/b/k/f;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_1f
    .catch Ljava/lang/Throwable; {:try_start_1f .. :try_end_1f} :catch_13

    :goto_11
    const/16 v0, 0x26

    :try_start_20
    invoke-virtual {v7, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_20
    .catch Ljava/lang/Throwable; {:try_start_20 .. :try_end_20} :catch_0

    :try_start_21
    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_21
    .catch Ljava/lang/Throwable; {:try_start_21 .. :try_end_21} :catch_12

    :goto_12
    const/16 v0, 0x26

    :try_start_22
    invoke-virtual {v7, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_22
    .catch Ljava/lang/Throwable; {:try_start_22 .. :try_end_22} :catch_0

    :try_start_23
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_23
    .catch Ljava/lang/Throwable; {:try_start_23 .. :try_end_23} :catch_11

    :goto_13
    const/16 v0, 0x26

    :try_start_24
    invoke-virtual {v7, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_24
    .catch Ljava/lang/Throwable; {:try_start_24 .. :try_end_24} :catch_0

    :try_start_25
    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_25
    .catch Ljava/lang/Throwable; {:try_start_25 .. :try_end_25} :catch_10

    :goto_14
    const/16 v0, 0x26

    :try_start_26
    invoke-virtual {v7, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_26
    .catch Ljava/lang/Throwable; {:try_start_26 .. :try_end_26} :catch_0

    :try_start_27
    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->f(Landroid/content/Context;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_27
    .catch Ljava/lang/Throwable; {:try_start_27 .. :try_end_27} :catch_f

    :goto_15
    const/16 v0, 0x26

    :try_start_28
    invoke-virtual {v7, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_28
    .catch Ljava/lang/Throwable; {:try_start_28 .. :try_end_28} :catch_0

    :try_start_29
    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->g(Landroid/content/Context;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_29
    .catch Ljava/lang/Throwable; {:try_start_29 .. :try_end_29} :catch_e

    :goto_16
    const/16 v0, 0x26

    :try_start_2a
    invoke-virtual {v7, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_2a
    .catch Ljava/lang/Throwable; {:try_start_2a .. :try_end_2a} :catch_0

    :try_start_2b
    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_2b
    .catch Ljava/lang/Throwable; {:try_start_2b .. :try_end_2b} :catch_d

    :cond_3
    :goto_17
    const/16 v0, 0x26

    :try_start_2c
    invoke-virtual {v7, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_2c
    .catch Ljava/lang/Throwable; {:try_start_2c .. :try_end_2c} :catch_0

    :try_start_2d
    invoke-static {p0}, Lnet/youmi/android/a/b/i/k;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_2d
    .catch Ljava/lang/Throwable; {:try_start_2d .. :try_end_2d} :catch_c

    :goto_18
    const/16 v0, 0x26

    :try_start_2e
    invoke-virtual {v7, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_2e
    .catch Ljava/lang/Throwable; {:try_start_2e .. :try_end_2e} :catch_0

    :try_start_2f
    invoke-static {p0}, Lnet/youmi/android/a/b/h/e;->h(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_2f
    .catch Ljava/lang/Throwable; {:try_start_2f .. :try_end_2f} :catch_b

    :goto_19
    const/16 v0, 0x26

    :try_start_30
    invoke-virtual {v7, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_30
    .catch Ljava/lang/Throwable; {:try_start_30 .. :try_end_30} :catch_0

    if-eqz v6, :cond_4

    :try_start_31
    invoke-virtual {v6}, Landroid/location/Location;->getLatitude()D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_31
    .catch Ljava/lang/Throwable; {:try_start_31 .. :try_end_31} :catch_a

    :cond_4
    :goto_1a
    const/16 v0, 0x26

    :try_start_32
    invoke-virtual {v7, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_32
    .catch Ljava/lang/Throwable; {:try_start_32 .. :try_end_32} :catch_0

    if-eqz v6, :cond_5

    :try_start_33
    invoke-virtual {v6}, Landroid/location/Location;->getLongitude()D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_33
    .catch Ljava/lang/Throwable; {:try_start_33 .. :try_end_33} :catch_9

    :cond_5
    :goto_1b
    const/16 v0, 0x26

    :try_start_34
    invoke-virtual {v7, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_34
    .catch Ljava/lang/Throwable; {:try_start_34 .. :try_end_34} :catch_0

    :try_start_35
    invoke-static {p0}, Lnet/youmi/android/a/a/f/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_35
    .catch Ljava/lang/Throwable; {:try_start_35 .. :try_end_35} :catch_8

    :goto_1c
    const/16 v0, 0x26

    :try_start_36
    invoke-virtual {v7, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_36
    .catch Ljava/lang/Throwable; {:try_start_36 .. :try_end_36} :catch_0

    :try_start_37
    invoke-static {p0}, Lnet/youmi/android/a/b/k/n;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_8

    const-string v0, "1"

    :goto_1d
    invoke-static {v0, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_37
    .catch Ljava/lang/Throwable; {:try_start_37 .. :try_end_37} :catch_7

    :goto_1e
    const/16 v0, 0x26

    :try_start_38
    invoke-virtual {v7, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_38
    .catch Ljava/lang/Throwable; {:try_start_38 .. :try_end_38} :catch_0

    :try_start_39
    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_39
    .catch Ljava/lang/Throwable; {:try_start_39 .. :try_end_39} :catch_6

    :goto_1f
    const/16 v0, 0x26

    :try_start_3a
    invoke-virtual {v7, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_3a
    .catch Ljava/lang/Throwable; {:try_start_3a .. :try_end_3a} :catch_0

    :try_start_3b
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_3b
    .catch Ljava/lang/Throwable; {:try_start_3b .. :try_end_3b} :catch_5

    :goto_20
    const/16 v0, 0x26

    :try_start_3c
    invoke-virtual {v7, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_3c
    .catch Ljava/lang/Throwable; {:try_start_3c .. :try_end_3c} :catch_0

    :try_start_3d
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_3d
    .catch Ljava/lang/Throwable; {:try_start_3d .. :try_end_3d} :catch_4

    :goto_21
    const/16 v0, 0x26

    :try_start_3e
    invoke-virtual {v7, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_3e
    .catch Ljava/lang/Throwable; {:try_start_3e .. :try_end_3e} :catch_0

    :try_start_3f
    invoke-static {}, Lnet/youmi/android/a/c/c/a;->b()Z

    move-result v0

    if-eqz v0, :cond_9

    const-string v0, "1"

    :goto_22
    invoke-static {v0, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_3f
    .catch Ljava/lang/Throwable; {:try_start_3f .. :try_end_3f} :catch_3

    :goto_23
    const/16 v0, 0x26

    :try_start_40
    invoke-virtual {v7, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_40
    .catch Ljava/lang/Throwable; {:try_start_40 .. :try_end_40} :catch_0

    :try_start_41
    invoke-static {p2}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string p2, ""

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Lnet/youmi/android/a/a/g/d/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_41
    .catch Ljava/lang/Throwable; {:try_start_41 .. :try_end_41} :catch_2

    :goto_24
    :try_start_42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ef45N92f053P36cd"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;
    :try_end_42
    .catch Ljava/lang/Throwable; {:try_start_42 .. :try_end_42} :catch_0

    move-result-object v0

    :try_start_43
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    const v3, 0xc5939

    invoke-static {v2, v0, v3}, Lnet/youmi/android/a/b/d/b;->a([BLjava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_43
    .catch Ljava/lang/Throwable; {:try_start_43 .. :try_end_43} :catch_1

    :goto_25
    :try_start_44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_44
    .catch Ljava/lang/Throwable; {:try_start_44 .. :try_end_44} :catch_0

    move-result-object v0

    goto/16 :goto_0

    :cond_7
    :try_start_45
    const-string v0, "0"
    :try_end_45
    .catch Ljava/lang/Throwable; {:try_start_45 .. :try_end_45} :catch_16

    goto/16 :goto_d

    :cond_8
    :try_start_46
    const-string v0, "0"
    :try_end_46
    .catch Ljava/lang/Throwable; {:try_start_46 .. :try_end_46} :catch_7

    goto/16 :goto_1d

    :cond_9
    :try_start_47
    const-string v0, "0"
    :try_end_47
    .catch Ljava/lang/Throwable; {:try_start_47 .. :try_end_47} :catch_3

    goto :goto_22

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto/16 :goto_0

    :catch_1
    move-exception v0

    goto :goto_25

    :catch_2
    move-exception v0

    goto :goto_24

    :catch_3
    move-exception v0

    goto :goto_23

    :catch_4
    move-exception v0

    goto :goto_21

    :catch_5
    move-exception v0

    goto/16 :goto_20

    :catch_6
    move-exception v0

    goto/16 :goto_1f

    :catch_7
    move-exception v0

    goto/16 :goto_1e

    :catch_8
    move-exception v0

    goto/16 :goto_1c

    :catch_9
    move-exception v0

    goto/16 :goto_1b

    :catch_a
    move-exception v0

    goto/16 :goto_1a

    :catch_b
    move-exception v0

    goto/16 :goto_19

    :catch_c
    move-exception v0

    goto/16 :goto_18

    :catch_d
    move-exception v0

    goto/16 :goto_17

    :catch_e
    move-exception v0

    goto/16 :goto_16

    :catch_f
    move-exception v0

    goto/16 :goto_15

    :catch_10
    move-exception v0

    goto/16 :goto_14

    :catch_11
    move-exception v0

    goto/16 :goto_13

    :catch_12
    move-exception v0

    goto/16 :goto_12

    :catch_13
    move-exception v0

    goto/16 :goto_11

    :catch_14
    move-exception v0

    goto/16 :goto_10

    :catch_15
    move-exception v0

    goto/16 :goto_f

    :catch_16
    move-exception v0

    goto/16 :goto_e

    :catch_17
    move-exception v8

    goto/16 :goto_c

    :catch_18
    move-exception v8

    goto/16 :goto_b

    :catch_19
    move-exception v8

    goto/16 :goto_a

    :catch_1a
    move-exception v8

    goto/16 :goto_9

    :catch_1b
    move-exception v8

    goto/16 :goto_8

    :catch_1c
    move-exception v8

    goto/16 :goto_7

    :catch_1d
    move-exception v8

    goto/16 :goto_6

    :catch_1e
    move-exception v8

    goto/16 :goto_5

    :catch_1f
    move-exception v8

    goto/16 :goto_4

    :catch_20
    move-exception v8

    goto/16 :goto_3

    :catch_21
    move-exception v8

    goto/16 :goto_2

    :catch_22
    move-exception v8

    goto/16 :goto_1
.end method

.method public static a(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/b;)Ljava/lang/String;
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    :try_start_0
    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/b;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->d(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x200

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/b;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "?s="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "00000"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v4, 0x3

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/b;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v4, Ljava/io/ByteArrayOutputStream;

    const/16 v5, 0x200

    invoke-direct {v4, v5}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    const-string v5, "2"

    invoke-static {v5, v4}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V

    const/16 v5, 0x26

    invoke-virtual {v4, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_3

    :goto_1
    const/16 v2, 0x26

    :try_start_2
    invoke-virtual {v4, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/b;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p0}, Lnet/youmi/android/a/a/g/d/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2

    :goto_2
    :try_start_4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ef45N92f053P36cd"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/b;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0

    move-result-object v2

    :try_start_5
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    const v4, 0xc5939

    invoke-static {v3, v2, v4}, Lnet/youmi/android/a/b/d/b;->a([BLjava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2c

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_1

    :goto_3
    :try_start_6
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_0

    move-result-object v0

    goto/16 :goto_0

    :catch_0
    move-exception v1

    goto/16 :goto_0

    :catch_1
    move-exception v2

    goto :goto_3

    :catch_2
    move-exception v2

    goto :goto_2

    :catch_3
    move-exception v2

    goto :goto_1
.end method

.method public static a(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/b;I)Ljava/lang/String;
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    :try_start_0
    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/b;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->d(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x200

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/b;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "?s="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "00000"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v4, 0x3

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/b;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v4, Ljava/io/ByteArrayOutputStream;

    const/16 v5, 0x200

    invoke-direct {v4, v5}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    const-string v5, "3"

    invoke-static {v5, v4}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V

    const/16 v5, 0x26

    invoke-virtual {v4, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_4

    :goto_1
    const/16 v2, 0x26

    :try_start_2
    invoke-virtual {v4, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_3

    :goto_2
    const/16 v2, 0x26

    :try_start_4
    invoke-virtual {v4, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0

    :try_start_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/b;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p0}, Lnet/youmi/android/a/a/g/d/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_2

    :goto_3
    :try_start_6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ef45N92f053P36cd"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/b;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_0

    move-result-object v2

    :try_start_7
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    const v4, 0xc5939

    invoke-static {v3, v2, v4}, Lnet/youmi/android/a/b/d/b;->a([BLjava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2c

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_7
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_1

    :goto_4
    :try_start_8
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_8
    .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_0

    move-result-object v0

    goto/16 :goto_0

    :catch_0
    move-exception v1

    goto/16 :goto_0

    :catch_1
    move-exception v2

    goto :goto_4

    :catch_2
    move-exception v2

    goto :goto_3

    :catch_3
    move-exception v2

    goto :goto_2

    :catch_4
    move-exception v2

    goto :goto_1
.end method

.method private static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "&first_ei="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p0}, Lnet/youmi/android/a/b/h/e;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "&first_si="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p0}, Lnet/youmi/android/a/b/h/e;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "&ntype="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p0}, Lnet/youmi/android/a/b/h/e;->j(Landroid/content/Context;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "&advid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p0}, Lnet/youmi/android/a/b/h/e;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "&bssid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p0}, Lnet/youmi/android/a/b/h/e;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/d/j;->a(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, ""

    goto :goto_0
.end method
