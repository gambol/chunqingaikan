.class public Lnet/youmi/android/a/b/i/k;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroid/content/Context;)Z
    .locals 1

    invoke-static {p0}, Lnet/youmi/android/a/b/k/k;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-static {p0}, Lnet/youmi/android/a/b/i/k;->d(Landroid/content/Context;)Z

    move-result v0

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;)I
    .locals 4

    const/16 v1, 0x66

    const/4 v0, -0x1

    invoke-static {p0}, Lnet/youmi/android/a/b/k/k;->b(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_0
    invoke-static {p0}, Lnet/youmi/android/a/b/k/k;->d(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_1

    :cond_1
    invoke-static {p0}, Lnet/youmi/android/a/b/k/k;->g(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_2
    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/a/b/i/k;->e(Landroid/content/Context;)Landroid/net/NetworkInfo;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v3

    if-nez v3, :cond_4

    :cond_3
    :goto_0
    :pswitch_0
    return v0

    :cond_4
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getType()I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result v3

    packed-switch v3, :pswitch_data_0

    goto :goto_0

    :pswitch_1
    :try_start_1
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getSubtype()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    move-result v2

    packed-switch v2, :pswitch_data_1

    move v0, v1

    goto :goto_0

    :pswitch_2
    const/16 v0, 0x64

    goto :goto_0

    :pswitch_3
    const/16 v0, 0x65

    goto :goto_0

    :pswitch_4
    move v0, v1

    goto :goto_0

    :pswitch_5
    const/16 v0, 0x67

    goto :goto_0

    :catch_0
    move-exception v0

    move v0, v1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const/16 v2, 0x19

    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/a/b/k/k;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lnet/youmi/android/a/b/i/k;->e(Landroid/content/Context;)Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    packed-switch v1, :pswitch_data_0

    :cond_0
    :goto_0
    const-string v0, ""

    :cond_1
    :goto_1
    return-object v0

    :pswitch_0
    :try_start_1
    const-string v0, "wifi"

    goto :goto_1

    :pswitch_1
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v2, :cond_1

    const/4 v1, 0x0

    const/16 v2, 0x19

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    const-string v0, ""
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static d(Landroid/content/Context;)Z
    .locals 2

    const/4 v0, 0x1

    invoke-static {p0}, Lnet/youmi/android/a/b/k/k;->d(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/a/b/i/k;->e(Landroid/content/Context;)Landroid/net/NetworkInfo;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isAvailable()Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-nez v1, :cond_0

    :cond_2
    :goto_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method private static e(Landroid/content/Context;)Landroid/net/NetworkInfo;
    .locals 1

    :try_start_0
    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
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
