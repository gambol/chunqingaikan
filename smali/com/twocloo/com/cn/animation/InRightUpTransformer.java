package com.twocloo.com.cn.animation; class InRightUpTransformer { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/animation/InRightUpTransformer;
a=0;// .super Ljava/lang/Object;
a=0;// .source "InRightUpTransformer.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/view/ViewPager$PageTransformer;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/animation/InRightUpTransformer;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public transformPage(Landroid/view/View;F)V
a=0;//     .locals 4
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;//     .param p2, "position"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/high16 v3, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 18
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 19
a=0;//     .local v0, "pageHeight":I
a=0;//     #v0=(Integer);
a=0;//     const/high16 v1, -0x40800000    # -1.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     cmpg-float v1, p2, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gez v1, :cond_0
a=0;// 
a=0;//     .line 20
a=0;//     invoke-virtual {p1, v3}, Landroid/view/View;->setAlpha(F)V
a=0;// 
a=0;//     .line 21
a=0;//     invoke-virtual {p1, v2}, Landroid/view/View;->setTranslationY(F)V
a=0;// 
a=0;//     .line 38
a=0;//     :goto_0
a=0;//     #v1=(Float);v2=(Float);
a=0;//     return-void
a=0;// 
a=0;//     .line 22
a=0;//     :cond_0
a=0;//     #v1=(Byte);v2=(Null);
a=0;//     cmpg-float v1, p2, v2
a=0;// 
a=0;//     if-gtz v1, :cond_1
a=0;// 
a=0;//     .line 23
a=0;//     int-to-float v1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     neg-float v2, p2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     mul-float/2addr v1, v2
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Landroid/view/View;->setTranslationY(F)V
a=0;// 
a=0;//     .line 24
a=0;//     add-float v1, v3, p2
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 28
a=0;//     :cond_1
a=0;//     #v1=(Byte);v2=(Null);
a=0;//     cmpg-float v1, p2, v3
a=0;// 
a=0;//     if-gtz v1, :cond_2
a=0;// 
a=0;//     .line 29
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     neg-float v2, p2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     mul-float/2addr v1, v2
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Landroid/view/View;->setTranslationY(F)V
a=0;// 
a=0;//     .line 30
a=0;//     sub-float v1, v3, p2
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 35
a=0;//     :cond_2
a=0;//     #v1=(Byte);v2=(Null);
a=0;//     invoke-virtual {p1, v2}, Landroid/view/View;->setTranslationY(F)V
a=0;// 
a=0;//     .line 36
a=0;//     invoke-virtual {p1, v3}, Landroid/view/View;->setAlpha(F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
