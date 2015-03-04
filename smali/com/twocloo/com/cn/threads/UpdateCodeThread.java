package com.twocloo.com.cn.threads; class UpdateCodeThread { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/threads/UpdateCodeThread;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "UpdateCodeThread.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final TAG:Ljava/lang/String; = "UpdateCode"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private act:Landroid/app/Activity;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private newWord:Ljava/lang/String;
a=0;// 
a=0;// .field private oldWord:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Landroid/os/Handler;)V
a=0;//     .locals 0
a=0;//     .param p1, "act"    # Landroid/app/Activity;
a=0;//     .param p2, "oldWord"    # Ljava/lang/String;
a=0;//     .param p3, "newWord"    # Ljava/lang/String;
a=0;//     .param p4, "handler"    # Landroid/os/Handler;
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 26
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/UpdateCodeThread;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/UpdateCodeThread;->act:Landroid/app/Activity;
a=0;// 
a=0;//     .line 27
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/threads/UpdateCodeThread;->oldWord:Ljava/lang/String;
a=0;// 
a=0;//     .line 28
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/threads/UpdateCodeThread;->newWord:Ljava/lang/String;
a=0;// 
a=0;//     .line 29
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/threads/UpdateCodeThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 30
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 37
a=0;//     .local v3, "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 38
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/UpdateCodeThread;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/threads/UpdateCodeThread;->oldWord:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/threads/UpdateCodeThread;->newWord:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5, v6, v7, v8}, Lcom/twocloo/com/cn/http/HttpImpl;->updatePass(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 39
a=0;//     .local v1, "json":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 61
a=0;//     .end local v1    # "json":Lorg/json/JSONObject;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 43
a=0;//     .restart local v1    # "json":Lorg/json/JSONObject;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Reference,Lorg/json/JSONObject;);v2=(Uninit);v4=(Reference,Landroid/app/Activity;);v5=(Reference,Ljava/lang/String;);v6=(Reference,Ljava/lang/String;);v7=(Reference,Ljava/lang/String;);v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToUser(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 44
a=0;//     .local v2, "u":Lcom/twocloo/com/cn/beans/User;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 48
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 50
a=0;//     .local v0, "code":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "1"
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 51
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/UpdateCodeThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {v4, v5}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 52
a=0;//     :cond_2
a=0;//     #v4=(Boolean);v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "2"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 53
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/UpdateCodeThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v4, v5}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 54
a=0;//     :cond_3
a=0;//     #v4=(Boolean);v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "3"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/UpdateCodeThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v4, v5}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 56
a=0;//     :cond_4
a=0;//     #v4=(Boolean);v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "4"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/UpdateCodeThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v5, 0x4
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v4, v5}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
