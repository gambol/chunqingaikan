.class Lnet/youmi/android/c/a/l;
.super Landroid/os/Handler;


# instance fields
.field final synthetic a:Lnet/youmi/android/c/a/k;


# direct methods
.method constructor <init>(Lnet/youmi/android/c/a/k;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/c/a/l;->a:Lnet/youmi/android/c/a/k;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/c/a/l;->a:Lnet/youmi/android/c/a/k;

    invoke-static {v0}, Lnet/youmi/android/c/a/k;->a(Lnet/youmi/android/c/a/k;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/c/a/l;->a:Lnet/youmi/android/c/a/k;

    invoke-static {v0}, Lnet/youmi/android/c/a/k;->a(Lnet/youmi/android/c/a/k;)Landroid/view/View;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v2, p0, Lnet/youmi/android/c/a/l;->a:Lnet/youmi/android/c/a/k;

    invoke-static {v2}, Lnet/youmi/android/c/a/k;->b(Lnet/youmi/android/c/a/k;)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/c/a/l;->a:Lnet/youmi/android/c/a/k;

    invoke-static {v0}, Lnet/youmi/android/c/a/k;->c(Lnet/youmi/android/c/a/k;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "GifView"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method
