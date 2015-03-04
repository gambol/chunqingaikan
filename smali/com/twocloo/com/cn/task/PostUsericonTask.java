package com.twocloo.com.cn.task; class PostUsericonTask { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/task/PostUsericonTask;
a=0;// .super Lcom/twocloo/base/sync/EasyTask;
a=0;// .source "PostUsericonTask.java"
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
a=0;// .field private ctx:Landroid/content/Context;
a=0;// 
a=0;// .field private file:Ljava/io/File;
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private token:Ljava/lang/String;
a=0;// 
a=0;// .field private uid:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V
a=0;//     .locals 0
a=0;//     .param p1, "caller"    # Landroid/content/Context;
a=0;//     .param p2, "userid"    # Ljava/lang/String;
a=0;//     .param p3, "token"    # Ljava/lang/String;
a=0;//     .param p4, "file"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/base/sync/EasyTask;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 48
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/task/PostUsericonTask;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/task/PostUsericonTask;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     .line 49
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/task/PostUsericonTask;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 50
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/task/PostUsericonTask;->token:Ljava/lang/String;
a=0;// 
a=0;//     .line 51
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/task/PostUsericonTask;->file:Ljava/io/File;
a=0;// 
a=0;//     .line 52
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;
a=0;//     .locals 9
a=0;//     .param p1, "params"    # [Ljava/lang/Void;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 62
a=0;//     #v8=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v7, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 63
a=0;//     invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 86
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Reference,Ljava/lang/Boolean;);v7=(Conflicted);
a=0;//     return-object v6
a=0;// 
a=0;//     .line 66
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Boolean);v7=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     new-instance v4, Ljava/util/HashMap;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v4}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 67
a=0;//     .local v4, "parama":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     #v4=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v6, "userid"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/task/PostUsericonTask;->uid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v4, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 68
a=0;//     const-string v6, "token"
a=0;// 
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/task/PostUsericonTask;->token:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v4, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 69
a=0;//     new-instance v2, Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 70
a=0;//     .local v2, "filesmap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/io/File;>;"
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v6, "uploadfile"
a=0;// 
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/task/PostUsericonTask;->file:Ljava/io/File;
a=0;// 
a=0;//     invoke-interface {v2, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 72
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "http://app.2cloo.com/user-upload_userlogo?"
a=0;// 
a=0;//     invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/task/PostUsericonTask;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     check-cast v6, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6, v4, v2}, Lcom/twocloo/com/cn/http/HttpComm;->post(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 73
a=0;//     .local v5, "result":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     .line 74
a=0;//     new-instance v3, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v3, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 75
a=0;//     .local v3, "jo":Lorg/json/JSONObject;
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     const-string v6, "code"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     .line 76
a=0;//     const-string v6, "code"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 77
a=0;//     .local v0, "code":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "1"
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 78
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Boolean;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 82
a=0;//     .end local v0    # "code":Ljava/lang/String;
a=0;//     .end local v2    # "filesmap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/io/File;>;"
a=0;//     .end local v3    # "jo":Lorg/json/JSONObject;
a=0;//     .end local v4    # "parama":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     .end local v5    # "result":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 83
a=0;//     .local v1, "e":Ljava/lang/Throwable;
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 84
a=0;//     invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Boolean;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 86
a=0;//     .end local v1    # "e":Ljava/lang/Throwable;
a=0;//     .restart local v2    # "filesmap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/io/File;>;"
a=0;//     .restart local v4    # "parama":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     .restart local v5    # "result":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Reference,Ljava/util/HashMap;);v4=(Reference,Ljava/util/HashMap;);v5=(Reference,Ljava/lang/String;);v6=(Boolean);v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Boolean;);
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
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/PostUsericonTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;
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
a=0;//     .line 90
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/PostUsericonTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 91
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/PostUsericonTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->cancel()V
a=0;// 
a=0;//     .line 92
a=0;//     :cond_0
a=0;//     invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/PostUsericonTask;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     const-string v1, "\u5934\u50cf\u4e0a\u4f20\u6210\u529f"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 94
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput-boolean v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->uploadIconSuccessed:Z
a=0;// 
a=0;//     .line 99
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 96
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/PostUsericonTask;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     const-string v1, "\u5934\u50cf\u4e0a\u4f20\u5931\u8d25"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 97
a=0;//     sput-boolean v2, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->uploadIconSuccessed:Z
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
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/PostUsericonTask;->onPostExecute(Ljava/lang/Boolean;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPreExecute()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     invoke-super {p0}, Lcom/twocloo/base/sync/EasyTask;->onPreExecute()V
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/PostUsericonTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "\u5934\u50cf\u4e0a\u4f20\u4e2d\uff0c\u8bf7\u7a0d\u540e..."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/PostUsericonTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 58
a=0;//     return-void
a=0;// .end method
}}
