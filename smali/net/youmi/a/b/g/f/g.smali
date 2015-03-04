.class public Lnet/youmi/android/a/b/g/f/g;
.super Lnet/youmi/android/a/b/g/f/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x64

    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/g/f/a;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lnet/youmi/android/a/b/g/a/d;Lnet/youmi/android/a/b/g/e/a;Lnet/youmi/android/a/b/g/d/e;)V
    .locals 2

    invoke-super {p0, p1, p2, p3, p4}, Lnet/youmi/android/a/b/g/f/a;->a(Landroid/content/Context;Lnet/youmi/android/a/b/g/a/d;Lnet/youmi/android/a/b/g/e/a;Lnet/youmi/android/a/b/g/d/e;)V

    if-eqz p3, :cond_0

    :try_start_0
    invoke-virtual {p3}, Lnet/youmi/android/a/b/g/e/a;->d()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/16 v0, 0x68

    invoke-virtual {p2, v0}, Lnet/youmi/android/a/b/g/a/d;->a(I)V

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p2}, Lnet/youmi/android/a/b/g/a/d;->c()Ljava/io/File;

    move-result-object v0

    invoke-virtual {p2}, Lnet/youmi/android/a/b/g/a/d;->d()Ljava/io/File;

    move-result-object v1

    if-nez v0, :cond_2

    if-nez v1, :cond_2

    const/16 v0, 0x68

    invoke-virtual {p2, v0}, Lnet/youmi/android/a/b/g/a/d;->a(I)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x69

    invoke-virtual {p2, v0}, Lnet/youmi/android/a/b/g/a/d;->a(I)V

    goto :goto_0

    :cond_3
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p2}, Lnet/youmi/android/a/b/g/a/d;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p4, p3}, Lnet/youmi/android/a/b/g/d/e;->f(Lnet/youmi/android/a/b/g/e/a;)V

    const/16 v0, 0x6a

    invoke-virtual {p2, v0}, Lnet/youmi/android/a/b/g/a/d;->a(I)V

    goto :goto_0

    :cond_4
    const/16 v0, 0x65

    invoke-virtual {p2, v0}, Lnet/youmi/android/a/b/g/a/d;->a(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0
.end method
