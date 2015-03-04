.class public Lnet/youmi/android/a/b/c/i;
.super Ljava/lang/Object;


# instance fields
.field a:Lnet/youmi/android/a/b/c/e;

.field private b:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lnet/youmi/android/a/b/c/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lnet/youmi/android/a/b/c/i;->b:I

    new-instance v0, Lnet/youmi/android/a/b/c/e;

    invoke-direct {v0, p1, p2}, Lnet/youmi/android/a/b/c/e;-><init>(Ljava/lang/String;Lnet/youmi/android/a/b/c/g;)V

    iput-object v0, p0, Lnet/youmi/android/a/b/c/i;->a:Lnet/youmi/android/a/b/c/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lnet/youmi/android/a/b/c/g;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lnet/youmi/android/a/b/c/i;-><init>(Ljava/lang/String;Lnet/youmi/android/a/b/c/g;)V

    iput p3, p0, Lnet/youmi/android/a/b/c/i;->b:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lnet/youmi/android/a/b/c/i;->b:I

    return v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/c/i;->a:Lnet/youmi/android/a/b/c/e;

    iget v1, p0, Lnet/youmi/android/a/b/c/i;->b:I

    invoke-virtual {v0, p1, v1}, Lnet/youmi/android/a/b/c/e;->a(Ljava/lang/String;I)[B

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/String;

    const-string v2, "UTF-8"

    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-lez v1, :cond_0

    move-object p2, v0

    :cond_0
    :goto_0
    return-object p2

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/c/i;->a:Lnet/youmi/android/a/b/c/e;

    invoke-virtual {v0, p1}, Lnet/youmi/android/a/b/c/e;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;J)Z
    .locals 7

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    :try_start_0
    const-string v1, "UTF-8"

    invoke-virtual {p2, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v3

    iget-object v1, p0, Lnet/youmi/android/a/b/c/i;->a:Lnet/youmi/android/a/b/c/e;

    iget v6, p0, Lnet/youmi/android/a/b/c/i;->b:I

    move-object v2, p1

    move-wide v4, p3

    invoke-virtual/range {v1 .. v6}, Lnet/youmi/android/a/b/c/e;->a(Ljava/lang/String;[BJI)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/c/i;->a:Lnet/youmi/android/a/b/c/e;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/c/e;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()Lnet/youmi/android/a/b/c/g;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/c/i;->a:Lnet/youmi/android/a/b/c/e;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/c/e;->b()Lnet/youmi/android/a/b/c/g;

    move-result-object v0

    return-object v0
.end method
