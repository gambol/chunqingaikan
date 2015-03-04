.class public Lnet/youmi/android/a/a/i/a/b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lnet/youmi/android/a/a/e/a/b/f;
.implements Lnet/youmi/android/a/a/i/a/b/b;
.implements Lnet/youmi/android/a/a/i/a/b/c;
.implements Lnet/youmi/android/a/a/i/a/b/d;
.implements Lnet/youmi/android/a/a/i/a/b/f;


# instance fields
.field a:Z

.field b:Z

.field c:Z

.field d:Ljava/lang/String;

.field private e:Lnet/youmi/android/a/a/e/d/b;

.field private f:Lnet/youmi/android/a/a/i/a/b/c;

.field private g:Lnet/youmi/android/a/a/i/a/b/e;

.field private h:Landroid/widget/RelativeLayout;

.field private i:Lnet/youmi/android/a/a/i/a/i;

.field private j:Lnet/youmi/android/a/a/i/a/k;

.field private k:Lnet/youmi/android/a/a/i/a/j;

.field private l:Ljava/util/Timer;

.field private m:Lnet/youmi/android/a/a/j/b/l;

.field private n:Landroid/content/Context;

.field private o:Z

.field private p:Lnet/youmi/android/a/a/i/a/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/a/e/a/b/h;ILnet/youmi/android/a/a/e/d/b;Ljava/lang/String;Ljava/lang/String;ILnet/youmi/android/a/a/e/a/a/b;Lnet/youmi/android/a/a/j/b/l;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/youmi/android/a/a/i/a/b;->a:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/youmi/android/a/a/i/a/b;->b:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/youmi/android/a/a/i/a/b;->c:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/youmi/android/a/a/i/a/b;->o:Z

    iput-object p1, p0, Lnet/youmi/android/a/a/i/a/b;->n:Landroid/content/Context;

    iput-object p4, p0, Lnet/youmi/android/a/a/i/a/b;->e:Lnet/youmi/android/a/a/e/d/b;

    new-instance v0, Landroid/widget/RelativeLayout;

    invoke-direct {v0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->h:Landroid/widget/RelativeLayout;

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->h:Landroid/widget/RelativeLayout;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Lnet/youmi/android/a/a/i/a/a/c;

    invoke-direct {v0}, Lnet/youmi/android/a/a/i/a/a/c;-><init>()V

    invoke-virtual {v0, p3}, Lnet/youmi/android/a/a/i/a/a/c;->a(I)V

    invoke-virtual {v0, p0}, Lnet/youmi/android/a/a/i/a/a/c;->a(Lnet/youmi/android/a/a/e/a/b/f;)V

    invoke-virtual {v0, p0}, Lnet/youmi/android/a/a/i/a/a/c;->a(Lnet/youmi/android/a/a/i/a/b/d;)V

    invoke-virtual {v0, p0}, Lnet/youmi/android/a/a/i/a/a/c;->a(Lnet/youmi/android/a/a/i/a/b/f;)V

    invoke-virtual {v0, p5}, Lnet/youmi/android/a/a/i/a/a/c;->a(Ljava/lang/String;)V

    invoke-virtual {v0, p6}, Lnet/youmi/android/a/a/i/a/a/c;->b(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Lnet/youmi/android/a/a/i/a/a/c;->a(Lnet/youmi/android/a/a/e/a/b/h;)V

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    and-int/lit8 v2, p3, 0x40

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    iput-boolean v2, p0, Lnet/youmi/android/a/a/i/a/b;->o:Z

    invoke-static {}, Lnet/youmi/android/a/a/i/a/b/g;->a()Lnet/youmi/android/a/a/i/a/b/g;

    move-result-object v2

    invoke-virtual {v2, p0}, Lnet/youmi/android/a/a/i/a/b/g;->a(Ljava/lang/Object;)V

    :goto_0
    and-int/lit8 v2, p3, 0x20

    if-eqz v2, :cond_2

    new-instance v2, Lnet/youmi/android/a/a/i/a/i;

    iget-object v3, p0, Lnet/youmi/android/a/a/i/a/b;->n:Landroid/content/Context;

    invoke-direct {v2, v3, v0, p8}, Lnet/youmi/android/a/a/i/a/i;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/i/a/a/c;Lnet/youmi/android/a/a/e/a/a/b;)V

    iput-object v2, p0, Lnet/youmi/android/a/a/i/a/b;->i:Lnet/youmi/android/a/a/i/a/i;

    if-eqz p9, :cond_0

    iput-object p9, p0, Lnet/youmi/android/a/a/i/a/b;->m:Lnet/youmi/android/a/a/j/b/l;

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->i:Lnet/youmi/android/a/a/i/a/i;

    iget-object v2, p0, Lnet/youmi/android/a/a/i/a/b;->m:Lnet/youmi/android/a/a/j/b/l;

    invoke-virtual {v0, v2}, Lnet/youmi/android/a/a/i/a/i;->setOnRefreshListener(Lnet/youmi/android/a/a/j/b/l;)V

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->i:Lnet/youmi/android/a/a/i/a/i;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/i;->getRefreshableView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/a/i/a/b/c;

    iput-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->f:Lnet/youmi/android/a/a/i/a/b/c;

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->h:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lnet/youmi/android/a/a/i/a/b;->i:Lnet/youmi/android/a/a/i/a/i;

    invoke-virtual {v0, v2, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->i:Lnet/youmi/android/a/a/i/a/i;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/i/a/i;->setVisibility(I)V

    :goto_1
    new-instance v0, Lnet/youmi/android/a/a/i/a/k;

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/b;->n:Landroid/content/Context;

    invoke-direct {v0, v1}, Lnet/youmi/android/a/a/i/a/k;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->j:Lnet/youmi/android/a/a/i/a/k;

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->j:Lnet/youmi/android/a/a/i/a/k;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lnet/youmi/android/a/a/h/a;->x()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " 0%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/i/a/k;->a(Ljava/lang/String;)V

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/b;->h:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lnet/youmi/android/a/a/i/a/b;->j:Lnet/youmi/android/a/a/i/a/k;

    invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->j:Lnet/youmi/android/a/a/i/a/k;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/k;->bringToFront()V

    new-instance v0, Lnet/youmi/android/a/a/i/a/j;

    invoke-direct {v0, p1}, Lnet/youmi/android/a/a/i/a/j;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->k:Lnet/youmi/android/a/a/i/a/j;

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/b;->h:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lnet/youmi/android/a/a/i/a/b;->k:Lnet/youmi/android/a/a/i/a/j;

    invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->k:Lnet/youmi/android/a/a/i/a/j;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/j;->b()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->k:Lnet/youmi/android/a/a/i/a/j;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/j;->a()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->k:Lnet/youmi/android/a/a/i/a/j;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/j;->bringToFront()V

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->k:Lnet/youmi/android/a/a/i/a/j;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/i/a/j;->setVisibility(I)V

    return-void

    :cond_1
    const/4 v2, 0x0

    iput-boolean v2, p0, Lnet/youmi/android/a/a/i/a/b;->o:Z

    goto/16 :goto_0

    :cond_2
    new-instance v2, Lnet/youmi/android/a/a/i/a/g;

    iget-object v3, p0, Lnet/youmi/android/a/a/i/a/b;->n:Landroid/content/Context;

    invoke-direct {v2, v3, v0, p8}, Lnet/youmi/android/a/a/i/a/g;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/i/a/a/c;Lnet/youmi/android/a/a/e/a/a/b;)V

    iput-object v2, p0, Lnet/youmi/android/a/a/i/a/b;->f:Lnet/youmi/android/a/a/i/a/b/c;

    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/webkit/CookieManager;->setAcceptCookie(Z)V

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->h:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lnet/youmi/android/a/a/i/a/b;->f:Lnet/youmi/android/a/a/i/a/b/c;

    invoke-interface {v2}, Lnet/youmi/android/a/a/i/a/b/c;->getCurrentView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_1
.end method

.method static synthetic a(Lnet/youmi/android/a/a/i/a/b;)Lnet/youmi/android/a/a/i/a/k;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->j:Lnet/youmi/android/a/a/i/a/k;

    return-object v0
.end method

.method static synthetic b(Lnet/youmi/android/a/a/i/a/b;)Lnet/youmi/android/a/a/i/a/f;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->p:Lnet/youmi/android/a/a/i/a/f;

    return-object v0
.end method

.method private k()V
    .locals 6

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->j:Lnet/youmi/android/a/a/i/a/k;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lnet/youmi/android/a/a/i/a/b;->c:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->j:Lnet/youmi/android/a/a/i/a/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/i/a/k;->setVisibility(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->l:Ljava/util/Timer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->l:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->l:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->purge()I

    const/4 v0, 0x0

    iput-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->l:Ljava/util/Timer;

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->l:Ljava/util/Timer;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->l:Ljava/util/Timer;

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/youmi/android/a/a/i/a/b;->c:Z

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->l:Ljava/util/Timer;

    new-instance v1, Lnet/youmi/android/a/a/i/a/d;

    invoke-direct {v1, p0}, Lnet/youmi/android/a/a/i/a/d;-><init>(Lnet/youmi/android/a/a/i/a/b;)V

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x1e

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    :cond_2
    return-void
.end method

.method private l()V
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->j:Lnet/youmi/android/a/a/i/a/k;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->l:Ljava/util/Timer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->l:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->l:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->purge()I

    const/4 v0, 0x0

    iput-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->l:Ljava/util/Timer;

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->j:Lnet/youmi/android/a/a/i/a/k;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/i/a/k;->setVisibility(I)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/youmi/android/a/a/i/a/b;->c:Z

    :cond_1
    return-void
.end method


# virtual methods
.method public a(Landroid/webkit/WebView;I)V
    .locals 0

    return-void
.end method

.method public a(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-boolean v0, p0, Lnet/youmi/android/a/a/i/a/b;->o:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->i:Lnet/youmi/android/a/a/i/a/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->i:Lnet/youmi/android/a/a/i/a/i;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/i;->f()V

    :cond_0
    :try_start_0
    invoke-direct {p0}, Lnet/youmi/android/a/a/i/a/b;->l()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/youmi/android/a/a/i/a/b;->b:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/youmi/android/a/a/i/a/b;->a:Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2

    :goto_0
    :try_start_1
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->k:Lnet/youmi/android/a/a/i/a/j;

    invoke-static {}, Lnet/youmi/android/a/a/h/a;->w()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/i/a/j;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->f:Lnet/youmi/android/a/a/i/a/b/c;

    invoke-interface {v0}, Lnet/youmi/android/a/a/i/a/b/c;->getCurrentView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->k:Lnet/youmi/android/a/a/i/a/j;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/i/a/j;->setVisibility(I)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :goto_1
    :try_start_2
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->g:Lnet/youmi/android/a/a/i/a/b/e;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->g:Lnet/youmi/android/a/a/i/a/b/e;

    invoke-interface {v0, p1, p2, p3, p4}, Lnet/youmi/android/a/a/i/a/b/e;->a(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    :cond_1
    :goto_2
    return-void

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_0
.end method

.method public a(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, Lnet/youmi/android/a/a/i/a/b;->o:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->i:Lnet/youmi/android/a/a/i/a/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->i:Lnet/youmi/android/a/a/i/a/i;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/i;->f()V

    :cond_0
    :try_start_0
    invoke-direct {p0}, Lnet/youmi/android/a/a/i/a/b;->l()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/youmi/android/a/a/i/a/b;->b:Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    :try_start_1
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->g:Lnet/youmi/android/a/a/i/a/b/e;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->g:Lnet/youmi/android/a/a/i/a/b/e;

    invoke-interface {v0, p1, p2}, Lnet/youmi/android/a/a/i/a/b/e;->a(Landroid/webkit/WebView;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :cond_1
    :goto_1
    return-void

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method public a(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    :try_start_0
    iget-boolean v0, p0, Lnet/youmi/android/a/a/i/a/b;->o:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lnet/youmi/android/a/a/i/a/b;->k()V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/youmi/android/a/a/i/a/b;->b:Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    :try_start_1
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->g:Lnet/youmi/android/a/a/i/a/b/e;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->g:Lnet/youmi/android/a/a/i/a/b/e;

    invoke-interface {v0, p1, p2, p3}, Lnet/youmi/android/a/a/i/a/b/e;->a(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :cond_1
    :goto_1
    return-void

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method public a(Lnet/youmi/android/a/a/i/a/b/e;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/i/a/b;->g:Lnet/youmi/android/a/a/i/a/b/e;

    return-void
.end method

.method public a()Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->f:Lnet/youmi/android/a/a/i/a/b/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->f:Lnet/youmi/android/a/a/i/a/b/c;

    invoke-interface {v0}, Lnet/youmi/android/a/a/i/a/b/c;->c()Z
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

.method public a(Ljava/lang/Runnable;)Z
    .locals 1

    if-eqz p1, :cond_0

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

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Lnet/youmi/android/a/a/i/a/i;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->i:Lnet/youmi/android/a/a/i/a/i;

    return-object v0
.end method

.method public b(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public c(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->e:Lnet/youmi/android/a/a/e/d/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->e:Lnet/youmi/android/a/a/e/d/b;

    invoke-interface {v0, p2}, Lnet/youmi/android/a/a/e/d/b;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->f:Lnet/youmi/android/a/a/i/a/b/c;

    invoke-interface {v0}, Lnet/youmi/android/a/a/i/a/b/c;->c()Z

    move-result v0

    return v0
.end method

.method public canGoBack()Z
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->f:Lnet/youmi/android/a/a/i/a/b/c;

    invoke-interface {v0}, Lnet/youmi/android/a/a/i/a/b/c;->canGoBack()Z

    move-result v0

    return v0
.end method

.method public canGoForward()Z
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->f:Lnet/youmi/android/a/a/i/a/b/c;

    invoke-interface {v0}, Lnet/youmi/android/a/a/i/a/b/c;->canGoForward()Z

    move-result v0

    return v0
.end method

.method public clearHistory()V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->f:Lnet/youmi/android/a/a/i/a/b/c;

    invoke-interface {v0}, Lnet/youmi/android/a/a/i/a/b/c;->clearHistory()V

    return-void
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->f:Lnet/youmi/android/a/a/i/a/b/c;

    invoke-interface {v0}, Lnet/youmi/android/a/a/i/a/b/c;->d()Z

    move-result v0

    return v0
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->f:Lnet/youmi/android/a/a/i/a/b/c;

    invoke-interface {v0}, Lnet/youmi/android/a/a/i/a/b/c;->e()V

    return-void
.end method

.method public f()Lnet/youmi/android/a/a/e/a;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->f:Lnet/youmi/android/a/a/i/a/b/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->f:Lnet/youmi/android/a/a/i/a/b/c;

    invoke-interface {v0}, Lnet/youmi/android/a/a/i/a/b/c;->clearHistory()V

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

.method public g()V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->f:Lnet/youmi/android/a/a/i/a/b/c;

    invoke-interface {v0}, Lnet/youmi/android/a/a/i/a/b/c;->g()V

    return-void
.end method

.method public getCurrentView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->h:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public h()V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->f:Lnet/youmi/android/a/a/i/a/b/c;

    invoke-interface {v0}, Lnet/youmi/android/a/a/i/a/b/c;->h()V

    return-void
.end method

.method public i()V
    .locals 1

    iget-boolean v0, p0, Lnet/youmi/android/a/a/i/a/b;->o:Z

    if-eqz v0, :cond_0

    :cond_0
    return-void
.end method

.method public j()V
    .locals 3

    iget-boolean v0, p0, Lnet/youmi/android/a/a/i/a/b;->o:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->p:Lnet/youmi/android/a/a/i/a/f;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->p:Lnet/youmi/android/a/a/i/a/f;

    iget-object v0, v0, Lnet/youmi/android/a/a/i/a/f;->a:Ljava/lang/String;

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/b;->p:Lnet/youmi/android/a/a/i/a/f;

    iget-object v1, v1, Lnet/youmi/android/a/a/i/a/f;->a:Ljava/lang/String;

    invoke-static {v1}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/b;->p:Lnet/youmi/android/a/a/i/a/f;

    iget-object v1, v1, Lnet/youmi/android/a/a/i/a/f;->a:Ljava/lang/String;

    const-string v2, "null"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->p:Lnet/youmi/android/a/a/i/a/f;

    iget-object v0, v0, Lnet/youmi/android/a/a/i/a/f;->a:Ljava/lang/String;

    const-string v1, "null"

    invoke-static {}, Lnet/youmi/android/a/a/e/g/e;->p()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v1

    new-instance v2, Lnet/youmi/android/a/a/i/a/c;

    invoke-direct {v2, p0, v0}, Lnet/youmi/android/a/a/i/a/c;-><init>(Lnet/youmi/android/a/a/i/a/b;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/b/k/m;->a(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method public loadUrl(Ljava/lang/String;)V
    .locals 2

    iget-boolean v0, p0, Lnet/youmi/android/a/a/i/a/b;->o:Z

    if-eqz v0, :cond_2

    invoke-static {}, Lnet/youmi/android/a/a/i/a/b/g;->a()Lnet/youmi/android/a/a/i/a/b/g;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b/g;->d()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0}, Lnet/youmi/android/a/a/i/a/b;->k()V

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->p:Lnet/youmi/android/a/a/i/a/f;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/a/i/a/f;

    invoke-direct {v0, p0}, Lnet/youmi/android/a/a/i/a/f;-><init>(Lnet/youmi/android/a/a/i/a/b;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->p:Lnet/youmi/android/a/a/i/a/f;

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->p:Lnet/youmi/android/a/a/i/a/f;

    iput-object p1, v0, Lnet/youmi/android/a/a/i/a/f;->a:Ljava/lang/String;

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->p:Lnet/youmi/android/a/a/i/a/f;

    const/4 v1, 0x1

    iput v1, v0, Lnet/youmi/android/a/a/i/a/f;->c:I

    :cond_1
    :goto_0
    return-void

    :cond_2
    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->i:Lnet/youmi/android/a/a/i/a/i;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->i:Lnet/youmi/android/a/a/i/a/i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/i/a/i;->setVisibility(I)V

    :cond_3
    if-eqz p1, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->f:Lnet/youmi/android/a/a/i/a/b/c;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/youmi/android/a/a/i/a/b;->b:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/youmi/android/a/a/i/a/b;->a:Z

    iput-object p1, p0, Lnet/youmi/android/a/a/i/a/b;->d:Ljava/lang/String;

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->f:Lnet/youmi/android/a/a/i/a/b/c;

    invoke-interface {v0, p1}, Lnet/youmi/android/a/a/i/a/b/c;->loadUrl(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->k:Lnet/youmi/android/a/a/i/a/j;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/j;->b()Landroid/widget/Button;

    move-result-object v0

    if-ne p1, v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->f:Lnet/youmi/android/a/a/i/a/b/c;

    invoke-interface {v0}, Lnet/youmi/android/a/a/i/a/b/c;->reload()V

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->k:Lnet/youmi/android/a/a/i/a/j;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/i/a/j;->setVisibility(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->f:Lnet/youmi/android/a/a/i/a/b/c;

    invoke-interface {v0}, Lnet/youmi/android/a/a/i/a/b/c;->getCurrentView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->k:Lnet/youmi/android/a/a/i/a/j;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/j;->a()Landroid/widget/Button;

    move-result-object v0

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->n:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/b/k/i;->a(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public postUrl(Ljava/lang/String;[B)V
    .locals 2

    iget-boolean v0, p0, Lnet/youmi/android/a/a/i/a/b;->o:Z

    if-eqz v0, :cond_2

    invoke-static {}, Lnet/youmi/android/a/a/i/a/b/g;->a()Lnet/youmi/android/a/a/i/a/b/g;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b/g;->d()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0}, Lnet/youmi/android/a/a/i/a/b;->k()V

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->p:Lnet/youmi/android/a/a/i/a/f;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/a/i/a/f;

    invoke-direct {v0, p0}, Lnet/youmi/android/a/a/i/a/f;-><init>(Lnet/youmi/android/a/a/i/a/b;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->p:Lnet/youmi/android/a/a/i/a/f;

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->p:Lnet/youmi/android/a/a/i/a/f;

    iput-object p1, v0, Lnet/youmi/android/a/a/i/a/f;->a:Ljava/lang/String;

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->p:Lnet/youmi/android/a/a/i/a/f;

    const/4 v1, 0x2

    iput v1, v0, Lnet/youmi/android/a/a/i/a/f;->c:I

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->p:Lnet/youmi/android/a/a/i/a/f;

    iput-object p2, v0, Lnet/youmi/android/a/a/i/a/f;->b:[B

    :cond_1
    :goto_0
    return-void

    :cond_2
    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->i:Lnet/youmi/android/a/a/i/a/i;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->i:Lnet/youmi/android/a/a/i/a/i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/i/a/i;->setVisibility(I)V

    :cond_3
    if-eqz p1, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->f:Lnet/youmi/android/a/a/i/a/b/c;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/youmi/android/a/a/i/a/b;->b:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/youmi/android/a/a/i/a/b;->a:Z

    iput-object p1, p0, Lnet/youmi/android/a/a/i/a/b;->d:Ljava/lang/String;

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->f:Lnet/youmi/android/a/a/i/a/b/c;

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/b;->d:Ljava/lang/String;

    invoke-interface {v0, v1, p2}, Lnet/youmi/android/a/a/i/a/b/c;->postUrl(Ljava/lang/String;[B)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public reload()V
    .locals 2

    iget-boolean v0, p0, Lnet/youmi/android/a/a/i/a/b;->o:Z

    if-eqz v0, :cond_2

    invoke-static {}, Lnet/youmi/android/a/a/i/a/b/g;->a()Lnet/youmi/android/a/a/i/a/b/g;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b/g;->d()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->p:Lnet/youmi/android/a/a/i/a/f;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/a/i/a/f;

    invoke-direct {v0, p0}, Lnet/youmi/android/a/a/i/a/f;-><init>(Lnet/youmi/android/a/a/i/a/b;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->p:Lnet/youmi/android/a/a/i/a/f;

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->p:Lnet/youmi/android/a/a/i/a/f;

    const/4 v1, 0x3

    iput v1, v0, Lnet/youmi/android/a/a/i/a/f;->c:I

    :cond_1
    :goto_0
    return-void

    :cond_2
    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->i:Lnet/youmi/android/a/a/i/a/i;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->i:Lnet/youmi/android/a/a/i/a/i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/i/a/i;->setVisibility(I)V

    :cond_3
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->f:Lnet/youmi/android/a/a/i/a/b/c;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/youmi/android/a/a/i/a/b;->b:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/youmi/android/a/a/i/a/b;->a:Z

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/b;->f:Lnet/youmi/android/a/a/i/a/b/c;

    invoke-interface {v0}, Lnet/youmi/android/a/a/i/a/b/c;->reload()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method
