package com.twocloo.com.cn.beans; class WebView { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/beans/WebView;
a=0;// .super Landroid/webkit/WebView;
a=0;// .source "WebView.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final MAX_Y_OVERSCROLL_DISTANCE:I = 0xc8
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private contain:Lcom/twocloo/com/cn/view/PullRefreshWebView;
a=0;// 
a=0;// .field private context:Landroid/content/Context;
a=0;// 
a=0;// .field private dataCallBack:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;// .field handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private loadCache:Z
a=0;// 
a=0;// .field private mMaxYOverscrollDistance:I
a=0;// 
a=0;// .field public pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field protected timeout:I
a=0;// 
a=0;// .field protected timer:Ljava/util/Timer;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 23
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WebView;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 26
a=0;//     const/16 v0, 0x7530
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/beans/WebView;->timeout:I
a=0;// 
a=0;//     .line 47
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/WebView$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/WebView$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/beans/WebView$1;-><init>(Lcom/twocloo/com/cn/beans/WebView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WebView$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WebView;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 58
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/beans/WebView;->loadCache:Z
a=0;// 
a=0;//     .line 44
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/beans/WebView;->init(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 45
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     invoke-direct {p0, p1, p2}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 23
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WebView;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 26
a=0;//     const/16 v0, 0x7530
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/beans/WebView;->timeout:I
a=0;// 
a=0;//     .line 47
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/WebView$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/WebView$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/beans/WebView$1;-><init>(Lcom/twocloo/com/cn/beans/WebView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WebView$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WebView;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 58
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/beans/WebView;->loadCache:Z
a=0;// 
a=0;//     .line 39
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/beans/WebView;->init(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 23
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WebView;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 26
a=0;//     const/16 v0, 0x7530
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/beans/WebView;->timeout:I
a=0;// 
a=0;//     .line 47
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/WebView$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/WebView$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/beans/WebView$1;-><init>(Lcom/twocloo/com/cn/beans/WebView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WebView$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WebView;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 58
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/beans/WebView;->loadCache:Z
a=0;// 
a=0;//     .line 34
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/beans/WebView;->init(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 35
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/beans/WebView;)Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WebView;->dataCallBack:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/singlebook/DataCallBack;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/beans/WebView;)Lcom/twocloo/com/cn/view/PullRefreshWebView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WebView;->contain:Lcom/twocloo/com/cn/view/PullRefreshWebView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/PullRefreshWebView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private init(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 61
a=0;//     #v2=(One);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/beans/WebView;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 64
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebSettings;);
a=0;//     invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
a=0;// 
a=0;//     .line 65
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V
a=0;// 
a=0;//     .line 66
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V
a=0;// 
a=0;//     .line 67
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V
a=0;// 
a=0;//     .line 68
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setBlockNetworkImage(Z)V
a=0;// 
a=0;//     .line 69
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Landroid/webkit/WebSettings$RenderPriority;->HIGH:Landroid/webkit/WebSettings$RenderPriority;
a=0;// 
a=0;//     #v1=(Reference,Landroid/webkit/WebSettings$RenderPriority;);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setRenderPriority(Landroid/webkit/WebSettings$RenderPriority;)V
a=0;// 
a=0;//     .line 73
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V
a=0;// 
a=0;//     .line 75
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/WebView$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/WebView$2;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/twocloo/com/cn/beans/WebView$2;-><init>(Lcom/twocloo/com/cn/beans/WebView;Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WebView$2;);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/beans/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
a=0;// 
a=0;//     .line 145
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/WebView$3;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/WebView$3;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/beans/WebView$3;-><init>(Lcom/twocloo/com/cn/beans/WebView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WebView$3;);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/beans/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
a=0;// 
a=0;//     .line 160
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private initBounceListView()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 178
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WebView;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 180
a=0;//     .local v1, "metrics":Landroid/util/DisplayMetrics;
a=0;//     #v1=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     iget v0, v1, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     .line 182
a=0;//     .local v0, "density":F
a=0;//     #v0=(Integer);
a=0;//     const/high16 v2, 0x43480000    # 200.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-float/2addr v2, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/beans/WebView;->mMaxYOverscrollDistance:I
a=0;// 
a=0;//     .line 184
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public loadUrl(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 196
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/beans/WebView;->loadCache:Z
a=0;// 
a=0;//     .line 197
a=0;//     invoke-super {p0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 198
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public loadUrl(Ljava/lang/String;Z)V
a=0;//     .locals 2
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "loadCache"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 201
a=0;//     iput-boolean p2, p0, Lcom/twocloo/com/cn/beans/WebView;->loadCache:Z
a=0;// 
a=0;//     .line 205
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebSettings;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V
a=0;// 
a=0;//     .line 207
a=0;//     invoke-super {p0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 209
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setProgressDialog(Landroid/app/ProgressDialog;)V
a=0;//     .locals 0
a=0;//     .param p1, "pd"    # Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .prologue
a=0;//     .line 191
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/beans/WebView;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 192
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPullRefreshWebView(Lcom/twocloo/com/cn/view/PullRefreshWebView;)V
a=0;//     .locals 0
a=0;//     .param p1, "view"    # Lcom/twocloo/com/cn/view/PullRefreshWebView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 187
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/beans/WebView;->contain:Lcom/twocloo/com/cn/view/PullRefreshWebView;
a=0;// 
a=0;//     .line 188
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setonReceiveErrorCallBack(Lcom/twocloo/com/cn/singlebook/DataCallBack;)V
a=0;//     .locals 0
a=0;//     .param p1, "dataCallBack"    # Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/beans/WebView;->dataCallBack:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     .line 171
a=0;//     return-void
a=0;// .end method
}}
