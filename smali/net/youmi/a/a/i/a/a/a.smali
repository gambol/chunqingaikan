.class public abstract Lnet/youmi/android/a/a/i/a/a/a;
.super Landroid/app/Dialog;

# interfaces
.implements Lnet/youmi/android/a/a/e/a/b/f;
.implements Lnet/youmi/android/a/a/e/d/b;
.implements Lnet/youmi/android/a/a/i/a/b/a;
.implements Lnet/youmi/android/a/a/j/a/a;
.implements Lnet/youmi/android/a/a/j/b/l;
.implements Lnet/youmi/android/a/a/j/j;


# instance fields
.field a:Lnet/youmi/android/a/a/i/a/b;

.field b:Lnet/youmi/android/a/a/j/d;

.field protected c:Landroid/content/Context;

.field protected d:Lnet/youmi/android/a/a/e/a/b/h;

.field private e:Landroid/widget/RelativeLayout;

.field private f:Landroid/widget/RelativeLayout;

.field private g:I

.field private h:I

.field private i:Lnet/youmi/android/a/a/e/g/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/g;Lnet/youmi/android/a/a/e/a/b/h;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p4}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->g:I

    iput v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->h:I

    invoke-virtual {p2}, Lnet/youmi/android/a/a/e/g/g;->w()Z

    move-result v0

    invoke-direct {p0, p1, p2, p3, v0}, Lnet/youmi/android/a/a/i/a/a/a;->a(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/g;Lnet/youmi/android/a/a/e/a/b/h;Z)V

    return-void
.end method

