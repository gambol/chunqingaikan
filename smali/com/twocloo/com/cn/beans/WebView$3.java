package com.twocloo.com.cn.beans; class WebView$3 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/beans/WebView$3;
a=0;// .super Landroid/webkit/WebChromeClient;
a=0;// .source "WebView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/beans/WebView;->init(Landroid/content/Context;)V
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
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/beans/WebView$3;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     .line 145
a=0;//     invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/beans/WebView$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onProgressChanged(Landroid/webkit/WebView;I)V
a=0;//     .locals 2
a=0;//     .param p1, "view"    # Landroid/webkit/WebView;
a=0;//     .param p2, "newProgress"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 148
a=0;//     invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V
a=0;// 
a=0;//     .line 149
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WebView$3;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/WebView;->getProgress()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x64
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 150
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WebView$3;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/beans/WebView;->access$1(Lcom/twocloo/com/cn/beans/WebView;)Lcom/twocloo/com/cn/view/PullRefreshWebView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 151
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WebView$3;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/beans/WebView;->access$1(Lcom/twocloo/com/cn/beans/WebView;)Lcom/twocloo/com/cn/view/PullRefreshWebView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/view/PullRefreshWebView;->onRefreshComplete()V
a=0;// 
a=0;//     .line 153
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WebView$3;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/beans/WebView;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WebView$3;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/beans/WebView;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 154
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WebView$3;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/beans/WebView;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->cancel()V
a=0;// 
a=0;//     .line 155
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WebView$3;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, v0, Lcom/twocloo/com/cn/beans/WebView;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 158
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(PosByte);
a=0;//     return-void
a=0;// .end method
}}
