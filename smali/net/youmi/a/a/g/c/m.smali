.class Lnet/youmi/android/a/a/g/c/m;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Lnet/youmi/android/a/a/g/c/a;

.field private final b:Lnet/youmi/android/a/b/g/e/a;


# direct methods
.method public constructor <init>(Lnet/youmi/android/a/a/g/c/a;Lnet/youmi/android/a/b/g/e/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/youmi/android/a/a/g/c/m;->a:Lnet/youmi/android/a/a/g/c/a;

    iput-object p2, p0, Lnet/youmi/android/a/a/g/c/m;->b:Lnet/youmi/android/a/b/g/e/a;

    return-void
.end method

.method private a(Ljava/io/File;)Ljava/lang/String;
    .locals 2

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/a/a/g/c/m;->a:Lnet/youmi/android/a/a/g/c/a;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/g/c/a;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "664"

    invoke-static {p1, v0}, Lnet/youmi/android/a/b/k/g;->a(Ljava/io/File;Ljava/lang/String;)Z

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a()V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/m;->a:Lnet/youmi/android/a/a/g/c/a;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/c/a;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/a/g/c/h;->a(Landroid/content/Context;)V

    return-void
.end method

.method private a(Ljava/lang/String;Lnet/youmi/android/a/a/e/g/a;Lnet/youmi/android/a/b/g/e/a;)V
    .locals 6

    if-nez p2, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    :try_start_0
    invoke-virtual {p2}, Lnet/youmi/android/a/a/e/g/a;->f()Lnet/youmi/android/a/a/a/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/a/a/a;->g()Lnet/youmi/android/a/a/a/a/g;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/a/a/g;->c()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p2}, Lnet/youmi/android/a/a/e/g/a;->g()Lnet/youmi/android/a/a/e/g/b;

    move-result-object v2

    new-instance v3, Lnet/youmi/android/a/a/a/b/a;

    invoke-static {}, Lnet/youmi/android/a/a/g/c/l;->b()Lnet/youmi/android/a/a/g/c/l;

    move-result-object v4

    invoke-direct {v3, v1, v4}, Lnet/youmi/android/a/a/a/b/a;-><init>(Ljava/lang/String;Lnet/youmi/android/a/a/a/b/b;)V

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lnet/youmi/android/a/a/e/g/b;->e()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v3, v2}, Lnet/youmi/android/a/a/a/b/a;->a(Lnet/youmi/android/a/a/e/g/b;)V

    :cond_2
    invoke-virtual {p2}, Lnet/youmi/android/a/a/e/g/a;->e()Z

    move-result v2

    invoke-virtual {v3, v2}, Lnet/youmi/android/a/a/a/b/a;->b(Z)V

    invoke-virtual {p2}, Lnet/youmi/android/a/a/e/g/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lnet/youmi/android/a/a/a/b/a;->c(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lnet/youmi/android/a/a/a/b/a;->b(J)V

    invoke-virtual {p2}, Lnet/youmi/android/a/a/e/g/a;->h()Z

    move-result v2

    invoke-virtual {v3, v2}, Lnet/youmi/android/a/a/a/b/a;->a(Z)V

    invoke-virtual {p2}, Lnet/youmi/android/a/a/e/g/a;->a()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lnet/youmi/android/a/a/a/b/a;->a(J)V

    invoke-virtual {v0}, Lnet/youmi/android/a/a/a/a/g;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lnet/youmi/android/a/a/a/b/a;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {p2}, Lnet/youmi/android/a/a/e/g/a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lnet/youmi/android/a/a/a/b/a;->e(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_3

    :goto_1
    if-eqz p1, :cond_3

    :try_start_2
    invoke-virtual {v3, p1}, Lnet/youmi/android/a/a/a/b/a;->d(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    :cond_3
    :goto_2
    :try_start_3
    invoke-static {p3}, Lnet/youmi/android/a/a/g/c/d;->f(Lnet/youmi/android/a/b/g/e/a;)I

    move-result v0

    iget-object v2, p0, Lnet/youmi/android/a/a/g/c/m;->a:Lnet/youmi/android/a/a/g/c/a;

    invoke-virtual {v2, p3}, Lnet/youmi/android/a/a/g/c/a;->j(Lnet/youmi/android/a/b/g/e/a;)I

    move-result v2

    new-instance v4, Lnet/youmi/android/a/a/g/c/k;

    invoke-direct {v4}, Lnet/youmi/android/a/a/g/c/k;-><init>()V

    invoke-virtual {v4, v0}, Lnet/youmi/android/a/a/g/c/k;->a(I)V

    invoke-virtual {v4, v2}, Lnet/youmi/android/a/a/g/c/k;->b(I)V

    invoke-virtual {v3, v4}, Lnet/youmi/android/a/a/a/b/a;->a(Lnet/youmi/android/a/a/a/b/c;)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2

    :goto_3
    :try_start_4
    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/m;->a:Lnet/youmi/android/a/a/g/c/a;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/c/a;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/a/a/b/d;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/a/b/d;

    move-result-object v0

    iget-object v2, p0, Lnet/youmi/android/a/a/g/c/m;->a:Lnet/youmi/android/a/a/g/c/a;

    invoke-virtual {v2}, Lnet/youmi/android/a/a/g/c/a;->b()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v2, v3}, Lnet/youmi/android/a/a/a/b/d;->a(Landroid/content/Context;Lnet/youmi/android/a/a/a/b/a;)Z

    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/m;->a:Lnet/youmi/android/a/a/g/c/a;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/c/a;->b()Landroid/content/Context;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ydic"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "1"

    const-wide/32 v4, 0x5265c00

    invoke-static {v0, v1, v2, v4, v5}, Lnet/youmi/android/a/b/c/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)Z
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_0

    :catch_1
    move-exception v0

    goto :goto_2

    :catch_2
    move-exception v0

    goto :goto_3

    :catch_3
    move-exception v0

    goto :goto_1
.end method

.method private b(Ljava/io/File;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/m;->a:Lnet/youmi/android/a/a/g/c/a;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/c/a;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lnet/youmi/android/a/b/k/j;->e(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/m;->b:Lnet/youmi/android/a/b/g/e/a;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/g/e/a;->g()Ljava/io/File;

    move-result-object v0

    invoke-direct {p0, v0}, Lnet/youmi/android/a/a/g/c/m;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/a/a/g/c/m;->a:Lnet/youmi/android/a/a/g/c/a;

    iget-object v2, p0, Lnet/youmi/android/a/a/g/c/m;->b:Lnet/youmi/android/a/b/g/e/a;

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/g/c/a;->f_(Lnet/youmi/android/a/b/g/e/a;)Lnet/youmi/android/a/a/e/g/a;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lnet/youmi/android/a/a/g/c/m;->b:Lnet/youmi/android/a/b/g/e/a;

    invoke-direct {p0, v0, v1, v2}, Lnet/youmi/android/a/a/g/c/m;->a(Ljava/lang/String;Lnet/youmi/android/a/a/e/g/a;Lnet/youmi/android/a/b/g/e/a;)V

    :cond_0
    invoke-direct {p0}, Lnet/youmi/android/a/a/g/c/m;->a()V

    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/m;->b:Lnet/youmi/android/a/b/g/e/a;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/g/e/a;->g()Ljava/io/File;

    move-result-object v0

    invoke-direct {p0, v0}, Lnet/youmi/android/a/a/g/c/m;->b(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
