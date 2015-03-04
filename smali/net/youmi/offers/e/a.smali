.class public Lnet/youmi/android/offers/e/a;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroid/content/Context;II)Landroid/content/Intent;
    .locals 4

    :try_start_0
    new-instance v1, Lnet/youmi/android/a/a/e/g/c;

    const/4 v0, 0x3

    const/16 v2, 0x1f4

    invoke-direct {v1, v0, v2}, Lnet/youmi/android/a/a/e/g/c;-><init>(II)V

    const/4 v0, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p0, v0, v2, v3}, Lnet/youmi/android/offers/e/a;->a(Landroid/content/Context;IIZ)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lnet/youmi/android/a/a/e/g/c;->e(Ljava/lang/String;)V

    new-instance v0, Lnet/youmi/android/offers/c/a;

    invoke-direct {v0}, Lnet/youmi/android/offers/c/a;-><init>()V

    invoke-virtual {v1, v0}, Lnet/youmi/android/a/a/e/g/c;->a(Lnet/youmi/android/a/a/e/a/a/b;)V

    if-eqz p2, :cond_0

    invoke-virtual {v1, p2}, Lnet/youmi/android/a/a/e/g/c;->c(I)V

    :cond_0
    sget-boolean v0, Lnet/youmi/android/offers/f/a;->a:Z

    if-eqz v0, :cond_2

    const/16 v0, 0x71

    invoke-virtual {v1, v0}, Lnet/youmi/android/a/a/e/g/c;->b(I)V

    new-instance v0, Lnet/youmi/android/a/a/j/a;

    invoke-direct {v0}, Lnet/youmi/android/a/a/j/a;-><init>()V

    invoke-static {}, Lnet/youmi/android/offers/OffersBrowserConfig;->getBrowserTitleText()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lnet/youmi/android/a/a/j/a;->a:Ljava/lang/String;

    invoke-static {}, Lnet/youmi/android/offers/OffersBrowserConfig;->getPointsUnit()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lnet/youmi/android/a/a/j/a;->d:Ljava/lang/String;

    invoke-static {p0}, Lnet/youmi/android/offers/PointsManager;->getInstance(Landroid/content/Context;)Lnet/youmi/android/offers/PointsManager;

    move-result-object v2

    invoke-virtual {v2}, Lnet/youmi/android/offers/PointsManager;->queryPoints()I

    move-result v2

    iput v2, v0, Lnet/youmi/android/a/a/j/a;->c:I

    const/16 v2, 0x9

    iput v2, v0, Lnet/youmi/android/a/a/j/a;->b:I

    invoke-static {}, Lnet/youmi/android/offers/OffersBrowserConfig;->getBrowserTitleBackgroundColor()I

    move-result v2

    iput v2, v0, Lnet/youmi/android/a/a/j/a;->e:I

    invoke-static {}, Lnet/youmi/android/offers/OffersManager;->isUsingServerCallBack()Z

    move-result v2

    if-nez v2, :cond_1

    iget v2, v0, Lnet/youmi/android/a/a/j/a;->b:I

    or-int/lit8 v2, v2, 0x4

    iput v2, v0, Lnet/youmi/android/a/a/j/a;->b:I

    :cond_1
    invoke-virtual {v1, v0}, Lnet/youmi/android/a/a/e/g/c;->a(Lnet/youmi/android/a/a/j/a;)V

    :goto_0
    new-instance v0, Landroid/content/Intent;

    const-class v2, Lnet/youmi/android/AdBrowser;

    invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "aca5522945c72310f9f22b333c68f2b3"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :goto_1
    return-object v0

    :cond_2
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lnet/youmi/android/a/a/e/g/c;->b(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_1
.end method

.method private static a(Landroid/content/Context;IIZ)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "?type="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "&model="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v2, "&lang="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    const-string v2, "&st="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :try_start_0
    const-string v2, "&color=#"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lnet/youmi/android/offers/OffersBrowserConfig;->getBrowserTitleBackgroundColor()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    :try_start_1
    invoke-static {p0}, Lnet/youmi/android/a/b/i/k;->b(Landroid/content/Context;)I

    move-result v2

    const/16 v3, 0x64

    if-eq v2, v3, :cond_1

    invoke-static {p0}, Lnet/youmi/android/a/b/i/k;->b(Landroid/content/Context;)I

    move-result v2

    const/16 v3, 0x67

    if-eq v2, v3, :cond_1

    const-string v2, "&tab=4"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :cond_1
    :goto_1
    sget-boolean v2, Lnet/youmi/android/offers/f/a;->a:Z

    if-eqz v2, :cond_3

    const-string v2, "&r="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-eqz p3, :cond_2

    const/4 v0, 0x1

    :cond_2
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_3
    sget-boolean v0, Lnet/youmi/android/offers/f/a;->a:Z

    if-eqz v0, :cond_5

    invoke-static {}, Lnet/youmi/android/a/a/e/g/e;->p()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p0}, Lnet/youmi/android/offers/f/a;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/a/e/g/e;->f(Ljava/lang/String;)V

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lnet/youmi/android/a/b/b/e;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lnet/youmi/android/a/a/e/g/e;->p()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/offer/aos/lists.html"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_2
    return-object v0

    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lnet/youmi/android/offers/b/b;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :catch_0
    move-exception v2

    goto :goto_1

    :catch_1
    move-exception v2

    goto :goto_0
