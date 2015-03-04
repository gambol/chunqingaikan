.class public Lnet/youmi/android/a/b/g/f/e;
.super Lnet/youmi/android/a/b/g/f/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x67

    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/g/f/a;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lnet/youmi/android/a/b/g/a/d;Lnet/youmi/android/a/b/g/e/a;Lnet/youmi/android/a/b/g/d/e;)V
    .locals 6

    invoke-super {p0, p1, p2, p3, p4}, Lnet/youmi/android/a/b/g/f/a;->a(Landroid/content/Context;Lnet/youmi/android/a/b/g/a/d;Lnet/youmi/android/a/b/g/e/a;Lnet/youmi/android/a/b/g/d/e;)V

    :try_start_0
    invoke-virtual {p2}, Lnet/youmi/android/a/b/g/a/d;->c()Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v0, 0x68

    invoke-virtual {p2, v0}, Lnet/youmi/android/a/b/g/a/d;->a(I)V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    const/16 v0, 0x68

    invoke-virtual {p2, v0}, Lnet/youmi/android/a/b/g/a/d;->a(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_1
    :try_start_1
    invoke-virtual {p3}, Lnet/youmi/android/a/b/g/e/a;->e()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-gtz v1, :cond_2

    invoke-virtual {p2}, Lnet/youmi/android/a/b/g/a/d;->g()Lnet/youmi/android/a/b/g/a/c;

    move-result-object v1

    invoke-virtual {v1}, Lnet/youmi/android/a/b/g/a/c;->e()J

    move-result-wide v2

    invoke-virtual {p3, v2, v3}, Lnet/youmi/android/a/b/g/e/a;->a(J)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :cond_2
    :goto_1
    :try_start_2
    invoke-virtual {p2}, Lnet/youmi/android/a/b/g/a/d;->f()Lnet/youmi/android/a/b/g/d/b;

    move-result-object v1

    if-nez v1, :cond_3

    invoke-interface {p4, p3}, Lnet/youmi/android/a/b/g/d/e;->b(Lnet/youmi/android/a/b/g/e/a;)V

    goto :goto_0

    :cond_3
    invoke-interface {v1, p3}, Lnet/youmi/android/a/b/g/d/b;->i(Lnet/youmi/android/a/b/g/e/a;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p4, p3}, Lnet/youmi/android/a/b/g/d/e;->b(Lnet/youmi/android/a/b/g/e/a;)V

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    const/16 v0, 0x68

    invoke-virtual {p2, v0}, Lnet/youmi/android/a/b/g/a/d;->a(I)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_1
.end method
