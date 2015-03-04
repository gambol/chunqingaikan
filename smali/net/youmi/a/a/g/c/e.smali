.class Lnet/youmi/android/a/a/g/c/e;
.super Ljava/lang/Object;

# interfaces
.implements Lnet/youmi/android/a/b/g/d/a;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lnet/youmi/android/a/a/g/c/a;


# direct methods
.method constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/a/g/c/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/a/g/c/e;->a:Landroid/content/Context;

    iput-object p2, p0, Lnet/youmi/android/a/a/g/c/e;->b:Lnet/youmi/android/a/a/g/c/a;

    return-void
.end method

.method static synthetic a(Lnet/youmi/android/a/a/g/c/e;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/e;->a:Landroid/content/Context;

    return-object v0
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    :try_start_0
    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v0

    new-instance v1, Lnet/youmi/android/a/a/g/c/f;

    invoke-direct {v1, p0, p1}, Lnet/youmi/android/a/a/g/c/f;-><init>(Lnet/youmi/android/a/a/g/c/e;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/b/k/m;->a(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private f(Lnet/youmi/android/a/b/g/e/a;)Lnet/youmi/android/a/a/e/g/a;
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lnet/youmi/android/a/a/g/c/e;->b:Lnet/youmi/android/a/a/g/c/a;

    if-eqz v1, :cond_0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->c()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/e;->b:Lnet/youmi/android/a/a/g/c/a;

    invoke-virtual {v0, p1}, Lnet/youmi/android/a/a/g/c/a;->f_(Lnet/youmi/android/a/b/g/e/a;)Lnet/youmi/android/a/a/e/g/a;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a(I)V
    .locals 0

    return-void
.end method

.method public a(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 1

    invoke-static {}, Lnet/youmi/android/a/a/h/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lnet/youmi/android/a/a/g/c/e;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Lnet/youmi/android/a/b/g/e/a;JJIJ)V
    .locals 0

    return-void
.end method

.method public b(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 4

    invoke-direct {p0, p1}, Lnet/youmi/android/a/a/g/c/e;->f(Lnet/youmi/android/a/b/g/e/a;)Lnet/youmi/android/a/a/e/g/a;

    move-result-object v2

    invoke-static {}, Lnet/youmi/android/a/a/h/a;->c()Ljava/lang/String;

    move-result-object v1

    const-string v0, ""

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lnet/youmi/android/a/a/e/g/a;->f()Lnet/youmi/android/a/a/a/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/a/a/a;->g()Lnet/youmi/android/a/a/a/a/g;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/a/a/g;->b()Ljava/lang/String;

    move-result-object v0

    :cond_0
    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {}, Lnet/youmi/android/a/a/h/a;->d()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-direct {p0, v0}, Lnet/youmi/android/a/a/g/c/e;->a(Ljava/lang/String;)V

    return-void

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method

.method public c(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 3

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->g()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->g()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->g()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, p1}, Lnet/youmi/android/a/a/g/c/e;->f(Lnet/youmi/android/a/b/g/e/a;)Lnet/youmi/android/a/a/e/g/a;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lnet/youmi/android/a/a/e/g/a;->d()Ljava/lang/String;

    move-result-object v0

    :cond_2
    if-eqz v0, :cond_0

    const-string v1, ""

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-direct {p0, v0}, Lnet/youmi/android/a/a/g/c/e;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public d(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 4

    :try_start_0
    invoke-static {}, Lnet/youmi/android/a/a/h/a;->j()Ljava/lang/String;

    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/e;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/b/i/k;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->e()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-gtz v2, :cond_0

    const-wide/32 v0, 0xa00000

    :cond_0
    iget-object v2, p0, Lnet/youmi/android/a/a/g/c/e;->a:Landroid/content/Context;

    invoke-static {v2, v0, v1}, Lnet/youmi/android/a/b/k/n;->a(Landroid/content/Context;J)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lnet/youmi/android/a/a/h/a;->l()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-direct {p0, v0}, Lnet/youmi/android/a/a/g/c/e;->a(Ljava/lang/String;)V

    :goto_1
    return-void

    :cond_1
    invoke-static {}, Lnet/youmi/android/a/a/h/a;->m()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-static {}, Lnet/youmi/android/a/a/h/a;->n()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method public e(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 0

    return-void
.end method
