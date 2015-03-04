.class public Lnet/youmi/android/banner/a;
.super Ljava/lang/Object;

# interfaces
.implements Lnet/youmi/android/a/a/e/a/b/f;
.implements Lnet/youmi/android/a/a/i/a/b/d;
.implements Lnet/youmi/android/a/a/i/a/b/f;


# instance fields
.field protected a:Lnet/youmi/android/a/a/i/a/g;

.field protected b:Lnet/youmi/android/a/a/e/a/b/h;

.field protected c:Ljava/lang/String;

.field protected d:Ljava/lang/String;

.field protected e:Ljava/lang/String;

.field private f:Landroid/content/Context;

.field private g:Lnet/youmi/android/banner/b;

.field private h:I

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/a/e/a/b/h;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lnet/youmi/android/banner/a;->h:I

    const-string v0, ""

    iput-object v0, p0, Lnet/youmi/android/banner/a;->i:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lnet/youmi/android/banner/a;->j:Ljava/lang/String;

    iput-object p1, p0, Lnet/youmi/android/banner/a;->f:Landroid/content/Context;

    iput-object p2, p0, Lnet/youmi/android/banner/a;->b:Lnet/youmi/android/a/a/e/a/b/h;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    const/4 v3, 0x1

    new-instance v0, Lnet/youmi/android/a/a/i/a/a/c;

    invoke-direct {v0}, Lnet/youmi/android/a/a/i/a/a/c;-><init>()V

    invoke-virtual {v0, v3}, Lnet/youmi/android/a/a/i/a/a/c;->a(I)V

    invoke-virtual {v0, p0}, Lnet/youmi/android/a/a/i/a/a/c;->a(Lnet/youmi/android/a/a/e/a/b/f;)V

    iget-object v1, p0, Lnet/youmi/android/banner/a;->b:Lnet/youmi/android/a/a/e/a/b/h;

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/i/a/a/c;->a(Lnet/youmi/android/a/a/e/a/b/h;)V

    invoke-virtual {v0, p0}, Lnet/youmi/android/a/a/i/a/a/c;->a(Lnet/youmi/android/a/a/i/a/b/d;)V

    invoke-virtual {v0, p0}, Lnet/youmi/android/a/a/i/a/a/c;->a(Lnet/youmi/android/a/a/i/a/b/f;)V

    new-instance v1, Lnet/youmi/android/a/a/i/a/g;

    iget-object v2, p0, Lnet/youmi/android/banner/a;->f:Landroid/content/Context;

    invoke-direct {v1, v2, v0}, Lnet/youmi/android/a/a/i/a/g;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/i/a/a/c;)V

    iput-object v1, p0, Lnet/youmi/android/banner/a;->a:Lnet/youmi/android/a/a/i/a/g;

    iget-object v0, p0, Lnet/youmi/android/banner/a;->a:Lnet/youmi/android/a/a/i/a/g;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/g;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    iget-object v0, p0, Lnet/youmi/android/banner/a;->a:Lnet/youmi/android/a/a/i/a/g;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/i/a/g;->setEnableOffersJsFileLoader(Z)V

    return-void
.end method

.method public a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput p1, p0, Lnet/youmi/android/banner/a;->h:I

    iput-object p2, p0, Lnet/youmi/android/banner/a;->i:Ljava/lang/String;

    iput-object p3, p0, Lnet/youmi/android/banner/a;->j:Ljava/lang/String;

    iput-object p5, p0, Lnet/youmi/android/banner/a;->d:Ljava/lang/String;

    iput-object p4, p0, Lnet/youmi/android/banner/a;->e:Ljava/lang/String;

    iput-object p6, p0, Lnet/youmi/android/banner/a;->c:Ljava/lang/String;

    return-void
.end method

.method public a(Landroid/webkit/WebView;I)V
    .locals 0

    return-void
.end method

.method public a(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public a(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/banner/a;->g:Lnet/youmi/android/banner/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/banner/a;->g:Lnet/youmi/android/banner/b;

    iget v1, p0, Lnet/youmi/android/banner/a;->h:I

    invoke-interface {v0, v1}, Lnet/youmi/android/banner/b;->a(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/b/e/b;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public a(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    return-void
.end method

.method protected a(Lnet/youmi/android/banner/b;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/banner/a;->g:Lnet/youmi/android/banner/b;

    return-void
.end method

.method public a(Ljava/lang/Runnable;)Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/banner/a;->a:Lnet/youmi/android/a/a/i/a/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/banner/a;->a:Lnet/youmi/android/a/a/i/a/g;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/g;->getCurrentView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lnet/youmi/android/banner/a;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/banner/a;->e:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lnet/youmi/android/a/a/e/e/a;->a()Lnet/youmi/android/a/a/e/e/a;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/banner/a;->c:Ljava/lang/String;

    iget-object v2, p0, Lnet/youmi/android/banner/a;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lnet/youmi/android/a/a/e/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/banner/a;->d:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/banner/a;->d:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lnet/youmi/android/a/a/e/e/a;->a()Lnet/youmi/android/a/a/e/e/a;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/banner/a;->c:Ljava/lang/String;

    iget-object v2, p0, Lnet/youmi/android/banner/a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lnet/youmi/android/a/a/e/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public b(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/banner/a;->a:Lnet/youmi/android/a/a/i/a/g;

    iget-object v1, p0, Lnet/youmi/android/banner/a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/i/a/g;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method public c(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public d()V
    .locals 3

    iget-object v0, p0, Lnet/youmi/android/banner/a;->a:Lnet/youmi/android/a/a/i/a/g;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "javascript:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lnet/youmi/android/banner/a;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/i/a/g;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method public e()Lnet/youmi/android/a/a/i/a/g;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/banner/a;->a:Lnet/youmi/android/a/a/i/a/g;

    return-object v0
.end method

.method public f()Lnet/youmi/android/a/a/e/a;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/banner/a;->a:Lnet/youmi/android/a/a/i/a/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/banner/a;->a:Lnet/youmi/android/a/a/i/a/g;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/g;->clearHistory()V

    sget-object v0, Lnet/youmi/android/a/a/e/a;->b:Lnet/youmi/android/a/a/e/a;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
