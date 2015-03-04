package com.twocloo.com.cn.threads; class BookMarkThread { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/threads/BookMarkThread;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "BookMarkThread.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private act:Landroid/app/Activity;
a=0;// 
a=0;// .field private articleId:Ljava/lang/String;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private list:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BookMarkBean;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private token:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;Landroid/os/Handler;)V
a=0;//     .locals 1
a=0;//     .param p1, "act"    # Landroid/app/Activity;
a=0;//     .param p2, "articleId"    # Ljava/lang/String;
a=0;//     .param p3, "handler"    # Landroid/os/Handler;
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 25
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/BookMarkThread;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/threads/BookMarkThread;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 28
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/BookMarkThread;->act:Landroid/app/Activity;
a=0;// 
a=0;//     .line 29
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/threads/BookMarkThread;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     .line 30
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/threads/BookMarkThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 31
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "http://app.2cloo.com/book-mark_list?articleid="
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/threads/BookMarkThread;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const-string v10, "&token="
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/threads/BookMarkThread;->token:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/threads/BookMarkThread;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 36
a=0;//     .local v8, "url":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, "gb2312"
a=0;// 
a=0;//     invoke-static {v8, v9}, Lcom/twocloo/com/cn/http/HttpImpl;->ParseJson(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 37
a=0;//     .local v5, "json":Lorg/json/JSONObject;
a=0;//     #v5=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 39
a=0;//     :try_start_0
a=0;//     const-string v9, "code"
a=0;// 
a=0;//     invoke-virtual {v5, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 40
a=0;//     .local v1, "code":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, "marklist"
a=0;// 
a=0;//     invoke-virtual {v5, v9}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 44
a=0;//     .local v7, "object":Lorg/json/JSONArray;
a=0;//     #v7=(Reference,Lorg/json/JSONArray;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Integer);
a=0;//     invoke-virtual {v7}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-lt v4, v9, :cond_1
a=0;// 
a=0;//     .line 51
a=0;//     const-string v9, "1"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_0
a=0;// 
a=0;//     .line 52
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 53
a=0;//     .local v6, "msg":Landroid/os/Message;
a=0;//     #v6=(Reference,Landroid/os/Message;);
a=0;//     const/16 v9, 0x1bc
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     iput v9, v6, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 54
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/threads/BookMarkThread;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v9, v6, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/threads/BookMarkThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v9, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 67
a=0;//     .end local v1    # "code":Ljava/lang/String;
a=0;//     .end local v4    # "i":I
a=0;//     .end local v6    # "msg":Landroid/os/Message;
a=0;//     .end local v7    # "object":Lorg/json/JSONArray;
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);
a=0;//     invoke-super {p0}, Ljava/lang/Thread;->run()V
a=0;// 
a=0;//     .line 68
a=0;//     return-void
a=0;// 
a=0;//     .line 45
a=0;//     .restart local v1    # "code":Ljava/lang/String;
a=0;//     .restart local v4    # "i":I
a=0;//     .restart local v7    # "object":Lorg/json/JSONArray;
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Uninit);v4=(Integer);v6=(Uninit);v7=(Reference,Lorg/json/JSONArray;);v9=(Integer);
a=0;//     invoke-virtual {v7, v4}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 46
a=0;//     .local v3, "ele":Lorg/json/JSONObject;
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/BookMarkBean;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/BookMarkBean;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/beans/BookMarkBean;-><init>()V
a=0;// 
a=0;//     .line 47
a=0;//     .local v0, "bean":Lcom/twocloo/com/cn/beans/BookMarkBean;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/BookMarkBean;);
a=0;//     const-string v9, "title"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Lcom/twocloo/com/cn/beans/BookMarkBean;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 48
a=0;//     const-string v9, "url"
a=0;// 
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Lcom/twocloo/com/cn/beans/BookMarkBean;->setUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 49
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/threads/BookMarkThread;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 44
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 58
a=0;//     .end local v0    # "bean":Lcom/twocloo/com/cn/beans/BookMarkBean;
a=0;//     .end local v1    # "code":Ljava/lang/String;
a=0;//     .end local v3    # "ele":Lorg/json/JSONObject;
a=0;//     .end local v4    # "i":I
a=0;//     .end local v7    # "object":Lorg/json/JSONArray;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 59
a=0;//     .local v2, "e":Lorg/json/JSONException;
a=0;//     #v2=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v2}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