.method private a(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/g;Lnet/youmi/android/a/a/e/a/b/h;Z)V
    .locals 4

    const/4 v2, 0x2

    const/4 v1, 0x1

    invoke-virtual {p0}, Lnet/youmi/android/a/a/i/a/a/a;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Window;->requestFeature(I)Z

    if-nez p4, :cond_0

    invoke-virtual {p0}, Lnet/youmi/android/a/a/i/a/a/a;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/Window;->addFlags(I)V

    :cond_0
    iput-object p2, p0, Lnet/youmi/android/a/a/i/a/a/a;->i:Lnet/youmi/android/a/a/e/g/g;

    iput-object p1, p0, Lnet/youmi/android/a/a/i/a/a/a;->c:Landroid/content/Context;

    invoke-virtual {p0, v1}, Lnet/youmi/android/a/a/i/a/a/a;->setCanceledOnTouchOutside(Z)V

    iput-object p3, p0, Lnet/youmi/android/a/a/i/a/a/a;->d:Lnet/youmi/android/a/a/e/a/b/h;

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->d:Lnet/youmi/android/a/a/e/a/b/h;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->d:Lnet/youmi/android/a/a/e/a/b/h;

    invoke-interface {v0, p0}, Lnet/youmi/android/a/a/e/a/b/h;->a(Lnet/youmi/android/a/a/i/a/b/a;)V

    :cond_1
    invoke-direct {p0, p2}, Lnet/youmi/android/a/a/i/a/a/a;->a(Lnet/youmi/android/a/a/e/g/g;)V

    if-nez p4, :cond_2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->a:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b;->getCurrentView()Landroid/view/View;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_0
    invoke-virtual {p2}, Lnet/youmi/android/a/a/e/g/g;->m()I

    move-result v0

    if-ne v0, v2, :cond_3

    invoke-virtual {p2}, Lnet/youmi/android/a/a/e/g/g;->n()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lnet/youmi/android/a/a/e/g/g;->o()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->a:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {p2}, Lnet/youmi/android/a/a/e/g/g;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lnet/youmi/android/a/a/e/g/g;->n()Ljava/lang/String;

    move-result-object v2

    const-string v3, "BASE64"

    invoke-static {v2, v3}, Lorg/apache/http/util/EncodingUtils;->getBytes(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lnet/youmi/android/a/a/i/a/b;->postUrl(Ljava/lang/String;[B)V

    :goto_1
    return-void

    :cond_3
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->a:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {p2}, Lnet/youmi/android/a/a/e/g/g;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/i/a/b;->loadUrl(Ljava/lang/String;)V

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private a(Lnet/youmi/android/a/a/e/g/g;)V
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v7, 0x0

    const/4 v11, -0x1

    new-instance v2, Landroid/widget/RelativeLayout;

    iget-object v3, p0, Lnet/youmi/android/a/a/i/a/a/a;->c:Landroid/content/Context;

    invoke-direct {v2, v3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lnet/youmi/android/a/a/i/a/a/a;->e:Landroid/widget/RelativeLayout;

    new-instance v2, Lnet/youmi/android/a/a/i/a/a/b;

    iget-object v3, p0, Lnet/youmi/android/a/a/i/a/a/a;->c:Landroid/content/Context;

    invoke-direct {v2, v3, p0}, Lnet/youmi/android/a/a/i/a/a/b;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/i/a/a/a;)V

    iput-object v2, p0, Lnet/youmi/android/a/a/i/a/a/a;->f:Landroid/widget/RelativeLayout;

    :try_start_0
    iget-object v2, p0, Lnet/youmi/android/a/a/i/a/a/a;->i:Lnet/youmi/android/a/a/e/g/g;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lnet/youmi/android/a/a/i/a/a/a;->i:Lnet/youmi/android/a/a/e/g/g;

    invoke-virtual {v2}, Lnet/youmi/android/a/a/e/g/g;->h()Lnet/youmi/android/a/a/e/a/a/b;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :cond_0
    move-object v8, v0

    :goto_0
    new-instance v10, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v10, v11, v11}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/g;->d()I

    move-result v0

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/g;->d()I

    move-result v0

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_4

    move v0, v1

    :goto_1
    new-instance v1, Lnet/youmi/android/a/a/j/d;

    iget-object v2, p0, Lnet/youmi/android/a/a/i/a/a/a;->c:Landroid/content/Context;

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/g;->j()Lnet/youmi/android/a/a/j/a;

    move-result-object v3

    invoke-direct {v1, v2, v3, p0, v0}, Lnet/youmi/android/a/a/j/d;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/j/a;Lnet/youmi/android/a/a/j/j;Z)V

    iput-object v1, p0, Lnet/youmi/android/a/a/i/a/a/a;->b:Lnet/youmi/android/a/a/j/d;

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->b:Lnet/youmi/android/a/a/j/d;

    const/4 v1, 0x1

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

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/a/a;->f:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lnet/youmi/android/a/a/i/a/a/a;->b:Lnet/youmi/android/a/a/j/d;

    invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/a/a;->b:Lnet/youmi/android/a/a/j/d;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/j/d;->getId()I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2

    :cond_1
    :goto_2
    new-instance v0, Lnet/youmi/android/a/a/i/a/b;

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/a/a;->c:Landroid/content/Context;

    iget-object v2, p0, Lnet/youmi/android/a/a/i/a/a/a;->d:Lnet/youmi/android/a/a/e/a/b/h;

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/g;->d()I

    move-result v3

    iget-object v4, p0, Lnet/youmi/android/a/a/i/a/a/a;->i:Lnet/youmi/android/a/a/e/g/g;

    invoke-virtual {v4}, Lnet/youmi/android/a/a/e/g/g;->k()Ljava/lang/String;

    move-result-object v5

    iget-object v4, p0, Lnet/youmi/android/a/a/i/a/a/a;->i:Lnet/youmi/android/a/a/e/g/g;

    invoke-virtual {v4}, Lnet/youmi/android/a/a/e/g/g;->l()Ljava/lang/String;

    move-result-object v6

    move-object v4, p0

    move-object v9, p0

    invoke-direct/range {v0 .. v9}, Lnet/youmi/android/a/a/i/a/b;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/e/a/b/h;ILnet/youmi/android/a/a/e/d/b;Ljava/lang/String;Ljava/lang/String;ILnet/youmi/android/a/a/e/a/a/b;Lnet/youmi/android/a/a/j/b/l;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->a:Lnet/youmi/android/a/a/i/a/b;

    const/16 v0, 0xd

    invoke-virtual {v10, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    :try_start_2
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->c:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/b/k/f;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/k/f;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/b/k/f;->a(I)I

    move-result v1

    iget-object v2, p0, Lnet/youmi/android/a/a/i/a/a/a;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v1, v1, v1, v1}, Landroid/widget/RelativeLayout;->setPadding(IIII)V

    iget-object v2, p0, Lnet/youmi/android/a/a/i/a/a/a;->e:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v1, v1, v1, v1}, Landroid/widget/RelativeLayout;->setPadding(IIII)V

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/a/a;->i:Lnet/youmi/android/a/a/e/g/g;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/e/g/g;->w()Z

    move-result v1

    if-nez v1, :cond_2

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/b/k/f;->a(F)F

    move-result v0

    new-instance v1, Landroid/graphics/drawable/shapes/RoundRectShape;

    const/16 v2, 0x8

    new-array v2, v2, [F

    const/4 v3, 0x0

    aput v0, v2, v3

    const/4 v3, 0x1

    aput v0, v2, v3

    const/4 v3, 0x2

    aput v0, v2, v3

    const/4 v3, 0x3

    aput v0, v2, v3

    const/4 v3, 0x4

    aput v0, v2, v3

    const/4 v3, 0x5

    aput v0, v2, v3

    const/4 v3, 0x6

    aput v0, v2, v3

    const/4 v3, 0x7

    aput v0, v2, v3

    const/4 v0, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, v2, v0, v3}, Landroid/graphics/drawable/shapes/RoundRectShape;-><init>([FLandroid/graphics/RectF;[F)V

    new-instance v0, Landroid/graphics/drawable/ShapeDrawable;

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v1

    const-string v2, "#cc999999"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/a/a;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Lnet/youmi/android/a/a/i/a/a/a;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    const v2, 0x3f333333    # 0.7f

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    :cond_2
    :goto_3
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->f:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/a/a;->a:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/i/a/b;->getCurrentView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1, v10}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v11, v11}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/a/a;->e:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lnet/youmi/android/a/a/i/a/a/a;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->e:Landroid/widget/RelativeLayout;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v1, v11, v11}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0, v1}, Lnet/youmi/android/a/a/i/a/a/a;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->i:Lnet/youmi/android/a/a/e/g/g;

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/a/a;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/e/g/g;->a(Landroid/content/Context;)I

    move-result v0

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/a/a;->i:Lnet/youmi/android/a/a/e/g/g;

    iget-object v2, p0, Lnet/youmi/android/a/a/i/a/a/a;->c:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/g;->b(Landroid/content/Context;)I

    move-result v1

    if-lez v0, :cond_3

    if-lez v1, :cond_3

    iget-object v2, p0, Lnet/youmi/android/a/a/i/a/a/a;->i:Lnet/youmi/android/a/a/e/g/g;

    invoke-virtual {v2}, Lnet/youmi/android/a/a/e/g/g;->s()I

    move-result v2

    iget-object v3, p0, Lnet/youmi/android/a/a/i/a/a/a;->i:Lnet/youmi/android/a/a/e/g/g;

    invoke-virtual {v3}, Lnet/youmi/android/a/a/e/g/g;->t()I

    move-result v3

    invoke-virtual {p0, v2, v3, v0, v1}, Lnet/youmi/android/a/a/i/a/a/a;->a(IIII)V

    :cond_3
    return-void

    :catch_0
    move-exception v2

    move-object v8, v0

    goto/16 :goto_0

    :cond_4
    move v0, v7

    goto/16 :goto_1

    :catch_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    goto/16 :goto_2
