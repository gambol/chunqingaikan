.class Lnet/youmi/android/offers/f/f;
.super Ljava/lang/Object;

# interfaces
.implements Lnet/youmi/android/a/b/k/a/a;


# instance fields
.field final synthetic a:J

.field final synthetic b:Ljava/io/File;

.field final synthetic c:Lnet/youmi/android/a/b/g/e/a;

.field final synthetic d:Lnet/youmi/android/offers/f/e;


# direct methods
.method constructor <init>(Lnet/youmi/android/offers/f/e;JLjava/io/File;Lnet/youmi/android/a/b/g/e/a;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/offers/f/f;->d:Lnet/youmi/android/offers/f/e;

    iput-wide p2, p0, Lnet/youmi/android/offers/f/f;->a:J

    iput-object p4, p0, Lnet/youmi/android/offers/f/f;->b:Ljava/io/File;

    iput-object p5, p0, Lnet/youmi/android/offers/f/f;->c:Lnet/youmi/android/a/b/g/e/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(I)V
    .locals 0

    return-void
.end method

.method public a(II)V
    .locals 3

    new-instance v0, Ljava/io/File;

    invoke-static {}, Lnet/youmi/android/offers/f/e;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lnet/youmi/android/offers/f/a;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lnet/youmi/android/a/b/k/g;->a(Ljava/io/File;)V

    iget-object v0, p0, Lnet/youmi/android/offers/f/f;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/offers/f/f;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lnet/youmi/android/offers/f/e;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lnet/youmi/android/offers/f/a;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/io/File;

    invoke-static {}, Lnet/youmi/android/offers/f/e;->a()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lnet/youmi/android/offers/f/a;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    iget-object v0, p0, Lnet/youmi/android/offers/f/f;->d:Lnet/youmi/android/offers/f/e;

    iget-object v2, p0, Lnet/youmi/android/offers/f/f;->c:Lnet/youmi/android/a/b/g/e/a;

    invoke-virtual {v2}, Lnet/youmi/android/a/b/g/e/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lnet/youmi/android/offers/f/e;->a(Lnet/youmi/android/offers/f/e;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/a/e/g/e;->f(Ljava/lang/String;)V

    invoke-static {}, Lnet/youmi/android/a/a/i/a/b/g;->a()Lnet/youmi/android/a/a/i/a/b/g;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b/g;->c()V

    :cond_1
    return-void
.end method

.method public b()V
    .locals 1

    invoke-static {}, Lnet/youmi/android/a/a/i/a/b/g;->a()Lnet/youmi/android/a/a/i/a/b/g;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b/g;->c()V

    return-void
.end method
