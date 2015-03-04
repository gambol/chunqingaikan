package com.twocloo.com.cn.threads; class UpdateInfoThread { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/threads/UpdateInfoThread;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "UpdateInfoThread.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public code:Ljava/lang/String;
a=0;// 
a=0;// .field private context:Landroid/content/Context;
a=0;// 
a=0;// .field private email:Ljava/lang/String;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private phone:Ljava/lang/String;
a=0;// 
a=0;// .field private token:Ljava/lang/String;
a=0;// 
a=0;// .field private uid:Ljava/lang/String;
a=0;// 
a=0;// .field private username:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "handler"    # Landroid/os/Handler;
a=0;//     .param p3, "uid"    # Ljava/lang/String;
a=0;//     .param p4, "token"    # Ljava/lang/String;
a=0;//     .param p5, "email"    # Ljava/lang/String;
a=0;//     .param p6, "phone"    # Ljava/lang/String;
a=0;//     .param p7, "name"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 22
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/UpdateInfoThread;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/UpdateInfoThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 23
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/threads/UpdateInfoThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 24
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/threads/UpdateInfoThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 25
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/threads/UpdateInfoThread;->token:Ljava/lang/String;
a=0;// 
a=0;//     .line 26
a=0;//     iput-object p5, p0, Lcom/twocloo/com/cn/threads/UpdateInfoThread;->email:Ljava/lang/String;
a=0;// 
a=0;//     .line 27
a=0;//     iput-object p6, p0, Lcom/twocloo/com/cn/threads/UpdateInfoThread;->phone:Ljava/lang/String;
a=0;// 
a=0;//     .line 28
a=0;//     iput-object p7, p0, Lcom/twocloo/com/cn/threads/UpdateInfoThread;->username:Ljava/lang/String;
a=0;// 
a=0;//     .line 29
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/threads/UpdateInfoThread;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/UpdateInfoThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-super {p0}, Ljava/lang/Thread;->run()V
a=0;// 
a=0;//     .line 34
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/UpdateInfoThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/UpdateInfoThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/threads/UpdateInfoThread;->token:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/threads/UpdateInfoThread;->phone:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/UpdateInfoThread;->email:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/threads/UpdateInfoThread;->username:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/twocloo/com/cn/http/HttpImpl;->updateInfo(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/threads/UpdateInfoThread;->code:Ljava/lang/String;
a=0;// 
a=0;//     .line 35
a=0;//     const-string v0, "1"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/UpdateInfoThread;->code:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 36
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/UpdateInfoThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/threads/UpdateInfoThread$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/threads/UpdateInfoThread$1;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/threads/UpdateInfoThread$1;-><init>(Lcom/twocloo/com/cn/threads/UpdateInfoThread;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/threads/UpdateInfoThread$1;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 53
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 44
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "2"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/UpdateInfoThread;->code:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 45
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/UpdateInfoThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/threads/UpdateInfoThread$2;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/threads/UpdateInfoThread$2;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/threads/UpdateInfoThread$2;-><init>(Lcom/twocloo/com/cn/threads/UpdateInfoThread;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/threads/UpdateInfoThread$2;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
