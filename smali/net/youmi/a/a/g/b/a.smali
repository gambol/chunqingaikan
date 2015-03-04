.class public Lnet/youmi/android/a/a/g/b/a;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroid/content/Context;)Z
    .locals 4

    const/4 v1, 0x1

    const/4 v0, 0x0

    const-string v2, "Check Ad Permission Failure , Please Add \"%s\" To AndroidManifest.xml"

    invoke-static {p0}, Lnet/youmi/android/a/b/k/k;->b(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v3, "android.permission.INTERNET"

    aput-object v3, v1, v0

    invoke-static {v2, v1}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return v0

    :cond_0
    invoke-static {p0}, Lnet/youmi/android/a/b/k/k;->c(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v3, "android.permission.READ_PHONE_STATE"

    aput-object v3, v1, v0

    invoke-static {v2, v1}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lnet/youmi/android/a/b/k/k;->d(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v3, "android.permission.ACCESS_NETWORK_STATE"

    aput-object v3, v1, v0

    invoke-static {v2, v1}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p0}, Lnet/youmi/android/a/b/k/k;->g(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v3, "android.permission.ACCESS_WIFI_STATE"

    aput-object v3, v1, v0

    invoke-static {v2, v1}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p0}, Lnet/youmi/android/a/b/k/k;->a(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v3, "android.permission.WRITE_EXTERNAL_STORAG"

    aput-object v3, v1, v0

    invoke-static {v2, v1}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-static {p0}, Lnet/youmi/android/a/b/k/k;->i(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v3, "android.permission.SYSTEM_ALERT_WINDOW"

    aput-object v3, v1, v0

    invoke-static {v2, v1}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    invoke-static {p0}, Lnet/youmi/android/a/b/k/k;->j(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v3, "android.permission.GET_TASKS"

    aput-object v3, v1, v0

    invoke-static {v2, v1}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_6
    move v0, v1

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 4

    const/4 v1, 0x1

    const/4 v0, 0x0

    const-string v2, "Check Ad Component Failure , Please Add \"%s\" To AndroidManifest.xml"

    const-class v3, Lnet/youmi/android/AdBrowser;

    invoke-static {p0, v3}, Lnet/youmi/android/a/b/k/c;->a(Landroid/content/Context;Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_0

    new-array v1, v1, [Ljava/lang/Object;

    const-class v3, Lnet/youmi/android/AdBrowser;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v0

    invoke-static {v2, v1}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return v0

    :cond_0
    const-class v3, Lnet/youmi/android/AdService;

    invoke-static {p0, v3}, Lnet/youmi/android/a/b/k/c;->b(Landroid/content/Context;Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_1

    new-array v1, v1, [Ljava/lang/Object;

    const-class v3, Lnet/youmi/android/AdService;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v0

    invoke-static {v2, v1}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const-class v3, Lnet/youmi/android/AdReceiver;

    invoke-static {p0, v3}, Lnet/youmi/android/a/b/k/c;->c(Landroid/content/Context;Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_2

    new-array v1, v1, [Ljava/lang/Object;

    const-class v3, Lnet/youmi/android/AdReceiver;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v0

    invoke-static {v2, v1}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method public static c(Landroid/content/Context;)Z
    .locals 1

    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Check Appid And AppSecret Failure, Please input your Appid and AppSecret in AdManager.getInstance(Context context).init(...)"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static d(Landroid/content/Context;)Z
    .locals 2

    const/4 v0, 0x0

    invoke-static {p0}, Lnet/youmi/android/a/a/g/b/a;->c(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-static {p0}, Lnet/youmi/android/a/a/g/b/a;->a(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Lnet/youmi/android/a/a/g/b/a;->b(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method
