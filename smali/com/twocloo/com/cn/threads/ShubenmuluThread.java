package com.twocloo.com.cn.threads; class ShubenmuluThread { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/threads/ShubenmuluThread;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "ShubenmuluThread.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public ctx:Landroid/content/Context;
a=0;// 
a=0;// .field public handler:Landroid/os/Handler;
a=0;// 
a=0;// .field public id:Ljava/lang/String;
a=0;// 
a=0;// .field private isRunning:Z
a=0;// 
a=0;// .field public page:I
a=0;// 
a=0;// .field public sbml:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;// .field public times:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "ctx"    # Landroid/content/Context;
a=0;//     .param p2, "handler"    # Landroid/os/Handler;
a=0;//     .param p3, "id"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 15
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/ShubenmuluThread;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/threads/ShubenmuluThread;->sbml:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     .line 25
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/threads/ShubenmuluThread;->isRunning:Z
a=0;// 
a=0;//     .line 20
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/threads/ShubenmuluThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 21
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/ShubenmuluThread;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     .line 22
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/threads/ShubenmuluThread;->id:Ljava/lang/String;
a=0;// 
a=0;//     .line 23
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/ShubenmuluThread;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     check-cast v1, Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/threads/ShubenmuluThread;->id:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/twocloo/com/cn/http/HttpImpl;->ShubenmuluAll(Landroid/app/Activity;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/threads/ShubenmuluThread;->sbml:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     .line 34
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/ShubenmuluThread;->sbml:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 35
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/threads/ShubenmuluThread;->times:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge v1, v2, :cond_1
a=0;// 
a=0;//     .line 36
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/threads/ShubenmuluThread;->times:I
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/threads/ShubenmuluThread;->times:I
a=0;// 
a=0;//     .line 38
a=0;//     const-wide/16 v1, 0x12c
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v1, v2}, Lcom/twocloo/com/cn/threads/ShubenmuluThread;->sleep(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 42
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/threads/ShubenmuluThread;->run()V
a=0;// 
a=0;//     .line 52
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 39
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(LongLo);v2=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 40
a=0;//     .local v0, "e":Ljava/lang/InterruptedException;
a=0;//     #v0=(Reference,Ljava/lang/InterruptedException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 45
a=0;//     .end local v0    # "e":Ljava/lang/InterruptedException;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Integer);v2=(PosByte);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/ShubenmuluThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 49
a=0;//     :cond_2
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/ShubenmuluThread;->sbml:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-boolean v1, p0, Lcom/twocloo/com/cn/threads/ShubenmuluThread;->isRunning:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 50
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/ShubenmuluThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public stopRun()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/threads/ShubenmuluThread;->isRunning:Z
a=0;// 
a=0;//     .line 29
a=0;//     return-void
a=0;// .end method
}}
