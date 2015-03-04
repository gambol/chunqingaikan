.class public Lnet/youmi/android/a/b/c/e;
.super Ljava/lang/Object;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lnet/youmi/android/a/b/c/g;


# direct methods
.method constructor <init>(Ljava/lang/String;Lnet/youmi/android/a/b/c/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/youmi/android/a/b/c/e;->a:Ljava/lang/String;

    iput-object p2, p0, Lnet/youmi/android/a/b/c/e;->b:Lnet/youmi/android/a/b/c/g;

    return-void
.end method


# virtual methods
.method protected a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/c/e;->a:Ljava/lang/String;

    return-object v0
.end method

.method protected a(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/c/e;->b:Lnet/youmi/android/a/b/c/g;

    invoke-virtual {v0, p1}, Lnet/youmi/android/a/b/c/g;->b(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method protected a(Ljava/lang/String;[BJI)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    :try_start_0
    iget-object v1, p0, Lnet/youmi/android/a/b/c/e;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lnet/youmi/android/a/b/c/e;->b:Lnet/youmi/android/a/b/c/g;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-static {p1}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lnet/youmi/android/a/b/c/e;->a:Ljava/lang/String;

    invoke-static {p2, v1, p5}, Lnet/youmi/android/a/b/c/c;->a([BLjava/lang/String;I)[B

    move-result-object v1

    iget-object v2, p0, Lnet/youmi/android/a/b/c/e;->b:Lnet/youmi/android/a/b/c/g;

    invoke-virtual {v2, p1, v1, p3, p4}, Lnet/youmi/android/a/b/c/g;->a(Ljava/lang/String;[BJ)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method protected a(Ljava/lang/String;I)[B
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lnet/youmi/android/a/b/c/e;->b:Lnet/youmi/android/a/b/c/g;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lnet/youmi/android/a/b/c/e;->a:Ljava/lang/String;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    invoke-static {p1}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lnet/youmi/android/a/b/c/e;->b:Lnet/youmi/android/a/b/c/g;

    invoke-virtual {v1, p1}, Lnet/youmi/android/a/b/c/g;->a(Ljava/lang/String;)[B

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lnet/youmi/android/a/b/c/e;->a:Ljava/lang/String;

    invoke-static {v1, v2, p2}, Lnet/youmi/android/a/b/c/c;->b([BLjava/lang/String;I)[B
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method protected b()Lnet/youmi/android/a/b/c/g;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/c/e;->b:Lnet/youmi/android/a/b/c/g;

    return-object v0
.end method
