package com.twocloo.com.cn.task; class GetAutoOrderTask { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/task/GetAutoOrderTask;
a=0;// .super Lcom/twocloo/base/sync/EasyTask;
a=0;// .source "GetAutoOrderTask.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/task/GetAutoOrderTask$AutoBean;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/twocloo/base/sync/EasyTask",
a=0;//         "<",
a=0;//         "Landroid/app/Activity;",
a=0;//         "Ljava/lang/Void;",
a=0;//         "Ljava/lang/Void;",
a=0;//         "Lcom/twocloo/com/cn/task/GetAutoOrderTask$AutoBean;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private act:Landroid/app/Activity;
a=0;// 
a=0;// .field private final aid:Ljava/lang/String;
a=0;// 
a=0;// .field private callback:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/twocloo/com/cn/singlebook/DataCallBack",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/task/GetAutoOrderTask$AutoBean;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private result:Ljava/lang/String;
a=0;// 
a=0;// .field private sp:Landroid/content/SharedPreferences;
a=0;// 
a=0;// .field private final uid:Ljava/lang/String;
a=0;// 
a=0;// .field private url:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/twocloo/com/cn/singlebook/DataCallBack;)V
a=0;//     .locals 0
a=0;//     .param p1, "caller"    # Landroid/app/Activity;
a=0;//     .param p2, "url"    # Ljava/lang/String;
a=0;//     .param p3, "uid"    # Ljava/lang/String;
a=0;//     .param p4, "aid"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/app/Activity;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/twocloo/com/cn/singlebook/DataCallBack",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/task/GetAutoOrderTask$AutoBean;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     .local p5, "callback":Lcom/twocloo/com/cn/singlebook/DataCallBack;, "Lcom/twocloo/com/cn/singlebook/DataCallBack<Lcom/twocloo/com/cn/task/GetAutoOrderTask$AutoBean;>;"
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/base/sync/EasyTask;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 35
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/task/GetAutoOrderTask;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/task/GetAutoOrderTask;->act:Landroid/app/Activity;
a=0;// 
a=0;//     .line 36
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/task/GetAutoOrderTask;->url:Ljava/lang/String;
a=0;// 
a=0;//     .line 37
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/task/GetAutoOrderTask;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 38
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/task/GetAutoOrderTask;->aid:Ljava/lang/String;
a=0;// 
a=0;//     .line 39
a=0;//     iput-object p5, p0, Lcom/twocloo/com/cn/task/GetAutoOrderTask;->callback:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public varargs doInBackground([Ljava/lang/Void;)Lcom/twocloo/com/cn/task/GetAutoOrderTask$AutoBean;
a=0;//     .locals 8
a=0;//     .param p1, "params"    # [Ljava/lang/Void;
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     new-instance v1, Lcom/twocloo/com/cn/task/GetAutoOrderTask$AutoBean;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/task/GetAutoOrderTask$AutoBean;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/task/GetAutoOrderTask$AutoBean;-><init>(Lcom/twocloo/com/cn/task/GetAutoOrderTask;)V
a=0;// 
a=0;//     .line 55
a=0;//     .local v1, "autobean":Lcom/twocloo/com/cn/task/GetAutoOrderTask$AutoBean;
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/task/GetAutoOrderTask$AutoBean;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/task/GetAutoOrderTask;->url:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {v5, v6}, Lcom/twocloo/base/http/HttpHelper;->get(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iput-object v5, p0, Lcom/twocloo/com/cn/task/GetAutoOrderTask;->result:Ljava/lang/String;
a=0;// 
a=0;//     .line 56
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/task/GetAutoOrderTask;->result:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/task/GetAutoOrderTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Landroid/content/Context;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/task/GetAutoOrderTask;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/task/GetAutoOrderTask;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v6, v7}, Lcom/twocloo/com/cn/common/LocalStore;->getAuto(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v1, v5}, Lcom/twocloo/com/cn/task/GetAutoOrderTask$AutoBean;->setAuto_sub(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 71
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 61
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Boolean);v6=(Null);v7=(Uninit);
a=0;//     new-instance v3, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/json/JSONObject;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/task/GetAutoOrderTask;->result:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 62
a=0;//     .local v3, "obj":Lorg/json/JSONObject;
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v5, "auto_sub"
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 63
a=0;//     .local v0, "auto":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "verify"
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 64
a=0;//     .local v4, "verify":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Lcom/twocloo/com/cn/task/GetAutoOrderTask$AutoBean;->setAuto_sub(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 65
a=0;//     invoke-virtual {v1, v4}, Lcom/twocloo/com/cn/task/GetAutoOrderTask$AutoBean;->setVerify(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 68
a=0;//     .end local v0    # "auto":Ljava/lang/String;
a=0;//     .end local v3    # "obj":Lorg/json/JSONObject;
a=0;//     .end local v4    # "verify":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 69
a=0;//     .local v2, "e":Ljava/lang/Throwable;
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
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
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/GetAutoOrderTask;->doInBackground([Ljava/lang/Void;)Lcom/twocloo/com/cn/task/GetAutoOrderTask$AutoBean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/task/GetAutoOrderTask$AutoBean;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onPostExecute(Lcom/twocloo/com/cn/task/GetAutoOrderTask$AutoBean;)V
a=0;//     .locals 4
a=0;//     .param p1, "result"    # Lcom/twocloo/com/cn/task/GetAutoOrderTask$AutoBean;
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/GetAutoOrderTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 76
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/GetAutoOrderTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 78
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/GetAutoOrderTask;->callback:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/twocloo/com/cn/singlebook/DataCallBack;->callBack(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 80
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/GetAutoOrderTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/GetAutoOrderTask;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/task/GetAutoOrderTask;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/task/GetAutoOrderTask$AutoBean;->getAuto_sub()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/twocloo/com/cn/common/LocalStore;->setAuto(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 81
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Lcom/twocloo/com/cn/task/GetAutoOrderTask$AutoBean;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/GetAutoOrderTask;->onPostExecute(Lcom/twocloo/com/cn/task/GetAutoOrderTask$AutoBean;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPreExecute()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/GetAutoOrderTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 45
a=0;//     new-instance v0, Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/ProgressDialog;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/GetAutoOrderTask;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     invoke-direct {v0, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/GetAutoOrderTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 46
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/GetAutoOrderTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V
a=0;// 
a=0;//     .line 48
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-super {p0}, Lcom/twocloo/base/sync/EasyTask;->onPreExecute()V
a=0;// 
a=0;//     .line 49
a=0;//     return-void
a=0;// .end method
}}
