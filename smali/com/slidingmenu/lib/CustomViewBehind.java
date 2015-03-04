package com.slidingmenu.lib; class CustomViewBehind { void a() { int a;
a=0;// .class public Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// .super Landroid/view/ViewGroup;
a=0;// .source "CustomViewBehind.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final MARGIN_THRESHOLD:I = 0x30
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "CustomViewBehind"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mChildrenEnabled:Z
a=0;// 
a=0;// .field private mContent:Landroid/view/View;
a=0;// 
a=0;// .field private mFadeDegree:F
a=0;// 
a=0;// .field private mFadeEnabled:Z
a=0;// 
a=0;// .field private final mFadePaint:Landroid/graphics/Paint;
a=0;// 
a=0;// .field private mMarginThreshold:I
a=0;// 
a=0;// .field private mMode:I
a=0;// 
a=0;// .field private mScrollScale:F
a=0;// 
a=0;// .field private mSecondaryContent:Landroid/view/View;
a=0;// 
a=0;// .field private mSecondaryShadowDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mSelectedView:Landroid/view/View;
a=0;// 
a=0;// .field private mSelectorDrawable:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field private mSelectorEnabled:Z
a=0;// 
a=0;// .field private mShadowDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mShadowWidth:I
a=0;// 
a=0;// .field private mTouchMode:I
a=0;// 
a=0;// .field private mTransformer:Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;// 
a=0;// .field private mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;// .field private mWidthOffset:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/slidingmenu/lib/CustomViewBehind;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 39
a=0;//     #v2=(One);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 23
a=0;//     #p0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mTouchMode:I
a=0;// 
a=0;//     .line 142
a=0;//     new-instance v0, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mFadePaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 376
a=0;//     iput-boolean v2, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSelectorEnabled:Z
a=0;// 
a=0;//     .line 41
a=0;//     const/high16 v0, 0x42400000    # 48.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 40
a=0;//     invoke-static {v2, v0, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMarginThreshold:I
a=0;// 
a=0;//     .line 42
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getSelectorTop()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 421
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSelectedView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 422
a=0;//     .local v0, "y":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSelectedView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSelectorDrawable:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     div-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     .line 423
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected dispatchDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 2
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mTransformer:Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 111
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mTransformer:Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     #v1=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     invoke-virtual {v1}, Lcom/slidingmenu/lib/CustomViewAbove;->getPercentOpen()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-interface {v0, p1, v1}, Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;->transformCanvas(Landroid/graphics/Canvas;F)V
a=0;// 
a=0;//     .line 113
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 114
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
a=0;// 
a=0;//     .line 117
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 116
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public drawFade(Landroid/view/View;Landroid/graphics/Canvas;F)V
a=0;//     .locals 9
a=0;//     .param p1, "content"    # Landroid/view/View;
a=0;//     .param p2, "canvas"    # Landroid/graphics/Canvas;
a=0;//     .param p3, "openPercent"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 355
a=0;//     #v3=(Null);
a=0;//     iget-boolean v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mFadeEnabled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 374
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Float);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 356
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mFadeDegree:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/high16 v1, 0x437f0000    # 255.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     sub-float/2addr v1, p3
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-static {v1}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v6, v0
a=0;// 
a=0;//     .line 357
a=0;//     .local v6, "alpha":I
a=0;//     #v6=(Integer);
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mFadePaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     invoke-static {v6, v3, v3, v3}, Landroid/graphics/Color;->argb(IIII)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 358
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 359
a=0;//     .local v7, "left":I
a=0;//     #v7=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 360
a=0;//     .local v8, "right":I
a=0;//     #v8=(Null);
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 361
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getBehindWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     sub-int v7, v0, v1
a=0;// 
a=0;//     .line 362
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 373
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v3=(Float);v4=(Conflicted);v5=(Conflicted);v8=(Integer);
a=0;//     int-to-float v1, v7
a=0;// 
a=0;//     #v1=(Float);
a=0;//     int-to-float v3, v8
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     int-to-float v4, v0
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget-object v5, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mFadePaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object v0, p2
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 363
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Integer);v3=(Null);v4=(Uninit);v5=(Uninit);v7=(Null);v8=(Null);
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     .line 364
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 365
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getBehindWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int v8, v0, v1
a=0;// 
a=0;//     .line 366
a=0;//     #v8=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(One);v7=(Null);v8=(Null);
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 367
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getBehindWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int v7, v0, v1
a=0;// 
a=0;//     .line 368
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 369
a=0;//     #v8=(Integer);
a=0;//     int-to-float v1, v7
a=0;// 
a=0;//     #v1=(Float);
a=0;//     int-to-float v3, v8
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     int-to-float v4, v0
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget-object v5, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mFadePaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object v0, p2
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 370
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 371
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getBehindWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int v8, v0, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public drawSelector(Landroid/view/View;Landroid/graphics/Canvas;F)V
a=0;//     .locals 8
a=0;//     .param p1, "content"    # Landroid/view/View;
a=0;//     .param p2, "canvas"    # Landroid/graphics/Canvas;
a=0;//     .param p3, "openPercent"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 381
a=0;//     #v6=(Null);
a=0;//     iget-boolean v4, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSelectorEnabled:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 402
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Float);
a=0;//     return-void
a=0;// 
a=0;//     .line 382
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Boolean);v5=(Uninit);v6=(Null);
a=0;//     iget-object v4, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSelectorDrawable:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     iget-object v4, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSelectedView:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 383
a=0;//     iget-object v4, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSelectedView:Landroid/view/View;
a=0;// 
a=0;//     sget v5, Lcom/slidingmenu/lib/R$id;->selected_view:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/lang/String;
a=0;// 
a=0;//     .line 384
a=0;//     .local v3, "tag":Ljava/lang/String;
a=0;//     const-string v4, "CustomViewBehindSelectedView"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 385
a=0;//     invoke-virtual {p2}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     .line 387
a=0;//     iget-object v4, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSelectorDrawable:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     mul-float/2addr v4, p3
a=0;// 
a=0;//     float-to-int v1, v4
a=0;// 
a=0;//     .line 388
a=0;//     .local v1, "offset":I
a=0;//     #v1=(Integer);
a=0;//     iget v4, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     .line 389
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 390
a=0;//     .local v2, "right":I
a=0;//     #v2=(Integer);
a=0;//     sub-int v0, v2, v1
a=0;// 
a=0;//     .line 391
a=0;//     .local v0, "left":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-virtual {p2, v0, v6, v2, v4}, Landroid/graphics/Canvas;->clipRect(IIII)Z
a=0;// 
a=0;//     .line 392
a=0;//     iget-object v4, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSelectorDrawable:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Bitmap;);
a=0;//     int-to-float v5, v0
a=0;// 
a=0;//     #v5=(Float);
a=0;//     invoke-direct {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getSelectorTop()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     invoke-virtual {p2, v4, v5, v6, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 399
a=0;//     .end local v0    # "left":I
a=0;//     .end local v2    # "right":I
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {p2}, Landroid/graphics/Canvas;->restore()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 393
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v2=(Uninit);v4=(Integer);v5=(Integer);v6=(Null);
a=0;//     iget v4, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     if-ne v4, v5, :cond_2
a=0;// 
a=0;//     .line 394
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 395
a=0;//     .restart local v0    # "left":I
a=0;//     #v0=(Integer);
a=0;//     add-int v2, v0, v1
a=0;// 
a=0;//     .line 396
a=0;//     .restart local v2    # "right":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-virtual {p2, v0, v6, v2, v4}, Landroid/graphics/Canvas;->clipRect(IIII)Z
a=0;// 
a=0;//     .line 397
a=0;//     iget-object v4, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSelectorDrawable:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Bitmap;);
a=0;//     iget-object v5, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSelectorDrawable:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sub-int v5, v2, v5
a=0;// 
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     invoke-direct {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getSelectorTop()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     invoke-virtual {p2, v4, v5, v6, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public drawShadow(Landroid/view/View;Landroid/graphics/Canvas;)V
a=0;//     .locals 5
a=0;//     .param p1, "content"    # Landroid/view/View;
a=0;//     .param p2, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 336
a=0;//     #v4=(Null);
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mShadowDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget v1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mShadowWidth:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gtz v1, :cond_1
a=0;// 
a=0;//     .line 352
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 337
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 338
a=0;//     .local v0, "left":I
a=0;//     #v0=(Null);
a=0;//     iget v1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 339
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iget v2, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mShadowWidth:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int v0, v1, v2
a=0;// 
a=0;//     .line 350
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mShadowDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iget v2, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mShadowWidth:I
a=0;// 
a=0;//     add-int/2addr v2, v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v0, v4, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 351
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mShadowDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 340
a=0;//     :cond_3
a=0;//     #v0=(Null);v1=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     iget v1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-ne v1, v2, :cond_4
a=0;// 
a=0;//     .line 341
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 342
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Null);
a=0;//     iget v1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_2
a=0;// 
a=0;//     .line 343
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSecondaryShadowDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 344
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 345
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSecondaryShadowDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     iget v2, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mShadowWidth:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v2, v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v0, v4, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 346
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSecondaryShadowDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 348
a=0;//     :cond_5
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mShadowWidth:I
a=0;// 
a=0;//     sub-int v0, v1, v2
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public getAbsLeftBound(Landroid/view/View;)I
a=0;//     .locals 2
a=0;//     .param p1, "content"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 259
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 260
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getBehindWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     .line 264
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     .line 261
a=0;//     :cond_1
a=0;//     #v1=(PosByte);
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 262
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 264
a=0;//     :cond_2
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getAbsRightBound(Landroid/view/View;)I
a=0;//     .locals 2
a=0;//     .param p1, "content"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 268
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 269
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 273
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 270
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 271
a=0;//     :cond_1
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getBehindWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 273
a=0;//     :cond_2
a=0;//     #v1=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getBehindWidth()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getContent()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getMenuLeft(Landroid/view/View;I)I
a=0;//     .locals 2
a=0;//     .param p1, "content"    # Landroid/view/View;
a=0;//     .param p2, "page"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 233
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 234
a=0;//     packed-switch p2, :pswitch_data_0
a=0;// 
a=0;//     .line 255
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_1
a=0;//     return v0
a=0;// 
a=0;//     .line 236
a=0;//     :pswitch_1
a=0;//     #v1=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getBehindWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 238
a=0;//     :pswitch_2
a=0;//     #v1=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 240
a=0;//     :cond_1
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 241
a=0;//     packed-switch p2, :pswitch_data_1
a=0;// 
a=0;//     :pswitch_3
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 243
a=0;//     :pswitch_4
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 245
a=0;//     :pswitch_5
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getBehindWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 247
a=0;//     :cond_2
a=0;//     #v1=(One);
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 248
a=0;//     packed-switch p2, :pswitch_data_2
a=0;// 
a=0;//     :pswitch_6
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 250
a=0;//     :pswitch_7
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getBehindWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 252
a=0;//     :pswitch_8
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getBehindWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 234
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// 
a=0;//     .line 241
a=0;//     :pswitch_data_1
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_4
a=0;//         :pswitch_3
a=0;//         :pswitch_5
a=0;//     .end packed-switch
a=0;// 
a=0;//     .line 248
a=0;//     :pswitch_data_2
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_7
a=0;//         :pswitch_6
a=0;//         :pswitch_8
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public getMenuPage(I)I
a=0;//     .locals 4
a=0;//     .param p1, "page"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 197
a=0;//     #v3=(One);
a=0;//     if-le p1, v3, :cond_1
a=0;// 
a=0;//     move p1, v0
a=0;// 
a=0;//     .line 198
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     iget v2, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     if-le p1, v3, :cond_2
a=0;// 
a=0;//     .line 203
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 197
a=0;//     :cond_1
a=0;//     #v1=(Null);v2=(Uninit);
a=0;//     if-ge p1, v3, :cond_0
a=0;// 
a=0;//     move p1, v1
a=0;// 
a=0;//     #p1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 200
a=0;//     :cond_2
a=0;//     #v2=(Integer);p1=(Integer);
a=0;//     iget v1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v3, :cond_3
a=0;// 
a=0;//     if-ge p1, v3, :cond_3
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 201
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Integer);
a=0;//     move v1, p1
a=0;// 
a=0;//     .line 203
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public getMode()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 160
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getScrollScale()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 168
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mScrollScale:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getSecondaryContent()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSecondaryContent:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public marginTouchAllowed(Landroid/view/View;I)Z
a=0;//     .locals 6
a=0;//     .param p1, "content"    # Landroid/view/View;
a=0;//     .param p2, "x"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 277
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 278
a=0;//     .local v0, "left":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 279
a=0;//     .local v1, "right":I
a=0;//     #v1=(Integer);
a=0;//     iget v4, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 280
a=0;//     if-lt p2, v0, :cond_1
a=0;// 
a=0;//     iget v4, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMarginThreshold:I
a=0;// 
a=0;//     add-int/2addr v4, v0
a=0;// 
a=0;//     if-gt p2, v4, :cond_1
a=0;// 
a=0;//     .line 287
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Boolean);v5=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(One);v5=(Uninit);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 280
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 281
a=0;//     :cond_2
a=0;//     #v2=(One);
a=0;//     iget v4, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     if-ne v4, v2, :cond_4
a=0;// 
a=0;//     .line 282
a=0;//     if-gt p2, v1, :cond_3
a=0;// 
a=0;//     iget v4, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMarginThreshold:I
a=0;// 
a=0;//     sub-int v4, v1, v4
a=0;// 
a=0;//     if-ge p2, v4, :cond_0
a=0;// 
a=0;//     :cond_3
a=0;//     move v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 283
a=0;//     :cond_4
a=0;//     #v2=(One);
a=0;//     iget v4, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-ne v4, v5, :cond_7
a=0;// 
a=0;//     .line 284
a=0;//     if-lt p2, v0, :cond_5
a=0;// 
a=0;//     iget v4, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMarginThreshold:I
a=0;// 
a=0;//     add-int/2addr v4, v0
a=0;// 
a=0;//     if-le p2, v4, :cond_0
a=0;// 
a=0;//     .line 285
a=0;//     :cond_5
a=0;//     if-gt p2, v1, :cond_6
a=0;// 
a=0;//     iget v4, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMarginThreshold:I
a=0;// 
a=0;//     sub-int v4, v1, v4
a=0;// 
a=0;//     .line 284
a=0;//     if-ge p2, v4, :cond_0
a=0;// 
a=0;//     :cond_6
a=0;//     move v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     #v2=(One);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 287
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public menuClosedSlideAllowed(F)Z
a=0;//     .locals 4
a=0;//     .param p1, "dx"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 314
a=0;//     #v0=(One);
a=0;//     iget v2, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 315
a=0;//     cmpl-float v2, p1, v3
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_1
a=0;// 
a=0;//     .line 321
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Integer);v3=(PosByte);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);v2=(Byte);v3=(Null);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 315
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 316
a=0;//     :cond_2
a=0;//     #v0=(One);v2=(Integer);
a=0;//     iget v2, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     if-ne v2, v0, :cond_3
a=0;// 
a=0;//     .line 317
a=0;//     cmpg-float v2, p1, v3
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ltz v2, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 318
a=0;//     :cond_3
a=0;//     #v0=(One);v2=(Integer);
a=0;//     iget v2, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-eq v2, v3, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 321
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public menuOpenSlideAllowed(F)Z
a=0;//     .locals 4
a=0;//     .param p1, "dx"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 325
a=0;//     #v0=(One);
a=0;//     iget v2, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 326
a=0;//     cmpg-float v2, p1, v3
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_1
a=0;// 
a=0;//     .line 332
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Integer);v3=(PosByte);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);v2=(Byte);v3=(Null);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 326
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 327
a=0;//     :cond_2
a=0;//     #v0=(One);v2=(Integer);
a=0;//     iget v2, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     if-ne v2, v0, :cond_3
a=0;// 
a=0;//     .line 328
a=0;//     cmpl-float v2, p1, v3
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gtz v2, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 329
a=0;//     :cond_3
a=0;//     #v0=(One);v2=(Integer);
a=0;//     iget v2, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-eq v2, v3, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 332
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public menuOpenTouchAllowed(Landroid/view/View;IF)Z
a=0;//     .locals 1
a=0;//     .param p1, "content"    # Landroid/view/View;
a=0;//     .param p2, "currPage"    # I
a=0;//     .param p3, "x"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 295
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mTouchMode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 301
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 297
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 299
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, p1, p2, p3}, Lcom/slidingmenu/lib/CustomViewBehind;->menuTouchInQuickReturn(Landroid/view/View;IF)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 295
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public menuTouchInQuickReturn(Landroid/view/View;IF)Z
a=0;//     .locals 4
a=0;//     .param p1, "content"    # Landroid/view/View;
a=0;//     .param p2, "currPage"    # I
a=0;//     .param p3, "x"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 305
a=0;//     #v0=(Null);
a=0;//     iget v2, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget v2, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     if-ne v2, v3, :cond_2
a=0;// 
a=0;//     if-nez p2, :cond_2
a=0;// 
a=0;//     .line 306
a=0;//     :cond_0
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     cmpl-float v2, p3, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ltz v2, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 310
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     .line 307
a=0;//     :cond_2
a=0;//     #v0=(Null);
a=0;//     iget v2, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     if-eq v2, v1, :cond_3
a=0;// 
a=0;//     iget v2, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     if-ne v2, v3, :cond_1
a=0;// 
a=0;//     if-ne p2, v3, :cond_1
a=0;// 
a=0;//     .line 308
a=0;//     :cond_3
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     cmpg-float v2, p3, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gtz v2, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     iget-boolean v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mChildrenEnabled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 5
a=0;//     .param p1, "changed"    # Z
a=0;//     .param p2, "l"    # I
a=0;//     .param p3, "t"    # I
a=0;//     .param p4, "r"    # I
a=0;//     .param p5, "b"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 121
a=0;//     #v4=(Null);
a=0;//     sub-int v1, p4, p2
a=0;// 
a=0;//     .line 122
a=0;//     .local v1, "width":I
a=0;//     #v1=(Integer);
a=0;//     sub-int v0, p5, p3
a=0;// 
a=0;//     .line 123
a=0;//     .local v0, "height":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     iget v3, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mWidthOffset:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int v3, v1, v3
a=0;// 
a=0;//     invoke-virtual {v2, v4, v4, v3, v0}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 124
a=0;//     iget-object v2, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSecondaryContent:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 125
a=0;//     iget-object v2, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSecondaryContent:Landroid/view/View;
a=0;// 
a=0;//     iget v3, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mWidthOffset:I
a=0;// 
a=0;//     sub-int v3, v1, v3
a=0;// 
a=0;//     invoke-virtual {v2, v4, v4, v3, v0}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 126
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 6
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 130
a=0;//     #v5=(Null);
a=0;//     invoke-static {v5, p1}, Lcom/slidingmenu/lib/CustomViewBehind;->getDefaultSize(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 131
a=0;//     .local v3, "width":I
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v5, p2}, Lcom/slidingmenu/lib/CustomViewBehind;->getDefaultSize(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 132
a=0;//     .local v2, "height":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v3, v2}, Lcom/slidingmenu/lib/CustomViewBehind;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 133
a=0;//     iget v4, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mWidthOffset:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int v4, v3, v4
a=0;// 
a=0;//     invoke-static {p1, v5, v4}, Lcom/slidingmenu/lib/CustomViewBehind;->getChildMeasureSpec(III)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 134
a=0;//     .local v1, "contentWidth":I
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p2, v5, v2}, Lcom/slidingmenu/lib/CustomViewBehind;->getChildMeasureSpec(III)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 135
a=0;//     .local v0, "contentHeight":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v4, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v4, v1, v0}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 136
a=0;//     iget-object v4, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSecondaryContent:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 137
a=0;//     iget-object v4, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSecondaryContent:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v4, v1, v0}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 138
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 105
a=0;//     iget-boolean v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mChildrenEnabled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public scrollBehindTo(Landroid/view/View;II)V
a=0;//     .locals 5
a=0;//     .param p1, "content"    # Landroid/view/View;
a=0;//     .param p2, "x"    # I
a=0;//     .param p3, "y"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     .line 208
a=0;//     #v2=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 209
a=0;//     .local v0, "vis":I
a=0;//     #v0=(Null);
a=0;//     iget v1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 210
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-lt p2, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     .line 211
a=0;//     :cond_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getBehindWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     add-int/2addr v1, p2
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v3, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mScrollScale:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-float/2addr v1, v3
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1, p3}, Lcom/slidingmenu/lib/CustomViewBehind;->scrollTo(II)V
a=0;// 
a=0;//     .line 227
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);
a=0;//     if-ne v0, v2, :cond_2
a=0;// 
a=0;//     .line 228
a=0;//     const-string v1, "CustomViewBehind"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "behind INVISIBLE"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 229
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {p0, v0}, Lcom/slidingmenu/lib/CustomViewBehind;->setVisibility(I)V
a=0;// 
a=0;//     .line 230
a=0;//     return-void
a=0;// 
a=0;//     .line 212
a=0;//     :cond_3
a=0;//     #v0=(Null);v1=(Integer);v2=(PosByte);v3=(Null);v4=(Uninit);
a=0;//     iget v1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     if-ne v1, v4, :cond_5
a=0;// 
a=0;//     .line 213
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-gt p2, v1, :cond_4
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     .line 214
a=0;//     :cond_4
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getBehindWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v1, v3
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     .line 215
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getBehindWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     sub-int v3, p2, v3
a=0;// 
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget v4, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mScrollScale:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     mul-float/2addr v3, v4
a=0;// 
a=0;//     add-float/2addr v1, v3
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     .line 214
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1, p3}, Lcom/slidingmenu/lib/CustomViewBehind;->scrollTo(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 216
a=0;//     :cond_5
a=0;//     #v0=(Null);v3=(Null);v4=(One);
a=0;//     iget v1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ne v1, v4, :cond_1
a=0;// 
a=0;//     .line 217
a=0;//     iget-object v4, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-lt p2, v1, :cond_6
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v4, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 218
a=0;//     iget-object v4, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSecondaryContent:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gt p2, v1, :cond_7
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v4, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 219
a=0;//     if-nez p2, :cond_8
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 220
a=0;//     :goto_3
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gt p2, v1, :cond_9
a=0;// 
a=0;//     .line 221
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getBehindWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     add-int/2addr v1, p2
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v3, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mScrollScale:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-float/2addr v1, v3
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1, p3}, Lcom/slidingmenu/lib/CustomViewBehind;->scrollTo(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Null);v3=(Null);
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 217
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_7
a=0;//     #v1=(Integer);
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 218
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_8
a=0;//     #v1=(PosByte);
a=0;//     move v0, v3
a=0;// 
a=0;//     .line 219
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 223
a=0;//     :cond_9
a=0;//     #v0=(PosByte);v1=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getBehindWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v1, v3
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     .line 224
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->getBehindWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     sub-int v3, p2, v3
a=0;// 
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget v4, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mScrollScale:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     mul-float/2addr v3, v4
a=0;// 
a=0;//     add-float/2addr v1, v3
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     .line 223
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1, p3}, Lcom/slidingmenu/lib/CustomViewBehind;->scrollTo(II)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public scrollTo(II)V
a=0;//     .locals 1
a=0;//     .param p1, "x"    # I
a=0;//     .param p2, "y"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->scrollTo(II)V
a=0;// 
a=0;//     .line 94
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mTransformer:Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 95
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->invalidate()V
a=0;// 
a=0;//     .line 96
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCanvasTransformer(Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;)V
a=0;//     .locals 0
a=0;//     .param p1, "t"    # Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     iput-object p1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mTransformer:Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;// 
a=0;//     .line 50
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setChildrenEnabled(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "enabled"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     iput-boolean p1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mChildrenEnabled:Z
a=0;// 
a=0;//     .line 89
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setContent(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 63
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mContent:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/slidingmenu/lib/CustomViewBehind;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 64
a=0;//     :cond_0
a=0;//     iput-object p1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mContent:Landroid/view/View;
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mContent:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/slidingmenu/lib/CustomViewBehind;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 66
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCustomViewAbove(Lcom/slidingmenu/lib/CustomViewAbove;)V
a=0;//     .locals 0
a=0;//     .param p1, "customViewAbove"    # Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     iput-object p1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     .line 46
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setFadeDegree(F)V
a=0;//     .locals 2
a=0;//     .param p1, "degree"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 191
a=0;//     const/high16 v0, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     cmpg-float v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_1
a=0;// 
a=0;//     .line 192
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "The BehindFadeDegree must be between 0.0f and 1.0f"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 193
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(Uninit);
a=0;//     iput p1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mFadeDegree:F
a=0;// 
a=0;//     .line 194
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setFadeEnabled(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "b"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 187
a=0;//     iput-boolean p1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mFadeEnabled:Z
a=0;// 
a=0;//     .line 188
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setMode(I)V
a=0;//     .locals 2
a=0;//     .param p1, "mode"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ne p1, v0, :cond_2
a=0;// 
a=0;//     .line 151
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 152
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mContent:Landroid/view/View;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 153
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSecondaryContent:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 154
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSecondaryContent:Landroid/view/View;
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 156
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iput p1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mMode:I
a=0;// 
a=0;//     .line 157
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setScrollScale(F)V
a=0;//     .locals 0
a=0;//     .param p1, "scrollScale"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 164
a=0;//     iput p1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mScrollScale:F
a=0;// 
a=0;//     .line 165
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSecondaryContent(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSecondaryContent:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 78
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSecondaryContent:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/slidingmenu/lib/CustomViewBehind;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 79
a=0;//     :cond_0
a=0;//     iput-object p1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSecondaryContent:Landroid/view/View;
a=0;// 
a=0;//     .line 80
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSecondaryContent:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/slidingmenu/lib/CustomViewBehind;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 81
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSecondaryShadowDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 0
a=0;//     .param p1, "shadow"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 177
a=0;//     iput-object p1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSecondaryShadowDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 178
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->invalidate()V
a=0;// 
a=0;//     .line 179
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSelectedView(Landroid/view/View;)V
a=0;//     .locals 3
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 409
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSelectedView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 410
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSelectedView:Landroid/view/View;
a=0;// 
a=0;//     sget v1, Lcom/slidingmenu/lib/R$id;->selected_view:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 411
a=0;//     iput-object v2, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSelectedView:Landroid/view/View;
a=0;// 
a=0;//     .line 413
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 414
a=0;//     iput-object p1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSelectedView:Landroid/view/View;
a=0;// 
a=0;//     .line 415
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSelectedView:Landroid/view/View;
a=0;// 
a=0;//     sget v1, Lcom/slidingmenu/lib/R$id;->selected_view:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const-string v2, "CustomViewBehindSelectedView"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 416
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->invalidate()V
a=0;// 
a=0;//     .line 418
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSelectorBitmap(Landroid/graphics/Bitmap;)V
a=0;//     .locals 0
a=0;//     .param p1, "b"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 427
a=0;//     iput-object p1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSelectorDrawable:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 428
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->refreshDrawableState()V
a=0;// 
a=0;//     .line 429
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSelectorEnabled(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "b"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 405
a=0;//     iput-boolean p1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mSelectorEnabled:Z
a=0;// 
a=0;//     .line 406
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShadowDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 0
a=0;//     .param p1, "shadow"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 172
a=0;//     iput-object p1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mShadowDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 173
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->invalidate()V
a=0;// 
a=0;//     .line 174
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShadowWidth(I)V
a=0;//     .locals 0
a=0;//     .param p1, "width"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 182
a=0;//     iput p1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mShadowWidth:I
a=0;// 
a=0;//     .line 183
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->invalidate()V
a=0;// 
a=0;//     .line 184
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTouchMode(I)V
a=0;//     .locals 0
a=0;//     .param p1, "i"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 291
a=0;//     iput p1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mTouchMode:I
a=0;// 
a=0;//     .line 292
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setWidthOffset(I)V
a=0;//     .locals 0
a=0;//     .param p1, "i"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iput p1, p0, Lcom/slidingmenu/lib/CustomViewBehind;->mWidthOffset:I
a=0;// 
a=0;//     .line 54
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewBehind;->requestLayout()V
a=0;// 
a=0;//     .line 55
a=0;//     return-void
a=0;// .end method
}}
