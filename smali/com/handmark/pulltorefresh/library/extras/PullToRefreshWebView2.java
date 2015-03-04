package com.handmark.pulltorefresh.library.extras; class PullToRefreshWebView2 { void a() { int a;
a=0;// .class public Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;
a=0;// .super Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;
a=0;// .source "PullToRefreshWebView2.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2$JsValueCallback;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final DEF_JS_READY_PULL_DOWN_CALL:Ljava/lang/String; = "javascript:isReadyForPullDown();"
a=0;// 
a=0;// .field static final DEF_JS_READY_PULL_UP_CALL:Ljava/lang/String; = "javascript:isReadyForPullUp();"
a=0;// 
a=0;// .field static final JS_INTERFACE_PKG:Ljava/lang/String; = "ptr"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mIsReadyForPullDown:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;// .field private final mIsReadyForPullUp:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;// .field private mJsCallback:Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2$JsValueCallback;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 69
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1}, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 81
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;);
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;->mIsReadyForPullDown:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     .line 82
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;->mIsReadyForPullUp:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     .line 70
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 73
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 81
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;);
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;->mIsReadyForPullDown:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     .line 82
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;->mIsReadyForPullUp:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     .line 74
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .local p2, "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 77
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;-><init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V
a=0;// 
a=0;//     .line 81
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;);
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;->mIsReadyForPullDown:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     .line 82
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;->mIsReadyForPullUp:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     .line 78
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;)Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;->mIsReadyForPullUp:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;)Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;->mIsReadyForPullDown:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected createRefreshableView(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/webkit/WebView;
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     invoke-super {p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->createRefreshableView(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/webkit/WebView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 89
a=0;//     .local v0, "webView":Landroid/webkit/WebView;
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     new-instance v1, Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2$JsValueCallback;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2$JsValueCallback;);
a=0;//     invoke-direct {v1, p0}, Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2$JsValueCallback;-><init>(Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2$JsValueCallback;);
a=0;//     iput-object v1, p0, Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;->mJsCallback:Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2$JsValueCallback;
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;->mJsCallback:Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2$JsValueCallback;
a=0;// 
a=0;//     const-string v2, "ptr"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 92
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected isReadyForPullEnd()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;->getRefreshableView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/webkit/WebView;
a=0;// 
a=0;//     const-string v1, "javascript:isReadyForPullUp();"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;->mIsReadyForPullUp:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected isReadyForPullStart()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;->getRefreshableView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/webkit/WebView;
a=0;// 
a=0;//     const-string v1, "javascript:isReadyForPullDown();"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;->mIsReadyForPullDown:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
