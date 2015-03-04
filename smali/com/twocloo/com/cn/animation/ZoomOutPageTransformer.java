package com.twocloo.com.cn.animation; class ZoomOutPageTransformer { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/animation/ZoomOutPageTransformer;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ZoomOutPageTransformer.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/view/ViewPager$PageTransformer;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static MIN_ALPHA:F
a=0;// 
a=0;// .field private static MIN_SCALE:F
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     const v0, 0x3f59999a    # 0.85f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lcom/twocloo/com/cn/animation/ZoomOutPageTransformer;->MIN_SCALE:F
a=0;// 
a=0;//     .line 17
a=0;//     const/high16 v0, 0x3f000000    # 0.5f
a=0;// 
a=0;//     sput v0, Lcom/twocloo/com/cn/animation/ZoomOutPageTransformer;->MIN_ALPHA:F
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/animation/ZoomOutPageTransformer;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public transformPage(Landroid/view/View;F)V
a=0;//     .locals 10
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;//     .param p2, "position"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v9, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/high16 v8, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 21
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 22
a=0;//     .local v2, "pageWidth":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 24
a=0;//     .local v1, "pageHeight":I
a=0;//     #v1=(Integer);
a=0;//     const/high16 v5, -0x40800000    # -1.0f
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     cmpg-float v5, p2, v5
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-gez v5, :cond_0
a=0;// 
a=0;//     .line 26
a=0;//     invoke-virtual {p1, v7}, Landroid/view/View;->setAlpha(F)V
a=0;// 
a=0;//     .line 27
a=0;//     invoke-virtual {p1, v7}, Landroid/view/View;->setTranslationX(F)V
a=0;// 
a=0;//     .line 50
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Float);v6=(Conflicted);v7=(Float);
a=0;//     return-void
a=0;// 
a=0;//     .line 28
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Byte);v6=(Uninit);v7=(Null);
a=0;//     cmpg-float v5, p2, v8
a=0;// 
a=0;//     if-gtz v5, :cond_2
a=0;// 
a=0;//     .line 31
a=0;//     sget v5, Lcom/twocloo/com/cn/animation/ZoomOutPageTransformer;->MIN_SCALE:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {p2}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     sub-float v6, v8, v6
a=0;// 
a=0;//     invoke-static {v5, v6}, Ljava/lang/Math;->max(FF)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 32
a=0;//     .local v3, "scaleFactor":F
a=0;//     #v3=(Float);
a=0;//     int-to-float v5, v1
a=0;// 
a=0;//     #v5=(Float);
a=0;//     sub-float v6, v8, v3
a=0;// 
a=0;//     mul-float/2addr v5, v6
a=0;// 
a=0;//     div-float v4, v5, v9
a=0;// 
a=0;//     .line 33
a=0;//     .local v4, "vertMargin":F
a=0;//     #v4=(Float);
a=0;//     int-to-float v5, v2
a=0;// 
a=0;//     sub-float v6, v8, v3
a=0;// 
a=0;//     mul-float/2addr v5, v6
a=0;// 
a=0;//     div-float v0, v5, v9
a=0;// 
a=0;//     .line 34
a=0;//     .local v0, "horzMargin":F
a=0;//     #v0=(Float);
a=0;//     cmpg-float v5, p2, v7
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-gez v5, :cond_1
a=0;// 
a=0;//     .line 35
a=0;//     div-float v5, v4, v9
a=0;// 
a=0;//     #v5=(Float);
a=0;//     sub-float v5, v0, v5
a=0;// 
a=0;//     invoke-virtual {p1, v5}, Landroid/view/View;->setTranslationX(F)V
a=0;// 
a=0;//     .line 40
a=0;//     :goto_1
a=0;//     invoke-virtual {p1, v3}, Landroid/view/View;->setScaleX(F)V
a=0;// 
a=0;//     .line 41
a=0;//     invoke-virtual {p1, v3}, Landroid/view/View;->setScaleY(F)V
a=0;// 
a=0;//     .line 43
a=0;//     sget v5, Lcom/twocloo/com/cn/animation/ZoomOutPageTransformer;->MIN_ALPHA:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sget v6, Lcom/twocloo/com/cn/animation/ZoomOutPageTransformer;->MIN_SCALE:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-float v6, v3, v6
a=0;// 
a=0;//     .line 44
a=0;//     #v6=(Float);
a=0;//     sget v7, Lcom/twocloo/com/cn/animation/ZoomOutPageTransformer;->MIN_SCALE:F
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-float v7, v8, v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     div-float/2addr v6, v7
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/animation/ZoomOutPageTransformer;->MIN_ALPHA:F
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-float v7, v8, v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     mul-float/2addr v6, v7
a=0;// 
a=0;//     add-float/2addr v5, v6
a=0;// 
a=0;//     .line 43
a=0;//     #v5=(Float);
a=0;//     invoke-virtual {p1, v5}, Landroid/view/View;->setAlpha(F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 37
a=0;//     :cond_1
a=0;//     #v5=(Byte);v7=(Null);
a=0;//     neg-float v5, v0
a=0;// 
a=0;//     #v5=(Float);
a=0;//     div-float v6, v4, v9
a=0;// 
a=0;//     add-float/2addr v5, v6
a=0;// 
a=0;//     invoke-virtual {p1, v5}, Landroid/view/View;->setTranslationX(F)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 47
a=0;//     .end local v0    # "horzMargin":F
a=0;//     .end local v3    # "scaleFactor":F
a=0;//     .end local v4    # "vertMargin":F
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Byte);v6=(Uninit);
a=0;//     invoke-virtual {p1, v7}, Landroid/view/View;->setAlpha(F)V
a=0;// 
a=0;//     .line 48
a=0;//     invoke-virtual {p1, v7}, Landroid/view/View;->setTranslationX(F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
