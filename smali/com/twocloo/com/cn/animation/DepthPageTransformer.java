package com.twocloo.com.cn.animation; class DepthPageTransformer { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/animation/DepthPageTransformer;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DepthPageTransformer.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/view/ViewPager$PageTransformer;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static MIN_SCALE:F
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     const/high16 v0, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lcom/twocloo/com/cn/animation/DepthPageTransformer;->MIN_SCALE:F
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
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/animation/DepthPageTransformer;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public transformPage(Landroid/view/View;F)V
a=0;//     .locals 6
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;//     .param p2, "position"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/high16 v5, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 20
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 21
a=0;//     .local v0, "pageWidth":I
a=0;//     #v0=(Integer);
a=0;//     const/high16 v2, -0x40800000    # -1.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     cmpg-float v2, p2, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_0
a=0;// 
a=0;//     .line 23
a=0;//     invoke-virtual {p1, v3}, Landroid/view/View;->setAlpha(F)V
a=0;// 
a=0;//     .line 24
a=0;//     invoke-virtual {p1, v3}, Landroid/view/View;->setTranslationX(F)V
a=0;// 
a=0;//     .line 48
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Integer);v3=(Float);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 25
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Byte);v3=(Null);v4=(Uninit);
a=0;//     cmpg-float v2, p2, v3
a=0;// 
a=0;//     if-gtz v2, :cond_1
a=0;// 
a=0;//     .line 28
a=0;//     invoke-virtual {p1, v5}, Landroid/view/View;->setAlpha(F)V
a=0;// 
a=0;//     .line 29
a=0;//     invoke-virtual {p1, v3}, Landroid/view/View;->setTranslationX(F)V
a=0;// 
a=0;//     .line 30
a=0;//     invoke-virtual {p1, v5}, Landroid/view/View;->setScaleX(F)V
a=0;// 
a=0;//     .line 31
a=0;//     invoke-virtual {p1, v5}, Landroid/view/View;->setScaleY(F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 32
a=0;//     :cond_1
a=0;//     cmpg-float v2, p2, v5
a=0;// 
a=0;//     if-gtz v2, :cond_2
a=0;// 
a=0;//     .line 34
a=0;//     sub-float v2, v5, p2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V
a=0;// 
a=0;//     .line 36
a=0;//     int-to-float v2, v0
a=0;// 
a=0;//     neg-float v3, p2
a=0;// 
a=0;//     #v3=(Float);
a=0;//     mul-float/2addr v2, v3
a=0;// 
a=0;//     invoke-virtual {p1, v2}, Landroid/view/View;->setTranslationX(F)V
a=0;// 
a=0;//     .line 38
a=0;//     sget v2, Lcom/twocloo/com/cn/animation/DepthPageTransformer;->MIN_SCALE:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sget v3, Lcom/twocloo/com/cn/animation/DepthPageTransformer;->MIN_SCALE:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-float v3, v5, v3
a=0;// 
a=0;//     .line 39
a=0;//     #v3=(Float);
a=0;//     invoke-static {p2}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     sub-float v4, v5, v4
a=0;// 
a=0;//     mul-float/2addr v3, v4
a=0;// 
a=0;//     .line 38
a=0;//     add-float v1, v2, v3
a=0;// 
a=0;//     .line 40
a=0;//     .local v1, "scaleFactor":F
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p1, v1}, Landroid/view/View;->setScaleX(F)V
a=0;// 
a=0;//     .line 41
a=0;//     invoke-virtual {p1, v1}, Landroid/view/View;->setScaleY(F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 44
a=0;//     .end local v1    # "scaleFactor":F
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v2=(Byte);v3=(Null);v4=(Uninit);
a=0;//     invoke-virtual {p1, v3}, Landroid/view/View;->setAlpha(F)V
a=0;// 
a=0;//     .line 45
a=0;//     invoke-virtual {p1, v5}, Landroid/view/View;->setScaleX(F)V
a=0;// 
a=0;//     .line 46
a=0;//     invoke-virtual {p1, v5}, Landroid/view/View;->setScaleY(F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
