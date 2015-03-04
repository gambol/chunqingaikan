package com.twocloo.com.cn.activitys; class BaoyueActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/BaoyueActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "BaoyueActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;// .field callback:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/twocloo/com/cn/singlebook/DataCallBack",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/SubResultBean;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private formaturl:Ljava/lang/String;
a=0;// 
a=0;// .field private final mPageName:Ljava/lang/String;
a=0;// 
a=0;// .field private mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;// .field private mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private networklayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private token:Ljava/lang/String;
a=0;// 
a=0;// .field private topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private uid:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/BaoyueActivity;);
a=0;//     const-string v0, "BaoyueActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->mPageName:Ljava/lang/String;
a=0;// 
a=0;//     .line 90
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/BaoyueActivity$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/BaoyueActivity$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/BaoyueActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/BaoyueActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaoyueActivity$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->callback:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     .line 29
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/BaoyueActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->loadData()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/BaoyueActivity;)Landroid/widget/RelativeLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->networklayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/activitys/BaoyueActivity;)Lcom/twocloo/com/cn/beans/WebView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private loadData()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->networklayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v0}, Landroid/widget/RelativeLayout;->isShown()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 79
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->networklayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 81
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->formaturl:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/util/StringUtils;->isNotBlank(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 82
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/WebView;->setVisibility(I)V
a=0;// 
a=0;//     .line 83
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->formaturl:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/WebView;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 84
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setTopBar()V
a=0;//     .locals 4
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "ResourceAsColor"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->topbar_layout:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 108
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->mainlayout:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 109
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->network_unvaliable:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->networklayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 110
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->webview:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     .line 111
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->back:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/ImageButton;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/ImageButton;->setVisibility(I)V
a=0;// 
a=0;//     .line 113
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->topbar:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 114
a=0;//     .local v1, "title_tv":Landroid/widget/TextView;
a=0;//     const-string v2, "\u5305\u6708\u7545\u8bfb"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 115
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
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
a=0;//     .line 116
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/common/LocalStore;->getTopBackgroundColor(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 117
a=0;//     .local v0, "color":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 119
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 122
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v1}, Landroid/widget/ImageButton;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 123
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->finish()V
a=0;// 
a=0;//     .line 125
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 6
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 41
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 43
a=0;//     sget v1, Lcom/twocloo/com/cn/R$layout;->baoyue_layout:I
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 44
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->add(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 46
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->setTopBar()V
a=0;// 
a=0;//     .line 47
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 48
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 49
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->token:Ljava/lang/String;
a=0;// 
a=0;//     .line 52
a=0;//     :cond_0
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 53
a=0;//     .local v0, "nightOrDay":I
a=0;//     #v0=(Integer);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "http://app.2cloo.com/user-buy_month_display?night=%s&userid=%s&token=%s"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->token:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->formaturl:Ljava/lang/String;
a=0;// 
a=0;//     .line 54
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->callback:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     invoke-static {p0, v2, v3}, Lcom/twocloo/com/cn/common/JavaScript;->newInstance(Landroid/app/Activity;Landroid/webkit/WebView;Lcom/twocloo/com/cn/singlebook/DataCallBack;)Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "twocloo"
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/twocloo/com/cn/beans/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/com/cn/activitys/BaoyueActivity$2;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/activitys/BaoyueActivity$2;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/activitys/BaoyueActivity$2;-><init>(Lcom/twocloo/com/cn/activitys/BaoyueActivity;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/BaoyueActivity$2;);
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/WebView;->setonReceiveErrorCallBack(Lcom/twocloo/com/cn/singlebook/DataCallBack;)V
a=0;// 
a=0;//     .line 70
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->loadData()V
a=0;// 
a=0;//     .line 72
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 148
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 150
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->remove(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 151
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 141
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 142
a=0;//     const-string v0, "BaoyueActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageEnd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 143
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onPause(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 144
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 129
a=0;//     const-string v0, "BaoyueActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageStart(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 130
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 131
a=0;//     sput-object p0, Lcom/twocloo/com/cn/common/CloseActivity;->curActivity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 132
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 133
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 134
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 135
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaoyueActivity;->networklayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 136
a=0;//     return-void
a=0;// .end method
}}
