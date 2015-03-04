.class public Lnet/youmi/android/a/a/j/d;
.super Landroid/widget/LinearLayout;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/widget/RelativeLayout;

.field private b:Landroid/widget/LinearLayout;

.field private c:Landroid/widget/RelativeLayout;

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private j:Landroid/widget/TextView;

.field private k:Lnet/youmi/android/a/a/j/j;

.field private l:Landroid/view/GestureDetector;

.field private m:Landroid/view/GestureDetector;

.field private n:Landroid/view/View;

.field private o:I

.field private p:Lnet/youmi/android/a/a/j/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/a/j/a;Lnet/youmi/android/a/a/j/j;Z)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const-string v0, "#FFFFBB34"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lnet/youmi/android/a/a/j/d;->o:I

    iput-object p3, p0, Lnet/youmi/android/a/a/j/d;->k:Lnet/youmi/android/a/a/j/j;

    iput-object p2, p0, Lnet/youmi/android/a/a/j/d;->p:Lnet/youmi/android/a/a/j/a;

    invoke-direct {p0, p1}, Lnet/youmi/android/a/a/j/d;->a(Landroid/content/Context;)V

    invoke-direct {p0, p1}, Lnet/youmi/android/a/a/j/d;->b(Landroid/content/Context;)V

    invoke-direct {p0, p1, p4}, Lnet/youmi/android/a/a/j/d;->a(Landroid/content/Context;Z)V

    invoke-direct {p0}, Lnet/youmi/android/a/a/j/d;->a()V

    return-void
.end method

.method static synthetic a(Lnet/youmi/android/a/a/j/d;)Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->h:Landroid/widget/TextView;

    return-object v0
.end method

