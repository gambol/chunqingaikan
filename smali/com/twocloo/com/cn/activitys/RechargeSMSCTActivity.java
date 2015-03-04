package com.twocloo.com.cn.activitys; class RechargeSMSCTActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "RechargeSMSCTActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private TAG:Ljava/lang/String;
a=0;// 
a=0;// .field private backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;// .field private fifteenBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private gopayBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private money:I
a=0;// 
a=0;// .field private orderid:Ljava/lang/String;
a=0;// 
a=0;// .field private payHelper:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;// .field private paycode:Ljava/lang/String;
a=0;// 
a=0;// .field private rechargeCTtask:Lcom/twocloo/com/cn/task/RechargeCTTask;
a=0;// 
a=0;// .field private tenBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private twoBtn:Landroid/widget/Button;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 33
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;);
a=0;//     const-string v0, "RechargeSMSCTActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 37
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->money:I
a=0;// 
a=0;//     .line 43
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 32
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->orderid:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->paycode:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->money:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;Lcom/twocloo/com/cn/task/RechargeCTTask;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->rechargeCTtask:Lcom/twocloo/com/cn/task/RechargeCTTask;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;)Lcom/twocloo/com/cn/task/RechargeCTTask;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->rechargeCTtask:Lcom/twocloo/com/cn/task/RechargeCTTask;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/task/RechargeCTTask;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private createOrderid()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 215
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 216
a=0;//     .local v0, "orderid":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private recharge(I)V
a=0;//     .locals 3
a=0;//     .param p1, "money"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 187
a=0;//     sparse-switch p1, :sswitch_data_0
a=0;// 
a=0;//     .line 207
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 189
a=0;//     :sswitch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     const-string v0, "90000432"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->paycode:Ljava/lang/String;
a=0;// 
a=0;//     .line 190
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->payHelper:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     const-string v1, "90000432"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, p0, v1, v2}, Lcom/ffcs/inapppaylib/PayHelper;->pay(Landroid/app/Activity;Ljava/lang/String;Landroid/os/Handler;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 193
a=0;//     :sswitch_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     const-string v0, "90000433"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->paycode:Ljava/lang/String;
a=0;// 
a=0;//     .line 194
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->payHelper:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->paycode:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, p0, v1, v2}, Lcom/ffcs/inapppaylib/PayHelper;->pay(Landroid/app/Activity;Ljava/lang/String;Landroid/os/Handler;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 197
a=0;//     :sswitch_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     const-string v0, "90000436"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->paycode:Ljava/lang/String;
a=0;// 
a=0;//     .line 198
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->payHelper:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->paycode:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, p0, v1, v2}, Lcom/ffcs/inapppaylib/PayHelper;->pay(Landroid/app/Activity;Ljava/lang/String;Landroid/os/Handler;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 201
a=0;//     :sswitch_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     const-string v0, "90000437"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->paycode:Ljava/lang/String;
a=0;// 
a=0;//     .line 202
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->payHelper:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->paycode:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, p0, v1, v2}, Lcom/ffcs/inapppaylib/PayHelper;->pay(Landroid/app/Activity;Ljava/lang/String;Landroid/os/Handler;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 187
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x2 -> :sswitch_0
a=0;//         0x5 -> :sswitch_1
a=0;//         0xa -> :sswitch_2
a=0;//         0xf -> :sswitch_3
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method private setTopBar()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->topbar_layout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 97
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->mainlayout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 98
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->goPay:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->gopayBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 99
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->two:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->twoBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 100
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->five:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 101
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->ten:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 102
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->fifteen:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->fifteenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 104
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->back:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/ImageButton;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setVisibility(I)V
a=0;// 
a=0;//     .line 106
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->topbar:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 107
a=0;//     .local v0, "title_tv":Landroid/widget/TextView;
a=0;//     const-string v1, "\u7535\u4fe1\u5145\u503c"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 108
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 109
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v1, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 110
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->gopayBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 111
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->twoBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->fifteenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 115
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 4
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 118
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 119
a=0;//     .local v0, "id":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v1}, Landroid/widget/ImageButton;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 120
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->finish()V
a=0;// 
a=0;//     .line 179
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 121
a=0;//     :cond_1
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->twoBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 122
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->money:I
a=0;// 
a=0;//     .line 123
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->twoBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 124
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 125
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 126
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->fifteenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 128
a=0;//     :cond_2
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     .line 129
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->money:I
a=0;// 
a=0;//     .line 130
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 131
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 132
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->fifteenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 134
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->red_text:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 135
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 136
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->fifteenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 138
a=0;//     :cond_3
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_4
a=0;// 
a=0;//     .line 139
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->money:I
a=0;// 
a=0;//     .line 140
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 141
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 142
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->fifteenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 144
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->red_text:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 146
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->fifteenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 148
a=0;//     :cond_4
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->fifteenBtn:Landroid/widget/Button;
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
a=0;//     const/16 v1, 0xf
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->money:I
a=0;// 
a=0;//     .line 150
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->fifteenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 151
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 152
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 154
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->fifteenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->red_text:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 155
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 156
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 158
a=0;//     :cond_5
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->gopayBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 159
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v2, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     .line 160
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     invoke-static {p0, v1, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 163
a=0;//     :cond_6
a=0;//     #v1=(Boolean);v2=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_8
a=0;// 
a=0;//     .line 164
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->money:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_7
a=0;// 
a=0;//     .line 165
a=0;//     const-string v1, "\u8bf7\u9009\u62e9\u5145\u503c\u91d1\u989d."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 168
a=0;//     :cond_7
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p0}, Lcom/ffcs/inapppaylib/PayHelper;->getInstance(Landroid/content/Context;)Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/ffcs/inapppaylib/PayHelper;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->payHelper:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     .line 169
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->payHelper:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     const-string v2, "291001600000036913"
a=0;// 
a=0;//     const-string v3, "4d265c3134c5cc474e7ce30e1795200f"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/ffcs/inapppaylib/PayHelper;->init(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->payHelper:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     const/16 v2, 0x1f40
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-virtual {v1, v2}, Lcom/ffcs/inapppaylib/PayHelper;->settimeout(I)V
a=0;// 
a=0;//     .line 172
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->createOrderid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->orderid:Ljava/lang/String;
a=0;// 
a=0;//     .line 173
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->money:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->recharge(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 176
a=0;//     :cond_8
a=0;//     #v1=(Conflicted);v2=(Reference,Lcom/twocloo/base/common/NetType;);v3=(Null);
a=0;//     const-string v1, "\u8bf7\u5148\u767b\u5f55."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 4
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 79
a=0;//     sget v2, Lcom/twocloo/com/cn/R$layout;->recharge_sms_ct_layout:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 80
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->add(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 81
a=0;//     sget v2, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v2, v3}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 82
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->setTopBar()V
a=0;// 
a=0;//     .line 84
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
a=0;//     .line 85
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 86
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
a=0;//     .line 87
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
a=0;//     .line 88
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\u7535\u4fe1\u5145\u503c"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v2, v3}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChanneltv(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 90
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     .end local v1    # "latestchannel":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 238
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 239
a=0;//     invoke-static {p0}, Lcom/ffcs/inapppaylib/PayHelper;->getInstance(Landroid/content/Context;)Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/PayHelper;);
a=0;//     invoke-virtual {v0}, Lcom/ffcs/inapppaylib/PayHelper;->quitPay()V
a=0;// 
a=0;//     .line 240
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->remove(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 241
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 230
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 231
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageEnd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 232
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onPause(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 233
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 234
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 220
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 221
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageStart(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 222
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 223
a=0;//     sput-object p0, Lcom/twocloo/com/cn/common/CloseActivity;->curActivity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 224
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 225
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 226
a=0;//     return-void
a=0;// .end method
}}
