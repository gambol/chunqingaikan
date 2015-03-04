package com.twocloo.com.cn.task; class RechargeCUTask { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/task/RechargeCUTask;
a=0;// .super Lcom/twocloo/base/sync/EasyTask;
a=0;// .source "RechargeCUTask.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/twocloo/base/sync/EasyTask",
a=0;//         "<",
a=0;//         "Landroid/content/Context;",
a=0;//         "Ljava/lang/Void;",
a=0;//         "Ljava/lang/Void;",
a=0;//         "Ljava/lang/Boolean;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private amount:I
a=0;// 
a=0;// .field private auth:Ljava/lang/String;
a=0;// 
a=0;// .field private ctx:Landroid/content/Context;
a=0;// 
a=0;// .field private key:Ljava/lang/String;
a=0;// 
a=0;// .field private mobile:Ljava/lang/String;
a=0;// 
a=0;// .field private orderid:Ljava/lang/String;
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private productsid:I
a=0;// 
a=0;// .field private token:Ljava/lang/String;
a=0;// 
a=0;// .field private uid:Ljava/lang/String;
a=0;// 
a=0;// .field private url:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "caller"    # Landroid/content/Context;
a=0;//     .param p2, "url"    # Ljava/lang/String;
a=0;//     .param p3, "userid"    # Ljava/lang/String;
a=0;//     .param p4, "token"    # Ljava/lang/String;
a=0;//     .param p5, "productsId"    # I
a=0;//     .param p6, "orderId"    # Ljava/lang/String;
a=0;//     .param p7, "mobile"    # Ljava/lang/String;
a=0;//     .param p8, "amount"    # I
a=0;//     .param p9, "key"    # Ljava/lang/String;
a=0;//     .param p10, "auth"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/base/sync/EasyTask;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/task/RechargeCUTask;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/task/RechargeCUTask;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     .line 37
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/task/RechargeCUTask;->url:Ljava/lang/String;
a=0;// 
a=0;//     .line 38
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/task/RechargeCUTask;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 39
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/task/RechargeCUTask;->token:Ljava/lang/String;
a=0;// 
a=0;//     .line 40
a=0;//     iput p5, p0, Lcom/twocloo/com/cn/task/RechargeCUTask;->productsid:I
a=0;// 
a=0;//     .line 41
a=0;//     iput-object p6, p0, Lcom/twocloo/com/cn/task/RechargeCUTask;->orderid:Ljava/lang/String;
a=0;// 
a=0;//     .line 42
a=0;//     iput-object p7, p0, Lcom/twocloo/com/cn/task/RechargeCUTask;->mobile:Ljava/lang/String;
a=0;// 
a=0;//     .line 43
a=0;//     iput p8, p0, Lcom/twocloo/com/cn/task/RechargeCUTask;->amount:I
a=0;// 
a=0;//     .line 44
a=0;//     iput-object p9, p0, Lcom/twocloo/com/cn/task/RechargeCUTask;->key:Ljava/lang/String;
a=0;// 
a=0;//     .line 45
a=0;//     iput-object p10, p0, Lcom/twocloo/com/cn/task/RechargeCUTask;->auth:Ljava/lang/String;
a=0;// 
a=0;//     .line 46
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;
a=0;//     .locals 10
a=0;//     .param p1, "params"    # [Ljava/lang/Void;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 56
a=0;//     #v9=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v5, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v4, v5}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 57
a=0;//     invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 74
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/lang/Boolean;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 60
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Boolean);v5=(Reference,Lcom/twocloo/base/common/NetType;);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/task/RechargeCUTask;->url:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/16 v6, 0x8
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/task/RechargeCUTask;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/task/RechargeCUTask;->token:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     iget v8, p0, Lcom/twocloo/com/cn/task/RechargeCUTask;->productsid:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/task/RechargeCUTask;->orderid:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x4
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/task/RechargeCUTask;->mobile:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x5
a=0;// 
a=0;//     iget v8, p0, Lcom/twocloo/com/cn/task/RechargeCUTask;->amount:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x6
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/task/RechargeCUTask;->key:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/task/RechargeCUTask;->auth:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     invoke-static {v4, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 61
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/task/RechargeCUTask;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     check-cast v4, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 60
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 63
a=0;//     .local v1, "formatUrl":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v1, v4}, Lcom/twocloo/base/http/HttpHelper;->get(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 64
a=0;//     .local v3, "result":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v2, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 65
a=0;//     .local v2, "jo":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 66
a=0;//     const-string v4, "code"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     const-string v4, "code"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "1"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 67
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Boolean;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 70
a=0;//     .end local v1    # "formatUrl":Ljava/lang/String;
a=0;//     .end local v2    # "jo":Lorg/json/JSONObject;
a=0;//     .end local v3    # "result":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 71
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 72
a=0;//     invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Boolean;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 74
a=0;//     .end local v0    # "e":Ljava/lang/Throwable;
a=0;//     .restart local v1    # "formatUrl":Ljava/lang/String;
a=0;//     .restart local v2    # "jo":Lorg/json/JSONObject;
a=0;//     .restart local v3    # "result":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Reference,Ljava/lang/String;);v2=(Reference,Lorg/json/JSONObject;);v3=(Reference,Ljava/lang/String;);v4=(Boolean);v5=(Reference,Ujava/lang/Object;);v6=(Reference,[Ljava/lang/Object;);v7=(PosByte);v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Boolean;);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/RechargeCUTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onPostExecute(Ljava/lang/Boolean;)V
a=0;//     .locals 3
a=0;//     .param p1, "result"    # Ljava/lang/Boolean;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 78
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/RechargeCUTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->cancel()V
a=0;// 
a=0;//     .line 79
a=0;//     invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 80
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/RechargeCUTask;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     const-string v1, "\u5145\u503c\u6210\u529f"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 83
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 82
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/RechargeCUTask;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     const-string v1, "\u5145\u503c\u5931\u8d25"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/RechargeCUTask;->onPostExecute(Ljava/lang/Boolean;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPreExecute()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     invoke-super {p0}, Lcom/twocloo/base/sync/EasyTask;->onPreExecute()V
a=0;// 
a=0;//     .line 51
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/RechargeCUTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "\u5145\u503c\u4e2d..."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/RechargeCUTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 52
a=0;//     return-void
a=0;// .end method
}}
