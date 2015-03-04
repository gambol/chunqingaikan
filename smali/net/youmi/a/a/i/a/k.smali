.class Lnet/youmi/android/a/a/i/a/k;
.super Landroid/widget/LinearLayout;


# instance fields
.field private a:Landroid/widget/ProgressBar;

.field private b:Landroid/widget/TextView;

.field private c:Lnet/youmi/android/a/a/i/a/m;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 10

    const/4 v9, -0x1

    const/4 v8, -0x2

    const/high16 v7, 0x41400000    # 12.0f

    const/4 v6, 0x0

    const/4 v5, 0x0

    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-static {p1}, Lnet/youmi/android/a/b/k/f;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/k/f;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/b/k/f;->a(I)I

    move-result v1

    const/4 v2, 0x5

    invoke-virtual {v0, v2}, Lnet/youmi/android/a/b/k/f;->a(I)I

    move-result v2

    int-to-float v2, v2

    const/16 v3, 0x8

    new-array v3, v3, [F

    aput v2, v3, v5

    const/4 v4, 0x1

    aput v2, v3, v4

    const/4 v4, 0x2

    aput v2, v3, v4

    const/4 v4, 0x3

    aput v2, v3, v4

    const/4 v4, 0x4

    aput v2, v3, v4

    const/4 v4, 0x5

    aput v2, v3, v4

    const/4 v4, 0x6

    aput v2, v3, v4

    const/4 v4, 0x7

    aput v2, v3, v4

    new-instance v2, Landroid/graphics/drawable/shapes/RoundRectShape;

    invoke-direct {v2, v3, v6, v6}, Landroid/graphics/drawable/shapes/RoundRectShape;-><init>([FLandroid/graphics/RectF;[F)V

    new-instance v3, Landroid/graphics/drawable/ShapeDrawable;

    invoke-direct {v3, v2}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    const/16 v2, 0x96

    invoke-static {v2, v5, v5, v5}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    invoke-virtual {v3}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0, v5}, Lnet/youmi/android/a/a/i/a/k;->setOrientation(I)V

    invoke-virtual {p0, v1, v1, v1, v1}, Lnet/youmi/android/a/a/i/a/k;->setPadding(IIII)V

    invoke-virtual {p0, v3}, Lnet/youmi/android/a/a/i/a/k;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v8, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v2, 0x11

    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    const/4 v2, 0x3

    invoke-virtual {v0, v2}, Lnet/youmi/android/a/b/k/f;->a(I)I

    move-result v0

    invoke-virtual {v1, v0, v0, v0, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    new-instance v0, Landroid/widget/ProgressBar;

    const v2, 0x1010079

    invoke-direct {v0, p1, v6, v2}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v0, p0, Lnet/youmi/android/a/a/i/a/k;->a:Landroid/widget/ProgressBar;

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/k;->a:Landroid/widget/ProgressBar;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/k;->a:Landroid/widget/ProgressBar;

    invoke-virtual {p0, v0, v1}, Lnet/youmi/android/a/a/i/a/k;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/i/a/k;->b:Landroid/widget/TextView;

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/k;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/k;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setTextSize(F)V

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/k;->b:Landroid/widget/TextView;

    invoke-virtual {p0, v0, v1}, Lnet/youmi/android/a/a/i/a/k;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Lnet/youmi/android/a/a/i/a/m;

    invoke-direct {v0, p0, v6}, Lnet/youmi/android/a/a/i/a/m;-><init>(Lnet/youmi/android/a/a/i/a/k;Lnet/youmi/android/a/a/i/a/l;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/i/a/k;->c:Lnet/youmi/android/a/a/i/a/m;

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/k;->c:Lnet/youmi/android/a/a/i/a/m;

    invoke-virtual {v0, v5}, Lnet/youmi/android/a/a/i/a/m;->b(I)Lnet/youmi/android/a/a/i/a/m;

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/k;->c:Lnet/youmi/android/a/a/i/a/m;

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/k;->a:Landroid/widget/ProgressBar;

    invoke-virtual {v1}, Landroid/widget/ProgressBar;->getIndeterminateDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/i/a/m;->a(Landroid/graphics/drawable/Drawable;)Lnet/youmi/android/a/a/i/a/m;

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/k;->c:Lnet/youmi/android/a/a/i/a/m;

    invoke-virtual {v0, v9}, Lnet/youmi/android/a/a/i/a/m;->a(I)Lnet/youmi/android/a/a/i/a/m;

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/k;->c:Lnet/youmi/android/a/a/i/a/m;

    invoke-virtual {v0, v7}, Lnet/youmi/android/a/a/i/a/m;->a(F)Lnet/youmi/android/a/a/i/a/m;

    return-void
.end method


# virtual methods
.method a(Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/k;->b:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/k;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/k;->a:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :goto_1
    return-void

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/k;->b:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1
.end method
