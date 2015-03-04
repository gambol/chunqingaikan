package com.twocloo.com.cn.threads; class HotKeyWordsThread { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/threads/HotKeyWordsThread;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "HotKeyWordsThread.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private act:Landroid/app/Activity;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private list:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Landroid/os/Handler;)V
a=0;//     .locals 1
a=0;//     .param p1, "act"    # Landroid/app/Activity;
a=0;//     .param p2, "handler"    # Landroid/os/Handler;
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 23
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/HotKeyWordsThread;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/threads/HotKeyWordsThread;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 26
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/HotKeyWordsThread;->act:Landroid/app/Activity;
a=0;// 
a=0;//     .line 27
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/threads/HotKeyWordsThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 28
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "http://app.2cloo.com/search-hot_words?"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/threads/HotKeyWordsThread;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 33
a=0;//     .local v5, "url":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "gb2312"
a=0;// 
a=0;//     invoke-static {v5, v6}, Lcom/twocloo/com/cn/http/HttpImpl;->ParseJson(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 34
a=0;//     .local v3, "json":Lorg/json/JSONObject;
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 36
a=0;//     :try_start_0
a=0;//     const-string v6, "list"
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 37
a=0;//     .local v0, "array":Lorg/json/JSONArray;
a=0;//     #v0=(Reference,Lorg/json/JSONArray;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lt v2, v6, :cond_0
a=0;// 
a=0;//     .line 40
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 41
a=0;//     .local v4, "msg":Landroid/os/Message;
a=0;//     #v4=(Reference,Landroid/os/Message;);
a=0;//     const/16 v6, 0x1bc
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     iput v6, v4, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 42
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/threads/HotKeyWordsThread;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v6, v4, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 43
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/threads/HotKeyWordsThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v6, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 54
a=0;//     .end local v0    # "array":Lorg/json/JSONArray;
a=0;//     .end local v2    # "i":I
a=0;//     .end local v4    # "msg":Landroid/os/Message;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     invoke-super {p0}, Ljava/lang/Thread;->run()V
a=0;// 
a=0;//     .line 55
a=0;//     return-void
a=0;// 
a=0;//     .line 38
a=0;//     .restart local v0    # "array":Lorg/json/JSONArray;
a=0;//     .restart local v2    # "i":I
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Lorg/json/JSONArray;);v1=(Uninit);v2=(Integer);v4=(Uninit);v6=(Integer);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/threads/HotKeyWordsThread;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 37
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 45
a=0;//     .end local v0    # "array":Lorg/json/JSONArray;
a=0;//     .end local v2    # "i":I
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 46
a=0;//     .local v1, "e":Lorg/json/JSONException;
a=0;//     #v1=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 49
a=0;//     .end local v1    # "e":Lorg/json/JSONException;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 50
a=0;//     .restart local v4    # "msg":Landroid/os/Message;
a=0;//     #v4=(Reference,Landroid/os/Message;);
a=0;//     const/16 v6, 0x14d
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     iput v6, v4, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 51
a=0;//     const-string v6, "\u7f51\u7edc\u8fde\u63a5\u5f02\u5e38\uff0c\u8bf7\u68c0\u67e5\u540e\u91cd\u8bd5"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iput-object v6, v4, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 52
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/threads/HotKeyWordsThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v6, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
