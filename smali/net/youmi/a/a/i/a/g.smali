.class public final Lnet/youmi/android/a/a/i/a/g;
.super Landroid/webkit/WebView;

# interfaces
.implements Lnet/youmi/android/a/a/e/a/b/i;
.implements Lnet/youmi/android/a/a/e/d/a;
.implements Lnet/youmi/android/a/a/i/a/b/c;
.implements Lnet/youmi/android/a/a/i/a/b/d;
.implements Lnet/youmi/android/a/a/i/a/b/f;


# instance fields
.field private a:Z

.field private b:Z

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Lnet/youmi/android/a/a/i/a/b/d;

.field private g:Lnet/youmi/android/a/a/i/a/b/f;

.field private h:Landroid/content/Context;

.field private i:Lnet/youmi/android/a/a/i/a/a/c;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/a/i/a/a/c;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, v0}, Lnet/youmi/android/a/a/i/a/g;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/i/a/a/c;Lnet/youmi/android/a/a/e/a/a/b;Lnet/youmi/android/a/a/e/a/a/a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/a/i/a/a/c;Lnet/youmi/android/a/a/e/a/a/b;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lnet/youmi/android/a/a/i/a/g;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/i/a/a/c;Lnet/youmi/android/a/a/e/a/a/b;Lnet/youmi/android/a/a/e/a/a/a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/a/i/a/a/c;Lnet/youmi/android/a/a/e/a/a/b;Lnet/youmi/android/a/a/e/a/a/a;)V
    .locals 3

    const/4 v0, 0x0

    invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iput-boolean v0, p0, Lnet/youmi/android/a/a/i/a/g;->a:Z

    iput-boolean v0, p0, Lnet/youmi/android/a/a/i/a/g;->b:Z

    iput-object p1, p0, Lnet/youmi/android/a/a/i/a/g;->h:Landroid/content/Context;

    iput-object p2, p0, Lnet/youmi/android/a/a/i/a/g;->i:Lnet/youmi/android/a/a/i/a/a/c;

    if-eqz p3, :cond_1

    new-instance v0, Lnet/youmi/android/a/a/e/a/b;

    invoke-virtual {p2}, Lnet/youmi/android/a/a/i/a/a/c;->a()Lnet/youmi/android/a/a/e/a/b/h;

    move-result-object v1

    invoke-virtual {p2}, Lnet/youmi/android/a/a/i/a/a/c;->b()Lnet/youmi/android/a/a/e/a/b/f;

    move-result-object v2

    invoke-direct {v0, v1, v2, p3}, Lnet/youmi/android/a/a/e/a/b;-><init>(Lnet/youmi/android/a/a/e/a/b/h;Lnet/youmi/android/a/a/e/a/b/f;Lnet/youmi/android/a/a/e/a/a/b;)V

    :goto_0
    invoke-virtual {v0, p0}, Lnet/youmi/android/a/a/e/a/a;->setYmWebBrowser(Lnet/youmi/android/a/a/e/a/b/i;)V

    if-eqz p4, :cond_0

    invoke-virtual {v0, p4}, Lnet/youmi/android/a/a/e/a/a;->setExtendJsObject(Lnet/youmi/android/a/a/e/a/a/a;)V

    :cond_0
    invoke-direct {p0, p1, p2, v0}, Lnet/youmi/android/a/a/i/a/g;->a(Landroid/content/Context;Lnet/youmi/android/a/a/i/a/a/c;Lnet/youmi/android/a/a/e/a/a;)V

    return-void

    :cond_1
    new-instance v0, Lnet/youmi/android/a/a/e/a/b;

    invoke-virtual {p2}, Lnet/youmi/android/a/a/i/a/a/c;->a()Lnet/youmi/android/a/a/e/a/b/h;

    move-result-object v1

    invoke-virtual {p2}, Lnet/youmi/android/a/a/i/a/a/c;->b()Lnet/youmi/android/a/a/e/a/b/f;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lnet/youmi/android/a/a/e/a/b;-><init>(Lnet/youmi/android/a/a/e/a/b/h;Lnet/youmi/android/a/a/e/a/b/f;)V

    goto :goto_0
