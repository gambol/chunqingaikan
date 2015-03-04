package com.handmark.pulltorefresh.library; class PullToRefreshWebView$2 { void a() { int a;
a=0;// .class Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$2;
a=0;// .super Landroid/webkit/WebChromeClient;
a=0;// .source "PullToRefreshWebView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$2;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;
a=0;// 
a=0;//     .line 39
a=0;//     invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onProgressChanged(Landroid/webkit/WebView;I)V
a=0;//     .locals 1
a=0;//     .param p1, "view"    # Landroid/webkit/WebView;
a=0;//     .param p2, "newProgress"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     const/16 v0, 0x64
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p2, v0, :cond_0
a=0;// 
a=0;//     .line 44
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$2;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->onRefreshComplete()V
a=0;// 
a=0;//     .line 46
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
