package com.twocloo.com.cn.beans; class ScreenInfo { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/beans/ScreenInfo;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ScreenInfo.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private activity:Landroid/app/Activity;
a=0;// 
a=0;// .field private density:F
a=0;// 
a=0;// .field private densityDpi:I
a=0;// 
a=0;// .field private height:I
a=0;// 
a=0;// .field private width:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;)V
a=0;//     .locals 0
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 63
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/beans/ScreenInfo;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/beans/ScreenInfo;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 64
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/beans/ScreenInfo;->ini()V
a=0;// 
a=0;//     .line 65
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private ini()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     new-instance v0, Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/util/DisplayMetrics;);
a=0;//     invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V
a=0;// 
a=0;//     .line 69
a=0;//     .local v0, "metric":Landroid/util/DisplayMetrics;
a=0;//     #v0=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/ScreenInfo;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
a=0;// 
a=0;//     .line 70
a=0;//     iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/beans/ScreenInfo;->width:I
a=0;// 
a=0;//     .line 71
a=0;//     iget v1, v0, Landroid/util/DisplayMetrics;->heightPixels:I
a=0;// 
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/beans/ScreenInfo;->height:I
a=0;// 
a=0;//     .line 72
a=0;//     iget v1, v0, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/beans/ScreenInfo;->density:F
a=0;// 
a=0;//     .line 73
a=0;//     iget v1, v0, Landroid/util/DisplayMetrics;->densityDpi:I
a=0;// 
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/beans/ScreenInfo;->densityDpi:I
a=0;// 
a=0;//     .line 74
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getActivity()Landroid/app/Activity;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/ScreenInfo;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDensity()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/ScreenInfo;->density:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getDensityDpi()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/ScreenInfo;->densityDpi:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getHeight()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/ScreenInfo;->height:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getWidth()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/ScreenInfo;->width:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public setActivity(Landroid/app/Activity;)V
a=0;//     .locals 0
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/beans/ScreenInfo;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 28
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDensity(F)V
a=0;//     .locals 0
a=0;//     .param p1, "density"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/beans/ScreenInfo;->density:F
a=0;// 
a=0;//     .line 52
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDensityDpi(I)V
a=0;//     .locals 0
a=0;//     .param p1, "densityDpi"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/beans/ScreenInfo;->densityDpi:I
a=0;// 
a=0;//     .line 60
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setHeight(I)V
a=0;//     .locals 0
a=0;//     .param p1, "height"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/beans/ScreenInfo;->height:I
a=0;// 
a=0;//     .line 44
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setWidth(I)V
a=0;//     .locals 0
a=0;//     .param p1, "width"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/beans/ScreenInfo;->width:I
a=0;// 
a=0;//     .line 36
a=0;//     return-void
a=0;// .end method
}}