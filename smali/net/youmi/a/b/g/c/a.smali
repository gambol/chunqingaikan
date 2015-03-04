.class public Lnet/youmi/android/a/b/g/c/a;
.super Ljava/lang/Object;


# instance fields
.field private a:J

.field private b:J

.field private c:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;JJ)V
    .locals 2

    const-wide/16 v0, -0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide v0, p0, Lnet/youmi/android/a/b/g/c/a;->a:J

    iput-wide v0, p0, Lnet/youmi/android/a/b/g/c/a;->b:J

    if-nez p1, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "directory must not be null"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/io/IOException;

    const-string v1, "please set a file cache directory"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput-object p1, p0, Lnet/youmi/android/a/b/g/c/a;->c:Ljava/io/File;

    iput-wide p2, p0, Lnet/youmi/android/a/b/g/c/a;->b:J

    iput-wide p4, p0, Lnet/youmi/android/a/b/g/c/a;->a:J

    invoke-direct {p0}, Lnet/youmi/android/a/b/g/c/a;->b()V

    invoke-direct {p0}, Lnet/youmi/android/a/b/g/c/a;->c()V

    return-void
.end method

.method static synthetic a(Lnet/youmi/android/a/b/g/c/a;)Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/g/c/a;->c:Ljava/io/File;

    return-object v0
.end method

.method private a(Ljava/io/File;)Z
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-wide v2, p0, Lnet/youmi/android/a/b/g/c/a;->a:J

    const-wide/16 v4, -0x1

    cmp-long v1, v2, v4

    if-eqz v1, :cond_0

    iget-wide v2, p0, Lnet/youmi/android/a/b/g/c/a;->a:J

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-lez v1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    move-result-wide v4

    sub-long/2addr v2, v4

    iget-wide v4, p0, Lnet/youmi/android/a/b/g/c/a;->a:J

    cmp-long v1, v2, v4

    if-lez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method static synthetic a(Lnet/youmi/android/a/b/g/c/a;Ljava/io/File;)Z
    .locals 1

    invoke-direct {p0, p1}, Lnet/youmi/android/a/b/g/c/a;->a(Ljava/io/File;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lnet/youmi/android/a/b/g/c/a;)J
    .locals 2

    iget-wide v0, p0, Lnet/youmi/android/a/b/g/c/a;->b:J

    return-wide v0
.end method

.method private b()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/c/a;->c:Ljava/io/File;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/b/g/c/a;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/b/g/c/a;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private c()V
    .locals 4

    const-wide/16 v2, 0x0

    :try_start_0
    iget-wide v0, p0, Lnet/youmi/android/a/b/g/c/a;->b:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    iget-wide v0, p0, Lnet/youmi/android/a/b/g/c/a;->a:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-static {}, Lnet/youmi/android/a/b/h/c;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lnet/youmi/android/a/b/g/c/b;

    invoke-direct {v1, p0}, Lnet/youmi/android/a/b/g/c/b;-><init>(Lnet/youmi/android/a/b/g/c/a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public a()[Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/g/c/a;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lnet/youmi/android/a/b/g/c/a;->c:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;)Ljava/io/File;
    .locals 2

    :try_start_0
    invoke-virtual {p0, p1}, Lnet/youmi/android/a/b/g/c/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method
