package com.twocloo.com.cn.task; class PresentYDBTask { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/task/PresentYDBTask;
a=0;// .super Lcom/twocloo/base/sync/EasyTask;
a=0;// .source "PresentYDBTask.java"
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
a=0;//         "Ljava/lang/String;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private code:Ljava/lang/String;
a=0;// 
a=0;// .field private ctx:Landroid/content/Context;
a=0;// 
a=0;// .field private first:I
a=0;// 
a=0;// .field private message:Ljava/lang/String;
a=0;// 
a=0;// .field private result:Ljava/lang/String;
a=0;// 
a=0;// .field private uid:Ljava/lang/String;
a=0;// 
a=0;// .field private url:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V
a=0;//     .locals 0
a=0;//     .param p1, "caller"    # Landroid/content/Context;
a=0;//     .param p2, "url"    # Ljava/lang/String;
a=0;//     .param p3, "uid"    # Ljava/lang/String;
a=0;//     .param p4, "first"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/base/sync/EasyTask;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 38
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/task/PresentYDBTask;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/task/PresentYDBTask;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     .line 39
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/task/PresentYDBTask;->url:Ljava/lang/String;
a=0;// 
a=0;//     .line 40
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/task/PresentYDBTask;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 41
a=0;//     iput p4, p0, Lcom/twocloo/com/cn/task/PresentYDBTask;->first:I
a=0;// 
a=0;//     .line 42
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
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/PresentYDBTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public varargs doInBackground([Ljava/lang/Void;)Ljava/lang/String;
a=0;//     .locals 15
a=0;//     .param p1, "params"    # [Ljava/lang/Void;
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v11, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v11=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v10, v11}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     .line 52
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 86
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Reference,Ljava/lang/String;);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     return-object v10
a=0;// 
a=0;//     .line 54
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Boolean);v11=(Reference,Lcom/twocloo/base/common/NetType;);v12=(Uninit);v13=(Uninit);v14=(Uninit);
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/task/PresentYDBTask;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v11}, Lcom/twocloo/com/cn/utils/CommonUtils;->getAppVersionCode(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 55
a=0;//     .local v9, "v":Ljava/lang/String;
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "android"
a=0;// 
a=0;//     .line 56
a=0;//     .local v0, "ct":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/task/PresentYDBTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v10, Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     sget v11, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 57
a=0;//     .local v8, "srcid":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/task/PresentYDBTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v10, Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     sget v11, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 58
a=0;//     .local v6, "pt":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/task/PresentYDBTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v10, Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/utils/CommonUtils;->getImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 59
a=0;//     .local v2, "imei":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 60
a=0;//     .local v3, "install_type":I
a=0;//     #v3=(Null);
a=0;//     iget v10, p0, Lcom/twocloo/com/cn/task/PresentYDBTask;->first:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     if-ne v10, v11, :cond_1
a=0;// 
a=0;//     .line 61
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 63
a=0;//     :cond_1
a=0;//     #v3=(Boolean);
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v12, p0, Lcom/twocloo/com/cn/task/PresentYDBTask;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const-string v12, "tokentoken"
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v11}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v11, "tokentoken"
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 65
a=0;//     .local v7, "sign":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/task/PresentYDBTask;->url:Ljava/lang/String;
a=0;// 
a=0;//     const/16 v12, 0x8
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     new-array v12, v12, [Ljava/lang/Object;
a=0;// 
a=0;//     #v12=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     aput-object v0, v12, v13
a=0;// 
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     #v13=(One);
a=0;//     aput-object v6, v12, v13
a=0;// 
a=0;//     const/4 v13, 0x2
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     aput-object v9, v12, v13
a=0;// 
a=0;//     const/4 v13, 0x3
a=0;// 
a=0;//     aput-object v8, v12, v13
a=0;// 
a=0;//     const/4 v13, 0x4
a=0;// 
a=0;//     iget-object v14, p0, Lcom/twocloo/com/cn/task/PresentYDBTask;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     aput-object v14, v12, v13
a=0;// 
a=0;//     const/4 v13, 0x5
a=0;// 
a=0;//     aput-object v2, v12, v13
a=0;// 
a=0;//     const/4 v13, 0x6
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     aput-object v14, v12, v13
a=0;// 
a=0;//     const/4 v13, 0x7
a=0;// 
a=0;//     aput-object v7, v12, v13
a=0;// 
a=0;//     invoke-static {v10, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-direct {v11, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 66
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/task/PresentYDBTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v10, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 65
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 67
a=0;//     .local v5, "presenturl":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-static {v5, v10}, Lcom/twocloo/base/http/HttpHelper;->get(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     iput-object v10, p0, Lcom/twocloo/com/cn/task/PresentYDBTask;->result:Ljava/lang/String;
a=0;// 
a=0;//     .line 68
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/task/PresentYDBTask;->result:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_2
a=0;// 
a=0;//     .line 69
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 72
a=0;//     :cond_2
a=0;//     #v10=(Boolean);
a=0;//     new-instance v4, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v4=(UninitRef,Lorg/json/JSONObject;);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/task/PresentYDBTask;->result:Ljava/lang/String;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v10}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 73
a=0;//     .local v4, "jo":Lorg/json/JSONObject;
a=0;//     #v4=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v10, "code"
a=0;// 
a=0;//     invoke-virtual {v4, v10}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-nez v10, :cond_4
a=0;// 
a=0;//     .line 74
a=0;//     const-string v10, "code"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     iput-object v10, p0, Lcom/twocloo/com/cn/task/PresentYDBTask;->code:Ljava/lang/String;
a=0;// 
a=0;//     .line 75
a=0;//     const-string v10, "1"
a=0;// 
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/task/PresentYDBTask;->code:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_4
a=0;// 
a=0;//     .line 76
a=0;//     const-string v10, "msg"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v10}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-nez v10, :cond_3
a=0;// 
a=0;//     .line 77
a=0;//     const-string v10, "msg"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     iput-object v10, p0, Lcom/twocloo/com/cn/task/PresentYDBTask;->message:Ljava/lang/String;
a=0;// 
a=0;//     .line 79
a=0;//     :cond_3
a=0;//     #v10=(Conflicted);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/task/PresentYDBTask;->message:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 82
a=0;//     .end local v4    # "jo":Lorg/json/JSONObject;
a=0;//     .end local v5    # "presenturl":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 83
a=0;//     .local v1, "e":Ljava/lang/Throwable;
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 84
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 86
a=0;//     .end local v1    # "e":Ljava/lang/Throwable;
a=0;//     .restart local v4    # "jo":Lorg/json/JSONObject;
a=0;//     .restart local v5    # "presenturl":Ljava/lang/String;
a=0;//     :cond_4
a=0;//     #v1=(Uninit);v4=(Reference,Lorg/json/JSONObject;);v5=(Reference,Ljava/lang/String;);v10=(Boolean);v11=(Reference,Ujava/lang/Object;);v12=(Reference,[Ljava/lang/Object;);v13=(PosByte);v14=(Reference,Ljava/lang/Integer;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/PresentYDBTask;->onPostExecute(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPostExecute(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "result"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 90
a=0;//     #v2=(Null);
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 91
a=0;//     const-string v0, "got it success"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 92
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/PresentYDBTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/twocloo/com/cn/common/LocalStore;->setNewUserWithPresentYDB(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/PresentYDBTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/common/LocalStore;->setVisitsSuccessful(Landroid/content/Context;Z)V
a=0;// 
a=0;//     .line 94
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/PresentYDBTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "\u606d\u559c\u60a8\uff0c\u83b7\u5f97200\u9605\u5e01\u3002\u795d\u9605\u8bfb\u6109\u5feb\uff01"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 97
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPreExecute()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     invoke-super {p0}, Lcom/twocloo/base/sync/EasyTask;->onPreExecute()V
a=0;// 
a=0;//     .line 47
a=0;//     return-void
a=0;// .end method
}}
