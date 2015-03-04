.class public abstract Lnet/youmi/android/a/a/d/a;
.super Lnet/youmi/android/a/b/g/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lnet/youmi/android/a/b/g/a;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Lnet/youmi/android/a/b/g/e/a;

    invoke-direct {v1, p1, p2}, Lnet/youmi/android/a/b/g/e/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Lnet/youmi/android/a/a/d/a;->a(Lnet/youmi/android/a/b/g/e/a;Ljava/lang/String;)Ljava/io/File;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method protected final a()Lnet/youmi/android/a/b/g/b/b;
    .locals 1

    invoke-static {}, Lnet/youmi/android/a/b/g/b/c;->a()Lnet/youmi/android/a/b/g/b/c;

    move-result-object v0

    return-object v0
.end method

.method protected final a(Lnet/youmi/android/a/b/g/e/a;)Lnet/youmi/android/a/b/g/c/a;
    .locals 2

    invoke-virtual {p0}, Lnet/youmi/android/a/a/d/a;->b()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lnet/youmi/android/a/a/d/a/b;->c(Landroid/content/Context;I)Lnet/youmi/android/a/a/d/a/a;

    move-result-object v0

    return-object v0
.end method
