package com.twocloo.com.cn.threads; class ShupingThread { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/threads/ShupingThread;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "ShupingThread.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public ctx:Landroid/content/Context;
a=0;// 
a=0;// .field public id:Ljava/lang/String;
a=0;// 
a=0;// .field public loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;// .field public mhandler:Landroid/os/Handler;
a=0;// 
a=0;// .field public page:I
a=0;// 
a=0;// .field public size:I
a=0;// 
a=0;// .field public spif:Lcom/twocloo/com/cn/beans/Shupinginfo;
a=0;// 
a=0;// .field public type:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;IILandroid/widget/TextView;I)V
a=0;//     .locals 0
a=0;//     .param p1, "ctx"    # Landroid/content/Context;
a=0;//     .param p2, "mhandler"    # Landroid/os/Handler;
a=0;//     .param p3, "id"    # Ljava/lang/String;
a=0;//     .param p4, "page"    # I
a=0;//     .param p5, "size"    # I
a=0;//     .param p6, "loadMoreBtn"    # Landroid/widget/TextView;
a=0;//     .param p7, "type"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 30
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/ShupingThread;);
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/threads/ShupingThread;->mhandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 31
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/ShupingThread;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     .line 32
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/threads/ShupingThread;->id:Ljava/lang/String;
a=0;// 
a=0;//     .line 33
a=0;//     iput p4, p0, Lcom/twocloo/com/cn/threads/ShupingThread;->page:I
a=0;// 
a=0;//     .line 34
a=0;//     iput p5, p0, Lcom/twocloo/com/cn/threads/ShupingThread;->size:I
a=0;// 
a=0;//     .line 35
a=0;//     iput p7, p0, Lcom/twocloo/com/cn/threads/ShupingThread;->type:I
a=0;// 
a=0;//     .line 36
a=0;//     iput-object p6, p0, Lcom/twocloo/com/cn/threads/ShupingThread;->loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/ShupingThread;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     check-cast v1, Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/threads/ShupingThread;->id:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/threads/ShupingThread;->page:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/threads/ShupingThread;->size:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/threads/ShupingThread;->type:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v1, v2, v3, v4, v5}, Lcom/twocloo/com/cn/http/HttpImpl;->Shupinginfo(Landroid/app/Activity;Ljava/lang/String;III)Lcom/twocloo/com/cn/beans/Shupinginfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/threads/ShupingThread;->spif:Lcom/twocloo/com/cn/beans/Shupinginfo;
a=0;// 
a=0;//     .line 41
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/ShupingThread;->spif:Lcom/twocloo/com/cn/beans/Shupinginfo;
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 61
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 44
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Reference,Lcom/twocloo/com/cn/beans/Shupinginfo;);v2=(Reference,Ljava/lang/String;);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/threads/ShupingThread;->page:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-ne v1, v2, :cond_2
a=0;// 
a=0;//     .line 45
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/ShupingThread;->mhandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 50
a=0;//     :goto_1
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/ShupingThread;->loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 51
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/ShupingThread;->spif:Lcom/twocloo/com/cn/beans/Shupinginfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shupinginfo;->getTotal_page_number()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 52
a=0;//     .local v0, "totalPageNumber":I
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/threads/ShupingThread;->page:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/ShupingThread;->mhandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v2, Lcom/twocloo/com/cn/threads/ShupingThread$1;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/threads/ShupingThread$1;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/threads/ShupingThread$1;-><init>(Lcom/twocloo/com/cn/threads/ShupingThread;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/threads/ShupingThread$1;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 47
a=0;//     .end local v0    # "totalPageNumber":I
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Integer);v2=(One);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/ShupingThread;->mhandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
