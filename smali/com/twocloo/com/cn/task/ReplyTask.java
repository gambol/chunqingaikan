package com.twocloo.com.cn.task; class ReplyTask { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/task/ReplyTask;
a=0;// .super Lcom/twocloo/base/sync/EasyTask;
a=0;// .source "ReplyTask.java"
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
a=0;//         "Ljava/lang/String;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private ctx:Landroid/app/Activity;
a=0;// 
a=0;// .field private isLoadmore:Z
a=0;// 
a=0;// .field private loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;// .field private mAid:Ljava/lang/String;
a=0;// 
a=0;// .field private mCallback:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/twocloo/com/cn/singlebook/DataCallBack",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mTid:I
a=0;// 
a=0;// .field private page:I
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private pid:I
a=0;// 
a=0;// .field private size:I
a=0;// 
a=0;// .field public spif:Lcom/twocloo/com/cn/beans/Shupinginfo;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;IILjava/lang/String;IILandroid/widget/TextView;ZLcom/twocloo/com/cn/singlebook/DataCallBack;)V
a=0;//     .locals 1
a=0;//     .param p1, "caller"    # Landroid/app/Activity;
a=0;//     .param p2, "tid"    # I
a=0;//     .param p3, "pid"    # I
a=0;//     .param p4, "aid"    # Ljava/lang/String;
a=0;//     .param p5, "page"    # I
a=0;//     .param p6, "size"    # I
a=0;//     .param p7, "loadMoreButton"    # Landroid/widget/TextView;
a=0;//     .param p8, "isFromLoadmore"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/app/Activity;",
a=0;//             "II",
a=0;//             "Ljava/lang/String;",
a=0;//             "II",
a=0;//             "Landroid/widget/TextView;",
a=0;//             "Z",
a=0;//             "Lcom/twocloo/com/cn/singlebook/DataCallBack",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     .local p9, "callback":Lcom/twocloo/com/cn/singlebook/DataCallBack;, "Lcom/twocloo/com/cn/singlebook/DataCallBack<Ljava/lang/String;>;"
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/base/sync/EasyTask;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 31
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/task/ReplyTask;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/task/ReplyTask;->isLoadmore:Z
a=0;// 
a=0;//     .line 38
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/task/ReplyTask;->ctx:Landroid/app/Activity;
a=0;// 
a=0;//     .line 39
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/task/ReplyTask;->mAid:Ljava/lang/String;
a=0;// 
a=0;//     .line 40
a=0;//     iput p3, p0, Lcom/twocloo/com/cn/task/ReplyTask;->pid:I
a=0;// 
a=0;//     .line 41
a=0;//     iput p2, p0, Lcom/twocloo/com/cn/task/ReplyTask;->mTid:I
a=0;// 
a=0;//     .line 42
a=0;//     iput p5, p0, Lcom/twocloo/com/cn/task/ReplyTask;->page:I
a=0;// 
a=0;//     .line 43
a=0;//     iput p6, p0, Lcom/twocloo/com/cn/task/ReplyTask;->size:I
a=0;// 
a=0;//     .line 44
a=0;//     iput-object p7, p0, Lcom/twocloo/com/cn/task/ReplyTask;->loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 45
a=0;//     iput-boolean p8, p0, Lcom/twocloo/com/cn/task/ReplyTask;->isLoadmore:Z
a=0;// 
a=0;//     .line 46
a=0;//     iput-object p9, p0, Lcom/twocloo/com/cn/task/ReplyTask;->mCallback:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     .line 47
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
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/ReplyTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public varargs doInBackground([Ljava/lang/Void;)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .param p1, "params"    # [Ljava/lang/Void;
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v1, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 59
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 68
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 61
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Reference,Lcom/twocloo/base/common/NetType;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/ReplyTask;->ctx:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/task/ReplyTask;->mTid:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/task/ReplyTask;->pid:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/task/ReplyTask;->mAid:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/task/ReplyTask;->page:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/task/ReplyTask;->size:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/twocloo/com/cn/http/HttpImpl;->replyinfo(Landroid/app/Activity;IILjava/lang/String;II)Lcom/twocloo/com/cn/beans/Shupinginfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/ReplyTask;->spif:Lcom/twocloo/com/cn/beans/Shupinginfo;
a=0;// 
a=0;//     .line 62
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/ReplyTask;->spif:Lcom/twocloo/com/cn/beans/Shupinginfo;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 63
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 65
a=0;//     :cond_1
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/task/ReplyTask;->page:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 66
a=0;//     const-string v0, "one"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 68
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "more"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/ReplyTask;->onPostExecute(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPostExecute(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "result"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/ReplyTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/ProgressDialog;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 74
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/ReplyTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->cancel()V
a=0;// 
a=0;//     .line 76
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/ReplyTask;->loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/ReplyTask;->spif:Lcom/twocloo/com/cn/beans/Shupinginfo;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/ReplyTask;->spif:Lcom/twocloo/com/cn/beans/Shupinginfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shupinginfo;->getTotal_page_number()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 78
a=0;//     .local v0, "totalPageNumber":I
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/task/ReplyTask;->page:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 79
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/ReplyTask;->loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 82
a=0;//     .end local v0    # "totalPageNumber":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/ReplyTask;->mCallback:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/singlebook/DataCallBack;);
a=0;//     invoke-virtual {v1, p1}, Lcom/twocloo/com/cn/singlebook/DataCallBack;->callBack(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 83
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPreExecute()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     invoke-super {p0}, Lcom/twocloo/base/sync/EasyTask;->onPreExecute()V
a=0;// 
a=0;//     .line 52
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/task/ReplyTask;->isLoadmore:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/ReplyTask;->ctx:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     const-string v1, "\u6b63\u5728\u52a0\u8f7d\u4e2d"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/ReplyTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 54
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
