package com.twocloo.com.cn.threads; class CheckUpdateBookThread { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "CheckUpdateBookThread.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private context:Landroid/content/Context;
a=0;// 
a=0;// .field public count:I
a=0;// 
a=0;// .field private db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;// .field public hasup:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 27
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->count:I
a=0;// 
a=0;//     .line 31
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 32
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/twocloo/com/cn/db/DBAdapter;Landroid/content/Context;)V
a=0;//     .locals 0
a=0;//     .param p1, "db"    # Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .param p2, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-direct {p0, p2}, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private cg(Ljava/util/HashMap;)Ljava/lang/String;
a=0;//     .locals 7
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Long;",
a=0;//             ">;)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     .local p1, "mp":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Long;>;"
a=0;//     invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 102
a=0;//     .local v1, "set":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
a=0;//     #v1=(Reference,Ljava/util/Set;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     .line 103
a=0;//     .local v2, "st":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 104
a=0;//     .local v0, "buff":Ljava/lang/StringBuffer;
a=0;//     #v0=(Reference,Ljava/lang/StringBuffer;);
a=0;//     invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Reference,Ljava/util/Iterator;);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 110
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     return-object v4
a=0;// 
a=0;//     .line 104
a=0;//     :cond_1
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/lang/String;
a=0;// 
a=0;//     .line 105
a=0;//     .local v3, "string":Ljava/lang/String;
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 106
a=0;//     const-string v5, ""
a=0;// 
a=0;//     invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 107
a=0;//     const-string v2, ","
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 22
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     const-string v19, "\u6b63\u5728\u540c\u6b65\u6570\u636e"
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v19 .. v19}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 42
a=0;//     :try_start_0
a=0;//     sget-boolean v19, Lcom/twocloo/com/cn/common/Constants;->isCheckUpInfo:Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v19=(Boolean);
a=0;//     if-eqz v19, :cond_1
a=0;// 
a=0;//     .line 93
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     if-eqz v19, :cond_0
a=0;// 
a=0;//     .line 94
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     invoke-virtual/range {v19 .. v19}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     .line 98
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v20=(Conflicted);v21=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 45
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Boolean);v20=(Uninit);v21=(Uninit);
a=0;//     const/16 v19, 0x1
a=0;// 
a=0;//     :try_start_1
a=0;//     #v19=(One);
a=0;//     sput-boolean v19, Lcom/twocloo/com/cn/common/Constants;->isCheckUpInfo:Z
a=0;// 
a=0;//     .line 46
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     #v19=(Reference,Landroid/app/Application;);
a=0;//     const-string v20, "config"
a=0;// 
a=0;//     #v20=(Reference,Ljava/lang/String;);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     invoke-virtual/range {v19 .. v21}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     .line 47
a=0;//     .local v18, "sp":Landroid/content/SharedPreferences;
a=0;//     #v18=(Reference,Landroid/content/SharedPreferences;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     if-nez v19, :cond_2
a=0;// 
a=0;//     .line 48
a=0;//     new-instance v19, Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v19=(UninitRef,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     invoke-direct/range {v19 .. v20}, Lcom/twocloo/com/cn/db/DBAdapter;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v19=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;);
a=0;//     iput-object v0, v1, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     .line 50
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     invoke-virtual/range {v19 .. v19}, Lcom/twocloo/com/cn/db/DBAdapter;->open()V
a=0;// 
a=0;//     .line 51
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->context:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     check-cast v19, Landroid/app/Activity;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     invoke-virtual/range {v20 .. v20}, Lcom/twocloo/com/cn/db/DBAdapter;->queryBookToUp()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v20
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0, v1}, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->cg(Ljava/util/HashMap;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     invoke-static/range {v19 .. v20}, Lcom/twocloo/com/cn/http/HttpImpl;->updateInfo(Landroid/app/Activity;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 52
a=0;//     .local v9, "json":Lorg/json/JSONObject;
a=0;//     #v9=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v9, :cond_3
a=0;// 
a=0;//     .line 93
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     if-eqz v19, :cond_0
a=0;// 
a=0;//     .line 94
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     invoke-virtual/range {v19 .. v19}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 55
a=0;//     :cond_3
a=0;//     :try_start_2
a=0;//     const-string v19, "root"
a=0;// 
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Boolean);
a=0;//     if-nez v19, :cond_6
a=0;// 
a=0;//     .line 56
a=0;//     const-string v19, "root"
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     if-nez v19, :cond_4
a=0;// 
a=0;//     .line 93
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     if-eqz v19, :cond_0
a=0;// 
a=0;//     .line 94
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     invoke-virtual/range {v19 .. v19}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 59
a=0;//     :cond_4
a=0;//     :try_start_3
a=0;//     const-string v19, "root"
a=0;// 
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     if-nez v19, :cond_5
a=0;// 
a=0;//     .line 93
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     if-eqz v19, :cond_0
a=0;// 
a=0;//     .line 94
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     invoke-virtual/range {v19 .. v19}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 62
a=0;//     :cond_5
a=0;//     :try_start_4
a=0;//     const-string v19, "root"
a=0;// 
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 63
a=0;//     .local v3, "arr":Lorg/json/JSONArray;
a=0;//     #v3=(Reference,Lorg/json/JSONArray;);
a=0;//     new-instance v12, Ljava/util/HashMap;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v12}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 66
a=0;//     .local v12, "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Long;>;"
a=0;//     #v12=(Reference,Ljava/util/HashMap;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .local v7, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Integer);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v19=(Conflicted);v20=(Conflicted);
a=0;//     invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v7, v0, :cond_8
a=0;// 
a=0;//     .line 93
a=0;//     .end local v3    # "arr":Lorg/json/JSONArray;
a=0;//     .end local v7    # "i":I
a=0;//     .end local v12    # "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Long;>;"
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v3=(Conflicted);v7=(Conflicted);v12=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     if-eqz v19, :cond_7
a=0;// 
a=0;//     .line 94
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     invoke-virtual/range {v19 .. v19}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     .line 96
a=0;//     .end local v9    # "json":Lorg/json/JSONObject;
a=0;//     .end local v18    # "sp":Landroid/content/SharedPreferences;
a=0;//     :cond_7
a=0;//     :goto_2
a=0;//     #v6=(Conflicted);v9=(Conflicted);v18=(Conflicted);v21=(Conflicted);
a=0;//     const-string v19, "\u540c\u6b65\u5b8c\u6570\u636e"
a=0;// 
a=0;//     invoke-static/range {v19 .. v19}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 67
a=0;//     .restart local v3    # "arr":Lorg/json/JSONArray;
a=0;//     .restart local v7    # "i":I
a=0;//     .restart local v9    # "json":Lorg/json/JSONObject;
a=0;//     .restart local v12    # "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Long;>;"
a=0;//     .restart local v18    # "sp":Landroid/content/SharedPreferences;
a=0;//     :cond_8
a=0;//     :try_start_5
a=0;//     #v0=(Integer);v3=(Reference,Lorg/json/JSONArray;);v6=(Uninit);v7=(Integer);v9=(Reference,Lorg/json/JSONObject;);v12=(Reference,Ljava/util/HashMap;);v18=(Reference,Landroid/content/SharedPreferences;);v19=(Integer);v21=(Null);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 68
a=0;//     .local v15, "obj":Lorg/json/JSONObject;
a=0;//     #v15=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v19, "articleid"
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v15, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Boolean);
a=0;//     if-nez v19, :cond_b
a=0;// 
a=0;//     const-string v19, "lastupdate"
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v15, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Boolean);
a=0;//     if-nez v19, :cond_b
a=0;// 
a=0;//     .line 71
a=0;//     const-string v19, "articleid"
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v15, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 72
a=0;//     .local v4, "articid":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v19, 0x0
a=0;// 
a=0;//     #v19=(LongLo);v20=(LongHi);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     move-wide/from16 v1, v19
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-interface {v0, v4, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v10
a=0;// 
a=0;//     .line 73
a=0;//     .local v10, "localeTime":J
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     const-string v19, "lastupdate"
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v15, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v16
a=0;// 
a=0;//     .line 74
a=0;//     .local v16, "serverTime":J
a=0;//     #v16=(LongLo);v17=(LongHi);
a=0;//     const-string v19, "textcount"
a=0;// 
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v15, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 75
a=0;//     .local v5, "chapternumber":I
a=0;//     #v5=(Integer);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     .line 76
a=0;//     .local v14, "num":I
a=0;//     #v14=(Null);
a=0;//     const-wide/16 v19, 0x0
a=0;// 
a=0;//     #v19=(LongLo);
a=0;//     cmp-long v19, v10, v19
a=0;// 
a=0;//     #v19=(Byte);
a=0;//     if-eqz v19, :cond_a
a=0;// 
a=0;//     cmp-long v19, v10, v16
a=0;// 
a=0;//     if-gez v19, :cond_a
a=0;// 
a=0;//     .line 77
a=0;//     const/16 v19, 0x1
a=0;// 
a=0;//     #v19=(One);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(One);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;);
a=0;//     iput-boolean v0, v1, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->hasup:Z
a=0;// 
a=0;//     .line 78
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;);
a=0;//     iget v0, v0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->count:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     add-int/lit8 v19, v19, 0x1
a=0;// 
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput v0, v1, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->count:I
a=0;// 
a=0;//     .line 79
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/common/Util;->read(Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 80
a=0;//     .local v13, "mulu":Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;//     #v13=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     if-eqz v13, :cond_9
a=0;// 
a=0;//     .line 81
a=0;//     invoke-virtual {v13}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getMulist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 82
a=0;//     .local v8, "infos":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/Chapterinfo;>;"
a=0;//     #v8=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v8}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     sub-int v19, v5, v19
a=0;// 
a=0;//     invoke-static/range {v19 .. v19}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 84
a=0;//     .end local v8    # "infos":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/Chapterinfo;>;"
a=0;//     :cond_9
a=0;//     #v8=(Conflicted);v14=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     const/16 v20, 0x1
a=0;// 
a=0;//     #v20=(One);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v4, v1, v14}, Lcom/twocloo/com/cn/db/DBAdapter;->isNeedUp(Ljava/lang/String;II)J
a=0;// 
a=0;//     .line 86
a=0;//     .end local v13    # "mulu":Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;//     :cond_a
a=0;//     #v1=(Conflicted);v13=(Conflicted);v19=(Conflicted);v20=(Conflicted);
a=0;//     invoke-interface/range {v18 .. v18}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     #v19=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     move-wide/from16 v1, v16
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     invoke-interface {v0, v4, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     invoke-interface/range {v19 .. v19}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_0
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     .line 66
a=0;//     .end local v4    # "articid":Ljava/lang/String;
a=0;//     .end local v5    # "chapternumber":I
a=0;//     .end local v10    # "localeTime":J
a=0;//     .end local v14    # "num":I
a=0;//     .end local v16    # "serverTime":J
a=0;//     :cond_b
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v10=(Conflicted);v11=(Conflicted);v14=(Conflicted);v16=(Conflicted);v17=(Conflicted);v19=(Conflicted);
a=0;//     add-int/lit8 v7, v7, 0x1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 90
a=0;//     .end local v3    # "arr":Lorg/json/JSONArray;
a=0;//     .end local v7    # "i":I
a=0;//     .end local v9    # "json":Lorg/json/JSONObject;
a=0;//     .end local v12    # "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Long;>;"
a=0;//     .end local v15    # "obj":Lorg/json/JSONObject;
a=0;//     .end local v18    # "sp":Landroid/content/SharedPreferences;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v7=(Conflicted);v9=(Conflicted);v12=(Conflicted);v15=(Conflicted);v18=(Conflicted);v21=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     .line 91
a=0;//     .local v6, "e":Ljava/lang/Throwable;
a=0;//     :try_start_6
a=0;//     #v6=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v6}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     .line 93
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     if-eqz v19, :cond_7
a=0;// 
a=0;//     .line 94
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     invoke-virtual/range {v19 .. v19}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 92
a=0;//     .end local v6    # "e":Ljava/lang/Throwable;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v6=(Conflicted);v19=(Conflicted);
a=0;//     move-exception v19
a=0;// 
a=0;//     .line 93
a=0;//     #v19=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     #v20=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     if-eqz v20, :cond_c
a=0;// 
a=0;//     .line 94
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     invoke-virtual/range {v20 .. v20}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     .line 95
a=0;//     :cond_c
a=0;//     throw v19
a=0;// .end method
}}
