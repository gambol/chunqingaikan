package com.twocloo.com.cn.animation; class RotateTransformer { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/animation/RotateTransformer;
a=0;// .super Ljava/lang/Object;
a=0;// .source "RotateTransformer.java"
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
a=0;//     .line 16
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/animation/RotateTransformer;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public transformPage(Landroid/view/View;F)V
a=0;//     .locals 3
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;//     .param p2, "position"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v2, 0x43b40000    # 360.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 19
a=0;//     #v1=(Integer);
a=0;//     const/high16 v0, -0x40800000    # -1.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpg-float v0, p2, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     .line 20
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     cmpg-float v0, p2, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     .line 21
a=0;//     add-float v0, v1, p2
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-static {p1, v0}, Lcom/nineoldandroids/view/ViewHelper;->setScaleX(Landroid/view/View;F)V
a=0;// 
a=0;//     .line 22
a=0;//     add-float v0, v1, p2
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcom/nineoldandroids/view/ViewHelper;->setScaleY(Landroid/view/View;F)V
a=0;// 
a=0;//     .line 23
a=0;//     mul-float v0, v2, p2
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcom/nineoldandroids/view/ViewHelper;->setRotation(Landroid/view/View;F)V
a=0;// 
a=0;//     .line 30
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 24
a=0;//     :cond_1
a=0;//     #v0=(Byte);
a=0;//     cmpg-float v0, p2, v1
a=0;// 
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     .line 25
a=0;//     sub-float v0, v1, p2
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-static {p1, v0}, Lcom/nineoldandroids/view/ViewHelper;->setScaleX(Landroid/view/View;F)V
a=0;// 
a=0;//     .line 26
a=0;//     sub-float v0, v1, p2
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcom/nineoldandroids/view/ViewHelper;->setScaleY(Landroid/view/View;F)V
a=0;// 
a=0;//     .line 27
a=0;//     mul-float v0, v2, p2
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcom/nineoldandroids/view/ViewHelper;->setRotation(Landroid/view/View;F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
