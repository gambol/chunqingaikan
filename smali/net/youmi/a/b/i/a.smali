.class public abstract Lnet/youmi/android/a/b/i/a;
.super Ljava/lang/Object;


# instance fields
.field protected a:Landroid/content/Context;

.field protected b:Lorg/apache/http/client/methods/HttpUriRequest;

.field protected c:Lorg/apache/http/client/HttpClient;

.field protected d:Lnet/youmi/android/a/b/i/b;

.field protected e:Lnet/youmi/android/a/b/i/c;

.field protected f:J

.field protected g:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/b/i/c;)V
    .locals 2

    const-wide/16 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide v0, p0, Lnet/youmi/android/a/b/i/a;->f:J

    iput-wide v0, p0, Lnet/youmi/android/a/b/i/a;->g:J

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/b/i/a;->a:Landroid/content/Context;

    iput-object p2, p0, Lnet/youmi/android/a/b/i/a;->e:Lnet/youmi/android/a/b/i/c;

    return-void
.end method

.method private a(Lorg/apache/http/HttpResponse;J)V
    .locals 4

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->d:Lnet/youmi/android/a/b/i/b;

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, p2

    invoke-virtual {v0, v2, v3}, Lnet/youmi/android/a/b/i/b;->b(J)V

    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v1

    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v2

    invoke-interface {v2}, Lorg/apache/http/StatusLine;->getReasonPhrase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/b/i/b;->a(I)V

    invoke-virtual {v0, v2}, Lnet/youmi/android/a/b/i/b;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lnet/youmi/android/a/b/i/b;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;

    invoke-interface {v1}, Lorg/apache/http/client/methods/HttpUriRequest;->getAllHeaders()[Lorg/apache/http/Header;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/b/i/b;->a([Lorg/apache/http/Header;)V

    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getAllHeaders()[Lorg/apache/http/Header;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/b/i/b;->b([Lorg/apache/http/Header;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private e()Lorg/apache/http/HttpResponse;
    .locals 4

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->c:Lorg/apache/http/client/HttpClient;

    if-nez v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/b/i/i;->b(Landroid/content/Context;)Lorg/apache/http/impl/client/DefaultHttpClient;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/b/i/a;->c:Lorg/apache/http/client/HttpClient;

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;

    if-nez v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->e:Lnet/youmi/android/a/b/i/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/i/c;->b()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->e:Lnet/youmi/android/a/b/i/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/i/c;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    new-instance v1, Lorg/apache/http/client/methods/HttpPost;

    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->e:Lnet/youmi/android/a/b/i/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/i/c;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->e:Lnet/youmi/android/a/b/i/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/i/c;->b()Ljava/util/List;

    move-result-object v2

    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->e:Lnet/youmi/android/a/b/i/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/i/c;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->e:Lnet/youmi/android/a/b/i/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/i/c;->d()Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v3, Lorg/apache/http/client/entity/UrlEncodedFormEntity;

    invoke-direct {v3, v2, v0}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    iput-object v1, p0, Lnet/youmi/android/a/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_1
    :try_start_1
    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->e:Lnet/youmi/android/a/b/i/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/i/c;->c()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    const/4 v0, 0x0

    move v1, v0

    :goto_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_5

    iget-object v3, p0, Lnet/youmi/android/a/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/http/Header;

    invoke-interface {v3, v0}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Lorg/apache/http/Header;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :cond_2
    :try_start_2
    const-string v0, "UTF-8"

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->e:Lnet/youmi/android/a/b/i/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/i/c;->k()[B

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->e:Lnet/youmi/android/a/b/i/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/i/c;->k()[B

    move-result-object v0

    array-length v0, v0

    if-lez v0, :cond_4

    new-instance v0, Lorg/apache/http/client/methods/HttpPost;

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a;->e:Lnet/youmi/android/a/b/i/c;

    invoke-virtual {v1}, Lnet/youmi/android/a/b/i/c;->e()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    new-instance v1, Lorg/apache/http/entity/ByteArrayEntity;

    iget-object v2, p0, Lnet/youmi/android/a/b/i/a;->e:Lnet/youmi/android/a/b/i/c;

    invoke-virtual {v2}, Lnet/youmi/android/a/b/i/c;->k()[B

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V

    invoke-virtual {v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    iput-object v0, p0, Lnet/youmi/android/a/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    :goto_3
    :try_start_3
    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->c:Lorg/apache/http/client/HttpClient;

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;

    invoke-interface {v0, v1}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/HttpEntity;->getContentLength()J

    move-result-wide v2

    iput-wide v2, p0, Lnet/youmi/android/a/b/i/a;->g:J
    :try_end_3
    .catch Lorg/apache/http/conn/ConnectionPoolTimeoutException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/net/UnknownHostException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Lorg/apache/http/conn/HttpHostConnectException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_8

    :goto_4
    return-object v0

    :cond_4
    :try_start_4
    new-instance v0, Lorg/apache/http/client/methods/HttpGet;

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a;->e:Lnet/youmi/android/a/b/i/c;

    invoke-virtual {v1}, Lnet/youmi/android/a/b/i/c;->e()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lnet/youmi/android/a/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_1

    :catch_1
    move-exception v0

    :cond_5
    :try_start_5
    invoke-virtual {p0}, Lnet/youmi/android/a/b/i/a;->c()V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_3

    :catch_2
    move-exception v0

    goto :goto_3

    :catch_3
    move-exception v0

    const/16 v1, -0x65

    invoke-virtual {p0, v1, v0}, Lnet/youmi/android/a/b/i/a;->a(ILjava/lang/Exception;)V

    :goto_5
    const/4 v0, 0x0

    goto :goto_4

    :catch_4
    move-exception v0

    const/16 v1, -0x64

    invoke-virtual {p0, v1, v0}, Lnet/youmi/android/a/b/i/a;->a(ILjava/lang/Exception;)V

    goto :goto_5

    :catch_5
    move-exception v0

    const/16 v1, -0x66

    invoke-virtual {p0, v1, v0}, Lnet/youmi/android/a/b/i/a;->a(ILjava/lang/Exception;)V

    goto :goto_5

    :catch_6
    move-exception v0

    const/16 v1, -0x67

    invoke-virtual {p0, v1, v0}, Lnet/youmi/android/a/b/i/a;->a(ILjava/lang/Exception;)V

    goto :goto_5

    :catch_7
    move-exception v0

    const/16 v1, -0x68

    invoke-virtual {p0, v1, v0}, Lnet/youmi/android/a/b/i/a;->a(ILjava/lang/Exception;)V

    goto :goto_5

    :catch_8
    move-exception v0

    const/16 v1, -0x63

    invoke-virtual {p0, v1, v0}, Lnet/youmi/android/a/b/i/a;->a(ILjava/lang/Exception;)V

    goto :goto_5
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Lnet/youmi/android/a/b/i/a;->f:J

    return-wide v0
.end method

.method protected a(ILjava/lang/Exception;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->d:Lnet/youmi/android/a/b/i/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->d:Lnet/youmi/android/a/b/i/b;

    invoke-virtual {v0, p1}, Lnet/youmi/android/a/b/i/b;->b(I)V

    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->d:Lnet/youmi/android/a/b/i/b;

    invoke-virtual {v0, p2}, Lnet/youmi/android/a/b/i/b;->a(Ljava/lang/Exception;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public a(Lnet/youmi/android/a/b/i/b;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/b/i/a;->d:Lnet/youmi/android/a/b/i/b;

    return-void
.end method

.method public a(Lnet/youmi/android/a/b/i/c;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/b/i/a;->e:Lnet/youmi/android/a/b/i/c;

    return-void
.end method

.method protected abstract a(Lorg/apache/http/HttpResponse;)V
.end method

.method public declared-synchronized b()V
    .locals 6

    monitor-enter p0

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lnet/youmi/android/a/b/i/a;->f:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-direct {p0}, Lnet/youmi/android/a/b/i/a;->e()Lorg/apache/http/HttpResponse;

    move-result-object v0

    invoke-direct {p0, v0, v2, v3}, Lnet/youmi/android/a/b/i/a;->a(Lorg/apache/http/HttpResponse;J)V

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/b/i/a;->a(Lorg/apache/http/HttpResponse;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;

    invoke-interface {v0}, Lorg/apache/http/client/methods/HttpUriRequest;->abort()V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_9
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_0
    :goto_0
    const/4 v0, 0x0

    :try_start_3
    iput-object v0, p0, Lnet/youmi/android/a/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->c:Lorg/apache/http/client/HttpClient;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->c:Lorg/apache/http/client/HttpClient;

    invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_8
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :cond_1
    :goto_1
    const/4 v0, 0x0

    :try_start_5
    iput-object v0, p0, Lnet/youmi/android/a/b/i/a;->c:Lorg/apache/http/client/HttpClient;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->d:Lnet/youmi/android/a/b/i/b;

    if-eqz v0, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v2

    iget-object v2, p0, Lnet/youmi/android/a/b/i/a;->d:Lnet/youmi/android/a/b/i/b;

    invoke-virtual {v2, v0, v1}, Lnet/youmi/android/a/b/i/b;->a(J)V
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_7
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :cond_2
    :goto_2
    monitor-exit p0

    return-void

    :catch_0
    move-exception v0

    :try_start_7
    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;

    invoke-interface {v0}, Lorg/apache/http/client/methods/HttpUriRequest;->abort()V
    :try_end_7
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_6
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :cond_3
    :goto_3
    const/4 v0, 0x0

    :try_start_8
    iput-object v0, p0, Lnet/youmi/android/a/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :try_start_9
    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->c:Lorg/apache/http/client/HttpClient;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->c:Lorg/apache/http/client/HttpClient;

    invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
    :try_end_9
    .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_5
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :cond_4
    :goto_4
    const/4 v0, 0x0

    :try_start_a
    iput-object v0, p0, Lnet/youmi/android/a/b/i/a;->c:Lorg/apache/http/client/HttpClient;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :try_start_b
    iget-object v0, p0, Lnet/youmi/android/a/b/i/a;->d:Lnet/youmi/android/a/b/i/b;

    if-eqz v0, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v2

    iget-object v2, p0, Lnet/youmi/android/a/b/i/a;->d:Lnet/youmi/android/a/b/i/b;

    invoke-virtual {v2, v0, v1}, Lnet/youmi/android/a/b/i/b;->a(J)V
    :try_end_b
    .catch Ljava/lang/Throwable; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_2

    :catchall_0
    move-exception v0

    :try_start_c
    iget-object v1, p0, Lnet/youmi/android/a/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;

    invoke-interface {v1}, Lorg/apache/http/client/methods/HttpUriRequest;->abort()V
    :try_end_c
    .catch Ljava/lang/Throwable; {:try_start_c .. :try_end_c} :catch_4
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    :cond_5
    :goto_5
    const/4 v1, 0x0

    :try_start_d
    iput-object v1, p0, Lnet/youmi/android/a/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    :try_start_e
    iget-object v1, p0, Lnet/youmi/android/a/b/i/a;->c:Lorg/apache/http/client/HttpClient;

    if-eqz v1, :cond_6

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a;->c:Lorg/apache/http/client/HttpClient;

    invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
    :try_end_e
    .catch Ljava/lang/Throwable; {:try_start_e .. :try_end_e} :catch_3
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    :cond_6
    :goto_6
    const/4 v1, 0x0

    :try_start_f
    iput-object v1, p0, Lnet/youmi/android/a/b/i/a;->c:Lorg/apache/http/client/HttpClient;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    :try_start_10
    iget-object v1, p0, Lnet/youmi/android/a/b/i/a;->d:Lnet/youmi/android/a/b/i/b;

    if-eqz v1, :cond_7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v2, v4, v2

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a;->d:Lnet/youmi/android/a/b/i/b;

    invoke-virtual {v1, v2, v3}, Lnet/youmi/android/a/b/i/b;->a(J)V
    :try_end_10
    .catch Ljava/lang/Throwable; {:try_start_10 .. :try_end_10} :catch_2
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    :cond_7
    :goto_7
    :try_start_11
    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0

    :catch_2
    move-exception v1

    goto :goto_7

    :catch_3
    move-exception v1

    goto :goto_6

    :catch_4
    move-exception v1

    goto :goto_5

    :catch_5
    move-exception v0

    goto :goto_4

    :catch_6
    move-exception v0

    goto :goto_3

    :catch_7
    move-exception v0

    goto :goto_2

    :catch_8
    move-exception v0

    goto :goto_1

    :catch_9
    move-exception v0

    goto/16 :goto_0
.end method

.method protected c()V
    .locals 0

    return-void
.end method

.method public abstract d()J
.end method
