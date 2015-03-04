package com.twocloo.com.cn.http; class RecommendClientsService$UpdateRunnable { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/http/RecommendClientsService$UpdateRunnable;
a=0;// .super Ljava/lang/Object;
a=0;// .source "RecommendClientsService.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/http/RecommendClientsService;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "UpdateRunnable"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field message:Landroid/os/Message;
a=0;// 
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/http/RecommendClientsService;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/twocloo/com/cn/http/RecommendClientsService;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/http/RecommendClientsService$UpdateRunnable;->this$0:Lcom/twocloo/com/cn/http/RecommendClientsService;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 84
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/http/RecommendClientsService$UpdateRunnable;);
a=0;//     invoke-static {p1}, Lcom/twocloo/com/cn/http/RecommendClientsService;->access$5(Lcom/twocloo/com/cn/http/RecommendClientsService;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/http/RecommendClientsService$UpdateRunnable;->message:Landroid/os/Message;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/twocloo/com/cn/http/RecommendClientsService;Lcom/twocloo/com/cn/http/RecommendClientsService$UpdateRunnable;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/http/RecommendClientsService$UpdateRunnable;-><init>(Lcom/twocloo/com/cn/http/RecommendClientsService;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/http/RecommendClientsService$UpdateRunnable;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/RecommendClientsService$UpdateRunnable;->message:Landroid/os/Message;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Message;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iput v4, v3, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 89
a=0;//     :try_start_0
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/RecommendClientsService$UpdateRunnable;->this$0:Lcom/twocloo/com/cn/http/RecommendClientsService;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/http/RecommendClientsService;->access$6(Lcom/twocloo/com/cn/http/RecommendClientsService;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/RecommendClientsService$UpdateRunnable;->this$0:Lcom/twocloo/com/cn/http/RecommendClientsService;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/http/RecommendClientsService;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/http/RecommendClientsService;->access$6(Lcom/twocloo/com/cn/http/RecommendClientsService;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 92
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/RecommendClientsService$UpdateRunnable;->this$0:Lcom/twocloo/com/cn/http/RecommendClientsService;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/http/RecommendClientsService;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/http/RecommendClientsService;->access$0(Lcom/twocloo/com/cn/http/RecommendClientsService;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/RecommendClientsService$UpdateRunnable;->this$0:Lcom/twocloo/com/cn/http/RecommendClientsService;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/http/RecommendClientsService;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/http/RecommendClientsService;->access$0(Lcom/twocloo/com/cn/http/RecommendClientsService;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z
a=0;// 
a=0;//     .line 95
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/RecommendClientsService$UpdateRunnable;->this$0:Lcom/twocloo/com/cn/http/RecommendClientsService;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/http/RecommendClientsService;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/http/RecommendClientsService$UpdateRunnable;->this$0:Lcom/twocloo/com/cn/http/RecommendClientsService;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/http/RecommendClientsService;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/http/RecommendClientsService;->access$7(Lcom/twocloo/com/cn/http/RecommendClientsService;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/http/RecommendClientsService$UpdateRunnable;->this$0:Lcom/twocloo/com/cn/http/RecommendClientsService;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/http/RecommendClientsService;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/http/RecommendClientsService;->access$0(Lcom/twocloo/com/cn/http/RecommendClientsService;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5}, Lcom/twocloo/com/cn/http/RecommendClientsService;->downloadUpdateFile(Ljava/lang/String;Ljava/io/File;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 96
a=0;//     .local v0, "downloadSize":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v3, v0, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_2
a=0;// 
a=0;//     .line 98
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/RecommendClientsService$UpdateRunnable;->this$0:Lcom/twocloo/com/cn/http/RecommendClientsService;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/http/RecommendClientsService;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/http/RecommendClientsService;->access$5(Lcom/twocloo/com/cn/http/RecommendClientsService;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/http/RecommendClientsService$UpdateRunnable;->message:Landroid/os/Message;
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Message;);
a=0;//     invoke-virtual {v3, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 106
a=0;//     .end local v0    # "downloadSize":J
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 100
a=0;//     :catch_0
a=0;//     #v2=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 101
a=0;//     .local v2, "e":Ljava/lang/Exception;
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v2}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/RecommendClientsService$UpdateRunnable;->message:Landroid/os/Message;
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     iput v4, v3, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/RecommendClientsService$UpdateRunnable;->this$0:Lcom/twocloo/com/cn/http/RecommendClientsService;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/http/RecommendClientsService;->access$5(Lcom/twocloo/com/cn/http/RecommendClientsService;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/http/RecommendClientsService$UpdateRunnable;->message:Landroid/os/Message;
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Message;);
a=0;//     invoke-virtual {v3, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
