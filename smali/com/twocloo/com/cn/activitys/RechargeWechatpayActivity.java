package com.twocloo.com.cn.activitys; class RechargeWechatpayActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "RechargeWechatpayActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity$WechatPayBean;,
a=0;//         Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity$WechatPayTask;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private TAG:Ljava/lang/String;
a=0;// 
a=0;// .field private api:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;// .field private back:Landroid/widget/ImageButton;
a=0;// 
a=0;// .field private fiftyBtn:Landroid/widget/Button;
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
a=0;// .field private mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private money:I
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private tenBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private tishitv:Landroid/widget/TextView;
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
a=0;//     .line 42
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 43
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;);
a=0;//     const-string v0, "RechargeWechatpayActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 51
a=0;//     const/16 v0, 0xf
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->money:I
a=0;// 
a=0;//     .line 42
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;Landroid/app/ProgressDialog;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 258
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;)Landroid/app/ProgressDialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 258
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;)Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->api:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/openapi/IWXAPI;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private initView()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->mainlayout:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 77
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->top_bar:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->titlelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 78
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->topbar:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->titletv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 79
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->back:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/ImageButton;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->back:Landroid/widget/ImageButton;
a=0;// 
a=0;//     .line 80
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->line1:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->line1:Landroid/view/View;
a=0;// 
a=0;//     .line 82
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->tishitv:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->tishitv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 83
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->inputothermoneytv:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->inputothermoneytv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 84
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->wenxintishi:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->wenxintishi:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 85
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->kefu:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->kefu:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 87
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->wechat_pay_input:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/EditText;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     .line 88
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->goPay:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->go:Landroid/widget/Button;
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->go:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Landroid/widget/EditText;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 91
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->ten:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 92
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->twenty:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 93
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->thirty:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 94
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->fifty:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 95
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 96
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 98
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 100
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->money:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->titletv:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v3, "\u5fae\u4fe1\u5145\u503c"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->titletv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$color;->usercenter_text:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->back:Landroid/widget/ImageButton;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/ImageButton;->setVisibility(I)V
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->back:Landroid/widget/ImageButton;
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 107
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->recharge_item_tv:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 108
a=0;//     .local v1, "rechargeTv":Landroid/widget/TextView;
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->recharge_item_icon:I
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 109
a=0;//     .local v0, "icon":Landroid/widget/ImageView;
a=0;//     const-string v2, "\u5fae\u4fe1\u5145\u503c"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 110
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->weixin_icon:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 112
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static wechatPay(Ljava/lang/String;Ljava/lang/String;I)Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity$WechatPayBean;
a=0;//     .locals 9
a=0;//     .param p0, "uid"    # Ljava/lang/String;
a=0;//     .param p1, "token"    # Ljava/lang/String;
a=0;//     .param p2, "money"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 324
a=0;//     #v4=(Null);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "tokentoken"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 325
a=0;//     .local v0, "auth":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "http://app.2cloo.com/weixin-start?userid=%s&token=%s&money=%s&auth=%s"
a=0;// 
a=0;//     const/4 v6, 0x4
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     aput-object p0, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     aput-object p1, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     aput-object v0, v6, v7
a=0;// 
a=0;//     invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 326
a=0;//     .local v2, "url":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 327
a=0;//     .local v1, "json":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .line 357
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity$WechatPayBean;);v4=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 329
a=0;//     :cond_1
a=0;//     #v3=(Uninit);v4=(Null);
a=0;//     new-instance v3, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity$WechatPayBean;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity$WechatPayBean;);
a=0;//     invoke-direct {v3, v4}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity$WechatPayBean;-><init>(Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity$WechatPayBean;)V
a=0;// 
a=0;//     .line 330
a=0;//     .local v3, "wechatPay":Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity$WechatPayBean;
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity$WechatPayBean;);
a=0;//     const-string v4, "code"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 331
a=0;//     const-string v4, "code"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity$WechatPayBean;->setCode(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 333
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);
a=0;//     const-string v4, "appid"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 334
a=0;//     const-string v4, "appid"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity$WechatPayBean;->setAppid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 336
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);
a=0;//     const-string v4, "appkey"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 337
a=0;//     const-string v4, "appkey"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity$WechatPayBean;->setAppkey(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 339
a=0;//     :cond_4
a=0;//     #v4=(Conflicted);
a=0;//     const-string v4, "partnerid"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     .line 340
a=0;//     const-string v4, "partnerid"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity$WechatPayBean;->setPartnerid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 342
a=0;//     :cond_5
a=0;//     #v4=(Conflicted);
a=0;//     const-string v4, "prepayid"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     .line 343
a=0;//     const-string v4, "prepayid"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity$WechatPayBean;->setPrepayid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 345
a=0;//     :cond_6
a=0;//     #v4=(Conflicted);
a=0;//     const-string v4, "nonceStr"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_7
a=0;// 
a=0;//     .line 346
a=0;//     const-string v4, "nonceStr"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity$WechatPayBean;->setNonceStr(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 348
a=0;//     :cond_7
a=0;//     #v4=(Conflicted);
a=0;//     const-string v4, "timeStamp"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_8
a=0;// 
a=0;//     .line 349
a=0;//     const-string v4, "timeStamp"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity$WechatPayBean;->setTimeStamp(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 351
a=0;//     :cond_8
a=0;//     #v4=(Conflicted);
a=0;//     const-string v4, "package"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_9
a=0;// 
a=0;//     .line 352
a=0;//     const-string v4, "package"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity$WechatPayBean;->setmPackage(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 354
a=0;//     :cond_9
a=0;//     #v4=(Conflicted);
a=0;//     const-string v4, "sign"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 355
a=0;//     const-string v4, "sign"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity$WechatPayBean;->setSign(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private wechatpay(I)V
a=0;//     .locals 6
a=0;//     .param p1, "money"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 248
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity$WechatPayTask;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity$WechatPayTask;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->userid:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->token:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;);
a=0;//     move-object v2, p0
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;);
a=0;//     move v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity$WechatPayTask;-><init>(Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity$WechatPayTask;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Void;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity$WechatPayTask;->execute([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 249
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getMoney()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 235
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->money:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 4
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 147
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 148
a=0;//     .local v0, "id":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->go:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_5
a=0;// 
a=0;//     .line 149
a=0;//     sget-object v1, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 150
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {p0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 232
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 153
a=0;//     :cond_1
a=0;//     #v1=(Boolean);v2=(Reference,Lcom/twocloo/base/common/NetType;);v3=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 154
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->userid:Ljava/lang/String;
a=0;// 
a=0;//     .line 155
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->token:Ljava/lang/String;
a=0;// 
a=0;//     .line 156
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/base/util/StringUtils;->isNotBlank(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 157
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/EditText;);
a=0;//     invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->setMoney(I)V
a=0;// 
a=0;//     .line 163
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->getMoney()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-ge v1, v2, :cond_3
a=0;// 
a=0;//     .line 164
a=0;//     const-string v1, "\u8bf7\u8f93\u51651\u4ee5\u4e0a\u7684\u6574\u6570"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->infoicon:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     invoke-static {p0, v1, v2, v3}, Lcom/twocloo/base/util/ViewUtils;->showDialog(Landroid/content/Context;Ljava/lang/String;ILandroid/content/DialogInterface$OnClickListener;)V
a=0;// 
a=0;//     .line 165
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/EditText;->requestFocus()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 159
a=0;//     :cond_2
a=0;//     #v1=(Boolean);v2=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     const-string v1, "\u8bf7\u8f93\u51651\u4ee5\u4e0a\u7684\u6574\u6570"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 169
a=0;//     :cond_3
a=0;//     #v1=(Integer);v2=(One);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->getMoney()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->wechatpay(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 172
a=0;//     :cond_4
a=0;//     #v1=(Reference,Ujava/lang/Object;);v2=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     const-string v1, "\u8bf7\u5148\u767b\u5f55."
a=0;// 
a=0;//     invoke-static {p0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 173
a=0;//     const-string v1, "LOGINTAG"
a=0;// 
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->goToLogin(Landroid/app/Activity;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 175
a=0;//     :cond_5
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->back:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v1}, Landroid/widget/ImageButton;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_6
a=0;// 
a=0;//     .line 176
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->finish()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 177
a=0;//     :cond_6
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_7
a=0;// 
a=0;//     .line 178
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->money:I
a=0;// 
a=0;//     .line 179
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/EditText;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->money:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 180
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->red_text:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 181
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 182
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 183
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 185
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 186
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 187
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 188
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 189
a=0;//     :cond_7
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_8
a=0;// 
a=0;//     .line 190
a=0;//     const/16 v1, 0x14
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->money:I
a=0;// 
a=0;//     .line 191
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/EditText;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->money:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 192
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->red_text:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 193
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 194
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 195
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 196
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 197
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 198
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 199
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 200
a=0;//     :cond_8
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_9
a=0;// 
a=0;//     .line 201
a=0;//     const/16 v1, 0x1e
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->money:I
a=0;// 
a=0;//     .line 202
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/EditText;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->money:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 203
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->red_text:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 204
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 205
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 206
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 207
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 208
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 209
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 210
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 211
a=0;//     :cond_9
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_a
a=0;// 
a=0;//     .line 212
a=0;//     const/16 v1, 0x32
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->money:I
a=0;// 
a=0;//     .line 213
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/EditText;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->money:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 214
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->red_text:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 216
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 217
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 218
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 219
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 221
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 222
a=0;//     :cond_a
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/EditText;);
a=0;//     invoke-virtual {v1}, Landroid/widget/EditText;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 223
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 224
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 225
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 226
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 227
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 228
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 229
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 230
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 5
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 57
a=0;//     #v4=(Null);
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 58
a=0;//     sget v2, Lcom/twocloo/com/cn/R$layout;->recharge_wechatpay_layout:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 59
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->add(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 60
a=0;//     sget v2, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v2, v3}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 61
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->initView()V
a=0;// 
a=0;//     .line 63
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
a=0;//     .line 64
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 65
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "latestchannel"
a=0;// 
a=0;//     invoke-virtual {v0, v2, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 66
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
a=0;//     .line 67
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\u5fae\u4fe1\u5145\u503c"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v2, v3}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChanneltv(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 71
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     .end local v1    # "latestchannel":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     const-string v2, "wx2819d944f57342c2"
a=0;// 
a=0;//     invoke-static {p0, v2, v4}, Lcom/tencent/mm/sdk/openapi/WXAPIFactory;->createWXAPI(Landroid/content/Context;Ljava/lang/String;Z)Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->api:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->api:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     const-string v3, "wx2819d944f57342c2"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v3}, Lcom/tencent/mm/sdk/openapi/IWXAPI;->registerApp(Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 73
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 142
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 143
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->remove(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 144
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 135
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageEnd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 136
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onPause(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 137
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 138
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 116
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 117
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageStart(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 118
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 119
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->titlelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setEditTextColor(Landroid/app/Activity;Landroid/widget/EditText;)V
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->line1:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 123
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->go:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setRedButtonbackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 125
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->tishitv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTitleItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 126
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->inputothermoneytv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTitleItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 127
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->wenxintishi:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTitleItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->kefu:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTitleItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 130
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setMoney(I)V
a=0;//     .locals 0
a=0;//     .param p1, "money"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 239
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;->money:I
a=0;// 
a=0;//     .line 240
a=0;//     return-void
a=0;// .end method
}}
