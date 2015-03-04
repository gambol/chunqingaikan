package com.twocloo.com.cn.beans; class WheelView$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/beans/WheelView$2;
a=0;// .super Landroid/os/Handler;
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
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/beans/WheelView$2;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     .line 924
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/beans/WheelView$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 4
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 926
a=0;//     #v3=(One);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelView$2;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/beans/WheelView;->access$1(Lcom/twocloo/com/cn/beans/WheelView;)Landroid/widget/Scroller;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/Scroller;->computeScrollOffset()Z
a=0;// 
a=0;//     .line 927
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelView$2;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/beans/WheelView;->access$1(Lcom/twocloo/com/cn/beans/WheelView;)Landroid/widget/Scroller;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/Scroller;->getCurrY()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 928
a=0;//     .local v0, "currY":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelView$2;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/beans/WheelView;->access$10(Lcom/twocloo/com/cn/beans/WheelView;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int v1, v2, v0
a=0;// 
a=0;//     .line 929
a=0;//     .local v1, "delta":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelView$2;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     invoke-static {v2, v0}, Lcom/twocloo/com/cn/beans/WheelView;->access$8(Lcom/twocloo/com/cn/beans/WheelView;I)V
a=0;// 
a=0;//     .line 930
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 931
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelView$2;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     invoke-static {v2, v1}, Lcom/twocloo/com/cn/beans/WheelView;->access$4(Lcom/twocloo/com/cn/beans/WheelView;I)V
a=0;// 
a=0;//     .line 936
a=0;//     :cond_0
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelView$2;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/beans/WheelView;->access$1(Lcom/twocloo/com/cn/beans/WheelView;)Landroid/widget/Scroller;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/Scroller;->getFinalY()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int v2, v0, v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-ge v2, v3, :cond_1
a=0;// 
a=0;//     .line 937
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelView$2;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/beans/WheelView;->access$1(Lcom/twocloo/com/cn/beans/WheelView;)Landroid/widget/Scroller;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/Scroller;->getFinalY()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 938
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelView$2;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/beans/WheelView;->access$1(Lcom/twocloo/com/cn/beans/WheelView;)Landroid/widget/Scroller;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/Scroller;->forceFinished(Z)V
a=0;// 
a=0;//     .line 940
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelView$2;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/beans/WheelView;->access$1(Lcom/twocloo/com/cn/beans/WheelView;)Landroid/widget/Scroller;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/Scroller;->isFinished()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 941
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelView$2;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/beans/WheelView;->access$12(Lcom/twocloo/com/cn/beans/WheelView;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v3, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 947
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 942
a=0;//     :cond_2
a=0;//     #v2=(Boolean);v3=(One);
a=0;//     iget v2, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 943
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelView$2;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/beans/WheelView;->access$13(Lcom/twocloo/com/cn/beans/WheelView;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 945
a=0;//     :cond_3
a=0;//     #v2=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelView$2;->this$0:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/WheelView;->finishScrolling()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
