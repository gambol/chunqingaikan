package com.twocloo.com.cn.task; class DownSplashTask { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/task/DownSplashTask;
a=0;// .super Lcom/twocloo/base/sync/EasyTask;
a=0;// .source "DownSplashTask.java"
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
a=0;// .field private code:Ljava/lang/String;
a=0;// 
a=0;// .field private imageurl:Ljava/lang/String;
a=0;// 
a=0;// .field private result:Ljava/lang/String;
a=0;// 
a=0;// .field private url:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "caller"    # Landroid/app/Activity;
a=0;//     .param p2, "url"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/base/sync/EasyTask;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/task/DownSplashTask;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/task/DownSplashTask;->act:Landroid/app/Activity;
a=0;// 
a=0;//     .line 37
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/task/DownSplashTask;->url:Ljava/lang/String;
a=0;// 
a=0;//     .line 38
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
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/DownSplashTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public varargs doInBackground([Ljava/lang/Void;)Ljava/lang/String;
a=0;//     .locals 12
a=0;//     .param p1, "params"    # [Ljava/lang/Void;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 47
a=0;//     #v8=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v9, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v7, v9}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     move-object v7, v8
a=0;// 
a=0;//     .line 75
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Reference,Ljava/lang/String;);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     return-object v7
a=0;// 
a=0;//     .line 50
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Boolean);v9=(Reference,Lcom/twocloo/base/common/NetType;);v10=(Uninit);v11=(Uninit);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/task/DownSplashTask;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v9}, Lcom/twocloo/com/cn/utils/CommonUtils;->getAppVersionCode(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 51
a=0;//     .local v6, "v":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "android"
a=0;// 
a=0;//     .line 52
a=0;//     .local v0, "ct":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/task/DownSplashTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v7, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v9, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v7, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 53
a=0;//     .local v5, "srcid":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/task/DownSplashTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v7, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v9, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     invoke-virtual {v7, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 55
a=0;//     .local v3, "pt":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/task/DownSplashTask;->url:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v10, 0x4
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     new-array v10, v10, [Ljava/lang/Object;
a=0;// 
a=0;//     #v10=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     aput-object v6, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     aput-object v0, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x2
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     aput-object v5, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x3
a=0;// 
a=0;//     aput-object v3, v10, v11
a=0;// 
a=0;//     invoke-static {v7, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v9, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/task/DownSplashTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v7, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 56
a=0;//     .local v4, "splashurl":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static {v4, v7}, Lcom/twocloo/base/http/HttpHelper;->get(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     iput-object v7, p0, Lcom/twocloo/com/cn/task/DownSplashTask;->result:Ljava/lang/String;
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/task/DownSplashTask;->result:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     move-object v7, v8
a=0;// 
a=0;//     .line 58
a=0;//     #v7=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 61
a=0;//     :cond_1
a=0;//     #v7=(Boolean);
a=0;//     new-instance v2, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/json/JSONObject;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/task/DownSplashTask;->result:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 62
a=0;//     .local v2, "jo":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v7, "code"
a=0;// 
a=0;//     invoke-virtual {v2, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_2
a=0;// 
a=0;//     .line 63
a=0;//     const-string v7, "code"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iput-object v7, p0, Lcom/twocloo/com/cn/task/DownSplashTask;->code:Ljava/lang/String;
a=0;// 
a=0;//     .line 65
a=0;//     :cond_2
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "1"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/task/DownSplashTask;->code:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     .line 66
a=0;//     const-string v7, "image_url"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_3
a=0;// 
a=0;//     .line 67
a=0;//     const-string v7, "image_url"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iput-object v7, p0, Lcom/twocloo/com/cn/task/DownSplashTask;->imageurl:Ljava/lang/String;
a=0;// 
a=0;//     .line 68
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/task/DownSplashTask;->imageurl:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 71
a=0;//     .end local v2    # "jo":Lorg/json/JSONObject;
a=0;//     .end local v4    # "splashurl":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 72
a=0;//     .local v1, "e":Ljava/lang/Throwable;
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     move-object v7, v8
a=0;// 
a=0;//     .line 73
a=0;//     #v7=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .end local v1    # "e":Ljava/lang/Throwable;
a=0;//     .restart local v2    # "jo":Lorg/json/JSONObject;
a=0;//     .restart local v4    # "splashurl":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v1=(Uninit);v2=(Reference,Lorg/json/JSONObject;);v4=(Reference,Ljava/lang/String;);v7=(Boolean);v9=(Reference,Ljava/lang/String;);v10=(Reference,[Ljava/lang/Object;);v11=(PosByte);
a=0;//     move-object v7, v8
a=0;// 
a=0;//     .line 75
a=0;//     #v7=(Null);
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
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/DownSplashTask;->onPostExecute(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPostExecute(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "result"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/DownSplashTask;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-static {v0, p1}, Lcom/twocloo/com/cn/common/LocalStore;->setSplashImage(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 80
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPreExecute()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     invoke-super {p0}, Lcom/twocloo/base/sync/EasyTask;->onPreExecute()V
a=0;// 
a=0;//     .line 43
a=0;//     return-void
a=0;// .end method
}}
