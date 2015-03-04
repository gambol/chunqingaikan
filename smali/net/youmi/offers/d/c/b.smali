.class public Lnet/youmi/android/offers/d/c/b;
.super Ljava/lang/Object;

# interfaces
.implements Lnet/youmi/android/a/a/e/a/b/f;
.implements Lnet/youmi/android/a/a/i/a/b/a;


# instance fields
.field private a:Lnet/youmi/android/a/a/i/a/g;

.field private b:Lnet/youmi/android/a/a/e/g/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    const/4 v3, 0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lnet/youmi/android/a/a/e/g/c;

    const/4 v0, 0x3

    const/16 v2, 0x1f4

    invoke-direct {v1, v0, v2}, Lnet/youmi/android/a/a/e/g/c;-><init>(II)V

    invoke-virtual {v1, v3}, Lnet/youmi/android/a/a/e/g/c;->b(I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lnet/youmi/android/offers/b/b;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "?type="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lnet/youmi/android/offers/d/c/b;->b()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "&model="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "&lang="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-virtual {v1, v0}, Lnet/youmi/android/a/a/e/g/c;->e(Ljava/lang/String;)V

    iput-object v1, p0, Lnet/youmi/android/offers/d/c/b;->b:Lnet/youmi/android/a/a/e/g/c;

    new-instance v0, Lnet/youmi/android/a/a/e/a/b/a;

    invoke-direct {v0, p1, p0, v1}, Lnet/youmi/android/a/a/e/a/b/a;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/i/a/b/a;Lnet/youmi/android/a/a/e/g/c;)V

    new-instance v1, Lnet/youmi/android/a/a/i/a/a/c;

    invoke-direct {v1}, Lnet/youmi/android/a/a/i/a/a/c;-><init>()V

    invoke-virtual {v1, v3}, Lnet/youmi/android/a/a/i/a/a/c;->a(I)V

    invoke-virtual {v1, v0}, Lnet/youmi/android/a/a/i/a/a/c;->a(Lnet/youmi/android/a/a/e/a/b/h;)V

    invoke-virtual {v1, p0}, Lnet/youmi/android/a/a/i/a/a/c;->a(Lnet/youmi/android/a/a/e/a/b/f;)V

    new-instance v0, Lnet/youmi/android/a/a/i/a/g;

    invoke-direct {v0, p1, v1}, Lnet/youmi/android/a/a/i/a/g;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/i/a/a/c;)V

    iput-object v0, p0, Lnet/youmi/android/offers/d/c/b;->a:Lnet/youmi/android/a/a/i/a/g;

    invoke-static {}, Lnet/youmi/android/a/a/e/f/a;->a()Lnet/youmi/android/a/a/e/f/a;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/offers/d/c/b;->a:Lnet/youmi/android/a/a/i/a/g;

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/e/f/a;->a(Lnet/youmi/android/a/a/e/d/a;)V

    return-void
.end method

.method private static b()I
    .locals 1

    const/16 v0, 0x21

    return v0
.end method


# virtual methods
.method public a()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/offers/d/c/b;->b:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/c;->o()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/offers/d/c/b;->a:Lnet/youmi/android/a/a/i/a/g;

    invoke-virtual {v1, v0}, Lnet/youmi/android/a/a/i/a/g;->loadUrl(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public a(IIF)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public a(Ljava/lang/Runnable;)Z
    .locals 1

    :try_start_0
    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnet/youmi/android/a/b/k/m;->a(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;[B)Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/offers/d/c/b;->a:Lnet/youmi/android/a/a/i/a/g;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-object v0, p0, Lnet/youmi/android/offers/d/c/b;->a:Lnet/youmi/android/a/a/i/a/g;

    invoke-virtual {v0, p1, p2}, Lnet/youmi/android/a/a/i/a/g;->postUrl(Ljava/lang/String;[B)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :catch_0
    move-exception v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Ljava/lang/String;)Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/offers/d/c/b;->a:Lnet/youmi/android/a/a/i/a/g;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-object v0, p0, Lnet/youmi/android/offers/d/c/b;->a:Lnet/youmi/android/a/a/i/a/g;

    invoke-virtual {v0, p1}, Lnet/youmi/android/a/a/i/a/g;->loadUrl(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :catch_0
    move-exception v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public f()Lnet/youmi/android/a/a/e/a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public l()Z
    .locals 1

    invoke-static {}, Lnet/youmi/android/offers/d/c/a;->a()V

    const/4 v0, 0x1

    return v0
.end method

.method public m()Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/offers/d/c/b;->a:Lnet/youmi/android/a/a/i/a/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/offers/d/c/b;->a:Lnet/youmi/android/a/a/i/a/g;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/g;->clearHistory()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :catch_0
    move-exception v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
