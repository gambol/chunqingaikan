package com.twocloo.com.cn.activitys; class RechargeWangyinActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "RechargeWangyinActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private TAG:Ljava/lang/String;
a=0;// 
a=0;// .field private back:Landroid/widget/ImageButton;
a=0;// 
a=0;// .field private fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private formatUrl:Ljava/lang/String;
a=0;// 
a=0;// .field private go:Landroid/widget/Button;
a=0;// 
a=0;// .field private input:Landroid/widget/EditText;
a=0;// 
a=0;// .field private inputothermoneytv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private kefu:Landroid/widget/TextView;
a=0;// 
a=0;// .field private line1:Landroid/view/View;
a=0;// 
a=0;// .field private line2:Landroid/view/View;
a=0;// 
a=0;// .field private mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;// .field private mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private money:I
a=0;// 
a=0;// .field private networkonlineErroLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private rechargemoneytv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private scrollview:Landroid/widget/ScrollView;
a=0;// 
a=0;// .field private tenBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private titlelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private titletv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private token:Ljava/lang/String;
a=0;// 
a=0;// .field private twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private userid:Ljava/lang/String;
a=0;// 
a=0;// .field private wenxintishi:Landroid/widget/TextView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 42
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;);
a=0;//     const-string v0, "RechargeWangyinActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 50
a=0;//     const/16 v0, 0xf
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->money:I
a=0;// 
a=0;//     .line 41
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;)Landroid/widget/RelativeLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->networkonlineErroLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;)Lcom/twocloo/com/cn/beans/WebView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 133
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->loadData()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private initView()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->scrollview:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/ScrollView;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->scrollview:Landroid/widget/ScrollView;
a=0;// 
a=0;//     .line 74
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->webview:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     .line 75
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->mainlayout:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 76
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->topbarlayout:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->titlelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 77
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->network_unvaliable:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->networkonlineErroLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 78
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->topbar:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->titletv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 79
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->back:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/ImageButton;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->back:Landroid/widget/ImageButton;
a=0;// 
a=0;//     .line 81
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->rechargemoneytv:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->rechargemoneytv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 82
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->inputothermoneytv:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->inputothermoneytv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 83
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->wenxintishi:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->wenxintishi:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 84
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->kefu:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->kefu:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 86
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->line1:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->line1:Landroid/view/View;
a=0;// 
a=0;//     .line 87
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->line2:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->line2:Landroid/view/View;
a=0;// 
a=0;//     .line 88
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->consume_zfb_input:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/EditText;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     .line 89
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->consume_zfb_go:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->go:Landroid/widget/Button;
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->go:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 91
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Landroid/widget/EditText;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 92
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->ten:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 93
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->twenty:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 94
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->thirty:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 95
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->fifty:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 96
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 98
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 99
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     const-string v3, "15"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->titletv:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v3, "\u94f6\u8054\u5145\u503c"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->titletv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$color;->usercenter_text:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->back:Landroid/widget/ImageButton;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/ImageButton;->setVisibility(I)V
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->back:Landroid/widget/ImageButton;
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 108
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->recharge_item_tv:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 109
a=0;//     .local v1, "rechargeTv":Landroid/widget/TextView;
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->recharge_item_icon:I
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 110
a=0;//     .local v0, "icon":Landroid/widget/ImageView;
a=0;//     const-string v2, "\u94f6\u8054\u5145\u503c"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 111
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->bank_icon:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     invoke-static {p0, v3}, Lcom/twocloo/com/cn/common/JavaScript;->newInstance(Landroid/app/Activity;Landroid/webkit/WebView;)Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "twocloo"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/twocloo/com/cn/beans/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     new-instance v3, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity$1;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity$1;);
a=0;//     invoke-direct {v3, p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity$1;);
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/beans/WebView;->setonReceiveErrorCallBack(Lcom/twocloo/com/cn/singlebook/DataCallBack;)V
a=0;// 
a=0;//     .line 127
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private loadData()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->networkonlineErroLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v0}, Landroid/widget/RelativeLayout;->isShown()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 135
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->networkonlineErroLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 137
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->formatUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/util/StringUtils;->isNotBlank(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 138
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/WebView;->setVisibility(I)V
a=0;// 
a=0;//     .line 139
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->formatUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/WebView;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 140
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getMoney()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 271
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->money:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 10
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 176
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 177
a=0;//     .local v1, "id":I
a=0;//     #v1=(Integer);
a=0;//     sget v4, Lcom/twocloo/com/cn/R$id;->consume_zfb_go:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v1, v4, :cond_5
a=0;// 
a=0;//     .line 178
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 179
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v4}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/base/util/StringUtils;->isNotBlank(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 180
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/EditText;);
a=0;//     invoke-virtual {v4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v4}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v4}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->setMoney(I)V
a=0;// 
a=0;//     .line 185
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->getMoney()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-ge v4, v9, :cond_2
a=0;// 
a=0;//     .line 186
a=0;//     const-string v4, "\u8bf7\u8f93\u51651\u4ee5\u4e0a\u7684\u6574\u6570"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     sget v5, Lcom/twocloo/com/cn/R$drawable;->infoicon:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {p0, v4, v5, v6}, Lcom/twocloo/base/util/ViewUtils;->showDialog(Landroid/content/Context;Ljava/lang/String;ILandroid/content/DialogInterface$OnClickListener;)V
a=0;// 
a=0;//     .line 187
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/widget/EditText;->requestFocus()Z
a=0;// 
a=0;//     .line 268
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Reference,Ljava/lang/Integer;);
a=0;//     return-void
a=0;// 
a=0;//     .line 182
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Boolean);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Null);
a=0;//     const-string v4, "\u8bf7\u8f93\u51651\u4ee5\u4e0a\u7684\u6574\u6570"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v4, v8}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 190
a=0;//     :cond_2
a=0;//     #v4=(Integer);
a=0;//     sget-object v4, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v4, v5}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 191
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v5, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {p0, v4, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 195
a=0;//     :cond_3
a=0;//     #v4=(Boolean);v5=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->scrollview:Landroid/widget/ScrollView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/ScrollView;);
a=0;//     const/16 v5, 0x8
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/ScrollView;->setVisibility(I)V
a=0;// 
a=0;//     .line 196
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     invoke-virtual {v4, v8}, Lcom/twocloo/com/cn/beans/WebView;->setVisibility(I)V
a=0;// 
a=0;//     .line 198
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->userid:Ljava/lang/String;
a=0;// 
a=0;//     .line 199
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->token:Ljava/lang/String;
a=0;// 
a=0;//     .line 200
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 201
a=0;//     .local v2, "nightOrDay":I
a=0;//     #v2=(Integer);
a=0;//     const-string v3, "bank_wap"
a=0;// 
a=0;//     .line 202
a=0;//     .local v3, "sort":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->userid:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->token:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->money:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "tokentoken"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 203
a=0;//     .local v0, "auth":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "http://app.2cloo.com/bank-alipay&userid=%s&token=%s&money=%s&sort=%s&auth=%s&night=%s"
a=0;// 
a=0;//     const/4 v6, 0x6
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->userid:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     aput-object v7, v6, v8
a=0;// 
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->token:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v7, v6, v9
a=0;// 
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     iget v8, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->money:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     aput-object v3, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x4
a=0;// 
a=0;//     aput-object v0, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x5
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 204
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 203
a=0;//     iput-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->formatUrl:Ljava/lang/String;
a=0;// 
a=0;//     .line 205
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->loadData()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 208
a=0;//     .end local v0    # "auth":Ljava/lang/String;
a=0;//     .end local v2    # "nightOrDay":I
a=0;//     .end local v3    # "sort":Ljava/lang/String;
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Null);
a=0;//     const-string v4, "\u8bf7\u5148\u767b\u5f55"
a=0;// 
a=0;//     invoke-static {p0, v4, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 210
a=0;//     :cond_5
a=0;//     #v4=(Integer);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->back:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v4}, Landroid/widget/ImageButton;->getId()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v1, v4, :cond_6
a=0;// 
a=0;//     .line 211
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->finish()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 212
a=0;//     :cond_6
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v4}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v1, v4, :cond_7
a=0;// 
a=0;//     .line 213
a=0;//     const/16 v4, 0xa
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     iput v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->money:I
a=0;// 
a=0;//     .line 214
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/EditText;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->money:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 216
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     sget v6, Lcom/twocloo/com/cn/R$color;->red_text:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 217
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v6, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 218
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v6, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 219
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v6, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 221
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 222
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 223
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 224
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 225
a=0;//     :cond_7
a=0;//     #v4=(Integer);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v4}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v1, v4, :cond_8
a=0;// 
a=0;//     .line 226
a=0;//     const/16 v4, 0x14
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     iput v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->money:I
a=0;// 
a=0;//     .line 227
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/EditText;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->money:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 228
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     sget v6, Lcom/twocloo/com/cn/R$color;->red_text:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 229
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v6, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 230
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v6, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 231
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v6, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 232
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 233
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 234
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 235
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 236
a=0;//     :cond_8
a=0;//     #v4=(Integer);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v4}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v1, v4, :cond_9
a=0;// 
a=0;//     .line 237
a=0;//     const/16 v4, 0x1e
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     iput v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->money:I
a=0;// 
a=0;//     .line 238
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/EditText;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->money:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 239
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     sget v6, Lcom/twocloo/com/cn/R$color;->red_text:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 240
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v6, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 241
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v6, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 242
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v6, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 243
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 244
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 245
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 246
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 247
a=0;//     :cond_9
a=0;//     #v4=(Integer);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v4}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v1, v4, :cond_a
a=0;// 
a=0;//     .line 248
a=0;//     const/16 v4, 0x32
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     iput v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->money:I
a=0;// 
a=0;//     .line 249
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/EditText;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->money:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 250
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     sget v6, Lcom/twocloo/com/cn/R$color;->red_text:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 251
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v6, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 252
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v6, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 253
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v6, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 254
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 255
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 256
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 257
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 258
a=0;//     :cond_a
a=0;//     #v4=(Integer);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/EditText;);
a=0;//     invoke-virtual {v4}, Landroid/widget/EditText;->getId()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v1, v4, :cond_0
a=0;// 
a=0;//     .line 259
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v6, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 260
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v6, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 261
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v6, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 262
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v6, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 263
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 264
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 265
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 266
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 4
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 60
a=0;//     sget v2, Lcom/twocloo/com/cn/R$layout;->consume_wangyin:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 61
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->add(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 62
a=0;//     sget v2, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v2, v3}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 63
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->initView()V
a=0;// 
a=0;//     .line 64
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 65
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 66
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "latestchannel"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 67
a=0;//     .local v1, "latestchannel":I
a=0;//     #v1=(Integer);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {p0, v2, v1}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChannel(Landroid/content/Context;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 68
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\u94f6\u8054\u5145\u503c"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v2, v3}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChanneltv(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 70
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     .end local v1    # "latestchannel":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 171
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 172
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->remove(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 173
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 163
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 164
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageEnd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 165
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onPause(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 166
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 167
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageStart(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 146
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 147
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 148
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->titlelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 149
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->networkonlineErroLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 150
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->line1:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 151
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->line2:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 152
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setEditTextColor(Landroid/app/Activity;Landroid/widget/EditText;)V
a=0;// 
a=0;//     .line 153
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->go:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setRedButtonbackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 154
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->rechargemoneytv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTitleItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 155
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->inputothermoneytv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTitleItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 156
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->wenxintishi:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTitleItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 157
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->kefu:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTitleItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 159
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setMoney(I)V
a=0;//     .locals 0
a=0;//     .param p1, "money"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 275
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;->money:I
a=0;// 
a=0;//     .line 276
a=0;//     return-void
a=0;// .end method
}}
