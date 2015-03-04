package com.twocloo.com.cn.task; class GetAuthorWorkThread { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/task/GetAuthorWorkThread;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "GetAuthorWorkThread.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private activity:Landroid/app/Activity;
a=0;// 
a=0;// .field private authorid:Ljava/lang/String;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private list:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/NewBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private token:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Landroid/os/Handler;)V
a=0;//     .locals 1
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;//     .param p2, "authorid"    # Ljava/lang/String;
a=0;//     .param p3, "token"    # Ljava/lang/String;
a=0;//     .param p4, "handler"    # Landroid/os/Handler;
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 25
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/task/GetAuthorWorkThread;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/GetAuthorWorkThread;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 28
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/task/GetAuthorWorkThread;->authorid:Ljava/lang/String;
a=0;// 
a=0;//     .line 29
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/task/GetAuthorWorkThread;->token:Ljava/lang/String;
a=0;// 
a=0;//     .line 30
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/task/GetAuthorWorkThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 31
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/task/GetAuthorWorkThread;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 32
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/task/GetAuthorWorkThread;->authorid:Ljava/lang/String;
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
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
a=0;//     move-result-object v10
a=0;// 
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     const/16 v12, 0xa
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     invoke-virtual {v10, v11, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 37
a=0;//     .local v8, "token":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v11, "http://app.2cloo.com/book-author_article_list?authorid="
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/task/GetAuthorWorkThread;->authorid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const-string v11, "&token="
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/task/GetAuthorWorkThread;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v11}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 38
a=0;//     .local v9, "url":Ljava/lang/String;
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "gb2312"
a=0;// 
a=0;//     invoke-static {v9, v10}, Lcom/twocloo/com/cn/http/HttpImpl;->ParseJson(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 39
a=0;//     .local v6, "json":Lorg/json/JSONObject;
a=0;//     #v6=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 41
a=0;//     :try_start_0
a=0;//     const-string v10, "code"
a=0;// 
a=0;//     invoke-virtual {v6, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 42
a=0;//     .local v2, "code":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "booklist"
a=0;// 
a=0;//     invoke-virtual {v6, v10}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 43
a=0;//     .local v0, "arr":Lorg/json/JSONArray;
a=0;//     #v0=(Reference,Lorg/json/JSONArray;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .local v5, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Integer);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     if-lt v5, v10, :cond_1
a=0;// 
a=0;//     .line 57
a=0;//     const-string v10, "1"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     .line 58
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 59
a=0;//     .local v7, "msg":Landroid/os/Message;
a=0;//     #v7=(Reference,Landroid/os/Message;);
a=0;//     const/16 v10, 0x6f
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     iput v10, v7, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 60
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/task/GetAuthorWorkThread;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v10=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v10, v7, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/task/GetAuthorWorkThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v10, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 72
a=0;//     .end local v0    # "arr":Lorg/json/JSONArray;
a=0;//     .end local v2    # "code":Ljava/lang/String;
a=0;//     .end local v5    # "i":I
a=0;//     .end local v7    # "msg":Landroid/os/Message;
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v7=(Conflicted);v10=(Conflicted);
a=0;//     invoke-super {p0}, Ljava/lang/Thread;->run()V
a=0;// 
a=0;//     .line 73
a=0;//     return-void
a=0;// 
a=0;//     .line 44
a=0;//     .restart local v0    # "arr":Lorg/json/JSONArray;
a=0;//     .restart local v2    # "code":Ljava/lang/String;
a=0;//     .restart local v5    # "i":I
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Lorg/json/JSONArray;);v2=(Reference,Ljava/lang/String;);v3=(Uninit);v5=(Integer);v7=(Uninit);v10=(Integer);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/beans/NewBook;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/beans/NewBook;);
a=0;//     invoke-direct {v1}, Lcom/twocloo/com/cn/beans/NewBook;-><init>()V
a=0;// 
a=0;//     .line 45
a=0;//     .local v1, "book":Lcom/twocloo/com/cn/beans/NewBook;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/NewBook;);
a=0;//     invoke-virtual {v0, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 46
a=0;//     .local v4, "ele":Lorg/json/JSONObject;
a=0;//     #v4=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v10, "articleid"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v1, v10}, Lcom/twocloo/com/cn/beans/NewBook;->setArticleid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 47
a=0;//     const-string v10, "author"
a=0;// 
a=0;//     invoke-virtual {v4, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v1, v10}, Lcom/twocloo/com/cn/beans/NewBook;->setAuthor(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 48
a=0;//     const-string v10, "totalviews"
a=0;// 
a=0;//     invoke-virtual {v4, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v1, v10}, Lcom/twocloo/com/cn/beans/NewBook;->setTotalviews(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 49
a=0;//     const-string v10, "finishflag"
a=0;// 
a=0;//     invoke-virtual {v4, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v1, v10}, Lcom/twocloo/com/cn/beans/NewBook;->setFinishflag(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 50
a=0;//     const-string v10, "description"
a=0;// 
a=0;//     invoke-virtual {v4, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v1, v10}, Lcom/twocloo/com/cn/beans/NewBook;->setDescription(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 51
a=0;//     const-string v10, "coverimg"
a=0;// 
a=0;//     invoke-virtual {v4, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v1, v10}, Lcom/twocloo/com/cn/beans/NewBook;->setImgURL(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 52
a=0;//     const-string v10, "sortname"
a=0;// 
a=0;//     invoke-virtual {v4, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v1, v10}, Lcom/twocloo/com/cn/beans/NewBook;->setSortname(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 53
a=0;//     const-string v10, "title"
a=0;// 
a=0;//     invoke-virtual {v4, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v1, v10}, Lcom/twocloo/com/cn/beans/NewBook;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 54
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/task/GetAuthorWorkThread;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 43
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 63
a=0;//     .end local v0    # "arr":Lorg/json/JSONArray;
a=0;//     .end local v1    # "book":Lcom/twocloo/com/cn/beans/NewBook;
a=0;//     .end local v2    # "code":Ljava/lang/String;
a=0;//     .end local v4    # "ele":Lorg/json/JSONObject;
a=0;//     .end local v5    # "i":I
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v10=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 64
a=0;//     .local v3, "e":Lorg/json/JSONException;
a=0;//     #v3=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v3}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 67
a=0;//     .end local v3    # "e":Lorg/json/JSONException;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 68
a=0;//     .restart local v7    # "msg":Landroid/os/Message;
a=0;//     #v7=(Reference,Landroid/os/Message;);
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     iput v10, v7, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 69
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/task/GetAuthorWorkThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v10=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v10, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
