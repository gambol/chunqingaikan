package com.twocloo.com.cn.view; class CircleImageView { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/view/CircleImageView;
a=0;// .super Landroid/widget/ImageView;
a=0;// .source "CircleImageView.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final BITMAP_CONFIG:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;// .field private static final COLORDRAWABLE_DIMENSION:I = 0x1
a=0;// 
a=0;// .field private static final DEFAULT_BORDER_COLOR:I = -0x1000000
a=0;// 
a=0;// .field private static final DEFAULT_BORDER_WIDTH:I
a=0;// 
a=0;// .field private static final SCALE_TYPE:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field private mBitmapHeight:I
a=0;// 
a=0;// .field private final mBitmapPaint:Landroid/graphics/Paint;
a=0;// 
a=0;// .field private mBitmapShader:Landroid/graphics/BitmapShader;
a=0;// 
a=0;// .field private mBitmapWidth:I
a=0;// 
a=0;// .field private mBorderColor:I
a=0;// 
a=0;// .field private final mBorderPaint:Landroid/graphics/Paint;
a=0;// 
a=0;// .field private mBorderRadius:F
a=0;// 
a=0;// .field private final mBorderRect:Landroid/graphics/RectF;
a=0;// 
a=0;// .field private mBorderWidth:I
a=0;// 
a=0;// .field private mDrawableRadius:F
a=0;// 
a=0;// .field private final mDrawableRect:Landroid/graphics/RectF;
a=0;// 
a=0;// .field private mReady:Z
a=0;// 
a=0;// .field private mSetupPending:Z
a=0;// 
a=0;// .field private final mShaderMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView$ScaleType;);
a=0;//     sput-object v0, Lcom/twocloo/com/cn/view/CircleImageView;->SCALE_TYPE:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     .line 35
a=0;//     sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     sput-object v0, Lcom/twocloo/com/cn/view/CircleImageView;->BITMAP_CONFIG:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     .line 39
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 41
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/CircleImageView;);
a=0;//     new-instance v0, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/RectF;);
a=0;//     invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/RectF;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mDrawableRect:Landroid/graphics/RectF;
a=0;// 
a=0;//     .line 42
a=0;//     new-instance v0, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/RectF;);
a=0;//     invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/RectF;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderRect:Landroid/graphics/RectF;
a=0;// 
a=0;//     .line 44
a=0;//     new-instance v0, Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Matrix;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Matrix;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mShaderMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;//     .line 45
a=0;//     new-instance v0, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBitmapPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 46
a=0;//     new-instance v0, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 48
a=0;//     const/high16 v0, -0x1000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderColor:I
a=0;// 
a=0;//     .line 49
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderWidth:I
a=0;// 
a=0;//     .line 65
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/CircleImageView;->init()V
a=0;// 
a=0;//     .line 66
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0}, Lcom/twocloo/com/cn/view/CircleImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 70
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/CircleImageView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 4
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v3, -0x1000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 73
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 41
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/CircleImageView;);
a=0;//     new-instance v1, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/RectF;);
a=0;//     invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/RectF;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mDrawableRect:Landroid/graphics/RectF;
a=0;// 
a=0;//     .line 42
a=0;//     new-instance v1, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/RectF;);
a=0;//     invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/RectF;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderRect:Landroid/graphics/RectF;
a=0;// 
a=0;//     .line 44
a=0;//     new-instance v1, Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/Matrix;);
a=0;//     invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Matrix;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mShaderMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;//     .line 45
a=0;//     new-instance v1, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBitmapPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 46
a=0;//     new-instance v1, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 48
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderColor:I
a=0;// 
a=0;//     .line 49
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderWidth:I
a=0;// 
a=0;//     .line 75
a=0;//     sget-object v1, Lcom/twocloo/com/cn/R$styleable;->CircleImageView:[I
a=0;// 
a=0;//     invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 77
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     invoke-virtual {v0, v2, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderWidth:I
a=0;// 
a=0;//     .line 78
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getColor(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderColor:I
a=0;// 
a=0;//     .line 79
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 80
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/CircleImageView;->init()V
a=0;// 
a=0;//     .line 81
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getBitmapFromDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
a=0;//     .locals 8
a=0;//     .param p1, "drawable"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 171
a=0;//     #v3=(Null);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     move-object v0, v3
a=0;// 
a=0;//     .line 193
a=0;//     .end local p1    # "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 175
a=0;//     .restart local p1    # "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     instance-of v4, p1, Landroid/graphics/drawable/BitmapDrawable;
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 176
a=0;//     check-cast p1, Landroid/graphics/drawable/BitmapDrawable;
a=0;// 
a=0;//     .end local p1    # "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 182
a=0;//     .restart local p1    # "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);
a=0;//     instance-of v4, p1, Landroid/graphics/drawable/ColorDrawable;
a=0;// 
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 183
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     sget-object v6, Lcom/twocloo/com/cn/view/CircleImageView;->BITMAP_CONFIG:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     invoke-static {v4, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 188
a=0;//     .local v0, "bitmap":Landroid/graphics/Bitmap;
a=0;//     :goto_1
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);v4=(Integer);v5=(Integer);
a=0;//     new-instance v1, Landroid/graphics/Canvas;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/Canvas;);
a=0;//     invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 189
a=0;//     .local v1, "canvas":Landroid/graphics/Canvas;
a=0;//     #v1=(Reference,Landroid/graphics/Canvas;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v1}, Landroid/graphics/Canvas;->getWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v1}, Landroid/graphics/Canvas;->getHeight()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p1, v4, v5, v6, v7}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 190
a=0;//     invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 192
a=0;//     .end local v0    # "bitmap":Landroid/graphics/Bitmap;
a=0;//     .end local v1    # "canvas":Landroid/graphics/Canvas;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .local v2, "e":Ljava/lang/OutOfMemoryError;
a=0;//     #v2=(Reference,Ljava/lang/OutOfMemoryError;);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     .line 193
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 185
a=0;//     .end local v2    # "e":Ljava/lang/OutOfMemoryError;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Boolean);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sget-object v6, Lcom/twocloo/com/cn/view/CircleImageView;->BITMAP_CONFIG:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     invoke-static {v4, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .restart local v0    # "bitmap":Landroid/graphics/Bitmap;
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private init()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     sget-object v0, Lcom/twocloo/com/cn/view/CircleImageView;->SCALE_TYPE:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView$ScaleType;);
a=0;//     invoke-super {p0, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V
a=0;// 
a=0;//     .line 85
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mReady:Z
a=0;// 
a=0;//     .line 87
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mSetupPending:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 88
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/CircleImageView;->setup()V
a=0;// 
a=0;//     .line 89
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mSetupPending:Z
a=0;// 
a=0;//     .line 91
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setup()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/high16 v6, 0x40000000    # 2.0f
a=0;// 
a=0;//     .line 198
a=0;//     #v6=(Integer);
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mReady:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 199
a=0;//     iput-boolean v4, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mSetupPending:Z
a=0;// 
a=0;//     .line 228
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Float);v5=(Float);
a=0;//     return-void
a=0;// 
a=0;//     .line 203
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(One);v5=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 207
a=0;//     new-instance v0, Landroid/graphics/BitmapShader;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/BitmapShader;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     sget-object v2, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Shader$TileMode;);
a=0;//     sget-object v3, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Shader$TileMode;);
a=0;//     invoke-direct {v0, v1, v2, v3}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/BitmapShader;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBitmapShader:Landroid/graphics/BitmapShader;
a=0;// 
a=0;//     .line 209
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBitmapPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V
a=0;// 
a=0;//     .line 210
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBitmapPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBitmapShader:Landroid/graphics/BitmapShader;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;
a=0;// 
a=0;//     .line 212
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
a=0;// 
a=0;//     .line 213
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V
a=0;// 
a=0;//     .line 214
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderColor:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderWidth:I
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V
a=0;// 
a=0;//     .line 217
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBitmapHeight:I
a=0;// 
a=0;//     .line 218
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBitmapWidth:I
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderRect:Landroid/graphics/RectF;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/RectF;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/CircleImageView;->getWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/CircleImageView;->getHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {v0, v5, v5, v1, v2}, Landroid/graphics/RectF;->set(FFFF)V
a=0;// 
a=0;//     .line 221
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderRect:Landroid/graphics/RectF;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/RectF;->height()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderWidth:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     div-float/2addr v0, v6
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderRect:Landroid/graphics/RectF;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/RectF;);
a=0;//     invoke-virtual {v1}, Landroid/graphics/RectF;->width()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderWidth:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     sub-float/2addr v1, v2
a=0;// 
a=0;//     div-float/2addr v1, v6
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderRadius:F
a=0;// 
a=0;//     .line 223
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mDrawableRect:Landroid/graphics/RectF;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/RectF;);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderWidth:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderWidth:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderRect:Landroid/graphics/RectF;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/graphics/RectF;->width()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderWidth:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     sub-float/2addr v3, v4
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderRect:Landroid/graphics/RectF;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/RectF;);
a=0;//     invoke-virtual {v4}, Landroid/graphics/RectF;->height()F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderWidth:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     sub-float/2addr v4, v5
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V
a=0;// 
a=0;//     .line 224
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mDrawableRect:Landroid/graphics/RectF;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/RectF;->height()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     div-float/2addr v0, v6
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mDrawableRect:Landroid/graphics/RectF;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/RectF;);
a=0;//     invoke-virtual {v1}, Landroid/graphics/RectF;->width()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     div-float/2addr v1, v6
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mDrawableRadius:F
a=0;// 
a=0;//     .line 226
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/CircleImageView;->updateShaderMatrix()V
a=0;// 
a=0;//     .line 227
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/CircleImageView;->invalidate()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private updateShaderMatrix()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v6, 0x3f000000    # 0.5f
a=0;// 
a=0;//     .line 232
a=0;//     #v6=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 233
a=0;//     .local v0, "dx":F
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 235
a=0;//     .local v1, "dy":F
a=0;//     #v1=(Null);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mShaderMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Matrix;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V
a=0;// 
a=0;//     .line 237
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBitmapWidth:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mDrawableRect:Landroid/graphics/RectF;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/RectF;);
a=0;//     invoke-virtual {v4}, Landroid/graphics/RectF;->height()F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     mul-float/2addr v3, v4
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mDrawableRect:Landroid/graphics/RectF;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/RectF;);
a=0;//     invoke-virtual {v4}, Landroid/graphics/RectF;->width()F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBitmapHeight:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     mul-float/2addr v4, v5
a=0;// 
a=0;//     cmpl-float v3, v3, v4
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_0
a=0;// 
a=0;//     .line 238
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mDrawableRect:Landroid/graphics/RectF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/RectF;);
a=0;//     invoke-virtual {v3}, Landroid/graphics/RectF;->height()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBitmapHeight:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     div-float v2, v3, v4
a=0;// 
a=0;//     .line 239
a=0;//     .local v2, "scale":F
a=0;//     #v2=(Float);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mDrawableRect:Landroid/graphics/RectF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/RectF;);
a=0;//     invoke-virtual {v3}, Landroid/graphics/RectF;->width()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBitmapWidth:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     mul-float/2addr v4, v2
a=0;// 
a=0;//     sub-float/2addr v3, v4
a=0;// 
a=0;//     mul-float v0, v3, v6
a=0;// 
a=0;//     .line 245
a=0;//     :goto_0
a=0;//     #v0=(Float);v1=(Float);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mShaderMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v3, v2, v2}, Landroid/graphics/Matrix;->setScale(FF)V
a=0;// 
a=0;//     .line 246
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mShaderMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;//     add-float v4, v0, v6
a=0;// 
a=0;//     float-to-int v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderWidth:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v4, v5
a=0;// 
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     add-float v5, v1, v6
a=0;// 
a=0;//     #v5=(Float);
a=0;//     float-to-int v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderWidth:I
a=0;// 
a=0;//     add-int/2addr v5, v6
a=0;// 
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z
a=0;// 
a=0;//     .line 248
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBitmapShader:Landroid/graphics/BitmapShader;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mShaderMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v3, v4}, Landroid/graphics/BitmapShader;->setLocalMatrix(Landroid/graphics/Matrix;)V
a=0;// 
a=0;//     .line 249
a=0;//     return-void
a=0;// 
a=0;//     .line 241
a=0;//     .end local v2    # "scale":F
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Null);v2=(Uninit);v3=(Byte);v4=(Float);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mDrawableRect:Landroid/graphics/RectF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/RectF;);
a=0;//     invoke-virtual {v3}, Landroid/graphics/RectF;->width()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBitmapWidth:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     div-float v2, v3, v4
a=0;// 
a=0;//     .line 242
a=0;//     .restart local v2    # "scale":F
a=0;//     #v2=(Float);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mDrawableRect:Landroid/graphics/RectF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/RectF;);
a=0;//     invoke-virtual {v3}, Landroid/graphics/RectF;->height()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBitmapHeight:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     mul-float/2addr v4, v2
a=0;// 
a=0;//     sub-float/2addr v3, v4
a=0;// 
a=0;//     mul-float v1, v3, v6
a=0;// 
a=0;//     #v1=(Float);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getBorderColor()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderColor:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getBorderWidth()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderWidth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getScaleType()Landroid/widget/ImageView$ScaleType;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     sget-object v0, Lcom/twocloo/com/cn/view/CircleImageView;->SCALE_TYPE:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView$ScaleType;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 4
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/CircleImageView;->getDrawable()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 112
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 108
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/CircleImageView;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/CircleImageView;->getHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     div-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mDrawableRadius:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBitmapPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Paint;);
a=0;//     invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 109
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderWidth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 110
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/CircleImageView;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/CircleImageView;->getHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     div-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderRadius:F
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onSizeChanged(IIII)V
a=0;//     .locals 0
a=0;//     .param p1, "w"    # I
a=0;//     .param p2, "h"    # I
a=0;//     .param p3, "oldw"    # I
a=0;//     .param p4, "oldh"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ImageView;->onSizeChanged(IIII)V
a=0;// 
a=0;//     .line 116
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/CircleImageView;->setup()V
a=0;// 
a=0;//     .line 117
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setBorderColor(I)V
a=0;//     .locals 2
a=0;//     .param p1, "borderColor"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderColor:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 131
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 128
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderColor:I
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderColor:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 130
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/CircleImageView;->invalidate()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setBorderWidth(I)V
a=0;//     .locals 1
a=0;//     .param p1, "borderWidth"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderWidth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 144
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 142
a=0;//     :cond_0
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBorderWidth:I
a=0;// 
a=0;//     .line 143
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/CircleImageView;->setup()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;//     .locals 0
a=0;//     .param p1, "bm"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 147
a=0;//     invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 148
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 149
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/CircleImageView;->setup()V
a=0;// 
a=0;//     .line 150
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "drawable"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 153
a=0;//     invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 154
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/view/CircleImageView;->getBitmapFromDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 155
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/CircleImageView;->setup()V
a=0;// 
a=0;//     .line 156
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setImageResource(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 159
a=0;//     invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 160
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/CircleImageView;->getDrawable()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-direct {p0, v0}, Lcom/twocloo/com/cn/view/CircleImageView;->getBitmapFromDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 161
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/CircleImageView;->setup()V
a=0;// 
a=0;//     .line 162
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setImageURI(Landroid/net/Uri;)V
a=0;//     .locals 1
a=0;//     .param p1, "uri"    # Landroid/net/Uri;
a=0;// 
a=0;//     .prologue
a=0;//     .line 165
a=0;//     invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V
a=0;// 
a=0;//     .line 166
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/CircleImageView;->getDrawable()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-direct {p0, v0}, Lcom/twocloo/com/cn/view/CircleImageView;->getBitmapFromDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/CircleImageView;->mBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 167
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/CircleImageView;->setup()V
a=0;// 
a=0;//     .line 168
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setScaleType(Landroid/widget/ImageView$ScaleType;)V
a=0;//     .locals 4
a=0;//     .param p1, "scaleType"    # Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     sget-object v0, Lcom/twocloo/com/cn/view/CircleImageView;->SCALE_TYPE:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView$ScaleType;);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     .line 99
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "ScaleType %s not supported."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object p1, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 101
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     return-void
a=0;// .end method
}}
