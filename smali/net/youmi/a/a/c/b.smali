.class Lnet/youmi/android/a/a/c/b;
.super Landroid/webkit/WebChromeClient;


# instance fields
.field protected a:Lnet/youmi/android/a/a/i/a/a/c;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/a/i/a/a/c;)V
    .locals 0

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    iput-object p1, p0, Lnet/youmi/android/a/a/c/b;->a:Lnet/youmi/android/a/a/i/a/a/c;

    return-void
.end method


# virtual methods
.method public onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 2

    const/4 v0, 0x1

    :try_start_0
    iget-object v1, p0, Lnet/youmi/android/a/a/c/b;->a:Lnet/youmi/android/a/a/i/a/a/c;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/i/a/a/c;->h()Landroid/app/Activity;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p4}, Landroid/webkit/JsResult;->cancel()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return v0

    :catch_0
    move-exception v1

    :cond_0
    :try_start_1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    goto :goto_0

    :catch_1
    move-exception v1

    :try_start_2
    invoke-virtual {p4}, Landroid/webkit/JsResult;->cancel()V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_0

    :catch_2
    move-exception v1

    goto :goto_0
.end method

.method public onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 2

    const/4 v0, 0x1

    :try_start_0
    iget-object v1, p0, Lnet/youmi/android/a/a/c/b;->a:Lnet/youmi/android/a/a/i/a/a/c;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/i/a/a/c;->h()Landroid/app/Activity;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p4}, Landroid/webkit/JsResult;->cancel()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return v0

    :catch_0
    move-exception v1

    :cond_0
    :try_start_1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    goto :goto_0

    :catch_1
    move-exception v1

    :try_start_2
    invoke-virtual {p4}, Landroid/webkit/JsResult;->cancel()V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_0

    :catch_2
    move-exception v1

    goto :goto_0
.end method

.method public onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z
    .locals 2

    const/4 v0, 0x1

    :try_start_0
    iget-object v1, p0, Lnet/youmi/android/a/a/c/b;->a:Lnet/youmi/android/a/a/i/a/a/c;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/i/a/a/c;->h()Landroid/app/Activity;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    if-nez v1, :cond_0

    :try_start_1
    invoke-virtual {p5}, Landroid/webkit/JsPromptResult;->cancel()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_3

    :goto_0
    return v0

    :catch_0
    move-exception v1

    :cond_0
    :try_start_2
    invoke-super/range {p0 .. p5}, Landroid/webkit/WebChromeClient;->onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    move-result v0

    goto :goto_0

    :catch_1
    move-exception v1

    :try_start_3
    invoke-virtual {p5}, Landroid/webkit/JsPromptResult;->cancel()V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_0

    :catch_2
    move-exception v1

    goto :goto_0

    :catch_3
    move-exception v1

    goto :goto_0
.end method

.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/c/b;->a:Lnet/youmi/android/a/a/i/a/a/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/c/b;->a:Lnet/youmi/android/a/a/i/a/a/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/a/c;->f()Lnet/youmi/android/a/a/i/a/b/d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/c/b;->a:Lnet/youmi/android/a/a/i/a/a/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/a/c;->f()Lnet/youmi/android/a/a/i/a/b/d;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lnet/youmi/android/a/a/i/a/b/d;->a(Landroid/webkit/WebView;I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/c/b;->a:Lnet/youmi/android/a/a/i/a/a/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/c/b;->a:Lnet/youmi/android/a/a/i/a/a/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/a/c;->f()Lnet/youmi/android/a/a/i/a/b/d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/c/b;->a:Lnet/youmi/android/a/a/i/a/a/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/a/c;->f()Lnet/youmi/android/a/a/i/a/b/d;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lnet/youmi/android/a/a/i/a/b/d;->c(Landroid/webkit/WebView;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
