package com.twocloo.com.cn.threads; class ShubenxinxiyeThread { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "ShubenxinxiyeThread.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public ctx:Landroid/content/Context;
a=0;// 
a=0;// .field public handler:Landroid/os/Handler;
a=0;// 
a=0;// .field public id:Ljava/lang/String;
a=0;// 
a=0;// .field public sbxxy:Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;// .field public source:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "ctx"    # Landroid/content/Context;
a=0;//     .param p2, "handler"    # Landroid/os/Handler;
a=0;//     .param p3, "id"    # Ljava/lang/String;
a=0;//     .param p4, "source"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 15
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->sbxxy:Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     .line 18
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 19
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     .line 20
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->id:Ljava/lang/String;
a=0;// 
a=0;//     .line 21
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->source:Ljava/lang/String;
a=0;// 
a=0;//     .line 22
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->id:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->source:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/twocloo/com/cn/http/HttpImpl;->Shubenxinxiye(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->sbxxy:Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     .line 26
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->sbxxy:Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 27
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     const/16 v1, 0x6f
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 30
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
