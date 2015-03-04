package com.twocloo.com.cn.task; class SDCleanTask { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/task/SDCleanTask;
a=0;// .super Lcom/twocloo/base/sync/EasyTask;
a=0;// .source "SDCleanTask.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/twocloo/base/sync/EasyTask",
a=0;//         "<",
a=0;//         "Landroid/app/Activity;",
a=0;//         "Ljava/lang/Void;",
a=0;//         "Ljava/lang/Void;",
a=0;//         "Ljava/lang/Void;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;)V
a=0;//     .locals 0
a=0;//     .param p1, "caller"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/base/sync/EasyTask;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 23
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/task/SDCleanTask;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/SDCleanTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Void;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
a=0;//     .locals 6
a=0;//     .param p1, "params"    # [Ljava/lang/Void;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 43
a=0;//     #v5=(Null);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v3, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_DATA_ROOT:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 44
a=0;//     .local v0, "dataFile":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     new-instance v3, Lcom/twocloo/com/cn/task/SDCleanTask$1;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/task/SDCleanTask$1;);
a=0;//     invoke-direct {v3, p0}, Lcom/twocloo/com/cn/task/SDCleanTask$1;-><init>(Lcom/twocloo/com/cn/task/SDCleanTask;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/task/SDCleanTask$1;);
a=0;//     invoke-static {v0, v3}, Lcom/twocloo/base/util/FileUtils;->deleteDir(Ljava/io/File;Ljava/io/FilenameFilter;)Z
a=0;// 
a=0;//     .line 57
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v3, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_LOG:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 58
a=0;//     .local v2, "logFile":Ljava/io/File;
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v2, v5}, Lcom/twocloo/base/util/FileUtils;->deleteDir(Ljava/io/File;Ljava/io/FilenameFilter;)Z
a=0;// 
a=0;//     .line 61
a=0;//     const-wide/16 v3, 0x3e8
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 66
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 62
a=0;//     :catch_0
a=0;//     #v1=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 63
a=0;//     .local v1, "e":Ljava/lang/InterruptedException;
a=0;//     #v1=(Reference,Ljava/lang/InterruptedException;);
a=0;//     invoke-virtual {v1}, Ljava/lang/InterruptedException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/SDCleanTask;->onPostExecute(Ljava/lang/Void;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPostExecute(Ljava/lang/Void;)V
a=0;//     .locals 2
a=0;//     .param p1, "result"    # Ljava/lang/Void;
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/SDCleanTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->cancel()V
a=0;// 
a=0;//     .line 36
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/SDCleanTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     const-string v1, "\u6570\u636e\u6e05\u7406\u5b8c\u6210"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/base/util/ViewUtils;->toastLong(Landroid/app/Activity;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPreExecute()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/SDCleanTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "\u6570\u636e\u6e05\u7406\u4e2d...\n\n\u5982\u679c\u6570\u636e\u8fc7\u591a\u82b1\u8d39\u65f6\u95f4\u8f83\u957f\uff0c\u8bf7\u8010\u5fc3\u7b49\u5f85\u3002"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/SDCleanTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 29
a=0;//     return-void
a=0;// .end method
}}
