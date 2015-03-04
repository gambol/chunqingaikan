.class Lnet/youmi/android/c/a/n;
.super Ljava/lang/Thread;


# instance fields
.field final synthetic a:Lnet/youmi/android/c/a/k;


# direct methods
.method private constructor <init>(Lnet/youmi/android/c/a/k;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/c/a/n;->a:Lnet/youmi/android/c/a/k;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lnet/youmi/android/c/a/k;Lnet/youmi/android/c/a/l;)V
    .locals 0

    invoke-direct {p0, p1}, Lnet/youmi/android/c/a/n;-><init>(Lnet/youmi/android/c/a/k;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    const-wide/16 v4, 0x32

    iget-object v0, p0, Lnet/youmi/android/c/a/n;->a:Lnet/youmi/android/c/a/k;

    invoke-static {v0}, Lnet/youmi/android/c/a/k;->d(Lnet/youmi/android/c/a/k;)Lnet/youmi/android/c/a/i;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lnet/youmi/android/c/a/n;->a:Lnet/youmi/android/c/a/k;

    invoke-static {v0}, Lnet/youmi/android/c/a/k;->g(Lnet/youmi/android/c/a/k;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lnet/youmi/android/c/a/n;->a:Lnet/youmi/android/c/a/k;

    invoke-static {v0}, Lnet/youmi/android/c/a/k;->d(Lnet/youmi/android/c/a/k;)Lnet/youmi/android/c/a/i;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/c/a/i;->d()Lnet/youmi/android/c/a/j;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-static {v4, v5}, Landroid/os/SystemClock;->sleep(J)V

    :cond_2
    :goto_1
    iget-object v0, p0, Lnet/youmi/android/c/a/n;->a:Lnet/youmi/android/c/a/k;

    invoke-static {v0}, Lnet/youmi/android/c/a/k;->e(Lnet/youmi/android/c/a/k;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/c/a/n;->a:Lnet/youmi/android/c/a/k;

    invoke-static {v0}, Lnet/youmi/android/c/a/k;->d(Lnet/youmi/android/c/a/k;)Lnet/youmi/android/c/a/i;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/c/a/i;->b()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lnet/youmi/android/c/a/n;->a:Lnet/youmi/android/c/a/k;

    invoke-static {v0}, Lnet/youmi/android/c/a/k;->d(Lnet/youmi/android/c/a/k;)Lnet/youmi/android/c/a/i;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/c/a/i;->d()Lnet/youmi/android/c/a/j;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/c/a/n;->a:Lnet/youmi/android/c/a/k;

    iget-object v0, v0, Lnet/youmi/android/c/a/j;->a:Landroid/graphics/Bitmap;

    invoke-static {v1, v0}, Lnet/youmi/android/c/a/k;->a(Lnet/youmi/android/c/a/k;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    iget-object v0, p0, Lnet/youmi/android/c/a/n;->a:Lnet/youmi/android/c/a/k;

    invoke-static {v0}, Lnet/youmi/android/c/a/k;->d(Lnet/youmi/android/c/a/k;)Lnet/youmi/android/c/a/i;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/c/a/i;->a()V

    iget-object v0, p0, Lnet/youmi/android/c/a/n;->a:Lnet/youmi/android/c/a/k;

    invoke-static {v0}, Lnet/youmi/android/c/a/k;->f(Lnet/youmi/android/c/a/k;)V

    goto :goto_0

    :cond_3
    iget-object v1, v0, Lnet/youmi/android/c/a/j;->a:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lnet/youmi/android/c/a/n;->a:Lnet/youmi/android/c/a/k;

    iget-object v2, v0, Lnet/youmi/android/c/a/j;->a:Landroid/graphics/Bitmap;

    invoke-static {v1, v2}, Lnet/youmi/android/c/a/k;->a(Lnet/youmi/android/c/a/k;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    :cond_4
    :goto_2
    iget v0, v0, Lnet/youmi/android/c/a/j;->b:I

    int-to-long v0, v0

    iget-object v2, p0, Lnet/youmi/android/c/a/n;->a:Lnet/youmi/android/c/a/k;

    invoke-static {v2}, Lnet/youmi/android/c/a/k;->h(Lnet/youmi/android/c/a/k;)Landroid/os/Handler;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lnet/youmi/android/c/a/n;->a:Lnet/youmi/android/c/a/k;

    invoke-static {v2}, Lnet/youmi/android/c/a/k;->f(Lnet/youmi/android/c/a/k;)V

    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_1

    :cond_5
    iget-object v1, v0, Lnet/youmi/android/c/a/j;->c:Ljava/lang/String;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lnet/youmi/android/c/a/n;->a:Lnet/youmi/android/c/a/k;

    iget-object v2, v0, Lnet/youmi/android/c/a/j;->c:Ljava/lang/String;

    invoke-static {v2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-static {v1, v2}, Lnet/youmi/android/c/a/k;->a(Lnet/youmi/android/c/a/k;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    goto :goto_2

    :cond_6
    invoke-static {v4, v5}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_1
.end method
