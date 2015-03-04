.class Lnet/youmi/android/a/a/c/h;
.super Landroid/webkit/WebViewClient;


# instance fields
.field private a:Lnet/youmi/android/a/a/i/a/b/f;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/a/i/a/b/f;)V
    .locals 0

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    iput-object p1, p0, Lnet/youmi/android/a/a/c/h;->a:Lnet/youmi/android/a/a/i/a/b/f;

    return-void
.end method

.method static a(Lnet/youmi/android/a/a/i/a/b/f;)Lnet/youmi/android/a/a/c/h;
    .locals 1

    :try_start_0
    new-instance v0, Lnet/youmi/android/a/a/c/h;

    invoke-direct {v0, p0}, Lnet/youmi/android/a/a/c/h;-><init>(Lnet/youmi/android/a/a/i/a/b/f;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/c/h;->a:Lnet/youmi/android/a/a/i/a/b/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/c/h;->a:Lnet/youmi/android/a/a/i/a/b/f;

    invoke-interface {v0, p1, p2}, Lnet/youmi/android/a/a/i/a/b/f;->a(Landroid/webkit/WebView;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/c/h;->a:Lnet/youmi/android/a/a/i/a/b/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/c/h;->a:Lnet/youmi/android/a/a/i/a/b/f;

    invoke-interface {v0, p1, p2, p3}, Lnet/youmi/android/a/a/i/a/b/f;->a(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/c/h;->a:Lnet/youmi/android/a/a/i/a/b/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/c/h;->a:Lnet/youmi/android/a/a/i/a/b/f;

    invoke-interface {v0, p1, p2, p3, p4}, Lnet/youmi/android/a/a/i/a/b/f;->a(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/c/h;->a:Lnet/youmi/android/a/a/i/a/b/f;

    invoke-interface {v0, p1, p2}, Lnet/youmi/android/a/a/i/a/b/f;->b(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
