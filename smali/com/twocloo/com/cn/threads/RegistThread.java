package com.twocloo.com.cn.threads; class RegistThread { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/threads/RegistThread;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "RegistThread.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private context:Landroid/content/Context;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private mobile:Ljava/lang/String;
a=0;// 
a=0;// .field private nickname:Ljava/lang/String;
a=0;// 
a=0;// .field private passwdhash:Ljava/lang/String;
a=0;// 
a=0;// .field private username:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Handler;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "username"    # Ljava/lang/String;
a=0;//     .param p3, "passwdhash"    # Ljava/lang/String;
a=0;//     .param p4, "mobile"    # Ljava/lang/String;
a=0;//     .param p5, "handler"    # Landroid/os/Handler;
a=0;//     .param p6, "nickname"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 28
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/RegistThread;);
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/threads/RegistThread;->username:Ljava/lang/String;
a=0;// 
a=0;//     .line 29
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/threads/RegistThread;->passwdhash:Ljava/lang/String;
a=0;// 
a=0;//     .line 30
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/threads/RegistThread;->mobile:Ljava/lang/String;
a=0;// 
a=0;//     .line 31
a=0;//     iput-object p5, p0, Lcom/twocloo/com/cn/threads/RegistThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 32
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/RegistThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 33
a=0;//     iput-object p6, p0, Lcom/twocloo/com/cn/threads/RegistThread;->nickname:Ljava/lang/String;
a=0;// 
a=0;//     .line 34
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     .line 38
a=0;//     #v8=(PosByte);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/threads/RegistThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     check-cast v3, Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/RegistThread;->username:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/threads/RegistThread;->passwdhash:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/threads/RegistThread;->mobile:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/threads/RegistThread;->nickname:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4, v5, v6, v7}, Lcom/twocloo/com/cn/http/HttpImpl;->regist(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 39
a=0;//     .local v1, "json":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 40
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/threads/RegistThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v3, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 65
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 44
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Reference,Landroid/app/Activity;);v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToUser(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 45
a=0;//     .local v2, "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 46
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/threads/RegistThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v3, v8}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 49
a=0;//     :cond_2
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/utils/CommonUtils;->logInToken(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/beans/User;->setToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 50
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/threads/RegistThread;->mobile:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/beans/User;->setTel(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 51
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/BookApp;->setUser(Lcom/twocloo/com/cn/beans/User;)V
a=0;// 
a=0;//     .line 52
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 54
a=0;//     .local v0, "code":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "1"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 56
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/threads/RegistThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget-object v5, Lcom/twocloo/com/cn/common/Constants$LoginType;->def:Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;// 
a=0;//     invoke-static {v3, v4, v5}, Lcom/twocloo/com/cn/utils/CommonUtils;->saveLoginStatus(Landroid/content/Context;Ljava/lang/String;Lcom/twocloo/com/cn/common/Constants$LoginType;)V
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/threads/RegistThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v3, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 58
a=0;//     :cond_3
a=0;//     #v3=(Boolean);v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "2"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/threads/RegistThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v3, v8}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 60
a=0;//     :cond_4
a=0;//     #v3=(Boolean);
a=0;//     const-string v3, "3"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/threads/RegistThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v3, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 62
a=0;//     :cond_5
a=0;//     #v3=(Boolean);v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "4"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 63
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/threads/RegistThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v4, 0x4
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v3, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
