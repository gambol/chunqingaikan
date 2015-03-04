package com.twocloo.com.cn.threads; class BanbenxinThread { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/threads/BanbenxinThread;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "BanbenxinThread.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public bbxx:Lcom/twocloo/com/cn/beans/Banbenxinxi;
a=0;// 
a=0;// .field private ctx:Landroid/content/Context;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
a=0;//     .locals 0
a=0;//     .param p1, "ctx"    # Landroid/content/Context;
a=0;//     .param p2, "handler"    # Landroid/os/Handler;
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 17
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/BanbenxinThread;);
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/threads/BanbenxinThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 18
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/BanbenxinThread;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     .line 19
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     const-string v0, "single"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/BanbenxinThread;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 23
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/BanbenxinThread;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/http/HttpImpl;->danbenxinxi(Landroid/content/Context;)Lcom/twocloo/com/cn/beans/Banbenxinxi;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/threads/BanbenxinThread;->bbxx:Lcom/twocloo/com/cn/beans/Banbenxinxi;
a=0;// 
a=0;//     .line 27
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/BanbenxinThread;->bbxx:Lcom/twocloo/com/cn/beans/Banbenxinxi;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 28
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/BanbenxinThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 32
a=0;//     :goto_1
a=0;//     return-void
a=0;// 
a=0;//     .line 25
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/BanbenxinThread;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/http/HttpImpl;->banbenxinxi(Landroid/content/Context;)Lcom/twocloo/com/cn/beans/Banbenxinxi;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/threads/BanbenxinThread;->bbxx:Lcom/twocloo/com/cn/beans/Banbenxinxi;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 30
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/BanbenxinThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
