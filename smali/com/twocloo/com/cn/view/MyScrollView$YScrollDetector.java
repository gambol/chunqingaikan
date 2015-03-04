package com.twocloo.com.cn.view; class MyScrollView$YScrollDetector { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/view/MyScrollView$YScrollDetector;
a=0;// .super Landroid/view/GestureDetector$SimpleOnGestureListener;
a=0;// .source "MyScrollView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/view/MyScrollView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "YScrollDetector"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/view/MyScrollView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/view/MyScrollView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/MyScrollView$YScrollDetector;->this$0:Lcom/twocloo/com/cn/view/MyScrollView;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/MyScrollView$YScrollDetector;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
a=0;//     .locals 2
a=0;//     .param p1, "e1"    # Landroid/view/MotionEvent;
a=0;//     .param p2, "e2"    # Landroid/view/MotionEvent;
a=0;//     .param p3, "distanceX"    # F
a=0;//     .param p4, "distanceY"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     invoke-static {p4}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-static {p3}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     cmpl-float v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 33
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 35
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
