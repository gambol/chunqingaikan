.class public Lnet/youmi/android/offers/f/e;
.super Lnet/youmi/android/a/b/g/c;


# static fields
.field private static a:Lnet/youmi/android/offers/f/e;

.field private static b:Landroid/content/Context;


# instance fields
.field private c:I

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/b/g/c/a;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lnet/youmi/android/a/b/g/c;-><init>(Landroid/content/Context;Lnet/youmi/android/a/b/g/c/a;)V

    const/4 v0, 0x0

    iput v0, p0, Lnet/youmi/android/offers/f/e;->c:I

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/offers/f/e;->b:Landroid/content/Context;

    return-void
.end method

.method static synthetic a()Landroid/content/Context;
    .locals 1

    sget-object v0, Lnet/youmi/android/offers/f/e;->b:Landroid/content/Context;

    return-object v0
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lnet/youmi/android/offers/f/e;
    .locals 4

    const-class v1, Lnet/youmi/android/offers/f/e;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/offers/f/e;->a:Lnet/youmi/android/offers/f/e;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v2, Lnet/youmi/android/offers/f/e;

    const/4 v3, 0x1

    invoke-static {v0, v3}, Lnet/youmi/android/a/a/d/a/b;->b(Landroid/content/Context;I)Lnet/youmi/android/a/a/d/a/a;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Lnet/youmi/android/offers/f/e;-><init>(Landroid/content/Context;Lnet/youmi/android/a/b/g/c/a;)V

    sput-object v2, Lnet/youmi/android/offers/f/e;->a:Lnet/youmi/android/offers/f/e;

    :cond_0
    sget-object v0, Lnet/youmi/android/offers/f/e;->a:Lnet/youmi/android/offers/f/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method static synthetic a(Lnet/youmi/android/offers/f/e;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lnet/youmi/android/offers/f/e;->c(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/io/File;)Z
    .locals 2

    const/4 v0, 0x1

    sget-boolean v1, Lnet/youmi/android/offers/f/a;->b:Z

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Lnet/youmi/android/offers/f/e;->d:Ljava/lang/String;

    invoke-static {v1}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lnet/youmi/android/offers/f/e;->d:Ljava/lang/String;

    invoke-static {p1, v1}, Lnet/youmi/android/a/b/d/g;->a(Ljava/io/File;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_2
    const-string v0, "ow md5 error, please contact us"

    invoke-direct {p0, v0}, Lnet/youmi/android/offers/f/e;->d(Ljava/lang/String;)V

    invoke-static {}, Lnet/youmi/android/a/a/i/a/b/g;->a()Lnet/youmi/android/a/a/i/a/b/g;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b/g;->c()V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c(Ljava/lang/String;)V
    .locals 6

    const-wide/16 v4, -0x1

    iget v0, p0, Lnet/youmi/android/offers/f/e;->c:I

    if-eqz v0, :cond_0

    sget-object v0, Lnet/youmi/android/offers/f/e;->b:Landroid/content/Context;

    sget-object v1, Lnet/youmi/android/offers/f/e;->b:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/offers/f/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lnet/youmi/android/offers/f/e;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2, v4, v5}, Lnet/youmi/android/offers/f/a/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)Z

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/offers/f/e;->d:Ljava/lang/String;

    invoke-static {v0}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lnet/youmi/android/offers/f/e;->b:Landroid/content/Context;

    sget-object v1, Lnet/youmi/android/offers/f/e;->b:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/offers/f/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lnet/youmi/android/offers/f/e;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2, v4, v5}, Lnet/youmi/android/offers/f/a/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)Z

    :cond_1
    invoke-static {p1}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lnet/youmi/android/offers/f/e;->b:Landroid/content/Context;

    sget-object v1, Lnet/youmi/android/offers/f/e;->b:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/offers/f/a;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1, v4, v5}, Lnet/youmi/android/offers/f/a/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)Z

    :cond_2
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 2

    :try_start_0
    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v0

    new-instance v1, Lnet/youmi/android/offers/f/g;

    invoke-direct {v1, p0, p1}, Lnet/youmi/android/offers/f/g;-><init>(Lnet/youmi/android/offers/f/e;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/b/k/m;->a(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private declared-synchronized o(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 7

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->g()Ljava/io/File;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    new-instance v1, Ljava/io/File;

    sget-object v2, Lnet/youmi/android/offers/f/e;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static {v0, v1}, Lnet/youmi/android/a/b/k/g;->a(Ljava/io/File;Ljava/io/File;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    sget-boolean v2, Lnet/youmi/android/offers/f/a;->b:Z

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_2
    new-instance v4, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ".zip"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-virtual {v1, v4}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sget-object v0, Lnet/youmi/android/offers/f/e;->b:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/offers/f/a;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    new-instance v0, Lnet/youmi/android/offers/f/f;

    move-object v1, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lnet/youmi/android/offers/f/f;-><init>(Lnet/youmi/android/offers/f/e;JLjava/io/File;Lnet/youmi/android/a/b/g/e/a;)V

    invoke-static {v4, v6, v0}, Lnet/youmi/android/a/b/k/p;->a(Ljava/io/File;Ljava/lang/String;Lnet/youmi/android/a/b/k/a/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public a(I)V
    .locals 0

    iput p1, p0, Lnet/youmi/android/offers/f/e;->c:I

    return-void
.end method

.method protected a(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 0

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/offers/f/e;->d:Ljava/lang/String;

    return-void
.end method

.method protected b(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 0

    return-void
.end method

.method protected b(Lnet/youmi/android/a/b/g/e/a;JJIJ)V
    .locals 0

    return-void
.end method

.method protected k(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 1

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->g()Ljava/io/File;

    move-result-object v0

    invoke-direct {p0, v0}, Lnet/youmi/android/offers/f/e;->a(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lnet/youmi/android/offers/f/e;->o(Lnet/youmi/android/a/b/g/e/a;)V

    :cond_0
    return-void
.end method

.method protected l(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 1

    invoke-static {}, Lnet/youmi/android/a/a/i/a/b/g;->a()Lnet/youmi/android/a/a/i/a/b/g;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b/g;->c()V

    return-void
.end method

.method protected m(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 1

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->g()Ljava/io/File;

    move-result-object v0

    invoke-direct {p0, v0}, Lnet/youmi/android/offers/f/e;->a(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lnet/youmi/android/offers/f/e;->o(Lnet/youmi/android/a/b/g/e/a;)V

    :cond_0
    return-void
.end method

.method protected n(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 0

    return-void
.end method
