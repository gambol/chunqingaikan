package com.twocloo.com.cn.utils; class MyBitMap { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/utils/MyBitMap;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MyBitMap.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 19
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/utils/MyBitMap;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static calculateDstRect(IIIILandroid/widget/ImageView$ScaleType;)Landroid/graphics/Rect;
a=0;//     .locals 5
a=0;//     .param p0, "srcWidth"    # I
a=0;//     .param p1, "srcHeight"    # I
a=0;//     .param p2, "dstWidth"    # I
a=0;//     .param p3, "dstHeight"    # I
a=0;//     .param p4, "scalingLogic"    # Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 81
a=0;//     #v4=(Null);
a=0;//     sget-object v2, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ImageView$ScaleType;);
a=0;//     if-ne p4, v2, :cond_1
a=0;// 
a=0;//     .line 82
a=0;//     int-to-float v2, p0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     int-to-float v3, p1
a=0;// 
a=0;//     #v3=(Float);
a=0;//     div-float v1, v2, v3
a=0;// 
a=0;//     .line 83
a=0;//     .local v1, "srcAspect":F
a=0;//     #v1=(Float);
a=0;//     int-to-float v2, p2
a=0;// 
a=0;//     int-to-float v3, p3
a=0;// 
a=0;//     div-float v0, v2, v3
a=0;// 
a=0;//     .line 84
a=0;//     .local v0, "dstAspect":F
a=0;//     #v0=(Float);
a=0;//     cmpl-float v2, v1, v0
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     .line 85
a=0;//     new-instance v2, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/Rect;);
a=0;//     int-to-float v3, p2
a=0;// 
a=0;//     div-float/2addr v3, v1
a=0;// 
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v2, v4, v4, p2, v3}, Landroid/graphics/Rect;-><init>(IIII)V
a=0;// 
a=0;//     .line 90
a=0;//     .end local v0    # "dstAspect":F
a=0;//     .end local v1    # "srcAspect":F
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Landroid/graphics/Rect;);v3=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 87
a=0;//     .restart local v0    # "dstAspect":F
a=0;//     .restart local v1    # "srcAspect":F
a=0;//     :cond_0
a=0;//     #v0=(Float);v1=(Float);v2=(Byte);v3=(Float);
a=0;//     new-instance v2, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/Rect;);
a=0;//     int-to-float v3, p3
a=0;// 
a=0;//     mul-float/2addr v3, v1
a=0;// 
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v2, v4, v4, v3, p3}, Landroid/graphics/Rect;-><init>(IIII)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Rect;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 90
a=0;//     .end local v0    # "dstAspect":F
a=0;//     .end local v1    # "srcAspect":F
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);
a=0;//     new-instance v2, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v2, v4, v4, p2, p3}, Landroid/graphics/Rect;-><init>(IIII)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Rect;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static calculateSrcRect(IIIILandroid/widget/ImageView$ScaleType;)Landroid/graphics/Rect;
a=0;//     .locals 9
a=0;//     .param p0, "srcWidth"    # I
a=0;//     .param p1, "srcHeight"    # I
a=0;//     .param p2, "dstWidth"    # I
a=0;//     .param p3, "dstHeight"    # I
a=0;//     .param p4, "scalingLogic"    # Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 62
a=0;//     #v8=(Null);
a=0;//     sget-object v6, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     #v6=(Reference,Landroid/widget/ImageView$ScaleType;);
a=0;//     if-ne p4, v6, :cond_1
a=0;// 
a=0;//     .line 63
a=0;//     int-to-float v6, p0
a=0;// 
a=0;//     #v6=(Float);
a=0;//     int-to-float v7, p1
a=0;// 
a=0;//     #v7=(Float);
a=0;//     div-float v2, v6, v7
a=0;// 
a=0;//     .line 64
a=0;//     .local v2, "srcAspect":F
a=0;//     #v2=(Float);
a=0;//     int-to-float v6, p2
a=0;// 
a=0;//     int-to-float v7, p3
a=0;// 
a=0;//     div-float v0, v6, v7
a=0;// 
a=0;//     .line 65
a=0;//     .local v0, "dstAspect":F
a=0;//     #v0=(Float);
a=0;//     cmpl-float v6, v2, v0
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-lez v6, :cond_0
a=0;// 
a=0;//     .line 66
a=0;//     int-to-float v6, p1
a=0;// 
a=0;//     #v6=(Float);
a=0;//     mul-float/2addr v6, v0
a=0;// 
a=0;//     float-to-int v5, v6
a=0;// 
a=0;//     .line 67
a=0;//     .local v5, "srcRectWidth":I
a=0;//     #v5=(Integer);
a=0;//     sub-int v6, p0, v5
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     div-int/lit8 v4, v6, 0x2
a=0;// 
a=0;//     .line 68
a=0;//     .local v4, "srcRectLeft":I
a=0;//     #v4=(Integer);
a=0;//     new-instance v6, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/graphics/Rect;);
a=0;//     add-int v7, v4, v5
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-direct {v6, v4, v8, v7, p1}, Landroid/graphics/Rect;-><init>(IIII)V
a=0;// 
a=0;//     .line 75
a=0;//     .end local v0    # "dstAspect":F
a=0;//     .end local v2    # "srcAspect":F
a=0;//     .end local v4    # "srcRectLeft":I
a=0;//     .end local v5    # "srcRectWidth":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Reference,Landroid/graphics/Rect;);v7=(Conflicted);
a=0;//     return-object v6
a=0;// 
a=0;//     .line 70
a=0;//     .restart local v0    # "dstAspect":F
a=0;//     .restart local v2    # "srcAspect":F
a=0;//     :cond_0
a=0;//     #v0=(Float);v1=(Uninit);v2=(Float);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Byte);v7=(Float);
a=0;//     int-to-float v6, p0
a=0;// 
a=0;//     #v6=(Float);
a=0;//     div-float/2addr v6, v0
a=0;// 
a=0;//     float-to-int v3, v6
a=0;// 
a=0;//     .line 71
a=0;//     .local v3, "srcRectHeight":I
a=0;//     #v3=(Integer);
a=0;//     sub-int v6, p1, v3
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     div-int/lit8 v1, v6, 0x2
a=0;// 
a=0;//     .line 72
a=0;//     .local v1, "scrRectTop":I
a=0;//     #v1=(Integer);
a=0;//     new-instance v6, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/graphics/Rect;);
a=0;//     add-int v7, v1, v3
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-direct {v6, v8, v1, p0, v7}, Landroid/graphics/Rect;-><init>(IIII)V
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Rect;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 75
a=0;//     .end local v0    # "dstAspect":F
a=0;//     .end local v1    # "scrRectTop":I
a=0;//     .end local v2    # "srcAspect":F
a=0;//     .end local v3    # "srcRectHeight":I
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v7=(Uninit);
a=0;//     new-instance v6, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v6, v8, v8, p0, p1}, Landroid/graphics/Rect;-><init>(IIII)V
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Rect;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public createBMScaleBitmap(Landroid/graphics/Bitmap;Ljava/lang/Double;Landroid/widget/ImageView$ScaleType;)Landroid/graphics/Bitmap;
a=0;//     .locals 6
a=0;//     .param p1, "unscaledBitmap"    # Landroid/graphics/Bitmap;
a=0;//     .param p2, "scale"    # Ljava/lang/Double;
a=0;//     .param p3, "scalingLogic"    # Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-double v2, v2
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(DoubleLo);v5=(DoubleHi);
a=0;//     mul-double/2addr v2, v4
a=0;// 
a=0;//     double-to-int v1, v2
a=0;// 
a=0;//     .line 34
a=0;//     .local v1, "dstWidth":I
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-double v2, v2
a=0;// 
a=0;//     #v2=(DoubleLo);
a=0;//     invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     mul-double/2addr v2, v4
a=0;// 
a=0;//     double-to-int v0, v2
a=0;// 
a=0;//     .line 35
a=0;//     .local v0, "dstHeight":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, p1, v1, v0, p3}, Lcom/twocloo/com/cn/utils/MyBitMap;->createScaledBitmap(Landroid/graphics/Bitmap;IILandroid/widget/ImageView$ScaleType;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method public createScaledBitmap(Landroid/graphics/Bitmap;IILandroid/widget/ImageView$ScaleType;)Landroid/graphics/Bitmap;
a=0;//     .locals 7
a=0;//     .param p1, "unscaledBitmap"    # Landroid/graphics/Bitmap;
a=0;//     .param p2, "dstWidth"    # I
a=0;//     .param p3, "dstHeight"    # I
a=0;//     .param p4, "scalingLogic"    # Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v4, v5, p2, p3, p4}, Lcom/twocloo/com/cn/utils/MyBitMap;->calculateSrcRect(IIIILandroid/widget/ImageView$ScaleType;)Landroid/graphics/Rect;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 53
a=0;//     .local v3, "srcRect":Landroid/graphics/Rect;
a=0;//     #v3=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-static {v4, v5, p2, p3, p4}, Lcom/twocloo/com/cn/utils/MyBitMap;->calculateDstRect(IIIILandroid/widget/ImageView$ScaleType;)Landroid/graphics/Rect;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 54
a=0;//     .local v1, "dstRect":Landroid/graphics/Rect;
a=0;//     #v1=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {v1}, Landroid/graphics/Rect;->width()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/graphics/Rect;->height()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     invoke-static {v4, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 55
a=0;//     .local v2, "scaledBitmap":Landroid/graphics/Bitmap;
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap;);
a=0;//     new-instance v0, Landroid/graphics/Canvas;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Canvas;);
a=0;//     invoke-direct {v0, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 56
a=0;//     .local v0, "canvas":Landroid/graphics/Canvas;
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     new-instance v4, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/graphics/Paint;);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-direct {v4, v5}, Landroid/graphics/Paint;-><init>(I)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Paint;);
a=0;//     invoke-virtual {v0, p1, v3, v1, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 57
a=0;//     return-object v2
a=0;// .end method
}}
