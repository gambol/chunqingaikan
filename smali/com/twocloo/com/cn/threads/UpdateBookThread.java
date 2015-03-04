package com.twocloo.com.cn.threads; class UpdateBookThread { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/threads/UpdateBookThread;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "UpdateBookThread.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private act:Landroid/app/Activity;
a=0;// 
a=0;// .field private aid:Ljava/lang/String;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private title:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Landroid/os/Handler;)V
a=0;//     .locals 0
a=0;//     .param p1, "act"    # Landroid/app/Activity;
a=0;//     .param p2, "aid"    # Ljava/lang/String;
a=0;//     .param p3, "title"    # Ljava/lang/String;
a=0;//     .param p4, "handler"    # Landroid/os/Handler;
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 23
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/UpdateBookThread;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/UpdateBookThread;->act:Landroid/app/Activity;
a=0;// 
a=0;//     .line 24
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/threads/UpdateBookThread;->aid:Ljava/lang/String;
a=0;// 
a=0;//     .line 25
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/threads/UpdateBookThread;->title:Ljava/lang/String;
a=0;// 
a=0;//     .line 26
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/threads/UpdateBookThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 27
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 31
a=0;//     #v7=(Null);
a=0;//     const-wide/16 v4, 0x64
a=0;// 
a=0;//     :try_start_0
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 36
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/http/DownFile;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/UpdateBookThread;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/Activity;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/threads/UpdateBookThread;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/threads/UpdateBookThread;->title:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v4, v5, v6}, Lcom/twocloo/com/cn/http/DownFile;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 37
a=0;//     .local v1, "downFile":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/http/DownFile;->doDown()V
a=0;// 
a=0;//     .line 39
a=0;//     iget v4, v1, Lcom/twocloo/com/cn/http/DownFile;->isOK:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     if-ne v4, v5, :cond_1
a=0;// 
a=0;//     .line 56
a=0;//     sget-object v4, Lcom/twocloo/com/cn/common/CloseActivity;->curActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/Activity;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 57
a=0;//     new-instance v0, Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     sget-object v4, Lcom/twocloo/com/cn/common/CloseActivity;->curActivity:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-direct {v0, v4}, Lcom/twocloo/com/cn/db/DBAdapter;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 58
a=0;//     .local v0, "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/DBAdapter;->open()V
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/UpdateBookThread;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v4, v7, v7}, Lcom/twocloo/com/cn/db/DBAdapter;->isNeedUp(Ljava/lang/String;II)J
a=0;// 
a=0;//     .line 60
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/UpdateBookThread;->aid:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v5, v1, Lcom/twocloo/com/cn/http/DownFile;->mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getLastuptime()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-virtual {v0, v4, v5, v6}, Lcom/twocloo/com/cn/db/DBAdapter;->upLasttime(Ljava/lang/String;J)J
a=0;// 
a=0;//     .line 62
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/UpdateBookThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 63
a=0;//     .local v3, "message":Landroid/os/Message;
a=0;//     #v3=(Reference,Landroid/os/Message;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/UpdateBookThread;->title:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v4, v3, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 64
a=0;//     const/16 v4, 0x150
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     iput v4, v3, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 65
a=0;//     invoke-virtual {v3}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 76
a=0;//     .end local v0    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .end local v3    # "message":Landroid/os/Message;
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 32
a=0;//     .end local v1    # "downFile":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(LongLo);v5=(LongHi);v6=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 33
a=0;//     .local v2, "e":Ljava/lang/InterruptedException;
a=0;//     #v2=(Reference,Ljava/lang/InterruptedException;);
a=0;//     invoke-virtual {v2}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v2}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 71
a=0;//     .end local v2    # "e":Ljava/lang/InterruptedException;
a=0;//     .restart local v1    # "downFile":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     :cond_1
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/http/DownFile;);v2=(Conflicted);v4=(Integer);v5=(One);v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/UpdateBookThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v4}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 72
a=0;//     .restart local v3    # "message":Landroid/os/Message;
a=0;//     #v3=(Reference,Landroid/os/Message;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/UpdateBookThread;->title:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v4, v3, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 73
a=0;//     const/16 v4, 0x14f
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     iput v4, v3, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 74
a=0;//     invoke-virtual {v3}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
