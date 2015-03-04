.class Lnet/youmi/android/a/a/j/c/c;
.super Ljava/lang/Object;


# static fields
.field private static a:Landroid/graphics/drawable/NinePatchDrawable;


# direct methods
.method private static a(Landroid/content/Context;)Landroid/graphics/drawable/NinePatchDrawable;
    .locals 2

    sget-object v0, Lnet/youmi/android/a/a/j/c/c;->a:Landroid/graphics/drawable/NinePatchDrawable;

    if-nez v0, :cond_1

    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    invoke-static {}, Lnet/youmi/android/a/a/h/b;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lnet/youmi/android/a/a/h/b;->j()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lnet/youmi/android/a/b/k/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/NinePatchDrawable;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/a/a/j/c/c;->a:Landroid/graphics/drawable/NinePatchDrawable;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_1
    sget-object v0, Lnet/youmi/android/a/a/j/c/c;->a:Landroid/graphics/drawable/NinePatchDrawable;

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method static a(Landroid/content/Context;Ljava/lang/String;I)Landroid/widget/RelativeLayout;
    .locals 7

    const/4 v6, -0x2

    const/high16 v5, -0x1000000

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {p0}, Lnet/youmi/android/a/b/k/f;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/k/f;

    move-result-object v0

    new-instance v1, Landroid/widget/RelativeLayout;

    invoke-direct {v1, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v5}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v3, "#ffcc00"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v0, v4}, Lnet/youmi/android/a/b/k/f;->a(F)F

    move-result v3

    invoke-virtual {v2, v3, v4, v4, v5}, Landroid/widget/TextView;->setShadowLayer(FFFI)V

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v3, 0x41800000    # 16.0f

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Lnet/youmi/android/a/b/k/f;->a(I)I

    move-result v0

    invoke-virtual {v2, v0, v0, v0, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    const/16 v0, 0x13

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setGravity(I)V

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v3, 0x108009b

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {v2, v0, v3, v4, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    const/16 v0, 0x12

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    if-lez p2, :cond_0

    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setWidth(I)V

    :cond_0
    :try_start_1
    invoke-static {p0}, Lnet/youmi/android/a/a/j/c/c;->a(Landroid/content/Context;)Landroid/graphics/drawable/NinePatchDrawable;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :cond_1
    :goto_1
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v6, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v3, 0xd

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-object v1

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0
.end method
