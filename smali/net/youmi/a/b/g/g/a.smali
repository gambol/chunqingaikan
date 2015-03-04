.class public Lnet/youmi/android/a/b/g/g/a;
.super Landroid/webkit/WebView;

# interfaces
.implements Landroid/webkit/DownloadListener;
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Lnet/youmi/android/a/b/g/d/f;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/b/g/d/f;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/youmi/android/a/b/g/g/a;->d:Z

    invoke-virtual {p0, p0}, Lnet/youmi/android/a/b/g/g/a;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    iput-object p2, p0, Lnet/youmi/android/a/b/g/g/a;->a:Lnet/youmi/android/a/b/g/d/f;

    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/g/a;->a()V

    new-instance v0, Lnet/youmi/android/a/b/g/g/b;

    invoke-direct {v0}, Lnet/youmi/android/a/b/g/g/b;-><init>()V

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/b/g/g/a;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    new-instance v0, Lnet/youmi/android/a/b/g/g/c;

    invoke-direct {v0}, Lnet/youmi/android/a/b/g/g/c;-><init>()V

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/b/g/g/a;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    iput-object p3, p0, Lnet/youmi/android/a/b/g/g/a;->c:Ljava/lang/String;

    iput-object p4, p0, Lnet/youmi/android/a/b/g/g/a;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/g/a;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/g/g/a;->c:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/b/g/g/a;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method public onDownloadStart(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 7

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/g/a;->a:Lnet/youmi/android/a/b/g/d/f;

    if-eqz v0, :cond_0

    new-instance v2, Lnet/youmi/android/a/b/g/e/a;

    iget-object v0, p0, Lnet/youmi/android/a/b/g/g/a;->b:Ljava/lang/String;

    invoke-direct {v2, p1, v0, p5, p6}, Lnet/youmi/android/a/b/g/e/a;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    iget-object v0, p0, Lnet/youmi/android/a/b/g/g/a;->c:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lnet/youmi/android/a/b/g/e/a;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lnet/youmi/android/a/b/g/g/a;->a:Lnet/youmi/android/a/b/g/d/f;

    move-object v1, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-interface/range {v0 .. v5}, Lnet/youmi/android/a/b/g/d/f;->a(Lnet/youmi/android/a/b/g/g/a;Lnet/youmi/android/a/b/g/e/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/youmi/android/a/b/g/g/a;->d:Z

    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public run()V
    .locals 3

    const-wide/32 v0, 0xea60

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    :try_start_1
    iget-object v0, p0, Lnet/youmi/android/a/b/g/g/a;->a:Lnet/youmi/android/a/b/g/d/f;

    if-nez v0, :cond_0

    :goto_1
    return-void

    :cond_0
    iget-boolean v0, p0, Lnet/youmi/android/a/b/g/g/a;->d:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/b/g/g/a;->a:Lnet/youmi/android/a/b/g/d/f;

    invoke-interface {v0, p0}, Lnet/youmi/android/a/b/g/d/f;->a(Lnet/youmi/android/a/b/g/g/a;)V

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_1
    new-instance v0, Lnet/youmi/android/a/b/g/e/a;

    iget-object v1, p0, Lnet/youmi/android/a/b/g/g/a;->c:Ljava/lang/String;

    iget-object v2, p0, Lnet/youmi/android/a/b/g/g/a;->b:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lnet/youmi/android/a/b/g/e/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lnet/youmi/android/a/b/g/g/a;->a:Lnet/youmi/android/a/b/g/d/f;

    invoke-interface {v1, p0, v0}, Lnet/youmi/android/a/b/g/d/f;->a(Lnet/youmi/android/a/b/g/g/a;Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0
.end method
