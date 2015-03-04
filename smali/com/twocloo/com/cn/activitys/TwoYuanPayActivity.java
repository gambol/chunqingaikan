package com.twocloo.com.cn.activitys; class TwoYuanPayActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "TwoYuanPayActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final TAG:Ljava/lang/String; = "TwoYuanPayActivity"
a=0;// 
a=0;// .field public static articleid:Ljava/lang/String;
a=0;// 
a=0;// .field private static chapterCount:I
a=0;// 
a=0;// .field public static chapterId:Ljava/lang/String;
a=0;// 
a=0;// .field private static ctx:Landroid/content/Context;
a=0;// 
a=0;// .field public static purchase:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;// .field private begintv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private booknametv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private cmlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private ctlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private culayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private currentChapterInfo:Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;// .field private dianxintv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private endtv:Landroid/widget/TextView;
a=0;// 
a=0;// .field handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private liantongtv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private line:Landroid/view/View;
a=0;// 
a=0;// .field private mListener:Lcom/twocloo/com/cn/ydmm/IAPListener;
a=0;// 
a=0;// .field private mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private moreRechargeBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private orderBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private orderid:Ljava/lang/String;
a=0;// 
a=0;// .field private payHelper:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;// .field paymentListener:Lcom/ctu/wo/sdk/Payment$Result;
a=0;// 
a=0;// .field private rechargeInfo:Ljava/lang/String;
a=0;// 
a=0;// .field private tag:Ljava/lang/String;
a=0;// 
a=0;// .field private telEdit:Landroid/widget/EditText;
a=0;// 
a=0;// .field private title:Ljava/lang/String;
a=0;// 
a=0;// .field private titlebarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private titletv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private totalchaptertv:Landroid/widget/TextView;
a=0;// 
a=0;// .field twoyuanOrderTask:Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;
a=0;// 
a=0;// .field private yidongtv:Landroid/widget/TextView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     const/16 v0, 0xf
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     sput v0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->chapterCount:I
a=0;// 
a=0;//     .line 480
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 81
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 379
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$2;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$2;-><init>(Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$2;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->paymentListener:Lcom/ctu/wo/sdk/Payment$Result;
a=0;// 
a=0;//     .line 56
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->rechargeInfo:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->rechargeInfo:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     sput p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->chapterCount:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 122
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->payInfoSetting()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private buy(Ljava/lang/String;)V
a=0;//     .locals 5
a=0;//     .param p1, "tag"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 307
a=0;//     #v4=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v3, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 308
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {p0, v2, v4}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 342
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 311
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);v3=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 312
a=0;//     const-string v2, "\u8bf7\u9009\u62e9\u8fd0\u8425\u5546"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v2, v4}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 315
a=0;//     :cond_2
a=0;//     #v2=(Boolean);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_7
a=0;// 
a=0;//     .line 316
a=0;//     const-string v2, "yidong"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 318
a=0;//     const-string v2, "30000842102801"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->mListener:Lcom/twocloo/com/cn/ydmm/IAPListener;
a=0;// 
a=0;//     invoke-virtual {p0, p0, v2, v3}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->order(Landroid/content/Context;Ljava/lang/String;Lmm/purchasesdk/OnPurchaseListener;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 319
a=0;//     :cond_3
a=0;//     #v2=(Boolean);
a=0;//     const-string v2, "liantong"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     .line 320
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->telEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/EditText;);
a=0;//     invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 321
a=0;//     .local v0, "mobile":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 322
a=0;//     const-string v2, "\u8bf7\u8f93\u5165\u6b63\u786e\u7684\u624b\u673a\u53f7"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v2, v4}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 325
a=0;//     :cond_4
a=0;//     #v2=(Boolean);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/Util;->isChinaUnionPhoneNo(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_5
a=0;// 
a=0;//     .line 326
a=0;//     const-string v2, "\u8bf7\u8f93\u5165\u8054\u901a\u53f7\u6bb5\u7684\u624b\u673a\u53f7"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v2, v4}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 329
a=0;//     :cond_5
a=0;//     #v2=(Boolean);
a=0;//     const-string v2, "\u6b63\u5728\u652f\u4ed8\u4e2d..."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v2, v4}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 330
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->createOrderid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->orderid:Ljava/lang/String;
a=0;// 
a=0;//     .line 331
a=0;//     new-instance v1, Lcom/ctu/wo/sdk/Payment;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/ctu/wo/sdk/Payment;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->paymentListener:Lcom/ctu/wo/sdk/Payment$Result;
a=0;// 
a=0;//     invoke-direct {v1, p0, v2}, Lcom/ctu/wo/sdk/Payment;-><init>(Landroid/app/Activity;Lcom/ctu/wo/sdk/Payment$Result;)V
a=0;// 
a=0;//     .line 333
a=0;//     .local v1, "payment":Lcom/ctu/wo/sdk/Payment;
a=0;//     #v1=(Reference,Lcom/ctu/wo/sdk/Payment;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->orderid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0, v1, v0, v2}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->liantongOrder(Lcom/ctu/wo/sdk/Payment;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 334
a=0;//     .end local v0    # "mobile":Ljava/lang/String;
a=0;//     .end local v1    # "payment":Lcom/ctu/wo/sdk/Payment;
a=0;//     :cond_6
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     const-string v2, "dianxin"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 336
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->dianxinOrder()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 339
a=0;//     :cond_7
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "\u8bf7\u5148\u767b\u5f55."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v2, v4}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static buySuccess()V
a=0;//     .locals 15
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     .line 542
a=0;//     #v14=(Null);
a=0;//     sget-object v11, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     #v11=(Reference,Landroid/content/Context;);
a=0;//     const-string v12, "\u8d2d\u4e70\u6210\u529f."
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v11, v12, v14}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 543
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 544
a=0;//     .local v10, "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     #v10=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 545
a=0;//     .local v9, "uid":Ljava/lang/String;
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     sget-object v11, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->articleid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v11}, Lcom/twocloo/com/cn/common/Util;->read(Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 546
a=0;//     .local v7, "mulu":Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     new-instance v4, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 547
a=0;//     .local v4, "ids":Ljava/lang/StringBuffer;
a=0;//     #v4=(Reference,Ljava/lang/StringBuffer;);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getMulist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 548
a=0;//     .local v5, "infos":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/Chapterinfo;>;"
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 549
a=0;//     .local v2, "findFirst":Z
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Boolean);v12=(Conflicted);v13=(Conflicted);
a=0;//     invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-nez v12, :cond_4
a=0;// 
a=0;//     .line 562
a=0;//     :cond_1
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuffer;->length()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     if-lez v11, :cond_2
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     const-string v12, ","
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-eqz v11, :cond_2
a=0;// 
a=0;//     .line 563
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuffer;->length()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     add-int/lit8 v11, v11, -0x1
a=0;// 
a=0;//     invoke-virtual {v4, v11}, Ljava/lang/StringBuffer;->deleteCharAt(I)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 565
a=0;//     :cond_2
a=0;//     #v12=(Conflicted);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 567
a=0;//     .local v3, "id":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v8, Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;// 
a=0;//     #v8=(UninitRef,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     sget-object v11, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     #v11=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v8, v11}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 568
a=0;//     .local v8, "rt":Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->open()V
a=0;// 
a=0;//     .line 569
a=0;//     sget-object v11, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->articleid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v8, v9, v11, v14, v3}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->insertRecode(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 570
a=0;//     .local v1, "db_id":I
a=0;//     #v1=(Integer);
a=0;//     const-string v11, "result"
a=0;// 
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "uid="
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     const-string v13, "||db_id="
a=0;// 
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-static {v11, v12}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 571
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->close()V
a=0;// 
a=0;//     .line 572
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 573
a=0;//     #v8=(Null);
a=0;//     new-instance v6, Landroid/content/Intent;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/content/Intent;);
a=0;//     sget-object v11, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     const-class v12, Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-direct {v6, v11, v12}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 574
a=0;//     .local v6, "intent":Landroid/content/Intent;
a=0;//     #v6=(Reference,Landroid/content/Intent;);
a=0;//     const-string v11, "aid"
a=0;// 
a=0;//     sget-object v12, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->articleid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v11, v12}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 575
a=0;//     const-string v11, "textid"
a=0;// 
a=0;//     sget-object v12, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->chapterId:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v11, v12}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 576
a=0;//     const-string v11, "isVip"
a=0;// 
a=0;//     const/4 v12, 0x1
a=0;// 
a=0;//     #v12=(One);
a=0;//     invoke-virtual {v6, v11, v12}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 577
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuffer;->length()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     if-lez v11, :cond_3
a=0;// 
a=0;//     .line 578
a=0;//     const-string v11, "textIds"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     const-string v12, ","
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v12}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v6, v11, v12}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 580
a=0;//     :cond_3
a=0;//     #v11=(Conflicted);v12=(Conflicted);
a=0;//     const/high16 v11, 0x4000000
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {v6, v11}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 581
a=0;//     sget-object v11, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     #v11=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v11, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 582
a=0;//     sget-object v11, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     check-cast v11, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v11}, Landroid/app/Activity;->finish()V
a=0;// 
a=0;//     .line 584
a=0;//     return-void
a=0;// 
a=0;//     .line 549
a=0;//     .end local v1    # "db_id":I
a=0;//     .end local v3    # "id":Ljava/lang/String;
a=0;//     .end local v6    # "intent":Landroid/content/Intent;
a=0;//     .end local v8    # "rt":Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;//     :cond_4
a=0;//     #v1=(Uninit);v3=(Uninit);v6=(Uninit);v8=(Uninit);v12=(Boolean);v13=(Conflicted);
a=0;//     invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     .line 550
a=0;//     .local v0, "ci":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     sget v12, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->chapterCount:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-eqz v12, :cond_1
a=0;// 
a=0;//     .line 553
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     sget-object v13, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->chapterId:Ljava/lang/String;
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_5
a=0;// 
a=0;//     .line 554
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 556
a=0;//     :cond_5
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 557
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v12}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 558
a=0;//     const-string v12, ","
a=0;// 
a=0;//     invoke-virtual {v4, v12}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 559
a=0;//     sget v12, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->chapterCount:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     add-int/lit8 v12, v12, -0x1
a=0;// 
a=0;//     sput v12, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->chapterCount:I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private createOrderid()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 472
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
a=0;//     .line 473
a=0;//     .local v0, "orderid":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private dianxinOrder()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 364
a=0;//     const-string v0, "\u6b63\u5728\u652f\u4ed8\u4e2d..."
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v0, v1}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 365
a=0;//     invoke-static {p0}, Lcom/ffcs/inapppaylib/PayHelper;->getInstance(Landroid/content/Context;)Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->payHelper:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     .line 366
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->payHelper:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     const-string v1, "291001600000036913"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "4d265c3134c5cc474e7ce30e1795200f"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/ffcs/inapppaylib/PayHelper;->init(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 367
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->payHelper:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     const/16 v1, 0x1f40
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-virtual {v0, v1}, Lcom/ffcs/inapppaylib/PayHelper;->settimeout(I)V
a=0;// 
a=0;//     .line 368
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->createOrderid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->orderid:Ljava/lang/String;
a=0;// 
a=0;//     .line 369
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->payHelper:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     const-string v1, "90000432"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0, p0, v1, v2}, Lcom/ffcs/inapppaylib/PayHelper;->pay(Landroid/app/Activity;Ljava/lang/String;Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 370
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private initMM()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 484
a=0;//     new-instance v2, Lcom/twocloo/com/cn/ydmm/IAPHandler;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/ydmm/IAPHandler;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/ydmm/IAPHandler;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 489
a=0;//     .local v2, "iapHandler":Lcom/twocloo/com/cn/ydmm/IAPHandler;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/ydmm/IAPHandler;);
a=0;//     new-instance v3, Lcom/twocloo/com/cn/ydmm/IAPListener;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/ydmm/IAPListener;);
a=0;//     invoke-direct {v3, p0, v2}, Lcom/twocloo/com/cn/ydmm/IAPListener;-><init>(Landroid/content/Context;Lcom/twocloo/com/cn/ydmm/IAPHandler;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/ydmm/IAPListener;);
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->mListener:Lcom/twocloo/com/cn/ydmm/IAPListener;
a=0;// 
a=0;//     .line 493
a=0;//     invoke-static {}, Lmm/purchasesdk/Purchase;->getInstance()Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sput-object v3, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->purchase:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     .line 499
a=0;//     :try_start_0
a=0;//     sget-object v3, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->purchase:Lmm/purchasesdk/Purchase;
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
a=0;//     .line 509
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     sget-object v3, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->purchase:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->mListener:Lcom/twocloo/com/cn/ydmm/IAPListener;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/ydmm/IAPListener;);
a=0;//     invoke-virtual {v3, p0, v4}, Lmm/purchasesdk/Purchase;->init(Landroid/content/Context;Lmm/purchasesdk/OnPurchaseListener;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 515
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 501
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 502
a=0;//     .local v1, "e1":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 511
a=0;//     .end local v1    # "e1":Ljava/lang/Exception;
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 512
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private initviews()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 196
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->mainlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 197
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->titlebarlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->titlebarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 198
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->back:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageButton;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     .line 199
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->smspaybtn:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->orderBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 200
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->morerechargebtn:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->moreRechargeBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 201
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbar:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->titletv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 202
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->title_name_:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->booknametv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 203
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->begin_inteval_:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->begintv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 204
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->end_inteval_:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->endtv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 205
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->zhang_tv:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->totalchaptertv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 206
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->line:Landroid/view/View;
a=0;// 
a=0;//     .line 207
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->input_edit:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/EditText;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->telEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     .line 208
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->ydlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->cmlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 209
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->ltlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->culayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 210
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->dxlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->ctlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 211
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->yidong:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->yidongtv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 212
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->liantong:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->liantongtv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 213
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->dianxin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->dianxintv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->titletv:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v1, "2\u5143\u8d2d\u4e70"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 216
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->titletv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     .line 217
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V
a=0;// 
a=0;//     .line 218
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 219
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->orderBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->moreRechargeBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 221
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->cmlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 222
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->culayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 223
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->ctlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 225
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "title"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->title:Ljava/lang/String;
a=0;// 
a=0;//     .line 226
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "aid"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->articleid:Ljava/lang/String;
a=0;// 
a=0;//     .line 227
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "textid"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->chapterId:Ljava/lang/String;
a=0;// 
a=0;//     .line 229
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->booknametv:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->title:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 230
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private liantongOrder(Lcom/ctu/wo/sdk/Payment;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 6
a=0;//     .param p1, "payment"    # Lcom/ctu/wo/sdk/Payment;
a=0;//     .param p2, "tele"    # Ljava/lang/String;
a=0;//     .param p3, "orderId"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 357
a=0;//     const/16 v1, 0x1d4e
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const-string v5, "a1b2c3"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Lcom/ctu/wo/sdk/Payment;);
a=0;//     move-object v2, p3
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/ctu/wo/sdk/Payment;->Pay(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 358
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private payInfoSetting()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     sget-object v5, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->articleid:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/common/Util;->read(Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 124
a=0;//     .local v4, "mulu":Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 147
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 127
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getMulist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 128
a=0;//     .local v3, "infos":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/Chapterinfo;>;"
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 129
a=0;//     .local v1, "count":I
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 130
a=0;//     .local v2, "findFirst":Z
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Boolean);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     .line 146
a=0;//     :goto_2
a=0;//     #v6=(Conflicted);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->totalchaptertv:Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "\u7ae0"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 130
a=0;//     :cond_2
a=0;//     #v6=(Boolean);v7=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     .line 131
a=0;//     .local v0, "chapterinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 132
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     .line 134
a=0;//     :cond_3
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     sget-object v7, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->chapterId:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     .line 135
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->begintv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v6=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getSubhead()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 136
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->currentChapterInfo:Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     .line 137
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 138
a=0;//     #v2=(One);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     .line 139
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 140
a=0;//     :cond_4
a=0;//     #v2=(Boolean);v6=(Boolean);
a=0;//     sget v6, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->chapterCount:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ne v1, v6, :cond_1
a=0;// 
a=0;//     .line 141
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->endtv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getSubhead()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 5
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     .line 260
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 261
a=0;//     .local v0, "id":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v2}, Landroid/widget/ImageButton;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v0, v2, :cond_1
a=0;// 
a=0;//     .line 262
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->finish()V
a=0;// 
a=0;//     .line 299
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Integer);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 263
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Integer);v3=(PosByte);v4=(Uninit);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->orderBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v2}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v0, v2, :cond_2
a=0;// 
a=0;//     .line 265
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->tag:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v2}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->buy(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 267
a=0;//     :cond_2
a=0;//     #v2=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->moreRechargeBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v2}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v0, v2, :cond_3
a=0;// 
a=0;//     .line 268
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 269
a=0;//     .local v1, "rechargeIntent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 270
a=0;//     .end local v1    # "rechargeIntent":Landroid/content/Intent;
a=0;//     :cond_3
a=0;//     #v1=(Uninit);v2=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->cmlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v2}, Landroid/widget/LinearLayout;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v0, v2, :cond_4
a=0;// 
a=0;//     .line 271
a=0;//     const-string v2, "yidong"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->tag:Ljava/lang/String;
a=0;// 
a=0;//     .line 272
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->telEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/EditText;->setVisibility(I)V
a=0;// 
a=0;//     .line 273
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->cmlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 274
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->culayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 275
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->ctlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 276
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->yidongtv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v4, Lcom/twocloo/com/cn/R$color;->red_text:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 277
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->liantongtv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v4, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 278
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->dianxintv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v4, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 279
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->initMM()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 280
a=0;//     :cond_4
a=0;//     #v2=(Integer);v3=(PosByte);v4=(Uninit);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->culayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v2}, Landroid/widget/LinearLayout;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v0, v2, :cond_5
a=0;// 
a=0;//     .line 281
a=0;//     const-string v2, "liantong"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->tag:Ljava/lang/String;
a=0;// 
a=0;//     .line 282
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->telEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/EditText;->setVisibility(I)V
a=0;// 
a=0;//     .line 283
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->culayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 284
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->cmlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 285
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->ctlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 286
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->liantongtv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v4, Lcom/twocloo/com/cn/R$color;->red_text:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 287
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->yidongtv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v4, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 288
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->dianxintv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v4, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 289
a=0;//     :cond_5
a=0;//     #v2=(Integer);v3=(PosByte);v4=(Uninit);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->ctlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v2}, Landroid/widget/LinearLayout;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     .line 290
a=0;//     const-string v2, "dianxin"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->tag:Ljava/lang/String;
a=0;// 
a=0;//     .line 291
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->telEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/EditText;->setVisibility(I)V
a=0;// 
a=0;//     .line 292
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->ctlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_pressed:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 293
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->culayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 294
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->cmlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$drawable;->button_light_gray_shape_normal:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 295
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->dianxintv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v4, Lcom/twocloo/com/cn/R$color;->red_text:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 296
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->liantongtv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v4, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 297
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->yidongtv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v4, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 109
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->two_yuan_pay_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 110
a=0;//     sput-object p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     .line 111
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->add(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 112
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->initviews()V
a=0;// 
a=0;//     .line 115
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;-><init>(Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->twoyuanOrderTask:Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;
a=0;// 
a=0;//     .line 116
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->twoyuanOrderTask:Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     .line 117
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 253
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 254
a=0;//     invoke-static {p0}, Lcom/ffcs/inapppaylib/PayHelper;->getInstance(Landroid/content/Context;)Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/PayHelper;);
a=0;//     invoke-virtual {v0}, Lcom/ffcs/inapppaylib/PayHelper;->quitPay()V
a=0;// 
a=0;//     .line 255
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->remove(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 256
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 246
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 247
a=0;//     const-string v0, "TwoYuanPayActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageEnd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 248
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onPause(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 249
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 234
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 235
a=0;//     const-string v0, "TwoYuanPayActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageStart(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 236
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 237
a=0;//     sput-object p0, Lcom/twocloo/com/cn/common/CloseActivity;->curActivity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 239
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 240
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->titlebarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 241
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->line:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setxuxianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 242
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
a=0;//     .line 525
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->purchase:Lmm/purchasesdk/Purchase;
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
a=0;//     .line 529
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 526
a=0;//     :catch_0
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 527
a=0;//     .local v7, "e":Ljava/lang/Exception;
a=0;//     #v7=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v7}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
