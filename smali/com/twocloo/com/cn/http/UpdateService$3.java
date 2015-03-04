package com.twocloo.com.cn.http; class UpdateService$3 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/http/UpdateService$3;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "UpdateService.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/http/UpdateService;->doUp()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/http/UpdateService;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/http/UpdateService;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/http/UpdateService$3;->this$0:Lcom/twocloo/com/cn/http/UpdateService;
a=0;// 
a=0;//     .line 114
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/http/UpdateService$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 116
a=0;//     const-string v2, "\u6267\u884c\u7ae0\u8282\u66f4\u65b0\u63d0\u793a\u7ebf\u7a0b"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 117
a=0;//     new-instance v0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/http/UpdateService$3;->this$0:Lcom/twocloo/com/cn/http/UpdateService;
a=0;// 
a=0;//     invoke-direct {v0, v2}, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 118
a=0;//     .local v0, "ck":Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->run()V
a=0;// 
a=0;//     .line 119
a=0;//     iget-boolean v2, v0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->hasup:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 120
a=0;//     new-instance v1, Landroid/os/Message;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v1}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     .line 121
a=0;//     .local v1, "msg":Landroid/os/Message;
a=0;//     #v1=(Reference,Landroid/os/Message;);
a=0;//     iget v2, v0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->count:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     .line 122
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, v1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 123
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/http/UpdateService$3;->this$0:Lcom/twocloo/com/cn/http/UpdateService;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/http/UpdateService;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/http/UpdateService;->access$1(Lcom/twocloo/com/cn/http/UpdateService;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 125
a=0;//     .end local v1    # "msg":Landroid/os/Message;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
