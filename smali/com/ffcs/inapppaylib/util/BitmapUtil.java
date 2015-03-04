package com.ffcs.inapppaylib.util; class BitmapUtil { void a() { int a;
a=0;// .class public Lcom/ffcs/inapppaylib/util/BitmapUtil;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BitmapUtil.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/ffcs/inapppaylib/util/BitmapUtil;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static dp2px(Landroid/content/Context;F)I
a=0;//     .locals 3
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "dp"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v0, v1, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     .line 79
a=0;//     .local v0, "scale":F
a=0;//     #v0=(Integer);
a=0;//     mul-float v1, p1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     const/high16 v2, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-float/2addr v1, v2
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public static getCircularBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
a=0;//     .locals 11
a=0;//     .param p0, "sourceBitmap"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v7, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/high16 v10, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 97
a=0;//     #v9=(Null);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 98
a=0;//     .local v4, "targetWidth":I
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 102
a=0;//     .local v3, "targetHeight":I
a=0;//     #v3=(Integer);
a=0;//     sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     .line 99
a=0;//     #v5=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     invoke-static {v4, v3, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 103
a=0;//     .local v2, "targetBitmap":Landroid/graphics/Bitmap;
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap;);
a=0;//     new-instance v0, Landroid/graphics/Canvas;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Canvas;);
a=0;//     invoke-direct {v0, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 104
a=0;//     .local v0, "canvas":Landroid/graphics/Canvas;
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     new-instance v1, Landroid/graphics/Path;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/Path;);
a=0;//     invoke-direct {v1}, Landroid/graphics/Path;-><init>()V
a=0;// 
a=0;//     .line 106
a=0;//     .local v1, "path":Landroid/graphics/Path;
a=0;//     #v1=(Reference,Landroid/graphics/Path;);
a=0;//     int-to-float v5, v4
a=0;// 
a=0;//     #v5=(Float);
a=0;//     sub-float/2addr v5, v7
a=0;// 
a=0;//     div-float/2addr v5, v10
a=0;// 
a=0;//     .line 107
a=0;//     int-to-float v6, v3
a=0;// 
a=0;//     #v6=(Float);
a=0;//     sub-float/2addr v6, v7
a=0;// 
a=0;//     div-float/2addr v6, v10
a=0;// 
a=0;//     .line 108
a=0;//     int-to-float v7, v4
a=0;// 
a=0;//     #v7=(Float);
a=0;//     int-to-float v8, v3
a=0;// 
a=0;//     #v8=(Float);
a=0;//     invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     div-float/2addr v7, v10
a=0;// 
a=0;//     .line 109
a=0;//     sget-object v8, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;
a=0;// 
a=0;//     .line 105
a=0;//     #v8=(Reference,Landroid/graphics/Path$Direction;);
a=0;//     invoke-virtual {v1, v5, v6, v7, v8}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V
a=0;// 
a=0;//     .line 110
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z
a=0;// 
a=0;//     .line 113
a=0;//     new-instance v5, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-direct {v5, v9, v9, v6, v7}, Landroid/graphics/Rect;-><init>(IIII)V
a=0;// 
a=0;//     .line 114
a=0;//     #v5=(Reference,Landroid/graphics/Rect;);
a=0;//     new-instance v6, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v6, v9, v9, v4, v3}, Landroid/graphics/Rect;-><init>(IIII)V
a=0;// 
a=0;//     .line 115
a=0;//     #v6=(Reference,Landroid/graphics/Rect;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 111
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v0, p0, v5, v6, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 117
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method public static getRCB(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;
a=0;//     .locals 10
a=0;//     .param p0, "bitmap"    # Landroid/graphics/Bitmap;
a=0;//     .param p1, "roundPX"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 56
a=0;//     #v9=(Null);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 57
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sget-object v8, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     .line 56
a=0;//     #v8=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     invoke-static {v6, v7, v8}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 58
a=0;//     .local v2, "dstbmp":Landroid/graphics/Bitmap;
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap;);
a=0;//     new-instance v0, Landroid/graphics/Canvas;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Canvas;);
a=0;//     invoke-direct {v0, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 60
a=0;//     .local v0, "canvas":Landroid/graphics/Canvas;
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     const v1, -0xbdbdbe
a=0;// 
a=0;//     .line 61
a=0;//     .local v1, "color":I
a=0;//     #v1=(Integer);
a=0;//     new-instance v3, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     .line 62
a=0;//     .local v3, "paint":Landroid/graphics/Paint;
a=0;//     #v3=(Reference,Landroid/graphics/Paint;);
a=0;//     new-instance v4, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     invoke-direct {v4, v9, v9, v6, v7}, Landroid/graphics/Rect;-><init>(IIII)V
a=0;// 
a=0;//     .line 63
a=0;//     .local v4, "rect":Landroid/graphics/Rect;
a=0;//     #v4=(Reference,Landroid/graphics/Rect;);
a=0;//     new-instance v5, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/RectF;);
a=0;//     invoke-direct {v5, v4}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V
a=0;// 
a=0;//     .line 64
a=0;//     .local v5, "rectF":Landroid/graphics/RectF;
a=0;//     #v5=(Reference,Landroid/graphics/RectF;);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-virtual {v3, v6}, Landroid/graphics/Paint;->setAntiAlias(Z)V
a=0;// 
a=0;//     .line 65
a=0;//     invoke-virtual {v0, v9, v9, v9, v9}, Landroid/graphics/Canvas;->drawARGB(IIII)V
a=0;// 
a=0;//     .line 66
a=0;//     const v6, -0xbdbdbe
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v3, v6}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 67
a=0;//     invoke-virtual {v0, v5, p1, p1, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 68
a=0;//     new-instance v6, Landroid/graphics/PorterDuffXfermode;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/graphics/PorterDuffXfermode;);
a=0;//     sget-object v7, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;
a=0;// 
a=0;//     #v7=(Reference,Landroid/graphics/PorterDuff$Mode;);
a=0;//     invoke-direct {v6, v7}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/PorterDuffXfermode;);
a=0;//     invoke-virtual {v3, v6}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;
a=0;// 
a=0;//     .line 69
a=0;//     invoke-virtual {v0, p0, v4, v4, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 70
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method public static px2dp(Landroid/content/Context;F)I
a=0;//     .locals 3
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "px"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v0, v1, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     .line 88
a=0;//     .local v0, "scale":F
a=0;//     #v0=(Integer);
a=0;//     div-float v1, p1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     const/high16 v2, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-float/2addr v1, v2
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public static zoom(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;
a=0;//     .locals 7
a=0;//     .param p0, "bitmap"    # Landroid/graphics/Bitmap;
a=0;//     .param p1, "zf"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 25
a=0;//     #v1=(Null);
a=0;//     new-instance v5, Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/Matrix;);
a=0;//     invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V
a=0;// 
a=0;//     .line 26
a=0;//     .local v5, "matrix":Landroid/graphics/Matrix;
a=0;//     #v5=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v5, p1, p1}, Landroid/graphics/Matrix;->postScale(FF)Z
a=0;// 
a=0;//     .line 27
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 28
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 27
a=0;//     #v2=(Null);
a=0;//     invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static zoom(Landroid/graphics/Bitmap;FF)Landroid/graphics/Bitmap;
a=0;//     .locals 7
a=0;//     .param p0, "bitmap"    # Landroid/graphics/Bitmap;
a=0;//     .param p1, "wf"    # F
a=0;//     .param p2, "hf"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 39
a=0;//     #v1=(Null);
a=0;//     new-instance v5, Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/Matrix;);
a=0;//     invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V
a=0;// 
a=0;//     .line 40
a=0;//     .local v5, "matrix":Landroid/graphics/Matrix;
a=0;//     #v5=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v5, p1, p2}, Landroid/graphics/Matrix;->postScale(FF)Z
a=0;// 
a=0;//     .line 41
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 42
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 41
a=0;//     #v2=(Null);
a=0;//     invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
