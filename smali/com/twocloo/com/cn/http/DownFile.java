package com.twocloo.com.cn.http; class DownFile { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/http/DownFile;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DownFile.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static handler:Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private act:Landroid/app/Activity;
a=0;// 
a=0;// .field public aid:Ljava/lang/String;
a=0;// 
a=0;// .field public downLen:J
a=0;// 
a=0;// .field public fileLen:J
a=0;// 
a=0;// .field public filelocation:Ljava/lang/String;
a=0;// 
a=0;// .field public isOK:I
a=0;// 
a=0;// .field public mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;// .field public title:Ljava/lang/String;
a=0;// 
a=0;// .field public token:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "act"    # Landroid/app/Activity;
a=0;//     .param p2, "aid"    # Ljava/lang/String;
a=0;//     .param p3, "title"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 41
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/http/DownFile;->act:Landroid/app/Activity;
a=0;// 
a=0;//     .line 42
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/http/DownFile;->aid:Ljava/lang/String;
a=0;// 
a=0;//     .line 43
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/http/DownFile;->title:Ljava/lang/String;
a=0;// 
a=0;//     .line 45
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "act"    # Landroid/app/Activity;
a=0;//     .param p2, "aid"    # Ljava/lang/String;
a=0;//     .param p3, "title"    # Ljava/lang/String;
a=0;//     .param p4, "token"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 48
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/http/DownFile;->act:Landroid/app/Activity;
a=0;// 
a=0;//     .line 49
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/http/DownFile;->aid:Ljava/lang/String;
a=0;// 
a=0;//     .line 50
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/http/DownFile;->title:Ljava/lang/String;
a=0;// 
a=0;//     .line 51
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/http/DownFile;->token:Ljava/lang/String;
a=0;// 
a=0;//     .line 52
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/http/DownFile;)Landroid/app/Activity;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/DownFile;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public doDown()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v4, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v3, v4}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 88
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/DownFile;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Activity;);
a=0;//     new-instance v4, Lcom/twocloo/com/cn/http/DownFile$2;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/http/DownFile$2;);
a=0;//     invoke-direct {v4, p0}, Lcom/twocloo/com/cn/http/DownFile$2;-><init>(Lcom/twocloo/com/cn/http/DownFile;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/http/DownFile$2;);
a=0;//     invoke-virtual {v3, v4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 165
a=0;//     :goto_0
a=0;//     invoke-static {}, Ljava/lang/Thread;->interrupted()Z
a=0;// 
a=0;//     .line 167
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 100
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(Reference,Lcom/twocloo/base/common/NetType;);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 101
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget-object v4, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/DownFile;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Activity;);
a=0;//     new-instance v4, Lcom/twocloo/com/cn/http/DownFile$3;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/http/DownFile$3;);
a=0;//     invoke-direct {v4, p0}, Lcom/twocloo/com/cn/http/DownFile$3;-><init>(Lcom/twocloo/com/cn/http/DownFile;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/http/DownFile$3;);
a=0;//     invoke-virtual {v3, v4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 161
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 162
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     :try_start_2
a=0;//     #v3=(Byte);
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/http/DownFile;->isOK:I
a=0;// 
a=0;//     .line 163
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 165
a=0;//     invoke-static {}, Ljava/lang/Thread;->interrupted()Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 114
a=0;//     .end local v0    # "e":Ljava/lang/Throwable;
a=0;//     :cond_1
a=0;//     :try_start_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(Reference,Lcom/twocloo/base/common/NetType;);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/DownFile;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Activity;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/http/DownFile;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, ""
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4, v5, v6, v7}, Lcom/twocloo/com/cn/http/HttpImpl;->synMyfavor(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 115
a=0;//     .local v1, "jo":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-class v4, Lcom/twocloo/com/cn/beans/SynMyfavorResultBean;
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/base/util/JsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/twocloo/com/cn/beans/SynMyfavorResultBean;
a=0;// 
a=0;//     .line 117
a=0;//     .local v2, "smfResultBean":Lcom/twocloo/com/cn/beans/SynMyfavorResultBean;
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     const-string v3, "1"
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/SynMyfavorResultBean;->getAdd()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/DownFile;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Activity;);
a=0;//     new-instance v4, Lcom/twocloo/com/cn/http/DownFile$4;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/http/DownFile$4;);
a=0;//     invoke-direct {v4, p0}, Lcom/twocloo/com/cn/http/DownFile$4;-><init>(Lcom/twocloo/com/cn/http/DownFile;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/http/DownFile$4;);
a=0;//     invoke-virtual {v3, v4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/DownFile;->act:Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/http/DownFile;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/com/cn/http/HttpImpl;->ShubenmuluAll(Landroid/app/Activity;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/http/DownFile;->mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     .line 130
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/DownFile;->act:Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/http/DownFile;->mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v3, p0, v4, v5}, Lcom/twocloo/com/cn/http/HttpImpl;->downBook(Landroid/app/Activity;Lcom/twocloo/com/cn/http/DownFile;Lcom/twocloo/com/cn/beans/Shubenmulu;Z)V
a=0;// 
a=0;//     .line 132
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/DownFile;->mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 135
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/http/DownFile;->isOK:I
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 165
a=0;//     .end local v1    # "jo":Lorg/json/JSONObject;
a=0;//     .end local v2    # "smfResultBean":Lcom/twocloo/com/cn/beans/SynMyfavorResultBean;
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-static {}, Ljava/lang/Thread;->interrupted()Z
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 138
a=0;//     .restart local v1    # "jo":Lorg/json/JSONObject;
a=0;//     .restart local v2    # "smfResultBean":Lcom/twocloo/com/cn/beans/SynMyfavorResultBean;
a=0;//     :cond_3
a=0;//     :try_start_4
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);v2=(Reference,Lcom/twocloo/com/cn/beans/SynMyfavorResultBean;);v5=(Reference,Ljava/lang/String;);v6=(Reference,Ljava/lang/String;);v7=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/DownFile;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Activity;);
a=0;//     new-instance v4, Lcom/twocloo/com/cn/http/DownFile$5;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/http/DownFile$5;);
a=0;//     invoke-direct {v4, p0}, Lcom/twocloo/com/cn/http/DownFile$5;-><init>(Lcom/twocloo/com/cn/http/DownFile;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/http/DownFile$5;);
a=0;//     invoke-virtual {v3, v4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     .line 165
a=0;//     invoke-static {}, Ljava/lang/Thread;->interrupted()Z
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 150
a=0;//     .end local v1    # "jo":Lorg/json/JSONObject;
a=0;//     .end local v2    # "smfResultBean":Lcom/twocloo/com/cn/beans/SynMyfavorResultBean;
a=0;//     :cond_4
a=0;//     :try_start_5
a=0;//     #v1=(Uninit);v2=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/DownFile;->act:Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/http/DownFile;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/com/cn/http/HttpImpl;->ShubenmuluAll(Landroid/app/Activity;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/http/DownFile;->mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     .line 152
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/DownFile;->act:Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/http/DownFile;->mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v3, p0, v4, v5}, Lcom/twocloo/com/cn/http/HttpImpl;->downBook(Landroid/app/Activity;Lcom/twocloo/com/cn/http/DownFile;Lcom/twocloo/com/cn/beans/Shubenmulu;Z)V
a=0;// 
a=0;//     .line 154
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/DownFile;->mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 157
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/http/DownFile;->isOK:I
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_0
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 164
a=0;//     :catchall_0
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 165
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {}, Ljava/lang/Thread;->interrupted()Z
a=0;// 
a=0;//     .line 166
a=0;//     throw v3
a=0;// .end method
a=0;// 
a=0;// .method public doDown(Ljava/lang/String;)V
a=0;//     .locals 8
a=0;//     .param p1, "token"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v4, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v3, v4}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/DownFile;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Activity;);
a=0;//     new-instance v4, Lcom/twocloo/com/cn/http/DownFile$7;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/http/DownFile$7;);
a=0;//     invoke-direct {v4, p0}, Lcom/twocloo/com/cn/http/DownFile$7;-><init>(Lcom/twocloo/com/cn/http/DownFile;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/http/DownFile$7;);
a=0;//     invoke-virtual {v3, v4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 278
a=0;//     :goto_0
a=0;//     invoke-static {}, Ljava/lang/Thread;->interrupted()Z
a=0;// 
a=0;//     .line 280
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 213
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(Reference,Lcom/twocloo/base/common/NetType;);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 214
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget-object v4, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/DownFile;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Activity;);
a=0;//     new-instance v4, Lcom/twocloo/com/cn/http/DownFile$8;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/http/DownFile$8;);
a=0;//     invoke-direct {v4, p0}, Lcom/twocloo/com/cn/http/DownFile$8;-><init>(Lcom/twocloo/com/cn/http/DownFile;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/http/DownFile$8;);
a=0;//     invoke-virtual {v3, v4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 274
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 275
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     :try_start_2
a=0;//     #v3=(Byte);
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/http/DownFile;->isOK:I
a=0;// 
a=0;//     .line 276
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 278
a=0;//     invoke-static {}, Ljava/lang/Thread;->interrupted()Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 227
a=0;//     .end local v0    # "e":Ljava/lang/Throwable;
a=0;//     :cond_1
a=0;//     :try_start_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(Reference,Lcom/twocloo/base/common/NetType;);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/DownFile;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Activity;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/http/DownFile;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, ""
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4, v5, v6, v7}, Lcom/twocloo/com/cn/http/HttpImpl;->synMyfavor(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 228
a=0;//     .local v1, "jo":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-class v4, Lcom/twocloo/com/cn/beans/SynMyfavorResultBean;
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/base/util/JsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/twocloo/com/cn/beans/SynMyfavorResultBean;
a=0;// 
a=0;//     .line 230
a=0;//     .local v2, "smfResultBean":Lcom/twocloo/com/cn/beans/SynMyfavorResultBean;
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     const-string v3, "1"
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/SynMyfavorResultBean;->getAdd()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 231
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/DownFile;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Activity;);
a=0;//     new-instance v4, Lcom/twocloo/com/cn/http/DownFile$9;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/http/DownFile$9;);
a=0;//     invoke-direct {v4, p0}, Lcom/twocloo/com/cn/http/DownFile$9;-><init>(Lcom/twocloo/com/cn/http/DownFile;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/http/DownFile$9;);
a=0;//     invoke-virtual {v3, v4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 241
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/DownFile;->act:Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/http/DownFile;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/com/cn/http/HttpImpl;->ShubenmuluAll(Landroid/app/Activity;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/http/DownFile;->mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     .line 243
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/DownFile;->act:Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/http/DownFile;->mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-static {v3, p0, v4, v5}, Lcom/twocloo/com/cn/http/HttpImpl;->downBook(Landroid/app/Activity;Lcom/twocloo/com/cn/http/DownFile;Lcom/twocloo/com/cn/beans/Shubenmulu;Z)V
a=0;// 
a=0;//     .line 245
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/DownFile;->mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 248
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/http/DownFile;->isOK:I
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 278
a=0;//     .end local v1    # "jo":Lorg/json/JSONObject;
a=0;//     .end local v2    # "smfResultBean":Lcom/twocloo/com/cn/beans/SynMyfavorResultBean;
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Boolean);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-static {}, Ljava/lang/Thread;->interrupted()Z
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 251
a=0;//     .restart local v1    # "jo":Lorg/json/JSONObject;
a=0;//     .restart local v2    # "smfResultBean":Lcom/twocloo/com/cn/beans/SynMyfavorResultBean;
a=0;//     :cond_3
a=0;//     :try_start_4
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);v2=(Reference,Lcom/twocloo/com/cn/beans/SynMyfavorResultBean;);v5=(Reference,Ljava/lang/String;);v6=(Reference,Ljava/lang/String;);v7=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/DownFile;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Activity;);
a=0;//     new-instance v4, Lcom/twocloo/com/cn/http/DownFile$10;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/http/DownFile$10;);
a=0;//     invoke-direct {v4, p0}, Lcom/twocloo/com/cn/http/DownFile$10;-><init>(Lcom/twocloo/com/cn/http/DownFile;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/http/DownFile$10;);
a=0;//     invoke-virtual {v3, v4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     .line 278
a=0;//     invoke-static {}, Ljava/lang/Thread;->interrupted()Z
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 263
a=0;//     .end local v1    # "jo":Lorg/json/JSONObject;
a=0;//     .end local v2    # "smfResultBean":Lcom/twocloo/com/cn/beans/SynMyfavorResultBean;
a=0;//     :cond_4
a=0;//     :try_start_5
a=0;//     #v1=(Uninit);v2=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/DownFile;->act:Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/http/DownFile;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/com/cn/http/HttpImpl;->ShubenmuluAll(Landroid/app/Activity;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/http/DownFile;->mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     .line 265
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/DownFile;->act:Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/http/DownFile;->mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v3, p0, v4, v5}, Lcom/twocloo/com/cn/http/HttpImpl;->downBook(Landroid/app/Activity;Lcom/twocloo/com/cn/http/DownFile;Lcom/twocloo/com/cn/beans/Shubenmulu;Z)V
a=0;// 
a=0;//     .line 267
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/DownFile;->mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 270
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/http/DownFile;->isOK:I
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_0
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 277
a=0;//     :catchall_0
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 278
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {}, Ljava/lang/Thread;->interrupted()Z
a=0;// 
a=0;//     .line 279
a=0;//     throw v3
a=0;// .end method
a=0;// 
a=0;// .method public start()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/http/DownFile;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->sdCardCheck(Landroid/app/Activity;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 57
a=0;//     .local v0, "canContinue":Z
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 58
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/http/DownFile;->isOK:I
a=0;// 
a=0;//     .line 83
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 77
a=0;//     :cond_0
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/http/DownFile$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/http/DownFile$1;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/http/DownFile$1;-><init>(Lcom/twocloo/com/cn/http/DownFile;)V
a=0;// 
a=0;//     .line 81
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/http/DownFile$1;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/http/DownFile$1;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public start(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "token"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 171
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/http/DownFile;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->sdCardCheck(Landroid/app/Activity;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 172
a=0;//     .local v0, "canContinue":Z
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 173
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/http/DownFile;->isOK:I
a=0;// 
a=0;//     .line 196
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 190
a=0;//     :cond_0
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/http/DownFile$6;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/http/DownFile$6;);
a=0;//     invoke-direct {v1, p0, p1}, Lcom/twocloo/com/cn/http/DownFile$6;-><init>(Lcom/twocloo/com/cn/http/DownFile;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 194
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/http/DownFile$6;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/http/DownFile$6;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
