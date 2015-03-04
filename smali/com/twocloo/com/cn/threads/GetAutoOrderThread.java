package com.twocloo.com.cn.threads; class GetAutoOrderThread { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/threads/GetAutoOrderThread;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "GetAutoOrderThread.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final TAG:Ljava/lang/String; = "GetAutoOrderThread"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private aid:Ljava/lang/String;
a=0;// 
a=0;// .field private b:Z
a=0;// 
a=0;// .field private context:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;Z)V
a=0;//     .locals 0
a=0;//     .param p1, "act"    # Landroid/app/Activity;
a=0;//     .param p2, "aid2"    # Ljava/lang/String;
a=0;//     .param p3, "b"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     invoke-direct {p0, p1, p2}, Lcom/twocloo/com/cn/threads/GetAutoOrderThread;-><init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 39
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/GetAutoOrderThread;);
a=0;//     iput-boolean p3, p0, Lcom/twocloo/com/cn/threads/GetAutoOrderThread;->b:Z
a=0;// 
a=0;//     .line 41
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "aid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 33
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/GetAutoOrderThread;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/GetAutoOrderThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 34
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/threads/GetAutoOrderThread;->aid:Ljava/lang/String;
a=0;// 
a=0;//     .line 35
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public queryToServer()Ljava/lang/String;
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     const-string v5, ""
a=0;// 
a=0;//     .line 65
a=0;//     .local v5, "uid":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     .line 66
a=0;//     .local v4, "token":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "0"
a=0;// 
a=0;//     .line 67
a=0;//     .local v0, "auto":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     .line 68
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 69
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 71
a=0;//     :cond_0
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "http://app.2cloo.com/book-get_auto_sub_status?uid=%s&token=%s&articleid=%s"
a=0;// 
a=0;//     const/4 v9, 0x3
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     new-array v9, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     aput-object v5, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     aput-object v4, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/threads/GetAutoOrderThread;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     aput-object v11, v9, v10
a=0;// 
a=0;//     invoke-static {v7, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 72
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/threads/GetAutoOrderThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     check-cast v7, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 71
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 73
a=0;//     .local v6, "url":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 75
a=0;//     .local v2, "json":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 76
a=0;//     :try_start_0
a=0;//     new-instance v3, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v3, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 77
a=0;//     .local v3, "obj":Lorg/json/JSONObject;
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v7, "auto_sub"
a=0;// 
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 78
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/threads/GetAutoOrderThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/threads/GetAutoOrderThread;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v7, v5, v8, v0}, Lcom/twocloo/com/cn/common/LocalStore;->setAuto(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 83
a=0;//     .end local v3    # "obj":Lorg/json/JSONObject;
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 80
a=0;//     :catch_0
a=0;//     #v1=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 81
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public run()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
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
a=0;//     .line 61
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 57
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/threads/GetAutoOrderThread;->b:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 58
a=0;//     const-wide/16 v0, 0x3e8
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V
a=0;// 
a=0;//     .line 59
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/threads/GetAutoOrderThread;->queryToServer()Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
