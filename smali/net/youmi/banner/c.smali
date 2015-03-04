.class public Lnet/youmi/android/banner/c;
.super Ljava/lang/Object;

# interfaces
.implements Lnet/youmi/android/a/a/e/a/b/f;
.implements Lnet/youmi/android/a/a/i/a/b/d;
.implements Lnet/youmi/android/a/a/i/a/b/f;


# instance fields
.field protected a:Lnet/youmi/android/a/a/i/a/g;

.field protected b:Lnet/youmi/android/a/a/e/a/b/h;

.field protected c:Ljava/lang/String;

.field private d:Landroid/content/Context;

.field private e:Lnet/youmi/android/banner/d;

.field private f:I

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/a/e/a/b/h;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lnet/youmi/android/banner/c;->f:I

    const-string v0, ""

    iput-object v0, p0, Lnet/youmi/android/banner/c;->g:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lnet/youmi/android/banner/c;->h:Ljava/lang/String;

    iput-object p1, p0, Lnet/youmi/android/banner/c;->d:Landroid/content/Context;

    iput-object p2, p0, Lnet/youmi/android/banner/c;->b:Lnet/youmi/android/a/a/e/a/b/h;

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

    iget-object v1, p0, Lnet/youmi/android/banner/c;->b:Lnet/youmi/android/a/a/e/a/b/h;

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/i/a/a/c;->a(Lnet/youmi/android/a/a/e/a/b/h;)V

    invoke-virtual {v0, p0}, Lnet/youmi/android/a/a/i/a/a/c;->a(Lnet/youmi/android/a/a/i/a/b/d;)V

    invoke-virtual {v0, p0}, Lnet/youmi/android/a/a/i/a/a/c;->a(Lnet/youmi/android/a/a/i/a/b/f;)V

    new-instance v1, Lnet/youmi/android/a/a/i/a/g;

    iget-object v2, p0, Lnet/youmi/android/banner/c;->d:Landroid/content/Context;

    invoke-direct {v1, v2, v0}, Lnet/youmi/android/a/a/i/a/g;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/i/a/a/c;)V

    iput-object v1, p0, Lnet/youmi/android/banner/c;->a:Lnet/youmi/android/a/a/i/a/g;

    iget-object v0, p0, Lnet/youmi/android/banner/c;->a:Lnet/youmi/android/a/a/i/a/g;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/g;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    iget-object v0, p0, Lnet/youmi/android/banner/c;->a:Lnet/youmi/android/a/a/i/a/g;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/i/a/g;->setEnableOffersJsFileLoader(Z)V

    return-void
.end method

.method public a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput p1, p0, Lnet/youmi/android/banner/c;->f:I

    iput-object p2, p0, Lnet/youmi/android/banner/c;->g:Ljava/lang/String;

    iput-object p3, p0, Lnet/youmi/android/banner/c;->h:Ljava/lang/String;

    iput-object p4, p0, Lnet/youmi/android/banner/c;->c:Ljava/lang/String;

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
    iget-object v0, p0, Lnet/youmi/android/banner/c;->e:Lnet/youmi/android/banner/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/banner/c;->e:Lnet/youmi/android/banner/d;

    iget v1, p0, Lnet/youmi/android/banner/c;->f:I

    invoke-interface {v0, v1}, Lnet/youmi/android/banner/d;->b(I)V
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

.method protected a(Lnet/youmi/android/banner/d;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/banner/c;->e:Lnet/youmi/android/banner/d;

    return-void
.end method

.method public a(Ljava/lang/Runnable;)Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/banner/c;->a:Lnet/youmi/android/a/a/i/a/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/banner/c;->a:Lnet/youmi/android/a/a/i/a/g;

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
    .locals 6

    iget-object v0, p0, Lnet/youmi/android/banner/c;->a:Lnet/youmi/android/a/a/i/a/g;

    const-string v1, ""

    iget-object v2, p0, Lnet/youmi/android/banner/c;->c:Ljava/lang/String;

    const-string v3, "text/html"

    const-string v4, "utf-8"

    const-string v5, ""

    invoke-virtual/range {v0 .. v5}, Lnet/youmi/android/a/a/i/a/g;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public c()Lnet/youmi/android/a/a/i/a/g;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/banner/c;->a:Lnet/youmi/android/a/a/i/a/g;

    return-object v0
.end method

.method public c(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public f()Lnet/youmi/android/a/a/e/a;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/banner/c;->a:Lnet/youmi/android/a/a/i/a/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/banner/c;->a:Lnet/youmi/android/a/a/i/a/g;

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
