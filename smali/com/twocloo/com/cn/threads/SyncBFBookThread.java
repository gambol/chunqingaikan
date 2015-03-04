package com.twocloo.com.cn.threads; class SyncBFBookThread { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/threads/SyncBFBookThread;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "SyncBFBookThread.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public al:Ljava/util/Vector;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Vector",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BFBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;// .field private final fragmentActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private needUp:Z
a=0;// 
a=0;// .field private token:Ljava/lang/String;
a=0;// 
a=0;// .field private uid:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v4/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "fragmentActivity"    # Landroid/support/v4/app/FragmentActivity;
a=0;//     .param p2, "uid"    # Ljava/lang/String;
a=0;//     .param p3, "token"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 31
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/SyncBFBookThread;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->fragmentActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     .line 32
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 33
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->token:Ljava/lang/String;
a=0;// 
a=0;//     .line 34
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/support/v4/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Landroid/os/Handler;Z)V
a=0;//     .locals 0
a=0;//     .param p1, "fragmentActivity"    # Landroid/support/v4/app/FragmentActivity;
a=0;//     .param p2, "uid"    # Ljava/lang/String;
a=0;//     .param p3, "token"    # Ljava/lang/String;
a=0;//     .param p4, "handler"    # Landroid/os/Handler;
a=0;//     .param p5, "needUp"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 38
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/SyncBFBookThread;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->fragmentActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     .line 39
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 40
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->token:Ljava/lang/String;
a=0;// 
a=0;//     .line 41
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 42
a=0;//     iput-boolean p5, p0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->needUp:Z
a=0;// 
a=0;//     .line 43
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 17
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 48
a=0;//     .local v14, "netType":Lcom/twocloo/base/common/NetType;
a=0;//     #v14=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v2, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v2, v14}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 49
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/SyncBFBookThread;);
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v3, Lcom/twocloo/com/cn/threads/SyncBFBookThread$1;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/threads/SyncBFBookThread$1;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v3, v0}, Lcom/twocloo/com/cn/threads/SyncBFBookThread$1;-><init>(Lcom/twocloo/com/cn/threads/SyncBFBookThread;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/threads/SyncBFBookThread$1;);
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 163
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 59
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v15=(Uninit);v16=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/SyncBFBookThread;);
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 60
a=0;//     new-instance v2, Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     sget-object v3, Lcom/twocloo/com/cn/common/CloseActivity;->curActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Activity;);
a=0;//     invoke-direct {v2, v3}, Lcom/twocloo/com/cn/db/DBAdapter;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v2, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     .line 62
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v2, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->needUp:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 63
a=0;//     new-instance v12, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;
a=0;// 
a=0;//     #v12=(UninitRef,Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->fragmentActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-direct {v12, v2, v3}, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;-><init>(Lcom/twocloo/com/cn/db/DBAdapter;Landroid/content/Context;)V
a=0;// 
a=0;//     .line 64
a=0;//     .local v12, "ck":Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;
a=0;//     #v12=(Reference,Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;);
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->run()V
a=0;// 
a=0;//     .line 67
a=0;//     .end local v12    # "ck":Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);v12=(Conflicted);
a=0;//     new-instance v15, Ljava/util/HashSet;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v15}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     .line 70
a=0;//     .local v15, "set1":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
a=0;//     #v15=(Reference,Ljava/util/HashSet;);
a=0;//     sget-object v2, Lcom/twocloo/com/cn/common/CloseActivity;->curActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->token:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3, v4}, Lcom/twocloo/com/cn/http/HttpImpl;->syncBFBook(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v2, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->al:Ljava/util/Vector;
a=0;// 
a=0;//     .line 71
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->al:Ljava/util/Vector;
a=0;// 
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->al:Ljava/util/Vector;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_6
a=0;// 
a=0;//     .line 74
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/db/DBAdapter;->open()V
a=0;// 
a=0;//     .line 75
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/db/DBAdapter;->queryGxBook(Ljava/lang/String;)Ljava/util/HashSet;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 77
a=0;//     .local v10, "bookset":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
a=0;//     #v10=(Reference,Ljava/util/HashSet;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->al:Ljava/util/Vector;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v5=(Conflicted);v7=(Conflicted);v9=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_c
a=0;// 
a=0;//     .line 98
a=0;//     if-eqz v10, :cond_5
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/util/HashSet;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_5
a=0;// 
a=0;//     .line 100
a=0;//     invoke-virtual {v10}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v8=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_11
a=0;// 
a=0;//     .line 104
a=0;//     :cond_5
a=0;//     #v2=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/db/DBAdapter;->updateUid(Ljava/lang/String;)Ljava/util/HashSet;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 105
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "al \u957f\u5ea6\uff1a"
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v15}, Ljava/util/HashSet;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 107
a=0;//     .end local v10    # "bookset":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
a=0;//     :cond_6
a=0;//     #v2=(Conflicted);v3=(Conflicted);v10=(Conflicted);
a=0;//     new-instance v16, Ljava/util/HashSet;
a=0;// 
a=0;//     #v16=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct/range {v16 .. v16}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     .line 110
a=0;//     .local v16, "set2":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
a=0;//     #v16=(Reference,Ljava/util/HashSet;);
a=0;//     sget-object v2, Lcom/twocloo/com/cn/common/CloseActivity;->curActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->token:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v2, v3, v4}, Lcom/twocloo/com/cn/http/HttpImpl;->syncVipBF(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v2, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->al:Ljava/util/Vector;
a=0;// 
a=0;//     .line 111
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->al:Ljava/util/Vector;
a=0;// 
a=0;//     if-eqz v2, :cond_8
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->al:Ljava/util/Vector;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_8
a=0;// 
a=0;//     .line 112
a=0;//     new-instance v11, Lcom/twocloo/com/cn/db/UserBookTable;
a=0;// 
a=0;//     #v11=(UninitRef,Lcom/twocloo/com/cn/db/UserBookTable;);
a=0;//     sget-object v2, Lcom/twocloo/com/cn/common/CloseActivity;->curActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/db/DBAdapter;->getDB()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v11, v2, v3}, Lcom/twocloo/com/cn/db/UserBookTable;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V
a=0;// 
a=0;//     .line 114
a=0;//     .local v11, "bt":Lcom/twocloo/com/cn/db/UserBookTable;
a=0;//     #v11=(Reference,Lcom/twocloo/com/cn/db/UserBookTable;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->al:Ljava/util/Vector;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_7
a=0;//     :goto_3
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_12
a=0;// 
a=0;//     .line 138
a=0;//     .end local v11    # "bt":Lcom/twocloo/com/cn/db/UserBookTable;
a=0;//     :cond_8
a=0;//     #v2=(Conflicted);v3=(Conflicted);v11=(Conflicted);
a=0;//     invoke-virtual/range {v16 .. v16}, Ljava/util/HashSet;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gtz v2, :cond_9
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/util/HashSet;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-lez v2, :cond_a
a=0;// 
a=0;//     .line 139
a=0;//     :cond_9
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 141
a=0;//     new-instance v1, Lcom/twocloo/com/cn/threads/SynUpBook;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/threads/SynUpBook;);
a=0;//     sget-object v2, Lcom/twocloo/com/cn/common/CloseActivity;->curActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->token:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v15}, Lcom/twocloo/com/cn/common/Util;->setToString(Ljava/util/Set;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, ""
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v1 .. v6}, Lcom/twocloo/com/cn/threads/SynUpBook;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 142
a=0;//     .local v1, "s":Lcom/twocloo/com/cn/threads/SynUpBook;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/threads/SynUpBook;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/threads/SynUpBook;->start()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 147
a=0;//     .end local v1    # "s":Lcom/twocloo/com/cn/threads/SynUpBook;
a=0;//     :cond_a
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     if-eqz v2, :cond_b
a=0;// 
a=0;//     .line 148
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     .line 150
a=0;//     :cond_b
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 159
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 77
a=0;//     .end local v16    # "set2":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
a=0;//     .restart local v10    # "bookset":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
a=0;//     :cond_c
a=0;//     :try_start_1
a=0;//     #v1=(Uninit);v3=(Boolean);v4=(Reference,Ljava/lang/String;);v6=(Uninit);v8=(Uninit);v10=(Reference,Ljava/util/HashSet;);v11=(Uninit);v16=(Uninit);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v9, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     .line 78
a=0;//     .local v9, "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     invoke-virtual {v9}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 80
a=0;//     .local v7, "aid":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_e
a=0;// 
a=0;//     .line 84
a=0;//     invoke-virtual {v10, v7}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 144
a=0;//     .end local v7    # "aid":Ljava/lang/String;
a=0;//     .end local v9    # "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     .end local v10    # "bookset":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
a=0;//     .end local v15    # "set1":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     move-exception v13
a=0;// 
a=0;//     .line 145
a=0;//     .local v13, "e":Ljava/lang/Throwable;
a=0;//     :try_start_2
a=0;//     #v13=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v13}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v13}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 147
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     if-eqz v2, :cond_d
a=0;// 
a=0;//     .line 148
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     .line 150
a=0;//     :cond_d
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 159
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 88
a=0;//     .end local v13    # "e":Ljava/lang/Throwable;
a=0;//     .restart local v7    # "aid":Ljava/lang/String;
a=0;//     .restart local v9    # "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     .restart local v10    # "bookset":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
a=0;//     .restart local v15    # "set1":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
a=0;//     :cond_e
a=0;//     :try_start_3
a=0;//     #v1=(Uninit);v3=(Boolean);v4=(Reference,Ljava/lang/String;);v6=(Uninit);v7=(Reference,Ljava/lang/String;);v8=(Uninit);v9=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);v10=(Reference,Ljava/util/HashSet;);v11=(Uninit);v13=(Uninit);v15=(Reference,Ljava/util/HashSet;);v16=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-virtual {v3, v7}, Lcom/twocloo/com/cn/db/DBAdapter;->exitBookBF1(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     .line 89
a=0;//     sget-object v3, Lcom/twocloo/com/cn/common/CloseActivity;->curActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v9}, Lcom/twocloo/com/cn/beans/BFBook;->getImagefname()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/com/cn/common/Util;->saveImgFile(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v9, v3}, Lcom/twocloo/com/cn/beans/BFBook;->setImgFile(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 90
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v9, v3}, Lcom/twocloo/com/cn/beans/BFBook;->setUid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 92
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     invoke-virtual {v3, v9}, Lcom/twocloo/com/cn/db/DBAdapter;->insertBook(Lcom/twocloo/com/cn/beans/BFBook;)Ljava/lang/String;
a=0;// 
a=0;//     .line 94
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v3, v7, v4, v5}, Lcom/twocloo/com/cn/db/DBAdapter;->insertGx(Ljava/lang/String;Ljava/lang/String;I)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 146
a=0;//     .end local v7    # "aid":Ljava/lang/String;
a=0;//     .end local v9    # "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     .end local v10    # "bookset":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
a=0;//     .end local v15    # "set1":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v13=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 147
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     if-eqz v3, :cond_f
a=0;// 
a=0;//     .line 148
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     .line 150
a=0;//     :cond_f
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     if-eqz v3, :cond_10
a=0;// 
a=0;//     .line 159
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v3, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 161
a=0;//     :cond_10
a=0;//     #v4=(Conflicted);
a=0;//     throw v2
a=0;// 
a=0;//     .line 100
a=0;//     .restart local v10    # "bookset":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
a=0;//     .restart local v15    # "set1":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
a=0;//     :cond_11
a=0;//     :try_start_4
a=0;//     #v1=(Uninit);v3=(Boolean);v4=(Reference,Ljava/lang/String;);v6=(Uninit);v10=(Reference,Ljava/util/HashSet;);v11=(Uninit);v13=(Uninit);v15=(Reference,Ljava/util/HashSet;);v16=(Uninit);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v8, Ljava/lang/String;
a=0;// 
a=0;//     .line 101
a=0;//     .local v8, "aid1":Ljava/lang/String;
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v3, v8, v4, v5}, Lcom/twocloo/com/cn/db/DBAdapter;->deleteGxOne1(Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 114
a=0;//     .end local v8    # "aid1":Ljava/lang/String;
a=0;//     .end local v10    # "bookset":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
a=0;//     .restart local v11    # "bt":Lcom/twocloo/com/cn/db/UserBookTable;
a=0;//     .restart local v16    # "set2":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
a=0;//     :cond_12
a=0;//     #v3=(Boolean);v4=(Conflicted);v5=(Conflicted);v8=(Conflicted);v10=(Conflicted);v11=(Reference,Lcom/twocloo/com/cn/db/UserBookTable;);v16=(Reference,Ljava/util/HashSet;);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v9, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     .line 115
a=0;//     .restart local v9    # "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     invoke-virtual {v9}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 117
a=0;//     .restart local v7    # "aid":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v11, v7, v3, v4}, Lcom/twocloo/com/cn/db/UserBookTable;->exitBook(Ljava/lang/String;Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_7
a=0;// 
a=0;//     .line 119
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     invoke-virtual {v11, v7, v3, v4}, Lcom/twocloo/com/cn/db/UserBookTable;->insert(Ljava/lang/String;Ljava/lang/String;I)J
a=0;// 
a=0;//     .line 121
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     invoke-virtual {v3, v7}, Lcom/twocloo/com/cn/db/DBAdapter;->exitBookBF1(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_13
a=0;// 
a=0;//     .line 122
a=0;//     sget-object v3, Lcom/twocloo/com/cn/common/CloseActivity;->curActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v9}, Lcom/twocloo/com/cn/beans/BFBook;->getImagefname()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/com/cn/common/Util;->saveImgFile(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v9, v3}, Lcom/twocloo/com/cn/beans/BFBook;->setImgFile(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 123
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v9, v3}, Lcom/twocloo/com/cn/beans/BFBook;->setUid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 125
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     invoke-virtual {v3, v9}, Lcom/twocloo/com/cn/db/DBAdapter;->insertBook(Lcom/twocloo/com/cn/beans/BFBook;)Ljava/lang/String;
a=0;// 
a=0;//     .line 128
a=0;//     :cond_13
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7, v4}, Lcom/twocloo/com/cn/db/DBAdapter;->exitBookGxVip(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_14
a=0;// 
a=0;//     .line 129
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {v3, v7, v4, v5}, Lcom/twocloo/com/cn/db/DBAdapter;->insertGx(Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 131
a=0;//     :cond_14
a=0;//     #v3=(Conflicted);v5=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v7, v4}, Lcom/twocloo/com/cn/db/DBAdapter;->exitBookGx(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_7
a=0;// 
a=0;//     .line 132
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v3, v7, v4, v5}, Lcom/twocloo/com/cn/db/DBAdapter;->insertGx(Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 133
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// .end method
}}
