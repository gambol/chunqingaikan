package com.twocloo.com.cn.beans; class WheelView$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/beans/WheelView$1;
a=0;// .super Landroid/view/GestureDetector$SimpleOnGestureListener;
a=0;// .source "WheelView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/beans/WheelView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/beans/WheelView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/beans/WheelView$1;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     .line 870
a=0;//     invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/beans/WheelView$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onDown(Landroid/view/MotionEvent;)Z
a=0;//     .locals 2
a=0;//     .param p1, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 872
a=0;//     #v0=(One);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView$1;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/beans/WheelView;->access$0(Lcom/twocloo/com/cn/beans/WheelView;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 873
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView$1;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/beans/WheelView;->access$1(Lcom/twocloo/com/cn/beans/WheelView;)Landroid/widget/Scroller;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/Scroller;->forceFinished(Z)V
a=0;// 
a=0;//     .line 874
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView$1;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/beans/WheelView;->access$2(Lcom/twocloo/com/cn/beans/WheelView;)V
a=0;// 
a=0;//     .line 877
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);v1=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
a=0;//     .locals 9
a=0;//     .param p1, "e1"    # Landroid/view/MotionEvent;
a=0;//     .param p2, "e2"    # Landroid/view/MotionEvent;
a=0;//     .param p3, "velocityX"    # F
a=0;//     .param p4, "velocityY"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 889
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView$1;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelView$1;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/beans/WheelView;->access$5(Lcom/twocloo/com/cn/beans/WheelView;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/beans/WheelView$1;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/beans/WheelView;->access$6(Lcom/twocloo/com/cn/beans/WheelView;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-int/2addr v2, v3
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/beans/WheelView$1;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/beans/WheelView;->access$7(Lcom/twocloo/com/cn/beans/WheelView;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/twocloo/com/cn/beans/WheelView;->access$8(Lcom/twocloo/com/cn/beans/WheelView;I)V
a=0;// 
a=0;//     .line 890
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView$1;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/twocloo/com/cn/beans/WheelView;->isCyclic:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const v8, 0x7fffffff
a=0;// 
a=0;//     .line 892
a=0;//     .local v8, "maxY":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v8=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView$1;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     iget-boolean v0, v0, Lcom/twocloo/com/cn/beans/WheelView;->isCyclic:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     neg-int v7, v8
a=0;// 
a=0;//     .line 893
a=0;//     .local v7, "minY":I
a=0;//     :goto_1
a=0;//     #v7=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView$1;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/beans/WheelView;->access$1(Lcom/twocloo/com/cn/beans/WheelView;)Landroid/widget/Scroller;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelView$1;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/beans/WheelView;->access$10(Lcom/twocloo/com/cn/beans/WheelView;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     neg-float v3, p4
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     div-int/lit8 v4, v3, 0x2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v3, v1
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move v5, v1
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move v6, v1
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V
a=0;// 
a=0;//     .line 895
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView$1;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/beans/WheelView;->access$11(Lcom/twocloo/com/cn/beans/WheelView;I)V
a=0;// 
a=0;//     .line 896
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// 
a=0;//     .line 890
a=0;//     .end local v7    # "minY":I
a=0;//     .end local v8    # "maxY":I
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v3=(Integer);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView$1;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/beans/WheelView;->access$9(Lcom/twocloo/com/cn/beans/WheelView;)Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/twocloo/com/cn/adapters/WheelAdapter;->getItemsCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 891
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelView$1;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/beans/WheelView;->access$6(Lcom/twocloo/com/cn/beans/WheelView;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-int v8, v0, v2
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v8    # "maxY":I
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     move v7, v1
a=0;// 
a=0;//     .line 892
a=0;//     #v7=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
a=0;//     .locals 2
a=0;//     .param p1, "e1"    # Landroid/view/MotionEvent;
a=0;//     .param p2, "e2"    # Landroid/view/MotionEvent;
a=0;//     .param p3, "distanceX"    # F
a=0;//     .param p4, "distanceY"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 882
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView$1;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/beans/WheelView;->access$3(Lcom/twocloo/com/cn/beans/WheelView;)V
a=0;// 
a=0;//     .line 883
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView$1;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     neg-float v1, p4
a=0;// 
a=0;//     #v1=(Float);
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/beans/WheelView;->access$4(Lcom/twocloo/com/cn/beans/WheelView;I)V
a=0;// 
a=0;//     .line 884
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
}}
