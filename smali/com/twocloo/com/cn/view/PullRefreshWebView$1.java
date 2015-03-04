package com.twocloo.com.cn.view; class PullRefreshWebView$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/view/PullRefreshWebView$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "PullRefreshWebView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/view/PullRefreshWebView;
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
a=0;//         "Lcom/twocloo/com/cn/beans/WebView;",
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
a=0;//     .line 18
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 1
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/PullRefreshWebView$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onRefresh(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;)V
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/handmark/pulltorefresh/library/PullToRefreshBase",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/WebView;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     .local p1, "refreshView":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<Lcom/twocloo/com/cn/beans/WebView;>;"
a=0;//     sget-object v0, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 22
a=0;//     invoke-virtual {p1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->onRefreshComplete()V
a=0;// 
a=0;//     .line 23
a=0;//     invoke-virtual {p1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {p1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 24
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 23
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 24
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 28
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 26
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Uninit);
a=0;//     invoke-virtual {p1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getRefreshableView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/WebView;->reload()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
