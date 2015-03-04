package com.twocloo.com.cn.threads; class SyncUserInfoThread { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/threads/SyncUserInfoThread;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "SyncUserInfoThread.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private act:Landroid/app/Activity;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private token:Ljava/lang/String;
a=0;// 
a=0;// .field private uid:Ljava/lang/String;
a=0;// 
a=0;// .field public userinfo:Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "act"    # Landroid/app/Activity;
a=0;//     .param p2, "handler"    # Landroid/os/Handler;
a=0;//     .param p3, "uid"    # Ljava/lang/String;
a=0;//     .param p4, "token"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 22
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/SyncUserInfoThread;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/SyncUserInfoThread;->act:Landroid/app/Activity;
a=0;// 
a=0;//     .line 23
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/threads/SyncUserInfoThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 24
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/threads/SyncUserInfoThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 25
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/threads/SyncUserInfoThread;->token:Ljava/lang/String;
a=0;// 
a=0;//     .line 26
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 30
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/SyncUserInfoThread;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/threads/SyncUserInfoThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/SyncUserInfoThread;->token:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v3, v4}, Lcom/twocloo/com/cn/http/HttpImpl;->syncUserInfoNew(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/threads/SyncUserInfoThread;->userinfo:Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     .line 32
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/SyncUserInfoThread;->userinfo:Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 34
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/SyncUserInfoThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 42
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 38
a=0;//     :cond_0
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/SyncUserInfoThread;->userinfo:Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/threads/SyncUserInfoThread;->userinfo:Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "1"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     and-int/2addr v0, v3
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/SyncUserInfoThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 38
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 41
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v3=(Boolean);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/SyncUserInfoThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
