.class public Lnet/youmi/android/a/a/c/a;
.super Ljava/lang/Object;


# direct methods
.method public static a()I
    .locals 1

    :try_start_0
    invoke-static {}, Lnet/youmi/android/a/b/h/e;->e()I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Lnet/youmi/android/a/a/i/a/a/c;)Landroid/webkit/WebChromeClient;
    .locals 1

    :try_start_0
    invoke-static {p1}, Lnet/youmi/android/a/a/c/g;->a(Lnet/youmi/android/a/a/i/a/a/c;)Lnet/youmi/android/a/a/c/g;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Lnet/youmi/android/a/a/i/a/b/f;)Landroid/webkit/WebViewClient;
    .locals 2

    :try_start_0
    invoke-static {}, Lnet/youmi/android/a/a/c/a;->a()I

    move-result v0

    const/16 v1, 0x8

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lnet/youmi/android/a/a/c/i;->a(Lnet/youmi/android/a/a/i/a/b/f;)Lnet/youmi/android/a/a/c/i;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {p0}, Lnet/youmi/android/a/a/c/h;->a(Lnet/youmi/android/a/a/i/a/b/f;)Lnet/youmi/android/a/a/c/h;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    :try_start_0
    check-cast p0, Landroid/app/Activity;

    const/high16 v0, 0x10a0000

    const v1, 0x10a0001

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Landroid/webkit/WebSettings;)V
    .locals 1

    :try_start_0
    invoke-static {p0, p1}, Lnet/youmi/android/a/a/c/j;->a(Landroid/content/Context;Landroid/webkit/WebSettings;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
