.class public Lnet/youmi/android/a/a/j/b;
.super Landroid/widget/RelativeLayout;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lnet/youmi/android/a/a/j/c;

.field private c:Landroid/view/View;

.field private d:Landroid/view/View;

.field private e:Landroid/view/View;

.field private f:Landroid/view/View;

.field private g:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/a/j/c;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lnet/youmi/android/a/a/j/b;->b:Lnet/youmi/android/a/a/j/c;

    iput-object p1, p0, Lnet/youmi/android/a/a/j/b;->a:Landroid/content/Context;

    const-string v0, "#333333"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/j/b;->setBackgroundColor(I)V

    invoke-direct {p0}, Lnet/youmi/android/a/a/j/b;->a()V

    invoke-virtual {p0, v1}, Lnet/youmi/android/a/a/j/b;->setBackEnable(Z)V

    invoke-virtual {p0, v1}, Lnet/youmi/android/a/a/j/b;->setForwardEnable(Z)V

    return-void
.end method

.method private a()V
    .locals 8

    :try_start_0
    new-instance v0, Landroid/widget/TableLayout;

    iget-object v1, p0, Lnet/youmi/android/a/a/j/b;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/TableLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TableLayout;->setStretchAllColumns(Z)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/TableLayout;->setColumnStretchable(IZ)V

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/TableLayout;->setColumnStretchable(IZ)V

    const/4 v1, 0x2

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/TableLayout;->setColumnStretchable(IZ)V

    const/4 v1, 0x3

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/TableLayout;->setColumnStretchable(IZ)V

    new-instance v1, Landroid/widget/TableRow;

    iget-object v2, p0, Lnet/youmi/android/a/a/j/b;->a:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/widget/TableRow;-><init>(Landroid/content/Context;)V

    iget-object v2, p0, Lnet/youmi/android/a/a/j/b;->a:Landroid/content/Context;

    invoke-static {v2}, Lnet/youmi/android/a/b/k/f;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/k/f;

    move-result-object v2

    const/16 v3, 0x30

    invoke-virtual {v2, v3}, Lnet/youmi/android/a/b/k/f;->a(I)I

    move-result v2

    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v3, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v4, 0xd

    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    new-instance v4, Lnet/youmi/android/a/b/l/a;

    iget-object v5, p0, Lnet/youmi/android/a/a/j/b;->a:Landroid/content/Context;

    invoke-static {}, Lnet/youmi/android/a/a/h/b;->b()Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lnet/youmi/android/a/a/h/b;->c()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lnet/youmi/android/a/b/l/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v4, p0, Lnet/youmi/android/a/a/j/b;->c:Landroid/view/View;

    new-instance v4, Lnet/youmi/android/a/b/l/a;

    iget-object v5, p0, Lnet/youmi/android/a/a/j/b;->a:Landroid/content/Context;

    invoke-static {}, Lnet/youmi/android/a/a/h/b;->d()Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lnet/youmi/android/a/a/h/b;->e()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lnet/youmi/android/a/b/l/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v4, p0, Lnet/youmi/android/a/a/j/b;->d:Landroid/view/View;

    new-instance v4, Lnet/youmi/android/a/b/l/a;

    iget-object v5, p0, Lnet/youmi/android/a/a/j/b;->a:Landroid/content/Context;

    invoke-static {}, Lnet/youmi/android/a/a/h/b;->f()Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lnet/youmi/android/a/a/h/b;->g()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lnet/youmi/android/a/b/l/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v4, p0, Lnet/youmi/android/a/a/j/b;->e:Landroid/view/View;

    new-instance v4, Lnet/youmi/android/a/b/l/a;

    iget-object v5, p0, Lnet/youmi/android/a/a/j/b;->a:Landroid/content/Context;

    invoke-static {}, Lnet/youmi/android/a/a/h/b;->a()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Lnet/youmi/android/a/b/l/a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v4, p0, Lnet/youmi/android/a/a/j/b;->g:Landroid/view/View;

    const/4 v4, 0x0

    iget-object v5, p0, Lnet/youmi/android/a/a/j/b;->c:Landroid/view/View;

    invoke-virtual {p0, v1, v4, v5, v3}, Lnet/youmi/android/a/a/j/b;->a(Landroid/widget/TableRow;ILandroid/view/View;Landroid/widget/RelativeLayout$LayoutParams;)V

    const/4 v4, 0x1

    iget-object v5, p0, Lnet/youmi/android/a/a/j/b;->d:Landroid/view/View;

    invoke-virtual {p0, v1, v4, v5, v3}, Lnet/youmi/android/a/a/j/b;->a(Landroid/widget/TableRow;ILandroid/view/View;Landroid/widget/RelativeLayout$LayoutParams;)V

    const/4 v4, 0x2

    iget-object v5, p0, Lnet/youmi/android/a/a/j/b;->e:Landroid/view/View;

    invoke-virtual {p0, v1, v4, v5, v3}, Lnet/youmi/android/a/a/j/b;->a(Landroid/widget/TableRow;ILandroid/view/View;Landroid/widget/RelativeLayout$LayoutParams;)V

    const/4 v4, 0x3

    iget-object v5, p0, Lnet/youmi/android/a/a/j/b;->g:Landroid/view/View;

    invoke-virtual {p0, v1, v4, v5, v3}, Lnet/youmi/android/a/a/j/b;->a(Landroid/widget/TableRow;ILandroid/view/View;Landroid/widget/RelativeLayout$LayoutParams;)V

    invoke-virtual {v0, v1}, Landroid/widget/TableLayout;->addView(Landroid/view/View;)V

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v1, v3, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0, v1}, Lnet/youmi/android/a/a/j/b;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method protected a(Landroid/widget/TableRow;ILandroid/view/View;Landroid/widget/RelativeLayout$LayoutParams;)V
    .locals 3

    const/4 v1, -0x2

    new-instance v0, Landroid/widget/TableRow$LayoutParams;

    invoke-direct {v0, v1, v1}, Landroid/widget/TableRow$LayoutParams;-><init>(II)V

    iput p2, v0, Landroid/widget/TableRow$LayoutParams;->column:I

    new-instance v1, Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lnet/youmi/android/a/a/j/b;->a:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {p3, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v1, p3, p4}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1, v1, v0}, Landroid/widget/TableRow;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/j/b;->b:Lnet/youmi/android/a/a/j/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b;->c:Landroid/view/View;

    if-ne p1, v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b;->b:Lnet/youmi/android/a/a/j/c;

    invoke-interface {v0}, Lnet/youmi/android/a/a/j/c;->c()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lnet/youmi/android/a/a/j/b;->d:Landroid/view/View;

    if-ne p1, v0, :cond_2

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b;->b:Lnet/youmi/android/a/a/j/c;

    invoke-interface {v0}, Lnet/youmi/android/a/a/j/c;->d()V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lnet/youmi/android/a/a/j/b;->f:Landroid/view/View;

    if-ne p1, v0, :cond_3

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b;->b:Lnet/youmi/android/a/a/j/c;

    invoke-interface {v0}, Lnet/youmi/android/a/a/j/c;->e()V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lnet/youmi/android/a/a/j/b;->e:Landroid/view/View;

    if-ne p1, v0, :cond_4

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b;->b:Lnet/youmi/android/a/a/j/c;

    invoke-interface {v0}, Lnet/youmi/android/a/a/j/c;->b()V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lnet/youmi/android/a/a/j/b;->g:Landroid/view/View;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b;->b:Lnet/youmi/android/a/a/j/c;

    invoke-interface {v0}, Lnet/youmi/android/a/a/j/c;->f()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0
.end method

.method public setBackEnable(Z)V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b;->c:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b;->c:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    :cond_0
    return-void
.end method

.method public setForwardEnable(Z)V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b;->d:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b;->d:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    :cond_0
    return-void
.end method
