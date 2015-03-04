package com.twocloo.com.cn.task; class DownMuluTask { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/task/DownMuluTask;
a=0;// .super Lcom/twocloo/base/sync/EasyTask;
a=0;// .source "DownMuluTask.java"
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
a=0;//         "Ljava/lang/Boolean;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private aid:Ljava/lang/String;
a=0;// 
a=0;// .field private ctx:Landroid/app/Activity;
a=0;// 
a=0;// .field private isShowProgressDialog:Z
a=0;// 
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field mulubean:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;// .field private pb:Landroid/widget/ProgressBar;
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;Landroid/os/Handler;ZLandroid/widget/ProgressBar;)V
a=0;//     .locals 1
a=0;//     .param p1, "caller"    # Landroid/app/Activity;
a=0;//     .param p2, "articleid"    # Ljava/lang/String;
a=0;//     .param p3, "mHandler"    # Landroid/os/Handler;
a=0;//     .param p4, "isShow"    # Z
a=0;//     .param p5, "pb"    # Landroid/widget/ProgressBar;
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/base/sync/EasyTask;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 34
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/task/DownMuluTask;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/task/DownMuluTask;->isShowProgressDialog:Z
a=0;// 
a=0;//     .line 36
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/DownMuluTask;->mulubean:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     .line 40
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/task/DownMuluTask;->ctx:Landroid/app/Activity;
a=0;// 
a=0;//     .line 41
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/task/DownMuluTask;->aid:Ljava/lang/String;
a=0;// 
a=0;//     .line 42
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/task/DownMuluTask;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 43
a=0;//     iput-boolean p4, p0, Lcom/twocloo/com/cn/task/DownMuluTask;->isShowProgressDialog:Z
a=0;// 
a=0;//     .line 44
a=0;//     iput-object p5, p0, Lcom/twocloo/com/cn/task/DownMuluTask;->pb:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     .line 45
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;
a=0;//     .locals 13
a=0;//     .param p1, "params"    # [Ljava/lang/Void;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     .line 61
a=0;//     #v12=(Null);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/task/DownMuluTask;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/common/Util;->read(Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iput-object v7, p0, Lcom/twocloo/com/cn/task/DownMuluTask;->mulubean:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     .line 63
a=0;//     :try_start_0
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/task/DownMuluTask;->mulubean:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     .line 64
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 65
a=0;//     .local v6, "v":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 66
a=0;//     .local v4, "srcid":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 67
a=0;//     .local v1, "imei":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 68
a=0;//     .local v3, "pt":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "http://app.2cloo.com/book-index_info_all?articleid=%s&data=json&ct=android&pt=%s&v=%s&imei=%s&srcid=%s"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const/4 v9, 0x5
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     new-array v9, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/task/DownMuluTask;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     aput-object v11, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     aput-object v3, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     aput-object v6, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x3
a=0;// 
a=0;//     aput-object v1, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x4
a=0;// 
a=0;//     aput-object v4, v9, v10
a=0;// 
a=0;//     invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/task/DownMuluTask;->ctx:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 69
a=0;//     .local v5, "url":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 70
a=0;//     .local v2, "json":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 71
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 78
a=0;//     .end local v1    # "imei":Ljava/lang/String;
a=0;//     .end local v2    # "json":Lorg/json/JSONObject;
a=0;//     .end local v3    # "pt":Ljava/lang/String;
a=0;//     .end local v4    # "srcid":Ljava/lang/String;
a=0;//     .end local v5    # "url":Ljava/lang/String;
a=0;//     .end local v6    # "v":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Reference,Ljava/lang/Boolean;);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     return-object v7
a=0;// 
a=0;//     .line 72
a=0;//     .restart local v1    # "imei":Ljava/lang/String;
a=0;//     .restart local v2    # "json":Lorg/json/JSONObject;
a=0;//     .restart local v3    # "pt":Ljava/lang/String;
a=0;//     .restart local v4    # "srcid":Ljava/lang/String;
a=0;//     .restart local v5    # "url":Ljava/lang/String;
a=0;//     .restart local v6    # "v":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Reference,Ljava/lang/String;);v2=(Reference,Lorg/json/JSONObject;);v3=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v6=(Reference,Ljava/lang/String;);v8=(Reference,Ljava/lang/String;);v9=(Reference,[Ljava/lang/Object;);v10=(PosByte);v11=(Reference,Ljava/lang/String;);
a=0;//     const/4 v7, -0x1
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     invoke-static {v2, v7}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToShubenmulu(Lorg/json/JSONObject;I)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     iput-object v7, p0, Lcom/twocloo/com/cn/task/DownMuluTask;->mulubean:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/task/DownMuluTask;->aid:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/task/DownMuluTask;->mulubean:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     invoke-static {v7, v8}, Lcom/twocloo/com/cn/common/Util;->write(Ljava/lang/String;Lcom/twocloo/com/cn/beans/Shubenmulu;)V
a=0;// 
a=0;//     .line 75
a=0;//     .end local v1    # "imei":Ljava/lang/String;
a=0;//     .end local v2    # "json":Lorg/json/JSONObject;
a=0;//     .end local v3    # "pt":Ljava/lang/String;
a=0;//     .end local v4    # "srcid":Ljava/lang/String;
a=0;//     .end local v5    # "url":Ljava/lang/String;
a=0;//     .end local v6    # "v":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Boolean;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 76
a=0;//     :catch_0
a=0;//     #v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 77
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 78
a=0;//     invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Boolean;);
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
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/DownMuluTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onPostExecute(Ljava/lang/Boolean;)V
a=0;//     .locals 4
a=0;//     .param p1, "result"    # Ljava/lang/Boolean;
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     iget-boolean v2, p0, Lcom/twocloo/com/cn/task/DownMuluTask;->isShowProgressDialog:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 85
a=0;//     invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 86
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 87
a=0;//     .local v0, "infolist":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/Chapterinfo;>;"
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/task/DownMuluTask;->mulubean:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getMulist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 88
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/task/DownMuluTask;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 89
a=0;//     .local v1, "msg":Landroid/os/Message;
a=0;//     #v1=(Reference,Landroid/os/Message;);
a=0;//     iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 90
a=0;//     const/16 v2, 0x7b
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, v1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 91
a=0;//     invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 95
a=0;//     .end local v0    # "infolist":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/Chapterinfo;>;"
a=0;//     .end local v1    # "msg":Landroid/os/Message;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 93
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);v3=(Uninit);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/task/DownMuluTask;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     const/16 v3, 0x3e7
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z
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
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/DownMuluTask;->onPostExecute(Ljava/lang/Boolean;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPreExecute()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     invoke-super {p0}, Lcom/twocloo/base/sync/EasyTask;->onPreExecute()V
a=0;// 
a=0;//     .line 54
a=0;//     return-void
a=0;// .end method
}}
