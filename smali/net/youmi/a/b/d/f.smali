.class public Lnet/youmi/android/a/b/d/f;
.super Ljava/lang/Object;


# direct methods
.method private static a(Ljava/io/ByteArrayInputStream;)V
    .locals 1

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    return-void

    :catchall_0
    move-exception v0

    throw v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private static a(Ljava/io/ByteArrayOutputStream;)V
    .locals 1

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    return-void

    :catchall_0
    move-exception v0

    throw v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private static a(Ljava/util/zip/GZIPInputStream;)V
    .locals 1

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/util/zip/GZIPInputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    return-void

    :catchall_0
    move-exception v0

    throw v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private static a(Ljava/util/zip/GZIPOutputStream;)V
    .locals 1

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/util/zip/GZIPOutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    return-void

    :catchall_0
    move-exception v0

    throw v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a([BLjava/lang/String;)[B
    .locals 6

    const/4 v0, 0x0

    if-nez p0, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    array-length v1, p0

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    array-length v1, p0

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v1, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v1, v2}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    invoke-virtual {v1, p0}, Ljava/util/zip/GZIPOutputStream;->write([B)V

    invoke-virtual {v1}, Ljava/util/zip/GZIPOutputStream;->flush()V

    invoke-static {v1}, Lnet/youmi/android/a/b/d/f;->a(Ljava/util/zip/GZIPOutputStream;)V

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->size()I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static {}, Lnet/youmi/android/a/b/d/h;->a()[B

    move-result-object v3

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    invoke-static {v1, p1, v3}, Lnet/youmi/android/a/b/d/h;->a([BLjava/lang/String;[B)[B

    move-result-object v4

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1, v3}, Ljava/io/ByteArrayOutputStream;->write([B)V

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->flush()V

    invoke-virtual {v1, v4}, Ljava/io/ByteArrayOutputStream;->write([B)V

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->flush()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->size()I

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result-object v0

    invoke-static {v1}, Lnet/youmi/android/a/b/d/f;->a(Ljava/io/ByteArrayOutputStream;)V

    invoke-static {v2}, Lnet/youmi/android/a/b/d/f;->a(Ljava/io/ByteArrayOutputStream;)V

    goto :goto_0

    :catch_0
    move-exception v1

    move-object v1, v0

    move-object v2, v0

    :goto_1
    invoke-static {v1}, Lnet/youmi/android/a/b/d/f;->a(Ljava/io/ByteArrayOutputStream;)V

    invoke-static {v2}, Lnet/youmi/android/a/b/d/f;->a(Ljava/io/ByteArrayOutputStream;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    move-object v2, v0

    move-object v5, v0

    move-object v0, v1

    move-object v1, v5

    :goto_2
    invoke-static {v1}, Lnet/youmi/android/a/b/d/f;->a(Ljava/io/ByteArrayOutputStream;)V

    invoke-static {v2}, Lnet/youmi/android/a/b/d/f;->a(Ljava/io/ByteArrayOutputStream;)V

    throw v0

    :catchall_1
    move-exception v1

    move-object v5, v1

    move-object v1, v0

    move-object v0, v5

    goto :goto_2

    :catchall_2
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v1

    move-object v1, v0

    goto :goto_1

    :catch_2
    move-exception v3

    goto :goto_1
.end method

.method public static b([BLjava/lang/String;)[B
    .locals 9

    const/4 v0, 0x0

    if-nez p0, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    array-length v1, p0

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    array-length v1, p0

    :try_start_0
    new-instance v4, Ljava/io/ByteArrayInputStream;

    invoke-direct {v4, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v1, 0x8

    :try_start_1
    new-array v1, v1, [B

    array-length v2, p0

    add-int/lit8 v2, v2, -0x8

    new-array v2, v2, [B

    const/4 v3, 0x0

    const/16 v5, 0x8

    invoke-virtual {v4, v1, v3, v5}, Ljava/io/ByteArrayInputStream;->read([BII)I

    invoke-virtual {v4, v2}, Ljava/io/ByteArrayInputStream;->read([B)I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static {v2, p1, v1}, Lnet/youmi/android/a/b/d/h;->b([BLjava/lang/String;[B)[B

    move-result-object v1

    array-length v2, v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    new-instance v3, Ljava/io/ByteArrayInputStream;

    invoke-direct {v3, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    new-instance v2, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v2, v3}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    const/16 v5, 0x400

    :try_start_4
    new-array v5, v5, [B

    :goto_1
    invoke-virtual {v2, v5}, Ljava/util/zip/GZIPInputStream;->read([B)I

    move-result v6

    if-lez v6, :cond_2

    const/4 v7, 0x0

    invoke-virtual {v1, v5, v7, v6}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_1

    :catch_0
    move-exception v5

    :goto_2
    invoke-static {v1}, Lnet/youmi/android/a/b/d/f;->a(Ljava/io/ByteArrayOutputStream;)V

    invoke-static {v2}, Lnet/youmi/android/a/b/d/f;->a(Ljava/util/zip/GZIPInputStream;)V

    invoke-static {v3}, Lnet/youmi/android/a/b/d/f;->a(Ljava/io/ByteArrayInputStream;)V

    invoke-static {v4}, Lnet/youmi/android/a/b/d/f;->a(Ljava/io/ByteArrayInputStream;)V

    goto :goto_0

    :cond_2
    :try_start_5
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->flush()V

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->size()I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    move-result-object v0

    invoke-static {v1}, Lnet/youmi/android/a/b/d/f;->a(Ljava/io/ByteArrayOutputStream;)V

    invoke-static {v2}, Lnet/youmi/android/a/b/d/f;->a(Ljava/util/zip/GZIPInputStream;)V

    invoke-static {v3}, Lnet/youmi/android/a/b/d/f;->a(Ljava/io/ByteArrayInputStream;)V

    invoke-static {v4}, Lnet/youmi/android/a/b/d/f;->a(Ljava/io/ByteArrayInputStream;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    move-object v2, v0

    move-object v3, v0

    move-object v4, v0

    move-object v8, v0

    move-object v0, v1

    move-object v1, v8

    :goto_3
    invoke-static {v1}, Lnet/youmi/android/a/b/d/f;->a(Ljava/io/ByteArrayOutputStream;)V

    invoke-static {v2}, Lnet/youmi/android/a/b/d/f;->a(Ljava/util/zip/GZIPInputStream;)V

    invoke-static {v3}, Lnet/youmi/android/a/b/d/f;->a(Ljava/io/ByteArrayInputStream;)V

    invoke-static {v4}, Lnet/youmi/android/a/b/d/f;->a(Ljava/io/ByteArrayInputStream;)V

    throw v0

    :catchall_1
    move-exception v1

    move-object v2, v0

    move-object v3, v0

    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    goto :goto_3

    :catchall_2
    move-exception v1

    move-object v2, v0

    move-object v8, v0

    move-object v0, v1

    move-object v1, v8

    goto :goto_3

    :catchall_3
    move-exception v1

    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    goto :goto_3

    :catchall_4
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v1

    move-object v1, v0

    move-object v2, v0

    move-object v3, v0

    move-object v4, v0

    goto :goto_2

    :catch_2
    move-exception v1

    move-object v1, v0

    move-object v2, v0

    move-object v3, v0

    goto :goto_2

    :catch_3
    move-exception v1

    move-object v1, v0

    move-object v2, v0

    goto :goto_2

    :catch_4
    move-exception v1

    move-object v1, v0

    goto :goto_2
.end method
