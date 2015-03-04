package com.lidroid.xutils.util.core; class CompatibleAsyncTask$3 { void a() { int a;
a=0;// .class Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$3;
a=0;// .super Ljava/util/concurrent/FutureTask;
a=0;// .source "CompatibleAsyncTask.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;-><init>()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/util/concurrent/FutureTask",
a=0;//         "<TResult;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;Ljava/util/concurrent/Callable;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     .local p2, "$anonymous0":Ljava/util/concurrent/Callable;, "Ljava/util/concurrent/Callable<TResult;>;"
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$3;->this$0:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;
a=0;// 
a=0;//     .line 285
a=0;//     invoke-direct {p0, p2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected done()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 289
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$3;->this$0:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;);
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$3;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->access$3(Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
a=0;// 
a=0;//     .line 298
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 290
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 291
a=0;//     .local v0, "e":Ljava/lang/InterruptedException;
a=0;//     #v0=(Reference,Ljava/lang/InterruptedException;);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/LogUtils;->w(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 292
a=0;//     .end local v0    # "e":Ljava/lang/InterruptedException;
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 293
a=0;//     .local v0, "e":Ljava/util/concurrent/ExecutionException;
a=0;//     #v0=(Reference,Ljava/util/concurrent/ExecutionException;);
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v2, "An error occured while executing doInBackground()"
a=0;// 
a=0;//     .line 294
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 293
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-direct {v1, v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 295
a=0;//     .end local v0    # "e":Ljava/util/concurrent/ExecutionException;
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 296
a=0;//     .local v0, "e":Ljava/util/concurrent/CancellationException;
a=0;//     #v0=(Reference,Ljava/util/concurrent/CancellationException;);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$3;->this$0:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v1, v2}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->access$3(Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
