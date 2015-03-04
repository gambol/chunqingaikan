package com.twocloo.com.cn.activitys; class RechargeWayActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/RechargeWayActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "RechargeWayActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation build Landroid/annotation/SuppressLint;
a=0;//     value = {
a=0;//         "ResourceAsColor"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final RECHARGE_ALIPAY_CHANNEL:Ljava/lang/String; = "\u652f\u4ed8\u5b9d\u5145\u503c"
a=0;// 
a=0;// .field public static final RECHARGE_CT_CHANNEL:Ljava/lang/String; = "\u7535\u4fe1\u5145\u503c"
a=0;// 
a=0;// .field public static final RECHARGE_CU_CHANNEL:Ljava/lang/String; = "\u8054\u901a\u5145\u503c"
a=0;// 
a=0;// .field public static final RECHARGE_UMPAY_CHANNEL:Ljava/lang/String; = "\u8054\u52a8\u4f18\u52bf\u5145\u503c"
a=0;// 
a=0;// .field public static final RECHARGE_WECHAT_CHANNEL:Ljava/lang/String; = "\u5fae\u4fe1\u5145\u503c"
a=0;// 
a=0;// .field public static final RECHARGE_YDMM_CHANNEL:Ljava/lang/String; = "\u79fb\u52a8\u5145\u503c"
a=0;// 
a=0;// .field public static final RECHARGE_YINHANGCARD_CHANNEL:Ljava/lang/String; = "\u94f6\u8054\u5145\u503c"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private TAG:Ljava/lang/String;
a=0;// 
a=0;// .field private alipaylayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private backbtn:Landroid/widget/ImageButton;
a=0;// 
a=0;// .field private channellisttv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private dianxinlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private latest_channel_tv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private latestchannel:I
a=0;// 
a=0;// .field private latestchannelname:Ljava/lang/String;
a=0;// 
a=0;// .field private latestchanneltv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private latestlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private latestusechannellayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private liantonglayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private line1:Landroid/view/View;
a=0;// 
a=0;// .field private line2:Landroid/view/View;
a=0;// 
a=0;// .field private line3:Landroid/view/View;
a=0;// 
a=0;// .field private line4:Landroid/view/View;
a=0;// 
a=0;// .field private line5:Landroid/view/View;
a=0;// 
a=0;// .field private line6:Landroid/view/View;
a=0;// 
a=0;// .field private linebottom:Landroid/view/View;
a=0;// 
a=0;// .field private linetop:Landroid/view/View;
a=0;// 
a=0;// .field private mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private rechargeIcon:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private rechargelistTask:Lcom/twocloo/com/cn/task/RechargeChannelListTask;
a=0;// 
a=0;// .field private titlelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private titletv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private uid:Ljava/lang/String;
a=0;// 
a=0;// .field private wangyinlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private wechatlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private wyline:Landroid/view/View;
a=0;// 
a=0;// .field private yidonglayout:Landroid/widget/RelativeLayout;
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
a=0;//     .line 30
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/RechargeWayActivity;);
a=0;//     const-string v0, "RechargeWayActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 29
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private goToRecharge(I)V
a=0;//     .locals 13
a=0;//     .param p1, "flag"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v12, 0x6
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     const/4 v11, 0x5
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     const/4 v10, 0x4
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     const/4 v9, 0x3
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     .line 234
a=0;//     #v8=(One);
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     .line 282
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 237
a=0;//     :pswitch_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v6, v8}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChannel(Landroid/content/Context;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 238
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     const-string v7, "\u652f\u4ed8\u5b9d\u5145\u503c"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v6, v7}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChanneltv(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 239
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v6, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;
a=0;// 
a=0;//     invoke-direct {v0, p0, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 240
a=0;//     .local v0, "alipayIntent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v6, "latestchannel"
a=0;// 
a=0;//     invoke-virtual {v0, v6, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 241
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 244
a=0;//     .end local v0    # "alipayIntent":Landroid/content/Intent;
a=0;//     :pswitch_2
a=0;//     #v0=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v6, v9}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChannel(Landroid/content/Context;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 245
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     const-string v7, "\u79fb\u52a8\u5145\u503c"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v6, v7}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChanneltv(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 246
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v6, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;
a=0;// 
a=0;//     invoke-direct {v1, p0, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 247
a=0;//     .local v1, "smscmIntent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v6, "latestchannel"
a=0;// 
a=0;//     invoke-virtual {v1, v6, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 248
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 251
a=0;//     .end local v1    # "smscmIntent":Landroid/content/Intent;
a=0;//     :pswitch_3
a=0;//     #v1=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v6, v10}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChannel(Landroid/content/Context;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 252
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     const-string v7, "\u8054\u901a\u5145\u503c"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v6, v7}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChanneltv(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 253
a=0;//     new-instance v3, Landroid/content/Intent;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v6, Lcom/twocloo/com/cn/activitys/RechargeSMSCUActivity;
a=0;// 
a=0;//     invoke-direct {v3, p0, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 254
a=0;//     .local v3, "smsumIntent":Landroid/content/Intent;
a=0;//     #v3=(Reference,Landroid/content/Intent;);
a=0;//     const-string v6, "latestchannel"
a=0;// 
a=0;//     invoke-virtual {v3, v6, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 255
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 258
a=0;//     .end local v3    # "smsumIntent":Landroid/content/Intent;
a=0;//     :pswitch_4
a=0;//     #v3=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v6, v11}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChannel(Landroid/content/Context;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 259
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     const-string v7, "\u7535\u4fe1\u5145\u503c"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v6, v7}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChanneltv(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 260
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v6, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;
a=0;// 
a=0;//     invoke-direct {v2, p0, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 261
a=0;//     .local v2, "smsctIntent":Landroid/content/Intent;
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     const-string v6, "latestchannel"
a=0;// 
a=0;//     invoke-virtual {v2, v6, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 262
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 265
a=0;//     .end local v2    # "smsctIntent":Landroid/content/Intent;
a=0;//     :pswitch_5
a=0;//     #v2=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v6, v12}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChannel(Landroid/content/Context;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 266
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     const-string v7, "\u5fae\u4fe1\u5145\u503c"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v6, v7}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChanneltv(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 267
a=0;//     new-instance v4, Landroid/content/Intent;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v6, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;
a=0;// 
a=0;//     invoke-direct {v4, p0, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 268
a=0;//     .local v4, "wechatIntent":Landroid/content/Intent;
a=0;//     #v4=(Reference,Landroid/content/Intent;);
a=0;//     const-string v6, "latestchannel"
a=0;// 
a=0;//     invoke-virtual {v4, v6, v12}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 269
a=0;//     invoke-virtual {p0, v4}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 272
a=0;//     .end local v4    # "wechatIntent":Landroid/content/Intent;
a=0;//     :pswitch_6
a=0;//     #v4=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const/4 v7, 0x7
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-static {p0, v6, v7}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChannel(Landroid/content/Context;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 273
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     const-string v7, "\u94f6\u8054\u5145\u503c"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v6, v7}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChanneltv(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 274
a=0;//     new-instance v5, Landroid/content/Intent;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v6, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;
a=0;// 
a=0;//     invoke-direct {v5, p0, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 275
a=0;//     .local v5, "wyIntent":Landroid/content/Intent;
a=0;//     #v5=(Reference,Landroid/content/Intent;);
a=0;//     const-string v6, "latestchannel"
a=0;// 
a=0;//     const/4 v7, 0x7
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v5, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 276
a=0;//     invoke-virtual {p0, v5}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 234
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private initview()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     .line 68
a=0;//     #v4=(PosByte);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->mainlayout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 69
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->titlelayout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->titlelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 70
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->latestusechannellayout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestusechannellayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 71
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->latestlayout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 72
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->alipay_layout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->alipaylayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 73
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->sms_layout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->yidonglayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 74
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->cu_sms_layout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->liantonglayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 75
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->ct_sms_layout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->dianxinlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 76
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->weixin_layout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->wechatlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 77
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->alipay_wangyin_layout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->wangyinlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 78
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->latestchanneltv:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchanneltv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 79
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->latestchannel:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latest_channel_tv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 80
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->channellisttv:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->channellisttv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 81
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->logo:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->rechargeIcon:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 83
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->line_top:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->linetop:Landroid/view/View;
a=0;// 
a=0;//     .line 84
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->line_bottom:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->linebottom:Landroid/view/View;
a=0;// 
a=0;//     .line 85
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->line1:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->line1:Landroid/view/View;
a=0;// 
a=0;//     .line 86
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->line2:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->line2:Landroid/view/View;
a=0;// 
a=0;//     .line 87
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->line3:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->line3:Landroid/view/View;
a=0;// 
a=0;//     .line 88
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->line4:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->line4:Landroid/view/View;
a=0;// 
a=0;//     .line 89
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->line5:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->line5:Landroid/view/View;
a=0;// 
a=0;//     .line 90
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->line6:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->line6:Landroid/view/View;
a=0;// 
a=0;//     .line 91
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->wyline:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->wyline:Landroid/view/View;
a=0;// 
a=0;//     .line 93
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->topbar:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->titletv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 94
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->back:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/ImageButton;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->backbtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     .line 96
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->titletv:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v2, "\u5145\u503c"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->titletv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 98
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->backbtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setVisibility(I)V
a=0;// 
a=0;//     .line 99
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->backbtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 100
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/LocalStore;->getTopBackgroundColor(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 101
a=0;//     .local v0, "color":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->titlelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestusechannellayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->alipaylayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->yidonglayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->liantonglayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 107
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->dianxinlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 108
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->wechatlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 109
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->wangyinlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 111
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "ydmm"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->line3:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->yidonglayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 115
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setLatestChannel()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 122
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/common/LocalStore;->getRechargeChannel(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchannel:I
a=0;// 
a=0;//     .line 123
a=0;//     const-string v0, "result"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "latestchannel="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchannel:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 124
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchannel:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 163
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 126
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchanneltv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v1, "\u63a8\u8350\u4f7f\u7528"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 127
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latest_channel_tv:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchannelname:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->rechargeIcon:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->alipay_icon:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 131
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchanneltv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v1, "\u6700\u8fd1\u5145\u503c\u65b9\u5f0f"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 132
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latest_channel_tv:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchannelname:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 133
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->rechargeIcon:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->alipay_icon:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 136
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchanneltv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v1, "\u6700\u8fd1\u5145\u503c\u65b9\u5f0f"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 137
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latest_channel_tv:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchannelname:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 138
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->rechargeIcon:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->yidong_icon:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 141
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchanneltv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v1, "\u6700\u8fd1\u5145\u503c\u65b9\u5f0f"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 142
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latest_channel_tv:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchannelname:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 143
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->rechargeIcon:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->liantong_icon:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 146
a=0;//     :pswitch_5
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchanneltv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v1, "\u6700\u8fd1\u5145\u503c\u65b9\u5f0f"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 147
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latest_channel_tv:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchannelname:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 148
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->rechargeIcon:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->dianxin_icon:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 151
a=0;//     :pswitch_6
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchanneltv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v1, "\u6700\u8fd1\u5145\u503c\u65b9\u5f0f"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 152
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latest_channel_tv:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchannelname:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 153
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->rechargeIcon:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->weixin_icon:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 156
a=0;//     :pswitch_7
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchanneltv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v1, "\u6700\u8fd1\u5145\u503c\u65b9\u5f0f"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 157
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latest_channel_tv:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchannelname:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 158
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->rechargeIcon:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->bank_icon:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 124
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//         :pswitch_7
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 14
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v13, 0x6
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     const/4 v12, 0x5
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     const/4 v11, 0x4
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     const/4 v10, 0x3
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     .line 167
a=0;//     #v9=(One);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 168
a=0;//     .local v1, "id":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->backbtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v7}, Landroid/widget/ImageButton;->getId()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ne v1, v7, :cond_1
a=0;// 
a=0;//     .line 169
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->finish()V
a=0;// 
a=0;//     .line 228
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 170
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Integer);v8=(Uninit);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestusechannellayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v7}, Landroid/widget/RelativeLayout;->getId()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ne v1, v7, :cond_2
a=0;// 
a=0;//     .line 171
a=0;//     iget v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchannel:I
a=0;// 
a=0;//     invoke-direct {p0, v7}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->goToRecharge(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 172
a=0;//     :cond_2
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->alipaylayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v7}, Landroid/widget/RelativeLayout;->getId()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ne v1, v7, :cond_3
a=0;// 
a=0;//     .line 173
a=0;//     iput v9, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchannel:I
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latest_channel_tv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v8, "\u652f\u4ed8\u5b9d\u5145\u503c"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 175
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->rechargeIcon:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$drawable;->alipay_icon:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 176
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     iget v8, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchannel:I
a=0;// 
a=0;//     invoke-static {p0, v7, v8}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChannel(Landroid/content/Context;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 177
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     const-string v8, "\u652f\u4ed8\u5b9d\u5145\u503c"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v7, v8}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChanneltv(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 178
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v7, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;
a=0;// 
a=0;//     invoke-direct {v0, p0, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 179
a=0;//     .local v0, "alipayIntent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v7, "latestchannel"
a=0;// 
a=0;//     invoke-virtual {v0, v7, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 180
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 181
a=0;//     .end local v0    # "alipayIntent":Landroid/content/Intent;
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v7=(Integer);v8=(Uninit);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->yidonglayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v7}, Landroid/widget/RelativeLayout;->getId()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ne v1, v7, :cond_4
a=0;// 
a=0;//     .line 182
a=0;//     iput v10, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchannel:I
a=0;// 
a=0;//     .line 183
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latest_channel_tv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v8, "\u79fb\u52a8\u5145\u503c"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 184
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->rechargeIcon:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$drawable;->yidong_icon:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 185
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     iget v8, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchannel:I
a=0;// 
a=0;//     invoke-static {p0, v7, v8}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChannel(Landroid/content/Context;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 186
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     const-string v8, "\u79fb\u52a8\u5145\u503c"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v7, v8}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChanneltv(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 187
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v7, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;
a=0;// 
a=0;//     invoke-direct {v2, p0, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 188
a=0;//     .local v2, "smscmIntent":Landroid/content/Intent;
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     const-string v7, "latestchannel"
a=0;// 
a=0;//     invoke-virtual {v2, v7, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 189
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 190
a=0;//     .end local v2    # "smscmIntent":Landroid/content/Intent;
a=0;//     :cond_4
a=0;//     #v2=(Uninit);v7=(Integer);v8=(Uninit);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->liantonglayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v7}, Landroid/widget/RelativeLayout;->getId()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ne v1, v7, :cond_5
a=0;// 
a=0;//     .line 191
a=0;//     iput v11, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchannel:I
a=0;// 
a=0;//     .line 192
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latest_channel_tv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v8, "\u8054\u901a\u5145\u503c"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 193
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->rechargeIcon:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$drawable;->liantong_icon:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 194
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     iget v8, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchannel:I
a=0;// 
a=0;//     invoke-static {p0, v7, v8}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChannel(Landroid/content/Context;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 195
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     const-string v8, "\u8054\u901a\u5145\u503c"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v7, v8}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChanneltv(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 196
a=0;//     new-instance v4, Landroid/content/Intent;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v7, Lcom/twocloo/com/cn/activitys/RechargeSMSCUActivity;
a=0;// 
a=0;//     invoke-direct {v4, p0, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 197
a=0;//     .local v4, "smscuIntent":Landroid/content/Intent;
a=0;//     #v4=(Reference,Landroid/content/Intent;);
a=0;//     const-string v7, "latestchannel"
a=0;// 
a=0;//     invoke-virtual {v4, v7, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 198
a=0;//     invoke-virtual {p0, v4}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 199
a=0;//     .end local v4    # "smscuIntent":Landroid/content/Intent;
a=0;//     :cond_5
a=0;//     #v4=(Uninit);v7=(Integer);v8=(Uninit);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->dianxinlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v7}, Landroid/widget/RelativeLayout;->getId()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ne v1, v7, :cond_6
a=0;// 
a=0;//     .line 200
a=0;//     iput v12, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchannel:I
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latest_channel_tv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v8, "\u7535\u4fe1\u5145\u503c"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 202
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->rechargeIcon:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$drawable;->dianxin_icon:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 203
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     iget v8, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchannel:I
a=0;// 
a=0;//     invoke-static {p0, v7, v8}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChannel(Landroid/content/Context;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 204
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     const-string v8, "\u7535\u4fe1\u5145\u503c"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v7, v8}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChanneltv(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 205
a=0;//     new-instance v3, Landroid/content/Intent;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v7, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;
a=0;// 
a=0;//     invoke-direct {v3, p0, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 206
a=0;//     .local v3, "smsctIntent":Landroid/content/Intent;
a=0;//     #v3=(Reference,Landroid/content/Intent;);
a=0;//     const-string v7, "latestchannel"
a=0;// 
a=0;//     invoke-virtual {v3, v7, v12}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 207
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 208
a=0;//     .end local v3    # "smsctIntent":Landroid/content/Intent;
a=0;//     :cond_6
a=0;//     #v3=(Uninit);v7=(Integer);v8=(Uninit);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->wechatlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v7}, Landroid/widget/RelativeLayout;->getId()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ne v1, v7, :cond_7
a=0;// 
a=0;//     .line 209
a=0;//     iput v13, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchannel:I
a=0;// 
a=0;//     .line 210
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latest_channel_tv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v8, "\u5fae\u4fe1\u5145\u503c"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 211
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->rechargeIcon:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$drawable;->weixin_icon:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 212
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     iget v8, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchannel:I
a=0;// 
a=0;//     invoke-static {p0, v7, v8}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChannel(Landroid/content/Context;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 213
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     const-string v8, "\u5fae\u4fe1\u5145\u503c"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v7, v8}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChanneltv(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 214
a=0;//     new-instance v5, Landroid/content/Intent;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v7, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;
a=0;// 
a=0;//     invoke-direct {v5, p0, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 215
a=0;//     .local v5, "wechatIntent":Landroid/content/Intent;
a=0;//     #v5=(Reference,Landroid/content/Intent;);
a=0;//     const-string v7, "latestchannel"
a=0;// 
a=0;//     invoke-virtual {v5, v7, v13}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 216
a=0;//     invoke-virtual {p0, v5}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 217
a=0;//     .end local v5    # "wechatIntent":Landroid/content/Intent;
a=0;//     :cond_7
a=0;//     #v5=(Uninit);v7=(Integer);v8=(Uninit);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->wangyinlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v7}, Landroid/widget/RelativeLayout;->getId()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ne v1, v7, :cond_0
a=0;// 
a=0;//     .line 218
a=0;//     const/4 v7, 0x7
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     iput v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchannel:I
a=0;// 
a=0;//     .line 219
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latest_channel_tv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v8, "\u94f6\u8054\u5145\u503c"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->rechargeIcon:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$drawable;->bank_icon:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 221
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     iget v8, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchannel:I
a=0;// 
a=0;//     invoke-static {p0, v7, v8}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChannel(Landroid/content/Context;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 222
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     const-string v8, "\u94f6\u8054\u5145\u503c"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v7, v8}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChanneltv(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 223
a=0;//     new-instance v6, Landroid/content/Intent;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v7, Lcom/twocloo/com/cn/activitys/RechargeWangyinActivity;
a=0;// 
a=0;//     invoke-direct {v6, p0, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 224
a=0;//     .local v6, "wyIntent":Landroid/content/Intent;
a=0;//     #v6=(Reference,Landroid/content/Intent;);
a=0;//     const-string v7, "latestchannel"
a=0;// 
a=0;//     const/4 v8, 0x7
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-virtual {v6, v7, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 225
a=0;//     invoke-virtual {p0, v6}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 3
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 55
a=0;//     sget v1, Lcom/twocloo/com/cn/R$layout;->recharge_way_layout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 56
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->add(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 57
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 58
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 59
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 60
a=0;//     .local v0, "token":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->initview()V
a=0;// 
a=0;//     .line 65
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 322
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 323
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 324
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->remove(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 325
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 315
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 316
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageEnd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 317
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onPause(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 318
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 286
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 287
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/common/LocalStore;->getRechargeChanneltv(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestchannelname:Ljava/lang/String;
a=0;// 
a=0;//     .line 288
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->setLatestChannel()V
a=0;// 
a=0;//     .line 289
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageStart(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 290
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 291
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 292
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->titlelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 293
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->alipaylayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 294
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->yidonglayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 295
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->liantonglayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 296
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->dianxinlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 297
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->wechatlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 298
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->wangyinlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 299
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestusechannellayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 300
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->line1:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setNightSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 301
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->line2:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setNightSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 302
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->line3:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setNightSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 303
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->line4:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setNightSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 304
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->line5:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setNightSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 305
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->line6:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setNightSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 306
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->wyline:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setNightSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 307
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->linetop:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setNightSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 308
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->linebottom:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setNightSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 309
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->latestlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 310
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;->channellisttv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 311
a=0;//     return-void
a=0;// .end method
}}
