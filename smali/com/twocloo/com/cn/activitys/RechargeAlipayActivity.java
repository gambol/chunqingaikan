package com.twocloo.com.cn.activitys; class RechargeAlipayActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "RechargeAlipayActivity.java"
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
a=0;// .field private go:Landroid/widget/Button;
a=0;// 
a=0;// .field private input:Landroid/widget/EditText;
a=0;// 
a=0;// .field private inputothermoneytv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private kefuQQ:Landroid/widget/TextView;
a=0;// 
a=0;// .field private line2:Landroid/view/View;
a=0;// 
a=0;// .field private mainlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private money:I
a=0;// 
a=0;// .field private rechargeMoney:Landroid/widget/TextView;
a=0;// 
a=0;// .field private rechargeicon:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private rechargemoneytv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private rechargetv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private tenBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private titlelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private titletv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private wenxintishi:Landroid/widget/TextView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 35
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;);
a=0;//     const-string v0, "RechargeAlipayActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 45
a=0;//     const/16 v0, 0xf
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->money:I
a=0;// 
a=0;//     .line 34
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private initView()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->mainlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->mainlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 66
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbarlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->titlelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 67
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbar:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->titletv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 68
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->back:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageButton;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->back:Landroid/widget/ImageButton;
a=0;// 
a=0;//     .line 69
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->rechargemoneytv:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->rechargemoneytv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 70
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->inputothermoneytv:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->inputothermoneytv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 71
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->wenxintishi:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->wenxintishi:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 72
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->kefu:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->kefuQQ:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 73
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->moneytv:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->rechargeMoney:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 75
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->recharge_item_icon:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->rechargeicon:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 76
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->recharge_item_tv:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->rechargetv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 78
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line2:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->line2:Landroid/view/View;
a=0;// 
a=0;//     .line 79
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->consume_zfb_input:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/EditText;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     .line 80
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->consume_zfb_go:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->go:Landroid/widget/Button;
a=0;// 
a=0;//     .line 81
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->go:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 82
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/EditText;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 83
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->ten:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 84
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->twenty:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 85
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->thirty:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 86
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->fifty:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 87
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 88
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 92
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     const-string v1, "15"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->rechargeMoney:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v1, "1500"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 95
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->rechargeicon:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->alipay_icon:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 96
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->rechargetv:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v1, "\u652f\u4ed8\u5b9d\u5145\u503c"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->titletv:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v1, "\u652f\u4ed8\u5b9d\u5145\u503c"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 98
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->titletv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$color;->usercenter_text:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 99
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->back:Landroid/widget/ImageButton;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V
a=0;// 
a=0;//     .line 100
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->back:Landroid/widget/ImageButton;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 102
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getMoney()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 234
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->money:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 6
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 130
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 131
a=0;//     .local v2, "id":I
a=0;//     #v2=(Integer);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->consume_zfb_go:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v2, v3, :cond_6
a=0;// 
a=0;//     .line 132
a=0;//     sget-object v3, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v3, v4}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 133
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v4, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {p0, v3, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 231
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 136
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Boolean);v4=(Reference,Lcom/twocloo/base/common/NetType;);v5=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     .line 137
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/base/util/StringUtils;->isNotBlank(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 138
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/EditText;);
a=0;//     invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->setMoney(I)V
a=0;// 
a=0;//     .line 143
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->getMoney()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     if-ge v3, v4, :cond_3
a=0;// 
a=0;//     .line 144
a=0;//     const-string v3, "\u8bf7\u8f93\u51651\u4ee5\u4e0a\u7684\u6574\u6570"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->infoicon:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     invoke-static {p0, v3, v4, v5}, Lcom/twocloo/base/util/ViewUtils;->showDialog(Landroid/content/Context;Ljava/lang/String;ILandroid/content/DialogInterface$OnClickListener;)V
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/EditText;->requestFocus()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 140
a=0;//     :cond_2
a=0;//     #v3=(Boolean);v4=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     const-string v3, "\u8bf7\u8f93\u51651\u4ee5\u4e0a\u7684\u6574\u6570"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v3, v5}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 149
a=0;//     :cond_3
a=0;//     #v3=(Integer);v4=(One);
a=0;//     sget-object v3, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v3, v4}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 150
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v4, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {p0, v3, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 154
a=0;//     :cond_4
a=0;//     #v3=(Boolean);v4=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     new-instance v0, Lcom/twocloo/base/alipay/Alipay;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/alipay/Alipay;);
a=0;//     new-instance v3, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity$1;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity$1;);
a=0;//     invoke-direct {v3, p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity$1;);
a=0;//     invoke-direct {v0, p0, v3}, Lcom/twocloo/base/alipay/Alipay;-><init>(Landroid/app/Activity;Landroid/content/DialogInterface$OnClickListener;)V
a=0;// 
a=0;//     .line 163
a=0;//     .local v0, "alipay":Lcom/twocloo/base/alipay/Alipay;
a=0;//     #v0=(Reference,Lcom/twocloo/base/alipay/Alipay;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/base/alipay/Alipay;->checkIsInstall()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 166
a=0;//     new-instance v1, Lcom/twocloo/com/cn/task/AlipayTask;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/task/AlipayTask;);
a=0;//     invoke-direct {v1, p0, v0}, Lcom/twocloo/com/cn/task/AlipayTask;-><init>(Landroid/app/Activity;Lcom/twocloo/base/alipay/Alipay;)V
a=0;// 
a=0;//     .line 167
a=0;//     .local v1, "alipayTask":Lcom/twocloo/com/cn/task/AlipayTask;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/task/AlipayTask;);
a=0;//     new-array v3, v5, [Ljava/lang/Void;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v1, v3}, Lcom/twocloo/com/cn/task/AlipayTask;->execute([Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 170
a=0;//     .end local v0    # "alipay":Lcom/twocloo/base/alipay/Alipay;
a=0;//     .end local v1    # "alipayTask":Lcom/twocloo/com/cn/task/AlipayTask;
a=0;//     :cond_5
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const-string v3, "\u8bf7\u5148\u767b\u5f55."
a=0;// 
a=0;//     invoke-static {p0, v3, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 172
a=0;//     :cond_6
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->back:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v3}, Landroid/widget/ImageButton;->getId()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v2, v3, :cond_7
a=0;// 
a=0;//     .line 173
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->finish()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 174
a=0;//     :cond_7
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v3}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v2, v3, :cond_8
a=0;// 
a=0;//     .line 175
a=0;//     const/16 v3, 0xa
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->money:I
a=0;// 
a=0;//     .line 176
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/EditText;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->money:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 178
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$color;->red_text:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 179
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v5, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 180
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v5, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 181
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v5, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 183
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 184
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 185
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 186
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 187
a=0;//     :cond_8
a=0;//     #v3=(Integer);v4=(Uninit);v5=(Null);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v3}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v2, v3, :cond_9
a=0;// 
a=0;//     .line 188
a=0;//     const/16 v3, 0x14
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->money:I
a=0;// 
a=0;//     .line 189
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/EditText;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->money:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 190
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$color;->red_text:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 191
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v5, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 192
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v5, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 193
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v5, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 194
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 195
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 196
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 197
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 198
a=0;//     :cond_9
a=0;//     #v3=(Integer);v4=(Uninit);v5=(Null);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v3}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v2, v3, :cond_a
a=0;// 
a=0;//     .line 199
a=0;//     const/16 v3, 0x1e
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->money:I
a=0;// 
a=0;//     .line 200
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/EditText;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->money:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$color;->red_text:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 202
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v5, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 203
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v5, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 204
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v5, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 205
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 206
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 207
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 208
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 209
a=0;//     :cond_a
a=0;//     #v3=(Integer);v4=(Uninit);v5=(Null);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v3}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v2, v3, :cond_b
a=0;// 
a=0;//     .line 210
a=0;//     const/16 v3, 0x32
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->money:I
a=0;// 
a=0;//     .line 211
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/EditText;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->money:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 212
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$color;->red_text:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 213
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v5, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 214
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v5, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v5, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 216
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 217
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 218
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 219
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 220
a=0;//     :cond_b
a=0;//     #v3=(Integer);v4=(Uninit);v5=(Null);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/EditText;);
a=0;//     invoke-virtual {v3}, Landroid/widget/EditText;->getId()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v2, v3, :cond_0
a=0;// 
a=0;//     .line 221
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v5, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 222
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v5, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 223
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v5, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 224
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v5, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 225
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 226
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 227
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 228
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->fiftyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 4
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 51
a=0;//     sget v2, Lcom/twocloo/com/cn/R$layout;->consume_zfb:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 52
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->add(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 53
a=0;//     sget v2, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v2, v3}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 54
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->initView()V
a=0;// 
a=0;//     .line 56
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
a=0;//     .line 57
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 58
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
a=0;//     .line 59
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
a=0;//     .line 60
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\u652f\u4ed8\u5b9d\u5145\u503c"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v2, v3}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChanneltv(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 62
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     .end local v1    # "latestchannel":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 124
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageEnd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 125
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onPause(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 126
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 127
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 107
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageStart(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 108
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 109
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->mainlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 110
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->titlelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 111
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->line2:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->input:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setEditTextColor(Landroid/app/Activity;Landroid/widget/EditText;)V
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->go:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setRedButtonbackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 115
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->rechargemoneytv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTitleItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 116
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->inputothermoneytv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTitleItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 117
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->wenxintishi:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTitleItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->kefuQQ:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTitleItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 119
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setMoney(I)V
a=0;//     .locals 0
a=0;//     .param p1, "money"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 238
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;->money:I
a=0;// 
a=0;//     .line 239
a=0;//     return-void
a=0;// .end method
}}
