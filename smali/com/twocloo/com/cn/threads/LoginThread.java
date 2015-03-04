package com.twocloo.com.cn.threads; class LoginThread { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/threads/LoginThread;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "LoginThread.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private context:Landroid/content/Context;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private name:Ljava/lang/String;
a=0;// 
a=0;// .field private passwd:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Handler;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "name"    # Ljava/lang/String;
a=0;//     .param p3, "password"    # Ljava/lang/String;
a=0;//     .param p4, "handler"    # Landroid/os/Handler;
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 29
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/LoginThread;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/LoginThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 30
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/threads/LoginThread;->name:Ljava/lang/String;
a=0;// 
a=0;//     .line 31
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/threads/LoginThread;->passwd:Ljava/lang/String;
a=0;// 
a=0;//     .line 32
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/threads/LoginThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 33
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x4
a=0;// 
a=0;//     .line 37
a=0;//     #v6=(PosByte);
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
a=0;//     .line 38
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/threads/LoginThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 67
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 42
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);v3=(Reference,Lcom/twocloo/base/common/NetType;);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/threads/LoginThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/threads/LoginThread;->name:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/LoginThread;->passwd:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v2, v3, v4, v5}, Lcom/twocloo/com/cn/http/HttpImpl;->login(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 44
a=0;//     .local v0, "json":Lorg/json/JSONObject;
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToUser(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 46
a=0;//     .local v1, "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 47
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/threads/LoginThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 52
a=0;//     :cond_2
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     sget-object v2, Lcom/twocloo/com/cn/beans/User;->LOGIN_SUCCESS:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 54
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/threads/LoginThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget-object v4, Lcom/twocloo/com/cn/common/Constants$LoginType;->def:Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;// 
a=0;//     invoke-static {v2, v3, v4}, Lcom/twocloo/com/cn/utils/CommonUtils;->saveLoginStatus(Landroid/content/Context;Ljava/lang/String;Lcom/twocloo/com/cn/common/Constants$LoginType;)V
a=0;// 
a=0;//     .line 56
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/BookApp;->setUser(Lcom/twocloo/com/cn/beans/User;)V
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/threads/LoginThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 59
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "2"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 60
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/threads/LoginThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 61
a=0;//     :cond_4
a=0;//     #v2=(Boolean);v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "3"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     .line 62
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/threads/LoginThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 63
a=0;//     :cond_5
a=0;//     #v2=(Boolean);v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "4"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 64
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/threads/LoginThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v2, v6}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
