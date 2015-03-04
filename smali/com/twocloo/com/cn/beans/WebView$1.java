package com.twocloo.com.cn.beans; class WebView$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/beans/WebView$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "WebView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/beans/WebView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/beans/WebView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/beans/WebView$1;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     .line 47
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/beans/WebView$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 2
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WebView$1;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/beans/WebView;->access$0(Lcom/twocloo/com/cn/beans/WebView;)Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 51
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WebView$1;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/beans/WebView;->access$0(Lcom/twocloo/com/cn/beans/WebView;)Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/singlebook/DataCallBack;->callBack(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 56
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 52
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(One);
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WebView$1;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/WebView;->stopLoading()V
a=0;// 
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WebView$1;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/WebView;->clearView()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
