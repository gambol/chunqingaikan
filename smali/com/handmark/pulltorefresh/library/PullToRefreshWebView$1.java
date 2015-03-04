package com.handmark.pulltorefresh.library; class PullToRefreshWebView$1 { void a() { int a;
a=0;// .class Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "PullToRefreshWebView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;
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
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener",
a=0;//         "<",
a=0;//         "Landroid/webkit/WebView;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 1
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onRefresh(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/handmark/pulltorefresh/library/PullToRefreshBase",
a=0;//             "<",
a=0;//             "Landroid/webkit/WebView;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     .local p1, "refreshView":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<Landroid/webkit/WebView;>;"
a=0;//     invoke-virtual {p1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getRefreshableView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->reload()V
a=0;// 
a=0;//     .line 35
a=0;//     return-void
a=0;// .end method
}}
