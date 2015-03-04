package com.twocloo.com.cn.animation; class CubeTransformer { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/animation/CubeTransformer;
a=0;// .super Ljava/lang/Object;
a=0;// .source "CubeTransformer.java"
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
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/animation/CubeTransformer;);
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
a=0;//     const/high16 v3, 0x42b40000    # 90.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/high16 v2, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 20
a=0;//     #v1=(Null);
a=0;//     cmpg-float v0, p2, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     .line 22
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-static {p1, v0}, Lcom/nineoldandroids/view/ViewHelper;->setPivotX(Landroid/view/View;F)V
a=0;// 
a=0;//     .line 23
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     mul-float/2addr v0, v2
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcom/nineoldandroids/view/ViewHelper;->setPivotY(Landroid/view/View;F)V
a=0;// 
a=0;//     .line 25
a=0;//     mul-float v0, v3, p2
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcom/nineoldandroids/view/ViewHelper;->setRotationY(Landroid/view/View;F)V
a=0;// 
a=0;//     .line 31
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 26
a=0;//     :cond_1
a=0;//     #v0=(Byte);
a=0;//     const/high16 v0, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpg-float v0, p2, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     .line 27
a=0;//     invoke-static {p1, v1}, Lcom/nineoldandroids/view/ViewHelper;->setPivotX(Landroid/view/View;F)V
a=0;// 
a=0;//     .line 28
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     mul-float/2addr v0, v2
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcom/nineoldandroids/view/ViewHelper;->setPivotY(Landroid/view/View;F)V
a=0;// 
a=0;//     .line 29
a=0;//     mul-float v0, v3, p2
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcom/nineoldandroids/view/ViewHelper;->setRotationY(Landroid/view/View;F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
