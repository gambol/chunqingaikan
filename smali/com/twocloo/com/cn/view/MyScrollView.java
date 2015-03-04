package com.twocloo.com.cn.view; class MyScrollView { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/view/MyScrollView;
a=0;// .super Landroid/widget/ScrollView;
a=0;// .source "MyScrollView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/view/MyScrollView$YScrollDetector;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mGestureDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;// .field mGestureListener:Landroid/view/View$OnTouchListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 20
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/MyScrollView;);
a=0;//     new-instance v0, Landroid/view/GestureDetector;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/GestureDetector;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/view/MyScrollView$YScrollDetector;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/view/MyScrollView$YScrollDetector;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/view/MyScrollView$YScrollDetector;-><init>(Lcom/twocloo/com/cn/view/MyScrollView;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/MyScrollView$YScrollDetector;);
a=0;//     invoke-direct {v0, v1}, Landroid/view/GestureDetector;-><init>(Landroid/view/GestureDetector$OnGestureListener;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/MyScrollView;->mGestureDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;//     .line 21
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/view/MyScrollView;->setFadingEdgeLength(I)V
a=0;// 
a=0;//     .line 22
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     invoke-super {p0, p1}, Landroid/widget/ScrollView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/MyScrollView;->mGestureDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector;);
a=0;//     invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
