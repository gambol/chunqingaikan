.class public Lnet/youmi/android/a/c/d/b;
.super Lnet/youmi/android/a/b/i/a;


# static fields
.field private static i:J


# instance fields
.field private h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/16 v0, 0x0

    sput-wide v0, Lnet/youmi/android/a/c/d/b;->i:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/b/i/c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lnet/youmi/android/a/b/i/a;-><init>(Landroid/content/Context;Lnet/youmi/android/a/b/i/c;)V

    return-void
.end method

.method private static a(Lorg/apache/http/HttpResponse;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 8

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v0, 0x0

    if-eqz p0, :cond_a

    :try_start_0
    invoke-interface {p0}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v2

    invoke-interface {v2}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v2

    if-eqz p2, :cond_0

    const-string v4, "Response http code is : %d"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-static {v4, v5}, Lnet/youmi/android/a/c/b/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const/16 v4, 0xc8

    if-lt v2, v4, :cond_b

    const/16 v4, 0x12c

    if-ge v2, v4, :cond_b

    invoke-interface {p0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_c
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    if-eqz p2, :cond_1

    :try_start_1
    const-string v0, "Response ContentLength : %d , ContentType : %s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->getContentLength()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->getContentType()Lorg/apache/http/Header;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v0, v4}, Lnet/youmi/android/a/c/b/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_f
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    :goto_0
    :try_start_2
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->getContentEncoding()Lorg/apache/http/Header;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v0

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "gzip"

    invoke-virtual {v0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_10

    new-instance v0, Ljava/util/zip/GZIPInputStream;

    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    if-nez v0, :cond_f

    :try_start_3
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_d
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result-object v2

    :goto_2
    if-nez v2, :cond_5

    if-eqz p2, :cond_2

    :try_start_4
    const-string v0, "Response Content is null"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_e
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :cond_2
    if-eqz v1, :cond_3

    :try_start_5
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_4

    :cond_3
    :goto_3
    if-eqz v2, :cond_4

    :try_start_6
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_5

    :cond_4
    :goto_4
    return-object v1

    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_1

    :cond_5
    :try_start_7
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_7
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_e
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    const/16 v0, 0x400

    :try_start_8
    new-array v0, v0, [B

    :goto_5
    invoke-virtual {v2, v0}, Ljava/io/InputStream;->read([B)I

    move-result v4

    if-lez v4, :cond_7

    const/4 v5, 0x0

    invoke-virtual {v3, v0, v5, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_8
    .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    goto :goto_5

    :catch_1
    move-exception v0

    move-object v0, v2

    move-object v2, v3

    :goto_6
    if-eqz v2, :cond_6

    :try_start_9
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_9
    .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_9

    :cond_6
    :goto_7
    if-eqz v0, :cond_4

    :try_start_a
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_2

    goto :goto_4

    :catch_2
    move-exception v0

    goto :goto_4

    :cond_7
    :try_start_b
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->flush()V

    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v4

    array-length v0, v4

    int-to-long v6, v0

    sput-wide v6, Lnet/youmi/android/a/c/d/b;->i:J

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v4, p1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_b
    .catch Ljava/lang/Throwable; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    if-eqz v3, :cond_8

    :try_start_c
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_c
    .catch Ljava/lang/Throwable; {:try_start_c .. :try_end_c} :catch_6

    :cond_8
    :goto_8
    if-eqz v2, :cond_9

    :try_start_d
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_d
    .catch Ljava/lang/Throwable; {:try_start_d .. :try_end_d} :catch_7

    :cond_9
    :goto_9
    move-object v1, v0

    goto :goto_4

    :cond_a
    if-eqz p2, :cond_b

    :try_start_e
    const-string v2, "Request failed , reponse is null"

    invoke-static {v2}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;)V
    :try_end_e
    .catch Ljava/lang/Throwable; {:try_start_e .. :try_end_e} :catch_c
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    :cond_b
    if-eqz v1, :cond_c

    :try_start_f
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_f
    .catch Ljava/lang/Throwable; {:try_start_f .. :try_end_f} :catch_8

    :cond_c
    :goto_a
    if-eqz v1, :cond_4

    :try_start_10
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_10
    .catch Ljava/lang/Throwable; {:try_start_10 .. :try_end_10} :catch_3

    goto :goto_4

    :catch_3
    move-exception v0

    goto :goto_4

    :catchall_0
    move-exception v0

    move-object v3, v1

    :goto_b
    if-eqz v3, :cond_d

    :try_start_11
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_11
    .catch Ljava/lang/Throwable; {:try_start_11 .. :try_end_11} :catch_a

    :cond_d
    :goto_c
    if-eqz v1, :cond_e

    :try_start_12
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_12
    .catch Ljava/lang/Throwable; {:try_start_12 .. :try_end_12} :catch_b

    :cond_e
    :goto_d
    throw v0

    :catch_4
    move-exception v0

    goto :goto_3

    :catch_5
    move-exception v0

    goto :goto_4

    :catch_6
    move-exception v1

    goto :goto_8

    :catch_7
    move-exception v1

    goto :goto_9

    :catch_8
    move-exception v2

    goto :goto_a

    :catch_9
    move-exception v2

    goto :goto_7

    :catch_a
    move-exception v2

    goto :goto_c

    :catch_b
    move-exception v1

    goto :goto_d

    :catchall_1
    move-exception v2

    move-object v3, v1

    move-object v1, v0

    move-object v0, v2

    goto :goto_b

    :catchall_2
    move-exception v0

    move-object v3, v1

    move-object v1, v2

    goto :goto_b

    :catchall_3
    move-exception v0

    move-object v1, v2

    goto :goto_b

    :catch_c
    move-exception v0

    move-object v0, v1

    move-object v2, v1

    goto :goto_6

    :catch_d
    move-exception v2

    move-object v2, v1

    goto :goto_6

    :catch_e
    move-exception v0

    move-object v0, v2

    move-object v2, v1

    goto :goto_6

    :catch_f
    move-exception v0

    goto/16 :goto_0

    :cond_f
    move-object v2, v0

    goto/16 :goto_2

    :cond_10
    move-object v0, v1

    goto/16 :goto_1
.end method


# virtual methods
.method protected a(Lorg/apache/http/HttpResponse;)V
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/a/c/d/b;->e:Lnet/youmi/android/a/b/i/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/c/d/b;->e:Lnet/youmi/android/a/b/i/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/i/c;->a()Z

    move-result v0

    :goto_0
    iget-object v1, p0, Lnet/youmi/android/a/c/d/b;->e:Lnet/youmi/android/a/b/i/c;

    invoke-virtual {v1}, Lnet/youmi/android/a/b/i/c;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1, v0}, Lnet/youmi/android/a/c/d/b;->a(Lorg/apache/http/HttpResponse;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/c/d/b;->h:Ljava/lang/String;

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected c()V
    .locals 3

    invoke-super {p0}, Lnet/youmi/android/a/b/i/a;->c()V

    iget-object v0, p0, Lnet/youmi/android/a/c/d/b;->b:Lorg/apache/http/client/methods/HttpUriRequest;

    const-string v1, "Accept-Encoding"

    const-string v2, "gzip, deflate"

    invoke-interface {v0, v1, v2}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Lnet/youmi/android/a/c/c/b;

    iget-object v1, p0, Lnet/youmi/android/a/c/d/b;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lnet/youmi/android/a/c/c/b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lnet/youmi/android/a/c/d/b;->b:Lorg/apache/http/client/methods/HttpUriRequest;

    const-string v2, "X-YM-CID"

    invoke-virtual {v0}, Lnet/youmi/android/a/c/c/b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public d()J
    .locals 2

    sget-wide v0, Lnet/youmi/android/a/c/d/b;->i:J

    return-wide v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/c/d/b;->h:Ljava/lang/String;

    return-object v0
.end method
