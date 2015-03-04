package com.twocloo.com.cn.view; class RealPageWidget { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/view/RealPageWidget;
a=0;// .super Lcom/twocloo/com/cn/view/PageWidget;
a=0;// .source "RealPageWidget.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mBackShadowColors:[I
a=0;// 
a=0;// .field private mBackShadowDrawableLR:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;// .field private mBackShadowDrawableRL:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;// .field private mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;// .field private mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;// .field private mBezierEnd1:Landroid/graphics/PointF;
a=0;// 
a=0;// .field private mBezierEnd2:Landroid/graphics/PointF;
a=0;// 
a=0;// .field private mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;// .field private mBezierStart2:Landroid/graphics/PointF;
a=0;// 
a=0;// .field private mBeziervertex1:Landroid/graphics/PointF;
a=0;// 
a=0;// .field private mBeziervertex2:Landroid/graphics/PointF;
a=0;// 
a=0;// .field private mColorMatrixFilter:Landroid/graphics/ColorMatrixColorFilter;
a=0;// 
a=0;// .field private mCornerX:I
a=0;// 
a=0;// .field private mCornerY:I
a=0;// 
a=0;// .field private mCurPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field private mDegrees:F
a=0;// 
a=0;// .field private mFolderShadowDrawableLR:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;// .field private mFolderShadowDrawableRL:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;// .field private mFrontShadowColors:[I
a=0;// 
a=0;// .field private mFrontShadowDrawableHBT:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;// .field private mFrontShadowDrawableHTB:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;// .field private mFrontShadowDrawableVLR:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;// .field private mFrontShadowDrawableVRL:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;// .field private mHeight:I
a=0;// 
a=0;// .field private mIsRTandLB:Z
a=0;// 
a=0;// .field private mMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;// .field private mMatrixArray:[F
a=0;// 
a=0;// .field private mMaxLength:F
a=0;// 
a=0;// .field private mMiddleX:F
a=0;// 
a=0;// .field private mMiddleY:F
a=0;// 
a=0;// .field private mNextPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field private mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;// .field private mPath0:Landroid/graphics/Path;
a=0;// 
a=0;// .field private mPath1:Landroid/graphics/Path;
a=0;// 
a=0;// .field private mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;// .field private mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;// .field private mTouchToCornerDis:F
a=0;// 
a=0;// .field private mWidth:I
a=0;// 
a=0;// .field private p:I
a=0;// 
a=0;// .field private wh:[I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;II)V
a=0;//     .locals 7
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "mWidth"    # I
a=0;//     .param p3, "mHeight"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const v6, 0x3c23d70a    # 0.01f
a=0;// 
a=0;//     .line 72
a=0;//     #v6=(Integer);
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/view/PageWidget;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     new-instance v2, Landroid/graphics/PointF;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/PointF;);
a=0;//     invoke-direct {v2}, Landroid/graphics/PointF;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/PointF;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     .line 37
a=0;//     new-instance v2, Landroid/graphics/PointF;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/PointF;);
a=0;//     invoke-direct {v2}, Landroid/graphics/PointF;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/PointF;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     .line 38
a=0;//     new-instance v2, Landroid/graphics/PointF;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/PointF;);
a=0;//     invoke-direct {v2}, Landroid/graphics/PointF;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/PointF;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     .line 39
a=0;//     new-instance v2, Landroid/graphics/PointF;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/PointF;);
a=0;//     invoke-direct {v2}, Landroid/graphics/PointF;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/PointF;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBeziervertex1:Landroid/graphics/PointF;
a=0;// 
a=0;//     .line 40
a=0;//     new-instance v2, Landroid/graphics/PointF;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/PointF;);
a=0;//     invoke-direct {v2}, Landroid/graphics/PointF;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/PointF;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierEnd1:Landroid/graphics/PointF;
a=0;// 
a=0;//     .line 41
a=0;//     new-instance v2, Landroid/graphics/PointF;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/PointF;);
a=0;//     invoke-direct {v2}, Landroid/graphics/PointF;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/PointF;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart2:Landroid/graphics/PointF;
a=0;// 
a=0;//     .line 42
a=0;//     new-instance v2, Landroid/graphics/PointF;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/PointF;);
a=0;//     invoke-direct {v2}, Landroid/graphics/PointF;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/PointF;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     .line 43
a=0;//     new-instance v2, Landroid/graphics/PointF;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/PointF;);
a=0;//     invoke-direct {v2}, Landroid/graphics/PointF;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/PointF;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBeziervertex2:Landroid/graphics/PointF;
a=0;// 
a=0;//     .line 44
a=0;//     new-instance v2, Landroid/graphics/PointF;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/PointF;);
a=0;//     invoke-direct {v2}, Landroid/graphics/PointF;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/PointF;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierEnd2:Landroid/graphics/PointF;
a=0;// 
a=0;//     .line 51
a=0;//     const/16 v2, 0x9
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [F
a=0;// 
a=0;//     #v2=(Reference,[F);
a=0;//     fill-array-data v2, :array_0
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMatrixArray:[F
a=0;// 
a=0;//     .line 73
a=0;//     iput p2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mWidth:I
a=0;// 
a=0;//     .line 74
a=0;//     iput p3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mHeight:I
a=0;// 
a=0;//     .line 75
a=0;//     int-to-double v2, p2
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     int-to-double v4, p3
a=0;// 
a=0;//     #v4=(DoubleLo);v5=(DoubleHi);
a=0;//     invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->hypot(DD)D
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     double-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMaxLength:F
a=0;// 
a=0;//     .line 76
a=0;//     new-instance v2, Landroid/graphics/Path;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/Path;);
a=0;//     invoke-direct {v2}, Landroid/graphics/Path;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Path;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath0:Landroid/graphics/Path;
a=0;// 
a=0;//     .line 77
a=0;//     new-instance v2, Landroid/graphics/Path;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/Path;);
a=0;//     invoke-direct {v2}, Landroid/graphics/Path;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Path;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     .line 78
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/RealPageWidget;->createDrawable()V
a=0;// 
a=0;//     .line 80
a=0;//     new-instance v2, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 81
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Paint$Style;);
a=0;//     invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
a=0;// 
a=0;//     .line 83
a=0;//     new-instance v1, Landroid/graphics/ColorMatrix;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/ColorMatrix;);
a=0;//     invoke-direct {v1}, Landroid/graphics/ColorMatrix;-><init>()V
a=0;// 
a=0;//     .line 84
a=0;//     .local v1, "cm":Landroid/graphics/ColorMatrix;
a=0;//     #v1=(Reference,Landroid/graphics/ColorMatrix;);
a=0;//     const/16 v2, 0x14
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v0, v2, [F
a=0;// 
a=0;//     #v0=(Reference,[F);
a=0;//     fill-array-data v0, :array_1
a=0;// 
a=0;//     .line 85
a=0;//     .local v0, "array":[F
a=0;//     invoke-virtual {v1, v0}, Landroid/graphics/ColorMatrix;->set([F)V
a=0;// 
a=0;//     .line 86
a=0;//     new-instance v2, Landroid/graphics/ColorMatrixColorFilter;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/ColorMatrixColorFilter;);
a=0;//     invoke-direct {v2, v1}, Landroid/graphics/ColorMatrixColorFilter;-><init>(Landroid/graphics/ColorMatrix;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/ColorMatrixColorFilter;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mColorMatrixFilter:Landroid/graphics/ColorMatrixColorFilter;
a=0;// 
a=0;//     .line 87
a=0;//     new-instance v2, Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/Matrix;);
a=0;//     invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Matrix;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;//     .line 88
a=0;//     new-instance v2, Landroid/widget/Scroller;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/RealPageWidget;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Scroller;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     iput v6, v2, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     .line 91
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     iput v6, v2, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     .line 93
a=0;//     check-cast p1, Landroid/app/Activity;
a=0;// 
a=0;//     .end local p1    # "context":Landroid/content/Context;
a=0;//     invoke-static {p1}, Lcom/twocloo/base/util/PhoneUtils;->getScreenPix(Landroid/app/Activity;)[I
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->wh:[I
a=0;// 
a=0;//     .line 95
a=0;//     return-void
a=0;// 
a=0;//     .line 51
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x3f800000    # 1.0f
a=0;//     .end array-data
a=0;// 
a=0;//     .line 84
a=0;//     :array_1
a=0;//     .array-data 4
a=0;//         0x3f0ccccd    # 0.55f
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x42a00000    # 80.0f
a=0;//         0x0
a=0;//         0x3f0ccccd    # 0.55f
a=0;//         0x0
a=0;//         0x0
a=0;//         0x42a00000    # 80.0f
a=0;//         0x0
a=0;//         0x0
a=0;//         0x3f0ccccd    # 0.55f
a=0;//         0x0
a=0;//         0x42a00000    # 80.0f
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x3e4ccccd    # 0.2f
a=0;//         0x0
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method private calcPoints()V
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const/high16 v9, 0x40800000    # 4.0f
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     const/high16 v8, 0x40000000    # 2.0f
a=0;// 
a=0;//     .line 265
a=0;//     #v8=(Integer);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v3, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     add-float/2addr v3, v4
a=0;// 
a=0;//     #v3=(Float);
a=0;//     div-float/2addr v3, v8
a=0;// 
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMiddleX:F
a=0;// 
a=0;//     .line 266
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v3, v3, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerY:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     add-float/2addr v3, v4
a=0;// 
a=0;//     #v3=(Float);
a=0;//     div-float/2addr v3, v8
a=0;// 
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMiddleY:F
a=0;// 
a=0;//     .line 267
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMiddleX:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerY:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMiddleY:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-float/2addr v5, v6
a=0;// 
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerY:I
a=0;// 
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     iget v7, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMiddleY:F
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-float/2addr v6, v7
a=0;// 
a=0;//     mul-float/2addr v5, v6
a=0;// 
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     iget v7, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMiddleX:F
a=0;// 
a=0;//     sub-float/2addr v6, v7
a=0;// 
a=0;//     div-float/2addr v5, v6
a=0;// 
a=0;//     sub-float/2addr v4, v5
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iput v4, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     .line 268
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerY:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iput v4, v3, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     .line 269
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iput v4, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     .line 270
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMiddleY:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMiddleX:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-float/2addr v5, v6
a=0;// 
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     iget v7, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMiddleX:F
a=0;// 
a=0;//     sub-float/2addr v6, v7
a=0;// 
a=0;//     mul-float/2addr v5, v6
a=0;// 
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerY:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     iget v7, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMiddleY:F
a=0;// 
a=0;//     sub-float/2addr v6, v7
a=0;// 
a=0;//     div-float/2addr v5, v6
a=0;// 
a=0;//     sub-float/2addr v4, v5
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iput v4, v3, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     .line 272
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, v4, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v6, v6, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-float/2addr v5, v6
a=0;// 
a=0;//     div-float/2addr v5, v8
a=0;// 
a=0;//     sub-float/2addr v4, v5
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iput v4, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     .line 273
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerY:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iput v4, v3, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     .line 277
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget v3, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     cmpl-float v3, v3, v10
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v3, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mWidth:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     cmpg-float v3, v3, v4
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-gez v3, :cond_2
a=0;// 
a=0;//     .line 278
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v3, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     cmpg-float v3, v3, v10
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-ltz v3, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v3, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mWidth:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     cmpl-float v3, v3, v4
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_2
a=0;// 
a=0;//     .line 279
a=0;//     :cond_0
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v3, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     cmpg-float v3, v3, v10
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-gez v3, :cond_1
a=0;// 
a=0;//     .line 280
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mWidth:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v5, v5, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sub-float/2addr v4, v5
a=0;// 
a=0;//     iput v4, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     .line 282
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, v4, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-float/2addr v3, v4
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 283
a=0;//     .local v0, "f1":F
a=0;//     #v0=(Float);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mWidth:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     mul-float/2addr v3, v0
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, v4, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     div-float v1, v3, v4
a=0;// 
a=0;//     .line 284
a=0;//     .local v1, "f2":F
a=0;//     #v1=(Float);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     sub-float/2addr v4, v1
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     iput v4, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     .line 286
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, v4, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-float/2addr v3, v4
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerY:I
a=0;// 
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v5, v5, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sub-float/2addr v4, v5
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     mul-float/2addr v3, v4
a=0;// 
a=0;//     div-float v2, v3, v0
a=0;// 
a=0;//     .line 287
a=0;//     .local v2, "f3":F
a=0;//     #v2=(Float);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerY:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     sub-float/2addr v4, v2
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     iput v4, v3, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     .line 289
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget v3, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     add-float/2addr v3, v4
a=0;// 
a=0;//     #v3=(Float);
a=0;//     div-float/2addr v3, v8
a=0;// 
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMiddleX:F
a=0;// 
a=0;//     .line 290
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v3, v3, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerY:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     add-float/2addr v3, v4
a=0;// 
a=0;//     #v3=(Float);
a=0;//     div-float/2addr v3, v8
a=0;// 
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMiddleY:F
a=0;// 
a=0;//     .line 292
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMiddleX:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerY:I
a=0;// 
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMiddleY:F
a=0;// 
a=0;//     sub-float/2addr v5, v6
a=0;// 
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerY:I
a=0;// 
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     iget v7, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMiddleY:F
a=0;// 
a=0;//     sub-float/2addr v6, v7
a=0;// 
a=0;//     mul-float/2addr v5, v6
a=0;// 
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     iget v7, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMiddleX:F
a=0;// 
a=0;//     sub-float/2addr v6, v7
a=0;// 
a=0;//     div-float/2addr v5, v6
a=0;// 
a=0;//     sub-float/2addr v4, v5
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iput v4, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     .line 293
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerY:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iput v4, v3, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     .line 295
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iput v4, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     .line 296
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMiddleY:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMiddleX:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-float/2addr v5, v6
a=0;// 
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     iget v7, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMiddleX:F
a=0;// 
a=0;//     sub-float/2addr v6, v7
a=0;// 
a=0;//     mul-float/2addr v5, v6
a=0;// 
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerY:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     iget v7, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMiddleY:F
a=0;// 
a=0;//     sub-float/2addr v6, v7
a=0;// 
a=0;//     div-float/2addr v5, v6
a=0;// 
a=0;//     sub-float/2addr v4, v5
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iput v4, v3, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     .line 297
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, v4, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v6, v6, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-float/2addr v5, v6
a=0;// 
a=0;//     div-float/2addr v5, v8
a=0;// 
a=0;//     sub-float/2addr v4, v5
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iput v4, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     .line 300
a=0;//     .end local v0    # "f1":F
a=0;//     .end local v1    # "f2":F
a=0;//     .end local v2    # "f3":F
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iput v4, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     .line 301
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart2:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, v4, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerY:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v6, v6, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-float/2addr v5, v6
a=0;// 
a=0;//     div-float/2addr v5, v8
a=0;// 
a=0;//     sub-float/2addr v4, v5
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iput v4, v3, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     .line 303
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget v3, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     sub-float/2addr v3, v4
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v5, v5, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerY:I
a=0;// 
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     sub-float/2addr v5, v6
a=0;// 
a=0;//     #v5=(Float);
a=0;//     float-to-double v5, v5
a=0;// 
a=0;//     #v5=(DoubleLo);v6=(DoubleHi);
a=0;//     invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->hypot(DD)D
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     double-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouchToCornerDis:F
a=0;// 
a=0;//     .line 305
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PointF;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/PointF;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/PointF;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/PointF;);
a=0;//     invoke-direct {p0, v3, v4, v5, v6}, Lcom/twocloo/com/cn/view/RealPageWidget;->getCross(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierEnd1:Landroid/graphics/PointF;
a=0;// 
a=0;//     .line 306
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart2:Landroid/graphics/PointF;
a=0;// 
a=0;//     invoke-direct {p0, v3, v4, v5, v6}, Lcom/twocloo/com/cn/view/RealPageWidget;->getCross(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierEnd2:Landroid/graphics/PointF;
a=0;// 
a=0;//     .line 308
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBeziervertex1:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget v4, v4, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget v5, v5, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     mul-float/2addr v5, v8
a=0;// 
a=0;//     #v5=(Float);
a=0;//     add-float/2addr v4, v5
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierEnd1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v5, v5, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-float/2addr v4, v5
a=0;// 
a=0;//     div-float/2addr v4, v9
a=0;// 
a=0;//     iput v4, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     .line 309
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBeziervertex1:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, v4, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     mul-float/2addr v4, v8
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v5, v5, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-float/2addr v4, v5
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierEnd1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v5, v5, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-float/2addr v4, v5
a=0;// 
a=0;//     div-float/2addr v4, v9
a=0;// 
a=0;//     iput v4, v3, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     .line 310
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBeziervertex2:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, v4, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v5, v5, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     mul-float/2addr v5, v8
a=0;// 
a=0;//     #v5=(Float);
a=0;//     add-float/2addr v4, v5
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierEnd2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v5, v5, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-float/2addr v4, v5
a=0;// 
a=0;//     div-float/2addr v4, v9
a=0;// 
a=0;//     iput v4, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     .line 311
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBeziervertex2:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, v4, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     mul-float/2addr v4, v8
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v5, v5, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-float/2addr v4, v5
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierEnd2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v5, v5, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-float/2addr v4, v5
a=0;// 
a=0;//     div-float/2addr v4, v9
a=0;// 
a=0;//     iput v4, v3, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     .line 312
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private createDrawable()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 373
a=0;//     #v4=(Null);
a=0;//     new-array v0, v5, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     .line 374
a=0;//     .local v0, "color":[I
a=0;//     new-instance v1, Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     sget-object v2, Landroid/graphics/drawable/GradientDrawable$Orientation;->RIGHT_LEFT:Landroid/graphics/drawable/GradientDrawable$Orientation;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/GradientDrawable$Orientation;);
a=0;//     invoke-direct {v1, v2, v0}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mFolderShadowDrawableRL:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     .line 375
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mFolderShadowDrawableRL:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V
a=0;// 
a=0;//     .line 377
a=0;//     new-instance v1, Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     sget-object v2, Landroid/graphics/drawable/GradientDrawable$Orientation;->LEFT_RIGHT:Landroid/graphics/drawable/GradientDrawable$Orientation;
a=0;// 
a=0;//     invoke-direct {v1, v2, v0}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mFolderShadowDrawableLR:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     .line 378
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mFolderShadowDrawableLR:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V
a=0;// 
a=0;//     .line 380
a=0;//     new-array v1, v5, [I
a=0;// 
a=0;//     fill-array-data v1, :array_1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBackShadowColors:[I
a=0;// 
a=0;//     .line 381
a=0;//     new-instance v1, Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     sget-object v2, Landroid/graphics/drawable/GradientDrawable$Orientation;->RIGHT_LEFT:Landroid/graphics/drawable/GradientDrawable$Orientation;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBackShadowColors:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBackShadowDrawableRL:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     .line 382
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBackShadowDrawableRL:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V
a=0;// 
a=0;//     .line 384
a=0;//     new-instance v1, Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     sget-object v2, Landroid/graphics/drawable/GradientDrawable$Orientation;->LEFT_RIGHT:Landroid/graphics/drawable/GradientDrawable$Orientation;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBackShadowColors:[I
a=0;// 
a=0;//     invoke-direct {v1, v2, v3}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBackShadowDrawableLR:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     .line 385
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBackShadowDrawableLR:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V
a=0;// 
a=0;//     .line 387
a=0;//     new-array v1, v5, [I
a=0;// 
a=0;//     fill-array-data v1, :array_2
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mFrontShadowColors:[I
a=0;// 
a=0;//     .line 388
a=0;//     new-instance v1, Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     sget-object v2, Landroid/graphics/drawable/GradientDrawable$Orientation;->LEFT_RIGHT:Landroid/graphics/drawable/GradientDrawable$Orientation;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mFrontShadowColors:[I
a=0;// 
a=0;//     invoke-direct {v1, v2, v3}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mFrontShadowDrawableVLR:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     .line 389
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mFrontShadowDrawableVLR:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V
a=0;// 
a=0;//     .line 390
a=0;//     new-instance v1, Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     sget-object v2, Landroid/graphics/drawable/GradientDrawable$Orientation;->RIGHT_LEFT:Landroid/graphics/drawable/GradientDrawable$Orientation;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mFrontShadowColors:[I
a=0;// 
a=0;//     invoke-direct {v1, v2, v3}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mFrontShadowDrawableVRL:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     .line 391
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mFrontShadowDrawableVRL:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V
a=0;// 
a=0;//     .line 393
a=0;//     new-instance v1, Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     sget-object v2, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mFrontShadowColors:[I
a=0;// 
a=0;//     invoke-direct {v1, v2, v3}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mFrontShadowDrawableHTB:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     .line 394
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mFrontShadowDrawableHTB:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V
a=0;// 
a=0;//     .line 396
a=0;//     new-instance v1, Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     sget-object v2, Landroid/graphics/drawable/GradientDrawable$Orientation;->BOTTOM_TOP:Landroid/graphics/drawable/GradientDrawable$Orientation;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mFrontShadowColors:[I
a=0;// 
a=0;//     invoke-direct {v1, v2, v3}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mFrontShadowDrawableHBT:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     .line 397
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mFrontShadowDrawableHBT:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V
a=0;// 
a=0;//     .line 398
a=0;//     return-void
a=0;// 
a=0;//     .line 373
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x333333
a=0;//         -0x4fcccccd
a=0;//     .end array-data
a=0;// 
a=0;//     .line 380
a=0;//     :array_1
a=0;//     .array-data 4
a=0;//         -0xeeeeef
a=0;//         0x111111
a=0;//     .end array-data
a=0;// 
a=0;//     .line 387
a=0;//     :array_2
a=0;//     .array-data 4
a=0;//         -0x7feeeeef
a=0;//         0x111111
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method private drawCurrentBackArea(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;)V
a=0;//     .locals 17
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;//     .param p2, "bitmap"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 490
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v13=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v13, v13, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v14=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v14, v14, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     add-float/2addr v13, v14
a=0;// 
a=0;//     #v13=(Float);
a=0;//     float-to-int v13, v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     div-int/lit8 v8, v13, 0x2
a=0;// 
a=0;//     .line 491
a=0;//     .local v8, "i":I
a=0;//     #v8=(Integer);
a=0;//     int-to-float v13, v8
a=0;// 
a=0;//     #v13=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v14=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v14, v14, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     sub-float/2addr v13, v14
a=0;// 
a=0;//     invoke-static {v13}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 492
a=0;//     .local v3, "f1":F
a=0;//     #v3=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v13=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v13, v13, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v14=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v14, v14, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     add-float/2addr v13, v14
a=0;// 
a=0;//     #v13=(Float);
a=0;//     float-to-int v13, v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     div-int/lit8 v9, v13, 0x2
a=0;// 
a=0;//     .line 493
a=0;//     .local v9, "i1":I
a=0;//     #v9=(Integer);
a=0;//     int-to-float v13, v9
a=0;// 
a=0;//     #v13=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v14=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v14, v14, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     sub-float/2addr v13, v14
a=0;// 
a=0;//     invoke-static {v13}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 494
a=0;//     .local v4, "f2":F
a=0;//     #v4=(Float);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 495
a=0;//     .local v5, "f3":F
a=0;//     #v5=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     #v13=(Reference,Landroid/graphics/Path;);
a=0;//     invoke-virtual {v13}, Landroid/graphics/Path;->reset()V
a=0;// 
a=0;//     .line 496
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBeziervertex2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v14=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v14, v14, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBeziervertex2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v15=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v15, v15, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     invoke-virtual {v13, v14, v15}, Landroid/graphics/Path;->moveTo(FF)V
a=0;// 
a=0;//     .line 497
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBeziervertex1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v14=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v14, v14, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBeziervertex1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v15=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v15, v15, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     invoke-virtual {v13, v14, v15}, Landroid/graphics/Path;->lineTo(FF)V
a=0;// 
a=0;//     .line 498
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierEnd1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v14=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v14, v14, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierEnd1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v15=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v15, v15, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     invoke-virtual {v13, v14, v15}, Landroid/graphics/Path;->lineTo(FF)V
a=0;// 
a=0;//     .line 499
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v14=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v14, v14, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v15=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v15, v15, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     invoke-virtual {v13, v14, v15}, Landroid/graphics/Path;->lineTo(FF)V
a=0;// 
a=0;//     .line 500
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierEnd2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v14=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v14, v14, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierEnd2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v15=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v15, v15, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     invoke-virtual {v13, v14, v15}, Landroid/graphics/Path;->lineTo(FF)V
a=0;// 
a=0;//     .line 501
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     invoke-virtual {v13}, Landroid/graphics/Path;->close()V
a=0;// 
a=0;//     .line 505
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mIsRTandLB:Z
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-eqz v13, :cond_0
a=0;// 
a=0;//     .line 506
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v13=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v13, v13, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     const/high16 v14, 0x3f800000    # 1.0f
a=0;// 
a=0;//     sub-float/2addr v13, v14
a=0;// 
a=0;//     #v13=(Float);
a=0;//     float-to-int v10, v13
a=0;// 
a=0;//     .line 507
a=0;//     .local v10, "left":I
a=0;//     #v10=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v13=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v13, v13, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     add-float/2addr v13, v5
a=0;// 
a=0;//     #v13=(Float);
a=0;//     const/high16 v14, 0x3f800000    # 1.0f
a=0;// 
a=0;//     add-float/2addr v13, v14
a=0;// 
a=0;//     float-to-int v12, v13
a=0;// 
a=0;//     .line 508
a=0;//     .local v12, "right":I
a=0;//     #v12=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mFolderShadowDrawableLR:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     .line 514
a=0;//     .local v11, "mFolderShadowDrawable":Landroid/graphics/drawable/GradientDrawable;
a=0;//     :goto_0
a=0;//     #v11=(Reference,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     .line 515
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath0:Landroid/graphics/Path;
a=0;// 
a=0;//     #v13=(Reference,Landroid/graphics/Path;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v13}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z
a=0;// 
a=0;//     .line 516
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     sget-object v14, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;
a=0;// 
a=0;//     #v14=(Reference,Landroid/graphics/Region$Op;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v13, v14}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z
a=0;// 
a=0;//     .line 518
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mColorMatrixFilter:Landroid/graphics/ColorMatrixColorFilter;
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
a=0;// 
a=0;//     .line 520
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     int-to-float v13, v13
a=0;// 
a=0;//     #v13=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget v14, v14, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     sub-float/2addr v13, v14
a=0;// 
a=0;//     float-to-double v13, v13
a=0;// 
a=0;//     #v13=(DoubleLo);v14=(DoubleHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v15=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v15, v15, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerY:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Float);
a=0;//     sub-float v15, v15, v16
a=0;// 
a=0;//     #v15=(Float);
a=0;//     float-to-double v15, v15
a=0;// 
a=0;//     #v15=(DoubleLo);v16=(DoubleHi);
a=0;//     invoke-static/range {v13 .. v16}, Ljava/lang/Math;->hypot(DD)D
a=0;// 
a=0;//     move-result-wide v13
a=0;// 
a=0;//     double-to-float v2, v13
a=0;// 
a=0;//     .line 521
a=0;//     .local v2, "dis":F
a=0;//     #v2=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     int-to-float v13, v13
a=0;// 
a=0;//     #v13=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v14=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v14, v14, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     sub-float/2addr v13, v14
a=0;// 
a=0;//     div-float v6, v13, v2
a=0;// 
a=0;//     .line 522
a=0;//     .local v6, "f8":F
a=0;//     #v6=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v13=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v13, v13, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v14, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerY:I
a=0;// 
a=0;//     int-to-float v14, v14
a=0;// 
a=0;//     #v14=(Float);
a=0;//     sub-float/2addr v13, v14
a=0;// 
a=0;//     #v13=(Float);
a=0;//     div-float v7, v13, v2
a=0;// 
a=0;//     .line 523
a=0;//     .local v7, "f9":F
a=0;//     #v7=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMatrixArray:[F
a=0;// 
a=0;//     #v13=(Reference,[F);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     const/high16 v15, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     const/high16 v16, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     mul-float v16, v16, v7
a=0;// 
a=0;//     #v16=(Float);
a=0;//     mul-float v16, v16, v7
a=0;// 
a=0;//     sub-float v15, v15, v16
a=0;// 
a=0;//     #v15=(Float);
a=0;//     aput v15, v13, v14
a=0;// 
a=0;//     .line 524
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMatrixArray:[F
a=0;// 
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     #v14=(One);
a=0;//     const/high16 v15, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     mul-float/2addr v15, v6
a=0;// 
a=0;//     #v15=(Float);
a=0;//     mul-float/2addr v15, v7
a=0;// 
a=0;//     aput v15, v13, v14
a=0;// 
a=0;//     .line 525
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMatrixArray:[F
a=0;// 
a=0;//     const/4 v14, 0x3
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMatrixArray:[F
a=0;// 
a=0;//     #v15=(Reference,[F);
a=0;//     const/16 v16, 0x1
a=0;// 
a=0;//     #v16=(One);
a=0;//     aget v15, v15, v16
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     aput v15, v13, v14
a=0;// 
a=0;//     .line 526
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMatrixArray:[F
a=0;// 
a=0;//     const/4 v14, 0x4
a=0;// 
a=0;//     const/high16 v15, 0x3f800000    # 1.0f
a=0;// 
a=0;//     const/high16 v16, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     mul-float v16, v16, v6
a=0;// 
a=0;//     #v16=(Float);
a=0;//     mul-float v16, v16, v6
a=0;// 
a=0;//     sub-float v15, v15, v16
a=0;// 
a=0;//     #v15=(Float);
a=0;//     aput v15, v13, v14
a=0;// 
a=0;//     .line 527
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;//     invoke-virtual {v13}, Landroid/graphics/Matrix;->reset()V
a=0;// 
a=0;//     .line 528
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMatrixArray:[F
a=0;// 
a=0;//     #v14=(Reference,[F);
a=0;//     invoke-virtual {v13, v14}, Landroid/graphics/Matrix;->setValues([F)V
a=0;// 
a=0;//     .line 529
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget v14, v14, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     neg-float v14, v14
a=0;// 
a=0;//     #v14=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v15=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v15, v15, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     neg-float v15, v15
a=0;// 
a=0;//     #v15=(Float);
a=0;//     invoke-virtual {v13, v14, v15}, Landroid/graphics/Matrix;->preTranslate(FF)Z
a=0;// 
a=0;//     .line 530
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v14=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v14, v14, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v15=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v15, v15, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     invoke-virtual {v13, v14, v15}, Landroid/graphics/Matrix;->postTranslate(FF)Z
a=0;// 
a=0;//     .line 533
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     move-object/from16 v1, p2
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v0, v1, v13, v14}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 534
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
a=0;// 
a=0;//     .line 535
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mDegrees:F
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v14=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v14, v14, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v15=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v15, v15, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v13, v14, v15}, Landroid/graphics/Canvas;->rotate(FFF)V
a=0;// 
a=0;//     .line 536
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v13=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v13, v13, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     float-to-int v13, v13
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v14=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v14, v14, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v15, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMaxLength:F
a=0;// 
a=0;//     add-float/2addr v14, v15
a=0;// 
a=0;//     #v14=(Float);
a=0;//     float-to-int v14, v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v11, v10, v13, v12, v14}, Landroid/graphics/drawable/GradientDrawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 537
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v11, v0}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 538
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V
a=0;// 
a=0;//     .line 539
a=0;//     return-void
a=0;// 
a=0;//     .line 510
a=0;//     .end local v2    # "dis":F
a=0;//     .end local v6    # "f8":F
a=0;//     .end local v7    # "f9":F
a=0;//     .end local v10    # "left":I
a=0;//     .end local v11    # "mFolderShadowDrawable":Landroid/graphics/drawable/GradientDrawable;
a=0;//     .end local v12    # "right":I
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v6=(Uninit);v7=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Boolean);v16=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v13=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v13, v13, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     sub-float/2addr v13, v5
a=0;// 
a=0;//     #v13=(Float);
a=0;//     const/high16 v14, 0x3f800000    # 1.0f
a=0;// 
a=0;//     sub-float/2addr v13, v14
a=0;// 
a=0;//     float-to-int v10, v13
a=0;// 
a=0;//     .line 511
a=0;//     .restart local v10    # "left":I
a=0;//     #v10=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v13=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v13, v13, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     const/high16 v14, 0x3f800000    # 1.0f
a=0;// 
a=0;//     add-float/2addr v13, v14
a=0;// 
a=0;//     #v13=(Float);
a=0;//     float-to-int v12, v13
a=0;// 
a=0;//     .line 512
a=0;//     .restart local v12    # "right":I
a=0;//     #v12=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mFolderShadowDrawableRL:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     .restart local v11    # "mFolderShadowDrawable":Landroid/graphics/drawable/GradientDrawable;
a=0;//     #v11=(Reference,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private drawCurrentPageArea(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;Landroid/graphics/Path;)V
a=0;//     .locals 6
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;//     .param p2, "bitmap"    # Landroid/graphics/Bitmap;
a=0;//     .param p3, "path"    # Landroid/graphics/Path;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 318
a=0;//     #v5=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath0:Landroid/graphics/Path;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Path;);
a=0;//     invoke-virtual {v0}, Landroid/graphics/Path;->reset()V
a=0;// 
a=0;//     .line 319
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath0:Landroid/graphics/Path;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v1, v1, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v2, v2, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V
a=0;// 
a=0;//     .line 320
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath0:Landroid/graphics/Path;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v1, v1, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v2, v2, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierEnd1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v3, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierEnd1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, v4, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Path;->quadTo(FFFF)V
a=0;// 
a=0;//     .line 321
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath0:Landroid/graphics/Path;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v1, v1, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v2, v2, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
a=0;// 
a=0;//     .line 322
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath0:Landroid/graphics/Path;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierEnd2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v1, v1, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierEnd2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v2, v2, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
a=0;// 
a=0;//     .line 323
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath0:Landroid/graphics/Path;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v1, v1, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v2, v2, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v3, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, v4, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Path;->quadTo(FFFF)V
a=0;// 
a=0;//     .line 324
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath0:Landroid/graphics/Path;
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerY:I
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
a=0;// 
a=0;//     .line 325
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath0:Landroid/graphics/Path;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/Path;->close()V
a=0;// 
a=0;//     .line 327
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     .line 329
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1, p2, v5, v5, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 330
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
a=0;// 
a=0;//     .line 332
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private drawCurrentPageShadow(Landroid/graphics/Canvas;)V
a=0;//     .locals 23
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 405
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-boolean v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mIsRTandLB:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Boolean);
a=0;//     if-eqz v17, :cond_0
a=0;// 
a=0;//     .line 406
a=0;//     const-wide v17, 0x3fe921fb54442d18L    # 0.7853981633974483
a=0;// 
a=0;//     #v17=(LongLo);v18=(LongHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     #v20=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     sub-float v19, v19, v20
a=0;// 
a=0;//     #v19=(Float);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     move-wide/from16 v19, v0
a=0;// 
a=0;//     #v19=(DoubleLo);v20=(DoubleHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     #v21=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v22, v0
a=0;// 
a=0;//     #v22=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     sub-float v21, v21, v22
a=0;// 
a=0;//     #v21=(Float);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);
a=0;//     move-wide/from16 v21, v0
a=0;// 
a=0;//     #v21=(DoubleLo);v22=(DoubleHi);
a=0;//     invoke-static/range {v19 .. v22}, Ljava/lang/Math;->atan2(DD)D
a=0;// 
a=0;//     move-result-wide v19
a=0;// 
a=0;//     sub-double v7, v17, v19
a=0;// 
a=0;//     .line 411
a=0;//     .local v7, "degree":D
a=0;//     :goto_0
a=0;//     #v7=(DoubleLo);v8=(DoubleHi);
a=0;//     const-wide v17, 0x4041accccccccccdL    # 35.35
a=0;// 
a=0;//     invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D
a=0;// 
a=0;//     move-result-wide v19
a=0;// 
a=0;//     mul-double v3, v17, v19
a=0;// 
a=0;//     .line 412
a=0;//     .local v3, "d1":D
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     const-wide v17, 0x4041accccccccccdL    # 35.35
a=0;// 
a=0;//     invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D
a=0;// 
a=0;//     move-result-wide v19
a=0;// 
a=0;//     mul-double v5, v17, v19
a=0;// 
a=0;//     .line 413
a=0;//     .local v5, "d2":D
a=0;//     #v5=(DoubleLo);v6=(DoubleHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     float-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);
a=0;//     move-wide/from16 v17, v0
a=0;// 
a=0;//     #v17=(DoubleLo);v18=(DoubleHi);
a=0;//     add-double v17, v17, v3
a=0;// 
a=0;//     move-wide/from16 v0, v17
a=0;// 
a=0;//     double-to-float v15, v0
a=0;// 
a=0;//     .line 415
a=0;//     .local v15, "x":F
a=0;//     #v15=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-boolean v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mIsRTandLB:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Boolean);
a=0;//     if-eqz v17, :cond_1
a=0;// 
a=0;//     .line 416
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     float-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);
a=0;//     move-wide/from16 v17, v0
a=0;// 
a=0;//     #v17=(DoubleLo);
a=0;//     add-double v17, v17, v5
a=0;// 
a=0;//     move-wide/from16 v0, v17
a=0;// 
a=0;//     double-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     .line 420
a=0;//     .local v16, "y":F
a=0;//     :goto_1
a=0;//     #v16=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Landroid/graphics/Path;);
a=0;//     invoke-virtual/range {v17 .. v17}, Landroid/graphics/Path;->reset()V
a=0;// 
a=0;//     .line 421
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     move/from16 v1, v16
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {v0, v15, v1}, Landroid/graphics/Path;->moveTo(FF)V
a=0;// 
a=0;//     .line 422
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     #v18=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     invoke-virtual/range {v17 .. v19}, Landroid/graphics/Path;->lineTo(FF)V
a=0;// 
a=0;//     .line 423
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     #v18=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     invoke-virtual/range {v17 .. v19}, Landroid/graphics/Path;->lineTo(FF)V
a=0;// 
a=0;//     .line 424
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     #v18=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     invoke-virtual/range {v17 .. v19}, Landroid/graphics/Path;->lineTo(FF)V
a=0;// 
a=0;//     .line 425
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     invoke-virtual/range {v17 .. v17}, Landroid/graphics/Path;->close()V
a=0;// 
a=0;//     .line 427
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     .line 429
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath0:Landroid/graphics/Path;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     sget-object v18, Landroid/graphics/Region$Op;->XOR:Landroid/graphics/Region$Op;
a=0;// 
a=0;//     #v18=(Reference,Landroid/graphics/Region$Op;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     move-object/from16 v1, v17
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Path;);
a=0;//     move-object/from16 v2, v18
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Region$Op;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z
a=0;// 
a=0;//     .line 430
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     sget-object v18, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     move-object/from16 v1, v17
a=0;// 
a=0;//     move-object/from16 v2, v18
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z
a=0;// 
a=0;//     .line 434
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mIsRTandLB:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Boolean);
a=0;//     if-eqz v17, :cond_2
a=0;// 
a=0;//     .line 435
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     float-to-int v10, v0
a=0;// 
a=0;//     .line 436
a=0;//     .local v10, "leftx":I
a=0;//     #v10=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     add-int/lit8 v12, v17, 0x19
a=0;// 
a=0;//     .line 437
a=0;//     .local v12, "rightx":I
a=0;//     #v12=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v11, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mFrontShadowDrawableVLR:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     .line 444
a=0;//     .local v11, "mCurrentPageShadow":Landroid/graphics/drawable/GradientDrawable;
a=0;//     :goto_2
a=0;//     #v11=(Reference,Landroid/graphics/drawable/GradientDrawable;);v18=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     #v18=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     sub-float v17, v17, v18
a=0;// 
a=0;//     #v17=(Float);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     move-wide/from16 v17, v0
a=0;// 
a=0;//     #v17=(DoubleLo);v18=(DoubleHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     #v20=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     sub-float v19, v19, v20
a=0;// 
a=0;//     #v19=(Float);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);
a=0;//     move-wide/from16 v19, v0
a=0;// 
a=0;//     #v19=(DoubleLo);v20=(DoubleHi);
a=0;//     invoke-static/range {v17 .. v20}, Ljava/lang/Math;->atan2(DD)D
a=0;// 
a=0;//     move-result-wide v17
a=0;// 
a=0;//     invoke-static/range {v17 .. v18}, Ljava/lang/Math;->toDegrees(D)D
a=0;// 
a=0;//     move-result-wide v17
a=0;// 
a=0;//     move-wide/from16 v0, v17
a=0;// 
a=0;//     double-to-float v13, v0
a=0;// 
a=0;//     .line 445
a=0;//     .local v13, "rotateDegrees":F
a=0;//     #v13=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     #v18=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     move/from16 v1, v17
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v18
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v13, v1, v2}, Landroid/graphics/Canvas;->rotate(FFF)V
a=0;// 
a=0;//     .line 446
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMaxLength:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     sub-float v17, v17, v18
a=0;// 
a=0;//     #v17=(Float);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     #v18=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     move/from16 v1, v18
a=0;// 
a=0;//     invoke-virtual {v11, v10, v0, v12, v1}, Landroid/graphics/drawable/GradientDrawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 447
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual {v11, v0}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 448
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V
a=0;// 
a=0;//     .line 450
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Landroid/graphics/Path;);
a=0;//     invoke-virtual/range {v17 .. v17}, Landroid/graphics/Path;->reset()V
a=0;// 
a=0;//     .line 451
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     move/from16 v1, v16
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {v0, v15, v1}, Landroid/graphics/Path;->moveTo(FF)V
a=0;// 
a=0;//     .line 452
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     #v18=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     invoke-virtual/range {v17 .. v19}, Landroid/graphics/Path;->lineTo(FF)V
a=0;// 
a=0;//     .line 453
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     #v18=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     invoke-virtual/range {v17 .. v19}, Landroid/graphics/Path;->lineTo(FF)V
a=0;// 
a=0;//     .line 454
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart2:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     #v18=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart2:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     invoke-virtual/range {v17 .. v19}, Landroid/graphics/Path;->lineTo(FF)V
a=0;// 
a=0;//     .line 455
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     invoke-virtual/range {v17 .. v17}, Landroid/graphics/Path;->close()V
a=0;// 
a=0;//     .line 456
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     .line 457
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath0:Landroid/graphics/Path;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     sget-object v18, Landroid/graphics/Region$Op;->XOR:Landroid/graphics/Region$Op;
a=0;// 
a=0;//     #v18=(Reference,Landroid/graphics/Region$Op;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     move-object/from16 v1, v17
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Path;);
a=0;//     move-object/from16 v2, v18
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Region$Op;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z
a=0;// 
a=0;//     .line 458
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     sget-object v18, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     move-object/from16 v1, v17
a=0;// 
a=0;//     move-object/from16 v2, v18
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z
a=0;// 
a=0;//     .line 459
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mIsRTandLB:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Boolean);
a=0;//     if-eqz v17, :cond_3
a=0;// 
a=0;//     .line 460
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     float-to-int v10, v0
a=0;// 
a=0;//     .line 461
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     const/high16 v18, 0x41c80000    # 25.0f
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     add-float v17, v17, v18
a=0;// 
a=0;//     #v17=(Float);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v12, v0
a=0;// 
a=0;//     .line 462
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v11, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mFrontShadowDrawableHTB:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     .line 468
a=0;//     :goto_3
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     #v18=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     sub-float v17, v17, v18
a=0;// 
a=0;//     #v17=(Float);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     move-wide/from16 v17, v0
a=0;// 
a=0;//     #v17=(DoubleLo);v18=(DoubleHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     #v20=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     sub-float v19, v19, v20
a=0;// 
a=0;//     #v19=(Float);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);
a=0;//     move-wide/from16 v19, v0
a=0;// 
a=0;//     #v19=(DoubleLo);v20=(DoubleHi);
a=0;//     invoke-static/range {v17 .. v20}, Ljava/lang/Math;->atan2(DD)D
a=0;// 
a=0;//     move-result-wide v17
a=0;// 
a=0;//     invoke-static/range {v17 .. v18}, Ljava/lang/Math;->toDegrees(D)D
a=0;// 
a=0;//     move-result-wide v17
a=0;// 
a=0;//     move-wide/from16 v0, v17
a=0;// 
a=0;//     double-to-float v13, v0
a=0;// 
a=0;//     .line 469
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     #v18=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     move/from16 v1, v17
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v18
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v13, v1, v2}, Landroid/graphics/Canvas;->rotate(FFF)V
a=0;// 
a=0;//     .line 471
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     const/16 v18, 0x0
a=0;// 
a=0;//     #v18=(Null);
a=0;//     cmpg-float v17, v17, v18
a=0;// 
a=0;//     #v17=(Byte);
a=0;//     if-gez v17, :cond_4
a=0;// 
a=0;//     .line 472
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Float);
a=0;//     sub-float v14, v17, v18
a=0;// 
a=0;//     .line 476
a=0;//     .local v14, "temp":F
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v14=(Integer);v17=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     float-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     move-wide/from16 v17, v0
a=0;// 
a=0;//     #v17=(DoubleLo);v18=(DoubleHi);
a=0;//     float-to-double v0, v14
a=0;// 
a=0;//     move-wide/from16 v19, v0
a=0;// 
a=0;//     invoke-static/range {v17 .. v20}, Ljava/lang/Math;->hypot(DD)D
a=0;// 
a=0;//     move-result-wide v17
a=0;// 
a=0;//     move-wide/from16 v0, v17
a=0;// 
a=0;//     double-to-int v9, v0
a=0;// 
a=0;//     .line 477
a=0;//     .local v9, "hmg":I
a=0;//     #v9=(Integer);
a=0;//     int-to-float v0, v9
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMaxLength:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     cmpl-float v17, v17, v18
a=0;// 
a=0;//     #v17=(Byte);
a=0;//     if-lez v17, :cond_5
a=0;// 
a=0;//     .line 478
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     const/high16 v18, 0x41c80000    # 25.0f
a=0;// 
a=0;//     sub-float v17, v17, v18
a=0;// 
a=0;//     #v17=(Float);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     sub-int v17, v17, v9
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     #v18=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMaxLength:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     add-float v18, v18, v19
a=0;// 
a=0;//     #v18=(Float);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     sub-int v18, v18, v9
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     move/from16 v1, v18
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v11, v0, v10, v1, v12}, Landroid/graphics/drawable/GradientDrawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 482
a=0;//     :goto_5
a=0;//     #v19=(Conflicted);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual {v11, v0}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 483
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V
a=0;// 
a=0;//     .line 484
a=0;//     return-void
a=0;// 
a=0;//     .line 408
a=0;//     .end local v3    # "d1":D
a=0;//     .end local v5    # "d2":D
a=0;//     .end local v7    # "degree":D
a=0;//     .end local v9    # "hmg":I
a=0;//     .end local v10    # "leftx":I
a=0;//     .end local v11    # "mCurrentPageShadow":Landroid/graphics/drawable/GradientDrawable;
a=0;//     .end local v12    # "rightx":I
a=0;//     .end local v13    # "rotateDegrees":F
a=0;//     .end local v14    # "temp":F
a=0;//     .end local v15    # "x":F
a=0;//     .end local v16    # "y":F
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Boolean);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);
a=0;//     const-wide v17, 0x3fe921fb54442d18L    # 0.7853981633974483
a=0;// 
a=0;//     #v17=(LongLo);v18=(LongHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     #v20=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     sub-float v19, v19, v20
a=0;// 
a=0;//     #v19=(Float);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     move-wide/from16 v19, v0
a=0;// 
a=0;//     #v19=(DoubleLo);v20=(DoubleHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     #v21=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v22, v0
a=0;// 
a=0;//     #v22=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     sub-float v21, v21, v22
a=0;// 
a=0;//     #v21=(Float);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);
a=0;//     move-wide/from16 v21, v0
a=0;// 
a=0;//     #v21=(DoubleLo);v22=(DoubleHi);
a=0;//     invoke-static/range {v19 .. v22}, Ljava/lang/Math;->atan2(DD)D
a=0;// 
a=0;//     move-result-wide v19
a=0;// 
a=0;//     sub-double v7, v17, v19
a=0;// 
a=0;//     .restart local v7    # "degree":D
a=0;//     #v7=(DoubleLo);v8=(DoubleHi);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 418
a=0;//     .restart local v3    # "d1":D
a=0;//     .restart local v5    # "d2":D
a=0;//     .restart local v15    # "x":F
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v3=(DoubleLo);v4=(DoubleHi);v5=(DoubleLo);v6=(DoubleHi);v15=(Float);v17=(Boolean);v18=(DoubleHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     float-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);
a=0;//     move-wide/from16 v17, v0
a=0;// 
a=0;//     #v17=(DoubleLo);
a=0;//     sub-double v17, v17, v5
a=0;// 
a=0;//     move-wide/from16 v0, v17
a=0;// 
a=0;//     double-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     .restart local v16    # "y":F
a=0;//     #v16=(Float);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 439
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Reference,Landroid/graphics/Path;);v2=(Reference,Landroid/graphics/Region$Op;);v17=(Boolean);v18=(Reference,Landroid/graphics/Region$Op;);v19=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     const/high16 v18, 0x41c80000    # 25.0f
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     sub-float v17, v17, v18
a=0;// 
a=0;//     #v17=(Float);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v10, v0
a=0;// 
a=0;//     .line 440
a=0;//     .restart local v10    # "leftx":I
a=0;//     #v10=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     add-int/lit8 v12, v17, 0x1
a=0;// 
a=0;//     .line 441
a=0;//     .restart local v12    # "rightx":I
a=0;//     #v12=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v11, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mFrontShadowDrawableVRL:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     .restart local v11    # "mCurrentPageShadow":Landroid/graphics/drawable/GradientDrawable;
a=0;//     #v11=(Reference,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 464
a=0;//     .restart local v13    # "rotateDegrees":F
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v13=(Float);v17=(Boolean);v18=(Reference,Landroid/graphics/Region$Op;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     const/high16 v18, 0x41c80000    # 25.0f
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     sub-float v17, v17, v18
a=0;// 
a=0;//     #v17=(Float);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v10, v0
a=0;// 
a=0;//     .line 465
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     const/high16 v18, 0x3f800000    # 1.0f
a=0;// 
a=0;//     add-float v17, v17, v18
a=0;// 
a=0;//     #v17=(Float);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v12, v0
a=0;// 
a=0;//     .line 466
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v11, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mFrontShadowDrawableHBT:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 474
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(Integer);v2=(Integer);v17=(Byte);v18=(Null);v19=(DoubleLo);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v14, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     .restart local v14    # "temp":F
a=0;//     #v14=(Integer);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 480
a=0;//     .restart local v9    # "hmg":I
a=0;//     :cond_5
a=0;//     #v0=(Integer);v1=(DoubleHi);v9=(Integer);v17=(Byte);v18=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMaxLength:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     sub-float v17, v17, v18
a=0;// 
a=0;//     #v17=(Float);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     #v18=(Reference,Landroid/graphics/PointF;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     move/from16 v1, v18
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v11, v0, v10, v1, v12}, Landroid/graphics/drawable/GradientDrawable;->setBounds(IIII)V
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// .end method
a=0;// 
a=0;// .method private drawNextPageAreaAndShadow(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;)V
a=0;//     .locals 9
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;//     .param p2, "bitmap"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v8, 0x40800000    # 4.0f
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 338
a=0;//     #v7=(Null);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Path;);
a=0;//     invoke-virtual {v3}, Landroid/graphics/Path;->reset()V
a=0;// 
a=0;//     .line 339
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, v4, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v5, v5, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->moveTo(FF)V
a=0;// 
a=0;//     .line 340
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBeziervertex1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, v4, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBeziervertex1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v5, v5, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V
a=0;// 
a=0;//     .line 341
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBeziervertex2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, v4, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBeziervertex2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v5, v5, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V
a=0;// 
a=0;//     .line 342
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, v4, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v5, v5, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V
a=0;// 
a=0;//     .line 343
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerY:I
a=0;// 
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V
a=0;// 
a=0;//     .line 344
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/graphics/Path;->close()V
a=0;// 
a=0;//     .line 346
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl1:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget v3, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     sub-float/2addr v3, v4
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierControl2:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v5, v5, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerY:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     sub-float/2addr v5, v6
a=0;// 
a=0;//     #v5=(Float);
a=0;//     float-to-double v5, v5
a=0;// 
a=0;//     #v5=(DoubleLo);v6=(DoubleHi);
a=0;//     invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->atan2(DD)D
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     invoke-static {v3, v4}, Ljava/lang/Math;->toDegrees(D)D
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     double-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mDegrees:F
a=0;// 
a=0;//     .line 350
a=0;//     iget-boolean v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mIsRTandLB:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 351
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v3, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     float-to-int v0, v3
a=0;// 
a=0;//     .line 352
a=0;//     .local v0, "leftx":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v3, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouchToCornerDis:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     div-float/2addr v4, v8
a=0;// 
a=0;//     #v4=(Float);
a=0;//     add-float/2addr v3, v4
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v2, v3
a=0;// 
a=0;//     .line 353
a=0;//     .local v2, "rightx":I
a=0;//     #v2=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBackShadowDrawableLR:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     .line 359
a=0;//     .local v1, "mBackShadowDrawable":Landroid/graphics/drawable/GradientDrawable;
a=0;//     :goto_0
a=0;//     #v1=(Reference,Landroid/graphics/drawable/GradientDrawable;);v3=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     .line 360
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath0:Landroid/graphics/Path;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Path;);
a=0;//     invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z
a=0;// 
a=0;//     .line 361
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     sget-object v4, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Region$Op;);
a=0;//     invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z
a=0;// 
a=0;//     .line 362
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p1, p2, v7, v7, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 363
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mDegrees:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget v4, v4, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v5, v5, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p1, v3, v4, v5}, Landroid/graphics/Canvas;->rotate(FFF)V
a=0;// 
a=0;//     .line 364
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v3, v3, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mMaxLength:F
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v5, v5, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-float/2addr v4, v5
a=0;// 
a=0;//     #v4=(Float);
a=0;//     float-to-int v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v0, v3, v2, v4}, Landroid/graphics/drawable/GradientDrawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 365
a=0;//     invoke-virtual {v1, p1}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 366
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
a=0;// 
a=0;//     .line 367
a=0;//     return-void
a=0;// 
a=0;//     .line 355
a=0;//     .end local v0    # "leftx":I
a=0;//     .end local v1    # "mBackShadowDrawable":Landroid/graphics/drawable/GradientDrawable;
a=0;//     .end local v2    # "rightx":I
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(DoubleHi);v5=(DoubleLo);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v3, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouchToCornerDis:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     div-float/2addr v4, v8
a=0;// 
a=0;//     #v4=(Float);
a=0;//     sub-float/2addr v3, v4
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v0, v3
a=0;// 
a=0;//     .line 356
a=0;//     .restart local v0    # "leftx":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBezierStart1:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v3, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     float-to-int v2, v3
a=0;// 
a=0;//     .line 357
a=0;//     .restart local v2    # "rightx":I
a=0;//     #v2=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mBackShadowDrawableRL:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     .restart local v1    # "mBackShadowDrawable":Landroid/graphics/drawable/GradientDrawable;
a=0;//     #v1=(Reference,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getCross(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;
a=0;//     .locals 8
a=0;//     .param p1, "P1"    # Landroid/graphics/PointF;
a=0;//     .param p2, "P2"    # Landroid/graphics/PointF;
a=0;//     .param p3, "P3"    # Landroid/graphics/PointF;
a=0;//     .param p4, "P4"    # Landroid/graphics/PointF;
a=0;// 
a=0;//     .prologue
a=0;//     .line 252
a=0;//     new-instance v0, Landroid/graphics/PointF;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/PointF;);
a=0;//     invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V
a=0;// 
a=0;//     .line 254
a=0;//     .local v0, "CrossP":Landroid/graphics/PointF;
a=0;//     #v0=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v5, p2, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p1, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-float/2addr v5, v6
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iget v6, p2, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     iget v7, p1, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-float/2addr v6, v7
a=0;// 
a=0;//     #v6=(Float);
a=0;//     div-float v1, v5, v6
a=0;// 
a=0;//     .line 255
a=0;//     .local v1, "a1":F
a=0;//     #v1=(Float);
a=0;//     iget v5, p1, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p2, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     mul-float/2addr v5, v6
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iget v6, p2, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     iget v7, p1, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     mul-float/2addr v6, v7
a=0;// 
a=0;//     #v6=(Float);
a=0;//     sub-float/2addr v5, v6
a=0;// 
a=0;//     iget v6, p1, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget v7, p2, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     sub-float/2addr v6, v7
a=0;// 
a=0;//     #v6=(Float);
a=0;//     div-float v3, v5, v6
a=0;// 
a=0;//     .line 257
a=0;//     .local v3, "b1":F
a=0;//     #v3=(Float);
a=0;//     iget v5, p4, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p3, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-float/2addr v5, v6
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iget v6, p4, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     iget v7, p3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     sub-float/2addr v6, v7
a=0;// 
a=0;//     #v6=(Float);
a=0;//     div-float v2, v5, v6
a=0;// 
a=0;//     .line 258
a=0;//     .local v2, "a2":F
a=0;//     #v2=(Float);
a=0;//     iget v5, p3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p4, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     mul-float/2addr v5, v6
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iget v6, p4, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     iget v7, p3, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     mul-float/2addr v6, v7
a=0;// 
a=0;//     #v6=(Float);
a=0;//     sub-float/2addr v5, v6
a=0;// 
a=0;//     iget v6, p3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget v7, p4, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     sub-float/2addr v6, v7
a=0;// 
a=0;//     #v6=(Float);
a=0;//     div-float v4, v5, v6
a=0;// 
a=0;//     .line 259
a=0;//     .local v4, "b2":F
a=0;//     #v4=(Float);
a=0;//     sub-float v5, v4, v3
a=0;// 
a=0;//     sub-float v6, v1, v2
a=0;// 
a=0;//     div-float/2addr v5, v6
a=0;// 
a=0;//     iput v5, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     .line 260
a=0;//     iget v5, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     mul-float/2addr v5, v1
a=0;// 
a=0;//     #v5=(Float);
a=0;//     add-float/2addr v5, v3
a=0;// 
a=0;//     iput v5, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     .line 261
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public abortAnimation()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 164
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 165
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V
a=0;// 
a=0;//     .line 167
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public calcCornerXY(FF)V
a=0;//     .locals 3
a=0;//     .param p1, "x"    # F
a=0;//     .param p2, "y"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 145
a=0;//     #v2=(Null);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mWidth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     cmpg-float v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_2
a=0;// 
a=0;//     .line 146
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     .line 149
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mHeight:I
a=0;// 
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     cmpg-float v0, p2, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_3
a=0;// 
a=0;//     .line 150
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerY:I
a=0;// 
a=0;//     .line 153
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerY:I
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mHeight:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mWidth:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_4
a=0;// 
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerY:I
a=0;// 
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 154
a=0;//     :cond_1
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mIsRTandLB:Z
a=0;// 
a=0;//     .line 157
a=0;//     :goto_2
a=0;//     #v0=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 148
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(Uninit);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mWidth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 152
a=0;//     :cond_3
a=0;//     #v0=(Byte);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerY:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 156
a=0;//     :cond_4
a=0;//     #v1=(Integer);
a=0;//     iput-boolean v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mIsRTandLB:Z
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public cgbg(I)V
a=0;//     .locals 0
a=0;//     .param p1, "p"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 237
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->p:I
a=0;// 
a=0;//     .line 240
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public computeScroll()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 220
a=0;//     invoke-super {p0}, Lcom/twocloo/com/cn/view/PageWidget;->computeScroll()V
a=0;// 
a=0;//     .line 222
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v2}, Landroid/widget/Scroller;->computeScrollOffset()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 223
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v2}, Landroid/widget/Scroller;->getCurrX()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v0, v2
a=0;// 
a=0;//     .line 224
a=0;//     .local v0, "x":F
a=0;//     #v0=(Float);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v2}, Landroid/widget/Scroller;->getCurrY()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v1, v2
a=0;// 
a=0;//     .line 225
a=0;//     .local v1, "y":F
a=0;//     #v1=(Float);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/PointF;);
a=0;//     iput v0, v2, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     .line 226
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     iput v1, v2, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     .line 227
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/RealPageWidget;->postInvalidate()V
a=0;// 
a=0;//     .line 229
a=0;//     .end local v0    # "x":F
a=0;//     .end local v1    # "y":F
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public doTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 3
a=0;//     .param p1, "event"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 105
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/PointF;);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iput v1, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     .line 107
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput v1, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     .line 108
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/RealPageWidget;->postInvalidate()V
a=0;// 
a=0;//     .line 110
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 111
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/PointF;);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput v1, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput v1, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     .line 115
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/view/RealPageWidget;->calcCornerXY(FF)V
a=0;// 
a=0;//     .line 117
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ne v0, v2, :cond_2
a=0;// 
a=0;//     .line 118
a=0;//     const/16 v0, 0x4b0
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/view/RealPageWidget;->startAnimation(I)V
a=0;// 
a=0;//     .line 120
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/RealPageWidget;->postInvalidate()V
a=0;// 
a=0;//     .line 123
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     return v2
a=0;// .end method
a=0;// 
a=0;// .method public isDragToRight()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 174
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 175
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 176
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 10
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 190
a=0;//     #v7=(Null);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 216
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 194
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const-string v3, "image_cache_key_pagewidget_bg_%s"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-array v4, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->p:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 195
a=0;//     .local v2, "key":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/base/cache/lru/BMemCache;->getInstance()Lcom/twocloo/base/cache/lru/BMemCache;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Lcom/twocloo/base/cache/lru/BMemCache;->get(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 196
a=0;//     .local v1, "cacheBM":Landroid/graphics/Bitmap;
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 197
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/RealPageWidget;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget-object v3, Lcom/twocloo/com/cn/common/Constants;->READ_BG_LIST:Ljava/util/List;
a=0;// 
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->p:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v4, v3}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 198
a=0;//     #v3=(Reference,Landroid/graphics/Bitmap;);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mWidth:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->wh:[I
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     aget v5, v5, v8
a=0;// 
a=0;//     .line 197
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v3, v4, v5, v8}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 200
a=0;//     .local v0, "bg":Landroid/graphics/Bitmap;
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {p1, v0, v7, v7, v9}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 202
a=0;//     invoke-static {}, Lcom/twocloo/base/cache/lru/BMemCache;->getInstance()Lcom/twocloo/base/cache/lru/BMemCache;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v2, v0}, Lcom/twocloo/base/cache/lru/BMemCache;->put(Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 210
a=0;//     .end local v0    # "bg":Landroid/graphics/Bitmap;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/RealPageWidget;->calcPoints()V
a=0;// 
a=0;//     .line 211
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCurPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Bitmap;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mPath0:Landroid/graphics/Path;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Path;);
a=0;//     invoke-direct {p0, p1, v3, v4}, Lcom/twocloo/com/cn/view/RealPageWidget;->drawCurrentPageArea(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;Landroid/graphics/Path;)V
a=0;// 
a=0;//     .line 212
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mNextPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     invoke-direct {p0, p1, v3}, Lcom/twocloo/com/cn/view/RealPageWidget;->drawNextPageAreaAndShadow(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 214
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCurPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     invoke-direct {p0, p1, v3}, Lcom/twocloo/com/cn/view/RealPageWidget;->drawCurrentBackArea(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 205
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v3=(Boolean);v5=(Null);
a=0;//     invoke-virtual {p1, v1, v7, v7, v9}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public setBitmaps(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
a=0;//     .locals 0
a=0;//     .param p1, "cur"    # Landroid/graphics/Bitmap;
a=0;//     .param p2, "next"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCurPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 137
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mNextPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 138
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startAnimation(I)V
a=0;//     .locals 6
a=0;//     .param p1, "delayMillis"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 545
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerX:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 546
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mWidth:I
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v1, v1, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     neg-int v3, v0
a=0;// 
a=0;//     .line 550
a=0;//     .local v3, "dx":I
a=0;//     :goto_0
a=0;//     #v3=(Integer);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mCornerY:I
a=0;// 
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 551
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mHeight:I
a=0;// 
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v1, v1, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v4, v0
a=0;// 
a=0;//     .line 555
a=0;//     .local v4, "dy":I
a=0;//     :goto_1
a=0;//     #v4=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v1, v1, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v2, v2, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     move v5, p1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V
a=0;// 
a=0;//     .line 556
a=0;//     return-void
a=0;// 
a=0;//     .line 548
a=0;//     .end local v3    # "dx":I
a=0;//     .end local v4    # "dy":I
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mWidth:I
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v1, v1, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mWidth:I
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     add-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v3, v0
a=0;// 
a=0;//     .restart local v3    # "dx":I
a=0;//     #v3=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 553
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     const/high16 v0, 0x3f800000    # 1.0f
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RealPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v1, v1, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v4, v0
a=0;// 
a=0;//     .restart local v4    # "dy":I
a=0;//     #v4=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
}}
