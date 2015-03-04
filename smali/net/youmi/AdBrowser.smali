.class public Lnet/youmi/android/AdBrowser;
.super Landroid/app/Activity;

# interfaces
.implements Lnet/youmi/android/a/a/e/d/b;
.implements Lnet/youmi/android/a/a/i/a/b/a;
.implements Lnet/youmi/android/a/a/i/a/b/e;
.implements Lnet/youmi/android/a/a/j/a/a;
.implements Lnet/youmi/android/a/a/j/b/l;
.implements Lnet/youmi/android/a/a/j/c;
.implements Lnet/youmi/android/a/a/j/j;


# instance fields
.field protected a:Lnet/youmi/android/a/a/e/g/c;

.field protected b:Lnet/youmi/android/a/a/i/a/b;

.field protected c:Lnet/youmi/android/a/a/j/k;

.field private d:Landroid/widget/RelativeLayout;

.field private e:Lnet/youmi/android/a/a/j/b;

.field private f:Lnet/youmi/android/a/a/j/d;

.field private g:Lnet/youmi/android/a/a/e/a/b/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method private n()V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/AdBrowser;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "aca5522945c72310f9f22b333c68f2b3"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/a/e/g/c;

    iput-object v0, p0, Lnet/youmi/android/AdBrowser;->a:Lnet/youmi/android/a/a/e/g/c;

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->a:Lnet/youmi/android/a/a/e/g/c;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lnet/youmi/android/AdBrowser;->finish()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private o()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b;->b()Lnet/youmi/android/a/a/i/a/i;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b;->b()Lnet/youmi/android/a/a/i/a/i;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/i;->b()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b;->reload()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method a()V
    .locals 3

    const/16 v2, 0x22

    invoke-static {p0}, Lnet/youmi/android/a/b/k/f;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/k/f;

    move-result-object v0

    invoke-virtual {v0, v2}, Lnet/youmi/android/a/b/k/f;->a(I)I

    move-result v1

    invoke-virtual {v0, v2}, Lnet/youmi/android/a/b/k/f;->a(I)I

    move-result v0

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, v1, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    new-instance v0, Lnet/youmi/android/a/a/j/k;

    invoke-direct {v0, p0}, Lnet/youmi/android/a/a/j/k;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/AdBrowser;->c:Lnet/youmi/android/a/a/j/k;

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->c:Lnet/youmi/android/a/a/j/k;

    new-instance v1, Lnet/youmi/android/a;

    invoke-direct {v1, p0}, Lnet/youmi/android/a;-><init>(Lnet/youmi/android/AdBrowser;)V

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/j/k;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->a:Lnet/youmi/android/a/a/e/g/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->a:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/c;->c()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->c:Lnet/youmi/android/a/a/j/k;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/j/k;->setVisibility(I)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->c:Lnet/youmi/android/a/a/j/k;

    invoke-virtual {p0, v0, v2}, Lnet/youmi/android/AdBrowser;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->c:Lnet/youmi/android/a/a/j/k;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/j/k;->bringToFront()V

    return-void

    :pswitch_0
    const/16 v0, 0x33

    iput v0, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    goto :goto_0

    :pswitch_1
    const/16 v0, 0x53

    iput v0, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    goto :goto_0

    :pswitch_2
    const/16 v0, 0x35

    iput v0, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    goto :goto_0

    :pswitch_3
    const/16 v0, 0x55

    iput v0, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public a(I)V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->f:Lnet/youmi/android/a/a/j/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->f:Lnet/youmi/android/a/a/j/d;

    invoke-virtual {v0, p1}, Lnet/youmi/android/a/a/j/d;->setTitleBackgroundColor(I)V

    :cond_0
    return-void
.end method

