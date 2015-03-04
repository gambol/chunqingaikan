.class public Lnet/youmi/android/a/a/e/e/c;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroid/content/Context;Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    :try_start_0
    new-instance v0, Lnet/youmi/android/a/a/e/e/d;

    invoke-direct {v0, p0, p2, p1}, Lnet/youmi/android/a/a/e/e/d;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/webkit/WebView;)V

    invoke-static {v0}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method