.end method

.method static synthetic a(Lnet/youmi/android/a/a/i/a/g;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->h:Landroid/content/Context;

    return-object v0
.end method

.method private a()V
    .locals 1

    const/high16 v0, 0x2000000

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/i/a/g;->setScrollBarStyle(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/i/a/g;->setBackgroundColor(I)V

    return-void
.end method

.method private a(I)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    const/4 v1, 0x0

    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/a/i/a/g;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    const/4 v3, -0x1

    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    and-int/lit8 v3, p1, 0x2

    if-eqz v3, :cond_0

    :goto_0
    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->h:Landroid/content/Context;

    invoke-static {v0, v2}, Lnet/youmi/android/a/a/c/a;->a(Landroid/content/Context;Landroid/webkit/WebSettings;)V

    sget-object v0, Landroid/webkit/WebSettings$LayoutAlgorithm;->NARROW_COLUMNS:Landroid/webkit/WebSettings$LayoutAlgorithm;

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setLayoutAlgorithm(Landroid/webkit/WebSettings$LayoutAlgorithm;)V

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :goto_1
    return-void

    :cond_0
    move v0, v1

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method private a(Landroid/content/Context;Lnet/youmi/android/a/a/i/a/a/c;Lnet/youmi/android/a/a/e/a/a;)V
    .locals 1

    :try_start_0
    invoke-virtual {p2}, Lnet/youmi/android/a/a/i/a/a/c;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->c:Ljava/lang/String;

    invoke-virtual {p2}, Lnet/youmi/android/a/a/i/a/a/c;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->e:Ljava/lang/String;

    invoke-virtual {p2}, Lnet/youmi/android/a/a/i/a/a/c;->f()Lnet/youmi/android/a/a/i/a/b/d;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->f:Lnet/youmi/android/a/a/i/a/b/d;

    invoke-virtual {p2}, Lnet/youmi/android/a/a/i/a/a/c;->g()Lnet/youmi/android/a/a/i/a/b/f;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->g:Lnet/youmi/android/a/a/i/a/b/f;

    invoke-direct {p0}, Lnet/youmi/android/a/a/i/a/g;->a()V

    invoke-virtual {p2}, Lnet/youmi/android/a/a/i/a/a/c;->c()I

    move-result v0

    invoke-direct {p0, v0}, Lnet/youmi/android/a/a/i/a/g;->a(I)V

    invoke-direct {p0}, Lnet/youmi/android/a/a/i/a/g;->b()V

    invoke-direct {p0, p0}, Lnet/youmi/android/a/a/i/a/g;->a(Lnet/youmi/android/a/a/i/a/b/f;)V

    invoke-direct {p0, p0}, Lnet/youmi/android/a/a/i/a/g;->a(Lnet/youmi/android/a/a/i/a/b/d;)V

    invoke-virtual {p2}, Lnet/youmi/android/a/a/i/a/a/c;->c()I

    move-result v0

    invoke-direct {p0, p3, v0}, Lnet/youmi/android/a/a/i/a/g;->a(Lnet/youmi/android/a/a/e/a/a;I)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/i/a/g;->setEnableOffersJsCodeLoader(Z)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/i/a/g;->setEnableOffersJsFileLoader(Z)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private a(Lnet/youmi/android/a/a/e/a/a;I)V
    .locals 1

    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    :try_start_0
    const-string v0, "ymsdk"

    invoke-virtual {p0, p1, v0}, Lnet/youmi/android/a/a/i/a/g;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private a(Lnet/youmi/android/a/a/i/a/b/d;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->h:Landroid/content/Context;

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/g;->i:Lnet/youmi/android/a/a/i/a/a/c;

    invoke-static {v0, v1}, Lnet/youmi/android/a/a/c/a;->a(Landroid/content/Context;Lnet/youmi/android/a/a/i/a/a/c;)Landroid/webkit/WebChromeClient;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/i/a/g;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private a(Lnet/youmi/android/a/a/i/a/b/f;)V
    .locals 1

    :try_start_0
    invoke-static {p1}, Lnet/youmi/android/a/a/c/a;->a(Lnet/youmi/android/a/a/i/a/b/f;)Landroid/webkit/WebViewClient;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/i/a/g;->setWebViewClient(Landroid/webkit/WebViewClient;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private b()V
    .locals 1

    :try_start_0
    new-instance v0, Lnet/youmi/android/a/a/i/a/h;

    invoke-direct {v0, p0}, Lnet/youmi/android/a/a/i/a/h;-><init>(Lnet/youmi/android/a/a/i/a/g;)V

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/i/a/g;->setDownloadListener(Landroid/webkit/DownloadListener;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public a(Landroid/webkit/WebView;I)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->f:Lnet/youmi/android/a/a/i/a/b/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->f:Lnet/youmi/android/a/a/i/a/b/d;

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

.method public a(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->g:Lnet/youmi/android/a/a/i/a/b/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->g:Lnet/youmi/android/a/a/i/a/b/f;

    invoke-interface {v0, p1, p2, p3, p4}, Lnet/youmi/android/a/a/i/a/b/f;->a(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public a(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    :try_start_0
    iget-boolean v0, p0, Lnet/youmi/android/a/a/i/a/g;->a:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lnet/youmi/android/a/a/e/e/a;->a()Lnet/youmi/android/a/a/e/e/a;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/g;->h:Landroid/content/Context;

    invoke-virtual {v0, v1, p0, p2}, Lnet/youmi/android/a/a/e/e/a;->a(Landroid/content/Context;Landroid/webkit/WebView;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_4

    :cond_0
    :goto_0
    :try_start_1
    iget-boolean v0, p0, Lnet/youmi/android/a/a/i/a/g;->b:Z

    if-eqz v0, :cond_1

    invoke-static {}, Lnet/youmi/android/a/a/e/e/b;->a()Lnet/youmi/android/a/a/e/e/b;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/g;->h:Landroid/content/Context;

    invoke-virtual {v0, v1, p0, p2}, Lnet/youmi/android/a/a/e/e/b;->a(Landroid/content/Context;Landroid/webkit/WebView;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_3

    :cond_1
    :goto_1
    :try_start_2
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->c:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->d:Ljava/lang/String;

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lnet/youmi/android/a/b/b/e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/g;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->d:Ljava/lang/String;

    :cond_2
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2

    :cond_3
    :goto_2
    :try_start_3
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->e:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->h:Landroid/content/Context;

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/g;->e:Ljava/lang/String;

    invoke-static {v0, p1, v1}, Lnet/youmi/android/a/a/e/e/c;->a(Landroid/content/Context;Landroid/webkit/WebView;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1

    :cond_4
    :goto_3
    :try_start_4
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->g:Lnet/youmi/android/a/a/i/a/b/f;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->g:Lnet/youmi/android/a/a/i/a/b/f;

    invoke-interface {v0, p1, p2}, Lnet/youmi/android/a/a/i/a/b/f;->a(Landroid/webkit/WebView;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0

    :cond_5
    :goto_4
    return-void

    :catch_0
    move-exception v0

    goto :goto_4

    :catch_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    goto :goto_2

    :catch_3
    move-exception v0

    goto :goto_1

    :catch_4
    move-exception v0

    goto :goto_0
.end method

.method public a(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->g:Lnet/youmi/android/a/a/i/a/b/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->g:Lnet/youmi/android/a/a/i/a/b/f;

    invoke-interface {v0, p1, p2, p3}, Lnet/youmi/android/a/a/i/a/b/f;->a(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/a/i/a/g;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lnet/youmi/android/a/b/i/i;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0, p2}, Lnet/youmi/android/a/a/i/a/g;->loadUrl(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    :try_start_0
    invoke-static {p1}, Lnet/youmi/android/a/b/b/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Lnet/youmi/android/a/b/b/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p3}, Lnet/youmi/android/a/b/b/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p4}, Lnet/youmi/android/a/b/b/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v0, :cond_0

    iput-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->j:Ljava/lang/String;

    :cond_0
    if-eqz v1, :cond_1

    iput-object v1, p0, Lnet/youmi/android/a/a/i/a/g;->k:Ljava/lang/String;

    :cond_1
    if-eqz v2, :cond_2

    iput-object v2, p0, Lnet/youmi/android/a/a/i/a/g;->l:Ljava/lang/String;

    :cond_2
    if-eqz v3, :cond_3

    iput-object v3, p0, Lnet/youmi/android/a/a/i/a/g;->m:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public b(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->f:Lnet/youmi/android/a/a/i/a/b/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->g:Lnet/youmi/android/a/a/i/a/b/f;

    invoke-interface {v0, p1, p2}, Lnet/youmi/android/a/a/i/a/b/f;->b(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->f:Lnet/youmi/android/a/a/i/a/b/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->f:Lnet/youmi/android/a/a/i/a/b/d;

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

.method public c()Z
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/a/i/a/g;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lnet/youmi/android/a/a/i/a/g;->goBack()V
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

.method public d()Z
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/a/i/a/g;->canGoForward()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lnet/youmi/android/a/a/i/a/g;->goForward()V
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

.method public e()V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/a/i/a/g;->onResume()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public g()V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/a/i/a/g;->onPause()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public getCurrentView()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public getUserAgentString()Ljava/lang/String;
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/a/i/a/g;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;
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

.method public h()V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/a/i/a/g;->stopLoading()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected onAttachedToWindow()V
    .locals 2

    invoke-super {p0}, Landroid/webkit/WebView;->onAttachedToWindow()V

    :try_start_0
    invoke-static {}, Lnet/youmi/android/a/a/e/f/a;->a()Lnet/youmi/android/a/a/e/f/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lnet/youmi/android/a/a/e/f/a;->a(Lnet/youmi/android/a/a/e/d/a;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    :try_start_1
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->j:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "javascript:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/g;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "();"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/i/a/g;->loadUrl(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :cond_0
    :goto_1
    return-void

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Landroid/webkit/WebView;->onDetachedFromWindow()V

    :try_start_0
    invoke-static {}, Lnet/youmi/android/a/a/e/f/a;->a()Lnet/youmi/android/a/a/e/f/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lnet/youmi/android/a/a/e/f/a;->b(Lnet/youmi/android/a/a/e/d/a;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    :try_start_1
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->k:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "javascript:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/g;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "();"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/i/a/g;->loadUrl(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :cond_0
    :goto_1
    return-void

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method public onWindowFocusChanged(Z)V
    .locals 3

    invoke-super {p0, p1}, Landroid/webkit/WebView;->onWindowFocusChanged(Z)V

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->l:Ljava/lang/String;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "javascript:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lnet/youmi/android/a/a/i/a/g;->l:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ");"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/i/a/g;->loadUrl(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method protected onWindowVisibilityChanged(I)V
    .locals 2

    invoke-super {p0, p1}, Landroid/webkit/WebView;->onWindowVisibilityChanged(I)V

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/g;->m:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "javascript:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/g;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ");"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/i/a/g;->loadUrl(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public setEnableOffersJsCodeLoader(Z)V
    .locals 0

    iput-boolean p1, p0, Lnet/youmi/android/a/a/i/a/g;->a:Z

    return-void
.end method

.method public setEnableOffersJsFileLoader(Z)V
    .locals 0

    iput-boolean p1, p0, Lnet/youmi/android/a/a/i/a/g;->b:Z

    return-void
.end method

.method public setUserAgentString(Ljava/lang/String;)V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/a/i/a/g;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