.end method

.method private b()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->a:Lnet/youmi/android/a/a/i/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->a:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b;->b()Lnet/youmi/android/a/a/i/a/i;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->a:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b;->b()Lnet/youmi/android/a/a/i/a/i;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/i;->b()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->a:Lnet/youmi/android/a/a/i/a/b;

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
    .locals 4

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->i:Lnet/youmi/android/a/a/e/g/g;

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/a/a;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/e/g/g;->a(Landroid/content/Context;)I

    move-result v0

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/a/a;->i:Lnet/youmi/android/a/a/e/g/g;

    iget-object v2, p0, Lnet/youmi/android/a/a/i/a/a/a;->c:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/g;->b(Landroid/content/Context;)I

    move-result v1

    if-lez v0, :cond_0

    if-lez v1, :cond_0

    iget v2, p0, Lnet/youmi/android/a/a/i/a/a/a;->g:I

    if-ne v0, v2, :cond_1

    iget v2, p0, Lnet/youmi/android/a/a/i/a/a/a;->h:I

    if-ne v1, v2, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v2, p0, Lnet/youmi/android/a/a/i/a/a/a;->i:Lnet/youmi/android/a/a/e/g/g;

    invoke-virtual {v2}, Lnet/youmi/android/a/a/e/g/g;->s()I

    move-result v2

    iget-object v3, p0, Lnet/youmi/android/a/a/i/a/a/a;->i:Lnet/youmi/android/a/a/e/g/g;

    invoke-virtual {v3}, Lnet/youmi/android/a/a/e/g/g;->t()I

    move-result v3

    invoke-virtual {p0, v2, v3, v0, v1}, Lnet/youmi/android/a/a/i/a/a/a;->a(IIII)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public a(I)V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->b:Lnet/youmi/android/a/a/j/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->b:Lnet/youmi/android/a/a/j/d;

    invoke-virtual {v0, p1}, Lnet/youmi/android/a/a/j/d;->setTitleBackgroundColor(I)V

    :cond_0
    return-void
.end method

