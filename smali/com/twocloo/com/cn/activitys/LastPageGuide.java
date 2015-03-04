package com.twocloo.com.cn.activitys; class LastPageGuide { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/LastPageGuide;
a=0;// .super Landroid/app/Activity;
a=0;// .source "LastPageGuide.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private TAG:Ljava/lang/String;
a=0;// 
a=0;// .field private mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;// .field private netWorkLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private retryBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private url:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 40
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/LastPageGuide;);
a=0;//     const-string v0, "LastPageGuide"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/LastPageGuide;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 33
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/LastPageGuide;)Landroid/app/ProgressDialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/LastPageGuide;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/LastPageGuide;Landroid/app/ProgressDialog;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/LastPageGuide;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/activitys/LastPageGuide;)Landroid/webkit/WebView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/LastPageGuide;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/activitys/LastPageGuide;)Landroid/widget/RelativeLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/LastPageGuide;->netWorkLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/activitys/LastPageGuide;)Landroid/widget/Button;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/LastPageGuide;->retryBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/twocloo/com/cn/activitys/LastPageGuide;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 130
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/LastPageGuide;->loadData()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private loadData()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/LastPageGuide;->netWorkLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v0}, Landroid/widget/RelativeLayout;->isShown()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 132
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/LastPageGuide;->netWorkLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 134
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/LastPageGuide;->url:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/util/StringUtils;->isNotBlank(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 135
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/LastPageGuide;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V
a=0;// 
a=0;//     .line 136
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/LastPageGuide;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LastPageGuide;->url:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 137
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 0
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 165
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 13
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v12, 0x1
a=0;// 
a=0;//     .line 44
a=0;//     #v12=(One);
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 45
a=0;//     invoke-virtual {p0, v12}, Lcom/twocloo/com/cn/activitys/LastPageGuide;->requestWindowFeature(I)Z
a=0;// 
a=0;//     .line 46
a=0;//     sget v8, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     sget v9, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {p0, v8, v9}, Lcom/twocloo/com/cn/activitys/LastPageGuide;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 47
a=0;//     sget v8, Lcom/twocloo/com/cn/R$layout;->lastpageguide:I
a=0;// 
a=0;//     invoke-virtual {p0, v8}, Lcom/twocloo/com/cn/activitys/LastPageGuide;->setContentView(I)V
a=0;// 
a=0;//     .line 48
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->add(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 50
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/LastPageGuide;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/content/Intent;);
a=0;//     const-string v9, "aid"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 51
a=0;//     .local v0, "aid":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/LastPageGuide;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "bounds"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 52
a=0;//     .local v1, "bounds":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/LastPageGuide;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     sget v9, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 53
a=0;//     .local v5, "src":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "android"
a=0;// 
a=0;//     .line 54
a=0;//     .local v2, "ct":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/LastPageGuide;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     sget v9, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 55
a=0;//     .local v4, "pt":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 56
a=0;//     .local v3, "imei":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 57
a=0;//     .local v6, "v":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "http://app.2cloo.com/user-rec_article_after_reading?articleid=%s&send_bonus=%s&srcid=%s&ct=%s&pt=%s&imei=%s&v=%s"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const/4 v10, 0x7
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     new-array v10, v10, [Ljava/lang/Object;
a=0;// 
a=0;//     #v10=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     aput-object v0, v10, v11
a=0;// 
a=0;//     aput-object v1, v10, v12
a=0;// 
a=0;//     const/4 v11, 0x2
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     aput-object v5, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x3
a=0;// 
a=0;//     aput-object v2, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x4
a=0;// 
a=0;//     aput-object v4, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x5
a=0;// 
a=0;//     aput-object v3, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x6
a=0;// 
a=0;//     aput-object v6, v10, v11
a=0;// 
a=0;//     invoke-static {v9, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iput-object v8, p0, Lcom/twocloo/com/cn/activitys/LastPageGuide;->url:Ljava/lang/String;
a=0;// 
a=0;//     .line 60
a=0;//     sget v8, Lcom/twocloo/com/cn/R$id;->webview:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {p0, v8}, Lcom/twocloo/com/cn/activitys/LastPageGuide;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     check-cast v8, Landroid/webkit/WebView;
a=0;// 
a=0;//     iput-object v8, p0, Lcom/twocloo/com/cn/activitys/LastPageGuide;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     .line 61
a=0;//     sget v8, Lcom/twocloo/com/cn/R$id;->l_network_unvaliable:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {p0, v8}, Lcom/twocloo/com/cn/activitys/LastPageGuide;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     check-cast v8, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v8, p0, Lcom/twocloo/com/cn/activitys/LastPageGuide;->netWorkLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 62
a=0;//     sget v8, Lcom/twocloo/com/cn/R$id;->retry:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {p0, v8}, Lcom/twocloo/com/cn/activitys/LastPageGuide;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     check-cast v8, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v8, p0, Lcom/twocloo/com/cn/activitys/LastPageGuide;->retryBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/LastPageGuide;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 66
a=0;//     .local v7, "ws":Landroid/webkit/WebSettings;
a=0;//     #v7=(Reference,Landroid/webkit/WebSettings;);
a=0;//     invoke-virtual {v7, v12}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
a=0;// 
a=0;//     .line 67
a=0;//     invoke-virtual {v7, v12}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V
a=0;// 
a=0;//     .line 68
a=0;//     invoke-virtual {v7, v12}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V
a=0;// 
a=0;//     .line 69
a=0;//     invoke-virtual {v7, v12}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V
a=0;// 
a=0;//     .line 71
a=0;//     sget-object v8, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     .line 72
a=0;//     invoke-virtual {v7, v12}, Landroid/webkit/WebSettings;->setCacheMode(I)V
a=0;// 
a=0;//     .line 79
a=0;//     :goto_0
a=0;//     #v8=(Byte);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/LastPageGuide;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v8=(Reference,Landroid/webkit/WebView;);
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/activitys/LastPageGuide;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-static {p0, v9}, Lcom/twocloo/com/cn/common/JavaScript;->newInstance(Landroid/app/Activity;Landroid/webkit/WebView;)Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const-string v10, "twocloo"
a=0;// 
a=0;//     invoke-virtual {v8, v9, v10}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 81
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/LastPageGuide;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     new-instance v9, Lcom/twocloo/com/cn/activitys/LastPageGuide$1;
a=0;// 
a=0;//     #v9=(UninitRef,Lcom/twocloo/com/cn/activitys/LastPageGuide$1;);
a=0;//     invoke-direct {v9, p0}, Lcom/twocloo/com/cn/activitys/LastPageGuide$1;-><init>(Lcom/twocloo/com/cn/activitys/LastPageGuide;)V
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/activitys/LastPageGuide$1;);
a=0;//     invoke-virtual {v8, v9}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
a=0;// 
a=0;//     .line 120
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/LastPageGuide;->loadData()V
a=0;// 
a=0;//     .line 121
a=0;//     return-void
a=0;// 
a=0;//     .line 74
a=0;//     :cond_0
a=0;//     #v8=(Boolean);
a=0;//     const/4 v8, -0x1
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     invoke-virtual {v7, v8}, Landroid/webkit/WebSettings;->setCacheMode(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 157
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->remove(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 159
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 148
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 149
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/LastPageGuide;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageEnd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 150
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onPause(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 151
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/LastPageGuide;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 152
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 141
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/LastPageGuide;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageStart(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 142
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 143
a=0;//     sput-object p0, Lcom/twocloo/com/cn/common/CloseActivity;->curActivity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 144
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public retry(Landroid/view/View;)V
a=0;//     .locals 0
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/LastPageGuide;->loadData()V
a=0;// 
a=0;//     .line 125
a=0;//     return-void
a=0;// .end method
}}