.method public a(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->e:Lnet/youmi/android/a/a/j/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->e:Lnet/youmi/android/a/a/j/b;

    iget-object v1, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/i/a/b;->canGoBack()Z

    move-result v1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/j/b;->setBackEnable(Z)V

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->e:Lnet/youmi/android/a/a/j/b;

    iget-object v1, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/i/a/b;->canGoForward()Z

    move-result v1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/j/b;->setForwardEnable(Z)V
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
    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->e:Lnet/youmi/android/a/a/j/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->e:Lnet/youmi/android/a/a/j/b;

    iget-object v1, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/i/a/b;->canGoBack()Z

    move-result v1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/j/b;->setBackEnable(Z)V

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->e:Lnet/youmi/android/a/a/j/b;

    iget-object v1, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/i/a/b;->canGoForward()Z

    move-result v1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/j/b;->setForwardEnable(Z)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public a(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->e:Lnet/youmi/android/a/a/j/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->e:Lnet/youmi/android/a/a/j/b;

    iget-object v1, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/i/a/b;->canGoBack()Z

    move-result v1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/j/b;->setBackEnable(Z)V

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->e:Lnet/youmi/android/a/a/j/b;

    iget-object v1, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/i/a/b;->canGoForward()Z

    move-result v1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/j/b;->setForwardEnable(Z)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public a(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->a:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/c;->j()Lnet/youmi/android/a/a/j/a;

    move-result-object v0

    iget-boolean v0, v0, Lnet/youmi/android/a/a/j/a;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->f:Lnet/youmi/android/a/a/j/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->f:Lnet/youmi/android/a/a/j/d;

    invoke-virtual {v0, p1}, Lnet/youmi/android/a/a/j/d;->setTitle(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public a(Lnet/youmi/android/a/a/j/b/f;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b;->reload()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
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

.method public a(Ljava/lang/String;[B)Z
    .locals 1

    if-eqz p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v0, p1, p2}, Lnet/youmi/android/a/a/i/a/b;->postUrl(Ljava/lang/String;[B)V
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

.method public b()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/AdBrowser;->o()V

    return-void
.end method

.method public b(I)V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->f:Lnet/youmi/android/a/a/j/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->f:Lnet/youmi/android/a/a/j/d;

    invoke-virtual {v0, p1}, Lnet/youmi/android/a/a/j/d;->setPoints(I)V

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->f:Lnet/youmi/android/a/a/j/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->f:Lnet/youmi/android/a/a/j/d;

    invoke-virtual {v0, p1}, Lnet/youmi/android/a/a/j/d;->setPointsUnit(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)Z
    .locals 1

    if-eqz p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v0, p1}, Lnet/youmi/android/a/a/i/a/b;->loadUrl(Ljava/lang/String;)V
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

.method public c()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b;->c()Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public c(I)V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->f:Lnet/youmi/android/a/a/j/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->f:Lnet/youmi/android/a/a/j/d;

    invoke-virtual {v0, p1}, Lnet/youmi/android/a/a/j/d;->setPointsLayoutVisibility(I)V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b;->d()Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public f()V
    .locals 0

    invoke-virtual {p0}, Lnet/youmi/android/AdBrowser;->finish()V

    return-void
.end method

.method public g()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b;->c()Z

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0}, Lnet/youmi/android/AdBrowser;->finish()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public h()V
    .locals 0

    return-void
.end method

.method public i()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/AdBrowser;->o()V

    return-void
.end method

.method public j()V
    .locals 0

    return-void
.end method

.method public k()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/AdBrowser;->o()V

    return-void
.end method

.method public l()Z
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/AdBrowser;->finish()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public m()Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b;->clearHistory()V
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

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 13

    const/4 v12, 0x3

    const/4 v7, 0x0

    const/4 v11, 0x2

    const/4 v2, -0x1

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lnet/youmi/android/AdBrowser;->n()V

    new-instance v0, Landroid/widget/RelativeLayout;

    invoke-direct {v0, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/AdBrowser;->d:Landroid/widget/RelativeLayout;

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    new-instance v0, Lnet/youmi/android/a/a/e/a/b/a;

    iget-object v1, p0, Lnet/youmi/android/AdBrowser;->a:Lnet/youmi/android/a/a/e/g/c;

    invoke-direct {v0, p0, p0, v1}, Lnet/youmi/android/a/a/e/a/b/a;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/i/a/b/a;Lnet/youmi/android/a/a/e/g/c;)V

    iput-object v0, p0, Lnet/youmi/android/AdBrowser;->g:Lnet/youmi/android/a/a/e/a/b/a;

    new-instance v10, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v10, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->a:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/c;->d()I

    move-result v0

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->a:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/c;->d()I

    move-result v0

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    :goto_0
    new-instance v1, Lnet/youmi/android/a/a/j/d;

    iget-object v2, p0, Lnet/youmi/android/AdBrowser;->a:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v2}, Lnet/youmi/android/a/a/e/g/c;->j()Lnet/youmi/android/a/a/j/a;

    move-result-object v2

    invoke-direct {v1, p0, v2, p0, v0}, Lnet/youmi/android/a/a/j/d;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/j/a;Lnet/youmi/android/a/a/j/j;Z)V

    iput-object v1, p0, Lnet/youmi/android/AdBrowser;->f:Lnet/youmi/android/a/a/j/d;

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->f:Lnet/youmi/android/a/a/j/d;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/j/d;->setId(I)V

    invoke-static {}, Lnet/youmi/android/a/a/j/a/b;->a()Lnet/youmi/android/a/a/j/a/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lnet/youmi/android/a/a/j/a/b;->a(Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v1, p0, Lnet/youmi/android/AdBrowser;->d:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lnet/youmi/android/AdBrowser;->f:Lnet/youmi/android/a/a/j/d;

    invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v0, 0x3

    const/4 v1, 0x2

    invoke-virtual {v10, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    :cond_0
    :goto_1
    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->a:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/c;->d()I

    move-result v0

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_1

    :try_start_1
    new-instance v0, Lnet/youmi/android/a/a/j/b;

    invoke-direct {v0, p0, p0}, Lnet/youmi/android/a/a/j/b;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/j/c;)V

    iput-object v0, p0, Lnet/youmi/android/AdBrowser;->e:Lnet/youmi/android/a/a/j/b;

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->e:Lnet/youmi/android/a/a/j/b;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/j/b;->setId(I)V

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v1, p0, Lnet/youmi/android/AdBrowser;->d:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lnet/youmi/android/AdBrowser;->e:Lnet/youmi/android/a/a/j/b;

    invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v0, 0x2

    const/4 v1, 0x4

    invoke-virtual {v10, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :cond_1
    :goto_2
    new-instance v0, Lnet/youmi/android/a/a/i/a/b;

    iget-object v2, p0, Lnet/youmi/android/AdBrowser;->g:Lnet/youmi/android/a/a/e/a/b/a;

    iget-object v1, p0, Lnet/youmi/android/AdBrowser;->a:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/e/g/c;->d()I

    move-result v3

    iget-object v1, p0, Lnet/youmi/android/AdBrowser;->a:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/e/g/c;->k()Ljava/lang/String;

    move-result-object v5

    iget-object v1, p0, Lnet/youmi/android/AdBrowser;->a:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/e/g/c;->l()Ljava/lang/String;

    move-result-object v6

    iget-object v1, p0, Lnet/youmi/android/AdBrowser;->a:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/e/g/c;->h()Lnet/youmi/android/a/a/e/a/a/b;

    move-result-object v8

    move-object v1, p0

    move-object v4, p0

    move-object v9, p0

    invoke-direct/range {v0 .. v9}, Lnet/youmi/android/a/a/i/a/b;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/e/a/b/h;ILnet/youmi/android/a/a/e/d/b;Ljava/lang/String;Ljava/lang/String;ILnet/youmi/android/a/a/e/a/a/b;Lnet/youmi/android/a/a/j/b/l;)V

    iput-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v0, p0}, Lnet/youmi/android/a/a/i/a/b;->a(Lnet/youmi/android/a/a/i/a/b/e;)V

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b;->getCurrentView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v12}, Landroid/view/View;->setId(I)V

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->d:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/i/a/b;->getCurrentView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1, v10}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {p0, v0}, Lnet/youmi/android/AdBrowser;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Lnet/youmi/android/AdBrowser;->a()V

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->a:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/c;->n()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/AdBrowser;->a:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/e/g/c;->m()I

    move-result v1

    if-ne v1, v11, :cond_3

    if-eqz v0, :cond_3

    iget-object v1, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    iget-object v2, p0, Lnet/youmi/android/AdBrowser;->a:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v2}, Lnet/youmi/android/a/a/e/g/c;->o()Ljava/lang/String;

    move-result-object v2

    const-string v3, "BASE64"

    invoke-static {v0, v3}, Lorg/apache/http/util/EncodingUtils;->getBytes(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lnet/youmi/android/a/a/i/a/b;->postUrl(Ljava/lang/String;[B)V

    :goto_3
    return-void

    :cond_2
    move v0, v7

    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    iget-object v1, p0, Lnet/youmi/android/AdBrowser;->a:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/e/g/c;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/i/a/b;->loadUrl(Ljava/lang/String;)V

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    goto/16 :goto_1
.end method

.method protected onDestroy()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->a:Lnet/youmi/android/a/a/e/g/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->a:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/c;->i()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lnet/youmi/android/listener/a;->a()Lnet/youmi/android/listener/a;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/AdBrowser;->a:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/e/g/c;->i()I

    move-result v1

    invoke-virtual {v0, p0, v1}, Lnet/youmi/android/listener/a;->a(Landroid/content/Context;I)V

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b;->h()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method protected onPause()V
    .locals 1

    invoke-static {p0}, Lnet/youmi/android/a/a/g/g/d;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/g/d;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/g/d;->a()V

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b;->g()V

    return-void
.end method

.method protected onResume()V
    .locals 1

    new-instance v0, Lnet/youmi/android/b;

    invoke-direct {v0, p0}, Lnet/youmi/android/b;-><init>(Lnet/youmi/android/AdBrowser;)V

    invoke-static {v0}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    iget-object v0, p0, Lnet/youmi/android/AdBrowser;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b;->e()V

    return-void
.end method

.method protected onStop()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    return-void
.end method
