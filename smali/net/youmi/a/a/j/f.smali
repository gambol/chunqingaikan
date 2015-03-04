.class Lnet/youmi/android/a/a/j/f;
.super Landroid/graphics/drawable/shapes/Shape;


# instance fields
.field final synthetic a:Lnet/youmi/android/a/a/j/e;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/a/j/e;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/j/f;->a:Lnet/youmi/android/a/a/j/e;

    invoke-direct {p0}, Landroid/graphics/drawable/shapes/Shape;-><init>()V

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 9

    const/high16 v8, 0x3f000000    # 0.5f

    const/4 v7, 0x0

    const/high16 v6, 0x41100000    # 9.0f

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const-string v0, "#55E89D04"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 v0, 0x40400000    # 3.0f

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    sget-object v0, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lnet/youmi/android/a/a/j/f;->a:Lnet/youmi/android/a/a/j/e;

    iget v1, v1, Lnet/youmi/android/a/a/j/e;->a:I

    int-to-float v1, v1

    iget-object v2, p0, Lnet/youmi/android/a/a/j/f;->a:Lnet/youmi/android/a/a/j/e;

    iget v2, v2, Lnet/youmi/android/a/a/j/e;->a:I

    int-to-float v2, v2

    iget-object v3, p0, Lnet/youmi/android/a/a/j/f;->a:Lnet/youmi/android/a/a/j/e;

    iget-object v3, v3, Lnet/youmi/android/a/a/j/e;->b:Lnet/youmi/android/a/a/j/d;

    invoke-static {v3}, Lnet/youmi/android/a/a/j/d;->a(Lnet/youmi/android/a/a/j/d;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/TextView;->getWidth()I

    move-result v3

    iget-object v4, p0, Lnet/youmi/android/a/a/j/f;->a:Lnet/youmi/android/a/a/j/e;

    iget v4, v4, Lnet/youmi/android/a/a/j/e;->a:I

    sub-int/2addr v3, v4

    int-to-float v3, v3

    add-float/2addr v3, v8

    iget-object v4, p0, Lnet/youmi/android/a/a/j/f;->a:Lnet/youmi/android/a/a/j/e;

    iget-object v4, v4, Lnet/youmi/android/a/a/j/e;->b:Lnet/youmi/android/a/a/j/d;

    invoke-static {v4}, Lnet/youmi/android/a/a/j/d;->a(Lnet/youmi/android/a/a/j/d;)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {v4}, Landroid/widget/TextView;->getHeight()I

    move-result v4

    iget-object v5, p0, Lnet/youmi/android/a/a/j/f;->a:Lnet/youmi/android/a/a/j/e;

    iget v5, v5, Lnet/youmi/android/a/a/j/e;->a:I

    sub-int/2addr v4, v5

    int-to-float v4, v4

    add-float/2addr v4, v8

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {p1, v0, v6, v6, p2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    const/4 v0, -0x1

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lnet/youmi/android/a/a/j/f;->a:Lnet/youmi/android/a/a/j/e;

    iget-object v1, v1, Lnet/youmi/android/a/a/j/e;->b:Lnet/youmi/android/a/a/j/d;

    invoke-static {v1}, Lnet/youmi/android/a/a/j/d;->a(Lnet/youmi/android/a/a/j/d;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/TextView;->getWidth()I

    move-result v1

    iget-object v2, p0, Lnet/youmi/android/a/a/j/f;->a:Lnet/youmi/android/a/a/j/e;

    iget v2, v2, Lnet/youmi/android/a/a/j/e;->a:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lnet/youmi/android/a/a/j/f;->a:Lnet/youmi/android/a/a/j/e;

    iget-object v2, v2, Lnet/youmi/android/a/a/j/e;->b:Lnet/youmi/android/a/a/j/d;

    invoke-static {v2}, Lnet/youmi/android/a/a/j/d;->a(Lnet/youmi/android/a/a/j/d;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/TextView;->getHeight()I

    move-result v2

    iget-object v3, p0, Lnet/youmi/android/a/a/j/f;->a:Lnet/youmi/android/a/a/j/e;

    iget v3, v3, Lnet/youmi/android/a/a/j/e;->a:I

    sub-int/2addr v2, v3

    int-to-float v2, v2

    invoke-direct {v0, v7, v7, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {p1, v0, v6, v6, p2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    return-void
.end method