.end method

.method private static a(Landroid/content/Context;)Lnet/youmi/android/a/a/e/g/g;
    .locals 4

    :try_start_0
    new-instance v0, Lnet/youmi/android/a/a/e/g/g;

    const/4 v1, 0x3

    const/16 v2, 0x1f4

    invoke-direct {v0, v1, v2}, Lnet/youmi/android/a/a/e/g/g;-><init>(II)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/e/g/g;->a(I)V

    const/16 v1, 0x20

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p0, v1, v2, v3}, Lnet/youmi/android/offers/e/a;->a(Landroid/content/Context;IIZ)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/e/g/g;->e(Ljava/lang/String;)V

    new-instance v1, Lnet/youmi/android/offers/c/a;

    invoke-direct {v1}, Lnet/youmi/android/offers/c/a;-><init>()V

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/e/g/g;->a(Lnet/youmi/android/a/a/e/a/a/b;)V

    sget-boolean v1, Lnet/youmi/android/offers/f/a;->a:Z

    if-eqz v1, :cond_1

    const/16 v1, 0x71

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/e/g/g;->b(I)V

    new-instance v1, Lnet/youmi/android/a/a/j/a;

    invoke-direct {v1}, Lnet/youmi/android/a/a/j/a;-><init>()V

    invoke-static {}, Lnet/youmi/android/offers/OffersBrowserConfig;->getBrowserTitleText()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lnet/youmi/android/a/a/j/a;->a:Ljava/lang/String;

    invoke-static {}, Lnet/youmi/android/offers/OffersBrowserConfig;->getPointsUnit()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lnet/youmi/android/a/a/j/a;->d:Ljava/lang/String;

    invoke-static {p0}, Lnet/youmi/android/offers/PointsManager;->getInstance(Landroid/content/Context;)Lnet/youmi/android/offers/PointsManager;

    move-result-object v2

    invoke-virtual {v2}, Lnet/youmi/android/offers/PointsManager;->queryPoints()I

    move-result v2

    iput v2, v1, Lnet/youmi/android/a/a/j/a;->c:I

    const/16 v2, 0x8

    iput v2, v1, Lnet/youmi/android/a/a/j/a;->b:I

    invoke-static {}, Lnet/youmi/android/offers/OffersBrowserConfig;->getBrowserTitleBackgroundColor()I

    move-result v2

    iput v2, v1, Lnet/youmi/android/a/a/j/a;->e:I

    invoke-static {}, Lnet/youmi/android/offers/OffersManager;->isUsingServerCallBack()Z

    move-result v2

    if-nez v2, :cond_0

    iget v2, v1, Lnet/youmi/android/a/a/j/a;->b:I

    or-int/lit8 v2, v2, 0x4

    iput v2, v1, Lnet/youmi/android/a/a/j/a;->b:I

    :cond_0
    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/e/g/g;->a(Lnet/youmi/android/a/a/j/a;)V

    :goto_0
    return-object v0

    :cond_1
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/e/g/g;->b(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;DDLnet/youmi/android/offers/OffersWallDialogListener;)Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/offers/e/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/e/g/g;

    move-result-object v1

    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v1, p1, p2}, Lnet/youmi/android/a/a/e/g/g;->a(D)V

    invoke-virtual {v1, p3, p4}, Lnet/youmi/android/a/a/e/g/g;->b(D)V

    invoke-static {p0, v1}, Lnet/youmi/android/a/a/i/a/a/d;->b(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/g;)Lnet/youmi/android/a/a/i/a/a/d;

    move-result-object v1

    invoke-virtual {v1, p5}, Lnet/youmi/android/a/a/i/a/a/d;->a(Lnet/youmi/android/listener/Interface_WebViewDialogListener;)V

    invoke-virtual {v1}, Lnet/youmi/android/a/a/i/a/a/d;->show()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;IILnet/youmi/android/offers/OffersWallDialogListener;)Z
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/offers/e/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/e/g/g;

    move-result-object v1

    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v1, p1}, Lnet/youmi/android/a/a/e/g/g;->f(I)V

    invoke-virtual {v1, p2}, Lnet/youmi/android/a/a/e/g/g;->g(I)V

    invoke-static {p0, v1}, Lnet/youmi/android/a/a/i/a/a/d;->b(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/g;)Lnet/youmi/android/a/a/i/a/a/d;

    move-result-object v1

    invoke-virtual {v1, p3}, Lnet/youmi/android/a/a/i/a/a/d;->a(Lnet/youmi/android/listener/Interface_WebViewDialogListener;)V

    invoke-virtual {v1}, Lnet/youmi/android/a/a/i/a/a/d;->show()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Lnet/youmi/android/offers/OffersWallDialogListener;)Z
    .locals 7

    const-wide v2, 0x3fee666666666666L    # 0.95

    const-wide v4, 0x3feccccccccccccdL    # 0.9

    move-object v1, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lnet/youmi/android/offers/e/a;->a(Landroid/content/Context;DDLnet/youmi/android/offers/OffersWallDialogListener;)Z

    move-result v0

    return v0
.end method
