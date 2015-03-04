.class public Lnet/youmi/android/a/b/d/i;
.super Ljava/lang/Object;


# direct methods
.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    const/4 v1, 0x0

    const/16 v6, 0x100

    const/4 v0, 0x0

    invoke-static {p0}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {p1}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    move-object v0, v1

    :goto_0
    return-object v0

    :cond_1
    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/a/b/h/b;->a(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p0

    :goto_1
    :try_start_1
    invoke-static {p1}, Lnet/youmi/android/a/b/h/b;->a(Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object p1

    :goto_2
    const/16 v2, 0x100

    :try_start_2
    new-array v4, v2, [I

    const/16 v2, 0x100

    new-array v5, v2, [B

    move v2, v0

    :goto_3
    if-ge v2, v6, :cond_2

    aput v2, v4, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_2
    move v2, v0

    :goto_4
    if-ge v2, v6, :cond_3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    rem-int v3, v2, v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    int-to-byte v3, v3

    aput-byte v3, v5, v2

    add-int/lit8 v2, v2, 0x1

    int-to-short v2, v2

    goto :goto_4

    :cond_3
    move v2, v0

    move v3, v0

    :goto_5
    const/16 v6, 0xff

    if-ge v2, v6, :cond_4

    aget v6, v4, v2

    add-int/2addr v3, v6

    aget-byte v6, v5, v2

    add-int/2addr v3, v6

    rem-int/lit16 v3, v3, 0x100

    aget v6, v4, v2

    aget v7, v4, v3

    aput v7, v4, v2

    aput v6, v4, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_4
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v5

    array-length v2, v5

    new-array v6, v2, [C

    move v2, v0

    move v3, v0

    :goto_6
    array-length v7, v5

    if-ge v0, v7, :cond_5

    add-int/lit8 v2, v2, 0x1

    rem-int/lit16 v2, v2, 0x100

    aget v7, v4, v2

    add-int/2addr v3, v7

    rem-int/lit16 v3, v3, 0x100

    aget v7, v4, v2

    aget v8, v4, v3

    aput v8, v4, v2

    aput v7, v4, v3

    aget v7, v4, v2

    aget v8, v4, v3

    rem-int/lit16 v8, v8, 0x100

    add-int/2addr v7, v8

    rem-int/lit16 v7, v7, 0x100

    aget v7, v4, v7

    int-to-char v7, v7

    aget-char v8, v5, v0

    xor-int/2addr v7, v8

    int-to-char v7, v7

    aput-char v7, v6, v0

    add-int/lit8 v0, v0, 0x1

    int-to-short v0, v0

    goto :goto_6

    :cond_5
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v6}, Ljava/lang/String;-><init>([C)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    invoke-static {v0}, Lnet/youmi/android/a/b/h/b;->a(Ljava/lang/String;)Ljava/lang/String;
    :try_end_3
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0

    move-result-object v0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    move-object v0, v1

    goto/16 :goto_0

    :catch_1
    move-exception v2

    goto/16 :goto_1

    :catch_2
    move-exception v2

    goto/16 :goto_2

    :catch_3
    move-exception v1

    goto/16 :goto_0
.end method
