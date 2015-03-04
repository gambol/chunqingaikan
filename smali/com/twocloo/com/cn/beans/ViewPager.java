package com.twocloo.com.cn.beans; class ViewPager { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/beans/ViewPager;
a=0;// .super Landroid/support/v4/view/ViewPager;
a=0;// .source "ViewPager.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private specHeight:I
a=0;// 
a=0;// .field private specWidth:I
a=0;// 
a=0;// .field private startXLoadtion:F
a=0;// 
a=0;// .field private startYLocation:F
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 23
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 12
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/beans/ViewPager;);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/beans/ViewPager;->startXLoadtion:F
a=0;// 
a=0;//     .line 13
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/beans/ViewPager;->startYLocation:F
a=0;// 
a=0;//     .line 24
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/beans/ViewPager;->init(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 25
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 18
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 12
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/beans/ViewPager;);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/beans/ViewPager;->startXLoadtion:F
a=0;// 
a=0;//     .line 13
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/beans/ViewPager;->startYLocation:F
a=0;// 
a=0;//     .line 19
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/beans/ViewPager;->init(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 20
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private init(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 6
a=0;//     .param p1, "arg0"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 42
a=0;//     :goto_0
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/ViewPager;->startXLoadtion:F
a=0;// 
a=0;//     float-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     const-wide v2, 0x3fb5555555555555L    # 0.08333333333333333
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/beans/ViewPager;->specWidth:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-double v4, v4
a=0;// 
a=0;//     #v4=(DoubleLo);v5=(DoubleHi);
a=0;//     mul-double/2addr v2, v4
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     cmpg-double v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/ViewPager;->startXLoadtion:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     float-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);
a=0;//     const-wide v2, 0x3fed555555555555L    # 0.9166666666666666
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/beans/ViewPager;->specWidth:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-double v4, v4
a=0;// 
a=0;//     #v4=(DoubleLo);
a=0;//     mul-double/2addr v2, v4
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     cmpl-double v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     .line 43
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/ViewPager;->startYLocation:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     float-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);
a=0;//     const-wide v2, 0x3fd2bc40bfd9a146L    # 0.2927400468384075
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/beans/ViewPager;->specHeight:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-double v4, v4
a=0;// 
a=0;//     #v4=(DoubleLo);
a=0;//     mul-double/2addr v2, v4
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     cmpl-double v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 44
a=0;//     :cond_0
a=0;//     invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 46
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 34
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/beans/ViewPager;->startXLoadtion:F
a=0;// 
a=0;//     .line 35
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/beans/ViewPager;->startYLocation:F
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 46
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(DoubleHi);v2=(DoubleLo);v3=(DoubleHi);v4=(DoubleLo);v5=(DoubleHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 32
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 1
a=0;//     .param p1, "arg0"    # I
a=0;//     .param p2, "arg1"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     invoke-super {p0, p1, p2}, Landroid/support/v4/view/ViewPager;->onMeasure(II)V
a=0;// 
a=0;//     .line 55
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/beans/ViewPager;->specWidth:I
a=0;// 
a=0;//     .line 56
a=0;//     invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/beans/ViewPager;->specHeight:I
a=0;// 
a=0;//     .line 57
a=0;//     return-void
a=0;// .end method
}}
