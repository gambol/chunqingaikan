.class public abstract Lnet/youmi/android/a/b/i/a/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field protected a:Lorg/json/JSONObject;

.field protected b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/b/i/c;Lnet/youmi/android/a/b/i/b;Lnet/youmi/android/a/b/i/a;Lnet/youmi/android/a/b/i/a/b;)V
    .locals 6

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/youmi/android/a/b/i/a/a;->b:Landroid/content/Context;

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    iput-object v1, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    const-string v2, "rt"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v1, v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    const-string v2, "code"

    invoke-virtual {p3}, Lnet/youmi/android/a/b/i/b;->a()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    const-string v2, "ert"

    invoke-virtual {p4}, Lnet/youmi/android/a/b/i/a;->a()J

    move-result-wide v4

    invoke-virtual {v1, v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    const-string v2, "sv"

    invoke-virtual {p5}, Lnet/youmi/android/a/b/i/a/b;->a()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    const-string v2, "apn"

    invoke-static {p1}, Lnet/youmi/android/a/b/i/k;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    const-string v2, "rhost"

    invoke-virtual {p2}, Lnet/youmi/android/a/b/i/c;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    const-string v2, "rpath"

    invoke-virtual {p2}, Lnet/youmi/android/a/b/i/c;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    const-string v2, "rquery"

    invoke-virtual {p2}, Lnet/youmi/android/a/b/i/c;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    const-string v2, "response"

    invoke-virtual {p3}, Lnet/youmi/android/a/b/i/b;->e()J

    move-result-wide v4

    invoke-virtual {v1, v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    const-string v2, "process"

    invoke-virtual {p3}, Lnet/youmi/android/a/b/i/b;->d()J

    move-result-wide v4

    invoke-virtual {v1, v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    const-string v2, "caller"

    const-string v3, "SDK"

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    const-string v2, "product"

    invoke-virtual {p5}, Lnet/youmi/android/a/b/i/a/b;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p2}, Lnet/youmi/android/a/b/i/c;->f()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "-1"

    :cond_0
    iget-object v2, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    const-string v3, "service-ip"

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    const-string v2, "pid"

    const/4 v3, 0x3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    const-string v2, "tag"

    invoke-virtual {p5}, Lnet/youmi/android/a/b/i/a/b;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    const-string v2, "sysv"

    invoke-static {}, Lnet/youmi/android/a/b/h/e;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    const-string v2, "pm"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lnet/youmi/android/a/b/h/e;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lnet/youmi/android/a/b/h/e;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    const-string v2, "req_type"

    invoke-virtual {p2}, Lnet/youmi/android/a/b/i/c;->l()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    const-string v2, "bl"

    invoke-virtual {p4}, Lnet/youmi/android/a/b/i/a;->d()J

    move-result-wide v4

    invoke-virtual {v1, v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2

    move v1, v0

    :goto_0
    :try_start_1
    invoke-virtual {p3}, Lnet/youmi/android/a/b/i/b;->b()[Lorg/apache/http/Header;

    move-result-object v3

    array-length v3, v3

    if-ge v1, v3, :cond_2

    invoke-virtual {p3}, Lnet/youmi/android/a/b/i/b;->b()[Lorg/apache/http/Header;

    move-result-object v3

    aget-object v3, v3, v1

    if-eqz v3, :cond_1

    invoke-interface {v3}, Lorg/apache/http/Header;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catch_0
    move-exception v1

    :cond_2
    :try_start_2
    iget-object v1, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    const-string v3, "req-header"

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2

    move v1, v0

    :goto_1
    :try_start_3
    invoke-virtual {p3}, Lnet/youmi/android/a/b/i/b;->g()[Lorg/apache/http/Header;

    move-result-object v3

    array-length v3, v3

    if-ge v1, v3, :cond_4

    invoke-virtual {p3}, Lnet/youmi/android/a/b/i/b;->g()[Lorg/apache/http/Header;

    move-result-object v3

    aget-object v3, v3, v1

    if-eqz v3, :cond_3

    invoke-interface {v3}, Lorg/apache/http/Header;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :catch_1
    move-exception v1

    :cond_4
    :try_start_4
    iget-object v1, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    const-string v3, "rsp-header"

    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    const-string v2, "exception"

    invoke-virtual {p3}, Lnet/youmi/android/a/b/i/b;->c()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    invoke-virtual {p2}, Lnet/youmi/android/a/b/i/c;->b()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p2}, Lnet/youmi/android/a/b/i/c;->k()[B

    move-result-object v1

    if-eqz v2, :cond_6

    if-eqz v1, :cond_6

    if-eqz v2, :cond_7

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_7

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    move v1, v0

    :goto_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_5

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/http/NameValuePair;

    invoke-interface {v0}, Lorg/apache/http/NameValuePair;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0}, Lorg/apache/http/NameValuePair;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    const-string v1, "post-data"

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_6
    :goto_3
    return-void

    :cond_7
    if-eqz v1, :cond_6

    array-length v0, v1

    if-ltz v0, :cond_6

    iget-object v0, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    const-string v2, "post-data"

    new-instance v3, Ljava/lang/String;

    const-string v4, "UTF-8"

    invoke-direct {v3, v1, v4}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_3

    :catch_2
    move-exception v0

    goto :goto_3
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/a/b/i/a/a;->b:Landroid/content/Context;

    iget-object v1, p0, Lnet/youmi/android/a/b/i/a/a;->a:Lorg/json/JSONObject;

    invoke-static {v0, v1}, Lnet/youmi/android/a/b/i/f;->a(Landroid/content/Context;Lorg/json/JSONObject;)V

    return-void
.end method
