package com.twocloo.com.cn.fragment; class MainSlidingMenu { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/fragment/MainSlidingMenu;
a=0;// .super Landroid/support/v4/app/Fragment;
a=0;// .source "MainSlidingMenu.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;// .field private menuNetworkLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private retrybtn:Landroid/widget/Button;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/MainSlidingMenu;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/fragment/MainSlidingMenu;)Landroid/widget/RelativeLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/MainSlidingMenu;->menuNetworkLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/fragment/MainSlidingMenu;)Landroid/widget/Button;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/MainSlidingMenu;->retrybtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/fragment/MainSlidingMenu;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/fragment/MainSlidingMenu;->loadData()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private loadData()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/MainSlidingMenu;->menuNetworkLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v7}, Landroid/widget/RelativeLayout;->isShown()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     .line 84
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/MainSlidingMenu;->menuNetworkLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     const/16 v8, 0x8
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-virtual {v7, v8}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 86
a=0;//     :cond_0
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/MainSlidingMenu;->mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v7, v8}, Lcom/twocloo/com/cn/beans/WebView;->setVisibility(I)V
a=0;// 
a=0;//     .line 88
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 89
a=0;//     .local v5, "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 90
a=0;//     .local v4, "url":Ljava/lang/String;
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/MainSlidingMenu;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 91
a=0;//     .local v0, "apptype":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "android"
a=0;// 
a=0;//     .line 92
a=0;//     .local v1, "ct":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 93
a=0;//     .local v6, "v":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/MainSlidingMenu;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 94
a=0;//     .local v2, "imei":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/MainSlidingMenu;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 103
a=0;//     .local v3, "srcid":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/MainSlidingMenu;->mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     invoke-virtual {v7, v4}, Lcom/twocloo/com/cn/beans/WebView;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 104
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onActivityCreated(Landroid/os/Bundle;)V
a=0;//     .locals 3
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 43
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/MainSlidingMenu;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->menu_network_unvaliable:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/MainSlidingMenu;->menuNetworkLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 44
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/MainSlidingMenu;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->main_sliding_menu_webview:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/MainSlidingMenu;->mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     .line 45
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/MainSlidingMenu;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->retry:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/MainSlidingMenu;->retrybtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 49
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/MainSlidingMenu;->mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/MainSlidingMenu;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/MainSlidingMenu;->mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     invoke-static {v1, v2}, Lcom/twocloo/com/cn/common/JavaScript;->newInstance(Landroid/app/Activity;Landroid/webkit/WebView;)Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "twocloo"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/twocloo/com/cn/beans/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/MainSlidingMenu;->mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/fragment/MainSlidingMenu$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/fragment/MainSlidingMenu$1;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/fragment/MainSlidingMenu$1;-><init>(Lcom/twocloo/com/cn/fragment/MainSlidingMenu;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/MainSlidingMenu$1;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/WebView;->setonReceiveErrorCallBack(Lcom/twocloo/com/cn/singlebook/DataCallBack;)V
a=0;// 
a=0;//     .line 63
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/MainSlidingMenu;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 64
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/MainSlidingMenu;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v0, v1, v2}, Lcom/twocloo/com/cn/common/LocalStore;->setSlidingMenuTime(Landroid/content/Context;J)V
a=0;// 
a=0;//     .line 65
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/fragment/MainSlidingMenu;->loadData()V
a=0;// 
a=0;//     .line 66
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
a=0;//     .locals 2
a=0;//     .param p1, "inflater"    # Landroid/view/LayoutInflater;
a=0;//     .param p2, "container"    # Landroid/view/ViewGroup;
a=0;//     .param p3, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->main_sliding_menu_content:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onResume()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V
a=0;// 
a=0;//     .line 80
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStart()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V
a=0;// 
a=0;//     .line 73
a=0;//     return-void
a=0;// .end method
}}
