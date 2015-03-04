package com.twocloo.com.cn.task; class BookShelfInitTask { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/task/BookShelfInitTask;
a=0;// .super Lcom/twocloo/base/sync/EasyTask;
a=0;// .source "BookShelfInitTask.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/twocloo/base/sync/EasyTask",
a=0;//         "<",
a=0;//         "Lcom/twocloo/com/cn/fragment/BookShelfFragment;",
a=0;//         "Ljava/lang/Void;",
a=0;//         "Ljava/lang/Void;",
a=0;//         "Ljava/lang/Void;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)V
a=0;//     .locals 0
a=0;//     .param p1, "caller"    # Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/base/sync/EasyTask;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 34
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/task/BookShelfInitTask;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/task/BookShelfInitTask;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
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
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/BookShelfInitTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Void;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
a=0;//     .locals 10
a=0;//     .param p1, "params"    # [Ljava/lang/Void;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 52
a=0;//     #v5=(One);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 54
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     new-instance v3, Lcom/twocloo/com/cn/db/LastReadTable;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/db/LastReadTable;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v3, v2}, Lcom/twocloo/com/cn/db/LastReadTable;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/db/LastReadTable;);
a=0;//     invoke-virtual {v1, v3}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->setTb(Lcom/twocloo/com/cn/db/LastReadTable;)V
a=0;// 
a=0;//     .line 56
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getTb()Lcom/twocloo/com/cn/db/LastReadTable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/LastReadTable;->open()V
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getTb()Lcom/twocloo/com/cn/db/LastReadTable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/LastReadTable;->queryLastBook()Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 76
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     new-instance v3, Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v3, v2}, Lcom/twocloo/com/cn/db/DBAdapter;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-virtual {v1, v3}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->setDbAdapter(Lcom/twocloo/com/cn/db/DBAdapter;)V
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getDbAdapter()Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/DBAdapter;->open()V
a=0;// 
a=0;//     .line 80
a=0;//     new-instance v6, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v6, v1}, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 81
a=0;//     .local v6, "ck":Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;);
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;->start()V
a=0;// 
a=0;//     .line 88
a=0;//     :try_start_1
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/LocalStore;->getUpdate(Landroid/content/Context;)I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 115
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->setFinish(Z)V
a=0;// 
a=0;//     .line 117
a=0;//     sget-boolean v1, Lcom/twocloo/com/cn/activitys/BookApp;->isInit:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 119
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 120
a=0;//     .local v9, "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v9, :cond_1
a=0;// 
a=0;//     .line 121
a=0;//     new-instance v0, Lcom/twocloo/com/cn/threads/SyncBFBookThread;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/threads/SyncBFBookThread;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v9}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getHandler()Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/twocloo/com/cn/threads/SyncBFBookThread;-><init>(Landroid/support/v4/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Landroid/os/Handler;Z)V
a=0;// 
a=0;//     .line 122
a=0;//     .local v0, "syncT":Lcom/twocloo/com/cn/threads/SyncBFBookThread;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/SyncBFBookThread;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/threads/SyncBFBookThread;->start()V
a=0;// 
a=0;//     .line 123
a=0;//     sput-boolean v5, Lcom/twocloo/com/cn/activitys/BookApp;->isInit:Z
a=0;// 
a=0;//     .line 128
a=0;//     .end local v0    # "syncT":Lcom/twocloo/com/cn/threads/SyncBFBookThread;
a=0;//     .end local v9    # "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v9=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getDbAdapter()Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/DBAdapter;->open()V
a=0;// 
a=0;//     .line 129
a=0;//     const-string v8, "0"
a=0;// 
a=0;//     .line 131
a=0;//     .local v8, "lastUid":Ljava/lang/String;
a=0;//     :try_start_2
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/LocalStore;->getLastUid(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 133
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getList()Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/Vector;->clear()V
a=0;// 
a=0;//     .line 135
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getDbAdapter()Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v2, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getList()Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v2, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getStart()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v2, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getMaxCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v3, v4, v8, v5, v2}, Lcom/twocloo/com/cn/db/DBAdapter;->queryMyBFData(Ljava/util/Vector;Ljava/lang/String;II)Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->setList(Ljava/util/Vector;)V
a=0;// 
a=0;//     .line 136
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v2, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getDbAdapter()Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v2, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/common/LocalStore;->getLastUid(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Lcom/twocloo/com/cn/db/DBAdapter;->queryMyBFCount(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     long-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->setTotalCount(I)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     .line 141
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     sget-object v1, Lcom/twocloo/com/cn/task/BookShelfInitTask;->HANDLER:Landroid/os/Handler;
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/com/cn/task/BookShelfInitTask$1;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/task/BookShelfInitTask$1;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/task/BookShelfInitTask$1;-><init>(Lcom/twocloo/com/cn/task/BookShelfInitTask;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/task/BookShelfInitTask$1;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 152
a=0;//     new-instance v1, Lcom/twocloo/com/cn/task/BookShelfInitTask$2;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/task/BookShelfInitTask$2;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/task/BookShelfInitTask$2;-><init>(Lcom/twocloo/com/cn/task/BookShelfInitTask;)V
a=0;// 
a=0;//     .line 182
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/task/BookShelfInitTask$2;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/task/BookShelfInitTask$2;->start()V
a=0;// 
a=0;//     .line 184
a=0;//     .end local v6    # "ck":Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;
a=0;//     .end local v8    # "lastUid":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 72
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Reference,Ljava/lang/Object;);v4=(Null);v5=(One);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 73
a=0;//     .local v7, "e":Ljava/lang/Exception;
a=0;//     #v7=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v7}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 91
a=0;//     .end local v7    # "e":Ljava/lang/Exception;
a=0;//     .restart local v6    # "ck":Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;
a=0;//     :pswitch_0
a=0;//     :try_start_3
a=0;//     #v1=(Integer);v2=(Reference,Landroid/support/v4/app/FragmentActivity;);v3=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);v6=(Reference,Lcom/twocloo/com/cn/threads/CheckUpdateBookThread;);v7=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/LocalStore;->getIsFullStart(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 92
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/LocalStore;->getisversionUpdate(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->doUpdata()V
a=0;// 
a=0;//     .line 95
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v1, v2}, Lcom/twocloo/com/cn/common/LocalStore;->setIsFullStart(Landroid/content/Context;Z)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 111
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 112
a=0;//     .restart local v7    # "e":Ljava/lang/Exception;
a=0;//     #v7=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v7}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 99
a=0;//     .end local v7    # "e":Ljava/lang/Exception;
a=0;//     :pswitch_1
a=0;//     :try_start_4
a=0;//     #v1=(Integer);v2=(Reference,Landroid/support/v4/app/FragmentActivity;);v7=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getNowTime(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/LocalStore;->getUptime(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v2, v1, :cond_0
a=0;// 
a=0;//     .line 100
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/LocalStore;->getisversionUpdate(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->doUpdata()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 106
a=0;//     :pswitch_2
a=0;//     #v1=(Integer);v2=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     const/4 v2, 0x7
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getNowTime(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/LocalStore;->getUptime(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v2, v1, :cond_0
a=0;// 
a=0;//     .line 107
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->doUpdata()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 137
a=0;//     .restart local v8    # "lastUid":Ljava/lang/String;
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference,Ujava/lang/Object;);v5=(Integer);v8=(Reference,Ljava/lang/String;);v9=(Conflicted);
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 138
a=0;//     .restart local v7    # "e":Ljava/lang/Exception;
a=0;//     #v7=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v8, "0"
a=0;// 
a=0;//     .line 139
a=0;//     invoke-virtual {v7}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 88
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/BookShelfInitTask;->onPostExecute(Ljava/lang/Void;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPostExecute(Ljava/lang/Void;)V
a=0;//     .locals 1
a=0;//     .param p1, "result"    # Ljava/lang/Void;
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 47
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->cancel()V
a=0;// 
a=0;//     .line 48
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPreExecute()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 40
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 41
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
