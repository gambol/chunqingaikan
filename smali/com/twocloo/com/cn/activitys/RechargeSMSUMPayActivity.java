package com.twocloo.com.cn.activitys; class RechargeSMSUMPayActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "RechargeSMSUMPayActivity.java"
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
a=0;// .field private context:Landroid/content/Context;
a=0;// 
a=0;// .field private fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private gopayBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private money:I
a=0;// 
a=0;// .field private tenBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private twoBtn:Landroid/widget/Button;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 32
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;);
a=0;//     const-string v0, "RechargeSMSUMPayActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 36
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->money:I
a=0;// 
a=0;//     .line 31
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private recharge(I)V
a=0;//     .locals 0
a=0;//     .param p1, "money"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     sparse-switch p1, :sswitch_data_0
a=0;// 
a=0;//     .line 183
a=0;//     :sswitch_0
a=0;//     return-void
a=0;// 
a=0;//     .line 169
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x2 -> :sswitch_0
a=0;//         0x5 -> :sswitch_0
a=0;//         0xa -> :sswitch_0
a=0;//         0x14 -> :sswitch_0
a=0;//         0x1e -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method private setTopBar()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->mainlayout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 62
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->goPay:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->gopayBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 63
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->two:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->twoBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 65
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->ten:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 69
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->back:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/ImageButton;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     .line 70
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setVisibility(I)V
a=0;// 
a=0;//     .line 71
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->topbar:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 72
a=0;//     .local v0, "title_tv":Landroid/widget/TextView;
a=0;//     const-string v1, "\u79fb\u52a8\u5145\u503c"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 73
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 74
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v1, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 75
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->gopayBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 76
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->twoBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 78
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 81
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
a=0;//     .line 84
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 85
a=0;//     .local v0, "id":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v1}, Landroid/widget/ImageButton;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 86
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->finish()V
a=0;// 
a=0;//     .line 161
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 87
a=0;//     :cond_1
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->twoBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 88
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->money:I
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->twoBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 91
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 98
a=0;//     :cond_2
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     .line 99
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->money:I
a=0;// 
a=0;//     .line 100
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 106
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 107
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 108
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 110
a=0;//     :cond_3
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_4
a=0;// 
a=0;//     .line 111
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->money:I
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 117
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 122
a=0;//     :cond_4
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_5
a=0;// 
a=0;//     .line 123
a=0;//     const/16 v1, 0x14
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->money:I
a=0;// 
a=0;//     .line 124
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 125
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 126
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 127
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 130
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 131
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 132
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 134
a=0;//     :cond_5
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_6
a=0;// 
a=0;//     .line 135
a=0;//     const/16 v1, 0x1e
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->money:I
a=0;// 
a=0;//     .line 136
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 137
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 138
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 139
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 141
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 142
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 143
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 144
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 146
a=0;//     :cond_6
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->gopayBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 147
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
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     .line 148
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 151
a=0;//     :cond_7
a=0;//     #v1=(Boolean);v2=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v1, :cond_9
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
a=0;//     if-nez v1, :cond_9
a=0;// 
a=0;//     .line 152
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->money:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_8
a=0;// 
a=0;//     .line 153
a=0;//     const-string v1, "\u8bf7\u9009\u62e9\u5145\u503c\u91d1\u989d."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 156
a=0;//     :cond_8
a=0;//     #v1=(Integer);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->money:I
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->recharge(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 158
a=0;//     :cond_9
a=0;//     #v1=(Conflicted);
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
a=0;//     .line 40
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 41
a=0;//     sget v2, Lcom/twocloo/com/cn/R$layout;->recharge_sms_umpay_layout:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 42
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->add(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 43
a=0;//     sget v2, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v2, v3}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 44
a=0;//     iput-object p0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 46
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->setTopBar()V
a=0;// 
a=0;//     .line 48
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
a=0;//     .line 49
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 50
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
a=0;//     .line 51
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
a=0;//     .line 52
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\u8054\u52a8\u4f18\u52bf\u5145\u503c"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v2, v3}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChanneltv(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 55
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
a=0;//     .line 204
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 205
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->remove(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 206
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 196
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 197
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageEnd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 198
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onPause(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 199
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 200
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 186
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 187
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageStart(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 188
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 189
a=0;//     sput-object p0, Lcom/twocloo/com/cn/common/CloseActivity;->curActivity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 190
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 191
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSUMPayActivity;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 192
a=0;//     return-void
a=0;// .end method
}}
