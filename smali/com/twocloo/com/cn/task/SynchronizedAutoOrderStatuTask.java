package com.twocloo.com.cn.task; class SynchronizedAutoOrderStatuTask { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;
a=0;// .super Lcom/twocloo/base/sync/EasyTask;
a=0;// .source "SynchronizedAutoOrderStatuTask.java"
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
a=0;// .field private act:Landroid/app/Activity;
a=0;// 
a=0;// .field private aid:Ljava/lang/String;
a=0;// 
a=0;// .field private status:Ljava/lang/String;
a=0;// 
a=0;// .field private token:Ljava/lang/String;
a=0;// 
a=0;// .field private uid:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "caller"    # Landroid/app/Activity;
a=0;//     .param p2, "uid"    # Ljava/lang/String;
a=0;//     .param p3, "token"    # Ljava/lang/String;
a=0;//     .param p4, "aid"    # Ljava/lang/String;
a=0;//     .param p5, "status"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/base/sync/EasyTask;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 29
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;->act:Landroid/app/Activity;
a=0;// 
a=0;//     .line 30
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;->aid:Ljava/lang/String;
a=0;// 
a=0;//     .line 31
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 32
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;->token:Ljava/lang/String;
a=0;// 
a=0;//     .line 33
a=0;//     iput-object p5, p0, Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;->status:Ljava/lang/String;
a=0;// 
a=0;//     .line 34
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
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public varargs doInBackground([Ljava/lang/Void;)Ljava/lang/String;
a=0;//     .locals 9
a=0;//     .param p1, "params"    # [Ljava/lang/Void;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 38
a=0;//     #v1=(Null);
a=0;//     const-string v5, "http://app.2cloo.com/book-set_auto_sub_status?userid=%s&token=%s&articleid=%s&status=%s"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x4
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;->token:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;->aid:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;->status:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 39
a=0;//     .local v0, "autoUrl":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/base/http/HttpHelper;->get(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 40
a=0;//     .local v4, "result":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 53
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 44
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v1=(Null);v2=(Uninit);v3=(Uninit);v5=(Boolean);
a=0;//     new-instance v3, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v3, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 45
a=0;//     .local v3, "jo":Lorg/json/JSONObject;
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     const-string v5, "code"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 46
a=0;//     const-string v5, "code"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 47
a=0;//     .local v1, "code":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 49
a=0;//     .end local v1    # "code":Ljava/lang/String;
a=0;//     .end local v3    # "jo":Lorg/json/JSONObject;
a=0;//     :catch_0
a=0;//     #v1=(Null);v3=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 50
a=0;//     .local v2, "e":Ljava/lang/Exception;
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
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
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;->onPostExecute(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPostExecute(Ljava/lang/String;)V
a=0;//     .locals 5
a=0;//     .param p1, "result"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 58
a=0;//     #v4=(Null);
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const-string v0, "1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;->status:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/twocloo/com/cn/common/LocalStore;->setAuto(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 60
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;->status:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "0"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     const-string v1, "\u53d6\u6d88\u81ea\u52a8\u8ba2\u9605"
a=0;// 
a=0;//     invoke-static {v0, v1, v4}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 69
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 63
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     const-string v1, "\u81ea\u52a8\u8ba2\u9605\u8bbe\u7f6e\u6210\u529f"
a=0;// 
a=0;//     invoke-static {v0, v1, v4}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 67
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/SynchronizedAutoOrderStatuTask;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     const-string v1, "\u8bbe\u7f6e\u5931\u8d25"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v4}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
