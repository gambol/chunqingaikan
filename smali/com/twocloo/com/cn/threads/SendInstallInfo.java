package com.twocloo.com.cn.threads; class SendInstallInfo { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/threads/SendInstallInfo;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "SendInstallInfo.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final TAG:Ljava/lang/String; = "SendPhoneInfo"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private context:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 29
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/SendInstallInfo;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/SendInstallInfo;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 30
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 15
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-super {p0}, Ljava/lang/Thread;->run()V
a=0;// 
a=0;//     .line 35
a=0;//     new-instance v12, Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;// 
a=0;//     #v12=(UninitRef,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/SendInstallInfo;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-direct {v12, v0}, Lcom/twocloo/com/cn/common/PhoneInfo;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 37
a=0;//     .local v12, "phone":Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;//     #v12=(Reference,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/SendInstallInfo;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 38
a=0;//     .local v3, "imei":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/common/PhoneInfo;->getModel()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 39
a=0;//     .local v2, "model":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/common/PhoneInfo;->getScreenPix()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 40
a=0;//     .local v1, "pix":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/common/PhoneInfo;->getCurrentVersion()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 41
a=0;//     .local v5, "versionCode":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/SendInstallInfo;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v14, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     invoke-virtual {v0, v14}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 42
a=0;//     .local v6, "apptype":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "android"
a=0;// 
a=0;//     .line 43
a=0;//     .local v7, "clienttype":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/SendInstallInfo;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v14, Lcom/twocloo/com/cn/R$string;->insertbookid:I
a=0;// 
a=0;//     invoke-virtual {v0, v14}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 44
a=0;//     .local v8, "aid":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 46
a=0;//     .local v9, "uid":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     new-instance v11, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v11=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     .line 48
a=0;//     .local v11, "obj":Lorg/json/JSONObject;
a=0;//     :try_start_0
a=0;//     #v11=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v0, "imei"
a=0;// 
a=0;//     invoke-virtual {v11, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 49
a=0;//     const-string v0, "screenpix"
a=0;// 
a=0;//     invoke-virtual {v11, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 50
a=0;//     const-string v0, "model"
a=0;// 
a=0;//     invoke-virtual {v11, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 51
a=0;//     const-string v0, "versioncode"
a=0;// 
a=0;//     invoke-virtual {v11, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 52
a=0;//     const-string v0, "pt"
a=0;// 
a=0;//     invoke-virtual {v11, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 53
a=0;//     const-string v0, "ct"
a=0;// 
a=0;//     invoke-virtual {v11, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 54
a=0;//     const-string v0, "articleid"
a=0;// 
a=0;//     invoke-virtual {v11, v0, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 58
a=0;//     :goto_1
a=0;//     #v10=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v14, "\u624b\u673a\u4fe1\u606f\u4e3a\uff1a"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/SendInstallInfo;->context:Landroid/content/Context;
a=0;// 
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getChannel(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 61
a=0;//     .local v4, "channel":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/SendInstallInfo;->context:Landroid/content/Context;
a=0;// 
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static/range {v0 .. v9}, Lcom/twocloo/com/cn/http/HttpImpl;->sendPhoneInfoInstall(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     .line 64
a=0;//     .local v13, "result":Z
a=0;//     #v13=(Boolean);
a=0;//     if-eqz v13, :cond_0
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/SendInstallInfo;->context:Landroid/content/Context;
a=0;// 
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     #v14=(One);
a=0;//     invoke-static {v0, v14}, Lcom/twocloo/com/cn/common/LocalStore;->setActivate(Landroid/content/Context;Z)V
a=0;// 
a=0;//     .line 68
a=0;//     :cond_0
a=0;//     #v14=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 44
a=0;//     .end local v4    # "channel":Ljava/lang/String;
a=0;//     .end local v9    # "uid":Ljava/lang/String;
a=0;//     .end local v11    # "obj":Lorg/json/JSONObject;
a=0;//     .end local v13    # "result":Z
a=0;//     :cond_1
a=0;//     #v4=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v13=(Uninit);v14=(Integer);
a=0;//     const-string v9, "0"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 55
a=0;//     .restart local v9    # "uid":Ljava/lang/String;
a=0;//     .restart local v11    # "obj":Lorg/json/JSONObject;
a=0;//     :catch_0
a=0;//     #v11=(Reference,Lorg/json/JSONObject;);
a=0;//     move-exception v10
a=0;// 
a=0;//     .line 56
a=0;//     .local v10, "e":Ljava/lang/Exception;
a=0;//     #v10=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, v10}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
