package com.twocloo.com.cn.animation; class DefaultTransformer { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/animation/DefaultTransformer;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DefaultTransformer.java"
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
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/animation/DefaultTransformer;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public transformPage(Landroid/view/View;F)V
a=0;//     .locals 3
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;//     .param p2, "arg1"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v2, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 18
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V
a=0;// 
a=0;//     .line 19
a=0;//     invoke-virtual {p1, v1}, Landroid/view/View;->setTranslationX(F)V
a=0;// 
a=0;//     .line 20
a=0;//     invoke-virtual {p1, v1}, Landroid/view/View;->setTranslationY(F)V
a=0;// 
a=0;//     .line 21
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setPivotX(F)V
a=0;// 
a=0;//     .line 22
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setPivotY(F)V
a=0;// 
a=0;//     .line 23
a=0;//     invoke-virtual {p1, v2}, Landroid/view/View;->setScaleX(F)V
a=0;// 
a=0;//     .line 24
a=0;//     invoke-virtual {p1, v2}, Landroid/view/View;->setScaleY(F)V
a=0;// 
a=0;//     .line 25
a=0;//     invoke-virtual {p1, v1}, Landroid/view/View;->setRotation(F)V
a=0;// 
a=0;//     .line 26
a=0;//     return-void
a=0;// .end method
}}
