package com.handmark.pulltorefresh.library; class PullToRefreshWebView { void a() { int a;
a=0;// .class public Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;
a=0;// .super Lcom/handmark/pulltorefresh/library/PullToRefreshBase;
a=0;// .source "PullToRefreshWebView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$InternalWebViewSDK9;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/handmark/pulltorefresh/library/PullToRefreshBase",
a=0;//         "<",
a=0;//         "Landroid/webkit/WebView;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final defaultOnRefreshListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener",
a=0;//             "<",
a=0;//             "Landroid/webkit/WebView;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final defaultWebChromeClient:Landroid/webkit/WebChromeClient;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$1;);
a=0;//     invoke-direct {v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$1;);
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->defaultOnRefreshListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     invoke-direct {p0, p1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 39
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;);
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$2;);
a=0;//     invoke-direct {v0, p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$2;-><init>(Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$2;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->defaultWebChromeClient:Landroid/webkit/WebChromeClient;
a=0;// 
a=0;//     .line 56
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->defaultOnRefreshListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->setOnRefreshListener(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;)V
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     check-cast v0, Landroid/webkit/WebView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->defaultWebChromeClient:Landroid/webkit/WebChromeClient;
a=0;// 
a=0;//     #v1=(Reference,Landroid/webkit/WebChromeClient;);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
a=0;// 
a=0;//     .line 58
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     invoke-direct {p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 39
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;);
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$2;);
a=0;//     invoke-direct {v0, p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$2;-><init>(Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$2;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->defaultWebChromeClient:Landroid/webkit/WebChromeClient;
a=0;// 
a=0;//     .line 66
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->defaultOnRefreshListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->setOnRefreshListener(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;)V
a=0;// 
a=0;//     .line 67
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     check-cast v0, Landroid/webkit/WebView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->defaultWebChromeClient:Landroid/webkit/WebChromeClient;
a=0;// 
a=0;//     #v1=(Reference,Landroid/webkit/WebChromeClient;);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
a=0;// 
a=0;//     .line 68
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     .local p2, "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     invoke-direct {p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;-><init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V
a=0;// 
a=0;//     .line 39
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;);
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$2;);
a=0;//     invoke-direct {v0, p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$2;-><init>(Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$2;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->defaultWebChromeClient:Landroid/webkit/WebChromeClient;
a=0;// 
a=0;//     .line 76
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->defaultOnRefreshListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->setOnRefreshListener(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;)V
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     check-cast v0, Landroid/webkit/WebView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->defaultWebChromeClient:Landroid/webkit/WebChromeClient;
a=0;// 
a=0;//     #v1=(Reference,Landroid/webkit/WebChromeClient;);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
a=0;// 
a=0;//     .line 78
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     .local p2, "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     .local p3, "style":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;"
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;-><init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;)V
a=0;// 
a=0;//     .line 39
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;);
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$2;);
a=0;//     invoke-direct {v0, p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$2;-><init>(Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$2;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->defaultWebChromeClient:Landroid/webkit/WebChromeClient;
a=0;// 
a=0;//     .line 86
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->defaultOnRefreshListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->setOnRefreshListener(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;)V
a=0;// 
a=0;//     .line 87
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     check-cast v0, Landroid/webkit/WebView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->defaultWebChromeClient:Landroid/webkit/WebChromeClient;
a=0;// 
a=0;//     #v1=(Reference,Landroid/webkit/WebChromeClient;);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
a=0;// 
a=0;//     .line 88
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected bridge synthetic createRefreshableView(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->createRefreshableView(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/webkit/WebView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected createRefreshableView(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/webkit/WebView;
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x9
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     .line 99
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$InternalWebViewSDK9;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$InternalWebViewSDK9;);
a=0;//     invoke-direct {v0, p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$InternalWebViewSDK9;-><init>(Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 104
a=0;//     .local v0, "webView":Landroid/webkit/WebView;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     sget v1, Lcom/handmark/pulltorefresh/library/R$id;->webview:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setId(I)V
a=0;// 
a=0;//     .line 105
a=0;//     return-object v0
a=0;// 
a=0;//     .line 101
a=0;//     .end local v0    # "webView":Landroid/webkit/WebView;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     new-instance v0, Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/webkit/WebView;);
a=0;//     invoke-direct {v0, p1, p2}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .restart local v0    # "webView":Landroid/webkit/WebView;
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final getPullToRefreshScrollDirection()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->VERTICAL:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected isReadyForPullEnd()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/webkit/WebView;->getContentHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v2, v1
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/webkit/WebView;->getScale()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     mul-float/2addr v1, v2
a=0;// 
a=0;//     invoke-static {v1}, Landroid/util/FloatMath;->floor(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 116
a=0;//     .local v0, "exactContentHeight":F
a=0;//     #v0=(Float);
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/webkit/WebView;->getScrollY()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v2, v1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/webkit/WebView;->getHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     sub-float v1, v0, v1
a=0;// 
a=0;//     cmpl-float v1, v2, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ltz v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Byte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected isReadyForPullStart()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->getScrollY()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onPtrRestoreInstanceState(Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     invoke-super {p0, p1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->onPtrRestoreInstanceState(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/webkit/WebView;->restoreState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;
a=0;// 
a=0;//     .line 123
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPtrSaveInstanceState(Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;//     .param p1, "saveState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     invoke-super {p0, p1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->onPtrSaveInstanceState(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/webkit/WebView;->saveState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;
a=0;// 
a=0;//     .line 129
a=0;//     return-void
a=0;// .end method
}}
