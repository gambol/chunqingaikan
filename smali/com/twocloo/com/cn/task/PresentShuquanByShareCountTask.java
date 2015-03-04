package com.twocloo.com.cn.task; class PresentShuquanByShareCountTask { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/task/PresentShuquanByShareCountTask;
a=0;// .super Lcom/twocloo/base/sync/EasyTask;
a=0;// .source "PresentShuquanByShareCountTask.java"
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
a=0;// .field private code:Ljava/lang/String;
a=0;// 
a=0;// .field private ctx:Landroid/app/Activity;
a=0;// 
a=0;// .field private mAid:Ljava/lang/String;
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
a=0;//     .param p2, "aid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/base/sync/EasyTask;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/task/PresentShuquanByShareCountTask;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/task/PresentShuquanByShareCountTask;->ctx:Landroid/app/Activity;
a=0;// 
a=0;//     .line 37
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/task/PresentShuquanByShareCountTask;->mAid:Ljava/lang/String;
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
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/PresentShuquanByShareCountTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public varargs doInBackground([Ljava/lang/Void;)Ljava/lang/String;
a=0;//     .locals 14
a=0;//     .param p1, "params"    # [Ljava/lang/Void;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 47
a=0;//     #v8=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v10, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v10=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v9, v10}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_1
a=0;// 
a=0;//     .line 79
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Reference,Ljava/lang/String;);v9=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     return-object v8
a=0;// 
a=0;//     .line 50
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Null);v9=(Boolean);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v9, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 54
a=0;//     .local v7, "uid":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 55
a=0;//     .local v5, "token":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "10"
a=0;// 
a=0;//     .line 56
a=0;//     .local v6, "type":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const/16 v3, 0x14
a=0;// 
a=0;//     .line 57
a=0;//     .local v3, "money":I
a=0;//     #v3=(PosByte);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 59
a=0;//     .local v0, "auth":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "http://app.2cloo.com/user-send_shuquan&userid=%s&token=%s&type=%s&money=%s&auth=%s"
a=0;// 
a=0;//     const/4 v11, 0x5
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     new-array v11, v11, [Ljava/lang/Object;
a=0;// 
a=0;//     #v11=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     aput-object v7, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x1
a=0;// 
a=0;//     #v12=(One);
a=0;//     aput-object v5, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x2
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     aput-object v6, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x3
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v13, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x4
a=0;// 
a=0;//     aput-object v0, v11, v12
a=0;// 
a=0;//     invoke-static {v10, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 60
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/task/PresentShuquanByShareCountTask;->ctx:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const-string v10, "&articleid="
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/task/PresentShuquanByShareCountTask;->mAid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 59
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 61
a=0;//     .local v4, "presenturl":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-static {v4, v9}, Lcom/twocloo/base/http/HttpHelper;->get(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     iput-object v9, p0, Lcom/twocloo/com/cn/task/PresentShuquanByShareCountTask;->result:Ljava/lang/String;
a=0;// 
a=0;//     .line 63
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/task/PresentShuquanByShareCountTask;->result:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_0
a=0;// 
a=0;//     .line 67
a=0;//     new-instance v2, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/json/JSONObject;);
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/task/PresentShuquanByShareCountTask;->result:Ljava/lang/String;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v9}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 68
a=0;//     .local v2, "jo":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v9, "code"
a=0;// 
a=0;//     invoke-virtual {v2, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_0
a=0;// 
a=0;//     .line 69
a=0;//     const-string v9, "code"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     iput-object v9, p0, Lcom/twocloo/com/cn/task/PresentShuquanByShareCountTask;->code:Ljava/lang/String;
a=0;// 
a=0;//     .line 70
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/task/PresentShuquanByShareCountTask;->code:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 75
a=0;//     .end local v2    # "jo":Lorg/json/JSONObject;
a=0;//     .end local v4    # "presenturl":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);v8=(Null);v9=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 76
a=0;//     .local v1, "e":Ljava/lang/Throwable;
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
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
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/PresentShuquanByShareCountTask;->onPostExecute(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPostExecute(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "result"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 84
a=0;//     const-string v0, "1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 85
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/PresentShuquanByShareCountTask;->ctx:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     const-string v1, "\u5206\u4eab\u6210\u529f\uff0c\u83b7\u5f9720\u4e66\u5238\u3002"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v1, v2}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 88
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
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