.method public a(IIII)V
    .locals 6

    const/16 v3, -0x270f

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/a/i/a/a/a;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    if-ne p1, v3, :cond_2

    const/4 v0, 0x1

    :goto_0
    if-ne p2, v3, :cond_3

    or-int/lit8 v0, v0, 0x10

    :goto_1
    iput p3, v2, Landroid/view/WindowManager$LayoutParams;->width:I

    iput p4, v2, Landroid/view/WindowManager$LayoutParams;->height:I

    iget-object v3, p0, Lnet/youmi/android/a/a/i/a/a/a;->c:Landroid/content/Context;

    invoke-static {v3}, Lnet/youmi/android/a/b/k/f;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/k/f;

    move-result-object v3

    iget v4, v2, Landroid/view/WindowManager$LayoutParams;->width:I

    const/16 v5, 0x10

    invoke-virtual {v3, v5}, Lnet/youmi/android/a/b/k/f;->a(I)I

    move-result v5

    add-int/2addr v4, v5

    iput v4, v2, Landroid/view/WindowManager$LayoutParams;->width:I

    iget v4, v2, Landroid/view/WindowManager$LayoutParams;->height:I

    const/16 v5, 0x10

    invoke-virtual {v3, v5}, Lnet/youmi/android/a/b/k/f;->a(I)I

    move-result v5

    add-int/2addr v4, v5

    iput v4, v2, Landroid/view/WindowManager$LayoutParams;->height:I

    iget v4, v2, Landroid/view/WindowManager$LayoutParams;->width:I

    invoke-virtual {v3}, Lnet/youmi/android/a/b/k/f;->b()I

    move-result v5

    if-le v4, v5, :cond_0

    invoke-virtual {v3}, Lnet/youmi/android/a/b/k/f;->b()I

    move-result v4

    iput v4, v2, Landroid/view/WindowManager$LayoutParams;->width:I

    :cond_0
    iget v4, v2, Landroid/view/WindowManager$LayoutParams;->height:I

    invoke-virtual {v3}, Lnet/youmi/android/a/b/k/f;->c()I

    move-result v5

    if-le v4, v5, :cond_1

    invoke-virtual {v3}, Lnet/youmi/android/a/b/k/f;->c()I

    move-result v3

    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->height:I

    :cond_1
    iput p3, p0, Lnet/youmi/android/a/a/i/a/a/a;->g:I

    iput p4, p0, Lnet/youmi/android/a/a/i/a/a/a;->h:I

    invoke-virtual {v1, v0}, Landroid/view/Window;->setGravity(I)V

    invoke-virtual {v1, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    :goto_2
    return-void

    :cond_2
    const/4 v0, 0x3

    iput p1, v2, Landroid/view/WindowManager$LayoutParams;->x:I

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_3
    or-int/lit8 v0, v0, 0x30

    iput p2, v2, Landroid/view/WindowManager$LayoutParams;->y:I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    throw v0
.end method

.method public a(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->b:Lnet/youmi/android/a/a/j/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->b:Lnet/youmi/android/a/a/j/d;

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
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->a:Lnet/youmi/android/a/a/i/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->a:Lnet/youmi/android/a/a/i/a/b;

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

    if-eqz p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->a:Lnet/youmi/android/a/a/i/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->a:Lnet/youmi/android/a/a/i/a/b;

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

.method public b(I)V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->b:Lnet/youmi/android/a/a/j/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->b:Lnet/youmi/android/a/a/j/d;

    invoke-virtual {v0, p1}, Lnet/youmi/android/a/a/j/d;->setPoints(I)V

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->b:Lnet/youmi/android/a/a/j/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->b:Lnet/youmi/android/a/a/j/d;

    invoke-virtual {v0, p1}, Lnet/youmi/android/a/a/j/d;->setPointsUnit(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->a:Lnet/youmi/android/a/a/i/a/b;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->a:Lnet/youmi/android/a/a/i/a/b;

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

.method public c(I)V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->b:Lnet/youmi/android/a/a/j/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->b:Lnet/youmi/android/a/a/j/d;

    invoke-virtual {v0, p1}, Lnet/youmi/android/a/a/j/d;->setPointsLayoutVisibility(I)V

    :cond_0
    return-void
.end method

.method public f()Lnet/youmi/android/a/a/e/a;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->a:Lnet/youmi/android/a/a/i/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->a:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b;->clearHistory()V

    sget-object v0, Lnet/youmi/android/a/a/e/a;->b:Lnet/youmi/android/a/a/e/a;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :cond_0
    sget-object v0, Lnet/youmi/android/a/a/e/a;->c:Lnet/youmi/android/a/a/e/a;

    goto :goto_0
.end method

.method public g()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->a:Lnet/youmi/android/a/a/i/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->a:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->a:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b;->c()Z

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0}, Lnet/youmi/android/a/a/i/a/a/a;->cancel()V
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

    invoke-direct {p0}, Lnet/youmi/android/a/a/i/a/a/a;->b()V

    return-void
.end method

.method public j()V
    .locals 0

    return-void
.end method

.method public k()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/a/a/i/a/a/a;->b()V

    return-void
.end method

.method public l()Z
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/a/i/a/a/a;->cancel()V
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
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->a:Lnet/youmi/android/a/a/i/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->a:Lnet/youmi/android/a/a/i/a/b;

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

.method public onBackPressed()V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->a:Lnet/youmi/android/a/a/i/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/a;->a:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0}, Lnet/youmi/android/a/a/i/a/a/a;->cancel()V

    goto :goto_0
.end method
