package com.lidroid.xutils.util.core; class CompatibleAsyncTask$InternalHandler { void a() { int a;
a=0;// .class Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$InternalHandler;
a=0;// .super Landroid/os/Handler;
a=0;// .source "CompatibleAsyncTask.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "InternalHandler"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 617
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$InternalHandler;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$InternalHandler;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 617
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$InternalHandler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$InternalHandler;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 4
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     .line 621
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$AsyncTaskResult;
a=0;// 
a=0;//     .line 622
a=0;//     .local v0, "result":Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$AsyncTaskResult;, "Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$AsyncTaskResult<*>;"
a=0;//     iget v1, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 631
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 625
a=0;//     :pswitch_0
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$AsyncTaskResult;->mTask:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;);
a=0;//     iget-object v2, v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$AsyncTaskResult;->mData:[Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aget-object v2, v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v1, v2}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->access$0(Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 628
a=0;//     :pswitch_1
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$AsyncTaskResult;->mTask:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;);
a=0;//     iget-object v2, v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$AsyncTaskResult;->mData:[Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v1, v2}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->onProgressUpdate([Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 622
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
}}
