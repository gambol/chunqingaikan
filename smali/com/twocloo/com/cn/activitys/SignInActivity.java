package com.twocloo.com.cn.activitys; class SignInActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/SignInActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "SignInActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final TAG:Ljava/lang/String; = "SignInActivity"
a=0;// 
a=0;// .field public static isFromSign:Z
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field backcount:I
a=0;// 
a=0;// .field private goBack:Landroid/widget/ImageButton;
a=0;// 
a=0;// .field private isReload:Z
a=0;// 
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private signWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;// .field private sign_network_unvaliable:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private titleTv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private titlebglayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcom/twocloo/com/cn/activitys/SignInActivity;->isFromSign:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 32
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/SignInActivity;);
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 37
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->isReload:Z
a=0;// 
a=0;//     .line 28
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/SignInActivity;)Landroid/widget/RelativeLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->sign_network_unvaliable:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/SignInActivity;)Lcom/twocloo/com/cn/beans/WebView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->signWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private goBack()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 140
a=0;//     #v2=(Null);
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->isReload:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 141
a=0;//     sget-boolean v0, Lcom/twocloo/com/cn/activitys/SignInActivity;->isFromSign:Z
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 142
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->backcount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->backcount:I
a=0;// 
a=0;//     .line 143
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SignInActivity;->loadData()V
a=0;// 
a=0;//     .line 144
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->signWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/WebView;->goBack()V
a=0;// 
a=0;//     .line 145
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->backcount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 146
a=0;//     sput-boolean v2, Lcom/twocloo/com/cn/activitys/SignInActivity;->isFromSign:Z
a=0;// 
a=0;//     .line 147
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SignInActivity;->finish()V
a=0;// 
a=0;//     .line 156
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 150
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     sput-boolean v2, Lcom/twocloo/com/cn/activitys/SignInActivity;->isFromSign:Z
a=0;// 
a=0;//     .line 151
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SignInActivity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 154
a=0;//     :cond_2
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SignInActivity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private initView()V
a=0;//     .locals 4
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "ResourceAsColor"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->title_layout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/SignInActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->titlebglayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 85
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->sign_webview:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/SignInActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->signWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     .line 86
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->sign_network_unvaliable:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/SignInActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->sign_network_unvaliable:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 87
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->back:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/SignInActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/ImageButton;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->goBack:Landroid/widget/ImageButton;
a=0;// 
a=0;//     .line 88
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->topbar:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/SignInActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->titleTv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->titleTv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SignInActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->usercenter_text:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->titleTv:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v2, "\u7b7e\u5230"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 92
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SignInActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/LocalStore;->getTopBackgroundColor(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 93
a=0;//     .local v0, "color":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->titlebglayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 94
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->goBack:Landroid/widget/ImageButton;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setVisibility(I)V
a=0;// 
a=0;//     .line 95
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->goBack:Landroid/widget/ImageButton;
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 96
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->sign_network_unvaliable:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 97
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public loadData()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/SignInActivity$2;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/SignInActivity$2;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/SignInActivity$2;-><init>(Lcom/twocloo/com/cn/activitys/SignInActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/SignInActivity$2;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 125
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 160
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 161
a=0;//     .local v0, "id":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->goBack:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v1}, Landroid/widget/ImageButton;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 162
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->signWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/WebView;->canGoBack()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 163
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/SignInActivity;->goBack()V
a=0;// 
a=0;//     .line 170
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 165
a=0;//     :cond_1
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SignInActivity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 166
a=0;//     :cond_2
a=0;//     #v1=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->sign_network_unvaliable:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 167
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->isReload:Z
a=0;// 
a=0;//     .line 168
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SignInActivity;->loadData()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 3
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 42
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/SignInActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 43
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->sign_in_layout:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SignInActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 44
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/SignInActivity;->initView()V
a=0;// 
a=0;//     .line 45
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->signWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->signWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/com/cn/common/JavaScript;->newInstance(Landroid/app/Activity;Landroid/webkit/WebView;)Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "twocloo"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/twocloo/com/cn/beans/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 46
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->signWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/SignInActivity$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/SignInActivity$1;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/SignInActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/SignInActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/SignInActivity$1;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/WebView;->setonReceiveErrorCallBack(Lcom/twocloo/com/cn/singlebook/DataCallBack;)V
a=0;// 
a=0;//     .line 52
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SignInActivity;->loadData()V
a=0;// 
a=0;//     .line 53
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 80
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 129
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->signWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/WebView;->canGoBack()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 130
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/SignInActivity;->goBack()V
a=0;// 
a=0;//     .line 131
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 133
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 70
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/SignInActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 71
a=0;//     const-string v0, "SignInActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageEnd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 72
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onPause(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 73
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->sign_network_unvaliable:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 60
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->signWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SignInActivity;->titlebglayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 62
a=0;//     const-string v0, "SignInActivity"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageStart(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 63
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 64
a=0;//     return-void
a=0;// .end method
}}
