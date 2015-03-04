.class Lnet/youmi/android/a/a/g/c/g;
.super Ljava/lang/Object;

# interfaces
.implements Lnet/youmi/android/a/b/g/d/a;


# instance fields
.field private a:Lnet/youmi/android/a/a/g/c/a;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/a/g/c/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/youmi/android/a/a/g/c/g;->a:Lnet/youmi/android/a/a/g/c/a;

    return-void
.end method

.method private a(Lnet/youmi/android/a/a/e/g/a;Lnet/youmi/android/a/a/e/g/f;IIJ)V
    .locals 7

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    :try_start_0
    invoke-virtual {p2}, Lnet/youmi/android/a/a/e/g/f;->c()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "a"

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/a;->f()Lnet/youmi/android/a/a/a/a/a;

    move-result-object v2

    invoke-virtual {v2}, Lnet/youmi/android/a/a/a/a/a;->a()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "b"

    invoke-virtual {v0, v1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    if-ltz p4, :cond_2

    const-string v1, "c"

    invoke-virtual {v0, v1, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    :cond_2
    const-wide/16 v2, 0x0

    cmp-long v1, p5, v2

    if-ltz v1, :cond_3

    const-string v1, "d"

    invoke-virtual {v0, v1, p5, p6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "javascript:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lnet/youmi/android/a/a/e/g/f;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lnet/youmi/android/a/a/e/g/f;->b()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lnet/youmi/android/a/a/e/f/a;->a()Lnet/youmi/android/a/a/e/f/a;

    move-result-object v0

    invoke-virtual {p2}, Lnet/youmi/android/a/a/e/g/f;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lnet/youmi/android/a/a/e/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private a(Lnet/youmi/android/a/b/g/e/a;IIJ)V
    .locals 8

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/g;->a:Lnet/youmi/android/a/a/g/c/a;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/g;->a:Lnet/youmi/android/a/a/g/c/a;

    invoke-virtual {v0, p1}, Lnet/youmi/android/a/a/g/c/a;->f_(Lnet/youmi/android/a/b/g/e/a;)Lnet/youmi/android/a/a/e/g/a;

    move-result-object v2

    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/g;->a:Lnet/youmi/android/a/a/g/c/a;

    invoke-virtual {v0, p1}, Lnet/youmi/android/a/a/g/c/a;->h(Lnet/youmi/android/a/b/g/e/a;)Lnet/youmi/android/a/a/e/g/f;

    move-result-object v3

    move-object v1, p0

    move v4, p2

    move v5, p3

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lnet/youmi/android/a/a/g/c/g;->a(Lnet/youmi/android/a/a/e/g/a;Lnet/youmi/android/a/a/e/g/f;IIJ)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public a(I)V
    .locals 0

    return-void
.end method

.method public a(Lnet/youmi/android/a/a/e/g/a;Lnet/youmi/android/a/a/e/g/f;)V
    .locals 8

    const/4 v4, 0x3

    const/4 v5, -0x1

    const-wide/16 v6, -0x1

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    :try_start_0
    invoke-direct/range {v1 .. v7}, Lnet/youmi/android/a/a/g/c/g;->a(Lnet/youmi/android/a/a/e/g/a;Lnet/youmi/android/a/a/e/g/f;IIJ)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public a(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 0

    return-void
.end method

.method public a(Lnet/youmi/android/a/b/g/e/a;JJIJ)V
    .locals 7

    const/4 v2, 0x2

    move-object v0, p0

    move-object v1, p1

    move v3, p6

    move-wide v4, p7

    :try_start_0
    invoke-direct/range {v0 .. v5}, Lnet/youmi/android/a/a/g/c/g;->a(Lnet/youmi/android/a/b/g/e/a;IIJ)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public b(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 6

    const/4 v2, 0x5

    const/4 v3, -0x1

    const-wide/16 v4, -0x1

    move-object v0, p0

    move-object v1, p1

    :try_start_0
    invoke-direct/range {v0 .. v5}, Lnet/youmi/android/a/a/g/c/g;->a(Lnet/youmi/android/a/b/g/e/a;IIJ)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public c(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 6

    const/4 v2, 0x1

    const/4 v3, -0x1

    const-wide/16 v4, -0x1

    move-object v0, p0

    move-object v1, p1

    :try_start_0
    invoke-direct/range {v0 .. v5}, Lnet/youmi/android/a/a/g/c/g;->a(Lnet/youmi/android/a/b/g/e/a;IIJ)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public d(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lnet/youmi/android/a/a/g/c/g;->a:Lnet/youmi/android/a/a/g/c/a;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/g/c/a;->b()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lnet/youmi/android/a/b/i/k;->a(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->e()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-gtz v1, :cond_0

    const-wide/32 v2, 0xa00000

    :cond_0
    iget-object v1, p0, Lnet/youmi/android/a/a/g/c/g;->a:Lnet/youmi/android/a/a/g/c/a;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/g/c/a;->b()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2, v3}, Lnet/youmi/android/a/b/k/n;->a(Landroid/content/Context;J)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-nez v1, :cond_1

    const/4 v0, 0x6

    :cond_1
    move v2, v0

    :goto_0
    const/4 v3, -0x1

    const-wide/16 v4, -0x1

    move-object v0, p0

    move-object v1, p1

    :try_start_1
    invoke-direct/range {v0 .. v5}, Lnet/youmi/android/a/a/g/c/g;->a(Lnet/youmi/android/a/b/g/e/a;IIJ)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :goto_1
    return-void

    :catch_0
    move-exception v1

    move v2, v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method public e(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 0

    return-void
.end method
