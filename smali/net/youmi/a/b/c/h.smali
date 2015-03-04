.class public Lnet/youmi/android/a/b/c/h;
.super Ljava/lang/Object;


# instance fields
.field private a:Lnet/youmi/android/a/b/c/i;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lnet/youmi/android/a/b/c/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lnet/youmi/android/a/b/c/i;

    invoke-direct {v0, p2, p3}, Lnet/youmi/android/a/b/c/i;-><init>(Ljava/lang/String;Lnet/youmi/android/a/b/c/g;)V

    iput-object v0, p0, Lnet/youmi/android/a/b/c/h;->a:Lnet/youmi/android/a/b/c/i;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lnet/youmi/android/a/b/c/g;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lnet/youmi/android/a/b/c/i;

    invoke-direct {v0, p2, p3, p4}, Lnet/youmi/android/a/b/c/i;-><init>(Ljava/lang/String;Lnet/youmi/android/a/b/c/g;I)V

    iput-object v0, p0, Lnet/youmi/android/a/b/c/h;->a:Lnet/youmi/android/a/b/c/i;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/c/h;->a:Lnet/youmi/android/a/b/c/i;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/c/i;->a()I

    move-result v0

    return v0
.end method

.method public a(Lnet/youmi/android/a/b/c/d;)Z
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    :try_start_0
    invoke-interface {p1}, Lnet/youmi/android/a/b/c/d;->n()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Lnet/youmi/android/a/b/c/d;->l()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lnet/youmi/android/a/b/c/h;->a:Lnet/youmi/android/a/b/c/i;

    invoke-interface {p1}, Lnet/youmi/android/a/b/c/d;->m()J

    move-result-wide v4

    invoke-virtual {v3, v1, v2, v4, v5}, Lnet/youmi/android/a/b/c/i;->a(Ljava/lang/String;Ljava/lang/String;J)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public b()Lnet/youmi/android/a/b/c/g;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/c/h;->a:Lnet/youmi/android/a/b/c/i;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/c/i;->c()Lnet/youmi/android/a/b/c/g;

    move-result-object v0

    return-object v0
.end method

.method public b(Lnet/youmi/android/a/b/c/d;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    :try_start_0
    invoke-interface {p1}, Lnet/youmi/android/a/b/c/d;->n()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lnet/youmi/android/a/b/c/h;->a:Lnet/youmi/android/a/b/c/i;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Lnet/youmi/android/a/b/c/i;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v1}, Lnet/youmi/android/a/b/c/d;->a(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/c/h;->a:Lnet/youmi/android/a/b/c/i;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/c/i;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/c/h;->a:Lnet/youmi/android/a/b/c/i;

    invoke-virtual {v0, p1}, Lnet/youmi/android/a/b/c/i;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
