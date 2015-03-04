package com.twocloo.com.cn.task; class BaoyueTask { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/task/BaoyueTask;
a=0;// .super Lcom/twocloo/base/sync/EasyTask;
a=0;// .source "BaoyueTask.java"
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
a=0;//         "Lcom/twocloo/com/cn/beans/SubResultBean;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private ctx:Landroid/app/Activity;
a=0;// 
a=0;// .field private mCallback:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/twocloo/com/cn/singlebook/DataCallBack",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/SubResultBean;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private type:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;Lcom/twocloo/com/cn/singlebook/DataCallBack;)V
a=0;//     .locals 0
a=0;//     .param p1, "caller"    # Landroid/app/Activity;
a=0;//     .param p2, "type"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/app/Activity;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/twocloo/com/cn/singlebook/DataCallBack",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/SubResultBean;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     .local p3, "callback":Lcom/twocloo/com/cn/singlebook/DataCallBack;, "Lcom/twocloo/com/cn/singlebook/DataCallBack<Lcom/twocloo/com/cn/beans/SubResultBean;>;"
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/base/sync/EasyTask;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 37
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/task/BaoyueTask;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/task/BaoyueTask;->ctx:Landroid/app/Activity;
a=0;// 
a=0;//     .line 38
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/task/BaoyueTask;->type:Ljava/lang/String;
a=0;// 
a=0;//     .line 39
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/task/BaoyueTask;->mCallback:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public varargs doInBackground([Ljava/lang/Void;)Lcom/twocloo/com/cn/beans/SubResultBean;
a=0;//     .locals 10
a=0;//     .param p1, "params"    # [Ljava/lang/Void;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 51
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v6, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v5, v6}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 68
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Lcom/twocloo/com/cn/beans/SubResultBean;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 55
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Boolean);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 56
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 57
a=0;//     .local v3, "uid":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 58
a=0;//     .local v2, "token":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "http://app.2cloo.com/user-buy_month&userid=%s&token=%s&type=%s"
a=0;// 
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     new-array v7, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     aput-object v3, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     aput-object v2, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/task/BaoyueTask;->type:Ljava/lang/String;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     aput-object v9, v7, v8
a=0;// 
a=0;//     invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/task/BaoyueTask;->ctx:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 59
a=0;//     .local v4, "url":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "result"
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "baoyue url = "
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 61
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 62
a=0;//     .local v0, "jo":Lorg/json/JSONObject;
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 65
a=0;//     invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-class v6, Lcom/twocloo/com/cn/beans/SubResultBean;
a=0;// 
a=0;//     invoke-static {v5, v6}, Lcom/twocloo/base/util/JsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloo/com/cn/beans/SubResultBean;
a=0;// 
a=0;//     .line 66
a=0;//     .local v1, "resultbean":Lcom/twocloo/com/cn/beans/SubResultBean;
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/BaoyueTask;->doInBackground([Ljava/lang/Void;)Lcom/twocloo/com/cn/beans/SubResultBean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/SubResultBean;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onPostExecute(Lcom/twocloo/com/cn/beans/SubResultBean;)V
a=0;//     .locals 4
a=0;//     .param p1, "obj"    # Lcom/twocloo/com/cn/beans/SubResultBean;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 72
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/BaoyueTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/BaoyueTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 75
a=0;//     :cond_0
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 76
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/BaoyueTask;->ctx:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BaoyueTask;->ctx:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 87
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 79
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v2=(Uninit);
a=0;//     if-nez p1, :cond_3
a=0;// 
a=0;//     .line 80
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/BaoyueTask;->ctx:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     const-string v1, "\u5305\u6708\u5931\u8d25,\u8bf7\u91cd\u8bd5!"
a=0;// 
a=0;//     invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 83
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/BaoyueTask;->mCallback:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/singlebook/DataCallBack;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/BaoyueTask;->mCallback:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/twocloo/com/cn/singlebook/DataCallBack;->callBack(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Lcom/twocloo/com/cn/beans/SubResultBean;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/BaoyueTask;->onPostExecute(Lcom/twocloo/com/cn/beans/SubResultBean;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPreExecute()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-super {p0}, Lcom/twocloo/base/sync/EasyTask;->onPreExecute()V
a=0;// 
a=0;//     .line 45
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/BaoyueTask;->ctx:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     const-string v1, "\u5305\u6708\u4e2d..."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/BaoyueTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 46
a=0;//     return-void
a=0;// .end method
}}
