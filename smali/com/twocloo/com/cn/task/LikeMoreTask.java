package com.twocloo.com.cn.task; class LikeMoreTask { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/task/LikeMoreTask;
a=0;// .super Lcom/twocloo/base/sync/EasyTask;
a=0;// .source "LikeMoreTask.java"
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
a=0;//         "Ljava/util/ArrayList",
a=0;//         "<",
a=0;//         "Lcom/twocloo/com/cn/beans/LikeMoreBookBean;",
a=0;//         ">;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private act:Landroid/app/Activity;
a=0;// 
a=0;// .field private aid:Ljava/lang/String;
a=0;// 
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private size:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;ILandroid/os/Handler;)V
a=0;//     .locals 0
a=0;//     .param p1, "caller"    # Landroid/app/Activity;
a=0;//     .param p2, "aid"    # Ljava/lang/String;
a=0;//     .param p3, "size"    # I
a=0;//     .param p4, "handler"    # Landroid/os/Handler;
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/base/sync/EasyTask;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 27
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/task/LikeMoreTask;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/task/LikeMoreTask;->act:Landroid/app/Activity;
a=0;// 
a=0;//     .line 28
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/task/LikeMoreTask;->aid:Ljava/lang/String;
a=0;// 
a=0;//     .line 29
a=0;//     iput p3, p0, Lcom/twocloo/com/cn/task/LikeMoreTask;->size:I
a=0;// 
a=0;//     .line 30
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/task/LikeMoreTask;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 31
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
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/LikeMoreTask;->doInBackground([Ljava/lang/Void;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public varargs doInBackground([Ljava/lang/Void;)Ljava/util/ArrayList;
a=0;//     .locals 4
a=0;//     .param p1, "params"    # [Ljava/lang/Void;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([",
a=0;//             "Ljava/lang/Void;",
a=0;//             ")",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/LikeMoreBookBean;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/LikeMoreTask;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/task/LikeMoreTask;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/task/LikeMoreTask;->size:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v1, v2, v3}, Lcom/twocloo/com/cn/http/HttpImpl;->getMorebooks(Landroid/app/Activity;Ljava/lang/String;I)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 36
a=0;//     .local v0, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/LikeMoreBookBean;>;"
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/LikeMoreTask;->onPostExecute(Ljava/util/ArrayList;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPostExecute(Ljava/util/ArrayList;)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/LikeMoreBookBean;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     .local p1, "result":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/LikeMoreBookBean;>;"
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 43
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/LikeMoreTask;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 44
a=0;//     .local v0, "message":Landroid/os/Message;
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 45
a=0;//     const/16 v1, 0x7d1
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 46
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 51
a=0;//     .end local v0    # "message":Landroid/os/Message;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}