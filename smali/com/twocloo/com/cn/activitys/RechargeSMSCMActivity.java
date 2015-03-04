package com.twocloo.com.cn.activitys; class RechargeSMSCMActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "RechargeSMSCMActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final ITEM0:I = 0x1
a=0;// 
a=0;// .field public static final ITEM1:I = 0x2
a=0;// 
a=0;// .field public static final ITEM2:I = 0x3
a=0;// 
a=0;// .field private static final PAYCODE:Ljava/lang/String; = "Paycode"
a=0;// 
a=0;// .field private static final PRODUCTNUM:Ljava/lang/String; = "ProductNUM"
a=0;// 
a=0;// .field private static final PRODUCT_NUM:I = 0x1
a=0;// 
a=0;// .field public static purchase:Lmm/purchasesdk/Purchase;
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
a=0;// .field private kefu:Landroid/widget/TextView;
a=0;// 
a=0;// .field private mListener:Lcom/twocloo/com/cn/ydmm/IAPListener;
a=0;// 
a=0;// .field private mPaycode:Ljava/lang/String;
a=0;// 
a=0;// .field private mProductNum:I
a=0;// 
a=0;// .field private mProgressDialog:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private money:I
a=0;// 
a=0;// .field private tenBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private tishitv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private twoBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private wenxintishi:Landroid/widget/TextView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;);
a=0;//     const-string v0, "RechargeSMSCMActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 40
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->money:I
a=0;// 
a=0;//     .line 54
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->mProductNum:I
a=0;// 
a=0;//     .line 35
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private initMM()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     new-instance v2, Lcom/twocloo/com/cn/ydmm/IAPHandler;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/ydmm/IAPHandler;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/ydmm/IAPHandler;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 87
a=0;//     .local v2, "iapHandler":Lcom/twocloo/com/cn/ydmm/IAPHandler;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/ydmm/IAPHandler;);
a=0;//     new-instance v3, Lcom/twocloo/com/cn/ydmm/IAPListener;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/ydmm/IAPListener;);
a=0;//     invoke-direct {v3, p0, v2}, Lcom/twocloo/com/cn/ydmm/IAPListener;-><init>(Landroid/content/Context;Lcom/twocloo/com/cn/ydmm/IAPHandler;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/ydmm/IAPListener;);
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->mListener:Lcom/twocloo/com/cn/ydmm/IAPListener;
a=0;// 
a=0;//     .line 91
a=0;//     invoke-static {}, Lmm/purchasesdk/Purchase;->getInstance()Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sput-object v3, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->purchase:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     .line 97
a=0;//     :try_start_0
a=0;//     sget-object v3, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->purchase:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     const-string v4, "300008421028"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "C56C3358C8FDBE98"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v5}, Lmm/purchasesdk/Purchase;->setAppInfo(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 107
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     sget-object v3, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->purchase:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->mListener:Lcom/twocloo/com/cn/ydmm/IAPListener;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/ydmm/IAPListener;);
a=0;//     invoke-virtual {v3, v4, v5}, Lmm/purchasesdk/Purchase;->init(Landroid/content/Context;Lmm/purchasesdk/OnPurchaseListener;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 113
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 99
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 100
a=0;//     .local v1, "e1":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 109
a=0;//     .end local v1    # "e1":Ljava/lang/Exception;
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 110
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private recharge(I)V
a=0;//     .locals 2
a=0;//     .param p1, "money"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 249
a=0;//     sparse-switch p1, :sswitch_data_0
a=0;// 
a=0;//     .line 268
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 251
a=0;//     :sswitch_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const-string v0, "30000842102801"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->mListener:Lcom/twocloo/com/cn/ydmm/IAPListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/ydmm/IAPListener;);
a=0;//     invoke-virtual {p0, p0, v0, v1}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->order(Landroid/content/Context;Ljava/lang/String;Lmm/purchasesdk/OnPurchaseListener;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 254
a=0;//     :sswitch_1
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const-string v0, "30000842102802"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->mListener:Lcom/twocloo/com/cn/ydmm/IAPListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/ydmm/IAPListener;);
a=0;//     invoke-virtual {p0, p0, v0, v1}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->order(Landroid/content/Context;Ljava/lang/String;Lmm/purchasesdk/OnPurchaseListener;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 257
a=0;//     :sswitch_2
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const-string v0, "30000842102803"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->mListener:Lcom/twocloo/com/cn/ydmm/IAPListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/ydmm/IAPListener;);
a=0;//     invoke-virtual {p0, p0, v0, v1}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->order(Landroid/content/Context;Ljava/lang/String;Lmm/purchasesdk/OnPurchaseListener;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 260
a=0;//     :sswitch_3
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const-string v0, "30000842102804"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->mListener:Lcom/twocloo/com/cn/ydmm/IAPListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/ydmm/IAPListener;);
a=0;//     invoke-virtual {p0, p0, v0, v1}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->order(Landroid/content/Context;Ljava/lang/String;Lmm/purchasesdk/OnPurchaseListener;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 263
a=0;//     :sswitch_4
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const-string v0, "30000842102805"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->mListener:Lcom/twocloo/com/cn/ydmm/IAPListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/ydmm/IAPListener;);
a=0;//     invoke-virtual {p0, p0, v0, v1}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->order(Landroid/content/Context;Ljava/lang/String;Lmm/purchasesdk/OnPurchaseListener;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 249
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x2 -> :sswitch_0
a=0;//         0x5 -> :sswitch_1
a=0;//         0xa -> :sswitch_2
a=0;//         0x14 -> :sswitch_3
a=0;//         0x1e -> :sswitch_4
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method private setTopBar()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->topbar_layout:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 120
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->mainlayout:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 121
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->goPay:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->gopayBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 122
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->two:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->twoBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 123
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->five:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 124
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->ten:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 125
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->twenty:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 126
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->thirty:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 128
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->tishitv:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->tishitv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 129
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->wenxintishi:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->wenxintishi:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 130
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->kefu:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->kefu:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 132
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->recharge_item_tv:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 133
a=0;//     .local v1, "rechargetv":Landroid/widget/TextView;
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->recharge_item_icon:I
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 134
a=0;//     .local v0, "icon":Landroid/widget/ImageView;
a=0;//     const-string v3, "\u79fb\u52a8\u5145\u503c"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 135
a=0;//     sget v3, Lcom/twocloo/com/cn/R$drawable;->yidong_icon:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 137
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->back:I
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/widget/ImageButton;
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     .line 138
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageButton;->setVisibility(I)V
a=0;// 
a=0;//     .line 139
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->topbar:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 140
a=0;//     .local v2, "title_tv":Landroid/widget/TextView;
a=0;//     const-string v3, "\u79fb\u52a8\u5145\u503c"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 141
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 143
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v3, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 144
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->gopayBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v3, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->twoBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v3, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 146
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v3, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 147
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v3, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 148
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v3, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 149
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v3, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 150
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private showProgressDialog()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 298
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->mProgressDialog:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 299
a=0;//     new-instance v0, Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/ProgressDialog;);
a=0;//     invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->mProgressDialog:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 300
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->mProgressDialog:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V
a=0;// 
a=0;//     .line 301
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->mProgressDialog:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     const-string v1, "\u8bf7\u7a0d\u5019....."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 303
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->mProgressDialog:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 304
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->mProgressDialog:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V
a=0;// 
a=0;//     .line 306
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public dismissProgressDialog()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 309
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->mProgressDialog:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->mProgressDialog:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 310
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->mProgressDialog:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 312
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 4
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 153
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 154
a=0;//     .local v0, "id":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v1}, Landroid/widget/ImageButton;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 155
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->finish()V
a=0;// 
a=0;//     .line 241
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 156
a=0;//     :cond_1
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->twoBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 157
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->money:I
a=0;// 
a=0;//     .line 158
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->twoBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 159
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 160
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 161
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 162
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 164
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->twoBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 165
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 166
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 167
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 168
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 170
a=0;//     :cond_2
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     .line 171
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->money:I
a=0;// 
a=0;//     .line 172
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 173
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->twoBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 175
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 176
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 178
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 179
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->twoBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 180
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 181
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 184
a=0;//     :cond_3
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_4
a=0;// 
a=0;//     .line 185
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->money:I
a=0;// 
a=0;//     .line 186
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 187
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->twoBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 188
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 189
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 190
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 192
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 193
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->twoBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 198
a=0;//     :cond_4
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_5
a=0;// 
a=0;//     .line 199
a=0;//     const/16 v1, 0x14
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->money:I
a=0;// 
a=0;//     .line 200
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->twoBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 202
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 203
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 204
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 206
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 207
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->twoBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 208
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 209
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 210
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 212
a=0;//     :cond_5
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_6
a=0;// 
a=0;//     .line 213
a=0;//     const/16 v1, 0x1e
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->money:I
a=0;// 
a=0;//     .line 214
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->twoBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 216
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 217
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 218
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->thirtyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 221
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->twoBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 222
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->fiveBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 223
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->tenBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 224
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->twentyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 226
a=0;//     :cond_6
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->gopayBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 227
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
a=0;//     .line 228
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 231
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
a=0;//     .line 232
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->money:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_8
a=0;// 
a=0;//     .line 233
a=0;//     const-string v1, "\u8bf7\u9009\u62e9\u5145\u503c\u91d1\u989d."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 236
a=0;//     :cond_8
a=0;//     #v1=(Integer);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->money:I
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->recharge(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 238
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
a=0;//     .line 59
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 60
a=0;//     sget v2, Lcom/twocloo/com/cn/R$layout;->recharge_sms_cm_layout:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->setContentView(I)V
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
a=0;//     invoke-virtual {p0, v2, v3}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 63
a=0;//     iput-object p0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 66
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->initMM()V
a=0;// 
a=0;//     .line 68
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->setTopBar()V
a=0;// 
a=0;//     .line 70
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
a=0;//     .line 71
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 72
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
a=0;//     .line 73
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
a=0;//     .line 74
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\u79fb\u52a8\u5145\u503c"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v2, v3}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChanneltv(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 76
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
a=0;//     .line 352
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 353
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->remove(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 354
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 344
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 345
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageEnd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 346
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onPause(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 347
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 348
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 330
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 331
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageStart(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 332
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 333
a=0;//     sput-object p0, Lcom/twocloo/com/cn/common/CloseActivity;->curActivity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 334
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 335
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 336
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->tishitv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTitleItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 337
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->wenxintishi:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTitleItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 338
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->kefu:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTitleItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 339
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->gopayBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setRedButtonbackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 340
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public order(Landroid/content/Context;Ljava/lang/String;Lmm/purchasesdk/OnPurchaseListener;)V
a=0;//     .locals 8
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "paycode"    # Ljava/lang/String;
a=0;//     .param p3, "listener"    # Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 323
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;->purchase:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/Purchase;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const-string v4, "\u79fb\u52a8\u5145\u503c"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v6, p3
a=0;// 
a=0;//     #v6=(Reference,Lmm/purchasesdk/OnPurchaseListener;);
a=0;//     invoke-virtual/range {v0 .. v6}, Lmm/purchasesdk/Purchase;->order(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;ZLmm/purchasesdk/OnPurchaseListener;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 327
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 324
a=0;//     :catch_0
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 325
a=0;//     .local v7, "e":Ljava/lang/Exception;
a=0;//     #v7=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v7}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
