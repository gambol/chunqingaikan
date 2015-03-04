package com.twocloo.com.cn.threads; class SearchThread { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/threads/SearchThread;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "SearchThread.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public ctx:Landroid/content/Context;
a=0;// 
a=0;// .field public handler:Landroid/os/Handler;
a=0;// 
a=0;// .field public i:I
a=0;// 
a=0;// .field public list:Lcom/twocloo/com/cn/beans/SearchResult;
a=0;// 
a=0;// .field public word:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;I)V
a=0;//     .locals 2
a=0;//     .param p1, "ctx"    # Landroid/content/Context;
a=0;//     .param p2, "handler"    # Landroid/os/Handler;
a=0;//     .param p3, "word"    # Ljava/lang/String;
a=0;//     .param p4, "i"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 28
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/SearchThread;);
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/threads/SearchThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 29
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/SearchThread;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     .line 32
a=0;//     :try_start_0
a=0;//     const-string v1, "gbk"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p3, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/threads/SearchThread;->word:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 36
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     iput p4, p0, Lcom/twocloo/com/cn/threads/SearchThread;->i:I
a=0;// 
a=0;//     .line 38
a=0;//     return-void
a=0;// 
a=0;//     .line 33
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 34
a=0;//     .local v0, "e":Ljava/io/UnsupportedEncodingException;
a=0;//     #v0=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/SearchThread;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/SearchThread;->word:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/threads/SearchThread;->i:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v1, v2}, Lcom/twocloo/com/cn/http/HttpImpl;->seachList(Landroid/app/Activity;Ljava/lang/String;I)Lcom/twocloo/com/cn/beans/SearchResult;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/threads/SearchThread;->list:Lcom/twocloo/com/cn/beans/SearchResult;
a=0;// 
a=0;//     .line 42
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/SearchThread;->list:Lcom/twocloo/com/cn/beans/SearchResult;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 43
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/SearchThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     const/16 v1, 0x14d
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 53
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 47
a=0;//     :cond_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/threads/SearchThread;->i:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 48
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/SearchThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/16 v1, 0x6f
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 50
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(One);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/SearchThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/16 v1, 0xde
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
