package com.twocloo.com.cn.threads; class ExchangeYDBThread { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/threads/ExchangeYDBThread;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "ExchangeYDBThread.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private context:Landroid/content/Context;
a=0;// 
a=0;// .field private money:I
a=0;// 
a=0;// .field private myPointBalance:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;II)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "money"    # I
a=0;//     .param p3, "myPointBalance"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 38
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/ExchangeYDBThread;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/ExchangeYDBThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 39
a=0;//     iput p2, p0, Lcom/twocloo/com/cn/threads/ExchangeYDBThread;->money:I
a=0;// 
a=0;//     .line 40
a=0;//     iput p3, p0, Lcom/twocloo/com/cn/threads/ExchangeYDBThread;->myPointBalance:I
a=0;// 
a=0;//     .line 41
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 27
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-super/range {p0 .. p0}, Ljava/lang/Thread;->run()V
a=0;// 
a=0;//     .line 46
a=0;//     new-instance v13, Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;// 
a=0;//     #v13=(UninitRef,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/ExchangeYDBThread;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/ExchangeYDBThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     #v24=(Reference,Landroid/content/Context;);
a=0;//     check-cast v24, Landroid/app/Activity;
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     invoke-direct {v13, v0}, Lcom/twocloo/com/cn/common/PhoneInfo;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 47
a=0;//     .local v13, "phone":Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;//     #v13=(Reference,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/ExchangeYDBThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     invoke-static/range {v24 .. v24}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 48
a=0;//     .local v7, "imei":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13}, Lcom/twocloo/com/cn/common/PhoneInfo;->getModel()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 49
a=0;//     .local v10, "model":Ljava/lang/String;
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13}, Lcom/twocloo/com/cn/common/PhoneInfo;->getScreenPix()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 50
a=0;//     .local v15, "pix":Ljava/lang/String;
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     new-instance v24, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v24=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v24 .. v24}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v24=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v13}, Lcom/twocloo/com/cn/common/PhoneInfo;->getCurrentVersion()I
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Integer);
a=0;//     invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     .line 51
a=0;//     .local v22, "versionCode":Ljava/lang/String;
a=0;//     #v22=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/ExchangeYDBThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     invoke-virtual/range {v24 .. v24}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     sget v25, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     invoke-virtual/range {v24 .. v25}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 52
a=0;//     .local v4, "apptype":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "android"
a=0;// 
a=0;//     .line 53
a=0;//     .local v6, "clienttype":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/ExchangeYDBThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     invoke-virtual/range {v24 .. v24}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     sget v25, Lcom/twocloo/com/cn/R$string;->insertbookid:I
a=0;// 
a=0;//     invoke-virtual/range {v24 .. v25}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 54
a=0;//     .local v3, "aid":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     if-eqz v24, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     invoke-virtual/range {v24 .. v24}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     .line 55
a=0;//     .local v21, "uid":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v21=(Reference,Ljava/lang/String;);
a=0;//     new-instance v24, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v24=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static/range {v21 .. v21}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v24 .. v25}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v24=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v25, "tokentoken"
a=0;// 
a=0;//     invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     invoke-static/range {v24 .. v24}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     const/16 v26, 0xa
a=0;// 
a=0;//     #v26=(PosByte);
a=0;//     invoke-virtual/range {v24 .. v26}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     .line 56
a=0;//     .local v20, "token":Ljava/lang/String;
a=0;//     #v20=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/ExchangeYDBThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     invoke-virtual/range {v24 .. v24}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     sget v25, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v25=(Integer);
a=0;//     invoke-virtual/range {v24 .. v25}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     .line 58
a=0;//     .local v17, "srcid":Ljava/lang/String;
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getSystemRelease()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     .line 59
a=0;//     .local v18, "systemRelease":Ljava/lang/String;
a=0;//     #v18=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/ExchangeYDBThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     check-cast v24, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static/range {v24 .. v24}, Lcom/twocloo/com/cn/utils/DisplayUtil;->getScreenPix(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 60
a=0;//     .local v14, "phoneResolution":Ljava/lang/String;
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/ExchangeYDBThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     invoke-static/range {v24 .. v24}, Lcom/twocloo/com/cn/common/Util;->getSIMOperator(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 61
a=0;//     .local v5, "carrieroperator":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/ExchangeYDBThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     invoke-static/range {v24 .. v24}, Lcom/twocloo/com/cn/common/LocalStore;->getActivateCode(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 62
a=0;//     .local v2, "activateCode":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/ExchangeYDBThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     invoke-static/range {v24 .. v24}, Lcom/twocloo/base/util/PhoneUtils;->getMacAddress(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 63
a=0;//     .local v9, "macAddress":Ljava/lang/String;
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/ExchangeYDBThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     invoke-static/range {v24 .. v24}, Lcom/twocloo/com/cn/utils/CommonUtils;->getAppVersionName(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     .line 65
a=0;//     .local v23, "versionName":Ljava/lang/String;
a=0;//     #v23=(Reference,Ljava/lang/String;);
a=0;//     new-instance v24, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v24=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v24 .. v24}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v24=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v25
a=0;// 
a=0;//     #v25=(LongLo);v26=(LongHi);
a=0;//     invoke-virtual/range {v24 .. v26}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     const/16 v26, 0xa
a=0;// 
a=0;//     #v26=(PosByte);
a=0;//     invoke-virtual/range {v24 .. v26}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     .line 66
a=0;//     .local v19, "timeStamp":Ljava/lang/String;
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     new-instance v24, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v24=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static/range {v19 .. v19}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v24 .. v25}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v24=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     move-object/from16 v1, v21
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 67
a=0;//     .local v11, "order_sn":Ljava/lang/String;
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     new-instance v24, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v24=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     new-instance v25, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v25=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static/range {v21 .. v21}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     #v26=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v25 .. v26}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/twocloo/com/cn/threads/ExchangeYDBThread;->money:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v26, v0
a=0;// 
a=0;//     #v26=(Integer);
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     const/16 v26, 0x1
a=0;// 
a=0;//     #v26=(One);
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     const-string v26, "tokentoken"
a=0;// 
a=0;//     #v26=(Reference,Ljava/lang/String;);
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
a=0;//     invoke-static/range {v25 .. v25}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     invoke-direct/range {v24 .. v25}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v24=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v25, "tokentoken"
a=0;// 
a=0;//     invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     invoke-static/range {v24 .. v24}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     .line 69
a=0;//     .local v16, "sign":Ljava/lang/String;
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     new-instance v12, Ljava/util/HashMap;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v12}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 70
a=0;//     .local v12, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     #v12=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v24, "type"
a=0;// 
a=0;//     const-string v25, "1"
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     move-object/from16 v1, v25
a=0;// 
a=0;//     invoke-interface {v12, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 72
a=0;//     const-string v24, "order_sn"
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     invoke-interface {v12, v0, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 73
a=0;//     const-string v24, "sign"
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     move-object/from16 v1, v16
a=0;// 
a=0;//     invoke-interface {v12, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 74
a=0;//     const-string v24, "money"
a=0;// 
a=0;//     new-instance v25, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v25=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/twocloo/com/cn/threads/ExchangeYDBThread;->money:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v26, v0
a=0;// 
a=0;//     #v26=(Integer);
a=0;//     invoke-static/range {v26 .. v26}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     #v26=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v25 .. v26}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v1, v25
a=0;// 
a=0;//     invoke-interface {v12, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 75
a=0;//     const-string v24, "screenpix"
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     invoke-interface {v12, v0, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 76
a=0;//     const-string v24, "model"
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     invoke-interface {v12, v0, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 77
a=0;//     const-string v24, "imei"
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     invoke-interface {v12, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 78
a=0;//     const-string v24, "srcid"
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     move-object/from16 v1, v17
a=0;// 
a=0;//     invoke-interface {v12, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 79
a=0;//     const-string v24, "versioncode"
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     invoke-interface {v12, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 80
a=0;//     const-string v24, "pt"
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     invoke-interface {v12, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 81
a=0;//     const-string v24, "ct"
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     invoke-interface {v12, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 82
a=0;//     const-string v24, "articleid"
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     invoke-interface {v12, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 83
a=0;//     const-string v24, "userid"
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     move-object/from16 v1, v21
a=0;// 
a=0;//     invoke-interface {v12, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 84
a=0;//     const-string v24, "token"
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     move-object/from16 v1, v20
a=0;// 
a=0;//     invoke-interface {v12, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 85
a=0;//     const-string v24, "system_release"
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     move-object/from16 v1, v18
a=0;// 
a=0;//     invoke-interface {v12, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 86
a=0;//     const-string v24, "pix"
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     invoke-interface {v12, v0, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 87
a=0;//     const-string v24, "op"
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     invoke-interface {v12, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 88
a=0;//     const-string v24, "active_code"
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     invoke-interface {v12, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 89
a=0;//     const-string v24, "mac_address"
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     invoke-interface {v12, v0, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 90
a=0;//     const-string v24, "versionname"
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     invoke-interface {v12, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 91
a=0;//     const-string v24, "v"
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     invoke-interface {v12, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 92
a=0;//     const-string v24, "http://app.2cloo.com/user-android_score_recharge?"
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     invoke-static {v0, v12}, Lcom/twocloo/com/cn/http/HttpComm;->post(Ljava/lang/String;Ljava/util/Map;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 93
a=0;//     .local v8, "jo":Lorg/json/JSONObject;
a=0;//     #v8=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     .line 94
a=0;//     const-string v24, "code"
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     #v24=(Boolean);
a=0;//     if-nez v24, :cond_0
a=0;// 
a=0;//     const-string v24, "code"
a=0;// 
a=0;//     #v24=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     const-string v25, "1"
a=0;// 
a=0;//     invoke-virtual/range {v24 .. v25}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     #v24=(Boolean);
a=0;//     if-eqz v24, :cond_0
a=0;// 
a=0;//     .line 95
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/ExchangeYDBThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     #v24=(Reference,Landroid/content/Context;);
a=0;//     invoke-static/range {v24 .. v24}, Lnet/slidingmenu/tools/os/slidingbuxc;->getInstance(Landroid/content/Context;)Lnet/slidingmenu/tools/os/slidingbuxc;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/twocloo/com/cn/threads/ExchangeYDBThread;->myPointBalance:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     #v25=(Integer);
a=0;//     invoke-virtual/range {v24 .. v25}, Lnet/slidingmenu/tools/os/slidingbuxc;->sligusd(I)Z
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     #v24=(Boolean);
a=0;//     if-eqz v24, :cond_2
a=0;// 
a=0;//     .line 96
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/ExchangeYDBThread;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/ExchangeYDBThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     #v24=(Reference,Landroid/content/Context;);
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     invoke-static/range {v24 .. v25}, Lcom/twocloo/com/cn/common/LocalStore;->setYoumiPoints(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 101
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v24=(Conflicted);v25=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 54
a=0;//     .end local v2    # "activateCode":Ljava/lang/String;
a=0;//     .end local v5    # "carrieroperator":Ljava/lang/String;
a=0;//     .end local v8    # "jo":Lorg/json/JSONObject;
a=0;//     .end local v9    # "macAddress":Ljava/lang/String;
a=0;//     .end local v11    # "order_sn":Ljava/lang/String;
a=0;//     .end local v12    # "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     .end local v14    # "phoneResolution":Ljava/lang/String;
a=0;//     .end local v16    # "sign":Ljava/lang/String;
a=0;//     .end local v17    # "srcid":Ljava/lang/String;
a=0;//     .end local v18    # "systemRelease":Ljava/lang/String;
a=0;//     .end local v19    # "timeStamp":Ljava/lang/String;
a=0;//     .end local v20    # "token":Ljava/lang/String;
a=0;//     .end local v21    # "uid":Ljava/lang/String;
a=0;//     .end local v23    # "versionName":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/content/Context;);v1=(Uninit);v2=(Uninit);v5=(Uninit);v8=(Uninit);v9=(Uninit);v11=(Uninit);v12=(Uninit);v14=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v23=(Uninit);v24=(Reference,Lcom/twocloo/com/cn/beans/User;);v25=(Integer);v26=(Uninit);
a=0;//     const-string v21, "0"
a=0;// 
a=0;//     #v21=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 98
a=0;//     .restart local v2    # "activateCode":Ljava/lang/String;
a=0;//     .restart local v5    # "carrieroperator":Ljava/lang/String;
a=0;//     .restart local v8    # "jo":Lorg/json/JSONObject;
a=0;//     .restart local v9    # "macAddress":Ljava/lang/String;
a=0;//     .restart local v11    # "order_sn":Ljava/lang/String;
a=0;//     .restart local v12    # "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     .restart local v14    # "phoneResolution":Ljava/lang/String;
a=0;//     .restart local v16    # "sign":Ljava/lang/String;
a=0;//     .restart local v17    # "srcid":Ljava/lang/String;
a=0;//     .restart local v18    # "systemRelease":Ljava/lang/String;
a=0;//     .restart local v19    # "timeStamp":Ljava/lang/String;
a=0;//     .restart local v20    # "token":Ljava/lang/String;
a=0;//     .restart local v21    # "uid":Ljava/lang/String;
a=0;//     .restart local v23    # "versionName":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);v2=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v8=(Reference,Lorg/json/JSONObject;);v9=(Reference,Ljava/lang/String;);v11=(Reference,Ljava/lang/String;);v12=(Reference,Ljava/util/HashMap;);v14=(Reference,Ljava/lang/String;);v16=(Reference,Ljava/lang/String;);v17=(Reference,Ljava/lang/String;);v18=(Reference,Ljava/lang/String;);v19=(Reference,Ljava/lang/String;);v20=(Reference,Ljava/lang/String;);v23=(Reference,Ljava/lang/String;);v24=(Boolean);v26=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/ExchangeYDBThread;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/ExchangeYDBThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     #v24=(Reference,Landroid/content/Context;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/twocloo/com/cn/threads/ExchangeYDBThread;->myPointBalance:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     invoke-static/range {v24 .. v25}, Lcom/twocloo/com/cn/common/LocalStore;->setYoumiPoints(Landroid/content/Context;I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
