package com.twocloo.com.cn.view; class XPageWidget { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/view/XPageWidget;
a=0;// .super Lcom/twocloo/com/cn/view/PageWidget;
a=0;// .source "XPageWidget.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private bg:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field private mBackShadowColors:[I
a=0;// 
a=0;// .field private mBackShadowDrawableLR:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;// .field private mBackShadowDrawableLR_Night:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;// .field private mCornerX:I
a=0;// 
a=0;// .field private mCornerY:I
a=0;// 
a=0;// .field private mCurPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field private mFrontShadowColors:[I
a=0;// 
a=0;// .field private mHeight:I
a=0;// 
a=0;// .field private mIsRTandLB:Z
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
a=0;// .field private mWidth:I
a=0;// 
a=0;// .field private p:I
a=0;// 
a=0;// .field private wh:[I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;II)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "mWidth"    # I
a=0;//     .param p3, "mHeight"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 61
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/view/PageWidget;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 27
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/XPageWidget;);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mWidth:I
a=0;// 
a=0;//     .line 28
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mHeight:I
a=0;// 
a=0;//     .line 29
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mCornerX:I
a=0;// 
a=0;//     .line 30
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mCornerY:I
a=0;// 
a=0;//     .line 33
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mCurPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 34
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mNextPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 36
a=0;//     new-instance v0, Landroid/graphics/PointF;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/PointF;);
a=0;//     invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/PointF;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     .line 62
a=0;//     iput p2, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mWidth:I
a=0;// 
a=0;//     .line 63
a=0;//     iput p3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mHeight:I
a=0;// 
a=0;//     .line 64
a=0;//     new-instance v0, Landroid/graphics/Path;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Path;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Path;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Path;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPath0:Landroid/graphics/Path;
a=0;// 
a=0;//     .line 65
a=0;//     new-instance v0, Landroid/graphics/Path;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Path;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Path;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Path;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     .line 66
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/XPageWidget;->createDrawable()V
a=0;// 
a=0;//     .line 67
a=0;//     new-instance v0, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 68
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint$Style;);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
a=0;// 
a=0;//     .line 70
a=0;//     new-instance v0, Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/XPageWidget;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     .line 71
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     const/high16 v1, -0x3d380000    # -100.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     const v1, 0x3c23d70a    # 0.01f
a=0;// 
a=0;//     iput v1, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     .line 74
a=0;//     check-cast p1, Landroid/app/Activity;
a=0;// 
a=0;//     .end local p1    # "context":Landroid/content/Context;
a=0;//     invoke-static {p1}, Lcom/twocloo/base/util/PhoneUtils;->getScreenPix(Landroid/app/Activity;)[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->wh:[I
a=0;// 
a=0;//     .line 75
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private createDrawable()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     .line 362
a=0;//     #v2=(PosByte);
a=0;//     new-array v0, v2, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     .line 364
a=0;//     .local v0, "color":[I
a=0;//     new-array v1, v2, [I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     fill-array-data v1, :array_1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mBackShadowColors:[I
a=0;// 
a=0;//     .line 365
a=0;//     new-array v1, v2, [I
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mFrontShadowColors:[I
a=0;// 
a=0;//     .line 367
a=0;//     new-instance v1, Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     sget-object v2, Landroid/graphics/drawable/GradientDrawable$Orientation;->LEFT_RIGHT:Landroid/graphics/drawable/GradientDrawable$Orientation;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/GradientDrawable$Orientation;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mBackShadowColors:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mBackShadowDrawableLR:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     .line 368
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mBackShadowDrawableLR:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V
a=0;// 
a=0;//     .line 370
a=0;//     new-instance v1, Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     sget-object v2, Landroid/graphics/drawable/GradientDrawable$Orientation;->LEFT_RIGHT:Landroid/graphics/drawable/GradientDrawable$Orientation;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mFrontShadowColors:[I
a=0;// 
a=0;//     invoke-direct {v1, v2, v3}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mBackShadowDrawableLR_Night:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     .line 371
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mBackShadowDrawableLR_Night:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V
a=0;// 
a=0;//     .line 413
a=0;//     return-void
a=0;// 
a=0;//     .line 362
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x22666666
a=0;//         0xcccccc
a=0;//     .end array-data
a=0;// 
a=0;//     .line 364
a=0;//     :array_1
a=0;//     .array-data 4
a=0;//         0x55555555
a=0;//         0x11bbbbbb
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method private drawCurrentPageArea(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;Landroid/graphics/Path;)V
a=0;//     .locals 6
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;//     .param p2, "bitmap"    # Landroid/graphics/Bitmap;
a=0;//     .param p3, "path"    # Landroid/graphics/Path;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 261
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPath0:Landroid/graphics/Path;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Path;);
a=0;//     invoke-virtual {v0}, Landroid/graphics/Path;->reset()V
a=0;// 
a=0;//     .line 262
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPath0:Landroid/graphics/Path;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v1, v1, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V
a=0;// 
a=0;//     .line 263
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPath0:Landroid/graphics/Path;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v1, v1, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mHeight:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/graphics/Path;->lineTo(FF)V
a=0;// 
a=0;//     .line 264
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPath0:Landroid/graphics/Path;
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mWidth:I
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mHeight:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/graphics/Path;->lineTo(FF)V
a=0;// 
a=0;//     .line 265
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPath0:Landroid/graphics/Path;
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mWidth:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
a=0;// 
a=0;//     .line 266
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPath0:Landroid/graphics/Path;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/Path;->close()V
a=0;// 
a=0;//     .line 267
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     .line 268
a=0;//     sget-object v0, Landroid/graphics/Region$Op;->XOR:Landroid/graphics/Region$Op;
a=0;// 
a=0;//     invoke-virtual {p1, p3, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z
a=0;// 
a=0;//     .line 269
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mWidth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     neg-int v0, v0
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v1, v1, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-float/2addr v0, v1
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1, p2, v0, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 270
a=0;//     new-instance v5, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     .line 271
a=0;//     .local v5, "paint":Landroid/graphics/Paint;
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     const/high16 v0, -0x1000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 272
a=0;//     const/high16 v0, 0x40000000    # 2.0f
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V
a=0;// 
a=0;//     .line 273
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v1, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget v3, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v4, v0
a=0;// 
a=0;//     #v4=(Float);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 274
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
a=0;// 
a=0;//     .line 276
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private drawNextPageAreaAndShadow(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;)V
a=0;//     .locals 8
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;//     .param p2, "bitmap"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 283
a=0;//     #v6=(Null);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v3, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/high16 v4, -0x3d380000    # -100.0f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     cmpl-float v3, v3, v4
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 284
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Path;);
a=0;//     invoke-virtual {v3}, Landroid/graphics/Path;->reset()V
a=0;// 
a=0;//     .line 285
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, v4, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4, v6}, Landroid/graphics/Path;->moveTo(FF)V
a=0;// 
a=0;//     .line 286
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, v4, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mHeight:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V
a=0;// 
a=0;//     .line 287
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mWidth:I
a=0;// 
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mHeight:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V
a=0;// 
a=0;//     .line 288
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mWidth:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     invoke-virtual {v3, v4, v6}, Landroid/graphics/Path;->lineTo(FF)V
a=0;// 
a=0;//     .line 289
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/graphics/Path;->close()V
a=0;// 
a=0;//     .line 290
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     .line 291
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPath0:Landroid/graphics/Path;
a=0;// 
a=0;//     invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z
a=0;// 
a=0;//     .line 292
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     sget-object v4, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Region$Op;);
a=0;//     invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z
a=0;// 
a=0;//     .line 293
a=0;//     invoke-virtual {p1, p2, v6, v6, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 294
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
a=0;// 
a=0;//     .line 355
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 296
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Byte);v4=(Integer);v5=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Path;);
a=0;//     invoke-virtual {v3}, Landroid/graphics/Path;->reset()V
a=0;// 
a=0;//     .line 297
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, v4, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4, v6}, Landroid/graphics/Path;->moveTo(FF)V
a=0;// 
a=0;//     .line 298
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, v4, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mHeight:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V
a=0;// 
a=0;//     .line 299
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mWidth:I
a=0;// 
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mHeight:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V
a=0;// 
a=0;//     .line 300
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mWidth:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     invoke-virtual {v3, v4, v6}, Landroid/graphics/Path;->lineTo(FF)V
a=0;// 
a=0;//     .line 301
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/graphics/Path;->close()V
a=0;// 
a=0;//     .line 305
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget v3, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     float-to-int v0, v3
a=0;// 
a=0;//     .line 306
a=0;//     .local v0, "leftx":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v3, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/high16 v4, 0x41a00000    # 20.0f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-float/2addr v3, v4
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v2, v3
a=0;// 
a=0;//     .line 307
a=0;//     .local v2, "rightx":I
a=0;//     #v2=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mBackShadowDrawableLR:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     .line 309
a=0;//     .local v1, "mBackShadowDrawable":Landroid/graphics/drawable/GradientDrawable;
a=0;//     #v1=(Reference,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     sget v3, Lcom/twocloo/com/cn/common/ChangeDayOrNight;->dayornight:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 310
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mBackShadowDrawableLR:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     .line 315
a=0;//     :goto_1
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     .line 316
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPath0:Landroid/graphics/Path;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Path;);
a=0;//     invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z
a=0;// 
a=0;//     .line 317
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPath1:Landroid/graphics/Path;
a=0;// 
a=0;//     sget-object v4, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Region$Op;);
a=0;//     invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z
a=0;// 
a=0;//     .line 318
a=0;//     invoke-virtual {p1, p2, v6, v6, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 319
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mHeight:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v0, v3, v2, v4}, Landroid/graphics/drawable/GradientDrawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 320
a=0;//     invoke-virtual {v1, p1}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 321
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 312
a=0;//     :cond_1
a=0;//     #v3=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mBackShadowDrawableLR_Night:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private startAnimation(I)V
a=0;//     .locals 6
a=0;//     .param p1, "delayMillis"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 417
a=0;//     #v2=(Null);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mCornerX:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 418
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v0, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     neg-int v3, v0
a=0;// 
a=0;//     .line 423
a=0;//     .local v3, "dx":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v1, v1, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     move v4, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v5, p1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V
a=0;// 
a=0;//     .line 425
a=0;//     return-void
a=0;// 
a=0;//     .line 421
a=0;//     .end local v3    # "dx":I
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mWidth:I
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v1, v1, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v3, v0
a=0;// 
a=0;//     .restart local v3    # "dx":I
a=0;//     #v3=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public abortAnimation()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z
a=0;// 
a=0;//     .line 153
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
a=0;//     .line 130
a=0;//     #v2=(Null);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mWidth:I
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
a=0;//     .line 131
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mCornerX:I
a=0;// 
a=0;//     .line 134
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mHeight:I
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
a=0;//     .line 135
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mCornerY:I
a=0;// 
a=0;//     .line 138
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mCornerX:I
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mCornerY:I
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mHeight:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mCornerX:I
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mWidth:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_4
a=0;// 
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mCornerY:I
a=0;// 
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 139
a=0;//     :cond_1
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mIsRTandLB:Z
a=0;// 
a=0;//     .line 143
a=0;//     :goto_2
a=0;//     #v0=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 133
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(Uninit);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mWidth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mCornerX:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 137
a=0;//     :cond_3
a=0;//     #v0=(Byte);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mCornerY:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 141
a=0;//     :cond_4
a=0;//     #v1=(Integer);
a=0;//     iput-boolean v2, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mIsRTandLB:Z
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public cgbg(I)V
a=0;//     .locals 0
a=0;//     .param p1, "p"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 224
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/view/XPageWidget;->p:I
a=0;// 
a=0;//     .line 226
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public computeScroll()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 208
a=0;//     invoke-super {p0}, Lcom/twocloo/com/cn/view/PageWidget;->computeScroll()V
a=0;// 
a=0;//     .line 209
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v2}, Landroid/widget/Scroller;->computeScrollOffset()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 210
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v2}, Landroid/widget/Scroller;->getCurrX()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v0, v2
a=0;// 
a=0;//     .line 211
a=0;//     .local v0, "x":F
a=0;//     #v0=(Float);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v2}, Landroid/widget/Scroller;->getCurrY()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v1, v2
a=0;// 
a=0;//     .line 212
a=0;//     .local v1, "y":F
a=0;//     #v1=(Float);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/PointF;);
a=0;//     iput v0, v2, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     .line 213
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     iput v1, v2, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     .line 214
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/XPageWidget;->postInvalidate()V
a=0;// 
a=0;//     .line 216
a=0;//     .end local v0    # "x":F
a=0;//     .end local v1    # "y":F
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public doTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 3
a=0;//     .param p1, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 85
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/PointF;);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iput v1, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     .line 87
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput v1, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     .line 88
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mHeight:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     cmpl-float v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mHeight:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iput v1, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     .line 91
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/XPageWidget;->postInvalidate()V
a=0;// 
a=0;//     .line 93
a=0;//     :cond_1
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 94
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/PointF;);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput v1, v0, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     .line 95
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput v1, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     .line 96
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mHeight:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     cmpl-float v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mTouch:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mHeight:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iput v1, v0, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     .line 99
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v2, :cond_3
a=0;// 
a=0;//     .line 101
a=0;//     const/16 v0, 0x1f4
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-direct {p0, v0}, Lcom/twocloo/com/cn/view/XPageWidget;->startAnimation(I)V
a=0;// 
a=0;//     .line 102
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/XPageWidget;->postInvalidate()V
a=0;// 
a=0;//     .line 105
a=0;//     :cond_3
a=0;//     #v0=(Integer);
a=0;//     return v2
a=0;// .end method
a=0;// 
a=0;// .method public isDragToRight()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 160
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mCornerX:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 161
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 162
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
a=0;//     .locals 7
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 176
a=0;//     #v6=(Null);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 204
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 180
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0xb
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-lt v2, v3, :cond_2
a=0;// 
a=0;//     .line 181
a=0;//     const-string v2, "image_cache_key_pagewidget_bg_%s"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/XPageWidget;->p:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 182
a=0;//     .local v1, "key":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/base/cache/lru/BMemCache;->getInstance()Lcom/twocloo/base/cache/lru/BMemCache;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Lcom/twocloo/base/cache/lru/BMemCache;->get(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 183
a=0;//     .local v0, "cacheBM":Landroid/graphics/Bitmap;
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 189
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     sget-object v2, Lcom/twocloo/com/cn/common/Constants;->READ_BG_LIST:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->p:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->drawColor(I)V
a=0;// 
a=0;//     .line 197
a=0;//     .end local v0    # "cacheBM":Landroid/graphics/Bitmap;
a=0;//     .end local v1    # "key":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mCornerX:I
a=0;// 
a=0;//     if-lez v2, :cond_4
a=0;// 
a=0;//     .line 198
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mCurPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPath0:Landroid/graphics/Path;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Path;);
a=0;//     invoke-direct {p0, p1, v2, v3}, Lcom/twocloo/com/cn/view/XPageWidget;->drawCurrentPageArea(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;Landroid/graphics/Path;)V
a=0;// 
a=0;//     .line 199
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mNextPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     invoke-direct {p0, p1, v2}, Lcom/twocloo/com/cn/view/XPageWidget;->drawNextPageAreaAndShadow(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 193
a=0;//     .restart local v0    # "cacheBM":Landroid/graphics/Bitmap;
a=0;//     .restart local v1    # "key":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);v1=(Reference,Ljava/lang/String;);v2=(Boolean);v4=(Null);v5=(Reference,Ljava/lang/Integer;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1, v0, v6, v6, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 201
a=0;//     .end local v0    # "cacheBM":Landroid/graphics/Bitmap;
a=0;//     .end local v1    # "key":Ljava/lang/String;
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mNextPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mPath0:Landroid/graphics/Path;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Path;);
a=0;//     invoke-direct {p0, p1, v2, v3}, Lcom/twocloo/com/cn/view/XPageWidget;->drawCurrentPageArea(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;Landroid/graphics/Path;)V
a=0;// 
a=0;//     .line 202
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mCurPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     invoke-direct {p0, p1, v2}, Lcom/twocloo/com/cn/view/XPageWidget;->drawNextPageAreaAndShadow(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setBitmaps(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
a=0;//     .locals 0
a=0;//     .param p1, "cur"    # Landroid/graphics/Bitmap;
a=0;//     .param p2, "next"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 116
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mCurPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 117
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/view/XPageWidget;->mNextPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 118
a=0;//     return-void
a=0;// .end method
}}
