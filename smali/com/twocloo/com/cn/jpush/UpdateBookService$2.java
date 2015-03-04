package com.twocloo.com.cn.jpush; class UpdateBookService$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/jpush/UpdateBookService$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "UpdateBookService.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/jpush/UpdateBookService;->onStartCommand(Landroid/content/Intent;II)I
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/jpush/UpdateBookService;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/jpush/UpdateBookService;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/jpush/UpdateBookService$2;->this$0:Lcom/twocloo/com/cn/jpush/UpdateBookService;
a=0;// 
a=0;//     .line 103
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/jpush/UpdateBookService$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 17
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/jpush/UpdateBookService$2;);
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/jpush/UpdateBookService$2;->this$0:Lcom/twocloo/com/cn/jpush/UpdateBookService;
a=0;// 
a=0;//     #v13=(Reference,Lcom/twocloo/com/cn/jpush/UpdateBookService;);
a=0;//     invoke-static {v13}, Lcom/twocloo/com/cn/jpush/UpdateBookService;->access$0(Lcom/twocloo/com/cn/jpush/UpdateBookService;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     if-nez v13, :cond_0
a=0;// 
a=0;//     .line 107
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/jpush/UpdateBookService$2;->this$0:Lcom/twocloo/com/cn/jpush/UpdateBookService;
a=0;// 
a=0;//     new-instance v14, Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v14=(UninitRef,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/twocloo/com/cn/jpush/UpdateBookService$2;->this$0:Lcom/twocloo/com/cn/jpush/UpdateBookService;
a=0;// 
a=0;//     #v15=(Reference,Lcom/twocloo/com/cn/jpush/UpdateBookService;);
a=0;//     invoke-virtual {v15}, Lcom/twocloo/com/cn/jpush/UpdateBookService;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-direct {v14, v15}, Lcom/twocloo/com/cn/db/DBAdapter;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v14=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-static {v13, v14}, Lcom/twocloo/com/cn/jpush/UpdateBookService;->access$3(Lcom/twocloo/com/cn/jpush/UpdateBookService;Lcom/twocloo/com/cn/db/DBAdapter;)V
a=0;// 
a=0;//     .line 109
a=0;//     :cond_0
a=0;//     #v14=(Conflicted);v15=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/jpush/UpdateBookService$2;->this$0:Lcom/twocloo/com/cn/jpush/UpdateBookService;
a=0;// 
a=0;//     invoke-static {v13}, Lcom/twocloo/com/cn/jpush/UpdateBookService;->access$0(Lcom/twocloo/com/cn/jpush/UpdateBookService;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Lcom/twocloo/com/cn/db/DBAdapter;->open()V
a=0;// 
a=0;//     .line 110
a=0;//     new-instance v10, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 111
a=0;//     .local v10, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;>;"
a=0;//     #v10=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/jpush/UpdateBookService$2;->this$0:Lcom/twocloo/com/cn/jpush/UpdateBookService;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/twocloo/com/cn/jpush/UpdateBookService$2;->this$0:Lcom/twocloo/com/cn/jpush/UpdateBookService;
a=0;// 
a=0;//     #v14=(Reference,Lcom/twocloo/com/cn/jpush/UpdateBookService;);
a=0;//     invoke-static {v14}, Lcom/twocloo/com/cn/jpush/UpdateBookService;->access$0(Lcom/twocloo/com/cn/jpush/UpdateBookService;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Lcom/twocloo/com/cn/db/DBAdapter;->queryBookToUp()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-static {v13, v14}, Lcom/twocloo/com/cn/jpush/UpdateBookService;->access$4(Lcom/twocloo/com/cn/jpush/UpdateBookService;Ljava/util/HashMap;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-static {v13}, Lcom/twocloo/com/cn/http/HttpImpl;->updateInfoService(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 113
a=0;//     .local v7, "json":Lorg/json/JSONObject;
a=0;//     #v7=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v7, :cond_2
a=0;// 
a=0;//     .line 147
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v16=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 116
a=0;//     :cond_2
a=0;//     :try_start_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);v9=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Reference,Ljava/lang/String;);v14=(Reference,Ljava/util/HashMap;);v16=(Uninit);
a=0;//     const-string v13, "root"
a=0;// 
a=0;//     invoke-virtual {v7, v13}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 117
a=0;//     .local v2, "data":Lorg/json/JSONArray;
a=0;//     #v2=(Reference,Lorg/json/JSONArray;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 120
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .local v5, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Integer);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Conflicted);v16=(Conflicted);
a=0;//     invoke-virtual {v2}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     if-lt v5, v13, :cond_3
a=0;// 
a=0;//     .line 139
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 140
a=0;//     .local v12, "msg":Landroid/os/Message;
a=0;//     #v12=(Reference,Landroid/os/Message;);
a=0;//     iput-object v10, v12, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 141
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/jpush/UpdateBookService$2;->this$0:Lcom/twocloo/com/cn/jpush/UpdateBookService;
a=0;// 
a=0;//     #v13=(Reference,Lcom/twocloo/com/cn/jpush/UpdateBookService;);
a=0;//     invoke-static {v13}, Lcom/twocloo/com/cn/jpush/UpdateBookService;->access$5(Lcom/twocloo/com/cn/jpush/UpdateBookService;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13, v12}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 143
a=0;//     .end local v2    # "data":Lorg/json/JSONArray;
a=0;//     .end local v5    # "i":I
a=0;//     .end local v12    # "msg":Landroid/os/Message;
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v5=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 145
a=0;//     .local v3, "e":Lorg/json/JSONException;
a=0;//     #v3=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v3}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 121
a=0;//     .end local v3    # "e":Lorg/json/JSONException;
a=0;//     .restart local v2    # "data":Lorg/json/JSONArray;
a=0;//     .restart local v5    # "i":I
a=0;//     :cond_3
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Lorg/json/JSONArray;);v3=(Uninit);v5=(Integer);v12=(Uninit);v13=(Integer);v14=(Reference,Ujava/lang/Object;);
a=0;//     new-instance v11, Ljava/util/HashMap;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v11}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 122
a=0;//     .local v11, "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     #v11=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v2, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 123
a=0;//     .local v4, "element":Lorg/json/JSONObject;
a=0;//     #v4=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v13, "lastupdate"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v13}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 124
a=0;//     .local v9, "lastupdate":Ljava/lang/String;
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v13, "lastupdate"
a=0;// 
a=0;//     invoke-virtual {v11, v13, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 125
a=0;//     const-string v13, "last_text_time"
a=0;// 
a=0;//     invoke-virtual {v4, v13}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 126
a=0;//     .local v8, "last_text_time":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v13, "last_text_time"
a=0;// 
a=0;//     invoke-virtual {v11, v13, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 127
a=0;//     const-string v13, "articleid"
a=0;// 
a=0;//     invoke-virtual {v4, v13}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 128
a=0;//     .local v6, "id":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v13, "0"
a=0;// 
a=0;//     invoke-static {v6, v13}, Lcom/twocloo/com/cn/http/HttpImpl;->ShubenxinxiyeService(Ljava/lang/String;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 129
a=0;//     .local v1, "bookDetail":Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/Shubenxinxiye;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 132
a=0;//     const-string v13, "title"
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v11, v13, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 133
a=0;//     const-string v13, "lastUpdateTime"
a=0;// 
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/twocloo/com/cn/jpush/UpdateBookService$2;->this$0:Lcom/twocloo/com/cn/jpush/UpdateBookService;
a=0;// 
a=0;//     #v15=(Reference,Lcom/twocloo/com/cn/jpush/UpdateBookService;);
a=0;//     invoke-static {v15}, Lcom/twocloo/com/cn/jpush/UpdateBookService;->access$0(Lcom/twocloo/com/cn/jpush/UpdateBookService;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v6}, Lcom/twocloo/com/cn/db/DBAdapter;->getupLasttime(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v15
a=0;// 
a=0;//     #v15=(LongLo);v16=(LongHi);
a=0;//     invoke-virtual/range {v14 .. v16}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v11, v13, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 134
a=0;//     const-string v13, "id"
a=0;// 
a=0;//     invoke-virtual {v11, v13, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 135
a=0;//     invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 137
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/jpush/UpdateBookService$2;->this$0:Lcom/twocloo/com/cn/jpush/UpdateBookService;
a=0;// 
a=0;//     invoke-static {v13}, Lcom/twocloo/com/cn/jpush/UpdateBookService;->access$0(Lcom/twocloo/com/cn/jpush/UpdateBookService;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;//     :try_end_1
a=0;//     .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 120
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
}}
