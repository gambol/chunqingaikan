package com.twocloo.com.cn.task; class GetOtherBookTask { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/task/GetOtherBookTask;
a=0;// .super Lcom/twocloo/base/sync/EasyTask;
a=0;// .source "GetOtherBookTask.java"
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
a=0;//         "Lcom/twocloo/com/cn/beans/OtherBookInfo;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private act:Landroid/app/Activity;
a=0;// 
a=0;// .field private aid:Ljava/lang/String;
a=0;// 
a=0;// .field private authorid:Ljava/lang/String;
a=0;// 
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private page:I
a=0;// 
a=0;// .field private size:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;IILandroid/os/Handler;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "caller"    # Landroid/app/Activity;
a=0;//     .param p2, "authorid"    # Ljava/lang/String;
a=0;//     .param p3, "page"    # I
a=0;//     .param p4, "size"    # I
a=0;//     .param p5, "handler"    # Landroid/os/Handler;
a=0;//     .param p6, "aid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/base/sync/EasyTask;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 27
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/task/GetOtherBookTask;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/task/GetOtherBookTask;->act:Landroid/app/Activity;
a=0;// 
a=0;//     .line 28
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/task/GetOtherBookTask;->authorid:Ljava/lang/String;
a=0;// 
a=0;//     .line 29
a=0;//     iput p3, p0, Lcom/twocloo/com/cn/task/GetOtherBookTask;->page:I
a=0;// 
a=0;//     .line 30
a=0;//     iput p4, p0, Lcom/twocloo/com/cn/task/GetOtherBookTask;->size:I
a=0;// 
a=0;//     .line 31
a=0;//     iput-object p5, p0, Lcom/twocloo/com/cn/task/GetOtherBookTask;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 32
a=0;//     iput-object p6, p0, Lcom/twocloo/com/cn/task/GetOtherBookTask;->aid:Ljava/lang/String;
a=0;// 
a=0;//     .line 33
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public varargs doInBackground([Ljava/lang/Void;)Lcom/twocloo/com/cn/beans/OtherBookInfo;
a=0;//     .locals 6
a=0;//     .param p1, "params"    # [Ljava/lang/Void;
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/GetOtherBookTask;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/task/GetOtherBookTask;->authorid:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/task/GetOtherBookTask;->page:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/task/GetOtherBookTask;->size:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/task/GetOtherBookTask;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3, v4, v5}, Lcom/twocloo/com/cn/http/HttpImpl;->getbooks(Landroid/app/Activity;Ljava/lang/String;IILjava/lang/String;)Lcom/twocloo/com/cn/beans/OtherBookInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 42
a=0;//     .local v0, "obi":Lcom/twocloo/com/cn/beans/OtherBookInfo;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/OtherBookInfo;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/GetOtherBookTask;->doInBackground([Ljava/lang/Void;)Lcom/twocloo/com/cn/beans/OtherBookInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/OtherBookInfo;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onPostExecute(Lcom/twocloo/com/cn/beans/OtherBookInfo;)V
a=0;//     .locals 2
a=0;//     .param p1, "result"    # Lcom/twocloo/com/cn/beans/OtherBookInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 48
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/GetOtherBookTask;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 49
a=0;//     .local v0, "message":Landroid/os/Message;
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 50
a=0;//     const/16 v1, 0x7d0
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 51
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 56
a=0;//     .end local v0    # "message":Landroid/os/Message;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Lcom/twocloo/com/cn/beans/OtherBookInfo;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/GetOtherBookTask;->onPostExecute(Lcom/twocloo/com/cn/beans/OtherBookInfo;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPreExecute()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
}}
