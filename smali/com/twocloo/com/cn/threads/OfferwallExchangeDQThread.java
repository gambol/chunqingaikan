package com.twocloo.com.cn.threads; class OfferwallExchangeDQThread { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "OfferwallExchangeDQThread.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private context:Landroid/content/Context;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private mOfferwalltype:I
a=0;// 
a=0;// .field private money:I
a=0;// 
a=0;// .field private myPointBalance:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;IIILandroid/os/Handler;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "money"    # I
a=0;//     .param p3, "myPointBalance"    # I
a=0;//     .param p4, "offerwalltype"    # I
a=0;//     .param p5, "handler"    # Landroid/os/Handler;
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 48
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 49
a=0;//     iput p2, p0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->money:I
a=0;// 
a=0;//     .line 50
a=0;//     iput p3, p0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->myPointBalance:I
a=0;// 
a=0;//     .line 51
a=0;//     iput p4, p0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->mOfferwalltype:I
a=0;// 
a=0;//     .line 52
a=0;//     iput-object p5, p0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 53
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private savePoints(II)V
a=0;//     .locals 3
a=0;//     .param p1, "type"    # I
a=0;//     .param p2, "points"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     .line 161
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 126
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 127
a=0;//     .local v0, "message":Landroid/os/Message;
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     const/16 v1, 0x270f
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 128
a=0;//     iput p2, v0, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 132
a=0;//     .end local v0    # "message":Landroid/os/Message;
a=0;//     :pswitch_1
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     new-instance v2, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread$1;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread$1;);
a=0;//     invoke-direct {v2, p0, p2}, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread$1;-><init>(Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;I)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread$1;);
a=0;//     invoke-static {v1, p2, v2}, Lcom/twocloooo/DevInit;->spendMoney(Landroid/content/Context;ILcom/twocloooo/SpendMoneyListener;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 146
a=0;//     :pswitch_2
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcn/waps/AppConnect;->getInstance(Landroid/content/Context;)Lcn/waps/AppConnect;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread$2;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread$2;);
a=0;//     invoke-direct {v2, p0, p2}, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread$2;-><init>(Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;I)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread$2;);
a=0;//     invoke-virtual {v1, p2, v2}, Lcn/waps/AppConnect;->spendPoints(ILcn/waps/UpdatePointsNotifier;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 124
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x40
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 28
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     invoke-super/range {p0 .. p0}, Ljava/lang/Thread;->run()V
a=0;// 
a=0;//     .line 58
a=0;//     new-instance v14, Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;// 
a=0;//     #v14=(UninitRef,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     #v25=(Reference,Landroid/content/Context;);
a=0;//     check-cast v25, Landroid/app/Activity;
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-direct {v14, v0}, Lcom/twocloo/com/cn/common/PhoneInfo;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 59
a=0;//     .local v14, "phone":Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;//     #v14=(Reference,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     invoke-static/range {v25 .. v25}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 60
a=0;//     .local v8, "imei":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v14}, Lcom/twocloo/com/cn/common/PhoneInfo;->getModel()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 61
a=0;//     .local v11, "model":Ljava/lang/String;
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v14}, Lcom/twocloo/com/cn/common/PhoneInfo;->getScreenPix()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     .line 62
a=0;//     .local v16, "pix":Ljava/lang/String;
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     new-instance v25, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v25=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v14}, Lcom/twocloo/com/cn/common/PhoneInfo;->getCurrentVersion()I
a=0;// 
a=0;//     move-result v26
a=0;// 
a=0;//     #v26=(Integer);
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     .line 63
a=0;//     .local v23, "versionCode":Ljava/lang/String;
a=0;//     #v23=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v25}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     sget v26, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v26}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 64
a=0;//     .local v5, "apptype":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "android"
a=0;// 
a=0;//     .line 65
a=0;//     .local v7, "clienttype":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v25}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     sget v26, Lcom/twocloo/com/cn/R$string;->insertbookid:I
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v26}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 66
a=0;//     .local v4, "aid":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     if-eqz v25, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v25}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     .line 67
a=0;//     .local v22, "uid":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v22=(Reference,Ljava/lang/String;);
a=0;//     new-instance v25, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v25=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static/range {v22 .. v22}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     #v26=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v25 .. v26}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v26, "tokentoken"
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     invoke-static/range {v25 .. v25}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     const/16 v26, 0x0
a=0;// 
a=0;//     #v26=(Null);
a=0;//     const/16 v27, 0xa
a=0;// 
a=0;//     #v27=(PosByte);
a=0;//     invoke-virtual/range {v25 .. v27}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     .line 68
a=0;//     .local v21, "token":Ljava/lang/String;
a=0;//     #v21=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v25}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     sget v26, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v26=(Integer);
a=0;//     invoke-virtual/range {v25 .. v26}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     .line 70
a=0;//     .local v18, "srcid":Ljava/lang/String;
a=0;//     #v18=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getSystemRelease()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     .line 71
a=0;//     .local v19, "systemRelease":Ljava/lang/String;
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     check-cast v25, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static/range {v25 .. v25}, Lcom/twocloo/com/cn/utils/DisplayUtil;->getScreenPix(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 72
a=0;//     .local v15, "phoneResolution":Ljava/lang/String;
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     invoke-static/range {v25 .. v25}, Lcom/twocloo/com/cn/common/Util;->getSIMOperator(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 73
a=0;//     .local v6, "carrieroperator":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     invoke-static/range {v25 .. v25}, Lcom/twocloo/com/cn/common/LocalStore;->getActivateCode(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 74
a=0;//     .local v3, "activateCode":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     invoke-static/range {v25 .. v25}, Lcom/twocloo/base/util/PhoneUtils;->getMacAddress(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 75
a=0;//     .local v10, "macAddress":Ljava/lang/String;
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     invoke-static/range {v25 .. v25}, Lcom/twocloo/com/cn/utils/CommonUtils;->getAppVersionName(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     .line 77
a=0;//     .local v24, "versionName":Ljava/lang/String;
a=0;//     #v24=(Reference,Ljava/lang/String;);
a=0;//     new-instance v25, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v25=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v26
a=0;// 
a=0;//     #v26=(LongLo);v27=(LongHi);
a=0;//     invoke-virtual/range {v25 .. v27}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     const/16 v26, 0x0
a=0;// 
a=0;//     #v26=(Null);
a=0;//     const/16 v27, 0xa
a=0;// 
a=0;//     #v27=(PosByte);
a=0;//     invoke-virtual/range {v25 .. v27}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     .line 78
a=0;//     .local v20, "timeStamp":Ljava/lang/String;
a=0;//     #v20=(Reference,Ljava/lang/String;);
a=0;//     new-instance v25, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v25=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static/range {v20 .. v20}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     #v26=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v25 .. v26}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 79
a=0;//     .local v12, "order_sn":Ljava/lang/String;
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     new-instance v25, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v25=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     new-instance v26, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v26=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static/range {v22 .. v22}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v27
a=0;// 
a=0;//     #v27=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v26 .. v27}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v26=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->money:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     const/16 v27, 0x1
a=0;// 
a=0;//     #v27=(One);
a=0;//     invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     move-object/from16 v0, v26
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->mOfferwalltype:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     const-string v27, "tokentoken"
a=0;// 
a=0;//     #v27=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     invoke-virtual/range {v26 .. v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     invoke-static/range {v26 .. v26}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     invoke-static/range {v26 .. v26}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     invoke-direct/range {v25 .. v26}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v26, "tokentoken"
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     invoke-static/range {v25 .. v25}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     .line 81
a=0;//     .local v17, "sign":Ljava/lang/String;
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     new-instance v13, Ljava/util/HashMap;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v13}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 82
a=0;//     .local v13, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     #v13=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v25, "type"
a=0;// 
a=0;//     const-string v26, "1"
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v1, v26
a=0;// 
a=0;//     invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 84
a=0;//     const-string v25, "order_sn"
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-interface {v13, v0, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 85
a=0;//     const-string v25, "sign"
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     move-object/from16 v1, v17
a=0;// 
a=0;//     invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 86
a=0;//     const-string v25, "money"
a=0;// 
a=0;//     new-instance v26, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v26=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->money:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     invoke-static/range {v27 .. v27}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v27
a=0;// 
a=0;//     #v27=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v26 .. v27}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v26=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual/range {v26 .. v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v1, v26
a=0;// 
a=0;//     invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 87
a=0;//     const-string v25, "screenpix"
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     move-object/from16 v1, v16
a=0;// 
a=0;//     invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 88
a=0;//     const-string v25, "model"
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-interface {v13, v0, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 89
a=0;//     const-string v25, "imei"
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-interface {v13, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 90
a=0;//     const-string v25, "srcid"
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     move-object/from16 v1, v18
a=0;// 
a=0;//     invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 91
a=0;//     const-string v25, "versioncode"
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 92
a=0;//     const-string v25, "pt"
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-interface {v13, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 93
a=0;//     const-string v25, "ct"
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-interface {v13, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 94
a=0;//     const-string v25, "articleid"
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-interface {v13, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 95
a=0;//     const-string v25, "userid"
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 96
a=0;//     const-string v25, "token"
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     move-object/from16 v1, v21
a=0;// 
a=0;//     invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 97
a=0;//     const-string v25, "system_release"
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     move-object/from16 v1, v19
a=0;// 
a=0;//     invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 98
a=0;//     const-string v25, "pix"
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-interface {v13, v0, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 99
a=0;//     const-string v25, "op"
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-interface {v13, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 100
a=0;//     const-string v25, "active_code"
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-interface {v13, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 101
a=0;//     const-string v25, "mac_address"
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-interface {v13, v0, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 102
a=0;//     const-string v25, "versionname"
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     move-object/from16 v1, v24
a=0;// 
a=0;//     invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 103
a=0;//     const-string v25, "v"
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 104
a=0;//     const-string v25, "offer_wall_type"
a=0;// 
a=0;//     new-instance v26, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v26=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v26 .. v26}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v26=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->mOfferwalltype:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     invoke-virtual/range {v26 .. v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v1, v26
a=0;// 
a=0;//     invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 105
a=0;//     const-string v25, "http://app.2cloo.com/user-android_ext_recharge?"
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-static {v0, v13}, Lcom/twocloo/com/cn/http/HttpComm;->post(Ljava/lang/String;Ljava/util/Map;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 106
a=0;//     .local v9, "jo":Lorg/json/JSONObject;
a=0;//     #v9=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v9, :cond_0
a=0;// 
a=0;//     .line 107
a=0;//     const-string v25, "code"
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Boolean);
a=0;//     if-nez v25, :cond_0
a=0;// 
a=0;//     const-string v25, "code"
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     const-string v26, "1"
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Boolean);
a=0;//     if-eqz v25, :cond_0
a=0;// 
a=0;//     .line 108
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->mOfferwalltype:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     #v25=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;);
a=0;//     iget v0, v0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->myPointBalance:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v26, v0
a=0;// 
a=0;//     #v26=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;);
a=0;//     move/from16 v1, v25
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v26
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->savePoints(II)V
a=0;// 
a=0;//     .line 112
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v25=(Conflicted);v26=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 66
a=0;//     .end local v3    # "activateCode":Ljava/lang/String;
a=0;//     .end local v6    # "carrieroperator":Ljava/lang/String;
a=0;//     .end local v9    # "jo":Lorg/json/JSONObject;
a=0;//     .end local v10    # "macAddress":Ljava/lang/String;
a=0;//     .end local v12    # "order_sn":Ljava/lang/String;
a=0;//     .end local v13    # "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     .end local v15    # "phoneResolution":Ljava/lang/String;
a=0;//     .end local v17    # "sign":Ljava/lang/String;
a=0;//     .end local v18    # "srcid":Ljava/lang/String;
a=0;//     .end local v19    # "systemRelease":Ljava/lang/String;
a=0;//     .end local v20    # "timeStamp":Ljava/lang/String;
a=0;//     .end local v21    # "token":Ljava/lang/String;
a=0;//     .end local v22    # "uid":Ljava/lang/String;
a=0;//     .end local v24    # "versionName":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v6=(Uninit);v9=(Uninit);v10=(Uninit);v12=(Uninit);v13=(Uninit);v15=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v24=(Uninit);v25=(Reference,Lcom/twocloo/com/cn/beans/User;);v26=(Integer);v27=(Uninit);
a=0;//     const-string v22, "0"
a=0;// 
a=0;//     #v22=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
