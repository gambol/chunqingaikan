package com.twocloo.com.cn.threads; class AotoLoginThread { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/threads/AotoLoginThread;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "AotoLoginThread.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private context:Landroid/content/Context;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "handler"    # Landroid/os/Handler;
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 33
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/AotoLoginThread;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/AotoLoginThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 34
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/threads/AotoLoginThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 35
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/threads/AotoLoginThread;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/AotoLoginThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     :try_start_0
a=0;//     const-string v4, "0"
a=0;// 
a=0;//     .line 44
a=0;//     .local v4, "uid":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "0"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/threads/AotoLoginThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/common/LocalStore;->getLastUid(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     .line 45
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/threads/AotoLoginThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/common/LocalStore;->getLastUid(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 69
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/threads/AotoLoginThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     check-cast v6, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/utils/CommonUtils;->logInToken(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v6, v4, v7}, Lcom/twocloo/com/cn/http/HttpImpl;->syncUserInfo(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 71
a=0;//     .local v2, "json":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToUser(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 74
a=0;//     .local v5, "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     sget-object v6, Lcom/twocloo/com/cn/beans/User;->LOGIN_SUCCESS:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/User;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 75
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/utils/CommonUtils;->logInToken(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Lcom/twocloo/com/cn/beans/User;->setToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/threads/AotoLoginThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v6, v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->saveLoginStatus(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 79
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/BookApp;->setUser(Lcom/twocloo/com/cn/beans/User;)V
a=0;// 
a=0;//     .line 82
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/threads/AotoLoginThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/common/LocalStore;->getVisitsSuccessful(Landroid/content/Context;)Z
a=0;// 
a=0;//     .line 94
a=0;//     .end local v2    # "json":Lorg/json/JSONObject;
a=0;//     .end local v4    # "uid":Ljava/lang/String;
a=0;//     .end local v5    # "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 47
a=0;//     .restart local v4    # "uid":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Reference,Ljava/lang/String;);v5=(Uninit);v6=(Boolean);v7=(Reference,Ljava/lang/String;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/threads/AotoLoginThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v6}, Lcom/twocloo/base/util/NetUtils;->checkNet(Landroid/content/Context;)Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 48
a=0;//     .local v3, "netType":Lcom/twocloo/base/common/NetType;
a=0;//     #v3=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v6, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     .line 49
a=0;//     const-string v6, "\u65e0\u7f51\u7edc\uff0c\u4e0d\u53d1\u9001\u7f51\u7edc\u8bf7\u6c42"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 50
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/threads/AotoLoginThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     new-instance v7, Lcom/twocloo/com/cn/threads/AotoLoginThread$1;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/threads/AotoLoginThread$1;);
a=0;//     invoke-direct {v7, p0}, Lcom/twocloo/com/cn/threads/AotoLoginThread$1;-><init>(Lcom/twocloo/com/cn/threads/AotoLoginThread;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/threads/AotoLoginThread$1;);
a=0;//     invoke-virtual {v6, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 89
a=0;//     .end local v3    # "netType":Lcom/twocloo/base/common/NetType;
a=0;//     .end local v4    # "uid":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 90
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 59
a=0;//     .end local v0    # "e":Ljava/lang/Throwable;
a=0;//     .restart local v3    # "netType":Lcom/twocloo/base/common/NetType;
a=0;//     .restart local v4    # "uid":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Reference,Lcom/twocloo/base/common/NetType;);v4=(Reference,Ljava/lang/String;);v5=(Uninit);v6=(Boolean);v7=(Reference,Ljava/lang/String;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/threads/AotoLoginThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/http/HttpImpl;->sendHardInfo(Landroid/content/Context;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 60
a=0;//     .local v1, "hardInfo":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 61
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToUser(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 62
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/threads/AotoLoginThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v6, v4}, Lcom/twocloo/com/cn/common/LocalStore;->setLastUid(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
