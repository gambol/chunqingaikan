package com.twocloo.com.cn.threads; class SupportThread { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/threads/SupportThread;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "SupportThread.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private act:Landroid/app/Activity;
a=0;// 
a=0;// .field private pid:I
a=0;// 
a=0;// .field private tid:I
a=0;// 
a=0;// .field private token:Ljava/lang/String;
a=0;// 
a=0;// .field private uid:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;II)V
a=0;//     .locals 0
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;//     .param p2, "userid"    # Ljava/lang/String;
a=0;//     .param p3, "token"    # Ljava/lang/String;
a=0;//     .param p4, "tid"    # I
a=0;//     .param p5, "pid"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 31
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/SupportThread;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/SupportThread;->act:Landroid/app/Activity;
a=0;// 
a=0;//     .line 32
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/threads/SupportThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 33
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/threads/SupportThread;->token:Ljava/lang/String;
a=0;// 
a=0;//     .line 34
a=0;//     iput p4, p0, Lcom/twocloo/com/cn/threads/SupportThread;->tid:I
a=0;// 
a=0;//     .line 35
a=0;//     iput p5, p0, Lcom/twocloo/com/cn/threads/SupportThread;->pid:I
a=0;// 
a=0;//     .line 36
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 39
a=0;//     #v8=(Null);
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
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 58
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Reference,Ljava/lang/Integer;);
a=0;//     return-void
a=0;// 
a=0;//     .line 42
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Boolean);v6=(Uninit);v7=(Uninit);v8=(Null);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "http://app.2cloo.com/user-commend_up&token=%s&userid=%s&tid=%s&pid=%s"
a=0;// 
a=0;//     const/4 v6, 0x4
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/threads/SupportThread;->token:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     aput-object v7, v6, v8
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/threads/SupportThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     iget v8, p0, Lcom/twocloo/com/cn/threads/SupportThread;->tid:I
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
a=0;//     iget v8, p0, Lcom/twocloo/com/cn/threads/SupportThread;->pid:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/threads/SupportThread;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 43
a=0;//     .local v3, "url":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/base/http/HttpHelper;->get(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 44
a=0;//     .local v2, "result":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 48
a=0;//     :try_start_0
a=0;//     new-instance v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 49
a=0;//     .local v1, "jo":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v4, "code"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
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
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 50
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     sput-boolean v4, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->isOutway:Z
a=0;// 
a=0;//     .line 51
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     sput-boolean v4, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->isFromCityOrReadpage:Z
a=0;// 
a=0;//     .line 52
a=0;//     const-string v4, "result"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "support success."
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 55
a=0;//     .end local v1    # "jo":Lorg/json/JSONObject;
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 56
a=0;//     .local v0, "e":Lorg/json/JSONException;
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 54
a=0;//     .end local v0    # "e":Lorg/json/JSONException;
a=0;//     .restart local v1    # "jo":Lorg/json/JSONObject;
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Reference,Lorg/json/JSONObject;);v4=(Boolean);
a=0;//     const-string v4, "result"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "support failed."
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_1
a=0;//     .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