.method private a(I)Ljava/lang/String;
    .locals 7

    const/4 v1, 0x0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    div-int/lit8 v0, v0, 0x3

    add-int/lit8 v5, v0, 0x1

    move v2, v1

    :goto_0
    if-ge v2, v5, :cond_2

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    mul-int/lit8 v6, v2, 0x3

    sub-int v6, v0, v6

    add-int/lit8 v0, v6, -0x3

    if-lez v0, :cond_1

    add-int/lit8 v0, v6, -0x3

    :goto_1
    invoke-virtual {v4, v0, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v1, v0}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v5, -0x1

    if-eq v2, v0, :cond_0

    const-string v0, ","

    invoke-virtual {v3, v1, v0}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a()V
    .locals 3

    const/4 v2, 0x4

    const/4 v1, 0x0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->p:Lnet/youmi/android/a/a/j/a;

    iget-object v0, v0, Lnet/youmi/android/a/a/j/a;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/j/d;->setTitle(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->p:Lnet/youmi/android/a/a/j/a;

    iget v0, v0, Lnet/youmi/android/a/a/j/a;->c:I

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/j/d;->setPoints(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->p:Lnet/youmi/android/a/a/j/a;

    iget-object v0, v0, Lnet/youmi/android/a/a/j/a;->d:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/j/d;->setPointsUnit(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->p:Lnet/youmi/android/a/a/j/a;

    iget v0, v0, Lnet/youmi/android/a/a/j/a;->b:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1}, Lnet/youmi/android/a/a/j/d;->setBackBtnVisibiity(I)V

    :goto_0
    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->p:Lnet/youmi/android/a/a/j/a;

    iget v0, v0, Lnet/youmi/android/a/a/j/a;->b:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_1

    invoke-virtual {p0, v1}, Lnet/youmi/android/a/a/j/d;->setPointsLayoutVisibility(I)V

    :goto_1
    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->p:Lnet/youmi/android/a/a/j/a;

    iget v0, v0, Lnet/youmi/android/a/a/j/a;->b:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_2

    invoke-virtual {p0, v1}, Lnet/youmi/android/a/a/j/d;->setLogoVisibility(I)V

    :goto_2
    return-void

    :cond_0
    invoke-virtual {p0, v2}, Lnet/youmi/android/a/a/j/d;->setBackBtnVisibiity(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v2}, Lnet/youmi/android/a/a/j/d;->setPointsLayoutVisibility(I)V

    goto :goto_1

    :cond_2
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/j/d;->setLogoVisibility(I)V

    goto :goto_2
.end method

.method private a(Landroid/content/Context;)V
    .locals 4

    const/4 v3, -0x2

    const/4 v2, -0x1

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lnet/youmi/android/a/a/j/d;->setOrientation(I)V

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/j/d;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->p:Lnet/youmi/android/a/a/j/a;

    iget v0, v0, Lnet/youmi/android/a/a/j/a;->e:I

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->p:Lnet/youmi/android/a/a/j/a;

    iget v0, v0, Lnet/youmi/android/a/a/j/a;->e:I

    iput v0, p0, Lnet/youmi/android/a/a/j/d;->o:I

    :cond_0
    iget v0, p0, Lnet/youmi/android/a/a/j/d;->o:I

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/j/d;->setBackgroundColor(I)V

    new-instance v0, Landroid/widget/RelativeLayout;

    invoke-direct {v0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/j/d;->a:Landroid/widget/RelativeLayout;

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iget-object v1, p0, Lnet/youmi/android/a/a/j/d;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/j/d;->addView(Landroid/view/View;)V

    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/j/d;->n:Landroid/view/View;

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->n:Landroid/view/View;

    const-string v1, "#20999999"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {p1, v1}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v1

    invoke-direct {v0, v2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget-object v1, p0, Lnet/youmi/android/a/a/j/d;->n:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->n:Landroid/view/View;

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/j/d;->addView(Landroid/view/View;)V

    return-void
.end method

.method private a(Landroid/content/Context;Z)V
    .locals 3

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->d:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz p2, :cond_2

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->b:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    new-instance v0, Landroid/view/GestureDetector;

    new-instance v1, Lnet/youmi/android/a/a/j/i;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lnet/youmi/android/a/a/j/i;-><init>(Lnet/youmi/android/a/a/j/d;I)V

    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/j/d;->m:Landroid/view/GestureDetector;

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->b:Landroid/widget/LinearLayout;

    new-instance v1, Lnet/youmi/android/a/a/j/g;

    invoke-direct {v1, p0}, Lnet/youmi/android/a/a/j/g;-><init>(Lnet/youmi/android/a/a/j/d;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :cond_1
    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->c:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_2

    new-instance v0, Landroid/view/GestureDetector;

    new-instance v1, Lnet/youmi/android/a/a/j/i;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lnet/youmi/android/a/a/j/i;-><init>(Lnet/youmi/android/a/a/j/d;I)V

    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/j/d;->l:Landroid/view/GestureDetector;

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->c:Landroid/widget/RelativeLayout;

    new-instance v1, Lnet/youmi/android/a/a/j/h;

    invoke-direct {v1, p0}, Lnet/youmi/android/a/a/j/h;-><init>(Lnet/youmi/android/a/a/j/d;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :cond_2
    return-void
.end method

.method static synthetic b(Lnet/youmi/android/a/a/j/d;)Landroid/view/GestureDetector;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->m:Landroid/view/GestureDetector;

    return-object v0
.end method

.method private b(Landroid/content/Context;)V
    .locals 10

    const/4 v9, 0x1

    const/4 v5, 0x2

    const/high16 v8, 0x40a00000    # 5.0f

    const/4 v7, 0x0

    const/4 v6, -0x2

    new-instance v0, Landroid/widget/ImageView;

    invoke-direct {v0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/j/d;->d:Landroid/widget/ImageView;

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, v9}, Landroid/widget/ImageView;->setId(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->d:Landroid/widget/ImageView;

    invoke-static {}, Lnet/youmi/android/a/a/h/b;->k()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lnet/youmi/android/a/b/k/b;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->d:Landroid/widget/ImageView;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->d:Landroid/widget/ImageView;

    invoke-static {p1, v8}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v1

    const/high16 v2, 0x41200000    # 10.0f

    invoke-static {p1, v2}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v2

    invoke-static {p1, v8}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v3

    const/high16 v4, 0x41200000    # 10.0f

    invoke-static {p1, v4}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/ImageView;->setPadding(IIII)V

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/high16 v1, 0x42480000    # 50.0f

    invoke-static {p1, v1}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v1

    const/high16 v2, 0x420c0000    # 35.0f

    invoke-static {p1, v2}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v1, p0, Lnet/youmi/android/a/a/j/d;->a:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lnet/youmi/android/a/a/j/d;->d:Landroid/widget/ImageView;

    invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/j/d;->b:Landroid/widget/LinearLayout;

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setId(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->b:Landroid/widget/LinearLayout;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->b:Landroid/widget/LinearLayout;

    invoke-static {p1, v8}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {p1, v2}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v2

    invoke-static {p1, v8}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v3

    const/high16 v4, 0x40000000    # 2.0f

    invoke-static {p1, v4}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v6, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v1, p0, Lnet/youmi/android/a/a/j/d;->a:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lnet/youmi/android/a/a/j/d;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/j/d;->e:Landroid/widget/TextView;

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->e:Landroid/widget/TextView;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v0, v5, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->e:Landroid/widget/TextView;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->e:Landroid/widget/TextView;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget-object v1, p0, Lnet/youmi/android/a/a/j/d;->b:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lnet/youmi/android/a/a/j/d;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v2, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/j/d;->f:Landroid/widget/TextView;

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->f:Landroid/widget/TextView;

    const/high16 v1, 0x41300000    # 11.0f

    invoke-virtual {v0, v5, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->f:Landroid/widget/TextView;

    const-string v1, "#40000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->f:Landroid/widget/TextView;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->f:Landroid/widget/TextView;

    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v3, 0x3f800000    # 1.0f

    const v4, -0x333334

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->setShadowLayer(FFFI)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget-object v1, p0, Lnet/youmi/android/a/a/j/d;->b:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lnet/youmi/android/a/a/j/d;->f:Landroid/widget/TextView;

    invoke-virtual {v1, v2, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/j/d;->i:Landroid/widget/TextView;

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->i:Landroid/widget/TextView;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setId(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->i:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->i:Landroid/widget/TextView;

    const/high16 v1, 0x41b00000    # 22.0f

    invoke-virtual {v0, v5, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->i:Landroid/widget/TextView;

    const-string v1, "#13000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundColor(I)V

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p1, v1}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v1

    invoke-direct {v0, v1, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-static {p1, v8}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v1

    invoke-static {p1, v8}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v2

    invoke-virtual {v0, v7, v1, v7, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    invoke-virtual {v0, v9, v9}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v1, p0, Lnet/youmi/android/a/a/j/d;->a:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lnet/youmi/android/a/a/j/d;->i:Landroid/widget/TextView;

    invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/j/d;->j:Landroid/widget/TextView;

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->j:Landroid/widget/TextView;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setId(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->j:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->j:Landroid/widget/TextView;

    const/high16 v1, 0x41b00000    # 22.0f

    invoke-virtual {v0, v5, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->j:Landroid/widget/TextView;

    const-string v1, "#13000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundColor(I)V

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p1, v1}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v1

    invoke-direct {v0, v1, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-static {p1, v8}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v1

    invoke-static {p1, v8}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v2

    invoke-virtual {v0, v7, v1, v7, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    invoke-virtual {v0, v7, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v1, p0, Lnet/youmi/android/a/a/j/d;->a:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lnet/youmi/android/a/a/j/d;->j:Landroid/widget/TextView;

    invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/RelativeLayout;

    invoke-direct {v0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/j/d;->c:Landroid/widget/RelativeLayout;

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->c:Landroid/widget/RelativeLayout;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setId(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->c:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-static {p1, v1}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v1

    invoke-static {p1, v8}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v2

    invoke-virtual {v0, v1, v7, v2, v7}, Landroid/widget/RelativeLayout;->setPadding(IIII)V

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v6, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0x10

    invoke-virtual {v0, v9, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/16 v1, 0x11

    invoke-virtual {v0, v7, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v1, p0, Lnet/youmi/android/a/a/j/d;->a:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lnet/youmi/android/a/a/j/d;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/j/d;->g:Landroid/widget/TextView;

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->g:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setId(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setSingleLine(Z)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->g:Landroid/widget/TextView;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxEms(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->g:Landroid/widget/TextView;

    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->g:Landroid/widget/TextView;

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-virtual {v0, v5, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->g:Landroid/widget/TextView;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->g:Landroid/widget/TextView;

    const/16 v1, 0x13

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v6, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v1, p0, Lnet/youmi/android/a/a/j/d;->c:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lnet/youmi/android/a/a/j/d;->g:Landroid/widget/TextView;

    invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p1, v0}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v0

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lnet/youmi/android/a/a/j/d;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lnet/youmi/android/a/a/j/d;->h:Landroid/widget/TextView;

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setId(I)V

    iget-object v1, p0, Lnet/youmi/android/a/a/j/d;->h:Landroid/widget/TextView;

    const/high16 v2, 0x41100000    # 9.0f

    invoke-virtual {v1, v5, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v1, p0, Lnet/youmi/android/a/a/j/d;->h:Landroid/widget/TextView;

    iget v2, p0, Lnet/youmi/android/a/a/j/d;->o:I

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v1, p0, Lnet/youmi/android/a/a/j/d;->h:Landroid/widget/TextView;

    const/high16 v2, 0x40400000    # 3.0f

    invoke-static {p1, v2}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v2

    const/high16 v3, 0x40400000    # 3.0f

    invoke-static {p1, v3}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {v1, v2, v7, v3, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    :try_start_0
    new-instance v1, Landroid/text/SpannableString;

    invoke-static {}, Lnet/youmi/android/a/a/h/a;->t()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    new-instance v2, Landroid/text/style/StyleSpan;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Landroid/text/style/StyleSpan;-><init>(I)V

    const/4 v3, 0x0

    invoke-virtual {v1}, Landroid/text/SpannableString;->length()I

    move-result v4

    const/16 v5, 0x12

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    iget-object v2, p0, Lnet/youmi/android/a/a/j/d;->h:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-object v1, p0, Lnet/youmi/android/a/a/j/d;->h:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    new-instance v2, Lnet/youmi/android/a/a/j/e;

    invoke-direct {v2, p0, v0}, Lnet/youmi/android/a/a/j/e;-><init>(Lnet/youmi/android/a/a/j/d;I)V

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v6, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-static {p1, v8}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v1

    invoke-static {p1, v8}, Lnet/youmi/android/a/b/k/e;->a(Landroid/content/Context;F)I

    move-result v2

    invoke-virtual {v0, v1, v2, v7, v7}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/4 v1, 0x4

    invoke-virtual {v0, v9, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    iget-object v1, p0, Lnet/youmi/android/a/a/j/d;->c:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lnet/youmi/android/a/a/j/d;->h:Landroid/widget/TextView;

    invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :catch_0
    move-exception v1

    iget-object v1, p0, Lnet/youmi/android/a/a/j/d;->h:Landroid/widget/TextView;

    invoke-static {}, Lnet/youmi/android/a/a/h/a;->t()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method static synthetic c(Lnet/youmi/android/a/a/j/d;)Landroid/view/GestureDetector;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->l:Landroid/view/GestureDetector;

    return-object v0
.end method

.method static synthetic d(Lnet/youmi/android/a/a/j/d;)Lnet/youmi/android/a/a/j/j;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->k:Lnet/youmi/android/a/a/j/j;

    return-object v0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->k:Lnet/youmi/android/a/a/j/j;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->k:Lnet/youmi/android/a/a/j/j;

    invoke-interface {v0}, Lnet/youmi/android/a/a/j/j;->g()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public setBackBtnVisibiity(I)V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->d:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->i:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->i:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public setLogoVisibility(I)V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->h:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->h:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public setPoints(I)V
    .locals 5

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->e:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    :try_start_0
    new-instance v0, Landroid/text/SpannableString;

    invoke-direct {p0, p1}, Lnet/youmi/android/a/a/j/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    new-instance v1, Landroid/text/style/TypefaceSpan;

    const-string v2, "sans-serif"

    invoke-direct {v1, v2}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    move-result v3

    const/16 v4, 0x12

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    iget-object v1, p0, Lnet/youmi/android/a/a/j/d;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->e:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public setPointsLayoutVisibility(I)V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->b:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->j:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->j:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public setPointsUnit(Ljava/lang/CharSequence;)V
    .locals 5

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->f:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    :try_start_0
    new-instance v0, Landroid/text/SpannableString;

    invoke-direct {v0, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    new-instance v1, Landroid/text/style/TypefaceSpan;

    const-string v2, "sans-serif"

    invoke-direct {v1, v2}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    move-result v3

    const/16 v4, 0x12

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    iget-object v1, p0, Lnet/youmi/android/a/a/j/d;->f:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 5

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->g:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    :try_start_0
    new-instance v0, Landroid/text/SpannableString;

    invoke-direct {v0, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    new-instance v1, Landroid/text/style/StyleSpan;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Landroid/text/style/StyleSpan;-><init>(I)V

    const/4 v2, 0x0

    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    move-result v3

    const/16 v4, 0x12

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    iget-object v1, p0, Lnet/youmi/android/a/a/j/d;->g:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/d;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public setTitleBackgroundColor(I)V
    .locals 0

    iput p1, p0, Lnet/youmi/android/a/a/j/d;->o:I

    invoke-virtual {p0, p1}, Lnet/youmi/android/a/a/j/d;->setBackgroundColor(I)V

    return-void
.end method
