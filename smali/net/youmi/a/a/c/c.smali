.class Lnet/youmi/android/a/a/c/c;
.super Lnet/youmi/android/a/a/c/b;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/a/i/a/a/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lnet/youmi/android/a/a/c/b;-><init>(Lnet/youmi/android/a/a/i/a/a/c;)V

    return-void
.end method


# virtual methods
.method public onExceededDatabaseQuota(Ljava/lang/String;Ljava/lang/String;JJJLandroid/webkit/WebStorage$QuotaUpdater;)V
    .locals 3

    const-wide/16 v0, 0x2

    mul-long/2addr v0, p5

    :try_start_0
    invoke-interface {p9, v0, v1}, Landroid/webkit/WebStorage$QuotaUpdater;->updateQuota(J)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/c/c;->a:Lnet/youmi/android/a/a/i/a/a/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/a/c;->h()Landroid/app/Activity;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_1
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v0, 0x108009b

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "\u63d0\u793a"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "\u7ad9\u70b9 %s \u60f3\u83b7\u5f97\u60a8\u7684\u4f4d\u7f6e\u4fe1\u606f,\u662f\u5426\u5141\u8bb8?"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "\u5141\u8bb8\u672c\u6b21"

    new-instance v2, Lnet/youmi/android/a/a/c/f;

    invoke-direct {v2, p0, p2, p1}, Lnet/youmi/android/a/a/c/f;-><init>(Lnet/youmi/android/a/a/c/c;Landroid/webkit/GeolocationPermissions$Callback;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "\u603b\u662f\u5141\u8bb8"

    new-instance v2, Lnet/youmi/android/a/a/c/e;

    invoke-direct {v2, p0, p2, p1}, Lnet/youmi/android/a/a/c/e;-><init>(Lnet/youmi/android/a/a/c/c;Landroid/webkit/GeolocationPermissions$Callback;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "\u62d2\u7edd"

    new-instance v2, Lnet/youmi/android/a/a/c/d;

    invoke-direct {v2, p0, p2, p1}, Lnet/youmi/android/a/a/c/d;-><init>(Lnet/youmi/android/a/a/c/c;Landroid/webkit/GeolocationPermissions$Callback;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :goto_0
    :try_start_2
    invoke-super {p0, p1, p2}, Lnet/youmi/android/a/a/c/b;->onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    :goto_1
    return-void

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_3
    invoke-interface {p2, p1, v0, v1}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1
.end method
