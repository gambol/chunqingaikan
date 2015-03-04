.class public abstract Lnet/youmi/android/a/a/j/b/f;
.super Landroid/widget/LinearLayout;


# instance fields
.field protected a:Landroid/view/View;

.field private b:F

.field private c:Lnet/youmi/android/a/a/j/b/l;

.field private d:Lnet/youmi/android/a/a/j/b/d;

.field private e:I

.field private f:Z

.field private g:I

.field private h:Lnet/youmi/android/a/a/j/b/c;

.field private i:Lnet/youmi/android/a/a/j/b/m;

.field private j:Z

.field private k:Z


# direct methods
.method public varargs constructor <init>(Landroid/content/Context;[Ljava/lang/Object;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lnet/youmi/android/a/a/j/b/f;->b:F

    iput-boolean v1, p0, Lnet/youmi/android/a/a/j/b/f;->f:Z

    sget-object v0, Lnet/youmi/android/a/a/j/b/c;->a:Lnet/youmi/android/a/a/j/b/c;

    iput-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->h:Lnet/youmi/android/a/a/j/b/c;

    iput-boolean v1, p0, Lnet/youmi/android/a/a/j/b/f;->j:Z

    iput-boolean v1, p0, Lnet/youmi/android/a/a/j/b/f;->k:Z

    invoke-direct {p0, p1, p2}, Lnet/youmi/android/a/a/j/b/f;->a(Landroid/content/Context;[Ljava/lang/Object;)V

    return-void
.end method

.method private a(I)V
    .locals 6

    const-wide/16 v2, 0x96

    const-wide/16 v4, 0x0

    move-object v0, p0

    move v1, p1

    invoke-direct/range {v0 .. v5}, Lnet/youmi/android/a/a/j/b/f;->a(IJJ)V

    return-void
.end method

.method private a(IJJ)V
    .locals 6

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->i:Lnet/youmi/android/a/a/j/b/m;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->i:Lnet/youmi/android/a/a/j/b/m;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/j/b/m;->a()V

    :cond_0
    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/b/f;->getScrollY()I

    move-result v0

    if-eq v0, p1, :cond_1

    new-instance v0, Lnet/youmi/android/a/a/j/b/m;

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/b/f;->getScrollY()I

    move-result v2

    move-object v1, p0

    move v3, p1

    move-wide v4, p2

    invoke-direct/range {v0 .. v5}, Lnet/youmi/android/a/a/j/b/m;-><init>(Lnet/youmi/android/a/a/j/b/f;IIJ)V

    iput-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->i:Lnet/youmi/android/a/a/j/b/m;

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->i:Lnet/youmi/android/a/a/j/b/m;

    invoke-virtual {p0, v0, p4, p5}, Lnet/youmi/android/a/a/j/b/f;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return-void
.end method

.method private varargs a(Landroid/content/Context;[Ljava/lang/Object;)V
    .locals 4

    const/4 v3, -0x1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/j/b/f;->setOrientation(I)V

    invoke-virtual {p0, v3}, Lnet/youmi/android/a/a/j/b/f;->setBackgroundColor(I)V

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lnet/youmi/android/a/a/j/b/f;->g:I

    new-instance v0, Lnet/youmi/android/a/a/j/b/a;

    invoke-direct {v0, p1}, Lnet/youmi/android/a/a/j/b/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->d:Lnet/youmi/android/a/a/j/b/d;

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->d:Lnet/youmi/android/a/a/j/b/d;

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v1, v3, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0, v1}, Lnet/youmi/android/a/a/j/b/f;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0, p1, p2}, Lnet/youmi/android/a/a/j/b/f;->b(Landroid/content/Context;[Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->a:Landroid/view/View;

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->a:Landroid/view/View;

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0, v1}, Lnet/youmi/android/a/a/j/b/f;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/b/f;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lnet/youmi/android/a/a/j/b/g;

    invoke-direct {v1, p0}, Lnet/youmi/android/a/a/j/b/g;-><init>(Lnet/youmi/android/a/a/j/b/f;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method static synthetic a(Lnet/youmi/android/a/a/j/b/f;)V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/a/a/j/b/f;->g()V

    return-void
.end method

.method static synthetic a(Lnet/youmi/android/a/a/j/b/f;I)V
    .locals 0

    invoke-direct {p0, p1}, Lnet/youmi/android/a/a/j/b/f;->a(I)V

    return-void
.end method

.method static synthetic a(Lnet/youmi/android/a/a/j/b/f;Z)Z
    .locals 0

    iput-boolean p1, p0, Lnet/youmi/android/a/a/j/b/f;->j:Z

    return p1
.end method

.method static synthetic b(Lnet/youmi/android/a/a/j/b/f;)Lnet/youmi/android/a/a/j/b/d;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->d:Lnet/youmi/android/a/a/j/b/d;

    return-object v0
.end method

.method static synthetic c(Lnet/youmi/android/a/a/j/b/f;)I
    .locals 1

    iget v0, p0, Lnet/youmi/android/a/a/j/b/f;->e:I

    return v0
.end method

.method static synthetic d(Lnet/youmi/android/a/a/j/b/f;)Lnet/youmi/android/a/a/j/b/l;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->c:Lnet/youmi/android/a/a/j/b/l;

    return-object v0
.end method

.method private g()V
    .locals 4

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->d:Lnet/youmi/android/a/a/j/b/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->d:Lnet/youmi/android/a/a/j/b/d;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/j/b/d;->getHeight()I

    move-result v0

    iput v0, p0, Lnet/youmi/android/a/a/j/b/f;->e:I

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/b/f;->getPaddingLeft()I

    move-result v0

    iget-object v1, p0, Lnet/youmi/android/a/a/j/b/f;->d:Lnet/youmi/android/a/a/j/b/d;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/j/b/d;->getMeasuredHeight()I

    move-result v1

    neg-int v1, v1

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/b/f;->getPaddingRight()I

    move-result v2

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/b/f;->getPaddingBottom()I

    move-result v3

    invoke-virtual {p0, v0, v1, v2, v3}, Lnet/youmi/android/a/a/j/b/f;->setPadding(IIII)V

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lnet/youmi/android/a/a/j/b/f;->e:I

    goto :goto_0
.end method


# virtual methods
.method protected a(F)V
    .locals 3

    const/4 v2, 0x0

    const/4 v1, 0x0

    cmpg-float v0, p1, v2

    if-gez v0, :cond_1

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/b/f;->getScrollY()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr v0, p1

    cmpl-float v0, v0, v2

    if-ltz v0, :cond_1

    invoke-virtual {p0, v1, v1}, Lnet/youmi/android/a/a/j/b/f;->scrollTo(II)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    float-to-int v0, p1

    neg-int v0, v0

    invoke-virtual {p0, v1, v0}, Lnet/youmi/android/a/a/j/b/f;->scrollBy(II)V

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/b/f;->getScrollY()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/b/f;->e()Z

    move-result v1

    if-nez v1, :cond_0

    iget v1, p0, Lnet/youmi/android/a/a/j/b/f;->e:I

    if-lt v0, v1, :cond_2

    sget-object v0, Lnet/youmi/android/a/a/j/b/c;->c:Lnet/youmi/android/a/a/j/b/c;

    iput-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->h:Lnet/youmi/android/a/a/j/b/c;

    :goto_1
    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->d:Lnet/youmi/android/a/a/j/b/d;

    iget-object v1, p0, Lnet/youmi/android/a/a/j/b/f;->h:Lnet/youmi/android/a/a/j/b/c;

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/j/b/d;->setState(Lnet/youmi/android/a/a/j/b/c;)V

    goto :goto_0

    :cond_2
    sget-object v0, Lnet/youmi/android/a/a/j/b/c;->b:Lnet/youmi/android/a/a/j/b/c;

    iput-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->h:Lnet/youmi/android/a/a/j/b/c;

    goto :goto_1
.end method

.method protected a(II)V
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->a:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    iget v1, v0, Landroid/widget/LinearLayout$LayoutParams;->height:I

    if-eq v1, p2, :cond_0

    iput p2, v0, Landroid/widget/LinearLayout$LayoutParams;->height:I

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method protected abstract a()Z
.end method

.method protected varargs abstract b(Landroid/content/Context;[Ljava/lang/Object;)Landroid/view/View;
.end method

.method public b()V
    .locals 1

    new-instance v0, Lnet/youmi/android/a/a/j/b/i;

    invoke-direct {v0, p0}, Lnet/youmi/android/a/a/j/b/i;-><init>(Lnet/youmi/android/a/a/j/b/f;)V

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/j/b/f;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method protected c()V
    .locals 4

    const/4 v3, 0x0

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/b/f;->getScrollY()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/b/f;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v2, p0, Lnet/youmi/android/a/a/j/b/f;->e:I

    if-gt v0, v2, :cond_0

    invoke-direct {p0, v3}, Lnet/youmi/android/a/a/j/b/f;->a(I)V

    :goto_0
    return-void

    :cond_0
    if-eqz v1, :cond_1

    iget v0, p0, Lnet/youmi/android/a/a/j/b/f;->e:I

    neg-int v0, v0

    invoke-direct {p0, v0}, Lnet/youmi/android/a/a/j/b/f;->a(I)V

    goto :goto_0

    :cond_1
    invoke-direct {p0, v3}, Lnet/youmi/android/a/a/j/b/f;->a(I)V

    goto :goto_0
.end method

.method protected d()V
    .locals 4

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/b/f;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->d:Lnet/youmi/android/a/a/j/b/d;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->d:Lnet/youmi/android/a/a/j/b/d;

    sget-object v1, Lnet/youmi/android/a/a/j/b/c;->d:Lnet/youmi/android/a/a/j/b/c;

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/j/b/d;->setState(Lnet/youmi/android/a/a/j/b/c;)V

    :cond_2
    sget-object v0, Lnet/youmi/android/a/a/j/b/c;->d:Lnet/youmi/android/a/a/j/b/c;

    iput-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->h:Lnet/youmi/android/a/a/j/b/c;

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->c:Lnet/youmi/android/a/a/j/b/l;

    if-eqz v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/a/j/b/j;

    invoke-direct {v0, p0}, Lnet/youmi/android/a/a/j/b/j;-><init>(Lnet/youmi/android/a/a/j/b/f;)V

    const-wide/16 v2, 0x96

    invoke-virtual {p0, v0, v2, v3}, Lnet/youmi/android/a/a/j/b/f;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method protected e()Z
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->h:Lnet/youmi/android/a/a/j/b/c;

    sget-object v1, Lnet/youmi/android/a/a/j/b/c;->d:Lnet/youmi/android/a/a/j/b/c;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public f()V
    .locals 4

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/b/f;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lnet/youmi/android/a/a/j/b/c;->a:Lnet/youmi/android/a/a/j/b/c;

    iput-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->h:Lnet/youmi/android/a/a/j/b/c;

    new-instance v0, Lnet/youmi/android/a/a/j/b/k;

    invoke-direct {v0, p0}, Lnet/youmi/android/a/a/j/b/k;-><init>(Lnet/youmi/android/a/a/j/b/f;)V

    const-wide/16 v2, 0x96

    invoke-virtual {p0, v0, v2, v3}, Lnet/youmi/android/a/a/j/b/f;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/b/f;->c()V

    :cond_0
    return-void
.end method

.method public getHeaderLoadingLayout()Lnet/youmi/android/a/a/j/b/d;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->d:Lnet/youmi/android/a/a/j/b/d;

    return-object v0
.end method

.method public getRefreshableView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/f;->a:Landroid/view/View;

    return-object v0
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    const/4 v1, 0x1

    const/4 v0, 0x0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    iget-boolean v2, p0, Lnet/youmi/android/a/a/j/b/f;->j:Z

    if-eqz v2, :cond_1

    iput-boolean v0, p0, Lnet/youmi/android/a/a/j/b/f;->k:Z

    :cond_0
    :goto_0
    return v1

    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    const/4 v3, 0x3

    if-eq v2, v3, :cond_2

    if-ne v2, v1, :cond_3

    :cond_2
    iput-boolean v0, p0, Lnet/youmi/android/a/a/j/b/f;->f:Z

    move v1, v0

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    if-eqz v2, :cond_4

    iget-boolean v2, p0, Lnet/youmi/android/a/a/j/b/f;->f:Z

    if-nez v2, :cond_0

    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    packed-switch v2, :pswitch_data_1

    :cond_5
    :goto_1
    iget-boolean v1, p0, Lnet/youmi/android/a/a/j/b/f;->f:Z

    goto :goto_0

    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    iput v2, p0, Lnet/youmi/android/a/a/j/b/f;->b:F

    iput-boolean v0, p0, Lnet/youmi/android/a/a/j/b/f;->f:Z

    iput-boolean v1, p0, Lnet/youmi/android/a/a/j/b/f;->k:Z

    goto :goto_1

    :pswitch_2
    iget-boolean v2, p0, Lnet/youmi/android/a/a/j/b/f;->k:Z

    if-eqz v2, :cond_5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    iget v3, p0, Lnet/youmi/android/a/a/j/b/f;->b:F

    sub-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v4, p0, Lnet/youmi/android/a/a/j/b/f;->g:I

    int-to-float v4, v4

    cmpl-float v3, v3, v4

    if-gtz v3, :cond_6

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/b/f;->e()Z

    move-result v3

    if-eqz v3, :cond_5

    :cond_6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    iput v3, p0, Lnet/youmi/android/a/a/j/b/f;->b:F

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/b/f;->a()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/b/f;->getScrollY()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    if-gtz v3, :cond_7

    const/high16 v3, 0x3f000000    # 0.5f

    cmpl-float v2, v2, v3

    if-lez v2, :cond_8

    :cond_7
    move v0, v1

    :cond_8
    iput-boolean v0, p0, Lnet/youmi/android/a/a/j/b/f;->f:Z

    goto :goto_1

    :pswitch_3
    iput-boolean v0, p0, Lnet/youmi/android/a/a/j/b/f;->k:Z

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method protected final onSizeChanged(IIII)V
    .locals 1

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;->onSizeChanged(IIII)V

    invoke-direct {p0}, Lnet/youmi/android/a/a/j/b/f;->g()V

    invoke-virtual {p0, p1, p2}, Lnet/youmi/android/a/a/j/b/f;->a(II)V

    new-instance v0, Lnet/youmi/android/a/a/j/b/h;

    invoke-direct {v0, p0}, Lnet/youmi/android/a/a/j/b/h;-><init>(Lnet/youmi/android/a/a/j/b/f;)V

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/j/b/f;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-boolean v2, p0, Lnet/youmi/android/a/a/j/b/f;->j:Z

    if-eqz v2, :cond_0

    iput-boolean v1, p0, Lnet/youmi/android/a/a/j/b/f;->k:Z

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    :cond_1
    :goto_1
    move v0, v1

    goto :goto_0

    :pswitch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    iput v2, p0, Lnet/youmi/android/a/a/j/b/f;->b:F

    iput-boolean v1, p0, Lnet/youmi/android/a/a/j/b/f;->f:Z

    iput-boolean v0, p0, Lnet/youmi/android/a/a/j/b/f;->k:Z

    goto :goto_1

    :pswitch_1
    iget-boolean v2, p0, Lnet/youmi/android/a/a/j/b/f;->k:Z

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    iget v3, p0, Lnet/youmi/android/a/a/j/b/f;->b:F

    sub-float/2addr v2, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    iput v3, p0, Lnet/youmi/android/a/a/j/b/f;->b:F

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/b/f;->a()Z

    move-result v3

    if-eqz v3, :cond_2

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v2, v1

    invoke-virtual {p0, v1}, Lnet/youmi/android/a/a/j/b/f;->a(F)V

    :goto_2
    move v1, v0

    goto :goto_1

    :cond_2
    iput-boolean v1, p0, Lnet/youmi/android/a/a/j/b/f;->f:Z

    move v0, v1

    goto :goto_2

    :pswitch_2
    iget-boolean v2, p0, Lnet/youmi/android/a/a/j/b/f;->k:Z

    if-eqz v2, :cond_1

    iput-boolean v1, p0, Lnet/youmi/android/a/a/j/b/f;->k:Z

    iget-boolean v2, p0, Lnet/youmi/android/a/a/j/b/f;->f:Z

    if-eqz v2, :cond_1

    iput-boolean v1, p0, Lnet/youmi/android/a/a/j/b/f;->f:Z

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/b/f;->a()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lnet/youmi/android/a/a/j/b/f;->h:Lnet/youmi/android/a/a/j/b/c;

    sget-object v3, Lnet/youmi/android/a/a/j/b/c;->c:Lnet/youmi/android/a/a/j/b/c;

    if-ne v2, v3, :cond_3

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/b/f;->d()V

    :goto_3
    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/b/f;->c()V

    move v1, v0

    goto :goto_1

    :cond_3
    move v0, v1

    goto :goto_3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public setOnRefreshListener(Lnet/youmi/android/a/a/j/b/l;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/j/b/f;->c:Lnet/youmi/android/a/a/j/b/l;

    return-void
.end method
